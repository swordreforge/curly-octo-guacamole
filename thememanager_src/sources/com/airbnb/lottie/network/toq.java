package com.airbnb.lottie.network;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import zy.lvui;

/* JADX INFO: compiled from: DefaultLottieNetworkFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class toq implements InterfaceC1477g {
    @Override // com.airbnb.lottie.network.InterfaceC1477g
    @lvui
    /* JADX INFO: renamed from: k */
    public InterfaceC1480q mo6113k(@lvui String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C1478k(httpURLConnection);
    }
}
