package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import androidx.arch.core.executor.C0230k;
import androidx.room.util.C1145g;
import androidx.sqlite.db.InterfaceC1172g;
import androidx.sqlite.db.InterfaceC1175q;
import androidx.sqlite.db.InterfaceC1176y;
import com.android.thememanager.clockmessage.model.C1873k;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n5r1.AbstractC7399k;
import zy.InterfaceC7842s;
import zy.uv6;
import zy.y9n;

/* JADX INFO: renamed from: androidx.room.t */
/* JADX INFO: compiled from: RoomDatabase.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1141t {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static final int f52393qrj = 999;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f52394x2 = "_Impl";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    boolean f52395f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f6220g;

    /* JADX INFO: renamed from: k */
    @Deprecated
    protected volatile androidx.sqlite.db.zy f6221k;

    /* JADX INFO: renamed from: q */
    private InterfaceC1175q f6224q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Executor f52397toq;

    /* JADX INFO: renamed from: y */
    @Deprecated
    @zy.dd
    protected List<toq> f6226y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Executor f52398zy;

    /* JADX INFO: renamed from: s */
    private final ReentrantReadWriteLock f6225s = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: p */
    private final ThreadLocal<Integer> f6223p = new ThreadLocal<>();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final Map<String, Object> f52396ld6 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n */
    private final t8r f6222n = f7l8();

    /* JADX INFO: renamed from: androidx.room.t$k */
    /* JADX INFO: compiled from: RoomDatabase.java */
    public static class k<T extends AbstractC1141t> {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private File f52399cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private InterfaceC1175q.zy f52400f7l8;

        /* JADX INFO: renamed from: g */
        private Executor f6227g;

        /* JADX INFO: renamed from: h */
        private String f6228h;

        /* JADX INFO: renamed from: k */
        private final Class<T> f6229k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private Set<Integer> f52401kja0;

        /* JADX INFO: renamed from: n */
        private Executor f6230n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private Set<Integer> f52403n7h;

        /* JADX INFO: renamed from: p */
        private boolean f6231p;

        /* JADX INFO: renamed from: q */
        private ArrayList<toq> f6232q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f52405toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f52406x2;

        /* JADX INFO: renamed from: y */
        private boolean f6234y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Context f52407zy;

        /* JADX INFO: renamed from: s */
        private zy f6233s = zy.AUTOMATIC;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f52402ld6 = true;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private final q f52404qrj = new q();

        k(@zy.lvui Context context, @zy.lvui Class<T> cls, @zy.dd String str) {
            this.f52407zy = context;
            this.f6229k = cls;
            this.f52405toq = str;
        }

        @zy.lvui
        public k<T> f7l8() {
            this.f6231p = this.f52405toq != null;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: g */
        public k<T> m5192g(@zy.lvui File file) {
            this.f52399cdj = file;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public k<T> m5193k(@zy.lvui toq toqVar) {
            if (this.f6232q == null) {
                this.f6232q = new ArrayList<>();
            }
            this.f6232q.add(toqVar);
            return this;
        }

        @zy.lvui
        public k<T> ld6(@zy.dd InterfaceC1175q.zy zyVar) {
            this.f52400f7l8 = zyVar;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: n */
        public k<T> m5194n(@zy.lvui String str) {
            this.f6228h = str;
            return this;
        }

        @zy.lvui
        public k<T> n7h(@zy.lvui Executor executor) {
            this.f6227g = executor;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: p */
        public k<T> m5195p() {
            this.f52402ld6 = true;
            this.f52406x2 = true;
            return this;
        }

        @zy.lvui
        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: q */
        public T m5196q() {
            Executor executor;
            if (this.f52407zy == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f6229k == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f6230n;
            if (executor2 == null && this.f6227g == null) {
                Executor executorM763n = C0230k.m763n();
                this.f6227g = executorM763n;
                this.f6230n = executorM763n;
            } else if (executor2 != null && this.f6227g == null) {
                this.f6227g = executor2;
            } else if (executor2 == null && (executor = this.f6227g) != null) {
                this.f6230n = executor;
            }
            Set<Integer> set = this.f52401kja0;
            if (set != null && this.f52403n7h != null) {
                for (Integer num : set) {
                    if (this.f52403n7h.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            if (this.f52400f7l8 == null) {
                this.f52400f7l8 = new androidx.sqlite.db.framework.zy();
            }
            String str = this.f6228h;
            if (str != null || this.f52399cdj != null) {
                if (this.f52405toq == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                if (str != null && this.f52399cdj != null) {
                    throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                }
                this.f52400f7l8 = new d3(str, this.f52399cdj, this.f52400f7l8);
            }
            Context context = this.f52407zy;
            C1138q c1138q = new C1138q(context, this.f52405toq, this.f52400f7l8, this.f52404qrj, this.f6232q, this.f6234y, this.f6233s.resolve(context), this.f6230n, this.f6227g, this.f6231p, this.f52402ld6, this.f52406x2, this.f52403n7h, this.f6228h, this.f52399cdj);
            T t2 = (T) wvg.toq(this.f6229k, AbstractC1141t.f52394x2);
            t2.ki(c1138q);
            return t2;
        }

        @zy.lvui
        public k<T> qrj(@zy.lvui Executor executor) {
            this.f6230n = executor;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: s */
        public k<T> m5197s(int... iArr) {
            if (this.f52403n7h == null) {
                this.f52403n7h = new HashSet(iArr.length);
            }
            for (int i2 : iArr) {
                this.f52403n7h.add(Integer.valueOf(i2));
            }
            return this;
        }

        @zy.lvui
        public k<T> toq(@zy.lvui AbstractC7399k... abstractC7399kArr) {
            if (this.f52401kja0 == null) {
                this.f52401kja0 = new HashSet();
            }
            for (AbstractC7399k abstractC7399k : abstractC7399kArr) {
                this.f52401kja0.add(Integer.valueOf(abstractC7399k.f42532k));
                this.f52401kja0.add(Integer.valueOf(abstractC7399k.f93220toq));
            }
            this.f52404qrj.toq(abstractC7399kArr);
            return this;
        }

        @zy.lvui
        public k<T> x2(@zy.lvui zy zyVar) {
            this.f6233s = zyVar;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: y */
        public k<T> m5198y() {
            this.f52402ld6 = false;
            this.f52406x2 = true;
            return this;
        }

        @zy.lvui
        public k<T> zy() {
            this.f6234y = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.room.t$q */
    /* JADX INFO: compiled from: RoomDatabase.java */
    public static class q {

        /* JADX INFO: renamed from: k */
        private HashMap<Integer, TreeMap<Integer, AbstractC7399k>> f6235k = new HashMap<>();

        /* JADX INFO: renamed from: k */
        private void m5199k(AbstractC7399k abstractC7399k) {
            int i2 = abstractC7399k.f42532k;
            int i3 = abstractC7399k.f93220toq;
            TreeMap<Integer, AbstractC7399k> treeMap = this.f6235k.get(Integer.valueOf(i2));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f6235k.put(Integer.valueOf(i2), treeMap);
            }
            AbstractC7399k abstractC7399k2 = treeMap.get(Integer.valueOf(i3));
            if (abstractC7399k2 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC7399k2 + " with " + abstractC7399k);
            }
            treeMap.put(Integer.valueOf(i3), abstractC7399k);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0047 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:1: B:13:0x0026->B:43:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /* JADX INFO: renamed from: q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.util.List<n5r1.AbstractC7399k> m5200q(java.util.List<n5r1.AbstractC7399k> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L58
                goto L7
            L5:
                if (r9 <= r10) goto L58
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, n5r1.k>> r0 = r6.f6235k
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = r4
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                r7.add(r9)
                r9 = r3
                goto L55
            L54:
                r4 = r5
            L55:
                if (r4 != 0) goto L0
                return r1
            L58:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.AbstractC1141t.q.m5200q(java.util.List, boolean, int, int):java.util.List");
        }

        public void toq(@zy.lvui AbstractC7399k... abstractC7399kArr) {
            for (AbstractC7399k abstractC7399k : abstractC7399kArr) {
                m5199k(abstractC7399k);
            }
        }

        @zy.dd
        public List<AbstractC7399k> zy(int i2, int i3) {
            if (i2 == i3) {
                return Collections.emptyList();
            }
            return m5200q(new ArrayList(), i3 > i2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: androidx.room.t$toq */
    /* JADX INFO: compiled from: RoomDatabase.java */
    public static abstract class toq {
        /* JADX INFO: renamed from: k */
        public void m5201k(@zy.lvui androidx.sqlite.db.zy zyVar) {
        }

        public void toq(@zy.lvui androidx.sqlite.db.zy zyVar) {
        }
    }

    /* JADX INFO: renamed from: androidx.room.t$zy */
    /* JADX INFO: compiled from: RoomDatabase.java */
    public enum zy {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean toq(@zy.lvui ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        zy resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService(C1873k.f10652g);
            return (activityManager == null || toq(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: renamed from: i */
    private static boolean m5182i() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean cdj() {
        return this.f6224q.getWritableDatabase().mbx();
    }

    @zy.lvui
    protected abstract t8r f7l8();

    public boolean fn3e() {
        androidx.sqlite.db.zy zyVar = this.f6221k;
        return zyVar != null && zyVar.isOpen();
    }

    public <V> V fu4(@zy.lvui Callable<V> callable) {
        zy();
        try {
            try {
                V vCall = callable.call();
                o1t();
                m5189s();
                return vCall;
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
                C1145g.m5216k(e3);
                m5189s();
                return null;
            }
        } catch (Throwable th) {
            m5189s();
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC1176y m5183g(@zy.lvui String str) {
        m5185k();
        toq();
        return this.f6224q.getWritableDatabase().d8wk(str);
    }

    @zy.lvui
    /* JADX INFO: renamed from: h */
    public Executor m5184h() {
        return this.f52398zy;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: k */
    public void m5185k() {
        if (!this.f6220g && m5182i()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @InterfaceC7842s
    public void ki(@zy.lvui C1138q c1138q) {
        InterfaceC1175q interfaceC1175qMo5190y = mo5190y(c1138q);
        this.f6224q = interfaceC1175qMo5190y;
        if (interfaceC1175qMo5190y instanceof gvn7) {
            ((gvn7) interfaceC1175qMo5190y).m5151q(c1138q);
        }
        boolean z2 = c1138q.f52385f7l8 == zy.WRITE_AHEAD_LOGGING;
        this.f6224q.mo5150k(z2);
        this.f6226y = c1138q.f6215n;
        this.f52397toq = c1138q.f6219y;
        this.f52398zy = new lvui(c1138q.f6218s);
        this.f6220g = c1138q.f6213g;
        this.f52395f7l8 = z2;
        if (c1138q.f6216p) {
            this.f6222n.qrj(c1138q.f52390toq, c1138q.f52392zy);
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    ThreadLocal<Integer> kja0() {
        return this.f6223p;
    }

    Lock ld6() {
        return this.f6225s.readLock();
    }

    /* JADX INFO: renamed from: n */
    public void m5186n() {
        if (fn3e()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f6225s.writeLock();
            try {
                writeLock.lock();
                this.f6222n.kja0();
                this.f6224q.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @zy.lvui
    public Executor n7h() {
        return this.f52397toq;
    }

    public Cursor ni7(String str, @zy.dd Object[] objArr) {
        return this.f6224q.getWritableDatabase().mo5270a(new androidx.sqlite.db.toq(str, objArr));
    }

    @Deprecated
    public void o1t() {
        this.f6224q.getWritableDatabase().x9kr();
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: p */
    Map<String, Object> m5187p() {
        return this.f52396ld6;
    }

    @y9n
    /* JADX INFO: renamed from: q */
    public abstract void mo5188q();

    @zy.lvui
    public InterfaceC1175q qrj() {
        return this.f6224q;
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public void m5189s() {
        this.f6224q.getWritableDatabase().hb();
        if (cdj()) {
            return;
        }
        this.f6222n.m5208s();
    }

    protected void t8r(@zy.lvui androidx.sqlite.db.zy zyVar) {
        this.f6222n.f7l8(zyVar);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void toq() {
        if (!cdj() && this.f6223p.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @zy.lvui
    public t8r x2() {
        return this.f6222n;
    }

    @zy.lvui
    /* JADX INFO: renamed from: y */
    protected abstract InterfaceC1175q mo5190y(C1138q c1138q);

    /* JADX INFO: renamed from: z */
    public void m5191z(@zy.lvui Runnable runnable) {
        zy();
        try {
            runnable.run();
            o1t();
        } finally {
            m5189s();
        }
    }

    public Cursor zurt(InterfaceC1172g interfaceC1172g) {
        m5185k();
        toq();
        return this.f6224q.getWritableDatabase().mo5270a(interfaceC1172g);
    }

    @Deprecated
    public void zy() {
        m5185k();
        androidx.sqlite.db.zy writableDatabase = this.f6224q.getWritableDatabase();
        this.f6222n.ki(writableDatabase);
        writableDatabase.n7h();
    }
}
