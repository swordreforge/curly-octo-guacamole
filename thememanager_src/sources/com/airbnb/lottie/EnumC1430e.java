package com.airbnb.lottie;

/* JADX INFO: renamed from: com.airbnb.lottie.e */
/* JADX INFO: compiled from: RenderMode.java */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1430e {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: com.airbnb.lottie.e$k */
    /* JADX INFO: compiled from: RenderMode.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f7932k;

        static {
            int[] iArr = new int[EnumC1430e.values().length];
            f7932k = iArr;
            try {
                iArr[EnumC1430e.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7932k[EnumC1430e.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7932k[EnumC1430e.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i2, boolean z2, int i3) {
        int i4 = k.f7932k[ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 != 2) {
            return (z2 && i2 < 28) || i3 > 4 || i2 <= 25;
        }
        return true;
    }
}
