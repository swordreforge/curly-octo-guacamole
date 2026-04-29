package d1ts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: d1ts.k */
/* JADX INFO: compiled from: Factory2Wrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractLayoutInflaterFactory2C5988k implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: k */
    private LayoutInflater.Factory2 f34370k;

    /* JADX INFO: renamed from: k */
    public void m22227k(LayoutInflater.Factory2 factory2) {
        this.f34370k = factory2;
    }

    @Override // android.view.LayoutInflater.Factory2
    @dd
    public View onCreateView(@dd View view, @lvui String str, @lvui Context context, @lvui AttributeSet attributeSet) {
        LayoutInflater.Factory2 factory2 = this.f34370k;
        if (factory2 != null) {
            return factory2.onCreateView(view, str, context, attributeSet);
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    @dd
    public View onCreateView(@lvui String str, @lvui Context context, @lvui AttributeSet attributeSet) {
        LayoutInflater.Factory2 factory2 = this.f34370k;
        if (factory2 != null) {
            return factory2.onCreateView(str, context, attributeSet);
        }
        return null;
    }
}
