package com.android.thememanager.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.view.ComponentCategoryView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class ComponentFragment extends C1582h implements InterfaceC1789q {

    /* JADX INFO: renamed from: c */
    private static final String[] f8777c = {InterfaceC1789q.gx2z, InterfaceC1789q.qwyf, "icons", "mms", InterfaceC1789q.yb3p, "launcher", "bootanimation", "bootaudio", "aod"};

    /* JADX INFO: renamed from: e */
    private static final Integer[] f8778e = {Integer.valueOf(R.drawable.icon_components_lockstyle), Integer.valueOf(R.drawable.icon_components_statusbar), Integer.valueOf(R.drawable.icon_components_icon), Integer.valueOf(R.drawable.icon_components_mms), Integer.valueOf(R.drawable.icon_components_contact), Integer.valueOf(R.drawable.icon_components_launcher), Integer.valueOf(R.drawable.icon_components_boot_animation), Integer.valueOf(R.drawable.icon_components_boot_audio), Integer.valueOf(R.drawable.icon_components_aod)};

    /* JADX INFO: renamed from: f */
    private ComponentCategoryView f8779f;

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return com.android.thememanager.basemodule.analysis.toq.hi;
    }

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Collections.addAll(arrayList, f8777c);
        Collections.addAll(arrayList2, f8778e);
        if (!com.android.thememanager.util.g1.wo()) {
            arrayList.remove("bootanimation");
            arrayList2.remove(Integer.valueOf(R.drawable.icon_components_boot_animation));
            arrayList.remove("bootaudio");
            arrayList2.remove(Integer.valueOf(R.drawable.icon_components_boot_audio));
        }
        if (!C1819o.m7159l()) {
            arrayList.remove("aod");
            arrayList2.remove(Integer.valueOf(R.drawable.icon_components_aod));
        }
        ComponentCategoryView componentCategoryView = (ComponentCategoryView) inflater.inflate(R.layout.component_category, (ViewGroup) null);
        this.f8779f = componentCategoryView;
        componentCategoryView.setComponentItems(arrayList, null, arrayList2, 0);
        return this.f8779f;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f8779f.m10230s();
    }
}
