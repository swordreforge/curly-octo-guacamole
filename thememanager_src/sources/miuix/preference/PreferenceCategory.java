package miuix.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import miuix.preference.kja0;

/* JADX INFO: loaded from: classes2.dex */
public class PreferenceCategory extends androidx.preference.PreferenceCategory {
    private final boolean tgs;

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.kja0.m2303k(context, kja0.C7297q.l8l, R.attr.preferenceCategoryStyle));
    }

    public boolean bap7() {
        return this.tgs;
    }

    public boolean lh() {
        return !TextUtils.isEmpty(lvui());
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kja0.ki.u9o, i2, i3);
        this.tgs = typedArrayObtainStyledAttributes.getBoolean(kja0.ki.xky, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
