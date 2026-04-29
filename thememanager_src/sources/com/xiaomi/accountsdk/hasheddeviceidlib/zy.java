package com.xiaomi.accountsdk.hasheddeviceidlib;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.accountsdk.hasheddeviceidlib.C5530g;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import java.util.UUID;
import p039w.C7724n;

/* JADX INFO: compiled from: HashedDeviceIdUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: g */
    private static final String f30925g = "HashedDeviceIdUtil";

    /* JADX INFO: renamed from: n */
    private static final String f30926n = "hashedDeviceId";

    /* JADX INFO: renamed from: q */
    private static final String f30927q = "deviceId";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72917zy = "android_pseudo_";

    /* JADX INFO: renamed from: k */
    private final Context f30928k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C5530g.toq f72918toq;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.hasheddeviceidlib.zy$k */
    /* JADX INFO: compiled from: HashedDeviceIdUtil.java */
    public enum EnumC5534k {
        RUNTIME_DEVICE_ID_ONLY,
        CACHED_THEN_RUNTIME_THEN_PSEUDO
    }

    /* JADX INFO: compiled from: HashedDeviceIdUtil.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        private EnumC5534k f30931k = f72919zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private InterfaceC5533q f72920toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static EnumC5534k f72919zy = EnumC5534k.RUNTIME_DEVICE_ID_ONLY;

        /* JADX INFO: renamed from: q */
        private static final toq f30930q = new toq();

        private toq() {
        }

        public static toq toq() {
            return f30930q;
        }

        /* JADX INFO: renamed from: n */
        public void m18919n(InterfaceC5533q interfaceC5533q) {
            this.f72920toq = interfaceC5533q;
        }

        /* JADX INFO: renamed from: q */
        public void m18920q(EnumC5534k enumC5534k) {
            this.f30931k = enumC5534k;
        }

        public InterfaceC5533q zy() {
            return this.f72920toq;
        }
    }

    public zy(Context context) {
        this(context, C5530g.m18903k());
    }

    /* JADX INFO: renamed from: s */
    private static boolean m18911s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    String f7l8() {
        return this.f72918toq.mo18905k(this.f30928k);
    }

    /* JADX INFO: renamed from: g */
    SharedPreferences m18912g() {
        Context context = this.f30928k;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("deviceId", 0);
    }

    /* JADX INFO: renamed from: k */
    String m18913k() {
        return String.format("%s%s", f72917zy, UUID.randomUUID().toString());
    }

    public String ld6() {
        SharedPreferences sharedPreferencesM18912g = m18912g();
        if (sharedPreferencesM18912g == null) {
            return null;
        }
        return sharedPreferencesM18912g.getString(f30926n, null);
    }

    /* JADX INFO: renamed from: n */
    String m18914n() {
        try {
            String strF7l8 = f7l8();
            if (m18915p(strF7l8)) {
                return C5531k.m18906k(strF7l8);
            }
            return null;
        } catch (SecurityException e2) {
            AbstractC5574n.m19116z(f30925g, "can't get deviceid.", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    boolean m18915p(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* JADX INFO: renamed from: q */
    public String m18916q() throws C7724n {
        String strZy = zy();
        if (strZy != null) {
            return strZy;
        }
        throw new C7724n("null device id");
    }

    public void qrj(String str) {
        SharedPreferences sharedPreferencesM18912g = m18912g();
        if (sharedPreferencesM18912g != null) {
            sharedPreferencesM18912g.edit().putString(f30926n, str).commit();
        }
    }

    public synchronized String toq(boolean z2) {
        InterfaceC5533q interfaceC5533qZy;
        EnumC5534k enumC5534kX2 = x2();
        if (enumC5534kX2 == EnumC5534k.RUNTIME_DEVICE_ID_ONLY) {
            return m18914n();
        }
        if (enumC5534kX2 != EnumC5534k.CACHED_THEN_RUNTIME_THEN_PSEUDO) {
            throw new IllegalStateException("unknown policy " + enumC5534kX2);
        }
        String strLd6 = ld6();
        if (m18915p(strLd6)) {
            return strLd6;
        }
        String strM18914n = m18914n();
        if (strM18914n != null) {
            qrj(strM18914n);
            return strM18914n;
        }
        if (z2 && !m18911s() && (interfaceC5533qZy = toq.toq().zy()) != null) {
            String strMo18908k = interfaceC5533qZy.mo18908k(this.f30928k);
            if (!TextUtils.isEmpty(strMo18908k)) {
                qrj(strMo18908k);
                return strMo18908k;
            }
        }
        String strM18913k = m18913k();
        qrj(strM18913k);
        return strM18913k;
    }

    EnumC5534k x2() {
        return toq.toq().f30931k;
    }

    /* JADX INFO: renamed from: y */
    public boolean m18917y() {
        return m18915p(ld6());
    }

    @Deprecated
    public synchronized String zy() {
        return toq(true);
    }

    public zy(Context context, C5530g.toq toqVar) {
        if (toqVar == null) {
            throw new IllegalArgumentException("plainDeviceIdFetcher == null");
        }
        this.f30928k = context == null ? null : context.getApplicationContext();
        this.f72918toq = toqVar;
    }
}
