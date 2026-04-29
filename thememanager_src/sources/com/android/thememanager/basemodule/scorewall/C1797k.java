package com.android.thememanager.basemodule.scorewall;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.utils.x9kr;
import java.util.concurrent.atomic.AtomicBoolean;
import p040x.C7747k;
import zy.dd;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.scorewall.k */
/* JADX INFO: compiled from: ScoreWallManager.java */
/* JADX INFO: loaded from: classes.dex */
public class C1797k {

    /* JADX INFO: renamed from: n */
    private static final String f10250n = "mimarket";

    /* JADX INFO: renamed from: k */
    private C7747k f10252k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private AtomicBoolean f57704toq = new AtomicBoolean(false);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f57705zy = false;

    /* JADX INFO: renamed from: q */
    public static final String f10251q = "mimarket://browse?url=https://zhuti.xiaomi.com/themeActivity/views/scorewall-v2/&back=true&title=" + bf2.toq.toq().getString(R.string.app_name);

    /* JADX INFO: renamed from: g */
    private static final String f10249g = C1797k.class.getName();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static C1797k f57703f7l8 = new C1797k();

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.scorewall.k$k */
    /* JADX INFO: compiled from: ScoreWallManager.java */
    class k extends AbstractC1777n<C7747k> {
        k() {
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(C7747k response) {
            if (response != null) {
                C1797k.this.f10252k = response;
            }
        }
    }

    private C1797k() {
    }

    public static void f7l8(Context context, Fragment fragment) {
        Intent intentZy = x9kr.zy(f10251q);
        intentZy.setFlags(intentZy.getFlags() & (-268435457));
        if (!(context instanceof ActivityC0891q) || fragment == null) {
            context.startActivity(intentZy);
        } else {
            ((ActivityC0891q) context).startActivityFromFragment(fragment, intentZy, 4001);
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m6981q(@dd String url) {
        return !TextUtils.isEmpty(url) && url.startsWith(f10250n) && url.contains("scorewall");
    }

    public static C1797k toq() {
        return f57703f7l8;
    }

    public static ArrayMap<String, Object> zy(String enterSource) {
        ArrayMap<String, Object> arrayMap = new ArrayMap<>(2);
        arrayMap.put("entryType", enterSource);
        return arrayMap;
    }

    /* JADX INFO: renamed from: g */
    public void m6982g() {
        this.f57705zy = true;
        ((toq) f7l8.m6882h().qrj(toq.class)).m6985k().mo27954p(new k());
    }

    /* JADX INFO: renamed from: n */
    public boolean m6983n() {
        C7747k c7747k;
        return this.f57705zy && ((c7747k = this.f10252k) == null || c7747k.f45610k);
    }
}
