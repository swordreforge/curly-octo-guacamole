package u38j;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: u38j.k */
/* JADX INFO: compiled from: CollectionUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C7681k {
    private C7681k() {
    }

    public static int f7l8(Collection collection) {
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m28044g(T[] tArr, int i2) {
        if (tArr == null || i2 < 0 || m28049s(tArr) <= i2) {
            return null;
        }
        return tArr[i2];
    }

    /* JADX INFO: renamed from: k */
    public static List m28045k(List list) {
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public static <T> boolean kja0(T[] tArr) {
        return !x2(tArr);
    }

    public static boolean ld6(Map map) {
        return m28050y(map) == 0;
    }

    /* JADX INFO: renamed from: n */
    public static <K, V> V m28046n(Map<K, V> map, K k2) {
        if (map == null) {
            return null;
        }
        return map.get(k2);
    }

    public static boolean n7h(Map map) {
        return !ld6(map);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m28047p(Collection collection) {
        return f7l8(collection) == 0;
    }

    /* JADX INFO: renamed from: q */
    public static <T> T m28048q(List<T> list, int i2) {
        if (list == null || i2 < 0 || f7l8(list) <= i2) {
            return null;
        }
        return list.get(i2);
    }

    public static boolean qrj(Collection collection) {
        return !m28047p(collection);
    }

    /* JADX INFO: renamed from: s */
    public static <T> int m28049s(T[] tArr) {
        if (tArr != null) {
            return tArr.length;
        }
        return 0;
    }

    public static Map toq(Map map) {
        return map != null ? map : Collections.EMPTY_MAP;
    }

    public static <T> boolean x2(T[] tArr) {
        return m28049s(tArr) == 0;
    }

    /* JADX INFO: renamed from: y */
    public static int m28050y(Map map) {
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    public static Set zy(Set set) {
        return set != null ? set : Collections.EMPTY_SET;
    }
}
