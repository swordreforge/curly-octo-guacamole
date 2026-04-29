package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: compiled from: StreamAssetPathFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj extends toq<InputStream> {
    public qrj(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.toq
    /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
    public void zy(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    @lvui
    /* JADX INFO: renamed from: k */
    public Class<InputStream> mo10634k() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.toq
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public InputStream mo10658q(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
