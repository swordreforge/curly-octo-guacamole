package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: RegularImmutableMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
final class ec<K, V> extends zkd<K, V> {
    static final zkd<Object, Object> EMPTY = new ec(null, new Object[0], 0);

    /* JADX INFO: renamed from: p */
    private static final int f26081p = -1;
    private static final long serialVersionUID = 0;

    @InterfaceC7732q
    final transient Object[] alternatingKeysAndValues;

    /* JADX INFO: renamed from: s */
    private final transient int f26082s;

    /* JADX INFO: renamed from: y */
    private final transient int[] f26083y;

    /* JADX INFO: renamed from: com.google.common.collect.ec$k */
    /* JADX INFO: compiled from: RegularImmutableMap.java */
    static class C4355k<K, V> extends vep5<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: h */
        private final transient int f26084h;

        /* JADX INFO: renamed from: p */
        private final transient int f26085p;

        /* JADX INFO: renamed from: s */
        private final transient Object[] f26086s;

        /* JADX INFO: renamed from: y */
        private final transient zkd<K, V> f26087y;

        /* JADX INFO: renamed from: com.google.common.collect.ec$k$k */
        /* JADX INFO: compiled from: RegularImmutableMap.java */
        class k extends se<Map.Entry<K, V>> {
            k() {
            }

            @Override // com.google.common.collect.z4
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return C4355k.this.f26084h;
            }

            @Override // java.util.List
            public Map.Entry<K, V> get(int i2) {
                com.google.common.base.jk.mcp(i2, C4355k.this.f26084h);
                int i3 = i2 * 2;
                return new AbstractMap.SimpleImmutableEntry(C4355k.this.f26086s[C4355k.this.f26085p + i3], C4355k.this.f26086s[i3 + (C4355k.this.f26085p ^ 1)]);
            }
        }

        C4355k(zkd<K, V> zkdVar, Object[] objArr, int i2, int i3) {
            this.f26087y = zkdVar;
            this.f26086s = objArr;
            this.f26085p = i2;
            this.f26084h = i3;
        }

        @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f26087y.get(key));
        }

        @Override // com.google.common.collect.z4
        int copyIntoArray(Object[] objArr, int i2) {
            return asList().copyIntoArray(objArr, i2);
        }

        @Override // com.google.common.collect.vep5
        se<Map.Entry<K, V>> createAsList() {
            return new k();
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26084h;
        }

        @Override // com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public ab<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    /* JADX INFO: compiled from: RegularImmutableMap.java */
    static final class toq<K> extends vep5<K> {

        /* JADX INFO: renamed from: s */
        private final transient se<K> f26088s;

        /* JADX INFO: renamed from: y */
        private final transient zkd<K, ?> f26089y;

        toq(zkd<K, ?> zkdVar, se<K> seVar) {
            this.f26089y = zkdVar;
            this.f26088s = seVar;
        }

        @Override // com.google.common.collect.vep5, com.google.common.collect.z4
        public se<K> asList() {
            return this.f26088s;
        }

        @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(@NullableDecl Object obj) {
            return this.f26089y.get(obj) != null;
        }

        @Override // com.google.common.collect.z4
        int copyIntoArray(Object[] objArr, int i2) {
            return asList().copyIntoArray(objArr, i2);
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26089y.size();
        }

        @Override // com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public ab<K> iterator() {
            return asList().iterator();
        }
    }

    /* JADX INFO: compiled from: RegularImmutableMap.java */
    static final class zy extends se<Object> {

        /* JADX INFO: renamed from: g */
        private final transient int f26090g;

        /* JADX INFO: renamed from: n */
        private final transient Object[] f26091n;

        /* JADX INFO: renamed from: y */
        private final transient int f26092y;

        zy(Object[] objArr, int i2, int i3) {
            this.f26091n = objArr;
            this.f26090g = i2;
            this.f26092y = i3;
        }

        @Override // java.util.List
        public Object get(int i2) {
            com.google.common.base.jk.mcp(i2, this.f26092y);
            return this.f26091n[(i2 * 2) + this.f26090g];
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26092y;
        }
    }

    private ec(int[] iArr, Object[] objArr, int i2) {
        this.f26083y = iArr;
        this.alternatingKeysAndValues = objArr;
        this.f26082s = i2;
    }

    static <K, V> ec<K, V> create(int i2, Object[] objArr) {
        if (i2 == 0) {
            return (ec) EMPTY;
        }
        if (i2 == 1) {
            C4524t.m15983k(objArr[0], objArr[1]);
            return new ec<>(null, objArr, 1);
        }
        com.google.common.base.jk.m15381o(i2, objArr.length >> 1);
        return new ec<>(createHashTable(objArr, i2, vep5.chooseTableSize(i2), 0), objArr, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int[] createHashTable(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto Le
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.google.common.collect.C4524t.m15983k(r11, r10)
            r10 = 0
            return r10
        Le:
            int r1 = r12 + (-1)
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L17:
            if (r3 >= r11) goto L77
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.google.common.collect.C4524t.m15983k(r6, r4)
            int r7 = r6.hashCode()
            int r7 = com.google.common.collect.etdu.zy(r7)
        L2f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L39
            r12[r7] = r5
            int r3 = r3 + 1
            goto L17
        L39:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L44
            int r7 = r7 + 1
            goto L2f
        L44:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L77:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ec.createHashTable(java.lang.Object[], int, int, int):int[]");
    }

    @Override // com.google.common.collect.zkd
    vep5<Map.Entry<K, V>> createEntrySet() {
        return new C4355k(this, this.alternatingKeysAndValues, 0, this.f26082s);
    }

    @Override // com.google.common.collect.zkd
    vep5<K> createKeySet() {
        return new toq(this, new zy(this.alternatingKeysAndValues, 0, this.f26082s));
    }

    @Override // com.google.common.collect.zkd
    z4<V> createValues() {
        return new zy(this.alternatingKeysAndValues, 1, this.f26082s);
    }

    @Override // com.google.common.collect.zkd, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return (V) get(this.f26083y, this.alternatingKeysAndValues, this.f26082s, 0, obj);
    }

    @Override // com.google.common.collect.zkd
    boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f26082s;
    }

    static Object get(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i2, int i3, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[i3].equals(obj)) {
                return objArr[i3 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int iZy = etdu.zy(obj.hashCode());
        while (true) {
            int i4 = iZy & length;
            int i5 = iArr[i4];
            if (i5 == -1) {
                return null;
            }
            if (objArr[i5].equals(obj)) {
                return objArr[i5 ^ 1];
            }
            iZy = i4 + 1;
        }
    }
}
