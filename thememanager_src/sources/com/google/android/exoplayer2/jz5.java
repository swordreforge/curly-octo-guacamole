package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.InterfaceC3612m;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PlaylistTimeline.java */
/* JADX INFO: loaded from: classes2.dex */
final class jz5 extends AbstractC3449k {

    /* JADX INFO: renamed from: c */
    private final HashMap<Object, Integer> f20574c;

    /* JADX INFO: renamed from: f */
    private final Object[] f20575f;

    /* JADX INFO: renamed from: i */
    private final int f20576i;

    /* JADX INFO: renamed from: l */
    private final pc[] f20577l;

    /* JADX INFO: renamed from: r */
    private final int[] f20578r;

    /* JADX INFO: renamed from: t */
    private final int[] f20579t;

    /* JADX INFO: renamed from: z */
    private final int f20580z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz5(Collection<? extends ltg8> collection, InterfaceC3612m interfaceC3612m) {
        super(false, interfaceC3612m);
        int iZurt = 0;
        int size = collection.size();
        this.f20579t = new int[size];
        this.f20578r = new int[size];
        this.f20577l = new pc[size];
        this.f20575f = new Object[size];
        this.f20574c = new HashMap<>();
        int iQrj = 0;
        int i2 = 0;
        for (ltg8 ltg8Var : collection) {
            this.f20577l[i2] = ltg8Var.toq();
            this.f20578r[i2] = iZurt;
            this.f20579t[i2] = iQrj;
            iZurt += this.f20577l[i2].zurt();
            iQrj += this.f20577l[i2].qrj();
            this.f20575f[i2] = ltg8Var.mo12171k();
            this.f20574c.put(this.f20575f[i2], Integer.valueOf(i2));
            i2++;
        }
        this.f20576i = iZurt;
        this.f20580z = iQrj;
    }

    @Override // com.google.android.exoplayer2.AbstractC3449k
    protected pc d2ok(int i2) {
        return this.f20577l[i2];
    }

    @Override // com.google.android.exoplayer2.AbstractC3449k
    protected int d3(int i2) {
        return this.f20578r[i2];
    }

    @Override // com.google.android.exoplayer2.AbstractC3449k
    protected Object fti(int i2) {
        return this.f20575f[i2];
    }

    @Override // com.google.android.exoplayer2.AbstractC3449k
    protected int gvn7(int i2) {
        return this.f20579t[i2];
    }

    List<pc> lvui() {
        return Arrays.asList(this.f20577l);
    }

    @Override // com.google.android.exoplayer2.AbstractC3449k
    protected int mcp(int i2) {
        return com.google.android.exoplayer2.util.lrht.m13670s(this.f20578r, i2 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.pc
    public int qrj() {
        return this.f20580z;
    }

    @Override // com.google.android.exoplayer2.AbstractC3449k
    /* JADX INFO: renamed from: t */
    protected int mo12146t(int i2) {
        return com.google.android.exoplayer2.util.lrht.m13670s(this.f20579t, i2 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractC3449k
    protected int wvg(Object obj) {
        Integer num = this.f20574c.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.pc
    public int zurt() {
        return this.f20576i;
    }
}
