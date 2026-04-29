package com.google.android.material.color;

import android.annotation.NonNull;
import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.color.q */
/* JADX INFO: compiled from: ColorResourcesLoaderCreator.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(30)
final class C3986q {

    /* JADX INFO: renamed from: k */
    private static final String f24238k = "q";

    private C3986q() {
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.res.loader.ResourcesLoader] */
    @dd
    /* JADX INFO: renamed from: k */
    static ResourcesLoader m14320k(@lvui Context context, @lvui Map<Integer, Integer> map) throws Throwable {
        FileDescriptor fileDescriptorMemfd_create;
        try {
            byte[] bArrM14294s = C3984n.m14294s(context, map);
            Log.i(f24238k, "Table created, length: " + bArrM14294s.length);
            if (bArrM14294s.length == 0) {
                return null;
            }
            try {
                fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                    try {
                        fileOutputStream.write(bArrM14294s);
                        ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                        try {
                            ?? r2 = new Object() { // from class: android.content.res.loader.ResourcesLoader
                                static {
                                    throw new NoClassDefFoundError();
                                }

                                public native /* synthetic */ void addProvider(@NonNull ResourcesProvider resourcesProvider);
                            };
                            r2.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                            if (parcelFileDescriptorDup != null) {
                                parcelFileDescriptorDup.close();
                            }
                            fileOutputStream.close();
                            if (fileDescriptorMemfd_create != null) {
                                Os.close(fileDescriptorMemfd_create);
                            }
                            return r2;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileDescriptorMemfd_create != null) {
                        Os.close(fileDescriptorMemfd_create);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileDescriptorMemfd_create = null;
            }
        } catch (Exception e2) {
            Log.e(f24238k, "Failed to create the ColorResourcesTableCreator.", e2);
            return null;
        }
    }
}
