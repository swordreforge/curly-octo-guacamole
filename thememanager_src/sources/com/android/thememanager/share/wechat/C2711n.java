package com.android.thememanager.share.wechat;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.share.ld6;
import com.android.thememanager.util.C2789j;
import com.bumptech.glide.util.kja0;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;

/* JADX INFO: renamed from: com.android.thememanager.share.wechat.n */
/* JADX INFO: compiled from: WechatShareFutures.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2711n {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61130toq = "WechatShareFutures";

    /* JADX INFO: renamed from: k */
    private volatile IWXAPI f16065k;

    public boolean f7l8(String str, String str2, String str3, Bitmap bitmap, boolean z2) {
        if (this.f16065k == null) {
            Log.d(f61130toq, "shareVideo - mWechatShareAPI is null");
            return false;
        }
        WXVideoObject wXVideoObject = new WXVideoObject();
        wXVideoObject.videoUrl = str;
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXVideoObject);
        wXMediaMessage.title = str2;
        wXMediaMessage.description = str3;
        wXMediaMessage.thumbData = ld6.m9446g(bitmap, true);
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.message = wXMediaMessage;
        req.scene = z2 ? 1 : 0;
        return this.f16065k.sendReq(req);
    }

    /* JADX INFO: renamed from: g */
    public boolean m9463g(String str, boolean z2) {
        if (this.f16065k == null) {
            Log.d(f61130toq, "shareText - mWechatShareAPI is null");
            return false;
        }
        WXTextObject wXTextObject = new WXTextObject();
        wXTextObject.text = str;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXTextObject;
        wXMediaMessage.description = str;
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.message = wXMediaMessage;
        req.scene = z2 ? 1 : 0;
        return this.f16065k.sendReq(req);
    }

    /* JADX INFO: renamed from: k */
    public void m9464k(IWXAPI api) {
        this.f16065k = api;
    }

    /* JADX INFO: renamed from: n */
    public boolean m9465n(String str, String str2, String str3, Bitmap bitmap, boolean z2) {
        if (this.f16065k == null) {
            Log.d(f61130toq, "shareMusic - mWechatShareAPI is null");
            return false;
        }
        WXMusicObject wXMusicObject = new WXMusicObject();
        wXMusicObject.musicUrl = str;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.title = str2;
        wXMediaMessage.description = str3;
        wXMediaMessage.thumbData = ld6.m9446g(bitmap, true);
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.message = wXMediaMessage;
        req.scene = z2 ? 1 : 0;
        return this.f16065k.sendReq(req);
    }

    /* JADX INFO: renamed from: q */
    public boolean m9466q(String url, String userName, String pagePath, String title, String des, Bitmap thumb) {
        if (this.f16065k == null) {
            Log.d(f61130toq, "shareMiniProgram - mWechatShareAPI is null");
            return false;
        }
        WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
        wXMiniProgramObject.webpageUrl = url;
        wXMiniProgramObject.miniprogramType = 0;
        wXMiniProgramObject.userName = userName;
        wXMiniProgramObject.path = pagePath;
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXMiniProgramObject);
        wXMediaMessage.title = title;
        wXMediaMessage.description = des;
        int i2 = 90;
        while (true) {
            byte[] bArrM9450n = ld6.m9450n(thumb, i2, false);
            if (bArrM9450n.length < 131072) {
                C2789j.m9826k(f61130toq, "bitmap size = %s, width = %s, height = %s, bytes length = %s, quality = %s", Integer.valueOf(kja0.m11233y(thumb)), Integer.valueOf(thumb.getWidth()), Integer.valueOf(thumb.getHeight()), Integer.valueOf(bArrM9450n.length), Integer.valueOf(i2));
                wXMediaMessage.thumbData = bArrM9450n;
                SendMessageToWX.Req req = new SendMessageToWX.Req();
                req.transaction = String.valueOf(System.currentTimeMillis());
                req.message = wXMediaMessage;
                req.scene = 0;
                return this.f16065k.sendReq(req);
            }
            i2 = (int) (((double) i2) * 0.9d);
        }
    }

    public boolean toq(String str, int i2, int i3, boolean z2) {
        if (this.f16065k == null) {
            Log.d(f61130toq, "shareBigImage - mWechatShareAPI is null");
            return false;
        }
        WXImageObject wXImageObject = new WXImageObject();
        wXImageObject.setImagePath(str);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.message = wXMediaMessage;
        req.scene = z2 ? 1 : 0;
        return this.f16065k.sendReq(req);
    }

    /* JADX INFO: renamed from: y */
    public boolean m9467y(String str, String str2, String str3, Bitmap bitmap, boolean z2) {
        if (this.f16065k == null) {
            Log.d(f61130toq, "shareWebPage - mWechatShareAPI is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = str;
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXWebpageObject);
        if (!TextUtils.isEmpty(str2)) {
            wXMediaMessage.title = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            wXMediaMessage.description = str3;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            wXMediaMessage.setThumbImage(bitmap);
        }
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.message = wXMediaMessage;
        req.scene = z2 ? 1 : 0;
        return this.f16065k.sendReq(req);
    }

    public boolean zy(Bitmap bitmap, int i2, int i3, boolean z2) {
        if (this.f16065k == null) {
            Log.d(f61130toq, "shareImage - mWechatShareAPI is null");
            return false;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        WXImageObject wXImageObject = new WXImageObject(bitmap);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
        bitmap.recycle();
        wXMediaMessage.thumbData = ld6.m9446g(bitmapCreateScaledBitmap, true);
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.message = wXMediaMessage;
        req.scene = z2 ? 1 : 0;
        return this.f16065k.sendReq(req);
    }
}
