package com.mibi.sdk.app;

import a5id.C0002k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidParameterException;
import vy.C7718q;
import vy.toq;
import vy.zy;

/* JADX INFO: renamed from: com.mibi.sdk.app.k */
/* JADX INFO: compiled from: MibiAppImp.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5031k implements toq {

    /* JADX INFO: renamed from: g */
    private static final String f28570g = "MIPAYDEDUCT";

    /* JADX INFO: renamed from: k */
    private static final String f28571k = "MibiAppImp";

    /* JADX INFO: renamed from: n */
    private static final String f28572n = "WXPAYDEDUCT";

    /* JADX INFO: renamed from: q */
    private static final String f28573q = "ALIPAYDEDUCT";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f70896toq = "com.xiaomi.payment";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f70897zy = "1.4.1-alpha";

    private void ld6(Activity activity) {
        if (activity != null) {
            return;
        }
        Log.e(f28571k, "activity cannot be null");
        throw new InvalidParameterException("activity cannot be null");
    }

    private void n7h(Activity activity, int i2, String str, zy zyVar, Bundle bundle) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.xiaomi.payment");
        intent.setData(Uri.parse("https://app.mibi.xiaomi.com?id=mibi.pay"));
        Bundle bundle2 = new Bundle();
        if (bundle == null) {
            bundle = bundle2;
        }
        bundle.putString("order", str);
        intent.putExtra(C7718q.f97056jp0y, bundle);
        if (intent.resolveActivity(activity.getPackageManager()) == null) {
            Log.e(f28571k, "can't resolve by scheme: https");
            intent.setData(Uri.parse("mibi://mibiapp?id=mibi.pay"));
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                Log.e(f28571k, "can't resolve by scheme: mibi");
                return;
            }
        }
        activity.startActivityForResult(intent, i2);
    }

    private void qrj(Activity activity, int i2, String str, zy zyVar, Bundle bundle) {
        C0002k.toq(zyVar);
        Intent intent = new Intent(activity, (Class<?>) MibiTransitionActivity.class);
        intent.putExtra("order", str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivityForResult(intent, i2);
    }

    private void x2(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(f28571k, "the value of order cannot be empty!");
            throw new InvalidParameterException("the value of order cannot be empty!");
        }
    }

    @Override // vy.toq
    public boolean f7l8(Context context, String str) {
        Log.d(f28571k, "support channel pay called");
        if (C7718q.m28119g(context)) {
            return false;
        }
        return C7718q.m28122q(context) ? C7718q.toq(context) >= 1048117 : C7718q.toq(context) > 1048105;
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: g */
    public void mo17518g(Activity activity, int i2, long j2, zy zyVar, Bundle bundle) {
        Log.d(f28571k, "go to recharge");
        ld6(activity);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.xiaomi.payment");
        intent.setData(Uri.parse("https://app.mibi.xiaomi.com?id=mibi.recharge"));
        Bundle bundle2 = new Bundle();
        if (bundle == null) {
            bundle = bundle2;
        }
        bundle.putLong(C7718q.f97051fti, j2);
        intent.putExtra(C7718q.f97056jp0y, bundle);
        if (intent.resolveActivity(activity.getPackageManager()) == null) {
            Log.e(f28571k, "can't resolve by scheme: https");
            intent.setData(Uri.parse("mibi://mibiapp?id=mibi.recharge"));
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                Log.e(f28571k, "can't resolve by scheme: mibi");
                return;
            }
        }
        activity.startActivityForResult(intent, i2);
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: k */
    public void mo17519k(Activity activity, int i2, String str, zy zyVar, Bundle bundle) {
        Log.d(f28571k, "go sign deduct");
        ld6(activity);
        x2(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.xiaomi.payment");
        intent.setAction(C7718q.f97067oc);
        if (intent.resolveActivity(activity.getPackageManager()) == null) {
            Log.e(f28571k, "sign deduct not support in this version");
            return;
        }
        String string = bundle != null ? bundle.getString(C7718q.f97047dd) : null;
        intent.putExtra(C7718q.f97045d2ok, str);
        intent.putExtra(C7718q.f97047dd, string);
        intent.putExtra(C7718q.f97056jp0y, bundle);
        activity.startActivityForResult(intent, i2);
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: n */
    public void mo17520n(Activity activity, int i2, String str, zy zyVar, Bundle bundle) {
        Log.d(f28571k, "pay for order");
        ld6(activity);
        if (C7718q.toq(activity) >= 1033001) {
            n7h(activity, i2, str, zyVar, bundle);
        } else {
            qrj(activity, i2, str, zyVar, bundle);
        }
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: p */
    public void mo17521p(Activity activity, C7718q.k kVar, String str, long j2, int i2) {
        Log.d(f28571k, "request channels");
        Intent intent = new Intent();
        intent.setPackage("com.xiaomi.payment");
        intent.setAction(C7718q.f97048eqxt);
        intent.putExtra(C7718q.f97064ncyb, kVar.name());
        intent.putExtra(C7718q.f97062n5r1, str);
        intent.putExtra("orderFee", j2);
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivityForResult(intent, i2);
        } else {
            Log.d(f28571k, "current mibi not support get channels");
        }
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: q */
    public void mo17522q(Activity activity, int i2, zy zyVar) {
        Log.d(f28571k, "go to mili center");
        ld6(activity);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.xiaomi.payment");
        intent.setData(Uri.parse("https://app.mibi.xiaomi.com?id=mibi.milicenter"));
        if (intent.resolveActivity(activity.getPackageManager()) == null) {
            Log.e(f28571k, "can't resolve by scheme: https");
            intent.setData(Uri.parse("mibi://mibiapp?id=mibi.milicenter"));
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                Log.e(f28571k, "can't resolve by scheme: mibi");
                return;
            }
        }
        activity.startActivityForResult(intent, i2);
    }

    @Override // vy.toq
    public void release() {
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: s */
    public void mo17523s(Activity activity, int i2, String str, zy zyVar, Bundle bundle) {
        Log.d(f28571k, "go to deduct");
        ld6(activity);
        x2(str);
        Intent intent = new Intent(C7718q.f97046d3);
        intent.setPackage("com.xiaomi.payment");
        intent.putExtra(C7718q.f97045d2ok, str);
        intent.putExtra(C7718q.f97073x9kr, bundle != null ? bundle.getString(C7718q.f97073x9kr) : null);
        intent.putExtra(C7718q.f97056jp0y, bundle);
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivityForResult(intent, i2);
        } else {
            Log.d(f28571k, "current mibi not support deduct");
        }
    }

    @Override // vy.toq
    public boolean toq(Context context, String str) {
        Log.d(f28571k, "support channel deduct called");
        if (TextUtils.isEmpty(str) || f28572n.equals(str) || f28573q.equals(str) || f28570g.equals(str)) {
            return f7l8(context, str);
        }
        return false;
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: y */
    public boolean mo17524y(Context context, String str) {
        Log.d(f28571k, "support sign deduct called");
        if (f70897zy.equals(C7718q.zy(context))) {
            return f28572n.equals(str);
        }
        if (!TextUtils.isEmpty(str) && !f28572n.equals(str) && !f28573q.equals(str)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.xiaomi.payment");
        intent.setAction(C7718q.f97067oc);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return true;
        }
        Log.e(f28571k, "sign deduct not support in this version");
        return false;
    }

    @Override // vy.toq
    public void zy(Activity activity, int i2, zy zyVar) {
        mo17518g(activity, i2, 0L, zyVar, null);
    }
}
