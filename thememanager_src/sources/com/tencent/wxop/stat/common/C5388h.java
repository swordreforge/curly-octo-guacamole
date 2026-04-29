package com.tencent.wxop.stat.common;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.h */
/* JADX INFO: loaded from: classes3.dex */
public class C5388h {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ boolean f30129a = true;

    private C5388h() {
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m18398a(byte[] bArr, int i2) {
        return m18399a(bArr, 0, bArr.length, i2);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m18399a(byte[] bArr, int i2, int i3, int i4) {
        C5390j c5390j = new C5390j(i4, new byte[(i3 * 3) / 4]);
        if (!c5390j.m18402a(bArr, i2, i3, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i5 = c5390j.f30131b;
        byte[] bArr2 = c5390j.f30130a;
        if (i5 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i5];
        System.arraycopy(bArr2, 0, bArr3, 0, i5);
        return bArr3;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m18400b(byte[] bArr, int i2) {
        return m18401b(bArr, 0, bArr.length, i2);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m18401b(byte[] bArr, int i2, int i3, int i4) {
        C5391k c5391k = new C5391k(i4, null);
        int i5 = (i3 / 3) * 4;
        if (!c5391k.f30141d) {
            int i6 = i3 % 3;
            if (i6 == 1) {
                i5 += 2;
            } else if (i6 == 2) {
                i5 += 3;
            }
        } else if (i3 % 3 > 0) {
            i5 += 4;
        }
        if (c5391k.f30142e && i3 > 0) {
            i5 += (((i3 - 1) / 57) + 1) * (c5391k.f30143f ? 2 : 1);
        }
        c5391k.f30130a = new byte[i5];
        c5391k.m18403a(bArr, i2, i3, true);
        if (f30129a || c5391k.f30131b == i5) {
            return c5391k.f30130a;
        }
        throw new AssertionError();
    }
}
