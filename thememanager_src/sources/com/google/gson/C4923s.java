package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.gson.s */
/* JADX INFO: compiled from: JsonArray.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4923s extends x2 implements Iterable<x2> {

    /* JADX INFO: renamed from: k */
    private final List<x2> f27824k;

    public C4923s() {
        this.f27824k = new ArrayList();
    }

    public x2 a9(int i2) {
        return this.f27824k.get(i2);
    }

    @Override // com.google.gson.x2
    public short cdj() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).cdj();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4923s) && ((C4923s) obj).f27824k.equals(this.f27824k));
    }

    @Override // com.google.gson.x2
    public char f7l8() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).f7l8();
        }
        throw new IllegalStateException();
    }

    public x2 fti(int i2) {
        return this.f27824k.remove(i2);
    }

    public void fu4(Boolean bool) {
        this.f27824k.add(bool == null ? n7h.f27821k : new ki(bool));
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: g */
    public byte mo17212g() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).mo17212g();
        }
        throw new IllegalStateException();
    }

    public x2 gvn7(int i2, x2 x2Var) {
        return this.f27824k.set(i2, x2Var);
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: h */
    public Number mo17213h() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).mo17213h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f27824k.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<x2> iterator() {
        return this.f27824k.iterator();
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: jk, reason: merged with bridge method [inline-methods] */
    public C4923s mo17214k() {
        if (this.f27824k.isEmpty()) {
            return new C4923s();
        }
        C4923s c4923s = new C4923s(this.f27824k.size());
        Iterator<x2> it = this.f27824k.iterator();
        while (it.hasNext()) {
            c4923s.ni7(it.next().mo17214k());
        }
        return c4923s;
    }

    public boolean jp0y(x2 x2Var) {
        return this.f27824k.remove(x2Var);
    }

    @Override // com.google.gson.x2
    public String ki() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).ki();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.x2
    public long kja0() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).kja0();
        }
        throw new IllegalStateException();
    }

    public boolean mcp(x2 x2Var) {
        return this.f27824k.contains(x2Var);
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: n */
    public boolean mo17215n() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).mo17215n();
        }
        throw new IllegalStateException();
    }

    public void ni7(x2 x2Var) {
        if (x2Var == null) {
            x2Var = n7h.f27821k;
        }
        this.f27824k.add(x2Var);
    }

    public void o1t(Number number) {
        this.f27824k.add(number == null ? n7h.f27821k : new ki(number));
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: p */
    public int mo17216p() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).mo17216p();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: s */
    public float mo17217s() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).mo17217s();
        }
        throw new IllegalStateException();
    }

    public int size() {
        return this.f27824k.size();
    }

    /* JADX INFO: renamed from: t */
    public void m17221t(C4923s c4923s) {
        this.f27824k.addAll(c4923s.f27824k);
    }

    @Override // com.google.gson.x2
    public BigDecimal toq() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).toq();
        }
        throw new IllegalStateException();
    }

    public void wvg(String str) {
        this.f27824k.add(str == null ? n7h.f27821k : new ki(str));
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: y */
    public double mo17218y() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).mo17218y();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: z */
    public void m17222z(Character ch2) {
        this.f27824k.add(ch2 == null ? n7h.f27821k : new ki(ch2));
    }

    @Override // com.google.gson.x2
    public BigInteger zy() {
        if (this.f27824k.size() == 1) {
            return this.f27824k.get(0).zy();
        }
        throw new IllegalStateException();
    }

    public C4923s(int i2) {
        this.f27824k = new ArrayList(i2);
    }
}
