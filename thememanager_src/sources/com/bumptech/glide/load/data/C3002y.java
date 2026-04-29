package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.y */
/* JADX INFO: compiled from: FileDescriptorAssetPathFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3002y extends toq<AssetFileDescriptor> {
    public C3002y(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.toq
    /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
    public void zy(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3000q
    @lvui
    /* JADX INFO: renamed from: k */
    public Class<AssetFileDescriptor> mo10634k() {
        return AssetFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.toq
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo10658q(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
