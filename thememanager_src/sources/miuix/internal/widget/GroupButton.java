package miuix.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.nmn5;
import gb.toq;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class GroupButton extends AppCompatButton {

    /* JADX INFO: renamed from: g */
    private AttributeSet f40450g;

    /* JADX INFO: renamed from: y */
    private boolean f40451y;

    /* JADX INFO: renamed from: s */
    private static final int[] f40447s = {toq.C6055q.a800};

    /* JADX INFO: renamed from: p */
    private static final int[] f40445p = {toq.C6055q.nxzp};

    /* JADX INFO: renamed from: h */
    private static final int[] f40443h = {toq.C6055q.tkle};

    /* JADX INFO: renamed from: i */
    private static final int[] f40444i = {toq.C6055q.mg};

    /* JADX INFO: renamed from: z */
    private static final int[] f40449z = {toq.C6055q.qlt6};

    /* JADX INFO: renamed from: t */
    private static final int[] f40448t = {toq.C6055q.wime};

    /* JADX INFO: renamed from: r */
    private static final int[] f40446r = {toq.C6055q.t2d};

    public GroupButton(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k */
    private void m26022k() {
        Configuration configuration;
        Locale locale;
        Resources resources = getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null || (locale = configuration.locale) == null || !"bo".equals(locale.getLanguage())) {
            return;
        }
        Layout layout = getLayout();
        int height = layout != null ? layout.getHeight() : 0;
        TextPaint paint = getPaint();
        Rect rect = new Rect();
        String strValueOf = String.valueOf(getText());
        if (paint != null) {
            paint.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
        }
        rect.top += getBaseline();
        int baseline = rect.bottom + getBaseline();
        rect.bottom = baseline;
        int i2 = baseline - rect.top;
        if (baseline > getHeight()) {
            setPadding(getPaddingTop(), getPaddingTop() - Math.min(i2 - height, rect.top), getPaddingEnd(), getPaddingBottom());
        }
    }

    private void toq(Context context, AttributeSet attributeSet, int i2) {
        this.f40450g = attributeSet;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.lb, i2, 0);
        try {
            int i3 = toq.ki.nfw3;
            if (typedArrayObtainStyledAttributes.hasValue(i3)) {
                this.f40451y = typedArrayObtainStyledAttributes.getBoolean(i3, false);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return super.onCreateDrawableState(i2);
        }
        if (!(viewGroup instanceof LinearLayout)) {
            return super.onCreateDrawableState(i2);
        }
        int orientation = ((LinearLayout) viewGroup).getOrientation();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i3 = 0;
        boolean z2 = true;
        boolean z3 = true;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            if (viewGroup.getChildAt(i4).getVisibility() == 0) {
                i3++;
                if (i4 < iIndexOfChild) {
                    z2 = false;
                }
                if (i4 > iIndexOfChild) {
                    z3 = false;
                }
            }
        }
        boolean z5 = i3 == 1;
        if (orientation == 1) {
            int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
            View.mergeDrawableStates(iArrOnCreateDrawableState, f40446r);
            if (!z5) {
                if (z2) {
                    View.mergeDrawableStates(iArrOnCreateDrawableState, f40447s);
                } else if (z3) {
                    View.mergeDrawableStates(iArrOnCreateDrawableState, f40443h);
                } else {
                    View.mergeDrawableStates(iArrOnCreateDrawableState, f40445p);
                }
            }
            return iArrOnCreateDrawableState;
        }
        boolean qVar = nmn5.toq(this);
        int[] iArrOnCreateDrawableState2 = super.onCreateDrawableState(i2 + 1);
        if (z5) {
            View.mergeDrawableStates(iArrOnCreateDrawableState2, f40446r);
        } else if (z2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState2, qVar ? f40448t : f40444i);
        } else if (z3) {
            View.mergeDrawableStates(iArrOnCreateDrawableState2, qVar ? f40444i : f40448t);
        } else {
            View.mergeDrawableStates(iArrOnCreateDrawableState2, f40449z);
        }
        return iArrOnCreateDrawableState2;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        m26022k();
    }

    public boolean zy() {
        return this.f40451y;
    }

    public GroupButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        toq(context, attributeSet, i2);
    }
}
