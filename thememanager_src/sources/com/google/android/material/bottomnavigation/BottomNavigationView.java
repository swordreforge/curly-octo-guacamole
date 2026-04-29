package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0184b;
import androidx.core.content.C0498q;
import androidx.core.view.C0683f;
import androidx.core.view.tfm;
import com.google.android.material.internal.C4058z;
import com.google.android.material.internal.cdj;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import ij.C6095k;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
public class BottomNavigationView extends NavigationBarView {

    /* JADX INFO: renamed from: l */
    static final int f23979l = 5;

    /* JADX INFO: renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$k */
    class C3949k implements C4058z.n {
        C3949k() {
        }

        @Override // com.google.android.material.internal.C4058z.n
        @lvui
        /* JADX INFO: renamed from: k */
        public tfm mo14130k(View view, @lvui tfm tfmVar, @lvui C4058z.g gVar) {
            gVar.f24639q += tfmVar.kja0();
            boolean z2 = C0683f.m3159e(view) == 1;
            int iM3467h = tfmVar.m3467h();
            int iCdj = tfmVar.cdj();
            gVar.f24638k += z2 ? iCdj : iM3467h;
            int i2 = gVar.f67726zy;
            if (!z2) {
                iM3467h = iCdj;
            }
            gVar.f67726zy = i2 + iM3467h;
            gVar.m14629k(view);
            return tfmVar;
        }
    }

    @Deprecated
    public interface toq extends NavigationBarView.zy {
    }

    @Deprecated
    public interface zy extends NavigationBarView.InterfaceC4067q {
    }

    public BottomNavigationView(@lvui Context context) {
        this(context, null);
    }

    private void ld6() {
        C4058z.m14626q(this, new C3949k());
    }

    private boolean n7h() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    private void m14137p(@lvui Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0498q.m2252g(context, C6095k.n.f35625f));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C6095k.g.f79033yqrt)));
        addView(view);
    }

    private int qrj(int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i2;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, qrj(i3));
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: q */
    protected NavigationBarMenuView mo14138q(@lvui Context context) {
        return new BottomNavigationMenuView(context);
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.m14136i() != z2) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z2);
            getPresenter().mo355q(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@dd toq toqVar) {
        setOnItemReselectedListener(toqVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@dd zy zyVar) {
        setOnItemSelectedListener(zyVar);
    }

    public boolean x2() {
        return ((BottomNavigationMenuView) getMenuView()).m14136i();
    }

    public BottomNavigationView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.f80264py);
    }

    public BottomNavigationView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, C6095k.n7h.m7dd);
    }

    public BottomNavigationView(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        Context context2 = getContext();
        C0184b c0184bLd6 = cdj.ld6(context2, attributeSet, C6095k.kja0.cyg, i2, i3, new int[0]);
        setItemHorizontalTranslationEnabled(c0184bLd6.m547k(C6095k.kja0.ahb, true));
        int i4 = C6095k.kja0.fupf;
        if (c0184bLd6.mcp(i4)) {
            setMinimumHeight(c0184bLd6.f7l8(i4, 0));
        }
        c0184bLd6.d3();
        if (n7h()) {
            m14137p(context2);
        }
        ld6();
    }
}
