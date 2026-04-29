package miuix.view;

import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import miui.util.HapticFeedbackUtil;

/* JADX INFO: loaded from: classes3.dex */
@Keep
class LinearVibrator implements ld6 {
    private static final String TAG = "LinearVibrator";
    private final androidx.collection.n7h<Integer> mIds = new androidx.collection.n7h<>();

    static {
        initialize();
    }

    private LinearVibrator() {
        buildIds();
    }

    private void buildIds() {
        this.mIds.m853k(C7385p.f42280y, 268435456);
        this.mIds.m853k(C7385p.f42278s, 268435457);
        this.mIds.m853k(C7385p.f42276p, 268435458);
        this.mIds.m853k(C7385p.f92245ld6, 268435459);
        this.mIds.m853k(C7385p.f92255x2, 268435460);
        this.mIds.m853k(C7385p.f92251qrj, 268435461);
        this.mIds.m853k(C7385p.f92247n7h, 268435462);
        this.mIds.m853k(C7385p.f92244kja0, 268435463);
        this.mIds.m853k(C7385p.f42272h, 268435464);
        this.mIds.m853k(C7385p.f92232cdj, 268435465);
        int i2 = PlatformConstants.VERSION;
        if (i2 < 2) {
            return;
        }
        this.mIds.m853k(C7385p.f92243ki, 268435466);
        this.mIds.m853k(C7385p.f92252t8r, 268435467);
        this.mIds.m853k(C7385p.f42273i, 268435468);
        if (i2 < 3) {
            return;
        }
        this.mIds.m853k(C7385p.f92237fn3e, 268435469);
        if (i2 < 4) {
            return;
        }
        this.mIds.m853k(C7385p.f92256zurt, 268435470);
        if (i2 < 5) {
            return;
        }
        this.mIds.m853k(C7385p.f92246mcp, 268435471);
        this.mIds.m853k(C7385p.f92241jk, 268435472);
        this.mIds.m853k(C7385p.f92231a9, 268435473);
        this.mIds.m853k(C7385p.f92238fti, 268435474);
        this.mIds.m853k(C7385p.f92242jp0y, 268435475);
        this.mIds.m853k(C7385p.f92240gvn7, 268435476);
        this.mIds.m853k(C7385p.f92234d3, 268435477);
        this.mIds.m853k(C7385p.f92250oc, 268435478);
        this.mIds.m853k(C7385p.f92235eqxt, 268435479);
        this.mIds.m853k(C7385p.f92233d2ok, 268435480);
    }

    private static void initialize() {
        boolean zIsSupportLinearMotorVibrate;
        if (PlatformConstants.VERSION < 1) {
            Log.w(TAG, "MiuiHapticFeedbackConstants not found or not compatible for LinearVibrator.");
            return;
        }
        try {
            zIsSupportLinearMotorVibrate = HapticFeedbackUtil.isSupportLinearMotorVibrate();
        } catch (Throwable th) {
            Log.w(TAG, "MIUI Haptic Implementation is not available", th);
            zIsSupportLinearMotorVibrate = false;
        }
        if (!zIsSupportLinearMotorVibrate) {
            Log.w(TAG, "linear motor is not supported in this platform.");
        } else {
            HapticCompat.registerProvider(new LinearVibrator());
            Log.i(TAG, "setup LinearVibrator success.");
        }
    }

    int obtainFeedBack(int i2) {
        int iCdj = this.mIds.cdj(i2);
        if (iCdj >= 0) {
            return this.mIds.fti(iCdj).intValue();
        }
        return -1;
    }

    @Override // miuix.view.ld6
    public boolean performHapticFeedback(View view, int i2) {
        int iCdj = this.mIds.cdj(i2);
        if (iCdj < 0) {
            Log.w(TAG, String.format("feedback(0x%08x-%s) is not found in current platform(v%d)", Integer.valueOf(i2), C7385p.toq(i2), Integer.valueOf(PlatformConstants.VERSION)));
            return false;
        }
        int iIntValue = this.mIds.fti(iCdj).intValue();
        if (HapticFeedbackUtil.isSupportLinearMotorVibrate(iIntValue)) {
            return view.performHapticFeedback(iIntValue);
        }
        Log.w(TAG, String.format("unsupported feedback: 0x%08x. platform version: %d", Integer.valueOf(iIntValue), Integer.valueOf(PlatformConstants.VERSION)));
        return false;
    }

    public boolean supportLinearMotor(int i2) {
        int iCdj = this.mIds.cdj(i2);
        if (iCdj < 0) {
            Log.w(TAG, String.format("feedback(0x%08x-%s) is not found in current platform(v%d)", Integer.valueOf(i2), C7385p.toq(i2), Integer.valueOf(PlatformConstants.VERSION)));
            return false;
        }
        int iIntValue = this.mIds.fti(iCdj).intValue();
        if (HapticFeedbackUtil.isSupportLinearMotorVibrate(iIntValue)) {
            return HapticFeedbackUtil.isSupportLinearMotorVibrate(iIntValue);
        }
        Log.w(TAG, String.format("unsupported feedback: 0x%08x. platform version: %d", Integer.valueOf(iIntValue), Integer.valueOf(PlatformConstants.VERSION)));
        return false;
    }
}
