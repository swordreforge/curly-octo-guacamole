package com.tencent.mm.opensdk.utils;

import com.google.common.base.zy;
import java.security.MessageDigest;
import miuix.security.C7323k;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.utils.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5375b {
    /* JADX INFO: renamed from: e */
    public static final String m18259e(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i2 = 0;
            for (byte b2 : bArrDigest) {
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b2 >>> 4) & 15];
                i2 = i3 + 1;
                cArr2[i3] = cArr[b2 & zy.f68111cdj];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }
}
