package com.android.thememanager.util;

import android.text.TextUtils;
import com.android.thememanager.basemodule.utils.C1804f;

/* JADX INFO: compiled from: ThemeProvisionPreviewAssistant.java */
/* JADX INFO: loaded from: classes2.dex */
public class ltg8 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f61327cdj = "pink";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f61328f7l8 = 34;

    /* JADX INFO: renamed from: g */
    public static final int f16614g = 33;

    /* JADX INFO: renamed from: h */
    public static final String f16615h = "green";

    /* JADX INFO: renamed from: i */
    private static String f16616i = null;

    /* JADX INFO: renamed from: k */
    public static final int f16617k = 7;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f61329ki = "purple";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f61330kja0 = "yellow";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f61331ld6 = 38;

    /* JADX INFO: renamed from: n */
    public static final int f16618n = 32;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f61332n7h = "red";

    /* JADX INFO: renamed from: p */
    public static final int f16619p = 37;

    /* JADX INFO: renamed from: q */
    public static final int f16620q = 31;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f61333qrj = "black";

    /* JADX INFO: renamed from: s */
    public static final int f16621s = 36;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f61334t8r = "golden";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f61335toq = "sys.panel.color";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f61336x2 = "white";

    /* JADX INFO: renamed from: y */
    public static final int f16622y = 35;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f61337zy = "vendor.panel.color";

    /* JADX INFO: renamed from: k */
    private static String m9857k(int colorId) {
        switch (colorId) {
            case 31:
                return f61336x2;
            case 32:
                return f61333qrj;
            case 33:
                return f61332n7h;
            case 34:
                return f61330kja0;
            case 35:
                return f16615h;
            case 36:
                return f61327cdj;
            case 37:
                return f61329ki;
            case 38:
                return f61334t8r;
            default:
                return "";
        }
    }

    public static String toq() {
        String strM26160k;
        C1804f.toq qVar = C1804f.toq();
        if (qVar != null && qVar.cdj()) {
            return qVar.kja0();
        }
        if (f16616i == null) {
            try {
                strM26160k = miuix.os.f7l8.m26160k(f61335toq, "");
                try {
                    if (TextUtils.isEmpty(strM26160k)) {
                        strM26160k = miuix.os.f7l8.m26160k(f61337zy, "");
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
            strM26160k = !TextUtils.isEmpty(strM26160k) ? m9857k(Integer.parseInt(strM26160k.substring(4, 6))) : "";
            f16616i = strM26160k != null ? strM26160k.toLowerCase() : "";
        }
        return f16616i;
    }
}
