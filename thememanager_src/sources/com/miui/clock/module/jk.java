package com.miui.clock.module;

/* JADX INFO: compiled from: RotateFontStyle.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jk extends AbstractC5071k {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected int[][][] f71908ld6;

    /* JADX INFO: renamed from: p */
    protected int[][][] f29172p;

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: s */
    public int[] mo17708s(int i2, float f2) {
        int[][] iArr;
        if (f2 >= 0.0f) {
            int[][][] iArr2 = this.f29172p;
            if (iArr2 != null && iArr2.length >= i2) {
                iArr = iArr2[i2];
            }
            return null;
        }
        int[][][] iArr3 = this.f71908ld6;
        if (iArr3 == null || iArr3.length < i2) {
            return null;
        }
        iArr = iArr3[i2];
        if (iArr == null) {
            return null;
        }
        int iAbs = Math.abs((int) f2);
        float fAbs = Math.abs(f2) - iAbs;
        if (fAbs == 0.0f) {
            if (iArr.length > iAbs) {
                return iArr[iAbs];
            }
            return null;
        }
        int i3 = iAbs + 1;
        if (iArr.length > i3 && iArr[0].length >= 2) {
            int[] iArr4 = iArr[i3];
            int i4 = iArr4[0];
            int[] iArr5 = iArr[iAbs];
            int i5 = iArr5[0];
            int i6 = iArr4[1];
            return new int[]{(int) (((i4 - i5) * fAbs) + i5), (int) ((fAbs * (i6 - r7)) + iArr5[1])};
        }
        return null;
    }
}
