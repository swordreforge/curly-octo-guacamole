package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.n5r1;
import com.google.android.material.internal.cdj;
import h4b.C6070k;
import ij.C6095k;
import zy.InterfaceC7837n;
import zy.dd;
import zy.gvn7;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: i */
    private static final int f25204i = 15;

    /* JADX INFO: renamed from: h */
    @gvn7
    private final int f25205h;

    /* JADX INFO: renamed from: p */
    @lvui
    private final Rect f25206p;

    /* JADX INFO: renamed from: s */
    @dd
    private final AccessibilityManager f25207s;

    /* JADX INFO: renamed from: y */
    @lvui
    private final n5r1 f25208y;

    /* JADX INFO: renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$k */
    class C4147k implements AdapterView.OnItemClickListener {
        C4147k() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.f7l8(i2 < 0 ? materialAutoCompleteTextView.f25208y.o1t() : materialAutoCompleteTextView.getAdapter().getItem(i2));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i2 < 0) {
                    view = MaterialAutoCompleteTextView.this.f25208y.mcp();
                    i2 = MaterialAutoCompleteTextView.this.f25208y.m678t();
                    j2 = MaterialAutoCompleteTextView.this.f25208y.wvg();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f25208y.n7h(), view, i2, j2);
            }
            MaterialAutoCompleteTextView.this.f25208y.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void f7l8(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    /* JADX INFO: renamed from: g */
    private int m15012g() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutM15013q = m15013q();
        int i2 = 0;
        if (adapter == null || textInputLayoutM15013q == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f25208y.m678t()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutM15013q);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable background = this.f25208y.getBackground();
        if (background != null) {
            background.getPadding(this.f25206p);
            Rect rect = this.f25206p;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutM15013q.getEndIconView().getMeasuredWidth();
    }

    @dd
    /* JADX INFO: renamed from: q */
    private TextInputLayout m15013q() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    @dd
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM15013q = m15013q();
        return (textInputLayoutM15013q == null || !textInputLayoutM15013q.m15035e()) ? super.getHint() : textInputLayoutM15013q.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM15013q = m15013q();
        if (textInputLayoutM15013q != null && textInputLayoutM15013q.m15035e() && super.getHint() == null && com.google.android.material.internal.f7l8.zy()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m15012g()), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@dd T t2) {
        super.setAdapter(t2);
        this.f25208y.x2(getAdapter());
    }

    public void setSimpleItems(@InterfaceC7837n int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f25207s;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f25208y.mo318g();
        }
    }

    public MaterialAutoCompleteTextView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.f80298vyq);
    }

    public void setSimpleItems(@lvui String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f25205h, strArr));
    }

    public MaterialAutoCompleteTextView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(C6070k.zy(context, attributeSet, i2, 0), attributeSet, i2);
        this.f25206p = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM14534p = cdj.m14534p(context2, attributeSet, C6095k.kja0.fl9j, i2, C6095k.n7h.qmo, new int[0]);
        int i3 = C6095k.kja0.y7;
        if (typedArrayM14534p.hasValue(i3) && typedArrayM14534p.getInt(i3, 0) == 0) {
            setKeyListener(null);
        }
        this.f25205h = typedArrayM14534p.getResourceId(C6095k.kja0.z79v, C6095k.ld6.f79330nmn5);
        this.f25207s = (AccessibilityManager) context2.getSystemService("accessibility");
        n5r1 n5r1Var = new n5r1(context2);
        this.f25208y = n5r1Var;
        n5r1Var.nn86(true);
        n5r1Var.x9kr(this);
        n5r1Var.uv6(2);
        n5r1Var.x2(getAdapter());
        n5r1Var.m670j(new C4147k());
        int i4 = C6095k.kja0.cz;
        if (typedArrayM14534p.hasValue(i4)) {
            setSimpleItems(typedArrayM14534p.getResourceId(i4, 0));
        }
        typedArrayM14534p.recycle();
    }
}
