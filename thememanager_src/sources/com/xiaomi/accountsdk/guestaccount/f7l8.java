package com.xiaomi.accountsdk.guestaccount;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: GuestAccountHttpRequester.java */
/* JADX INFO: loaded from: classes3.dex */
public interface f7l8 {

    /* JADX INFO: renamed from: k */
    public static final String f30852k = "extension-pragma";

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.f7l8$k */
    /* JADX INFO: compiled from: GuestAccountHttpRequester.java */
    public static class C5517k {

        /* JADX INFO: renamed from: k */
        public final int f30853k;

        /* JADX INFO: renamed from: q */
        public final Map<String, String> f30854q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final String f72870toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final String f72871zy;

        public C5517k(int i2, String str, String str2, Map<String, String> map) {
            this.f30853k = i2;
            this.f72870toq = str;
            this.f72871zy = str2;
            this.f30854q = map;
        }
    }

    /* JADX INFO: renamed from: k */
    C5517k mo18869k(String str, Map<String, String> map, Map<String, String> map2) throws IOException;

    /* JADX INFO: renamed from: q */
    C5517k mo18870q(String str) throws IOException;
}
