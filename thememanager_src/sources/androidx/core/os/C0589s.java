package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.os.s */
/* JADX INFO: compiled from: HandlerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0589s {

    /* JADX INFO: renamed from: k */
    private static final String f3713k = "HandlerCompat";

    /* JADX INFO: renamed from: androidx.core.os.s$k */
    /* JADX INFO: compiled from: HandlerCompat.java */
    @hyr(28)
    private static class k {
        private k() {
        }

        /* JADX INFO: renamed from: k */
        public static Handler m2755k(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static Handler toq(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }

        public static boolean zy(Handler handler, Runnable runnable, Object obj, long j2) {
            return handler.postDelayed(runnable, obj, j2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.os.s$toq */
    /* JADX INFO: compiled from: HandlerCompat.java */
    @hyr(29)
    private static class toq {
        private toq() {
        }

        /* JADX INFO: renamed from: k */
        public static boolean m2756k(Handler handler, Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }

    private C0589s() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static Handler m2753k(@lvui Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.m2755k(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w(f3713k, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w(f3713k, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w(f3713k, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m2754q(@lvui Handler handler, @lvui Runnable runnable, @dd Object obj, long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.zy(handler, runnable, obj, j2);
        }
        Message messageObtain = Message.obtain(handler, runnable);
        messageObtain.obj = obj;
        return handler.sendMessageDelayed(messageObtain, j2);
    }

    @lvui
    public static Handler toq(@lvui Looper looper, @lvui Handler.Callback callback) {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.toq(looper, callback);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, callback, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w(f3713k, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w(f3713k, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w(f3713k, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    @hyr(16)
    public static boolean zy(@lvui Handler handler, @lvui Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 29) {
            return toq.m2756k(handler, runnable);
        }
        try {
            return ((Boolean) Handler.class.getMethod("hasCallbacks", Runnable.class).invoke(handler, runnable)).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NullPointerException e4) {
            e = e4;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
