package com.theme.loopwallpaper.fragment;

import android.os.Bundle;
import android.util.ArrayMap;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.service.ThemeSchedulerService;
import miuix.preference.qrj;
import p001b.f7l8;

/* JADX INFO: renamed from: com.theme.loopwallpaper.fragment.k */
/* JADX INFO: compiled from: WallpaperLoopMoreSettingFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5440k extends qrj implements Preference.zy {

    /* JADX INFO: renamed from: g */
    private boolean f30322g;

    /* JADX INFO: renamed from: k */
    private Preference f30323k;

    /* JADX INFO: renamed from: n */
    private String f30324n;

    /* JADX INFO: renamed from: q */
    private Preference f30325q;

    private void ew(CharSequence newValue) {
        this.f30325q.z4(newValue);
    }

    private void r25n(CharSequence newValue) {
        this.f30323k.z4(newValue);
    }

    @Override // androidx.preference.qrj
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        boolean zKja0 = o1t.kja0();
        this.f30322g = zKja0;
        addPreferencesFromResource(zKja0 ? R.xml.gte_v12_wallpaper_loop_more_settins_preferences : R.xml.wallpaper_loop_more_settings_preferences);
        this.f30323k = findPreference("interval");
        this.f30325q = findPreference("order");
        this.f30323k.i9jn(this);
        this.f30325q.i9jn(this);
        if (!this.f30322g) {
            r25n(((ListPreference) this.f30323k).lh());
            ew(((ListPreference) this.f30325q).lh());
        }
        this.f30324n = getActivity().getIntent().getStringExtra(f7l8.nod);
    }

    @Override // androidx.preference.Preference.zy
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        String strFn3e = preference.fn3e();
        strFn3e.hashCode();
        if (strFn3e.equals("order")) {
            if (!this.f30322g) {
                ew(((ListPreference) this.f30325q).ngy()[com.theme.loopwallpaper.controller.toq.qrj((String) newValue)]);
            }
        } else if (strFn3e.equals("interval")) {
            ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.ul);
            String str = (String) newValue;
            arrayMapZy.put("duration", Integer.valueOf(Integer.parseInt(str)));
            if (!this.f30322g) {
                r25n(((ListPreference) this.f30323k).ngy()[com.theme.loopwallpaper.controller.toq.m18515s(str)]);
            }
            C1708s.f7l8().ld6().ni7(arrayMapZy);
            if (com.theme.loopwallpaper.controller.toq.ki(0) || com.theme.loopwallpaper.controller.toq.ki(1)) {
                ThemeSchedulerService.m8906s(Integer.valueOf((int) Long.parseLong(str)), false);
            }
        }
        return true;
    }
}
