package com.android.thememanager.controller.online;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.controller.online.C1945z;
import com.android.thememanager.util.C2755a;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: RequestUrl.java */
/* JADX INFO: loaded from: classes2.dex */
public class zurt implements Serializable, Cloneable, C1945z.toq {
    public static final int REQUEST_FLAG_ADD_AD_INFO = 16;
    public static final int REQUEST_FLAG_AUTH = 2;
    public static final int REQUEST_FLAG_ENV = 1;
    public static final int REQUEST_FLAG_MASK = 15;
    public static final int REQUEST_FLAG_PARAMETER_ENCRYPTION = 4;
    public static final int REQUEST_FLAG_RESULT_DECRYPTION = 8;
    public static final int REQUEST_FLAG_THIRD_PARTY = 32;
    private static final long serialVersionUID = 4;
    private String mAnalyticsBaseUrl;
    private String mBaseUrl;
    private String mCostTimeTraceInfo;
    private String mFragment;
    private Map<String, String> mHeaders;
    private EnumC1946k mHostProxyType;
    private toq mHttpMethod;
    private String mOriginHostName;
    private Map<String, String> mParameters;
    private int mRequestFlags;
    private String mUserPostBody;

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.zurt$k */
    /* JADX INFO: compiled from: RequestUrl.java */
    public enum EnumC1946k {
        API_PROXY,
        FILE_PROXY,
        NONE
    }

    /* JADX INFO: compiled from: RequestUrl.java */
    public enum toq {
        GET,
        POST
    }

    public zurt() {
        this.mHttpMethod = toq.GET;
        this.mHostProxyType = EnumC1946k.NONE;
        this.mHeaders = new HashMap();
        this.mParameters = new HashMap();
    }

    /* JADX INFO: renamed from: k */
    private Pair<String, Map<String, String>> m7657k() {
        String aSCIIString = URI.create(this.mBaseUrl).toASCIIString();
        if (bf2.toq.m5812n()) {
            Log.i(C2755a.f16307g, "RequestUrl.finalBaseUrl: " + aSCIIString);
        }
        HashMap map = new HashMap(this.mParameters);
        C1688q c1688qCdj = C1688q.cdj();
        int i2 = this.mRequestFlags;
        if ((i2 & 1) != 0) {
            map.putAll(ld6.was(i2));
        }
        if (shouldEncryptParam()) {
            if (!c1688qCdj.o1t()) {
                Log.e(C2755a.f16307g, "Fail to get auth url because of mising token: " + this.mBaseUrl);
                return new Pair<>(null, null);
            }
            ni7.m7600n(map, c1688qCdj.fn3e());
            String strF7l8 = ni7.f7l8(aSCIIString, map, getHttpMethodName(), c1688qCdj.fn3e());
            HashMap map2 = new HashMap();
            map2.put("signature", strF7l8);
            aSCIIString = ni7.m7599k(aSCIIString, map2);
        }
        return new Pair<>(aSCIIString, map);
    }

    public void addParameter(String key, String value) {
        this.mParameters.put(key, value);
    }

    public void addRequestFlag(int flag) {
        this.mRequestFlags = flag | this.mRequestFlags;
    }

    public String getAnalyticsBaseUrl() {
        return this.mAnalyticsBaseUrl;
    }

    public String getBaseUrl() {
        return this.mBaseUrl;
    }

    public String getCostTimeTraceInfo() {
        return this.mCostTimeTraceInfo;
    }

    public String getFinalGetUrl() {
        Pair<String, Map<String, String>> pairM7657k = m7657k();
        return ni7.toq((String) pairM7657k.first, (Map) pairM7657k.second, this.mFragment);
    }

    public Map<String, String> getFinalHeaders() {
        HashMap map = new HashMap(this.mHeaders);
        fu4.zy(map);
        return map;
    }

    public Pair<String, String> getFinalPostUrl() {
        Pair<String, Map<String, String>> pairM7657k = m7657k();
        return new Pair<>((String) pairM7657k.first, TextUtils.isEmpty(this.mUserPostBody) ? ni7.m7599k(null, (Map) pairM7657k.second) : this.mUserPostBody);
    }

