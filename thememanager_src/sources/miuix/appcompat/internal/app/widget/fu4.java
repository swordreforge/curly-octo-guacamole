package miuix.appcompat.internal.app.widget;

import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import miuix.appcompat.app.AbstractC6946k;
import miuix.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: ActionBarViewPagerController.java */
/* JADX INFO: loaded from: classes3.dex */
class fu4 implements AbstractC6946k.k {

    /* JADX INFO: renamed from: h */
    ViewPager f39250h;

    /* JADX INFO: renamed from: i */
    ni7 f39251i;

    /* JADX INFO: renamed from: k */
    Rect f39252k = new Rect();

    /* JADX INFO: renamed from: q */
    ArrayList<View> f39255q = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    int f39253n = -1;

    /* JADX INFO: renamed from: g */
    boolean f39249g = true;

    /* JADX INFO: renamed from: y */
    int f39257y = -1;

    /* JADX INFO: renamed from: s */
    int f39256s = -1;

    /* JADX INFO: renamed from: p */
    ViewGroup f39254p = null;

    public fu4(ViewPager viewPager, ni7 ni7Var) {
        this.f39250h = viewPager;
        this.f39251i = ni7Var;
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void d3(int i2, float f2, boolean z2, boolean z3) {
        if (f2 == 0.0f) {
            this.f39253n = i2;
            this.f39249g = true;
            ViewGroup viewGroup = this.f39254p;
            if (viewGroup != null) {
                zy(viewGroup);
            }
        }
        if (this.f39257y != i2) {
            int i3 = this.f39253n;
            if (i3 < i2) {
                this.f39253n = i2;
            } else {
                int i4 = i2 + 1;
                if (i3 > i4) {
                    this.f39253n = i4;
                }
            }
            this.f39257y = i2;
            this.f39249g = true;
            ViewGroup viewGroup2 = this.f39254p;
            if (viewGroup2 != null) {
                zy(viewGroup2);
            }
        }
        if (f2 > 0.0f) {
            if (this.f39249g) {
                this.f39249g = false;
                if (this.f39253n != i2 || i2 >= this.f39251i.mo5575n() - 1) {
                    this.f39256s = i2;
                } else {
                    this.f39256s = i2 + 1;
                }
                Fragment fragmentM25226z = this.f39251i.m25226z(this.f39256s, false);
                this.f39254p = null;
                if (fragmentM25226z != null && fragmentM25226z.getView() != null) {
                    View viewFindViewById = fragmentM25226z.getView().findViewById(R.id.list);
                    if (viewFindViewById instanceof ViewGroup) {
                        this.f39254p = (ViewGroup) viewFindViewById;
                    }
                }
            }
            if (this.f39256s == i2) {
                f2 = 1.0f - f2;
            }
            float f3 = f2;
            ViewGroup viewGroup3 = this.f39254p;
            if (viewGroup3 != null) {
                f7l8(viewGroup3, viewGroup3.getWidth(), this.f39254p.getHeight(), f3, this.f39256s != i2);
            }
        }
    }

    void f7l8(ViewGroup viewGroup, int i2, int i3, float f2, boolean z2) {
        m25220g(viewGroup, this.f39255q);
        if (this.f39255q.isEmpty()) {
            return;
        }
        int i4 = 0;
        int top = this.f39255q.get(0).getTop();
        int i5 = Integer.MAX_VALUE;
        for (View view : this.f39255q) {
            if (i5 != view.getTop()) {
                int top2 = view.getTop();
                int iM25221n = m25221n(top2 - top, i2, i3, f2);
                if (!z2) {
                    iM25221n = -iM25221n;
                }
                int i6 = iM25221n;
                i5 = top2;
                i4 = i6;
            }
            view.setTranslationX(i4);
        }
    }

    /* JADX INFO: renamed from: g */
    void m25220g(ViewGroup viewGroup, ArrayList<View> arrayList) {
        m25222q(arrayList, viewGroup);
        arrayList.clear();
        miuix.internal.util.n7h.m25960s(viewGroup, this.f39252k);
        if (this.f39252k.isEmpty()) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() != 8 || childAt.getHeight() > 0) {
                arrayList.add(childAt);
            }
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    /* JADX INFO: renamed from: k */
    public void mo6476k(int i2) {
        if (i2 == 0) {
            this.f39253n = this.f39250h.getCurrentItem();
            this.f39249g = true;
            ViewGroup viewGroup = this.f39254p;
            if (viewGroup != null) {
                zy(viewGroup);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    int m25221n(int i2, int i3, int i4, float f2) {
        float f3 = (i2 < i4 ? (i2 * i3) / i4 : i3) + ((0.1f - ((f2 * f2) / 0.9f)) * i3);
        if (f3 > 0.0f) {
            return (int) f3;
        }
        return 0;
    }

    /* JADX INFO: renamed from: q */
    void m25222q(ArrayList<View> arrayList, ViewGroup viewGroup) {
        for (View view : arrayList) {
            if (viewGroup.indexOfChild(view) == -1 && view.getTranslationX() != 0.0f) {
                view.setTranslationX(0.0f);
            }
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void toq(int i2) {
    }

    void zy(ViewGroup viewGroup) {
        m25220g(viewGroup, this.f39255q);
        if (this.f39255q.isEmpty()) {
            return;
        }
        Iterator<View> it = this.f39255q.iterator();
        while (it.hasNext()) {
            it.next().setTranslationX(0.0f);
        }
    }
}
