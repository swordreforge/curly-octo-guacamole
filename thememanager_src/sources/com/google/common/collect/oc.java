package com.google.common.collect;

import com.google.common.primitives.C4739k;
import com.google.common.primitives.C4743p;
import com.google.common.primitives.C4746s;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ComparisonChain.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class oc {

    /* JADX INFO: renamed from: k */
    private static final oc f26501k = new C4490k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final oc f68227toq = new toq(-1);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final oc f68228zy = new toq(1);

    /* JADX INFO: renamed from: com.google.common.collect.oc$k */
    /* JADX INFO: compiled from: ComparisonChain.java */
    static class C4490k extends oc {
        C4490k() {
            super(null);
        }

        @Override // com.google.common.collect.oc
        public oc f7l8(long j2, long j3) {
            return kja0(C4743p.m16685q(j2, j3));
        }

        @Override // com.google.common.collect.oc
        /* JADX INFO: renamed from: g */
        public oc mo15923g(int i2, int i3) {
            return kja0(C4746s.m16716n(i2, i3));
        }

        oc kja0(int i2) {
            return i2 < 0 ? oc.f68227toq : i2 > 0 ? oc.f68228zy : oc.f26501k;
        }

        @Override // com.google.common.collect.oc
        public oc ld6(boolean z2, boolean z3) {
            return kja0(C4739k.m16649q(z2, z3));
        }

        @Override // com.google.common.collect.oc
        /* JADX INFO: renamed from: n */
        public oc mo15924n(float f2, float f3) {
            return kja0(Float.compare(f2, f3));
        }

        @Override // com.google.common.collect.oc
        /* JADX INFO: renamed from: p */
        public <T> oc mo15925p(@NullableDecl T t2, @NullableDecl T t3, Comparator<T> comparator) {
            return kja0(comparator.compare(t2, t3));
        }

        @Override // com.google.common.collect.oc
        /* JADX INFO: renamed from: q */
        public oc mo15926q(double d2, double d4) {
            return kja0(Double.compare(d2, d4));
        }

        @Override // com.google.common.collect.oc
        public int qrj() {
            return 0;
        }

        @Override // com.google.common.collect.oc
        /* JADX INFO: renamed from: s */
        public oc mo15927s(Comparable comparable, Comparable comparable2) {
            return kja0(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.oc
        public oc x2(boolean z2, boolean z3) {
            return kja0(C4739k.m16649q(z3, z2));
        }
    }

    /* JADX INFO: compiled from: ComparisonChain.java */
    private static final class toq extends oc {

        /* JADX INFO: renamed from: q */
        final int f26502q;

        toq(int i2) {
            super(null);
            this.f26502q = i2;
        }

        @Override // com.google.common.collect.oc
        public oc f7l8(long j2, long j3) {
            return this;
        }

        @Override // com.google.common.collect.oc
        /* JADX INFO: renamed from: g */
        public oc mo15923g(int i2, int i3) {
            return this;
        }

        @Override // com.google.common.collect.oc
        public oc ld6(boolean z2, boolean z3) {
            return this;
        }

        @Override // com.google.common.collect.oc
        /* JADX INFO: renamed from: n */
        public oc mo15924n(float f2, float f3) {
            return this;
        }

        @Override // com.google.common.collect.oc
        /* JADX INFO: renamed from: p */
        public <T> oc mo15925p(@NullableDecl T t2, @NullableDecl T t3, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.oc
        /* JADX INFO: renamed from: q */
        public oc mo15926q(double d2, double d4) {
            return this;
        }

        @Override // com.google.common.collect.oc
        public int qrj() {
            return this.f26502q;
        }

        @Override // com.google.common.collect.oc
        /* JADX INFO: renamed from: s */
        public oc mo15927s(@NullableDecl Comparable comparable, @NullableDecl Comparable comparable2) {
            return this;
        }

        @Override // com.google.common.collect.oc
        public oc x2(boolean z2, boolean z3) {
            return this;
        }
    }

    /* synthetic */ oc(C4490k c4490k) {
        this();
    }

    public static oc n7h() {
        return f26501k;
    }

    public abstract oc f7l8(long j2, long j3);

    /* JADX INFO: renamed from: g */
    public abstract oc mo15923g(int i2, int i3);

    public abstract oc ld6(boolean z2, boolean z3);

    /* JADX INFO: renamed from: n */
    public abstract oc mo15924n(float f2, float f3);

    /* JADX INFO: renamed from: p */
    public abstract <T> oc mo15925p(@NullableDecl T t2, @NullableDecl T t3, Comparator<T> comparator);

    /* JADX INFO: renamed from: q */
    public abstract oc mo15926q(double d2, double d4);

    public abstract int qrj();

    /* JADX INFO: renamed from: s */
    public abstract oc mo15927s(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract oc x2(boolean z2, boolean z3);

    @Deprecated
    /* JADX INFO: renamed from: y */
    public final oc m15928y(Boolean bool, Boolean bool2) {
        return ld6(bool.booleanValue(), bool2.booleanValue());
    }

    private oc() {
    }
}
