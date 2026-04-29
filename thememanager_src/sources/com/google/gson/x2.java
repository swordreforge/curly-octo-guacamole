package com.google.gson;

import com.google.gson.stream.C4926q;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: JsonElement.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x2 {
    public short cdj() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    @Deprecated
    public char f7l8() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean fn3e() {
        return this instanceof kja0;
    }

    /* JADX INFO: renamed from: g */
    public byte mo17212g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: h */
    public Number mo17213h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: i */
    public boolean m17235i() {
        return this instanceof n7h;
    }

    /* JADX INFO: renamed from: k */
    public abstract x2 mo17214k();

    public String ki() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long kja0() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public C4923s ld6() {
        if (t8r()) {
            return (C4923s) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* JADX INFO: renamed from: n */
    public boolean mo17215n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public ki n7h() {
        if (zurt()) {
            return (ki) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* JADX INFO: renamed from: p */
    public int mo17216p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public kja0 qrj() {
        if (fn3e()) {
            return (kja0) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* JADX INFO: renamed from: s */
    public float mo17217s() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean t8r() {
        return this instanceof C4923s;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C4926q c4926q = new C4926q(stringWriter);
            c4926q.nmn5(true);
            com.google.gson.internal.n7h.toq(this, c4926q);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public BigDecimal toq() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public n7h x2() {
        if (m17235i()) {
            return (n7h) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    /* JADX INFO: renamed from: y */
    public double mo17218y() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean zurt() {
        return this instanceof ki;
    }

    public BigInteger zy() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }
}
