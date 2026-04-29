package androidx.room.util;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import zy.dd;
import zy.uv6;

/* JADX INFO: compiled from: StringUtil.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class f7l8 {

    /* JADX INFO: renamed from: k */
    public static final String[] f6254k = new String[0];

    private f7l8() {
    }

    /* JADX INFO: renamed from: k */
    public static void m5214k(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("?");
            if (i3 < i2 - 1) {
                sb.append(",");
            }
        }
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static List<Integer> m5215q(@dd String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreElements()) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
            } catch (NumberFormatException e2) {
                Log.e("ROOM", "Malformed integer list", e2);
            }
        }
        return arrayList;
    }

    @dd
    public static String toq(@dd List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(Integer.toString(list.get(i2).intValue()));
            if (i2 < size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static StringBuilder zy() {
        return new StringBuilder();
    }
}
