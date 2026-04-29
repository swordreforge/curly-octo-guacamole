package com.android.thememanager.activity;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1802c;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.ScreenShotReportManager;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.view.WallpaperView;
import com.android.thememanager.wallpaper.C2949g;
import com.android.thememanager.wallpaper.InterfaceC2950k;
import miuix.appcompat.app.AbstractC6946k;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes.dex */
public class WallpaperDetailActivity extends kja0 implements p001b.f7l8, InterfaceC1357q, InterfaceC1925p, com.android.thememanager.basemodule.analysis.toq, InterfaceC1789q, InterfaceC2950k {

    /* JADX INFO: renamed from: b */
    public static final String f8906b = "com.android.thememanager.action.REQUEST_PERMISSION";

    /* JADX INFO: renamed from: e */
    protected com.android.thememanager.controller.x2 f8908e;

    /* JADX INFO: renamed from: j */
    private WallpaperView.zy f8909j;

    /* JADX INFO: renamed from: c */
    private int f8907c = -1;

    /* JADX INFO: renamed from: o */
    private androidx.lifecycle.jp0y<Intent> f8911o = new C1558k();

    /* JADX INFO: renamed from: m */
    private p000a.zy f8910m = new toq();

    /* JADX INFO: renamed from: com.android.thememanager.activity.WallpaperDetailActivity$k */
    class C1558k implements androidx.lifecycle.jp0y<Intent> {
        C1558k() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(Intent intent) {
            if (!TextUtils.equals(intent.getAction(), "com.android.thememanager.action.REQUEST_PERMISSION") || com.android.thememanager.basemodule.utils.y9n.toq(33)) {
                return;
            }
            WallpaperDetailActivity wallpaperDetailActivity = WallpaperDetailActivity.this;
            if (com.android.thememanager.basemodule.utils.lvui.m7131s(wallpaperDetailActivity, wallpaperDetailActivity.f8910m)) {
                return;
            }
            WallpaperDetailActivity.this.f8910m.mo0k();
        }
    }

