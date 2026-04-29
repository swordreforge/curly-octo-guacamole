package com.android.thememanager.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.ArrayMap;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.guideview.InterfaceC1727k;
import com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper;
import com.android.thememanager.basemodule.resource.C1796y;
import com.android.thememanager.service.ThemeSchedulerService;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import miuix.preference.TextPreference;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ThemePreferenceFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class e5 extends miuix.preference.qrj implements Preference.zy, InterfaceC1727k.toq, InterfaceC1727k.k {

    /* JADX INFO: renamed from: h */
    private static final String f8995h = "theme_create_home_icon";

    /* JADX INFO: renamed from: i */
    public static final String f8996i = "using_theme_show_ad";

    /* JADX INFO: renamed from: p */
    private static final String f8997p = "plugin_sdcard_is_priority_storage";

    /* JADX INFO: renamed from: s */
    private static final String f8998s = "miui.intent.action.BUGREPORT";

    /* JADX INFO: renamed from: z */
    private static final String f8999z = "key_get_device_status";

    /* JADX INFO: renamed from: g */
    private miuix.appcompat.app.ki f9000g;

    /* JADX INFO: renamed from: k */
    private CheckBoxPreference f9001k;

    /* JADX INFO: renamed from: n */
    private TextPreference f9002n;

    /* JADX INFO: renamed from: q */
    private TextPreference f9003q;

    /* JADX INFO: renamed from: y */
    private final SharedPreferences.OnSharedPreferenceChangeListener f9004y = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.android.thememanager.activity.ga
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            e5.v5yj(sharedPreferences, str);
        }
    };

    /* JADX INFO: renamed from: com.android.thememanager.activity.e5$k */
    /* JADX INFO: compiled from: ThemePreferenceFragment.java */
    class C1575k implements Preference.InterfaceC0998q {
        C1575k() {
        }

        @Override // androidx.preference.Preference.InterfaceC0998q
        public boolean onPreferenceClick(Preference preference) {
            e5.this.startActivity(new Intent(e5.this.getActivity(), (Class<?>) ThemeAboutActivity.class));
            return true;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.e5$q */
    /* JADX INFO: compiled from: ThemePreferenceFragment.java */
    static class AsyncTaskC1576q extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: k */
        private final WeakReference<e5> f9006k;

        public AsyncTaskC1576q(e5 fragment) {
            this.f9006k = new WeakReference<>(fragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            e5 e5Var = this.f9006k.get();
            if (e5Var != null) {
                return com.android.thememanager.util.mbx.x2(e5Var.getContext());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
            e5 e5Var = this.f9006k.get();
            if (e5Var != null) {
                e5Var.nnh(aBoolean);
            }
        }
    }

    /* JADX INFO: compiled from: ThemePreferenceFragment.java */
    class toq implements Preference.InterfaceC0998q {
        toq() {
        }

        @Override // androidx.preference.Preference.InterfaceC0998q
        public boolean onPreferenceClick(Preference preference) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.gl8t));
            Intent intent = new Intent(e5.f8998s);
            intent.putExtra("packageName", com.android.thememanager.ad.zy.m6537q());
            intent.putExtra(InterfaceC1357q.f53874g1, e5.this.getString(R.string.theme_bug_report));
            try {
                e5.this.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e2) {
                e2.printStackTrace();
                return true;
            }
        }
    }

    /* JADX INFO: compiled from: ThemePreferenceFragment.java */
    class zy implements Preference.InterfaceC0998q {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f9008k;

        zy(final Context val$context) {
            this.f9008k = val$context;
        }

        @Override // androidx.preference.Preference.InterfaceC0998q
        public boolean onPreferenceClick(Preference preference) {
            try {
                e5.this.startActivity(com.android.thememanager.util.mbx.m9873y(this.f9008k));
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    private void kx3() {
        Preference preference = new Preference(getPreferenceManager().zy());
        preference.bwp(getResources().getString(R.string.about_app_name));
        preference.ltg8(new C1575k());
        getPreferenceScreen().h7am(preference);
    }

    private void m2t(final Context context) {
        TextPreference textPreference = new TextPreference(getPreferenceManager().zy());
        this.f9002n = textPreference;
        textPreference.kcsr(R.string.lockscreen_magazine_title);
        this.f9002n.w831(R.string.pref_lockscreen_magazine_summary);
        this.f9002n.ltg8(new zy(context));
        getPreferenceScreen().h7am(this.f9002n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ps(Preference preference) {
        startActivity(new Intent(getActivity(), (Class<?>) PrivacySettingsActivity.class));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean ra(Preference preference) {
        RestoreHomeIconHelper.ld6(this, RestoreHomeIconHelper.f9909t);
        return true;
    }

    private void u38j() {
        CheckBoxPreference checkBoxPreference = new CheckBoxPreference(getPreferenceManager().zy());
        checkBoxPreference.gbni(f8997p);
        checkBoxPreference.bwp(getString(R.string.theme_is_external_priority_storage));
        checkBoxPreference.z4(getString(R.string.theme_is_external_priority_storage_summary));
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(getActivity()).edit();
        editorEdit.putBoolean(f8997p, C1796y.f7l8());
        editorEdit.apply();
        getPreferenceScreen().h7am(checkBoxPreference);
    }

    private void uf() {
        new AsyncTaskC1576q(this).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v5yj(SharedPreferences sharedPreferences, String str) {
        if (str.equals(f8997p)) {
            com.android.thememanager.basemodule.resource.zy.toq(sharedPreferences.getBoolean(str, false));
            System.exit(0);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m6407w() {
        Preference preference = new Preference(getPreferenceManager().zy());
        preference.bwp(getResources().getString(R.string.theme_bug_report));
        preference.ltg8(new toq());
        getPreferenceScreen().h7am(preference);
    }

    @Override // com.android.thememanager.basemodule.guideview.InterfaceC1727k.k
    public void ki(boolean need) {
        TextPreference textPreference = (TextPreference) findPreference(f8995h);
        if (textPreference != null) {
            textPreference.gc3c(true);
        }
        if (isAdded() && textPreference != null) {
            textPreference.ltg8(new Preference.InterfaceC0998q() { // from class: com.android.thememanager.activity.wlev
                @Override // androidx.preference.Preference.InterfaceC0998q
                public final boolean onPreferenceClick(Preference preference) {
                    return this.f9366k.ra(preference);
                }
            });
            if (need) {
                textPreference.jbh(getString(R.string.community_message_trigger_disabled));
            } else {
                textPreference.jbh(getString(R.string.community_message_trigger_triggered));
                textPreference.fnq8(false);
            }
        }
    }

    public void nnh(Boolean aBoolean) {
        TextPreference textPreference = this.f9002n;
        if (textPreference != null) {
            if (aBoolean == null) {
                textPreference.jbh("");
            } else {
                textPreference.mbx(aBoolean.booleanValue() ? R.string.community_message_trigger_triggered : R.string.community_message_trigger_disabled);
            }
        }
    }

    @Override // androidx.preference.qrj
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences);
        if (C1796y.m6977s()) {
            u38j();
        }
        if (com.android.thememanager.share.ld6.n7h(getActivity(), com.android.thememanager.util.uc.f16819f)) {
            m2t(getActivity());
        }
        kx3();
        m6407w();
        if (com.android.thememanager.basemodule.utils.y9n.vyq()) {
            TextPreference textPreference = (TextPreference) findPreference(f8995h);
            if (textPreference != null) {
                textPreference.gc3c(false);
            }
        } else {
            new RestoreHomeIconHelper.AsyncTaskC1726k(this).toq(RestoreHomeIconHelper.f9909t);
        }
        this.f9001k = (CheckBoxPreference) findPreference(com.android.thememanager.util.zkd.f16922n);
        TextPreference textPreference2 = (TextPreference) findPreference("privacy_setting");
        this.f9003q = textPreference2;
        if (textPreference2 != null) {
            textPreference2.ltg8(new Preference.InterfaceC0998q() { // from class: com.android.thememanager.activity.h4b
                @Override // androidx.preference.Preference.InterfaceC0998q
                public final boolean onPreferenceClick(Preference preference) {
                    return this.f9062k.ps(preference);
                }
            });
        }
        CheckBoxPreference checkBoxPreference = this.f9001k;
        if (checkBoxPreference != null) {
            checkBoxPreference.i9jn(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (C1796y.m6977s()) {
            PreferenceManager.getDefaultSharedPreferences(getActivity()).unregisterOnSharedPreferenceChangeListener(this.f9004y);
        }
        super.onPause();
    }

    @Override // androidx.preference.Preference.zy
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        boolean zBooleanValue = ((Boolean) newValue).booleanValue();
        if (!com.android.thememanager.util.zkd.f16922n.equals(preference.fn3e())) {
            return true;
        }
        if (zBooleanValue) {
            ThemeSchedulerService.cdj();
        } else {
            ThemeSchedulerService.m8907y();
        }
        ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.h4g);
        arrayMapZy.put(com.android.thememanager.basemodule.analysis.toq.u0z, Boolean.valueOf(zBooleanValue));
        C1708s.f7l8().ld6().ni7(arrayMapZy);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        if (C1796y.m6977s()) {
            PreferenceManager.getDefaultSharedPreferences(getActivity()).registerOnSharedPreferenceChangeListener(this.f9004y);
        }
        if (this.f9002n != null) {
            if (com.android.thememanager.share.ld6.n7h(getActivity(), com.android.thememanager.util.uc.f16819f)) {
                this.f9002n.gc3c(true);
                uf();
            } else {
                this.f9002n.gc3c(false);
            }
        }
        super.onResume();
    }

    @Override // com.android.thememanager.basemodule.guideview.InterfaceC1727k.toq
    public void vq(boolean success) {
        TextPreference textPreference = (TextPreference) findPreference(f8995h);
        if (textPreference != null) {
            textPreference.jbh(getString(R.string.community_message_trigger_triggered));
            textPreference.fnq8(false);
        }
    }
}
