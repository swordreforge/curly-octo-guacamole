package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n7h;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.C0683f;
import p030n.C7397k;

/* JADX INFO: compiled from: StandardMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
final class ki extends x2 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, n7h, View.OnKeyListener {

    /* JADX INFO: renamed from: x */
    private static final int f470x = C7397k.p.f42413i;

    /* JADX INFO: renamed from: a */
    private boolean f471a;

    /* JADX INFO: renamed from: c */
    private n7h.InterfaceC0129k f473c;

    /* JADX INFO: renamed from: e */
    ViewTreeObserver f474e;

    /* JADX INFO: renamed from: f */
    View f475f;

    /* JADX INFO: renamed from: g */
    private final C0119g f476g;

    /* JADX INFO: renamed from: h */
    private final int f477h;

    /* JADX INFO: renamed from: i */
    final MenuPopupWindow f478i;

    /* JADX INFO: renamed from: j */
    private boolean f479j;

    /* JADX INFO: renamed from: l */
    private View f480l;

    /* JADX INFO: renamed from: m */
    private int f481m;

    /* JADX INFO: renamed from: n */
    private final f7l8 f482n;

    /* JADX INFO: renamed from: o */
    private boolean f483o;

    /* JADX INFO: renamed from: p */
    private final int f484p;

    /* JADX INFO: renamed from: q */
    private final Context f485q;

    /* JADX INFO: renamed from: r */
    private PopupWindow.OnDismissListener f486r;

    /* JADX INFO: renamed from: s */
    private final int f487s;

    /* JADX INFO: renamed from: y */
    private final boolean f489y;

    /* JADX INFO: renamed from: z */
    final ViewTreeObserver.OnGlobalLayoutListener f490z = new ViewTreeObserverOnGlobalLayoutListenerC0123k();

    /* JADX INFO: renamed from: t */
    private final View.OnAttachStateChangeListener f488t = new toq();

    /* JADX INFO: renamed from: b */
    private int f472b = 0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ki$k */
    /* JADX INFO: compiled from: StandardMenuPopup.java */
    class ViewTreeObserverOnGlobalLayoutListenerC0123k implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC0123k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ki.this.isShowing() || ki.this.f478i.d3()) {
                return;
            }
            View view = ki.this.f475f;
            if (view == null || !view.isShown()) {
                ki.this.dismiss();
            } else {
                ki.this.f478i.mo318g();
            }
        }
    }

    /* JADX INFO: compiled from: StandardMenuPopup.java */
    class toq implements View.OnAttachStateChangeListener {
        toq() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ki.this.f474e;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ki.this.f474e = view.getViewTreeObserver();
                }
                ki kiVar = ki.this;
                kiVar.f474e.removeGlobalOnLayoutListener(kiVar.f490z);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ki(Context context, f7l8 f7l8Var, View view, int i2, int i3, boolean z2) {
        this.f485q = context;
        this.f482n = f7l8Var;
        this.f489y = z2;
        this.f476g = new C0119g(f7l8Var, LayoutInflater.from(context), z2, f470x);
        this.f484p = i2;
        this.f477h = i3;
        Resources resources = context.getResources();
        this.f487s = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C7397k.n.f92471fu4));
        this.f480l = view;
        this.f478i = new MenuPopupWindow(context, null, i2, i3);
        f7l8Var.zy(this, context);
    }

    /* JADX INFO: renamed from: t */
    private boolean m350t() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.f479j || (view = this.f480l) == null) {
            return false;
        }
        this.f475f = view;
        this.f478i.hb(this);
        this.f478i.m670j(this);
        this.f478i.nn86(true);
        View view2 = this.f475f;
        boolean z2 = this.f474e == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f474e = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f490z);
        }
        view2.addOnAttachStateChangeListener(this.f488t);
        this.f478i.x9kr(view2);
        this.f478i.hyr(this.f472b);
        if (!this.f483o) {
            this.f481m = x2.cdj(this.f476g, null, this.f485q, this.f487s);
            this.f483o = true;
        }
        this.f478i.m672l(this.f481m);
        this.f478i.uv6(2);
        this.f478i.m667f(m390h());
        this.f478i.mo318g();
        ListView listViewN7h = this.f478i.n7h();
        listViewN7h.setOnKeyListener(this);
        if (this.f471a && this.f482n.wvg() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f485q).inflate(C7397k.p.f92541t8r, (ViewGroup) listViewN7h, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f482n.wvg());
            }
            frameLayout.setEnabled(false);
            listViewN7h.addHeaderView(frameLayout, null, false);
        }
        this.f478i.x2(this.f476g);
        this.f478i.mo318g();
        return true;
    }

    @Override // androidx.appcompat.view.menu.cdj
    public void dismiss() {
        if (isShowing()) {
            this.f478i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.n7h
    public void f7l8(f7l8 f7l8Var, boolean z2) {
        if (f7l8Var != this.f482n) {
            return;
        }
        dismiss();
        n7h.InterfaceC0129k interfaceC0129k = this.f473c;
        if (interfaceC0129k != null) {
            interfaceC0129k.f7l8(f7l8Var, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.x2
    public void fn3e(int i2) {
        this.f472b = i2;
    }

    @Override // androidx.appcompat.view.menu.x2
    public void fu4(boolean z2) {
        this.f471a = z2;
    }

    @Override // androidx.appcompat.view.menu.cdj
    /* JADX INFO: renamed from: g */
    public void mo318g() {
        if (!m350t()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.x2
    /* JADX INFO: renamed from: i */
    public void mo351i(boolean z2) {
        this.f476g.m341n(z2);
    }

    @Override // androidx.appcompat.view.menu.cdj
    public boolean isShowing() {
        return !this.f479j && this.f478i.isShowing();
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: k */
    public void mo352k(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.x2
    public void ki(View view) {
        this.f480l = view;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: n */
    public boolean mo353n() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.cdj
    public ListView n7h() {
        return this.f478i.n7h();
    }

    @Override // androidx.appcompat.view.menu.x2
    public void ni7(PopupWindow.OnDismissListener onDismissListener) {
        this.f486r = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f479j = true;
        this.f482n.close();
        ViewTreeObserver viewTreeObserver = this.f474e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f474e = this.f475f.getViewTreeObserver();
            }
            this.f474e.removeGlobalOnLayoutListener(this.f490z);
            this.f474e = null;
        }
        this.f475f.removeOnAttachStateChangeListener(this.f488t);
        PopupWindow.OnDismissListener onDismissListener = this.f486r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: p */
    public boolean mo354p(t8r t8rVar) {
        if (t8rVar.hasVisibleItems()) {
            qrj qrjVar = new qrj(this.f485q, t8rVar, this.f475f, this.f489y, this.f484p, this.f477h);
            qrjVar.mo382k(this.f473c);
            qrjVar.m386s(x2.o1t(t8rVar));
            qrjVar.ld6(this.f486r);
            this.f486r = null;
            this.f482n.m328g(false);
            int iM671k = this.f478i.m671k();
            int iM676p = this.f478i.m676p();
            if ((Gravity.getAbsoluteGravity(this.f472b, C0683f.m3159e(this.f480l)) & 7) == 5) {
                iM671k += this.f480l.getWidth();
            }
            if (qrjVar.m381h(iM671k, iM676p)) {
                n7h.InterfaceC0129k interfaceC0129k = this.f473c;
                if (interfaceC0129k == null) {
                    return true;
                }
                interfaceC0129k.mo143y(t8rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: q */
    public void mo355q(boolean z2) {
        this.f483o = false;
        C0119g c0119g = this.f476g;
        if (c0119g != null) {
            c0119g.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.x2
    public void qrj(f7l8 f7l8Var) {
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: s */
    public void mo356s(n7h.InterfaceC0129k interfaceC0129k) {
        this.f473c = interfaceC0129k;
    }

    @Override // androidx.appcompat.view.menu.x2
    /* JADX INFO: renamed from: z */
    public void mo357z(int i2) {
        this.f478i.m674n(i2);
    }

    @Override // androidx.appcompat.view.menu.x2
    public void zurt(int i2) {
        this.f478i.toq(i2);
    }

    @Override // androidx.appcompat.view.menu.n7h
    public Parcelable zy() {
        return null;
    }
}
