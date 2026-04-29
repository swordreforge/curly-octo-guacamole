package androidx.sqlite.db;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: SupportSQLiteQueryBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class f7l8 {

    /* JADX INFO: renamed from: p */
    private static final Pattern f6336p = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* JADX INFO: renamed from: n */
    private Object[] f6339n;

    /* JADX INFO: renamed from: q */
    private String f6340q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f52456toq;

    /* JADX INFO: renamed from: k */
    private boolean f6338k = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String[] f52457zy = null;

    /* JADX INFO: renamed from: g */
    private String f6337g = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private String f52455f7l8 = null;

    /* JADX INFO: renamed from: y */
    private String f6342y = null;

    /* JADX INFO: renamed from: s */
    private String f6341s = null;

    private f7l8(String str) {
        this.f52456toq = str;
    }

    /* JADX INFO: renamed from: k */
    private static void m5263k(StringBuilder sb, String str, String str2) {
        if (m5264s(str2)) {
            return;
        }
        sb.append(str);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: s */
    private static boolean m5264s(String str) {
        return str == null || str.length() == 0;
    }

    private static void toq(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(' ');
    }

    public static f7l8 zy(String str) {
        return new f7l8(str);
    }

    public f7l8 f7l8(String str) {
        this.f6337g = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public f7l8 m5265g() {
        this.f6338k = true;
        return this;
    }

    public f7l8 ld6(String str) {
        this.f6342y = str;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC1172g m5266n() {
        if (m5264s(this.f6337g) && !m5264s(this.f52455f7l8)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (this.f6338k) {
            sb.append("DISTINCT ");
        }
        String[] strArr = this.f52457zy;
        if (strArr == null || strArr.length == 0) {
            sb.append(" * ");
        } else {
            toq(sb, strArr);
        }
        sb.append(" FROM ");
        sb.append(this.f52456toq);
        m5263k(sb, " WHERE ", this.f6340q);
        m5263k(sb, " GROUP BY ", this.f6337g);
        m5263k(sb, " HAVING ", this.f52455f7l8);
        m5263k(sb, " ORDER BY ", this.f6342y);
        m5263k(sb, " LIMIT ", this.f6341s);
        return new toq(sb.toString(), this.f6339n);
    }

    /* JADX INFO: renamed from: p */
    public f7l8 m5267p(String str) {
        if (m5264s(str) || f6336p.matcher(str).matches()) {
            this.f6341s = str;
            return this;
        }
        throw new IllegalArgumentException("invalid LIMIT clauses:" + str);
    }

    /* JADX INFO: renamed from: q */
    public f7l8 m5268q(String[] strArr) {
        this.f52457zy = strArr;
        return this;
    }

    public f7l8 x2(String str, Object[] objArr) {
        this.f6340q = str;
        this.f6339n = objArr;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public f7l8 m5269y(String str) {
        this.f52455f7l8 = str;
        return this;
    }
}
