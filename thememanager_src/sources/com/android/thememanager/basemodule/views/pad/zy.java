package com.android.thememanager.basemodule.views.pad;

import java.util.List;

/* JADX INFO: compiled from: IList.java */
/* JADX INFO: loaded from: classes.dex */
public interface zy<T> {
    boolean a9();

    void eqxt();

    default int fti() {
        return -1;
    }

    T getItem(int position);

    int getItemCount();

    /* JADX INFO: renamed from: k */
    String mo7367k();

    default void ki(String id) {
    }

    default void t8r(int position) {
    }

    List<T> toq();

    /* JADX INFO: renamed from: z */
    toq mo7368z();
}
