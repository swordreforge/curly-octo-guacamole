package com.android.thememanager.activity;

import android.os.Bundle;
import android.util.ArrayMap;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.clockmessage.C1875q;

/* JADX INFO: compiled from: CommunityPreferenceFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class yz extends miuix.preference.qrj implements Preference.zy {

    /* JADX INFO: renamed from: k */
    private CheckBoxPreference f9423k;

    /* JADX INFO: renamed from: q */
    private CheckBoxPreference f9424q;

    @Override // androidx.preference.qrj
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.community_preferences);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(C1875q.f57861n7h);
        this.f9423k = checkBoxPreference;
        checkBoxPreference.i9jn(this);
        this.f9423k.setChecked(C1875q.m7391g().kja0());
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference(C1875q.f57859kja0);
        this.f9424q = checkBoxPreference2;
        checkBoxPreference2.i9jn(this);
        this.f9424q.fnq8(this.f9423k.isChecked());
    }

    @Override // androidx.preference.Preference.zy
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        String strFn3e = preference.fn3e();
        boolean zBooleanValue = ((Boolean) newValue).booleanValue();
        ArrayMap<String, Object> arrayMapZy = C1706p.zy(strFn3e);
        arrayMapZy.put(com.android.thememanager.basemodule.analysis.toq.u0z, newValue);
        C1708s.f7l8().ld6().ni7(arrayMapZy);
        strFn3e.hashCode();
        if (strFn3e.equals(C1875q.f57861n7h)) {
            C1875q.m7391g().d3(zBooleanValue, this.f9424q.isChecked());
            this.f9423k.setChecked(zBooleanValue);
            this.f9424q.fnq8(zBooleanValue);
            return true;
        }
        if (!strFn3e.equals(C1875q.f57859kja0)) {
            return true;
        }
        C1875q.m7391g().d3(this.f9423k.isChecked(), zBooleanValue);
        this.f9424q.setChecked(zBooleanValue);
        return true;
    }
}
