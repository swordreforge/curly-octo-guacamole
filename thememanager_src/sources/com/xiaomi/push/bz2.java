package com.xiaomi.push;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bz2 {
    protected boolean f7l8(jk jkVar, int i2) {
        return jkVar.qrj(i2);
    }

    /* JADX INFO: renamed from: g */
    public void m20669g(byte[] bArr, int i2, int i3) {
        try {
            C5882m c5882mM21221h = C5882m.m21221h(bArr, i2, i3);
            mo20671n(c5882mM21221h);
            c5882mM21221h.eqxt();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo20670k();

    /* JADX INFO: renamed from: n */
    public abstract void mo20671n(C5882m c5882m);

    /* JADX INFO: renamed from: q */
    public bz2 m20672q(byte[] bArr, int i2, int i3) throws qkj8 {
        try {
            jk jkVarF7l8 = jk.f7l8(bArr, i2, i3);
            toq(jkVarF7l8);
            jkVarF7l8.m21057p(0);
            return this;
        } catch (qkj8 e2) {
            throw e2;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract int mo20673s();

    public abstract bz2 toq(jk jkVar);

    /* JADX INFO: renamed from: y */
    public byte[] m20674y() {
        int iMo20673s = mo20673s();
        byte[] bArr = new byte[iMo20673s];
        m20669g(bArr, 0, iMo20673s);
        return bArr;
    }

    public bz2 zy(byte[] bArr) {
        return m20672q(bArr, 0, bArr.length);
    }
}
