package com.google.android.exoplayer2.upstream.cache;

import com.google.common.base.C4258g;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zy.dd;

/* JADX INFO: compiled from: DefaultContentMetadata.java */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 implements qrj {

    /* JADX INFO: renamed from: g */
    public static final kja0 f22914g = new kja0(Collections.emptyMap());

    /* JADX INFO: renamed from: n */
    private final Map<String, byte[]> f22915n;

    /* JADX INFO: renamed from: q */
    private int f22916q;

    public kja0() {
        this(Collections.emptyMap());
    }

    private static Map<String, byte[]> f7l8(Map<String, byte[]> map, n7h n7hVar) {
        HashMap map2 = new HashMap(map);
        x2(map2, n7hVar.zy());
        m13389g(map2, n7hVar.toq());
        return map2;
    }

    /* JADX INFO: renamed from: g */
    private static void m13389g(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), m13390p(entry.getValue()));
        }
    }

    private static boolean ld6(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    private static byte[] m13390p(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(C4258g.f68103zy);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static void x2(HashMap<String, byte[]> map, List<String> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            map.remove(list.get(i2));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.qrj
    public final boolean contains(String str) {
        return this.f22915n.containsKey(str);
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kja0.class != obj.getClass()) {
            return false;
        }
        return ld6(this.f22915n, ((kja0) obj).f22915n);
    }

    public int hashCode() {
        if (this.f22916q == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f22915n.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f22916q = iHashCode;
        }
        return this.f22916q;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.qrj
    /* JADX INFO: renamed from: k */
    public final long mo13391k(String str, long j2) {
        byte[] bArr = this.f22915n.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j2;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.qrj
    @dd
    /* JADX INFO: renamed from: q */
    public final String mo13392q(String str, @dd String str2) {
        byte[] bArr = this.f22915n.get(str);
        return bArr != null ? new String(bArr, C4258g.f68103zy) : str2;
    }

    /* JADX INFO: renamed from: s */
    public Set<Map.Entry<String, byte[]>> m13393s() {
        return this.f22915n.entrySet();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.qrj
    @dd
    public final byte[] toq(String str, @dd byte[] bArr) {
        byte[] bArr2 = this.f22915n.get(str);
        return bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : bArr;
    }

    /* JADX INFO: renamed from: y */
    public kja0 m13394y(n7h n7hVar) {
        Map<String, byte[]> mapF7l8 = f7l8(this.f22915n, n7hVar);
        return ld6(this.f22915n, mapF7l8) ? this : new kja0(mapF7l8);
    }

    public kja0(Map<String, byte[]> map) {
        this.f22915n = Collections.unmodifiableMap(map);
    }
}
