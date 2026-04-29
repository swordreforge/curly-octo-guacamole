package com.android.thememanager.mine.remote.view.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.mine.remote.view.fragment.C2186g;
import com.android.thememanager.mine.remote.view.fragment.C2188n;
import com.android.thememanager.mine.remote.view.fragment.f7l8;
import com.android.thememanager.mine.remote.widget.C2197k;
import com.android.thememanager.util.gbni;
import com.android.thememanager.wallpaper.C2949g;
import com.android.thememanager.wallpaper.InterfaceC2950k;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
public class MineResourceTabActivity extends zy implements InterfaceC2950k {

    /* JADX INFO: renamed from: a */
    public static final String f12839a = "local";

    /* JADX INFO: renamed from: b */
    protected static final String f12840b = "com.android.thememanager.activity.LocalResourceListFragment";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final String f60460bo = "purchase";

    /* JADX INFO: renamed from: u */
    public static final String f12841u = "like";

    /* JADX INFO: renamed from: v */
    private static final String f12842v = "MineResourceTabActivity";

    /* JADX INFO: renamed from: x */
    public static final String f12843x = "favorite";

    public static Intent sok(Context context, String resCode) {
        if (!"aod".equals(resCode) && !"fonts".equals(resCode) && !"icons".equals(resCode) && !"theme".equals(resCode) && !"videowallpaper".equals(resCode) && !"widget_suit".equals(resCode) && !"wallpaper".equals(resCode) && !"largeicons".equals(resCode)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) MineResourceTabActivity.class);
        intent.putExtra("REQUEST_RESOURCE_CODE", resCode);
        return intent;
    }

    @Override // com.android.thememanager.mine.remote.view.activity.zy
    protected void etdu() {
        String stringExtra = getIntent().getStringExtra("REQUEST_RESOURCE_CODE");
        com.android.thememanager.basemodule.model.flextab.toq toqVarM5740i = p001b.toq.m5740i(stringExtra);
        if (toqVarM5740i != null) {
            if (toqVarM5740i.mo6880y(p001b.toq.f7207f)) {
                zsr0("local", getString(R.string.mine_tab_title_local), C2320q.mcp(stringExtra), com.android.thememanager.mine.remote.view.fragment.zy.yp31(stringExtra, p001b.toq.f7207f));
            }
            if (toqVarM5740i.mo6880y(p001b.toq.f7213l)) {
                zsr0("favorite", getString(R.string.mine_tab_title_favorite), C2188n.class, com.android.thememanager.mine.remote.view.fragment.zy.yp31(stringExtra, p001b.toq.f7213l));
            }
            if (toqVarM5740i.mo6880y(p001b.toq.f7219r)) {
                zsr0("like", getString(R.string.mine_tab_title_like), C2186g.class, com.android.thememanager.mine.remote.view.fragment.zy.yp31(stringExtra, p001b.toq.f7219r));
            }
            if (toqVarM5740i.mo6880y(p001b.toq.f7221t)) {
                zsr0(f60460bo, getString(R.string.mine_tab_title_purchase), f7l8.class, com.android.thememanager.mine.remote.view.fragment.zy.yp31(stringExtra, p001b.toq.f7221t));
            }
        }
    }

    @Override // com.android.thememanager.wallpaper.InterfaceC2950k
    /* JADX INFO: renamed from: g */
    public void mo6375g() {
        recreate();
    }

    @Override // com.android.thememanager.mine.remote.view.activity.zy, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        this.f12851f = com.android.thememanager.basemodule.analysis.toq.kn7;
        C2949g c2949g = C2949g.f17747k;
        if (c2949g.ld6()) {
            getWindow().setColorMode(1);
        }
        c2949g.m10467q(this);
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Uri data = getIntent().getData();
            if (data.getPath().contains("widget")) {
                getIntent().putExtra("REQUEST_RESOURCE_CODE", "widget_suit");
                getIntent().putExtra(InterfaceC1357q.f53857d2ok, p001b.toq.kja0("widget_suit"));
                if (C2197k.f12943s.equals(data.getQueryParameter("page"))) {
                    getIntent().putExtra(InterfaceC1357q.f53969yz, 1);
                }
            }
        }
        super.onCreate(savedInstanceState);
        gbni.kja0(getIntent());
    }

    @Override // com.android.thememanager.mine.remote.view.activity.zy, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C2949g.f17747k.m10468s(this);
    }

    @Override // com.android.thememanager.mine.remote.view.activity.zy
    protected String r8s8() {
        return null;
    }
}
