package com.tencent.mm.opensdk.openapi;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.p007a.C5362a;
import com.tencent.mm.opensdk.channel.p007a.C5363b;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage;
import com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage;
import com.tencent.mm.opensdk.modelbiz.CreateChatroom;
import com.tencent.mm.opensdk.modelbiz.HandleScanResult;
import com.tencent.mm.opensdk.modelbiz.JoinChatroom;
import com.tencent.mm.opensdk.modelbiz.OpenWebview;
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage;
import com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.modelbiz.WXNontaxPay;
import com.tencent.mm.opensdk.modelbiz.WXPayInsurance;
import com.tencent.mm.opensdk.modelmsg.GetMessageFromWX;
import com.tencent.mm.opensdk.modelmsg.LaunchFromWX;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.opensdk.utils.C5377d;
import com.tencent.mm.opensdk.utils.ILog;
import com.tencent.wxop.stat.MtaSDkException;
import com.tencent.wxop.stat.StatConfig;
import com.tencent.wxop.stat.StatReportStrategy;
import com.tencent.wxop.stat.StatService;
import com.tencent.wxop.stat.common.StatConstants;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes3.dex */
final class WXApiImplV10 implements IWXAPI {
    private static final String TAG = "MicroMsg.SDK.WXApiImplV10";
    private static ActivityLifecycleCb activityCb;
    private static String wxappPayEntryClassname;
    private String appId;
    private boolean checkSignature;
    private Context context;
    private boolean detached = false;

    private static final class ActivityLifecycleCb implements Application.ActivityLifecycleCallbacks {
        private static final int DELAYED = 800;
        private static final String TAG = "MicroMsg.SDK.WXApiImplV10.ActivityLifecycleCb";
        private Context context;
        private Handler handler;
        private boolean isForeground;
        private Runnable onPausedRunnable;
        private Runnable onResumedRunnable;

        private ActivityLifecycleCb(Context context) {
            this.isForeground = false;
            this.handler = new Handler(Looper.getMainLooper());
            this.onPausedRunnable = new Runnable() { // from class: com.tencent.mm.opensdk.openapi.WXApiImplV10.ActivityLifecycleCb.1
                @Override // java.lang.Runnable
                public void run() {
                    if (WXApiImplV10.activityCb == null || !ActivityLifecycleCb.this.isForeground) {
                        return;
                    }
                    Log.v(ActivityLifecycleCb.TAG, "WXStat trigger onBackground");
                    StatService.trackCustomKVEvent(ActivityLifecycleCb.this.context, "onBackground_WX", null);
                    ActivityLifecycleCb.this.isForeground = false;
                }
            };
            this.onResumedRunnable = new Runnable() { // from class: com.tencent.mm.opensdk.openapi.WXApiImplV10.ActivityLifecycleCb.2
                @Override // java.lang.Runnable
                public void run() {
                    if (WXApiImplV10.activityCb == null || ActivityLifecycleCb.this.isForeground) {
                        return;
                    }
                    Log.v(ActivityLifecycleCb.TAG, "WXStat trigger onForeground");
                    StatService.trackCustomKVEvent(ActivityLifecycleCb.this.context, "onForeground_WX", null);
                    ActivityLifecycleCb.this.isForeground = true;
                }
            };
            this.context = context;
        }

