package com.android.thememanager.settings;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.C0924e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.WallpaperDetailActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.settings.presenter.C2604s;
import com.android.thememanager.settings.subsettings.WallpaperSubVAdapter;
import com.android.thememanager.util.uc;
import i1.C6077k;
import java.util.List;
import miuix.appcompat.app.AbstractC6946k;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperSubSettingActivity extends AbstractActivityC1717k implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: e */
    public static final String f14949e = "onlySystem";

    /* JADX INFO: renamed from: j */
    private static final String f14950j = ":miui:starting_window_label";

    /* JADX INFO: renamed from: c */
    private boolean f14951c = false;

    /* JADX INFO: renamed from: f */
    private com.android.thememanager.fu4 f14952f;

    /* JADX INFO: renamed from: l */
    private C2604s f14953l;

    /* JADX INFO: renamed from: r */
    private WallpaperSubVAdapter f14954r;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i9jn(View view) {
        v0af();
    }

    private void v0af() {
        startActivity(com.android.thememanager.toq.toq(this, "wallpaper"));
        com.android.thememanager.basemodule.analysis.kja0.f7l8(yz(), com.android.thememanager.basemodule.analysis.toq.zkf2, com.android.thememanager.basemodule.analysis.toq.de95);
        C1708s.f7l8().ld6().ni7(C1706p.kja0(yz(), com.android.thememanager.basemodule.analysis.toq.zkf2, com.android.thememanager.basemodule.analysis.toq.de95));
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.analysis.f7l8.InterfaceC1696k
    /* JADX INFO: renamed from: f */
    public String mo6320f() {
        return "settings";
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return 1;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null && requestCode == 102) {
            if (!TextUtils.isEmpty(data.getType()) && data.getType().startsWith("video")) {
                com.android.thememanager.v9.f7l8.fn3e(this, data.getDataString());
                return;
            }
            Intent intent = new Intent(this, (Class<?>) WallpaperDetailActivity.class);
            intent.setAction(uc.f16827n);
            intent.setData(data.getData());
            intent.putExtra(":miui:starting_window_label", "");
            startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(InterfaceC1357q.f53866eqxt);
        this.f14951c = getIntent().getBooleanExtra(f14949e, false);
        this.f14953l = (C2604s) new C0924e(this).m4420k(C2604s.class);
        AbstractC6946k appCompatActionBar = getAppCompatActionBar();
        if (appCompatActionBar != null) {
            if (!TextUtils.isEmpty(stringExtra)) {
                appCompatActionBar.mo173v(stringExtra);
            }
            if (!this.f14951c) {
                ImageView imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.ic_theme_setting);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f15106k.i9jn(view);
                    }
                });
                C6077k.f7l8(imageView);
                appCompatActionBar.ij(imageView);
                C1812k.m7106k(imageView, R.string.app_name);
            }
        }
        setContentView(R.layout.activity_wallpaper_sub_setting);
        m6711e(savedInstanceState);
        this.f14952f = C2082k.zy().m8001n().m10535g("wallpaper");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        this.f14954r = new WallpaperSubVAdapter(this, !this.f14951c);
        this.f14953l.hyr(zsr0()).m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.settings.n5r1
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f15117k.r8s8((List) obj);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.f14954r);
        String str = this.f14951c ? com.android.thememanager.basemodule.analysis.toq.ph5d : com.android.thememanager.basemodule.analysis.toq.p2sg;
        this.f9864s = str;
        com.android.thememanager.basemodule.analysis.kja0.m6641s(com.android.thememanager.basemodule.analysis.toq.cjaj, str, null, null);
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.cjaj, C1706p.kja0(this.f9864s, null, ""));
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f14954r.getItemCount() > 0 && !this.f14951c) {
            this.f14953l.n5r1(1);
        }
        this.f14954r.m9165f();
    }

    public void r8s8(List<com.android.thememanager.settings.subsettings.f7l8> list) {
        this.f14954r.ncyb(list);
    }

    public com.android.thememanager.fu4 was() {
        return this.f14952f;
    }

    public boolean zsr0() {
        return this.f14951c;
    }
}
