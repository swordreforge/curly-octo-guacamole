package com.android.thememanager.activity;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.android.thememanager.R;
import miuix.preference.RadioButtonPreference;
import miuix.preference.RadioButtonPreferenceCategory;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class SelectModeFragment extends miuix.preference.qrj {
    private static final String KEY_CATEGORY_PARENT = "key_category_select_parent";
    private static final String TAG = "SelectModeFragment";
    private RadioButtonPreference mBaseFuncPref;
    private RadioButtonPreference mLookUpPref;
    private RadioButtonPreferenceCategory mParentCategory;

    @Override // androidx.preference.qrj
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.user_mode_select_preference);
        this.mParentCategory = (RadioButtonPreferenceCategory) findPreference(KEY_CATEGORY_PARENT);
        this.mLookUpPref = (RadioButtonPreference) findPreference(com.android.thememanager.basemodule.privacy.x2.f10154g);
        this.mBaseFuncPref = (RadioButtonPreference) findPreference(com.android.thememanager.basemodule.privacy.x2.f57639f7l8);
        this.mParentCategory.oki(this.mLookUpPref);
        if (getActivity() == null || getActivity().getIntent().getBooleanExtra(com.android.thememanager.basemodule.privacy.x2.f10159s, false)) {
            this.mBaseFuncPref.gc3c(false);
        }
    }

    public void saveUserSelected(boolean saveUserSelect) {
        int i2;
        if (!saveUserSelect) {
            this.mParentCategory.oki(null);
            return;
        }
        if (this.mLookUpPref.isChecked()) {
            i2 = 2;
        } else {
            this.mBaseFuncPref.isChecked();
            i2 = 1;
        }
        com.android.thememanager.basemodule.privacy.x2.m6915p(i2);
        Log.i(TAG, "saveUserSelected: " + i2);
    }
}
