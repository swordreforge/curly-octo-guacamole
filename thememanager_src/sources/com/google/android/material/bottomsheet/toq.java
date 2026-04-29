package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0103s;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: BottomSheetDialogFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends C0103s {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f67440ab;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BottomSheetDialogFragment.java */
    private class C7972toq extends BottomSheetBehavior.AbstractC3952g {
        private C7972toq() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3952g
        public void toq(@lvui View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3952g
        public void zy(@lvui View view, int i2) {
            if (i2 == 5) {
                toq.this.zff0();
            }
        }
    }

    private void el(@lvui BottomSheetBehavior<?> bottomSheetBehavior, boolean z2) {
        this.f67440ab = z2;
        if (bottomSheetBehavior.bo() == 5) {
            zff0();
            return;
        }
        if (u38j() instanceof DialogC3959k) {
            ((DialogC3959k) u38j()).n7h();
        }
        bottomSheetBehavior.vyq(new C7972toq());
        bottomSheetBehavior.sok(5);
    }

    private boolean wt(boolean z2) {
        Dialog dialogU38j = u38j();
        if (!(dialogU38j instanceof DialogC3959k)) {
            return false;
        }
        DialogC3959k dialogC3959k = (DialogC3959k) dialogU38j;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorLd6 = dialogC3959k.ld6();
        if (!bottomSheetBehaviorLd6.m14151v() || !dialogC3959k.x2()) {
            return false;
        }
        el(bottomSheetBehaviorLd6, z2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zff0() {
        if (this.f67440ab) {
            super.mo4377w();
        } else {
            super.kx3();
        }
    }

    @Override // androidx.fragment.app.zy
    public void kx3() {
        if (wt(false)) {
            return;
        }
        super.kx3();
    }

    @Override // androidx.appcompat.app.C0103s, androidx.fragment.app.zy
    @lvui
    public Dialog nnh(@dd Bundle bundle) {
        return new DialogC3959k(getContext(), v5yj());
    }

    @Override // androidx.fragment.app.zy
    /* JADX INFO: renamed from: w */
    public void mo4377w() {
        if (wt(true)) {
            return;
        }
        super.mo4377w();
    }
}
