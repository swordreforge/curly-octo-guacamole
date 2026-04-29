package com.android.thememanager.util;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import kotlin.jvm.internal.i1;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ViewExtension.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class bek6 {
    public static final void f7l8(@InterfaceC7396q View view) {
        kotlin.jvm.internal.d2ok.m23075h(view, "<this>");
        if (view.getVisibility() != 4) {
            view.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m9613g(@InterfaceC7396q View view) {
        kotlin.jvm.internal.d2ok.m23075h(view, "<this>");
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ld6(i1.f7l8 lastClickTime, int i2, cyoe.x2 clickAction, View this_setPreventShakeOnClickListener, View view) {
        kotlin.jvm.internal.d2ok.m23075h(lastClickTime, "$lastClickTime");
        kotlin.jvm.internal.d2ok.m23075h(clickAction, "$clickAction");
        kotlin.jvm.internal.d2ok.m23075h(this_setPreventShakeOnClickListener, "$this_setPreventShakeOnClickListener");
        if (SystemClock.uptimeMillis() - lastClickTime.element >= i2) {
            lastClickTime.element = SystemClock.uptimeMillis();
            clickAction.invoke(Integer.valueOf(this_setPreventShakeOnClickListener.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m9615n(View this_expandBtnClickRect, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(this_expandBtnClickRect, "$this_expandBtnClickRect");
        Rect rect = new Rect();
        this_expandBtnClickRect.getHitRect(rect);
        rect.top -= i2;
        rect.bottom += i2;
        rect.left -= i3;
        rect.right += i3;
        Object parent = this_expandBtnClickRect.getParent();
        if (parent instanceof View) {
            ((View) parent).setTouchDelegate(new TouchDelegate(rect, this_expandBtnClickRect));
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m9616p(View view, int i2, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 1000;
        }
        m9618s(view, i2, x2Var);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m9617q(View view, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 40;
        }
        if ((i4 & 2) != 0) {
            i3 = 50;
        }
        zy(view, i2, i3);
    }

    /* JADX INFO: renamed from: s */
    public static final void m9618s(@InterfaceC7396q final View view, final int i2, @InterfaceC7396q final cyoe.x2<? super Integer, kotlin.was> clickAction) {
        kotlin.jvm.internal.d2ok.m23075h(view, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(clickAction, "clickAction");
        final i1.f7l8 f7l8Var = new i1.f7l8();
        view.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.util.ktq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bek6.ld6(f7l8Var, i2, clickAction, view, view2);
            }
        });
    }

    public static final void x2(@InterfaceC7396q View view) {
        kotlin.jvm.internal.d2ok.m23075h(view, "<this>");
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m9619y(@InterfaceC7396q View view, @InterfaceC7396q MotionEvent event) {
        kotlin.jvm.internal.d2ok.m23075h(view, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(event, "event");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int width = view.getWidth() + i2;
        int i3 = iArr[1];
        return ((float) i2) <= event.getRawX() && event.getRawX() <= ((float) width) && ((float) i3) <= event.getRawY() && event.getRawY() <= ((float) (view.getHeight() + i3));
    }

    public static final void zy(@InterfaceC7396q final View view, final int i2, final int i3) {
        kotlin.jvm.internal.d2ok.m23075h(view, "<this>");
        view.post(new Runnable() { // from class: com.android.thememanager.util.b3e
            @Override // java.lang.Runnable
            public final void run() {
                bek6.m9615n(view, i2, i3);
            }
        });
    }
}
