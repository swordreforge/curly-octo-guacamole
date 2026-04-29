package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.f7l8;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: ApplicationVersionSignature.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    private static final String f19068k = "AppVersionSignature";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final ConcurrentMap<String, f7l8> f63068toq = new ConcurrentHashMap();

    private toq() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    private static PackageInfo m11216k(@lvui Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(f19068k, "Cannot resolve info for" + context.getPackageName(), e2);
            return null;
        }
    }

    @yz
    /* JADX INFO: renamed from: n */
    static void m11217n() {
        f63068toq.clear();
    }

    @lvui
    /* JADX INFO: renamed from: q */
    private static f7l8 m11218q(@lvui Context context) {
        return new C3197n(toq(m11216k(context)));
    }

    @lvui
    private static String toq(@dd PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @lvui
    public static f7l8 zy(@lvui Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, f7l8> concurrentMap = f63068toq;
        f7l8 f7l8Var = concurrentMap.get(packageName);
        if (f7l8Var != null) {
            return f7l8Var;
        }
        f7l8 f7l8VarM11218q = m11218q(context);
        f7l8 f7l8VarPutIfAbsent = concurrentMap.putIfAbsent(packageName, f7l8VarM11218q);
        return f7l8VarPutIfAbsent == null ? f7l8VarM11218q : f7l8VarPutIfAbsent;
    }
}
