package androidx.preference;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.preference.fn3e;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.preference.Preference
    public boolean bz2() {
        return !super.ncyb();
    }

    @Override // androidx.preference.Preference
    public boolean ncyb() {
        return false;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(@lvui C1016i c1016i) {
        super.mo4638o(c1016i);
        if (Build.VERSION.SDK_INT >= 28) {
            c1016i.itemView.setAccessibilityHeading(true);
        }
    }

    public PreferenceCategory(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceCategory(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.kja0.m2303k(context, fn3e.C1008k.f51774d3, R.attr.preferenceCategoryStyle));
    }

    public PreferenceCategory(@lvui Context context) {
        this(context, null);
    }
}