        public final void detach() {
            this.handler.removeCallbacks(this.onResumedRunnable);
            this.handler.removeCallbacks(this.onPausedRunnable);
            this.context = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Log.v(TAG, activity.getComponentName().getClassName() + "  onActivityPaused");
            this.handler.removeCallbacks(this.onResumedRunnable);
            this.handler.postDelayed(this.onPausedRunnable, 800L);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Log.v(TAG, activity.getComponentName().getClassName() + "  onActivityResumed");
            this.handler.removeCallbacks(this.onPausedRunnable);
            this.handler.postDelayed(this.onResumedRunnable, 800L);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    WXApiImplV10(Context context, String str, boolean z2) {
        this.checkSignature = false;
        com.tencent.mm.opensdk.utils.Log.m18252d(TAG, "<init>, appId = " + str + ", checkSignature = " + z2);
        this.context = context;
        this.appId = str;
        this.checkSignature = z2;
    }

    private boolean checkSumConsistent(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            str = "checkSumConsistent fail, invalid arguments";
        } else {
            if (bArr.length == bArr2.length) {
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    if (bArr[i2] != bArr2[i2]) {
                        return false;
                    }
                }
                return true;
            }
            str = "checkSumConsistent fail, length is different";
        }
        com.tencent.mm.opensdk.utils.Log.m18253e(TAG, str);
        return false;
    }

