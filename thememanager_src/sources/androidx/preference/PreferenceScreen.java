package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.fn3e;
import androidx.preference.ki;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean tgs;

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet, androidx.core.content.res.kja0.m2303k(context, fn3e.C1008k.f51807x9kr, R.attr.preferenceScreenStyle));
        this.tgs = true;
    }

    public boolean bap7() {
        return this.tgs;
    }

    @Override // androidx.preference.PreferenceGroup
    protected boolean ixz() {
        return false;
    }

    public void lh(boolean z2) {
        if (wx16()) {
            throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
        }
        this.tgs = z2;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: m */
    protected void mo4639m() {
        ki.toq toqVarM4693p;
        if (m4653i() != null || m4652h() != null || uc() == 0 || (toqVarM4693p = gvn7().m4693p()) == null) {
            return;
        }
        toqVarM4693p.onNavigateToScreen(this);
    }
}
