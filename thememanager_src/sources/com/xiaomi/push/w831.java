package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class w831 {
    public static void f7l8(String str, Context context, byte[] bArr) {
        if (context == null || bArr == null || bArr.length <= 0) {
            return;
        }
        m28 m28Var = new m28();
        try {
            qla.m21399n(m28Var, bArr);
            m21958n(str, context, m28Var, bArr.length);
        } catch (sb unused) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("fail to convert bytes to container");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m21956g(String str, Context context, oaex oaexVar, wwp wwpVar, int i2) {
        m21959q(str, context, zy(oaexVar, wwpVar), i2);
    }

    /* JADX INFO: renamed from: k */
    public static int m21957k(Context context, int i2) {
        int iM22066k = z4j7.m22066k(context);
        if (-1 == iM22066k) {
            return -1;
        }
        return (i2 * (iM22066k == 0 ? 13 : 11)) / 10;
    }

    /* JADX INFO: renamed from: n */
    public static void m21958n(String str, Context context, m28 m28Var, int i2) {
        wwp wwpVarM21242a;
        if (context == null || m28Var == null || (wwpVarM21242a = m28Var.m21242a()) == null) {
            return;
        }
        int qVar = toq(wwpVarM21242a);
        if (i2 <= 0) {
            byte[] bArrM21397g = qla.m21397g(m28Var);
            i2 = bArrM21397g != null ? bArrM21397g.length : 0;
        }
        m21959q(str, context, qVar, i2);
    }

    /* JADX INFO: renamed from: q */
    public static void m21959q(String str, Context context, int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        int iM21957k = m21957k(context, i3);
        if (i2 != ga.toq(kq.UploadTinyData)) {
            e5.m20763k(context.getApplicationContext()).zy(str, i2, 1L, iM21957k);
        }
    }

    public static int toq(wwp wwpVar) {
        return ga.m20886k(wwpVar.m21982a());
    }

    public static int zy(oaex oaexVar, wwp wwpVar) {
        int iM20886k;
        switch (z4.f34221k[wwpVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return ga.m20886k(wwpVar.m21982a());
            case 11:
                iM20886k = ga.m20886k(wwpVar.m21982a());
                if (oaexVar != null) {
                    try {
                        if (oaexVar instanceof z8) {
                            String str = ((z8) oaexVar).f34268d;
                            if (!TextUtils.isEmpty(str) && ga.toq(ga.m20890s(str)) != -1) {
                                iM20886k = ga.toq(ga.m20890s(str));
                            }
                        } else if (oaexVar instanceof erbd) {
                            String str2 = ((erbd) oaexVar).f32871d;
                            if (!TextUtils.isEmpty(str2)) {
                                if (ga.toq(ga.m20890s(str2)) != -1) {
                                    iM20886k = ga.toq(ga.m20890s(str2));
                                }
                                if (kq.UploadTinyData.equals(ga.m20890s(str2))) {
                                    return -1;
                                }
                            }
                        }
                    } catch (Exception unused) {
                        com.xiaomi.channel.commonutils.logger.zy.jk("PERF_ERROR : parse Notification type error");
                        return iM20886k;
                    }
                }
                break;
            case 12:
                iM20886k = ga.m20886k(wwpVar.m21982a());
                if (oaexVar != null) {
                    try {
                        if (oaexVar instanceof kjd) {
                            String strM21092b = ((kjd) oaexVar).m21092b();
                            if (!TextUtils.isEmpty(strM21092b) && b9ub.m20641a(strM21092b) != -1) {
                                iM20886k = b9ub.m20641a(strM21092b);
                            }
                        } else if (oaexVar instanceof zma) {
                            String strM22109a = ((zma) oaexVar).m22109a();
                            if (!TextUtils.isEmpty(strM22109a) && b9ub.m20641a(strM22109a) != -1) {
                                return b9ub.m20641a(strM22109a);
                            }
                        }
                    } catch (Exception unused2) {
                        com.xiaomi.channel.commonutils.logger.zy.jk("PERF_ERROR : parse Command type error");
                    }
                }
                break;
            default:
                return -1;
        }
        return iM20886k;
    }
}
