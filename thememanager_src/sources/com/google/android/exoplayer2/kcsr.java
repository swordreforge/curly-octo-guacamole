package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.source.fti;
import java.util.List;
import zy.InterfaceC7839p;

/* JADX INFO: compiled from: PlaybackInfo.java */
/* JADX INFO: loaded from: classes2.dex */
final class kcsr {

    /* JADX INFO: renamed from: i */
    private static final fti.C3596k f20584i = new fti.C3596k(new Object());

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public volatile long f64844cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final boolean f64845f7l8;

    /* JADX INFO: renamed from: g */
    @zy.dd
    public final ki f20585g;

    /* JADX INFO: renamed from: h */
    public final boolean f20586h;

    /* JADX INFO: renamed from: k */
    public final pc f20587k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public volatile long f64846ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public final boolean f64847kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public final fti.C3596k f64848ld6;

    /* JADX INFO: renamed from: n */
    public final int f20588n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public final se f64849n7h;

    /* JADX INFO: renamed from: p */
    public final List<Metadata> f20589p;

    /* JADX INFO: renamed from: q */
    public final long f20590q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public final int f64850qrj;

    /* JADX INFO: renamed from: s */
    public final com.google.android.exoplayer2.trackselection.ni7 f20591s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public volatile long f64851t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final fti.C3596k f64852toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public final boolean f64853x2;

    /* JADX INFO: renamed from: y */
    public final C3629x f20592y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final long f64854zy;

    public kcsr(pc pcVar, fti.C3596k c3596k, long j2, long j3, int i2, @zy.dd ki kiVar, boolean z2, C3629x c3629x, com.google.android.exoplayer2.trackselection.ni7 ni7Var, List<Metadata> list, fti.C3596k c3596k2, boolean z3, int i3, se seVar, long j4, long j5, long j6, boolean z5, boolean z6) {
        this.f20587k = pcVar;
        this.f64852toq = c3596k;
        this.f64854zy = j2;
        this.f20590q = j3;
        this.f20588n = i2;
        this.f20585g = kiVar;
        this.f64845f7l8 = z2;
        this.f20592y = c3629x;
        this.f20591s = ni7Var;
        this.f20589p = list;
        this.f64848ld6 = c3596k2;
        this.f64853x2 = z3;
        this.f64850qrj = i3;
        this.f64849n7h = seVar;
        this.f64844cdj = j4;
        this.f64846ki = j5;
        this.f64851t8r = j6;
        this.f64847kja0 = z5;
        this.f20586h = z6;
    }

    public static kcsr ld6(com.google.android.exoplayer2.trackselection.ni7 ni7Var) {
        pc pcVar = pc.f21113k;
        fti.C3596k c3596k = f20584i;
        return new kcsr(pcVar, c3596k, C3548p.f65257toq, 0L, 1, null, false, C3629x.f21698g, ni7Var, com.google.common.collect.se.of(), c3596k, false, 0, se.f21212g, 0L, 0L, 0L, false, false);
    }

    public static fti.C3596k x2() {
        return f20584i;
    }

