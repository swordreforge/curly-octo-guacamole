package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C0683f;
import androidx.core.view.accessibility.ki;
import com.google.android.material.internal.C4046k;
import com.google.android.material.internal.FlowLayout;
import h4b.C6070k;
import ij.C6095k;
import java.util.List;
import java.util.Set;
import zy.InterfaceC7829h;
import zy.InterfaceC7843t;
import zy.InterfaceC7845y;
import zy.cdj;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ChipGroup extends FlowLayout {

    /* JADX INFO: renamed from: t */
    private static final int f24144t = C6095k.n7h.e1;

    /* JADX INFO: renamed from: h */
    private final C4046k<Chip> f24145h;

    /* JADX INFO: renamed from: i */
    private final int f24146i;

    /* JADX INFO: renamed from: p */
    @dd
    private InterfaceC3973n f24147p;

    /* JADX INFO: renamed from: s */
    @cdj
    private int f24148s;

    /* JADX INFO: renamed from: y */
    @cdj
    private int f24149y;

    /* JADX INFO: renamed from: z */
    @lvui
    private final ViewGroupOnHierarchyChangeListenerC3971g f24150z;

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$g */
    private class ViewGroupOnHierarchyChangeListenerC3971g implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: k */
        private ViewGroup.OnHierarchyChangeListener f24151k;

        private ViewGroupOnHierarchyChangeListenerC3971g() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C0683f.jk());
                }
                ChipGroup.this.f24145h.m14547n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24151k;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f24145h.kja0((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24151k;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ ViewGroupOnHierarchyChangeListenerC3971g(ChipGroup chipGroup, C3972k c3972k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$k */
    class C3972k implements C4046k.toq {
        C3972k() {
        }

        @Override // com.google.android.material.internal.C4046k.toq
        /* JADX INFO: renamed from: k */
        public void mo14238k(Set<Integer> set) {
            if (ChipGroup.this.f24147p != null) {
                InterfaceC3973n interfaceC3973n = ChipGroup.this.f24147p;
                ChipGroup chipGroup = ChipGroup.this;
                interfaceC3973n.mo14239k(chipGroup, chipGroup.f24145h.m14548p(ChipGroup.this));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$n */
    public interface InterfaceC3973n {
        /* JADX INFO: renamed from: k */
        void mo14239k(@lvui ChipGroup chipGroup, @lvui List<Integer> list);
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.ChipGroup$q */
    @Deprecated
    public interface InterfaceC3974q {
        /* JADX INFO: renamed from: k */
        void m14240k(@lvui ChipGroup chipGroup, @InterfaceC7843t int i2);
    }

    class toq implements InterfaceC3973n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC3974q f24154k;

        toq(InterfaceC3974q interfaceC3974q) {
            this.f24154k = interfaceC3974q;
        }

        @Override // com.google.android.material.chip.ChipGroup.InterfaceC3973n
        /* JADX INFO: renamed from: k */
        public void mo14239k(@lvui ChipGroup chipGroup, @lvui List<Integer> list) {
            if (ChipGroup.this.f24145h.qrj()) {
                this.f24154k.m14240k(chipGroup, ChipGroup.this.getCheckedChipId());
            }
        }
    }

    public static class zy extends ViewGroup.MarginLayoutParams {
        public zy(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public zy(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public zy(int i2, int i3) {
            super(i2, i3);
        }

        public zy(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getChipCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                i2++;
            }
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof zy);
    }

    public void f7l8(@InterfaceC7843t int i2) {
        this.f24145h.m14545g(i2);
    }

    @Override // android.view.ViewGroup
    @lvui
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new zy(-2, -2);
    }

    @Override // android.view.ViewGroup
    @lvui
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new zy(getContext(), attributeSet);
    }

    @InterfaceC7843t
    public int getCheckedChipId() {
        return this.f24145h.ld6();
    }

    @lvui
    public List<Integer> getCheckedChipIds() {
        return this.f24145h.m14548p(this);
    }

    @cdj
    public int getChipSpacingHorizontal() {
        return this.f24149y;
    }

    @cdj
    public int getChipSpacingVertical() {
        return this.f24148s;
    }

    public boolean ld6() {
        return this.f24145h.qrj();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f24146i;
        if (i2 != -1) {
            this.f24145h.m14545g(i2);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ki.r25n(accessibilityNodeInfo).w831(ki.toq.m3069g(getRowCount(), zy() ? getChipCount() : -1, false, ld6() ? 1 : 2));
    }

    /* JADX INFO: renamed from: p */
    public boolean m14234p() {
        return this.f24145h.x2();
    }

    /* JADX INFO: renamed from: s */
    int m14235s(@dd View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                if (((Chip) getChildAt(i3)) == view) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    public void setChipSpacing(@cdj int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(@cdj int i2) {
        if (this.f24149y != i2) {
            this.f24149y = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@InterfaceC7829h int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(@InterfaceC7829h int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(@cdj int i2) {
        if (this.f24148s != i2) {
            this.f24148s = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@InterfaceC7829h int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@dd Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@dd InterfaceC3974q interfaceC3974q) {
        if (interfaceC3974q == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new toq(interfaceC3974q));
        }
    }

    public void setOnCheckedStateChangeListener(@dd InterfaceC3973n interfaceC3973n) {
        this.f24147p = interfaceC3973n;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f24150z.f24151k = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z2) {
        this.f24145h.cdj(z2);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z2) {
        super.setSingleLine(z2);
    }

    public void setSingleSelection(boolean z2) {
        this.f24145h.ki(z2);
    }

    /* JADX INFO: renamed from: y */
    public void m14236y() {
        this.f24145h.m14550y();
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean zy() {
        return super.zy();
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.f80188gcp);
    }

    @Override // android.view.ViewGroup
    @lvui
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new zy(layoutParams);
    }

    public void setSingleLine(@InterfaceC7845y int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public void setSingleSelection(@InterfaceC7845y int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f24144t;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        C4046k<Chip> c4046k = new C4046k<>();
        this.f24145h = c4046k;
        ViewGroupOnHierarchyChangeListenerC3971g viewGroupOnHierarchyChangeListenerC3971g = new ViewGroupOnHierarchyChangeListenerC3971g(this, null);
        this.f24150z = viewGroupOnHierarchyChangeListenerC3971g;
        TypedArray typedArrayM14534p = com.google.android.material.internal.cdj.m14534p(getContext(), attributeSet, C6095k.kja0.ue, i2, i3, new int[0]);
        int dimensionPixelOffset = typedArrayM14534p.getDimensionPixelOffset(C6095k.kja0.f1, 0);
        setChipSpacingHorizontal(typedArrayM14534p.getDimensionPixelOffset(C6095k.kja0.crha, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM14534p.getDimensionPixelOffset(C6095k.kja0.fai, dimensionPixelOffset));
        setSingleLine(typedArrayM14534p.getBoolean(C6095k.kja0.n358, false));
        setSingleSelection(typedArrayM14534p.getBoolean(C6095k.kja0.a5rs, false));
        setSelectionRequired(typedArrayM14534p.getBoolean(C6095k.kja0.ym8, false));
        this.f24146i = typedArrayM14534p.getResourceId(C6095k.kja0.dhzo, -1);
        typedArrayM14534p.recycle();
        c4046k.m14546h(new C3972k());
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC3971g);
        C0683f.o05(this, 1);
    }
}
