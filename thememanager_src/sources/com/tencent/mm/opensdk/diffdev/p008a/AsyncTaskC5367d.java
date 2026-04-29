package com.tencent.mm.opensdk.diffdev.p008a;

import android.os.AsyncTask;
import android.os.Environment;
import android.util.Base64;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import com.xiaomi.accountsdk.request.wvg;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.d */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskC5367d extends AsyncTask<Void, Void, a> {
    private static final String ad = Environment.getExternalStorageDirectory().getAbsolutePath() + "/tencent/MicroMsg/oauth_qrcode.png";
    private static String ae = "https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s";
    private String af;
    private String ag;
    private OAuthListener ah;
    private AsyncTaskC5369f ai;
    private String appId;
    private String scope;
    private String signature;

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.d$a */
    static class a {
        public OAuthErrCode aj;
        public String ak;
        public String al;
        public String am;
        public int an;
        public String ao;
        public byte[] ap;

        private a() {
        }

        /* JADX INFO: renamed from: c */
        public static a m18244c(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String str;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.m18253e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, wvg.f72949toq));
                        int i2 = jSONObject.getInt(InterfaceC1925p.ad8);
                        if (i2 != 0) {
                            Log.m18253e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i2)));
                            aVar.aj = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.an = i2;
                            aVar.ao = jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string != null && string.length() != 0) {
                            byte[] bArrDecode = Base64.decode(string, 0);
                            if (bArrDecode != null && bArrDecode.length != 0) {
                                aVar.aj = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.ap = bArrDecode;
                                aVar.ak = jSONObject.getString("uuid");
                                String string2 = jSONObject.getString("appname");
                                aVar.al = string2;
                                Log.m18252d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.ak, string2, Integer.valueOf(aVar.ap.length)));
                                return aVar;
                            }
                            Log.m18253e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                            aVar.aj = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                            return aVar;
                        }
                        Log.m18253e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        aVar.aj = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e2) {
                        str = String.format("parse json fail, ex = %s", e2.getMessage());
                        Log.m18253e("MicroMsg.SDK.GetQRCodeResult", str);
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.aj = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e3) {
                    str = String.format("parse fail, build String fail, ex = %s", e3.getMessage());
                }
            }
            aVar.aj = oAuthErrCode;
            return aVar;
        }
    }

    public AsyncTaskC5367d(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.appId = str;
        this.scope = str2;
        this.af = str3;
        this.ag = str4;
        this.signature = str5;
        this.ah = oAuthListener;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ a doInBackground(Void[] voidArr) {
        Log.m18254i("MicroMsg.SDK.GetQRCodeTask", "external storage available = false");
        String str = String.format(ae, this.appId, this.af, this.ag, this.scope, this.signature);
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrM18245b = C5368e.m18245b(str, -1);
        Log.m18252d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", str, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return a.m18244c(bArrM18245b);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.aj;
        if (oAuthErrCode != OAuthErrCode.WechatAuth_Err_OK) {
            Log.m18253e("MicroMsg.SDK.GetQRCodeTask", String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", oAuthErrCode));
            this.ah.onAuthFinish(aVar2.aj, null);
            return;
        }
        Log.m18252d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success");
        this.ah.onAuthGotQrcode(aVar2.am, aVar2.ap);
        AsyncTaskC5369f asyncTaskC5369f = new AsyncTaskC5369f(aVar2.ak, this.ah);
        this.ai = asyncTaskC5369f;
        asyncTaskC5369f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m18243q() {
        Log.m18254i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        AsyncTaskC5369f asyncTaskC5369f = this.ai;
        return asyncTaskC5369f == null ? cancel(true) : asyncTaskC5369f.cancel(true);
    }
}
