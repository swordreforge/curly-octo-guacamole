package com.android.thememanager.basemodule.utils;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import zy.InterfaceC7829h;

/* JADX INFO: compiled from: GoofyUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class kja0 {
    public static ColorStateList f7l8(@zy.n7h int id) throws Resources.NotFoundException {
        return m7111p().getColorStateList(id);
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m7108g(List<T> list, int index) {
        if (list == null || index < 0 || index >= list.size()) {
            return null;
        }
        return list.get(index);
    }

    /* JADX INFO: renamed from: k */
    public static <T> void m7109k(List<T> list, T e2) {
        toq(list, e2, true);
    }

    public static String ld6(@zy.nn86 int stringId) {
        return bf2.toq.toq().getString(stringId);
    }

    /* JADX INFO: renamed from: n */
    public static String m7110n(String[] aa) {
        if (aa == null || aa.length == 0) {
            return "array empty";
        }
        final StringBuilder sb = new StringBuilder("array.size= " + aa.length + ": ");
        Arrays.stream(aa).forEach(new Consumer() { // from class: com.android.thememanager.basemodule.utils.n7h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                sb.append((String) obj);
            }
        });
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static Resources m7111p() {
        return bf2.toq.toq().getResources();
    }

    /* JADX INFO: renamed from: q */
    public static <T> void m7112q(List<T> listA, List<T> listB, boolean isAddAll) {
        if (!isAddAll || listA == null || listB == null) {
            return;
        }
        listA.addAll(listB);
    }

    public static <T> boolean qrj(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX INFO: renamed from: s */
    public static String m7113s(@zy.ncyb int pluralsId, int quantity, Object... formatArgs) {
        return m7111p().getQuantityString(pluralsId, quantity, formatArgs);
    }

    public static <T> void toq(List<T> list, T e2, boolean isAdd) {
        if (!isAdd || list == null || e2 == null) {
            return;
        }
        list.add(e2);
    }

    public static String x2(@zy.nn86 int stringId, Object... formatArgs) {
        return bf2.toq.toq().getString(stringId, formatArgs);
    }

    /* JADX INFO: renamed from: y */
    public static int m7114y(@InterfaceC7829h int id) throws Resources.NotFoundException {
        return m7111p().getDimensionPixelSize(id);
    }

    public static <T> void zy(List<T> listA, List<T> listB) {
        m7112q(listA, listB, true);
    }
}
