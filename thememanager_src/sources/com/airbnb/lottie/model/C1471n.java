package com.airbnb.lottie.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zy.InterfaceC7839p;
import zy.dd;
import zy.uv6;

/* JADX INFO: renamed from: com.airbnb.lottie.model.n */
/* JADX INFO: compiled from: KeyPath.java */
/* JADX INFO: loaded from: classes.dex */
public class C1471n {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final C1471n f56103zy = new C1471n("COMPOSITION");

    /* JADX INFO: renamed from: k */
    private final List<String> f8086k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    private InterfaceC1460g f56104toq;

    public C1471n(String... strArr) {
        this.f8086k = Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: g */
    private boolean m6086g(String str) {
        return "__container".equals(str);
    }

    private boolean toq() {
        return this.f8086k.get(r0.size() - 1).equals("**");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1471n c1471n = (C1471n) obj;
        if (!this.f8086k.equals(c1471n.f8086k)) {
            return false;
        }
        InterfaceC1460g interfaceC1460g = this.f56104toq;
        InterfaceC1460g interfaceC1460g2 = c1471n.f56104toq;
        return interfaceC1460g != null ? interfaceC1460g.equals(interfaceC1460g2) : interfaceC1460g2 == null;
    }

    public String f7l8() {
        return this.f8086k.toString();
    }

    public int hashCode() {
        int iHashCode = this.f8086k.hashCode() * 31;
        InterfaceC1460g interfaceC1460g = this.f56104toq;
        return iHashCode + (interfaceC1460g != null ? interfaceC1460g.hashCode() : 0);
    }

    @InterfaceC7839p
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: k */
    public C1471n m6087k(String str) {
        C1471n c1471n = new C1471n(this);
        c1471n.f8086k.add(str);
        return c1471n;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: n */
    public int m6088n(String str, int i2) {
        if (m6086g(str)) {
            return 0;
        }
        if (this.f8086k.get(i2).equals("**")) {
            return (i2 != this.f8086k.size() - 1 && this.f8086k.get(i2 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: p */
    public C1471n m6089p(InterfaceC1460g interfaceC1460g) {
        C1471n c1471n = new C1471n(this);
        c1471n.f56104toq = interfaceC1460g;
        return c1471n;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: q */
    public InterfaceC1460g m6090q() {
        return this.f56104toq;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: s */
    public boolean m6091s(String str, int i2) {
        return "__container".equals(str) || i2 < this.f8086k.size() - 1 || this.f8086k.get(i2).equals("**");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f8086k);
        sb.append(",resolved=");
        sb.append(this.f56104toq != null);
        sb.append('}');
        return sb.toString();
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: y */
    public boolean m6092y(String str, int i2) {
        if (m6086g(str)) {
            return true;
        }
        if (i2 >= this.f8086k.size()) {
            return false;
        }
        return this.f8086k.get(i2).equals(str) || this.f8086k.get(i2).equals("**") || this.f8086k.get(i2).equals("*");
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public boolean zy(String str, int i2) {
        if (i2 >= this.f8086k.size()) {
            return false;
        }
        boolean z2 = i2 == this.f8086k.size() - 1;
        String str2 = this.f8086k.get(i2);
        if (!str2.equals("**")) {
            return (z2 || (i2 == this.f8086k.size() + (-2) && toq())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z2 && this.f8086k.get(i2 + 1).equals(str)) {
            return i2 == this.f8086k.size() + (-2) || (i2 == this.f8086k.size() + (-3) && toq());
        }
        if (z2) {
            return true;
        }
        int i3 = i2 + 1;
        if (i3 < this.f8086k.size() - 1) {
            return false;
        }
        return this.f8086k.get(i3).equals(str);
    }

    private C1471n(C1471n c1471n) {
        this.f8086k = new ArrayList(c1471n.f8086k);
        this.f56104toq = c1471n.f56104toq;
    }
}
