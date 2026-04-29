package miuix.overscroller.internal.dynamicanimation.animation;

import android.util.FloatProperty;

/* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.q */
/* JADX INFO: compiled from: FloatPropertyCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7217q<T> {

    /* JADX INFO: renamed from: k */
    final String f40732k;

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.q$k */
    /* JADX INFO: compiled from: FloatPropertyCompat.java */
    class k extends AbstractC7217q<T> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ FloatProperty f87893toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, FloatProperty floatProperty) {
            super(str);
            this.f87893toq = floatProperty;
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        public float toq(T t2) {
            return ((Float) this.f87893toq.get(t2)).floatValue();
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.AbstractC7217q
        public void zy(T t2, float f2) {
            this.f87893toq.setValue(t2, f2);
        }
    }

    public AbstractC7217q(String str) {
        this.f40732k = str;
    }

    /* JADX INFO: renamed from: k */
    public static <T> AbstractC7217q<T> m26195k(FloatProperty<T> floatProperty) {
        return new k(floatProperty.getName(), floatProperty);
    }

    public abstract float toq(T t2);

    public abstract void zy(T t2, float f2);
}
