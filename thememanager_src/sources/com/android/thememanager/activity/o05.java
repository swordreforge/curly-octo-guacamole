package com.android.thememanager.activity;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.preference.C1016i;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import java.util.ArrayList;
import miui.app.constants.ThemeManagerConstants;

/* JADX INFO: compiled from: ThirdPartyPickersFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class o05 extends miuix.preference.qrj implements ThemeManagerConstants {

    /* JADX INFO: renamed from: g */
    public static final String f9292g = "extra_resolve_info_list";

    /* JADX INFO: renamed from: n */
    private static final String[] f9293n = {ThemeTabActivity.class.getName(), "com.android.providers.media.RingtonePickerActivity", "com.android.documentsui.DocumentsActivity"};

    /* JADX INFO: renamed from: k */
    private boolean f9294k;

    /* JADX INFO: renamed from: q */
    private int f9295q;

    /* JADX INFO: renamed from: com.android.thememanager.activity.o05$k */
    /* JADX INFO: compiled from: ThirdPartyPickersFragment.java */
    private static class C1618k extends Preference {
        public C1618k(Context context) {
            super(context);
        }

        @Override // androidx.preference.Preference
        /* JADX INFO: renamed from: o */
        public void mo4638o(C1016i holder) {
            super.mo4638o(holder);
            ImageView imageView = (ImageView) holder.itemView.findViewById(R.id.icon);
            if (imageView != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams.width = x2().getResources().getDimensionPixelOffset(com.android.thememanager.R.dimen.select_ring_icon_size);
                layoutParams.height = x2().getResources().getDimensionPixelOffset(com.android.thememanager.R.dimen.select_ring_icon_size);
                layoutParams.setMarginEnd(x2().getResources().getDimensionPixelOffset(com.android.thememanager.R.dimen.select_ring_icon_margin_end));
                imageView.setPadding(0, 0, 0, 0);
            }
            TextView textView = (TextView) holder.itemView.findViewById(R.id.title);
            if (textView != null) {
                textView.setTextSize(0, x2().getResources().getDimensionPixelSize(com.android.thememanager.R.dimen.select_ring_tilte_font_size));
            }
        }
    }

    public static Bundle r25n(String exCode, boolean fromSetting, String exTitle, int requestCode, ArrayList<ResolveInfo> riList, Intent pickerIntent) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(ThirdPartyPickersActivity.f8900n, fromSetting);
        bundle.putInt(ThirdPartyPickersActivity.f8899g, requestCode);
        if (pickerIntent != null) {
            bundle.putParcelable("android.intent.extra.INTENT", pickerIntent);
        }
        if (exTitle != null) {
            bundle.putString("android.intent.extra.ringtone.TITLE", exTitle);
        }
        if (exCode != null) {
            bundle.putString(ThirdPartyPickersActivity.f8901q, exCode);
        }
        if (riList != null) {
            bundle.putParcelableArrayList("extra_resolve_info_list", riList);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        getActivity();
        if (resultCode == -1) {
            getActivity().setResult(this.f9295q, data);
            getActivity().finish();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.preference.qrj
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        ArrayList parcelableArrayList;
        Parcelable parcelable;
        addPreferencesFromResource(com.android.thememanager.R.xml.third_pick_preference);
        ActivityC0891q activityC0891qRequireActivity = requireActivity();
        if (activityC0891qRequireActivity instanceof ThirdPartyPickersActivity) {
            Intent intent = activityC0891qRequireActivity.getIntent();
            this.f9294k = intent.getBooleanExtra(ThirdPartyPickersActivity.f8900n, false);
            this.f9295q = intent.getIntExtra(ThirdPartyPickersActivity.f8899g, -1);
            parcelable = intent.getParcelableExtra("android.intent.extra.INTENT");
            parcelableArrayList = intent.getParcelableArrayListExtra("extra_resolve_info_list");
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f9294k = arguments.getBoolean(ThirdPartyPickersActivity.f8900n);
                this.f9295q = arguments.getInt(ThirdPartyPickersActivity.f8899g);
                parcelable = arguments.getParcelable("android.intent.extra.INTENT");
                parcelableArrayList = arguments.getParcelableArrayList("extra_resolve_info_list");
            } else {
                parcelableArrayList = null;
                parcelable = null;
            }
            C1819o.m7152e(activityC0891qRequireActivity, getString(com.android.thememanager.R.string.resource_title_select_ringtone));
        }
        if (!(parcelable instanceof Intent) || parcelableArrayList == null || parcelableArrayList.size() == 0) {
            activityC0891qRequireActivity.finish();
            return;
        }
        Intent intent2 = (Intent) parcelable;
        for (int size = parcelableArrayList.size() - 1; size >= 0; size--) {
            ResolveInfo resolveInfo = (ResolveInfo) parcelableArrayList.get(size);
            String[] strArr = f9293n;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (resolveInfo.activityInfo.name.indexOf(strArr[i2]) >= 0) {
                        parcelableArrayList.remove(size);
                        break;
                    }
                    i2++;
                }
            }
        }
        PackageManager packageManager = getActivity().getPackageManager();
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        int size2 = parcelableArrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ResolveInfo resolveInfo2 = (ResolveInfo) parcelableArrayList.get(i3);
            Intent intent3 = new Intent(intent2);
            if (this.f9294k) {
                intent3.addFlags(16777216);
            } else {
                intent3.addFlags(50331648);
            }
            ActivityInfo activityInfo = ((ResolveInfo) parcelableArrayList.get(i3)).activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            Preference c1618k = C1807g.zurt() ? new C1618k(getActivity()) : getPreferenceManager().m4692k(getPreferenceManager().zy());
            c1618k.was(intent3);
            c1618k.bwp(resolveInfo2.loadLabel(packageManager));
            c1618k.d8wk(resolveInfo2.loadIcon(packageManager));
            preferenceScreen.h7am(c1618k);
        }
    }

    @Override // miuix.preference.qrj, androidx.preference.qrj, androidx.preference.ki.zy
    public boolean onPreferenceTreeClick(Preference preference) {
        Intent intentM4653i = preference.m4653i();
        try {
            if (this.f9294k) {
                startActivityForResult(intentM4653i, this.f9295q);
            } else {
                startActivity(intentM4653i);
                getActivity().finish();
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            com.android.thememanager.basemodule.utils.nn86.m7150k(com.android.thememanager.R.string.resource_unknow_error, 0);
            return true;
        }
    }
}
