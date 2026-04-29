package com.android.thememanager.util;

import java.util.List;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: DeveloperHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a9 {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final int[] m9605k(@InterfaceC7396q String str) throws ClassCastException {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        List listCb = kotlin.text.fti.cb(kotlin.text.a9.uf(kotlin.text.a9.uf(str, "[", "", false, 4, null), "]", "", false, 4, null), new String[]{", "}, false, 0, 6, null);
        int size = listCb.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = Integer.parseInt((String) listCb.get(i2));
        }
        return iArr;
    }
}
