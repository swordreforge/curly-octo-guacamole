package com.android.thememanager.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.C0924e;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.presenter.C2308g;
import com.android.thememanager.settings.superwallpaper.widget.ApkSuperWallpaperItemView;
import com.android.thememanager.v9.adapter.C2844k;
import com.android.thememanager.v9.data.C2852n;
import java.util.ArrayList;
import miuix.appcompat.app.AbstractC6946k;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class SuperWallpaperListActivity extends AbstractActivityC1717k implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public static final int f8845a = 80;

    /* JADX INFO: renamed from: b */
    private static final String f8846b = "SuperWallpaperListActivity";

    /* JADX INFO: renamed from: x */
    private static final String f8847x = "theme";

    /* JADX INFO: renamed from: c */
    private com.android.thememanager.basemodule.views.ld6 f8848c;

    /* JADX INFO: renamed from: e */
    private C2308g f8849e;

    /* JADX INFO: renamed from: f */
    private ViewGroup f8850f;

    /* JADX INFO: renamed from: j */
    private int f8851j;

    /* JADX INFO: renamed from: l */
    private C2844k f8852l;

    /* JADX INFO: renamed from: r */
    private RecyclerView f8855r;

    /* JADX INFO: renamed from: o */
    private final androidx.lifecycle.jp0y<Intent> f8854o = new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.lh
        @Override // androidx.lifecycle.jp0y
        public final void toq(Object obj) {
            this.f9166k.i9jn((Intent) obj);
        }
    };

    /* JADX INFO: renamed from: m */
    private BroadcastReceiver f8853m = new C1549k();

    /* JADX INFO: renamed from: com.android.thememanager.activity.SuperWallpaperListActivity$k */
    class C1549k extends BroadcastReceiver {
        C1549k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ArrayList<C2852n> arrayListM4388g;
            int intExtra = intent.getIntExtra("errorCode", 0);
            String stringExtra = intent.getStringExtra("packageName");
            if (intExtra == 4 && (arrayListM4388g = SuperWallpaperListActivity.this.f8849e.vyq().m4388g()) != null && arrayListM4388g.size() > 0 && !TextUtils.isEmpty(stringExtra)) {
                SuperWallpaperListActivity.this.f8849e.m8442o(arrayListM4388g, stringExtra);
                Log.d(SuperWallpaperListActivity.f8846b, "super wallpaper install success " + stringExtra);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i9jn(Intent intent) {
        if (TextUtils.equals(intent.getAction(), ApkSuperWallpaperItemView.zmmu)) {
            setResult(-1, intent);
        }
    }

    private void zsr0() {
        if (this.f8850f == null) {
            ViewGroup viewGroupM7337k = this.f8848c.m7337k((ViewStub) findViewById(R.id.webview_reload_stub), 2);
            this.f8850f = viewGroupM7337k;
            viewGroupM7337k.findViewById(R.id.local_entry).setVisibility(8);
            ((TextView) this.f8850f.findViewById(R.id.reload_info)).setText(com.android.thememanager.basemodule.utils.mcp.m7138k() && com.android.thememanager.basemodule.utils.mcp.m7139n() ? R.string.resource_no_result : R.string.no_data);
            this.f8850f.setOnClickListener(this);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return 1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        this.f8850f.setVisibility(8);
        this.f8855r.setVisibility(0);
        this.f8849e.nn86(this.f8851j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false) && getIntent().getIntExtra(com.android.thememanager.f7l8.f11607n, -1) == 0) {
            com.android.thememanager.util.gc3c.ni7(this);
        }
        setContentView(R.layout.activity_super_wallpaper_list);
        AbstractC6946k appCompatActionBar = getAppCompatActionBar();
        if (appCompatActionBar != null) {
            appCompatActionBar.mo173v(getString(R.string.super_wallpaper_list_label));
            com.android.thememanager.basemodule.utils.o1t.wvg(appCompatActionBar, mo6344m());
        }
        this.f8851j = !"theme".equals(getIntent().getScheme()) ? 1 : 0;
        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.hj, com.android.thememanager.basemodule.analysis.toq.el7, String.valueOf(this.f8851j)));
        this.f8855r = (RecyclerView) findViewById(R.id.super_wallpaper_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        this.f8855r.setLayoutManager(linearLayoutManager);
        this.f8855r.setSpringEnabled(false);
        C2844k c2844k = new C2844k();
        this.f8852l = c2844k;
        this.f8855r.setAdapter(c2844k);
        this.f8848c = new com.android.thememanager.basemodule.views.ld6();
        C2308g c2308g = (C2308g) new C0924e(this).m4420k(C2308g.class);
        this.f8849e = c2308g;
        c2308g.vyq().m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.ngy
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9265k.r8s8((ArrayList) obj);
            }
        });
        this.f8849e.nn86(this.f8851j);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
        registerReceiver(this.f8853m, intentFilter);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f8853m);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (!getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false) || com.android.thememanager.basemodule.utils.y9n.jk()) {
            return;
        }
        finish();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        ArrayList<C2852n> arrayListM4388g = this.f8849e.vyq().m4388g();
        if (arrayListM4388g == null || arrayListM4388g.size() <= 0) {
            return;
        }
        this.f8849e.m8441j(arrayListM4388g);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onStart() {
        super.onStart();
        com.android.thememanager.basemodule.utils.ni7.m7146k().toq(ApkSuperWallpaperItemView.zmmu, this.f8854o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    public void onStop() {
        super.onStop();
        com.android.thememanager.basemodule.utils.ni7.m7146k().m7147n(ApkSuperWallpaperItemView.zmmu, this.f8854o);
    }

    public void r8s8(ArrayList<C2852n> list) {
        if (!com.android.thememanager.basemodule.utils.kja0.qrj(list)) {
            this.f8852l.ki(list);
            this.f8852l.notifyDataSetChanged();
        } else {
            zsr0();
            this.f8855r.setVisibility(8);
            this.f8850f.setVisibility(0);
        }
    }
}
