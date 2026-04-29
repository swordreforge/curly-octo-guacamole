package com.tencent.mm.opensdk.diffdev.p008a;

import android.os.AsyncTask;
import com.miui.clock.module.toq;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import com.xiaomi.accountsdk.request.wvg;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.f */
/* JADX INFO: loaded from: classes3.dex */
final class AsyncTaskC5369f extends AsyncTask<Void, Void, a> {
    private OAuthListener ah;
    private String ak;
    private int aq;
    private String url;

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.f$a */
    static class a {
        public OAuthErrCode aj;
        public String ar;
        public int as;

        a() {
        }

        /* JADX INFO: renamed from: d */
        public static a m18246d(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String str;
            OAuthErrCode oAuthErrCode2;
            a aVar = new a();
            if (bArr != null && bArr.length != 0) {
                try {
                } catch (Exception e2) {
                    str = String.format("parse fail, build String fail, ex = %s", e2.getMessage());
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr, wvg.f72949toq));
                    int i2 = jSONObject.getInt("wx_errcode");
                    aVar.as = i2;
                    Log.m18252d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i2)));
                    int i3 = aVar.as;
                    if (i3 == 408) {
                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_OK;
                    } else if (i3 != 500) {
                        switch (i3) {
                            case 402:
                                oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_Timeout;
                                break;
                            case 403:
                                oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_Cancel;
                                break;
                            case toq.f7l8.f29213n /* 404 */:
                                oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_OK;
                                break;
                            case toq.f7l8.f29211g /* 405 */:
                                aVar.aj = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.ar = jSONObject.getString("wx_code");
                                return aVar;
                            default:
                                oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                break;
                        }
                    } else {
                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                    }
                    aVar.aj = oAuthErrCode2;
                    return aVar;
                } catch (Exception e3) {
                    str = String.format("parse json fail, ex = %s", e3.getMessage());
                    Log.m18253e("MicroMsg.SDK.NoopingResult", str);
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.aj = oAuthErrCode;
                    return aVar;
                }
            }
            Log.m18253e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            aVar.aj = oAuthErrCode;
            return aVar;
        }
    }

    public AsyncTaskC5369f(String str, OAuthListener oAuthListener) {
        this.ak = str;
        this.ah = oAuthListener;
        this.url = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ a doInBackground(Void[] voidArr) {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        String str2 = this.ak;
        if (str2 == null || str2.length() == 0) {
            Log.m18253e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            aVar = new a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
        } else {
            while (!isCancelled()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.url);
                if (this.aq == 0) {
                    str = "";
                } else {
                    str = "&last=" + this.aq;
                }
                sb.append(str);
                String string = sb.toString();
                long jCurrentTimeMillis = System.currentTimeMillis();
                byte[] bArrM18245b = C5368e.m18245b(string, 60000);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                a aVarM18246d = a.m18246d(bArrM18245b);
                Log.m18252d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVarM18246d.aj.toString(), Integer.valueOf(aVarM18246d.as), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                OAuthErrCode oAuthErrCode2 = aVarM18246d.aj;
                if (oAuthErrCode2 != OAuthErrCode.WechatAuth_Err_OK) {
                    Log.m18253e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode2.toString(), Integer.valueOf(aVarM18246d.as)));
                    return aVarM18246d;
                }
                int i2 = aVarM18246d.as;
                this.aq = i2;
                if (i2 == EnumC5370g.UUID_SCANED.getCode()) {
                    this.ah.onQrcodeScanned();
                } else if (aVarM18246d.as != EnumC5370g.UUID_KEEP_CONNECT.getCode() && aVarM18246d.as == EnumC5370g.UUID_CONFIRM.getCode()) {
                    String str3 = aVarM18246d.ar;
                    if (str3 == null || str3.length() == 0) {
                        Log.m18253e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                        aVarM18246d.aj = OAuthErrCode.WechatAuth_Err_NormalErr;
                    }
                    return aVarM18246d;
                }
            }
            Log.m18254i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
            aVar = new a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
        }
        aVar.aj = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.ah.onAuthFinish(aVar2.aj, aVar2.ar);
    }
}
