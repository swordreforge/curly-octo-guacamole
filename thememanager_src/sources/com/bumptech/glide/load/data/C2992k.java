package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.k */
/* JADX INFO: compiled from: AssetFileDescriptorLocalUriFetcher.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C2992k extends x2<AssetFileDescriptor> {
    public C2992k(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.x2
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
    @Override // com.bumptech.glide.load.data.x2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo10635q(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
