package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.common.util.concurrent.n */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4822n {
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m16980k(Unsafe unsafe, Object obj, long j2, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j2, obj2, obj3)) {
            if (unsafe.getObject(obj, j2) != obj2) {
                return false;
            }
        }
        return true;
    }
}
