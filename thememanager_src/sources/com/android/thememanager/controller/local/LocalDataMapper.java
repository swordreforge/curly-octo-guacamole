package com.android.thememanager.controller.local;

import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.basemodule.resource.model.Resource;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalDataMapper implements InterfaceC0928g {

    /* JADX INFO: renamed from: k */
    private com.android.thememanager.controller.x2 f10863k;

    /* JADX INFO: renamed from: n */
    private Map<String, Resource> f10864n;

    /* JADX INFO: renamed from: q */
    private AsyncTaskC1903k f10865q;

    /* JADX INFO: renamed from: com.android.thememanager.controller.local.LocalDataMapper$k */
    private class AsyncTaskC1903k extends AsyncTask<String, Void, Map<String, Resource>> {

        /* JADX INFO: renamed from: k */
        private com.android.thememanager.controller.x2 f10866k;

        public AsyncTaskC1903k(com.android.thememanager.controller.x2 resController) {
            this.f10866k = resController;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, Resource> doInBackground(String... params) {
            HashMap map = new HashMap();
            com.android.thememanager.controller.ld6 ld6VarM7690k = this.f10866k.m7690k();
            ArrayList<Resource> arrayList = new ArrayList();
            arrayList.addAll(ld6VarM7690k.kja0());
            for (Resource resource : arrayList) {
                if (!TextUtils.isEmpty(resource.getOnlineId())) {
                    map.put(resource.getOnlineId(), resource);
                }
            }
            return map;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Map<String, Resource> map) {
            LocalDataMapper.this.f10864n = map;
        }
    }

    public LocalDataMapper(com.android.thememanager.controller.x2 controller) {
        this.f10863k = controller;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStart(@lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStop(@lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@lvui InterfaceC0954z owner) {
        zy();
    }

    public Map<String, Resource> toq() {
        return this.f10864n;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@lvui InterfaceC0954z owner) {
    }

    public void zy() {
        AsyncTaskC1903k asyncTaskC1903k = this.f10865q;
        if (asyncTaskC1903k != null) {
            asyncTaskC1903k.cancel(true);
            this.f10865q = null;
        }
        AsyncTaskC1903k asyncTaskC1903k2 = new AsyncTaskC1903k(this.f10863k);
        this.f10865q = asyncTaskC1903k2;
        asyncTaskC1903k2.executeOnExecutor(C6002g.ld6(), new String[0]);
    }
}
