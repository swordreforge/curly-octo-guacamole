package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: androidx.constraintlayout.core.state.g */
/* JADX INFO: compiled from: Registry.java */
/* JADX INFO: loaded from: classes.dex */
public class C0309g {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final C0309g f47613toq = new C0309g();

    /* JADX INFO: renamed from: k */
    private HashMap<String, f7l8> f1893k = new HashMap<>();

    public static C0309g zy() {
        return f47613toq;
    }

    public void f7l8(String str, int i2) {
        f7l8 f7l8Var = this.f1893k.get(str);
        if (f7l8Var != null) {
            f7l8Var.m1173k(i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1177g(String str, f7l8 f7l8Var) {
        this.f1893k.put(str, f7l8Var);
    }

    /* JADX INFO: renamed from: k */
    public String m1178k(String str) {
        f7l8 f7l8Var = this.f1893k.get(str);
        if (f7l8Var != null) {
            return f7l8Var.f7l8();
        }
        return null;
    }

    public void ld6(String str, int i2, int i3) {
        f7l8 f7l8Var = this.f1893k.get(str);
        if (f7l8Var != null) {
            f7l8Var.m1175q(i2, i3);
        }
    }

    /* JADX INFO: renamed from: n */
    public Set<String> m1179n() {
        return this.f1893k.keySet();
    }

    /* JADX INFO: renamed from: p */
    public void m1180p(String str, String str2) {
        f7l8 f7l8Var = this.f1893k.get(str);
        if (f7l8Var != null) {
            f7l8Var.m1172g(str2);
        }
    }

    /* JADX INFO: renamed from: q */
    public long m1181q(String str) {
        f7l8 f7l8Var = this.f1893k.get(str);
        if (f7l8Var != null) {
            return f7l8Var.m1174n();
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: s */
    public void m1182s(String str, f7l8 f7l8Var) {
        this.f1893k.remove(str);
    }

    public String toq(String str) {
        f7l8 f7l8Var = this.f1893k.get(str);
        if (f7l8Var != null) {
            return f7l8Var.m1176y();
        }
        return null;
    }

    public void x2(String str, float f2) {
        f7l8 f7l8Var = this.f1893k.get(str);
        if (f7l8Var != null) {
            f7l8Var.zy(f2);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m1183y(String str, int i2) {
        f7l8 f7l8Var = this.f1893k.get(str);
        if (f7l8Var != null) {
            f7l8Var.toq(i2);
        }
    }
}
