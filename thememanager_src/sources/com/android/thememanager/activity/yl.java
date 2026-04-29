package com.android.thememanager.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1824r;
import miuix.preference.TextPreference;

/* JADX INFO: compiled from: PrivacyPreferenceFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class yl extends miuix.preference.qrj implements Preference.InterfaceC0998q, com.android.thememanager.basemodule.analysis.toq, Preference.zy {

    /* JADX INFO: renamed from: b */
    private static final String f9400b = "key_local_mode";

    /* JADX INFO: renamed from: c */
    private static final String f9401c = "category_key_about_permission";

    /* JADX INFO: renamed from: e */
    private static final String f9402e = "category_key_logoff_services";

    /* JADX INFO: renamed from: f */
    private static final String f9403f = "theme_recommend_trigger";

    /* JADX INFO: renamed from: j */
    private static final String f9404j = "privilege_management";

    /* JADX INFO: renamed from: l */
    private static final String f9405l = "category_key_recommend";

    /* JADX INFO: renamed from: m */
    private static final String f9406m = "category_key_local_mode";

    /* JADX INFO: renamed from: o */
    private static final String f9407o = "logoff_theme_servers";

    /* JADX INFO: renamed from: r */
    private static final String f9408r = "revoke_agreement";

    /* JADX INFO: renamed from: t */
    private static final String f9409t = "privacyPolicy";

    /* JADX INFO: renamed from: g */
    private TextPreference f9410g;

    /* JADX INFO: renamed from: h */
    private PreferenceCategory f9411h;

    /* JADX INFO: renamed from: i */
    private CheckBoxPreference f9412i;

    /* JADX INFO: renamed from: k */
    private TextPreference f9413k;

    /* JADX INFO: renamed from: n */
    private TextPreference f9414n;

    /* JADX INFO: renamed from: p */
    private PreferenceCategory f9415p;

    /* JADX INFO: renamed from: q */
    private TextPreference f9416q;

    /* JADX INFO: renamed from: s */
    private PreferenceCategory f9417s;

    /* JADX INFO: renamed from: y */
    private PreferenceCategory f9418y;

    /* JADX INFO: renamed from: z */
    private CheckBoxPreference f9419z;

    private void ew() {
        Intent intent = new Intent(getActivity(), (Class<?>) PrivacyThemeBaseActivity.class);
        intent.putExtra(PrivacyThemeBaseActivity.f8811c, PrivacyThemeBaseActivity.f8812e);
        intent.putExtra(PrivacyThemeBaseActivity.f8816r, PrivacyThemeBaseActivity.f8815l);
        startActivity(intent);
        C1708s.f7l8().ld6().ni7(C1706p.m6649g(com.android.thememanager.basemodule.analysis.toq.urz8, C1781k.n7h()));
    }

    private void ix() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C1781k.m6907s(com.android.thememanager.basemodule.utils.fu4.m7067k()))));
        C1708s.f7l8().ld6().ni7(C1706p.m6649g(com.android.thememanager.basemodule.analysis.toq.b6t2, C1781k.n7h()));
    }

    private void kx3() {
        Intent intent = new Intent(getActivity(), (Class<?>) PrivacyThemeBaseActivity.class);
        intent.putExtra(PrivacyThemeBaseActivity.f8811c, PrivacyThemeBaseActivity.f8812e);
        intent.putExtra(PrivacyThemeBaseActivity.f8816r, PrivacyThemeBaseActivity.f8813f);
        startActivity(intent);
        C1708s.f7l8().ld6().ni7(C1706p.m6649g(com.android.thememanager.basemodule.analysis.toq.ms, C1781k.n7h()));
    }

    private void r25n() {
        startActivity(new Intent(getActivity(), (Class<?>) AuthorityManagementActivity.class));
        C1708s.f7l8().ld6().ni7(C1706p.m6649g(com.android.thememanager.basemodule.analysis.toq.n8, C1781k.n7h()));
    }

    /* JADX INFO: renamed from: w */
    private void m6482w() {
        PreferenceCategory preferenceCategory = this.f9417s;
        if (preferenceCategory != null) {
            preferenceCategory.gc3c(C1688q.cdj().wvg());
        }
        CheckBoxPreference checkBoxPreference = this.f9419z;
        if (checkBoxPreference != null) {
            checkBoxPreference.setChecked(C1824r.m7203y().zy("key_local_mode", false));
        }
    }

    @Override // androidx.preference.qrj
    public void onCreatePreferences(Bundle bundle, String s2) {
        PreferenceCategory preferenceCategory;
        PreferenceCategory preferenceCategory2;
        addPreferencesFromResource(R.xml.privacy_preference);
        TextPreference textPreference = (TextPreference) findPreference(f9409t);
        this.f9413k = textPreference;
        textPreference.ltg8(this);
        TextPreference textPreference2 = (TextPreference) findPreference(f9408r);
        this.f9416q = textPreference2;
        textPreference2.ltg8(this);
        this.f9418y = (PreferenceCategory) findPreference(f9401c);
        TextPreference textPreference3 = (TextPreference) findPreference(f9404j);
        this.f9414n = textPreference3;
        textPreference3.ltg8(this);
        TextPreference textPreference4 = (TextPreference) findPreference(f9407o);
        this.f9410g = textPreference4;
        textPreference4.ltg8(this);
        PreferenceCategory preferenceCategory3 = (PreferenceCategory) findPreference(f9402e);
        this.f9417s = preferenceCategory3;
        preferenceCategory3.gc3c(C1688q.cdj().wvg());
        this.f9415p = (PreferenceCategory) findPreference(f9405l);
        CheckBoxPreference checkBoxPreference = new CheckBoxPreference(getPreferenceManager().zy());
        this.f9412i = checkBoxPreference;
        checkBoxPreference.gbni("theme_recommend_trigger");
        this.f9412i.kcsr(R.string.recommend_trigger);
        this.f9412i.vq(Boolean.valueOf(com.android.thememanager.basemodule.utils.lvui.jp0y()));
        if (!com.android.thememanager.basemodule.privacy.x2.zy() || com.android.thememanager.basemodule.utils.lvui.jp0y()) {
            this.f9412i.w831(R.string.recommend_trigger_summary);
        } else {
            this.f9412i.w831(R.string.personalize_recommend_switch_desc);
        }
        this.f9415p.h7am(this.f9412i);
        this.f9412i.i9jn(this);
        this.f9411h = (PreferenceCategory) findPreference(f9406m);
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("key_local_mode");
        this.f9419z = checkBoxPreference2;
        checkBoxPreference2.i9jn(this);
        if (!com.android.thememanager.basemodule.privacy.x2.zy() || !C1781k.toq(bf2.toq.toq())) {
            PreferenceCategory preferenceCategory4 = this.f9415p;
            if (preferenceCategory4 != null) {
                preferenceCategory4.gc3c(false);
            }
            this.f9416q.gc3c(false);
            this.f9410g.gc3c(false);
        }
        if (C1688q.cdj().jk() && (preferenceCategory2 = this.f9415p) != null) {
            preferenceCategory2.gc3c(false);
        }
        if (!com.android.thememanager.basemodule.privacy.x2.zy() && (preferenceCategory = this.f9411h) != null) {
            preferenceCategory.gc3c(false);
        }
        if (!com.android.thememanager.basemodule.utils.y9n.fti()) {
            this.f9418y.gc3c(false);
        }
        PreferenceCategory preferenceCategory5 = (PreferenceCategory) findPreference(f9402e);
        this.f9417s = preferenceCategory5;
        preferenceCategory5.gc3c(false);
    }

    @Override // androidx.preference.Preference.zy
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        boolean zBooleanValue = ((Boolean) newValue).booleanValue();
        if ("theme_recommend_trigger".equals(preference.fn3e())) {
            if (zBooleanValue && Build.VERSION.SDK_INT < 29) {
                C1824r.m7203y().m7206p(com.android.thememanager.basemodule.utils.lvui.f10352p, true).m7204k();
            }
        } else if ("key_local_mode".equals(preference.fn3e())) {
            if (zBooleanValue) {
                com.android.thememanager.basemodule.privacy.x2.ld6(true);
                com.android.thememanager.push.f7l8.m8456g().kja0();
                com.android.thememanager.basemodule.utils.ni7.m7146k().m7148q(com.android.thememanager.basemodule.privacy.x2.f57643qrj, new Intent(com.android.thememanager.basemodule.privacy.x2.f57643qrj));
            } else {
                com.android.thememanager.basemodule.privacy.x2.ld6(false);
                if (getActivity() != null) {
                    com.android.thememanager.push.f7l8.m8456g().x2(getActivity().getApplication());
                }
            }
            C1708s.f7l8().ld6().ni7(C1706p.f7l8(com.android.thememanager.basemodule.analysis.toq.eg6, null, String.valueOf(zBooleanValue), com.android.thememanager.basemodule.analysis.toq.n4kc));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.preference.Preference.InterfaceC0998q
    public boolean onPreferenceClick(Preference preference) {
        String strFn3e = preference.fn3e();
        strFn3e.hashCode();
        switch (strFn3e) {
            case "logoff_theme_servers":
                ew();
                return true;
            case "privilege_management":
                r25n();
                return true;
            case "revoke_agreement":
                kx3();
                return true;
            case "privacyPolicy":
                ix();
                return true;
            default:
                return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m6482w();
    }
}
