package com.bumptech.glide;

import com.bumptech.glide.AbstractC2977h;
import com.bumptech.glide.request.transition.C3188n;
import com.bumptech.glide.request.transition.C3189p;
import com.bumptech.glide.request.transition.C3191s;
import com.bumptech.glide.request.transition.C3192y;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.h */
/* JADX INFO: compiled from: TransitionOptions.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2977h<CHILD extends AbstractC2977h<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: k */
    private com.bumptech.glide.request.transition.f7l8<? super TranscodeType> f17961k = C3188n.zy();

    /* JADX INFO: renamed from: g */
    private CHILD m10609g() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2977h) {
            return com.bumptech.glide.util.kja0.m11231q(this.f17961k, ((AbstractC2977h) obj).f17961k);
        }
        return false;
    }

    public int hashCode() {
        com.bumptech.glide.request.transition.f7l8<? super TranscodeType> f7l8Var = this.f17961k;
        if (f7l8Var != null) {
            return f7l8Var.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: n */
    final com.bumptech.glide.request.transition.f7l8<? super TranscodeType> m10611n() {
        return this.f17961k;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public final CHILD m10612q() {
        return (CHILD) m10613s(C3188n.zy());
    }

    @lvui
    public final CHILD qrj(@lvui C3189p.k kVar) {
        return (CHILD) m10613s(new C3191s(kVar));
    }

    @lvui
    /* JADX INFO: renamed from: s */
    public final CHILD m10613s(@lvui com.bumptech.glide.request.transition.f7l8<? super TranscodeType> f7l8Var) {
        this.f17961k = (com.bumptech.glide.request.transition.f7l8) com.bumptech.glide.util.qrj.m11262q(f7l8Var);
        return (CHILD) m10609g();
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public final CHILD m10614y(int i2) {
        return (CHILD) m10613s(new C3192y(i2));
    }
}
