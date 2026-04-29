package d1ts;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: OnHierarchyChangeListenerWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: k */
    private ViewGroup.OnHierarchyChangeListener f34371k;

    /* JADX INFO: renamed from: k */
    public void m22228k(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f34371k = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f34371k;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f34371k;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
