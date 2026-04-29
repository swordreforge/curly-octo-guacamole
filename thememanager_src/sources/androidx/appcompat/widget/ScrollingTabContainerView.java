package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0096k;
import androidx.appcompat.view.C0116k;
import androidx.appcompat.widget.LinearLayoutCompat;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: f */
    private static final int f835f = 200;

    /* JADX INFO: renamed from: l */
    private static final Interpolator f836l = new DecelerateInterpolator();

    /* JADX INFO: renamed from: r */
    private static final String f837r = "ScrollingTabContainerView";

    /* JADX INFO: renamed from: g */
    private Spinner f838g;

    /* JADX INFO: renamed from: h */
    private int f839h;

    /* JADX INFO: renamed from: i */
    private int f840i;

    /* JADX INFO: renamed from: k */
    Runnable f841k;

    /* JADX INFO: renamed from: n */
    LinearLayoutCompat f842n;

    /* JADX INFO: renamed from: p */
    int f843p;

    /* JADX INFO: renamed from: q */
    private zy f844q;

    /* JADX INFO: renamed from: s */
    int f845s;

    /* JADX INFO: renamed from: t */
    protected final C0164n f846t;

    /* JADX INFO: renamed from: y */
    private boolean f847y;

    /* JADX INFO: renamed from: z */
    protected ViewPropertyAnimator f848z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ScrollingTabContainerView$k */
    class RunnableC0163k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f849k;

        RunnableC0163k(View view) {
            this.f849k = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f849k.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f849k.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f841k = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ScrollingTabContainerView$n */
    protected class C0164n extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        private boolean f851k = false;

        /* JADX INFO: renamed from: q */
        private int f853q;

        protected C0164n() {
        }

        /* JADX INFO: renamed from: k */
        public C0164n m482k(ViewPropertyAnimator viewPropertyAnimator, int i2) {
            this.f853q = i2;
            ScrollingTabContainerView.this.f848z = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f851k = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f851k) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.f848z = null;
            scrollingTabContainerView.setVisibility(this.f853q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f851k = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ScrollingTabContainerView$q */
    private class C0165q extends LinearLayout {

        /* JADX INFO: renamed from: p */
        private static final String f854p = "androidx.appcompat.app.ActionBar$Tab";

        /* JADX INFO: renamed from: g */
        private ImageView f855g;

        /* JADX INFO: renamed from: k */
        private final int[] f856k;

        /* JADX INFO: renamed from: n */
        private TextView f857n;

        /* JADX INFO: renamed from: q */
        private AbstractC0096k.g f858q;

        /* JADX INFO: renamed from: y */
        private View f860y;

        /* JADX WARN: Illegal instructions before constructor call */
        public C0165q(Context context, AbstractC0096k.g gVar, boolean z2) {
            int i2 = C7397k.toq.f42501y;
            super(context, null, i2);
            int[] iArr = {R.attr.background};
            this.f856k = iArr;
            this.f858q = gVar;
            C0184b c0184bJp0y = C0184b.jp0y(context, null, iArr, i2, 0);
            if (c0184bJp0y.mcp(0)) {
                setBackgroundDrawable(c0184bJp0y.m553y(0));
            }
            c0184bJp0y.d3();
            if (z2) {
                setGravity(8388627);
            }
            zy();
        }

        /* JADX INFO: renamed from: k */
        public void m483k(AbstractC0096k.g gVar) {
            this.f858q = gVar;
            zy();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f854p);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f854p);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (ScrollingTabContainerView.this.f845s > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = ScrollingTabContainerView.this.f845s;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z2) {
            boolean z3 = isSelected() != z2;
            super.setSelected(z2);
            if (z3 && z2) {
                sendAccessibilityEvent(4);
            }
        }

        public AbstractC0096k.g toq() {
            return this.f858q;
        }

        public void zy() {
            AbstractC0096k.g gVar = this.f858q;
            View qVar = gVar.toq();
            if (qVar != null) {
                ViewParent parent = qVar.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(qVar);
                    }
                    addView(qVar);
                }
                this.f860y = qVar;
                TextView textView = this.f857n;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f855g;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f855g.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f860y;
            if (view != null) {
                removeView(view);
                this.f860y = null;
            }
            Drawable drawableZy = gVar.zy();
            CharSequence charSequenceMo177g = gVar.mo177g();
            if (drawableZy != null) {
                if (this.f855g == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f855g = appCompatImageView;
                }
                this.f855g.setImageDrawable(drawableZy);
                this.f855g.setVisibility(0);
            } else {
                ImageView imageView2 = this.f855g;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f855g.setImageDrawable(null);
                }
            }
            boolean z2 = !TextUtils.isEmpty(charSequenceMo177g);
            if (z2) {
                if (this.f857n == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C7397k.toq.f42495s);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f857n = appCompatTextView;
                }
                this.f857n.setText(charSequenceMo177g);
                this.f857n.setVisibility(0);
            } else {
                TextView textView2 = this.f857n;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f857n.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f855g;
            if (imageView3 != null) {
                imageView3.setContentDescription(gVar.mo179k());
            }
            C0182a.m528k(this, z2 ? null : gVar.mo179k());
        }
    }

    private class toq extends BaseAdapter {
        toq() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f842n.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((C0165q) ScrollingTabContainerView.this.f842n.getChildAt(i2)).toq();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.f7l8((AbstractC0096k.g) getItem(i2), true);
            }
            ((C0165q) view).m483k((AbstractC0096k.g) getItem(i2));
            return view;
        }
    }

    private class zy implements View.OnClickListener {
        zy() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C0165q) view).toq().f7l8();
            int childCount = ScrollingTabContainerView.this.f842n.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ScrollingTabContainerView.this.f842n.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    public ScrollingTabContainerView(@zy.lvui Context context) {
        super(context);
        this.f846t = new C0164n();
        setHorizontalScrollBarEnabled(false);
        C0116k qVar = C0116k.toq(context);
        setContentHeight(qVar.m302g());
        this.f843p = qVar.m304n();
        LinearLayoutCompat linearLayoutCompatM475g = m475g();
        this.f842n = linearLayoutCompatM475g;
        addView(linearLayoutCompatM475g, new ViewGroup.LayoutParams(-2, -1));
    }

    /* JADX INFO: renamed from: g */
    private LinearLayoutCompat m475g() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, C7397k.toq.f92855f7l8);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.toq(-2, -1));
        return linearLayoutCompat;
    }

    /* JADX INFO: renamed from: n */
    private Spinner m476n() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C7397k.toq.f92948qrj);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.toq(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* JADX INFO: renamed from: p */
    private boolean m477p() {
        if (!m479y()) {
            return false;
        }
        removeView(this.f838g);
        addView(this.f842n, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f838g.getSelectedItemPosition());
        return false;
    }

    /* JADX INFO: renamed from: s */
    private void m478s() {
        if (m479y()) {
            return;
        }
        if (this.f838g == null) {
            this.f838g = m476n();
        }
        removeView(this.f842n);
        addView(this.f838g, new ViewGroup.LayoutParams(-2, -1));
        if (this.f838g.getAdapter() == null) {
            this.f838g.setAdapter((SpinnerAdapter) new toq());
        }
        Runnable runnable = this.f841k;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f841k = null;
        }
        this.f838g.setSelection(this.f840i);
    }

    /* JADX INFO: renamed from: y */
    private boolean m479y() {
        Spinner spinner = this.f838g;
        return spinner != null && spinner.getParent() == this;
    }

    C0165q f7l8(AbstractC0096k.g gVar, boolean z2) {
        C0165q c0165q = new C0165q(getContext(), gVar, z2);
        if (z2) {
            c0165q.setBackgroundDrawable(null);
            c0165q.setLayoutParams(new AbsListView.LayoutParams(-1, this.f839h));
        } else {
            c0165q.setFocusable(true);
            if (this.f844q == null) {
                this.f844q = new zy();
            }
            c0165q.setOnClickListener(this.f844q);
        }
        return c0165q;
    }

    /* JADX INFO: renamed from: k */
    public void m480k(AbstractC0096k.g gVar, int i2, boolean z2) {
        C0165q c0165qF7l8 = f7l8(gVar, false);
        this.f842n.addView(c0165qF7l8, i2, new LinearLayoutCompat.toq(0, -1, 1.0f));
        Spinner spinner = this.f838g;
        if (spinner != null) {
            ((toq) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z2) {
            c0165qF7l8.setSelected(true);
        }
        if (this.f847y) {
            requestLayout();
        }
    }

    public void ld6() {
        this.f842n.removeAllViews();
        Spinner spinner = this.f838g;
        if (spinner != null) {
            ((toq) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f847y) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f841k;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0116k qVar = C0116k.toq(getContext());
        setContentHeight(qVar.m302g());
        this.f843p = qVar.m304n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f841k;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((C0165q) view).toq().f7l8();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f842n.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f845s = -1;
        } else {
            if (childCount > 2) {
                this.f845s = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.f845s = View.MeasureSpec.getSize(i2) / 2;
            }
            this.f845s = Math.min(this.f845s, this.f843p);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f839h, 1073741824);
        if (!z2 && this.f847y) {
            this.f842n.measure(0, iMakeMeasureSpec);
            if (this.f842n.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                m478s();
            } else {
                m477p();
            }
        } else {
            m477p();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z2 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f840i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* JADX INFO: renamed from: q */
    public void m481q(int i2) {
        ViewPropertyAnimator viewPropertyAnimator = this.f848z;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i2 != 0) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = animate().alpha(0.0f);
            viewPropertyAnimatorAlpha.setDuration(200L);
            viewPropertyAnimatorAlpha.setInterpolator(f836l);
            viewPropertyAnimatorAlpha.setListener(this.f846t.m482k(viewPropertyAnimatorAlpha, i2));
            viewPropertyAnimatorAlpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = animate().alpha(1.0f);
        viewPropertyAnimatorAlpha2.setDuration(200L);
        viewPropertyAnimatorAlpha2.setInterpolator(f836l);
        viewPropertyAnimatorAlpha2.setListener(this.f846t.m482k(viewPropertyAnimatorAlpha2, i2));
        viewPropertyAnimatorAlpha2.start();
    }

    public void qrj(int i2) {
        ((C0165q) this.f842n.getChildAt(i2)).zy();
        Spinner spinner = this.f838g;
        if (spinner != null) {
            ((toq) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f847y) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z2) {
        this.f847y = z2;
    }

    public void setContentHeight(int i2) {
        this.f839h = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f840i = i2;
        int childCount = this.f842n.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f842n.getChildAt(i3);
            boolean z2 = i3 == i2;
            childAt.setSelected(z2);
            if (z2) {
                zy(i2);
            }
            i3++;
        }
        Spinner spinner = this.f838g;
        if (spinner == null || i2 < 0) {
            return;
        }
        spinner.setSelection(i2);
    }

    public void toq(AbstractC0096k.g gVar, boolean z2) {
        C0165q c0165qF7l8 = f7l8(gVar, false);
        this.f842n.addView(c0165qF7l8, new LinearLayoutCompat.toq(0, -1, 1.0f));
        Spinner spinner = this.f838g;
        if (spinner != null) {
            ((toq) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z2) {
            c0165qF7l8.setSelected(true);
        }
        if (this.f847y) {
            requestLayout();
        }
    }

    public void x2(int i2) {
        this.f842n.removeViewAt(i2);
        Spinner spinner = this.f838g;
        if (spinner != null) {
            ((toq) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f847y) {
            requestLayout();
        }
    }

    public void zy(int i2) {
        View childAt = this.f842n.getChildAt(i2);
        Runnable runnable = this.f841k;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC0163k runnableC0163k = new RunnableC0163k(childAt);
        this.f841k = runnableC0163k;
        post(runnableC0163k);
    }
}
