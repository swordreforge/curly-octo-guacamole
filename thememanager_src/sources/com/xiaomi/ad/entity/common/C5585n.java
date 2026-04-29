package com.xiaomi.ad.entity.common;

import android.text.TextUtils;
import com.google.gson.InterfaceC4873i;
import com.google.gson.InterfaceC4920p;
import com.google.gson.ki;
import com.google.gson.ld6;
import com.google.gson.t8r;
import com.google.gson.x2;
import java.lang.reflect.Type;
import u38j.C7683q;

/* JADX INFO: renamed from: com.xiaomi.ad.entity.common.n */
/* JADX INFO: compiled from: StringHolder.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5585n {

    /* JADX INFO: renamed from: k */
    public String f31105k;

    /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.n$k */
    /* JADX INFO: compiled from: StringHolder.java */
    static class k implements ld6<C5585n> {

        /* JADX INFO: renamed from: k */
        private static final String f31106k = "ExtraHolderDeserializer";

        k() {
        }

        @Override // com.google.gson.ld6
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public C5585n mo8034k(x2 x2Var, Type type, InterfaceC4920p interfaceC4920p) {
            C5585n c5585n = new C5585n();
            try {
                if (x2Var.fn3e()) {
                    c5585n.f31105k = x2Var.qrj().toString();
                    C7683q.f7l8(f31106k, "JsonObject: " + c5585n.f31105k);
                } else if (x2Var.t8r()) {
                    c5585n.f31105k = x2Var.ld6().toString();
                    C7683q.f7l8(f31106k, "JsonArray: " + c5585n.f31105k);
                } else if (x2Var.zurt()) {
                    c5585n.f31105k = x2Var.ki();
                    C7683q.f7l8(f31106k, "JsonPrimitive: " + c5585n.f31105k);
                }
            } catch (Exception e2) {
                C7683q.m28055n(f31106k, "deserialize exception", e2);
            }
            return c5585n;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.n$toq */
    /* JADX INFO: compiled from: StringHolder.java */
    static class toq implements InterfaceC4873i<C5585n> {

        /* JADX INFO: renamed from: k */
        private static final String f31107k = "ExtraHolderDeserializer";

        toq() {
        }

        @Override // com.google.gson.InterfaceC4873i
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public x2 toq(C5585n c5585n, Type type, t8r t8rVar) {
            if (c5585n == null || TextUtils.isEmpty(c5585n.f31105k)) {
                return null;
            }
            C7683q.m28057q(f31107k, "serialize: " + c5585n.f31105k);
            return new ki(c5585n.f31105k);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m19183k() {
        com.xiaomi.ad.entity.util.zy.m19216s(C5585n.class, new toq());
        com.xiaomi.ad.entity.util.zy.m19217y(C5585n.class, new k());
    }
}
