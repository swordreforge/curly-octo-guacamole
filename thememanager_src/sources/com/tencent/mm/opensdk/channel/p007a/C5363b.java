package com.tencent.mm.opensdk.channel.p007a;

import com.tencent.mm.opensdk.utils.C5375b;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5363b {
    /* JADX INFO: renamed from: a */
    public static byte[] m18239a(String str, int i2, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i2);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return C5375b.m18259e(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }
}
