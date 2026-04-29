package androidx.room.util;

import android.database.Cursor;
import zy.uv6;

/* JADX INFO: renamed from: androidx.room.util.s */
/* JADX INFO: compiled from: ViewInfo.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C1149s {

    /* JADX INFO: renamed from: k */
    public final String f6260k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f52430toq;

    public C1149s(String str, String str2) {
        this.f6260k = str;
        this.f52430toq = str2;
    }

    /* JADX INFO: renamed from: k */
    public static C1149s m5221k(androidx.sqlite.db.zy zyVar, String str) {
        Cursor cursorKcsr = zyVar.kcsr("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + "'");
        try {
            return cursorKcsr.moveToFirst() ? new C1149s(cursorKcsr.getString(0), cursorKcsr.getString(1)) : new C1149s(str, null);
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
        C1149s c1149s = (C1149s) obj;
        String str = this.f6260k;
        if (str == null ? c1149s.f6260k == null : str.equals(c1149s.f6260k)) {
            String str2 = this.f52430toq;
            if (str2 != null) {
                if (str2.equals(c1149s.f52430toq)) {
                    return true;
                }
            } else if (c1149s.f52430toq == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6260k;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f52430toq;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ViewInfo{name='" + this.f6260k + "', sql='" + this.f52430toq + "'}";
    }
}
