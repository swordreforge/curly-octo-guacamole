package miuix.appcompat.internal.app.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import gb.toq;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.app.InterfaceC6952n;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView;
import miuix.core.util.C7080i;
import miuix.internal.util.C7162g;
import miuix.internal.util.C7164n;
import miuix.view.x2;
import wwp.C7745k;
import zy.dd;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarContainer extends FrameLayout implements miuix.view.toq, AbstractC6946k.k {
    private static final int aj = 0;
    private static final int ar = 3;
    private static final int bs = 1;
    private static final int k0 = 2;

    /* JADX INFO: renamed from: a */
    private boolean f39025a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private ActionMenuView f86900ab;
    private int ac;
    protected InterfaceC6990g ad;
    List<InterfaceC6952n> am;
    private Rect an;
    private boolean as;
    private int ax;
    private AnimatorListenerAdapter ay;
    private int az;

    /* JADX INFO: renamed from: b */
    private boolean f39026b;
    private float ba;
    private ActionMenuView bb;
    private AnimatorListenerAdapter be;
    private int bg;
    private boolean bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f86901bo;
    private boolean bp;
    private int bq;
    private boolean bv;

    /* JADX INFO: renamed from: c */
    private Drawable f39027c;

    /* JADX INFO: renamed from: d */
    private Boolean f39028d;

    /* JADX INFO: renamed from: e */
    private Drawable f39029e;

    /* JADX INFO: renamed from: f */
    private Drawable f39030f;

    /* JADX INFO: renamed from: g */
    private int f39031g;

    /* JADX INFO: renamed from: h */
    private boolean f39032h;

    /* JADX INFO: renamed from: i */
    private Animator f39033i;
    private int id;
    private boolean in;

    /* JADX INFO: renamed from: j */
    private boolean f39034j;

    /* JADX INFO: renamed from: k */
    private boolean f39035k;

    /* JADX INFO: renamed from: l */
    private Drawable[] f39036l;

    /* JADX INFO: renamed from: m */
    private boolean f39037m;

    /* JADX INFO: renamed from: n */
    private ActionBarView f39038n;

    /* JADX INFO: renamed from: o */
    private boolean f39039o;

    /* JADX INFO: renamed from: p */
    private int f39040p;

    /* JADX INFO: renamed from: q */
    private View f39041q;

    /* JADX INFO: renamed from: r */
    private Drawable f39042r;

    /* JADX INFO: renamed from: s */
    private ActionBarContextView f39043s;

    /* JADX INFO: renamed from: t */
    private Drawable f39044t;

    /* JADX INFO: renamed from: u */
    private boolean f39045u;

    /* JADX INFO: renamed from: v */
    private Boolean f39046v;

    /* JADX INFO: renamed from: w */
    private Boolean f39047w;

    /* JADX INFO: renamed from: x */
    private final miuix.view.x2 f39048x;

    /* JADX INFO: renamed from: y */
    private boolean f39049y;

    /* JADX INFO: renamed from: z */
    private boolean f39050z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: miuix.appcompat.internal.app.widget.ActionBarContainer.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: g */
        boolean f39051g;

        /* JADX INFO: renamed from: k */
        int f39052k;

        /* JADX INFO: renamed from: n */
        boolean f39053n;

        /* JADX INFO: renamed from: q */
        int f39054q;

        /* JADX INFO: renamed from: y */
        boolean f39055y;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f39052k);
            parcel.writeInt(this.f39054q);
            parcel.writeInt(this.f39053n ? 1 : 0);
            parcel.writeInt(this.f39051g ? 1 : 0);
            parcel.writeInt(this.f39055y ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f39052k = parcel.readInt();
            this.f39054q = parcel.readInt();
            this.f39053n = parcel.readInt() != 0;
            this.f39051g = parcel.readInt() != 0;
            this.f39055y = parcel.readInt() != 0;
        }

        @hyr(api = 24)
        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f39052k = parcel.readInt();
            this.f39054q = parcel.readInt();
            this.f39053n = parcel.readInt() != 0;
            this.f39051g = parcel.readInt() != 0;
            this.f39055y = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarContainer$k */
    class C6965k extends AnimatorListenerAdapter {
        C6965k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarContainer.this.setVisibility(8);
            ActionBarContainer.this.f39033i = null;
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarContainer$q */
    class RunnableC6966q implements Runnable {
        RunnableC6966q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarContainer.this.dd(true);
        }
    }

    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarContainer.this.f39033i = null;
        }
    }

    class zy implements x2.InterfaceC7388k {
        zy() {
        }

        @Override // miuix.view.x2.InterfaceC7388k
        /* JADX INFO: renamed from: k */
        public void mo25107k(miuix.view.x2 x2Var) {
            boolean zM25951q = C7164n.m25951q(ActionBarContainer.this.getContext(), toq.C6055q.fl, true);
            x2Var.x2(miuix.view.x2.f7l8(ActionBarContainer.this.getContext(), ActionBarContainer.this.f39044t, zM25951q ? C7745k.k.toq.f98862toq : C7745k.k.C8141k.f98860toq), zM25951q ? C7745k.toq.C8142toq.f45385k : C7745k.toq.k.f45384k, 66);
        }

        @Override // miuix.view.x2.InterfaceC7388k
        public void toq(boolean z2) {
            if (ActionBarContainer.this.f39034j) {
                ActionBarContainer.this.f86901bo = z2;
                if (ActionBarContainer.this.f86900ab != null) {
                    boolean zBooleanValue = ActionBarContainer.this.f39028d != null ? ActionBarContainer.this.f39028d.booleanValue() : ActionBarContainer.this.f86901bo;
                    if (z2) {
                        ActionBarContainer.this.f86900ab.setSupportBlur(true);
                        ActionBarContainer.this.f86900ab.setEnableBlur(true);
                    }
                    ActionBarContainer.this.f86900ab.mo25100g(zBooleanValue);
                }
            }
        }

        @Override // miuix.view.x2.InterfaceC7388k
        public void zy(boolean z2) {
            if (z2) {
                ActionBarContainer.this.f39025a = false;
            } else {
                ActionBarContainer.this.f39025a = true;
            }
            if (ActionBarContainer.this.f39038n != null) {
                ActionBarContainer.this.f39038n.setApplyBgBlur(z2);
            }
            if (ActionBarContainer.this.f39043s != null) {
                ActionBarContainer.this.f39043s.m25126u(z2);
            }
            ActionBarContainer.this.invalidate();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    private int fn3e(ActionMenuView actionMenuView) {
        if (actionMenuView == null || actionMenuView.getVisibility() != 0 || actionMenuView.getAlpha() == 0.0f || actionMenuView.getCollapsedHeight() <= 0) {
            return 0;
        }
        return Math.max(0, (int) (actionMenuView.getCollapsedHeight() - actionMenuView.getTranslationY()));
    }

    /* JADX INFO: renamed from: i */
    private int m25095i(ActionMenuView actionMenuView) {
        if (actionMenuView == null || actionMenuView.getVisibility() != 0 || actionMenuView.getAlpha() == 0.0f || actionMenuView.getCollapsedHeight() <= 0) {
            return 0;
        }
        return Math.max(0, actionMenuView.getCollapsedHeight());
    }

    private void ki(View view) {
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = this.an;
        marginLayoutParams.topMargin = rect != null ? rect.top : 0;
        view.setLayoutParams(marginLayoutParams);
    }

    private void lvui() {
        TypedValue typedValueX2;
        if (this.f39034j && (typedValueX2 = C7164n.x2(getContext(), toq.C6055q.f76537hyr)) != null && typedValueX2.type == 6) {
            float fLd6 = C7080i.ld6(getContext());
            this.az = View.MeasureSpec.makeMeasureSpec((int) typedValueX2.getFraction(fLd6, fLd6), Integer.MIN_VALUE);
        }
    }

    @SuppressLint({"WrongCall", "WrongConstant"})
    private void o1t(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        int i4 = this.az;
        if (i4 != -1) {
            i3 = i4;
        }
        super.onMeasure(i2, i3);
        int childCount = getChildCount();
        int iMax = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            iMax = Math.max(iMax, getChildAt(i5).getMeasuredHeight());
        }
        if (iMax == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        ActionMenuView actionMenuView = this.f86900ab;
        if (actionMenuView == null || !actionMenuView.cdj()) {
            return;
        }
        ActionMenuView actionMenuView2 = this.f86900ab;
        if (!(actionMenuView2 instanceof ResponsiveActionMenuView) || ((ResponsiveActionMenuView) actionMenuView2).d2ok()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), iMax);
    }

    /* JADX INFO: renamed from: r */
    private void m25097r() {
        ActionBarView actionBarView;
        Drawable[] drawableArr;
        if (this.in || this.f39034j || (actionBarView = this.f39038n) == null || this.f39044t == null || (drawableArr = this.f39036l) == null || drawableArr.length < 3) {
            return;
        }
        char c2 = 0;
        if (actionBarView.ukdy()) {
            c2 = 1;
            int displayOptions = this.f39038n.getDisplayOptions();
            if ((displayOptions & 2) != 0 || (displayOptions & 4) != 0 || (displayOptions & 16) != 0) {
                c2 = 2;
            }
        }
        Drawable drawable = this.f39036l[c2];
        if (drawable != null) {
            this.f39044t = drawable;
        }
    }

    void a9(ActionMenuView actionMenuView) {
        if (this.f86900ab == actionMenuView) {
            this.f86900ab = null;
        }
    }

    void cdj(InterfaceC6952n interfaceC6952n) {
        if (interfaceC6952n != null) {
            this.am.add(interfaceC6952n);
        }
    }

    void d2ok() {
        this.f39046v = null;
        mo25100g(this.f39045u);
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void d3(int i2, float f2, boolean z2, boolean z3) {
        ActionMenuView actionMenuView;
        if (!this.f39034j || (actionMenuView = this.f86900ab) == null) {
            return;
        }
        actionMenuView.t8r(i2, f2, z2, z3);
    }

    public void dd(boolean z2) {
        if (this.f39050z) {
            return;
        }
        this.f39050z = true;
        Animator animator = this.f39033i;
        if (animator != null) {
            animator.cancel();
        }
        setVisibility(0);
        if (!z2) {
            setTranslationY(0.0f);
            return;
        }
        if (this.f39034j) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "TranslationY", getHeight(), 0.0f);
            this.f39033i = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(C7162g.m25943k() ? getContext().getResources().getInteger(R.integer.config_shortAnimTime) : 0L);
            this.f39033i.addListener(this.be);
            this.f39033i.start();
            ActionMenuView actionMenuView = this.f86900ab;
            if (actionMenuView != null) {
                actionMenuView.startLayoutAnimation();
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.bp) {
            post(new RunnableC6966q());
            this.bp = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f39044t;
        if (drawable != null && drawable.isStateful()) {
            this.f39044t.setState(getDrawableState());
        }
        Drawable drawable2 = this.f39030f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f39030f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f39027c;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f39027c.setState(getDrawableState());
    }

    void eqxt(InterfaceC6952n interfaceC6952n) {
        if (interfaceC6952n != null) {
            this.am.remove(interfaceC6952n);
        }
    }

    public boolean fti(View view, View view2, int i2, int i3) {
        ActionBarContextView actionBarContextView = this.f39043s;
        return (actionBarContextView == null || actionBarContextView.getVisibility() != 0) ? this.f39038n.mcp(view, view2, i2, i3) : this.f39043s.mcp(view, view2, i2, i3);
    }

    void fu4(ActionMenuView actionMenuView) {
        this.bb = actionMenuView;
        if (actionMenuView == null || !mo25103q()) {
            return;
        }
        Boolean bool = this.f39028d;
        actionMenuView.mo25100g(bool != null ? bool.booleanValue() : mo25102n());
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: g */
    public void mo25100g(boolean z2) {
        if (this.f39034j) {
            return;
        }
        this.f39048x.mo25100g(z2);
    }

    InterfaceC6990g getActionBarCoordinateListener() {
        return this.ad;
    }

    int getCollapsedHeight() {
        int collapsedHeight;
        int i2;
        ActionBarContextView actionBarContextView = this.f39043s;
        if ((actionBarContextView == null || actionBarContextView.getVisibility() == 8 || this.f39043s.getMeasuredHeight() <= 0) ? false : true) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f39043s.getLayoutParams();
            collapsedHeight = this.f39043s.getCollapsedHeight();
            i2 = marginLayoutParams.topMargin;
        } else {
            ActionBarView actionBarView = this.f39038n;
            if (actionBarView == null) {
                return 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) actionBarView.getLayoutParams();
            collapsedHeight = this.f39038n.getCollapsedHeight();
            i2 = marginLayoutParams2.topMargin;
        }
        return collapsedHeight + i2;
    }

    int getExpandedHeight() {
        int expandedHeight;
        int i2;
        ActionBarContextView actionBarContextView = this.f39043s;
        if ((actionBarContextView == null || actionBarContextView.getVisibility() == 8 || this.f39043s.getMeasuredHeight() <= 0) ? false : true) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f39043s.getLayoutParams();
            expandedHeight = this.f39043s.getExpandedHeight();
            i2 = marginLayoutParams.topMargin;
        } else {
            ActionBarView actionBarView = this.f39038n;
            if (actionBarView == null) {
                return 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) actionBarView.getLayoutParams();
            expandedHeight = this.f39038n.getExpandedHeight();
            i2 = marginLayoutParams2.topMargin;
        }
        return expandedHeight + i2;
    }

    int getInsetHeight() {
        if (this.f39034j) {
            return Math.max(Math.max(0, fn3e(this.bb)), fn3e(this.f86900ab));
        }
        return 0;
    }

    public Rect getPendingInsets() {
        return this.an;
    }

    public Drawable getPrimaryBackground() {
        return this.f39044t;
    }

    int getSplitCollapsedHeight() {
        if (this.f39034j) {
            return Math.max(Math.max(0, m25095i(this.bb)), m25095i(this.f86900ab));
        }
        return 0;
    }

    public View getTabContainer() {
        return this.f39041q;
    }

    public void gvn7() {
        if (this.f39038n.getMenuView() != null) {
            this.f39038n.getMenuView().startLayoutAnimation();
        }
    }

    void jk(ActionMenuView actionMenuView) {
        this.f86900ab = actionMenuView;
        if (actionMenuView == null || !mo25103q()) {
            return;
        }
        actionMenuView.setSupportBlur(mo25103q());
        actionMenuView.setEnableBlur(mo25102n());
        Boolean bool = this.f39028d;
        actionMenuView.mo25100g(bool != null ? bool.booleanValue() : mo25102n());
    }

    public void jp0y(View view, int i2) {
        ActionBarContextView actionBarContextView = this.f39043s;
        if (actionBarContextView != null && actionBarContextView.getVisibility() == 0) {
            this.f39043s.jk(view, i2);
        } else {
            if (this.f39034j || getVisibility() == 8) {
                return;
            }
            this.f39038n.jk(view, i2);
        }
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    /* JADX INFO: renamed from: k */
    public void mo6476k(int i2) {
    }

    /* JADX INFO: renamed from: l */
    void m25101l(boolean z2) {
        if (z2) {
            this.f39025a = false;
        } else {
            this.f39025a = true;
        }
        ActionBarContextView actionBarContextView = this.f39043s;
        if (actionBarContextView != null) {
            actionBarContextView.m25126u(z2);
        }
        ActionBarView actionBarView = this.f39038n;
        if (actionBarView != null) {
            actionBarView.setApplyBgBlur(z2);
        }
        invalidate();
    }

    public void mcp(View view, View view2, int i2, int i3) {
        ActionBarContextView actionBarContextView = this.f39043s;
        if (actionBarContextView != null && actionBarContextView.getVisibility() == 0) {
            this.f39043s.mo25125t(view, view2, i2, i3);
        } else {
            if (this.f39034j || getVisibility() == 8) {
                return;
            }
            this.f39038n.mo25125t(view, view2, i2, i3);
        }
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: n */
    public boolean mo25102n() {
        return this.f39048x.mo25102n();
    }

    public void ncyb(boolean z2) {
        this.f39047w = Boolean.valueOf(z2);
        m25101l(z2);
    }

    public boolean ni7() {
        return this.bl;
    }

    public void oc() {
        if (this.f39038n.getMenuView() != null) {
            this.f39038n.getMenuView().startLayoutAnimation();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        lvui();
        miuix.view.x2 x2Var = this.f39048x;
        if (x2Var != null) {
            x2Var.m26788s();
            if (this.f39048x.mo25102n() || this.f39047w != null) {
                return;
            }
            m25101l(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setActionBarCoordinateListener(null);
        this.am.clear();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (getWidth() == 0 || getHeight() == 0 || this.f39034j || (drawable = this.f39044t) == null || !this.f39025a) {
            return;
        }
        drawable.draw(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f39038n = (ActionBarView) findViewById(toq.C6054p.f76448x9kr);
        this.f39043s = (ActionBarContextView) findViewById(toq.C6054p.f76455y9n);
        ActionBarView actionBarView = this.f39038n;
        if (actionBarView != null) {
            actionBarView.n7h(this.am);
            this.f39031g = this.f39038n.getExpandState();
            this.f39049y = this.f39038n.fn3e();
        }
        ActionBarContextView actionBarContextView = this.f39043s;
        if (actionBarContextView != null) {
            this.f39040p = actionBarContextView.getExpandState();
            this.f39032h = this.f39043s.fn3e();
            this.f39043s.setActionBarView(this.f39038n);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !this.f39034j;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f39035k || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int measuredHeight;
        int measuredHeight2;
        Rect rect;
        if (this.f39034j) {
            o1t(i2, i3);
            return;
        }
        View view = this.f39041q;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), this.id, this.f39041q.getPaddingRight(), this.f39041q.getPaddingBottom());
        }
        ki(this.f39038n);
        ki(this.f39043s);
        super.onMeasure(i2, i3);
        ActionBarView actionBarView = this.f39038n;
        boolean z2 = (actionBarView == null || actionBarView.getVisibility() == 8 || this.f39038n.getMeasuredHeight() <= 0) ? false : true;
        if (z2) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f39038n.getLayoutParams();
            measuredHeight = this.f39038n.mbx() ? layoutParams.topMargin : layoutParams.bottomMargin + this.f39038n.getMeasuredHeight() + layoutParams.topMargin;
        } else {
            measuredHeight = 0;
        }
        ActionBarContextView actionBarContextView = this.f39043s;
        if ((actionBarContextView == null || actionBarContextView.getVisibility() == 8 || this.f39043s.getMeasuredHeight() <= 0) ? false : true) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f39043s.getLayoutParams();
            measuredHeight2 = this.f39043s.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
        } else {
            measuredHeight2 = 0;
        }
        if (measuredHeight > 0 || measuredHeight2 > 0) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(measuredHeight, measuredHeight2));
        }
        View view2 = this.f39041q;
        if (view2 != null && view2.getVisibility() != 8 && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            setMeasuredDimension(getMeasuredWidth(), Math.min(measuredHeight + this.f39041q.getMeasuredHeight(), View.MeasureSpec.getSize(i3)) + ((z2 || (rect = this.an) == null) ? 0 : rect.top));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && childAt.getMeasuredHeight() > 0 && childAt.getMeasuredWidth() > 0) {
                i4++;
            }
        }
        if (i4 == 0) {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i2 = savedState.f39052k;
        if (i2 == -1) {
            this.f39046v = null;
        } else if (i2 == 0) {
            this.f39046v = Boolean.FALSE;
        } else if (i2 == 1) {
            this.f39046v = Boolean.TRUE;
        }
        int i3 = savedState.f39054q;
        if (i3 == -1) {
            this.f39028d = null;
        } else if (i3 == 0) {
            this.f39028d = Boolean.FALSE;
        } else if (i3 == 1) {
            this.f39028d = Boolean.TRUE;
        }
        if (savedState.f39053n) {
            setSupportBlur(true);
        }
        if (savedState.f39051g) {
            setEnableBlur(true);
        }
        if (savedState.f39055y && mo25102n()) {
            mo25100g(true);
        }
    }

    @Override // android.view.View
    @dd
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Boolean bool = this.f39046v;
        int i2 = 1;
        savedState.f39052k = bool == null ? -1 : bool.booleanValue() ? 1 : 0;
        Boolean bool2 = this.f39028d;
        if (bool2 == null) {
            i2 = -1;
        } else if (!bool2.booleanValue()) {
            i2 = 0;
        }
        savedState.f39054q = i2;
        savedState.f39053n = mo25103q();
        savedState.f39051g = mo25102n();
        savedState.f39055y = zy();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f39034j && super.onTouchEvent(motionEvent);
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: q */
    public boolean mo25103q() {
        return this.f39048x.mo25103q();
    }

    void setActionBarBlur(@dd Boolean bool) {
        if (mo25102n()) {
            if (bool == null) {
                this.f39046v = null;
                mo25100g(this.f39045u);
                return;
            }
            Boolean bool2 = this.f39046v;
            if (bool2 == null || bool2.booleanValue() != bool.booleanValue()) {
                this.f39046v = bool;
                mo25100g(bool.booleanValue());
            }
        }
    }

    void setActionBarBlurByNestedScrolled(boolean z2) {
        this.f39045u = z2;
        if (this.f39046v != null) {
            return;
        }
        mo25100g(z2);
    }

    public void setActionBarContextView(ActionBarContextView actionBarContextView) {
        this.f39043s = actionBarContextView;
        if (actionBarContextView != null) {
            actionBarContextView.setActionBarView(this.f39038n);
            this.f39040p = this.f39043s.getExpandState();
            this.f39032h = this.f39043s.fn3e();
        }
    }

    void setActionBarCoordinateListener(InterfaceC6990g interfaceC6990g) {
        this.ad = interfaceC6990g;
    }

    @Override // android.view.View
    public void setAlpha(float f2) {
        super.setAlpha(f2);
    }

    public void setCoordinatedOffsetYInSearchModeAnimation(int i2) {
        this.bg = i2;
        InterfaceC6990g interfaceC6990g = this.ad;
        if (interfaceC6990g != null) {
            interfaceC6990g.mo25223k(this.ax, this.ba, this.ac + i2, this.bq);
        }
    }

    @Override // miuix.view.toq
    public void setEnableBlur(boolean z2) {
        this.f39048x.setEnableBlur(z2);
    }

    public void setIsMiuixFloating(boolean z2) {
        this.bl = z2;
        ActionBarView actionBarView = this.f39038n;
        if (actionBarView != null) {
            if (z2) {
                this.f39031g = actionBarView.getExpandState();
                this.f39049y = this.f39038n.fn3e();
                this.f39038n.setExpandState(0);
                this.f39038n.setResizable(false);
            } else {
                actionBarView.setResizable(this.f39049y);
                this.f39038n.setExpandState(this.f39031g);
            }
        }
        ActionBarContextView actionBarContextView = this.f39043s;
        if (actionBarContextView != null) {
            if (!z2) {
                actionBarContextView.setResizable(this.f39032h);
                this.f39043s.setExpandState(this.f39040p);
            } else {
                this.f39040p = actionBarContextView.getExpandState();
                this.f39032h = this.f39043s.fn3e();
                this.f39043s.setExpandState(0);
                this.f39043s.setResizable(false);
            }
        }
    }

    public void setMiuixFloatingOnInit(boolean z2) {
        this.bl = z2;
        ActionBarView actionBarView = this.f39038n;
        if (actionBarView != null && z2) {
            this.f39049y = actionBarView.fn3e();
            this.f39038n.setExpandState(0);
            this.f39038n.setResizable(false);
            this.f39031g = this.f39038n.getExpandState();
        }
        ActionBarContextView actionBarContextView = this.f39043s;
        if (actionBarContextView == null || !z2) {
            return;
        }
        this.f39032h = actionBarContextView.fn3e();
        this.f39043s.setExpandState(0);
        this.f39043s.setResizable(false);
        this.f39040p = this.f39043s.getExpandState();
    }

    public void setOverlayMode(boolean z2) {
        this.as = z2;
    }

    public void setPendingInsets(Rect rect) {
        if (this.f39034j) {
            return;
        }
        if (this.an == null) {
            this.an = new Rect();
        }
        if (Objects.equals(this.an, rect)) {
            return;
        }
        this.an.set(rect);
        ki(this.f39038n);
        ki(this.f39043s);
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f39044t;
        Rect rect = null;
        if (drawable2 != null) {
            Rect bounds = drawable2.getBounds();
            this.f39044t.setCallback(null);
            unscheduleDrawable(this.f39044t);
            rect = bounds;
        }
        this.f39044t = drawable;
        boolean z2 = true;
        if (drawable != null) {
            drawable.setCallback(this);
            if (rect == null) {
                requestLayout();
            } else {
                this.f39044t.setBounds(rect);
            }
            this.in = true;
        } else {
            this.in = false;
        }
        if (!this.f39034j ? this.f39044t != null || this.f39030f != null : this.f39027c != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    void setSplitActionBarBlur(@dd Boolean bool) {
        if (this.f39034j) {
            this.f39028d = bool;
            ActionMenuView actionMenuView = this.bb;
            if (actionMenuView != null) {
                actionMenuView.mo25100g(bool != null ? bool.booleanValue() : this.f86901bo);
            }
            ActionMenuView actionMenuView2 = this.f86900ab;
            if (actionMenuView2 != null) {
                actionMenuView2.mo25100g(bool != null ? bool.booleanValue() : this.f86901bo);
            }
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.f39027c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f39027c);
        }
        this.f39027c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        boolean z2 = true;
        if (!this.f39034j ? this.f39044t != null || this.f39030f != null : this.f39027c != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f39030f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f39030f);
        }
        this.f39030f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        boolean z2 = true;
        if (!this.f39034j ? this.f39044t != null || this.f39030f != null : this.f39027c != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        View view = this.f39041q;
        if (view != null) {
            view.setBackground(this.f39030f);
        }
    }

    @Override // miuix.view.toq
    public void setSupportBlur(boolean z2) {
        this.f39048x.setSupportBlur(z2);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f39041q;
        if (view != null) {
            removeView(view);
        }
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
            this.id = scrollingTabContainerView.getPaddingTop();
        } else {
            View view2 = this.f39041q;
            if (view2 != null) {
                view2.setBackground(null);
            }
        }
        this.f39041q = scrollingTabContainerView;
    }

    public void setTransitioning(boolean z2) {
        this.f39035k = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f39044t;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f39030f;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f39027c;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* JADX INFO: renamed from: t */
    public void m25104t(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        int i7 = iArr[1];
        ActionBarContextView actionBarContextView = this.f39043s;
        if (actionBarContextView != null && actionBarContextView.getVisibility() == 0) {
            this.f39043s.wvg(view, i2, i3, i4, i5, i6, iArr, iArr2);
        } else if (!this.f39034j && getVisibility() != 8) {
            this.f39038n.wvg(view, i2, i3, i4, i5, i6, iArr, iArr2);
        }
        int i8 = iArr[1] - i7;
        if (!this.as || i5 >= 0 || i8 > 0) {
            return;
        }
        setActionBarBlurByNestedScrolled(false);
        if (this.f39034j || getVisibility() != 8) {
            return;
        }
        this.f39038n.setExpandState(1);
        InterfaceC6990g interfaceC6990g = this.ad;
        if (interfaceC6990g != null) {
            int i9 = this.bq;
            interfaceC6990g.mo25223k(1, 0.0f, i9, i9);
        }
    }

    public void t8r() {
        this.f39026b = false;
    }

    @Override // miuix.appcompat.app.AbstractC6946k.k
    public void toq(int i2) {
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f39044t && !this.f39034j) || (drawable == this.f39030f && this.f39037m) || ((drawable == this.f39027c && this.f39034j) || super.verifyDrawable(drawable));
    }

    public void wvg(View view, int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        ActionBarContextView actionBarContextView = this.f39043s;
        if (actionBarContextView != null && actionBarContextView.getVisibility() == 0) {
            this.f39043s.o1t(view, i2, i3, iArr, i4, iArr2);
        } else if (!this.f39034j && getVisibility() != 8) {
            this.f39038n.o1t(view, i2, i3, iArr, i4, iArr2);
        }
        if (!this.as || i3 <= 0 || i3 - iArr[1] <= 0) {
            return;
        }
        setActionBarBlurByNestedScrolled(true);
        if (this.f39034j || getVisibility() != 8) {
            return;
        }
        this.f39038n.setExpandState(0);
        InterfaceC6990g interfaceC6990g = this.ad;
        if (interfaceC6990g != null) {
            interfaceC6990g.mo25223k(0, 1.0f, 0, this.bq);
        }
    }

    public void x9kr() {
        this.f39026b = true;
    }

    /* JADX INFO: renamed from: z */
    void m25105z(ActionMenuView actionMenuView) {
        if (this.bb == actionMenuView) {
            this.bb = null;
        }
    }

    public void zurt(boolean z2) {
        if (this.f39050z) {
            this.f39050z = false;
            Animator animator = this.f39033i;
            if (animator != null) {
                animator.cancel();
            }
            if (!z2 || !this.f39034j) {
                setVisibility(8);
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "TranslationY", 0.0f, getHeight());
            this.f39033i = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(C7162g.m25943k() ? getContext().getResources().getInteger(R.integer.config_shortAnimTime) : 0L);
            this.f39033i.addListener(this.ay);
            this.f39033i.start();
        }
    }

    @Override // miuix.view.toq
    public boolean zy() {
        return this.f39048x.zy();
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39050z = true;
        this.f39045u = false;
        this.f86901bo = false;
        this.f39046v = null;
        this.f39028d = null;
        this.f39047w = null;
        this.f86900ab = null;
        this.bb = null;
        this.in = false;
        this.az = -1;
        this.ba = 0.0f;
        this.ax = 0;
        this.bq = 0;
        this.ac = 0;
        this.ad = null;
        this.am = new CopyOnWriteArrayList();
        this.ay = new C6965k();
        this.be = new toq();
        setBackground(null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.f34844k);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(toq.ki.f76238zy);
        this.f39044t = drawable;
        this.f39036l = new Drawable[]{drawable, typedArrayObtainStyledAttributes.getDrawable(toq.ki.f76083fn3e), typedArrayObtainStyledAttributes.getDrawable(toq.ki.f76236zurt)};
        this.bv = typedArrayObtainStyledAttributes.getBoolean(toq.ki.f76112jp0y, false);
        if (getId() == toq.C6054p.cyg) {
            this.f39034j = true;
            this.f39027c = typedArrayObtainStyledAttributes.getDrawable(toq.ki.f34842i);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f39034j) {
            setPadding(0, 0, 0, 0);
        }
        lvui();
        setWillNotDraw(!this.f39034j ? !(this.f39044t == null && this.f39030f == null) : this.f39027c != null);
        this.f39025a = true;
        this.f39048x = new miuix.view.x2(context, this, false, new zy());
    }
}
