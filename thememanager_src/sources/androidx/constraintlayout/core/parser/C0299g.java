package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.parser.g */
/* JADX INFO: compiled from: CLObject.java */
/* JADX INFO: loaded from: classes.dex */
public class C0299g extends toq implements Iterable<C0303q> {

    /* JADX INFO: renamed from: androidx.constraintlayout.core.parser.g$k */
    /* JADX INFO: compiled from: CLObject.java */
    private class k implements Iterator {

        /* JADX INFO: renamed from: k */
        C0299g f1828k;

        /* JADX INFO: renamed from: q */
        int f1830q = 0;

        public k(C0299g c0299g) {
            this.f1828k = c0299g;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1830q < this.f1828k.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            C0303q c0303q = (C0303q) this.f1828k.f1840h.get(this.f1830q);
            this.f1830q++;
            return c0303q;
        }
    }

    public C0299g(char[] cArr) {
        super(cArr);
    }

    public static C0299g lrht(char[] cArr) {
        return new C0299g(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.zy
    /* JADX INFO: renamed from: i */
    public String mo1134i() {
        StringBuilder sb = new StringBuilder(m1147n() + "{ ");
        boolean z2 = true;
        for (zy zyVar : this.f1840h) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(zyVar.mo1134i());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public Iterator<C0303q> iterator() {
        return new k(this);
    }

    @Override // androidx.constraintlayout.core.parser.zy
    public String t8r(int i2, int i3) {
        StringBuilder sb = new StringBuilder(m1147n());
        sb.append("{\n");
        boolean z2 = true;
        for (zy zyVar : this.f1840h) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(",\n");
            }
            sb.append(zyVar.t8r(zy.f1841p + i2, i3 - 1));
        }
        sb.append("\n");
        m1146k(sb, i2);
        sb.append("}");
        return sb.toString();
    }

    public String uv6() {
        return t8r(0, 0);
    }
}