    class toq implements p000a.zy {
        toq() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            WallpaperDetailActivity.this.zkd();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(WallpaperDetailActivity.this, true);
            } else {
                WallpaperDetailActivity.this.finish();
            }
        }
    }

    private boolean bwp() {
        int iZ4 = z4(getIntent());
        this.f8907c = iZ4;
        return iZ4 != -1;
    }

    private int z4(final Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            if ("theme".equals(intent.getScheme()) || "http".equals(data.getScheme())) {
                String path = data.getPath();
                if (path != null) {
                    if (path.startsWith(InterfaceC1357q.f53850bz2)) {
                        return 5;
                    }
                    if (path.startsWith(InterfaceC1357q.f53894jz5)) {
                        return 6;
                    }
                    if (path.startsWith(InterfaceC1357q.f53947uj2j)) {
                        return 9;
                    }
                }
                return -1;
            }
            if ("gift".equals(intent.getScheme())) {
                return intent.getBooleanExtra(p001b.f7l8.f53811tww7, false) ? 8 : 7;
            }
            if (InterfaceC1357q.f53968yqrt.equals(data.getScheme())) {
                return 3;
            }
            if (InterfaceC1357q.f53939se.equals(intent.getScheme())) {
                return 4;
            }
        }
        int intExtra = intent.getIntExtra(InterfaceC1357q.f53965y2, 0);
        if (intExtra == 1) {
            return 1;
        }
        if (intExtra == 2 || intExtra == 4) {
            return 2;
        }
        return com.android.thememanager.util.uc.f16827n.equals(intent.getAction()) ? 10 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zkd() {
        Fragment fragmentCh = getSupportFragmentManager().ch(R.id.content);
        if (fragmentCh instanceof nme) {
            ((nme) fragmentCh).oei();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return com.android.thememanager.basemodule.analysis.toq.p2;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected boolean bo() {
        return false;
    }

    public void bz2(WallpaperView.zy listener) {
        this.f8909j = listener;
    }

    @Override // com.android.thememanager.wallpaper.InterfaceC2950k
    /* JADX INFO: renamed from: g */
    public void mo6375g() {
        if (C2949g.f17747k.ld6()) {
            getWindow().setColorMode(1);
        } else {
            getWindow().setColorMode(0);
        }
        zkd();
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentCh = getSupportFragmentManager().ch(R.id.content);
        if (fragmentCh instanceof nme) {
            ((nme) fragmentCh).qexj();
        }
        super.onBackPressed();
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        if (C1807g.m7081r()) {
            C1819o.m7160n(getIntent());
        }
        C2949g c2949g = C2949g.f17747k;
        if (c2949g.ld6()) {
            getWindow().setColorMode(1);
        }
        c2949g.m10467q(this);
        C1819o.n7h(this);
        C1802c.m7008k(getIntent());
        requestExtraWindowFeature(9);
        sok();
        C1819o.vyq(this);
        this.f8908e = C2082k.zy().m8001n().ld6(this.f9137r);
        if (!bwp()) {
            finish();
        }
        m6711e(savedInstanceState);
        super.onCreate(savedInstanceState);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        nme nmeVar = null;
        if (savedInstanceState == null) {
            nmeVar = new nme();
            supportFragmentManager.ki().m4317z(R.id.content, nmeVar).n7h();
            supportFragmentManager.a98o();
        } else {
            Fragment fragmentCh = supportFragmentManager.ch(R.id.content);
            if (fragmentCh instanceof nme) {
                nmeVar = (nme) fragmentCh;
            }
        }
        if (nmeVar != null) {
            if (getIntent().hasExtra(InterfaceC1357q.f53873fu4)) {
                Bundle bundle = new Bundle();
                bundle.putInt(InterfaceC1357q.f53873fu4, getIntent().getIntExtra(InterfaceC1357q.f53873fu4, 1));
                nmeVar.cyoe(bundle);
            }
            if (!nmeVar.qh4d(this)) {
                finish();
                return;
            }
        }
        AbstractC6946k abstractC6946kM6709b = m6709b();
        if (abstractC6946kM6709b != null) {
            abstractC6946kM6709b.mcp();
        }
        if (se()) {
            getWindow().addFlags(1024);
        }
        getLifecycle().mo4451k(new ScreenShotReportManager(this, se() ? com.android.thememanager.basemodule.analysis.toq.t0 : com.android.thememanager.basemodule.analysis.toq.iby, "wallpaper"));
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C2949g.f17747k.m10468s(this);
    }

    @Override // com.android.thememanager.activity.kja0, miuix.appcompat.app.t8r, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WallpaperView.zy zyVar = this.f8909j;
        if (zyVar != null) {
            if (keyCode != 21) {
                if (keyCode == 22 && zyVar.mo6449k(1)) {
                    this.f8909j.zy();
                }
            } else if (zyVar.mo6449k(-1)) {
                this.f8909j.toq();
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (com.android.thememanager.basemodule.utils.y9n.m7258z()) {
            C1819o.hb(this, 0);
            getWindow().getDecorView().setSystemUiVisibility(1792);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onStart() {
        super.onStart();
        com.android.thememanager.basemodule.utils.ni7.m7146k().toq("com.android.thememanager.action.REQUEST_PERMISSION", this.f8911o);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onStop() {
        super.onStop();
        com.android.thememanager.basemodule.utils.ni7.m7146k().m7147n("com.android.thememanager.action.REQUEST_PERMISSION", this.f8911o);
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return 0;
    }

    public boolean se() {
        int i2 = this.f8907c;
        return i2 == 2 || i2 == 3 || i2 == 5 || i2 == 9 || i2 == 6 || i2 == 7 || i2 == 8;
    }

    @Override // com.android.thememanager.activity.kja0
    protected void sok() {
        com.android.thememanager.basemodule.utils.y9n.m7255s();
        if (this.f9137r == null) {
            this.f9137r = C2082k.zy().m8001n().m10535g("wallpaper");
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected void y2(int newMode) {
        super.y2(newMode);
        if (newMode != 1 || com.android.thememanager.basemodule.utils.y9n.toq(33) || com.android.thememanager.basemodule.utils.lvui.m7131s(this, this.f8910m)) {
            return;
        }
        this.f8910m.mo0k();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
        super.y9n(agree);
        if ((!agree && com.android.thememanager.basemodule.privacy.x2.x2()) || com.android.thememanager.basemodule.utils.y9n.toq(33) || com.android.thememanager.basemodule.utils.lvui.m7131s(this, this.f8910m)) {
            return;
        }
        this.f8910m.mo0k();
    }

    public int yqrt() {
        return this.f8907c;
    }
}
