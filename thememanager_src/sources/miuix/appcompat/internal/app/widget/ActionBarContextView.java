package miuix.appcompat.internal.app.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import gb.toq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.internal.app.widget.toq;
import miuix.appcompat.internal.view.C7010k;
import miuix.appcompat.internal.view.C7041q;
import miuix.appcompat.internal.view.menu.action.ActionMenuPresenter;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.appcompat.internal.view.menu.action.MenuItemC7021k;
import miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView;
import miuix.internal.util.C7164n;
import miuix.view.InterfaceC7382k;
import xm.C7752g;
import xm.C7756y;
import zy.dd;
import zy.hyr;
import zy.uv6;

/* JADX INFO: loaded from: classes3.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class ActionBarContextView extends miuix.appcompat.internal.app.widget.toq implements zurt {
    private static final int afw = 0;
    private static final int eht = 2;
    private static final float ls9 = 0.9f;
    private static final int lw58 = 1;
    private static final int n5ij = 0;
    private static final int oyp = 1;
    private static final int qns = 50;
    private static final float ut = 986.96f;
    private static final float wh6 = 322.27f;
    private Button ac;
    private Button ad;
    private Drawable aj;
    private TextView am;
    private MenuItemC7021k ar;
    private CharSequence ax;
    private int ay;
    private MenuItemC7021k bc;
    private SpringAnimation bd;
    private Drawable be;
    private LinearLayout bq;
    private boolean bs;
    private WeakReference<ActionMode> bu;
    private View cw14;
    private ActionBarView d1cy;
    private boolean dy;
    private boolean ei;
    private toq.C8098toq hp;
    private boolean k0;
    private View.OnClickListener k6e;
    private toq.C8098toq mjvl;
    private int ndjo;
    private int q7k9;
    private TextView s8y;
    private boolean sk1t;
    private int tgs;
    private int th6;
    private boolean tlhn;
    private boolean vb6;
    private int w97r;
    private boolean wra;
    private Scroller xhv;
    private int xk5;
    private AnimConfig xqx;
    private FrameLayout xy8;
    private List<InterfaceC7382k> yl25;
    private Runnable zm;
    private float zmmu;
    private TransitionListener zr5t;
    private boolean zsl;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: miuix.appcompat.internal.app.widget.ActionBarContextView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ViewOnClickListenerC6968k) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: g */
        public int f39060g;

        /* JADX INFO: renamed from: k */
        public CharSequence f39061k;

        /* JADX INFO: renamed from: n */
        public boolean f39062n;

        /* JADX INFO: renamed from: q */
        public CharSequence f39063q;

        /* synthetic */ SavedState(Parcel parcel, ClassLoader classLoader, ViewOnClickListenerC6968k viewOnClickListenerC6968k) {
            this(parcel, classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f39062n ? 1 : 0);
            TextUtils.writeToParcel(this.f39061k, parcel, 0);
            TextUtils.writeToParcel(this.f39063q, parcel, 0);
            parcel.writeInt(this.f39060g);
        }

        /* synthetic */ SavedState(Parcel parcel, ViewOnClickListenerC6968k viewOnClickListenerC6968k) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f39062n = parcel.readInt() != 0;
            this.f39061k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f39063q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f39060g = parcel.readInt();
        }

        @hyr(api = 24)
        private SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f39062n = parcel.readInt() != 0;
            this.f39061k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f39063q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f39060g = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarContextView$k */
    class ViewOnClickListenerC6968k implements View.OnClickListener {
        ViewOnClickListenerC6968k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7041q c7041q;
            MenuItemC7021k menuItemC7021k = view.getId() == 16908313 ? ActionBarContextView.this.ar : ActionBarContextView.this.bc;
            if (ActionBarContextView.this.bu == null || (c7041q = (C7041q) ActionBarContextView.this.bu.get()) == null) {
                return;
            }
            c7041q.mo24868s((miuix.appcompat.internal.view.menu.f7l8) c7041q.getMenu(), menuItemC7021k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarContextView$q */
    static class C6969q {

        /* JADX INFO: renamed from: k */
        private int f39065k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private k f86902toq;

        /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarContextView$q$k */
        interface k {
            /* JADX INFO: renamed from: k */
            void mo25131k();
        }

        public C6969q(int i2, k kVar) {
            this.f39065k = i2;
            this.f86902toq = kVar;
        }

        /* JADX INFO: renamed from: k */
        public void m25130k() {
            int i2 = this.f39065k - 1;
            this.f39065k = i2;
            if (i2 == 0) {
                this.f86902toq.mo25131k();
            }
        }
    }

    class toq extends TransitionListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C6969q f39066g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f39067k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f39068n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f39069q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ ActionBarOverlayLayout f86904toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ int f86905zy;

        toq(boolean z2, ActionBarOverlayLayout actionBarOverlayLayout, int i2, int i3, int i4, C6969q c6969q) {
            this.f39067k = z2;
            this.f86904toq = actionBarOverlayLayout;
            this.f86905zy = i2;
            this.f39069q = i3;
            this.f39068n = i4;
            this.f39066g = c6969q;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            if (ActionBarContextView.this.dy) {
                return;
            }
            ActionBarContextView.this.zy(this.f39067k);
            ActionBarContextView.this.dy = true;
            ActionBarContextView.this.ei = true;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            ActionBarContextView.this.ei = false;
            this.f39066g.m25130k();
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, View.TRANSLATION_Y.getName());
            if (updateInfoFindByName == null) {
                return;
            }
            float floatValue = updateInfoFindByName.getFloatValue();
            this.f86904toq.mo25066k((int) (this.f86905zy - floatValue), 1);
            int i2 = this.f39069q;
            int i3 = this.f39068n;
            ActionBarContextView.this.mo25124s(this.f39067k, i2 == i3 ? 1.0f : (floatValue - i3) / (i2 - i3));
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionBarContextView.this.xhv.computeScrollOffset()) {
                ActionBarContextView actionBarContextView = ActionBarContextView.this;
                actionBarContextView.th6 = actionBarContextView.xhv.getCurrY() - ActionBarContextView.this.q7k9;
                ActionBarContextView.this.requestLayout();
                if (!ActionBarContextView.this.xhv.isFinished()) {
                    ActionBarContextView.this.postOnAnimation(this);
                } else if (ActionBarContextView.this.xhv.getCurrY() == ActionBarContextView.this.q7k9) {
                    ActionBarContextView.this.setExpandState(0);
                } else if (ActionBarContextView.this.xhv.getCurrY() == ActionBarContextView.this.q7k9 + ActionBarContextView.this.xy8.getMeasuredHeight()) {
                    ActionBarContextView.this.setExpandState(1);
                }
            }
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m25108a() {
        ActionMenuView actionMenuView;
        setSplitAnimating(false);
        this.dy = false;
        mo25118g(this.sk1t);
        if (this.w97r == 2) {
            mo25122n();
        }
        this.w97r = 0;
        this.bd = null;
        setVisibility(this.sk1t ? 0 : 8);
        if (this.f39327t != null && (actionMenuView = this.f39316i) != null) {
            actionMenuView.setVisibility(this.sk1t ? 0 : 8);
        }
        Folme.clean(this.f39316i);
    }

    /* JADX INFO: renamed from: e */
    private void m25111e(float f2) {
        float fMin = 1.0f - Math.min(1.0f, f2 * 3.0f);
        int i2 = this.f39309b;
        if (i2 == 2) {
            if (fMin > 0.0f) {
                this.mjvl.m25231k(0.0f, 0, 20, this.f39324q);
            } else {
                this.mjvl.m25231k(1.0f, 0, 0, this.f39318k);
            }
            this.hp.m25231k(fMin, 0, 0, this.f39326s);
            return;
        }
        if (i2 == 1) {
            this.mjvl.m25231k(0.0f, 0, 20, this.f39324q);
            this.hp.m25231k(1.0f, 0, 0, this.f39326s);
        } else if (i2 == 0) {
            this.mjvl.m25231k(1.0f, 0, 0, this.f39318k);
            this.hp.m25231k(0.0f, 0, 0, this.f39326s);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m25113j() {
        ActionBarContainer actionBarContainer;
        setBackground(null);
        if (!this.f39325r || (actionBarContainer = this.f39327t) == null) {
            return;
        }
        actionBarContainer.m25101l(true);
    }

    private void lv5(int i2, int i3) {
        Button button = i2 == 16908313 ? this.ac : i2 == 16908314 ? this.ad : null;
        if (button == null) {
            return;
        }
        if (toq.C6057y.sm == i3 || toq.C6057y.f76888m4 == i3 || toq.C6057y.f76928r8s8 == i3) {
            button.setContentDescription(getResources().getString(toq.C6051h.f75910qh4d));
            return;
        }
        if (toq.C6057y.xo == i3 || toq.C6057y.f76964wx16 == i3 || toq.C6057y.f76941uc == i3) {
            button.setContentDescription(getResources().getString(toq.C6051h.f75839hyow));
            return;
        }
        if (toq.C6057y.wh == i3 || toq.C6057y.f76911o5 == i3 || toq.C6057y.f76823ec == i3) {
            button.setContentDescription(getResources().getString(toq.C6051h.f75959xzl));
            return;
        }
        if (toq.C6057y.bmt3 == i3 || toq.C6057y.f76932se == i3 || toq.C6057y.f76803bwp == i3) {
            button.setContentDescription(getResources().getString(toq.C6051h.f75957xtb7));
        } else if (toq.C6057y.cp == i3 || toq.C6057y.f46244do == i3 || toq.C6057y.f76861ixz == i3) {
            button.setContentDescription(getResources().getString(toq.C6051h.f75955xblq));
        }
    }

    /* JADX INFO: renamed from: m */
    private SpringAnimation m25115m(View view, float f2, float f3, float f4) {
        SpringAnimation springAnimation = new SpringAnimation(view, ViewProperty.ALPHA, f4);
        springAnimation.setStartValue(f3);
        springAnimation.getSpring().setStiffness(f2);
        springAnimation.getSpring().setDampingRatio(ls9);
        springAnimation.setMinimumVisibleChange(0.00390625f);
        return springAnimation;
    }

    private void nmn5() {
        ActionBarContainer actionBarContainer;
        setBackground(this.aj);
        if (!this.f39325r || (actionBarContainer = this.f39327t) == null) {
            return;
        }
        actionBarContainer.m25101l(false);
    }

    private boolean nn86() {
        boolean z2 = (!fn3e() && getExpandState() == 0) || this.am.getPaint().measureText(this.ax.toString()) <= ((float) this.am.getMeasuredWidth());
        if (!C7010k.toq(getContext()).m25261s() || z2) {
            return z2;
        }
        return true;
    }

    private void setSplitAnimating(boolean z2) {
        ActionBarContainer actionBarContainer = this.f39327t;
        if (actionBarContainer != null) {
            ((ActionBarOverlayLayout) actionBarContainer.getParent()).setAnimating(z2);
        }
    }

    private void t8iq() {
        if (this.f39316i != null) {
            Folme.useAt(this.f39316i).state().setTo(new AnimState().add(ViewProperty.TRANSLATION_Y, this.sk1t ? 0 : r0.getCollapsedHeight()));
        }
    }

    private void vyq() {
        this.f39333z.ch(getContext().getResources().getDisplayMetrics().widthPixels, true);
        ActionMenuView actionMenuView = (ActionMenuView) this.f39333z.toq(this);
        this.f39316i = actionMenuView;
        ViewGroup viewGroup = (ViewGroup) actionMenuView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f39316i);
            this.f39327t.m25105z(this.f39316i);
        }
        ActionMenuView actionMenuView2 = this.f39316i;
        if (actionMenuView2 != null) {
            actionMenuView2.setSupportBlur(this.f39327t.mo25103q());
            this.f39316i.setEnableBlur(this.f39327t.mo25102n());
            this.f39316i.mo25100g(this.f39327t.mo25102n());
            this.f39316i.fu4(this.vb6);
        }
        boolean z2 = this.bb == 3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        if (z2) {
            layoutParams.bottomMargin = miuix.core.util.ld6.m25581q(getContext(), 16.0f);
        }
        Rect rect = this.bv;
        if (rect != null) {
            if (z2) {
                layoutParams.bottomMargin += rect.bottom;
                miuix.internal.util.n7h.cdj(this.f39316i, 0);
            } else {
                miuix.internal.util.n7h.cdj(this.f39316i, rect.bottom);
            }
        }
        ActionMenuView actionMenuView3 = this.f39316i;
        if (actionMenuView3 instanceof ResponsiveActionMenuView) {
            ((ResponsiveActionMenuView) actionMenuView3).setSuspendEnabled(z2);
        }
        this.f39327t.addView(this.f39316i, layoutParams);
        this.f39327t.fu4(this.f39316i);
        requestLayout();
    }

    /* JADX INFO: renamed from: x */
    private void m25117x(int i2, int i3, int i4, int i5) {
        int paddingStart = getPaddingStart();
        int measuredHeight = this.cw14.getMeasuredHeight();
        int i6 = ((i5 - i3) - measuredHeight) / 2;
        if (this.cw14.getVisibility() != 8) {
            View view = this.cw14;
            miuix.internal.util.n7h.kja0(this, view, paddingStart, i6, paddingStart + view.getMeasuredWidth(), i6 + this.cw14.getMeasuredHeight());
        }
        int paddingEnd = (i4 - i2) - getPaddingEnd();
        ActionMenuView actionMenuView = this.f39316i;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            jp0y(this.f39316i, paddingEnd, i6, measuredHeight);
        }
        if (this.tlhn) {
            this.w97r = 1;
            a98o(true);
            this.tlhn = false;
        } else if (this.f39316i != null) {
            ((ActionBarOverlayLayout) getParent().getParent()).mo25066k(this.f39316i.getCollapsedHeight(), 1);
        }
    }

    private void zp(boolean z2) {
        ActionMenuView actionMenuView;
        mo25118g(z2);
        setVisibility(z2 ? 0 : 8);
        if (this.f39327t == null || (actionMenuView = this.f39316i) == null) {
            return;
        }
        actionMenuView.setVisibility(z2 ? 0 : 8);
    }

    protected void a98o(boolean z2) {
        int i2;
        int i3;
        if (z2 != this.sk1t || this.bd == null) {
            this.sk1t = z2;
            this.dy = false;
            float f2 = 0.0f;
            float f3 = 1.0f;
            if (!z2) {
                f3 = 0.0f;
                f2 = 1.0f;
            }
            SpringAnimation springAnimationM25115m = m25115m(this, z2 ? wh6 : ut, f2, f3);
            springAnimationM25115m.setStartDelay(z2 ? 50L : 0L);
            setAlpha(f2);
            this.bd = springAnimationM25115m;
            if (!this.f39325r) {
                final C6969q c6969q = new C6969q(1, new C6969q.k() { // from class: miuix.appcompat.internal.app.widget.zy
                    @Override // miuix.appcompat.internal.app.widget.ActionBarContextView.C6969q.k
                    /* JADX INFO: renamed from: k */
                    public final void mo25131k() {
                        this.f39341k.m25108a();
                    }
                });
                springAnimationM25115m.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: miuix.appcompat.internal.app.widget.q
                    @Override // miuix.animation.physics.DynamicAnimation.OnAnimationEndListener
                    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f4, float f5) {
                        c6969q.m25130k();
                    }
                });
                springAnimationM25115m.start();
                return;
            }
            final C6969q c6969q2 = new C6969q(2, new C6969q.k() { // from class: miuix.appcompat.internal.app.widget.zy
                @Override // miuix.appcompat.internal.app.widget.ActionBarContextView.C6969q.k
                /* JADX INFO: renamed from: k */
                public final void mo25131k() {
                    this.f39341k.m25108a();
                }
            });
            springAnimationM25115m.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: miuix.appcompat.internal.app.widget.n
                @Override // miuix.animation.physics.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f4, float f5) {
                    c6969q2.m25130k();
                }
            });
            springAnimationM25115m.start();
            ActionMenuView actionMenuView = this.f39316i;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) getParent().getParent();
            int collapsedHeight = actionMenuView == null ? 0 : actionMenuView.getCollapsedHeight();
            if (z2) {
                i3 = collapsedHeight;
                i2 = 0;
            } else {
                i2 = collapsedHeight;
                i3 = 0;
            }
            if (actionMenuView != null) {
                if (this.xqx == null) {
                    this.xqx = new AnimConfig().setEase(-2, 0.95f, 0.25f);
                }
                TransitionListener transitionListener = this.zr5t;
                if (transitionListener != null) {
                    this.xqx.removeListeners(transitionListener);
                }
                AnimConfig animConfig = this.xqx;
                toq toqVar = new toq(z2, actionBarOverlayLayout, collapsedHeight, i2, i3, c6969q2);
                this.zr5t = toqVar;
                animConfig.addListeners(toqVar);
                actionMenuView.setTranslationY(i3);
                Folme.useAt(actionMenuView).state().to(new AnimState("menu_end_state").add(ViewProperty.TRANSLATION_Y, i2), this.xqx);
                actionBarOverlayLayout.mo25066k(0, 1);
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    @dd
    public View cdj(int i2) {
        if (i2 == 0) {
            return this.am;
        }
        if (i2 != 1) {
            return null;
        }
        return this.s8y;
    }

    protected void ch(boolean z2, int i2, int i3, int i4, int i5) {
        FrameLayout frameLayout = this.xy8;
        if (frameLayout == null || frameLayout.getVisibility() != 0 || this.f39309b == 0) {
            return;
        }
        FrameLayout frameLayout2 = this.xy8;
        frameLayout2.layout(i2, i5 - frameLayout2.getMeasuredHeight(), i4, i5);
        if (miuix.internal.util.n7h.x2(this)) {
            i2 = i4 - this.xy8.getMeasuredWidth();
        }
        Rect rect = new Rect();
        rect.set(i2, this.xy8.getMeasuredHeight() - (i5 - i3), this.xy8.getMeasuredWidth() + i2, this.xy8.getMeasuredHeight());
        this.xy8.setClipBounds(rect);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void d3() {
        super.d3();
    }

    protected void ek5k() {
        if (this.bq == null) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(toq.qrj.f34953o, (ViewGroup) this, false);
            this.bq = linearLayout;
            this.ac = (Button) linearLayout.findViewById(16908313);
            this.ad = (Button) this.bq.findViewById(16908314);
            Button button = this.ac;
            if (button != null) {
                button.setOnClickListener(this.k6e);
                Folme.useAt(this.ac).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(this.ac, new AnimConfig[0]);
                Folme.useAt(this.ac).hover().setFeedbackRadius(60.0f);
                Folme.useAt(this.ac).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.ac, new AnimConfig[0]);
            }
            Button button2 = this.ad;
            if (button2 != null) {
                button2.setOnClickListener(this.k6e);
                Folme.useAt(this.ad).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(this.ad, new AnimConfig[0]);
                Folme.useAt(this.ad).hover().setFeedbackRadius(60.0f);
                Folme.useAt(this.ad).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.ad, new AnimConfig[0]);
            }
            TextView textView = (TextView) this.bq.findViewById(R.id.title);
            this.am = textView;
            if (this.ay != 0) {
                textView.setTextAppearance(getContext(), this.ay);
            }
            TextView textView2 = new TextView(getContext());
            this.s8y = textView2;
            if (this.xk5 != 0) {
                textView2.setTextAppearance(getContext(), this.xk5);
            }
        }
        this.am.setText(this.ax);
        this.s8y.setText(this.ax);
        this.cw14 = this.bq;
        this.mjvl.toq(this.am);
        boolean z2 = !TextUtils.isEmpty(this.ax);
        this.bq.setVisibility(z2 ? 0 : 8);
        this.s8y.setVisibility(z2 ? 0 : 8);
        if (this.bq.getParent() == null) {
            addView(this.bq);
        }
        if (this.s8y.getParent() == null) {
            this.xy8.addView(this.s8y);
        }
        if (this.xy8.getParent() == null) {
            addView(this.xy8);
        }
        int i2 = this.f39309b;
        if (i2 == 0) {
            this.mjvl.m25233p(1.0f, 0, 0);
            this.hp.m25233p(0.0f, 0, 0);
        } else if (i2 == 1) {
            this.mjvl.m25233p(0.0f, 0, 20);
            this.hp.m25233p(1.0f, 0, 0);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public boolean eqxt() {
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        return actionMenuPresenter != null && actionMenuPresenter.lv5();
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    public void f7l8(ActionMode actionMode) {
        if (this.bu != null) {
            hb();
            mo25122n();
        }
        ek5k();
        if (this.am.getEllipsize() == TextUtils.TruncateAt.MARQUEE) {
            this.am.requestFocus();
        }
        this.bu = new WeakReference<>(actionMode);
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var = (miuix.appcompat.internal.view.menu.f7l8) actionMode.getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m25275c(false);
        }
        Object parent = getParent();
        while (true) {
            View view = (View) parent;
            if (view instanceof ActionBarOverlayLayout) {
                ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext(), (ActionBarOverlayLayout) view, toq.qrj.f76691d8wk, toq.qrj.f34948j);
                this.f39333z = actionMenuPresenter2;
                actionMenuPresenter2.m25283x(true);
                this.f39333z.i1(true);
                int i2 = this.bp;
                if (i2 != Integer.MIN_VALUE) {
                    this.f39333z.zp(i2);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                f7l8Var.zy(this.f39333z);
                if (this.f39325r) {
                    vyq();
                    return;
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f39333z.toq(this);
                this.f39316i = actionMenuView;
                actionMenuView.setBackground(null);
                addView(this.f39316i, layoutParams);
                return;
            }
            if (!(view.getParent() instanceof View)) {
                throw new IllegalStateException("ActionBarOverlayLayout not found");
            }
            parent = view.getParent();
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ boolean fn3e() {
        return super.fn3e();
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    /* JADX INFO: renamed from: g */
    public void mo25118g(boolean z2) {
        List<InterfaceC7382k> list = this.yl25;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC7382k> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo25169q(z2);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    int getActionBarStyle() {
        return R.attr.actionModeStyle;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ ActionMenuView getActionMenuView() {
        return super.getActionMenuView();
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public float getAnimationProgress() {
        return this.zmmu;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public C7752g getCollapseTitle() {
        return null;
    }

    public int getCollapsedHeight() {
        return this.q7k9;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ int getExpandState() {
        return super.getExpandState();
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public C7756y getExpandTitle() {
        return null;
    }

    public int getExpandedHeight() {
        return this.ndjo;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ ActionMenuView getMenuView() {
        return super.getMenuView();
    }

    public CharSequence getTitle() {
        return this.ax;
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    public int getViewHeight() {
        return getCollapsedHeight();
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    @dd
    /* JADX INFO: renamed from: h */
    public View mo25119h(int i2) {
        return null;
    }

    protected void hb() {
        SpringAnimation springAnimation = this.bd;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.bd = null;
        }
        t8iq();
        setSplitAnimating(false);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo25120i() {
        return super.mo25120i();
    }

    protected void i1(boolean z2) {
        setAlpha(z2 ? 1.0f : 0.0f);
        if (!this.f39325r) {
            zp(z2);
            return;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f39327t.getParent();
        int collapsedHeight = this.f39316i.getCollapsedHeight();
        this.f39316i.setTranslationY(z2 ? 0.0f : collapsedHeight);
        if (!z2) {
            collapsedHeight = 0;
        }
        actionBarOverlayLayout.qrj(collapsedHeight);
        this.f39316i.setAlpha(z2 ? 1.0f : 0.0f);
        zp(z2);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void jk(View view, int i2) {
        boolean z2;
        if (fn3e()) {
            int measuredHeight = this.xy8.getMeasuredHeight();
            int height = getHeight();
            if (this.wra) {
                this.wra = false;
                z2 = !this.zsl;
            } else {
                if (this.zsl) {
                    this.zsl = false;
                }
            }
            if (z2) {
                int i3 = this.th6;
                if (i3 == 0) {
                    setExpandState(0);
                    return;
                }
                if (i3 == measuredHeight) {
                    setExpandState(1);
                    return;
                }
                int i4 = this.q7k9;
                if (height > (measuredHeight / 2) + i4) {
                    this.xhv.startScroll(0, height, 0, (i4 + measuredHeight) - height);
                } else {
                    this.xhv.startScroll(0, height, 0, i4 - height);
                }
                postOnAnimation(this.zm);
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    /* JADX INFO: renamed from: k */
    public void mo25121k(InterfaceC7382k interfaceC7382k) {
        List<InterfaceC7382k> list;
        if (interfaceC7382k == null || (list = this.yl25) == null) {
            return;
        }
        list.remove(interfaceC7382k);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public boolean ki() {
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        return actionMenuPresenter != null && actionMenuPresenter.hb(false);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void kja0() {
        super.kja0();
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    public void ld6() {
        m25123o();
        this.w97r = 2;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public boolean mcp(View view, View view2, int i2, int i3) {
        return true;
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    /* JADX INFO: renamed from: n */
    public void mo25122n() {
        removeAllViews();
        List<InterfaceC7382k> list = this.yl25;
        if (list != null) {
            list.clear();
            this.yl25 = null;
        }
        if (this.f39327t != null) {
            ActionMenuView actionMenuView = this.f39316i;
            if (actionMenuView != null) {
                actionMenuView.mo25290i();
            }
            this.f39327t.removeView(this.f39316i);
            this.f39327t.m25105z(this.f39316i);
        }
        this.f39316i = null;
        this.bu = null;
    }

    /* JADX INFO: renamed from: o */
    protected void m25123o() {
        SpringAnimation springAnimation = this.bd;
        if (springAnimation != null) {
            springAnimation.skipToEnd();
            this.bd = null;
        }
        t8iq();
        setSplitAnimating(false);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void o1t(View view, int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        int i5;
        if (fn3e()) {
            int height = getHeight();
            if (i3 <= 0 || height <= (i5 = this.q7k9)) {
                return;
            }
            int i6 = height - i3;
            int i7 = this.th6;
            if (i6 >= i5) {
                this.th6 = i7 - i3;
            } else {
                this.th6 = 0;
            }
            iArr[1] = iArr[1] + i3;
            if (this.th6 != i7) {
                iArr2[1] = i3;
                requestLayout();
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void oc() {
        if (!this.f39325r || this.f39333z == null || this.bu == null) {
            return;
        }
        vyq();
    }

    @Override // miuix.appcompat.internal.app.widget.toq, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        TextView textView;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, toq.ki.f34855v, getActionBarStyle(), 0);
        this.f39310c = typedArrayObtainStyledAttributes.getLayoutDimension(toq.ki.f34837d, 0);
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(toq.f7l8.f75378bap7);
        this.xy8.setPaddingRelative(dimensionPixelOffset, getResources().getDimensionPixelOffset(toq.f7l8.f75403e5), dimensionPixelOffset, getResources().getDimensionPixelOffset(toq.f7l8.f75500pjz9));
        setPaddingRelative(C7164n.m25953y(getContext(), toq.C6055q.f76577mcp), getPaddingTop(), C7164n.m25953y(getContext(), toq.C6055q.f34932t), getPaddingBottom());
        if (this.ay == 0 || (textView = this.am) == null) {
            return;
        }
        textView.setTextAppearance(getContext(), this.ay);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.hb(false);
            this.f39333z.m25278j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = (int) ((i4 - i2) / getContext().getResources().getDisplayMetrics().density);
        int i7 = this.f39309b;
        int measuredHeight = i7 == 2 ? this.th6 : i7 == 1 ? this.xy8.getMeasuredHeight() : 0;
        int i8 = i5 - i3;
        m25117x(i2, i3, i4, i5 - measuredHeight);
        ch(z2, i2, i8 - measuredHeight, i4, i8);
        float fMin = Math.min(1.0f, (this.xy8.getMeasuredHeight() - measuredHeight) / this.xy8.getMeasuredHeight());
        m25111e(fMin);
        this.f86976ab = fMin;
        this.an = i6 > 640;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMax;
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.f39312e;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i4 > 0 ? i4 : View.MeasureSpec.getSize(i3)) - paddingTop, Integer.MIN_VALUE);
        ActionMenuView actionMenuView = this.f39316i;
        if (actionMenuView == null || actionMenuView.getParent() != this) {
            iMax = 0;
        } else {
            paddingLeft = ni7(this.f39316i, paddingLeft, iMakeMeasureSpec, 0);
            iMax = this.f39316i.getMeasuredHeight() + 0;
        }
        if (this.cw14.getVisibility() != 8) {
            this.cw14.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), iMakeMeasureSpec);
            iMax = Math.max(iMax, this.cw14.getMeasuredHeight());
            TextView textView = this.am;
            if (textView != null) {
                textView.setVisibility(nn86() ? 0 : 4);
            }
        }
        if (this.xy8.getVisibility() != 8) {
            this.xy8.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        if (i4 <= 0) {
            this.q7k9 = iMax > 0 ? Math.max(iMax, this.f39310c) + this.tgs : 0;
        } else if (iMax >= i4) {
            this.q7k9 = i4 + this.tgs;
        }
        int measuredHeight = this.q7k9 + this.xy8.getMeasuredHeight();
        this.ndjo = measuredHeight;
        int i5 = this.f39309b;
        if (i5 == 2) {
            setMeasuredDimension(size, this.q7k9 + this.th6);
        } else if (i5 == 1) {
            setMeasuredDimension(size, measuredHeight);
        } else {
            setMeasuredDimension(size, this.q7k9);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setTitle(savedState.f39061k);
        setButton(16908314, savedState.f39063q);
        if (savedState.f39062n) {
            d3();
        }
        setExpandState(savedState.f39060g);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f39062n = t8r();
        savedState.f39061k = getTitle();
        Button button = this.ad;
        if (button != null) {
            savedState.f39063q = button.getText();
        }
        int i2 = this.f39309b;
        if (i2 == 2) {
            savedState.f39060g = 0;
        } else {
            savedState.f39060g = i2;
        }
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void qrj(int i2) {
        super.qrj(i2);
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    /* JADX INFO: renamed from: s */
    public void mo25124s(boolean z2, float f2) {
        List<InterfaceC7382k> list = this.yl25;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC7382k> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo25168p(z2, f2);
        }
    }

    public void setActionBarView(ActionBarView actionBarView) {
        this.d1cy = actionBarView;
    }

    public void setActionModeAnim(boolean z2) {
        this.k0 = z2;
    }

    public void setAnimationProgress(float f2) {
        this.zmmu = f2;
        mo25124s(this.sk1t, f2);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setBottomMenuMode(int i2) {
        super.setBottomMenuMode(i2);
    }

    public void setButton(int i2, CharSequence charSequence) {
        ek5k();
        if (i2 == 16908313) {
            Button button = this.ac;
            if (button != null) {
                button.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
                this.ac.setText(charSequence);
            }
            this.ar.setTitle(charSequence);
            return;
        }
        if (i2 == 16908314) {
            Button button2 = this.ad;
            if (button2 != null) {
                button2.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
                this.ad.setText(charSequence);
            }
            this.bc.setTitle(charSequence);
        }
    }

    public void setContentInset(int i2) {
        this.tgs = i2;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setExpandState(int i2) {
        super.setExpandState(i2);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setPendingInset(Rect rect) {
        super.setPendingInset(rect);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setResizable(boolean z2) {
        super.setResizable(z2);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void setSplitActionBar(boolean z2) {
        if (this.f39325r != z2) {
            if (this.f39333z != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                if (z2) {
                    this.f39333z.ch(getContext().getResources().getDisplayMetrics().widthPixels, true);
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    layoutParams.gravity = this.an ? 17 : 80;
                    ActionMenuView actionMenuView = (ActionMenuView) this.f39333z.toq(this);
                    this.f39316i = actionMenuView;
                    actionMenuView.setBackground(this.be);
                    ViewGroup viewGroup = (ViewGroup) this.f39316i.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f39316i);
                        this.f39327t.m25105z(this.f39316i);
                    }
                    this.f39327t.addView(this.f39316i, layoutParams);
                    this.f39327t.fu4(this.f39316i);
                } else {
                    ActionMenuView actionMenuView2 = (ActionMenuView) this.f39333z.toq(this);
                    this.f39316i = actionMenuView2;
                    actionMenuView2.setBackground(null);
                    ViewGroup viewGroup2 = (ViewGroup) this.f39316i.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(this.f39316i);
                    }
                    addView(this.f39316i, layoutParams);
                }
            }
            super.setSplitActionBar(z2);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setSplitView(ActionBarContainer actionBarContainer) {
        super.setSplitView(actionBarContainer);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setSplitWhenNarrow(boolean z2) {
        super.setSplitWhenNarrow(z2);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setSubTitleClickListener(View.OnClickListener onClickListener) {
        super.setSubTitleClickListener(onClickListener);
    }

    public void setTitle(CharSequence charSequence) {
        this.ax = charSequence;
        ek5k();
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setTitleClickable(boolean z2) {
        super.setTitleClickable(z2);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.bs) {
            requestLayout();
        }
        this.bs = z2;
    }

    @Override // miuix.appcompat.internal.app.widget.toq, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    /* JADX INFO: renamed from: t */
    public void mo25125t(View view, View view2, int i2, int i3) {
        if (fn3e()) {
            if (i3 == 0) {
                this.wra = true;
            } else {
                this.zsl = true;
            }
            if (!this.xhv.isFinished()) {
                this.xhv.forceFinished(true);
            }
            setExpandState(2);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public boolean t8r() {
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        return actionMenuPresenter != null && actionMenuPresenter.m25280m();
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    public void toq(InterfaceC7382k interfaceC7382k) {
        if (interfaceC7382k == null) {
            return;
        }
        if (this.yl25 == null) {
            this.yl25 = new ArrayList();
        }
        this.yl25.add(interfaceC7382k);
    }

    /* JADX INFO: renamed from: u */
    public void m25126u(boolean z2) {
        this.vb6 = z2;
        if (z2) {
            m25113j();
        } else {
            nmn5();
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void wvg(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        if (fn3e()) {
            int measuredHeight = this.xy8.getMeasuredHeight();
            int i7 = this.q7k9 + measuredHeight;
            int height = getHeight();
            if (i5 >= 0 || height >= i7) {
                return;
            }
            int i8 = this.th6;
            if (height - i5 <= i7) {
                this.th6 = i8 - i5;
                iArr[1] = iArr[1] + i5;
            } else {
                this.th6 = measuredHeight;
                iArr[1] = iArr[1] + (-(i7 - height));
            }
            if (this.th6 != i8) {
                iArr2[1] = i5;
                requestLayout();
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    /* JADX INFO: renamed from: y */
    public void mo25127y(boolean z2) {
        hb();
        setSplitAnimating(this.k0);
        if (!z2) {
            if (this.k0) {
                a98o(false);
                return;
            } else {
                i1(false);
                return;
            }
        }
        if (!this.k0) {
            i1(true);
        } else {
            setVisibility(0);
            this.tlhn = true;
        }
    }

    public boolean y9n() {
        return this.bs;
    }

    public boolean yz() {
        return this.ei;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    /* JADX INFO: renamed from: z */
    protected void mo25128z(int i2, int i3) {
        toq.C8098toq c8098toq;
        if (i2 == 2) {
            this.th6 = 0;
            if (!this.xhv.isFinished()) {
                this.xhv.forceFinished(true);
            }
        }
        if (i3 == 2 && (c8098toq = this.hp) != null) {
            c8098toq.qrj(0);
        }
        if (i3 == 1) {
            if (this.xy8.getAlpha() > 0.0f) {
                toq.C8098toq c8098toq2 = this.mjvl;
                if (c8098toq2 != null) {
                    c8098toq2.ld6(0.0f, 0, 20, true);
                }
                toq.C8098toq c8098toq3 = this.hp;
                if (c8098toq3 != null) {
                    c8098toq3.ld6(1.0f, 0, 0, true);
                }
            }
            toq.C8098toq c8098toq4 = this.hp;
            if (c8098toq4 != null) {
                c8098toq4.qrj(0);
            }
        }
        if (i3 != 0) {
            this.th6 = getHeight() - this.q7k9;
            return;
        }
        toq.C8098toq c8098toq5 = this.mjvl;
        if (c8098toq5 != null) {
            c8098toq5.ld6(1.0f, 0, 0, true);
            this.mjvl.qrj(0);
            this.mjvl.f7l8();
        }
        toq.C8098toq c8098toq6 = this.hp;
        if (c8098toq6 != null) {
            c8098toq6.ld6(0.0f, 0, 0, true);
            this.hp.qrj(8);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ boolean zurt() {
        return super.zurt();
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    public void zy(boolean z2) {
        List<InterfaceC7382k> list = this.yl25;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC7382k> it = list.iterator();
        while (it.hasNext()) {
            it.next().x2(z2);
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setExpandState(int i2, boolean z2, boolean z3) {
        super.setExpandState(i2, z2, z3);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k0 = true;
        this.vb6 = false;
        this.k6e = new ViewOnClickListenerC6968k();
        this.mjvl = new toq.C8098toq();
        this.hp = new toq.C8098toq();
        this.wra = false;
        this.zsl = false;
        this.zm = new zy();
        this.xhv = new Scroller(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.xy8 = frameLayout;
        frameLayout.setId(toq.C6054p.f34889c);
        FrameLayout frameLayout2 = this.xy8;
        Resources resources = context.getResources();
        int i3 = toq.f7l8.f75378bap7;
        frameLayout2.setPaddingRelative(resources.getDimensionPixelOffset(i3), context.getResources().getDimensionPixelOffset(toq.f7l8.f75403e5), context.getResources().getDimensionPixelOffset(i3), context.getResources().getDimensionPixelOffset(toq.f7l8.f75500pjz9));
        this.xy8.setVisibility(0);
        this.hp.toq(this.xy8);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.f34855v, i2, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(toq.ki.f76106ikck);
        this.aj = drawable;
        setBackground(drawable);
        this.ay = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76199vq, 0);
        this.xk5 = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76088g1, 0);
        this.f39310c = typedArrayObtainStyledAttributes.getLayoutDimension(toq.ki.f34837d, 0);
        this.be = typedArrayObtainStyledAttributes.getDrawable(toq.ki.f76084fnq8);
        this.ar = new MenuItemC7021k(context, 0, 16908313, 0, 0, context.getString(R.string.cancel));
        this.bc = new MenuItemC7021k(context, 0, 16908314, 0, 0, context.getString(toq.C6051h.f75798cn02));
        this.k0 = typedArrayObtainStyledAttributes.getBoolean(toq.ki.f76172qo, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setButton(int i2, CharSequence charSequence, CharSequence charSequence2, int i3) {
        ek5k();
        if (i2 == 16908313) {
            Button button = this.ac;
            if (button != null) {
                button.setVisibility((TextUtils.isEmpty(charSequence2) && i3 == 0) ? 8 : 0);
                this.ac.setText(charSequence2);
                this.ac.setBackgroundResource(i3);
                if (!TextUtils.isEmpty(charSequence)) {
                    this.ac.setContentDescription(charSequence);
                }
            }
            this.ar.setTitle(charSequence2);
            return;
        }
        if (i2 == 16908314) {
            Button button2 = this.ad;
            if (button2 != null) {
                button2.setVisibility((TextUtils.isEmpty(charSequence2) && i3 == 0) ? 8 : 0);
                this.ad.setText(charSequence2);
                this.ad.setBackgroundResource(i3);
                if (!TextUtils.isEmpty(charSequence)) {
                    this.ad.setContentDescription(charSequence);
                }
            }
            this.bc.setTitle(charSequence2);
        }
    }

    public void setButton(int i2, CharSequence charSequence, int i3) {
        ek5k();
        if (i2 == 16908313) {
            Button button = this.ac;
            if (button != null) {
                button.setVisibility((TextUtils.isEmpty(charSequence) && i3 == 0) ? 8 : 0);
                this.ac.setText(charSequence);
                this.ac.setBackgroundResource(i3);
            }
            this.ar.setTitle(charSequence);
        } else if (i2 == 16908314) {
            Button button2 = this.ad;
            if (button2 != null) {
                button2.setVisibility((TextUtils.isEmpty(charSequence) && i3 == 0) ? 8 : 0);
                this.ad.setText(charSequence);
                this.ad.setBackgroundResource(i3);
            }
            this.bc.setTitle(charSequence);
        }
        if (!TextUtils.isEmpty(charSequence) || i3 == 0) {
            return;
        }
        lv5(i2, i3);
    }
}
