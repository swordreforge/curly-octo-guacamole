package com.android.thememanager.module.detail.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.android.thememanager.R;
import miuix.appcompat.app.ki;

/* JADX INFO: compiled from: ApplyMixDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class fu4 extends androidx.fragment.app.zy implements CompoundButton.OnCheckedChangeListener {
    private static final String aj = "has_lockscreen";
    private static final String ar = "has_icon";
    private static final String bc = "hasSuperWallpaper";
    private static final String be = "has_aod";
    private static final String bs = "has_launcher";
    private static final String k0 = "has_global";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private CheckBox f60558ab;
    private boolean ac;
    private boolean ad;
    private boolean am;
    private CheckBox an;
    private CheckBox as;
    private boolean ax;
    private boolean ay;
    private CheckBox az;
    private TextView ba;
    private TextView bb;
    private TextView bg;
    private TextView bl;
    private CheckBox bp;
    private boolean bq;
    private TextView bv;
    private TextView id;
    private CheckBox in;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.fu4$k */
    /* JADX INFO: compiled from: ApplyMixDialog.java */
    public interface InterfaceC2263k {
        void vep5(int mixFlag);
    }

    private void el(ViewGroup item) {
        item.setEnabled(false);
        for (int i2 = 0; i2 < item.getChildCount(); i2++) {
            View childAt = item.getChildAt(i2);
            if (childAt instanceof ViewGroup) {
                el((ViewGroup) childAt);
            } else {
                childAt.setEnabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0ad(DialogInterface dialogInterface, int i2) {
        androidx.lifecycle.n7h parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC2263k) {
            InterfaceC2263k interfaceC2263k = (InterfaceC2263k) parentFragment;
            if (!this.ay) {
                i = this.f60558ab.isChecked() ? 16 : 0;
                if (this.bp.isChecked()) {
                    i |= 2;
                }
                if (this.an.isChecked()) {
                    i |= 1;
                }
            } else if (this.az.isChecked()) {
                i = 32;
            }
            if (this.in.isChecked()) {
                i |= 4;
            }
            if (this.as.isChecked()) {
                i |= 8;
            }
            interfaceC2263k.vep5(i);
        }
    }

    private View wt() {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.de_mix_dialog, (ViewGroup) null);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.mix_aod_container);
        this.f60558ab = (CheckBox) viewInflate.findViewById(R.id.mix_aod_checkbox);
        this.bb = (TextView) viewInflate.findViewById(R.id.mix_aod_desc);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.mix_desktop_container);
        this.bp = (CheckBox) viewInflate.findViewById(R.id.mix_desktop_checkbox);
        this.bv = (TextView) viewInflate.findViewById(R.id.mix_desktop_desc);
        ViewGroup viewGroup3 = (ViewGroup) viewInflate.findViewById(R.id.mix_lockscreen_container);
        this.an = (CheckBox) viewInflate.findViewById(R.id.mix_lockscreen_checkbox);
        this.id = (TextView) viewInflate.findViewById(R.id.mix_lockscreen_desc);
        ViewGroup viewGroup4 = (ViewGroup) viewInflate.findViewById(R.id.mix_global_container);
        this.in = (CheckBox) viewInflate.findViewById(R.id.mix_global_checkbox);
        this.bl = (TextView) viewInflate.findViewById(R.id.mix_global_desc);
        ViewGroup viewGroup5 = (ViewGroup) viewInflate.findViewById(R.id.mix_icon_container);
        this.as = (CheckBox) viewInflate.findViewById(R.id.mix_icon_checkbox);
        this.bg = (TextView) viewInflate.findViewById(R.id.mix_icon_desc);
        ViewGroup viewGroup6 = (ViewGroup) viewInflate.findViewById(R.id.mix_superwallpaper_container);
        this.az = (CheckBox) viewInflate.findViewById(R.id.mix_superwallpaper_checkbox);
        this.ba = (TextView) viewInflate.findViewById(R.id.mix_superwallpaper_desc);
        int iM8378n = com.android.thememanager.module.detail.util.zy.m8378n();
        boolean zX2 = com.android.thememanager.basemodule.utils.o1t.x2();
        if (this.ay) {
            viewGroup6.setVisibility(0);
            viewGroup2.setVisibility(8);
            viewGroup.setVisibility(8);
            viewGroup3.setVisibility(8);
            this.az.setChecked((iM8378n & 32) != 0);
            if (zX2) {
                this.ba.setText(getString(R.string.de_mix_mode_superwallpaper_with_aod_desc));
            } else {
                this.ba.setText(getString(R.string.de_mix_mode_superwallpaper_without_aod_desc));
            }
        } else {
            viewGroup6.setVisibility(8);
        }
        if (!zX2) {
            viewGroup.setVisibility(8);
        } else if (this.ax) {
            this.f60558ab.setChecked((iM8378n & 16) != 0);
        } else {
            el(viewGroup);
            this.bb.setText(getString(R.string.theme_not_include_module_desc, getString(R.string.de_mix_mode_aod)));
        }
        if (this.ac) {
            this.bp.setChecked((iM8378n & 2) != 0);
        } else {
            el(viewGroup2);
            this.bv.setText(getString(R.string.theme_not_include_module_desc, getString(R.string.de_mix_mode_desktop)));
        }
        if (this.bq) {
            this.an.setChecked((iM8378n & 1) != 0);
        } else {
            el(viewGroup3);
            this.id.setText(getString(R.string.theme_not_include_module_desc, getString(R.string.de_mix_mode_lockscreen)));
        }
        if (this.ad) {
            this.in.setChecked((iM8378n & 4) != 0);
        } else {
            el(viewGroup4);
            this.bl.setText(getString(R.string.theme_not_include_module_desc, getString(R.string.de_mix_mode_global)));
        }
        if (this.am) {
            this.as.setChecked((iM8378n & 8) != 0);
        } else {
            el(viewGroup5);
            this.bg.setText(getString(R.string.theme_not_include_module_desc, getString(R.string.de_mix_mode_icon)));
        }
        this.f60558ab.setOnCheckedChangeListener(this);
        this.bp.setOnCheckedChangeListener(this);
        this.an.setOnCheckedChangeListener(this);
        this.in.setOnCheckedChangeListener(this);
        this.as.setOnCheckedChangeListener(this);
        this.az.setOnCheckedChangeListener(this);
        return viewInflate;
    }

    public static fu4 zff0(boolean hasAod, boolean hasLockScreen, boolean hasLauncher, boolean hasGlobal, boolean hasIcon, boolean hasSuperWallpaper) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(be, hasAod);
        bundle.putBoolean(aj, hasLockScreen);
        bundle.putBoolean(bs, hasLauncher);
        bundle.putBoolean(k0, hasGlobal);
        bundle.putBoolean(ar, hasIcon);
        bundle.putBoolean(bc, hasSuperWallpaper);
        fu4 fu4Var = new fu4();
        fu4Var.setArguments(bundle);
        return fu4Var;
    }

    @Override // androidx.fragment.app.zy
    public Dialog nnh(Bundle savedInstanceState) {
        this.ax = getArguments().getBoolean(be, false);
        this.bq = getArguments().getBoolean(aj, false);
        this.ac = getArguments().getBoolean(bs, false);
        this.ad = getArguments().getBoolean(k0, false);
        this.am = getArguments().getBoolean(ar, false);
        this.ay = getArguments().getBoolean(bc, false);
        return new ki.C6947k(getActivity(), 2131951635).lrht(R.string.de_mix_dialog_title).nn86(wt()).dd(R.string.apply_choosen_type_resource, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.ni7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f13316k.g0ad(dialogInterface, i2);
            }
        }).m25037g();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        boolean z2 = this.f60558ab.isChecked() || this.bp.isChecked() || this.an.isChecked() || this.in.isChecked() || this.as.isChecked() || this.az.isChecked();
        Button buttonM25027h = ((miuix.appcompat.app.ki) u38j()).m25027h(-1);
        if (buttonM25027h != null) {
            Log.e("ApplyMixDialog", "onCheckedChanged: Positive button is null");
            buttonM25027h.setEnabled(z2);
        }
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onStart() {
        Button buttonM25027h;
        super.onStart();
        if (this.ax || this.bq || this.ac || this.ad || this.am || this.ay || (buttonM25027h = ((miuix.appcompat.app.ki) u38j()).m25027h(-1)) == null) {
            return;
        }
        buttonM25027h.setEnabled(false);
    }
}
