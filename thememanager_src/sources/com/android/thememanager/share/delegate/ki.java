package com.android.thememanager.share.delegate;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.ArrayMap;
import com.android.thememanager.R;
import com.android.thememanager.share.C2702g;
import com.android.thememanager.share.C2716y;
import com.android.thememanager.share.InterfaceC2707q;

/* JADX INFO: compiled from: SystemShareDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
class ki extends AbstractC2694g {
    ki(Bundle shareConfiguration) {
        super(0, shareConfiguration);
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    public CharSequence f7l8() {
        Activity qVar = toq();
        if (qVar == null) {
            return null;
        }
        return qVar.getResources().getString(R.string.miuishare_title_more);
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: g */
    public ArrayMap<String, Object> mo9428g(Intent shareIntent) {
        ArrayMap<String, Object> arrayMap = new ArrayMap<>();
        arrayMap.put("type", "more");
        Bundle bundle = this.f61062zy;
        arrayMap.put("contentType", bundle != null ? bundle.getString(C2702g.f61066a9, "") : null);
        return arrayMap;
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: k */
    public void mo9429k() {
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: p */
    public void mo9431p(Intent shareIntent, InterfaceC2707q callback) {
        Activity qVar = toq();
        if (qVar == null) {
            return;
        }
        com.android.thememanager.share.ld6.fti(qVar, shareIntent);
        C2716y.m9478k(0, -2);
        callback.mo9416k();
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: q */
    protected String mo9432q() {
        return null;
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: y */
    public boolean mo9434y(Intent shareIntent) {
        return true;
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    public Drawable zy(Intent shareIntent) {
        Activity qVar = toq();
        if (qVar == null) {
            return null;
        }
        return qVar.getResources().getDrawable(R.drawable.ic_share_more);
    }
}
