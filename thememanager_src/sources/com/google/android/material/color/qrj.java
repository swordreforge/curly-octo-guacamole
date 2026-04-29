package com.google.android.material.color;

import ij.C6095k;
import zy.InterfaceC7828g;
import zy.dd;
import zy.hb;
import zy.lvui;

/* JADX INFO: compiled from: HarmonizedColorsOptions.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj {

    /* JADX INFO: renamed from: k */
    @zy.n7h
    @lvui
    private final int[] f24239k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private final C3985p f67536toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7828g
    private final int f67537zy;

    /* JADX INFO: compiled from: HarmonizedColorsOptions.java */
    public static class toq {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        private C3985p f67538toq;

        /* JADX INFO: renamed from: k */
        @zy.n7h
        @lvui
        private int[] f24240k = new int[0];

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7828g
        private int f67539zy = C6095k.zy.f80219kz28;

        @lvui
        public toq f7l8(@zy.n7h @lvui int[] iArr) {
            this.f24240k = iArr;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: g */
        public toq m14325g(@dd C3985p c3985p) {
            this.f67538toq = c3985p;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: n */
        public toq m14326n(@InterfaceC7828g int i2) {
            this.f67539zy = i2;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: q */
        public qrj m14327q() {
            return new qrj(this);
        }
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static qrj m14321k() {
        return new toq().m14325g(C3985p.zy()).m14327q();
    }

    @hb
    /* JADX INFO: renamed from: n */
    int m14322n(@hb int i2) {
        C3985p c3985p = this.f67536toq;
        return (c3985p == null || c3985p.m14318n() == 0) ? i2 : this.f67536toq.m14318n();
    }

    @zy.n7h
    @lvui
    /* JADX INFO: renamed from: q */
    public int[] m14323q() {
        return this.f24239k;
    }

    @InterfaceC7828g
    public int toq() {
        return this.f67537zy;
    }

    @dd
    public C3985p zy() {
        return this.f67536toq;
    }

    private qrj(toq toqVar) {
        this.f24239k = toqVar.f24240k;
        this.f67536toq = toqVar.f67538toq;
        this.f67537zy = toqVar.f67539zy;
    }
}
