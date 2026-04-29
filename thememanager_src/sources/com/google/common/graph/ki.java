package com.google.common.graph;

import com.google.common.base.C4280z;
import com.google.common.base.fu4;
import com.google.common.collect.kx3;
import com.google.common.collect.vy;
import com.google.errorprone.annotations.Immutable;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ElementOrder.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@InterfaceC7731k
public final class ki<T> {

    /* JADX INFO: renamed from: k */
    private final toq f26893k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @NullableDecl
    private final Comparator<T> f68270toq;

    /* JADX INFO: renamed from: com.google.common.graph.ki$k */
    /* JADX INFO: compiled from: ElementOrder.java */
    static /* synthetic */ class C4628k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f26894k;

        static {
            int[] iArr = new int[toq.values().length];
            f26894k = iArr;
            try {
                iArr[toq.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26894k[toq.INSERTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26894k[toq.SORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: ElementOrder.java */
    public enum toq {
        UNORDERED,
        INSERTION,
        SORTED
    }

    private ki(toq toqVar, @NullableDecl Comparator<T> comparator) {
        this.f26893k = (toq) com.google.common.base.jk.a9(toqVar);
        this.f68270toq = comparator;
        com.google.common.base.jk.yz((toqVar == toq.SORTED) == (comparator != null));
    }

    /* JADX INFO: renamed from: g */
    public static <S> ki<S> m16245g(Comparator<S> comparator) {
        return new ki<>(toq.SORTED, comparator);
    }

    /* JADX INFO: renamed from: n */
    public static <S extends Comparable<? super S>> ki<S> m16246n() {
        return new ki<>(toq.SORTED, kx3.natural());
    }

    /* JADX INFO: renamed from: q */
    public static <S> ki<S> m16247q() {
        return new ki<>(toq.INSERTION, null);
    }

    /* JADX INFO: renamed from: y */
    public static <S> ki<S> m16248y() {
        return new ki<>(toq.UNORDERED, null);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ki)) {
            return false;
        }
        ki kiVar = (ki) obj;
        return this.f26893k == kiVar.f26893k && C4280z.m15455k(this.f68270toq, kiVar.f68270toq);
    }

    public toq f7l8() {
        return this.f26893k;
    }

    public int hashCode() {
        return C4280z.toq(this.f26893k, this.f68270toq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    <T1 extends T> ki<T1> m16249k() {
        return this;
    }

    public String toString() {
        fu4.toq toqVarM15356g = com.google.common.base.fu4.zy(this).m15356g("type", this.f26893k);
        Comparator<T> comparator = this.f68270toq;
        if (comparator != null) {
            toqVarM15356g.m15356g("comparator", comparator);
        }
        return toqVarM15356g.toString();
    }

    public Comparator<T> toq() {
        Comparator<T> comparator = this.f68270toq;
        if (comparator != null) {
            return comparator;
        }
        throw new UnsupportedOperationException("This ordering does not define a comparator.");
    }

    <K extends T, V> Map<K, V> zy(int i2) {
        int i3 = C4628k.f26894k[this.f26893k.ordinal()];
        if (i3 == 1) {
            return vy.nn86(i2);
        }
        if (i3 == 2) {
            return vy.m16020m(i2);
        }
        if (i3 == 3) {
            return vy.yz(toq());
        }
        throw new AssertionError();
    }
}
