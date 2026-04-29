package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: com.google.common.util.concurrent.x */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4849x {
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m17025k(AtomicReferenceArray atomicReferenceArray, int i2, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }
}
