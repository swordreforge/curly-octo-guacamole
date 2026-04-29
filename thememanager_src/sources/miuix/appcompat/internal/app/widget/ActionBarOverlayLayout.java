package miuix.appcompat.internal.app.widget;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.res.C0506s;
import androidx.core.view.C0683f;
import androidx.core.view.C0685g;
import androidx.core.view.gvn7;
import androidx.core.view.tfm;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.kja0;
import gb.toq;
import java.util.HashSet;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.app.floatingactivity.C6927k;
import miuix.appcompat.app.floatingactivity.helper.AbstractC6920k;
import miuix.appcompat.app.jp0y;
import miuix.appcompat.app.lvui;
import miuix.appcompat.app.mcp;
import miuix.appcompat.app.oc;
import miuix.appcompat.internal.view.C7009g;
import miuix.appcompat.internal.view.C7040n;
import miuix.appcompat.internal.view.menu.DialogInterfaceOnKeyListenerC7038y;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.appcompat.internal.view.menu.context.C7027n;
import miuix.appcompat.internal.view.menu.f7l8;
import miuix.appcompat.internal.view.menu.ld6;
import miuix.autodensity.AutoDensityConfig;
import miuix.core.util.C7085q;
import miuix.graphics.C7111k;
import miuix.internal.util.C7162g;
import miuix.internal.util.C7164n;
import miuix.smooth.C7334n;
import miuix.view.n7h;
import zy.dd;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarOverlayLayout extends FrameLayout implements gvn7, oc {

    /* JADX INFO: renamed from: a */
    private Rect f39071a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private final Rect f86906ab;
    private C6927k ac;
    private boolean ad;
    private boolean aj;
    private boolean am;
    private final int[] an;
    private int ar;
    private miuix.appcompat.internal.view.menu.context.toq as;
    private lvui ax;

    @dd
    private C7040n ay;
    private C7027n az;

    /* JADX INFO: renamed from: b */
    private int f39072b;
    private C6972q ba;
    private final Rect bb;
    private int bc;
    private int bd;
    private int be;
    private DialogInterfaceOnKeyListenerC7038y bg;
    private Rect bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private Rect f86907bo;
    private final Rect bp;
    private boolean bq;
    private boolean bs;
    private int bu;
    private final Rect bv;

    /* JADX INFO: renamed from: c */
    private boolean f39073c;

    /* JADX INFO: renamed from: d */
    private Rect f39074d;
    private final int[] dy;

    /* JADX INFO: renamed from: e */
    private boolean f39075e;

    /* JADX INFO: renamed from: f */
    private boolean f39076f;

    /* JADX INFO: renamed from: g */
    protected View f39077g;

    /* JADX INFO: renamed from: h */
    private ActionBarContextView f39078h;

    /* JADX INFO: renamed from: i */
    private View f39079i;
    private boolean id;
    private int in;

    /* JADX INFO: renamed from: j */
    private boolean f39080j;

    /* JADX INFO: renamed from: k */
    protected ActionBarView f39081k;
    private int k0;

    /* JADX INFO: renamed from: l */
    private InterfaceC0954z f39082l;

    /* JADX INFO: renamed from: m */
    private Drawable f39083m;

    /* JADX INFO: renamed from: n */
    protected ViewStub f39084n;

    /* JADX INFO: renamed from: o */
    private boolean f39085o;

    /* JADX INFO: renamed from: p */
    private ActionBarContainer f39086p;

    /* JADX INFO: renamed from: q */
    protected ActionBarContainer f39087q;

    /* JADX INFO: renamed from: r */
    private miuix.core.util.t8r f39088r;

    /* JADX INFO: renamed from: s */
    @dd
    private AbstractC6946k f39089s;
    private boolean sk1t;

    /* JADX INFO: renamed from: t */
    private Window.Callback f39090t;
    private mcp tgs;
    private boolean tlhn;

    /* JADX INFO: renamed from: u */
    private Rect f39091u;

    /* JADX INFO: renamed from: v */
    private Rect f39092v;

    /* JADX INFO: renamed from: w */
    private Rect f39093w;
    private jp0y w97r;

    /* JADX INFO: renamed from: x */
    private Rect f39094x;

    /* JADX INFO: renamed from: y */
    protected final HashSet<View> f39095y;
    private View yl25;

    /* JADX INFO: renamed from: z */
    private ActionMode f39096z;
    private boolean zmmu;

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout$n */
    private class C6971n extends toq implements n7h.toq {

        /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout$n$k */
        class k implements n7h.InterfaceC7384k {
            k() {
            }

            @Override // miuix.view.n7h.InterfaceC7384k
            /* JADX INFO: renamed from: k */
            public void mo25151k(int i2) {
                ActionBarContainer actionBarContainer = ActionBarOverlayLayout.this.f39087q;
                if (actionBarContainer != null) {
                    actionBarContainer.setCoordinatedOffsetYInSearchModeAnimation(i2);
                    ActionBarOverlayLayout.this.f39087q.requestLayout();
                }
            }

            @Override // miuix.view.n7h.InterfaceC7384k
            public void toq(boolean z2) {
                if (ActionBarOverlayLayout.this.f39076f != z2) {
                    ActionBarOverlayLayout.this.f39076f = z2;
                    if (ActionBarOverlayLayout.this.f39089s != null) {
                        ((C6998s) ActionBarOverlayLayout.this.f39089s).mete();
                    }
                }
            }
        }

        public C6971n(ActionMode.Callback callback) {
            super(callback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.toq, android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            ((miuix.view.n7h) actionMode).mo25255y(new k());
            return super.onCreateActionMode(actionMode, menu);
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout$q */
    private class C6972q implements f7l8.toq, ld6.InterfaceC7032k {

        /* JADX INFO: renamed from: k */
        private DialogInterfaceOnKeyListenerC7038y f39098k;

        private C6972q() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // miuix.appcompat.internal.view.menu.ld6.InterfaceC7032k
        public void f7l8(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, boolean z2) {
            if (f7l8Var.jp0y() != f7l8Var) {
                m25152k(f7l8Var);
            }
            if (z2) {
                if (ActionBarOverlayLayout.this.f39090t != null) {
                    ActionBarOverlayLayout.this.f39090t.onPanelClosed(6, f7l8Var);
                }
                ActionBarOverlayLayout.this.t8r();
                DialogInterfaceOnKeyListenerC7038y dialogInterfaceOnKeyListenerC7038y = this.f39098k;
                if (dialogInterfaceOnKeyListenerC7038y != null) {
                    dialogInterfaceOnKeyListenerC7038y.m25377k();
                    this.f39098k = null;
                }
            }
        }

        @Override // miuix.appcompat.internal.view.menu.f7l8.toq
        /* JADX INFO: renamed from: h */
        public void mo25069h(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        }

        /* JADX INFO: renamed from: k */
        public void m25152k(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
            if (ActionBarOverlayLayout.this.f39090t != null) {
                ActionBarOverlayLayout.this.f39090t.onPanelClosed(6, f7l8Var.jp0y());
            }
        }

        @Override // miuix.appcompat.internal.view.menu.f7l8.toq
        /* JADX INFO: renamed from: s */
        public boolean mo24868s(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, MenuItem menuItem) {
            if (ActionBarOverlayLayout.this.f39090t != null) {
                return ActionBarOverlayLayout.this.f39090t.onMenuItemSelected(6, menuItem);
            }
            return false;
        }

        @Override // miuix.appcompat.internal.view.menu.ld6.InterfaceC7032k
        /* JADX INFO: renamed from: y */
        public boolean mo25076y(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
            if (f7l8Var == null) {
                return false;
            }
            f7l8Var.lrht(this);
            DialogInterfaceOnKeyListenerC7038y dialogInterfaceOnKeyListenerC7038y = new DialogInterfaceOnKeyListenerC7038y(f7l8Var);
            this.f39098k = dialogInterfaceOnKeyListenerC7038y;
            dialogInterfaceOnKeyListenerC7038y.zy(null);
            return true;
        }
    }

    private class toq implements ActionMode.Callback {

        /* JADX INFO: renamed from: k */
        private ActionMode.Callback f39100k;

        public toq(ActionMode.Callback callback) {
            this.f39100k = callback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f39100k.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f39100k.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f39100k.onDestroyActionMode(actionMode);
            ActionBarView actionBarView = ActionBarOverlayLayout.this.f39081k;
            if (actionBarView != null && actionBarView.m28299do()) {
                ActionBarOverlayLayout.this.f39081k.lh(true);
            }
            if (ActionBarOverlayLayout.this.getCallback() != null) {
                ActionBarOverlayLayout.this.getCallback().onActionModeFinished(actionMode);
            }
            ActionBarOverlayLayout.this.f39096z = null;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.f39100k.onPrepareActionMode(actionMode, menu);
        }
    }

    public class zy implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: k */
        private ObjectAnimator f39102k;

        /* JADX INFO: renamed from: n */
        private View.OnClickListener f39103n;

        /* JADX INFO: renamed from: q */
        private ObjectAnimator f39104q;

        /* JADX INFO: renamed from: k */
        public Animator m25153k() {
            return this.f39104q;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (ActionBarOverlayLayout.this.f39079i == null || ActionBarOverlayLayout.this.f39086p == null || animator != this.f39104q) {
                return;
            }
            ActionBarOverlayLayout.this.f39086p.bringToFront();
            ActionBarOverlayLayout.this.f39079i.setOnClickListener(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (ActionBarOverlayLayout.this.f39079i == null || ActionBarOverlayLayout.this.f39086p == null || ActionBarOverlayLayout.this.f39079i.getAlpha() != 0.0f) {
                return;
            }
            ActionBarOverlayLayout.this.f39086p.bringToFront();
            ActionBarOverlayLayout.this.f39079i.setOnClickListener(null);
            ActionBarOverlayLayout.this.f39079i.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (ActionBarOverlayLayout.this.f39079i == null || ActionBarOverlayLayout.this.f39086p == null || animator != this.f39102k) {
                return;
            }
            ActionBarOverlayLayout.this.f39079i.setVisibility(0);
            ActionBarOverlayLayout.this.f39079i.bringToFront();
            ActionBarOverlayLayout.this.f39086p.bringToFront();
            ActionBarOverlayLayout.this.f39079i.setOnClickListener(this.f39103n);
        }

        public Animator toq() {
            return this.f39102k;
        }

        private zy(View.OnClickListener onClickListener) {
            this.f39103n = onClickListener;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ActionBarOverlayLayout.this.f39079i, "alpha", 0.0f, 1.0f);
            this.f39102k = objectAnimatorOfFloat;
            objectAnimatorOfFloat.addListener(this);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ActionBarOverlayLayout.this.f39079i, "alpha", 1.0f, 0.0f);
            this.f39104q = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.addListener(this);
            if (C7162g.m25943k()) {
                return;
            }
            this.f39102k.setDuration(0L);
            this.f39104q.setDuration(0L);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private void a9() {
        this.ay = new C7040n.k().toq(this.bd);
    }

    private void cdj(boolean z2, boolean z3, int i2, Rect rect, Rect rect2) {
        boolean zM25149r = m25149r();
        rect2.set(rect);
        if ((!zM25149r || z2) && !this.f39085o) {
            rect2.top = 0;
        }
        if (this.am || z3) {
            rect2.bottom = 0;
        } else {
            int i3 = rect2.bottom;
            if (i3 != 0) {
                int i4 = i3 - i2;
                rect2.bottom = i4;
                if (i4 < 0) {
                    rect2.bottom = 0;
                }
            }
        }
        if (!this.zmmu || i2 <= 0) {
            return;
        }
        rect2.bottom = this.bv.bottom;
    }

    @hyr(api = 28)
    private boolean d3() {
        tfm tfmVarM3178x = C0683f.m3178x(this);
        if (tfmVarM3178x == null) {
            return false;
        }
        C0685g c0685gM3470n = tfmVarM3178x.m3470n();
        if (c0685gM3470n != null) {
            return c0685gM3470n.m3281q() > 0;
        }
        Activity activityZurt = zurt(this);
        if (activityZurt == null) {
            return false;
        }
        DisplayCutout cutout = Build.VERSION.SDK_INT >= 29 ? activityZurt.getWindowManager().getDefaultDisplay().getCutout() : null;
        return cutout != null && cutout.getSafeInsetLeft() > 0;
    }

    private void fn3e(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof miuix.view.kja0) {
                ((miuix.view.kja0) childAt).m26782k(z2);
            }
            if (childAt instanceof ViewGroup) {
                fn3e((ViewGroup) childAt, z2);
            }
        }
    }

    private boolean fti(View view, float f2, float f3) {
        miuix.appcompat.internal.view.menu.context.toq toqVar = this.as;
        if (toqVar == null) {
            miuix.appcompat.internal.view.menu.context.toq toqVar2 = new miuix.appcompat.internal.view.menu.context.toq(getContext());
            this.as = toqVar2;
            toqVar2.lrht(this.ba);
        } else {
            toqVar.clear();
        }
        C7027n c7027nLv5 = this.as.lv5(view, view.getWindowToken(), f2, f3);
        this.az = c7027nLv5;
        if (c7027nLv5 == null) {
            return super.showContextMenuForChild(view);
        }
        c7027nLv5.m25328q(this.ba);
        return true;
    }

    private boolean gvn7() {
        return this.bq;
    }

    /* JADX INFO: renamed from: i */
    private void m25138i(Rect rect) {
        if (!this.bb.equals(rect)) {
            this.bb.set(rect);
            ncyb();
        }
    }

    private boolean jp0y(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1;
    }

    private toq ki(ActionMode.Callback callback) {
        return callback instanceof n7h.toq ? new C6971n(callback) : new toq(callback);
    }

    private boolean lvui() {
        return (getWindowSystemUiVisibility() & 512) != 0;
    }

    private void n5r1() {
        if (this.f39077g == null) {
            this.f39077g = findViewById(R.id.content);
            ActionBarContainer actionBarContainer = (ActionBarContainer) findViewById(toq.C6054p.f76334hyr);
            this.f39087q = actionBarContainer;
            boolean z2 = false;
            if (this.ad && this.am && actionBarContainer != null && !C7164n.m25951q(getContext(), toq.C6055q.e1, false)) {
                this.f39087q.setVisibility(8);
                this.f39087q = null;
            }
            ActionBarContainer actionBarContainer2 = this.f39087q;
            if (actionBarContainer2 != null) {
                actionBarContainer2.setOverlayMode(this.f39073c);
                ActionBarView actionBarView = (ActionBarView) this.f39087q.findViewById(toq.C6054p.f76448x9kr);
                this.f39081k = actionBarView;
                actionBarView.setBottomMenuMode(this.bu);
                if (this.ad && this.am) {
                    z2 = true;
                }
                this.id = z2;
                if (z2) {
                    this.in = getResources().getDimensionPixelSize(toq.f7l8.a4ph);
                }
                this.f39087q.setMiuixFloatingOnInit(this.id);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean n7h(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r7 == 0) goto L2a
            int r6 = r3.rightMargin
            int r7 = r4.right
            if (r6 == r7) goto L2a
            r3.rightMargin = r7
            r5 = r0
        L2a:
            if (r8 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.n7h(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private void ncyb() {
        if (this.f39073c) {
            AbstractC6946k abstractC6946k = this.f39089s;
            if (abstractC6946k != null) {
                ((C6998s) abstractC6946k).z8(this.bb);
            }
            jp0y jp0yVar = this.w97r;
            if (jp0yVar != null) {
                jp0yVar.onContentInsetChanged(this.bb);
            }
        }
    }

    private View o1t(View view) {
        return !this.f39095y.isEmpty() ? this.f39095y.contains(view) ? view : this.f39077g : this.f39077g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8r() {
        DialogInterfaceOnKeyListenerC7038y dialogInterfaceOnKeyListenerC7038y = this.bg;
        if (dialogInterfaceOnKeyListenerC7038y != null) {
            dialogInterfaceOnKeyListenerC7038y.m25377k();
            this.bg = null;
            this.as = null;
        }
    }

    private void x2(View view) {
        if (!this.f39073c || this.tlhn) {
            view.offsetTopAndBottom(-this.dy[1]);
            return;
        }
        jp0y jp0yVar = this.w97r;
        if (jp0yVar != null) {
            jp0yVar.onDispatchNestedScrollOffset(this.dy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x9kr() {
        ActionBarContextView actionBarContextView = this.f39078h;
        if (actionBarContextView != null) {
            actionBarContextView.oc();
        }
        ActionBarView actionBarView = this.f39081k;
        if (actionBarView != null) {
            actionBarView.oc();
        }
        if (this.as != null) {
            InterfaceC0954z interfaceC0954z = this.f39082l;
            if (interfaceC0954z != null ? interfaceC0954z.getLifecycle().toq().equals(kja0.zy.RESUMED) : true) {
                return;
            }
            this.as.close();
        }
    }

    private Activity zurt(View view) {
        Context context = ((ViewGroup) view.getRootView()).getChildAt(0).getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m25144c() {
        ncyb();
    }

    public boolean d2ok() {
        return this.f39073c;
    }

    public boolean dd() {
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z2 = (windowSystemUiVisibility & 256) != 0;
        boolean z3 = (windowSystemUiVisibility & 1024) != 0;
        boolean z5 = this.f39072b != 0;
        return this.ad ? z3 || z5 : (z2 && z3) || z5;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        if (this.f39085o && (drawable = this.f39083m) != null) {
            drawable.setBounds(0, 0, getRight() - getLeft(), this.f39071a.top);
            this.f39083m.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (jp0y(keyEvent)) {
            if (this.f39096z != null) {
                ActionBarContextView actionBarContextView = this.f39078h;
                if (actionBarContextView != null && actionBarContextView.ki()) {
                    return true;
                }
                this.f39096z.finish();
                this.f39096z = null;
                return true;
            }
            ActionBarView actionBarView = this.f39081k;
            if (actionBarView != null && actionBarView.ki()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public ActionMode m25145e(View view, ActionMode.Callback callback) {
        if (!(view instanceof ActionBarOverlayLayout)) {
            return startActionMode(callback);
        }
        ActionMode actionMode = this.f39096z;
        if (actionMode != null) {
            actionMode.finish();
        }
        ActionMode actionModeStartActionMode = view.startActionMode(ki(callback));
        this.f39096z = actionModeStartActionMode;
        return actionModeStartActionMode;
    }

    public boolean eqxt() {
        return this.bs;
    }

    /* JADX INFO: renamed from: f */
    public void m25146f() {
        ActionBarView actionBarView = this.f39081k;
        if (actionBarView != null) {
            actionBarView.o05();
        }
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        int i2;
        int i3;
        boolean zN7h;
        boolean zN7h2;
        Window window;
        fn3e(this, this.sk1t);
        boolean zLvui = lvui();
        boolean zDd = dd();
        this.bv.set(rect);
        this.bp.set(rect);
        this.f86907bo.set(rect);
        tfm tfmVarM3178x = C0683f.m3178x(this);
        if (tfmVarM3178x != null) {
            i2 = (this.sk1t ? tfmVarM3178x.f7l8(tfm.qrj.m3498s()) : tfmVarM3178x.m3466g(tfm.qrj.m3498s())).f3601q;
            i3 = tfmVarM3178x.m3466g(tfm.qrj.m3497q()).f3601q;
            this.bp.bottom = i2;
            if (this.zmmu && tfmVarM3178x.m3466g(tfm.qrj.m3497q()).f3601q > 0) {
                this.bp.bottom = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (!zLvui) {
            this.bp.bottom = 0;
        }
        lvui lvuiVar = this.ax;
        if (lvuiVar != null) {
            lvuiVar.m25058k(rect.top);
        }
        if (this.id) {
            Rect rect2 = this.f86907bo;
            rect2.top = this.in;
            rect2.left = 0;
            rect2.right = 0;
            Rect rect3 = this.bp;
            rect3.top = this.f39071a.top;
            rect3.bottom = 0;
            rect3.left = 0;
            rect3.right = 0;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Activity activityZurt = zurt(this);
            boolean z2 = (activityZurt == null || (window = activityZurt.getWindow()) == null || window.getAttributes().layoutInDisplayCutoutMode != 1) ? false : true;
            if (!z2) {
                z2 = C7164n.ld6(getContext(), R.attr.windowLayoutInDisplayCutoutMode, 0) == 1;
            }
            if (z2) {
                Rect rect4 = this.f86907bo;
                rect4.left = 0;
                rect4.right = 0;
                if (d3()) {
                    this.bp.left = 0;
                } else {
                    this.bp.right = 0;
                }
            }
        }
        if (this.f39073c) {
            m25147j();
        }
        if (!m25149r() && (!zLvui || this.f86907bo.bottom != i2)) {
            this.f86907bo.bottom = 0;
        }
        cdj(zDd, zLvui, i3, this.f86907bo, this.f39071a);
        ActionBarContainer actionBarContainer = this.f39087q;
        if (actionBarContainer != null) {
            if (zDd) {
                actionBarContainer.setPendingInsets(this.f86907bo);
            }
            ActionMode actionMode = this.f39096z;
            if (actionMode instanceof C7009g) {
                ((C7009g) actionMode).ni7(this.f86907bo);
            }
            zN7h = n7h(this.f39087q, this.bp, true, m25149r() && !zDd, true, false);
        } else {
            zN7h = false;
        }
        ActionBarContextView actionBarContextView = this.f39078h;
        if (actionBarContextView != null) {
            actionBarContextView.setPendingInset(this.bp);
        }
        ActionBarContainer actionBarContainer2 = this.f39086p;
        if (actionBarContainer2 != null) {
            actionBarContainer2.setPendingInsets(this.bp);
            this.f39093w.set(this.f86907bo);
            Rect rect5 = new Rect();
            rect5.set(this.f39071a);
            if (this.am) {
                rect5.bottom = 0;
            }
            if (this.zmmu) {
                Rect rect6 = new Rect(this.bp);
                rect6.bottom = this.f39071a.bottom;
                zN7h2 = n7h(this.f39086p, rect6, true, false, true, true);
            } else {
                zN7h2 = n7h(this.f39086p, this.bp, true, false, true, false);
            }
            zN7h |= zN7h2;
        }
        ActionBarView actionBarView = this.f39081k;
        if (actionBarView != null) {
            actionBarView.setPendingInset(this.bp);
        }
        if (!this.f39094x.equals(this.f39071a)) {
            this.f39094x.set(this.f39071a);
            zN7h = true;
        }
        if (zN7h) {
            requestLayout();
        }
        return m25149r() && !(this.f39087q == null && this.f39086p == null);
    }

    @Override // androidx.core.view.jp0y
    public void fu4(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    public AbstractC6946k getActionBar() {
        return this.f39089s;
    }

    public ActionBarView getActionBarView() {
        return this.f39081k;
    }

    public Rect getBaseInnerInsets() {
        return this.f86907bo;
    }

    protected int getBottomInset() {
        ActionBarContainer actionBarContainer = this.f39086p;
        if (actionBarContainer != null) {
            return actionBarContainer.getInsetHeight();
        }
        return 0;
    }

    public int getBottomMenuCustomViewTranslationY() {
        ActionBarView actionBarView = this.f39081k;
        if (actionBarView != null) {
            return actionBarView.getBottomMenuCustomViewOffset();
        }
        return 0;
    }

    public int getBottomMenuMode() {
        return this.bu;
    }

    public Window.Callback getCallback() {
        return this.f39090t;
    }

    public Rect getContentInset() {
        return this.f86906ab;
    }

    public View getContentMask() {
        return this.f39079i;
    }

    public View getContentView() {
        return this.f39077g;
    }

    int getDeviceType() {
        return this.bd;
    }

    public int getExtraHorizontalPadding() {
        return this.be;
    }

    @Deprecated
    public int getExtraHorizontalPaddingLevel() {
        C7040n c7040n = this.ay;
        if (c7040n == null) {
            return 0;
        }
        return c7040n.m25386y();
    }

    public Rect getInnerInsets() {
        return this.f39074d;
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: h */
    public void mo419h(@zy.lvui View view, int i2, int i3, @zy.lvui int[] iArr, int i4) {
        AbstractC6946k abstractC6946k;
        View viewO1t = o1t(view);
        if (viewO1t == null) {
            return;
        }
        int[] iArr2 = this.dy;
        iArr2[1] = 0;
        ActionBarContainer actionBarContainer = this.f39087q;
        if (actionBarContainer != null && !this.f39076f) {
            actionBarContainer.wvg(view, i2, i3, iArr, i4, iArr2);
        }
        if (i3 > 0) {
            int i5 = iArr[1];
            if (i3 - i5 > 0 && (abstractC6946k = this.f39089s) != null && (abstractC6946k instanceof C6998s)) {
                int i6 = i3 - i5;
                int iVss1 = ((C6998s) abstractC6946k).vss1(view);
                if (iVss1 != -1) {
                    iArr[1] = iArr[1] + ((C6998s) this.f39089s).kjd(view, Math.max(0, iVss1 - i6));
                }
            }
        }
        x2(viewO1t);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void hb() {
        /*
            r7 = this;
            int r0 = r7.bc
            android.content.Context r1 = r7.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 3
            r3 = 640(0x280, float:8.97E-43)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 2
            if (r0 != 0) goto L3c
            int r0 = r7.getMeasuredWidth()
            float r0 = (float) r0
            float r0 = r0 * r4
            float r0 = r0 / r1
            int r0 = (int) r0
            android.content.Context r6 = r7.getContext()
            android.graphics.Point r6 = miuix.core.util.C7085q.n7h(r6)
            int r6 = r6.x
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 / r1
            int r1 = (int) r6
            int r4 = r7.bd
            if (r4 != r5) goto L3a
            r4 = 410(0x19a, float:5.75E-43)
            if (r0 <= r4) goto L3a
            if (r1 <= r3) goto L3a
        L38:
            r0 = r2
            goto L54
        L3a:
            r0 = r5
            goto L54
        L3c:
            r6 = 1
            if (r0 != r6) goto L54
            android.content.Context r0 = r7.getContext()
            android.graphics.Point r0 = miuix.core.util.C7085q.n7h(r0)
            int r0 = r0.x
            float r0 = (float) r0
            float r0 = r0 * r4
            float r0 = r0 / r1
            int r0 = (int) r0
            int r1 = r7.bd
            if (r1 != r5) goto L3a
            if (r0 <= r3) goto L3a
            goto L38
        L54:
            int r1 = r7.bu
            if (r0 == r1) goto L74
            r7.bu = r0
            miuix.appcompat.internal.app.widget.ActionBarContextView r1 = r7.f39078h
            if (r1 == 0) goto L66
            r1.setBottomMenuMode(r0)
            miuix.appcompat.internal.app.widget.ActionBarContextView r0 = r7.f39078h
            r0.oc()
        L66:
            miuix.appcompat.internal.app.widget.ActionBarView r0 = r7.f39081k
            if (r0 == 0) goto L74
            int r1 = r7.bu
            r0.setBottomMenuMode(r1)
            miuix.appcompat.internal.app.widget.ActionBarView r0 = r7.f39081k
            r0.oc()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.hb():void");
    }

    public void hyr(View view) {
        if (view != null) {
            this.f39095y.add(view);
        }
    }

    /* JADX INFO: renamed from: j */
    void m25147j() {
        int i2;
        int i3;
        ActionBarContainer actionBarContainer;
        this.f86906ab.set(this.bp);
        int iMax = 0;
        if (this.f39089s != null && (actionBarContainer = this.f39087q) != null && actionBarContainer.getVisibility() != 8 && this.f39087q.getMeasuredHeight() > 0) {
            iMax = Math.max(0, (int) (((C6998s) this.f39089s).z4j7() + this.bp.top + (this.id ? this.in : 0) + this.f39087q.getTranslationY()));
        }
        int iMax2 = Math.max(Math.max(getBottomInset(), this.k0), this.ar);
        if (!dd() || iMax >= (i3 = this.bp.top)) {
            this.f86906ab.top = iMax;
        } else {
            this.f86906ab.top = i3;
        }
        if (!lvui() || iMax2 >= (i2 = this.bp.bottom)) {
            this.f86906ab.bottom = iMax2;
        } else {
            this.f86906ab.bottom = i2;
        }
        Rect rect = this.f86906ab;
        int i4 = rect.left;
        Rect rect2 = this.bp;
        int i5 = rect2.left;
        if (i4 < i5) {
            rect.left = i5;
        }
        int i6 = rect.right;
        int i7 = rect2.right;
        if (i6 < i7) {
            rect.right = i7;
        }
        m25138i(rect);
    }

    public void jk() {
        if (this.f39084n != null) {
            this.yl25.setVisibility(8);
            getContentView().setVisibility(0);
        }
    }

    @Override // miuix.appcompat.app.oc
    /* JADX INFO: renamed from: k */
    public void mo25066k(int i2, int i3) {
        int i4;
        int[] iArr = this.an;
        iArr[i3] = i2;
        int iMax = Math.max(iArr[0], iArr[1]);
        if (!this.f39073c) {
            qrj(iMax);
            return;
        }
        if (lvui() && iMax <= (i4 = this.bp.bottom)) {
            iMax = i4;
        }
        this.f86906ab.bottom = Math.max(Math.max(iMax, this.ar), this.k0);
        m25138i(this.f86906ab);
    }

    @Override // androidx.core.view.jp0y
    public void kja0(@zy.lvui View view, int i2) {
        ActionBarContainer actionBarContainer;
        if (o1t(view) == null || (actionBarContainer = this.f39087q) == null) {
            return;
        }
        actionBarContainer.jp0y(view, i2);
    }

    /* JADX INFO: renamed from: l */
    public void m25148l(boolean z2) {
        if (this.id != (this.ad && z2)) {
            this.am = z2;
            this.id = z2;
            if (z2) {
                this.in = getResources().getDimensionPixelSize(toq.f7l8.a4ph);
            }
            this.ac.cdj(this.id);
            AbstractC6946k abstractC6946k = this.f39089s;
            if (abstractC6946k != null) {
                ((C6998s) abstractC6946k).mub(this.id);
            }
            requestFitSystemWindows();
            requestLayout();
        }
    }

    @Override // androidx.core.view.jp0y
    public void ld6(@zy.lvui View view, @zy.lvui View view2, int i2, int i3) {
        ActionBarContainer actionBarContainer;
        if (o1t(view2) == null || (actionBarContainer = this.f39087q) == null) {
            return;
        }
        actionBarContainer.mcp(view, view2, i2, i3);
    }

    public void lrht(boolean z2) {
        if (this.f39081k != null) {
            setBottomMenuExtraInset(0);
            if (z2) {
                this.f39081k.lh(true);
            } else {
                this.f39081k.ngy(true);
            }
        }
    }

    public void mcp() {
        ActionBarView actionBarView = this.f39081k;
        if (actionBarView != null) {
            actionBarView.bz2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    @Override // androidx.core.view.gvn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ni7(@zy.lvui android.view.View r12, int r13, int r14, int r15, int r16, int r17, @zy.lvui int[] r18) {
        /*
            r11 = this;
            r0 = r11
            android.view.View r10 = r11.o1t(r12)
            if (r10 != 0) goto L8
            return
        L8:
            r1 = 1
            if (r16 >= 0) goto L2b
            r2 = r18[r1]
            int r3 = r16 - r2
            if (r3 > 0) goto L2b
            miuix.appcompat.app.k r3 = r0.f39089s
            if (r3 == 0) goto L2b
            boolean r4 = r3 instanceof miuix.appcompat.internal.app.widget.C6998s
            if (r4 == 0) goto L2b
            int r2 = r16 - r2
            miuix.appcompat.internal.app.widget.s r3 = (miuix.appcompat.internal.app.widget.C6998s) r3
            r4 = r12
            int r2 = r3.m28(r12, r2)
            int r3 = r16 - r2
            r5 = r18[r1]
            int r5 = r5 + r2
            r18[r1] = r5
            r6 = r3
            goto L2e
        L2b:
            r4 = r12
            r6 = r16
        L2e:
            int[] r9 = r0.dy
            r2 = 0
            r9[r1] = r2
            miuix.appcompat.internal.app.widget.ActionBarContainer r1 = r0.f39087q
            if (r1 == 0) goto L46
            boolean r2 = r0.f39076f
            if (r2 != 0) goto L46
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r1.m25104t(r2, r3, r4, r5, r6, r7, r8, r9)
        L46:
            r11.x2(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.ni7(android.view.View, int, int, int, int, int, int[]):void");
    }

    public void nn86(View view) {
        if (view != null) {
            this.f39095y.remove(view);
        }
    }

    public boolean oc() {
        C7040n c7040n = this.ay;
        if (c7040n != null) {
            return c7040n.m25385s();
        }
        return false;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        return (Build.VERSION.SDK_INT < 28 || windowInsetsOnApplyWindowInsets.isConsumed() || !m25149r()) ? windowInsetsOnApplyWindowInsets : windowInsets.consumeDisplayCutout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39088r = C7085q.m25607s(getContext());
        requestFitSystemWindows();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AutoDensityConfig.updateDensity(getContext());
        this.f39088r = C7085q.m25607s(getContext());
        int iM26179k = miuix.os.zy.m26179k(getContext());
        if (this.bd != iM26179k) {
            this.bd = iM26179k;
            a9();
        }
        this.ac.m24943h();
        post(new Runnable() { // from class: miuix.appcompat.internal.app.widget.x2
            @Override // java.lang.Runnable
            public final void run() {
                this.f39338k.x9kr();
            }
        });
        miuix.appcompat.internal.view.menu.context.toq toqVar = this.as;
        if (toqVar == null || !toqVar.m25329x()) {
            return;
        }
        this.as.ch();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setContentInsetStateCallback(null);
        setExtraPaddingObserver(null);
        this.f39088r = null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        n5r1();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.f39073c) {
            m25147j();
        }
        C7040n c7040n = this.ay;
        if (c7040n != null && c7040n.m25385s()) {
            int iM25382g = (int) (this.ay.m25382g() * getResources().getDisplayMetrics().density);
            if (iM25382g != this.be) {
                this.be = iM25382g;
                mcp mcpVar = this.tgs;
                if (mcpVar != null) {
                    mcpVar.onExtraPaddingChanged(iM25382g);
                }
            }
            if (this.bs) {
                this.ay.m25383n(this.f39077g);
            }
        }
        AbstractC6946k abstractC6946k = this.f39089s;
        if (abstractC6946k == null || this.f39076f) {
            return;
        }
        ((C6998s) abstractC6946k).mete();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01d3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        return this.ad;
    }

    public void qrj(int i2) {
        if (this.bl == null) {
            this.bl = new Rect();
        }
        Rect rect = this.bl;
        Rect rect2 = this.f39091u;
        rect.top = rect2.top;
        rect.bottom = i2;
        rect.right = rect2.right;
        rect.left = rect2.left;
        n7h(this.f39077g, rect, true, true, true, true);
        this.f39077g.requestLayout();
    }

    /* JADX INFO: renamed from: r */
    public boolean m25149r() {
        return this.f39075e;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestFitSystemWindows() {
        super.requestFitSystemWindows();
        this.f39080j = true;
    }

    public void setActionBar(AbstractC6946k abstractC6946k) {
        this.f39089s = abstractC6946k;
        if (abstractC6946k != null) {
            ((C6998s) abstractC6946k).fh(this.ay);
        }
    }

    public void setActionBarContextView(ActionBarContextView actionBarContextView) {
        this.f39078h = actionBarContextView;
        if (actionBarContextView != null) {
            actionBarContextView.setActionBarView(this.f39081k);
            this.f39078h.setBottomMenuMode(this.bu);
            this.f39078h.setPendingInset(this.bp);
        }
    }

    public void setAnimating(boolean z2) {
        this.bq = z2;
    }

    public void setBottomExtraInset(int i2) {
        int i3;
        if (this.k0 != i2) {
            this.k0 = i2;
            int iMax = Math.max(getBottomInset(), this.ar);
            if (lvui() && iMax <= (i3 = this.bp.bottom)) {
                iMax = i3;
            }
            int iMax2 = Math.max(iMax, this.k0);
            Rect rect = this.f86906ab;
            if (rect.bottom != iMax2) {
                rect.bottom = iMax2;
                m25138i(rect);
            }
        }
    }

    public void setBottomMenuCustomView(View view) {
        ActionBarView actionBarView = this.f39081k;
        if (actionBarView != null) {
            actionBarView.setBottomMenuCustomView(view);
        }
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i2) {
        ActionBarView actionBarView = this.f39081k;
        if (actionBarView != null) {
            actionBarView.setBottomMenuCustomViewTranslationYWithPx(i2);
        }
    }

    public void setBottomMenuExtraInset(int i2) {
        this.ar = i2;
    }

    public void setBottomMenuMode(int i2) {
        if (this.bc != i2) {
            this.bc = i2;
            hb();
        }
    }

    public void setCallback(Window.Callback callback) {
        this.f39090t = callback;
    }

    public void setContentInsetStateCallback(jp0y jp0yVar) {
        this.w97r = jp0yVar;
    }

    public void setContentMask(View view) {
        this.f39079i = view;
        if (!C7162g.toq() || this.f39079i == null) {
            return;
        }
        C0506s.f7l8(getContext().getResources(), toq.C6057y.gjp, getContext().getTheme());
    }

    public void setContentView(View view) {
        this.f39077g = view;
    }

    public void setCorrectNestedScrollMotionEventEnabled(boolean z2) {
        this.tlhn = z2;
    }

    public void setExtraHorizontalPaddingEnable(boolean z2) {
        if (this.aj != z2) {
            this.aj = z2;
            C7040n c7040n = this.ay;
            if (c7040n != null) {
                c7040n.ld6(z2);
                requestLayout();
            }
        }
    }

    @Deprecated
    public void setExtraHorizontalPaddingLevel(int i2) {
    }

    public void setExtraPaddingApplyToContentEnable(boolean z2) {
        if (this.bs != z2) {
            this.bs = z2;
            requestLayout();
        }
    }

    public void setExtraPaddingObserver(mcp mcpVar) {
        this.tgs = mcpVar;
    }

    public void setLifecycleOwner(InterfaceC0954z interfaceC0954z) {
        this.f39082l = interfaceC0954z;
    }

    public void setOnStatusBarChangeListener(lvui lvuiVar) {
        this.ax = lvuiVar;
    }

    public void setOverlayMode(boolean z2) {
        this.f39073c = z2;
        ActionBarContainer actionBarContainer = this.f39087q;
        if (actionBarContainer != null) {
            actionBarContainer.setOverlayMode(z2);
        }
    }

    public void setRootSubDecor(boolean z2) {
        this.f39075e = z2;
    }

    public void setSplitActionBarView(ActionBarContainer actionBarContainer) {
        this.f39086p = actionBarContainer;
        actionBarContainer.setPendingInsets(this.bp);
    }

    public void setTranslucentStatus(int i2) {
        if (this.f39072b != i2) {
            this.f39072b = i2;
            requestFitSystemWindows();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean showContextMenuForChild(View view, float f2, float f3) {
        if (fti(view, f2, f3)) {
            return true;
        }
        return getParent() != null && getParent().showContextMenuForChild(view, f2, f3);
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        ActionBarContextView actionBarContextView = this.f39078h;
        ActionMode actionModeOnWindowStartingActionMode = null;
        if (actionBarContextView != null && actionBarContextView.yz()) {
            return null;
        }
        ActionMode actionMode = this.f39096z;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f39096z = null;
        if (getCallback() != null) {
            actionModeOnWindowStartingActionMode = getCallback().onWindowStartingActionMode(ki(callback));
        }
        if (actionModeOnWindowStartingActionMode != null) {
            this.f39096z = actionModeOnWindowStartingActionMode;
        }
        if (this.f39096z != null && getCallback() != null) {
            getCallback().onActionModeStarted(this.f39096z);
        }
        ActionBarView actionBarView = this.f39081k;
        if (actionBarView != null && actionBarView.m28299do()) {
            ActionMenuView actionMenuView = this.f39081k.getActionMenuView();
            if (actionMenuView != null) {
                setBottomMenuExtraInset(actionMenuView.getCollapsedHeight());
            }
            this.f39081k.lh(false);
        }
        if ((this.f39096z instanceof miuix.view.n7h) && this.f39073c) {
            m25147j();
        }
        return this.f39096z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return m25145e(view, callback);
    }

    /* JADX INFO: renamed from: t */
    public void m25150t(boolean z2) {
        if (this.f39081k != null) {
            setBottomMenuExtraInset(0);
            if (z2) {
                this.f39081k.lh(false);
            } else {
                this.f39081k.ngy(false);
            }
        }
    }

    public void uv6() {
        ActionBarView actionBarView = this.f39081k;
        if (actionBarView != null) {
            actionBarView.m25170w();
        }
    }

    public void vyq(int i2) {
        if (this.f39084n == null) {
            ViewStub viewStub = (ViewStub) findViewById(toq.C6054p.ahb);
            this.f39084n = viewStub;
            this.yl25 = viewStub.inflate();
        }
        ImageView imageView = (ImageView) this.yl25.findViewById(toq.C6054p.f76333hyow);
        Context context = getContext();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getContentView().getMeasuredWidth(), getContentView().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        getContentView().draw(new Canvas(bitmapCreateBitmap));
        if (Build.VERSION.SDK_INT >= 31) {
            float f2 = i2;
            RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f2, f2, Shader.TileMode.CLAMP);
            imageView.setImageBitmap(bitmapCreateBitmap);
            imageView.setRenderEffect(renderEffectCreateBlurEffect);
        } else {
            imageView.setImageBitmap(C7111k.fu4(context, bitmapCreateBitmap, i2));
        }
        this.yl25.setAlpha(1.0f);
        getContentView().setVisibility(4);
        this.yl25.setVisibility(0);
    }

    public zy wvg(View.OnClickListener onClickListener) {
        return new zy(onClickListener);
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: z */
    public boolean mo426z(@zy.lvui View view, @zy.lvui View view2, int i2, int i3) {
        ActionBarContainer actionBarContainer;
        return (o1t(view2) == null || (actionBarContainer = this.f39087q) == null || !actionBarContainer.fti(view, view2, i2, i3)) ? false : true;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39095y = new HashSet<>();
        this.f39082l = null;
        this.f39076f = false;
        this.f39075e = true;
        this.f39071a = new Rect();
        this.f39094x = new Rect();
        this.f39091u = new Rect();
        this.f86907bo = new Rect();
        this.f39092v = new Rect();
        this.f39074d = new Rect();
        this.f39093w = new Rect();
        this.f86906ab = new Rect();
        this.bb = new Rect();
        this.bp = new Rect();
        this.bv = new Rect();
        this.an = new int[2];
        this.bl = null;
        this.ba = new C6972q();
        this.ad = false;
        this.am = false;
        this.tlhn = true;
        this.zmmu = false;
        this.sk1t = false;
        this.dy = new int[2];
        C7334n.m26605k(context);
        this.ac = new C6927k(context, attributeSet);
        this.bd = miuix.os.zy.m26179k(context);
        a9();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.h9w7, i2, 0);
        this.ad = typedArrayObtainStyledAttributes.getBoolean(toq.ki.i2en, false);
        this.am = AbstractC6920k.m24912s(context);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(toq.ki.onc0, false);
        this.f39085o = z2;
        if (z2) {
            this.f39083m = typedArrayObtainStyledAttributes.getDrawable(toq.ki.q6c);
        }
        setExtraHorizontalPaddingEnable(typedArrayObtainStyledAttributes.getBoolean(toq.ki.du, this.aj));
        setExtraPaddingApplyToContentEnable(typedArrayObtainStyledAttributes.getBoolean(toq.ki.krlr, this.bs));
        typedArrayObtainStyledAttributes.recycle();
        this.bc = C7164n.ld6(context, toq.C6055q.f76614ra, 0);
        this.zmmu = C7164n.m25951q(context, toq.C6055q.nd9, false);
        this.sk1t = C7164n.m25951q(context, toq.C6055q.tn, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean showContextMenuForChild(View view) {
        miuix.appcompat.internal.view.menu.context.toq toqVar = this.as;
        if (toqVar == null) {
            miuix.appcompat.internal.view.menu.context.toq toqVar2 = new miuix.appcompat.internal.view.menu.context.toq(getContext());
            this.as = toqVar2;
            toqVar2.lrht(this.ba);
        } else {
            toqVar.clear();
        }
        DialogInterfaceOnKeyListenerC7038y dialogInterfaceOnKeyListenerC7038yNmn5 = this.as.nmn5(view, view.getWindowToken());
        this.bg = dialogInterfaceOnKeyListenerC7038yNmn5;
        if (dialogInterfaceOnKeyListenerC7038yNmn5 != null) {
            dialogInterfaceOnKeyListenerC7038yNmn5.toq(this.ba);
            return true;
        }
        return super.showContextMenuForChild(view);
    }
}
