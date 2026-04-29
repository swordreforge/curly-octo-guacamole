package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.core.motion.utils.zurt;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.constraintlayout.core.parser.q */
/* JADX INFO: compiled from: CLKey.java */
/* JADX INFO: loaded from: classes.dex */
public class C0303q extends toq {

    /* JADX INFO: renamed from: i */
    private static ArrayList<String> f1839i;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f1839i = arrayList;
        arrayList.add("ConstraintSets");
        f1839i.add("Variables");
        f1839i.add("Generate");
        f1839i.add(zurt.InterfaceC0294y.f1765k);
        f1839i.add("KeyFrames");
        f1839i.add(zurt.InterfaceC0290k.f1721k);
        f1839i.add("KeyPositions");
        f1839i.add("KeyCycles");
    }

    public C0303q(char[] cArr) {
        super(cArr);
    }

    public static zy lrht(String str, zy zyVar) {
        C0303q c0303q = new C0303q(str.toCharArray());
        c0303q.ki(0L);
        c0303q.m1145h(str.length() - 1);
        c0303q.m1137e(zyVar);
        return c0303q;
    }

    public static zy zurt(char[] cArr) {
        return new C0303q(cArr);
    }

    /* JADX INFO: renamed from: e */
    public void m1137e(zy zyVar) {
        if (this.f1840h.size() > 0) {
            this.f1840h.set(0, zyVar);
        } else {
            this.f1840h.add(zyVar);
        }
    }

    @Override // androidx.constraintlayout.core.parser.zy
    /* JADX INFO: renamed from: i */
    protected String mo1134i() {
        if (this.f1840h.size() <= 0) {
            return m1147n() + toq() + ": <> ";
        }
        return m1147n() + toq() + ": " + this.f1840h.get(0).mo1134i();
    }

    @Override // androidx.constraintlayout.core.parser.zy
    protected String t8r(int i2, int i3) {
        StringBuilder sb = new StringBuilder(m1147n());
        m1146k(sb, i2);
        String qVar = toq();
        if (this.f1840h.size() <= 0) {
            return qVar + ": <> ";
        }
        sb.append(qVar);
        sb.append(": ");
        if (f1839i.contains(qVar)) {
            i3 = 3;
        }
        if (i3 > 0) {
            sb.append(this.f1840h.get(0).t8r(i2, i3 - 1));
        } else {
            String strMo1134i = this.f1840h.get(0).mo1134i();
            if (strMo1134i.length() + i2 < zy.f1842s) {
                sb.append(strMo1134i);
            } else {
                sb.append(this.f1840h.get(0).t8r(i2, i3 - 1));
            }
        }
        return sb.toString();
    }

    public String uv6() {
        return toq();
    }

    public zy vyq() {
        if (this.f1840h.size() > 0) {
            return this.f1840h.get(0);
        }
        return null;
    }
}