    @InterfaceC7839p
    public kcsr f7l8(se seVar) {
        return new kcsr(this.f20587k, this.f64852toq, this.f64854zy, this.f20590q, this.f20588n, this.f20585g, this.f64845f7l8, this.f20592y, this.f20591s, this.f20589p, this.f64848ld6, this.f64853x2, this.f64850qrj, seVar, this.f64844cdj, this.f64846ki, this.f64851t8r, this.f64847kja0, this.f20586h);
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: g */
    public kcsr m12150g(@zy.dd ki kiVar) {
        return new kcsr(this.f20587k, this.f64852toq, this.f64854zy, this.f20590q, this.f20588n, kiVar, this.f64845f7l8, this.f20592y, this.f20591s, this.f20589p, this.f64848ld6, this.f64853x2, this.f64850qrj, this.f64849n7h, this.f64844cdj, this.f64846ki, this.f64851t8r, this.f64847kja0, this.f20586h);
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: k */
    public kcsr m12151k(boolean z2) {
        return new kcsr(this.f20587k, this.f64852toq, this.f64854zy, this.f20590q, this.f20588n, this.f20585g, z2, this.f20592y, this.f20591s, this.f20589p, this.f64848ld6, this.f64853x2, this.f64850qrj, this.f64849n7h, this.f64844cdj, this.f64846ki, this.f64851t8r, this.f64847kja0, this.f20586h);
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: n */
    public kcsr m12152n(boolean z2, int i2) {
        return new kcsr(this.f20587k, this.f64852toq, this.f64854zy, this.f20590q, this.f20588n, this.f20585g, this.f64845f7l8, this.f20592y, this.f20591s, this.f20589p, this.f64848ld6, z2, i2, this.f64849n7h, this.f64844cdj, this.f64846ki, this.f64851t8r, this.f64847kja0, this.f20586h);
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: p */
    public kcsr m12153p(pc pcVar) {
        return new kcsr(pcVar, this.f64852toq, this.f64854zy, this.f20590q, this.f20588n, this.f20585g, this.f64845f7l8, this.f20592y, this.f20591s, this.f20589p, this.f64848ld6, this.f64853x2, this.f64850qrj, this.f64849n7h, this.f64844cdj, this.f64846ki, this.f64851t8r, this.f64847kja0, this.f20586h);
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: q */
    public kcsr m12154q(boolean z2) {
        return new kcsr(this.f20587k, this.f64852toq, this.f64854zy, this.f20590q, this.f20588n, this.f20585g, this.f64845f7l8, this.f20592y, this.f20591s, this.f20589p, this.f64848ld6, this.f64853x2, this.f64850qrj, this.f64849n7h, this.f64844cdj, this.f64846ki, this.f64851t8r, z2, this.f20586h);
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: s */
    public kcsr m12155s(boolean z2) {
        return new kcsr(this.f20587k, this.f64852toq, this.f64854zy, this.f20590q, this.f20588n, this.f20585g, this.f64845f7l8, this.f20592y, this.f20591s, this.f20589p, this.f64848ld6, this.f64853x2, this.f64850qrj, this.f64849n7h, this.f64844cdj, this.f64846ki, this.f64851t8r, this.f64847kja0, z2);
    }

    @InterfaceC7839p
    public kcsr toq(fti.C3596k c3596k) {
        return new kcsr(this.f20587k, this.f64852toq, this.f64854zy, this.f20590q, this.f20588n, this.f20585g, this.f64845f7l8, this.f20592y, this.f20591s, this.f20589p, c3596k, this.f64853x2, this.f64850qrj, this.f64849n7h, this.f64844cdj, this.f64846ki, this.f64851t8r, this.f64847kja0, this.f20586h);
    }

    @InterfaceC7839p
    /* JADX INFO: renamed from: y */
    public kcsr m12156y(int i2) {
        return new kcsr(this.f20587k, this.f64852toq, this.f64854zy, this.f20590q, i2, this.f20585g, this.f64845f7l8, this.f20592y, this.f20591s, this.f20589p, this.f64848ld6, this.f64853x2, this.f64850qrj, this.f64849n7h, this.f64844cdj, this.f64846ki, this.f64851t8r, this.f64847kja0, this.f20586h);
    }

    @InterfaceC7839p
    public kcsr zy(fti.C3596k c3596k, long j2, long j3, long j4, long j5, C3629x c3629x, com.google.android.exoplayer2.trackselection.ni7 ni7Var, List<Metadata> list) {
        return new kcsr(this.f20587k, c3596k, j3, j4, this.f20588n, this.f20585g, this.f64845f7l8, c3629x, ni7Var, list, this.f64848ld6, this.f64853x2, this.f64850qrj, this.f64849n7h, this.f64844cdj, j5, j2, this.f64847kja0, this.f20586h);
    }
}
