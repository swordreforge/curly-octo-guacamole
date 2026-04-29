package com.xiaomi.ad.entity.common;

import com.google.gson.InterfaceC4873i;
import com.google.gson.InterfaceC4920p;
import com.google.gson.ki;
import com.google.gson.ld6;
import com.google.gson.t8r;
import com.google.gson.x2;
import java.lang.reflect.Type;
import u38j.C7683q;

/* JADX INFO: compiled from: IntHolder.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    public int f31123k;

    /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.toq$k */
    /* JADX INFO: compiled from: IntHolder.java */
    static class C5587k implements ld6<toq> {

        /* JADX INFO: renamed from: k */
        private static final String f31124k = "IntHolderDeserializer";

        C5587k() {
        }

        @Override // com.google.gson.ld6
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public toq mo8034k(x2 x2Var, Type type, InterfaceC4920p interfaceC4920p) {
            toq toqVar = new toq();
            try {
                if (x2Var.zurt()) {
                    toqVar.f31123k = x2Var.mo17216p();
                    C7683q.f7l8(f31124k, "IntHolder JsonPrimitive: " + toqVar.f31123k);
                }
            } catch (Exception e2) {
                C7683q.m28055n(f31124k, "IntHolder deserialize exception", e2);
            }
            return toqVar;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.ad.entity.common.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IntHolder.java */
    static class C8033toq implements InterfaceC4873i<toq> {

        /* JADX INFO: renamed from: k */
        private static final String f31125k = "IntHolderSerializer";

        C8033toq() {
        }

        @Override // com.google.gson.InterfaceC4873i
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public x2 toq(toq toqVar, Type type, t8r t8rVar) {
            C7683q.f7l8(f31125k, "IntHolder serialize: " + toqVar.f31123k);
            return new ki(Integer.valueOf(toqVar.f31123k));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m19197k() {
        com.xiaomi.ad.entity.util.zy.m19216s(toq.class, new C8033toq());
        com.xiaomi.ad.entity.util.zy.m19217y(toq.class, new C5587k());
    }
}
