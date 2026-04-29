package miuix.internal.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: renamed from: miuix.internal.graphics.drawable.n */
/* JADX INFO: compiled from: StateListDrawableReflect.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7159n {
    private C7159n() {
    }

    /* JADX INFO: renamed from: k */
    public static int m25932k(StateListDrawable stateListDrawable) {
        return stateListDrawable.getStateCount();
    }

    public static Drawable toq(StateListDrawable stateListDrawable, int i2) {
        return stateListDrawable.getStateDrawable(i2);
    }

    public static int[] zy(StateListDrawable stateListDrawable, int i2) {
        return stateListDrawable.getStateSet(i2);
    }
}
