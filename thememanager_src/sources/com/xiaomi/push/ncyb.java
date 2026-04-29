package com.xiaomi.push;

import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class ncyb {
    /* JADX INFO: renamed from: k */
    public static String m21317k(String str) {
        try {
            return String.valueOf(x9kr.m22020n(MessageDigest.getInstance("SHA1").digest(str.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException e2) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("CloudCoder.hash4SHA1 ", e2);
            throw new IllegalStateException("failed to SHA1");
        } catch (NoSuchAlgorithmException e3) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("CloudCoder.hash4SHA1 ", e3);
            throw new IllegalStateException("failed to SHA1");
        } catch (Exception e4) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("CloudCoder.hash4SHA1 ", e4);
            throw new IllegalStateException("failed to SHA1");
        }
    }

    public static String toq(String str, String str2, Map<String, String> map, String str3) {
        if (TextUtils.isEmpty(str3)) {
            throw new InvalidParameterException("security is not nullable");
        }
        ArrayList<String> arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str.toUpperCase());
        }
        if (str2 != null) {
            arrayList.add(Uri.parse(str2).getEncodedPath());
        }
        boolean z2 = true;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : new TreeMap(map).entrySet()) {
                arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
            }
        }
        arrayList.add(str3);
        StringBuilder sb = new StringBuilder();
        for (String str4 : arrayList) {
            if (!z2) {
                sb.append(kotlin.text.eqxt.f36674q);
            }
            sb.append(str4);
            z2 = false;
        }
        return m21317k(sb.toString());
    }
}
