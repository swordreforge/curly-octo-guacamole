package com.bumptech.glide.util;

/* JADX INFO: renamed from: com.bumptech.glide.util.y */
/* JADX INFO: compiled from: GlideSuppliers.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3209y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.bumptech.glide.util.y$k */
    /* JADX INFO: compiled from: GlideSuppliers.java */
    class k<T> implements toq<T> {

        /* JADX INFO: renamed from: k */
        private volatile T f19100k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ toq f63090toq;

        k(toq toqVar) {
            this.f63090toq = toqVar;
        }

        @Override // com.bumptech.glide.util.C3209y.toq
        public T get() {
            if (this.f19100k == null) {
                synchronized (this) {
                    if (this.f19100k == null) {
                        this.f19100k = (T) qrj.m11262q(this.f63090toq.get());
                    }
                }
            }
            return this.f19100k;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.y$toq */
    /* JADX INFO: compiled from: GlideSuppliers.java */
    public interface toq<T> {
        T get();
    }

    private C3209y() {
    }

    /* JADX INFO: renamed from: k */
    public static <T> toq<T> m11265k(toq<T> toqVar) {
        return new k(toqVar);
    }
}
