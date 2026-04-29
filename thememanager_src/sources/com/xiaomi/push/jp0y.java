package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public class jp0y implements d3 {

    /* JADX INFO: renamed from: k */
    private final String f33103k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f73386toq;

    public jp0y(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f33103k = str;
        this.f73386toq = str2;
    }

    @Override // com.xiaomi.push.d3
    /* JADX INFO: renamed from: a */
    public String mo20717a() {
        return this.f33103k;
    }

    @Override // com.xiaomi.push.d3
    /* JADX INFO: renamed from: b */
    public String mo20718b() {
        return this.f73386toq;
    }
}
