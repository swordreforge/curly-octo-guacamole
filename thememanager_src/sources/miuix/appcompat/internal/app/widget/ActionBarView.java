package miuix.appcompat.internal.app.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.CollapsibleActionView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Scroller;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC0096k;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.core.view.C0683f;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.kja0;
import gb.toq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.IStateStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.appcompat.app.InterfaceC6952n;
import miuix.appcompat.internal.app.widget.toq;
import miuix.appcompat.internal.view.C7010k;
import miuix.appcompat.internal.view.C7040n;
import miuix.appcompat.internal.view.menu.MenuItemC7036s;
import miuix.appcompat.internal.view.menu.action.ActionMenuPresenter;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.appcompat.internal.view.menu.action.C7020g;
import miuix.appcompat.internal.view.menu.action.MenuItemC7021k;
import miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView;
import miuix.appcompat.internal.view.menu.ld6;
import miuix.internal.util.C7164n;
import miuix.view.InterfaceC7382k;
import xm.C7752g;
import xm.C7756y;
import zy.dd;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarView extends miuix.appcompat.internal.app.widget.toq implements InterfaceC7382k {
    private static final int bm = 0;
    private static final int f5y = 2;
    private static final int hbt2 = 1;
    public static final int iym = 0;
    private static final int nmlm = 8223;
    private static final int on46 = 8388627;
    private static final String otes = "ActionBarView";
    private static final int w9u2 = 1;
    View a1;
    private kja0 a62w;
    private int a7kc;
    private int ac;
    private CharSequence ad;
    private int afw;
    private Drawable aj;
    private CharSequence am;
    private TransitionListener ao6;
    private InterfaceC0954z ar;
    private toq.C8098toq aw3;
    private float ax;
    private CharSequence ay;
    private OnBackInvokedDispatcher b9;
    private final int bc;
    private final int bd;
    private int be;
    private boolean bnm;
    private int bq;
    private OnBackInvokedCallback br;
    private Drawable bs;
    private boolean bsb;
    private View bu;
    private IStateStyle bzt0;
    private int cecm;
    private final View.OnClickListener cm0;
    protected TransitionListener cr;
    private Spinner cw14;
    private SecondaryTabContainerView d1cy;
    private MenuItemC7021k deb;
    private FrameLayout dy;
    private boolean e9u;
    private int eht;
    private ProgressBar ei;
    private float faqz;
    private int fn2;
    private int fy94;
    private boolean gjxq;
    private final int h06;
    private View hp;
    private boolean ilvb;
    private Runnable jjwz;
    private Context k0;

    @dd
    private FrameLayout k6e;
    private int k84;
    private int kdv1;
    private boolean kl1;
    private final AdapterView.OnItemSelectedListener kybi;
    private boolean l2jk;
    private final TextWatcher lgf;
    private boolean lr4;
    private boolean ls9;
    private int lw58;
    private boolean mjvl;
    Window.Callback n1u4;
    private int n5ij;
    private SecondaryTabContainerView ndjo;
    private int nq0z;
    private int nxe;
    protected TransitionListener nze;
    protected TransitionListener o9;
    private final View.OnClickListener o917;
    private int oyp;
    private boolean p2c;
    private boolean ph90;
    private boolean q09;
    private toq.C8098toq q7;
    private ScrollingTabContainerView q7k9;
    private boolean qnoq;
    private boolean qns;
    private boolean r7v2;
    private boolean rd;
    private AbstractC0096k.n rt0p;
    private boolean ry;
    private Runnable s3;

    @dd
    private C7756y s8y;
    private boolean sh5k;
    private FrameLayout sk1t;
    private miuix.appcompat.internal.view.menu.f7l8 smyf;
    private boolean sufz;
    private SpinnerAdapter svt;
    int t7v;
    private HomeView tgs;
    private ScrollingTabContainerView th6;
    private Drawable tlhn;
    private MenuItemC7021k u6;
    private int ule;
    private int us2t;
    private AnimConfig ut;
    private boolean v3;
    private boolean v62;

    @dd
    private FrameLayout vb6;
    private final View.OnClickListener vfa;
    protected TransitionListener vh6m;
    private boolean vl4;
    private int vv9;
    private final View.OnClickListener w0an;
    private miuix.appcompat.internal.view.menu.f7l8 w7wd;
    private int w97r;
    private Scroller wg3;
    private C7040n wh6;
    private View wra;
    private int x63;
    private int x6n7;
    private ActionMenuView xhv;

    @dd
    private C7752g xk5;
    private View xqx;
    private LinearLayout xy8;
    private boolean yf;
    private HomeView yl25;
    int za;
    private ActionMenuPresenter zm;
    private FrameLayout zmmu;
    private ProgressBar zr5t;
    private View zsl;

    private static class HomeView extends FrameLayout {

        /* JADX INFO: renamed from: g */
        private Drawable f39105g;

        /* JADX INFO: renamed from: k */
        private ImageView f39106k;

        /* JADX INFO: renamed from: n */
        private int f39107n;

        /* JADX INFO: renamed from: q */
        private ImageView f39108q;

        public HomeView(Context context) {
            this(context, null);
        }

        @Override // android.view.View
        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            CharSequence contentDescription = getContentDescription();
            if (TextUtils.isEmpty(contentDescription)) {
                return true;
            }
            accessibilityEvent.getText().add(contentDescription);
            return true;
        }

        /* JADX INFO: renamed from: k */
        public int m25171k() {
            return 0;
        }

        /* JADX INFO: renamed from: n */
        public void m25172n(Drawable drawable) {
            ImageView imageView = this.f39106k;
            if (drawable == null) {
                drawable = this.f39105g;
            }
            imageView.setImageDrawable(drawable);
            this.f39107n = 0;
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            int i2 = this.f39107n;
            if (i2 != 0) {
                m25173q(i2);
            }
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            this.f39106k = (ImageView) findViewById(toq.C6054p.bv);
            this.f39108q = (ImageView) findViewById(toq.C6054p.f76348kbj);
            ImageView imageView = this.f39106k;
            if (imageView != null) {
                this.f39105g = imageView.getDrawable();
                Folme.useAt(this.f39106k).hover().setFeedbackRadius(60.0f);
                Folme.useAt(this.f39106k).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.f39106k, new AnimConfig[0]);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
            int i6;
            int i7 = (i5 - i3) / 2;
            boolean zX2 = miuix.internal.util.n7h.x2(this);
            if (this.f39106k.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f39106k.getLayoutParams();
                int measuredHeight = this.f39106k.getMeasuredHeight();
                int measuredWidth = this.f39106k.getMeasuredWidth();
                int i8 = i7 - (measuredHeight / 2);
                miuix.internal.util.n7h.kja0(this, this.f39106k, 0, i8, measuredWidth, i8 + measuredHeight);
                i6 = layoutParams.leftMargin + measuredWidth + layoutParams.rightMargin;
                if (zX2) {
                    i4 -= i6;
                } else {
                    i2 += i6;
                }
            } else {
                i6 = 0;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f39108q.getLayoutParams();
            int measuredHeight2 = this.f39108q.getMeasuredHeight();
            int measuredWidth2 = this.f39108q.getMeasuredWidth();
            int iMax = i6 + Math.max(layoutParams2.getMarginStart(), ((i4 - i2) / 2) - (measuredWidth2 / 2));
            int iMax2 = Math.max(layoutParams2.topMargin, i7 - (measuredHeight2 / 2));
            miuix.internal.util.n7h.kja0(this, this.f39108q, iMax, iMax2, iMax + measuredWidth2, iMax2 + measuredHeight2);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i2, int i3) {
            measureChildWithMargins(this.f39106k, i2, 0, i3, 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f39106k.getLayoutParams();
            int measuredWidth = layoutParams.leftMargin + this.f39106k.getMeasuredWidth() + layoutParams.rightMargin;
            if (this.f39106k.getVisibility() == 8) {
                measuredWidth = 0;
            }
            int measuredHeight = layoutParams.topMargin + this.f39106k.getMeasuredHeight() + layoutParams.bottomMargin;
            measureChildWithMargins(this.f39108q, i2, measuredWidth, i3, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f39108q.getLayoutParams();
            int measuredWidth2 = measuredWidth + (this.f39108q.getVisibility() != 8 ? layoutParams2.leftMargin + this.f39108q.getMeasuredWidth() + layoutParams2.rightMargin : 0);
            int iMax = Math.max(measuredHeight, layoutParams2.topMargin + this.f39108q.getMeasuredHeight() + layoutParams2.bottomMargin);
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode == Integer.MIN_VALUE) {
                measuredWidth2 = Math.min(measuredWidth2, size);
            } else if (mode == 1073741824) {
                measuredWidth2 = size;
            }
            if (mode2 == Integer.MIN_VALUE) {
                iMax = Math.min(iMax, size2);
            } else if (mode2 == 1073741824) {
                iMax = size2;
            }
            setMeasuredDimension(measuredWidth2, iMax);
        }

        /* JADX INFO: renamed from: q */
        public void m25173q(int i2) {
            this.f39107n = i2;
            this.f39106k.setImageDrawable(i2 != 0 ? getResources().getDrawable(i2) : null);
        }

        public void toq(Drawable drawable) {
            this.f39108q.setImageDrawable(drawable);
        }

        public void zy(boolean z2) {
            this.f39106k.setVisibility(z2 ? 0 : 8);
        }

        public HomeView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: miuix.appcompat.internal.app.widget.ActionBarView.SavedState.1
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
        int f39109g;

        /* JADX INFO: renamed from: k */
        int f39110k;

        /* JADX INFO: renamed from: n */
        boolean f39111n;

        /* JADX INFO: renamed from: p */
        boolean f39112p;

        /* JADX INFO: renamed from: q */
        boolean f39113q;

        /* JADX INFO: renamed from: s */
        int f39114s;

        /* JADX INFO: renamed from: y */
        boolean f39115y;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f39110k);
            parcel.writeInt(this.f39113q ? 1 : 0);
            parcel.writeInt(this.f39111n ? 1 : 0);
            parcel.writeInt(this.f39109g);
            parcel.writeInt(this.f39115y ? 1 : 0);
            parcel.writeInt(this.f39114s);
            parcel.writeInt(this.f39112p ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f39110k = parcel.readInt();
            this.f39113q = parcel.readInt() != 0;
            this.f39111n = parcel.readInt() != 0;
            this.f39109g = parcel.readInt();
            this.f39115y = parcel.readInt() != 0;
            this.f39114s = parcel.readInt();
            this.f39112p = parcel.readInt() != 0;
        }

        @hyr(api = 24)
        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f39110k = parcel.readInt();
            this.f39113q = parcel.readInt() != 0;
            this.f39111n = parcel.readInt() != 0;
            this.f39109g = parcel.readInt();
            this.f39115y = parcel.readInt() != 0;
            this.f39114s = parcel.readInt();
            this.f39112p = parcel.readInt() != 0;
        }
    }

    class f7l8 extends TransitionListener {
        f7l8() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            if (ActionBarView.this.q7 != null) {
                ActionBarView.this.q7.m25230g();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarView$g */
    class C6974g extends TransitionListener {
        C6974g() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            super.onBegin(obj);
            if (ActionBarView.this.q7 != null) {
                ActionBarView.this.q7.f7l8();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarView$h */
    private static class C6975h extends TransitionListener {

        /* JADX INFO: renamed from: k */
        private WeakReference<ActionBarView> f39118k;

        public C6975h(ActionBarView actionBarView) {
            this.f39118k = new WeakReference<>(actionBarView);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            super.onBegin(obj);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onCancel(Object obj) {
            super.onCancel(obj);
            this.f39118k.clear();
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            this.f39118k.clear();
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            ActionBarView actionBarView;
            super.onUpdate(obj, collection);
            UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, "actionbar_state_change");
            if (updateInfoFindByName == null || (actionBarView = this.f39118k.get()) == null) {
                return;
            }
            actionBarView.x63 = updateInfoFindByName.getIntValue();
            actionBarView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarView$k */
    class C6976k implements TextWatcher {
        C6976k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if (!charSequence.equals(ActionBarView.this.ad)) {
                ActionBarView.this.ay = charSequence;
            }
            if (ActionBarView.this.s8y != null) {
                ActionBarView.this.s8y.m28140h(charSequence);
            }
        }
    }

    private class kja0 implements miuix.appcompat.internal.view.menu.ld6 {

        /* JADX INFO: renamed from: k */
        miuix.appcompat.internal.view.menu.f7l8 f39120k;

        /* JADX INFO: renamed from: q */
        MenuItemC7036s f39122q;

        private kja0() {
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        public void f7l8(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, boolean z2) {
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        public int getId() {
            return 0;
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        /* JADX INFO: renamed from: k */
        public void mo25175k(Parcelable parcelable) {
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        public void ld6(ld6.InterfaceC7032k interfaceC7032k) {
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        /* JADX INFO: renamed from: n */
        public boolean mo25176n() {
            return false;
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        public boolean n7h(miuix.appcompat.internal.view.menu.qrj qrjVar) {
            return false;
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        /* JADX INFO: renamed from: p */
        public boolean mo25177p(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, MenuItemC7036s menuItemC7036s) {
            ActionBarView.this.a1 = menuItemC7036s.getActionView();
            ActionBarView.this.ktq();
            ActionBarView.this.yl25.toq(ActionBarView.this.getIcon().getConstantState().newDrawable(ActionBarView.this.getResources()));
            this.f39122q = menuItemC7036s;
            ViewParent parent = ActionBarView.this.a1.getParent();
            ActionBarView actionBarView = ActionBarView.this;
            if (parent != actionBarView) {
                actionBarView.addView(actionBarView.a1);
            }
            ViewParent parent2 = ActionBarView.this.yl25.getParent();
            ActionBarView actionBarView2 = ActionBarView.this;
            if (parent2 != actionBarView2) {
                actionBarView2.addView(actionBarView2.yl25);
            }
            if (ActionBarView.this.tgs != null) {
                ActionBarView.this.tgs.setVisibility(8);
            }
            if (ActionBarView.this.xk5 != null) {
                ActionBarView.this.setTitleVisibility(false);
            }
            if (ActionBarView.this.th6 != null) {
                ActionBarView.this.th6.setVisibility(8);
            }
            if (ActionBarView.this.q7k9 != null) {
                ActionBarView.this.q7k9.setVisibility(8);
            }
            if (ActionBarView.this.ndjo != null) {
                ActionBarView.this.ndjo.setVisibility(8);
            }
            if (ActionBarView.this.d1cy != null) {
                ActionBarView.this.d1cy.setVisibility(8);
            }
            if (ActionBarView.this.cw14 != null) {
                ActionBarView.this.cw14.setVisibility(8);
            }
            if (ActionBarView.this.xqx != null) {
                ActionBarView.this.xqx.setVisibility(8);
            }
            ActionBarView.this.requestLayout();
            menuItemC7036s.fn3e(true);
            KeyEvent.Callback callback = ActionBarView.this.a1;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewExpanded();
            }
            ActionBarView.this.v5yj();
            return true;
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        /* JADX INFO: renamed from: q */
        public void mo25178q(boolean z2) {
            if (this.f39122q != null) {
                miuix.appcompat.internal.view.menu.f7l8 f7l8Var = this.f39120k;
                boolean z3 = false;
                if (f7l8Var != null) {
                    int size = f7l8Var.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (this.f39120k.getItem(i2) == this.f39122q) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (z3) {
                    return;
                }
                x2(this.f39120k, this.f39122q);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        /* JADX INFO: renamed from: s */
        public void mo25179s(Context context, miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
            MenuItemC7036s menuItemC7036s;
            miuix.appcompat.internal.view.menu.f7l8 f7l8Var2 = this.f39120k;
            if (f7l8Var2 != null && (menuItemC7036s = this.f39122q) != null) {
                f7l8Var2.f7l8(menuItemC7036s);
            }
            this.f39120k = f7l8Var;
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        public miuix.appcompat.internal.view.menu.x2 toq(ViewGroup viewGroup) {
            return null;
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        public boolean x2(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, MenuItemC7036s menuItemC7036s) {
            KeyEvent.Callback callback = ActionBarView.this.a1;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewCollapsed();
            }
            ActionBarView actionBarView = ActionBarView.this;
            actionBarView.removeView(actionBarView.a1);
            ActionBarView actionBarView2 = ActionBarView.this;
            actionBarView2.removeView(actionBarView2.yl25);
            ActionBarView actionBarView3 = ActionBarView.this;
            actionBarView3.a1 = null;
            if ((actionBarView3.ac & 2) != 0) {
                ActionBarView.this.tgs.setVisibility(0);
            }
            if ((ActionBarView.this.ac & 8) != 0) {
                if (ActionBarView.this.xk5 == null) {
                    ActionBarView.this.cv06();
                } else {
                    ActionBarView.this.setTitleVisibility(true);
                }
            }
            if (ActionBarView.this.th6 != null && ActionBarView.this.bq == 2) {
                ActionBarView.this.th6.setVisibility(0);
            }
            if (ActionBarView.this.q7k9 != null && ActionBarView.this.bq == 2) {
                ActionBarView.this.q7k9.setVisibility(0);
            }
            if (ActionBarView.this.ndjo != null && ActionBarView.this.bq == 2) {
                ActionBarView.this.ndjo.setVisibility(0);
            }
            if (ActionBarView.this.d1cy != null && ActionBarView.this.bq == 2) {
                ActionBarView.this.d1cy.setVisibility(0);
            }
            if (ActionBarView.this.cw14 != null && ActionBarView.this.bq == 1) {
                ActionBarView.this.cw14.setVisibility(0);
            }
            if (ActionBarView.this.xqx != null && (ActionBarView.this.ac & 16) != 0) {
                ActionBarView.this.xqx.setVisibility(0);
            }
            ActionBarView.this.yl25.toq(null);
            this.f39122q = null;
            ActionBarView.this.requestLayout();
            menuItemC7036s.fn3e(false);
            ActionBarView.this.v5yj();
            return true;
        }

        @Override // miuix.appcompat.internal.view.menu.ld6
        public Parcelable zy() {
            return null;
        }

        /* synthetic */ kja0(ActionBarView actionBarView, C6974g c6974g) {
            this();
        }
    }

    class ld6 implements View.OnClickListener {
        ld6() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MenuItemC7036s menuItemC7036s = ActionBarView.this.a62w.f39122q;
            if (menuItemC7036s != null) {
                menuItemC7036s.collapseActionView();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarView$n */
    class RunnableC6977n implements Runnable {
        RunnableC6977n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionBarView.this.wg3.computeScrollOffset()) {
                ActionBarView actionBarView = ActionBarView.this;
                int currY = actionBarView.wg3.getCurrY();
                ActionBarView actionBarView2 = ActionBarView.this;
                actionBarView.x63 = (currY - actionBarView2.za) + actionBarView2.nxe;
                ActionBarView.this.requestLayout();
                if (!ActionBarView.this.wg3.isFinished()) {
                    ActionBarView.this.postOnAnimation(this);
                    return;
                }
                int currY2 = ActionBarView.this.wg3.getCurrY();
                ActionBarView actionBarView3 = ActionBarView.this;
                if (currY2 == actionBarView3.za) {
                    actionBarView3.setExpandState(0);
                    return;
                }
                int currY3 = actionBarView3.wg3.getCurrY();
                ActionBarView actionBarView4 = ActionBarView.this;
                if (currY3 == actionBarView4.za + actionBarView4.sk1t.getMeasuredHeight()) {
                    ActionBarView.this.setExpandState(1);
                }
            }
        }
    }

    class n7h implements View.OnClickListener {
        n7h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener onClickListener = ActionBarView.this.in;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarView$p */
    class C6978p implements AdapterView.OnItemSelectedListener {
        C6978p() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (ActionBarView.this.rt0p != null) {
                ActionBarView.this.rt0p.onNavigationItemSelected(i2, j2);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarView$q */
    class RunnableC6979q implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f39127k;

        RunnableC6979q(boolean z2) {
            this.f39127k = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarView.this.ngy(this.f39127k);
            ActionMenuView actionMenuView = ActionBarView.this.f39316i;
            if (actionMenuView != null) {
                actionMenuView.setVisibility(0);
            }
        }
    }

    class qrj implements View.OnClickListener {
        qrj() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActionBarView actionBarView = ActionBarView.this;
            actionBarView.n1u4.onMenuItemSelected(0, actionBarView.u6);
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarView$s */
    class C6980s extends TransitionListener {
        C6980s() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj, Collection<UpdateInfo> collection) {
            super.onBegin(obj, collection);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            if (ActionBarView.this.sk1t.getAlpha() != 0.0f) {
                if (ActionBarView.this.sk1t.getVisibility() != 0) {
                    ActionBarView.this.aw3.qrj(0);
                    return;
                }
                return;
            }
            ActionBarView actionBarView = ActionBarView.this;
            int i2 = actionBarView.f39309b;
            if (i2 == 0) {
                if (actionBarView.sk1t.getVisibility() != 8) {
                    ActionBarView.this.aw3.qrj(8);
                }
            } else if (i2 == 2 && actionBarView.sk1t.getVisibility() != 4) {
                ActionBarView.this.aw3.qrj(4);
            }
        }
    }

    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f39131k;

        toq(boolean z2) {
            this.f39131k = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarView.this.ngy(this.f39131k);
            ActionMenuView actionMenuView = ActionBarView.this.f39316i;
            if (actionMenuView != null) {
                actionMenuView.setVisibility(0);
            }
        }
    }

    class x2 implements View.OnClickListener {
        x2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActionBarView actionBarView = ActionBarView.this;
            actionBarView.n1u4.onMenuItemSelected(0, actionBarView.deb);
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarView$y */
    class C6981y extends TransitionListener {
        C6981y() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj, Collection<UpdateInfo> collection) {
            super.onBegin(obj, collection);
            if (ActionBarView.this.sk1t == null || ActionBarView.this.sk1t.getVisibility() == 0) {
                return;
            }
            ActionBarView.this.aw3.qrj(0);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            if (ActionBarView.this.ilvb) {
                ActionBarView.this.requestLayout();
            }
            ActionBarView.this.ilvb = false;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            super.onUpdate(obj, collection);
            if (ActionBarView.this.ilvb) {
                ActionBarView.this.requestLayout();
            }
        }
    }

    class zy extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ActionBarOverlayLayout f39135k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f86910toq;

        zy(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
            this.f39135k = actionBarOverlayLayout;
            this.f86910toq = i2;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onBegin(Object obj) {
            if (ActionBarView.this.qns) {
                return;
            }
            ActionBarView.this.qns = true;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            ActionBarView.this.qns = false;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, View.TRANSLATION_Y.getName());
            if (updateInfoFindByName == null) {
                return;
            }
            this.f39135k.mo25066k((int) (this.f86910toq - updateInfoFindByName.getFloatValue()), 0);
        }
    }

    public ActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ac = -1;
        this.ar = null;
        this.mjvl = false;
        this.ls9 = true;
        this.gjxq = false;
        this.q09 = true;
        this.p2c = true;
        this.yf = false;
        this.v62 = false;
        this.vl4 = false;
        this.ph90 = true;
        this.faqz = 0.0f;
        this.ilvb = false;
        this.vh6m = new C6974g();
        this.nze = new f7l8();
        this.o9 = new C6981y();
        this.cr = new C6980s();
        this.kybi = new C6978p();
        this.w0an = new ld6();
        this.o917 = new x2();
        this.vfa = new qrj();
        this.cm0 = new n7h();
        this.lgf = new C6976k();
        this.kl1 = false;
        this.vv9 = 0;
        this.q7 = new toq.C8098toq();
        this.aw3 = new toq.C8098toq();
        this.ry = false;
        this.sh5k = false;
        this.sufz = false;
        this.rd = false;
        this.e9u = false;
        this.bzt0 = null;
        this.jjwz = new RunnableC6977n();
        this.k0 = context;
        this.wg3 = new Scroller(context);
        this.sufz = false;
        this.rd = false;
        this.ax = this.k0.getResources().getDisplayMetrics().density;
        this.n5ij = context.getResources().getDimensionPixelOffset(toq.f7l8.f75378bap7);
        this.lw58 = context.getResources().getDimensionPixelOffset(toq.f7l8.f75423ga);
        this.fn2 = context.getResources().getDimensionPixelOffset(toq.f7l8.f75403e5);
        this.us2t = context.getResources().getDimensionPixelOffset(toq.f7l8.f75500pjz9);
        this.nq0z = context.getResources().getDimensionPixelOffset(toq.f7l8.f75473mbx);
        this.a7kc = context.getResources().getDimensionPixelOffset(toq.f7l8.f75456ktq);
        this.k84 = context.getResources().getDimensionPixelOffset(toq.f7l8.f75370a5id);
        this.cecm = 0;
        this.f39332y.addListeners(this.o9);
        this.f39326s.addListeners(this.cr);
        this.f39318k.addListeners(this.vh6m);
        this.f39324q.addListeners(this.nze);
        FrameLayout frameLayout = new FrameLayout(context);
        this.zmmu = frameLayout;
        frameLayout.setId(toq.C6054p.f34898l);
        this.zmmu.setForegroundGravity(17);
        this.zmmu.setVisibility(0);
        this.zmmu.setAlpha(this.f39309b == 0 ? 1.0f : 0.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.sk1t = frameLayout2;
        frameLayout2.setId(toq.C6054p.f34889c);
        FrameLayout frameLayout3 = this.sk1t;
        int i2 = this.n5ij;
        frameLayout3.setPaddingRelative(i2, this.fn2, i2, this.us2t);
        this.sk1t.setVisibility(0);
        this.sk1t.setAlpha(this.f39309b != 0 ? 1.0f : 0.0f);
        this.q7.toq(this.zmmu);
        this.aw3.toq(this.sk1t);
        setBackgroundResource(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.f34844k, R.attr.actionBarStyle, 0);
        this.bq = typedArrayObtainStyledAttributes.getInt(toq.ki.f34849p, 0);
        this.ad = typedArrayObtainStyledAttributes.getText(toq.ki.f34858y);
        this.am = typedArrayObtainStyledAttributes.getText(toq.ki.f76213x2);
        this.lr4 = typedArrayObtainStyledAttributes.getBoolean(toq.ki.f76221y9n, false);
        this.bs = typedArrayObtainStyledAttributes.getDrawable(toq.ki.f34852s);
        this.aj = typedArrayObtainStyledAttributes.getDrawable(toq.ki.f76186toq);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.bc = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76195uv6, toq.qrj.f76728lvui);
        this.bd = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76055cdj, toq.qrj.f76741oc);
        this.kdv1 = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76147n7h, 0);
        this.h06 = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76118kja0, 0);
        this.afw = typedArrayObtainStyledAttributes.getDimensionPixelOffset(toq.ki.f34841h, 0);
        this.oyp = typedArrayObtainStyledAttributes.getDimensionPixelOffset(toq.ki.f76116ki, 0);
        setDisplayOptions(typedArrayObtainStyledAttributes.getInt(toq.ki.f76126ld6, 0));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(toq.ki.f76173qrj, 0);
        if (resourceId != 0) {
            View viewInflate = layoutInflaterFrom.inflate(resourceId, (ViewGroup) this, false);
            this.xqx = viewInflate;
            viewInflate.setLayoutParams(new AbstractC0096k.toq(-1, -2, on46));
            this.bq = 0;
        }
        this.f39310c = typedArrayObtainStyledAttributes.getLayoutDimension(toq.ki.f34840g, 0);
        this.f39312e = typedArrayObtainStyledAttributes.getLayoutDimension(toq.ki.f34850q, 0);
        this.qnoq = typedArrayObtainStyledAttributes.getBoolean(toq.ki.f34843j, false);
        typedArrayObtainStyledAttributes.recycle();
        this.deb = new MenuItemC7021k(context, 0, R.id.home, 0, 0, this.ad);
        this.u6 = new MenuItemC7021k(context, 0, R.id.title, 0, 0, this.ad);
        gcp();
    }

    private void b3e() {
        if (this.tgs == null) {
            HomeView homeView = (HomeView) LayoutInflater.from(this.k0).inflate(this.bd, (ViewGroup) this, false);
            this.tgs = homeView;
            homeView.setOnClickListener(this.o917);
            this.tgs.setClickable(true);
            this.tgs.setFocusable(true);
            int i2 = this.w97r;
            if (i2 != 0) {
                this.tgs.m25173q(i2);
                this.w97r = 0;
            }
            Drawable drawable = this.tlhn;
            if (drawable != null) {
                this.tgs.m25172n(drawable);
                this.tlhn = null;
            }
            addView(this.tgs);
        }
    }

    private void b8(ViewGroup viewGroup, View view, int i2) {
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (viewGroup != null) {
            viewGroup.addView(view, i2);
        }
    }

    private void b9ub(ViewGroup viewGroup, View view) {
        b8(viewGroup, view, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r5 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return androidx.core.view.qrj.f50866zy;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return androidx.core.view.qrj.f50865toq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r5 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int bap7(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r0
            r0 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r0 & r4
            if (r0 != 0) goto L1e
            r0 = 3
            r1 = 8388613(0x800005, float:1.175495E-38)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 != r0) goto L18
            if (r5 == 0) goto L16
        L14:
            r4 = r1
            goto L1e
        L16:
            r4 = r2
            goto L1e
        L18:
            r0 = 5
            if (r4 != r0) goto L1e
            if (r5 == 0) goto L14
            goto L16
        L1e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.bap7(int, boolean):int");
    }

    private void bih(int i2) {
        ProgressBar circularProgressBar = getCircularProgressBar();
        ProgressBar horizontalProgressBar = getHorizontalProgressBar();
        if (i2 == -1) {
            if (horizontalProgressBar != null) {
                horizontalProgressBar.setVisibility((horizontalProgressBar.isIndeterminate() || horizontalProgressBar.getProgress() < 10000) ? 0 : 4);
            }
            if (circularProgressBar != null) {
                circularProgressBar.setVisibility(0);
                return;
            }
            return;
        }
        if (i2 == -2) {
            if (horizontalProgressBar != null) {
                horizontalProgressBar.setVisibility(8);
            }
            if (circularProgressBar != null) {
                circularProgressBar.setVisibility(8);
                return;
            }
            return;
        }
        if (i2 == -3) {
            horizontalProgressBar.setIndeterminate(true);
            return;
        }
        if (i2 == -4) {
            horizontalProgressBar.setIndeterminate(false);
            return;
        }
        if (i2 < 0 || i2 > 10000) {
            return;
        }
        horizontalProgressBar.setProgress(i2 + 0);
        if (i2 < 10000) {
            ps(horizontalProgressBar, circularProgressBar);
        } else {
            jz5(horizontalProgressBar, circularProgressBar);
        }
    }

    private void cnbm() {
        FrameLayout frameLayout = this.vb6;
        if (frameLayout != null) {
            if (frameLayout.getParent() != null) {
                removeView(this.vb6);
                this.q7.zy(this.vb6);
            }
            this.vb6.removeAllViews();
            this.vb6 = null;
        }
        FrameLayout frameLayout2 = this.k6e;
        if (frameLayout2 != null) {
            if (frameLayout2.getParent() != null) {
                removeView(this.k6e);
                this.aw3.zy(this.k6e);
            }
            this.k6e.removeAllViews();
            this.k6e = null;
        }
        SecondaryTabContainerView secondaryTabContainerView = this.ndjo;
        if (secondaryTabContainerView != null && secondaryTabContainerView.getParent() != null) {
            removeView(this.ndjo);
        }
        SecondaryTabContainerView secondaryTabContainerView2 = this.d1cy;
        if (secondaryTabContainerView2 != null && secondaryTabContainerView2.getParent() != null) {
            removeView(this.d1cy);
        }
        if (!this.wg3.isFinished()) {
            this.wg3.forceFinished(true);
        }
        removeCallbacks(this.jjwz);
        setExpandState(this.f39331x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cv06() {
        this.gjxq = false;
        h7am();
        if (this.bq == 2) {
            yqrt();
        }
        int i2 = this.f39309b;
        if (i2 == 1) {
            if (this.s8y == null) {
                v0af(false);
            }
            toq.C8098toq c8098toq = this.q7;
            if (c8098toq != null) {
                c8098toq.m25230g();
            }
        } else if (i2 == 0 && this.xk5 == null) {
            r8s8(false);
        }
        o5();
        post(new Runnable() { // from class: miuix.appcompat.internal.app.widget.cdj
            @Override // java.lang.Runnable
            public final void run() {
                this.f39234k.ij();
            }
        });
        if (this.a1 != null || vep5()) {
            setTitleVisibility(false);
        }
        b9ub(this, this.zmmu);
        b8(this, this.sk1t, 0);
    }

    /* JADX INFO: renamed from: d */
    private void m25157d() {
        if (this.ndjo != null) {
            FrameLayout frameLayout = this.vb6;
            if (frameLayout == null) {
                FrameLayout frameLayoutSok = sok(toq.C6054p.f76380n5r1);
                this.vb6 = frameLayoutSok;
                if (this.f39309b == 1) {
                    frameLayoutSok.setAlpha(0.0f);
                }
            } else {
                frameLayout.removeAllViews();
            }
            this.vb6.addView(this.ndjo, new ViewGroup.LayoutParams(-1, -2));
            if (this.vb6.getParent() == null) {
                addView(this.vb6, new FrameLayout.LayoutParams(-1, -2));
                if (this.f39309b == 1) {
                    this.vb6.setVisibility(8);
                }
                this.q7.toq(this.vb6);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e5(boolean r21, int r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.e5(boolean, int, int, int, int, int):void");
    }

    private boolean ebn() {
        HomeView homeView;
        return this.lr4 && ixz() && ((homeView = this.tgs) == null || homeView.getVisibility() == 8);
    }

    private void ec() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ScrollingTabContainerView scrollingTabContainerView = this.th6;
        if (scrollingTabContainerView != null && (layoutParams4 = scrollingTabContainerView.getLayoutParams()) != null) {
            layoutParams4.width = -2;
            layoutParams4.height = -1;
        }
        ScrollingTabContainerView scrollingTabContainerView2 = this.q7k9;
        if (scrollingTabContainerView2 != null && (layoutParams3 = scrollingTabContainerView2.getLayoutParams()) != null) {
            layoutParams3.width = -2;
            layoutParams3.height = -2;
        }
        SecondaryTabContainerView secondaryTabContainerView = this.ndjo;
        if (secondaryTabContainerView != null && (layoutParams2 = secondaryTabContainerView.getLayoutParams()) != null) {
            layoutParams2.width = -1;
            layoutParams2.height = -1;
        }
        SecondaryTabContainerView secondaryTabContainerView2 = this.d1cy;
        if (secondaryTabContainerView2 == null || (layoutParams = secondaryTabContainerView2.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
    }

    private boolean ew() {
        FrameLayout frameLayout = this.vb6;
        return (frameLayout == null || frameLayout.getParent() != this || this.vb6.getChildCount() == 0) ? false : true;
    }

    private void fnq8() {
        FrameLayout frameLayout = this.vb6;
        if (frameLayout != null) {
            if (frameLayout.getParent() == this) {
                removeView(this.vb6);
                this.q7.zy(this.vb6);
            }
            this.vb6.removeAllViews();
            this.vb6 = null;
        }
        FrameLayout frameLayout2 = this.k6e;
        if (frameLayout2 != null) {
            if (frameLayout2.getParent() == this) {
                removeView(this.k6e);
                this.aw3.zy(this.k6e);
            }
            this.k6e.removeAllViews();
            this.k6e = null;
        }
        this.zmmu.removeAllViews();
        ScrollingTabContainerView scrollingTabContainerView = this.th6;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.setVisibility(0);
            b9ub(this.zmmu, this.th6);
        }
        this.sk1t.removeAllViews();
        ScrollingTabContainerView scrollingTabContainerView2 = this.q7k9;
        if (scrollingTabContainerView2 != null) {
            scrollingTabContainerView2.setVisibility(0);
            b9ub(this.sk1t, this.q7k9);
        }
        if (this.f39309b == 2) {
            setExpandState(this.f39331x, false, false);
        }
    }

    private boolean gc3c(ViewGroup viewGroup) {
        return viewGroup != null && viewGroup.getChildCount() == 1 && (viewGroup.getChildAt(0) instanceof ScrollingTabContainerView);
    }

    private void gcp() {
        post(new Runnable() { // from class: miuix.appcompat.internal.app.widget.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f39259k.zwy();
            }
        });
    }

    private ProgressBar getCircularProgressBar() {
        ProgressBar progressBar = this.ei;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        return progressBar;
    }

    private ProgressBar getHorizontalProgressBar() {
        ProgressBar progressBar = this.zr5t;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        return progressBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable getIcon() {
        if ((this.be & 1) != 1) {
            Context context = this.k0;
            if (context instanceof Activity) {
                try {
                    this.aj = context.getPackageManager().getActivityIcon(((Activity) this.k0).getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e(otes, "Activity component name not found!", e2);
                }
            }
            if (this.aj == null) {
                this.aj = this.k0.getApplicationInfo().loadIcon(this.k0.getPackageManager());
            }
            this.be |= 1;
        }
        return this.aj;
    }

    private Drawable getLogo() {
        if ((this.be & 2) != 2) {
            Context context = this.k0;
            if (context instanceof Activity) {
                try {
                    this.bs = context.getPackageManager().getActivityLogo(((Activity) this.k0).getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e(otes, "Activity component name not found!", e2);
                }
            }
            if (this.bs == null) {
                this.bs = this.k0.getApplicationInfo().loadLogo(this.k0.getPackageManager());
            }
            this.be |= 2;
        }
        return this.bs;
    }

    private void h4b() {
        if (!this.f39325r || this.f39316i == null) {
            return;
        }
        ((ActionBarOverlayLayout) this.f39327t.getParent()).mo25066k((int) (this.f39316i.getCollapsedHeight() - this.f39316i.getTranslationY()), 0);
    }

    private void h7am() {
        if (this.hp == null) {
            View viewM25244q = miuix.appcompat.internal.util.toq.m25244q(getContext(), null);
            this.hp = viewM25244q;
            viewM25244q.setOnClickListener(this.o917);
        }
        int i2 = this.ac;
        int i3 = 0;
        boolean z2 = (i2 & 4) != 0;
        boolean z3 = (i2 & 2) != 0;
        View view = this.hp;
        if (z3) {
            i3 = 8;
        } else if (!z2) {
            i3 = 4;
        }
        view.setVisibility(i3);
        this.hp.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        b9ub(this, this.hp);
    }

    private int i9jn(View view) {
        int width = (getWidth() - view.getMeasuredWidth()) / 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return width - (layoutParams instanceof LinearLayout.LayoutParams ? 0 + ((LinearLayout.LayoutParams) layoutParams).getMarginStart() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ij() {
        lw();
        setTitleVisibility(kx3());
        o5();
    }

    private void ikck() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        this.zm.m25273a(getResources().getBoolean(toq.C6053n.f76258toq));
        this.zm.zp(this.ule);
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = androidx.core.view.qrj.f50866zy;
        ActionMenuView actionMenuView = (ActionMenuView) this.zm.toq(this);
        ViewGroup viewGroup = (ViewGroup) actionMenuView.getParent();
        if (viewGroup != null && viewGroup != this) {
            viewGroup.removeView(actionMenuView);
        }
        addView(actionMenuView, layoutParams);
        this.xhv = actionMenuView;
    }

    private boolean ix() {
        FrameLayout frameLayout = this.k6e;
        return (frameLayout == null || frameLayout.getParent() != this || this.k6e.getChildCount() == 0) ? false : true;
    }

    private boolean ixz() {
        View view = this.xqx;
        if (view == null || view.getVisibility() != 0) {
            return true;
        }
        ViewGroup.LayoutParams layoutParams = this.xqx.getLayoutParams();
        AbstractC0096k.toq toqVar = layoutParams instanceof AbstractC0096k.toq ? (AbstractC0096k.toq) layoutParams : null;
        return toqVar != null && bap7(toqVar.f281k, miuix.internal.util.n7h.x2(this)) == 8388613;
    }

    private void jz5(ProgressBar progressBar, ProgressBar progressBar2) {
        if (progressBar2 != null && progressBar2.getVisibility() == 0) {
            progressBar2.setVisibility(4);
        }
        if (progressBar == null || progressBar.getVisibility() != 0) {
            return;
        }
        progressBar.setVisibility(4);
    }

    private TextView kcsr(View view) {
        if (view != null) {
            return (TextView) view.findViewById(R.id.title);
        }
        return null;
    }

    private void kiv() {
        if (this.s8y != null) {
            boolean zZ4t = (!((this.ac & 16) != 0) || this.xqx == null) ? false : z4t();
            this.s8y.ki(0);
            if (!zZ4t) {
                this.s8y.m28140h(this.ad);
            }
            this.s8y.ld6(this.am);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ktq() {
        if (this.yl25 == null) {
            HomeView homeView = (HomeView) LayoutInflater.from(this.k0).inflate(this.bd, (ViewGroup) this, false);
            this.yl25 = homeView;
            homeView.zy(true);
            this.yl25.setOnClickListener(this.w0an);
        }
    }

    private boolean kx3() {
        return (this.a1 != null || (this.ac & 8) == 0 || vep5()) ? false : true;
    }

    private void lw() {
        if (this.gjxq) {
            return;
        }
        this.gjxq = true;
        if ((this.ac & 8) != 0) {
            if (this.s8y == null) {
                v0af(true);
                kiv();
            }
            if (this.xk5 == null) {
                r8s8(true);
            }
            nnh();
        }
        C7752g c7752g = this.xk5;
        if (c7752g != null) {
            Rect rectM28136y = c7752g.m28136y();
            rectM28136y.left -= C7164n.m25953y(getContext(), toq.C6055q.f76577mcp);
            setTouchDelegate(new TouchDelegate(rectM28136y, this.xk5.m28134s()));
        }
    }

    private void m2t() {
        if (getExpandState() == 0) {
            this.q7.m25231k(1.0f, 0, 0, this.f39326s);
        } else if (getExpandState() == 1) {
            this.q7.m25235s(0.0f);
            this.q7.qrj(0);
            this.aw3.m25231k(1.0f, 0, 0, this.f39332y);
        }
    }

    private void m58i(View view) {
        ViewGroup viewGroup;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    private void mu() {
        if (this.d1cy != null) {
            FrameLayout frameLayout = this.k6e;
            if (frameLayout == null) {
                FrameLayout frameLayoutSok = sok(toq.C6054p.f76364lrht);
                this.k6e = frameLayoutSok;
                if (this.f39309b == 0) {
                    frameLayoutSok.setAlpha(0.0f);
                }
            } else {
                frameLayout.removeAllViews();
            }
            this.k6e.addView(this.d1cy, new ViewGroup.LayoutParams(-1, -2));
            if (this.k6e.getParent() == null) {
                addView(this.k6e, new FrameLayout.LayoutParams(-1, -2));
                if (this.f39309b == 0) {
                    this.k6e.setVisibility(8);
                }
                this.aw3.toq(this.k6e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n2t() {
        C7752g c7752g = this.xk5;
        if (c7752g != null) {
            c7752g.wvg(c7752g.m28133p());
        }
    }

    private void nme(Runnable runnable) {
        this.s3 = runnable;
    }

    private void nnh() {
        C7752g c7752g = this.xk5;
        if (c7752g != null) {
            if (c7752g.x2() != 0) {
                this.xk5.fti(0);
            }
            this.xk5.jk(this.ad);
            this.xk5.fu4(this.am);
            post(new Runnable() { // from class: miuix.appcompat.internal.app.widget.kja0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39262k.pjz9();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nsb() {
        ActionMenuPresenter actionMenuPresenter = this.zm;
        if (actionMenuPresenter == null || !actionMenuPresenter.m25280m()) {
            return;
        }
        InterfaceC0954z interfaceC0954z = this.ar;
        if (interfaceC0954z != null ? interfaceC0954z.getLifecycle().toq().equals(kja0.zy.RESUMED) : true) {
            return;
        }
        this.zm.hb(false);
    }

    private void o5() {
        boolean z2 = ukdy() && TextUtils.isEmpty(this.ad);
        boolean zIsEmpty = TextUtils.isEmpty(this.am);
        int i2 = (!zIsEmpty || (!z2 && this.ph90)) ? 0 : 8;
        C7752g c7752g = this.xk5;
        if (c7752g != null) {
            c7752g.fti(i2);
        }
        int i3 = zIsEmpty ? 8 : 0;
        C7752g c7752g2 = this.xk5;
        if (c7752g2 != null) {
            c7752g2.m28135t(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void pjz9() {
        C7752g c7752g = this.xk5;
        if (c7752g != null) {
            c7752g.wvg(c7752g.m28133p());
        }
    }

    private void ps(ProgressBar progressBar, ProgressBar progressBar2) {
        if (progressBar2 != null && progressBar2.getVisibility() == 4) {
            progressBar2.setVisibility(0);
        }
        if (progressBar == null || progressBar.getProgress() >= 10000) {
            return;
        }
        progressBar.setVisibility(0);
    }

    private void qkj8() {
        FrameLayout frameLayout;
        View view;
        View viewM28134s = null;
        if (this.f39309b == 1) {
            frameLayout = this.sk1t;
            C7756y c7756y = this.s8y;
            if (c7756y != null) {
                viewM28134s = c7756y.zy();
            }
        } else {
            frameLayout = this.zmmu;
            C7752g c7752g = this.xk5;
            if (c7752g != null) {
                viewM28134s = c7752g.m28134s();
            }
        }
        boolean z2 = (!((this.ac & 16) != 0) || (view = this.xqx) == null || kcsr((FrameLayout) view.findViewById(toq.C6054p.f34892f)) == null) ? false : true;
        boolean z3 = ((this.ac & 8) == 0 || vep5()) ? false : true;
        if ((frameLayout.getChildCount() == 0 && !z2) || !z3) {
            fnq8();
        } else if (z2) {
            m25157d();
            mu();
        } else if (viewM28134s != null && viewM28134s.getParent() == frameLayout) {
            if (C7010k.toq(this.k0).m25262y() || gc3c(frameLayout)) {
                fnq8();
            } else {
                m25157d();
                mu();
            }
        }
        if (this.zmmu.getParent() != this) {
            b9ub(this, this.zmmu);
        }
        if (this.sk1t.getParent() != this) {
            b8(this, this.sk1t, 0);
        }
        ec();
        o5();
    }

    private void qo(float f2) {
        float fMin = 1.0f - Math.min(1.0f, 3.0f * f2);
        int i2 = this.f39309b;
        if (i2 == 2) {
            if (this.f86976ab == f2) {
                this.faqz = fMin;
                return;
            }
            if (fMin > 0.0f) {
                if (this.kl1) {
                    this.kl1 = false;
                    this.q7.m25231k(0.0f, 0, 20, this.f39324q);
                    if (this.f39320m.size() > 0) {
                        Folme.useValue(zurt.InterfaceC0290k.f47416lvui, 0).setFlags(1L).setup(1).setTo("expand", Integer.valueOf(this.vv9)).to("expand", 20, this.f39314g);
                    }
                    this.aw3.qrj(0);
                }
            } else if (!this.kl1) {
                this.kl1 = true;
                this.q7.m25231k(1.0f, 0, 0, this.f39318k);
                if (this.f39320m.size() > 0) {
                    Folme.useValue(zurt.InterfaceC0290k.f47416lvui, 0).setFlags(1L).setup(0).setTo("collapse", Integer.valueOf(this.vv9)).to("collapse", 0, this.f39321n);
                }
                this.q7.qrj(0);
            }
            if (this.faqz != fMin) {
                this.aw3.m25231k(fMin, 0, 0, this.f39326s);
                this.faqz = fMin;
                return;
            }
            return;
        }
        if (i2 == 1) {
            this.ilvb = this.faqz == 0.0f;
            this.vv9 = 20;
            this.faqz = 1.0f;
            this.kl1 = false;
            if (this.f86976ab == f2) {
                return;
            }
            this.q7.m25231k(0.0f, 0, 20, this.f39324q);
            this.aw3.m25231k(1.0f, 0, 0, this.f39332y);
            return;
        }
        if (i2 == 0) {
            this.ilvb = false;
            this.vv9 = 0;
            this.faqz = 0.0f;
            this.kl1 = true;
            if (this.f86976ab == f2) {
                return;
            }
            this.q7.m25231k(1.0f, 0, 0, this.f39318k);
            this.aw3.m25231k(0.0f, 0, 0, this.f39326s);
        }
    }

    private void r25n(ScrollingTabContainerView scrollingTabContainerView, ScrollingTabContainerView scrollingTabContainerView2, SecondaryTabContainerView secondaryTabContainerView, SecondaryTabContainerView secondaryTabContainerView2) {
        this.th6 = scrollingTabContainerView;
        this.q7k9 = scrollingTabContainerView2;
        this.ndjo = secondaryTabContainerView;
        this.d1cy = secondaryTabContainerView2;
        if (secondaryTabContainerView != null) {
            secondaryTabContainerView.setParentApplyBlur(this.vl4);
        }
        SecondaryTabContainerView secondaryTabContainerView3 = this.d1cy;
        if (secondaryTabContainerView3 != null) {
            secondaryTabContainerView3.setParentApplyBlur(this.vl4);
        }
    }

    private void r8s8(boolean z2) {
        if (this.xk5 == null) {
            C7752g qVar = miuix.appcompat.internal.util.toq.toq(getContext(), this.kdv1, this.h06);
            this.xk5 = qVar;
            qVar.gvn7(this.q09);
            this.xk5.mcp(this.f39323p, this.f39309b);
            this.xk5.fn3e(this.f39329v);
            this.xk5.jk(this.ad);
            this.xk5.ni7(this.vfa);
            this.xk5.m28137z(this.cm0);
            this.xk5.fu4(this.am);
            if (!z2) {
                b9ub(this.zmmu, this.xk5.m28134s());
                return;
            }
            if ((this.ac & 8) != 0) {
                if ((getNavigationMode() == 2) && ukdy()) {
                    return;
                }
                if (gc3c(this.zmmu)) {
                    m25157d();
                }
                this.zmmu.removeAllViews();
                b9ub(this.zmmu, this.xk5.m28134s());
            }
        }
    }

    private void ra() {
        ActionMenuPresenter actionMenuPresenter = this.zm;
        if (actionMenuPresenter == null) {
            return;
        }
        actionMenuPresenter.m25282u();
        ActionMenuPresenter actionMenuPresenter2 = this.zm;
        if (actionMenuPresenter2 instanceof C7020g) {
            ((C7020g) actionMenuPresenter2).m25311v();
        }
    }

    private void setTitleImpl(CharSequence charSequence) {
        boolean zKx3 = kx3();
        this.ad = charSequence;
        boolean z2 = false;
        if ((!((this.ac & 16) != 0) || this.xqx == null) ? false : z4t()) {
            return;
        }
        nnh();
        kiv();
        boolean zKx32 = kx3();
        setTitleVisibility(zKx32);
        MenuItemC7021k menuItemC7021k = this.deb;
        if (menuItemC7021k != null) {
            menuItemC7021k.setTitle(charSequence);
        }
        MenuItemC7021k menuItemC7021k2 = this.u6;
        if (menuItemC7021k2 != null) {
            menuItemC7021k2.setTitle(charSequence);
        }
        if (zKx3 && !zKx32) {
            if ((getNavigationMode() == 2) || ukdy()) {
                fnq8();
                return;
            }
            return;
        }
        if (zKx3 || !zKx32) {
            return;
        }
        if ((getNavigationMode() == 2) && ukdy()) {
            return;
        }
        C7752g c7752g = this.xk5;
        if (c7752g != null && c7752g.m28134s().getParent() == null) {
            z2 = true;
        }
        C7756y c7756y = this.s8y;
        if ((c7756y == null || z2 || c7756y.zy().getParent() != null) ? z2 : true) {
            yqrt();
            C7752g c7752g2 = this.xk5;
            if (c7752g2 != null) {
                b9ub(this.zmmu, c7752g2.m28134s());
            }
            C7756y c7756y2 = this.s8y;
            if (c7756y2 != null) {
                b9ub(this.sk1t, c7756y2.zy());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleVisibility(boolean z2) {
        C7752g c7752g = this.xk5;
        if (c7752g != null) {
            c7752g.jp0y(z2 ? 0 : 8);
        }
        C7756y c7756y = this.s8y;
        if (c7756y != null) {
            c7756y.t8r(z2 ? 0 : 4);
        }
        if (this.hp != null && (getDisplayOptions() & 32) == 0) {
            int i2 = this.ac;
            boolean z3 = (i2 & 4) != 0;
            this.hp.setVisibility((i2 & 2) != 0 ? 8 : z3 ? 0 : 4);
        }
        int i3 = TextUtils.isEmpty(this.am) ? this.us2t : this.nq0z;
        FrameLayout frameLayout = this.sk1t;
        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), this.sk1t.getPaddingTop(), this.sk1t.getPaddingEnd(), i3);
    }

    private FrameLayout sok(int i2) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(i2);
        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), frameLayout.getPaddingEnd(), this.a7kc);
        frameLayout.setVisibility(0);
        return frameLayout;
    }

    private boolean tfm() {
        if (this.xk5 == null || TextUtils.isEmpty(this.ad)) {
            return false;
        }
        boolean zM28132g = this.xk5.m28132g(this.ad.toString());
        if (!C7010k.toq(this.k0).m25261s() || zM28132g) {
            return zM28132g;
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    private void m25166v() {
        FrameLayout frameLayout = (FrameLayout) this.xqx.findViewById(toq.C6054p.f34892f);
        TextView textViewKcsr = kcsr(frameLayout);
        if (textViewKcsr != null) {
            this.ay = textViewKcsr.getText();
            yqrt();
            this.dy = frameLayout;
            this.q7.toq(frameLayout);
            C7756y c7756y = this.s8y;
            if (c7756y != null) {
                c7756y.m28140h(this.ay);
                this.s8y.ki(0);
                this.s8y.t8r(0);
                this.s8y.n7h(8);
                if (this.sk1t != this.s8y.zy().getParent()) {
                    b9ub(this.sk1t, this.s8y.zy());
                }
            }
            textViewKcsr.addTextChangedListener(this.lgf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v0af(boolean r6) {
        /*
            r5 = this;
            xm.y r0 = r5.s8y
            if (r0 != 0) goto Lbb
            android.content.Context r0 = r5.getContext()
            xm.y r0 = miuix.appcompat.internal.util.toq.zy(r0)
            r5.s8y = r0
            boolean r1 = r5.p2c
            r0.m28141i(r1)
            xm.y r0 = r5.s8y
            boolean r1 = r5.f39315h
            int r2 = r5.f39309b
            r0.kja0(r1, r2)
            xm.y r0 = r5.s8y
            boolean r1 = r5.f39329v
            r0.m28146y(r1)
            java.lang.CharSequence r0 = r5.ad
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L52
            int r3 = r5.ac
            r3 = r3 & 16
            if (r3 == 0) goto L31
            r3 = r1
            goto L32
        L31:
            r3 = r2
        L32:
            if (r3 == 0) goto L52
            android.view.View r3 = r5.xqx
            if (r3 == 0) goto L52
            int r4 = gb.toq.C6054p.f34892f
            android.view.View r3 = r3.findViewById(r4)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            android.widget.TextView r3 = r5.kcsr(r3)
            if (r3 == 0) goto L52
            java.lang.CharSequence r3 = r5.ay
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L52
            java.lang.CharSequence r0 = r5.ay
            r3 = r1
            goto L53
        L52:
            r3 = r2
        L53:
            xm.y r4 = r5.s8y
            r4.m28140h(r0)
            xm.y r0 = r5.s8y
            android.view.View$OnClickListener r4 = r5.vfa
            r0.m28143p(r4)
            xm.y r0 = r5.s8y
            android.view.View$OnClickListener r4 = r5.cm0
            r0.x2(r4)
            if (r3 != 0) goto L70
            xm.y r0 = r5.s8y
            java.lang.CharSequence r3 = r5.am
            r0.ld6(r3)
            goto L76
        L70:
            xm.y r0 = r5.s8y
            r3 = 0
            r0.ld6(r3)
        L76:
            if (r6 != 0) goto L84
            android.widget.FrameLayout r6 = r5.sk1t
            xm.y r0 = r5.s8y
            android.view.View r0 = r0.zy()
            r5.b9ub(r6, r0)
            goto Lbb
        L84:
            int r6 = r5.ac
            r6 = r6 & 8
            if (r6 == 0) goto L8c
            r6 = r1
            goto L8d
        L8c:
            r6 = r2
        L8d:
            if (r6 == 0) goto Lbb
            int r6 = r5.getNavigationMode()
            r0 = 2
            if (r6 != r0) goto L97
            goto L98
        L97:
            r1 = r2
        L98:
            if (r1 == 0) goto La0
            boolean r6 = r5.ukdy()
            if (r6 != 0) goto Lbb
        La0:
            android.widget.FrameLayout r6 = r5.sk1t
            boolean r6 = r5.gc3c(r6)
            if (r6 == 0) goto Lab
            r5.mu()
        Lab:
            android.widget.FrameLayout r6 = r5.sk1t
            r6.removeAllViews()
            android.widget.FrameLayout r6 = r5.sk1t
            xm.y r0 = r5.s8y
            android.view.View r0 = r0.zy()
            r5.b9ub(r6, r0)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.v0af(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v5yj() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            boolean z2 = se() && onBackInvokedDispatcherFindOnBackInvokedDispatcher != null && C0683f.zsr0(this);
            if (z2 && this.b9 == null) {
                if (this.br == null) {
                    this.br = new OnBackInvokedCallback() { // from class: miuix.appcompat.internal.app.widget.h
                        @Override // android.window.OnBackInvokedCallback
                        public final void onBackInvoked() {
                            this.f39258k.py();
                        }
                    };
                }
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.br);
                this.b9 = onBackInvokedDispatcherFindOnBackInvokedDispatcher;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.b9) == null) {
                return;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.br);
            this.b9 = null;
        }
    }

    private boolean vep5() {
        return TextUtils.isEmpty(this.ad) && TextUtils.isEmpty(this.am);
    }

    private void vq() {
        ActionMenuView actionMenuView = (ActionMenuView) this.f39333z.toq(this);
        this.f39316i = actionMenuView;
        if (actionMenuView != null && this.s3 != null) {
            actionMenuView.setVisibility(4);
            this.f39316i.post(this.s3);
            this.s3 = null;
        }
        boolean z2 = this.bb == 3;
        this.f39333z.m25273a(false);
        this.f39333z.ch(getContext().getResources().getDisplayMetrics().widthPixels, true);
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
        if (this.f39327t == null) {
            this.f39316i.setLayoutParams(layoutParams);
            return;
        }
        m58i(this.f39316i);
        this.f39327t.a9(this.f39316i);
        ActionMenuView actionMenuView2 = this.f39316i;
        if (actionMenuView2 instanceof ResponsiveActionMenuView) {
            ResponsiveActionMenuView responsiveActionMenuView = (ResponsiveActionMenuView) actionMenuView2;
            responsiveActionMenuView.setSuspendEnabled(z2);
            responsiveActionMenuView.setHidden(!this.ls9);
        }
        this.f39327t.addView(this.f39316i, 0, layoutParams);
        this.f39327t.jk(this.f39316i);
        View viewFindViewById = this.f39316i.findViewById(toq.C6054p.f76457yp31);
        if (viewFindViewById != null) {
            viewFindViewById.requestLayout();
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Pair<miuix.appcompat.internal.view.menu.f7l8, miuix.appcompat.internal.view.menu.f7l8> w831(Menu menu) {
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var = (miuix.appcompat.internal.view.menu.f7l8) menu;
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var2 = new miuix.appcompat.internal.view.menu.f7l8(this.k0);
        f7l8Var2.lrht(f7l8Var.ni7());
        ArrayList arrayList = new ArrayList();
        for (int size = menu.size() - 1; size >= 0; size--) {
            MenuItemC7036s menuItemC7036s = (MenuItemC7036s) menu.getItem(size);
            if (menuItemC7036s.getGroupId() == toq.C6054p.anhx) {
                ((miuix.appcompat.internal.view.menu.f7l8) menu).x9kr(size);
                SubMenu subMenu = menuItemC7036s.getSubMenu();
                if (subMenu instanceof miuix.appcompat.internal.view.menu.qrj) {
                    ((miuix.appcompat.internal.view.menu.qrj) subMenu).ch(f7l8Var2);
                }
                menuItemC7036s.m25374t(f7l8Var2);
                arrayList.add(menuItemC7036s);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            f7l8Var2.m25343k((MenuItemC7036s) arrayList.get(size2));
        }
        return new Pair<>(f7l8Var, f7l8Var2);
    }

    private boolean wo() {
        return (wx16() || this.xqx != null) && fn3e();
    }

    private boolean wx16() {
        return this.zmmu.getChildCount() > 0 || !(this.xqx == null || this.dy == null);
    }

    private boolean yqrt() {
        if (gc3c(this.zmmu)) {
            m25157d();
        }
        if (gc3c(this.sk1t)) {
            mu();
        }
        this.zmmu.removeAllViews();
        this.sk1t.removeAllViews();
        return true;
    }

    private void yw() {
        C7752g c7752g = this.xk5;
        if (c7752g != null) {
            c7752g.oc(ebn());
        }
    }

    private ActionBarOverlayLayout z4() {
        Object parent = getParent();
        while (true) {
            View view = (View) parent;
            if (view instanceof ActionBarOverlayLayout) {
                return (ActionBarOverlayLayout) view;
            }
            if (!(view.getParent() instanceof View)) {
                throw new IllegalStateException("ActionBarOverlayLayout not found");
            }
            parent = view.getParent();
        }
    }

    private boolean z4t() {
        TextView textViewKcsr = kcsr((FrameLayout) this.xqx.findViewById(toq.C6054p.f34892f));
        if (textViewKcsr == null) {
            return false;
        }
        if (this.s8y == null) {
            return true;
        }
        if (TextUtils.isEmpty(this.ay)) {
            this.s8y.m28140h(this.ad);
            textViewKcsr.removeTextChangedListener(this.lgf);
            textViewKcsr.setText(this.ad);
            textViewKcsr.addTextChangedListener(this.lgf);
        } else {
            if (!this.ay.equals(textViewKcsr.getText())) {
                textViewKcsr.removeTextChangedListener(this.lgf);
                textViewKcsr.setText(this.ay);
                textViewKcsr.addTextChangedListener(this.lgf);
            }
            this.s8y.m28140h(this.ay);
        }
        if (this.s8y.m28144q() != 0) {
            this.s8y.t8r(0);
        }
        this.s8y.n7h(8);
        return true;
    }

    private boolean zkd() {
        return !((this.ac & 8) == 0 || vep5()) || getNavigationMode() == 2;
    }

    private void zsr0(View view, int i2, int i3, int i4, int i5) {
        Rect rect = new Rect();
        rect.set(i2, i3, i4, i5);
        view.setClipBounds(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zwy() {
        int i2 = this.f39309b;
        if (i2 == 0) {
            this.q7.ld6(1.0f, 0, 0, true);
            this.aw3.ld6(0.0f, 0, 0, true);
        } else if (i2 == 1) {
            this.q7.ld6(0.0f, 0, 20, true);
            this.aw3.ld6(1.0f, 0, 0, true);
        }
    }

    public void a5id() {
        this.f39327t.oc();
    }

    public void bek6() {
        ProgressBar progressBar = new ProgressBar(this.k0, null, toq.C6055q.f76673zurt);
        this.ei = progressBar;
        progressBar.setId(toq.C6054p.cr3);
        this.ei.setVisibility(8);
        this.ei.setIndeterminate(true);
        addView(this.ei);
    }

    public int bwp(boolean z2) {
        if (!z2) {
            if (this.f39325r) {
                return this.f39327t.getHeight();
            }
            return 0;
        }
        ActionBarContainer actionBarContainer = this.f39327t;
        if (actionBarContainer != null) {
            return actionBarContainer.getSplitCollapsedHeight();
        }
        return 0;
    }

    public void bz2() {
        ActionMenuView actionMenuView = this.f39316i;
        if (actionMenuView != null) {
            ((ResponsiveActionMenuView) actionMenuView).oc();
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    @dd
    public View cdj(int i2) {
        if (i2 == 0) {
            return findViewById(toq.C6054p.f34899m);
        }
        if (i2 != 1) {
            return null;
        }
        return findViewById(toq.C6054p.f76306ek5k);
    }

    public void cfr() {
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m25275c(false);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void d3() {
        super.d3();
    }

    public void d8wk() {
        if (this.l2jk && this.bq == 2 && this.th6.getParent() == null) {
            qkj8();
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public boolean m28299do() {
        return this.f39325r;
    }

    public void dr(MenuItem menuItem, int i2) {
        ActionMenuPresenter actionMenuPresenter = this.zm;
        if (actionMenuPresenter == null) {
            return;
        }
        actionMenuPresenter.m25279l(menuItem, i2);
    }

    protected void dxef(boolean z2, int i2, int i3, int i4, int i5, int i6, float f2) {
        int i7;
        int measuredWidth;
        if (zkd()) {
            FrameLayout frameLayout = this.sk1t;
            FrameLayout frameLayout2 = this.k6e;
            int i8 = 1.0f - Math.min(1.0f, 3.0f * f2) <= 0.0f ? this.nxe : 0;
            int measuredHeight = (frameLayout == null || frameLayout.getVisibility() != 0) ? 0 : frameLayout.getMeasuredHeight();
            int i9 = this.fy94;
            int i10 = (((i3 + measuredHeight) + i9) - i5) + i8;
            if (frameLayout != null && frameLayout.getVisibility() == 0 && this.f39309b != 0) {
                frameLayout.layout(i2, i5 - measuredHeight, i4, i5);
                ScrollingTabContainerView scrollingTabContainerView = gc3c(this.sk1t) ? (ScrollingTabContainerView) this.sk1t.getChildAt(0) : null;
                if (scrollingTabContainerView != null) {
                    int measuredWidth2 = this.n5ij;
                    if (miuix.internal.util.n7h.x2(this)) {
                        measuredWidth2 = (i4 - this.n5ij) - scrollingTabContainerView.getMeasuredWidth();
                    }
                    scrollingTabContainerView.layout(measuredWidth2, this.fn2, scrollingTabContainerView.getMeasuredWidth() + measuredWidth2, scrollingTabContainerView.getMeasuredHeight() + this.fn2);
                }
                zsr0(this.sk1t, i2, i10, i4, measuredHeight + i9);
            }
            if (i9 <= 0 || this.f39309b == 0) {
                return;
            }
            int i11 = i2 + this.lw58 + this.eht;
            int i12 = i5 + i6;
            miuix.internal.util.n7h.kja0(this, frameLayout2, i11, i12 - i9, i11 + frameLayout2.getMeasuredWidth(), i12);
            ScrollingTabContainerView scrollingTabContainerView2 = gc3c(frameLayout2) ? (ScrollingTabContainerView) frameLayout2.getChildAt(0) : null;
            if (scrollingTabContainerView2 != null) {
                int measuredWidth3 = scrollingTabContainerView2.getMeasuredWidth();
                if (miuix.internal.util.n7h.x2(this)) {
                    measuredWidth = (i4 - (this.lw58 * 2)) - scrollingTabContainerView2.getMeasuredWidth();
                    i7 = i4 - (this.lw58 * 2);
                } else {
                    i7 = measuredWidth3;
                    measuredWidth = 0;
                }
                scrollingTabContainerView2.layout(measuredWidth, 0, i7, scrollingTabContainerView2.getMeasuredHeight());
            }
            zsr0(frameLayout2, i2, i10 - (measuredHeight - i9), i4, measuredHeight + i9);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ boolean eqxt() {
        return super.eqxt();
    }

    protected kja0 etdu() {
        return new kja0(this, null);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ boolean fn3e() {
        return super.fn3e();
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    protected void fu4(int i2, int i3) {
        IStateStyle iStateStyle = this.bzt0;
        if (iStateStyle != null) {
            iStateStyle.cancel();
        }
        if (i2 == 1) {
            this.x63 = this.sk1t.getMeasuredHeight() + this.fy94;
        } else if (i2 == 0) {
            this.x63 = 0;
        }
        AnimConfig animConfigAddListeners = new AnimConfig().addListeners(new C6975h(this));
        int measuredHeight = i3 == 1 ? this.sk1t.getMeasuredHeight() + this.fy94 : 0;
        if (i3 == 1) {
            this.q7.qrj(4);
        } else if (i3 == 0) {
            this.q7.qrj(0);
        }
        this.bzt0 = Folme.useValue(new Object[0]).setFlags(1L).setTo("actionbar_state_change", Integer.valueOf(this.x63)).to("actionbar_state_change", Integer.valueOf(measuredHeight), animConfigAddListeners);
    }

    public void g1(int i2) {
        ActionMenuPresenter actionMenuPresenter = this.zm;
        if (actionMenuPresenter == null) {
            return;
        }
        actionMenuPresenter.n5r1(i2);
    }

    public void ga(boolean z2, boolean z3) {
        this.sufz = true;
        this.rd = z2;
        if (z2) {
            this.q7.m25235s(0.0f);
            this.aw3.m25235s(0.0f);
        } else {
            this.q7.qrj(8);
            this.aw3.qrj(8);
            setVisibility(8);
        }
        View view = this.wra;
        if (view != null) {
            view.setAlpha(0.0f);
        }
        View view2 = this.zsl;
        if (view2 != null) {
            view2.setAlpha(0.0f);
        }
        View view3 = this.hp;
        if (view3 != null) {
            view3.setAlpha(0.0f);
        }
        View view4 = this.bu;
        if (view4 != null) {
            kq2f.toq toqVar = (kq2f.toq) view4.getTag(toq.C6054p.sj);
            if (toqVar != null) {
                toqVar.zy(true, 0.0f);
            } else {
                this.bu.setAlpha(0.0f);
            }
        }
        if (z3) {
            this.aw3.m25236y(false);
            this.q7.m25236y(false);
        }
    }

    public void gbni() {
        ActionMenuPresenter actionMenuPresenter = this.zm;
        if (actionMenuPresenter instanceof C7020g) {
            ((C7020g) actionMenuPresenter).dr();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AbstractC0096k.toq(on46);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AbstractC0096k.toq(getContext(), attributeSet);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ ActionMenuView getActionMenuView() {
        return super.getActionMenuView();
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public int getBottomMenuCustomViewOffset() {
        ActionMenuView actionMenuView = this.f39316i;
        if (actionMenuView instanceof ResponsiveActionMenuView) {
            return ((ResponsiveActionMenuView) actionMenuView).getBottomMenuCustomViewOffset();
        }
        return 0;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public C7752g getCollapseTitle() {
        if (this.xk5 == null) {
            r8s8(true);
        }
        return this.xk5;
    }

    public int getCollapsedHeight() {
        return this.za;
    }

    public View getCustomNavigationView() {
        return this.xqx;
    }

    public int getDisplayOptions() {
        return this.ac;
    }

    public SpinnerAdapter getDropdownAdapter() {
        return this.svt;
    }

    public int getDropdownSelectedPosition() {
        return this.cw14.getSelectedItemPosition();
    }

    public int getEndActionMenuItemLimit() {
        return this.ule;
    }

    public View getEndView() {
        return this.zsl;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ int getExpandState() {
        return super.getExpandState();
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public C7756y getExpandTitle() {
        if (this.s8y == null) {
            v0af(true);
        }
        return this.s8y;
    }

    public int getExpandedHeight() {
        return this.t7v;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ ActionMenuView getMenuView() {
        return super.getMenuView();
    }

    public int getNavigationMode() {
        return this.bq;
    }

    public View getStartView() {
        return this.wra;
    }

    public CharSequence getSubtitle() {
        return this.am;
    }

    public CharSequence getTitle() {
        return this.ad;
    }

    public void gyi(int i2, int i3) {
        ActionMenuPresenter actionMenuPresenter = this.zm;
        if (actionMenuPresenter == null) {
            return;
        }
        actionMenuPresenter.x9kr(i2, i3);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    @dd
    /* JADX INFO: renamed from: h */
    public View mo25119h(int i2) {
        if (i2 == 0) {
            return findViewById(toq.C6054p.f34896j);
        }
        if (i2 != 1) {
            return null;
        }
        return findViewById(toq.C6054p.f34901o);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo25120i() {
        return super.mo25120i();
    }

    public boolean jbh() {
        return this.f39319l;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void jk(View view, int i2) {
        boolean z2;
        if (wo()) {
            int measuredHeight = this.sk1t.getMeasuredHeight();
            int height = getHeight();
            if (this.ry) {
                this.ry = false;
                z2 = !this.sh5k;
            } else {
                if (this.sh5k) {
                    this.sh5k = false;
                }
            }
            if (z2) {
                int i3 = this.x63;
                if (i3 == 0) {
                    setExpandState(0);
                    return;
                }
                int i4 = this.fy94;
                if (i3 >= measuredHeight + i4) {
                    setExpandState(1);
                    return;
                }
                int i5 = this.za;
                if (height > ((i4 + measuredHeight) / 2) + i5) {
                    this.wg3.startScroll(0, height, 0, (i5 + measuredHeight) - height);
                } else {
                    this.wg3.startScroll(0, height, 0, i5 - height);
                }
                postOnAnimation(this.jjwz);
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ boolean ki() {
        return super.ki();
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void kja0() {
        super.kja0();
    }

    protected void lh(boolean z2) {
        int i2;
        int i3;
        if (z2 == this.ls9) {
            return;
        }
        ActionMenuView actionMenuView = this.f39316i;
        if (actionMenuView == null) {
            nme(new toq(z2));
            return;
        }
        this.ls9 = z2;
        this.qns = false;
        if (this.f39325r) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) getParent().getParent();
            int collapsedHeight = actionMenuView == null ? 0 : actionMenuView.getCollapsedHeight();
            if (z2) {
                i3 = 0;
                i2 = collapsedHeight;
            } else {
                i2 = 0;
                i3 = collapsedHeight;
            }
            if (actionMenuView != null) {
                if (this.ut == null) {
                    this.ut = new AnimConfig().setEase(-2, 0.95f, 0.25f);
                }
                TransitionListener transitionListener = this.ao6;
                if (transitionListener != null) {
                    this.ut.removeListeners(transitionListener);
                }
                AnimConfig animConfig = this.ut;
                zy zyVar = new zy(actionBarOverlayLayout, collapsedHeight);
                this.ao6 = zyVar;
                animConfig.addListeners(zyVar);
                actionMenuView.setTranslationY(i2);
                Folme.useAt(actionMenuView).state().to(new AnimState("menu_end_state").add(ViewProperty.TRANSLATION_Y, i3), this.ut);
                if (actionMenuView instanceof ResponsiveActionMenuView) {
                    ((ResponsiveActionMenuView) actionMenuView).setHidden(!this.ls9);
                }
            }
        }
    }

    protected ActionMenuPresenter ltg8(ld6.InterfaceC7032k interfaceC7032k) {
        ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.k0, z4(), toq.qrj.f76691d8wk, toq.qrj.f76738nn86);
        actionMenuPresenter.ld6(interfaceC7032k);
        actionMenuPresenter.m25359i(toq.C6054p.f34910x);
        return actionMenuPresenter;
    }

    protected C7020g m4(ld6.InterfaceC7032k interfaceC7032k) {
        C7020g c7020g = new C7020g(this.k0, z4(), toq.qrj.f76761vyq, toq.qrj.f76757uv6, toq.qrj.f76706gvn7, toq.qrj.f76689d2ok);
        c7020g.ld6(interfaceC7032k);
        c7020g.m25359i(toq.C6054p.j3y2);
        return c7020g;
    }

    public boolean mbx() {
        return this.bsb;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public boolean mcp(View view, View view2, int i2, int i3) {
        return this.a1 == null || this.xqx != null;
    }

    protected void ngy(boolean z2) {
        if (this.f39325r && z2 != this.ls9) {
            if (this.f39316i == null) {
                nme(new RunnableC6979q(z2));
                return;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f39327t.getParent();
            int collapsedHeight = this.f39316i.getCollapsedHeight();
            this.f39316i.setTranslationY(z2 ? 0.0f : collapsedHeight);
            if (!z2) {
                collapsedHeight = 0;
            }
            actionBarOverlayLayout.qrj(collapsedHeight);
            this.ls9 = z2;
            ActionMenuView actionMenuView = this.f39316i;
            if (actionMenuView instanceof ResponsiveActionMenuView) {
                ((ResponsiveActionMenuView) actionMenuView).setHidden(!z2);
            }
        }
    }

    public void o05() {
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.bf2();
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void o1t(View view, int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        int i5;
        if (wo()) {
            int height = getHeight();
            if (i3 <= 0 || height <= (i5 = this.za)) {
                return;
            }
            int i6 = height - i3;
            int i7 = this.x63;
            if (i6 >= i5) {
                this.x63 = i7 - i3;
            } else {
                this.x63 = 0;
            }
            iArr[1] = iArr[1] + i3;
            if (this.x63 != i7) {
                iArr2[1] = i3;
                requestLayout();
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void oc() {
        if (!this.f39325r || this.f39333z == null) {
            return;
        }
        vq();
    }

    public void oki() {
        post(new Runnable() { // from class: miuix.appcompat.internal.app.widget.t8r
            @Override // java.lang.Runnable
            public final void run() {
                this.f39307k.u38j();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q7.m25234q();
        this.aw3.m25234q();
        v5yj();
    }

    @Override // miuix.appcompat.internal.app.widget.toq, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, toq.ki.f34844k, getActionBarStyle(), 0);
        this.f39310c = typedArrayObtainStyledAttributes.getLayoutDimension(toq.ki.f34840g, 0);
        this.f39312e = typedArrayObtainStyledAttributes.getLayoutDimension(toq.ki.f34850q, 0);
        typedArrayObtainStyledAttributes.recycle();
        Configuration configuration2 = getResources().getConfiguration();
        this.ph90 = true;
        o5();
        if ((getDisplayOptions() & 8) != 0) {
            C7752g c7752g = this.xk5;
            if (c7752g != null) {
                c7752g.ki(configuration2);
            }
            C7756y c7756y = this.s8y;
            if (c7756y != null) {
                c7756y.f7l8(configuration2);
            }
        }
        float f2 = this.k0.getResources().getDisplayMetrics().density;
        if (f2 != this.ax) {
            this.ax = f2;
            this.lw58 = this.k0.getResources().getDimensionPixelOffset(toq.f7l8.f75423ga);
            this.fn2 = this.k0.getResources().getDimensionPixelOffset(toq.f7l8.f75403e5);
            this.us2t = this.k0.getResources().getDimensionPixelOffset(toq.f7l8.f75500pjz9);
            this.nq0z = this.k0.getResources().getDimensionPixelOffset(toq.f7l8.f75473mbx);
            this.k84 = this.k0.getResources().getDimensionPixelOffset(toq.f7l8.f75370a5id);
            this.cecm = 0;
        }
        this.n5ij = getResources().getDimensionPixelOffset(toq.f7l8.f75378bap7);
        this.sk1t.setPaddingRelative(this.n5ij, getResources().getDimensionPixelOffset(toq.f7l8.f75403e5), this.n5ij, TextUtils.isEmpty(this.am) ? this.us2t : this.nq0z);
        this.a7kc = getResources().getDimensionPixelOffset(toq.f7l8.f75456ktq);
        FrameLayout frameLayout = this.vb6;
        if (frameLayout != null) {
            frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), this.vb6.getPaddingTop(), this.vb6.getPaddingEnd(), this.a7kc);
        }
        FrameLayout frameLayout2 = this.k6e;
        if (frameLayout2 != null) {
            frameLayout2.setPaddingRelative(frameLayout2.getPaddingStart(), this.k6e.getPaddingTop(), this.k6e.getPaddingEnd(), this.a7kc);
        }
        setPaddingRelative(C7164n.m25953y(getContext(), toq.C6055q.f76577mcp), getPaddingTop(), C7164n.m25953y(getContext(), toq.C6055q.f34932t), getPaddingBottom());
        if (this.l2jk) {
            ec();
        }
        post(new Runnable() { // from class: miuix.appcompat.internal.app.widget.n7h
            @Override // java.lang.Runnable
            public final void run() {
                this.f39264k.nsb();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.hb(false);
            this.f39333z.m25278j();
        }
        ActionMenuPresenter actionMenuPresenter2 = this.zm;
        if (actionMenuPresenter2 != null) {
            actionMenuPresenter2.hb(false);
            this.zm.m25278j();
        }
        this.q7.m25232n();
        this.aw3.m25232n();
        v5yj();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(this.f39310c, this.zmmu.getMeasuredHeight());
        View view = this.xqx;
        if (view != null && view.getParent() == this) {
            iMax = Math.max(iMax, this.xqx.getMeasuredHeight());
        }
        int i6 = iMax;
        int i7 = this.nxe;
        int measuredHeight = this.sk1t.getMeasuredHeight();
        int i8 = this.fy94;
        int i9 = this.f39309b;
        int i10 = (i5 - i3) - i8;
        int i11 = i10 - (i9 == 2 ? this.x63 : i9 == 1 ? measuredHeight + i8 : 0);
        float fMin = (zkd() || measuredHeight != 0) ? Math.min(1.0f, ((measuredHeight + i8) - r1) / measuredHeight) : 1.0f;
        e5(z2, i2, 0, i4, i6, i7);
        dxef(z2, i2, i11, i4, i10, i8, fMin);
        h4b();
        if (!this.sufz && !this.e9u) {
            qo(fMin);
        }
        this.f86976ab = fMin;
        ra();
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x047c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var;
        MenuItem menuItemFindItem;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i2 = savedState.f39110k;
        if (i2 != 0 && this.a62w != null && (f7l8Var = this.w7wd) != null && (menuItemFindItem = f7l8Var.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f39113q) {
            d3();
        }
        if (savedState.f39111n) {
            oki();
        }
        if (this.f39330w == -1) {
            this.f39311d = savedState.f39115y;
            this.f39330w = savedState.f39114s;
            setExpandState(zurt() ? this.f39330w : savedState.f39109g, false, false);
        }
        if (savedState.f39112p) {
            setApplyBgBlur(this.vl4);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        MenuItemC7036s menuItemC7036s;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        kja0 kja0Var = this.a62w;
        if (kja0Var == null || (menuItemC7036s = kja0Var.f39122q) == null) {
            savedState.f39110k = 0;
        } else {
            savedState.f39110k = menuItemC7036s.getItemId();
        }
        savedState.f39113q = t8r();
        savedState.f39111n = yl();
        int i2 = this.f39309b;
        if (i2 == 2) {
            savedState.f39109g = 0;
        } else {
            savedState.f39109g = i2;
        }
        savedState.f39115y = this.f39311d;
        savedState.f39114s = this.f39330w;
        savedState.f39112p = this.vl4;
        return savedState;
    }

    @Override // miuix.view.InterfaceC7382k
    /* JADX INFO: renamed from: p */
    public void mo25168p(boolean z2, float f2) {
        if (this.mjvl || z2 || f2 <= 0.8f) {
            return;
        }
        this.mjvl = true;
        m2t();
    }

    public boolean pc() {
        return this.v3;
    }

    public void py() {
        kja0 kja0Var = this.a62w;
        MenuItemC7036s menuItemC7036s = kja0Var == null ? null : kja0Var.f39122q;
        if (menuItemC7036s != null) {
            menuItemC7036s.collapseActionView();
        }
    }

    @Override // miuix.view.InterfaceC7382k
    /* JADX INFO: renamed from: q */
    public void mo25169q(boolean z2) {
        this.e9u = false;
        if (z2) {
            this.q7.qrj(4);
            this.aw3.qrj(4);
        } else {
            if (!this.mjvl) {
                m2t();
            }
            this.mjvl = false;
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void qrj(int i2) {
        super.qrj(i2);
    }

    public boolean se() {
        kja0 kja0Var = this.a62w;
        return (kja0Var == null || kja0Var.f39122q == null) ? false : true;
    }

    public void setApplyBgBlur(boolean z2) {
        if (this.vl4 != z2) {
            this.vl4 = z2;
            SecondaryTabContainerView secondaryTabContainerView = this.ndjo;
            if (secondaryTabContainerView != null) {
                secondaryTabContainerView.setParentApplyBlur(z2);
            }
            SecondaryTabContainerView secondaryTabContainerView2 = this.d1cy;
            if (secondaryTabContainerView2 != null) {
                secondaryTabContainerView2.setParentApplyBlur(z2);
            }
        }
    }

    public void setBottomMenuCustomView(View view) {
        ActionMenuPresenter actionMenuPresenter = this.f39333z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.a98o(view);
        }
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i2) {
        ActionMenuView actionMenuView = this.f39316i;
        if (actionMenuView instanceof ResponsiveActionMenuView) {
            ((ResponsiveActionMenuView) actionMenuView).setBottomMenuCustomViewTranslationYWithPx(i2);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setBottomMenuMode(int i2) {
        super.setBottomMenuMode(i2);
    }

    public void setCallback(AbstractC0096k.n nVar) {
        this.rt0p = nVar;
    }

    public void setCollapsable(boolean z2) {
    }

    public void setCustomNavigationView(View view) {
        boolean z2 = (this.ac & 16) != 0;
        View view2 = this.xqx;
        if (view2 != null && z2) {
            removeView(view2);
        }
        this.xqx = view;
        if (view == null || !z2) {
            this.q7.toq(this.zmmu);
        } else {
            addView(view);
            m25166v();
        }
    }

    public void setDisplayOptions(int i2) {
        View view;
        int i3 = this.ac;
        int i4 = i3 != -1 ? i2 ^ i3 : -1;
        this.ac = i2;
        if ((i4 & nmlm) != 0) {
            boolean z2 = (i2 & 2) != 0;
            if (z2) {
                b3e();
                this.tgs.setVisibility(this.a1 == null ? 0 : 8);
                if ((i4 & 4) != 0) {
                    boolean z3 = (i2 & 4) != 0;
                    this.tgs.zy(z3);
                    if (z3) {
                        setHomeButtonEnabled(true);
                    }
                }
                if ((i4 & 1) != 0) {
                    Drawable logo = getLogo();
                    boolean z5 = (logo == null || (i2 & 1) == 0) ? false : true;
                    HomeView homeView = this.tgs;
                    if (!z5) {
                        logo = getIcon();
                    }
                    homeView.toq(logo);
                }
            } else {
                HomeView homeView2 = this.tgs;
                if (homeView2 != null) {
                    removeView(homeView2);
                }
            }
            if ((i4 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    if (getNavigationMode() == 2) {
                        yqrt();
                    }
                    cv06();
                } else {
                    C7752g c7752g = this.xk5;
                    if (c7752g != null) {
                        this.zmmu.removeView(c7752g.m28134s());
                    }
                    C7756y c7756y = this.s8y;
                    if (c7756y != null) {
                        this.sk1t.removeView(c7756y.zy());
                    }
                    this.xk5 = null;
                    this.s8y = null;
                    if ((getDisplayOptions() & 32) == 0) {
                        removeView(this.hp);
                        this.hp = null;
                    }
                    if (getNavigationMode() == 2) {
                        fnq8();
                    }
                }
            }
            if ((i4 & 6) != 0) {
                boolean z6 = (this.ac & 4) != 0;
                C7752g c7752g2 = this.xk5;
                boolean z7 = c7752g2 != null && c7752g2.qrj() == 0;
                C7756y c7756y2 = this.s8y;
                if (c7756y2 != null && c7756y2.m28144q() == 0) {
                    z7 = true;
                }
                if (this.hp != null && (z7 || (getDisplayOptions() & 32) != 0)) {
                    this.hp.setVisibility(z2 ? 8 : z6 ? 0 : 4);
                }
            }
            if ((i4 & 16) != 0 && (view = this.xqx) != null) {
                if ((i2 & 16) != 0) {
                    b9ub(this, view);
                    m25166v();
                } else {
                    removeView(view);
                }
            }
            if ((i4 & 8192) != 0) {
                if ((i2 & 8192) != 0) {
                    View viewInflate = LayoutInflater.from(this.k0).inflate(this.bc, (ViewGroup) this, false);
                    this.bu = viewInflate;
                    viewInflate.setTag(toq.C6054p.sj, new kq2f.toq(viewInflate));
                    Folme.useAt(this.bu).hover().setFeedbackRadius(60.0f);
                    Folme.useAt(this.bu).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.bu, new AnimConfig[0]);
                    addView(this.bu);
                } else {
                    removeView(this.bu);
                    this.bu = null;
                }
            }
            requestLayout();
        } else {
            invalidate();
        }
        HomeView homeView3 = this.tgs;
        if (homeView3 != null) {
            if (!homeView3.isEnabled()) {
                this.tgs.setContentDescription(null);
            } else if ((i2 & 4) != 0) {
                this.tgs.setContentDescription(this.k0.getResources().getText(toq.C6051h.f75926toq));
            } else {
                this.tgs.setContentDescription(this.k0.getResources().getText(toq.C6051h.f34793k));
            }
        }
    }

    public void setDropdownAdapter(SpinnerAdapter spinnerAdapter) {
        this.svt = spinnerAdapter;
        Spinner spinner = this.cw14;
        if (spinner != null) {
            spinner.setAdapter(spinnerAdapter);
        }
    }

    public void setDropdownSelectedPosition(int i2) {
        this.cw14.setSelection(i2);
    }

    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView, ScrollingTabContainerView scrollingTabContainerView2, SecondaryTabContainerView secondaryTabContainerView, SecondaryTabContainerView secondaryTabContainerView2) {
        boolean z2 = scrollingTabContainerView != null;
        this.l2jk = z2;
        if (z2) {
            r25n(scrollingTabContainerView, scrollingTabContainerView2, secondaryTabContainerView, secondaryTabContainerView2);
            if (this.bq == 2) {
                qkj8();
            }
        }
    }

    public void setEndActionMenuEnable(boolean z2) {
        this.f39319l = z2;
    }

    public void setEndActionMenuItemLimit(int i2) {
        this.ule = i2;
        ActionMenuPresenter actionMenuPresenter = this.zm;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.zp(i2);
        }
    }

    public void setEndView(View view) {
        View view2 = this.zsl;
        if (view2 != null) {
            removeView(view2);
        }
        this.zsl = view;
        if (view != null) {
            addView(view);
            Folme.useAt(this.zsl).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(view, new AnimConfig[0]);
            Folme.useAt(this.zsl).hover().setFeedbackRadius(60.0f);
            Folme.useAt(this.zsl).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.zsl, new AnimConfig[0]);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setExpandState(int i2) {
        super.setExpandState(i2);
    }

    public void setExtraPaddingPolicy(C7040n c7040n) {
        this.wh6 = c7040n;
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        HomeView homeView = this.tgs;
        if (homeView != null) {
            homeView.m25172n(drawable);
        } else {
            this.tlhn = drawable;
            this.w97r = 0;
        }
    }

    public void setHomeButtonEnabled(boolean z2) {
        HomeView homeView = this.tgs;
        if (homeView != null) {
            homeView.setEnabled(z2);
            this.tgs.setFocusable(z2);
            if (!z2) {
                this.tgs.setContentDescription(null);
            } else if ((this.ac & 4) != 0) {
                this.tgs.setContentDescription(this.k0.getResources().getText(toq.C6051h.f75926toq));
            } else {
                this.tgs.setContentDescription(this.k0.getResources().getText(toq.C6051h.f34793k));
            }
        }
    }

    public void setIcon(Drawable drawable) {
        HomeView homeView;
        this.aj = drawable;
        this.be |= 1;
        if (drawable != null && (((this.ac & 1) == 0 || getLogo() == null) && (homeView = this.tgs) != null)) {
            homeView.toq(drawable);
        }
        if (this.a1 != null) {
            this.yl25.toq(this.aj.getConstantState().newDrawable(getResources()));
        }
    }

    public void setLifecycleOwner(InterfaceC0954z interfaceC0954z) {
        this.ar = interfaceC0954z;
    }

    public void setLogo(Drawable drawable) {
        HomeView homeView;
        this.bs = drawable;
        this.be |= 2;
        if (drawable == null || (this.ac & 1) == 0 || (homeView = this.tgs) == null) {
            return;
        }
        homeView.toq(drawable);
    }

    public void setMenu(Menu menu, ld6.InterfaceC7032k interfaceC7032k) {
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var;
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var2 = this.w7wd;
        if (f7l8Var2 != null) {
            f7l8Var2.m25344l(this.f39333z);
            this.w7wd.m25344l(this.a62w);
        }
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var3 = this.smyf;
        if (f7l8Var3 != null) {
            f7l8Var3.m25344l(this.zm);
        }
        m58i(this.f39316i);
        m58i(this.xhv);
        if (menu == null || !(this.f39325r || this.f39319l)) {
            this.f39333z = null;
            this.zm = null;
            this.a62w = null;
            return;
        }
        Pair<miuix.appcompat.internal.view.menu.f7l8, miuix.appcompat.internal.view.menu.f7l8> pairW831 = w831(menu);
        this.w7wd = (miuix.appcompat.internal.view.menu.f7l8) pairW831.first;
        this.smyf = (miuix.appcompat.internal.view.menu.f7l8) pairW831.second;
        if (this.f39325r) {
            if (this.f39333z == null) {
                this.f39333z = ltg8(interfaceC7032k);
                this.a62w = etdu();
            }
            miuix.appcompat.internal.view.menu.f7l8 f7l8Var4 = this.w7wd;
            if (f7l8Var4 != null) {
                f7l8Var4.zy(this.f39333z);
                this.w7wd.zy(this.a62w);
                this.w7wd.nn86(this.qnoq);
            } else {
                this.f39333z.mo25179s(this.k0, null);
                this.a62w.mo25179s(this.k0, null);
            }
            this.f39333z.mo25178q(true);
            this.a62w.mo25178q(true);
            vq();
        }
        if (this.f39319l && (f7l8Var = this.smyf) != null && f7l8Var.size() > 0) {
            if (this.zm == null) {
                this.zm = m4(interfaceC7032k);
            }
            this.smyf.zy(this.zm);
            this.smyf.nn86(this.qnoq);
            this.zm.mo25178q(true);
            ikck();
        }
        ra();
        v5yj();
    }

    public void setNavigationMode(int i2) {
        LinearLayout linearLayout;
        int i3 = this.bq;
        if (i2 != i3) {
            if (i3 == 1 && (linearLayout = this.xy8) != null) {
                removeView(linearLayout);
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    throw new UnsupportedOperationException("MIUIX Deleted");
                }
                if (i2 == 2 && this.l2jk) {
                    qkj8();
                }
            } else if (this.l2jk) {
                cnbm();
            }
            this.bq = i2;
            requestLayout();
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setPendingInset(Rect rect) {
        super.setPendingInset(rect);
    }

    public void setProgress(int i2) {
        bih(i2 + 0);
    }

    public void setProgressBarIndeterminate(boolean z2) {
        bih(z2 ? -3 : -4);
    }

    public void setProgressBarIndeterminateVisibility(boolean z2) {
        bih(z2 ? -1 : -2);
    }

    public void setProgressBarVisibility(boolean z2) {
        bih(z2 ? -1 : -2);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setResizable(boolean z2) {
        super.setResizable(z2);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void setSplitActionBar(boolean z2) {
        if (this.f39325r != z2) {
            ActionMenuView actionMenuView = this.f39316i;
            if (actionMenuView != null) {
                m58i(actionMenuView);
                if (z2) {
                    ActionBarContainer actionBarContainer = this.f39327t;
                    if (actionBarContainer != null) {
                        actionBarContainer.addView(this.f39316i);
                    }
                    this.f39316i.getLayoutParams().width = -1;
                } else {
                    addView(this.f39316i);
                    this.f39316i.getLayoutParams().width = -2;
                }
                this.f39316i.requestLayout();
            }
            ActionBarContainer actionBarContainer2 = this.f39327t;
            if (actionBarContainer2 != null) {
                actionBarContainer2.setVisibility(z2 ? 0 : 8);
            }
            ActionMenuPresenter actionMenuPresenter = this.f39333z;
            if (actionMenuPresenter != null) {
                if (z2) {
                    actionMenuPresenter.m25273a(false);
                    this.f39333z.ch(getContext().getResources().getDisplayMetrics().widthPixels, true);
                } else {
                    actionMenuPresenter.m25273a(getResources().getBoolean(toq.C6053n.f76258toq));
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

    public void setStartView(View view) {
        View view2 = this.wra;
        if (view2 != null) {
            removeView(view2);
        }
        this.wra = view;
        if (view != null) {
            addView(view);
            Folme.useAt(view).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, new ITouchStyle.TouchType[0]).handleTouchOf(view, new AnimConfig[0]);
            Folme.useAt(this.wra).hover().setFeedbackRadius(60.0f);
            Folme.useAt(this.wra).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.wra, new AnimConfig[0]);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ void setSubTitleClickListener(View.OnClickListener onClickListener) {
        super.setSubTitleClickListener(onClickListener);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.am = charSequence;
        C7752g c7752g = this.xk5;
        if (c7752g != null) {
            c7752g.fu4(charSequence);
        }
        C7756y c7756y = this.s8y;
        if (c7756y != null) {
            c7756y.ld6(charSequence);
        }
        setTitleVisibility(kx3());
        o5();
        post(new Runnable() { // from class: miuix.appcompat.internal.app.widget.ki
            @Override // java.lang.Runnable
            public final void run() {
                this.f39261k.n2t();
            }
        });
    }

    public void setTitle(CharSequence charSequence) {
        this.r7v2 = true;
        setTitleImpl(charSequence);
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void setTitleClickable(boolean z2) {
        super.setTitleClickable(z2);
        C7752g c7752g = this.xk5;
        if (c7752g != null) {
            c7752g.fn3e(z2);
        }
        C7756y c7756y = this.s8y;
        if (c7756y != null) {
            c7756y.m28146y(z2);
        }
    }

    public void setTitleVisible(boolean z2, boolean z3) {
        this.q09 = z2;
        this.p2c = z3;
        C7752g c7752g = this.xk5;
        if (c7752g != null) {
            c7752g.gvn7(z2);
        }
        C7756y c7756y = this.s8y;
        if (c7756y != null) {
            c7756y.m28141i(z3);
        }
    }

    public void setUserSetEndActionMenuItemLimit(boolean z2) {
        this.v3 = z2;
    }

    @Override // miuix.appcompat.internal.app.widget.toq, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.n1u4 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (this.r7v2) {
            return;
        }
        setTitleImpl(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    /* JADX INFO: renamed from: t */
    public void mo25125t(View view, View view2, int i2, int i3) {
        if (wo()) {
            if (i3 == 0) {
                this.ry = true;
            } else {
                this.sh5k = true;
            }
            if (!this.wg3.isFinished()) {
                this.wg3.forceFinished(true);
            }
            setExpandState(2);
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ boolean t8r() {
        return super.t8r();
    }

    public boolean u38j() {
        ActionMenuPresenter actionMenuPresenter;
        InterfaceC0954z interfaceC0954z = this.ar;
        return (interfaceC0954z != null ? interfaceC0954z.getLifecycle().toq().equals(kja0.zy.RESUMED) : true) && (actionMenuPresenter = this.zm) != null && actionMenuPresenter.lv5();
    }

    public boolean uc() {
        ActionMenuPresenter actionMenuPresenter = this.zm;
        return actionMenuPresenter != null && actionMenuPresenter.ek5k();
    }

    boolean uf() {
        if (this.f39309b != 2) {
            return false;
        }
        int i2 = this.f39328u;
        int i3 = this.x63;
        if (i3 == 0) {
            i2 = 0;
        } else if (i3 == this.sk1t.getMeasuredHeight() + this.fy94) {
            i2 = 1;
        }
        if (this.f39328u == i2) {
            return false;
        }
        this.f39328u = i2;
        this.f39308a = i2;
        return true;
    }

    public boolean uj2j() {
        ActionMenuPresenter actionMenuPresenter = this.zm;
        return actionMenuPresenter != null && actionMenuPresenter.hb(false);
    }

    public boolean ukdy() {
        return this.l2jk && C7010k.toq(this.k0).m25262y();
    }

    public void vy() {
        this.f39327t.gvn7();
    }

    /* JADX INFO: renamed from: w */
    public void m25170w() {
        ActionMenuView actionMenuView = this.f39316i;
        if (actionMenuView instanceof ResponsiveActionMenuView) {
            ((ResponsiveActionMenuView) actionMenuView).hyr();
        }
    }

    public void was(MenuItem menuItem) {
        ActionMenuPresenter actionMenuPresenter = this.zm;
        if (actionMenuPresenter == null) {
            return;
        }
        actionMenuPresenter.hyr(menuItem);
    }

    public void wlev(boolean z2) {
        this.sufz = false;
        if (!this.rd) {
            setAlpha(0.0f);
            setVisibility(0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.start();
        }
        this.rd = false;
        if (getExpandState() == 0) {
            this.q7.qrj(0);
            this.aw3.qrj(8);
        } else if (getExpandState() == 1) {
            this.q7.qrj(4);
            this.aw3.qrj(0);
        }
        View view = this.wra;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = this.zsl;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        View view3 = this.hp;
        if (view3 != null) {
            view3.setAlpha(1.0f);
        }
        View view4 = this.bu;
        if (view4 != null) {
            kq2f.toq toqVar = (kq2f.toq) view4.getTag(toq.C6054p.sj);
            if (toqVar != null) {
                toqVar.zy(false, 0.0f);
            } else {
                this.bu.setAlpha(1.0f);
            }
        }
        if (z2) {
            this.aw3.m25236y(true);
            this.q7.m25236y(true);
            gcp();
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void wvg(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        if (wo()) {
            int measuredHeight = this.sk1t.getMeasuredHeight() + this.fy94;
            if (!zkd() && (this.ac & 16) != 0 && this.xqx != null) {
                measuredHeight = 0;
            }
            int i7 = (this.za - this.nxe) + measuredHeight;
            int height = getHeight();
            if (i5 >= 0 || height >= i7) {
                return;
            }
            int i8 = this.x63;
            if (height - i5 <= i7) {
                this.x63 = i8 - i5;
                iArr[1] = iArr[1] + i5;
            } else {
                this.x63 = measuredHeight;
                iArr[1] = iArr[1] + (-(i7 - height));
            }
            if (this.x63 != i8) {
                iArr2[1] = i5;
                requestLayout();
            }
        }
    }

    @Override // miuix.view.InterfaceC7382k
    public void x2(boolean z2) {
        this.e9u = true;
        if (z2) {
            this.mjvl = false;
            return;
        }
        if (getExpandState() == 0) {
            this.q7.qrj(0);
            this.q7.m25235s(0.0f);
            this.aw3.qrj(8);
        } else if (getExpandState() == 1) {
            this.q7.qrj(4);
            this.aw3.qrj(0);
            this.aw3.m25235s(0.0f);
        }
    }

    public void xwq3(int i2) {
        ActionMenuPresenter actionMenuPresenter = this.zm;
        if (actionMenuPresenter instanceof C7020g) {
            ((C7020g) actionMenuPresenter).gyi(i2);
        }
    }

    public boolean yl() {
        ActionMenuPresenter actionMenuPresenter = this.zm;
        return actionMenuPresenter != null && actionMenuPresenter.m25280m();
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    /* JADX INFO: renamed from: z */
    protected void mo25128z(int i2, int i3) {
        toq.C8098toq c8098toq;
        if (i2 == 2) {
            this.x63 = 0;
            if (!this.wg3.isFinished()) {
                this.wg3.forceFinished(true);
            }
        }
        if (i3 == 2 && (c8098toq = this.aw3) != null) {
            c8098toq.qrj(0);
        }
        if (i3 == 1) {
            if (this.sk1t.getAlpha() > 0.0f) {
                toq.C8098toq c8098toq2 = this.q7;
                if (c8098toq2 != null) {
                    c8098toq2.ld6(0.0f, 0, 20, true);
                }
                toq.C8098toq c8098toq3 = this.aw3;
                if (c8098toq3 != null) {
                    c8098toq3.ld6(1.0f, 0, 0, true);
                }
            }
            toq.C8098toq c8098toq4 = this.aw3;
            if (c8098toq4 != null) {
                c8098toq4.qrj(0);
            }
        }
        if (i3 == 0) {
            toq.C8098toq c8098toq5 = this.q7;
            if (c8098toq5 != null && !this.sufz) {
                c8098toq5.ld6(1.0f, 0, 0, true);
                this.q7.qrj(0);
                this.q7.f7l8();
            }
            toq.C8098toq c8098toq6 = this.aw3;
            if (c8098toq6 != null) {
                c8098toq6.qrj(8);
            }
        } else {
            this.x63 = (getHeight() - this.za) + this.nxe;
        }
        if (this.f39320m.size() > 0) {
            if (this.f39308a == i3 && this.f39328u == i3) {
                return;
            }
            for (InterfaceC6952n interfaceC6952n : this.f39320m) {
                if (i3 == 1) {
                    interfaceC6952n.m25060k(1);
                } else if (i3 == 0) {
                    interfaceC6952n.m25060k(0);
                }
            }
        }
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public /* bridge */ /* synthetic */ boolean zurt() {
        return super.zurt();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null ? generateDefaultLayoutParams() : layoutParams;
    }

    @Override // miuix.appcompat.internal.app.widget.toq
    public void setExpandState(int i2, boolean z2, boolean z3) {
        if (!z2) {
            lw();
        }
        super.setExpandState(i2, z2, z3);
    }

    public void setHomeAsUpIndicator(int i2) {
        HomeView homeView = this.tgs;
        if (homeView != null) {
            homeView.m25173q(i2);
        } else {
            this.tlhn = null;
            this.w97r = i2;
        }
    }

    public void setLogo(int i2) {
        setLogo(this.k0.getResources().getDrawable(i2));
    }

    public void setIcon(int i2) {
        setIcon(this.k0.getResources().getDrawable(i2));
    }
}
