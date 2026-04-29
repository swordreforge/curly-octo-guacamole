package com.android.thememanager.h5.feature;

import java.util.Map;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;

/* JADX INFO: loaded from: classes2.dex */
public class AdFeature implements n7h {

    /* JADX INFO: renamed from: g */
    private static final String f12039g = "adInfo";

    /* JADX INFO: renamed from: k */
    private static final String f12040k = "AdFeature";

    /* JADX INFO: renamed from: n */
    private static final String f12041n = "performClick";

    /* JADX INFO: renamed from: q */
    private static final String f12042q = "reportView";

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        String strM25920k = request.m25920k();
        if (f12042q.equals(strM25920k)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (f12041n.equals(strM25920k)) {
            return n7h.EnumC7150k.SYNC;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        String strM25920k = request.m25920k();
        return f12042q.equals(strM25920k) ? reportView(request) : f12041n.equals(strM25920k) ? performClick(request) : new o1t(204, "no such action");
    }

    public o1t performClick(C7156z request) {
        return new o1t(0);
    }

    public o1t reportView(C7156z request) {
        return new o1t(0);
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
