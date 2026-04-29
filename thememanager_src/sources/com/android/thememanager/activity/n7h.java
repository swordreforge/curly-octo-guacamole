package com.android.thememanager.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import miuix.appcompat.app.ki;
import miuix.preference.TextPreference;
import p000a.InterfaceC0001q;

/* JADX INFO: compiled from: AuthorityManagementPreferenceFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h extends com.android.thememanager.basemodule.base.zy implements InterfaceC0001q, Preference.zy {

    /* JADX INFO: renamed from: h */
    private static final String f9251h = "read_write_storage";

    /* JADX INFO: renamed from: i */
    private static final String f9252i = "read_the_application_list";

    /* JADX INFO: renamed from: r */
    private static final String f9253r = "storage_permission_switch";

    /* JADX INFO: renamed from: t */
    private static final String f9254t = "extra_pkgname";

    /* JADX INFO: renamed from: z */
    private static final String f9255z = "miui.intent.action.APP_PERM_EDITOR";

    /* JADX INFO: renamed from: g */
    private CheckBoxPreference f9256g;

    /* JADX INFO: renamed from: n */
    private CheckBoxPreference f9257n;

    /* JADX INFO: renamed from: p */
    private p000a.zy f9258p = new toq();

    /* JADX INFO: renamed from: q */
    private TextPreference f9259q;

    /* JADX INFO: renamed from: s */
    private miuix.appcompat.app.ki f9260s;

    /* JADX INFO: renamed from: y */
    private miuix.appcompat.app.ki f9261y;

    /* JADX INFO: renamed from: com.android.thememanager.activity.n7h$k */
    /* JADX INFO: compiled from: AuthorityManagementPreferenceFragment.java */
    class C1614k implements Preference.InterfaceC0998q {
        C1614k() {
        }

        @Override // androidx.preference.Preference.InterfaceC0998q
        public boolean onPreferenceClick(Preference preference) {
            if (com.android.thememanager.basemodule.utils.lvui.jk(bf2.toq.toq())) {
                com.android.thememanager.basemodule.utils.lvui.zurt(com.android.thememanager.basemodule.utils.lvui.f10350k[1], ((com.android.thememanager.basemodule.base.zy) n7h.this).f9885k, n7h.this.f9258p, 1);
            } else {
                Intent intent = new Intent(n7h.f9255z);
                intent.putExtra(n7h.f9254t, com.android.thememanager.basemodule.utils.a9.m6992g(n7h.this.getContext()));
                n7h.this.startActivity(intent);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: AuthorityManagementPreferenceFragment.java */
    class toq implements p000a.zy {
        toq() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.fn3e(n7h.this.getActivity());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void kiv(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void nnh(DialogInterface dialogInterface, int i2) {
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.t1, null, com.android.thememanager.basemodule.analysis.toq.a46k));
    }

    private void ps() {
        CheckBoxPreference checkBoxPreference = new CheckBoxPreference(getPreferenceManager().zy());
        this.f9257n = checkBoxPreference;
        checkBoxPreference.gbni("storage_permission_switch");
        this.f9257n.bwp(getString(R.string.privacy_pad_fold_Read_write_storage));
        this.f9257n.z4(getString(R.string.pref_read_write_function_detail));
        this.f9257n.vq(Boolean.FALSE);
        getPreferenceScreen().h7am(this.f9257n);
        this.f9257n.i9jn(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ra(DialogInterface dialogInterface, int i2) {
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.t1, null, com.android.thememanager.basemodule.analysis.toq.f4f));
        CheckBoxPreference checkBoxPreference = this.f9257n;
        if (checkBoxPreference != null) {
            checkBoxPreference.setChecked(true);
        }
    }

    private void u38j() {
        CheckBoxPreference checkBoxPreference = new CheckBoxPreference(getPreferenceManager().zy());
        this.f9256g = checkBoxPreference;
        checkBoxPreference.gbni(com.android.thememanager.basemodule.utils.lvui.f10352p);
        this.f9256g.bwp(getString(R.string.preference_title_get_device_status));
        this.f9256g.z4(getString(R.string.preference_subtitle_get_device_status));
        this.f9256g.vq(Boolean.FALSE);
        getPreferenceScreen().h7am(this.f9256g);
        this.f9256g.i9jn(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void uf(DialogInterface dialogInterface, int i2) {
        CheckBoxPreference checkBoxPreference = this.f9256g;
        if (checkBoxPreference != null) {
            checkBoxPreference.setChecked(true);
        }
    }

    private void v5yj() {
        TextPreference textPreference = (TextPreference) findPreference(f9251h);
        this.f9259q = textPreference;
        if (Build.VERSION.SDK_INT >= 30) {
            textPreference.w831(R.string.system_cta_runtime_perm_desc_storage_above_eleven);
        }
        this.f9259q.ltg8(new C1614k());
        if (!com.android.thememanager.basemodule.utils.a9.t8r(bf2.toq.toq())) {
            this.f9259q.gc3c(false);
            ps();
        }
        if (com.android.thememanager.basemodule.utils.lvui.jp0y() || !com.android.thememanager.basemodule.privacy.x2.zy()) {
            return;
        }
        u38j();
    }

    @Override // com.android.thememanager.basemodule.base.zy, p000a.InterfaceC0001q
    public p000a.zy jz5() {
        return this.f9258p;
    }

    @Override // com.android.thememanager.basemodule.base.zy, androidx.preference.qrj
    public void onCreatePreferences(Bundle bundle, String s2) {
        addPreferencesFromResource(R.xml.privacy_instrution);
        v5yj();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        miuix.appcompat.app.ki kiVar = this.f9261y;
        if (kiVar != null && kiVar.isShowing()) {
            this.f9261y.n7h();
        }
        miuix.appcompat.app.ki kiVar2 = this.f9260s;
        if (kiVar2 != null && kiVar2.isShowing()) {
            this.f9260s.n7h();
        }
        super.onDestroy();
    }

    @Override // androidx.preference.Preference.zy
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        boolean zBooleanValue = ((Boolean) newValue).booleanValue();
        if ("storage_permission_switch".equals(preference.fn3e())) {
            if (zBooleanValue) {
                return true;
            }
            if (this.f9260s == null) {
                this.f9260s = new ki.C6947k(getContext()).uv6(getString(R.string.resource_hint)).m25050z(getString(Build.VERSION.SDK_INT >= 30 ? R.string.close_custom_permission_warning_text_above_eleven : R.string.close_custom_permission_warning_text)).m25047s(false).dd(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.p
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        this.f9306k.ra(dialogInterface, i2);
                    }
                }).mcp(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.ld6
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        n7h.nnh(dialogInterface, i2);
                    }
                }).m25037g();
            }
            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.t1, null, ""));
            this.f9260s.show();
            return true;
        }
        if (!com.android.thememanager.basemodule.utils.lvui.f10352p.equals(preference.fn3e()) || zBooleanValue) {
            return true;
        }
        if (this.f9261y == null) {
            this.f9261y = new ki.C6947k(getContext()).uv6(getString(R.string.resource_hint)).m25050z(getString(R.string.dialog_content_get_device_status)).m25047s(false).dd(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.x2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f9370k.uf(dialogInterface, i2);
                }
            }).mcp(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.qrj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    n7h.kiv(dialogInterface, i2);
                }
            }).m25037g();
        }
        this.f9261y.show();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f9259q.mbx(com.android.thememanager.basemodule.utils.lvui.jk(bf2.toq.toq()) ? R.string.not_allow : R.string.allow);
    }
}
