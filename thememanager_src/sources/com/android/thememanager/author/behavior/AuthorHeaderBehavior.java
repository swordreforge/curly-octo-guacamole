package com.android.thememanager.author.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.thememanager.R;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: AuthorHeaderBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AuthorHeaderBehavior extends CoordinatorLayout.zy<RelativeLayout> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private LinearLayout f9570k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private View f57394toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f57395zy;

    public AuthorHeaderBehavior(@InterfaceC7395n Context context, @InterfaceC7395n AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /* JADX INFO: renamed from: gvn7, reason: merged with bridge method [inline-methods] */
    public boolean mo1758t(@InterfaceC7396q CoordinatorLayout coordinatorLayout, @InterfaceC7396q RelativeLayout child, @InterfaceC7396q View directTargetChild, @InterfaceC7396q View target, int i2, int i3) {
        int height;
        int i4;
        d2ok.m23075h(coordinatorLayout, "coordinatorLayout");
        d2ok.m23075h(child, "child");
        d2ok.m23075h(directTargetChild, "directTargetChild");
        d2ok.m23075h(target, "target");
        LinearLayout linearLayout = (LinearLayout) coordinatorLayout.findViewById(R.id.toolBar);
        this.f9570k = linearLayout;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            i4 = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : 0;
            height = linearLayout.getHeight();
        } else {
            height = 0;
            i4 = 0;
        }
        View viewFindViewById = child.findViewById(R.id.nav_parent);
        this.f57394toq = viewFindViewById;
        this.f57395zy = (-child.getHeight()) + height + i4 + (viewFindViewById != null ? viewFindViewById.getHeight() : 0);
        boolean z2 = i2 == 2;
        Log.i("AuthorHeaderBehavior", "onStartNestedScroll vertical:" + z2);
        return z2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /* JADX INFO: renamed from: jp0y, reason: merged with bridge method [inline-methods] */
    public void ki(@InterfaceC7396q CoordinatorLayout coordinatorLayout, @InterfaceC7396q RelativeLayout child, @InterfaceC7396q View target, int i2, int i3, @InterfaceC7396q int[] consumed, int i4) {
        d2ok.m23075h(coordinatorLayout, "coordinatorLayout");
        d2ok.m23075h(child, "child");
        d2ok.m23075h(target, "target");
        d2ok.m23075h(consumed, "consumed");
        int translationY = (int) child.getTranslationY();
        int i5 = i3 + translationY;
        int i6 = this.f57395zy;
        if (i5 > i6 && i5 < 0) {
            consumed[1] = i3;
        } else if (i5 >= i6 && i5 >= 0) {
            consumed[1] = i3 - i5;
        } else {
            consumed[1] = i6 - translationY;
        }
        child.setTranslationY(child.getTranslationY() + consumed[1]);
        Log.i("AuthorHeaderBehavior", "onNestedPreScroll dy: " + i3 + " childCurrentTransY = " + translationY + " translationY: " + child.getTranslationY() + " consumedY = " + consumed[1]);
    }
}
