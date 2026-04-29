package com.airbnb.lottie.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.InterfaceC1503q;
import com.airbnb.lottie.dd;
import com.airbnb.lottie.utils.C1510q;
import com.airbnb.lottie.utils.C1512y;
import com.android.thememanager.router.app.entity.ThemeStatus;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ImageAssetManager.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: n */
    private static final Object f7972n = new Object();

    /* JADX INFO: renamed from: k */
    private final Context f7973k;

    /* JADX INFO: renamed from: q */
    private final Map<String, dd> f7974q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f55977toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private InterfaceC1503q f55978zy;

    public toq(Drawable.Callback callback, String str, InterfaceC1503q interfaceC1503q, Map<String, dd> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f55977toq = str;
        } else {
            this.f55977toq = str + '/';
        }
        if (callback instanceof View) {
            this.f7973k = ((View) callback).getContext();
            this.f7974q = map;
            m5996n(interfaceC1503q);
        } else {
            C1510q.m6255n("LottieDrawable must be inside of a view for images to work.");
            this.f7974q = new HashMap();
            this.f7973k = null;
        }
    }

    /* JADX INFO: renamed from: q */
    private Bitmap m5993q(String str, @zy.dd Bitmap bitmap) {
        synchronized (f7972n) {
            this.f7974q.get(str).m5958y(bitmap);
        }
        return bitmap;
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    public Bitmap m5994g(String str, @zy.dd Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapM5955k = this.f7974q.get(str).m5955k();
            m5993q(str, bitmap);
            return bitmapM5955k;
        }
        dd ddVar = this.f7974q.get(str);
        Bitmap bitmapM5955k2 = ddVar.m5955k();
        ddVar.m5958y(null);
        return bitmapM5955k2;
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public Bitmap m5995k(String str) {
        dd ddVar = this.f7974q.get(str);
        if (ddVar == null) {
            return null;
        }
        Bitmap bitmapM5955k = ddVar.m5955k();
        if (bitmapM5955k != null) {
            return bitmapM5955k;
        }
        InterfaceC1503q interfaceC1503q = this.f55978zy;
        if (interfaceC1503q != null) {
            Bitmap bitmapM6210k = interfaceC1503q.m6210k(ddVar);
            if (bitmapM6210k != null) {
                m5993q(str, bitmapM6210k);
            }
            return bitmapM6210k;
        }
        String strZy = ddVar.zy();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = ThemeStatus.Redeem.REDEEMING;
        if (strZy.startsWith("data:") && strZy.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strZy.substring(strZy.indexOf(44) + 1), 0);
                return m5993q(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e2) {
                C1510q.m6253g("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f55977toq)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                return m5993q(str, C1512y.qrj(BitmapFactory.decodeStream(this.f7973k.getAssets().open(this.f55977toq + strZy), null, options), ddVar.m5954g(), ddVar.m5957q()));
            } catch (IllegalArgumentException e3) {
                C1510q.m6253g("Unable to decode image.", e3);
                return null;
            }
        } catch (IOException e4) {
            C1510q.m6253g("Unable to open asset.", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m5996n(@zy.dd InterfaceC1503q interfaceC1503q) {
        this.f55978zy = interfaceC1503q;
    }

    @zy.dd
    public dd toq(String str) {
        return this.f7974q.get(str);
    }

    public boolean zy(Context context) {
        return (context == null && this.f7973k == null) || this.f7973k.equals(context);
    }
}
