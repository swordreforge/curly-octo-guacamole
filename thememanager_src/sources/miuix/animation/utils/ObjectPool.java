package miuix.animation.utils;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import miuix.animation.Folme;

/* JADX INFO: loaded from: classes3.dex */
public class ObjectPool {
    private static final long DELAY = 5000;
    private static final int MAX_POOL_SIZE = 10;
    private static final ConcurrentHashMap<Class<?>, Cache> sCacheMap;
    private static volatile Handler sMainHandler;

    private static class Cache {
        final ConcurrentHashMap<Object, Boolean> mCacheRecord;
        final ConcurrentLinkedQueue<Object> pool;
        final Runnable shrinkTask;

        private Cache() {
            this.pool = new ConcurrentLinkedQueue<>();
            this.mCacheRecord = new ConcurrentHashMap<>();
            this.shrinkTask = new Runnable() { // from class: miuix.animation.utils.ObjectPool.Cache.1
                @Override // java.lang.Runnable
                public void run() {
                    Cache.this.shrink();
                }
            };
        }

        <T> T acquireObject(Class<T> cls, Object... objArr) {
            T t2 = (T) this.pool.poll();
            if (t2 == null) {
                return cls != null ? (T) ObjectPool.createObject(cls, objArr) : t2;
            }
            this.mCacheRecord.remove(Integer.valueOf(System.identityHashCode(t2)));
            return t2;
        }

        void releaseObject(Object obj) {
            if (this.mCacheRecord.putIfAbsent(Integer.valueOf(System.identityHashCode(obj)), Boolean.TRUE) != null) {
                return;
            }
            this.pool.add(obj);
            Handler mainHandler = ObjectPool.getMainHandler();
            if (mainHandler != null) {
                mainHandler.removeCallbacks(this.shrinkTask);
                if (this.pool.size() > 10) {
                    mainHandler.postDelayed(this.shrinkTask, 5000L);
                    return;
                }
                return;
            }
            Log.w(CommonUtils.TAG, "ObjectPool.releaseObject handler is null! looper: " + Looper.myLooper());
            this.shrinkTask.run();
        }

        void shrink() {
            Object objPoll;
            while (this.pool.size() > 10 && (objPoll = this.pool.poll()) != null) {
                this.mCacheRecord.remove(Integer.valueOf(System.identityHashCode(objPoll)));
            }
        }
    }

    public interface IPoolObject {
        void clear();
    }

    static {
        createMainHandler(Folme.getLooper());
        sCacheMap = new ConcurrentHashMap<>();
    }

    private ObjectPool() {
    }

    public static <T> T acquire(Class<T> cls, Object... objArr) {
        return (T) getObjectCache(cls, true).acquireObject(cls, objArr);
    }

    public static void createMainHandler(Looper looper) {
        if (looper == null) {
            return;
        }
        sMainHandler = new Handler(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object createObject(Class<?> cls, Object... objArr) {
        try {
            for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                if (constructor.getParameterTypes().length == objArr.length) {
                    constructor.setAccessible(true);
                    return constructor.newInstance(objArr);
                }
            }
            return null;
        } catch (Exception e2) {
            Log.w(CommonUtils.TAG, "ObjectPool.createObject failed, clz = " + cls, e2);
            return null;
        }
    }

    public static Handler getMainHandler() {
        return sMainHandler;
    }

    private static Cache getObjectCache(Class<?> cls, boolean z2) {
        ConcurrentHashMap<Class<?>, Cache> concurrentHashMap = sCacheMap;
        Cache cache = concurrentHashMap.get(cls);
        if (cache != null || !z2) {
            return cache;
        }
        Cache cache2 = new Cache();
        Cache cachePutIfAbsent = concurrentHashMap.putIfAbsent(cls, cache2);
        return cachePutIfAbsent != null ? cachePutIfAbsent : cache2;
    }

    public static void release(Object obj) {
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        if (obj instanceof IPoolObject) {
            ((IPoolObject) obj).clear();
        } else if (obj instanceof Collection) {
            ((Collection) obj).clear();
        } else if (obj instanceof Map) {
            ((Map) obj).clear();
        }
        Cache objectCache = getObjectCache(cls, false);
        if (objectCache != null) {
            objectCache.releaseObject(obj);
        }
    }
}
