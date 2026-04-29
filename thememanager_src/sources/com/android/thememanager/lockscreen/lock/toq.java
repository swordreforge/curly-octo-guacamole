package com.android.thememanager.lockscreen.lock;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.google.gson.C4871g;
import kotlin.jvm.internal.d2ok;
import miuix.provider.C7317k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LockScreenInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private ContentObserver f12400k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private TemplateConfig f60363toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final Handler f60364zy = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.toq$k */
    /* JADX INFO: compiled from: LockScreenInfo.kt */
    public static final class C2113k extends ContentObserver {
        C2113k(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            toq.this.m8086k();
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public TemplateConfig m8086k() {
        TemplateConfig templateConfig = (TemplateConfig) new C4871g().n7h(Settings.Secure.getString(bf2.toq.toq().getContentResolver(), "constant_lockscreen_info"), TemplateConfig.class);
        this.f60363toq = templateConfig;
        return templateConfig;
    }

    public void toq() {
        ContentResolver contentResolver;
        this.f12400k = new C2113k(this.f60364zy);
        Context qVar = bf2.toq.toq();
        if (qVar == null || (contentResolver = qVar.getContentResolver()) == null) {
            return;
        }
        Uri uriLd6 = C7317k.toq.ld6("constant_lockscreen_info");
        ContentObserver contentObserver = this.f12400k;
        d2ok.n7h(contentObserver, "null cannot be cast to non-null type android.database.ContentObserver");
        contentResolver.registerContentObserver(uriLd6, false, contentObserver);
    }
}
