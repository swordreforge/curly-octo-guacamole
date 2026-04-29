package miuix.appcompat.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import gb.toq;
import miuix.core.util.C7085q;
import miuix.core.util.ld6;
import miuix.internal.util.n7h;
import miuix.view.f7l8;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class DialogButtonPanel extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private int f39595g;

    /* JADX INFO: renamed from: h */
    private int f39596h;

    /* JADX INFO: renamed from: i */
    private float f39597i;

    /* JADX INFO: renamed from: k */
    private int f39598k;

    /* JADX INFO: renamed from: n */
    private int f39599n;

    /* JADX INFO: renamed from: p */
    private boolean f39600p;

    /* JADX INFO: renamed from: q */
    private int f39601q;

    /* JADX INFO: renamed from: s */
    private int f39602s;

    /* JADX INFO: renamed from: t */
    private Context f39603t;

    /* JADX INFO: renamed from: y */
    private int f39604y;

    /* JADX INFO: renamed from: z */
    private boolean f39605z;

    public DialogButtonPanel(Context context) {
        this(context, null);
    }

    private boolean f7l8(int i2) {
        if (this.f39600p) {
            return true;
        }
        int childCount = getChildCount();
        int i3 = childCount;
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            if (getChildAt(i4).getVisibility() == 8) {
                i3--;
            }
        }
        if (i3 < 2) {
            return false;
        }
        if (i3 >= 3) {
            return true;
        }
        if (ld6.fn3e(getContext(), getPaddingStart() + i2 + getPaddingEnd()) < 304) {
            return true;
        }
        int i5 = (i2 - this.f39595g) / 2;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if ((childAt instanceof TextView) && childAt.getVisibility() == 0 && m25394g((TextView) childAt, i5)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    private boolean m25394g(TextView textView, int i2) {
        return ((int) textView.getPaint().measureText(textView.getText().toString())) > (i2 - textView.getPaddingStart()) - textView.getPaddingEnd();
    }

    /* JADX INFO: renamed from: k */
    private void m25395k() {
        if (this.f39605z) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        boolean z2 = (((float) this.f39596h) * 1.0f) / ((float) Math.max(C7085q.n7h(this.f39603t).y, 1)) >= 0.4f;
        if (viewGroup == null || !z2 || (viewGroup instanceof NestedScrollViewExpander) || !(viewGroup instanceof DialogParentPanel2)) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(toq.C6054p.f76399pc);
        viewGroup.removeView(this);
        if (viewGroup2 != null) {
            viewGroup2.addView(this);
            ((NestedScrollViewExpander) viewGroup2).setExpandView(null);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m25396q(int i2) {
        setOrientation(1);
        setPadding(this.f39599n, getPaddingTop(), this.f39599n, getPaddingBottom());
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            View childAt = getChildAt(i5);
            boolean z2 = childAt.getVisibility() == 0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = this.f39602s;
            layoutParams.weight = 0.0f;
            layoutParams.topMargin = z2 ? i4 : 0;
            layoutParams.rightMargin = 0;
            layoutParams.leftMargin = 0;
            if (z2) {
                i4 = this.f39604y;
            }
            if (z2) {
                i3++;
            }
        }
        this.f39596h = i3 > 0 ? (this.f39602s * i3) + ((i3 - 1) * this.f39604y) : 0;
    }

    private void toq(int i2) {
        boolean zF7l8 = f7l8((i2 - getPaddingStart()) - getPaddingEnd());
        int childCount = getChildCount();
        if (zF7l8) {
            m25396q(childCount);
        } else {
            zy(childCount);
        }
    }

    private void zy(int i2) {
        setOrientation(0);
        setPadding(this.f39599n, getPaddingTop(), this.f39599n, getPaddingBottom());
        boolean zX2 = n7h.x2(this);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            boolean z2 = childAt.getVisibility() == 0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.height = this.f39602s;
            layoutParams.weight = 1.0f;
            layoutParams.topMargin = 0;
            if (!z2) {
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            } else if (zX2) {
                layoutParams.rightMargin = i3;
            } else {
                layoutParams.leftMargin = i3;
            }
            if (z2) {
                i3 = this.f39595g;
            }
        }
        this.f39596h = i2 > 0 ? this.f39602s : 0;
    }

    public int getButtonFullyVisibleHeight() {
        return this.f39596h;
    }

    /* JADX INFO: renamed from: n */
    public void m25397n(boolean z2) {
        this.f39605z = z2;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i2 = this.f39601q;
        this.f39598k = i2;
        int i3 = configuration.densityDpi;
        if (i2 != i3) {
            this.f39601q = i3;
            float f2 = (i3 * 1.0f) / i2;
            this.f39599n = (int) (this.f39599n * f2);
            this.f39595g = (int) (this.f39595g * f2);
            this.f39604y = (int) (this.f39604y * f2);
            this.f39602s = (int) (this.f39602s * f2);
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt instanceof TextView) {
                    f7l8.f7l8((TextView) childAt, this.f39597i);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        m25395k();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        toq(View.MeasureSpec.getSize(i2));
        super.onMeasure(i2, i3);
    }

    public void setForceVertical(boolean z2) {
        this.f39600p = z2;
    }

    public DialogButtonPanel(Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialogButtonPanel(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39597i = 17.0f;
        this.f39603t = context;
        Resources resources = getResources();
        this.f39599n = resources.getDimensionPixelOffset(toq.f7l8.z5);
        this.f39595g = resources.getDimensionPixelOffset(toq.f7l8.kq);
        this.f39604y = resources.getDimensionPixelOffset(toq.f7l8.anhx);
        this.f39602s = resources.getDimensionPixelOffset(toq.f7l8.f75519tjz5);
        int i3 = resources.getConfiguration().densityDpi;
        this.f39601q = i3;
        this.f39598k = i3;
    }
}
