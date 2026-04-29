package com.android.thememanager.share.delegate;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.ArrayMap;
import com.android.thememanager.R;
import com.android.thememanager.share.C2702g;
import com.android.thememanager.share.InterfaceC2707q;

/* JADX INFO: compiled from: WeiboShareDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
public class t8r extends AbstractC2694g {
    public t8r(int shareFlag, Bundle shareConfiguration) {
        super(shareFlag, shareConfiguration);
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    public CharSequence f7l8() {
        Activity qVar = toq();
        if (qVar == null) {
            return null;
        }
        return qVar.getResources().getString(R.string.share_to_weibo);
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: g */
    public ArrayMap<String, Object> mo9428g(Intent shareIntent) {
        ArrayMap<String, Object> arrayMap = new ArrayMap<>();
        arrayMap.put("type", "weibo");
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
        Uri uri = (Uri) shareIntent.getParcelableExtra("android.intent.extra.STREAM");
        com.android.thememanager.detail.theme.util.toq.m7749s(toq(), shareIntent.getStringExtra("android.intent.extra.SUBJECT"), uri == null ? shareIntent.getStringExtra("android.intent.extra.TEXT") : shareIntent.getStringExtra(C2702g.f61073gvn7), uri);
        if (callback != null) {
            callback.mo9416k();
        }
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: q */
    protected String mo9432q() {
        return com.android.thememanager.detail.theme.util.toq.f11188g;
    }
}
