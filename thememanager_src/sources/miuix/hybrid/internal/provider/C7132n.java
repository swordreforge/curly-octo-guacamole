package miuix.hybrid.internal.provider;

/* JADX INFO: renamed from: miuix.hybrid.internal.provider.n */
/* JADX INFO: compiled from: WebViewFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7132n {

    /* JADX INFO: renamed from: k */
    private static C7130g f40287k = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Object f87723toq = new Object();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f87724zy = "com.miui.sdk.hybrid.webview";

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[Catch: all -> 0x006f, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000a, B:11:0x001c, B:17:0x002a, B:20:0x003c, B:21:0x003f, B:23:0x0043, B:24:0x004a, B:26:0x0053, B:27:0x006b, B:28:0x006d, B:14:0x0024), top: B:37:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[Catch: all -> 0x006f, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000a, B:11:0x001c, B:17:0x002a, B:20:0x003c, B:21:0x003f, B:23:0x0043, B:24:0x004a, B:26:0x0053, B:27:0x006b, B:28:0x006d, B:14:0x0024), top: B:37:0x0003, inners: #0, #1 }] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static miuix.hybrid.internal.provider.C7130g m25841k(android.content.Context r5) {
        /*
            java.lang.Object r0 = miuix.hybrid.internal.provider.C7132n.f87723toq
            monitor-enter(r0)
            miuix.hybrid.internal.provider.g r1 = miuix.hybrid.internal.provider.C7132n.f40287k     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            return r1
        L9:
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23 java.lang.Throwable -> L6f
            java.lang.String r3 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23 java.lang.Throwable -> L6f
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23 java.lang.Throwable -> L6f
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23 java.lang.Throwable -> L6f
            if (r2 == 0) goto L27
            java.lang.String r3 = "com.miui.sdk.hybrid.webview"
            java.lang.String r1 = r2.getString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23 java.lang.Throwable -> L6f
            goto L27
        L23:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L6f
        L27:
            if (r1 == 0) goto L3f
            r2 = 0
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L6f
            java.lang.Class r5 = java.lang.Class.forName(r1, r2, r5)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L6f
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L6f
            miuix.hybrid.internal.provider.g r5 = (miuix.hybrid.internal.provider.C7130g) r5     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L6f
            miuix.hybrid.internal.provider.C7132n.f40287k = r5     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L6f
            goto L3f
        L3b:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L6f
        L3f:
            miuix.hybrid.internal.provider.g r5 = miuix.hybrid.internal.provider.C7132n.f40287k     // Catch: java.lang.Throwable -> L6f
            if (r5 != 0) goto L4a
            miuix.hybrid.internal.webkit.h r5 = new miuix.hybrid.internal.webkit.h     // Catch: java.lang.Throwable -> L6f
            r5.<init>()     // Catch: java.lang.Throwable -> L6f
            miuix.hybrid.internal.provider.C7132n.f40287k = r5     // Catch: java.lang.Throwable -> L6f
        L4a:
            java.lang.String r5 = "hybrid"
            r1 = 3
            boolean r5 = android.util.Log.isLoggable(r5, r1)     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L6b
            java.lang.String r5 = "hybrid"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "loaded provider:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f
            miuix.hybrid.internal.provider.g r2 = miuix.hybrid.internal.provider.C7132n.f40287k     // Catch: java.lang.Throwable -> L6f
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.d(r5, r1)     // Catch: java.lang.Throwable -> L6f
        L6b:
            miuix.hybrid.internal.provider.g r5 = miuix.hybrid.internal.provider.C7132n.f40287k     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            return r5
        L6f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.hybrid.internal.provider.C7132n.m25841k(android.content.Context):miuix.hybrid.internal.provider.g");
    }
}
