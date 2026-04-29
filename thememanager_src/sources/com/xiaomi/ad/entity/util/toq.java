package com.xiaomi.ad.entity.util;

import com.google.gson.fu4;
import com.google.gson.reflect.C4922k;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import com.xiaomi.ad.entity.util.zy;
import java.io.IOException;
import u38j.C7683q;

/* JADX INFO: compiled from: GsonUtils.java */
/* JADX INFO: loaded from: classes3.dex */
class toq extends fu4<Object> {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ fu4 f31139k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final /* synthetic */ C4922k f73025toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final /* synthetic */ zy.C5596k f73026zy;

    toq(zy.C5596k c5596k, fu4 fu4Var, C4922k c4922k) {
        this.f73026zy = c5596k;
        this.f31139k = fu4Var;
        this.f73025toq = c4922k;
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: n */
    public Object mo7087n(C4924k c4924k) throws IOException {
        Class rawType = this.f73025toq.getRawType();
        if (zy.f31141q.containsKey(rawType)) {
            C7683q.f7l8(zy.f7l8(this.f73026zy.f31142k), "TAF: skip " + rawType + " which has customized DESERIALIZER");
            return this.f31139k.mo7087n(c4924k);
        }
        if (String.class.isAssignableFrom(rawType) || rawType.isEnum()) {
            return this.f31139k.mo7087n(c4924k);
        }
        if (c4924k.g1() != com.google.gson.stream.zy.STRING) {
            return this.f31139k.mo7087n(c4924k);
        }
        c4924k.h4b();
        C7683q.kja0(zy.f7l8(this.f73026zy.f31142k), "TAF: skip string value for type : " + rawType);
        return null;
    }

    @Override // com.google.gson.fu4
    /* JADX INFO: renamed from: s */
    public void mo7089s(C4926q c4926q, Object obj) throws IOException {
        this.f31139k.mo7089s(c4926q, obj);
    }
}
