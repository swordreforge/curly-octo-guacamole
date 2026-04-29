package com.android.thememanager.share.wechat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.ni7;
import com.android.thememanager.share.C2702g;
import com.android.thememanager.share.C2706p;
import com.android.thememanager.share.C2716y;
import com.android.thememanager.share.chooser.C2691k;
import com.android.thememanager.share.ld6;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import ek5k.C6002g;
import java.util.ArrayList;

/* JADX INFO: compiled from: WechatShare.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: s */
    private static final int f16070s = 150;

    /* JADX INFO: renamed from: y */
    private static final String f16071y = "MiuiShareWechatShare";

    /* JADX INFO: renamed from: n */
    private int f16074n;

    /* JADX INFO: renamed from: k */
    volatile IWXAPI f16073k = null;

    /* JADX INFO: renamed from: g */
    private boolean f16072g = false;

    /* JADX INFO: renamed from: q */
    private final C2711n f16075q = new C2711n();

    /* JADX INFO: renamed from: com.android.thememanager.share.wechat.toq$k */
    /* JADX INFO: compiled from: WechatShare.java */
    class C2713k implements ld6.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Intent f16076k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ boolean f61132toq;

        C2713k(final Intent val$intent, final boolean val$isTimeline) {
            this.f16076k = val$intent;
            this.f61132toq = val$isTimeline;
        }

        @Override // com.android.thememanager.share.ld6.zy
        /* JADX INFO: renamed from: k */
        public boolean mo9458k(String subject, String text, String url, ArrayList<Uri> imageUris, ArrayList<Bitmap> bitmaps) {
            Bitmap bitmap = (bitmaps == null || bitmaps.isEmpty()) ? null : bitmaps.get(0);
            return (bitmap != null && TextUtils.isEmpty(text) && TextUtils.isEmpty(subject) && TextUtils.isEmpty(url)) ? toq.this.f16075q.zy(bitmap, toq.m9471y(this.f16076k), toq.f7l8(this.f16076k), this.f61132toq) : (TextUtils.isEmpty(url) && bitmap == null) ? toq.this.f16075q.m9463g(text, this.f61132toq) : toq.this.f16075q.m9467y(url, subject, text, bitmap, this.f61132toq);
        }
    }

    toq(Context context, final String appId) {
        final Context applicationContext = context.getApplicationContext();
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.share.wechat.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f16062k.ld6(applicationContext, appId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f7l8(Intent intent) {
        return intent.getExtras().getInt(C2702g.f16026s, 150);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ld6(Context context, String str) {
        this.f16073k = WXAPIFactory.createWXAPI(context, str);
        this.f16073k.registerApp(str);
        this.f16075q.m9464k(this.f16073k);
        this.f16072g = this.f16073k.isWXAppInstalled() && this.f16073k.isWXAppSupportAPI();
        ni7.m7146k().zy(C2691k.bd, new Intent(C2691k.bd).putExtra("new_value", this.f16072g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static int m9471y(Intent intent) {
        return intent.getExtras().getInt(C2702g.f16028y, 150);
    }

    /* JADX INFO: renamed from: g */
    public C2711n m9472g() {
        return this.f16075q;
    }

    /* JADX INFO: renamed from: n */
    void m9473n() {
        if (this.f16073k != null) {
            this.f16073k.unregisterApp();
            this.f16073k = null;
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        int i2 = baseResp.errCode;
        int i3 = -2;
        if (i2 == -4) {
            i3 = -1;
        } else if (i2 == -2) {
            i3 = 1;
        } else if (i2 == 0) {
            i3 = 0;
        }
        Log.d(f16071y, "WechatShare baseResp.errCode = " + baseResp.errCode);
        int i4 = C2706p.f61112jp0y;
        if (this.f16074n == 1) {
            i4 = C2706p.f61110gvn7;
        }
        C2716y.m9478k(i4, i3);
    }

    /* JADX INFO: renamed from: p */
    boolean m9474p() {
        return this.f16072g;
    }

    boolean qrj(Activity activity, Intent intent, boolean z2) {
        if (activity == null) {
            return false;
        }
        this.f16074n = z2 ? 1 : 0;
        return ld6.mcp(activity, intent, new C2713k(intent, z2));
    }

    /* JADX INFO: renamed from: s */
    boolean m9475s() {
        return a9.m6999s("com.tencent.mm");
    }

    boolean x2(Intent result) {
        return this.f16073k != null && this.f16073k.handleIntent(result, this);
    }
}
