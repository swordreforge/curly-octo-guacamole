package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AbstractC0096k;
import androidx.appcompat.view.C0116k;
import androidx.appcompat.view.C0139y;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.view.menu.t8r;
import androidx.appcompat.view.toq;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d3;
import androidx.core.view.C0683f;
import androidx.core.view.InterfaceC0732v;
import androidx.core.view.dr;
import androidx.core.view.gyi;
import androidx.core.view.xwq3;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.o1t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p023g.C6045k;
import p030n.C7397k;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: WindowDecorActionBar.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class cdj extends AbstractC0096k implements ActionBarOverlayLayout.InterfaceC0143q {

    /* JADX INFO: renamed from: l */
    private static final long f231l = 100;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static final long f46560n5r1 = 200;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final int f46561ncyb = -1;

    /* JADX INFO: renamed from: r */
    private static final String f232r = "WindowDecorActionBar";

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    boolean f46563a9;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    ScrollingTabContainerView f46564cdj;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f46566d3;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f46568fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private boolean f46569fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    toq.InterfaceC0138k f46570fu4;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    C0139y f46571gvn7;

    /* JADX INFO: renamed from: h */
    View f233h;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    boolean f46572jk;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    ActionBarContextView f46575kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private Activity f46576ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    d3 f46579n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    androidx.appcompat.view.toq f46580ni7;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    boolean f46582oc;

    /* JADX INFO: renamed from: p */
    private Context f235p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    ActionBarContainer f46583qrj;

    /* JADX INFO: renamed from: s */
    Context f236s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private C0091n f46584t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private boolean f46585wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    ActionBarOverlayLayout f46586x2;

    /* JADX INFO: renamed from: z */
    private boolean f238z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    C0092q f46587zurt;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final Interpolator f46559dd = new AccelerateInterpolator();

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final Interpolator f46562x9kr = new DecelerateInterpolator();

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private ArrayList<C0091n> f46574ki = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    private int f234i = -1;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private ArrayList<AbstractC0096k.q> f46581o1t = new ArrayList<>();

    /* JADX INFO: renamed from: t */
    private int f237t = 0;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    boolean f46578mcp = true;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private boolean f46573jp0y = true;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    final dr f46567eqxt = new C0090k();

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    final dr f46565d2ok = new toq();

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    final InterfaceC0732v f46577lvui = new zy();

    /* JADX INFO: renamed from: androidx.appcompat.app.cdj$k */
    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    class C0090k extends xwq3 {
        C0090k() {
        }

        @Override // androidx.core.view.xwq3, androidx.core.view.dr
        public void toq(View view) {
            View view2;
            cdj cdjVar = cdj.this;
            if (cdjVar.f46578mcp && (view2 = cdjVar.f233h) != null) {
                view2.setTranslationY(0.0f);
                cdj.this.f46583qrj.setTranslationY(0.0f);
            }
            cdj.this.f46583qrj.setVisibility(8);
            cdj.this.f46583qrj.setTransitioning(false);
            cdj cdjVar2 = cdj.this;
            cdjVar2.f46571gvn7 = null;
            cdjVar2.qo();
            ActionBarOverlayLayout actionBarOverlayLayout = cdj.this.f46586x2;
            if (actionBarOverlayLayout != null) {
                C0683f.m28243do(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.cdj$n */
    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public class C0091n extends AbstractC0096k.g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f46588f7l8 = -1;

        /* JADX INFO: renamed from: g */
        private CharSequence f240g;

        /* JADX INFO: renamed from: n */
        private CharSequence f241n;

        /* JADX INFO: renamed from: q */
        private Drawable f242q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private AbstractC0096k.f7l8 f46589toq;

        /* JADX INFO: renamed from: y */
        private View f244y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Object f46590zy;

        public C0091n() {
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g cdj(CharSequence charSequence) {
            this.f241n = charSequence;
            int i2 = this.f46588f7l8;
            if (i2 >= 0) {
                cdj.this.f46564cdj.qrj(i2);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public void f7l8() {
            cdj.this.n5r1(this);
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: g */
        public CharSequence mo177g() {
            return this.f241n;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: h */
        public AbstractC0096k.g mo178h(int i2) {
            return cdj(cdj.this.f236s.getResources().getText(i2));
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: k */
        public CharSequence mo179k() {
            return this.f240g;
        }

        public AbstractC0096k.f7l8 ki() {
            return this.f46589toq;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g kja0(Object obj) {
            this.f46590zy = obj;
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g ld6(View view) {
            this.f244y = view;
            int i2 = this.f46588f7l8;
            if (i2 >= 0) {
                cdj.this.f46564cdj.qrj(i2);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: n */
        public Object mo180n() {
            return this.f46590zy;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g n7h(AbstractC0096k.f7l8 f7l8Var) {
            this.f46589toq = f7l8Var;
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: p */
        public AbstractC0096k.g mo181p(int i2) {
            return ld6(LayoutInflater.from(cdj.this.wvg()).inflate(i2, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: q */
        public int mo182q() {
            return this.f46588f7l8;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g qrj(Drawable drawable) {
            this.f242q = drawable;
            int i2 = this.f46588f7l8;
            if (i2 >= 0) {
                cdj.this.f46564cdj.qrj(i2);
            }
            return this;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: s */
        public AbstractC0096k.g mo183s(CharSequence charSequence) {
            this.f240g = charSequence;
            int i2 = this.f46588f7l8;
            if (i2 >= 0) {
                cdj.this.f46564cdj.qrj(i2);
            }
            return this;
        }

        public void t8r(int i2) {
            this.f46588f7l8 = i2;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public View toq() {
            return this.f244y;
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public AbstractC0096k.g x2(int i2) {
            return qrj(C6045k.toq(cdj.this.f236s, i2));
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        /* JADX INFO: renamed from: y */
        public AbstractC0096k.g mo184y(int i2) {
            return mo183s(cdj.this.f236s.getResources().getText(i2));
        }

        @Override // androidx.appcompat.app.AbstractC0096k.g
        public Drawable zy() {
            return this.f242q;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.cdj$q */
    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public class C0092q extends androidx.appcompat.view.toq implements f7l8.InterfaceC0118k {

        /* JADX INFO: renamed from: g */
        private final androidx.appcompat.view.menu.f7l8 f245g;

        /* JADX INFO: renamed from: n */
        private final Context f246n;

        /* JADX INFO: renamed from: s */
        private WeakReference<View> f248s;

        /* JADX INFO: renamed from: y */
        private toq.InterfaceC0138k f249y;

        public C0092q(Context context, toq.InterfaceC0138k interfaceC0138k) {
            this.f246n = context;
            this.f249y = interfaceC0138k;
            androidx.appcompat.view.menu.f7l8 f7l8VarM326e = new androidx.appcompat.view.menu.f7l8(context).m326e(1);
            this.f245g = f7l8VarM326e;
            f7l8VarM326e.uv6(this);
        }

        @Override // androidx.appcompat.view.toq
        public CharSequence f7l8() {
            return cdj.this.f46575kja0.getSubtitle();
        }

        public boolean fn3e() {
            this.f245g.m323a();
            try {
                return this.f249y.toq(this, this.f245g);
            } finally {
                this.f245g.a98o();
            }
        }

        public boolean fu4(t8r t8rVar) {
            if (this.f249y == null) {
                return false;
            }
            if (!t8rVar.hasVisibleItems()) {
                return true;
            }
            new androidx.appcompat.view.menu.qrj(cdj.this.wvg(), t8rVar).x2();
            return true;
        }

        @Override // androidx.appcompat.view.toq
        /* JADX INFO: renamed from: g */
        public MenuInflater mo185g() {
            return new androidx.appcompat.view.f7l8(this.f246n);
        }

        @Override // androidx.appcompat.view.toq
        /* JADX INFO: renamed from: h */
        public void mo186h(CharSequence charSequence) {
            cdj.this.f46575kja0.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.toq
        /* JADX INFO: renamed from: i */
        public void mo187i(boolean z2) {
            super.mo187i(z2);
            cdj.this.f46575kja0.setTitleOptional(z2);
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        /* JADX INFO: renamed from: k */
        public boolean mo117k(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var, @lvui MenuItem menuItem) {
            toq.InterfaceC0138k interfaceC0138k = this.f249y;
            if (interfaceC0138k != null) {
                return interfaceC0138k.zy(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.toq
        public void ki(int i2) {
            t8r(cdj.this.f236s.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.toq
        public void kja0(int i2) {
            mo186h(cdj.this.f236s.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.toq
        public void ld6() {
            if (cdj.this.f46587zurt != this) {
                return;
            }
            this.f245g.m323a();
            try {
                this.f249y.mo140q(this, this.f245g);
            } finally {
                this.f245g.a98o();
            }
        }

        @Override // androidx.appcompat.view.toq
        /* JADX INFO: renamed from: n */
        public Menu mo188n() {
            return this.f245g;
        }

        @Override // androidx.appcompat.view.toq
        public void n7h(View view) {
            cdj.this.f46575kja0.setCustomView(view);
            this.f248s = new WeakReference<>(view);
        }

        public void ni7(t8r t8rVar) {
        }

        @Override // androidx.appcompat.view.toq
        /* JADX INFO: renamed from: q */
        public View mo189q() {
            WeakReference<View> weakReference = this.f248s;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.toq
        /* JADX INFO: renamed from: s */
        public CharSequence mo190s() {
            return cdj.this.f46575kja0.getTitle();
        }

        @Override // androidx.appcompat.view.toq
        public void t8r(CharSequence charSequence) {
            cdj.this.f46575kja0.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        public void toq(@lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
            if (this.f249y == null) {
                return;
            }
            ld6();
            cdj.this.f46575kja0.kja0();
        }

        @Override // androidx.appcompat.view.toq
        public boolean x2() {
            return cdj.this.f46575kja0.t8r();
        }

        public void zurt(androidx.appcompat.view.menu.f7l8 f7l8Var, boolean z2) {
        }

        @Override // androidx.appcompat.view.toq
        public void zy() {
            cdj cdjVar = cdj.this;
            if (cdjVar.f46587zurt != this) {
                return;
            }
            if (cdj.qkj8(cdjVar.f46572jk, cdjVar.f46563a9, false)) {
                this.f249y.mo139k(this);
            } else {
                cdj cdjVar2 = cdj.this;
                cdjVar2.f46580ni7 = this;
                cdjVar2.f46570fu4 = this.f249y;
            }
            this.f249y = null;
            cdj.this.vq(false);
            cdj.this.f46575kja0.m410h();
            cdj cdjVar3 = cdj.this;
            cdjVar3.f46586x2.setHideOnContentScrollEnabled(cdjVar3.f46582oc);
            cdj.this.f46587zurt = null;
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    class toq extends xwq3 {
        toq() {
        }

        @Override // androidx.core.view.xwq3, androidx.core.view.dr
        public void toq(View view) {
            cdj cdjVar = cdj.this;
            cdjVar.f46571gvn7 = null;
            cdjVar.f46583qrj.requestLayout();
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    class zy implements InterfaceC0732v {
        zy() {
        }

        @Override // androidx.core.view.InterfaceC0732v
        /* JADX INFO: renamed from: k */
        public void mo191k(View view) {
            ((View) cdj.this.f46583qrj.getParent()).invalidate();
        }
    }

    public cdj(Activity activity, boolean z2) {
        this.f46576ld6 = activity;
        View decorView = activity.getWindow().getDecorView();
        i9jn(decorView);
        if (z2) {
            return;
        }
        this.f233h = decorView.findViewById(R.id.content);
    }

    private void fnq8() {
        if (this.f46584t8r != null) {
            n5r1(null);
        }
        this.f46574ki.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.f46564cdj;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.ld6();
        }
        this.f234i = -1;
    }

    private void g1() {
        if (this.f46564cdj != null) {
            return;
        }
        ScrollingTabContainerView scrollingTabContainerView = new ScrollingTabContainerView(this.f236s);
        if (this.f46585wvg) {
            scrollingTabContainerView.setVisibility(0);
            this.f46579n7h.o1t(scrollingTabContainerView);
        } else {
            if (fn3e() == 2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f46586x2;
                if (actionBarOverlayLayout != null) {
                    C0683f.m28243do(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.f46583qrj.setTabContainer(scrollingTabContainerView);
        }
        this.f46564cdj = scrollingTabContainerView;
    }

    private void i9jn(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C7397k.f7l8.f92318fu4);
        this.f46586x2 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f46579n7h = was(view.findViewById(C7397k.f7l8.f42327k));
        this.f46575kja0 = (ActionBarContextView) view.findViewById(C7397k.f7l8.f42339y);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C7397k.f7l8.f92356zy);
        this.f46583qrj = actionBarContainer;
        d3 d3Var = this.f46579n7h;
        if (d3Var == null || this.f46575kja0 == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f236s = d3Var.getContext();
        boolean z2 = (this.f46579n7h.eqxt() & 4) != 0;
        if (z2) {
            this.f46568fn3e = true;
        }
        C0116k qVar = C0116k.toq(this.f236s);
        mo152a(qVar.m303k() || z2);
        ltg8(qVar.f7l8());
        TypedArray typedArrayObtainStyledAttributes = this.f236s.obtainStyledAttributes(null, C7397k.qrj.f42457k, C7397k.toq.f42483g, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(C7397k.qrj.f92635dd, false)) {
            y9n(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7397k.qrj.f92730oc, 0);
        if (dimensionPixelSize != 0) {
            ek5k(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void ltg8(boolean z2) {
        this.f46585wvg = z2;
        if (z2) {
            this.f46583qrj.setTabContainer(null);
            this.f46579n7h.o1t(this.f46564cdj);
        } else {
            this.f46579n7h.o1t(null);
            this.f46583qrj.setTabContainer(this.f46564cdj);
        }
        boolean z3 = fn3e() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f46564cdj;
        if (scrollingTabContainerView != null) {
            if (z3) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f46586x2;
                if (actionBarOverlayLayout != null) {
                    C0683f.m28243do(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f46579n7h.ni7(!this.f46585wvg && z3);
        this.f46586x2.setHasNonEmbeddedTabs(!this.f46585wvg && z3);
    }

    private void m4() {
        if (this.f46569fti) {
            return;
        }
        this.f46569fti = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f46586x2;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        v0af(false);
    }

    private void py() {
        if (this.f46569fti) {
            this.f46569fti = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f46586x2;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            v0af(false);
        }
    }

    static boolean qkj8(boolean z2, boolean z3, boolean z5) {
        if (z5) {
            return true;
        }
        return (z2 || z3) ? false : true;
    }

    private boolean r8s8() {
        return C0683f.v0af(this.f46583qrj);
    }

    private void tfm(AbstractC0096k.g gVar, int i2) {
        C0091n c0091n = (C0091n) gVar;
        if (c0091n.ki() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        c0091n.t8r(i2);
        this.f46574ki.add(i2, c0091n);
        int size = this.f46574ki.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                return;
            } else {
                this.f46574ki.get(i2).t8r(i2);
            }
        }
    }

    private void v0af(boolean z2) {
        if (qkj8(this.f46572jk, this.f46563a9, this.f46569fti)) {
            if (this.f46573jp0y) {
                return;
            }
            this.f46573jp0y = true;
            d8wk(z2);
            return;
        }
        if (this.f46573jp0y) {
            this.f46573jp0y = false;
            wo(z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d3 was(View view) {
        if (view instanceof d3) {
            return (d3) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: a */
    public void mo152a(boolean z2) {
        this.f46579n7h.ki(z2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean a9() {
        return this.f46586x2.m420i();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void a98o(Drawable drawable) {
        this.f46579n7h.lvui(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: b */
    public void mo153b(int i2) {
        this.f46579n7h.mo534i(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void bf2(CharSequence charSequence) {
        this.f46579n7h.mo537p(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void bo(boolean z2) {
        C0139y c0139y;
        this.f46566d3 = z2;
        if (z2 || (c0139y = this.f46571gvn7) == null) {
            return;
        }
        c0139y.m403k();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: c */
    public void mo154c(View view) {
        this.f46579n7h.setCustomView(view);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void c8jq(Drawable drawable) {
        this.f46583qrj.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public float cdj() {
        return C0683f.m3166l(this.f46583qrj);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ch(SpinnerAdapter spinnerAdapter, AbstractC0096k.n nVar) {
        this.f46579n7h.gvn7(spinnerAdapter, new x2(nVar));
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: d */
    public void mo155d() {
        if (this.f46572jk) {
            this.f46572jk = false;
            v0af(false);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void d3(Configuration configuration) {
        ltg8(C0116k.toq(this.f236s).f7l8());
    }

    public void d8wk(boolean z2) {
        View view;
        View view2;
        C0139y c0139y = this.f46571gvn7;
        if (c0139y != null) {
            c0139y.m403k();
        }
        this.f46583qrj.setVisibility(0);
        if (this.f237t == 0 && (this.f46566d3 || z2)) {
            this.f46583qrj.setTranslationY(0.0f);
            float f2 = -this.f46583qrj.getHeight();
            if (z2) {
                this.f46583qrj.getLocationInWindow(new int[]{0, 0});
                f2 -= r5[1];
            }
            this.f46583qrj.setTranslationY(f2);
            C0139y c0139y2 = new C0139y();
            gyi gyiVarM3301t = C0683f.f7l8(this.f46583qrj).m3301t(0.0f);
            gyiVarM3301t.fu4(this.f46577lvui);
            c0139y2.zy(gyiVarM3301t);
            if (this.f46578mcp && (view2 = this.f233h) != null) {
                view2.setTranslationY(f2);
                c0139y2.zy(C0683f.f7l8(this.f233h).m3301t(0.0f));
            }
            c0139y2.m402g(f46562x9kr);
            c0139y2.m404n(250L);
            c0139y2.f7l8(this.f46565d2ok);
            this.f46571gvn7 = c0139y2;
            c0139y2.m406y();
        } else {
            this.f46583qrj.setAlpha(1.0f);
            this.f46583qrj.setTranslationY(0.0f);
            if (this.f46578mcp && (view = this.f233h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f46565d2ok.toq(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f46586x2;
        if (actionBarOverlayLayout != null) {
            C0683f.m28243do(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void dd(AbstractC0096k.q qVar) {
        this.f46581o1t.remove(qVar);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void dr(CharSequence charSequence) {
        this.f46579n7h.ld6(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: e */
    public void mo156e(int i2) {
        if ((i2 & 4) != 0) {
            this.f46568fn3e = true;
        }
        this.f46579n7h.mo539s(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ek5k(float f2) {
        C0683f.a5id(this.f46583qrj, f2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean eqxt(int i2, KeyEvent keyEvent) {
        Menu menuMo188n;
        C0092q c0092q = this.f46587zurt;
        if (c0092q == null || (menuMo188n = c0092q.mo188n()) == null) {
            return false;
        }
        menuMo188n.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMo188n.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: f */
    public void mo157f(int i2) {
        mo154c(LayoutInflater.from(wvg()).inflate(i2, this.f46579n7h.cdj(), false));
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void f7l8(AbstractC0096k.q qVar) {
        this.f46581o1t.add(qVar);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int fn3e() {
        return this.f46579n7h.n7h();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean fti() {
        int iKi = ki();
        return this.f46573jp0y && (iKi == 0 || t8r() < iKi);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public CharSequence fu4() {
        return this.f46579n7h.oc();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0143q
    /* JADX INFO: renamed from: g */
    public void mo158g() {
        C0139y c0139y = this.f46571gvn7;
        if (c0139y != null) {
            c0139y.m403k();
            this.f46571gvn7 = null;
        }
    }

    public boolean gbni() {
        return this.f46579n7h.toq();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public AbstractC0096k.g gvn7() {
        return new C0091n();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void gyi(int i2) {
        dr(this.f236s.getString(i2));
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: h */
    public int mo159h() {
        return this.f46579n7h.eqxt();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void hb(boolean z2) {
        nn86(z2 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void hyr(Drawable drawable) {
        this.f46583qrj.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: i */
    public int mo160i() {
        int iN7h = this.f46579n7h.n7h();
        if (iN7h == 1) {
            return this.f46579n7h.zurt();
        }
        if (iN7h != 2) {
            return 0;
        }
        return this.f46574ki.size();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void i1(int i2) {
        this.f46579n7h.fti(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ikck(CharSequence charSequence) {
        this.f46579n7h.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: j */
    public void mo161j(boolean z2) {
        nn86(z2 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean jp0y() {
        d3 d3Var = this.f46579n7h;
        return d3Var != null && d3Var.mo541y();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0143q
    /* JADX INFO: renamed from: k */
    public void mo162k() {
        if (this.f46563a9) {
            this.f46563a9 = false;
            v0af(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int ki() {
        return this.f46583qrj.getHeight();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public View kja0() {
        return this.f46579n7h.getCustomView();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: l */
    public boolean mo163l() {
        ViewGroup viewGroupCdj = this.f46579n7h.cdj();
        if (viewGroupCdj == null || viewGroupCdj.hasFocus()) {
            return false;
        }
        viewGroupCdj.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ld6(AbstractC0096k.g gVar, boolean z2) {
        g1();
        this.f46564cdj.toq(gVar, z2);
        tfm(gVar, this.f46574ki.size());
        if (z2) {
            n5r1(gVar);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void lrht(View view, AbstractC0096k.toq toqVar) {
        view.setLayoutParams(toqVar);
        this.f46579n7h.setCustomView(view);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void lv5(Drawable drawable) {
        this.f46579n7h.wvg(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: m */
    public void mo164m(boolean z2) {
        nn86(z2 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void mcp() {
        if (this.f46572jk) {
            return;
        }
        this.f46572jk = true;
        v0af(false);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public androidx.appcompat.view.toq mu(toq.InterfaceC0138k interfaceC0138k) {
        C0092q c0092q = this.f46587zurt;
        if (c0092q != null) {
            c0092q.zy();
        }
        this.f46586x2.setHideOnContentScrollEnabled(false);
        this.f46575kja0.m411i();
        C0092q c0092q2 = new C0092q(this.f46575kja0.getContext(), interfaceC0138k);
        if (!c0092q2.fn3e()) {
            return null;
        }
        this.f46587zurt = c0092q2;
        c0092q2.ld6();
        this.f46575kja0.cdj(c0092q2);
        vq(true);
        return c0092q2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0143q
    /* JADX INFO: renamed from: n */
    public void mo165n() {
        if (this.f46563a9) {
            return;
        }
        this.f46563a9 = true;
        v0af(true);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void n5r1(AbstractC0096k.g gVar) {
        if (fn3e() != 2) {
            this.f234i = gVar != null ? gVar.mo182q() : -1;
            return;
        }
        o1t o1tVarT8r = (!(this.f46576ld6 instanceof ActivityC0891q) || this.f46579n7h.cdj().isInEditMode()) ? null : ((ActivityC0891q) this.f46576ld6).getSupportFragmentManager().ki().t8r();
        C0091n c0091n = this.f46584t8r;
        if (c0091n != gVar) {
            this.f46564cdj.setTabSelected(gVar != null ? gVar.mo182q() : -1);
            C0091n c0091n2 = this.f46584t8r;
            if (c0091n2 != null) {
                c0091n2.ki().fn3e(this.f46584t8r, o1tVarT8r);
            }
            C0091n c0091n3 = (C0091n) gVar;
            this.f46584t8r = c0091n3;
            if (c0091n3 != null) {
                c0091n3.ki().mo201p(this.f46584t8r, o1tVarT8r);
            }
        } else if (c0091n != null) {
            c0091n.ki().mo202z(this.f46584t8r, o1tVarT8r);
            this.f46564cdj.zy(gVar.mo182q());
        }
        if (o1tVarT8r == null || o1tVarT8r.ni7()) {
            return;
        }
        o1tVarT8r.qrj();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void n7h(boolean z2) {
        if (z2 == this.f238z) {
            return;
        }
        this.f238z = z2;
        int size = this.f46581o1t.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f46581o1t.get(i2).onMenuVisibilityChanged(z2);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void ncyb(int i2) {
        if (this.f46564cdj == null) {
            return;
        }
        C0091n c0091n = this.f46584t8r;
        int iMo182q = c0091n != null ? c0091n.mo182q() : this.f234i;
        this.f46564cdj.x2(i2);
        C0091n c0091nRemove = this.f46574ki.remove(i2);
        if (c0091nRemove != null) {
            c0091nRemove.t8r(-1);
        }
        int size = this.f46574ki.size();
        for (int i3 = i2; i3 < size; i3++) {
            this.f46574ki.get(i3).t8r(i3);
        }
        if (iMo182q == i2) {
            n5r1(this.f46574ki.isEmpty() ? null : this.f46574ki.get(Math.max(0, i2 - 1)));
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public AbstractC0096k.g ni7() {
        return this.f46584t8r;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void nmn5(int i2) {
        this.f46579n7h.setLogo(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void nn86(int i2, int i3) {
        int iEqxt = this.f46579n7h.eqxt();
        if ((i3 & 4) != 0) {
            this.f46568fn3e = true;
        }
        this.f46579n7h.mo539s((i2 & i3) | ((~i3) & iEqxt));
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: o */
    public void mo166o(boolean z2) {
        nn86(z2 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int o1t() {
        return this.f46574ki.size();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: p */
    public void mo167p(AbstractC0096k.g gVar, int i2, boolean z2) {
        g1();
        this.f46564cdj.m480k(gVar, i2, z2);
        tfm(gVar, i2);
        if (z2) {
            n5r1(gVar);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0143q
    /* JADX INFO: renamed from: q */
    public void mo168q(boolean z2) {
        this.f46578mcp = z2;
    }

    void qo() {
        toq.InterfaceC0138k interfaceC0138k = this.f46570fu4;
        if (interfaceC0138k != null) {
            interfaceC0138k.mo139k(this.f46580ni7);
            this.f46580ni7 = null;
            this.f46570fu4 = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public boolean qrj() {
        d3 d3Var = this.f46579n7h;
        if (d3Var == null || !d3Var.f7l8()) {
            return false;
        }
        this.f46579n7h.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: r */
    public void mo169r() {
        fnq8();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: s */
    public void mo170s(AbstractC0096k.g gVar, int i2) {
        mo167p(gVar, i2, this.f46574ki.isEmpty());
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: t */
    public CharSequence mo171t() {
        return this.f46579n7h.getTitle();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void t8iq(int i2) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int iN7h = this.f46579n7h.n7h();
        if (iN7h == 2) {
            this.f234i = zurt();
            n5r1(null);
            this.f46564cdj.setVisibility(8);
        }
        if (iN7h != i2 && !this.f46585wvg && (actionBarOverlayLayout = this.f46586x2) != null) {
            C0683f.m28243do(actionBarOverlayLayout);
        }
        this.f46579n7h.mo533h(i2);
        boolean z2 = false;
        if (i2 == 2) {
            g1();
            this.f46564cdj.setVisibility(0);
            int i3 = this.f234i;
            if (i3 != -1) {
                mo172u(i3);
                this.f234i = -1;
            }
        }
        this.f46579n7h.ni7(i2 == 2 && !this.f46585wvg);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f46586x2;
        if (i2 == 2 && !this.f46585wvg) {
            z2 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int t8r() {
        return this.f46586x2.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0143q
    public void toq(int i2) {
        this.f237t = i2;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: u */
    public void mo172u(int i2) {
        int iN7h = this.f46579n7h.n7h();
        if (iN7h == 1) {
            this.f46579n7h.x2(i2);
        } else {
            if (iN7h != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            n5r1(this.f46574ki.get(i2));
        }
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void uv6(boolean z2) {
        if (this.f46568fn3e) {
            return;
        }
        vyq(z2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: v */
    public void mo173v(CharSequence charSequence) {
        this.f46579n7h.setTitle(charSequence);
    }

    public void vq(boolean z2) {
        gyi gyiVarKja0;
        gyi gyiVarN7h;
        if (z2) {
            m4();
        } else {
            py();
        }
        if (!r8s8()) {
            if (z2) {
                this.f46579n7h.setVisibility(4);
                this.f46575kja0.setVisibility(0);
                return;
            } else {
                this.f46579n7h.setVisibility(0);
                this.f46575kja0.setVisibility(8);
                return;
            }
        }
        if (z2) {
            gyiVarN7h = this.f46579n7h.kja0(4, f231l);
            gyiVarKja0 = this.f46575kja0.n7h(0, 200L);
        } else {
            gyiVarKja0 = this.f46579n7h.kja0(0, 200L);
            gyiVarN7h = this.f46575kja0.n7h(8, f231l);
        }
        C0139y c0139y = new C0139y();
        c0139y.m405q(gyiVarN7h, gyiVarKja0);
        c0139y.m406y();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void vyq(boolean z2) {
        nn86(z2 ? 4 : 0, 4);
    }

    public void wo(boolean z2) {
        View view;
        C0139y c0139y = this.f46571gvn7;
        if (c0139y != null) {
            c0139y.m403k();
        }
        if (this.f237t != 0 || (!this.f46566d3 && !z2)) {
            this.f46567eqxt.toq(null);
            return;
        }
        this.f46583qrj.setAlpha(1.0f);
        this.f46583qrj.setTransitioning(true);
        C0139y c0139y2 = new C0139y();
        float f2 = -this.f46583qrj.getHeight();
        if (z2) {
            this.f46583qrj.getLocationInWindow(new int[]{0, 0});
            f2 -= r5[1];
        }
        gyi gyiVarM3301t = C0683f.f7l8(this.f46583qrj).m3301t(f2);
        gyiVarM3301t.fu4(this.f46577lvui);
        c0139y2.zy(gyiVarM3301t);
        if (this.f46578mcp && (view = this.f233h) != null) {
            c0139y2.zy(C0683f.f7l8(view).m3301t(f2));
        }
        c0139y2.m402g(f46559dd);
        c0139y2.m404n(250L);
        c0139y2.f7l8(this.f46567eqxt);
        this.f46571gvn7 = c0139y2;
        c0139y2.m406y();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public Context wvg() {
        if (this.f235p == null) {
            TypedValue typedValue = new TypedValue();
            this.f236s.getTheme().resolveAttribute(C7397k.toq.f92901ld6, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f235p = new ContextThemeWrapper(this.f236s, i2);
            } else {
                this.f235p = this.f236s;
            }
        }
        return this.f235p;
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: x */
    public void mo174x(Drawable drawable) {
        this.f46579n7h.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void x9kr(AbstractC0096k.g gVar) {
        ncyb(gVar.mo182q());
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void xwq3(int i2) {
        mo173v(this.f236s.getString(i2));
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: y */
    public void mo175y(AbstractC0096k.g gVar) {
        ld6(gVar, this.f46574ki.isEmpty());
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void y2(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void y9n(boolean z2) {
        if (z2 && !this.f46586x2.fn3e()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f46582oc = z2;
        this.f46586x2.setHideOnContentScrollEnabled(z2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void yz(int i2) {
        if (i2 != 0 && !this.f46586x2.fn3e()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f46586x2.setActionBarHideOffset(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    /* JADX INFO: renamed from: z */
    public AbstractC0096k.g mo176z(int i2) {
        return this.f46574ki.get(i2);
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public void zp(int i2) {
        this.f46579n7h.setIcon(i2);
    }

    public boolean zsr0() {
        return this.f46579n7h.mo536n();
    }

    @Override // androidx.appcompat.app.AbstractC0096k
    public int zurt() {
        C0091n c0091n;
        int iN7h = this.f46579n7h.n7h();
        if (iN7h == 1) {
            return this.f46579n7h.t8r();
        }
        if (iN7h == 2 && (c0091n = this.f46584t8r) != null) {
            return c0091n.mo182q();
        }
        return -1;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0143q
    public void zy() {
    }

    public cdj(Dialog dialog) {
        i9jn(dialog.getWindow().getDecorView());
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public cdj(View view) {
        i9jn(view);
    }
}
