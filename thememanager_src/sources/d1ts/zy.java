package d1ts;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.view.C0690h;

/* JADX INFO: compiled from: WrapperHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {
    /* JADX INFO: renamed from: k */
    public static void m22229k(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        LayoutInflater.Factory2 factory22 = layoutInflater.getFactory2();
        if (factory22 == null && layoutInflater.getFactory() == null) {
            C0690h.m3309q(layoutInflater, factory2);
        } else {
            if (factory22 instanceof AbstractLayoutInflaterFactory2C5988k) {
                ((AbstractLayoutInflaterFactory2C5988k) layoutInflater.getFactory2()).m22227k(factory2);
                return;
            }
            if (factory2 instanceof AbstractLayoutInflaterFactory2C5988k) {
                ((AbstractLayoutInflaterFactory2C5988k) factory2).m22227k(factory22);
            }
            miuix.reflect.toq.x2(layoutInflater, miuix.reflect.toq.zy(layoutInflater.getClass().getSuperclass(), "mFactory2"), factory2);
        }
    }

    public static void toq(ViewGroup viewGroup, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        if (viewGroup != null) {
            Object qVar = miuix.reflect.toq.toq(viewGroup, miuix.reflect.toq.zy(viewGroup.getClass(), "mOnHierarchyChangeListener"));
            if (qVar instanceof toq) {
                ((toq) qVar).m22228k(onHierarchyChangeListener);
            } else {
                viewGroup.setOnHierarchyChangeListener(onHierarchyChangeListener);
            }
        }
    }
}
