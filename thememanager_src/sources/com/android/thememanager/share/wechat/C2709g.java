package com.android.thememanager.share.wechat;

import android.content.Intent;
import android.os.Bundle;
import android.util.ArrayMap;
import com.android.thememanager.share.C2702g;
import com.android.thememanager.share.C2706p;
import com.android.thememanager.share.InterfaceC2707q;
import com.android.thememanager.wxapi.WXEntryActivity;

/* JADX INFO: renamed from: com.android.thememanager.share.wechat.g */
/* JADX INFO: compiled from: WechatShareHrefDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2709g extends AbstractC2712q {
    public C2709g(Bundle shareConfiguration, boolean isTimeline) {
        super(shareConfiguration, isTimeline ? C2706p.f61108fti : C2706p.f61102a9);
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: g */
    public ArrayMap<String, Object> mo9428g(Intent shareIntent) {
        ArrayMap<String, Object> arrayMap = new ArrayMap<>();
        arrayMap.put("type", this.f61061toq == 66306 ? "wechat_timeline" : "wechat_session");
        Bundle bundle = this.f61062zy;
        arrayMap.put("contentType", bundle != null ? bundle.getString(C2702g.f61066a9, "") : null);
        return arrayMap;
    }

    @Override // com.android.thememanager.share.wechat.AbstractC2712q, com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: p */
    public void mo9431p(Intent shareIntent, InterfaceC2707q callback) {
        super.mo9431p(shareIntent, callback);
        WXEntryActivity.toq(x2());
    }
}