    private boolean createChatroom(Context context, Bundle bundle) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/createChatroom"), null, null, new String[]{this.appId, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_create_chatroom_group_id", ""), bundle.getString("_wxapi_create_chatroom_chatroom_name", ""), bundle.getString("_wxapi_create_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_create_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean handleWxInternalRespType(String str, IWXAPIEventHandler iWXAPIEventHandler) {
        Uri uri;
        String queryParameter;
        com.tencent.mm.opensdk.utils.Log.m18254i(TAG, "handleWxInternalRespType, extInfo = " + str);
        try {
            uri = Uri.parse(str);
            queryParameter = uri.getQueryParameter("wx_internal_resptype");
            com.tencent.mm.opensdk.utils.Log.m18254i(TAG, "handleWxInternalRespType, respType = " + queryParameter);
        } catch (Exception e2) {
            com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "handleWxInternalRespType fail, ex = " + e2.getMessage());
        }
        if (C5377d.m18261h(queryParameter)) {
            com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "handleWxInternalRespType fail, respType is null");
            return false;
        }
        if (queryParameter.equals("subscribemessage")) {
            SubscribeMessage.Resp resp = new SubscribeMessage.Resp();
            resp.openId = uri.getQueryParameter("openid");
            resp.templateID = uri.getQueryParameter("template_id");
            resp.scene = C5377d.m18262i(uri.getQueryParameter(InterfaceC1925p.fzr));
            resp.action = uri.getQueryParameter("action");
            resp.reserved = uri.getQueryParameter("reserved");
            iWXAPIEventHandler.onResp(resp);
            return true;
        }
        if (queryParameter.contains("invoice_auth_insert")) {
            WXInvoiceAuthInsert.Resp resp2 = new WXInvoiceAuthInsert.Resp();
            resp2.wxOrderId = uri.getQueryParameter("wx_order_id");
            iWXAPIEventHandler.onResp(resp2);
            return true;
        }
        if (queryParameter.contains("payinsurance")) {
            WXPayInsurance.Resp resp3 = new WXPayInsurance.Resp();
            resp3.wxOrderId = uri.getQueryParameter("wx_order_id");
            iWXAPIEventHandler.onResp(resp3);
            return true;
        }
        if (queryParameter.contains("nontaxpay")) {
            WXNontaxPay.Resp resp4 = new WXNontaxPay.Resp();
            resp4.wxOrderId = uri.getQueryParameter("wx_order_id");
            iWXAPIEventHandler.onResp(resp4);
            return true;
        }
        com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "this open sdk version not support the request type");
        com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "handleWxInternalRespType fail, unknown resptype = " + queryParameter);
        return false;
    }

    private void initMta(Context context, String str) {
        String str2 = "AWXOP" + str;
        StatConfig.setAppKey(context, str2);
        StatConfig.setEnableSmartReporting(true);
        StatConfig.setStatSendStrategy(StatReportStrategy.PERIOD);
        StatConfig.setSendPeriodMinutes(60);
        StatConfig.setInstallChannel(context, "Wechat_Sdk");
        try {
            StatService.startStatService(context, str2, StatConstants.VERSION);
        } catch (MtaSDkException e2) {
            com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "initMta exception:" + e2.getMessage());
        }
    }

    private boolean joinChatroom(Context context, Bundle bundle) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/joinChatroom"), null, null, new String[]{this.appId, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_join_chatroom_group_id", ""), bundle.getString("_wxapi_join_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_join_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendAddCardToWX(Context context, Bundle bundle) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/addCardToWX"), null, null, new String[]{this.appId, bundle.getString("_wxapi_add_card_to_wx_card_list"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendChooseCardFromWX(Context context, Bundle bundle) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"), null, null, new String[]{bundle.getString("_wxapi_choose_card_from_wx_card_app_id"), bundle.getString("_wxapi_choose_card_from_wx_card_location_id"), bundle.getString("_wxapi_choose_card_from_wx_card_sign_type"), bundle.getString("_wxapi_choose_card_from_wx_card_card_sign"), bundle.getString("_wxapi_choose_card_from_wx_card_time_stamp"), bundle.getString("_wxapi_choose_card_from_wx_card_nonce_str"), bundle.getString("_wxapi_choose_card_from_wx_card_card_id"), bundle.getString("_wxapi_choose_card_from_wx_card_card_type"), bundle.getString("_wxapi_choose_card_from_wx_card_can_multi_select"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendHandleScanResult(Context context, Bundle bundle) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/handleScanResult"), null, null, new String[]{this.appId, bundle.getString("_wxapi_scan_qrcode_result")}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendInvoiceAuthInsert(Context context, BaseReq baseReq) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "2", URLEncoder.encode(String.format("url=%s", URLEncoder.encode(((WXInvoiceAuthInsert.Req) baseReq).url)))}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendJumpToBizProfileReq(Context context, Bundle bundle) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_profile_req_scene"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bundle.getInt("_wxapi_jump_to_biz_profile_req_profile_type"));
        Cursor cursorQuery = contentResolver.query(uri, null, null, new String[]{this.appId, bundle.getString("_wxapi_jump_to_biz_profile_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_profile_req_ext_msg"), sb.toString(), sb2.toString()}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendJumpToBizTempSessionReq(Context context, Bundle bundle) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizTempSession");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_webview_req_show_type"));
        Cursor cursorQuery = contentResolver.query(uri, null, null, new String[]{this.appId, bundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_webview_req_session_from"), sb.toString()}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendJumpToBizWebviewReq(Context context, Bundle bundle) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_webview_req_scene"));
        Cursor cursorQuery = contentResolver.query(uri, null, null, new String[]{this.appId, bundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_webview_req_ext_msg"), sb.toString()}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendLaunchWXMiniprogram(Context context, BaseReq baseReq) {
        WXLaunchMiniProgram.Req req = (WXLaunchMiniProgram.Req) baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram");
        StringBuilder sb = new StringBuilder();
        sb.append(req.miniprogramType);
        Cursor cursorQuery = contentResolver.query(uri, null, null, new String[]{this.appId, req.userName, req.path, sb.toString()}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendNonTaxPay(Context context, BaseReq baseReq) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "3", URLEncoder.encode(String.format("url=%s", URLEncoder.encode(((WXNontaxPay.Req) baseReq).url)))}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendOpenBusiLuckyMoney(Context context, Bundle bundle) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"), null, null, new String[]{this.appId, bundle.getString("_wxapi_open_busi_lucky_money_timeStamp"), bundle.getString("_wxapi_open_busi_lucky_money_nonceStr"), bundle.getString("_wxapi_open_busi_lucky_money_signType"), bundle.getString("_wxapi_open_busi_lucky_money_signature"), bundle.getString("_wxapi_open_busi_lucky_money_package")}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendOpenRankListReq(Context context, Bundle bundle) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openRankList"), null, null, new String[0], null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendOpenWebview(Context context, Bundle bundle) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openWebview"), null, null, new String[]{this.appId, bundle.getString("_wxapi_jump_to_webview_url"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendPayInSurance(Context context, BaseReq baseReq) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "4", URLEncoder.encode(String.format("url=%s", URLEncoder.encode(((WXPayInsurance.Req) baseReq).url)))}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    private boolean sendPayReq(Context context, Bundle bundle) {
        if (wxappPayEntryClassname == null) {
            wxappPayEntryClassname = new MMSharedPreferences(context).getString("_wxapp_pay_entry_classname_", null);
            com.tencent.mm.opensdk.utils.Log.m18252d(TAG, "pay, set wxappPayEntryClassname = " + wxappPayEntryClassname);
            if (wxappPayEntryClassname == null) {
                try {
                    wxappPayEntryClassname = context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getString("com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME", null);
                } catch (Exception e2) {
                    com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "get from metaData failed : " + e2.getMessage());
                }
            }
            if (wxappPayEntryClassname == null) {
                com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "pay fail, wxappPayEntryClassname is null");
                return false;
            }
        }
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.bundle = bundle;
        args.targetPkgName = "com.tencent.mm";
        args.targetClassName = wxappPayEntryClassname;
        return MMessageActV2.send(context, args);
    }

    private boolean sendSubscribeMessage(Context context, BaseReq baseReq) {
        SubscribeMessage.Req req = (SubscribeMessage.Req) baseReq;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "1", String.valueOf(req.scene), req.templateID, req.reserved}, null);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return true;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final void detach() {
        Application application;
        com.tencent.mm.opensdk.utils.Log.m18252d(TAG, "detach");
        this.detached = true;
        if (activityCb != null) {
            Context context = this.context;
            if (context instanceof Activity) {
                application = ((Activity) context).getApplication();
            } else {
                if (context instanceof Service) {
                    application = ((Service) context).getApplication();
                }
                activityCb.detach();
            }
            application.unregisterActivityLifecycleCallbacks(activityCb);
            activityCb.detach();
        }
        this.context = null;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final int getWXAppSupportAPI() {
        if (this.detached) {
            throw new IllegalStateException("getWXAppSupportAPI fail, WXMsgImpl has been detached");
        }
        if (!isWXAppInstalled()) {
            com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "open wx app failed, not installed or signature check failed");
            return 0;
        }
        int i2 = new MMSharedPreferences(this.context).getInt("_build_info_sdk_int_", 0);
        if (i2 != 0) {
            return i2;
        }
        try {
            return this.context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0);
        } catch (Exception e2) {
            com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "get from metaData failed : " + e2.getMessage());
            return i2;
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final boolean handleIntent(Intent intent, IWXAPIEventHandler iWXAPIEventHandler) {
        try {
        } catch (Exception e2) {
            com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "handleIntent fail, ex = " + e2.getMessage());
        }
        if (!WXApiImplComm.isIntentFromWx(intent, ConstantsAPI.Token.WX_TOKEN_VALUE_MSG)) {
            com.tencent.mm.opensdk.utils.Log.m18254i(TAG, "handleIntent fail, intent not from weixin msg");
            return false;
        }
        if (this.detached) {
            throw new IllegalStateException("handleIntent fail, WXMsgImpl has been detached");
        }
        String stringExtra = intent.getStringExtra(ConstantsAPI.CONTENT);
        int intExtra = intent.getIntExtra(ConstantsAPI.SDK_VERSION, 0);
        String stringExtra2 = intent.getStringExtra(ConstantsAPI.APP_PACKAGE);
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            if (!checkSumConsistent(intent.getByteArrayExtra(ConstantsAPI.CHECK_SUM), C5363b.m18239a(stringExtra, intExtra, stringExtra2))) {
                com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "checksum fail");
                return false;
            }
            int intExtra2 = intent.getIntExtra("_wxapi_command_type", 0);
            com.tencent.mm.opensdk.utils.Log.m18254i(TAG, "handleIntent, cmd = " + intExtra2);
            switch (intExtra2) {
                case 1:
                    iWXAPIEventHandler.onResp(new SendAuth.Resp(intent.getExtras()));
                    return true;
                case 2:
                    iWXAPIEventHandler.onResp(new SendMessageToWX.Resp(intent.getExtras()));
                    return true;
                case 3:
                    iWXAPIEventHandler.onReq(new GetMessageFromWX.Req(intent.getExtras()));
                    return true;
                case 4:
                    ShowMessageFromWX.Req req = new ShowMessageFromWX.Req(intent.getExtras());
                    String str = req.message.messageExt;
                    if (str == null || !str.contains("wx_internal_resptype")) {
                        iWXAPIEventHandler.onReq(req);
                        return true;
                    }
                    boolean zHandleWxInternalRespType = handleWxInternalRespType(str, iWXAPIEventHandler);
                    com.tencent.mm.opensdk.utils.Log.m18254i(TAG, "handleIntent, extInfo contains wx_internal_resptype, ret = " + zHandleWxInternalRespType);
                    return zHandleWxInternalRespType;
                case 5:
                    iWXAPIEventHandler.onResp(new PayResp(intent.getExtras()));
                    return true;
                case 6:
                    iWXAPIEventHandler.onReq(new LaunchFromWX.Req(intent.getExtras()));
                    return true;
                case 7:
                case 8:
                case 10:
                case 11:
                case 13:
                case 18:
                default:
                    com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "unknown cmd = " + intExtra2);
                    return false;
                case 9:
                    iWXAPIEventHandler.onResp(new AddCardToWXCardPackage.Resp(intent.getExtras()));
                    return true;
                case 12:
                    iWXAPIEventHandler.onResp(new OpenWebview.Resp(intent.getExtras()));
                    return true;
                case 14:
                    iWXAPIEventHandler.onResp(new CreateChatroom.Resp(intent.getExtras()));
                    return true;
                case 15:
                    iWXAPIEventHandler.onResp(new JoinChatroom.Resp(intent.getExtras()));
                    return true;
                case 16:
                    iWXAPIEventHandler.onResp(new ChooseCardFromWXCardPackage.Resp(intent.getExtras()));
                    return true;
                case 17:
                    iWXAPIEventHandler.onResp(new HandleScanResult.Resp(intent.getExtras()));
                    return true;
                case 19:
                    iWXAPIEventHandler.onResp(new WXLaunchMiniProgram.Resp(intent.getExtras()));
                    return true;
            }
        }
        com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "invalid argument");
        return false;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final boolean isWXAppInstalled() {
        if (this.detached) {
            throw new IllegalStateException("isWXAppInstalled fail, WXMsgImpl has been detached");
        }
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo("com.tencent.mm", 64);
            if (packageInfo == null) {
                return false;
            }
            return WXApiImplComm.validateAppSignature(this.context, packageInfo.signatures, this.checkSignature);
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final boolean isWXAppSupportAPI() {
        if (this.detached) {
            throw new IllegalStateException("isWXAppSupportAPI fail, WXMsgImpl has been detached");
        }
        return getWXAppSupportAPI() >= 620823552;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final boolean openWXApp() {
        String str;
        if (this.detached) {
            throw new IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
        }
        if (isWXAppInstalled()) {
            try {
                Context context = this.context;
                context.startActivity(context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm"));
                return true;
            } catch (Exception e2) {
                str = "startActivity fail, exception = " + e2.getMessage();
            }
        } else {
            str = "open wx app failed, not installed or signature check failed";
        }
        com.tencent.mm.opensdk.utils.Log.m18253e(TAG, str);
        return false;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final boolean registerApp(String str) {
        return registerApp(str, 0L);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final boolean registerApp(String str, long j2) {
        Application application;
        if (this.detached) {
            throw new IllegalStateException("registerApp fail, WXMsgImpl has been detached");
        }
        if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "register app failed for wechat app signature check failed");
            return false;
        }
        com.tencent.mm.opensdk.utils.Log.m18252d(TAG, "registerApp, appId = " + str);
        if (str != null) {
            this.appId = str;
        }
        if (activityCb == null) {
            Context context = this.context;
            if (context instanceof Activity) {
                initMta(context, str);
                activityCb = new ActivityLifecycleCb(this.context);
                application = ((Activity) this.context).getApplication();
            } else if (context instanceof Service) {
                initMta(context, str);
                activityCb = new ActivityLifecycleCb(this.context);
                application = ((Service) this.context).getApplication();
            } else {
                com.tencent.mm.opensdk.utils.Log.m18256w(TAG, "context is not instanceof Activity or Service, disable WXStat");
            }
            application.registerActivityLifecycleCallbacks(activityCb);
        }
        com.tencent.mm.opensdk.utils.Log.m18252d(TAG, "registerApp, appId = " + str);
        if (str != null) {
            this.appId = str;
        }
        com.tencent.mm.opensdk.utils.Log.m18252d(TAG, "register app " + this.context.getPackageName());
        C5362a.a aVar = new C5362a.a();
        aVar.f29897W = "com.tencent.mm";
        aVar.action = ConstantsAPI.ACTION_HANDLE_APP_REGISTER;
        aVar.content = "weixin://registerapp?appid=" + this.appId;
        aVar.f29898X = j2;
        return C5362a.m18238a(this.context, aVar);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final boolean sendReq(BaseReq baseReq) {
        StringBuilder sb;
        String str;
        String str2;
        if (this.detached) {
            throw new IllegalStateException("sendReq fail, WXMsgImpl has been detached");
        }
        if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            str2 = "sendReq failed for wechat app signature check failed";
        } else {
            if (baseReq.checkArgs()) {
                com.tencent.mm.opensdk.utils.Log.m18254i(TAG, "sendReq, req type = " + baseReq.getType());
                Bundle bundle = new Bundle();
                baseReq.toBundle(bundle);
                if (baseReq.getType() == 5) {
                    return sendPayReq(this.context, bundle);
                }
                if (baseReq.getType() == 7) {
                    return sendJumpToBizProfileReq(this.context, bundle);
                }
                if (baseReq.getType() == 8) {
                    return sendJumpToBizWebviewReq(this.context, bundle);
                }
                if (baseReq.getType() == 10) {
                    return sendJumpToBizTempSessionReq(this.context, bundle);
                }
                if (baseReq.getType() == 9) {
                    return sendAddCardToWX(this.context, bundle);
                }
                if (baseReq.getType() == 16) {
                    return sendChooseCardFromWX(this.context, bundle);
                }
                if (baseReq.getType() == 11) {
                    return sendOpenRankListReq(this.context, bundle);
                }
                if (baseReq.getType() == 12) {
                    return sendOpenWebview(this.context, bundle);
                }
                if (baseReq.getType() == 13) {
                    return sendOpenBusiLuckyMoney(this.context, bundle);
                }
                if (baseReq.getType() == 14) {
                    return createChatroom(this.context, bundle);
                }
                if (baseReq.getType() == 15) {
                    return joinChatroom(this.context, bundle);
                }
                if (baseReq.getType() == 17) {
                    return sendHandleScanResult(this.context, bundle);
                }
                if (baseReq.getType() == 18) {
                    return sendSubscribeMessage(this.context, baseReq);
                }
                if (baseReq.getType() == 19) {
                    return sendLaunchWXMiniprogram(this.context, baseReq);
                }
                if (baseReq.getType() == 20) {
                    return sendInvoiceAuthInsert(this.context, baseReq);
                }
                if (baseReq.getType() == 21) {
                    return sendNonTaxPay(this.context, baseReq);
                }
                if (baseReq.getType() == 22) {
                    return sendPayInSurance(this.context, baseReq);
                }
                if (baseReq.getType() == 2 && bundle.getInt("_wxapi_sendmessagetowx_req_media_type") == 36) {
                    SendMessageToWX.Req req = (SendMessageToWX.Req) baseReq;
                    if (getWXAppSupportAPI() < 620756993) {
                        WXWebpageObject wXWebpageObject = new WXWebpageObject();
                        wXWebpageObject.webpageUrl = bundle.getString("_wxminiprogram_webpageurl");
                        req.message.mediaObject = wXWebpageObject;
                    } else {
                        WXMiniProgramObject wXMiniProgramObject = (WXMiniProgramObject) req.message.mediaObject;
                        wXMiniProgramObject.userName += "@app";
                        String str3 = wXMiniProgramObject.path;
                        if (!C5377d.m18261h(str3)) {
                            String[] strArrSplit = str3.split("\\?");
                            if (strArrSplit.length > 1) {
                                sb = new StringBuilder();
                                sb.append(strArrSplit[0]);
                                sb.append(".html?");
                                str = strArrSplit[1];
                            } else {
                                sb = new StringBuilder();
                                sb.append(strArrSplit[0]);
                                str = ".html";
                            }
                            sb.append(str);
                            wXMiniProgramObject.path = sb.toString();
                        }
                    }
                    req.scene = 0;
                    baseReq.toBundle(bundle);
                }
                MMessageActV2.Args args = new MMessageActV2.Args();
                args.bundle = bundle;
                args.content = "weixin://sendreq?appid=" + this.appId;
                args.targetPkgName = "com.tencent.mm";
                args.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
                return MMessageActV2.send(this.context, args);
            }
            str2 = "sendReq checkArgs fail";
        }
        com.tencent.mm.opensdk.utils.Log.m18253e(TAG, str2);
        return false;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final boolean sendResp(BaseResp baseResp) {
        String str;
        if (this.detached) {
            throw new IllegalStateException("sendResp fail, WXMsgImpl has been detached");
        }
        if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            str = "sendResp failed for wechat app signature check failed";
        } else {
            if (baseResp.checkArgs()) {
                Bundle bundle = new Bundle();
                baseResp.toBundle(bundle);
                MMessageActV2.Args args = new MMessageActV2.Args();
                args.bundle = bundle;
                args.content = "weixin://sendresp?appid=" + this.appId;
                args.targetPkgName = "com.tencent.mm";
                args.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
                return MMessageActV2.send(this.context, args);
            }
            str = "sendResp checkArgs fail";
        }
        com.tencent.mm.opensdk.utils.Log.m18253e(TAG, str);
        return false;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final void setLogImpl(ILog iLog) {
        com.tencent.mm.opensdk.utils.Log.setLogImpl(iLog);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public final void unregisterApp() {
        if (this.detached) {
            throw new IllegalStateException("unregisterApp fail, WXMsgImpl has been detached");
        }
        if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "unregister app failed for wechat app signature check failed");
            return;
        }
        com.tencent.mm.opensdk.utils.Log.m18252d(TAG, "unregisterApp, appId = " + this.appId);
        String str = this.appId;
        if (str == null || str.length() == 0) {
            com.tencent.mm.opensdk.utils.Log.m18253e(TAG, "unregisterApp fail, appId is empty");
            return;
        }
        com.tencent.mm.opensdk.utils.Log.m18252d(TAG, "unregister app " + this.context.getPackageName());
        C5362a.a aVar = new C5362a.a();
        aVar.f29897W = "com.tencent.mm";
        aVar.action = ConstantsAPI.ACTION_HANDLE_APP_UNREGISTER;
        aVar.content = "weixin://unregisterapp?appid=" + this.appId;
        C5362a.m18238a(this.context, aVar);
    }
}
