package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import zy.hyr;

/* JADX INFO: renamed from: androidx.dynamicanimation.animation.q */
/* JADX INFO: compiled from: FloatPropertyCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0793q<T> {

    /* JADX INFO: renamed from: k */
    final String f4405k;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.q$k */
    /* JADX INFO: compiled from: FloatPropertyCompat.java */
    static class k extends AbstractC0793q<T> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ FloatProperty f51044toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, FloatProperty floatProperty) {
            super(str);
            this.f51044toq = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        public float toq(T t2) {
            return ((Float) this.f51044toq.get(t2)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.AbstractC0793q
        public void zy(T t2, float f2) {
            this.f51044toq.setValue(t2, f2);
        }
    }

    public AbstractC0793q(String str) {
        this.f4405k = str;
    }

    @hyr(24)
    /* JADX INFO: renamed from: k */
    public static <T> AbstractC0793q<T> m3812k(FloatProperty<T> floatProperty) {
        return new k(floatProperty.getName(), floatProperty);
    }

    public abstract float toq(T t2);

    public abstract void zy(T t2, float f2);
}
