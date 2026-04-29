package com.google.common.collect;

import com.google.common.base.C4280z;
import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: GeneralRange.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class zsr0<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient zsr0<T> f26784k;
    private final fu4 lowerBoundType;

    @NullableDecl
    private final T lowerEndpoint;
    private final fu4 upperBoundType;

    @NullableDecl
    private final T upperEndpoint;

    /* JADX WARN: Multi-variable type inference failed */
    private zsr0(Comparator<? super T> comparator, boolean z2, @NullableDecl T t2, fu4 fu4Var, boolean z3, @NullableDecl T t3, fu4 fu4Var2) {
        this.comparator = (Comparator) com.google.common.base.jk.a9(comparator);
        this.hasLowerBound = z2;
        this.hasUpperBound = z3;
        this.lowerEndpoint = t2;
        this.lowerBoundType = (fu4) com.google.common.base.jk.a9(fu4Var);
        this.upperEndpoint = t3;
        this.upperBoundType = (fu4) com.google.common.base.jk.a9(fu4Var2);
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z3) {
            comparator.compare(t3, t3);
        }
        if (z2 && z3) {
            int iCompare = comparator.compare(t2, t3);
            com.google.common.base.jk.m15391z(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t2, t3);
            if (iCompare == 0) {
                fu4 fu4Var3 = fu4.OPEN;
                com.google.common.base.jk.m15383q((fu4Var != fu4Var3) | (fu4Var2 != fu4Var3));
            }
        }
    }

    static <T> zsr0<T> all(Comparator<? super T> comparator) {
        fu4 fu4Var = fu4.OPEN;
        return new zsr0<>(comparator, false, null, fu4Var, false, null, fu4Var);
    }

    static <T> zsr0<T> downTo(Comparator<? super T> comparator, @NullableDecl T t2, fu4 fu4Var) {
        return new zsr0<>(comparator, true, t2, fu4Var, false, null, fu4.OPEN);
    }

    static <T extends Comparable> zsr0<T> from(ps<T> psVar) {
        return new zsr0<>(kx3.natural(), psVar.hasLowerBound(), psVar.hasLowerBound() ? psVar.lowerEndpoint() : null, psVar.hasLowerBound() ? psVar.lowerBoundType() : fu4.OPEN, psVar.hasUpperBound(), psVar.hasUpperBound() ? psVar.upperEndpoint() : null, psVar.hasUpperBound() ? psVar.upperBoundType() : fu4.OPEN);
    }

    static <T> zsr0<T> range(Comparator<? super T> comparator, @NullableDecl T t2, fu4 fu4Var, @NullableDecl T t3, fu4 fu4Var2) {
        return new zsr0<>(comparator, true, t2, fu4Var, true, t3, fu4Var2);
    }

    static <T> zsr0<T> upTo(Comparator<? super T> comparator, @NullableDecl T t2, fu4 fu4Var) {
        return new zsr0<>(comparator, false, null, fu4.OPEN, true, t2, fu4Var);
    }

    Comparator<? super T> comparator() {
        return this.comparator;
    }

    boolean contains(@NullableDecl T t2) {
        return (tooLow(t2) || tooHigh(t2)) ? false : true;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof zsr0)) {
            return false;
        }
        zsr0 zsr0Var = (zsr0) obj;
        return this.comparator.equals(zsr0Var.comparator) && this.hasLowerBound == zsr0Var.hasLowerBound && this.hasUpperBound == zsr0Var.hasUpperBound && getLowerBoundType().equals(zsr0Var.getLowerBoundType()) && getUpperBoundType().equals(zsr0Var.getUpperBoundType()) && C4280z.m15455k(getLowerEndpoint(), zsr0Var.getLowerEndpoint()) && C4280z.m15455k(getUpperEndpoint(), zsr0Var.getUpperEndpoint());
    }

    fu4 getLowerBoundType() {
        return this.lowerBoundType;
    }

    T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    fu4 getUpperBoundType() {
        return this.upperBoundType;
    }

    T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    public int hashCode() {
        return C4280z.toq(this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType());
    }

    zsr0<T> intersect(zsr0<T> zsr0Var) {
        int iCompare;
        int iCompare2;
        T t2;
        fu4 fu4Var;
        fu4 fu4Var2;
        int iCompare3;
        fu4 fu4Var3;
        com.google.common.base.jk.a9(zsr0Var);
        com.google.common.base.jk.m15383q(this.comparator.equals(zsr0Var.comparator));
        boolean z2 = this.hasLowerBound;
        T lowerEndpoint = getLowerEndpoint();
        fu4 lowerBoundType = getLowerBoundType();
        if (!hasLowerBound()) {
            z2 = zsr0Var.hasLowerBound;
            lowerEndpoint = zsr0Var.getLowerEndpoint();
            lowerBoundType = zsr0Var.getLowerBoundType();
        } else if (zsr0Var.hasLowerBound() && ((iCompare = this.comparator.compare(getLowerEndpoint(), zsr0Var.getLowerEndpoint())) < 0 || (iCompare == 0 && zsr0Var.getLowerBoundType() == fu4.OPEN))) {
            lowerEndpoint = zsr0Var.getLowerEndpoint();
            lowerBoundType = zsr0Var.getLowerBoundType();
        }
        boolean z3 = z2;
        boolean z5 = this.hasUpperBound;
        T upperEndpoint = getUpperEndpoint();
        fu4 upperBoundType = getUpperBoundType();
        if (!hasUpperBound()) {
            z5 = zsr0Var.hasUpperBound;
            upperEndpoint = zsr0Var.getUpperEndpoint();
            upperBoundType = zsr0Var.getUpperBoundType();
        } else if (zsr0Var.hasUpperBound() && ((iCompare2 = this.comparator.compare(getUpperEndpoint(), zsr0Var.getUpperEndpoint())) > 0 || (iCompare2 == 0 && zsr0Var.getUpperBoundType() == fu4.OPEN))) {
            upperEndpoint = zsr0Var.getUpperEndpoint();
            upperBoundType = zsr0Var.getUpperBoundType();
        }
        boolean z6 = z5;
        T t3 = upperEndpoint;
        if (z3 && z6 && ((iCompare3 = this.comparator.compare(lowerEndpoint, t3)) > 0 || (iCompare3 == 0 && lowerBoundType == (fu4Var3 = fu4.OPEN) && upperBoundType == fu4Var3))) {
            fu4Var = fu4.OPEN;
            fu4Var2 = fu4.CLOSED;
            t2 = t3;
        } else {
            t2 = lowerEndpoint;
            fu4Var = lowerBoundType;
            fu4Var2 = upperBoundType;
        }
        return new zsr0<>(this.comparator, z3, t2, fu4Var, z6, t3, fu4Var2);
    }

    boolean isEmpty() {
        return (hasUpperBound() && tooLow(getUpperEndpoint())) || (hasLowerBound() && tooHigh(getLowerEndpoint()));
    }

    zsr0<T> reverse() {
        zsr0<T> zsr0Var = this.f26784k;
        if (zsr0Var != null) {
            return zsr0Var;
        }
        zsr0<T> zsr0Var2 = new zsr0<>(kx3.from(this.comparator).reverse(), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
        zsr0Var2.f26784k = this;
        this.f26784k = zsr0Var2;
        return zsr0Var2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.comparator);
        sb.append(":");
        fu4 fu4Var = this.lowerBoundType;
        fu4 fu4Var2 = fu4.CLOSED;
        sb.append(fu4Var == fu4Var2 ? '[' : '(');
        sb.append(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        sb.append(',');
        sb.append(this.hasUpperBound ? this.upperEndpoint : "∞");
        sb.append(this.upperBoundType == fu4Var2 ? ']' : ')');
        return sb.toString();
    }

    boolean tooHigh(@NullableDecl T t2) {
        if (!hasUpperBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t2, getUpperEndpoint());
        return ((iCompare == 0) & (getUpperBoundType() == fu4.OPEN)) | (iCompare > 0);
    }

    boolean tooLow(@NullableDecl T t2) {
        if (!hasLowerBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t2, getLowerEndpoint());
        return ((iCompare == 0) & (getLowerBoundType() == fu4.OPEN)) | (iCompare < 0);
    }
}
