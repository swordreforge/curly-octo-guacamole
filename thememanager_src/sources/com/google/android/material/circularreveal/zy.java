package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.toq;
import lh.C6775k;
import zy.dd;
import zy.lvui;
import zy.x2;

/* JADX INFO: compiled from: CircularRevealWidget.java */
/* JADX INFO: loaded from: classes2.dex */
public interface zy extends toq.InterfaceC3977k {

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.zy$n */
    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class C3979n {

        /* JADX INFO: renamed from: q */
        public static final float f24168q = Float.MAX_VALUE;

        /* JADX INFO: renamed from: k */
        public float f24169k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public float f67483toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public float f67484zy;

        /* JADX INFO: renamed from: k */
        public boolean m14253k() {
            return this.f67484zy == Float.MAX_VALUE;
        }

        public void toq(float f2, float f3, float f4) {
            this.f24169k = f2;
            this.f67483toq = f3;
            this.f67484zy = f4;
        }

        public void zy(@lvui C3979n c3979n) {
            toq(c3979n.f24169k, c3979n.f67483toq, c3979n.f67484zy);
        }

        private C3979n() {
        }

        public C3979n(float f2, float f3, float f4) {
            this.f24169k = f2;
            this.f67483toq = f3;
            this.f67484zy = f4;
        }

        public C3979n(@lvui C3979n c3979n) {
            this(c3979n.f24169k, c3979n.f67483toq, c3979n.f67484zy);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.zy$q */
    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class C3980q extends Property<zy, Integer> {

        /* JADX INFO: renamed from: k */
        public static final Property<zy, Integer> f24170k = new C3980q("circularRevealScrimColor");

        private C3980q(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer get(@lvui zy zyVar) {
            return Integer.valueOf(zyVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(@lvui zy zyVar, @lvui Integer num) {
            zyVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class toq implements TypeEvaluator<C3979n> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final TypeEvaluator<C3979n> f67485toq = new toq();

        /* JADX INFO: renamed from: k */
        private final C3979n f24171k = new C3979n();

        @Override // android.animation.TypeEvaluator
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C3979n evaluate(float f2, @lvui C3979n c3979n, @lvui C3979n c3979n2) {
            this.f24171k.toq(C6775k.m24715g(c3979n.f24169k, c3979n2.f24169k, f2), C6775k.m24715g(c3979n.f67483toq, c3979n2.f67483toq, f2), C6775k.m24715g(c3979n.f67484zy, c3979n2.f67484zy, f2));
            return this.f24171k;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class C7974zy extends Property<zy, C3979n> {

        /* JADX INFO: renamed from: k */
        public static final Property<zy, C3979n> f24172k = new C7974zy("circularReveal");

        private C7974zy(String str) {
            super(C3979n.class, str);
        }

        @Override // android.util.Property
        @dd
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C3979n get(@lvui zy zyVar) {
            return zyVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(@lvui zy zyVar, @dd C3979n c3979n) {
            zyVar.setRevealInfo(c3979n);
        }
    }

    void draw(Canvas canvas);

    @dd
    Drawable getCircularRevealOverlayDrawable();

    @x2
    int getCircularRevealScrimColor();

    @dd
    C3979n getRevealInfo();

    boolean isOpaque();

    /* JADX INFO: renamed from: k */
    void mo14242k();

    void setCircularRevealOverlayDrawable(@dd Drawable drawable);

    void setCircularRevealScrimColor(@x2 int i2);

    void setRevealInfo(@dd C3979n c3979n);

    void toq();
}
