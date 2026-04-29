package androidx.collection;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: LruCache.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6<K, V> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f47033f7l8;

    /* JADX INFO: renamed from: g */
    private int f1336g;

    /* JADX INFO: renamed from: k */
    private final LinkedHashMap<K, V> f1337k;

    /* JADX INFO: renamed from: n */
    private int f1338n;

    /* JADX INFO: renamed from: q */
    private int f1339q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f47034toq;

    /* JADX INFO: renamed from: y */
    private int f1340y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f47035zy;

    public ld6(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f47035zy = i2;
        this.f1337k = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int n7h(K k2, V v2) {
        int iMo837h = mo837h(k2, v2);
        if (iMo837h >= 0) {
            return iMo837h;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v2);
    }

    public final synchronized Map<K, V> cdj() {
        return new LinkedHashMap(this.f1337k);
    }

    public final synchronized int f7l8() {
        return this.f47033f7l8;
    }

    @dd
    /* JADX INFO: renamed from: g */
    public final V m836g(@lvui K k2) {
        V vPut;
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v2 = this.f1337k.get(k2);
            if (v2 != null) {
                this.f47033f7l8++;
                return v2;
            }
            this.f1340y++;
            V vMo838k = mo838k(k2);
            if (vMo838k == null) {
                return null;
            }
            synchronized (this) {
                this.f1338n++;
                vPut = this.f1337k.put(k2, vMo838k);
                if (vPut != null) {
                    this.f1337k.put(k2, vPut);
                } else {
                    this.f47034toq += n7h(k2, vMo838k);
                }
            }
            if (vPut != null) {
                zy(false, k2, vMo838k, vPut);
                return vPut;
            }
            ki(this.f47035zy);
            return vMo838k;
        }
    }

    /* JADX INFO: renamed from: h */
    protected int mo837h(@lvui K k2, @lvui V v2) {
        return 1;
    }

    @dd
    /* JADX INFO: renamed from: k */
    protected V mo838k(@lvui K k2) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ki(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f47034toq     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f1337k     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f47034toq     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f47034toq     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f1337k     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f1337k     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f1337k     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f47034toq     // Catch: java.lang.Throwable -> L71
            int r3 = r4.n7h(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f47034toq = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1336g     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f1336g = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.zy(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ld6.ki(int):void");
    }

    public final synchronized int kja0() {
        return this.f47034toq;
    }

    public final synchronized int ld6() {
        return this.f1339q;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized int m839n() {
        return this.f1336g;
    }

    @dd
    /* JADX INFO: renamed from: p */
    public final V m840p(@lvui K k2, @lvui V v2) {
        V vPut;
        if (k2 == null || v2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1339q++;
            this.f47034toq += n7h(k2, v2);
            vPut = this.f1337k.put(k2, v2);
            if (vPut != null) {
                this.f47034toq -= n7h(k2, vPut);
            }
        }
        if (vPut != null) {
            zy(false, k2, vPut, v2);
        }
        ki(this.f47035zy);
        return vPut;
    }

    /* JADX INFO: renamed from: q */
    public final void m841q() {
        ki(-1);
    }

    public void qrj(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.f47035zy = i2;
        }
        ki(i2);
    }

    /* JADX INFO: renamed from: s */
    public final synchronized int m842s() {
        return this.f1340y;
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f47033f7l8;
        i3 = this.f1340y + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f47035zy), Integer.valueOf(this.f47033f7l8), Integer.valueOf(this.f1340y), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }

    public final synchronized int toq() {
        return this.f1338n;
    }

    @dd
    public final V x2(@lvui K k2) {
        V vRemove;
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            vRemove = this.f1337k.remove(k2);
            if (vRemove != null) {
                this.f47034toq -= n7h(k2, vRemove);
            }
        }
        if (vRemove != null) {
            zy(false, k2, vRemove, null);
        }
        return vRemove;
    }

    /* JADX INFO: renamed from: y */
    public final synchronized int m843y() {
        return this.f47035zy;
    }

    protected void zy(boolean z2, @lvui K k2, @lvui V v2, @dd V v3) {
    }
}
