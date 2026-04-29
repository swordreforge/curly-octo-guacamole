package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.anw;
import com.xiaomi.push.b2;
import com.xiaomi.push.cn02;
import com.xiaomi.push.e4e;
import com.xiaomi.push.erbd;
import com.xiaomi.push.ff;
import com.xiaomi.push.kjd;
import com.xiaomi.push.m28;
import com.xiaomi.push.nod;
import com.xiaomi.push.oaex;
import com.xiaomi.push.qla;
import com.xiaomi.push.rf;
import com.xiaomi.push.uv;
import com.xiaomi.push.wwp;
import com.xiaomi.push.x7o;
import com.xiaomi.push.z8;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class mcp {
    /* JADX INFO: renamed from: g */
    protected static <T extends oaex<T, ?>> m28 m19523g(Context context, T t2, wwp wwpVar, boolean z2, String str, String str2) {
        return zy(context, t2, wwpVar, z2, str, str2, false);
    }

    /* JADX INFO: renamed from: k */
    protected static <T extends oaex<T, ?>> m28 m19524k(Context context, T t2, wwp wwpVar) {
        return toq(context, t2, wwpVar, !wwpVar.equals(wwp.Registration), context.getPackageName(), C5656l.m19500q(context).m19505n());
    }

    /* JADX INFO: renamed from: n */
    private static oaex m19525n(wwp wwpVar, boolean z2) {
        switch (jk.f31382k[wwpVar.ordinal()]) {
            case 1:
                return new e4e();
            case 2:
                return new anw();
            case 3:
                return new ff();
            case 4:
                return new uv();
            case 5:
                return new rf();
            case 6:
                return new x7o();
            case 7:
                return new kjd();
            case 8:
                return new nod();
            case 9:
                if (z2) {
                    return new erbd();
                }
                z8 z8Var = new z8();
                z8Var.m22085a(true);
                return z8Var;
            case 10:
                return new kjd();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static oaex m19526q(Context context, m28 m28Var) {
        byte[] bArrM21248a;
        if (m28Var.m21253b()) {
            byte[] bArrT8r = uv6.t8r(context, m28Var, hyr.ASSEMBLE_PUSH_FCM);
            if (bArrT8r == null) {
                bArrT8r = com.xiaomi.push.x9kr.toq(C5656l.m19500q(context).ni7());
            }
            try {
                bArrM21248a = cn02.toq(bArrT8r, m28Var.m21248a());
            } catch (Exception e2) {
                throw new yz("the aes decrypt failed.", e2);
            }
        } else {
            bArrM21248a = m28Var.m21248a();
        }
        oaex oaexVarM19525n = m19525n(m28Var.m21242a(), m28Var.f33394b);
        if (oaexVarM19525n != null) {
            qla.m21399n(oaexVarM19525n, bArrM21248a);
        }
        return oaexVarM19525n;
    }

    protected static <T extends oaex<T, ?>> m28 toq(Context context, T t2, wwp wwpVar, boolean z2, String str, String str2) {
        return zy(context, t2, wwpVar, z2, str, str2, true);
    }

    protected static <T extends oaex<T, ?>> m28 zy(Context context, T t2, wwp wwpVar, boolean z2, String str, String str2, boolean z3) {
        byte[] bArrM21397g = qla.m21397g(t2);
        if (bArrM21397g == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("invoke convertThriftObjectToBytes method, return null.");
            return null;
        }
        m28 m28Var = new m28();
        if (z2) {
            String strNi7 = C5656l.m19500q(context).ni7();
            if (TextUtils.isEmpty(strNi7)) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("regSecret is empty, return null");
                return null;
            }
            try {
                bArrM21397g = cn02.zy(com.xiaomi.push.x9kr.toq(strNi7), bArrM21397g);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.zy.jk("encryption error. ");
            }
        }
        b2 b2Var = new b2();
        b2Var.f32704a = 5L;
        b2Var.f32705a = "fakeid";
        m28Var.m21236a(b2Var);
        m28Var.m21240a(ByteBuffer.wrap(bArrM21397g));
        m28Var.m21238a(wwpVar);
        m28Var.m21250b(z3);
        m28Var.m21249b(str);
        m28Var.m21241a(z2);
        m28Var.m21239a(str2);
        return m28Var;
    }
}
