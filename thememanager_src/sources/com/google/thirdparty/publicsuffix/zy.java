package com.google.thirdparty.publicsuffix;

import com.google.common.base.ni7;
import com.google.common.collect.wlev;
import com.google.common.collect.zkd;
import java.util.List;

/* JADX INFO: compiled from: TrieParser.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
final class zy {

    /* JADX INFO: renamed from: k */
    private static final ni7 f27871k = ni7.m15433h("");

    zy() {
    }

    /* JADX INFO: renamed from: k */
    private static int m17243k(List<CharSequence> list, CharSequence charSequence, int i2, zkd.toq<String, toq> toqVar) {
        int length = charSequence.length();
        int i3 = i2;
        char cCharAt = 0;
        while (i3 < length && (cCharAt = charSequence.charAt(i3)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i3++;
        }
        list.add(0, zy(charSequence.subSequence(i2, i3)));
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strLd6 = f27871k.ld6(list);
            if (strLd6.length() > 0) {
                toqVar.mo15592q(strLd6, toq.fromCode(cCharAt));
            }
        }
        int iM17243k = i3 + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iM17243k < length) {
                iM17243k += m17243k(list, charSequence, iM17243k, toqVar);
                if (charSequence.charAt(iM17243k) == '?' || charSequence.charAt(iM17243k) == ',') {
                    iM17243k++;
                    break;
                }
            }
        }
        list.remove(0);
        return iM17243k - i2;
    }

    static zkd<String, toq> toq(CharSequence charSequence) {
        zkd.toq toqVarBuilder = zkd.builder();
        int length = charSequence.length();
        int iM17243k = 0;
        while (iM17243k < length) {
            iM17243k += m17243k(wlev.m16065z(), charSequence, iM17243k, toqVarBuilder);
        }
        return toqVarBuilder.mo15589k();
    }

    private static CharSequence zy(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}
