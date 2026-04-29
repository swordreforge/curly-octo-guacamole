package com.android.thememanager.activity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.oki;
import java.util.ArrayList;
import miui.app.constants.ThemeManagerConstants;

/* JADX INFO: compiled from: ThirdPartyPickerFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class lw extends Fragment implements ThemeManagerConstants {

    /* JADX INFO: renamed from: g */
    public static final String f9216g = "extra_resolve_info_list";

    /* JADX INFO: renamed from: n */
    private static final String[] f9217n = {ThemeTabActivity.class.getName(), "com.android.providers.media.RingtonePickerActivity", "com.android.documentsui.DocumentsActivity"};

    /* JADX INFO: renamed from: k */
    private int f9218k;

    /* JADX INFO: renamed from: q */
    private boolean f9219q;

    /* JADX INFO: renamed from: com.android.thememanager.activity.lw$k */
    /* JADX INFO: compiled from: ThirdPartyPickerFragment.java */
    class C1610k implements oki.InterfaceC1619k {
        C1610k() {
        }

        @Override // com.android.thememanager.activity.oki.InterfaceC1619k
        /* JADX INFO: renamed from: k */
        public void mo6443k(View v2, int position, Intent specificIntent) {
            try {
                if (lw.this.f9219q) {
                    lw lwVar = lw.this;
                    lwVar.startActivityForResult(specificIntent, lwVar.f9218k);
                } else {
                    lw.this.startActivity(specificIntent);
                    lw.this.getActivity().finish();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.resource_unknow_error, 0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            requireActivity().setResult(this.f9218k, data);
            requireActivity().finish();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_third_party_pickers, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@zy.lvui View view, @zy.dd Bundle savedInstanceState) {
        Intent intent = requireActivity().getIntent();
        this.f9219q = intent.getBooleanExtra(ThirdPartyPickersActivity.f8900n, false);
        this.f9218k = intent.getIntExtra(ThirdPartyPickersActivity.f8899g, -1);
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.INTENT");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_resolve_info_list");
        if (!(parcelableExtra instanceof Intent) || parcelableArrayListExtra == null || parcelableArrayListExtra.size() == 0) {
            requireActivity().finish();
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        for (int size = parcelableArrayListExtra.size() - 1; size >= 0; size--) {
            ResolveInfo resolveInfo = (ResolveInfo) parcelableArrayListExtra.get(size);
            String[] strArr = f9217n;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (resolveInfo.activityInfo.name.contains(strArr[i2])) {
                        parcelableArrayListExtra.remove(size);
                        break;
                    }
                    i2++;
                }
            }
        }
        PackageManager packageManager = requireActivity().getPackageManager();
        RecyclerView recyclerView = (RecyclerView) requireActivity().findViewById(R.id.third_pickers_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        oki okiVar = new oki(parcelableArrayListExtra, this.f9219q, packageManager, intent2, requireActivity(), new C1610k());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(okiVar);
    }
}
