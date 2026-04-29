package com.android.thememanager.basemodule.utils;

import java.util.Arrays;
import miui.os.Build;

/* JADX INFO: compiled from: FunctionConfig.java */
/* JADX INFO: loaded from: classes.dex */
public class qrj {

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.qrj$k */
    /* JADX INFO: compiled from: FunctionConfig.java */
    static /* synthetic */ class C1823k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f10400k;

        static {
            int[] iArr = new int[toq.values().length];
            f10400k = iArr;
            try {
                iArr[toq.VIDEO_WALLPAPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10400k[toq.THEME_DETAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10400k[toq.LAB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10400k[toq.PERSONALIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10400k[toq.VIDEO_AD_AUTO_PLAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10400k[toq.NEW_LOCK_STYLE_SHADER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: FunctionConfig.java */
    public enum toq {
        VIDEO_WALLPAPER,
        THEME_DETAIL,
        LAB,
        PERSONALIZE,
        VIDEO_AD_AUTO_PLAY,
        NEW_LOCK_STYLE_SHADER
    }

    private static boolean f7l8() {
        return (C1807g.eqxt() || C1807g.oc().booleanValue() || Arrays.asList("dizi", "ruan").contains(Build.DEVICE)) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m7196g() {
        return (C1807g.eqxt() || C1807g.oc().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m7197k() {
        return C1807g.ni7() && C1807g.m7085z() && !C1807g.lvui();
    }

    /* JADX INFO: renamed from: n */
    private static boolean m7198n() {
        return (C1807g.jp0y() || C1807g.eqxt() || C1807g.oc().booleanValue() || o1t.fn3e()) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m7199q(toq fun) {
        switch (C1823k.f10400k[fun.ordinal()]) {
            case 1:
                return m7200y();
            case 2:
                return f7l8();
            case 3:
                return m7198n();
            case 4:
                return m7196g();
            case 5:
                return toq();
            case 6:
                return m7197k();
            default:
                return true;
        }
    }

    private static boolean toq() {
        return (C1807g.fti() || C1807g.d3() || C1807g.oc().booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m7200y() {
        return (C1807g.jp0y() || C1807g.eqxt() || C1807g.oc().booleanValue()) ? false : true;
    }

    public static boolean zy(toq fun) {
        return !m7199q(fun);
    }
}
