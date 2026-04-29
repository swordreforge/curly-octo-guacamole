package com.xiaomi.push;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class vh {

    /* JADX INFO: renamed from: k */
    private static final Comparator f34034k = new C5953k();

    /* JADX INFO: renamed from: com.xiaomi.push.vh$k */
    private static class C5953k implements Comparator {
        private C5953k() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            return obj instanceof List ? vh.f7l8((List) obj, (List) obj2) : obj instanceof Set ? vh.m21914s((Set) obj, (Set) obj2) : obj instanceof Map ? vh.m21915y((Map) obj, (Map) obj2) : obj instanceof byte[] ? vh.x2((byte[]) obj, (byte[]) obj2) : vh.m21913q((Comparable) obj, (Comparable) obj2);
        }
    }

    public static byte[] cdj(ByteBuffer byteBuffer) {
        if (m21909h(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m21908g(byteBuffer, bArr, 0);
        return bArr;
    }

    public static int f7l8(List list, List list2) {
        int qVar = toq(list.size(), list2.size());
        if (qVar != 0) {
            return qVar;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iCompare = f34034k.compare(list.get(i2), list2.get(i2));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static int m21908g(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int iRemaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i2, iRemaining);
        return iRemaining;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m21909h(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* JADX INFO: renamed from: k */
    public static int m21910k(byte b2, byte b3) {
        if (b2 < b3) {
            return -1;
        }
        return b3 < b2 ? 1 : 0;
    }

    public static void kja0(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iArrayOffset > 128 ? iArrayOffset + 128 : iLimit;
        for (int i3 = iArrayOffset; i3 < i2; i3++) {
            if (i3 > iArrayOffset) {
                sb.append(" ");
            }
            sb.append(qrj(bArrArray[i3]));
        }
        if (iLimit != i2) {
            sb.append("...");
        }
    }

    public static int ld6(boolean z2, boolean z3) {
        return Boolean.valueOf(z2).compareTo(Boolean.valueOf(z3));
    }

    /* JADX INFO: renamed from: n */
    public static int m21911n(String str, String str2) {
        return str.compareTo(str2);
    }

    public static ByteBuffer n7h(ByteBuffer byteBuffer) {
        return m21909h(byteBuffer) ? byteBuffer : ByteBuffer.wrap(cdj(byteBuffer));
    }

    /* JADX INFO: renamed from: p */
    public static int m21912p(short s2, short s3) {
        if (s2 < s3) {
            return -1;
        }
        return s3 < s2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: q */
    public static int m21913q(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static String qrj(byte b2) {
        return Integer.toHexString((b2 | 256) & 511).toUpperCase().substring(1);
    }

    /* JADX INFO: renamed from: s */
    public static int m21914s(Set set, Set set2) {
        int qVar = toq(set.size(), set2.size());
        if (qVar != 0) {
            return qVar;
        }
        Comparator comparator = f34034k;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompare = f34034k.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    public static int toq(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i3 < i2 ? 1 : 0;
    }

    public static int x2(byte[] bArr, byte[] bArr2) {
        int qVar = toq(bArr.length, bArr2.length);
        if (qVar != 0) {
            return qVar;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int iM21910k = m21910k(bArr[i2], bArr2[i2]);
            if (iM21910k != 0) {
                return iM21910k;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: y */
    public static int m21915y(Map map, Map map2) {
        int qVar = toq(map.size(), map2.size());
        if (qVar != 0) {
            return qVar;
        }
        Comparator comparator = f34034k;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f34034k;
            int iCompare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return 0;
    }

    public static int zy(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j3 < j2 ? 1 : 0;
    }
}
