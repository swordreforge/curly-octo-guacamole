package com.google.common.escape;

import com.google.common.base.t8r;

/* JADX INFO: renamed from: com.google.common.escape.g */
/* JADX INFO: compiled from: Escaper.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class AbstractC4601g {

    /* JADX INFO: renamed from: k */
    private final t8r<String, String> f26826k = new k();

    /* JADX INFO: renamed from: com.google.common.escape.g$k */
    /* JADX INFO: compiled from: Escaper.java */
    class k implements t8r<String, String> {
        k() {
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return AbstractC4601g.this.toq(str);
        }
    }

    protected AbstractC4601g() {
    }

    /* JADX INFO: renamed from: k */
    public final t8r<String, String> m16149k() {
        return this.f26826k;
    }

    public abstract String toq(String str);
}
