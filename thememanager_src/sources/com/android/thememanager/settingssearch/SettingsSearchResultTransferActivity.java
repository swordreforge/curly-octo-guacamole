package com.android.thememanager.settingssearch;

import android.app.Activity;
import android.content.Intent;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.x9kr;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.settings.WallpaperMiuiTabActivity;
import com.android.thememanager.settings.personalize.activity.PersonalizeActivity;
import com.android.thememanager.settings.personalize.x2;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;
import p001b.InterfaceC1357q;
import yz.C7794k;

/* JADX INFO: compiled from: SettingsSearchResultTransferActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SettingsSearchResultTransferActivity extends Activity {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2688k f15949k = new C2688k(null);

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final String f15950q = "SettingsSearchResultTransferActivity";

    /* JADX INFO: renamed from: com.android.thememanager.settingssearch.SettingsSearchResultTransferActivity$k */
    /* JADX INFO: compiled from: SettingsSearchResultTransferActivity.kt */
    public static final class C2688k {
        private C2688k() {
        }

        public /* synthetic */ C2688k(ni7 ni7Var) {
            this();
        }
    }

    private final void f7l8() {
        if (C1819o.dd(this)) {
            nn86.m7150k(R.string.multiwindow_no_support, 0);
        } else {
            startActivity(C1807g.m7081r() ? new Intent(this, (Class<?>) PersonalizeActivity.class) : x2.m9126k(x2.f60842zy));
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m9387g() {
        startActivity(zy.f15983k.m9403k(this, zy.f15984q));
    }

    /* JADX INFO: renamed from: k */
    private final void m9388k() {
        startActivity(x2.m9126k(x2.f15356g));
    }

    private final void ld6() {
        if (!C1819o.dd(this) || C1819o.m7164r(this)) {
            startActivity(x2.m9126k(x2.f15360q));
        } else {
            nn86.m7150k(R.string.multiwindow_no_support, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m9389n() {
        startActivity(x2.m9126k(x2.f15362y));
    }

    /* JADX INFO: renamed from: p */
    private final void m9390p() {
        startActivity(zy.f15983k.m9403k(this, zy.f61050zy));
    }

    /* JADX INFO: renamed from: q */
    private final void m9391q() {
        startActivity(zy.f15983k.m9403k(this, zy.f61049toq));
    }

    /* JADX INFO: renamed from: s */
    private final void m9392s() {
        startActivity(x2.m9126k(x2.f15361s));
    }

    private final void toq() {
        startActivity(x2.m9126k(x2.f15359p));
    }

    private final void x2() {
        if (!C1819o.dd(this) || C1819o.m7164r(this)) {
            startActivity(x2.m9126k(x2.f15358n));
        } else {
            nn86.m7150k(R.string.multiwindow_no_support, 0);
        }
    }

    /* JADX INFO: renamed from: y */
    private final void m9393y() {
        List<PageGroup> listM9185k = new com.android.thememanager.settings.subsettings.x2().m9185k(this);
        Intent intent = new Intent(this, (Class<?>) WallpaperMiuiTabActivity.class);
        intent.putExtra(InterfaceC1357q.f53943tfm, false);
        intent.putExtra(InterfaceC1357q.f53866eqxt, getString(R.string.title_my_wallpaper));
        d2ok.n7h(listM9185k, "null cannot be cast to non-null type java.io.Serializable");
        intent.putExtra(InterfaceC1357q.f53865ek5k, (Serializable) listM9185k);
        intent.putExtra(InterfaceC1357q.f53949uv6, 10);
        intent.putExtra("category_type", 1);
        startActivity(intent);
    }

    private final void zy() {
        startActivity(x2.m9126k(x2.f60839f7l8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(@mub.InterfaceC7395n android.os.Bundle r3) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settingssearch.SettingsSearchResultTransferActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(@InterfaceC7396q Intent intent) {
        d2ok.m23075h(intent, "intent");
        try {
            intent.putExtra(x9kr.f10438g, com.android.thememanager.basemodule.analysis.toq.iqz);
            super.startActivity(intent);
        } catch (Exception e2) {
            C7794k.m28198s(f15950q, "doThemeCardClick: ", e2);
        }
    }
}
