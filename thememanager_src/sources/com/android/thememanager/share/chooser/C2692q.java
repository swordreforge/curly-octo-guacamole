package com.android.thememanager.share.chooser;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import android.view.View;
import com.android.thememanager.share.delegate.AbstractC2694g;

/* JADX INFO: renamed from: com.android.thememanager.share.chooser.q */
/* JADX INFO: compiled from: ShareInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2692q {

    /* JADX INFO: renamed from: k */
    private final Intent f15999k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AbstractC2694g f61057toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final View.OnClickListener f61058zy;

    public C2692q(Intent intent, AbstractC2694g shareDelegate, View.OnClickListener listener) {
        this.f15999k = intent;
        this.f61057toq = shareDelegate;
        this.f61058zy = listener;
    }

    /* JADX INFO: renamed from: k */
    public int m9410k() {
        return this.f61057toq.m9430n();
    }

    /* JADX INFO: renamed from: n */
    public ArrayMap<String, Object> m9411n() {
        return this.f61057toq.mo9428g(this.f15999k);
    }

    /* JADX INFO: renamed from: q */
    public CharSequence m9412q() {
        return this.f61057toq.f7l8();
    }

    public Drawable toq() {
        return this.f61057toq.zy(this.f15999k);
    }

    public View.OnClickListener zy() {
        return this.f61058zy;
    }
}
