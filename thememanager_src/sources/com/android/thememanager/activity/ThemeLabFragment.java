package com.android.thememanager.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.preference.Preference;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.theme.loopwallpaper.activity.WallpaperLoopPreferenceActivity;
import miuix.preference.TextPreference;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class ThemeLabFragment extends miuix.preference.qrj implements Preference.InterfaceC0998q {
    private static final String INCALL_SHOW = "incall_show";
    private static final String LOOP_WALLPAPER = "loop_wallpaper";
    private TextPreference mLooperWallpaperPref;
    private miuix.appcompat.app.ki mSecondForbidDialog;

    @Override // androidx.preference.qrj
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.theme_lab_preference, rootKey);
        TextPreference textPreference = (TextPreference) findPreference(LOOP_WALLPAPER);
        this.mLooperWallpaperPref = textPreference;
        textPreference.ltg8(this);
        if (com.android.thememanager.basemodule.utils.o1t.a9()) {
            TextPreference textPreference2 = new TextPreference(getPreferenceManager().zy());
            textPreference2.gbni(INCALL_SHOW);
            textPreference2.kcsr(R.string.incall_show_title);
            textPreference2.ltg8(this);
            getPreferenceScreen().h7am(textPreference2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        miuix.appcompat.app.ki kiVar = this.mSecondForbidDialog;
        if (kiVar != null) {
            kiVar.dismiss();
            this.mSecondForbidDialog = null;
        }
    }

    @Override // androidx.preference.Preference.InterfaceC0998q
    public boolean onPreferenceClick(Preference preference) {
        if (LOOP_WALLPAPER.equals(preference.fn3e())) {
            Intent intent = new Intent(getActivity(), (Class<?>) WallpaperLoopPreferenceActivity.class);
            intent.putExtra(p001b.f7l8.nod, getActivity().getIntent().getStringExtra(p001b.f7l8.nod));
            startActivity(intent);
        } else if (INCALL_SHOW.equals(preference.fn3e())) {
            Intent intent2 = new Intent(p001b.f7l8.f53794le7);
            intent2.putExtra(p001b.f7l8.nc, false);
            startActivity(intent2);
        }
        C1708s.f7l8().ld6().ni7(C1706p.zy(preference.fn3e()));
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.theme.loopwallpaper.controller.toq.n7h();
        if (com.theme.loopwallpaper.controller.toq.kja0()) {
            this.mLooperWallpaperPref.mbx(R.string.transparent_wallpaper_enable);
        } else {
            this.mLooperWallpaperPref.mbx(R.string.transparent_wallpaper_disable);
        }
    }
}
