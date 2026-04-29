package com.google.gson.internal.bind;

import com.google.gson.C4923s;
import com.google.gson.ki;
import com.google.gson.kja0;
import com.google.gson.stream.C4924k;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.eqxt;

/* JADX INFO: renamed from: com.google.gson.internal.bind.n */
/* JADX INFO: compiled from: JsonTreeReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4878n extends C4924k {
    private static final Reader bs = new k();
    private static final Object k0 = new Object();
    private int[] aj;
    private Object[] am;
    private int ay;
    private String[] be;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$k */
    /* JADX INFO: compiled from: JsonTreeReader.java */
    class k extends Reader {
        k() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) throws IOException {
            throw new AssertionError();
        }
    }

    public C4878n(com.google.gson.x2 x2Var) {
        super(bs);
        this.am = new Object[32];
        this.ay = 0;
        this.be = new String[32];
        this.aj = new int[32];
        a5id(x2Var);
    }

    private void a5id(Object obj) {
        int i2 = this.ay;
        Object[] objArr = this.am;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.am = Arrays.copyOf(objArr, i3);
            this.aj = Arrays.copyOf(this.aj, i3);
            this.be = (String[]) Arrays.copyOf(this.be, i3);
        }
        Object[] objArr2 = this.am;
        int i4 = this.ay;
        this.ay = i4 + 1;
        objArr2[i4] = obj;
    }

    private Object dxef() {
        Object[] objArr = this.am;
        int i2 = this.ay - 1;
        this.ay = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    private Object e5() {
        return this.am[this.ay - 1];
    }

    private void ga(com.google.gson.stream.zy zyVar) throws IOException {
        if (g1() == zyVar) {
            return;
        }
        throw new IllegalStateException("Expected " + zyVar + " but was " + g1() + m17114t());
    }

    /* JADX INFO: renamed from: t */
    private String m17114t() {
        return " at path " + getPath();
    }

    @Override // com.google.gson.stream.C4924k
    public void a98o() throws IOException {
        ga(com.google.gson.stream.zy.NULL);
        dxef();
        int i2 = this.ay;
        if (i2 > 0) {
            int[] iArr = this.aj;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.C4924k, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.am = new Object[]{k0};
        this.ay = 1;
    }

    @Override // com.google.gson.stream.C4924k
    public boolean d2ok() throws IOException {
        ga(com.google.gson.stream.zy.BOOLEAN);
        boolean zMo17215n = ((ki) dxef()).mo17215n();
        int i2 = this.ay;
        if (i2 > 0) {
            int[] iArr = this.aj;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zMo17215n;
    }

    @Override // com.google.gson.stream.C4924k
    /* JADX INFO: renamed from: f */
    public int mo17115f() throws IOException {
        com.google.gson.stream.zy zyVarG1 = g1();
        com.google.gson.stream.zy zyVar = com.google.gson.stream.zy.NUMBER;
        if (zyVarG1 != zyVar && zyVarG1 != com.google.gson.stream.zy.STRING) {
            throw new IllegalStateException("Expected " + zyVar + " but was " + zyVarG1 + m17114t());
        }
        int iMo17216p = ((ki) e5()).mo17216p();
        dxef();
        int i2 = this.ay;
        if (i2 > 0) {
            int[] iArr = this.aj;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iMo17216p;
    }

    @Override // com.google.gson.stream.C4924k
    public com.google.gson.stream.zy g1() throws IOException {
        if (this.ay == 0) {
            return com.google.gson.stream.zy.END_DOCUMENT;
        }
        Object objE5 = e5();
        if (objE5 instanceof Iterator) {
            boolean z2 = this.am[this.ay - 2] instanceof kja0;
            Iterator it = (Iterator) objE5;
            if (!it.hasNext()) {
                return z2 ? com.google.gson.stream.zy.END_OBJECT : com.google.gson.stream.zy.END_ARRAY;
            }
            if (z2) {
                return com.google.gson.stream.zy.NAME;
            }
            a5id(it.next());
            return g1();
        }
        if (objE5 instanceof kja0) {
            return com.google.gson.stream.zy.BEGIN_OBJECT;
        }
        if (objE5 instanceof C4923s) {
            return com.google.gson.stream.zy.BEGIN_ARRAY;
        }
        if (!(objE5 instanceof ki)) {
            if (objE5 instanceof com.google.gson.n7h) {
                return com.google.gson.stream.zy.NULL;
            }
            if (objE5 == k0) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        ki kiVar = (ki) objE5;
        if (kiVar.wvg()) {
            return com.google.gson.stream.zy.STRING;
        }
        if (kiVar.fu4()) {
            return com.google.gson.stream.zy.BOOLEAN;
        }
        if (kiVar.o1t()) {
            return com.google.gson.stream.zy.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.stream.C4924k
    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(eqxt.f81918zy);
        int i2 = 0;
        while (i2 < this.ay) {
            Object[] objArr = this.am;
            Object obj = objArr[i2];
            if (obj instanceof C4923s) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.aj[i2]);
                    sb.append(']');
                }
            } else if (obj instanceof kja0) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String str = this.be[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // com.google.gson.stream.C4924k
    public void h4b() throws IOException {
        if (g1() == com.google.gson.stream.zy.NAME) {
            y9n();
            this.be[this.ay - 2] = "null";
        } else {
            dxef();
            int i2 = this.ay;
            if (i2 > 0) {
                this.be[i2 - 1] = "null";
            }
        }
        int i3 = this.ay;
        if (i3 > 0) {
            int[] iArr = this.aj;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // com.google.gson.stream.C4924k
    public double hyr() throws IOException {
        com.google.gson.stream.zy zyVarG1 = g1();
        com.google.gson.stream.zy zyVar = com.google.gson.stream.zy.NUMBER;
        if (zyVarG1 != zyVar && zyVarG1 != com.google.gson.stream.zy.STRING) {
            throw new IllegalStateException("Expected " + zyVar + " but was " + zyVarG1 + m17114t());
        }
        double dMo17218y = ((ki) e5()).mo17218y();
        if (!fu4() && (Double.isNaN(dMo17218y) || Double.isInfinite(dMo17218y))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dMo17218y);
        }
        dxef();
        int i2 = this.ay;
        if (i2 > 0) {
            int[] iArr = this.aj;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dMo17218y;
    }

    @Override // com.google.gson.stream.C4924k
    /* JADX INFO: renamed from: k */
    public void mo17116k() throws IOException {
        ga(com.google.gson.stream.zy.BEGIN_ARRAY);
        a5id(((C4923s) e5()).iterator());
        this.aj[this.ay - 1] = 0;
    }

    @Override // com.google.gson.stream.C4924k
    public boolean ki() throws IOException {
        com.google.gson.stream.zy zyVarG1 = g1();
        return (zyVarG1 == com.google.gson.stream.zy.END_OBJECT || zyVarG1 == com.google.gson.stream.zy.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.C4924k
    public void ld6() throws IOException {
        ga(com.google.gson.stream.zy.END_ARRAY);
        dxef();
        dxef();
        int i2 = this.ay;
        if (i2 > 0) {
            int[] iArr = this.aj;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.C4924k
    public String nmn5() throws IOException {
        com.google.gson.stream.zy zyVarG1 = g1();
        com.google.gson.stream.zy zyVar = com.google.gson.stream.zy.STRING;
        if (zyVarG1 == zyVar || zyVarG1 == com.google.gson.stream.zy.NUMBER) {
            String strKi = ((ki) dxef()).ki();
            int i2 = this.ay;
            if (i2 > 0) {
                int[] iArr = this.aj;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return strKi;
        }
        throw new IllegalStateException("Expected " + zyVar + " but was " + zyVarG1 + m17114t());
    }

    @Override // com.google.gson.stream.C4924k
    public String toString() {
        return C4878n.class.getSimpleName();
    }

    public void vy() throws IOException {
        ga(com.google.gson.stream.zy.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) e5()).next();
        a5id(entry.getValue());
        a5id(new ki((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.C4924k
    public void x2() throws IOException {
        ga(com.google.gson.stream.zy.END_OBJECT);
        dxef();
        dxef();
        int i2 = this.ay;
        if (i2 > 0) {
            int[] iArr = this.aj;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.C4924k
    public String y9n() throws IOException {
        ga(com.google.gson.stream.zy.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) e5()).next();
        String str = (String) entry.getKey();
        this.be[this.ay - 1] = str;
        a5id(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.C4924k
    public long yz() throws IOException {
        com.google.gson.stream.zy zyVarG1 = g1();
        com.google.gson.stream.zy zyVar = com.google.gson.stream.zy.NUMBER;
        if (zyVarG1 != zyVar && zyVarG1 != com.google.gson.stream.zy.STRING) {
            throw new IllegalStateException("Expected " + zyVar + " but was " + zyVarG1 + m17114t());
        }
        long jKja0 = ((ki) e5()).kja0();
        dxef();
        int i2 = this.ay;
        if (i2 > 0) {
            int[] iArr = this.aj;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return jKja0;
    }

    @Override // com.google.gson.stream.C4924k
    public void zy() throws IOException {
        ga(com.google.gson.stream.zy.BEGIN_OBJECT);
        a5id(((kja0) e5()).entrySet().iterator());
    }
}
