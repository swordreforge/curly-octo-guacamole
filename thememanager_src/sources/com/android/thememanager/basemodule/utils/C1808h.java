package com.android.thememanager.basemodule.utils;

import com.android.thememanager.basemodule.ad.model.AdInfoResponse;
import com.google.gson.C4871g;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4926q;
import java.io.IOException;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.h */
/* JADX INFO: compiled from: GsonUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class C1808h {

    /* JADX INFO: renamed from: k */
    private static volatile C4871g f10333k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final com.google.gson.fu4<AdInfoResponse> f57764toq = new k();

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.h$k */
    /* JADX INFO: compiled from: GsonUtil.java */
    class k extends com.google.gson.fu4<AdInfoResponse> {

        /* JADX INFO: renamed from: k */
        private C4871g f10334k = new C4871g();

        k() {
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public void mo7089s(C4926q out, AdInfoResponse value) throws IOException {
            out.h7am(value == null ? null : value.toString());
        }

        @Override // com.google.gson.fu4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public AdInfoResponse mo7087n(C4924k in) throws IOException {
            if (in.g1() == com.google.gson.stream.zy.NULL) {
                in.a98o();
                return null;
            }
            return (AdInfoResponse) this.f10334k.n7h(in.nmn5(), AdInfoResponse.class);
        }
    }

    /* JADX INFO: renamed from: k */
    public static C4871g m7086k() {
        if (f10333k == null) {
            synchronized (C1808h.class) {
                if (f10333k == null) {
                    com.google.gson.f7l8 f7l8VarFn3e = new C4871g().fn3e();
                    f7l8VarFn3e.ld6(AdInfoResponse.class, f57764toq);
                    f10333k = f7l8VarFn3e.m17082q();
                }
            }
        }
        return f10333k;
    }
}
