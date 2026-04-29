package com.android.thememanager.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.util.x9kr;
import com.miui.maml.folme.AnimatedProperty;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.service.q */
/* JADX INFO: compiled from: DarkenBitmapToLockEditer.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nDarkenBitmapToLockEditer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkenBitmapToLockEditer.kt\ncom/android/thememanager/service/DarkenBitmapToLockEditerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
public final class C2498q {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final String f14842k = "content://miui.keyguard.editor.templatefileprovider/currentDarkenWallpaper";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f60771toq = "darkenBitmapSuccess";

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final Bundle m8952k(@InterfaceC7396q Context context) {
        d2ok.m23075h(context, "context");
        Uri uri = Uri.parse(f14842k);
        boolean z2 = true;
        try {
        } catch (Exception e2) {
            e = e2;
            z2 = false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Bitmap bitmapM10069g = x9kr.m10069g(BitmapFactory.decodeStream(new ParcelFileDescriptor.AutoCloseInputStream(C2082k.m7998k().getContentResolver().openFile(uri, "r", null))), com.bumptech.glide.zy.m11283n(bf2.toq.toq()).m11289y(), true, true);
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, AnimatedProperty.PROPERTY_NAME_W);
            try {
                try {
                    bitmapM10069g.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream);
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.flush();
                    }
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        Log.e("darkenLockWallpaperBitmap", "darkenLockWallpaperBitmap: " + e);
                    }
                } finally {
                    y9n.m7246g(outputStreamOpenOutputStream);
                }
            } catch (IOException e4) {
                Log.e("darkenLockWallpaperBitmap", "bitmap2File err " + e4);
                y9n.m7246g(outputStreamOpenOutputStream);
                z2 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(f60771toq, z2);
            return bundle;
        }
        Log.e("darkenLockWallpaperBitmap", "darkenLockWallpaperBitmap: Build.VERSION is unavailable");
        z2 = false;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(f60771toq, z2);
        return bundle2;
    }
}
