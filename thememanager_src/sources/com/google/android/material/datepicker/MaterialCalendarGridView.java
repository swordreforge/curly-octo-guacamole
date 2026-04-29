package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C0639p;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import com.google.android.material.internal.C4058z;
import ij.C6095k;
import java.util.Calendar;
import java.util.Iterator;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: k */
    private final Calendar f24269k;

    /* JADX INFO: renamed from: q */
    private final boolean f24270q;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$k */
    class C3996k extends C0701k {
        C3996k() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, @lvui androidx.core.view.accessibility.ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.w831(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m14379k(int i2, Rect rect) {
        if (i2 == 33) {
            setSelection(getAdapter().m14432s());
        } else if (i2 == 130) {
            setSelection(getAdapter().toq());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    /* JADX INFO: renamed from: n */
    private static boolean m14380n(@dd Long l2, @dd Long l3, @dd Long l4, @dd Long l5) {
        return l2 == null || l3 == null || l4 == null || l5 == null || l4.longValue() > l3.longValue() || l5.longValue() < l2.longValue();
    }

    /* JADX INFO: renamed from: q */
    private static int m14381q(@lvui View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private View zy(int i2) {
        return getChildAt(i2 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(@lvui Canvas canvas) {
        int iM14429k;
        int iM14381q;
        int iM14429k2;
        int iM14381q2;
        int width;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        ld6 adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f24347q;
        toq toqVar = adapter.f24344g;
        int iMax = Math.max(adapter.toq(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.m14432s(), getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator<C0639p<Long, Long>> it = dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            C0639p<Long, Long> next = it.next();
            Long l2 = next.f3889k;
            if (l2 == null) {
                materialCalendarGridView = this;
            } else if (next.f50633toq != null) {
                long jLongValue = l2.longValue();
                long jLongValue2 = next.f50633toq.longValue();
                if (!m14380n(item, item2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2))) {
                    boolean zLd6 = C4058z.ld6(this);
                    if (jLongValue < item.longValue()) {
                        iM14381q = adapter.m14428g(iMax) ? 0 : !zLd6 ? materialCalendarGridView.zy(iMax - 1).getRight() : materialCalendarGridView.zy(iMax - 1).getLeft();
                        iM14429k = iMax;
                    } else {
                        materialCalendarGridView.f24269k.setTimeInMillis(jLongValue);
                        iM14429k = adapter.m14429k(materialCalendarGridView.f24269k.get(5));
                        iM14381q = m14381q(materialCalendarGridView.zy(iM14429k));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iM14381q2 = adapter.f7l8(iMin) ? getWidth() : !zLd6 ? materialCalendarGridView.zy(iMin).getRight() : materialCalendarGridView.zy(iMin).getLeft();
                        iM14429k2 = iMin;
                    } else {
                        materialCalendarGridView.f24269k.setTimeInMillis(jLongValue2);
                        iM14429k2 = adapter.m14429k(materialCalendarGridView.f24269k.get(5));
                        iM14381q2 = m14381q(materialCalendarGridView.zy(iM14429k2));
                    }
                    int itemId = (int) adapter.getItemId(iM14429k);
                    int i3 = iMax;
                    int i4 = iMin;
                    int itemId2 = (int) adapter.getItemId(iM14429k2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View viewZy = materialCalendarGridView.zy(numColumns);
                        int top = viewZy.getTop() + toqVar.f24367k.m14423n();
                        ld6 ld6Var = adapter;
                        int bottom = viewZy.getBottom() - toqVar.f24367k.toq();
                        if (zLd6) {
                            int i5 = iM14429k2 > numColumns2 ? 0 : iM14381q2;
                            width = numColumns > iM14429k ? getWidth() : iM14381q;
                            i2 = i5;
                        } else {
                            i2 = numColumns > iM14429k ? 0 : iM14381q;
                            width = iM14429k2 > numColumns2 ? getWidth() : iM14381q2;
                        }
                        canvas.drawRect(i2, top, width, bottom, toqVar.f24370y);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = ld6Var;
                    }
                    materialCalendarGridView = this;
                    iMax = i3;
                    iMin = i4;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z2, int i2, Rect rect) {
        if (z2) {
            m14379k(i2, rect);
        } else {
            super.onFocusChanged(false, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().toq()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().toq());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.f24270q) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(C0683f.f50797t8r, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
        if (i2 < getAdapter().toq()) {
            super.setSelection(getAdapter().toq());
        } else {
            super.setSelection(i2);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @lvui
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public ld6 getAdapter() {
        return (ld6) super.getAdapter();
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof ld6)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), ld6.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f24269k = cdj.zurt();
        if (f7l8.mi1u(getContext())) {
            setNextFocusLeftId(C6095k.y.f79998ikck);
            setNextFocusRightId(C6095k.y.f80068r8s8);
        }
        this.f24270q = f7l8.vwb(getContext());
        C0683f.zwy(this, new C3996k());
    }
}
