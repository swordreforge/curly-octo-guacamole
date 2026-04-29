package androidx.room.util;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;
import zy.uv6;

/* JADX INFO: renamed from: androidx.room.util.n */
/* JADX INFO: compiled from: FtsTableInfo.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C1147n {

    /* JADX INFO: renamed from: q */
    private static final String[] f6258q = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* JADX INFO: renamed from: k */
    public final String f6259k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final Set<String> f52428toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final Set<String> f52429zy;

    public C1147n(String str, Set<String> set, Set<String> set2) {
        this.f6259k = str;
        this.f52428toq = set;
        this.f52429zy = set2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    @zy.yz
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.util.Set<java.lang.String> m5218k(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C1147n.m5218k(java.lang.String):java.util.Set");
    }

    /* JADX INFO: renamed from: q */
    private static Set<String> m5219q(androidx.sqlite.db.zy zyVar, String str) {
        Cursor cursorKcsr = zyVar.kcsr("SELECT * FROM sqlite_master WHERE `name` = '" + str + "'");
        try {
            String string = cursorKcsr.moveToFirst() ? cursorKcsr.getString(cursorKcsr.getColumnIndexOrThrow("sql")) : "";
            cursorKcsr.close();
            return m5218k(string);
        } catch (Throwable th) {
            cursorKcsr.close();
            throw th;
        }
    }

    public static C1147n toq(androidx.sqlite.db.zy zyVar, String str) {
        return new C1147n(str, zy(zyVar, str), m5219q(zyVar, str));
    }

    private static Set<String> zy(androidx.sqlite.db.zy zyVar, String str) {
        Cursor cursorKcsr = zyVar.kcsr("PRAGMA table_info(`" + str + "`)");
        HashSet hashSet = new HashSet();
        try {
            if (cursorKcsr.getColumnCount() > 0) {
                int columnIndex = cursorKcsr.getColumnIndex("name");
                while (cursorKcsr.moveToNext()) {
                    hashSet.add(cursorKcsr.getString(columnIndex));
                }
            }
            return hashSet;
        } finally {
            cursorKcsr.close();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1147n c1147n = (C1147n) obj;
        String str = this.f6259k;
        if (str == null ? c1147n.f6259k != null : !str.equals(c1147n.f6259k)) {
            return false;
        }
        Set<String> set = this.f52428toq;
        if (set == null ? c1147n.f52428toq != null : !set.equals(c1147n.f52428toq)) {
            return false;
        }
        Set<String> set2 = this.f52429zy;
        Set<String> set3 = c1147n.f52429zy;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    public int hashCode() {
        String str = this.f6259k;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Set<String> set = this.f52428toq;
        int iHashCode2 = (iHashCode + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f52429zy;
        return iHashCode2 + (set2 != null ? set2.hashCode() : 0);
    }

    public String toString() {
        return "FtsTableInfo{name='" + this.f6259k + "', columns=" + this.f52428toq + ", options=" + this.f52429zy + '}';
    }

    public C1147n(String str, Set<String> set, String str2) {
        this.f6259k = str;
        this.f52428toq = set;
        this.f52429zy = m5218k(str2);
    }
}
