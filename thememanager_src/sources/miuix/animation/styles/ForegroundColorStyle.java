package miuix.animation.styles;

import android.graphics.Color;
import android.view.View;
import miuix.animation.C6839R;
import miuix.animation.IAnimTarget;
import miuix.animation.ViewTarget;
import miuix.animation.listener.UpdateInfo;
import miuix.device.C7106k;

/* JADX INFO: loaded from: classes3.dex */
public class ForegroundColorStyle extends PropertyStyle {
    public static final int MIUIX_TOUCH_RECT_LOCATION_MODE_ABSOLUTE = 2;
    public static final int MIUIX_TOUCH_RECT_LOCATION_MODE_CLEAR = 0;
    public static final int MIUIX_TOUCH_RECT_LOCATION_MODE_DEFAULT = 1;
    public static final int MIUIX_TOUCH_RECT_LOCATION_MODE_PADDING = 4;
    public static final int MIUIX_TOUCH_RECT_LOCATION_MODE_RELATIVE = 4104;

    public static void end(IAnimTarget iAnimTarget, UpdateInfo updateInfo) {
        View view = getView(iAnimTarget);
        if (isInvalid(view)) {
            return;
        }
        TintDrawable tintDrawable = TintDrawable.get(view);
        int i2 = (int) updateInfo.animInfo.value;
        if (tintDrawable == null || Color.alpha(i2) != 0) {
            return;
        }
        tintDrawable.restoreOriginalDrawable();
    }

    private static View getView(IAnimTarget iAnimTarget) {
        if (iAnimTarget instanceof ViewTarget) {
            return ((ViewTarget) iAnimTarget).getTargetObject();
        }
        return null;
    }

    private static boolean isInvalid(View view) {
        return view == null;
    }

    public static void start(IAnimTarget iAnimTarget, UpdateInfo updateInfo) {
        View view = getView(iAnimTarget);
        if (isInvalid(view)) {
            return;
        }
        int i2 = updateInfo.animInfo.tintMode;
        TintDrawable andGet = TintDrawable.setAndGet(view);
        Object tag = view.getTag(C6839R.id.miuix_animation_tag_view_hover_corners);
        if ((tag instanceof Float) || (tag instanceof Integer)) {
            andGet.setHoverCorner(((Float) tag).floatValue());
        }
        if (C7106k.m25706p() == 0 && i2 == -1) {
            i2 = 1;
        } else if (i2 == -1) {
            i2 = 0;
        }
        andGet.initTintBuffer(i2 & 3);
    }
}
