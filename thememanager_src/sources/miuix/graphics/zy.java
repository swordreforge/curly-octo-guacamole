package miuix.graphics;

import android.graphics.PorterDuff;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: MiuiBlendMode.java */
/* JADX INFO: loaded from: classes3.dex */
public enum zy {
    CLEAR(0),
    SRC(1),
    DST(2),
    SRC_OVER(3),
    DST_OVER(4),
    SRC_IN(5),
    DST_IN(6),
    SRC_OUT(7),
    DST_OUT(8),
    SRC_ATOP(9),
    DST_ATOP(10),
    XOR(11),
    PLUS(12),
    MODULATE(13),
    SCREEN(14),
    OVERLAY(15),
    DARKEN(16),
    LIGHTEN(17),
    COLOR_DODGE(18),
    COLOR_BURN(19),
    HARD_LIGHT(20),
    SOFT_LIGHT(21),
    DIFFERENCE(22),
    EXCLUSION(23),
    MULTIPLY(24),
    HUE(25),
    SATURATION(26),
    COLOR(27),
    LUMINOSITY(28),
    LAST_COEFF(29),
    LAST_SEPARABLE(30),
    LAST(31);


    /* JADX INFO: renamed from: k */
    private static final zy[] f40148k = values();

    @lvui
    private final int mPorterDuffMode;

    /* JADX INFO: renamed from: miuix.graphics.zy$k */
    /* JADX INFO: compiled from: MiuiBlendMode.java */
    static /* synthetic */ class C7115k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f40150k;

        static {
            int[] iArr = new int[zy.values().length];
            f40150k = iArr;
            try {
                iArr[zy.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40150k[zy.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40150k[zy.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40150k[zy.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40150k[zy.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40150k[zy.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40150k[zy.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40150k[zy.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40150k[zy.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40150k[zy.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40150k[zy.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40150k[zy.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40150k[zy.DARKEN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40150k[zy.LIGHTEN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f40150k[zy.MODULATE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f40150k[zy.SCREEN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f40150k[zy.PLUS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f40150k[zy.OVERLAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    zy(int i2) {
        this.mPorterDuffMode = i2;
    }

    @dd
    public static PorterDuff.Mode blendModeToPorterDuffMode(@dd zy zyVar) {
        if (zyVar == null) {
            return null;
        }
        switch (C7115k.f40150k[zyVar.ordinal()]) {
            case 1:
                return PorterDuff.Mode.CLEAR;
            case 2:
                return PorterDuff.Mode.SRC;
            case 3:
                return PorterDuff.Mode.DST;
            case 4:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.DST_OVER;
            case 6:
                return PorterDuff.Mode.SRC_IN;
            case 7:
                return PorterDuff.Mode.DST_IN;
            case 8:
                return PorterDuff.Mode.SRC_OUT;
            case 9:
                return PorterDuff.Mode.DST_OUT;
            case 10:
                return PorterDuff.Mode.SRC_ATOP;
            case 11:
                return PorterDuff.Mode.DST_ATOP;
            case 12:
                return PorterDuff.Mode.XOR;
            case 13:
                return PorterDuff.Mode.DARKEN;
            case 14:
                return PorterDuff.Mode.LIGHTEN;
            case 15:
                return PorterDuff.Mode.MULTIPLY;
            case 16:
                return PorterDuff.Mode.SCREEN;
            case 17:
                return PorterDuff.Mode.ADD;
            case 18:
                return PorterDuff.Mode.OVERLAY;
            default:
                return null;
        }
    }

    @dd
    public static zy fromValue(int i2) {
        for (zy zyVar : f40148k) {
            if (zyVar.mPorterDuffMode == i2) {
                return zyVar;
            }
        }
        return null;
    }

    public static int toValue(zy zyVar) {
        return zyVar.mPorterDuffMode;
    }
}
