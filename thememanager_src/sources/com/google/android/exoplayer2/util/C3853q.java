package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.common.collect.se;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import miuix.internal.util.ParcelableSparseArray;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.q */
/* JADX INFO: compiled from: BundleableUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3853q {
    private C3853q() {
    }

    public static <T extends InterfaceC3555s> ArrayList<Bundle> f7l8(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static <T extends InterfaceC3555s> T m13716g(InterfaceC3555s.k<T> kVar, @zy.dd Bundle bundle, T t2) {
        return bundle == null ? t2 : (T) kVar.mo11492k(bundle);
    }

    /* JADX INFO: renamed from: k */
    public static void m13717k(@zy.dd Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) lrht.ld6(C3853q.class.getClassLoader()));
        }
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    public static <T extends InterfaceC3555s> T m13718n(InterfaceC3555s.k<T> kVar, @zy.dd Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (T) kVar.mo11492k(bundle);
    }

    @zy.dd
    /* JADX INFO: renamed from: p */
    public static Bundle m13719p(@zy.dd InterfaceC3555s interfaceC3555s) {
        if (interfaceC3555s == null) {
            return null;
        }
        return interfaceC3555s.toBundle();
    }

    /* JADX INFO: renamed from: q */
    public static <T extends InterfaceC3555s> SparseArray<T> m13720q(InterfaceC3555s.k<T> kVar, @zy.dd SparseArray<Bundle> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            parcelableSparseArray.put(sparseArray.keyAt(i2), kVar.mo11492k(sparseArray.valueAt(i2)));
        }
        return parcelableSparseArray;
    }

    /* JADX INFO: renamed from: s */
    public static <T extends InterfaceC3555s> SparseArray<Bundle> m13721s(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray2.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2).toBundle());
        }
        return sparseArray2;
    }

    public static <T extends InterfaceC3555s> se<T> toq(InterfaceC3555s.k<T> kVar, List<Bundle> list) {
        se.C4520k c4520kBuilder = se.builder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c4520kBuilder.mo15569k(kVar.mo11492k((Bundle) C3844k.f7l8(list.get(i2))));
        }
        return c4520kBuilder.mo15570n();
    }

    /* JADX INFO: renamed from: y */
    public static <T extends InterfaceC3555s> se<Bundle> m13722y(List<T> list) {
        se.C4520k c4520kBuilder = se.builder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c4520kBuilder.mo15569k(list.get(i2).toBundle());
        }
        return c4520kBuilder.mo15570n();
    }

    public static <T extends InterfaceC3555s> List<T> zy(InterfaceC3555s.k<T> kVar, @zy.dd List<Bundle> list, List<T> list2) {
        return list == null ? list2 : toq(kVar, list);
    }
}
