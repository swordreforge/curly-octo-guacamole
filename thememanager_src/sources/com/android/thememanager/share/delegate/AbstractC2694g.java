package com.android.thememanager.share.delegate;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.ArrayMap;
import com.android.thememanager.share.InterfaceC2707q;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.android.thememanager.share.delegate.g */
/* JADX INFO: compiled from: ShareDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2694g {

    /* JADX INFO: renamed from: k */
    protected WeakReference<Activity> f16009k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected int f61061toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected Bundle f61062zy;

    public AbstractC2694g(int shareFlag, Bundle shareConfiguration) {
        this.f61061toq = shareFlag;
        this.f61062zy = shareConfiguration;
    }

    public CharSequence f7l8() {
        return com.android.thememanager.share.ld6.m9451p(toq(), mo9432q());
    }

    /* JADX INFO: renamed from: g */
    public abstract ArrayMap<String, Object> mo9428g(Intent shareIntent);

    /* JADX INFO: renamed from: k */
    public abstract void mo9429k();

    /* JADX INFO: renamed from: n */
    public int m9430n() {
        return this.f61061toq;
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo9431p(Intent shareIntent, InterfaceC2707q callback);

    /* JADX INFO: renamed from: q */
    protected abstract String mo9432q();

    /* JADX INFO: renamed from: s */
    public void m9433s(Activity activity) {
        this.f16009k = new WeakReference<>(activity);
    }

    protected Activity toq() {
        WeakReference<Activity> weakReference = this.f16009k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public boolean mo9434y(Intent shareIntent) {
        return com.android.thememanager.share.ld6.n7h(toq(), mo9432q());
    }

    public Drawable zy(Intent shareIntent) {
        return com.android.thememanager.share.ld6.m9453s(toq(), mo9432q());
    }
}
