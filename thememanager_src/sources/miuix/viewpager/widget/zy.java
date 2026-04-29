package miuix.viewpager.widget;

import android.util.Pair;
import android.view.View;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: SharedElementTransformer.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy implements InterfaceC7390k {

    /* JADX INFO: renamed from: n */
    private Set<Pair<Integer, Integer>> f42315n = new HashSet();

    /* JADX INFO: renamed from: q */
    private toq f42316q;

    public zy(toq toqVar) {
        this.f42316q = toqVar;
    }

    /* JADX INFO: renamed from: g */
    private void m26793g(View view, View view2, View view3, View view4, View view5, float f2) {
        float left = view2.getLeft() - view.getLeft();
        float top = view2.getTop() - view.getTop();
        float left2 = view4.getLeft() - view3.getLeft();
        float width = view.getWidth();
        float height = view.getHeight();
        float width2 = view2.getWidth();
        float height2 = view2.getHeight();
        float f3 = width2 - width;
        float f4 = height2 - height;
        int id = view.getId();
        int id2 = view2.getId();
        if (-1.0f < f2) {
            if (f2 < 1.0f) {
                float f5 = -f2;
                float f6 = (top + (f4 / 2.0f)) * f5;
                float f7 = (left + left2 + (f3 / 2.0f)) * f5;
                if (view5.findViewById(id) != null) {
                    view.setTranslationX(f7);
                    view.setTranslationY(f6);
                    float f8 = width == 0.0f ? 1.0f : ((f3 * f5) + width) / width;
                    float f9 = height == 0.0f ? 1.0f : ((f4 * f5) + height) / height;
                    view.setScaleX(f8);
                    view.setScaleY(f9);
                }
                if (view5.findViewById(id2) != null) {
                    view2.setTranslationX(f7);
                    view2.setTranslationY(f6);
                    float f10 = width2 == 0.0f ? 1.0f : ((f3 * f5) + width2) / width2;
                    float f11 = height2 != 0.0f ? ((f4 * f5) + height2) / height2 : 1.0f;
                    view2.setScaleX(f10);
                    view2.setScaleY(f11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private void m26794y(int i2) {
        View viewM26792k;
        toq toqVar = this.f42316q;
        if (toqVar == null || (viewM26792k = toqVar.m26792k(i2)) == null) {
            return;
        }
        for (Pair<Integer, Integer> pair : this.f42315n) {
            View viewFindViewById = viewM26792k.findViewById(((Integer) pair.first).intValue());
            View viewFindViewById2 = viewM26792k.findViewById(((Integer) pair.second).intValue());
            if (viewFindViewById != null) {
                viewFindViewById.setTranslationX(0.0f);
                viewFindViewById.setTranslationY(0.0f);
                viewFindViewById.setScaleX(1.0f);
                viewFindViewById.setScaleY(1.0f);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setTranslationX(0.0f);
                viewFindViewById2.setTranslationY(0.0f);
                viewFindViewById2.setScaleX(1.0f);
                viewFindViewById2.setScaleY(1.0f);
            }
        }
    }

    public void f7l8(int i2, int i3) {
        this.f42315n.remove(new Pair(Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @Override // miuix.viewpager.widget.InterfaceC7390k
    /* JADX INFO: renamed from: k */
    public void mo26791k(int i2) {
    }

    /* JADX INFO: renamed from: n */
    public void m26795n() {
        this.f42315n.clear();
    }

    /* JADX INFO: renamed from: q */
    public void m26796q(int i2, int i3) {
        this.f42315n.add(new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @Override // miuix.viewpager.widget.InterfaceC7390k
    public void toq(int i2) {
    }

    @Override // miuix.viewpager.widget.InterfaceC7390k
    public void zy(int i2, float f2, int i3) {
        View viewFindViewById;
        View viewFindViewById2;
        int i4 = i2 + 1;
        toq toqVar = this.f42316q;
        if (toqVar == null) {
            return;
        }
        if (i4 >= toqVar.getCount()) {
            m26794y(i2);
            return;
        }
        for (Pair<Integer, Integer> pair : this.f42315n) {
            Integer num = (Integer) pair.first;
            Integer num2 = (Integer) pair.second;
            View viewM26792k = this.f42316q.m26792k(i2);
            View viewM26792k2 = this.f42316q.m26792k(i4);
            if (viewM26792k == null || viewM26792k2 == null) {
                viewFindViewById = null;
                viewFindViewById2 = null;
            } else {
                viewFindViewById2 = viewM26792k.findViewById(num.intValue());
                viewFindViewById = viewM26792k2.findViewById(num2.intValue());
                if (viewFindViewById2 == null) {
                    viewFindViewById2 = null;
                }
                if (viewFindViewById == null) {
                    viewFindViewById = null;
                }
            }
            if (viewFindViewById2 != null && viewFindViewById != null) {
                View view = viewFindViewById2;
                View view2 = viewFindViewById;
                m26793g(view, view2, viewM26792k, viewM26792k2, viewM26792k, -f2);
                m26793g(view, view2, viewM26792k, viewM26792k2, viewM26792k2, 1.0f - f2);
            }
        }
    }
}
