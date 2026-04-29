package com.theme.loopwallpaper.fragment;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.AbstractC0067g;
import androidx.activity.result.InterfaceC0068k;
import androidx.activity.result.contract.toq;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.util.h7am;
import com.android.thememanager.util.jbh;
import com.android.thememanager.util.kja0;
import com.theme.loopwallpaper.activity.AsyncTaskC5437k;
import com.theme.loopwallpaper.activity.WallpaperLoopMoreSettingActivity;
import com.theme.loopwallpaper.model.LoopWallpaper;
import com.theme.loopwallpaper.view.DiyWallpaperPreference;
import ek5k.C6002g;
import java.util.ArrayList;
import miuix.appcompat.app.dd;
import miuix.preference.qrj;
import p000a.InterfaceC0001q;
import p001b.f7l8;

/* JADX INFO: renamed from: com.theme.loopwallpaper.fragment.q */
/* JADX INFO: compiled from: WallpaperLoopPreferenceFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5441q extends qrj implements Preference.zy, Preference.InterfaceC0998q, com.android.thememanager.basemodule.async.toq<Void, Void, ArrayList<LoopWallpaper>>, InterfaceC0001q {

    /* JADX INFO: renamed from: f */
    public DiyWallpaperPreference.InterfaceC5445g f30326f;

    /* JADX INFO: renamed from: g */
    private DiyWallpaperPreference f30327g;

    /* JADX INFO: renamed from: h */
    private String f30328h;

    /* JADX INFO: renamed from: i */
    private dd f30329i;

    /* JADX INFO: renamed from: k */
    private CheckBoxPreference f30330k;

    /* JADX INFO: renamed from: l */
    private kja0 f30331l;

    /* JADX INFO: renamed from: n */
    private DiyWallpaperPreference f30332n;

    /* JADX INFO: renamed from: p */
    private Preference f30333p;

    /* JADX INFO: renamed from: q */
    private CheckBoxPreference f30334q;

    /* JADX INFO: renamed from: r */
    private int f30335r;

    /* JADX INFO: renamed from: s */
    private PreferenceCategory f30336s;

    /* JADX INFO: renamed from: t */
    private AbstractC0067g f30337t;

    /* JADX INFO: renamed from: y */
    private PreferenceCategory f30338y;

    /* JADX INFO: renamed from: z */
    private AsyncTaskC5437k f30339z;

    /* JADX INFO: renamed from: com.theme.loopwallpaper.fragment.q$k */
    /* JADX INFO: compiled from: WallpaperLoopPreferenceFragment.java */
    class k implements p000a.zy {
        k() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            C5441q.this.f30326f.mo18557k();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                lvui.ki(C5441q.this.getContext(), false);
            }
        }
    }

    private void ix(Intent data) {
        ArrayList arrayList = new ArrayList();
        Uri data2 = data.getData();
        ClipData clipData = data.getClipData();
        if (data2 != null) {
            arrayList.add(data2);
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                arrayList.add(clipData.getItemAt(i2).getUri());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AsyncTaskC5437k asyncTaskC5437k = new AsyncTaskC5437k(this, arrayList, this.f30335r);
        this.f30339z = asyncTaskC5437k;
        asyncTaskC5437k.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    private void kiv() {
        dd ddVar = new dd(getActivity());
        this.f30329i = ddVar;
        ddVar.y2(0);
        this.f30329i.show();
    }

    private void kx3() {
        this.f30326f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ps(String str, DialogInterface dialogInterface, int i2) {
        if (com.theme.loopwallpaper.controller.toq.f30304t.equals(str)) {
            z4t(false, this.f30330k.isChecked());
        } else {
            z4t(this.f30334q.isChecked(), false);
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u38j(String str, Object obj, DialogInterface dialogInterface, int i2) {
        v5yj(str, obj);
        dialogInterface.dismiss();
    }

    private void uf() {
        AsyncTaskC5437k asyncTaskC5437k = this.f30339z;
        if (asyncTaskC5437k != null) {
            asyncTaskC5437k.toq(this);
        }
    }

    private void v5yj(String key, Object newValue) {
        Boolean bool = (Boolean) newValue;
        jbh jbhVar = bool.booleanValue() ? new jbh(jbh.f16567g, null, null, "theme") : null;
        key.hashCode();
        if (key.equals(com.theme.loopwallpaper.controller.toq.f30304t)) {
            C1708s.f7l8().ld6().ni7(C1706p.m6649g(com.android.thememanager.basemodule.analysis.toq.c3, bool.booleanValue()));
            z4t(bool.booleanValue(), this.f30330k.isChecked());
            if (bool.booleanValue()) {
                com.theme.loopwallpaper.controller.toq.m18517z(bool.booleanValue(), com.theme.loopwallpaper.controller.toq.ki(1));
                jbhVar.m9834g(bf2.toq.toq(), new Intent(miuix.android.content.toq.f86697toq));
                return;
            } else {
                if (com.theme.loopwallpaper.controller.toq.ki(1)) {
                    return;
                }
                com.theme.loopwallpaper.controller.toq.m18517z(false, false);
                return;
            }
        }
        if (key.equals(com.theme.loopwallpaper.controller.toq.f72552mcp)) {
            C1708s.f7l8().ld6().ni7(C1706p.m6649g(com.android.thememanager.basemodule.analysis.toq.so, bool.booleanValue()));
            z4t(this.f30334q.isChecked(), bool.booleanValue());
            if (!bool.booleanValue()) {
                if (com.theme.loopwallpaper.controller.toq.ki(0)) {
                    return;
                }
                com.theme.loopwallpaper.controller.toq.m18517z(false, false);
            } else {
                com.theme.loopwallpaper.controller.toq.m18517z(com.theme.loopwallpaper.controller.toq.ki(0), bool.booleanValue());
                Intent intent = new Intent(f7l8.f53803oph);
                intent.putExtra(h7am.f16527q, 0);
                jbhVar.m9834g(bf2.toq.toq(), intent);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private void m18524w() {
        dd ddVar = this.f30329i;
        if (ddVar == null || !ddVar.isShowing()) {
            return;
        }
        this.f30329i.dismiss();
    }

    private void z4t(boolean lockscreenEnabled, boolean wallpaperEnabled) {
        this.f30333p.fnq8(lockscreenEnabled || wallpaperEnabled);
        this.f30334q.setChecked(lockscreenEnabled);
        this.f30330k.setChecked(wallpaperEnabled);
        if (lockscreenEnabled) {
            getPreferenceScreen().h7am(this.f30327g);
        } else {
            getPreferenceScreen().pc(this.f30327g);
        }
        if (wallpaperEnabled) {
            getPreferenceScreen().h7am(this.f30332n);
        } else {
            getPreferenceScreen().pc(this.f30332n);
        }
    }

    @Override // p000a.InterfaceC0001q
    public AbstractC0067g a5id(toq.C0066y permissions, InterfaceC0068k callback) {
        return registerForActivityResult(permissions, callback);
    }

    public void bih() {
        ArrayList<LoopWallpaper> arrayListF7l8 = com.theme.loopwallpaper.controller.toq.m18516y().f7l8(0);
        ArrayList<LoopWallpaper> arrayListF7l82 = com.theme.loopwallpaper.controller.toq.m18516y().f7l8(1);
        DiyWallpaperPreference diyWallpaperPreference = this.f30327g;
        if (diyWallpaperPreference != null) {
            diyWallpaperPreference.ukdy(arrayListF7l8);
        }
        DiyWallpaperPreference diyWallpaperPreference2 = this.f30332n;
        if (diyWallpaperPreference2 != null) {
            diyWallpaperPreference2.ukdy(arrayListF7l82);
        }
    }

    @Override // p000a.InterfaceC0001q
    public p000a.zy jz5() {
        return m2t();
    }

    public p000a.zy m2t() {
        return new k();
    }

    @Override // com.android.thememanager.basemodule.async.toq
    public void n7h() {
        kiv();
    }

    public void nnh(@zy.lvui DiyWallpaperPreference.InterfaceC5445g callBack) {
        this.f30326f = callBack;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 0 && requestCode != 1) {
            bih();
        } else if (data == null) {
            bih();
        } else {
            this.f30335r = requestCode;
            ix(data);
        }
    }

    @Override // miuix.preference.qrj, androidx.preference.qrj, androidx.fragment.app.Fragment
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        this.f30337t = lvui.n5r1(this);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.preference.qrj
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.wallpaper_loop_preferences);
        this.f30334q = (CheckBoxPreference) findPreference(com.theme.loopwallpaper.controller.toq.f30304t);
        this.f30330k = (CheckBoxPreference) findPreference(com.theme.loopwallpaper.controller.toq.f72552mcp);
        this.f30327g = new DiyWallpaperPreference(getActivity(), this, this.f30337t);
        PreferenceCategory preferenceCategory = new PreferenceCategory(getActivity());
        this.f30338y = preferenceCategory;
        preferenceCategory.zsr0(R.layout.normal_divider);
        PreferenceCategory preferenceCategory2 = new PreferenceCategory(getActivity());
        this.f30336s = preferenceCategory2;
        preferenceCategory2.zsr0(R.layout.normal_divider);
        this.f30327g.zsr0(R.layout.diy_wallpaper_preference_layout);
        this.f30327g.gbni(com.theme.loopwallpaper.controller.toq.f72546jk);
        this.f30327g.kcsr(R.string.wallpaper_loop_my_lock_wallpaper);
        this.f30327g.w831(R.string.wallpaper_loop_manage);
        DiyWallpaperPreference diyWallpaperPreference = new DiyWallpaperPreference(getActivity(), this, this.f30337t);
        this.f30332n = diyWallpaperPreference;
        diyWallpaperPreference.zsr0(R.layout.diy_wallpaper_preference_layout);
        this.f30332n.gbni(com.theme.loopwallpaper.controller.toq.f72535a9);
        this.f30332n.kcsr(R.string.wallpaper_loop_my_desk_wallpaper);
        this.f30332n.w831(R.string.wallpaper_loop_manage);
        this.f30333p = findPreference(com.theme.loopwallpaper.controller.toq.f72543fti);
        this.f30334q.r8s8(1);
        this.f30327g.r8s8(2);
        this.f30338y.r8s8(3);
        getPreferenceScreen().h7am(this.f30338y);
        this.f30330k.r8s8(4);
        this.f30332n.r8s8(5);
        this.f30336s.r8s8(6);
        getPreferenceScreen().h7am(this.f30336s);
        this.f30333p.r8s8(7);
        this.f30334q.i9jn(this);
        this.f30330k.i9jn(this);
        this.f30327g.i9jn(this);
        this.f30332n.i9jn(this);
        this.f30333p.ltg8(this);
        bih();
        this.f30328h = getActivity().getIntent().getStringExtra(f7l8.nod);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        kja0 kja0Var = this.f30331l;
        if (kja0Var != null) {
            kja0Var.m9847k();
        }
        uf();
        kx3();
    }

    @Override // androidx.preference.Preference.zy
    public boolean onPreferenceChange(Preference preference, final Object newValue) {
        final String strFn3e = preference.fn3e();
        if (com.theme.loopwallpaper.controller.toq.f30304t.equals(strFn3e) || com.theme.loopwallpaper.controller.toq.f72552mcp.equals(strFn3e)) {
            if (((Boolean) newValue).booleanValue() && (kja0.m9846g("loop", strFn3e) || kja0.f7l8("loop", strFn3e))) {
                this.f30331l = new kja0().m9848n(getActivity(), kja0.toq(), true, new DialogInterface.OnClickListener() { // from class: com.theme.loopwallpaper.fragment.toq
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        this.f30341k.u38j(strFn3e, newValue, dialogInterface, i2);
                    }
                }, new DialogInterface.OnClickListener() { // from class: com.theme.loopwallpaper.fragment.zy
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        this.f30344k.ps(strFn3e, dialogInterface, i2);
                    }
                }).m9850y();
                return true;
            }
            v5yj(strFn3e, newValue);
        }
        return true;
    }

    @Override // androidx.preference.Preference.InterfaceC0998q
    public boolean onPreferenceClick(Preference preference) {
        if (!com.theme.loopwallpaper.controller.toq.f72543fti.equals(preference.fn3e())) {
            return true;
        }
        Intent intent = new Intent(getActivity(), (Class<?>) WallpaperLoopMoreSettingActivity.class);
        intent.putExtra(f7l8.nod, this.f30328h);
        startActivity(intent);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.theme.loopwallpaper.controller.toq.n7h();
        z4t(com.theme.loopwallpaper.controller.toq.ki(0), com.theme.loopwallpaper.controller.toq.ki(1));
    }

    @Override // com.android.thememanager.basemodule.async.toq
    /* JADX INFO: renamed from: ra, reason: merged with bridge method [inline-methods] */
    public void ij(ArrayList<LoopWallpaper> loopWallpapers) {
        nn86.m7150k(R.string.wallpaper_loop_add_success, 0);
        m18524w();
        com.theme.loopwallpaper.controller.toq.zy(this.f30335r);
        com.theme.loopwallpaper.controller.toq.m18517z(com.theme.loopwallpaper.controller.toq.ki(0), com.theme.loopwallpaper.controller.toq.ki(1));
        bih();
    }
}
