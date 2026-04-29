package com.android.thememanager.maml.widget;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1922n;
import com.android.thememanager.controller.online.C1944y;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.controller.online.zy;
import com.android.thememanager.util.C2755a;
import com.xiaomi.accountsdk.request.wvg;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.thememanager.maml.widget.g */
/* JADX INFO: compiled from: MamlDrmManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2150g {

    /* JADX INFO: renamed from: k */
    private static final String f12658k = "MamlDrmManager";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60429toq = "unknown";

    public static Pair<zy.C7914zy, String> f7l8(String productId, String fileHash2, String subHash) {
        Object obj;
        zy.C7914zy c7914zy = new zy.C7914zy(com.android.thememanager.controller.online.zy.f57986kja0);
        String str = null;
        try {
            if (TextUtils.isEmpty(fileHash2) || TextUtils.isEmpty(subHash)) {
                Pair<Integer, JSONObject> pairKi = C1944y.ki(C1915g.f7l8(m8196q(productId)));
                Log.i(f12658k, " requestDownloadUrl : " + pairKi.first);
                if (((Integer) pairKi.first).intValue() == 0 && (obj = pairKi.second) != null) {
                    String strOptString = ((JSONObject) obj).optString(InterfaceC1925p.g3a, "");
                    String strOptString2 = ((JSONObject) pairKi.second).optString("downloadUrl", "");
                    try {
                        c7914zy = zy(productId, strOptString, null);
                        str = strOptString2;
                    } catch (Exception e2) {
                        e = e2;
                        str = strOptString2;
                        Log.e(f12658k, "requestDownloadUrl error ", e);
                    }
                }
            } else {
                c7914zy = zy(productId, fileHash2, subHash);
                Log.i(f12658k, "requestDownloadUrl: " + c7914zy.m7664n());
            }
        } catch (Exception e3) {
            e = e3;
        }
        return new Pair<>(c7914zy, str);
    }

    /* JADX INFO: renamed from: g */
    private static zurt m8193g(String body) {
        zurt zurtVar = new zurt(InterfaceC1925p.bxas, 0, zurt.EnumC1946k.NONE);
        m8194k(zurtVar);
        zurtVar.setHttpMethod(zurt.toq.POST);
        try {
            zurtVar.setUserPostBody(URLEncoder.encode(body, wvg.f72949toq));
        } catch (UnsupportedEncodingException e2) {
            Log.e(C2755a.f16307g, "URLEncode body failed", e2);
            zurtVar.setUserPostBody(body);
        }
        return zurtVar;
    }

    /* JADX INFO: renamed from: k */
    public static void m8194k(zurt url) {
        zy.C1711k c1711k = new zy.C1711k();
        c1711k.f9807k = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
        c1711k.f57496toq = com.android.thememanager.basemodule.analysis.f7l8.m6613s();
        c1711k.f57497zy = com.android.thememanager.basemodule.analysis.f7l8.m6614y();
        toq(url, c1711k);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.android.thememanager.controller.online.zurt m8195n(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            com.android.thememanager.basemodule.account.q r0 = com.android.thememanager.basemodule.account.C1688q.cdj()
            boolean r0 = r0.o1t()
            boolean r1 = com.android.thememanager.basemodule.utils.lvui.gvn7()
            if (r0 == 0) goto L11
            java.lang.String r2 = com.android.thememanager.controller.online.InterfaceC1925p.ow8
            goto L13
        L11:
            java.lang.String r2 = com.android.thememanager.controller.online.InterfaceC1925p.nw
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getRightsDownloadUrl: hasGetServiceToken = "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ",isVaidValid = "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MamlDrmManager"
            android.util.Log.d(r4, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L41
            java.lang.String r5 = "productId"
            r3.put(r5, r6)
        L41:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 != 0) goto L4c
            java.lang.String r6 = "hash"
            r3.put(r6, r7)
        L4c:
            java.lang.String r6 = "packType"
            java.lang.String r7 = "WIDGET"
            r3.put(r6, r7)
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            if (r6 != 0) goto L5e
            java.lang.String r6 = "subhash"
            r3.put(r6, r8)
        L5e:
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L73
            java.lang.String r6 = com.android.thememanager.basemodule.utils.C1807g.m7075i()
            java.lang.String r8 = "vaid"
            r3.put(r8, r6)
            java.lang.String r8 = "getRightsDownloadUrl valid is valid"
            android.util.Log.i(r4, r8)
            r8 = r6
        L71:
            r6 = r7
            goto L87
        L73:
            android.content.Context r8 = bf2.toq.toq()
            java.lang.String r8 = com.android.thememanager.basemodule.utils.C1807g.m7079p(r8)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L87
            java.lang.String r6 = "imei"
            r3.put(r6, r8)
            goto L71
        L87:
            if (r6 != 0) goto Lab
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "No id, "
            r6.append(r7)
            java.lang.String r7 = com.android.thememanager.basemodule.utils.C1807g.m7075i()
            r6.append(r7)
            java.lang.String r7 = ", "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r4, r6)
            r6 = 0
            return r6
        Lab:
            if (r0 == 0) goto Laf
            r7 = 15
        Laf:
            com.android.thememanager.controller.online.zurt r6 = new com.android.thememanager.controller.online.zurt
            com.android.thememanager.controller.online.zurt$k r8 = com.android.thememanager.controller.online.zurt.EnumC1946k.API_PROXY
            r6.<init>(r2, r3, r7, r8)
            com.android.thememanager.controller.online.zurt$toq r7 = com.android.thememanager.controller.online.zurt.toq.POST
            r6.setHttpMethod(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.maml.widget.C2150g.m8195n(java.lang.String, java.lang.String, java.lang.String):com.android.thememanager.controller.online.zurt");
    }

    /* JADX INFO: renamed from: q */
    private static zurt m8196q(String id) {
        String str = InterfaceC1925p.pia;
        zurt zurtVar = new zurt(String.format(str, id), 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.setAnalyticsBaseUrl(str);
        return zurtVar;
    }

    public static void toq(zurt url, zy.C1711k info) {
        if (info == null) {
            return;
        }
        String str = info.f9807k;
        if (str == null) {
            str = "unknown";
        }
        String str2 = info.f57496toq;
        if (str2 == null) {
            str2 = "unknown";
        }
        String str3 = info.f57497zy;
        String str4 = str3 != null ? str3 : "unknown";
        url.addParameter("entryType", str);
        url.addParameter("xRef", str2);
        url.addParameter("xPrevRef", str4);
        String str5 = info.f9809q;
        if (str5 != null) {
            url.addParameter(InterfaceC1925p.l044, str5);
        }
    }

    public static zy.C7914zy zy(String productId, String fileHash, String subHash) {
        zurt zurtVarM8195n;
        zy.C7914zy c7914zy = new zy.C7914zy(com.android.thememanager.controller.online.zy.f57986kja0);
        String strCdj = C2152n.cdj();
        Log.i(f12658k, "downloadRights: " + productId);
        if (strCdj == null) {
            Log.w(f12658k, "downloadRights:  null path");
            return c7914zy;
        }
        String str = strCdj + "/" + productId + ".right";
        try {
            zurtVarM8195n = m8195n(productId, fileHash, subHash);
        } catch (C1922n e2) {
            c7914zy.m7667y(com.android.thememanager.controller.online.zy.f11059y);
            c7914zy.m7666s(e2.getResponseCode());
            c7914zy.m7665p(e2.getResponseReason());
            e2.printStackTrace();
        } catch (IOException unused) {
            c7914zy.m7667y(com.android.thememanager.controller.online.zy.f11058s);
        } catch (Exception e3) {
            c7914zy.m7667y(com.android.thememanager.controller.online.zy.f57987ld6);
            e3.printStackTrace();
        }
        if (zurtVarM8195n == null) {
            c7914zy.m7667y(com.android.thememanager.controller.online.zy.f11054h);
            return c7914zy;
        }
        Pair<Integer, JSONObject> pairKi = C1944y.ki(C1915g.f7l8(zurtVarM8195n));
        int iIntValue = ((Integer) pairKi.first).intValue();
        if (iIntValue != 0 || pairKi.second == null) {
            c7914zy.m7666s(iIntValue);
            Log.d(C2755a.f16307g, "downloadRights failed, serverResponseCode=" + iIntValue);
            if (iIntValue == 407 || iIntValue == 410) {
                c7914zy.m7667y(com.android.thememanager.controller.online.zy.f57990x2);
            } else if (iIntValue == 9999) {
                c7914zy.m7667y(com.android.thememanager.controller.online.zy.f57989qrj);
            } else if (iIntValue == 414) {
                c7914zy.m7667y(com.android.thememanager.controller.online.zy.f57985f7l8);
            } else {
                c7914zy.m7667y(com.android.thememanager.controller.online.zy.f11056p);
            }
            c7914zy.m7665p(((JSONObject) pairKi.second).optString(InterfaceC1925p.zvz, null));
        } else {
            com.android.thememanager.controller.online.toq toqVar = new com.android.thememanager.controller.online.toq("rights-" + productId);
            String strOptString = ((JSONObject) pairKi.second).optString(InterfaceC1925p.f517);
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            if (toqVar.toq(m8193g(strOptString), str)) {
                c7914zy.m7667y(100000);
            } else {
                c7914zy.m7667y(com.android.thememanager.controller.online.zy.f57988n7h);
            }
        }
        return c7914zy;
    }
}
