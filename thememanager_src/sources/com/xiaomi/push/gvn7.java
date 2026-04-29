package com.xiaomi.push;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class gvn7 {

    /* JADX INFO: renamed from: k */
    public int f32993k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public Map<String, String> f73344toq = new HashMap();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public String f73345zy;

    /* JADX INFO: renamed from: k */
    public String m20942k() {
        return this.f73345zy;
    }

    public String toString() {
        return String.format("resCode = %1$d, headers = %2$s, response = %3$s", Integer.valueOf(this.f32993k), this.f73344toq.toString(), this.f73345zy);
    }
}
