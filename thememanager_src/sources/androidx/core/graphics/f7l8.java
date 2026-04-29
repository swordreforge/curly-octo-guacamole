package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: BlendModeUtils.java */
/* JADX INFO: loaded from: classes.dex */
class f7l8 {

    /* JADX INFO: renamed from: androidx.core.graphics.f7l8$k */
    /* JADX INFO: compiled from: BlendModeUtils.java */
    static /* synthetic */ class C0529k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f3561k;

        static {
            int[] iArr = new int[EnumC0532g.values().length];
            f3561k = iArr;
            try {
                iArr[EnumC0532g.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3561k[EnumC0532g.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3561k[EnumC0532g.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3561k[EnumC0532g.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3561k[EnumC0532g.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3561k[EnumC0532g.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3561k[EnumC0532g.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3561k[EnumC0532g.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3561k[EnumC0532g.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3561k[EnumC0532g.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3561k[EnumC0532g.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3561k[EnumC0532g.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3561k[EnumC0532g.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3561k[EnumC0532g.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3561k[EnumC0532g.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3561k[EnumC0532g.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3561k[EnumC0532g.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3561k[EnumC0532g.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f3561k[EnumC0532g.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f3561k[EnumC0532g.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f3561k[EnumC0532g.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f3561k[EnumC0532g.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f3561k[EnumC0532g.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f3561k[EnumC0532g.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f3561k[EnumC0532g.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f3561k[EnumC0532g.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f3561k[EnumC0532g.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f3561k[EnumC0532g.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f3561k[EnumC0532g.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* JADX INFO: compiled from: BlendModeUtils.java */
    @hyr(29)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        @dd
        /* JADX INFO: renamed from: k */
        static Object m2460k(@lvui EnumC0532g enumC0532g) {
            switch (C0529k.f3561k[enumC0532g.ordinal()]) {
                case 1:
                    return BlendMode.CLEAR;
                case 2:
                    return BlendMode.SRC;
                case 3:
                    return BlendMode.DST;
                case 4:
                    return BlendMode.SRC_OVER;
                case 5:
                    return BlendMode.DST_OVER;
                case 6:
                    return BlendMode.SRC_IN;
                case 7:
                    return BlendMode.DST_IN;
                case 8:
                    return BlendMode.SRC_OUT;
                case 9:
                    return BlendMode.DST_OUT;
                case 10:
                    return BlendMode.SRC_ATOP;
                case 11:
                    return BlendMode.DST_ATOP;
                case 12:
                    return BlendMode.XOR;
                case 13:
                    return BlendMode.PLUS;
                case 14:
                    return BlendMode.MODULATE;
                case 15:
                    return BlendMode.SCREEN;
                case 16:
                    return BlendMode.OVERLAY;
                case 17:
                    return BlendMode.DARKEN;
                case 18:
                    return BlendMode.LIGHTEN;
                case 19:
                    return BlendMode.COLOR_DODGE;
                case 20:
                    return BlendMode.COLOR_BURN;
                case 21:
                    return BlendMode.HARD_LIGHT;
                case 22:
                    return BlendMode.SOFT_LIGHT;
                case 23:
                    return BlendMode.DIFFERENCE;
                case 24:
                    return BlendMode.EXCLUSION;
                case 25:
                    return BlendMode.MULTIPLY;
                case 26:
                    return BlendMode.HUE;
                case 27:
                    return BlendMode.SATURATION;
                case 28:
                    return BlendMode.COLOR;
                case 29:
                    return BlendMode.LUMINOSITY;
                default:
                    return null;
            }
        }
    }

    private f7l8() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    static PorterDuff.Mode m2459k(@dd EnumC0532g enumC0532g) {
        if (enumC0532g == null) {
            return null;
        }
        switch (C0529k.f3561k[enumC0532g.ordinal()]) {
        }
        return null;
    }
}
