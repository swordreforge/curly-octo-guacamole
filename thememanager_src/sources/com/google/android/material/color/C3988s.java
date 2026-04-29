package com.google.android.material.color;

import android.app.Activity;
import com.google.android.material.color.C3989y;
import zy.hb;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.color.s */
/* JADX INFO: compiled from: DynamicColorsOptions.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3988s {

    /* JADX INFO: renamed from: k */
    @hb
    private final int f24243k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final C3989y.g f67540toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    private final C3989y.n f67541zy;

    /* JADX INFO: renamed from: q */
    private static final C3989y.g f24242q = new k();

    /* JADX INFO: renamed from: n */
    private static final C3989y.n f24241n = new toq();

    /* JADX INFO: renamed from: com.google.android.material.color.s$k */
    /* JADX INFO: compiled from: DynamicColorsOptions.java */
    class k implements C3989y.g {
        k() {
        }

        @Override // com.google.android.material.color.C3989y.g
        /* JADX INFO: renamed from: k */
        public boolean mo14331k(@lvui Activity activity, int i2) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.s$toq */
    /* JADX INFO: compiled from: DynamicColorsOptions.java */
    class toq implements C3989y.n {
        toq() {
        }

        @Override // com.google.android.material.color.C3989y.n
        /* JADX INFO: renamed from: k */
        public void mo14332k(@lvui Activity activity) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.s$zy */
    /* JADX INFO: compiled from: DynamicColorsOptions.java */
    public static class zy {

        /* JADX INFO: renamed from: k */
        @hb
        private int f24244k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        private C3989y.g f67542toq = C3988s.f24242q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        private C3989y.n f67543zy = C3988s.f24241n;

        @lvui
        public zy f7l8(@hb int i2) {
            this.f24244k = i2;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: g */
        public zy m14334g(@lvui C3989y.g gVar) {
            this.f67542toq = gVar;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: n */
        public zy m14335n(@lvui C3989y.n nVar) {
            this.f67543zy = nVar;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: q */
        public C3988s m14336q() {
            return new C3988s(this, null);
        }
    }

    /* synthetic */ C3988s(zy zyVar, k kVar) {
        this(zyVar);
    }

    @hb
    /* JADX INFO: renamed from: n */
    public int m14329n() {
        return this.f24243k;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public C3989y.g m14330q() {
        return this.f67540toq;
    }

    @lvui
    public C3989y.n zy() {
        return this.f67541zy;
    }

    private C3988s(zy zyVar) {
        this.f24243k = zyVar.f24244k;
        this.f67540toq = zyVar.f67542toq;
        this.f67541zy = zyVar.f67543zy;
    }
}
