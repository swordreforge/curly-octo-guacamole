package miuix.appcompat.internal.app.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0096k;
import gb.toq;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.internal.view.C7010k;
import miuix.internal.util.C7164n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemClickListener, AbstractC6946k.k {

    /* JADX INFO: renamed from: a */
    public static final int f39137a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f39138b = 0;

    /* JADX INFO: renamed from: x */
    public static final int f39139x = 2;

    /* JADX INFO: renamed from: c */
    private int f39140c;

    /* JADX INFO: renamed from: e */
    private float f39141e;

    /* JADX INFO: renamed from: f */
    private Paint f39142f;

    /* JADX INFO: renamed from: g */
    int f39143g;

    /* JADX INFO: renamed from: h */
    private boolean f39144h;

    /* JADX INFO: renamed from: i */
    private int f39145i;

    /* JADX INFO: renamed from: j */
    private boolean f39146j;

    /* JADX INFO: renamed from: k */
    private final LayoutInflater f39147k;

    /* JADX INFO: renamed from: l */
    private float f39148l;

    /* JADX INFO: renamed from: m */
    private WeakHashMap<TextView, Integer> f39149m;

    /* JADX INFO: renamed from: n */
    int f39150n;

    /* JADX INFO: renamed from: o */
    private final int f39151o;

    /* JADX INFO: renamed from: p */
    private Spinner f39152p;

    /* JADX INFO: renamed from: q */
    Runnable f39153q;

    /* JADX INFO: renamed from: r */
    private boolean f39154r;

    /* JADX INFO: renamed from: s */
    protected LinearLayout f39155s;

    /* JADX INFO: renamed from: t */
    private Bitmap f39156t;

    /* JADX INFO: renamed from: y */
    private toq f39157y;

    /* JADX INFO: renamed from: z */
    private int f39158z;

    public static class TabView extends LinearLayout {

        /* JADX INFO: renamed from: g */
        private View f39159g;

        /* JADX INFO: renamed from: k */
        private AbstractC0096k.g f39160k;

        /* JADX INFO: renamed from: n */
        private ImageView f39161n;

        /* JADX INFO: renamed from: q */
        private TextView f39162q;

        /* JADX INFO: renamed from: s */
        private ScrollingTabContainerView f39163s;

        /* JADX INFO: renamed from: y */
        private ImageView f39164y;

        public TabView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this, new AnimConfig[0]);
        }

        public AbstractC0096k.g getTab() {
            return this.f39160k;
        }

        public TextView getTextView() {
            return this.f39162q;
        }

        /* JADX INFO: renamed from: n */
        public void m25188n() {
            Drawable drawableM25952s;
            int intrinsicHeight;
            int lineHeight;
            AbstractC0096k.g gVar = this.f39160k;
            View qVar = gVar.toq();
            if (qVar != null) {
                this.f39159g = this.f39163s.kja0(this, qVar, this.f39162q, this.f39161n);
            } else {
                View view = this.f39159g;
                if (view != null) {
                    removeView(view);
                    this.f39159g = null;
                }
                Context context = getContext();
                Drawable drawableZy = gVar.zy();
                CharSequence charSequenceMo177g = gVar.mo177g();
                if (drawableZy != null) {
                    if (this.f39161n == null) {
                        ImageView imageView = new ImageView(context);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 16;
                        imageView.setLayoutParams(layoutParams);
                        addView(imageView, 0);
                        this.f39161n = imageView;
                    }
                    this.f39161n.setImageDrawable(drawableZy);
                    this.f39161n.setVisibility(0);
                } else {
                    ImageView imageView2 = this.f39161n;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                        this.f39161n.setImageDrawable(null);
                    }
                }
                if (charSequenceMo177g != null) {
                    if (this.f39162q == null) {
                        ScrollingTabTextView scrollingTabTextView = new ScrollingTabTextView(context, null, this.f39163s.getDefaultTabTextStyle());
                        scrollingTabTextView.setEllipsize(TextUtils.TruncateAt.END);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 16;
                        scrollingTabTextView.setLayoutParams(layoutParams2);
                        addView(scrollingTabTextView);
                        this.f39162q = scrollingTabTextView;
                    }
                    this.f39162q.setText(charSequenceMo177g);
                    this.f39162q.setVisibility(0);
                    if (this.f39164y == null && (drawableM25952s = C7164n.m25952s(context, toq.C6055q.f34925m)) != null) {
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setImageDrawable(drawableM25952s);
                        imageView3.setVisibility(8);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams3.gravity = 48;
                        Drawable background = getBackground();
                        if (background != null && (intrinsicHeight = background.getIntrinsicHeight()) > (lineHeight = this.f39162q.getLineHeight())) {
                            layoutParams3.topMargin = (intrinsicHeight - lineHeight) / 2;
                        }
                        imageView3.setLayoutParams(layoutParams3);
                        addView(imageView3);
                        this.f39164y = imageView3;
                    }
                } else {
                    TextView textView = this.f39162q;
                    if (textView != null) {
                        textView.setVisibility(8);
                        this.f39162q.setText((CharSequence) null);
                    }
                }
                ImageView imageView4 = this.f39161n;
                if (imageView4 != null) {
                    imageView4.setContentDescription(gVar.mo179k());
                }
            }
            this.f39163s.cdj(this.f39162q);
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            TextView textView = this.f39162q;
            if (textView != null) {
                this.f39162q.setTextAppearance(this.f39163s.m25186s(textView));
            }
            ImageView imageView = this.f39161n;
            if (imageView != null) {
                imageView.setImageDrawable(this.f39160k.zy());
            }
        }

        /* JADX INFO: renamed from: q */
        public void m25189q(AbstractC0096k.g gVar) {
            this.f39160k = gVar;
            m25188n();
        }

        void zy(ScrollingTabContainerView scrollingTabContainerView, AbstractC0096k.g gVar, boolean z2) {
            this.f39163s = scrollingTabContainerView;
            this.f39160k = gVar;
            if (z2) {
                setGravity(8388627);
            }
            m25188n();
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ScrollingTabContainerView$k */
    private class C6982k extends BaseAdapter {
        private C6982k() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f39155s.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((TabView) ScrollingTabContainerView.this.f39155s.getChildAt(i2)).getTab();
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
            ((TabView) view).m25189q((AbstractC0096k.g) getItem(i2));
            return view;
        }
    }

    private static class toq implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        private WeakReference<ScrollingTabContainerView> f39166k;

        toq(ScrollingTabContainerView scrollingTabContainerView) {
            this.f39166k = new WeakReference<>(scrollingTabContainerView);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WeakReference<ScrollingTabContainerView> weakReference = this.f39166k;
            ScrollingTabContainerView scrollingTabContainerView = weakReference != null ? weakReference.get() : null;
            if (scrollingTabContainerView == null) {
                return;
            }
            ((TabView) view).getTab().f7l8();
            int childCount = scrollingTabContainerView.f39155s.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = scrollingTabContainerView.f39155s.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private static class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        private WeakReference<ScrollingTabContainerView> f39167k;

        /* JADX INFO: renamed from: q */
        private int f39168q;

        zy(ScrollingTabContainerView scrollingTabContainerView, int i2) {
            this.f39167k = new WeakReference<>(scrollingTabContainerView);
            this.f39168q = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            View childAt;
            WeakReference<ScrollingTabContainerView> weakReference = this.f39167k;
            ScrollingTabContainerView scrollingTabContainerView = weakReference != null ? weakReference.get() : null;
            if (scrollingTabContainerView == null || (childAt = scrollingTabContainerView.f39155s.getChildAt(this.f39168q)) == null) {
                return;
            }
            scrollingTabContainerView.smoothScrollTo(childAt.getLeft() - ((scrollingTabContainerView.getWidth() - childAt.getWidth()) / 2), 0);
            scrollingTabContainerView.f39153q = null;
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        this.f39142f = new Paint();
        this.f39140c = -1;
        this.f39146j = false;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f39147k = layoutInflaterFrom;
        C7010k qVar = C7010k.toq(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, toq.ki.f34844k, R.attr.actionBarStyle, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(toq.ki.f76072ek5k);
        this.f39154r = typedArrayObtainStyledAttributes.getBoolean(toq.ki.f76101i1, true);
        this.f39156t = m25181y(drawable);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f39154r) {
            this.f39142f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        setHorizontalScrollBarEnabled(false);
        this.f39143g = qVar.m25258n();
        LinearLayout linearLayout = (LinearLayout) layoutInflaterFrom.inflate(getTabBarLayoutRes(), (ViewGroup) this, false);
        this.f39155s = linearLayout;
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        this.f39151o = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TabView f7l8(AbstractC0096k.g gVar, boolean z2) {
        TabView tabView = (TabView) this.f39147k.inflate(getTabViewLayoutRes(), (ViewGroup) this.f39155s, false);
        tabView.zy(this, gVar, z2);
        if (z2) {
            tabView.setBackground(null);
            tabView.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f39145i));
        } else {
            tabView.setFocusable(true);
            if (this.f39157y == null) {
                this.f39157y = new toq(this);
            }
            tabView.setOnClickListener(this.f39157y);
        }
        if (this.f39155s.getChildCount() != 0) {
            ((LinearLayout.LayoutParams) tabView.getLayoutParams()).setMarginStart(getTabViewMarginHorizontal());
        }
        return tabView;
    }

    private boolean ld6() {
        if (!m25180p()) {
            return false;
        }
        removeView(this.f39152p);
        addView(this.f39155s, new ViewGroup.LayoutParams(-2, -2));
        setTabSelected(this.f39152p.getSelectedItemPosition());
        return false;
    }

    /* JADX INFO: renamed from: p */
    private boolean m25180p() {
        Spinner spinner = this.f39152p;
        return spinner != null && spinner.getParent() == this;
    }

    /* JADX INFO: renamed from: y */
    private Bitmap m25181y(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = this.f39154r ? Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ALPHA_8) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    void cdj(TextView textView) {
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void d3(int i2, float f2, boolean z2, boolean z3) {
        setTabIndicatorPosition(i2, f2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Bitmap bitmap = this.f39156t;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f39148l, getHeight() - this.f39156t.getHeight(), this.f39142f);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m25182g(int i2) {
        Runnable runnable = this.f39153q;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        zy zyVar = new zy(this, i2);
        this.f39153q = zyVar;
        post(zyVar);
    }

    abstract int getDefaultTabTextStyle();

    abstract int getTabBarLayoutRes();

    abstract int getTabContainerHeight();

    public float getTabIndicatorPosition() {
        return this.f39148l;
    }

    abstract int getTabViewLayoutRes();

    abstract int getTabViewMarginHorizontal();

    /* JADX INFO: renamed from: h */
    public void m25183h(int i2) {
        ((TabView) this.f39155s.getChildAt(i2)).m25188n();
        Spinner spinner = this.f39152p;
        if (spinner != null) {
            ((C6982k) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f39144h) {
            requestLayout();
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    /* JADX INFO: renamed from: k */
    public void mo6476k(int i2) {
    }

    public View kja0(ViewGroup viewGroup, View view, TextView textView, ImageView imageView) {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void m25184n(AbstractC0096k.g gVar, boolean z2) {
        TabView tabViewF7l8 = f7l8(gVar, false);
        this.f39155s.addView(tabViewF7l8);
        Spinner spinner = this.f39152p;
        if (spinner != null) {
            ((C6982k) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z2) {
            tabViewF7l8.setSelected(true);
            this.f39140c = this.f39155s.getChildCount() - 1;
        }
        if (this.f39144h) {
            requestLayout();
        }
    }

    public void n7h(int i2) {
        View childAt = this.f39155s.getChildAt(i2);
        scrollTo(childAt.getLeft() - ((getWidth() - childAt.getWidth()) / 2), 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f39153q;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        C7010k qVar = C7010k.toq(getContext());
        setContentHeight(getTabContainerHeight());
        this.f39143g = qVar.m25258n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f39153q;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f39141e = motionEvent.getX();
            this.f39146j = false;
        } else if (motionEvent.getActionMasked() == 2) {
            this.f39146j = Math.abs(motionEvent.getX() - this.f39141e) > ((float) this.f39151o);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.f39146j = false;
        }
        if (!this.f39146j) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(0);
        super.onInterceptTouchEvent(motionEventObtain);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((TabView) view).getTab().f7l8();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.f39155s.getChildAt(this.f39158z) != null) {
            setTabIndicatorPosition(this.f39158z);
            n7h(this.f39158z);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f39155s.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f39150n = -1;
        } else {
            if (childCount > 2) {
                this.f39150n = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.f39150n = (int) (View.MeasureSpec.getSize(i2) * 0.6f);
            }
            this.f39150n = Math.min(this.f39150n, this.f39143g);
        }
        int i4 = this.f39145i;
        if (i4 != -2) {
            i3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, i3);
        int measuredWidth2 = getMeasuredWidth();
        if (!z2 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f39158z);
    }

    /* JADX INFO: renamed from: q */
    public void m25185q(AbstractC0096k.g gVar, int i2, boolean z2) {
        TabView tabViewF7l8 = f7l8(gVar, false);
        this.f39155s.addView(tabViewF7l8, i2);
        Spinner spinner = this.f39152p;
        if (spinner != null) {
            ((C6982k) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z2) {
            tabViewF7l8.setSelected(true);
            this.f39140c = this.f39155s.getChildCount() - 1;
        }
        if (this.f39144h) {
            requestLayout();
        }
    }

    public void qrj(int i2) {
        LinearLayout linearLayout = this.f39155s;
        if (linearLayout != null && linearLayout.getChildAt(i2) != null) {
            this.f39155s.removeViewAt(i2);
        }
        Spinner spinner = this.f39152p;
        if (spinner != null) {
            ((C6982k) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f39144h) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    int m25186s(TextView textView) {
        WeakHashMap<TextView, Integer> weakHashMap;
        return (textView == null || (weakHashMap = this.f39149m) == null || !weakHashMap.containsKey(textView)) ? C7164n.zy(getContext(), getDefaultTabTextStyle()) : this.f39149m.get(textView).intValue();
    }

    public void setAllowCollapse(boolean z2) {
        this.f39144h = z2;
    }

    public void setBadgeVisibility(int i2, boolean z2) {
        ImageView imageView;
        if (i2 <= this.f39155s.getChildCount() - 1 && (imageView = ((TabView) this.f39155s.getChildAt(i2)).f39164y) != null) {
            if (z2) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void setContentHeight(int i2) {
        if (this.f39145i != i2) {
            this.f39145i = i2;
            requestLayout();
        }
    }

    public void setEmbeded(boolean z2) {
        setHorizontalFadingEdgeEnabled(true);
    }

    public void setTabIconWithPosition(int i2, int i3, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        TextView textView;
        if (i2 <= this.f39155s.getChildCount() - 1 && (textView = ((TabView) this.f39155s.getChildAt(i2)).f39162q) != null) {
            textView.setCompoundDrawablePadding(i3);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    public void setTabIndicatorPosition(int i2) {
        setTabIndicatorPosition(i2, 0.0f);
    }

    public void setTabSelected(int i2) {
        setTabSelected(i2, true);
    }

    public void setTextAppearance(int i2, int i3) {
        TextView textView;
        if (i2 < 0 || i2 > this.f39155s.getChildCount() - 1 || (textView = ((TabView) this.f39155s.getChildAt(i2)).f39162q) == null) {
            return;
        }
        if (this.f39149m == null) {
            this.f39149m = new WeakHashMap<>();
        }
        this.f39149m.put(textView, Integer.valueOf(i3));
        textView.setTextAppearance(textView.getContext(), i3);
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void toq(int i2) {
        TabView tabView = (TabView) this.f39155s.getChildAt(i2);
        if (tabView != null) {
            tabView.sendAccessibilityEvent(4);
        }
        setTabIndicatorPosition(i2);
        int i3 = this.f39140c;
        if (i3 != -1) {
            boolean z2 = true;
            if (Math.abs(i3 - i2) == 1) {
                TabView tabView2 = (TabView) this.f39155s.getChildAt(this.f39140c);
                ScrollingTabTextView scrollingTabTextView = tabView2 != null ? (ScrollingTabTextView) tabView2.getTextView() : null;
                ScrollingTabTextView scrollingTabTextView2 = tabView != null ? (ScrollingTabTextView) tabView.getTextView() : null;
                if (scrollingTabTextView != null && scrollingTabTextView2 != null) {
                    if (miuix.internal.util.n7h.x2(this)) {
                        z2 = false;
                        scrollingTabTextView.zy(z2);
                        scrollingTabTextView2.zy(z2);
                    } else {
                        z2 = false;
                        scrollingTabTextView.zy(z2);
                        scrollingTabTextView2.zy(z2);
                    }
                }
            }
        }
        this.f39140c = i2;
    }

    public void x2() {
        this.f39155s.removeAllViews();
        Spinner spinner = this.f39152p;
        if (spinner != null) {
            ((C6982k) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f39144h) {
            requestLayout();
        }
    }

    public void setTabIndicatorPosition(int i2, float f2) {
        if (this.f39156t != null) {
            View childAt = this.f39155s.getChildAt(i2);
            this.f39148l = childAt.getLeft() + ((childAt.getWidth() - this.f39156t.getWidth()) / 2) + ((this.f39155s.getChildAt(i2 + 1) == null ? childAt.getWidth() : (childAt.getWidth() + r4.getWidth()) / 2.0f) * f2);
            invalidate();
        }
    }

    public void setTabSelected(int i2, boolean z2) {
        this.f39158z = i2;
        int childCount = this.f39155s.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f39155s.getChildAt(i3);
            boolean z3 = i3 == i2;
            childAt.setSelected(z3);
            if (z3) {
                if (z2) {
                    m25182g(i2);
                } else {
                    n7h(i2);
                }
            }
            i3++;
        }
    }
}
