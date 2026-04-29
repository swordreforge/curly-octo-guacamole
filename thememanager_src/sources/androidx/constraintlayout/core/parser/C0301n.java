package androidx.constraintlayout.core.parser;

/* JADX INFO: renamed from: androidx.constraintlayout.core.parser.n */
/* JADX INFO: compiled from: CLNumber.java */
/* JADX INFO: loaded from: classes.dex */
public class C0301n extends zy {

    /* JADX INFO: renamed from: h */
    float f1831h;

    public C0301n(char[] cArr) {
        super(cArr);
        this.f1831h = Float.NaN;
    }

    public static zy fn3e(char[] cArr) {
        return new C0301n(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.zy
    public float f7l8() {
        if (Float.isNaN(this.f1831h)) {
            this.f1831h = Float.parseFloat(toq());
        }
        return this.f1831h;
    }

    @Override // androidx.constraintlayout.core.parser.zy
    /* JADX INFO: renamed from: i */
    protected String mo1134i() {
        float fF7l8 = f7l8();
        int i2 = (int) fF7l8;
        if (i2 == fF7l8) {
            return "" + i2;
        }
        return "" + fF7l8;
    }

    public void ni7(float f2) {
        this.f1831h = f2;
    }

    @Override // androidx.constraintlayout.core.parser.zy
    protected String t8r(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        m1146k(sb, i2);
        float fF7l8 = f7l8();
        int i4 = (int) fF7l8;
        if (i4 == fF7l8) {
            sb.append(i4);
        } else {
            sb.append(fF7l8);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.zy
    /* JADX INFO: renamed from: y */
    public int mo1135y() {
        if (Float.isNaN(this.f1831h)) {
            this.f1831h = Integer.parseInt(toq());
        }
        return (int) this.f1831h;
    }

    public boolean zurt() {
        float fF7l8 = f7l8();
        return ((float) ((int) fF7l8)) == fF7l8;
    }

    public C0301n(float f2) {
        super(null);
        this.f1831h = f2;
    }
}
