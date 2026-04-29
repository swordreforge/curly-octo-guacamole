package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0683f;
import com.google.android.material.animation.C3912p;
import com.google.android.material.animation.C3915y;
import com.google.android.material.transformation.FabTransformationBehavior;
import ij.C6095k;
import java.util.HashMap;
import java.util.Map;
import zy.InterfaceC7842s;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private Map<View, Integer> f67978x2;

    public FabTransformationSheetBehavior() {
    }

    private void bf2(@lvui View view, boolean z2) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                this.f67978x2 = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f7l8) && (((CoordinatorLayout.f7l8) childAt.getLayoutParams()).m1740g() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z3) {
                    if (z2) {
                        this.f67978x2.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        C0683f.o05(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f67978x2;
                        if (map != null && map.containsKey(childAt)) {
                            C0683f.o05(childAt, this.f67978x2.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z2) {
                return;
            }
            this.f67978x2 = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @InterfaceC7842s
    protected boolean eqxt(@lvui View view, @lvui View view2, boolean z2, boolean z3) {
        bf2(view2, z2);
        return super.eqxt(view, view2, z2, z3);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @lvui
    protected FabTransformationBehavior.C4186n y9n(Context context, boolean z2) {
        int i2 = z2 ? C6095k.toq.f79921o1t : C6095k.toq.f35730z;
        FabTransformationBehavior.C4186n c4186n = new FabTransformationBehavior.C4186n();
        c4186n.f25420k = C3915y.m13992q(context, i2);
        c4186n.f67975toq = new C3912p(17, 0.0f, 0.0f);
        return c4186n;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
