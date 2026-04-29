package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.accessibility.ki;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C4058z;
import com.google.android.material.internal.cdj;
import com.google.android.material.shape.C4105k;
import com.google.android.material.shape.InterfaceC4109q;
import com.google.android.material.shape.kja0;
import h4b.C6070k;
import ij.C6095k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import zy.InterfaceC7843t;
import zy.InterfaceC7845y;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private final Comparator<MaterialButton> f24063g;

    /* JADX INFO: renamed from: h */
    private boolean f24064h;

    /* JADX INFO: renamed from: i */
    @InterfaceC7843t
    private final int f24065i;

    /* JADX INFO: renamed from: k */
    private final List<zy> f24066k;

    /* JADX INFO: renamed from: n */
    private final LinkedHashSet<InterfaceC3965q> f24067n;

    /* JADX INFO: renamed from: p */
    private boolean f24068p;

    /* JADX INFO: renamed from: q */
    private final C3964n f24069q;

    /* JADX INFO: renamed from: s */
    private boolean f24070s;

    /* JADX INFO: renamed from: y */
    private Integer[] f24071y;

    /* JADX INFO: renamed from: z */
    private Set<Integer> f24072z;

    /* JADX INFO: renamed from: t */
    private static final String f24062t = MaterialButtonToggleGroup.class.getSimpleName();

    /* JADX INFO: renamed from: r */
    private static final int f24061r = C6095k.n7h.n96;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$k */
    class C3963k implements Comparator<MaterialButton> {
        C3963k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$n */
    private class C3964n implements MaterialButton.zy {
        private C3964n() {
        }

        @Override // com.google.android.material.button.MaterialButton.zy
        /* JADX INFO: renamed from: k */
        public void mo14171k(@lvui MaterialButton materialButton, boolean z2) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C3964n(MaterialButtonToggleGroup materialButtonToggleGroup, C3963k c3963k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$q */
    public interface InterfaceC3965q {
        /* JADX INFO: renamed from: k */
        void mo14182k(MaterialButtonToggleGroup materialButtonToggleGroup, @InterfaceC7843t int i2, boolean z2);
    }

    class toq extends C0701k {
        toq() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, @lvui ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.z4(ki.zy.m3073y(0, 1, MaterialButtonToggleGroup.this.ld6(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class zy {

        /* JADX INFO: renamed from: n */
        private static final InterfaceC4109q f24076n = new C4105k(0.0f);

        /* JADX INFO: renamed from: k */
        InterfaceC4109q f24077k;

        /* JADX INFO: renamed from: q */
        InterfaceC4109q f24078q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        InterfaceC4109q f67442toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        InterfaceC4109q f67443zy;

        zy(InterfaceC4109q interfaceC4109q, InterfaceC4109q interfaceC4109q2, InterfaceC4109q interfaceC4109q3, InterfaceC4109q interfaceC4109q4) {
            this.f24077k = interfaceC4109q;
            this.f67442toq = interfaceC4109q3;
            this.f67443zy = interfaceC4109q4;
            this.f24078q = interfaceC4109q2;
        }

        /* JADX INFO: renamed from: g */
        public static zy m14183g(zy zyVar) {
            InterfaceC4109q interfaceC4109q = zyVar.f24077k;
            InterfaceC4109q interfaceC4109q2 = f24076n;
            return new zy(interfaceC4109q, interfaceC4109q2, zyVar.f67442toq, interfaceC4109q2);
        }

        /* JADX INFO: renamed from: k */
        public static zy m14184k(zy zyVar) {
            InterfaceC4109q interfaceC4109q = f24076n;
            return new zy(interfaceC4109q, zyVar.f24078q, interfaceC4109q, zyVar.f67443zy);
        }

        /* JADX INFO: renamed from: n */
        public static zy m14185n(zy zyVar, View view) {
            return C4058z.ld6(view) ? m14186q(zyVar) : zy(zyVar);
        }

        /* JADX INFO: renamed from: q */
        public static zy m14186q(zy zyVar) {
            InterfaceC4109q interfaceC4109q = f24076n;
            return new zy(interfaceC4109q, interfaceC4109q, zyVar.f67442toq, zyVar.f67443zy);
        }

        public static zy toq(zy zyVar, View view) {
            return C4058z.ld6(view) ? zy(zyVar) : m14186q(zyVar);
        }

        public static zy zy(zy zyVar) {
            InterfaceC4109q interfaceC4109q = zyVar.f24077k;
            InterfaceC4109q interfaceC4109q2 = zyVar.f24078q;
            InterfaceC4109q interfaceC4109q3 = f24076n;
            return new zy(interfaceC4109q, interfaceC4109q2, interfaceC4109q3, interfaceC4109q3);
        }
    }

    public MaterialButtonToggleGroup(@lvui Context context) {
        this(context, null);
    }

    private static void fn3e(kja0.toq toqVar, @dd zy zyVar) {
        if (zyVar == null) {
            toqVar.kja0(0.0f);
        } else {
            toqVar.d2ok(zyVar.f24077k).m14839z(zyVar.f24078q).ncyb(zyVar.f67442toq).jk(zyVar.f67443zy);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m14172g(@InterfaceC7843t int i2, boolean z2) {
        if (i2 == -1) {
            Log.e(f24062t, "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f24072z);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f24068p && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            if (!this.f24064h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        zurt(hashSet);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (qrj(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (qrj(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && qrj(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void ki(int i2) {
        if (getChildCount() == 0 || i2 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m14174p(i2).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            androidx.core.view.ki.f7l8(layoutParams, 0);
            androidx.core.view.ki.m3352y(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int ld6(@dd View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == view) {
                return i2;
            }
            if ((getChildAt(i3) instanceof MaterialButton) && qrj(i3)) {
                i2++;
            }
        }
        return -1;
    }

    private void ni7() {
        TreeMap treeMap = new TreeMap(this.f24063g);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(m14174p(i2), Integer.valueOf(i2));
        }
        this.f24071y = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    /* JADX INFO: renamed from: p */
    private MaterialButton m14174p(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    private LinearLayout.LayoutParams m14175q(@lvui View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private boolean qrj(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: s */
    private void m14176s(@InterfaceC7843t int i2, boolean z2) {
        Iterator<InterfaceC3965q> it = this.f24067n.iterator();
        while (it.hasNext()) {
            it.next().mo14182k(this, i2, z2);
        }
    }

    private void setGeneratedIdIfNeeded(@lvui MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C0683f.jk());
        }
    }

    private void setupButtonChild(@lvui MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f24069q);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void t8r(@InterfaceC7843t int i2, boolean z2) {
        View viewFindViewById = findViewById(i2);
        if (viewFindViewById instanceof MaterialButton) {
            this.f24070s = true;
            ((MaterialButton) viewFindViewById).setChecked(z2);
            this.f24070s = false;
        }
    }

    @dd
    private zy x2(int i2, int i3, int i4) {
        zy zyVar = this.f24066k.get(i2);
        if (i3 == i4) {
            return zyVar;
        }
        boolean z2 = getOrientation() == 0;
        if (i2 == i3) {
            return z2 ? zy.m14185n(zyVar, this) : zy.m14183g(zyVar);
        }
        if (i2 == i4) {
            return z2 ? zy.toq(zyVar, this) : zy.m14184k(zyVar);
        }
        return null;
    }

    private void zurt(Set<Integer> set) {
        Set<Integer> set2 = this.f24072z;
        this.f24072z = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = m14174p(i2).getId();
            t8r(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                m14176s(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void zy() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButtonM14174p = m14174p(i2);
            int iMin = Math.min(materialButtonM14174p.getStrokeWidth(), m14174p(i2 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsM14175q = m14175q(materialButtonM14174p);
            if (getOrientation() == 0) {
                androidx.core.view.ki.f7l8(layoutParamsM14175q, 0);
                androidx.core.view.ki.m3352y(layoutParamsM14175q, -iMin);
                layoutParamsM14175q.topMargin = 0;
            } else {
                layoutParamsM14175q.bottomMargin = 0;
                layoutParamsM14175q.topMargin = -iMin;
                androidx.core.view.ki.m3352y(layoutParamsM14175q, 0);
            }
            materialButtonM14174p.setLayoutParams(layoutParamsM14175q);
        }
        ki(firstVisibleChildIndex);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f24062t, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m14172g(materialButton.getId(), materialButton.isChecked());
        kja0 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f24066k.add(new zy(shapeAppearanceModel.ki(), shapeAppearanceModel.m14824p(), shapeAppearanceModel.m14823i(), shapeAppearanceModel.x2()));
        C0683f.zwy(materialButton, new toq());
    }

    public void cdj(@lvui InterfaceC3965q interfaceC3965q) {
        this.f24067n.remove(interfaceC3965q);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@lvui Canvas canvas) {
        ni7();
        super.dispatchDraw(canvas);
    }

    public void f7l8() {
        zurt(new HashSet());
    }

    @yz
    void fu4() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButtonM14174p = m14174p(i2);
            if (materialButtonM14174p.getVisibility() != 8) {
                kja0.toq toqVarZurt = materialButtonM14174p.getShapeAppearanceModel().zurt();
                fn3e(toqVarZurt, x2(i2, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonM14174p.setShapeAppearanceModel(toqVarZurt.qrj());
            }
        }
    }

    @InterfaceC7843t
    public int getCheckedButtonId() {
        if (!this.f24068p || this.f24072z.isEmpty()) {
            return -1;
        }
        return this.f24072z.iterator().next().intValue();
    }

    @lvui
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = m14174p(i2).getId();
            if (this.f24072z.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f24071y;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w(f24062t, "Child order wasn't updated");
        return i3;
    }

    /* JADX INFO: renamed from: h */
    void m14177h(@lvui MaterialButton materialButton, boolean z2) {
        if (this.f24070s) {
            return;
        }
        m14172g(materialButton.getId(), z2);
    }

    /* JADX INFO: renamed from: i */
    public void m14178i(@InterfaceC7843t int i2) {
        m14172g(i2, false);
    }

    public boolean kja0() {
        return this.f24068p;
    }

    /* JADX INFO: renamed from: n */
    public void m14179n(@InterfaceC7843t int i2) {
        m14172g(i2, true);
    }

    public boolean n7h() {
        return this.f24064h;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f24065i;
        if (i2 != -1) {
            zurt(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ki.r25n(accessibilityNodeInfo).w831(ki.toq.m3069g(1, getVisibleButtonCount(), false, kja0() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        fu4();
        zy();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f24066k.remove(iIndexOfChild);
        }
        fu4();
        zy();
    }

    public void setSelectionRequired(boolean z2) {
        this.f24064h = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f24068p != z2) {
            this.f24068p = z2;
            f7l8();
        }
    }

    public void toq(@lvui InterfaceC3965q interfaceC3965q) {
        this.f24067n.add(interfaceC3965q);
    }

    /* JADX INFO: renamed from: y */
    public void m14180y() {
        this.f24067n.clear();
    }

    public MaterialButtonToggleGroup(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.iroj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = f24061r;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24066k = new ArrayList();
        this.f24069q = new C3964n(this, null);
        this.f24067n = new LinkedHashSet<>();
        this.f24063g = new C3963k();
        this.f24070s = false;
        this.f24072z = new HashSet();
        TypedArray typedArrayM14534p = cdj.m14534p(getContext(), attributeSet, C6095k.kja0.e95, i2, i3, new int[0]);
        setSingleSelection(typedArrayM14534p.getBoolean(C6095k.kja0.ltll, false));
        this.f24065i = typedArrayM14534p.getResourceId(C6095k.kja0.mh, -1);
        this.f24064h = typedArrayM14534p.getBoolean(C6095k.kja0.dd0, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayM14534p.recycle();
        C0683f.o05(this, 1);
    }

    public void setSingleSelection(@InterfaceC7845y int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
