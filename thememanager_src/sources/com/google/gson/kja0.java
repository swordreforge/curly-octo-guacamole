package com.google.gson;

import com.google.gson.internal.C4904p;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: JsonObject.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kja0 extends x2 {

    /* JADX INFO: renamed from: k */
    private final C4904p<String, x2> f27820k = new C4904p<>();

    public kja0 a9(String str) {
        return (kja0) this.f27820k.get(str);
    }

    public x2 d3(String str) {
        return this.f27820k.remove(str);
    }

    public Set<Map.Entry<String, x2>> entrySet() {
        return this.f27820k.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof kja0) && ((kja0) obj).f27820k.equals(this.f27820k));
    }

    public ki fti(String str) {
        return (ki) this.f27820k.get(str);
    }

    public void fu4(String str, Boolean bool) {
        ni7(str, bool == null ? n7h.f27821k : new ki(bool));
    }

    public Set<String> gvn7() {
        return this.f27820k.keySet();
    }

    public int hashCode() {
        return this.f27820k.hashCode();
    }

    public C4923s jk(String str) {
        return (C4923s) this.f27820k.get(str);
    }

    public boolean jp0y(String str) {
        return this.f27820k.containsKey(str);
    }

    public x2 mcp(String str) {
        return this.f27820k.get(str);
    }

    public void ni7(String str, x2 x2Var) {
        C4904p<String, x2> c4904p = this.f27820k;
        if (x2Var == null) {
            x2Var = n7h.f27821k;
        }
        c4904p.put(str, x2Var);
    }

    public void o1t(String str, Number number) {
        ni7(str, number == null ? n7h.f27821k : new ki(number));
    }

    public int size() {
        return this.f27820k.size();
    }

    @Override // com.google.gson.x2
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public kja0 mo17214k() {
        kja0 kja0Var = new kja0();
        for (Map.Entry<String, x2> entry : this.f27820k.entrySet()) {
            kja0Var.ni7(entry.getKey(), entry.getValue().mo17214k());
        }
        return kja0Var;
    }

    public void wvg(String str, String str2) {
        ni7(str, str2 == null ? n7h.f27821k : new ki(str2));
    }

    /* JADX INFO: renamed from: z */
    public void m17220z(String str, Character ch2) {
        ni7(str, ch2 == null ? n7h.f27821k : new ki(ch2));
    }
}
