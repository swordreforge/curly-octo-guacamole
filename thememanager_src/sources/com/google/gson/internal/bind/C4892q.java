package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.InterfaceC4873i;
import com.google.gson.InterfaceC4928z;
import com.google.gson.fu4;
import com.google.gson.reflect.C4922k;

/* JADX INFO: renamed from: com.google.gson.internal.bind.q */
/* JADX INFO: compiled from: JsonAdapterAnnotationTypeAdapterFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4892q implements InterfaceC4928z {

    /* JADX INFO: renamed from: k */
    private final com.google.gson.internal.zy f27710k;

    public C4892q(com.google.gson.internal.zy zyVar) {
        this.f27710k = zyVar;
    }

    @Override // com.google.gson.InterfaceC4928z
    /* JADX INFO: renamed from: k */
    public <T> fu4<T> mo17108k(C4871g c4871g, C4922k<T> c4922k) {
        e5.toq toqVar = (e5.toq) c4922k.getRawType().getAnnotation(e5.toq.class);
        if (toqVar == null) {
            return null;
        }
        return (fu4<T>) toq(this.f27710k, c4871g, c4922k, toqVar);
    }

    fu4<?> toq(com.google.gson.internal.zy zyVar, C4871g c4871g, C4922k<?> c4922k, e5.toq toqVar) {
        fu4<?> x2Var;
        Object objMo17167k = zyVar.m17209k(C4922k.get((Class) toqVar.value())).mo17167k();
        if (objMo17167k instanceof fu4) {
            x2Var = (fu4) objMo17167k;
        } else if (objMo17167k instanceof InterfaceC4928z) {
            x2Var = ((InterfaceC4928z) objMo17167k).mo17108k(c4871g, c4922k);
        } else {
            boolean z2 = objMo17167k instanceof InterfaceC4873i;
            if (!z2 && !(objMo17167k instanceof com.google.gson.ld6)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo17167k.getClass().getName() + " as a @JsonAdapter for " + c4922k.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            x2Var = new x2<>(z2 ? (InterfaceC4873i) objMo17167k : null, objMo17167k instanceof com.google.gson.ld6 ? (com.google.gson.ld6) objMo17167k : null, c4871g, c4922k, null);
        }
        return (x2Var == null || !toqVar.nullSafe()) ? x2Var : x2Var.m17089q();
    }
}
