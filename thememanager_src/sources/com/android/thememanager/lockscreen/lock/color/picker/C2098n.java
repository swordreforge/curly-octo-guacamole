package com.android.thememanager.lockscreen.lock.color.picker;

import java.util.Map;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.color.picker.n */
/* JADX INFO: compiled from: ColorBean.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2098n {

    /* JADX INFO: renamed from: k */
    public static final int f12362k = -16777216;

    /* JADX INFO: renamed from: k */
    public static final int m8066k(@InterfaceC7396q Map<String, Integer> map, @InterfaceC7396q String key) {
        d2ok.m23075h(map, "<this>");
        d2ok.m23075h(key, "key");
        return map.getOrDefault(key, -16777216).intValue();
    }
}
