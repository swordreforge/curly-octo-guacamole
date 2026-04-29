package com.google.gson.internal.bind;

import com.google.gson.C4871g;
import com.google.gson.fu4;
import com.google.gson.internal.bind.C4893s;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
final class qrj<T> extends fu4<T> {

    /* JADX INFO: renamed from: k */
    private final C4871g f27711k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final fu4<T> f68768toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Type f68769zy;

    qrj(C4871g c4871g, fu4<T> fu4Var, Type type) {
        this.f27711k = c4871g;
        this.f68768toq = fu4Var;
        this.f68769zy = type;
    }

    /* JADX INFO: renamed from: p */
    private Type m17151p(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: n */
    public T mo7087n(C4924k c4924k) throws IOException {
        return this.f68768toq.mo7087n(c4924k);
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: s */
    public void mo7089s(C4926q c4926q, T t2) throws IOException {
        fu4<T> fu4VarM17097h = this.f68768toq;
        Type typeM17151p = m17151p(this.f68769zy, t2);
        if (typeM17151p != this.f68769zy) {
            fu4VarM17097h = this.f27711k.m17097h(C4922k.get(typeM17151p));
            if (fu4VarM17097h instanceof C4893s.toq) {
                fu4<T> fu4Var = this.f68768toq;
                if (!(fu4Var instanceof C4893s.toq)) {
                    fu4VarM17097h = fu4Var;
                }
            }
        }
        fu4VarM17097h.mo7089s(c4926q, t2);
    }
}
