package com.google.common.net;

import com.google.common.base.AbstractC4265n;
import com.google.common.base.d3;
import com.google.common.base.jk;
import com.google.common.base.ni7;
import com.google.common.base.o1t;
import com.google.common.collect.se;
import com.google.errorprone.annotations.Immutable;
import com.google.thirdparty.publicsuffix.C4929k;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.net.n */
/* JADX INFO: compiled from: InternetDomainName.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@wlev.toq
@InterfaceC7731k
public final class C4729n {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f68477ld6 = 63;

    /* JADX INFO: renamed from: p */
    private static final int f27229p = 253;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final AbstractC4265n f68478qrj;

    /* JADX INFO: renamed from: s */
    private static final int f27230s = 127;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final AbstractC4265n f68479x2;

    /* JADX INFO: renamed from: y */
    private static final int f27231y = -1;

    /* JADX INFO: renamed from: k */
    private final String f27232k;

    /* JADX INFO: renamed from: q */
    private final int f27233q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final se<String> f68480toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f68481zy;

    /* JADX INFO: renamed from: n */
    private static final AbstractC4265n f27228n = AbstractC4265n.m15420q(".。．｡");

    /* JADX INFO: renamed from: g */
    private static final d3 f27227g = d3.m15307y('.');

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final ni7 f68476f7l8 = ni7.kja0('.');

    static {
        AbstractC4265n abstractC4265nM15420q = AbstractC4265n.m15420q("-_");
        f68479x2 = abstractC4265nM15420q;
        f68478qrj = AbstractC4265n.fu4().d3(abstractC4265nM15420q);
    }

    C4729n(String str) {
        String strF7l8 = com.google.common.base.zy.f7l8(f27228n.mo15425r(str, '.'));
        strF7l8 = strF7l8.endsWith(".") ? strF7l8.substring(0, strF7l8.length() - 1) : strF7l8;
        jk.fn3e(strF7l8.length() <= f27229p, "Domain name too long: '%s':", strF7l8);
        this.f27232k = strF7l8;
        se<String> seVarCopyOf = se.copyOf(f27227g.n7h(strF7l8));
        this.f68480toq = seVarCopyOf;
        jk.fn3e(seVarCopyOf.size() <= 127, "Domain has too many parts: '%s'", strF7l8);
        jk.fn3e(fu4(seVarCopyOf), "Not a valid domain name: '%s'", strF7l8);
        this.f68481zy = zy(o1t.absent());
        this.f27233q = zy(o1t.of(com.google.thirdparty.publicsuffix.toq.REGISTRY));
    }

    private static boolean fu4(List<String> list) {
        int size = list.size() - 1;
        if (!ni7(list.get(size), true)) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!ni7(list.get(i2), false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m16598h(o1t<com.google.thirdparty.publicsuffix.toq> o1tVar, String str) {
        List<String> listKja0 = f27227g.m15308g(2).kja0(str);
        return listKja0.size() == 2 && kja0(o1tVar, o1t.fromNullable(C4929k.f68804toq.get(listKja0.get(1))));
    }

    /* JADX INFO: renamed from: k */
    private C4729n m16599k(int i2) {
        ni7 ni7Var = f68476f7l8;
        se<String> seVar = this.f68480toq;
        return m16600q(ni7Var.ld6(seVar.subList(i2, seVar.size())));
    }

    private static boolean kja0(o1t<com.google.thirdparty.publicsuffix.toq> o1tVar, o1t<com.google.thirdparty.publicsuffix.toq> o1tVar2) {
        return o1tVar.isPresent() ? o1tVar.equals(o1tVar2) : o1tVar2.isPresent();
    }

    public static boolean n7h(String str) {
        try {
            m16600q(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private static boolean ni7(String str, boolean z2) {
        if (str.length() >= 1 && str.length() <= 63) {
            if (!f68478qrj.mcp(AbstractC4265n.m15414g().x9kr(str))) {
                return false;
            }
            AbstractC4265n abstractC4265n = f68479x2;
            if (!abstractC4265n.mo15362t(str.charAt(0)) && !abstractC4265n.mo15362t(str.charAt(str.length() - 1))) {
                return (z2 && AbstractC4265n.m15419p().mo15362t(str.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static C4729n m16600q(String str) {
        return new C4729n((String) jk.a9(str));
    }

    private int zy(o1t<com.google.thirdparty.publicsuffix.toq> o1tVar) {
        int size = this.f68480toq.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strLd6 = f68476f7l8.ld6(this.f68480toq.subList(i2, size));
            if (kja0(o1tVar, o1t.fromNullable(C4929k.f27869k.get(strLd6)))) {
                return i2;
            }
            if (C4929k.f68805zy.containsKey(strLd6)) {
                return i2 + 1;
            }
            if (m16598h(o1tVar, strLd6)) {
                return i2;
            }
        }
        return -1;
    }

    public C4729n cdj() {
        jk.gyi(m16603n(), "Domain '%s' has no parent", this.f27232k);
        return m16599k(1);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4729n) {
            return this.f27232k.equals(((C4729n) obj).f27232k);
        }
        return false;
    }

    public boolean f7l8() {
        return this.f27233q != -1;
    }

    public C4729n fn3e() {
        if (m16604p()) {
            return this;
        }
        jk.gyi(qrj(), "Not under a registry suffix: %s", this.f27232k);
        return m16599k(this.f27233q - 1);
    }

    /* JADX INFO: renamed from: g */
    public boolean m16601g() {
        return this.f68481zy != -1;
    }

    public int hashCode() {
        return this.f27232k.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public C4729n m16602i() {
        if (f7l8()) {
            return m16599k(this.f27233q);
        }
        return null;
    }

    public se<String> ki() {
        return this.f68480toq;
    }

    public boolean ld6() {
        return this.f68481zy == 1;
    }

    /* JADX INFO: renamed from: n */
    public boolean m16603n() {
        return this.f68480toq.size() > 1;
    }

    /* JADX INFO: renamed from: p */
    public boolean m16604p() {
        return this.f27233q == 1;
    }

    public boolean qrj() {
        return this.f27233q > 0;
    }

    /* JADX INFO: renamed from: s */
    public boolean m16605s() {
        return this.f27233q == 0;
    }

    public C4729n t8r() {
        if (m16601g()) {
            return m16599k(this.f68481zy);
        }
        return null;
    }

    public String toString() {
        return this.f27232k;
    }

    public C4729n toq(String str) {
        return m16600q(((String) jk.a9(str)) + "." + this.f27232k);
    }

    public boolean x2() {
        return this.f68481zy > 0;
    }

    /* JADX INFO: renamed from: y */
    public boolean m16606y() {
        return this.f68481zy == 0;
    }

    public C4729n zurt() {
        if (ld6()) {
            return this;
        }
        jk.gyi(x2(), "Not under a public suffix: %s", this.f27232k);
        return m16599k(this.f68481zy - 1);
    }
}
