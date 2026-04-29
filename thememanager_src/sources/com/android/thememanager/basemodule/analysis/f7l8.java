package com.android.thememanager.basemodule.analysis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import zy.lvui;

/* JADX INFO: compiled from: PageTrackHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f57455cdj = "REQUEST_PAGE_REF";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static String f57456f7l8 = null;

    /* JADX INFO: renamed from: g */
    private static String f9678g = null;

    /* JADX INFO: renamed from: h */
    private static final String f9679h = "REQUEST_ENTRY_TYPE_NEXT";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f57457ki = "REQUEST_PAGE_PREV_REF";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f57458kja0 = "REQUEST_ENTRY_TYPE";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f57459ld6 = "SAVED_PARAM_ENTRY_NEXT_TYPE";

    /* JADX INFO: renamed from: n */
    private static String f9680n = null;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f57460n7h = "";

    /* JADX INFO: renamed from: p */
    private static final String f9681p = "SAVED_PARAM_ENTRY_TYPE";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f57461qrj = "SAVED_PARAM_PAGE_PREV_REF";

    /* JADX INFO: renamed from: s */
    private static final String f9682s = "FLAG_FROM_RESOURCE_BROWSER";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f57462x2 = "SAVED_PARAM_PAGE_REF";

    /* JADX INFO: renamed from: y */
    private static String f9683y;

    /* JADX INFO: renamed from: k */
    private String f9684k;

    /* JADX INFO: renamed from: q */
    private String f9685q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f57463toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f57464zy;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.f7l8$k */
    /* JADX INFO: compiled from: PageTrackHelper.java */
    public interface InterfaceC1696k {
        /* JADX INFO: renamed from: f */
        String mo6320f();
    }

    public static String f7l8() {
        return f9678g;
    }

    public static void fn3e(String foregroundRef) {
        f9683y = foregroundRef;
    }

    /* JADX INFO: renamed from: g */
    public static String m6607g() {
        return f9680n;
    }

    /* JADX INFO: renamed from: h */
    public static String m6608h(Intent intent) {
        return intent.getStringExtra(f57455cdj);
    }

    /* JADX INFO: renamed from: i */
    public static void m6609i(String foregroundPrevRef) {
        f57456f7l8 = foregroundPrevRef;
    }

    /* JADX INFO: renamed from: k */
    public static void m6610k(@lvui Intent intent, String entryTypeNext) {
        intent.putExtra(f9679h, entryTypeNext);
    }

    public static void ki(String foregroundEntryType) {
        f9680n = foregroundEntryType;
    }

    public static String kja0(Intent intent) {
        return intent.getStringExtra(f57457ki);
    }

    public static String n7h(Intent intent) {
        return intent.getStringExtra(f9679h);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m6611p(Intent intent) {
        return intent != null && intent.getBooleanExtra(f9682s, false);
    }

    /* JADX INFO: renamed from: q */
    public static void m6612q(@lvui Intent intent, String ref) {
        intent.putExtra(f57455cdj, ref);
    }

    public static String qrj(Intent intent) {
        return intent.getStringExtra(f57458kja0);
    }

    /* JADX INFO: renamed from: s */
    public static String m6613s() {
        return f9683y;
    }

    public static void t8r(String foregroundEntryTypeNext) {
        f9678g = foregroundEntryTypeNext;
    }

    public static void toq(@lvui Intent intent, String entryType) {
        intent.putExtra(f57458kja0, entryType);
    }

    /* JADX INFO: renamed from: y */
    public static String m6614y() {
        return f57456f7l8;
    }

    public static void zy(@lvui Intent intent, String prevRef) {
        intent.putExtra(f57457ki, prevRef);
    }

    public void cdj() {
        ki(this.f9684k);
        t8r(this.f57463toq);
        m6609i(this.f9685q);
        fn3e(this.f57464zy);
    }

    public void ld6(Intent intent, Bundle savedInstanceState, InterfaceC1696k custom) {
        String strMo6320f;
        if (savedInstanceState != null && savedInstanceState.containsKey(f9681p)) {
            this.f9684k = savedInstanceState.getString(f9681p);
            this.f57463toq = savedInstanceState.getString(f57459ld6);
            this.f57464zy = savedInstanceState.getString(f57462x2);
            this.f9685q = savedInstanceState.getString(f57461qrj);
            return;
        }
        if (m6611p(intent)) {
            this.f9684k = m6607g();
            this.f57463toq = f7l8();
        } else {
            String strQrj = qrj(intent);
            this.f9684k = strQrj;
            if (TextUtils.isEmpty(strQrj) && custom != null && (strMo6320f = custom.mo6320f()) != null) {
                this.f9684k = strMo6320f;
            }
            if (TextUtils.isEmpty(this.f9684k)) {
                this.f9684k = toq.lbeq;
            }
            ki(this.f9684k);
            String strN7h = n7h(intent);
            this.f57463toq = strN7h;
            if (strN7h == null) {
                this.f57463toq = "";
            }
            t8r(this.f57463toq);
        }
        this.f57464zy = m6608h(intent);
        String strKja0 = kja0(intent);
        this.f9685q = strKja0;
        if (this.f57463toq == null) {
            this.f57463toq = "";
        }
        if (this.f57464zy == null) {
            this.f57464zy = "";
        }
        if (strKja0 == null) {
            this.f9685q = "";
        }
    }

    /* JADX INFO: renamed from: n */
    public void m6615n(Intent intent, Activity activity, Fragment fragment) {
        if (intent == null) {
            return;
        }
        intent.putExtra(f9682s, true);
        if (m6608h(intent) == null && kja0(intent) == null) {
            zy(intent, this.f57464zy);
            String strMo6345a = activity instanceof AbstractActivityC1717k ? ((AbstractActivityC1717k) activity).mo6345a() : "";
            String strM2t = fragment instanceof com.android.thememanager.basemodule.base.toq ? ((com.android.thememanager.basemodule.base.toq) fragment).m2t() : "";
            if (fragment != null) {
                strMo6345a = strM2t;
            }
            m6612q(intent, strMo6345a);
        }
    }

    public void x2(Bundle outState) {
        outState.putString(f9681p, this.f9684k);
        outState.putString(f57459ld6, this.f57463toq);
        outState.putString(f57462x2, this.f57464zy);
        outState.putString(f57461qrj, this.f9685q);
    }
}
