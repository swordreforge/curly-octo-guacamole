package com.market.sdk;

import android.os.Bundle;
import com.google.gson.C4871g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.market.sdk.g */
/* JADX INFO: compiled from: DesktopRecommendArgs.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4969g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f68880f7l8 = "key_pkg_list";

    /* JADX INFO: renamed from: g */
    private static final String f28039g = "key_folder_name";

    /* JADX INFO: renamed from: n */
    private static final String f28040n = "key_folder_id";

    /* JADX INFO: renamed from: y */
    private static final String f28041y = "key_extra_params";

    /* JADX INFO: renamed from: k */
    private final long f28042k;

    /* JADX INFO: renamed from: q */
    private final Map<String, String> f28043q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f68881toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final ArrayList<String> f68882zy;

    public C4969g(long j2, String str, ArrayList<String> arrayList, Map<String, String> map) {
        this.f28042k = j2;
        this.f68881toq = str;
        this.f68882zy = arrayList;
        this.f28043q = map;
    }

    /* JADX INFO: renamed from: k */
    private static String m17303k(Map<String, String> map) {
        return new C4871g().o1t(map);
    }

    private static Map<String, String> toq(String str) {
        return (Map) new C4871g().n7h(str, new HashMap().getClass());
    }

    public Bundle f7l8() {
        Bundle bundle = new Bundle(4);
        bundle.putLong(f28040n, this.f28042k);
        bundle.putString(f28039g, this.f68881toq);
        bundle.putStringArrayList(f68880f7l8, this.f68882zy);
        bundle.putString(f28041y, m17303k(this.f28043q));
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public ArrayList<String> m17304g() {
        return this.f68882zy;
    }

    /* JADX INFO: renamed from: n */
    public String m17305n() {
        return this.f68881toq;
    }

    /* JADX INFO: renamed from: q */
    public long m17306q() {
        return this.f28042k;
    }

    public Map<String, String> zy() {
        return this.f28043q;
    }

    public C4969g(Bundle bundle) {
        this.f28042k = bundle.getLong(f28040n);
        this.f68881toq = bundle.getString(f28039g);
        this.f68882zy = bundle.getStringArrayList(f68880f7l8);
        this.f28043q = toq(bundle.getString(f28041y));
    }
}
