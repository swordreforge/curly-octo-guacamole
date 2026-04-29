package com.xiaomi.accountsdk.account;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.core.app.x9kr;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.utils.C5019y;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.data.ActivatorPhoneInfo;
import com.xiaomi.accountsdk.account.data.C5477g;
import com.xiaomi.accountsdk.account.data.C5478h;
import com.xiaomi.accountsdk.account.data.C5479i;
import com.xiaomi.accountsdk.account.data.C5480k;
import com.xiaomi.accountsdk.account.data.C5481n;
import com.xiaomi.accountsdk.account.data.C5486p;
import com.xiaomi.accountsdk.account.data.C5493z;
import com.xiaomi.accountsdk.account.data.EnumC5489s;
import com.xiaomi.accountsdk.account.data.EnumC5492y;
import com.xiaomi.accountsdk.account.data.MetaLoginData;
import com.xiaomi.accountsdk.account.data.PasswordLoginParams;
import com.xiaomi.accountsdk.account.data.PhoneTicketLoginParams;
import com.xiaomi.accountsdk.account.data.PhoneTokenRegisterParams;
import com.xiaomi.accountsdk.account.data.RegisterUserInfo;
import com.xiaomi.accountsdk.account.data.Step2LoginParams;
import com.xiaomi.accountsdk.account.data.ni7;
import com.xiaomi.accountsdk.account.data.qrj;
import com.xiaomi.accountsdk.account.data.t8r;
import com.xiaomi.accountsdk.account.data.x2;
import com.xiaomi.accountsdk.account.data.zy;
import com.xiaomi.accountsdk.request.C5538i;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.C5545n;
import com.xiaomi.accountsdk.request.C5550t;
import com.xiaomi.accountsdk.request.ki;
import com.xiaomi.accountsdk.request.mcp;
import com.xiaomi.accountsdk.request.n7h;
import com.xiaomi.accountsdk.request.o1t;
import com.xiaomi.accountsdk.request.wvg;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.accountsdk.utils.C5581y;
import com.xiaomi.accountsdk.utils.a9;
import com.xiaomi.accountsdk.utils.lvui;
import com.xiaomi.onetrack.api.at;
import com.xiaomi.passport.C5815k;
import com.xiaomi.passport.utils.C5847k;
import com.xiaomi.passport.utils.zy;
import com.xiaomi.settingsdk.backup.data.KeyJsonSettingItem;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import kx3.C6757k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p039w.C7720g;
import p039w.C7721h;
import p039w.C7722i;
import p039w.C7725p;
import p039w.C7727s;
import p039w.C7728y;
import p039w.cdj;
import p039w.fn3e;
import p039w.fu4;
import p039w.ki;
import p039w.kja0;
import p039w.ni7;
import p039w.qrj;
import p039w.t8r;
import p039w.x2;
import p039w.zurt;
import v5yj.C7704k;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.account.s */
/* JADX INFO: compiled from: XMPassport.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5502s {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f72776a9 = 25009;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f72777cdj = "extra_scope";

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final int f72778d2ok = 70001;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final long f72779d3 = 110021001;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final int f72780dd = 25005;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f72781eqxt = 10017;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f72783fn3e = 0;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f72784fti = 70012;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f72785fu4 = 25001;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f72786gvn7 = 70022;

    /* JADX INFO: renamed from: h */
    private static final int f30770h = 9;

    /* JADX INFO: renamed from: i */
    public static final String f30771i = "yyyy-MM-dd";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f72787jk = 70006;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f72788jp0y = 70014;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f72789ki = "&&&START&&&";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f72790kja0 = 2;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f72791ld6 = "1";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final int f72792lvui = 10031;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f72793mcp = 70021;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f72794n7h = 1;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f72796ni7 = 81003;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f72797o1t = 10016;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final long f72798oc = 110071001;

    /* JADX INFO: renamed from: p */
    private static final String f30775p = "_320";

    /* JADX INFO: renamed from: r */
    private static final int f30777r = 25004;

    /* JADX INFO: renamed from: t */
    private static final int f30779t = 70013;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f72800t8r = "passport";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f72802wvg = 10017;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f72803x2 = "-1";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final String f72804x9kr = "XMPassport";

    /* JADX INFO: renamed from: z */
    private static final int f30781z = 20023;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f72805zurt = 20003;

    /* JADX INFO: renamed from: k */
    public static final boolean f30772k = C5504y.f30796k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @Deprecated
    public static final String f72801toq = C5504y.f72850toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Deprecated
    public static final String f72806zy = C5504y.f30799n;

    /* JADX INFO: renamed from: q */
    @Deprecated
    public static final String f30776q = C5504y.f72822f7l8;

    /* JADX INFO: renamed from: n */
    @Deprecated
    public static final String f30774n = C5504y.f30808y;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final String f30769g = C5504y.f30804s;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @Deprecated
    public static final String f72782f7l8 = C5504y.f30801p;

    /* JADX INFO: renamed from: y */
    @Deprecated
    public static final String f30780y = C5504y.f72834ld6;

    /* JADX INFO: renamed from: s */
    @Deprecated
    public static final String f30778s = C5504y.f72854x2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final Integer f72799qrj = 0;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    static boolean f72795ncyb = false;

    /* JADX INFO: renamed from: l */
    private static final Integer f30773l = 300000;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.s$k */
    /* JADX INFO: compiled from: XMPassport.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f30782k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final /* synthetic */ int[] f72807toq;

        static {
            int[] iArr = new int[com.xiaomi.accountsdk.account.data.toq.values().length];
            f72807toq = iArr;
            try {
                iArr[com.xiaomi.accountsdk.account.data.toq.ADD_SAFE_EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72807toq[com.xiaomi.accountsdk.account.data.toq.REPLACE_SAFE_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72807toq[com.xiaomi.accountsdk.account.data.toq.ADD_PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72807toq[com.xiaomi.accountsdk.account.data.toq.REPLACE_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[EnumC5489s.values().length];
            f30782k = iArr2;
            try {
                iArr2[EnumC5489s.ADD_SAFE_EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30782k[EnumC5489s.REPLACE_SAFE_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30782k[EnumC5489s.ADD_PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30782k[EnumC5489s.REPLACE_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30782k[EnumC5489s.DELETE_PHONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30782k[EnumC5489s.SEND_EMAIL_ACTIVATE_MESSAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f30782k[EnumC5489s.SET_SECURITY_QUESTIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f30782k[EnumC5489s.MODIFY_SAFE_PHONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f30782k[EnumC5489s.CHANGE_PASSWORD.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.s$toq */
    /* JADX INFO: compiled from: XMPassport.java */
    private enum toq {
        EMAIL,
        PHONE
    }

    /* JADX INFO: renamed from: a */
    static C5486p m18790a(String str, wvg.C5555y c5555y) throws C7721h, n7h, com.xiaomi.accountsdk.request.zy, IOException {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String queryParameter;
        if (str == null) {
            throw new IllegalArgumentException("response type is null");
        }
        if (c5555y == null) {
            throw new IOException("failed to get response to get Auth2 auth info");
        }
        String str2 = c5555y.zy().get(com.google.common.net.zy.f68571zy);
        if (str2 == null || !str2.toLowerCase().contains(KeyJsonSettingItem.f34358g)) {
            throw new C7721h("contentType error : " + str2);
        }
        try {
            String strM18811v = m18811v(c5555y);
            if (strM18811v == null) {
                throw new n7h("empty response");
            }
            JSONObject jSONObject = new JSONObject(strM18811v);
            int i2 = jSONObject.getInt("code");
            if (i2 == 70016) {
                throw new com.xiaomi.accountsdk.request.zy(strM18811v);
            }
            if (i2 != 0 || !str.equals(jSONObject.getString("result"))) {
                throw new C7721h();
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            String str3 = null;
            if ("code".equals(str)) {
                queryParameter = Uri.parse(jSONObject2.getString("redirectUrl")).getQueryParameter("code");
                if (TextUtils.isEmpty(queryParameter)) {
                    throw new C7721h();
                }
                string5 = null;
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
            } else {
                String string6 = jSONObject2.getString("access_token");
                if (TextUtils.isEmpty(string6)) {
                    throw new C7721h();
                }
                string = jSONObject2.getString("expires_in");
                string2 = jSONObject2.getString("scope");
                string3 = jSONObject2.getString("token_type");
                string4 = jSONObject2.getString("mac_key");
                string5 = jSONObject2.getString("mac_algorithm");
                str3 = string6;
                queryParameter = null;
            }
            C5486p c5486p = new C5486p();
            c5486p.m18718y(str3);
            if (string != null) {
                c5486p.m18715p(Integer.valueOf(string).intValue());
            }
            c5486p.qrj(string2);
            c5486p.n7h(string3);
            c5486p.x2(string4);
            c5486p.ld6(string5);
            c5486p.m18717s(queryParameter);
            return c5486p;
        } catch (JSONException e2) {
            throw new C7721h(e2.getMessage());
        }
    }

    private static com.xiaomi.accountsdk.utils.n7h<String, String> a9(com.xiaomi.accountsdk.account.data.n7h n7hVar) {
        if (n7hVar == null) {
            throw new IllegalArgumentException("passportInfo is null");
        }
        com.xiaomi.accountsdk.utils.n7h<String, String> n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut(InterfaceC1925p.du, n7hVar.m18695q());
        if (TextUtils.isEmpty(n7hVar.m18693k())) {
            n7hVarEasyPut.easyPut("userId", n7hVar.m18694n());
        } else {
            n7hVarEasyPut.easyPut(InterfaceC1925p.dqjj, n7hVar.m18693k());
        }
        return n7hVarEasyPut;
    }

    private static AccountInfo a98o(String str, wvg.C5555y c5555y, String str2, String str3, boolean z2, boolean z3) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        String qVar;
        String qVar2;
        try {
            JSONObject jSONObject = new JSONObject(m18811v(c5555y));
            if (z2) {
                qVar = jSONObject.optString(C5480k.f72649n7h);
                qVar2 = jSONObject.optString(InterfaceC1925p.dqjj);
            } else {
                qVar = c5555y.toq(C5480k.f72649n7h);
                qVar2 = c5555y.toq(InterfaceC1925p.dqjj);
            }
            String strOptString = jSONObject.optString("ssecurity");
            Long lValueOf = Long.valueOf(jSONObject.optLong("nonce"));
            String strOptString2 = jSONObject.optString("psecurity");
            if (strOptString == null || lValueOf == null || strOptString2 == null) {
                try {
                    String qVar3 = c5555y.toq(com.xiaomi.accountsdk.guestaccount.f7l8.f30852k);
                    if (TextUtils.isEmpty(qVar3)) {
                        qVar3 = c5555y.toq("Extension-Pragma");
                        if (TextUtils.isEmpty(qVar3)) {
                            throw new n7h("empty extension-pragma");
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject(qVar3);
                    strOptString = jSONObject2.optString("ssecurity");
                    lValueOf = Long.valueOf(jSONObject2.optLong("nonce"));
                    strOptString2 = jSONObject2.optString("psecurity");
                } catch (JSONException unused) {
                }
            }
            if (strOptString == null || lValueOf == null || strOptString2 == null) {
                throw new n7h("security, nonce or psecurity is null");
            }
            String qVar4 = c5555y.toq("re-pass-token");
            boolean z5 = true;
            if (jSONObject.optInt("pwd") != 1) {
                z5 = false;
            }
            String string = jSONObject.getString("location");
            AccountInfo.C5452k c5452kM18576i = new AccountInfo.C5452k().o1t(str).m18575h(qVar2).ni7(str2).ki(qVar).m18576i(strOptString2);
            if (str3 != null) {
                string = str3;
            }
            AccountInfo accountInfoKja0 = c5452kM18576i.n7h(string).fn3e(qVar4).cdj(z5).zurt(strOptString).kja0();
            if (TextUtils.isEmpty(str2) || f72800t8r.equals(str2) || z3) {
                return accountInfoKja0;
            }
            try {
                try {
                    try {
                        return d3(accountInfoKja0, lValueOf);
                    } catch (C5539k e2) {
                        AbstractC5574n.m19113q(f72804x9kr, "sts url request error", e2);
                        e2.stsUrlRequestError(str2);
                        throw e2;
                    }
                } catch (com.xiaomi.accountsdk.request.zy e3) {
                    AbstractC5574n.m19113q(f72804x9kr, "sts url request error", e3);
                    e3.stsUrlRequestError(str2);
                    throw e3;
                }
            } catch (n7h e4) {
                AbstractC5574n.m19113q(f72804x9kr, "sts url request error", e4);
                e4.stsUrlRequestError(str2);
                throw e4;
            } catch (IOException e6) {
                AbstractC5574n.m19113q(f72804x9kr, "sts url request error", e6);
                ki kiVar = new ki(e6);
                kiVar.stsUrlRequestError(str2);
                throw kiVar;
            }
        } catch (JSONException unused2) {
            AbstractC5574n.zy(f72804x9kr, "parseLoginResult: " + c5555y);
            throw new n7h("parseLoginResult JSONException");
        }
    }

    /* JADX INFO: renamed from: b */
    public static AccountInfo m18791b(Step2LoginParams step2LoginParams) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (step2LoginParams == null) {
            throw new IllegalArgumentException("step2 params is null");
        }
        String str = step2LoginParams.f30572q;
        String str2 = step2LoginParams.f30574y;
        MetaLoginData metaLoginData = step2LoginParams.f30569k;
        String str3 = TextUtils.isEmpty(step2LoginParams.f30567g) ? f72800t8r : step2LoginParams.f30567g;
        boolean z2 = step2LoginParams.f30573s;
        boolean z3 = step2LoginParams.f30568h;
        String str4 = step2LoginParams.f30571p;
        String str5 = step2LoginParams.f30570n;
        if (str == null || str2 == null || metaLoginData == null) {
            throw new NullPointerException("invalid params");
        }
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("user", str).easyPut("code", str2).easyPut(InterfaceC1925p.nou, metaLoginData.f30443k).easyPut("qs", metaLoginData.f30445q).easyPut("callback", metaLoginData.f30444n).easyPut("trust", z2 ? "true" : "false").easyPutOpt("sid", str3).easyPut("_json", "true");
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut2 = new com.xiaomi.accountsdk.utils.n7h().easyPut("step1Token", str5);
        toq(n7hVarEasyPut2, str4);
        wvg.C5555y c5555yX2 = C5550t.x2(C5504y.f72823fn3e, n7hVarEasyPut, n7hVarEasyPut2, true);
        if (c5555yX2 == null) {
            throw new IOException("failed to get response from service server");
        }
        try {
            return m18812x(c5555yX2, str3, false, z3);
        } catch (p039w.f7l8 unused) {
            throw new n7h("Unexpected InvalidCredentialException");
        } catch (kja0 unused2) {
            throw new n7h("Unexpected NeedNotificationException");
        } catch (p039w.n7h unused3) {
            throw new n7h("Unexpected NeedCaptchaException");
        } catch (x2 unused4) {
            throw new n7h("Unexpected InvalidUserNameException");
        }
    }

    public static AccountInfo bf2(String str, String str2, String str3, String str4, MetaLoginData metaLoginData, boolean z2, String str5) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return i1(str, str2, str3, str4, metaLoginData, z2, str5, false);
    }

    public static String bo(String str, String str2, String str3, String str4) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        wvg.C5555y c5555yM19001s = C5550t.m19001s(C5504y.f72855x9kr, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", str).easyPut("snsType", str3).easyPut("sid", str2), new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", str).easyPut(InterfaceC1925p.du, str4), true);
        if (c5555yM19001s != null) {
            return c5555yM19001s.toString();
        }
        throw new IOException("failed to get response to refresh access token");
    }

    @Deprecated
    public static String bwp(String str, String str2, String str3, String str4, String str5, Bitmap bitmap) throws n7h, C5545n, C7728y, com.xiaomi.accountsdk.request.zy, C5539k, IOException {
        return kcsr(new com.xiaomi.accountsdk.account.data.n7h(str, str2, str3, str4, str5), bitmap);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static C5493z m18792c(String str, String str2, String str3, String str4, String str5) throws n7h, C5545n, com.xiaomi.accountsdk.request.zy, C5539k, IOException {
        return m18795f(new com.xiaomi.accountsdk.account.data.n7h(str, str2, str3, str4, str5));
    }

    @Deprecated
    public static String c8jq(String str, String str2, String str3, String str4) throws n7h, IOException, p039w.n7h {
        try {
            return y2(new C5477g.k().m18676p(str).ld6(str2).m18677s(str3, str4).m18678y());
        } catch (ni7 e2) {
            AbstractC5574n.fu4(f72804x9kr, "email used");
            throw new n7h(e2.getMessage());
        }
    }

    public static String cdj() throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        wvg.C5555y c5555yM19001s = C5550t.m19001s(C5504y.f72836lv5, null, null, true);
        if (c5555yM19001s == null) {
            throw new n7h("result content is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(m18811v(c5555yM19001s));
            if (jSONObject.getInt("code") == 0) {
                return new JSONObject(jSONObject.getString("data")).optString("pwd");
            }
            throw new n7h(c5555yM19001s.toString());
        } catch (JSONException e2) {
            AbstractC5574n.m19113q(f72804x9kr, "JSON ERROR", e2);
            throw new n7h(e2.getMessage());
        }
    }

    @Deprecated
    public static boolean cfr(String str, String str2, String str3, String str4, String str5, Map<String, Object> map) throws n7h, C5545n, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return sok(new com.xiaomi.accountsdk.account.data.n7h(str, str2, null, str3, str4), str5, map);
    }

    private static AccountInfo ch(wvg.C5555y c5555y, String str, boolean z2, boolean z3, boolean z5) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, x2, IOException, p039w.n7h, p039w.f7l8, kja0 {
        return nmn5(null, c5555y, str, z2, z3, z5);
    }

    /* JADX INFO: renamed from: d */
    private static String m18793d(com.xiaomi.accountsdk.account.data.n7h n7hVar) throws C5545n, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        wvg.C5553n c5553nM18975k = o1t.m18975k(C5504y.f30809z, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("method", KeyJsonSettingItem.f34358g), a9(n7hVar), true, n7hVar.toq());
        if (c5553nM18975k == null) {
            throw new n7h("requestUploadUserIcon request content is null");
        }
        Object objM19019s = c5553nM18975k.m19019s("code");
        if (f72799qrj.equals(objM19019s)) {
            Object objM19019s2 = c5553nM18975k.m19019s("data");
            if (objM19019s2 instanceof Map) {
                Object obj = ((Map) objM19019s2).get("uploadUrl");
                if (obj != null) {
                    return obj.toString();
                }
                throw new n7h("uploadUrl is null");
            }
        }
        Object objM19019s3 = c5553nM18975k.m19019s("description");
        AbstractC5574n.m19111k(f72804x9kr, "requestUploadUserIcon failed, code: " + objM19019s + "; description: " + objM19019s3);
        throw new n7h("requestUploadUserIcon failed, description: " + objM19019s3);
    }

    public static AccountInfo d2ok(String str, String str2, String str3, String str4, MetaLoginData metaLoginData, boolean z2, String str5) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return i1(str, str2, str3, str4, metaLoginData, z2, str5, true);
    }

    private static AccountInfo d3(AccountInfo accountInfo, Long l2) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        String str = accountInfo.f30420q;
        AbstractC5574n.m19115y(f72804x9kr, "start sts request: " + str);
        String strZurt = zurt(l2, accountInfo.f30422s);
        if (strZurt == null) {
            AbstractC5574n.zy(f72804x9kr, "failed to get client sign");
            throw new n7h(0, "sign parameters failure");
        }
        wvg.C5555y c5555yM19001s = C5550t.m19001s(accountInfo.getAutoLoginUrl(), new com.xiaomi.accountsdk.utils.n7h().easyPut("clientSign", strZurt).easyPut("_userIdNeedEncrypt", "true"), null, false);
        if (c5555yM19001s == null) {
            throw new n7h(0, "no response when get service token");
        }
        String qVar = c5555yM19001s.toq(String.format("%s_serviceToken", str));
        if (TextUtils.isEmpty(qVar)) {
            qVar = c5555yM19001s.toq(InterfaceC1925p.du);
            if (TextUtils.isEmpty(qVar)) {
                throw new n7h(0, "no service token contained in callback cookies: " + str);
            }
        }
        return new AccountInfo.C5452k().o1t(accountInfo.f30416k).ni7(str).ki(accountInfo.f30418n).m18575h(accountInfo.f30413g).fu4(qVar).zurt(accountInfo.f30422s).m18576i(accountInfo.f30419p).m18577z(c5555yM19001s.toq(str + "_slh")).t8r(c5555yM19001s.toq(str + "_ph")).fn3e(accountInfo.f30415i).cdj(accountInfo.f30417l).kja0();
    }

    public static String d8wk(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str) throws C5545n, n7h, t8r, C5539k, com.xiaomi.accountsdk.request.zy, IOException, C7727s {
        if (n7hVar == null) {
            throw new IllegalArgumentException("passport info should not be null");
        }
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPutOpt("sid", str).easyPut("transId", UUID.randomUUID().toString().substring(0, 15));
        n7hVarEasyPut.putAll(lvui.m19107n());
        com.xiaomi.accountsdk.utils.n7h<String, String> n7hVarA9 = a9(n7hVar);
        toq(n7hVarA9, null);
        wvg.C5555y c5555yM18978y = o1t.m18978y(C5504y.f30801p + "/user/sendSetPasswordTicket", n7hVarEasyPut, n7hVarA9, true, n7hVar.toq());
        if (c5555yM18978y == null) {
            throw new n7h("result content is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(m18811v(c5555yM18978y));
            int i2 = jSONObject.getInt("code");
            String str2 = "code: " + i2 + ", desc: " + jSONObject.optString("description");
            AbstractC5574n.m19111k(f72804x9kr, "requestSetPassword: " + str2);
            if (i2 == 0) {
                return jSONObject.getJSONObject("data").getString("maskedPhone");
            }
            if (i2 == 70009) {
                throw new C7727s(str2);
            }
            if (i2 != 70022) {
                throw new n7h(i2, str2);
            }
            throw new t8r(str2);
        } catch (JSONException unused) {
            throw new n7h("result not json");
        }
    }

    private static String dd(EnumC5489s enumC5489s) {
        if (enumC5489s == null) {
            throw new IllegalArgumentException("identityAuthReason is null");
        }
        switch (k.f30782k[enumC5489s.ordinal()]) {
            case 1:
                return C5504y.f72820ek5k;
            case 2:
                return C5504y.f30798m;
            case 3:
                return C5504y.f72827hb;
            case 4:
                return C5504y.f30795j;
            case 5:
                return C5504y.f30800o;
            case 6:
                return C5504y.f72857yz;
            case 7:
                return C5504y.f72856y9n;
            case 8:
                return C5504y.f30788b;
            case 9:
                return C5504y.f72814bf2;
            default:
                throw new IllegalArgumentException("invalid identityAuthReason");
        }
    }

    public static AccountInfo dr(PhoneTokenRegisterParams phoneTokenRegisterParams) throws n7h, C7728y, t8r, C5539k, com.xiaomi.accountsdk.request.zy, zurt, IOException, fu4 {
        if (phoneTokenRegisterParams == null) {
            throw new IllegalArgumentException("phone can not be empty");
        }
        String str = phoneTokenRegisterParams.f30530k;
        String str2 = phoneTokenRegisterParams.f30527g;
        String str3 = phoneTokenRegisterParams.f30534s;
        String str4 = phoneTokenRegisterParams.f30528h;
        String str5 = phoneTokenRegisterParams.f30533q;
        String str6 = phoneTokenRegisterParams.f30535y;
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("phone", str).easyPutOpt("phoneHash", str2).easyPutOpt("password", str3).easyPut("noPwd", String.valueOf(phoneTokenRegisterParams.f30532p)).easyPut("_locale", lvui.m19105g(Locale.getDefault())).easyPutOpt("region", str4).easyPutOpt("sid", phoneTokenRegisterParams.f30529i).easyPut("_json", "true").easyPut("acceptLicense", "true");
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPutOpt = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("activatorToken", str6).easyPutOpt("ticketToken", str5);
        toq(n7hVarEasyPutOpt, null);
        m18800k(n7hVarEasyPutOpt);
        String strIkck = ikck(C5504y.f72818d3, str4);
        boolean z2 = true;
        wvg.C5555y c5555yX2 = C5550t.x2(strIkck, n7hVarEasyPut, n7hVarEasyPutOpt, true);
        try {
            JSONObject jSONObject = new JSONObject(m18811v(c5555yX2));
            int i2 = jSONObject.getInt("code");
            String strOptString = jSONObject.optString("description");
            String str7 = "code: " + i2 + ", desc: " + strOptString;
            if (i2 == 0) {
                String qVar = c5555yX2.toq("userId");
                String qVar2 = c5555yX2.toq(InterfaceC1925p.dqjj);
                String qVar3 = c5555yX2.toq(C5480k.f72649n7h);
                String strOptString2 = jSONObject.optString("user_synced_url");
                AccountInfo.C5452k c5452kKi = new AccountInfo.C5452k().o1t(qVar).m18575h(qVar2).ki(qVar3);
                if (TextUtils.isEmpty(str3)) {
                    z2 = false;
                }
                return c5452kKi.cdj(z2).wvg(strOptString2).kja0();
            }
            if (i2 == 10017) {
                throw new C7728y(i2, strOptString);
            }
            if (i2 == 21317) {
                throw new zurt(str7);
            }
            if (i2 == 20023) {
                throw new fu4(str7);
            }
            if (i2 == f30777r) {
                throw new t8r(str7);
            }
            throw new n7h(str7);
        } catch (JSONException e2) {
            throw new n7h("process result is failed", e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static AccountInfo m18794e(String str, String str2, String str3, String str4, String str5) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, x2, IOException, p039w.f7l8 {
        try {
            return hb(str, str2, str3, str4, str5);
        } catch (kja0 unused) {
            throw new n7h("Unexpected NeedNotificationException");
        }
    }

    public static AccountInfo ek5k(String str, String str2, String str3, String str4, String str5, String str6, MetaLoginData metaLoginData, boolean z2, String[] strArr) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, x2, IOException, p039w.n7h, p039w.f7l8, kja0 {
        try {
            return yz(str, str2, str3, str4, str5, str6, metaLoginData, z2, strArr, C5499n.zy(), false);
        } catch (C6757k unused) {
            throw new IllegalStateException("this should never happen in product environment.Have you set sDisableLoginFallbackForTest to be true? ");
        }
    }

    public static AccountInfo eqxt(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, x2, IOException, p039w.n7h, p039w.f7l8, kja0 {
        try {
            return yz(str, str3, str4, str2, str5, str6, null, true, strArr, C5499n.zy(), true);
        } catch (C6757k unused) {
            throw new IllegalStateException("this should never happen in product environment.Have you set sDisableLoginFallbackForTest to be true? ");
        }
    }

    private static String etdu(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, com.xiaomi.accountsdk.utils.n7h<String, String> n7hVar2) throws qrj, C7720g, n7h, C5545n, C5539k, com.xiaomi.accountsdk.request.zy, IOException, fu4 {
        if (n7hVar == null) {
            throw new IllegalArgumentException("passportInfo is null");
        }
        wvg.C5553n c5553nM18974g = o1t.m18974g(str, n7hVar2, a9(n7hVar), true, n7hVar.toq());
        if (c5553nM18974g == null) {
            throw new IOException("failed to updateBindedPhoneOrEmail");
        }
        Object objM19019s = c5553nM18974g.m19019s("code");
        Object objM19019s2 = c5553nM18974g.m19019s("description");
        if (objM19019s instanceof Integer) {
            int iIntValue = ((Integer) objM19019s).intValue();
            if (iIntValue == 0) {
                Object objM19019s3 = c5553nM18974g.m19019s("data");
                if (objM19019s3 instanceof Map) {
                    Object obj = ((Map) objM19019s3).get("address");
                    if (obj != null) {
                        return obj.toString();
                    }
                    throw new n7h("address is null");
                }
            } else {
                if (iIntValue == 20023) {
                    throw new fu4();
                }
                if (iIntValue != f72787jk && iIntValue != 70008) {
                    if (iIntValue == f72788jp0y) {
                        throw new qrj("code: " + objM19019s + "; description: " + objM19019s2);
                    }
                }
            }
            throw new C7720g("code: " + objM19019s + " ;description: " + objM19019s2);
        }
        throw new n7h("code: " + objM19019s + "; description: " + objM19019s2);
    }

    /* JADX INFO: renamed from: f */
    public static C5493z m18795f(com.xiaomi.accountsdk.account.data.n7h n7hVar) throws C5545n, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ni7.EnumC5485q.BASE_INFO);
        arrayList.add(ni7.EnumC5485q.EXTRA_INFO);
        com.xiaomi.accountsdk.account.data.ni7 ni7VarNcyb = ncyb(n7hVar, null, arrayList);
        if (ni7VarNcyb == null) {
            return null;
        }
        C5493z c5493z = new C5493z(n7hVar.m18694n());
        c5493z.f7l8(ni7VarNcyb.f72672toq);
        c5493z.m18745n(ni7VarNcyb.f30643p);
        c5493z.m18743g(ni7VarNcyb.f30645s);
        return c5493z;
    }

    @Deprecated
    public static String f7l8(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, String str2, String str3) throws C7720g, n7h, C5545n, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null) {
            throw new IllegalArgumentException("passportInfo is null");
        }
        wvg.C5553n c5553nM18974g = o1t.m18974g(C5504y.f72829i1, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("address", str).easyPut("simId", C5581y.fn3e(str2)).easyPutOpt(C5550t.f30978q, a9.m19053k()).easyPut(C5550t.f72946zy, C5581y.fn3e(str3)), a9(n7hVar), true, n7hVar.toq());
        if (c5553nM18974g == null) {
            throw new IOException("failed to checkPhoneActivateStatus");
        }
        Object objM19019s = c5553nM18974g.m19019s("code");
        Object objM19019s2 = c5553nM18974g.m19019s("description");
        if (objM19019s instanceof Integer) {
            int iIntValue = ((Integer) objM19019s).intValue();
            if (iIntValue == 0) {
                Object objM19019s3 = c5553nM18974g.m19019s("data");
                if (!(objM19019s3 instanceof Map)) {
                    return null;
                }
                Object obj = ((Map) objM19019s3).get(InterfaceC1925p.qn);
                if (obj != null) {
                    return obj.toString();
                }
                throw new n7h("key is null");
            }
            if (iIntValue == 10017) {
                return null;
            }
            if (iIntValue == 70008) {
                throw new C7720g("code: " + objM19019s + " ;description: " + objM19019s2);
            }
        }
        throw new n7h("code: " + objM19019s + "; description: " + objM19019s2);
    }

    public static Pair<Bitmap, String> fn3e(String str) {
        wvg.f7l8 f7l8VarM18996g;
        try {
            f7l8VarM18996g = C5550t.m18996g(str, null, null);
        } catch (C5539k e2) {
            AbstractC5574n.m19116z(f72804x9kr, "getCaptchaImageAndIck", e2);
            f7l8VarM18996g = null;
        } catch (com.xiaomi.accountsdk.request.zy e3) {
            AbstractC5574n.m19116z(f72804x9kr, "getCaptchaImageAndIck", e3);
            f7l8VarM18996g = null;
        } catch (IOException e4) {
            AbstractC5574n.m19116z(f72804x9kr, "getCaptchaImageAndIck", e4);
            f7l8VarM18996g = null;
        }
        if (f7l8VarM18996g == null) {
            return null;
        }
        try {
            return Pair.create(BitmapFactory.decodeStream(f7l8VarM18996g.m19015p()), f7l8VarM18996g.toq("ick"));
        } finally {
            f7l8VarM18996g.m19016s();
        }
    }

    public static void fnq8(com.xiaomi.accountsdk.account.data.t8r t8rVar) throws C7720g, n7h, C5545n, t8r, C5539k, com.xiaomi.accountsdk.request.zy, p039w.ni7, IOException, p039w.n7h {
        com.xiaomi.accountsdk.account.data.n7h n7hVar;
        if (t8rVar == null || (n7hVar = t8rVar.f30685k) == null) {
            throw new IllegalArgumentException("params should not be null!");
        }
        String str = t8rVar.f72699zy;
        String str2 = t8rVar.f30687q;
        String str3 = t8rVar.f72698toq;
        String str4 = t8rVar.f30686n;
        String str5 = t8rVar.f30684g;
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("address", str).easyPut("sid", n7hVar.zy()).easyPut(C5550t.f72946zy, str2).easyPutOpt(C5550t.f30978q, a9.m19053k()).easyPut("authST", str3).easyPut("icode", str4);
        com.xiaomi.accountsdk.utils.n7h<String, String> n7hVarA9 = a9(n7hVar);
        n7hVarA9.easyPut("ick", str5);
        wvg.C5553n c5553nM18974g = o1t.m18974g(C5504y.f30790e, n7hVarEasyPut, n7hVarA9, true, n7hVar.toq());
        if (c5553nM18974g == null) {
            throw new IOException("failed to checkAvailabilityOfBindingEmail");
        }
        Integer num = (Integer) c5553nM18974g.m19019s("code");
        String str6 = (String) c5553nM18974g.m19019s("description");
        String str7 = "code: " + num + " ;description: " + str6;
        switch (num.intValue()) {
            case 0:
                return;
            case f7l8.f72734qrj /* 20031 */:
            case f7l8.f72736x2 /* 87001 */:
                throw new p039w.n7h(num.intValue(), str6, (String) c5553nM18974g.m19019s(C5019y.f69035jk));
            case f72787jk /* 70006 */:
                throw new C7720g(str7);
            case f30779t /* 70013 */:
            case f72793mcp /* 70021 */:
                throw new p039w.ni7(str7);
            case 70022:
                throw new t8r(str7);
            default:
                throw new n7h(num.intValue(), str7);
        }
    }

    private static MetaLoginData fti(String str, String str2) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, x2, IOException, kja0 {
        try {
            uv6(new qrj.toq(str, null, str2).m18723p(true).m18725y());
            throw new n7h("Unexpected login success with empty pass token");
        } catch (p039w.f7l8 e2) {
            return e2.getMetaLoginData();
        }
    }

    public static HashMap<String, C5481n> fu4(ArrayList<String> arrayList) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return com.xiaomi.accountsdk.account.toq.m18826q(arrayList);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static boolean m18796g(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, String str2, String str3) throws C7720g, n7h, C5545n, C5539k, com.xiaomi.accountsdk.request.zy, IOException, p039w.n7h {
        if (n7hVar == null) {
            throw new IllegalArgumentException("passportInfo is null");
        }
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("address", str).easyPut("icode", str2);
        com.xiaomi.accountsdk.utils.n7h<String, String> n7hVarA9 = a9(n7hVar);
        n7hVarA9.easyPut("ick", str3);
        wvg.C5553n c5553nM18974g = o1t.m18974g(C5504y.f30797l, n7hVarEasyPut, n7hVarA9, true, n7hVar.toq());
        if (c5553nM18974g == null) {
            throw new IOException("failed to checkAvailabilityOfBindingEmail");
        }
        int iIntValue = ((Integer) c5553nM18974g.m19019s("code")).intValue();
        String str4 = (String) c5553nM18974g.m19019s("description");
        int iIntValue2 = Integer.valueOf(iIntValue).intValue();
        if (iIntValue2 == 0) {
            return true;
        }
        if (iIntValue2 != f72787jk) {
            if (iIntValue2 == f30779t || iIntValue2 == f72793mcp) {
                return false;
            }
            if (iIntValue2 != 87001) {
                throw new n7h(iIntValue, str4);
            }
            throw new p039w.n7h(iIntValue, str4, null);
        }
        throw new C7720g("code: " + iIntValue + " ;description: " + str4);
    }

    private static void g1(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, String str2) throws C7720g, n7h, C5545n, C5539k, com.xiaomi.accountsdk.request.zy, fn3e, IOException {
        if (n7hVar == null) {
            throw new IllegalArgumentException("passportInfo is null");
        }
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("address", str);
        n7hVarEasyPut.putAll(lvui.m19107n());
        wvg.C5553n c5553nM18974g = o1t.m18974g(str2, n7hVarEasyPut, a9(n7hVar), true, n7hVar.toq());
        if (c5553nM18974g == null) {
            throw new IOException("failed to sendVerifyCode");
        }
        Object objM19019s = c5553nM18974g.m19019s("code");
        Object objM19019s2 = c5553nM18974g.m19019s("description");
        if (objM19019s instanceof Integer) {
            int iIntValue = ((Integer) objM19019s).intValue();
            if (iIntValue == 0) {
                return;
            }
            if (iIntValue == f72787jk || iIntValue == 70008) {
                throw new C7720g("code: " + objM19019s + " ;description: " + objM19019s2);
            }
            if (iIntValue == 70022) {
                throw new fn3e("code: " + objM19019s + " ;description: " + objM19019s2);
            }
        }
        throw new n7h("code: " + objM19019s + "; description: " + objM19019s2);
    }

    public static String gbni(com.xiaomi.accountsdk.account.data.zurt zurtVar) throws p039w.qrj, C5545n, n7h, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException, p039w.f7l8, fu4 {
        if (zurtVar == null) {
            throw new IllegalArgumentException("set password params should not be null");
        }
        com.xiaomi.accountsdk.account.data.n7h n7hVar = zurtVar.f72717toq;
        if (n7hVar == null) {
            throw new IllegalArgumentException("passport info should not be null");
        }
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", zurtVar.f30711k).easyPut("pwd", zurtVar.f72718zy).easyPut(C5480k.f72649n7h, zurtVar.f30713q).easyPutOpt("sid", zurtVar.f30710g).easyPutOpt("ticket", zurtVar.f30712n).easyPut("transId", UUID.randomUUID().toString().substring(0, 15));
        com.xiaomi.accountsdk.account.data.ld6 ld6Var = zurtVar.f30714y;
        if (ld6Var != null) {
            n7hVarEasyPut.easyPutOpt("phone", ld6Var.f72661toq).easyPutOpt("simId", ld6Var.f72662zy).easyPutOpt("vKey2", ld6Var.f30633q).easyPutOpt("nonce", ld6Var.f30632n);
        }
        com.xiaomi.accountsdk.utils.n7h<String, String> n7hVarA9 = a9(n7hVar);
        toq(n7hVarA9, zurtVar.f72716f7l8);
        wvg.C5555y c5555yM18978y = o1t.m18978y(C5504y.f72834ld6 + "/safe/user/setPassword", n7hVarEasyPut, n7hVarA9, true, n7hVar.toq());
        if (c5555yM18978y == null) {
            throw new n7h("result content is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(m18811v(c5555yM18978y));
            int i2 = jSONObject.getInt("code");
            String str = "code: " + i2 + ", desc: " + jSONObject.optString("description");
            AbstractC5574n.m19111k(f72804x9kr, "requestSetPassword: " + str);
            if (i2 == 0) {
                return jSONObject.getJSONObject("data").getString(C5480k.f72649n7h);
            }
            if (i2 == f72792lvui) {
                throw new fu4(str);
            }
            if (i2 == 21317) {
                throw new p039w.f7l8(i2, str, false);
            }
            if (i2 == 70003) {
                throw new C7728y(str);
            }
            if (i2 == f72784fti || i2 == f72788jp0y) {
                throw new p039w.qrj(str);
            }
            throw new n7h(str);
        } catch (JSONException unused) {
            throw new n7h("result not json");
        }
    }

    public static void gc3c(com.xiaomi.accountsdk.account.data.n7h n7hVar, C5493z c5493z) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null || c5493z == null) {
            throw new IllegalArgumentException("invalid parameter");
        }
        Calendar calendarM18744k = c5493z.m18744k();
        wvg.C5553n c5553nM18974g = o1t.m18974g(C5504y.f72841ncyb, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("sid", n7hVar.zy()).easyPut("transId", UUID.randomUUID().toString().substring(0, 15)).easyPut("userName", c5493z.m18746q()).easyPut(at.f31709c, calendarM18744k != null ? new SimpleDateFormat(f30771i).format(calendarM18744k.getTime()) : null).easyPut(at.f31708b, c5493z.toq() != null ? c5493z.toq().getType() : null), a9(n7hVar), true, n7hVar.toq());
        if (c5553nM18974g == null) {
            throw new n7h("failed to upload xiaomi user profile");
        }
        Integer num = (Integer) c5553nM18974g.m19019s("code");
        if (f72799qrj.equals(num)) {
            return;
        }
        String str = (String) c5553nM18974g.m19019s("description");
        String str2 = "code: " + num + ", desc: " + str;
        AbstractC5574n.m19115y(f72804x9kr, "failed to upload xiaomi user info, " + str2);
        int iIntValue = num.intValue();
        if (iIntValue == 10017) {
            throw new C7728y(num.intValue(), str);
        }
        if (iIntValue == 66108) {
            throw new C7728y(num.intValue(), str);
        }
        throw new n7h(str2);
    }

    public static void gvn7(String str, String str2, String str3) throws n7h, C7722i, C5539k, com.xiaomi.accountsdk.request.zy, IOException, p039w.n7h {
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("phone", str);
        if (str2 != null) {
            n7hVarEasyPut.easyPut("icode", str2);
        }
        try {
            JSONObject jSONObject = new JSONObject(m18811v(C5550t.x2(C5504y.f72830jk, n7hVarEasyPut, str3 != null ? new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("ick", str3) : null, true)));
            int i2 = jSONObject.getInt("code");
            if (i2 != 0) {
                if (i2 == 20031) {
                    throw new p039w.n7h(i2, "", jSONObject.getString(C5019y.f69035jk));
                }
                if (i2 == f72785fu4) {
                    throw new C7722i("phone is registered");
                }
                throw new n7h("process result is failed");
            }
        } catch (JSONException e2) {
            AbstractC5574n.m19113q(f72804x9kr, "getRegisterVerifyCode ", e2);
            throw new n7h("process result is failed");
        }
    }

    @Deprecated
    public static String gyi(String str, String str2, String str3) throws n7h, IOException {
        Object obj;
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("phone", str).easyPut("password", str2).easyPut("ticket", str3);
        com.xiaomi.accountsdk.utils.n7h n7hVar = new com.xiaomi.accountsdk.utils.n7h();
        wvg.C5553n c5553nM18999p = null;
        toq(n7hVar, null);
        try {
            c5553nM18999p = C5550t.m18999p(C5504y.f30805t, n7hVarEasyPut, n7hVar, true);
        } catch (C5539k e2) {
            e2.printStackTrace();
        } catch (com.xiaomi.accountsdk.request.zy e3) {
            e3.printStackTrace();
        }
        if (c5553nM18999p == null) {
            throw new IOException("failed to register, no response");
        }
        Object objM19019s = c5553nM18999p.m19019s("code");
        if (f72799qrj.equals(objM19019s)) {
            Object objM19019s2 = c5553nM18999p.m19019s("data");
            if ((objM19019s2 instanceof Map) && (obj = ((Map) objM19019s2).get("userId")) != null) {
                return obj.toString();
            }
        }
        if (f30772k) {
            AbstractC5574n.fu4(f72804x9kr, String.format("register failed, code: %s, description: %s", objM19019s, c5553nM18999p.m19019s("description")));
        }
        throw new n7h("failed to register due to invalid response from server");
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static void m18797h(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, String str2) throws p039w.zy, C7720g, n7h, C5545n, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null) {
            throw new IllegalArgumentException("passportInfo is null");
        }
        wvg.C5553n c5553nM18974g = o1t.m18974g(C5504y.f72835lrht, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("sid", n7hVar.zy()).easyPut("address", str).easyPut("authST", str2), a9(n7hVar), true, n7hVar.toq());
        if (c5553nM18974g == null) {
            throw new IOException("failed to deleteBindedPhone");
        }
        Object objM19019s = c5553nM18974g.m19019s("code");
        Object objM19019s2 = c5553nM18974g.m19019s("description");
        if (objM19019s instanceof Integer) {
            int iIntValue = ((Integer) objM19019s).intValue();
            if (iIntValue == 0) {
                return;
            }
            if (iIntValue == f72776a9) {
                throw new p039w.zy("code: " + objM19019s + " ;description: " + objM19019s2);
            }
            if (iIntValue == 70008) {
                throw new C7720g("code: " + objM19019s + " ;description: " + objM19019s2);
            }
        }
        throw new n7h("code: " + objM19019s + "; description: " + objM19019s2);
    }

    public static AccountInfo hb(String str, String str2, String str3, String str4, String str5) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, x2, IOException, p039w.f7l8, kja0 {
        return uv6(new qrj.toq(str, str4, str2).x2(str5).m18724s(str3).ld6(false).m18723p(false).m18725y());
    }

    @Deprecated
    public static com.xiaomi.accountsdk.account.data.fu4 hyr(String str, String str2, String str3, String str4) throws n7h, C5545n, com.xiaomi.accountsdk.request.zy, C5539k, IOException {
        return m18801l(new com.xiaomi.accountsdk.account.data.n7h(str, str2, null, str3, str4));
    }

    /* JADX INFO: renamed from: i */
    public static Pair<Bitmap, String> m18798i(String str) {
        return fn3e(f72801toq + str);
    }

    private static AccountInfo i1(String str, String str2, String str3, String str4, MetaLoginData metaLoginData, boolean z2, String str5, boolean z3) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return m18791b(new Step2LoginParams.C5475k().cdj(str).qrj(str2).m18655p(str3).kja0(str4).ld6(metaLoginData).m18654h(z2).n7h(str5).x2(z3).m18656s());
    }

    public static void i9jn(com.xiaomi.accountsdk.account.data.n7h n7hVar, ni7.EnumC5484n enumC5484n, String str) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null || enumC5484n == null) {
            throw new IllegalArgumentException("invalid params");
        }
        t8iq(C5504y.f72843nmn5, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("income", enumC5484n.level).easyPut("sid", str).easyPut("transId", UUID.randomUUID().toString().substring(0, 15)), a9(n7hVar), true, n7hVar.toq());
    }

    private static String ikck(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Application qVar = C5500p.toq();
        String qVar2 = qVar == null ? null : new C5496g(qVar).toq(str2);
        return TextUtils.isEmpty(qVar2) ? str : str.replaceFirst(C5504y.f30802q, qVar2);
    }

    /* JADX INFO: renamed from: j */
    public static AccountInfo m18799j(PasswordLoginParams passwordLoginParams) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, x2, IOException, p039w.n7h, p039w.f7l8, kja0 {
        String str;
        if (passwordLoginParams == null || (str = passwordLoginParams.f30499q) == null) {
            throw new IllegalArgumentException("password params should not be null");
        }
        String str2 = passwordLoginParams.f30496k;
        String str3 = passwordLoginParams.f30501s;
        String str4 = TextUtils.isEmpty(passwordLoginParams.f30497n) ? f72800t8r : passwordLoginParams.f30497n;
        String str5 = passwordLoginParams.f30503y;
        String str6 = passwordLoginParams.f30493g;
        String[] strArr = passwordLoginParams.f30502t;
        boolean z2 = passwordLoginParams.f30495i;
        boolean z3 = passwordLoginParams.f30504z;
        MetaLoginData metaLoginData = passwordLoginParams.f30494h;
        ActivatorPhoneInfo activatorPhoneInfo = passwordLoginParams.f30500r;
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("user", str2).easyPut("hash", C5581y.cdj(str)).easyPutOpt("sid", str4).easyPutOpt("captCode", str6).easyPut("_json", "true");
        zy(n7hVarEasyPut, strArr);
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPutOpt = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("ick", str5).easyPutOpt("ticketToken", passwordLoginParams.f30498p);
        toq(n7hVarEasyPutOpt, str3);
        m18800k(n7hVarEasyPutOpt);
        if (activatorPhoneInfo != null) {
            n7hVarEasyPut.easyPutOpt("userHash", activatorPhoneInfo.f30436q);
            n7hVarEasyPutOpt.easyPutOpt("activatorToken", activatorPhoneInfo.f30435n);
        }
        C5538i c5538i = new C5538i();
        c5538i.m18941n(n7hVarEasyPut);
        c5538i.zy(n7hVarEasyPutOpt);
        c5538i.ld6(C5504y.f72849t8r);
        c5538i.m18944s(true);
        try {
            wvg.C5555y qVar = new ki.zy(c5538i, str2, str4, metaLoginData).toq();
            if (qVar != null) {
                return m18812x(qVar, str4, z3, z2);
            }
            throw new IOException("failed to get response from server");
        } catch (C6757k unused) {
            throw new IllegalStateException("this should never happen in product environment.Have you set sDisableLoginFallbackForTest to be true? ");
        }
    }

    @Deprecated
    public static C5486p jk(Context context, String str, String str2, String str3, String str4, Bundle bundle, String str5, String str6) throws C7721h, com.xiaomi.accountsdk.request.zy, C5539k, IOException {
        String string = bundle.getString(f72777cdj);
        if (string == null || !string.equals("3")) {
            throw new C7721h();
        }
        try {
            return m4(new x2.toq().wvg(str).cdj(str2).fn3e(str3).ki(str4).ni7("3").fu4(str5).zurt("token").kja0());
        } catch (n7h unused) {
            throw new C7721h();
        }
    }

    public static C5478h jp0y(String str, String str2) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (TextUtils.isEmpty(str)) {
            str = f72800t8r;
        }
        MetaLoginData metaLoginDataM18809t = m18809t(str);
        com.xiaomi.accountsdk.utils.n7h n7hVar = new com.xiaomi.accountsdk.utils.n7h();
        n7hVar.easyPut("sid", str).easyPut("callback", metaLoginDataM18809t.f30444n);
        if (!TextUtils.isEmpty(str2)) {
            n7hVar.easyPut("csid", str2).easyPut("ccallback", m18809t(str2).f30444n);
        }
        wvg.C5555y c5555yM19001s = C5550t.m19001s(C5504y.f72850toq + "/longPolling/loginUrl", n7hVar, null, true);
        if (c5555yM19001s == null) {
            throw new n7h("qr login url content is null");
        }
        String strM18811v = m18811v(c5555yM19001s);
        try {
            JSONObject jSONObject = new JSONObject(strM18811v);
            int i2 = jSONObject.getInt("code");
            String string = jSONObject.getString("description");
            AbstractC5574n.m19115y(f72804x9kr, "getQRLoginUrl code: " + i2 + ", desc: " + string);
            if (i2 == 0) {
                return new C5478h(str, jSONObject.getString("lp"), jSONObject.getString("loginUrl"), jSONObject.getString("qr"));
            }
            throw new n7h(i2, string);
        } catch (JSONException unused) {
            throw new n7h("JSONException: " + strM18811v);
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m18800k(Map<String, String> map) {
        Map<String, String> mapM20545n = new C5847k().m20545n();
        if (mapM20545n == null || mapM20545n.size() <= 0) {
            return;
        }
        map.putAll(mapM20545n);
    }

    public static String kcsr(com.xiaomi.accountsdk.account.data.n7h n7hVar, Bitmap bitmap) throws C5545n, n7h, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null || bitmap == null) {
            throw new IllegalArgumentException("invalid parameter");
        }
        AbstractC5574n.m19115y(f72804x9kr, "requestUploadUserIcon start: ");
        String strM18793d = m18793d(n7hVar);
        AbstractC5574n.m19115y(f72804x9kr, "uploadIconToServer start: ");
        JSONObject jSONObjectW831 = w831(strM18793d, bitmap);
        AbstractC5574n.m19115y(f72804x9kr, "commitUploadUserIcon start: ");
        return qrj(n7hVar, jSONObjectW831);
    }

    private static com.xiaomi.accountsdk.utils.n7h<String, String> ki(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, com.xiaomi.accountsdk.account.data.toq toqVar, String str2, String str3, String str4) {
        if (toqVar == null) {
            throw new IllegalArgumentException("type is null");
        }
        com.xiaomi.accountsdk.utils.n7h<String, String> n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("sid", n7hVar.zy()).easyPut("vkey", str2).easyPut("authST", str3);
        if (toqVar == com.xiaomi.accountsdk.account.data.toq.REPLACE_PHONE) {
            n7hVarEasyPut.easyPut("oldAuthPhone", str4).easyPut("newAuthPhone", str);
        } else {
            n7hVarEasyPut.easyPut("address", str);
        }
        return n7hVarEasyPut;
    }

    private static JSONArray kja0(List<com.xiaomi.accountsdk.account.data.ki> list) {
        JSONArray jSONArray = new JSONArray();
        for (com.xiaomi.accountsdk.account.data.ki kiVar : list) {
            if (kiVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("q", kiVar.f30629k);
                    jSONObject.put("a", kiVar.f72659toq);
                } catch (JSONException e2) {
                    AbstractC5574n.m19113q(f72804x9kr, "convertSQsToJsonArray", e2);
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: l */
    public static com.xiaomi.accountsdk.account.data.fu4 m18801l(com.xiaomi.accountsdk.account.data.n7h n7hVar) throws C5545n, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ni7.EnumC5485q.BASE_INFO);
        arrayList.add(ni7.EnumC5485q.BIND_ADDRESS);
        return new com.xiaomi.accountsdk.account.data.fu4(n7hVar.m18694n(), ncyb(n7hVar, null, arrayList));
    }

    @Deprecated
    public static RegisterUserInfo ld6(String str, String str2, String str3, String str4, String str5, String str6) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, C7725p, IOException, fu4 {
        return m18808s(new zy.toq().x2(str, str2).m18762y(str3, str5, str6).ld6(str4).m18760p());
    }

    public static AccountInfo lrht(C5478h c5478h) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException, p039w.f7l8, kja0 {
        if (c5478h == null) {
            throw new IllegalArgumentException("null long polling para");
        }
        wvg.C5555y c5555yM19002y = C5550t.m19002y(c5478h.f72631toq, null, null, null, true, f30773l);
        if (c5555yM19002y == null) {
            throw new n7h("long polling result is null");
        }
        try {
            return ch(c5555yM19002y, c5478h.f30606k, true, true, false);
        } catch (cdj | p039w.n7h | p039w.x2 e2) {
            throw new n7h("should not reach here!", e2);
        }
    }

    public static void ltg8(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, String str2, String str3) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null) {
            throw new IllegalArgumentException("null passport info");
        }
        t8iq(C5504y.f30807x, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("region", str).easyPut("location", str2).easyPut("sid", str3).easyPut("transId", UUID.randomUUID().toString().substring(0, 15)), a9(n7hVar), true, n7hVar.toq());
    }

    private static AccountInfo lv5(wvg.C5555y c5555y, String str, boolean z2) throws p039w.qrj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException, C7727s, kja0 {
        try {
            JSONObject jSONObject = new JSONObject(m18811v(c5555y));
            int i2 = jSONObject.getInt("code");
            String str2 = "code: " + i2 + ", desc: " + jSONObject.optString("desc");
            AbstractC5574n.m19115y(f72804x9kr, "processPhoneLoginContent: " + str2);
            if (i2 != 0) {
                if (i2 == 70008) {
                    throw new C7727s(str2);
                }
                if (i2 != f72788jp0y) {
                    throw new n7h(str2);
                }
                throw new p039w.qrj(str2);
            }
            String qVar = c5555y.toq("userId");
            String qVar2 = c5555y.toq(C5480k.f72649n7h);
            if (jSONObject.optInt("securityStatus", 0) == 0) {
                if (TextUtils.isEmpty(qVar)) {
                    throw new n7h("no user Id in login response");
                }
                if (TextUtils.isEmpty(qVar2)) {
                    throw new n7h("no passToken in login response");
                }
                return a98o(qVar, c5555y, str, null, false, z2);
            }
            String string = jSONObject.getString("notificationUrl");
            if (string == null) {
                throw new n7h("notificationUrl is null");
            }
            if (!string.startsWith("http")) {
                string = f72801toq + string;
            }
            throw new kja0(qVar, string, c5555y);
        } catch (JSONException unused) {
            throw new n7h("result not json");
        }
    }

    public static String lvui(String str, String str2, String str3, String str4) throws C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        wvg.C5555y c5555yM19001s = C5550t.m19001s(C5504y.f72819dd, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", str).easyPut("snsType", str3).easyPut("sid", str2), new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", str).easyPut(InterfaceC1925p.du, str4), true);
        if (c5555yM19001s != null) {
            return c5555yM19001s.toString();
        }
        throw new IOException("failed to get response to get access token");
    }

    /* JADX INFO: renamed from: m */
    public static AccountInfo m18802m(String str, String str2, String str3, String str4, String str5, String str6, MetaLoginData metaLoginData, boolean z2) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, IOException, p039w.n7h, p039w.f7l8, kja0 {
        return ek5k(str, str2, str3, str4, str5, str6, metaLoginData, z2, null);
    }

    public static C5486p m4(com.xiaomi.accountsdk.account.data.x2 x2Var) throws C7721h, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPutOpt = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt(InterfaceC1925p.du, x2Var.f30693g);
        if (!x2Var.f72706x2 || TextUtils.isEmpty(x2Var.f72703ld6)) {
            n7hVarEasyPutOpt.easyPutOpt("userId", x2Var.f30694k);
        } else {
            n7hVarEasyPutOpt.easyPutOpt(InterfaceC1925p.dqjj, x2Var.f72703ld6);
        }
        n7hVarEasyPutOpt.easyPutOpt(C5550t.f72946zy, x2Var.f30696p);
        n7hVarEasyPutOpt.easyPutOpt(C5550t.f30978q, a9.m19053k());
        if (TextUtils.isEmpty(x2Var.f30695n)) {
            x2Var.f30695n = "token";
        }
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("client_id", x2Var.f72705toq).easyPut("redirect_uri", x2Var.f72707zy).easyPut("response_type", x2Var.f30695n).easyPut("scope", x2Var.f30697q).easyPut("skip_confirm", "true").easyPut("state", x2Var.f30698s).easyPut("_json", "true");
        if (!TextUtils.isEmpty(x2Var.f30699y) && !TextUtils.isEmpty(x2Var.f30699y.trim())) {
            n7hVarEasyPut.easyPutOpt(C7704k.q.f95561ni7, x2Var.f30699y);
        }
        n7hVarEasyPut.easyPutOpt("pt", x2Var.f72702f7l8);
        return m18790a(x2Var.f30695n, C5550t.m19001s(C5504y.f72821eqxt, n7hVarEasyPut, n7hVarEasyPutOpt, true));
    }

    public static MetaLoginData mcp(String str, String str2) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, IOException {
        try {
            vyq(str, str2, null, null);
            throw new n7h("Unexpected login success with empty pass token");
        } catch (p039w.f7l8 e2) {
            return e2.getMetaLoginData();
        }
    }

    public static void mu(String str, String str2, String str3, String str4, String str5) throws n7h, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        try {
            String strM18811v = m18811v(C5550t.x2(C5504y.f72846oc, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", str).easyPut("password", str2).easyPut("_json", "true").easyPutOpt("passportsecurity_ph", str4), new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", str).easyPutOpt(InterfaceC1925p.du, str3).easyPutOpt("passportsecurity_ph", str4).easyPutOpt("passportsecurity_slh", str5), true));
            long j2 = new JSONObject(strM18811v).getLong("result");
            if (j2 == 0) {
                return;
            }
            if (j2 != f72779d3 && j2 != f72798oc) {
                throw new n7h("reset password fail: " + strM18811v);
            }
            throw new C7728y("invalid password");
        } catch (JSONException e2) {
            throw new n7h("process result is failed", e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m18803n(String str) throws n7h, IOException {
        String strX9kr = x9kr(str, toq.EMAIL);
        if ("1".equals(strX9kr)) {
            return false;
        }
        if ("-1".equals(strX9kr)) {
            return true;
        }
        throw new n7h(String.format("url %s should only return 1 or -1 as user id, but actually return %s", C5504y.f72859zurt, strX9kr));
    }

    @Deprecated
    public static com.xiaomi.accountsdk.account.data.fu4 n5r1(String str, String str2, String str3) throws n7h, C5545n, com.xiaomi.accountsdk.request.zy, C5539k, IOException {
        return m18801l(new com.xiaomi.accountsdk.account.data.n7h(str, null, null, str2, str3));
    }

    @Deprecated
    public static AccountInfo n7h(String str, String str2, String str3, String str4, String str5, String str6) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, IOException, p039w.n7h, p039w.f7l8, kja0 {
        try {
            return yz(str, str3, str4, str2, str5, str6, null, false, null, C5499n.zy(), true);
        } catch (C6757k unused) {
            throw new IllegalStateException("this should never happen in product environment.Have you set sDisableLoginFallbackForTest to be true? ");
        } catch (kja0 unused2) {
            throw new n7h("Unexpected NeedNotificationException");
        }
    }

    public static com.xiaomi.accountsdk.account.data.ni7 ncyb(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, List<ni7.EnumC5485q> list) throws C5545n, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        int i2;
        if (n7hVar == null) {
            throw new IllegalArgumentException("passportInfo is null");
        }
        if (list != null) {
            Iterator<ni7.EnumC5485q> it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                i2 |= it.next().value;
            }
        } else {
            i2 = 0;
        }
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("sid", str).easyPut("transId", UUID.randomUUID().toString().substring(0, 15));
        if (i2 != 0) {
            n7hVarEasyPut.easyPut(InterfaceC1925p.pwo, String.valueOf(i2));
        }
        return zp(n7hVar.m18694n(), o1t.m18975k(C5504y.f72842ni7, n7hVarEasyPut, a9(n7hVar), true, n7hVar.toq()));
    }

    public static HashMap<String, Object> ni7(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, List<String> list) throws C5545n, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return com.xiaomi.accountsdk.account.toq.zy(n7hVar, str, list);
    }

    private static AccountInfo nmn5(String str, wvg.C5555y c5555y, String str2, boolean z2, boolean z3, boolean z5) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, IOException, p039w.n7h, p039w.f7l8, kja0 {
        String qVar;
        String qVar2;
        try {
            JSONObject jSONObject = new JSONObject(m18811v(c5555y));
            int i2 = jSONObject.getInt("code");
            String string = jSONObject.getString("desc");
            AbstractC5574n.m19115y(f72804x9kr, "processLoginContent, code: " + i2 + ", desc: " + string);
            if (i2 != 0) {
                if (i2 == f72805zurt) {
                    throw new p039w.x2();
                }
                if (i2 == 70002) {
                    throw new p039w.f7l8(i2, string, false);
                }
                if (i2 == 70016) {
                    String string2 = jSONObject.getString(InterfaceC1925p.nou);
                    String string3 = jSONObject.getString("qs");
                    String string4 = jSONObject.getString("callback");
                    String string5 = jSONObject.getString("captchaUrl");
                    if (TextUtils.equals("null", string5)) {
                        string5 = null;
                    }
                    throw new p039w.f7l8(i2, string, true).metaLoginData(new MetaLoginData(string2, string3, string4)).captchaUrl(string5);
                }
                if (i2 != f72796ni7) {
                    if (i2 != 87001) {
                        throw new n7h(i2, string);
                    }
                    throw new p039w.n7h(i2, string, jSONObject.getString("captchaUrl"));
                }
                throw new cdj(new MetaLoginData(jSONObject.getString(InterfaceC1925p.nou), jSONObject.getString("qs"), jSONObject.getString("callback")), c5555y.toq("step1Token"), jSONObject.optString("userId"));
            }
            if (z3) {
                qVar = jSONObject.optString("userId");
                qVar2 = jSONObject.optString(C5480k.f72649n7h);
            } else {
                qVar = c5555y.toq("userId");
                qVar2 = c5555y.toq(C5480k.f72649n7h);
            }
            String str3 = qVar;
            String str4 = qVar2;
            boolean z6 = (z2 && str != null && jSONObject.optBoolean("disableHotfixMiui73508", false)) ? false : z2;
            int iOptInt = jSONObject.optInt("securityStatus", 0);
            AbstractC5574n.m19115y(f72804x9kr, "securityStatus: " + iOptInt);
            if (!z6 || iOptInt == 0) {
                if (TextUtils.isEmpty(str3)) {
                    throw new n7h("no user Id");
                }
                if (TextUtils.isEmpty(str4)) {
                    throw new n7h("no passToken in login response");
                }
                return a98o(str3, c5555y, str2, null, z3, z5);
            }
            String string6 = jSONObject.getString("notificationUrl");
            if (string6 == null) {
                throw new n7h("noticationUrl is null");
            }
            if (string6.startsWith("http")) {
                throw new kja0(str3, string6, c5555y);
            }
            throw new kja0(str3, f72801toq + string6, c5555y);
        } catch (JSONException unused) {
            AbstractC5574n.zy(f72804x9kr, "processLoginContent: " + c5555y);
            throw new n7h("processLoginContent JSONException");
        }
    }

    public static AccountInfo nn86(String str, String str2, String str3, String str4) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, IOException, p039w.f7l8, kja0 {
        return hb(str, str2, str3, str4, C5504y.f72837lvui);
    }

    /* JADX INFO: renamed from: o */
    public static AccountInfo m18804o(String str, String str2, String str3, String str4, String str5, String str6, MetaLoginData metaLoginData) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, IOException, p039w.n7h, p039w.f7l8 {
        try {
            return m18802m(str, str2, str3, str4, str5, str6, metaLoginData, false);
        } catch (kja0 unused) {
            throw new n7h("Unexpected NeedNotificationException");
        }
    }

    public static String o1t(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, EnumC5489s enumC5489s) throws n7h, C5545n, com.xiaomi.accountsdk.request.zy, C5539k, IOException {
        return wvg(n7hVar, str, dd(enumC5489s));
    }

    public static AccountInfo oc(String str, String str2, String str3, String str4) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, IOException, p039w.f7l8, kja0 {
        return uv6(new qrj.toq(str, str4, str2).x2(C5504y.f72837lvui).m18724s(str3).ld6(true).m18723p(false).m18725y());
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public static RegisterUserInfo m18805p(String str, String str2, String str3, String str4) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, C7725p, IOException, fu4 {
        return m18808s(new zy.toq().x2(str, str2).m18762y(str3, null, null).ld6(str4).m18760p());
    }

    public static void py(com.xiaomi.accountsdk.account.data.n7h n7hVar, ni7.zy zyVar, String str) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null || zyVar == null) {
            throw new IllegalArgumentException("invalid params");
        }
        t8iq(C5504y.f72816ch, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("education", zyVar.level).easyPut("sid", str).easyPut("transId", UUID.randomUUID().toString().substring(0, 15)), a9(n7hVar), true, n7hVar.toq());
    }

    /* JADX INFO: renamed from: q */
    public static void m18806q(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, String str2, String str3, String str4) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException, p039w.n7h, p039w.f7l8, fu4 {
        if (n7hVar == null) {
            throw new IllegalArgumentException("passportInfo is null");
        }
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("oldPassword", str).easyPut("password", str2).easyPut("icode", str3);
        com.xiaomi.accountsdk.utils.n7h<String, String> n7hVarA9 = a9(n7hVar);
        n7hVarA9.easyPut("ick", str4);
        wvg.C5553n c5553nM18974g = o1t.m18974g(C5504y.f30787a, n7hVarEasyPut, n7hVarA9, true, n7hVar.toq());
        if (c5553nM18974g == null) {
            throw new IOException("failed to changePassword");
        }
        int iIntValue = ((Integer) c5553nM18974g.m19019s("code")).intValue();
        String str5 = (String) c5553nM18974g.m19019s("description");
        String str6 = "code: " + iIntValue + " ;description: " + str5;
        if (iIntValue != 0) {
            if (iIntValue != 10017) {
                if (iIntValue == 20023) {
                    throw new fu4();
                }
                if (iIntValue != 20031) {
                    if (iIntValue == f72778d2ok) {
                        throw new p039w.f7l8(Integer.valueOf(iIntValue).intValue(), str6, true);
                    }
                    if (iIntValue != 70003) {
                        if (iIntValue != 87001) {
                            throw new n7h(iIntValue, str5);
                        }
                    }
                }
                throw new p039w.n7h(iIntValue, str5, (String) c5553nM18974g.m19019s(C5019y.f69035jk));
            }
            throw new C7728y(str6);
        }
    }

    public static void qkj8(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, String str2, String str3, String str4, String str5) throws C7720g, n7h, C5545n, t8r, C5539k, com.xiaomi.accountsdk.request.zy, p039w.ni7, IOException, p039w.n7h {
        if (n7hVar == null) {
            throw new IllegalArgumentException("passportInfo is null");
        }
        fnq8(new t8r.toq().x2(n7hVar).m18730p(str).m18731s(C5581y.fn3e(str3)).ld6(str2).m18732y(str4, str5).f7l8());
    }

    public static int qo(C5479i c5479i) throws n7h, p039w.t8r, C5539k, com.xiaomi.accountsdk.request.zy, zurt, IOException, p039w.n7h, C7727s {
        if (c5479i == null) {
            throw new IllegalArgumentException("send phone ticket params is null");
        }
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("user", c5479i.f30609k).easyPutOpt("userHash", c5479i.f72634toq).easyPutOpt("sid", c5479i.f30608g).easyPutOpt("captCode", c5479i.f72633f7l8).easyPut("_json", "true");
        n7hVarEasyPut.putAll(lvui.m19107n());
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPutOpt = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("activatorToken", c5479i.f72635zy).easyPutOpt("ick", c5479i.f30613y);
        toq(n7hVarEasyPutOpt, c5479i.f30610n);
        wvg.C5555y c5555yX2 = C5550t.x2(C5504y.f30799n + "/sendServiceLoginTicket", n7hVarEasyPut, n7hVarEasyPutOpt, true);
        if (c5555yX2 == null) {
            throw new n7h("result content is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(m18811v(c5555yX2));
            int i2 = jSONObject.getInt("code");
            String strOptString = jSONObject.optString("description");
            String str = "code: " + i2 + ", desc: " + strOptString;
            AbstractC5574n.m19115y(f72804x9kr, "sendPhoneLoginTicket: " + str);
            if (i2 == 0) {
                return jSONObject.getJSONObject("data").optInt("vCodeLen");
            }
            if (i2 == 21317) {
                throw new zurt(str);
            }
            if (i2 == 70008) {
                throw new C7727s(strOptString);
            }
            if (i2 == 70022) {
                throw new p039w.t8r(str);
            }
            if (i2 != 87001) {
                throw new n7h(i2, strOptString);
            }
            throw new p039w.n7h(i2, strOptString, jSONObject.getString("captchaUrl"));
        } catch (JSONException unused) {
            throw new n7h("result not json");
        }
    }

    private static String qrj(com.xiaomi.accountsdk.account.data.n7h n7hVar, JSONObject jSONObject) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        wvg.C5553n c5553nM18974g = o1t.m18974g(C5504y.f72845o1t, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("sid", n7hVar.zy()).easyPut("transId", UUID.randomUUID().toString().substring(0, 15)).easyPut(KeyJsonSettingItem.f34358g, Base64.encodeToString(jSONObject.toString().getBytes(), 2)), a9(n7hVar), true, n7hVar.toq());
        if (c5553nM18974g == null) {
            throw new n7h("commitUploadUserIcon content is null");
        }
        Integer num = (Integer) c5553nM18974g.m19019s("code");
        String str = (String) c5553nM18974g.m19019s("description");
        AbstractC5574n.m19111k(f72804x9kr, "commitUploadUserIcon failed, code: " + num + "; description: " + str);
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 66108) {
                throw new n7h(num.intValue(), str);
            }
            throw new C7728y(num.intValue(), str);
        }
        Object objM19019s = c5553nM18974g.m19019s("data");
        if (!(objM19019s instanceof Map)) {
            return null;
        }
        Object obj = ((Map) objM19019s).get("downloadUrl");
        if (obj != null) {
            return obj.toString();
        }
        throw new n7h("downloadUrl is null");
    }

    /* JADX INFO: renamed from: r */
    private static String m18807r(com.xiaomi.accountsdk.account.data.toq toqVar) {
        if (toqVar == null) {
            throw new IllegalArgumentException("bindingType is null");
        }
        int i2 = k.f72807toq[toqVar.ordinal()];
        if (i2 == 1) {
            return C5504y.f72852vyq;
        }
        if (i2 == 2) {
            return C5504y.f72851uv6;
        }
        if (i2 == 3) {
            return C5504y.f30791f;
        }
        if (i2 == 4) {
            return C5504y.f30789c;
        }
        throw new IllegalArgumentException("invalid bindingType");
    }

    public static void r8s8(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, String str2) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null) {
            throw new IllegalArgumentException("null passport info");
        }
        t8iq(C5504y.f72858zp, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("region", str).easyPut("sid", str2).easyPut("transId", UUID.randomUUID().toString().substring(0, 15)), a9(n7hVar), true, n7hVar.toq());
    }

    /* JADX INFO: renamed from: s */
    public static RegisterUserInfo m18808s(com.xiaomi.accountsdk.account.data.zy zyVar) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, C7725p, IOException, fu4 {
        if (zyVar == null) {
            throw new IllegalArgumentException("check reg phone params can not be null");
        }
        String str = zyVar.f30721k;
        String str2 = zyVar.f72723toq;
        String str3 = zyVar.f72724zy;
        String str4 = zyVar.f30723q;
        String str5 = zyVar.f30722n;
        String str6 = zyVar.f30720g;
        String str7 = zyVar.f72722f7l8;
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPutOpt = new com.xiaomi.accountsdk.utils.n7h().easyPut("phone", str).easyPutOpt("ticket", str2).easyPutOpt("simId", str3).easyPutOpt("vkey2", str4).easyPutOpt("nonce", str5).easyPutOpt("region", str7);
        zy(n7hVarEasyPutOpt, C5815k.toq.toq().x2(C5500p.toq()));
        com.xiaomi.accountsdk.utils.n7h n7hVar = new com.xiaomi.accountsdk.utils.n7h();
        toq(n7hVar, str6);
        wvg.C5555y c5555yX2 = C5550t.x2(ikck(C5504y.f72826gvn7, str7), n7hVarEasyPutOpt, n7hVar, true);
        try {
            JSONObject jSONObject = new JSONObject(m18811v(c5555yX2));
            int i2 = jSONObject.getInt("code");
            String str8 = "code: " + i2 + ", desc: " + jSONObject.optString("description");
            if (i2 == 0) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                String qVar = c5555yX2.toq("ticketToken");
                if (qVar != null) {
                    return new RegisterUserInfo.C5469k(jSONObject2.getInt("status")).m18644i(str).fu4(jSONObject2.optString("userId", null)).m18645z(jSONObject2.optString("userName", null)).qrj(jSONObject2.optString("portraitUrl", null)).n7h(jSONObject2.optLong("bindTime", 0L)).ki(jSONObject2.optBoolean("needGetActiveTime", false)).t8r(jSONObject2.optBoolean("needToast", false)).ni7(qVar).kja0();
                }
                throw new n7h("fail to get ticketToken");
            }
            if (i2 == 10017) {
                throw new C7725p(str8);
            }
            if (i2 == 20023) {
                throw new fu4(str8);
            }
            throw new n7h(i2, str8);
        } catch (JSONException e2) {
            throw new n7h("process result is failed", e2);
        }
    }

    @Deprecated
    public static void se(String str, String str2, String str3, String str4, String str5, String str6) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        zkd(str, str2, str3, str4, str5, str6, null, null);
    }

    public static boolean sok(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, Map<String, Object> map) throws n7h, C5545n, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return com.xiaomi.accountsdk.account.toq.m18827s(n7hVar, str, map);
    }

    /* JADX INFO: renamed from: t */
    private static MetaLoginData m18809t(String str) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        try {
            vyq(null, str, null, null);
            throw new n7h("Unexpected login success with empty pass token");
        } catch (p039w.f7l8 e2) {
            return e2.getMetaLoginData();
        } catch (p039w.x2 unused) {
            throw new n7h("should not be throw this exception");
        }
    }

    private static void t8iq(String str, Map<String, String> map, Map<String, String> map2, boolean z2, String str2) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        wvg.C5553n c5553nM18974g = o1t.m18974g(str, map, map2, z2, str2);
        if (c5553nM18974g == null) {
            throw new n7h("invalid response content");
        }
        Object objM19019s = c5553nM18974g.m19019s("code");
        Object objM19019s2 = c5553nM18974g.m19019s("description");
        if (objM19019s instanceof Integer) {
            int iIntValue = ((Integer) objM19019s).intValue();
            if (iIntValue == 0) {
                return;
            }
            if (iIntValue == 10016 || iIntValue == 10017) {
                throw new C7728y(objM19019s2 != null ? objM19019s2.toString() : "invalid params");
            }
        }
        throw new n7h("code: " + objM19019s + "description: " + objM19019s2);
    }

    public static ArrayList<HashMap<String, Object>> t8r(com.xiaomi.accountsdk.account.data.n7h n7hVar, ArrayList<String> arrayList) throws C5545n, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        return com.xiaomi.accountsdk.account.toq.toq(n7hVar, arrayList);
    }

    public static void tfm(C5479i c5479i) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, fn3e, IOException, p039w.n7h {
        if (c5479i == null) {
            throw new IllegalArgumentException("send phone reg ticket params should not be null");
        }
        String str = c5479i.f30609k;
        String str2 = c5479i.f30610n;
        String str3 = c5479i.f30612s;
        String str4 = c5479i.f72633f7l8;
        String str5 = c5479i.f30613y;
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPutOpt = new com.xiaomi.accountsdk.utils.n7h().easyPut("phone", str).easyPutOpt("icode", str4).easyPutOpt("region", str3);
        n7hVarEasyPutOpt.putAll(lvui.m19107n());
        com.xiaomi.accountsdk.utils.n7h n7hVar = new com.xiaomi.accountsdk.utils.n7h();
        n7hVar.easyPutOpt("ick", str5);
        toq(n7hVar, str2);
        try {
            JSONObject jSONObject = new JSONObject(m18811v(C5550t.x2(ikck(C5504y.f72831jp0y, str3), n7hVarEasyPutOpt, n7hVar, true)));
            int i2 = jSONObject.getInt("code");
            String strOptString = jSONObject.optString("description");
            if (i2 != 0) {
                if (i2 != 20031) {
                    if (i2 == 70022) {
                        throw new fn3e(strOptString);
                    }
                    if (i2 != 87001) {
                        throw new n7h(i2, strOptString);
                    }
                }
                throw new p039w.n7h(i2, strOptString, jSONObject.getString(C5019y.f69035jk));
            }
        } catch (JSONException e2) {
            throw new n7h("JSON error", e2);
        }
    }

    private static void toq(com.xiaomi.accountsdk.utils.n7h<String, String> n7hVar, String str) {
        if (n7hVar == null) {
            throw new IllegalArgumentException("cookie params should not be null");
        }
        C5500p.toq();
        if (TextUtils.isEmpty(str)) {
            str = m18814z();
        }
        n7hVar.easyPutOpt(C5550t.f72946zy, str).easyPutOpt(C5550t.f30978q, a9.m19053k());
    }

    /* JADX INFO: renamed from: u */
    public static RegisterUserInfo m18810u(com.xiaomi.accountsdk.account.data.cdj cdjVar) throws p039w.qrj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException, C7727s {
        if (cdjVar == null) {
            throw new IllegalArgumentException("invalid params");
        }
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("user", cdjVar.f30581k).easyPutOpt("ticket", cdjVar.f72617zy).easyPutOpt("userHash", cdjVar.f30583q).easyPut("_json", "true");
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPutOpt = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("activatorToken", cdjVar.f30582n);
        toq(n7hVarEasyPutOpt, cdjVar.f72616toq);
        boolean z2 = true;
        wvg.C5555y c5555yX2 = C5550t.x2(C5504y.f30799n + "/phoneInfo", n7hVarEasyPut, n7hVarEasyPutOpt, true);
        if (c5555yX2 == null) {
            throw new n7h("result content is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(m18811v(c5555yX2));
            int i2 = jSONObject.getInt("code");
            String str = "code: " + i2 + ", desc: " + jSONObject.optString("description");
            AbstractC5574n.m19115y(f72804x9kr, "queryPhoneUserInfo: " + str);
            if (i2 != 0) {
                if (i2 == f72792lvui) {
                    throw new p039w.qrj(str);
                }
                if (i2 != 70008) {
                    throw new n7h(i2, str);
                }
                throw new C7727s(str);
            }
            String qVar = c5555yX2.toq("ticketToken");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            RegisterUserInfo.C5469k c5469kT8r = new RegisterUserInfo.C5469k(jSONObject2.getInt("status")).fu4(jSONObject2.getString("id")).m18645z(jSONObject2.optString(InterfaceC1925p.p05g)).qrj(jSONObject2.optString("portrait")).m18644i(jSONObject2.optString("phone")).ni7(qVar).cdj(jSONObject2.optString("maskedUserId")).m18643h(jSONObject2.optInt("pwd") == 1).n7h(jSONObject2.optLong("bindTime", 0L)).ki(jSONObject2.optBoolean("needGetActiveTime", false)).t8r(jSONObject2.optBoolean("needToast", false));
            if (jSONObject2.optInt("registerPwd") != 1) {
                z2 = false;
            }
            return c5469kT8r.fn3e(z2).kja0();
        } catch (JSONException unused) {
            throw new n7h("result not json");
        }
    }

    public static AccountInfo uv6(com.xiaomi.accountsdk.account.data.qrj qrjVar) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, IOException, p039w.f7l8, kja0 {
        if (qrjVar == null) {
            throw new IllegalArgumentException("passToken login params can not be empty");
        }
        String str = qrjVar.f30678q;
        if (TextUtils.isEmpty(str)) {
            str = C5504y.f72837lvui;
        }
        String str2 = qrjVar.f72694zy;
        if (TextUtils.isEmpty(str2)) {
            str2 = f72800t8r;
        }
        String str3 = str2;
        String str4 = qrjVar.f30676k;
        String str5 = qrjVar.f72693toq;
        String str6 = qrjVar.f30677n;
        boolean z2 = qrjVar.f30675g;
        String queryParameter = Uri.parse(str).getQueryParameter("sid");
        com.xiaomi.accountsdk.utils.n7h n7hVar = new com.xiaomi.accountsdk.utils.n7h();
        if (TextUtils.isEmpty(queryParameter)) {
            n7hVar.easyPut("sid", str3);
        }
        n7hVar.easyPut("_json", "true");
        if (qrjVar.f72692f7l8) {
            n7hVar.put("_loginSign", "ticket");
        }
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPutOpt = new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", str4).easyPutOpt(C5480k.f72649n7h, str5);
        toq(n7hVarEasyPutOpt, str6);
        m18800k(n7hVarEasyPutOpt);
        C5538i c5538i = new C5538i();
        c5538i.ld6(str);
        c5538i.zy(n7hVarEasyPutOpt);
        c5538i.m18941n(n7hVar);
        c5538i.m18944s(true);
        ki.toq toqVar = new ki.toq(c5538i);
        try {
            wvg.C5555y qVar = toqVar.toq();
            if (qVar != null) {
                return nmn5(str4, qVar, str3, true, toqVar.m18948n(), z2);
            }
            throw new IOException("failed to get response from service server");
        } catch (C6757k unused) {
            throw new IllegalStateException();
        } catch (cdj unused2) {
            throw new n7h("Unexpected NeedVerificationException");
        } catch (p039w.n7h unused3) {
            throw new n7h("Unexpected NeedCaptchaException");
        }
    }

    /* JADX INFO: renamed from: v */
    public static String m18811v(wvg.C5555y c5555y) throws IOException {
        if (c5555y == null) {
            throw new IOException("failed to get response to check register verify code");
        }
        String strM19020s = c5555y.m19020s();
        return strM19020s.startsWith(f72789ki) ? strM19020s.substring(11) : strM19020s;
    }

    @Deprecated
    public static String v0af(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, com.xiaomi.accountsdk.account.data.toq toqVar, String str2, String str3, String str4) throws p039w.qrj, C7720g, n7h, C5545n, com.xiaomi.accountsdk.request.zy, C5539k, IOException, fu4 {
        return etdu(n7hVar, m18807r(toqVar), ki(n7hVar, str, toqVar, str2, str3, str4));
    }

    @Deprecated
    public static void vq(String str, String str2) throws n7h, IOException {
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", str).easyPut("addressType", "EM").easyPut("address", str2);
        wvg.C5553n c5553nM18998n = null;
        try {
            c5553nM18998n = C5550t.m18998n(C5504y.f72838mcp, n7hVarEasyPut, null, true);
        } catch (C5539k e2) {
            e2.printStackTrace();
        } catch (com.xiaomi.accountsdk.request.zy e3) {
            e3.printStackTrace();
        }
        if (c5553nM18998n == null) {
            throw new IOException("failed to register, no response");
        }
        if (!f72799qrj.equals(c5553nM18998n.m19019s("code"))) {
            throw new n7h("invalid response, failed to send activate email");
        }
    }

    public static AccountInfo vyq(String str, String str2, String str3, String str4) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, IOException, p039w.f7l8 {
        return m18794e(str, str2, str3, str4, C5504y.f72837lvui);
    }

    private static JSONObject w831(String str, Bitmap bitmap) throws n7h, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        String strM18971k = mcp.m18971k(str, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), "userfile", "icon.jpg");
        try {
            if (!TextUtils.isEmpty(strM18971k)) {
                return new JSONObject(strM18971k);
            }
        } catch (JSONException e2) {
            AbstractC5574n.m19113q(f72804x9kr, "uploadIconToServer error", e2);
        }
        throw new n7h("upload error: " + strM18971k);
    }

    @Deprecated
    public static void was(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, com.xiaomi.accountsdk.account.data.toq toqVar) throws C7720g, n7h, C5545n, C5539k, com.xiaomi.accountsdk.request.zy, fn3e, IOException {
        if (toqVar == null) {
            throw new IllegalArgumentException("type is null");
        }
        g1(n7hVar, str, toqVar.isBindingEmail() ? C5504y.f72839n5r1 : C5504y.f72828hyr);
    }

    @Deprecated
    public static void wo(String str, String str2, String str3, String str4) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, fn3e, IOException, p039w.n7h {
        tfm(new C5479i.toq().x2(str).ld6(str2).m18684p(str3, str4).m18685s());
    }

    private static String wvg(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, String str2) throws C5545n, n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null) {
            throw new IllegalArgumentException("passportInfo is null");
        }
        String strSubstring = UUID.randomUUID().toString().substring(0, 15);
        wvg.C5553n c5553nM18975k = o1t.m18975k(str2, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("_json", String.valueOf(true)).easyPut("authST", str).easyPut("transId", strSubstring).easyPut("traceId", strSubstring), a9(n7hVar), true, n7hVar.toq());
        if (c5553nM18975k == null) {
            throw new IOException("getIdentityAuthUrl result should not be null");
        }
        Object objM19019s = c5553nM18975k.m19019s("code");
        String str3 = "code: " + objM19019s + ", desc: " + c5553nM18975k.m19019s("description");
        AbstractC5574n.m19111k(f72804x9kr, "getIdentityAuthUrl" + str3);
        if (objM19019s instanceof Integer) {
            int iIntValue = ((Integer) objM19019s).intValue();
            if (iIntValue == 0) {
                return null;
            }
            if (iIntValue == 2) {
                Object objM19019s2 = c5553nM18975k.m19019s("url");
                if (objM19019s2 != null) {
                    return objM19019s2.toString();
                }
                throw new n7h("identityUrl is null");
            }
        }
        throw new n7h("getIdentityAuthUrl: " + str3);
    }

    /* JADX INFO: renamed from: x */
    private static AccountInfo m18812x(wvg.C5555y c5555y, String str, boolean z2, boolean z3) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, IOException, p039w.n7h, p039w.f7l8, kja0 {
        return ch(c5555y, str, z2, false, z3);
    }

    public static void x2(String str, String str2) throws n7h, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        try {
            if (new JSONObject(m18811v(C5550t.m19001s(C5504y.f72824fti, new com.xiaomi.accountsdk.utils.n7h().easyPut("phone", str).easyPut("ticket", str2), null, true))).getInt("code") == 0) {
            } else {
                throw new n7h("invalid response, failed to check register verify code");
            }
        } catch (JSONException unused) {
            throw new n7h("invalid response, fail to convert to JSON");
        }
    }

    private static String x9kr(String str, toq toqVar) throws n7h, IOException {
        Object obj;
        wvg.C5553n c5553nM18998n = null;
        try {
            c5553nM18998n = C5550t.m18998n(C5504y.f72859zurt, new com.xiaomi.accountsdk.utils.n7h().easyPut("type", toqVar == toq.EMAIL ? "EM" : "PH").easyPut("externalId", str), null, true);
        } catch (C5539k e2) {
            e2.printStackTrace();
        } catch (com.xiaomi.accountsdk.request.zy e3) {
            e3.printStackTrace();
        }
        if (c5553nM18998n == null) {
            throw new IOException("failed to get response when getting user id");
        }
        if (f72799qrj.equals(c5553nM18998n.m19019s("code"))) {
            Object objM19019s = c5553nM18998n.m19019s("data");
            if ((objM19019s instanceof Map) && (obj = ((Map) objM19019s).get("userId")) != null) {
                return obj.toString();
            }
        }
        throw new n7h(String.format("server error when getting user id, reason:%s, description:%s, code:%s", c5553nM18998n.m19019s("reason"), c5553nM18998n.m19019s("description"), c5553nM18998n.m19019s("code")));
    }

    @Deprecated
    public static String xwq3(String str, String str2, String str3, String str4) throws n7h, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, zurt, IOException {
        try {
            return dr(new PhoneTokenRegisterParams.C5467k().x2(str, str3).m18631p(str2).qrj(str4).m18632s()).getUserId();
        } catch (fu4 e2) {
            throw new n7h(e2.getMessage());
        } catch (p039w.t8r e3) {
            throw new n7h(e3.getMessage());
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m18813y(Context context, String str, String str2) throws n7h, IOException {
        String strX9kr = x9kr(str, toq.PHONE);
        if ("1".equals(strX9kr)) {
            return false;
        }
        if ("-1".equals(strX9kr)) {
            return true;
        }
        throw new n7h(String.format("url %s should only return 1 or -1 as user id, but actually return %s", C5504y.f72859zurt, strX9kr));
    }

    public static String y2(C5477g c5477g) throws n7h, p039w.ni7, IOException, p039w.n7h {
        if (c5477g == null) {
            throw new IllegalArgumentException("email params should not be null");
        }
        String str = c5477g.f30599k;
        String str2 = c5477g.f72627toq;
        String str3 = c5477g.f72628zy;
        String str4 = c5477g.f30601q;
        String str5 = c5477g.f30600n;
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPut(x9kr.f50182t8iq, str).easyPut("password", str2).easyPut("_json", "true").easyPutOpt("inputcode", str3).easyPutOpt("region", str5).easyPutOpt("sid", c5477g.f30598g).easyPut("acceptLicense", "true");
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPutOpt = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("ick", str4);
        wvg.C5555y c5555yX2 = null;
        toq(n7hVarEasyPutOpt, null);
        m18800k(n7hVarEasyPutOpt);
        try {
            c5555yX2 = C5550t.x2(ikck(C5504y.f72848t8iq, str5), n7hVarEasyPut, n7hVarEasyPutOpt, true);
        } catch (C5539k e2) {
            e2.printStackTrace();
        } catch (com.xiaomi.accountsdk.request.zy e3) {
            e3.printStackTrace();
        }
        if (c5555yX2 == null) {
            throw new IOException("failed to register, no response");
        }
        try {
            JSONObject jSONObject = new JSONObject(m18811v(c5555yX2));
            int i2 = jSONObject.getInt("code");
            String strOptString = jSONObject.optString("description");
            if (i2 == 0) {
                return jSONObject.getString("userId");
            }
            if (i2 == f72780dd) {
                throw new p039w.ni7(strOptString);
            }
            if (i2 != 87001) {
                throw new n7h(i2, strOptString);
            }
            throw new p039w.n7h(i2, strOptString, C5504y.f72812a9);
        } catch (JSONException e4) {
            AbstractC5574n.m19116z(f72804x9kr, "json error", e4);
            throw new n7h("json error");
        }
    }

    public static AccountInfo y9n(PhoneTicketLoginParams phoneTicketLoginParams) throws p039w.qrj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, IOException, C7727s, kja0 {
        if (phoneTicketLoginParams == null) {
            throw new IllegalArgumentException("null phone ticket login params");
        }
        MetaLoginData metaLoginDataFti = fti(phoneTicketLoginParams.f30515k, phoneTicketLoginParams.f30513h);
        String str = TextUtils.isEmpty(phoneTicketLoginParams.f30513h) ? f72800t8r : phoneTicketLoginParams.f30513h;
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPut = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("user", phoneTicketLoginParams.f30515k).easyPutOpt("userHash", phoneTicketLoginParams.f30512g).easyPutOpt("ticket", phoneTicketLoginParams.f30519s).easyPut("sid", str).easyPut("_json", "true").easyPut(InterfaceC1925p.nou, metaLoginDataFti.f30443k).easyPut("qs", metaLoginDataFti.f30445q).easyPut("callback", metaLoginDataFti.f30444n);
        zy(n7hVarEasyPut, phoneTicketLoginParams.f30514i);
        com.xiaomi.accountsdk.utils.n7h n7hVarEasyPutOpt = new com.xiaomi.accountsdk.utils.n7h().easyPutOpt("activatorToken", phoneTicketLoginParams.f30520y).easyPutOpt("ticketToken", phoneTicketLoginParams.f30518q);
        toq(n7hVarEasyPutOpt, phoneTicketLoginParams.f30517p);
        m18800k(n7hVarEasyPutOpt);
        wvg.C5555y c5555yX2 = C5550t.x2(C5504y.f30799n + "/serviceLoginTicketAuth", n7hVarEasyPut, n7hVarEasyPutOpt, true);
        if (c5555yX2 != null) {
            return lv5(c5555yX2, str, phoneTicketLoginParams.f30521z);
        }
        throw new n7h("result content is null");
    }

    @Deprecated
    public static void yqrt(String str, String str2, String str3, String str4, String str5, EnumC5492y enumC5492y) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        zkd(str, str2, str3, str4, str5, null, null, enumC5492y);
    }

    static AccountInfo yz(String str, String str2, String str3, String str4, String str5, String str6, MetaLoginData metaLoginData, boolean z2, String[] strArr, C5499n c5499n, boolean z3) throws cdj, n7h, C5539k, com.xiaomi.accountsdk.request.zy, p039w.x2, C6757k, IOException, p039w.n7h, p039w.f7l8, kja0 {
        return m18799j(new PasswordLoginParams.C5463k().m18614z(str).zurt(str4).cdj(str3).kja0(str5).m18612h(str6).ni7(str2).m18613i(metaLoginData).fn3e(z2).t8r(z3).ki(strArr).qrj());
    }

    /* JADX INFO: renamed from: z */
    private static String m18814z() {
        return new com.xiaomi.accountsdk.hasheddeviceidlib.zy(C5500p.toq()).zy();
    }

    @Deprecated
    public static void z4(String str, String str2, String str3, String str4, String str5, Calendar calendar) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        zkd(str, str2, str3, str4, str5, null, calendar, null);
    }

    @Deprecated
    public static void zkd(String str, String str2, String str3, String str4, String str5, String str6, Calendar calendar, EnumC5492y enumC5492y) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        gc3c(new com.xiaomi.accountsdk.account.data.n7h(str, str2, str3, str4, str5), new C5493z(str, str6, calendar, enumC5492y));
    }

    private static com.xiaomi.accountsdk.account.data.ni7 zp(String str, wvg.C5553n c5553n) throws n7h {
        if (c5553n == null) {
            throw new n7h("result content is null");
        }
        Object objM19019s = c5553n.m19019s("code");
        if (!f72799qrj.equals(objM19019s)) {
            throw new n7h("code: " + objM19019s + "; description: " + c5553n.m19019s("description"));
        }
        ni7.toq toqVar = new ni7.toq(str);
        Object objM19019s2 = c5553n.m19019s("data");
        if (objM19019s2 instanceof Map) {
            Map map = (Map) objM19019s2;
            Object obj = map.get("userName");
            if (obj instanceof String) {
                toqVar.m18705h((String) obj);
            }
            Object obj2 = map.get("icon");
            if (obj2 instanceof String) {
                String str2 = (String) obj2;
                int iLastIndexOf = str2.lastIndexOf(".");
                if (str2.length() > 0 && iLastIndexOf > 0) {
                    toqVar.toq(str2.substring(0, iLastIndexOf) + f30775p + str2.substring(str2.lastIndexOf(".")));
                }
            }
            Object obj3 = map.get("sns");
            if (obj3 instanceof List) {
                toqVar.kja0(ni7.C5482g.f7l8((List) obj3));
            }
            Object obj4 = map.get("userAddresses");
            if (obj4 instanceof List) {
                ArrayList<String> arrayList = new ArrayList<>();
                for (Object obj5 : (List) obj4) {
                    if (obj5 instanceof Map) {
                        Map map2 = (Map) obj5;
                        Object obj6 = map2.get("addressType");
                        Object obj7 = map2.get("address");
                        Object obj8 = map2.get(InterfaceC1925p.pwo);
                        if ((obj6 instanceof Integer) && (obj7 instanceof String)) {
                            Integer num = (Integer) obj6;
                            String strSubstring = (String) obj7;
                            Integer num2 = f72799qrj;
                            if (obj8 instanceof Integer) {
                                num2 = (Integer) obj8;
                            }
                            boolean z2 = (num2.intValue() & 2) != 0;
                            int iIntValue = num.intValue();
                            if (iIntValue != 1) {
                                if (iIntValue != 2) {
                                    if (iIntValue == 9) {
                                        int iLastIndexOf2 = strSubstring.lastIndexOf("@ALIAS");
                                        if (iLastIndexOf2 > 0) {
                                            strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                        }
                                        toqVar.ld6(strSubstring);
                                    }
                                } else if (z2) {
                                    toqVar.m18707n(strSubstring);
                                }
                            } else if (z2) {
                                toqVar.n7h(strSubstring);
                                arrayList.add(0, strSubstring);
                            } else if (num2.intValue() == 8) {
                                arrayList.add(strSubstring);
                            }
                        }
                    }
                }
                toqVar.x2(arrayList);
            }
            Object obj9 = map.get(at.f31709c);
            if ((obj9 instanceof String) && !TextUtils.isEmpty((String) obj9)) {
                Calendar calendar = Calendar.getInstance();
                try {
                    calendar.setTime(new SimpleDateFormat(f30771i).parse((String) obj9));
                    toqVar.zy(calendar);
                } catch (ParseException e2) {
                    AbstractC5574n.m19113q(f72804x9kr, "getXiaomiUserProfile", e2);
                }
            }
            Object obj10 = map.get(at.f31708b);
            if (obj10 instanceof String) {
                String str3 = (String) obj10;
                if (!TextUtils.isEmpty(str3)) {
                    if ("m".equals(str3)) {
                        toqVar.m18704g(EnumC5492y.MALE);
                    } else if ("f".equals(str3)) {
                        toqVar.m18704g(EnumC5492y.FEMALE);
                    }
                }
            }
            Object obj11 = map.get("isSetSafeQuestions");
            if (obj11 != null && (obj11 instanceof Boolean)) {
                toqVar.m18711y(((Boolean) obj11).booleanValue());
            }
            Object obj12 = map.get("locale");
            if (obj12 instanceof String) {
                String str4 = (String) obj12;
                if (!TextUtils.isEmpty(str4)) {
                    toqVar.m18710s(str4);
                }
            }
            Object obj13 = map.get("region");
            if (obj13 instanceof String) {
                String str5 = (String) obj13;
                if (!TextUtils.isEmpty(str5)) {
                    toqVar.qrj(str5);
                }
            }
            Object obj14 = map.get("location");
            if (obj14 != null && (obj14 instanceof String)) {
                toqVar.m18708p((String) obj14);
            }
            Object obj15 = map.get("education");
            if (obj15 instanceof String) {
                String str6 = (String) obj15;
                if (!TextUtils.isEmpty(str6)) {
                    ni7.zy educationTypeByName = ni7.zy.getEducationTypeByName(str6);
                    if (educationTypeByName == null) {
                        throw new n7h("invalid education value: " + obj15);
                    }
                    toqVar.m18709q(educationTypeByName);
                }
            }
            Object obj16 = map.get("income");
            if (obj16 instanceof String) {
                String str7 = (String) obj16;
                if (!TextUtils.isEmpty(str7)) {
                    ni7.EnumC5484n incomeTypeByName = ni7.EnumC5484n.getIncomeTypeByName(str7);
                    if (incomeTypeByName == null) {
                        throw new n7h("invalid income value: " + obj16);
                    }
                    toqVar.f7l8(incomeTypeByName);
                }
            }
        }
        return toqVar.m18706k();
    }

    @Deprecated
    public static void zsr0(com.xiaomi.accountsdk.account.data.n7h n7hVar, List<com.xiaomi.accountsdk.account.data.ki> list, String str) throws n7h, C5545n, C7728y, C5539k, com.xiaomi.accountsdk.request.zy, IOException {
        if (n7hVar == null || list == null || list.size() == 0) {
            throw new IllegalArgumentException("invalid param");
        }
        JSONArray jSONArrayKja0 = kja0(list);
        wvg.C5553n c5553nM18974g = o1t.m18974g(C5504y.f72844nn86, new com.xiaomi.accountsdk.utils.n7h().easyPut("userId", n7hVar.m18694n()).easyPut("questions", jSONArrayKja0 != null ? jSONArrayKja0.toString() : null).easyPut("sid", n7hVar.zy()).easyPut("authST", str), a9(n7hVar), true, n7hVar.toq());
        if (c5553nM18974g == null) {
            throw new IOException("failed to setSecurityQuestions");
        }
        Object objM19019s = c5553nM18974g.m19019s("code");
        Object objM19019s2 = c5553nM18974g.m19019s("description");
        if (objM19019s instanceof Integer) {
            int iIntValue = ((Integer) objM19019s).intValue();
            if (iIntValue == 0) {
                return;
            }
            if (iIntValue == 10016 || iIntValue == 10017) {
                throw new C7728y("code: " + objM19019s + " ;description: " + objM19019s2);
            }
        }
        throw new n7h("code: " + objM19019s + " ;description: " + objM19019s2);
    }

    protected static String zurt(Long l2, String str) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("nonce", String.valueOf(l2));
        return C5581y.x2(null, null, treeMap, str);
    }

    private static void zy(com.xiaomi.accountsdk.utils.n7h<String, String> n7hVar, String[] strArr) {
        if (strArr == null || n7hVar == null) {
            return;
        }
        try {
            zy.toq toqVarZy = com.xiaomi.passport.utils.zy.zy(strArr);
            n7hVar.easyPutOpt("env", toqVarZy.f32636k);
            n7hVar.easyPutOpt("envKey", toqVarZy.f73256toq);
        } catch (zy.C5849k e2) {
            AbstractC5574n.o1t(f72804x9kr, e2);
        }
    }
}
