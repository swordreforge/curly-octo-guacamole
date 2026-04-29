package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.Configuration;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.f */
/* JADX INFO: loaded from: classes3.dex */
public class C5692f {

    /* JADX INFO: renamed from: a */
    private static final int f31754a = 1;

    /* JADX INFO: renamed from: b */
    private static final int f31755b = 2;

    /* JADX INFO: renamed from: c */
    private static final int f31756c = 4;

    /* JADX INFO: renamed from: d */
    private static final int f31757d = 8;

    /* JADX INFO: renamed from: e */
    private static final int f31758e = 16;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX INFO: renamed from: a */
    public static int m19779a(Configuration configuration) {
        if (configuration == null) {
            return 0;
        }
        boolean zIsGAIDEnable = configuration.isGAIDEnable();
        ?? r0 = zIsGAIDEnable;
        if (configuration.isIMSIEnable()) {
            r0 = (zIsGAIDEnable ? 1 : 0) | 2;
        }
        ?? r02 = r0;
        if (configuration.isIMEIEnable()) {
            r02 = (r0 == true ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (configuration.isExceptionCatcherEnable()) {
            r03 = (r02 == true ? 1 : 0) | 8;
        }
        return configuration.isOverrideMiuiRegionSetting() ? r03 | 16 : r03;
    }
}
