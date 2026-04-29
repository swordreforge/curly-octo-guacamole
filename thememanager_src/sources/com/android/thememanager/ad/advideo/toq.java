package com.android.thememanager.ad.advideo;

import android.content.Context;
import android.util.Log;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.ld6;
import org.json.JSONObject;

/* JADX INFO: compiled from: AdVideoNotifyLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class toq extends C1644k<Boolean> {

    /* JADX INFO: renamed from: k */
    private Resource f9495k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f57378toq;

    public toq(Context context, Resource resource, String adTagId) {
        super(context);
        this.f9495k = resource;
        this.f57378toq = adTagId;
        onContentChanged();
    }

    @Override // com.android.thememanager.ad.advideo.C1644k, android.content.AsyncTaskLoader
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean loadInBackground() {
        try {
            if (new JSONObject(C1915g.f7l8(ld6.jp0y(this.f9495k.getOnlineId(), this.f57378toq))).getInt("errorCode") == 200) {
                return Boolean.TRUE;
            }
        } catch (Exception e2) {
            Log.w(toq.class.getSimpleName(), "AdVideoNotifyLoader happens error = " + e2);
        }
        return Boolean.FALSE;
    }
}