    public EnumC1946k getHostProxyType() {
        return this.mHostProxyType;
    }

    public String getHttpMethodName() {
        return this.mHttpMethod.name();
    }

    public String getOriginHostName() {
        return this.mOriginHostName;
    }

    public String getParameter(String key) {
        return this.mParameters.get(key);
    }

    public String getUrlId() {
        return ni7.m7599k(this.mBaseUrl, this.mParameters);
    }

    public boolean isTraceCostTime() {
        return !TextUtils.isEmpty(this.mCostTimeTraceInfo);
    }

    public void removeParameter(String key) {
        this.mParameters.remove(key);
    }

    public void setAnalyticsBaseUrl(String analyticsBaseUrl) {
        this.mAnalyticsBaseUrl = analyticsBaseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.mBaseUrl = baseUrl;
    }

    public void setCostTimeTraceInfo(String costTimeTraceInfo) {
        this.mCostTimeTraceInfo = costTimeTraceInfo;
    }

    public void setHostProxyType(EnumC1946k needProxyType) {
        if (needProxyType == null) {
            needProxyType = EnumC1946k.NONE;
        }
        this.mHostProxyType = needProxyType;
    }

    public void setHttpMethod(toq httpMethod) {
        this.mHttpMethod = httpMethod;
    }

    public void setOriginHostName(String proxyHost) {
        this.mOriginHostName = proxyHost;
    }

    public void setRequestFlag(int flag) {
        this.mRequestFlags = flag;
    }

    public void setUserPostBody(String body) {
        this.mUserPostBody = body;
    }

    public boolean shouldEncryptParam() {
        return (this.mRequestFlags & 4) != 0;
    }

    public boolean usingHttpGetMethod() {
        return this.mHttpMethod == toq.GET;
    }

    @Override // com.android.thememanager.controller.online.C1945z.toq
    public InputStream wrap(InputStream is) {
        return (this.mRequestFlags & 8) != 0 ? ni7.zy(is, C1688q.cdj().fn3e()) : is;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public zurt m28252clone() {
        try {
            zurt zurtVar = (zurt) super.clone();
            zurtVar.mHeaders = new HashMap(this.mHeaders);
            zurtVar.mParameters = new HashMap(this.mParameters);
            return zurtVar;
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public zurt(String baseUrl) {
        this.mHttpMethod = toq.GET;
        this.mHostProxyType = EnumC1946k.NONE;
        this.mHeaders = new HashMap();
        this.mParameters = new HashMap();
        this.mBaseUrl = baseUrl;
    }

    public zurt(Uri uri) {
        this.mHttpMethod = toq.GET;
        this.mHostProxyType = EnumC1946k.NONE;
        this.mHeaders = new HashMap();
        this.mParameters = new HashMap();
        this.mBaseUrl = uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
        for (String str : uri.getQueryParameterNames()) {
            this.mParameters.put(str, uri.getQueryParameter(str));
        }
        this.mFragment = uri.getEncodedFragment();
    }

    public zurt(String baseUrl, int requestFlags, EnumC1946k needHostType) {
        this.mHttpMethod = toq.GET;
        this.mHostProxyType = EnumC1946k.NONE;
        this.mHeaders = new HashMap();
        this.mParameters = new HashMap();
        this.mBaseUrl = baseUrl;
        this.mRequestFlags = requestFlags;
        setHostProxyType(needHostType);
    }

    public zurt(String baseUrl, Map<String, String> parameters, int requestFlags, EnumC1946k needProxyType) {
        this.mHttpMethod = toq.GET;
        this.mHostProxyType = EnumC1946k.NONE;
        this.mHeaders = new HashMap();
        this.mParameters = new HashMap();
        this.mBaseUrl = baseUrl;
        if (parameters != null) {
            this.mParameters = parameters;
        }
        this.mRequestFlags = requestFlags;
        setHostProxyType(needProxyType);
    }
}
