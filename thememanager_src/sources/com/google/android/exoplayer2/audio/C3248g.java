package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.g */
/* JADX INFO: compiled from: AudioAttributes.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3248g implements InterfaceC3555s {

    /* JADX INFO: renamed from: h */
    private static final int f19333h = 1;

    /* JADX INFO: renamed from: i */
    private static final int f19334i = 2;

    /* JADX INFO: renamed from: p */
    private static final int f19335p = 0;

    /* JADX INFO: renamed from: s */
    public static final C3248g f19336s = new toq().m11439k();

    /* JADX INFO: renamed from: t */
    public static final InterfaceC3555s.k<C3248g> f19337t = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.audio.n
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return C3248g.m11438q(bundle);
        }
    };

    /* JADX INFO: renamed from: z */
    private static final int f19338z = 3;

    /* JADX INFO: renamed from: g */
    public final int f19339g;

    /* JADX INFO: renamed from: k */
    public final int f19340k;

    /* JADX INFO: renamed from: n */
    public final int f19341n;

    /* JADX INFO: renamed from: q */
    public final int f19342q;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private AudioAttributes f19343y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.g$toq */
    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private int f19344k = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f63367toq = 0;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f63368zy = 1;

        /* JADX INFO: renamed from: q */
        private int f19345q = 1;

        /* JADX INFO: renamed from: k */
        public C3248g m11439k() {
            return new C3248g(this.f19344k, this.f63367toq, this.f63368zy, this.f19345q);
        }

        /* JADX INFO: renamed from: n */
        public toq m11440n(int i2) {
            this.f63368zy = i2;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public toq m11441q(int i2) {
            this.f63367toq = i2;
            return this;
        }

        public toq toq(int i2) {
            this.f19345q = i2;
            return this;
        }

        public toq zy(int i2) {
            this.f19344k = i2;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C3248g m11438q(Bundle bundle) {
        toq toqVar = new toq();
        if (bundle.containsKey(zy(0))) {
            toqVar.zy(bundle.getInt(zy(0)));
        }
        if (bundle.containsKey(zy(1))) {
            toqVar.m11441q(bundle.getInt(zy(1)));
        }
        if (bundle.containsKey(zy(2))) {
            toqVar.m11440n(bundle.getInt(zy(2)));
        }
        if (bundle.containsKey(zy(3))) {
            toqVar.toq(bundle.getInt(zy(3)));
        }
        return toqVar.m11439k();
    }

    private static String zy(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3248g.class != obj.getClass()) {
            return false;
        }
        C3248g c3248g = (C3248g) obj;
        return this.f19340k == c3248g.f19340k && this.f19342q == c3248g.f19342q && this.f19341n == c3248g.f19341n && this.f19339g == c3248g.f19339g;
    }

    public int hashCode() {
        return ((((((527 + this.f19340k) * 31) + this.f19342q) * 31) + this.f19341n) * 31) + this.f19339g;
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(zy(0), this.f19340k);
        bundle.putInt(zy(1), this.f19342q);
        bundle.putInt(zy(2), this.f19341n);
        bundle.putInt(zy(3), this.f19339g);
        return bundle;
    }

    @zy.hyr(21)
    public AudioAttributes toq() {
        if (this.f19343y == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f19340k).setFlags(this.f19342q).setUsage(this.f19341n);
            if (com.google.android.exoplayer2.util.lrht.f23230k >= 29) {
                usage.setAllowedCapturePolicy(this.f19339g);
            }
            this.f19343y = usage.build();
        }
        return this.f19343y;
    }

    private C3248g(int i2, int i3, int i4, int i5) {
        this.f19340k = i2;
        this.f19342q = i3;
        this.f19341n = i4;
        this.f19339g = i5;
    }
}
