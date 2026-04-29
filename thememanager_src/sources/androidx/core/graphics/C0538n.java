package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.core.graphics.f7l8;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.graphics.n */
/* JADX INFO: compiled from: BlendModeColorFilterCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C0538n {

    /* JADX INFO: renamed from: androidx.core.graphics.n$k */
    /* JADX INFO: compiled from: BlendModeColorFilterCompat.java */
    @hyr(29)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ColorFilter m2511k(final int i2, Object obj) {
            final BlendMode blendMode = (BlendMode) obj;
            return new ColorFilter(i2, blendMode) { // from class: android.graphics.BlendModeColorFilter
                static {
                    throw new NoClassDefFoundError();
                }
            };
        }
    }

    private C0538n() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static ColorFilter m2510k(int i2, @lvui EnumC0532g enumC0532g) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objM2460k = f7l8.toq.m2460k(enumC0532g);
            if (objM2460k != null) {
                return k.m2511k(i2, objM2460k);
            }
            return null;
        }
        PorterDuff.Mode modeM2459k = f7l8.m2459k(enumC0532g);
        if (modeM2459k != null) {
            return new PorterDuffColorFilter(i2, modeM2459k);
        }
        return null;
    }
}
