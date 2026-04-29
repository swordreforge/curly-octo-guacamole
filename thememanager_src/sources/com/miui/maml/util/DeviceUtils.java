package com.miui.maml.util;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import p001b.InterfaceC1356n;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceUtils {
    private static final float DEFAULT_RESIZE_SCALE_FOLD = 0.5f;
    private static final float DEFAULT_RESIZE_SCALE_PAD = 0.383f;

    private DeviceUtils() {
    }

    private static int getPhysicalScreenSmallWidthDip(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return (int) (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / displayMetrics.density);
    }

    private static float getSpecialPadRatio(String str) {
        if (isSpecital(str)) {
            return 0.766f;
        }
        return DEFAULT_RESIZE_SCALE_PAD;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] getTargetScreenWH(android.view.WindowManager r10, float r11, java.lang.String r12) {
        /*
            if (r10 == 0) goto L61
            r0 = 2
            int[] r0 = new int[r0]
            android.view.Display r1 = r10.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r1.getRealSize(r2)
            int r1 = r1.getRotation()
            r3 = 0
            r4 = 1
            if (r1 == r4) goto L1f
            r5 = 3
            if (r1 != r5) goto L1d
            goto L1f
        L1d:
            r1 = r3
            goto L20
        L1f:
            r1 = r4
        L20:
            r5 = 1065353216(0x3f800000, float:1.0)
            boolean r10 = needScaleDevice(r10)
            if (r10 == 0) goto L4a
            float r10 = java.lang.Math.abs(r11)
            double r6 = (double) r10
            r8 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L4b
            boolean r10 = isPad()
            if (r10 == 0) goto L41
            float r11 = getSpecialPadRatio(r12)
            goto L4b
        L41:
            boolean r10 = isFold()
            if (r10 == 0) goto L4a
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L4b
        L4a:
            r11 = r5
        L4b:
            if (r1 == 0) goto L50
            int r10 = r2.y
            goto L52
        L50:
            int r10 = r2.x
        L52:
            float r10 = (float) r10
            float r10 = r10 * r11
            int r10 = (int) r10
            r0[r3] = r10
            if (r1 == 0) goto L5c
            int r10 = r2.x
            goto L5e
        L5c:
            int r10 = r2.y
        L5e:
            r0[r4] = r10
            return r0
        L61:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "wm is null"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.util.DeviceUtils.getTargetScreenWH(android.view.WindowManager, float, java.lang.String):int[]");
    }

    public static boolean isFold() {
        return SystemProperties.getInt("persist.sys.muiltdisplay_type", 0) == 2;
    }

    public static boolean isPad() {
        return SystemProperties.get("ro.build.characteristics").contains("tablet");
    }

    private static boolean isSpecital(String str) {
        return !TextUtils.isEmpty(str) && (InterfaceC1356n.f53839zy.equals(str) || InterfaceC1356n.f53838toq.equals(str));
    }

    private static boolean needScaleDevice(WindowManager windowManager) {
        return isPad() || (isFold() && getPhysicalScreenSmallWidthDip(windowManager) >= 600);
    }
}
