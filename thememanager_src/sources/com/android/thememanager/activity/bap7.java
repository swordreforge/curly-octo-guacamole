package com.android.thememanager.activity;

import androidx.fragment.app.Fragment;
import com.android.thememanager.author.fragment.C1662g;
import com.android.thememanager.h5.C2069n;

/* JADX INFO: compiled from: ThemeFragmentPolicy.java */
/* JADX INFO: loaded from: classes.dex */
public class bap7 {

    /* JADX INFO: renamed from: k */
    public static final int f8933k = 0;

    /* JADX INFO: renamed from: q */
    public static final int f8934q = 11;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f57288toq = 4;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f57289zy = 10;

    /* JADX INFO: renamed from: k */
    public static Class<? extends Fragment> m6389k(int type) {
        if (type == 0) {
            return vep5.class;
        }
        if (type == 4) {
            return C2069n.class;
        }
        if (type == 10) {
            return com.android.thememanager.settings.fti.class;
        }
        if (type == 11) {
            return C1662g.class;
        }
        throw new IllegalArgumentException("Illegal Dynamic Fragment type " + type);
    }
}
