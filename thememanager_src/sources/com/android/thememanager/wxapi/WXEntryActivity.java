package com.android.thememanager.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.share.wechat.toq;
import com.android.thememanager.util.C2789j;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class WXEntryActivity extends Activity implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: g */
    private static toq f17852g = null;

    /* JADX INFO: renamed from: n */
    private static final String f17853n = "wx394263bf04c12659";

    /* JADX INFO: renamed from: q */
    private static final String f17854q = "ThemeWechatTag";

    /* JADX INFO: renamed from: k */
    private IWXAPI f17855k;

    /* JADX INFO: renamed from: k */
    private void m10530k(ShowMessageFromWX.Req req) {
        WXMediaMessage wXMediaMessage = req.message;
        WXAppExtendObject wXAppExtendObject = (WXAppExtendObject) wXMediaMessage.mediaObject;
        StringBuilder sb = new StringBuilder();
        sb.append("msg = ");
        sb.append("description: " + wXMediaMessage.description + "\nextInfo: " + wXAppExtendObject.extInfo + "\nfilePath: " + wXAppExtendObject.filePath);
        C2789j.m9826k(f17854q, sb.toString(), new Object[0]);
        Intent intent = new Intent();
        intent.setAction(ThemeResourceProxyTabActivity.bl);
        intent.setPackage(bf2.toq.toq().getPackageName());
        intent.putExtra("EXTRA_TAB_ID", "wallpaper");
        startActivity(intent);
    }

    public static void toq(toq wechatShare) {
        f17852g = wechatShare;
    }

    @Override // android.app.Activity
    public void onCreate(@dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.f17855k == null) {
            IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, "wx394263bf04c12659");
            this.f17855k = iwxapiCreateWXAPI;
            boolean zRegisterApp = iwxapiCreateWXAPI.registerApp("wx394263bf04c12659");
            if (!zRegisterApp) {
                C2789j.m9825g(f17854q, "register app return " + zRegisterApp, new Object[0]);
            }
        }
        onNewIntent(getIntent());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        IWXAPI iwxapi = this.f17855k;
        if (iwxapi != null) {
            iwxapi.unregisterApp();
            this.f17855k.detach();
            this.f17855k = null;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f17855k.handleIntent(intent, this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        int type = baseReq.getType();
        C2789j.m9825g(f17854q, "onReq type = %d", Integer.valueOf(type));
        if (type == 4) {
            m10530k((ShowMessageFromWX.Req) baseReq);
        }
        finish();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        C2789j.m9825g(f17854q, "onResp errCode = %s, errStr = %s, transaction = %s", Integer.valueOf(baseResp.errCode), baseResp.errStr, baseResp.transaction);
        toq toqVar = f17852g;
        if (toqVar != null) {
            toqVar.onResp(baseResp);
        }
        finish();
    }
}
