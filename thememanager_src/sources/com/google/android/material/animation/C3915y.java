package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.collection.qrj;
import java.util.ArrayList;
import java.util.List;
import zy.InterfaceC7831j;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.animation.y */
/* JADX INFO: compiled from: MotionSpec.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3915y {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f67319zy = "MotionSpec";

    /* JADX INFO: renamed from: k */
    private final qrj<String, C3914s> f23780k = new qrj<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final qrj<String, PropertyValuesHolder[]> f67320toq = new qrj<>();

    /* JADX INFO: renamed from: k */
    private static void m13990k(@lvui C3915y c3915y, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c3915y.x2(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c3915y.qrj(objectAnimator.getPropertyName(), C3914s.toq(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    @lvui
    /* JADX INFO: renamed from: n */
    private static C3915y m13991n(@lvui List<Animator> list) {
        C3915y c3915y = new C3915y();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            m13990k(c3915y, list.get(i2));
        }
        return c3915y;
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static C3915y m13992q(@lvui Context context, @zy.toq int i2) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m13991n(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m13991n(arrayList);
        } catch (Exception e2) {
            Log.w(f67319zy, "Can't load animation resource ID #0x" + Integer.toHexString(i2), e2);
            return null;
        }
    }

    @lvui
    private PropertyValuesHolder[] toq(@lvui PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i2 = 0; i2 < propertyValuesHolderArr.length; i2++) {
            propertyValuesHolderArr2[i2] = propertyValuesHolderArr[i2].clone();
        }
        return propertyValuesHolderArr2;
    }

    @dd
    public static C3915y zy(@lvui Context context, @lvui TypedArray typedArray, @InterfaceC7831j int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return m13992q(context, resourceId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3915y) {
            return this.f23780k.equals(((C3915y) obj).f23780k);
        }
        return false;
    }

    @lvui
    public PropertyValuesHolder[] f7l8(String str) {
        if (m13994p(str)) {
            return toq(this.f67320toq.get(str));
        }
        throw new IllegalArgumentException();
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public <T> ObjectAnimator m13993g(@lvui String str, @lvui T t2, @lvui Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t2, f7l8(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        m13996y(str).m13985k(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public int hashCode() {
        return this.f23780k.hashCode();
    }

    public boolean ld6(String str) {
        return this.f23780k.get(str) != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m13994p(String str) {
        return this.f67320toq.get(str) != null;
    }

    public void qrj(String str, @dd C3914s c3914s) {
        this.f23780k.put(str, c3914s);
    }

    /* JADX INFO: renamed from: s */
    public long m13995s() {
        int size = this.f23780k.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C3914s c3914sM873h = this.f23780k.m873h(i2);
            jMax = Math.max(jMax, c3914sM873h.zy() + c3914sM873h.m13987q());
        }
        return jMax;
    }

    @lvui
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f23780k + "}\n";
    }

    public void x2(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f67320toq.put(str, propertyValuesHolderArr);
    }

    /* JADX INFO: renamed from: y */
    public C3914s m13996y(String str) {
        if (ld6(str)) {
            return this.f23780k.get(str);
        }
        throw new IllegalArgumentException();
    }
}
