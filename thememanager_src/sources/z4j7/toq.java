package z4j7;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.util.Log;
import kt06.toq;
import kt06.zy;
import miuix.core.util.t8r;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ResponsiveStateHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {
    private static toq.C6755k f7l8(t8r t8rVar, float f2) {
        toq.C6755k c6755k = new toq.C6755k();
        Point point = t8rVar.f87381zy;
        c6755k.f82119zy = point.x;
        c6755k.f37534q = point.y;
        Point point2 = t8rVar.f39906q;
        c6755k.f37533n = point2.x;
        c6755k.f37531g = point2.y;
        c6755k.f37532k = t8rVar.f39903g;
        c6755k.f82118toq = m28211g(t8rVar.f87379f7l8);
        c6755k.f82117f7l8 = t8rVar.f39905n;
        return c6755k;
    }

    /* JADX INFO: renamed from: g */
    private static int m28211g(int i2) {
        if (i2 == 0) {
            return kt06.toq.f82110t8r;
        }
        switch (i2) {
            case 4097:
                break;
            case 4098:
                break;
            case 4099:
                break;
            default:
                switch (i2) {
                    case 8192:
                        break;
                    case 8193:
                        break;
                    case 8194:
                        break;
                    case 8195:
                        break;
                    case 8196:
                        break;
                    default:
                        Log.w("MiuixWarning", "Unknown window mode for : " + Integer.toHexString(i2));
                        break;
                }
                break;
        }
        return kt06.toq.f82110t8r;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static kt06.toq m28212k(Context context, t8r t8rVar) {
        return zy.m24693k().m24695q(context, m28216y(context, t8rVar));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m28213n(int i2) {
        return i2 == 2 || i2 == 3;
    }

    /* JADX INFO: renamed from: q */
    public static int m28214q(int i2, int i3, int i4, int i5) {
        if (i2 <= 0) {
            i2 = i4;
        }
        if (i2 <= 640) {
            return 1;
        }
        if (i2 >= 960) {
            return 3;
        }
        return i5 > 550 ? 2 : 1;
    }

    @lvui
    /* JADX INFO: renamed from: s */
    private static toq.C6755k m28215s(Configuration configuration, t8r t8rVar) {
        return f7l8(t8rVar, configuration.densityDpi / 160.0f);
    }

    @dd
    public static kt06.toq toq(Context context, t8r t8rVar, Configuration configuration) {
        return zy.m24693k().m24695q(context, m28215s(configuration, t8rVar));
    }

    @lvui
    /* JADX INFO: renamed from: y */
    private static toq.C6755k m28216y(Context context, t8r t8rVar) {
        return f7l8(t8rVar, context.getResources().getDisplayMetrics().density);
    }

    public static int zy(int i2, int i3) {
        if (i2 <= 640) {
            return 1;
        }
        if (i2 >= 960) {
            return 3;
        }
        return i3 > 550 ? 2 : 1;
    }
}
