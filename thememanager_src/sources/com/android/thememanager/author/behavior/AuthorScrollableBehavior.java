package com.android.thememanager.author.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: AuthorScrollableBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AuthorScrollableBehavior extends CoordinatorLayout.zy<ViewPager> {
    public AuthorScrollableBehavior(@InterfaceC7395n Context context, @InterfaceC7395n AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /* JADX INFO: renamed from: gvn7, reason: merged with bridge method [inline-methods] */
    public boolean mo1757s(@InterfaceC7396q CoordinatorLayout parent, @InterfaceC7396q ViewPager child, @InterfaceC7396q View dependency) {
        d2ok.m23075h(parent, "parent");
        d2ok.m23075h(child, "child");
        d2ok.m23075h(dependency, "dependency");
        float height = dependency.getHeight() + dependency.getTranslationY();
        int measuredHeight = parent.getMeasuredHeight() - ((int) height);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        d2ok.n7h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        child.setTranslationY(height);
        if (measuredHeight == marginLayoutParams.height) {
            return false;
        }
        marginLayoutParams.height = measuredHeight - marginLayoutParams.topMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /* JADX INFO: renamed from: jp0y, reason: merged with bridge method [inline-methods] */
    public boolean mo1751g(@InterfaceC7396q CoordinatorLayout parent, @InterfaceC7396q ViewPager child, @InterfaceC7396q View dependency) {
        d2ok.m23075h(parent, "parent");
        d2ok.m23075h(child, "child");
        d2ok.m23075h(dependency, "dependency");
        return dependency instanceof RelativeLayout;
    }
}
