package androidx.constraintlayout.core.parser;

/* JADX INFO: renamed from: androidx.constraintlayout.core.parser.s */
/* JADX INFO: compiled from: CLString.java */
/* JADX INFO: loaded from: classes.dex */
public class C0304s extends zy {
    public C0304s(char[] cArr) {
        super(cArr);
    }

    public static zy fn3e(char[] cArr) {
        return new C0304s(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.zy
    /* JADX INFO: renamed from: i */
    protected String mo1134i() {
        return "'" + toq() + "'";
    }

    @Override // androidx.constraintlayout.core.parser.zy
    protected String t8r(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        m1146k(sb, i2);
        sb.append("'");
        sb.append(toq());
        sb.append("'");
        return sb.toString();
    }
}
