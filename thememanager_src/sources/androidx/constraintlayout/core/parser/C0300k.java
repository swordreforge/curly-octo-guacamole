package androidx.constraintlayout.core.parser;

/* JADX INFO: renamed from: androidx.constraintlayout.core.parser.k */
/* JADX INFO: compiled from: CLArray.java */
/* JADX INFO: loaded from: classes.dex */
public class C0300k extends toq {
    public C0300k(char[] cArr) {
        super(cArr);
    }

    public static zy zurt(char[] cArr) {
        return new C0300k(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.zy
    /* JADX INFO: renamed from: i */
    protected String mo1134i() {
        StringBuilder sb = new StringBuilder(m1147n() + "[");
        boolean z2 = true;
        for (int i2 = 0; i2 < this.f1840h.size(); i2++) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.f1840h.get(i2).mo1134i());
        }
        return ((Object) sb) + "]";
    }

    @Override // androidx.constraintlayout.core.parser.zy
    protected String t8r(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        String strMo1134i = mo1134i();
        if (i3 > 0 || strMo1134i.length() + i2 >= zy.f1842s) {
            sb.append("[\n");
            boolean z2 = true;
            for (zy zyVar : this.f1840h) {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append(",\n");
                }
                m1146k(sb, zy.f1841p + i2);
                sb.append(zyVar.t8r(zy.f1841p + i2, i3 - 1));
            }
            sb.append("\n");
            m1146k(sb, i2);
            sb.append("]");
        } else {
            sb.append(strMo1134i);
        }
        return sb.toString();
    }
}
