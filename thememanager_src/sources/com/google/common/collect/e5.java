package com.google.common.collect;

import com.google.common.base.fu4;
import com.google.common.collect.dxef;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: compiled from: MapMaker.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class e5 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f68188f7l8 = 16;

    /* JADX INFO: renamed from: s */
    static final int f26074s = -1;

    /* JADX INFO: renamed from: y */
    private static final int f26075y = 4;

    /* JADX INFO: renamed from: g */
    @MonotonicNonNullDecl
    com.google.common.base.x2<Object> f26076g;

    /* JADX INFO: renamed from: k */
    boolean f26077k;

    /* JADX INFO: renamed from: n */
    @MonotonicNonNullDecl
    dxef.cdj f26078n;

    /* JADX INFO: renamed from: q */
    @MonotonicNonNullDecl
    dxef.cdj f26079q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f68189toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f68190zy = -1;

    /* JADX INFO: renamed from: com.google.common.collect.e5$k */
    /* JADX INFO: compiled from: MapMaker.java */
    enum EnumC4353k {
        VALUE
    }

    @CanIgnoreReturnValue
    public e5 f7l8(int i2) {
        int i3 = this.f68189toq;
        com.google.common.base.jk.zp(i3 == -1, "initial capacity was already set to %s", i3);
        com.google.common.base.jk.m15383q(i2 >= 0);
        this.f68189toq = i2;
        return this;
    }

    /* JADX INFO: renamed from: g */
    dxef.cdj m15637g() {
        return (dxef.cdj) com.google.common.base.fu4.m15351k(this.f26078n, dxef.cdj.STRONG);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: k */
    public e5 m15638k(int i2) {
        int i3 = this.f68190zy;
        com.google.common.base.jk.zp(i3 == -1, "concurrency level was already set to %s", i3);
        com.google.common.base.jk.m15383q(i2 > 0);
        this.f68190zy = i2;
        return this;
    }

    e5 ld6(dxef.cdj cdjVar) {
        dxef.cdj cdjVar2 = this.f26078n;
        com.google.common.base.jk.gyi(cdjVar2 == null, "Value strength was already set to %s", cdjVar2);
        this.f26078n = (dxef.cdj) com.google.common.base.jk.a9(cdjVar);
        if (cdjVar != dxef.cdj.STRONG) {
            this.f26077k = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    dxef.cdj m15639n() {
        return (dxef.cdj) com.google.common.base.fu4.m15351k(this.f26079q, dxef.cdj.STRONG);
    }

    /* JADX INFO: renamed from: p */
    e5 m15640p(dxef.cdj cdjVar) {
        dxef.cdj cdjVar2 = this.f26079q;
        com.google.common.base.jk.gyi(cdjVar2 == null, "Key strength was already set to %s", cdjVar2);
        this.f26079q = (dxef.cdj) com.google.common.base.jk.a9(cdjVar);
        if (cdjVar != dxef.cdj.STRONG) {
            this.f26077k = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: q */
    com.google.common.base.x2<Object> m15641q() {
        return (com.google.common.base.x2) com.google.common.base.fu4.m15351k(this.f26076g, m15639n().defaultEquivalence());
    }

    @CanIgnoreReturnValue
    @wlev.zy
    public e5 qrj() {
        return ld6(dxef.cdj.WEAK);
    }

    /* JADX INFO: renamed from: s */
    public <K, V> ConcurrentMap<K, V> m15642s() {
        return !this.f26077k ? new ConcurrentHashMap(zy(), 0.75f, toq()) : dxef.create(this);
    }

    public String toString() {
        fu4.toq toqVarZy = com.google.common.base.fu4.zy(this);
        int i2 = this.f68189toq;
        if (i2 != -1) {
            toqVarZy.m15360q("initialCapacity", i2);
        }
        int i3 = this.f68190zy;
        if (i3 != -1) {
            toqVarZy.m15360q("concurrencyLevel", i3);
        }
        dxef.cdj cdjVar = this.f26079q;
        if (cdjVar != null) {
            toqVarZy.m15356g("keyStrength", com.google.common.base.zy.f7l8(cdjVar.toString()));
        }
        dxef.cdj cdjVar2 = this.f26078n;
        if (cdjVar2 != null) {
            toqVarZy.m15356g("valueStrength", com.google.common.base.zy.f7l8(cdjVar2.toString()));
        }
        if (this.f26076g != null) {
            toqVarZy.m15357h("keyEquivalence");
        }
        return toqVarZy.toString();
    }

    int toq() {
        int i2 = this.f68190zy;
        if (i2 == -1) {
            return 4;
        }
        return i2;
    }

    @CanIgnoreReturnValue
    @wlev.zy
    public e5 x2() {
        return m15640p(dxef.cdj.WEAK);
    }

    @CanIgnoreReturnValue
    @wlev.zy
    /* JADX INFO: renamed from: y */
    e5 m15643y(com.google.common.base.x2<Object> x2Var) {
        com.google.common.base.x2<Object> x2Var2 = this.f26076g;
        com.google.common.base.jk.gyi(x2Var2 == null, "key equivalence was already set to %s", x2Var2);
        this.f26076g = (com.google.common.base.x2) com.google.common.base.jk.a9(x2Var);
        this.f26077k = true;
        return this;
    }

    int zy() {
        int i2 = this.f68189toq;
        if (i2 == -1) {
            return 16;
        }
        return i2;
    }
}
