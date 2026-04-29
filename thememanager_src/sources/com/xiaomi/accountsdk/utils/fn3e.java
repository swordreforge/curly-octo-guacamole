package com.xiaomi.accountsdk.utils;

/* JADX INFO: compiled from: MiuiOsBuildReflection.java */
/* JADX INFO: loaded from: classes3.dex */
public class fn3e {
    /* JADX INFO: renamed from: g */
    private static boolean m19071g(String str, boolean z2) {
        try {
            return ((Boolean) Class.forName("miui.os.Build").getField(str).get(null)).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return z2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m19072k(boolean z2) {
        return m19071g("IS_ALPHA_BUILD", z2);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m19073n() {
        return m19071g("IS_TABLET", false);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m19074q(boolean z2) {
        return m19071g("IS_STABLE_VERSION", z2);
    }

    private static boolean toq(boolean z2) {
        return m19071g("IS_DEVELOPMENT_VERSION", z2);
    }

    public static boolean zy(boolean z2) {
        return toq(z2) && !m19072k(z2);
    }
}
