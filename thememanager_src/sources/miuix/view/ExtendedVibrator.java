package miuix.view;

import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes3.dex */
@Keep
class ExtendedVibrator implements ld6 {
    private static final String TAG = "ExtendedVibrator";

    static {
        initialize();
    }

    private ExtendedVibrator() {
    }

    private static void initialize() {
        if (PlatformConstants.VERSION < 0) {
            Log.w(TAG, "MiuiHapticFeedbackConstants not found.");
        } else {
            HapticCompat.registerProvider(new ExtendedVibrator());
            Log.i(TAG, "setup ExtendedVibrator success.");
        }
    }

    @Override // miuix.view.ld6
    public boolean performHapticFeedback(View view, int i2) {
        if (i2 == C7385p.f92236f7l8) {
            return view.performHapticFeedback(2);
        }
        return false;
    }
}
