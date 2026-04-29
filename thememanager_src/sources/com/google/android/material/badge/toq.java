package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ki;
import ij.C6095k;
import zy.InterfaceC7843t;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: BadgeUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.material.badge.zy
public class toq {

    /* JADX INFO: renamed from: k */
    public static final boolean f23919k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f67358toq = "BadgeUtils";

    /* JADX INFO: renamed from: com.google.android.material.badge.toq$k */
    /* JADX INFO: compiled from: BadgeUtils.java */
    class RunnableC3934k implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ FrameLayout f23920g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Toolbar f23921k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C3933k f23922n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f23923q;

        RunnableC3934k(Toolbar toolbar, int i2, C3933k c3933k, FrameLayout frameLayout) {
            this.f23921k = toolbar;
            this.f23923q = i2;
            this.f23922n = c3933k;
            this.f23920g = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuItemView actionMenuItemViewM14553k = ki.m14553k(this.f23921k, this.f23923q);
            if (actionMenuItemViewM14553k != null) {
                toq.n7h(this.f23922n, this.f23921k.getResources());
                toq.m14105q(this.f23922n, actionMenuItemViewM14553k, this.f23920g);
                toq.toq(this.f23922n, actionMenuItemViewM14553k);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.badge.toq$q */
    /* JADX INFO: compiled from: BadgeUtils.java */
    class C3935q extends C0701k {
        C3935q(View.AccessibilityDelegate accessibilityDelegate) {
            super(accessibilityDelegate);
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.yqrt(null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.badge.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BadgeUtils.java */
    class C7971toq extends C0701k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C3933k f23924k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7971toq(View.AccessibilityDelegate accessibilityDelegate, C3933k c3933k) {
            super(accessibilityDelegate);
            this.f23924k = c3933k;
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.yqrt(this.f23924k.kja0());
        }
    }

    /* JADX INFO: compiled from: BadgeUtils.java */
    class zy extends C0701k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C3933k f23925k;

        zy(C3933k c3933k) {
            this.f23925k = c3933k;
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.yqrt(this.f23925k.kja0());
        }
    }

    private toq() {
    }

    @lvui
    public static SparseArray<C3933k> f7l8(Context context, @lvui ParcelableSparseArray parcelableSparseArray) {
        SparseArray<C3933k> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i2 = 0; i2 < parcelableSparseArray.size(); i2++) {
            int iKeyAt = parcelableSparseArray.keyAt(i2);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i2);
            if (state == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(iKeyAt, C3933k.m14082g(context, state));
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: g */
    public static void m14101g(@lvui C3933k c3933k, @lvui Toolbar toolbar, @InterfaceC7843t int i2, @dd FrameLayout frameLayout) {
        toolbar.post(new RunnableC3934k(toolbar, i2, c3933k, frameLayout));
    }

    public static void kja0(@lvui Rect rect, float f2, float f3, float f4, float f5) {
        rect.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
    }

    public static void ld6(@dd C3933k c3933k, @lvui Toolbar toolbar, @InterfaceC7843t int i2) {
        if (c3933k == null) {
            return;
        }
        ActionMenuItemView actionMenuItemViewM14553k = ki.m14553k(toolbar, i2);
        if (actionMenuItemViewM14553k != null) {
            x2(c3933k);
            m14104p(c3933k, actionMenuItemViewM14553k);
            m14106s(actionMenuItemViewM14553k);
        } else {
            Log.w(f67358toq, "Trying to remove badge from a null menuItemView: " + i2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m14103n(@lvui C3933k c3933k, @lvui Toolbar toolbar, @InterfaceC7843t int i2) {
        m14101g(c3933k, toolbar, i2, null);
    }

    @yz
    static void n7h(C3933k c3933k, Resources resources) {
        c3933k.eqxt(resources.getDimensionPixelOffset(C6095k.g.tvn8));
        c3933k.d2ok(resources.getDimensionPixelOffset(C6095k.g.ze));
    }

    /* JADX INFO: renamed from: p */
    public static void m14104p(@dd C3933k c3933k, @lvui View view) {
        if (c3933k == null) {
            return;
        }
        if (f23919k || c3933k.m14089h() != null) {
            c3933k.m14089h().setForeground(null);
        } else {
            view.getOverlay().remove(c3933k);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m14105q(@lvui C3933k c3933k, @lvui View view, @dd FrameLayout frameLayout) {
        qrj(c3933k, view, frameLayout);
        if (c3933k.m14089h() != null) {
            c3933k.m14089h().setForeground(c3933k);
        } else {
            if (f23919k) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(c3933k);
        }
    }

    public static void qrj(@lvui C3933k c3933k, @lvui View view, @dd FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c3933k.setBounds(rect);
        c3933k.m14086b(view, frameLayout);
    }

    /* JADX INFO: renamed from: s */
    private static void m14106s(@lvui View view) {
        if (Build.VERSION.SDK_INT < 29 || !C0683f.fnq8(view)) {
            C0683f.zwy(view, null);
        } else {
            C0683f.zwy(view, new C3935q(view.getAccessibilityDelegate()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toq(@lvui C3933k c3933k, @lvui View view) {
        if (Build.VERSION.SDK_INT < 29 || !C0683f.fnq8(view)) {
            C0683f.zwy(view, new zy(c3933k));
        } else {
            C0683f.zwy(view, new C7971toq(view.getAccessibilityDelegate(), c3933k));
        }
    }

    @yz
    static void x2(C3933k c3933k) {
        c3933k.eqxt(0);
        c3933k.d2ok(0);
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public static ParcelableSparseArray m14107y(@lvui SparseArray<C3933k> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            C3933k c3933kValueAt = sparseArray.valueAt(i2);
            if (c3933kValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(iKeyAt, c3933kValueAt.zurt());
        }
        return parcelableSparseArray;
    }

    public static void zy(@lvui C3933k c3933k, @lvui View view) {
        m14105q(c3933k, view, null);
    }
}
