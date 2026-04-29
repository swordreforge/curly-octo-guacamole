package androidx.room.util;

import android.database.Cursor;
import androidx.room.InterfaceC1131k;
import androidx.room.util.TableInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.room.util.y */
/* JADX INFO: compiled from: TableInfo.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C1150y {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f52431f7l8 = 2;

    /* JADX INFO: renamed from: g */
    public static final int f6261g = 1;

    /* JADX INFO: renamed from: n */
    public static final int f6262n = 0;

    /* JADX INFO: renamed from: k */
    public final String f6263k;

    /* JADX INFO: renamed from: q */
    @dd
    public final Set<q> f6264q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final Map<String, k> f52432toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final Set<toq> f52433zy;

    /* JADX INFO: renamed from: androidx.room.util.y$k */
    /* JADX INFO: compiled from: TableInfo.java */
    public static class k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @TableInfo.CreatedFrom
        private final int f52434f7l8;

        /* JADX INFO: renamed from: g */
        public final String f6265g;

        /* JADX INFO: renamed from: k */
        public final String f6266k;

        /* JADX INFO: renamed from: n */
        public final int f6267n;

        /* JADX INFO: renamed from: q */
        public final boolean f6268q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final String f52435toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC1131k.toq
        public final int f52436zy;

        @Deprecated
        public k(String str, String str2, boolean z2, int i2) {
            this(str, str2, z2, i2, null, 0);
        }

        @InterfaceC1131k.toq
        /* JADX INFO: renamed from: k */
        private static int m5227k(@dd String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            k kVar = (k) obj;
            if (this.f6267n != kVar.f6267n || !this.f6266k.equals(kVar.f6266k) || this.f6268q != kVar.f6268q) {
                return false;
            }
            if (this.f52434f7l8 == 1 && kVar.f52434f7l8 == 2 && (str3 = this.f6265g) != null && !str3.equals(kVar.f6265g)) {
                return false;
            }
            if (this.f52434f7l8 == 2 && kVar.f52434f7l8 == 1 && (str2 = kVar.f6265g) != null && !str2.equals(this.f6265g)) {
                return false;
            }
            int i2 = this.f52434f7l8;
            return (i2 == 0 || i2 != kVar.f52434f7l8 || ((str = this.f6265g) == null ? kVar.f6265g == null : str.equals(kVar.f6265g))) && this.f52436zy == kVar.f52436zy;
        }

        public int hashCode() {
            return (((((this.f6266k.hashCode() * 31) + this.f52436zy) * 31) + (this.f6268q ? 1231 : 1237)) * 31) + this.f6267n;
        }

        public String toString() {
            return "Column{name='" + this.f6266k + "', type='" + this.f52435toq + "', affinity='" + this.f52436zy + "', notNull=" + this.f6268q + ", primaryKeyPosition=" + this.f6267n + ", defaultValue='" + this.f6265g + "'}";
        }

        public boolean toq() {
            return this.f6267n > 0;
        }

        public k(String str, String str2, boolean z2, int i2, String str3, int i3) {
            this.f6266k = str;
            this.f52435toq = str2;
            this.f6268q = z2;
            this.f6267n = i2;
            this.f52436zy = m5227k(str2);
            this.f6265g = str3;
            this.f52434f7l8 = i3;
        }
    }

    /* JADX INFO: renamed from: androidx.room.util.y$q */
    /* JADX INFO: compiled from: TableInfo.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static class q {

        /* JADX INFO: renamed from: q */
        public static final String f6269q = "index_";

        /* JADX INFO: renamed from: k */
        public final String f6270k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean f52437toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final List<String> f52438zy;

        public q(String str, boolean z2, List<String> list) {
            this.f6270k = str;
            this.f52437toq = z2;
            this.f52438zy = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            q qVar = (q) obj;
            if (this.f52437toq == qVar.f52437toq && this.f52438zy.equals(qVar.f52438zy)) {
                return this.f6270k.startsWith(f6269q) ? qVar.f6270k.startsWith(f6269q) : this.f6270k.equals(qVar.f6270k);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f6270k.startsWith(f6269q) ? -1184239155 : this.f6270k.hashCode()) * 31) + (this.f52437toq ? 1 : 0)) * 31) + this.f52438zy.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f6270k + "', unique=" + this.f52437toq + ", columns=" + this.f52438zy + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.room.util.y$toq */
    /* JADX INFO: compiled from: TableInfo.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static class toq {

        /* JADX INFO: renamed from: k */
        @lvui
        public final String f6271k;

        /* JADX INFO: renamed from: n */
        @lvui
        public final List<String> f6272n;

        /* JADX INFO: renamed from: q */
        @lvui
        public final List<String> f6273q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        public final String f52439toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        public final String f52440zy;

        public toq(@lvui String str, @lvui String str2, @lvui String str3, @lvui List<String> list, @lvui List<String> list2) {
            this.f6271k = str;
            this.f52439toq = str2;
            this.f52440zy = str3;
            this.f6273q = Collections.unmodifiableList(list);
            this.f6272n = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            toq toqVar = (toq) obj;
            if (this.f6271k.equals(toqVar.f6271k) && this.f52439toq.equals(toqVar.f52439toq) && this.f52440zy.equals(toqVar.f52440zy) && this.f6273q.equals(toqVar.f6273q)) {
                return this.f6272n.equals(toqVar.f6272n);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f6271k.hashCode() * 31) + this.f52439toq.hashCode()) * 31) + this.f52440zy.hashCode()) * 31) + this.f6273q.hashCode()) * 31) + this.f6272n.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f6271k + "', onDelete='" + this.f52439toq + "', onUpdate='" + this.f52440zy + "', columnNames=" + this.f6273q + ", referenceColumnNames=" + this.f6272n + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.room.util.y$zy */
    /* JADX INFO: compiled from: TableInfo.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    static class zy implements Comparable<zy> {

        /* JADX INFO: renamed from: g */
        final String f6274g;

        /* JADX INFO: renamed from: k */
        final int f6275k;

        /* JADX INFO: renamed from: n */
        final String f6276n;

        /* JADX INFO: renamed from: q */
        final int f6277q;

        zy(int i2, int i3, String str, String str2) {
            this.f6275k = i2;
            this.f6277q = i3;
            this.f6276n = str;
            this.f6274g = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public int compareTo(@lvui zy zyVar) {
            int i2 = this.f6275k - zyVar.f6275k;
            return i2 == 0 ? this.f6277q - zyVar.f6277q : i2;
        }
    }

    public C1150y(String str, Map<String, k> map, Set<toq> set, Set<q> set2) {
        this.f6263k = str;
        this.f52432toq = Collections.unmodifiableMap(map);
        this.f52433zy = Collections.unmodifiableSet(set);
        this.f6264q = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    @dd
    /* JADX INFO: renamed from: g */
    private static Set<q> m5223g(androidx.sqlite.db.zy zyVar, String str) {
        Cursor cursorKcsr = zyVar.kcsr("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorKcsr.getColumnIndex("name");
            int columnIndex2 = cursorKcsr.getColumnIndex("origin");
            int columnIndex3 = cursorKcsr.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorKcsr.moveToNext()) {
                    if ("c".equals(cursorKcsr.getString(columnIndex2))) {
                        String string = cursorKcsr.getString(columnIndex);
                        boolean z2 = true;
                        if (cursorKcsr.getInt(columnIndex3) != 1) {
                            z2 = false;
                        }
                        q qVarM5225n = m5225n(zyVar, string, z2);
                        if (qVarM5225n == null) {
                            return null;
                        }
                        hashSet.add(qVarM5225n);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            cursorKcsr.close();
        }
    }

    /* JADX INFO: renamed from: k */
    public static C1150y m5224k(androidx.sqlite.db.zy zyVar, String str) {
        return new C1150y(str, toq(zyVar, str), m5226q(zyVar, str), m5223g(zyVar, str));
    }

    @dd
    /* JADX INFO: renamed from: n */
    private static q m5225n(androidx.sqlite.db.zy zyVar, String str, boolean z2) {
        Cursor cursorKcsr = zyVar.kcsr("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorKcsr.getColumnIndex("seqno");
            int columnIndex2 = cursorKcsr.getColumnIndex("cid");
            int columnIndex3 = cursorKcsr.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorKcsr.moveToNext()) {
                    if (cursorKcsr.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorKcsr.getInt(columnIndex)), cursorKcsr.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new q(str, z2, arrayList);
            }
            return null;
        } finally {
            cursorKcsr.close();
        }
    }

    /* JADX INFO: renamed from: q */
    private static Set<toq> m5226q(androidx.sqlite.db.zy zyVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorKcsr = zyVar.kcsr("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorKcsr.getColumnIndex("id");
            int columnIndex2 = cursorKcsr.getColumnIndex("seq");
            int columnIndex3 = cursorKcsr.getColumnIndex("table");
            int columnIndex4 = cursorKcsr.getColumnIndex("on_delete");
            int columnIndex5 = cursorKcsr.getColumnIndex("on_update");
            List<zy> listZy = zy(cursorKcsr);
            int count = cursorKcsr.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                cursorKcsr.moveToPosition(i2);
                if (cursorKcsr.getInt(columnIndex2) == 0) {
                    int i3 = cursorKcsr.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (zy zyVar2 : listZy) {
                        if (zyVar2.f6275k == i3) {
                            arrayList.add(zyVar2.f6276n);
                            arrayList2.add(zyVar2.f6274g);
                        }
                    }
                    hashSet.add(new toq(cursorKcsr.getString(columnIndex3), cursorKcsr.getString(columnIndex4), cursorKcsr.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            cursorKcsr.close();
        }
    }

    private static Map<String, k> toq(androidx.sqlite.db.zy zyVar, String str) {
        Cursor cursorKcsr = zyVar.kcsr("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorKcsr.getColumnCount() > 0) {
                int columnIndex = cursorKcsr.getColumnIndex("name");
                int columnIndex2 = cursorKcsr.getColumnIndex("type");
                int columnIndex3 = cursorKcsr.getColumnIndex("notnull");
                int columnIndex4 = cursorKcsr.getColumnIndex("pk");
                int columnIndex5 = cursorKcsr.getColumnIndex("dflt_value");
                while (cursorKcsr.moveToNext()) {
                    String string = cursorKcsr.getString(columnIndex);
                    map.put(string, new k(string, cursorKcsr.getString(columnIndex2), cursorKcsr.getInt(columnIndex3) != 0, cursorKcsr.getInt(columnIndex4), cursorKcsr.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorKcsr.close();
        }
    }

    private static List<zy> zy(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            cursor.moveToPosition(i2);
            arrayList.add(new zy(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public boolean equals(Object obj) {
        Set<q> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1150y c1150y = (C1150y) obj;
        String str = this.f6263k;
        if (str == null ? c1150y.f6263k != null : !str.equals(c1150y.f6263k)) {
            return false;
        }
        Map<String, k> map = this.f52432toq;
        if (map == null ? c1150y.f52432toq != null : !map.equals(c1150y.f52432toq)) {
            return false;
        }
        Set<toq> set2 = this.f52433zy;
        if (set2 == null ? c1150y.f52433zy != null : !set2.equals(c1150y.f52433zy)) {
            return false;
        }
        Set<q> set3 = this.f6264q;
        if (set3 == null || (set = c1150y.f6264q) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f6263k;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, k> map = this.f52432toq;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<toq> set = this.f52433zy;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f6263k + "', columns=" + this.f52432toq + ", foreignKeys=" + this.f52433zy + ", indices=" + this.f6264q + '}';
    }

    public C1150y(String str, Map<String, k> map, Set<toq> set) {
        this(str, map, set, Collections.emptySet());
    }
}
