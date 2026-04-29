package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.core.util.n7h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import zy.InterfaceC7833l;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public final class MarginPageTransformer implements ViewPager2.PageTransformer {
    private final int mMarginPx;

    public MarginPageTransformer(@InterfaceC7833l int i2) {
        n7h.m2977p(i2, "Margin must be non-negative");
        this.mMarginPx = i2;
    }

    private ViewPager2 requireViewPager(@lvui View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@lvui View view, float f2) {
        ViewPager2 viewPager2RequireViewPager = requireViewPager(view);
        float f3 = this.mMarginPx * f2;
        if (viewPager2RequireViewPager.getOrientation() != 0) {
            view.setTranslationY(f3);
            return;
        }
        if (viewPager2RequireViewPager.isRtl()) {
            f3 = -f3;
        }
        view.setTranslationX(f3);
    }
}
