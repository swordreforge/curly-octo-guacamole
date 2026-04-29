package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.sqlite.db.InterfaceC1176y;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import y9n.InterfaceC7782q;
import zy.uv6;
import zy.y9n;
import zy.yz;

/* JADX INFO: compiled from: InvalidationTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class t8r {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f52408cdj = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";

    /* JADX INFO: renamed from: h */
    private static final String f6237h = "invalidated";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @yz
    static final String f52409ki = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f52410kja0 = "table_id";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f52411n7h = "room_table_modification_log";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String[] f52412qrj = {"UPDATE", InterfaceC7782q.f100601fu4, "INSERT"};

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @yz
    static final String f52413t8r = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    volatile InterfaceC1176y f52414f7l8;

    /* JADX INFO: renamed from: g */
    private volatile boolean f6238g;

    /* JADX INFO: renamed from: k */
    @zy.lvui
    @yz
    final HashMap<String, Integer> f6239k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private MultiInstanceInvalidationClient f52415ld6;

    /* JADX INFO: renamed from: n */
    AtomicBoolean f6240n;

    /* JADX INFO: renamed from: p */
    @SuppressLint({"RestrictedApi"})
    @yz
    final androidx.arch.core.internal.toq<zy, C1144q> f6241p;

    /* JADX INFO: renamed from: q */
    final AbstractC1141t f6242q;

    /* JADX INFO: renamed from: s */
    private final ki f6243s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final String[] f52416toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @yz
    Runnable f52417x2;

    /* JADX INFO: renamed from: y */
    private toq f6244y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.lvui
    private Map<String, Set<String>> f52418zy;

    /* JADX INFO: renamed from: androidx.room.t8r$k */
    /* JADX INFO: compiled from: InvalidationTracker.java */
    class RunnableC1142k implements Runnable {
        RunnableC1142k() {
        }

        /* JADX INFO: renamed from: k */
        private Set<Integer> m5210k() {
            HashSet hashSet = new HashSet();
            Cursor cursorZurt = t8r.this.f6242q.zurt(new androidx.sqlite.db.toq(t8r.f52413t8r));
            while (cursorZurt.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorZurt.getInt(0)));
                } catch (Throwable th) {
                    cursorZurt.close();
                    throw th;
                }
            }
            cursorZurt.close();
            if (!hashSet.isEmpty()) {
                t8r.this.f52414f7l8.mo5277z();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock lockLd6 = t8r.this.f6242q.ld6();
            Set<Integer> setM5210k = null;
            try {
                try {
                    lockLd6.lock();
                } finally {
                    lockLd6.unlock();
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
            }
            if (t8r.this.m5203g()) {
                if (t8r.this.f6240n.compareAndSet(true, false)) {
                    if (t8r.this.f6242q.cdj()) {
                        return;
                    }
                    AbstractC1141t abstractC1141t = t8r.this.f6242q;
                    if (abstractC1141t.f52395f7l8) {
                        androidx.sqlite.db.zy writableDatabase = abstractC1141t.qrj().getWritableDatabase();
                        writableDatabase.n7h();
                        try {
                            setM5210k = m5210k();
                            writableDatabase.x9kr();
                            writableDatabase.hb();
                        } catch (Throwable th) {
                            writableDatabase.hb();
                            throw th;
                        }
                    } else {
                        setM5210k = m5210k();
                    }
                    if (setM5210k == null || setM5210k.isEmpty()) {
                        return;
                    }
                    synchronized (t8r.this.f6241p) {
                        Iterator<Map.Entry<zy, C1144q>> it = t8r.this.f6241p.iterator();
                        while (it.hasNext()) {
                            it.next().getValue().m5211k(setM5210k);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.t8r$n */
    /* JADX INFO: compiled from: InvalidationTracker.java */
    static class C1143n extends zy {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final t8r f52419toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final WeakReference<zy> f52420zy;

        C1143n(t8r t8rVar, zy zyVar) {
            super(zyVar.f6253k);
            this.f52419toq = t8rVar;
            this.f52420zy = new WeakReference<>(zyVar);
        }

        @Override // androidx.room.t8r.zy
        public void toq(@zy.lvui Set<String> set) {
            zy zyVar = this.f52420zy.get();
            if (zyVar == null) {
                this.f52419toq.ld6(this);
            } else {
                zyVar.toq(set);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.t8r$q */
    /* JADX INFO: compiled from: InvalidationTracker.java */
    static class C1144q {

        /* JADX INFO: renamed from: k */
        final int[] f6246k;

        /* JADX INFO: renamed from: q */
        private final Set<String> f6247q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String[] f52421toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final zy f52422zy;

        C1144q(zy zyVar, int[] iArr, String[] strArr) {
            this.f52422zy = zyVar;
            this.f6246k = iArr;
            this.f52421toq = strArr;
            if (iArr.length != 1) {
                this.f6247q = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f6247q = Collections.unmodifiableSet(hashSet);
        }

        /* JADX INFO: renamed from: k */
        void m5211k(Set<Integer> set) {
            int length = this.f6246k.length;
            Set<String> hashSet = null;
            for (int i2 = 0; i2 < length; i2++) {
                if (set.contains(Integer.valueOf(this.f6246k[i2]))) {
                    if (length == 1) {
                        hashSet = this.f6247q;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>(length);
                        }
                        hashSet.add(this.f52421toq[i2]);
                    }
                }
            }
            if (hashSet != null) {
                this.f52422zy.toq(hashSet);
            }
        }

        void toq(String[] strArr) {
            Set<String> set = null;
            if (this.f52421toq.length == 1) {
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (strArr[i2].equalsIgnoreCase(this.f52421toq[0])) {
                        set = this.f6247q;
                        break;
                    }
                    i2++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f52421toq;
                    int length2 = strArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            String str2 = strArr2[i3];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i3++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f52422zy.toq(set);
            }
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.java */
    static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        static final int f52423f7l8 = 1;

        /* JADX INFO: renamed from: g */
        static final int f6248g = 0;

        /* JADX INFO: renamed from: y */
        static final int f6249y = 2;

        /* JADX INFO: renamed from: k */
        final long[] f6250k;

        /* JADX INFO: renamed from: n */
        boolean f6251n;

        /* JADX INFO: renamed from: q */
        boolean f6252q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final boolean[] f52424toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final int[] f52425zy;

        toq(int i2) {
            long[] jArr = new long[i2];
            this.f6250k = jArr;
            boolean[] zArr = new boolean[i2];
            this.f52424toq = zArr;
            this.f52425zy = new int[i2];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        @zy.dd
        /* JADX INFO: renamed from: k */
        int[] m5212k() {
            synchronized (this) {
                if (this.f6252q && !this.f6251n) {
                    int length = this.f6250k.length;
                    int i2 = 0;
                    while (true) {
                        int i3 = 1;
                        if (i2 >= length) {
                            this.f6251n = true;
                            this.f6252q = false;
                            return this.f52425zy;
                        }
                        boolean z2 = this.f6250k[i2] > 0;
                        boolean[] zArr = this.f52424toq;
                        if (z2 != zArr[i2]) {
                            int[] iArr = this.f52425zy;
                            if (!z2) {
                                i3 = 2;
                            }
                            iArr[i2] = i3;
                        } else {
                            this.f52425zy[i2] = 0;
                        }
                        zArr[i2] = z2;
                        i2++;
                    }
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: q */
        void m5213q() {
            synchronized (this) {
                this.f6251n = false;
            }
        }

        boolean toq(int... iArr) {
            boolean z2;
            synchronized (this) {
                z2 = false;
                for (int i2 : iArr) {
                    long[] jArr = this.f6250k;
                    long j2 = jArr[i2];
                    jArr[i2] = 1 + j2;
                    if (j2 == 0) {
                        this.f6252q = true;
                        z2 = true;
                    }
                }
            }
            return z2;
        }

        boolean zy(int... iArr) {
            boolean z2;
            synchronized (this) {
                z2 = false;
                for (int i2 : iArr) {
                    long[] jArr = this.f6250k;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        this.f6252q = true;
                        z2 = true;
                    }
                }
            }
            return z2;
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public t8r(AbstractC1141t abstractC1141t, String... strArr) {
        this(abstractC1141t, new HashMap(), Collections.emptyMap(), strArr);
    }

    /* JADX INFO: renamed from: h */
    private void m5202h(androidx.sqlite.db.zy zyVar, int i2) {
        String str = this.f52416toq[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f52412qrj) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            zy(sb, str, str2);
            zyVar.mo5273i(sb.toString());
        }
    }

    private void n7h(androidx.sqlite.db.zy zyVar, int i2) {
        zyVar.mo5273i("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.f52416toq[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f52412qrj) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            zy(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append(f52411n7h);
            sb.append(" SET ");
            sb.append(f6237h);
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append(f52410kja0);
            sb.append(" = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append(f6237h);
            sb.append(" = 0");
            sb.append("; END");
            zyVar.mo5273i(sb.toString());
        }
    }

    private String[] t8r(String[] strArr) {
        String[] strArrX2 = x2(strArr);
        for (String str : strArrX2) {
            if (!this.f6239k.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return strArrX2;
    }

    private String[] x2(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f52418zy.containsKey(lowerCase)) {
                hashSet.addAll(this.f52418zy.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private static void zy(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    void cdj() {
        if (this.f6242q.fn3e()) {
            ki(this.f6242q.qrj().getWritableDatabase());
        }
    }

    void f7l8(androidx.sqlite.db.zy zyVar) {
        synchronized (this) {
            if (this.f6238g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            zyVar.mo5273i("PRAGMA temp_store = MEMORY;");
            zyVar.mo5273i("PRAGMA recursive_triggers='ON';");
            zyVar.mo5273i(f52408cdj);
            ki(zyVar);
            this.f52414f7l8 = zyVar.d8wk(f52409ki);
            this.f6238g = true;
        }
    }

    /* JADX INFO: renamed from: g */
    boolean m5203g() {
        if (!this.f6242q.fn3e()) {
            return false;
        }
        if (!this.f6238g) {
            this.f6242q.qrj().getWritableDatabase();
        }
        if (this.f6238g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    @y9n
    /* JADX INFO: renamed from: k */
    public void m5204k(@zy.lvui zy zyVar) {
        C1144q c1144qF7l8;
        String[] strArrX2 = x2(zyVar.f6253k);
        int[] iArr = new int[strArrX2.length];
        int length = strArrX2.length;
        for (int i2 = 0; i2 < length; i2++) {
            Integer num = this.f6239k.get(strArrX2[i2].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrX2[i2]);
            }
            iArr[i2] = num.intValue();
        }
        C1144q c1144q = new C1144q(zyVar, iArr, strArrX2);
        synchronized (this.f6241p) {
            c1144qF7l8 = this.f6241p.f7l8(zyVar, c1144q);
        }
        if (c1144qF7l8 == null && this.f6244y.toq(iArr)) {
            cdj();
        }
    }

    void ki(androidx.sqlite.db.zy zyVar) {
        if (zyVar.mbx()) {
            return;
        }
        while (true) {
            try {
                Lock lockLd6 = this.f6242q.ld6();
                lockLd6.lock();
                try {
                    int[] iArrM5212k = this.f6244y.m5212k();
                    if (iArrM5212k == null) {
                        return;
                    }
                    int length = iArrM5212k.length;
                    zyVar.n7h();
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            int i3 = iArrM5212k[i2];
                            if (i3 == 1) {
                                n7h(zyVar, i2);
                            } else if (i3 == 2) {
                                m5202h(zyVar, i2);
                            }
                        } finally {
                        }
                    }
                    zyVar.x9kr();
                    zyVar.hb();
                    this.f6244y.m5213q();
                } finally {
                    lockLd6.unlock();
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                return;
            }
        }
    }

    void kja0() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f52415ld6;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.m5140k();
            this.f52415ld6 = null;
        }
    }

    @SuppressLint({"RestrictedApi"})
    @y9n
    public void ld6(@zy.lvui zy zyVar) {
        C1144q c1144qMo770y;
        synchronized (this.f6241p) {
            c1144qMo770y = this.f6241p.mo770y(zyVar);
        }
        if (c1144qMo770y == null || !this.f6244y.zy(c1144qMo770y.f6246k)) {
            return;
        }
        cdj();
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: n */
    public <T> LiveData<T> m5205n(String[] strArr, boolean z2, Callable<T> callable) {
        return this.f6243s.m5163k(t8r(strArr), z2, callable);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    @y9n
    /* JADX INFO: renamed from: p */
    public void m5206p() {
        cdj();
        this.f52417x2.run();
    }

    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: q */
    public <T> LiveData<T> m5207q(String[] strArr, Callable<T> callable) {
        return m5205n(strArr, false, callable);
    }

    void qrj(Context context, String str) {
        this.f52415ld6 = new MultiInstanceInvalidationClient(context, str, this, this.f6242q.n7h());
    }

    /* JADX INFO: renamed from: s */
    public void m5208s() {
        if (this.f6240n.compareAndSet(false, true)) {
            this.f6242q.n7h().execute(this.f52417x2);
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void toq(zy zyVar) {
        m5204k(new C1143n(this, zyVar));
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    @yz(otherwise = 3)
    /* JADX INFO: renamed from: y */
    public void m5209y(String... strArr) {
        synchronized (this.f6241p) {
            for (Map.Entry<zy, C1144q> entry : this.f6241p) {
                if (!entry.getKey().mo5141k()) {
                    entry.getValue().toq(strArr);
                }
            }
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public t8r(AbstractC1141t abstractC1141t, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f6240n = new AtomicBoolean(false);
        this.f6238g = false;
        this.f6241p = new androidx.arch.core.internal.toq<>();
        this.f52417x2 = new RunnableC1142k();
        this.f6242q = abstractC1141t;
        this.f6244y = new toq(strArr.length);
        this.f6239k = new HashMap<>();
        this.f52418zy = map2;
        this.f6243s = new ki(abstractC1141t);
        int length = strArr.length;
        this.f52416toq = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f6239k.put(lowerCase, Integer.valueOf(i2));
            String str2 = map.get(strArr[i2]);
            if (str2 != null) {
                this.f52416toq[i2] = str2.toLowerCase(locale);
            } else {
                this.f52416toq[i2] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f6239k.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f6239k;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.java */
    public static abstract class zy {

        /* JADX INFO: renamed from: k */
        final String[] f6253k;

        protected zy(@zy.lvui String str, String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.f6253k = strArr2;
            strArr2[strArr.length] = str;
        }

        /* JADX INFO: renamed from: k */
        boolean mo5141k() {
            return false;
        }

        public abstract void toq(@zy.lvui Set<String> set);

        public zy(@zy.lvui String[] strArr) {
            this.f6253k = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
    }
}
