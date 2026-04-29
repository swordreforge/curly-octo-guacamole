package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n7h;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.hyr;
import androidx.core.view.C0683f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p030n.C7397k;
import zy.InterfaceC7828g;
import zy.dd;
import zy.hb;
import zy.lvui;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.q */
/* JADX INFO: compiled from: CascadingMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0131q extends x2 implements n7h, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f46790ab = C7397k.p.f92544x2;
    static final int bb = 0;
    static final int bp = 1;
    static final int bv = 200;

    /* JADX INFO: renamed from: a */
    private int f524a;

    /* JADX INFO: renamed from: b */
    private int f525b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private n7h.InterfaceC0129k f46791bo;

    /* JADX INFO: renamed from: c */
    private View f526c;

    /* JADX INFO: renamed from: d */
    private PopupWindow.OnDismissListener f527d;

    /* JADX INFO: renamed from: e */
    View f528e;

    /* JADX INFO: renamed from: g */
    private final int f530g;

    /* JADX INFO: renamed from: m */
    private boolean f535m;

    /* JADX INFO: renamed from: n */
    private final int f536n;

    /* JADX INFO: renamed from: o */
    private boolean f537o;

    /* JADX INFO: renamed from: p */
    final Handler f538p;

    /* JADX INFO: renamed from: q */
    private final Context f539q;

    /* JADX INFO: renamed from: s */
    private final boolean f541s;

    /* JADX INFO: renamed from: u */
    private boolean f543u;

    /* JADX INFO: renamed from: v */
    ViewTreeObserver f544v;

    /* JADX INFO: renamed from: w */
    boolean f545w;

    /* JADX INFO: renamed from: y */
    private final int f547y;

    /* JADX INFO: renamed from: h */
    private final List<f7l8> f531h = new ArrayList();

    /* JADX INFO: renamed from: i */
    final List<q> f532i = new ArrayList();

    /* JADX INFO: renamed from: z */
    final ViewTreeObserver.OnGlobalLayoutListener f548z = new k();

    /* JADX INFO: renamed from: t */
    private final View.OnAttachStateChangeListener f542t = new toq();

    /* JADX INFO: renamed from: r */
    private final hyr f540r = new zy();

    /* JADX INFO: renamed from: l */
    private int f534l = 0;

    /* JADX INFO: renamed from: f */
    private int f529f = 0;

    /* JADX INFO: renamed from: x */
    private boolean f546x = false;

    /* JADX INFO: renamed from: j */
    private int f533j = fti();

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.q$k */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    class k implements ViewTreeObserver.OnGlobalLayoutListener {
        k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0131q.this.isShowing() || ViewOnKeyListenerC0131q.this.f532i.size() <= 0 || ViewOnKeyListenerC0131q.this.f532i.get(0).f550k.d3()) {
                return;
            }
            View view = ViewOnKeyListenerC0131q.this.f528e;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0131q.this.dismiss();
                return;
            }
            Iterator<q> it = ViewOnKeyListenerC0131q.this.f532i.iterator();
            while (it.hasNext()) {
                it.next().f550k.mo318g();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.q$n */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface n {
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.q$q */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    private static class q {

        /* JADX INFO: renamed from: k */
        public final MenuPopupWindow f550k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final f7l8 f46792toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f46793zy;

        public q(@lvui MenuPopupWindow menuPopupWindow, @lvui f7l8 f7l8Var, int i2) {
            this.f550k = menuPopupWindow;
            this.f46792toq = f7l8Var;
            this.f46793zy = i2;
        }

        /* JADX INFO: renamed from: k */
        public ListView m379k() {
            return this.f550k.n7h();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.q$toq */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    class toq implements View.OnAttachStateChangeListener {
        toq() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0131q.this.f544v;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0131q.this.f544v = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0131q viewOnKeyListenerC0131q = ViewOnKeyListenerC0131q.this;
                viewOnKeyListenerC0131q.f544v.removeGlobalOnLayoutListener(viewOnKeyListenerC0131q.f548z);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.q$zy */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    class zy implements hyr {

        /* JADX INFO: renamed from: androidx.appcompat.view.menu.q$zy$k */
        /* JADX INFO: compiled from: CascadingMenuPopup.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ q f554k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ f7l8 f555n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ MenuItem f556q;

            k(q qVar, MenuItem menuItem, f7l8 f7l8Var) {
                this.f554k = qVar;
                this.f556q = menuItem;
                this.f555n = f7l8Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                q qVar = this.f554k;
                if (qVar != null) {
                    ViewOnKeyListenerC0131q.this.f545w = true;
                    qVar.f46792toq.m328g(false);
                    ViewOnKeyListenerC0131q.this.f545w = false;
                }
                if (this.f556q.isEnabled() && this.f556q.hasSubMenu()) {
                    this.f555n.dd(this.f556q, 4);
                }
            }
        }

        zy() {
        }

        @Override // androidx.appcompat.widget.hyr
        public void f7l8(@lvui f7l8 f7l8Var, @lvui MenuItem menuItem) {
            ViewOnKeyListenerC0131q.this.f538p.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0131q.this.f532i.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (f7l8Var == ViewOnKeyListenerC0131q.this.f532i.get(i2).f46792toq) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            ViewOnKeyListenerC0131q.this.f538p.postAtTime(new k(i3 < ViewOnKeyListenerC0131q.this.f532i.size() ? ViewOnKeyListenerC0131q.this.f532i.get(i3) : null, menuItem, f7l8Var), f7l8Var, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.hyr
        public void qrj(@lvui f7l8 f7l8Var, @lvui MenuItem menuItem) {
            ViewOnKeyListenerC0131q.this.f538p.removeCallbacksAndMessages(f7l8Var);
        }
    }

    public ViewOnKeyListenerC0131q(@lvui Context context, @lvui View view, @InterfaceC7828g int i2, @hb int i3, boolean z2) {
        this.f539q = context;
        this.f526c = view;
        this.f530g = i2;
        this.f547y = i3;
        this.f541s = z2;
        Resources resources = context.getResources();
        this.f536n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C7397k.n.f92471fu4));
        this.f538p = new Handler();
    }

    @dd
    private View a9(@lvui q qVar, @lvui f7l8 f7l8Var) {
        C0119g c0119g;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemJk = jk(qVar.f46792toq, f7l8Var);
        if (menuItemJk == null) {
            return null;
        }
        ListView listViewM379k = qVar.m379k();
        ListAdapter adapter = listViewM379k.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c0119g = (C0119g) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0119g = (C0119g) adapter;
            headersCount = 0;
        }
        int count = c0119g.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (menuItemJk == c0119g.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + headersCount) - listViewM379k.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewM379k.getChildCount()) {
            return listViewM379k.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int fti() {
        return C0683f.m3159e(this.f526c) == 1 ? 0 : 1;
    }

    private void gvn7(@lvui f7l8 f7l8Var) {
        q qVar;
        View viewA9;
        int i2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f539q);
        C0119g c0119g = new C0119g(f7l8Var, layoutInflaterFrom, this.f541s, f46790ab);
        if (!isShowing() && this.f546x) {
            c0119g.m341n(true);
        } else if (isShowing()) {
            c0119g.m341n(x2.o1t(f7l8Var));
        }
        int iCdj = x2.cdj(c0119g, null, this.f539q, this.f536n);
        MenuPopupWindow menuPopupWindowM378t = m378t();
        menuPopupWindowM378t.x2(c0119g);
        menuPopupWindowM378t.m672l(iCdj);
        menuPopupWindowM378t.hyr(this.f529f);
        if (this.f532i.size() > 0) {
            List<q> list = this.f532i;
            qVar = list.get(list.size() - 1);
            viewA9 = a9(qVar, f7l8Var);
        } else {
            qVar = null;
            viewA9 = null;
        }
        if (viewA9 != null) {
            menuPopupWindowM378t.ch(false);
            menuPopupWindowM378t.m470a(null);
            int iJp0y = jp0y(iCdj);
            boolean z2 = iJp0y == 1;
            this.f533j = iJp0y;
            menuPopupWindowM378t.x9kr(viewA9);
            if ((this.f529f & 5) == 5) {
                if (!z2) {
                    iCdj = viewA9.getWidth();
                    i2 = 0 - iCdj;
                }
                i2 = iCdj + 0;
            } else {
                if (z2) {
                    iCdj = viewA9.getWidth();
                    i2 = iCdj + 0;
                }
                i2 = 0 - iCdj;
            }
            menuPopupWindowM378t.toq(i2);
            menuPopupWindowM378t.m673m(true);
            menuPopupWindowM378t.m674n(0);
        } else {
            if (this.f537o) {
                menuPopupWindowM378t.toq(this.f525b);
            }
            if (this.f535m) {
                menuPopupWindowM378t.m674n(this.f524a);
            }
            menuPopupWindowM378t.m667f(m390h());
        }
        this.f532i.add(new q(menuPopupWindowM378t, f7l8Var, this.f533j));
        menuPopupWindowM378t.mo318g();
        ListView listViewN7h = menuPopupWindowM378t.n7h();
        listViewN7h.setOnKeyListener(this);
        if (qVar == null && this.f543u && f7l8Var.wvg() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C7397k.p.f92541t8r, (ViewGroup) listViewN7h, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(f7l8Var.wvg());
            listViewN7h.addHeaderView(frameLayout, null, false);
            menuPopupWindowM378t.mo318g();
        }
    }

    private MenuItem jk(@lvui f7l8 f7l8Var, @lvui f7l8 f7l8Var2) {
        int size = f7l8Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = f7l8Var.getItem(i2);
            if (item.hasSubMenu() && f7l8Var2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private int jp0y(int i2) {
        List<q> list = this.f532i;
        ListView listViewM379k = list.get(list.size() - 1).m379k();
        int[] iArr = new int[2];
        listViewM379k.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f528e.getWindowVisibleDisplayFrame(rect);
        return this.f533j == 1 ? (iArr[0] + listViewM379k.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private int mcp(@lvui f7l8 f7l8Var) {
        int size = this.f532i.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (f7l8Var == this.f532i.get(i2).f46792toq) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: t */
    private MenuPopupWindow m378t() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f539q, null, this.f530g, this.f547y);
        menuPopupWindow.m471x(this.f540r);
        menuPopupWindow.m670j(this);
        menuPopupWindow.hb(this);
        menuPopupWindow.x9kr(this.f526c);
        menuPopupWindow.hyr(this.f529f);
        menuPopupWindow.nn86(true);
        menuPopupWindow.uv6(2);
        return menuPopupWindow;
    }

    @Override // androidx.appcompat.view.menu.cdj
    public void dismiss() {
        int size = this.f532i.size();
        if (size > 0) {
            q[] qVarArr = (q[]) this.f532i.toArray(new q[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                q qVar = qVarArr[i2];
                if (qVar.f550k.isShowing()) {
                    qVar.f550k.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n7h
    public void f7l8(f7l8 f7l8Var, boolean z2) {
        int iMcp = mcp(f7l8Var);
        if (iMcp < 0) {
            return;
        }
        int i2 = iMcp + 1;
        if (i2 < this.f532i.size()) {
            this.f532i.get(i2).f46792toq.m328g(false);
        }
        q qVarRemove = this.f532i.remove(iMcp);
        qVarRemove.f46792toq.n5r1(this);
        if (this.f545w) {
            qVarRemove.f550k.zp(null);
            qVarRemove.f550k.ncyb(0);
        }
        qVarRemove.f550k.dismiss();
        int size = this.f532i.size();
        if (size > 0) {
            this.f533j = this.f532i.get(size - 1).f46793zy;
        } else {
            this.f533j = fti();
        }
        if (size != 0) {
            if (z2) {
                this.f532i.get(0).f46792toq.m328g(false);
                return;
            }
            return;
        }
        dismiss();
        n7h.InterfaceC0129k interfaceC0129k = this.f46791bo;
        if (interfaceC0129k != null) {
            interfaceC0129k.f7l8(f7l8Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.f544v;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f544v.removeGlobalOnLayoutListener(this.f548z);
            }
            this.f544v = null;
        }
        this.f528e.removeOnAttachStateChangeListener(this.f542t);
        this.f527d.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.x2
    public void fn3e(int i2) {
        if (this.f534l != i2) {
            this.f534l = i2;
            this.f529f = androidx.core.view.qrj.m3432q(i2, C0683f.m3159e(this.f526c));
        }
    }

    @Override // androidx.appcompat.view.menu.x2
    public void fu4(boolean z2) {
        this.f543u = z2;
    }

    @Override // androidx.appcompat.view.menu.cdj
    /* JADX INFO: renamed from: g */
    public void mo318g() {
        if (isShowing()) {
            return;
        }
        Iterator<f7l8> it = this.f531h.iterator();
        while (it.hasNext()) {
            gvn7(it.next());
        }
        this.f531h.clear();
        View view = this.f526c;
        this.f528e = view;
        if (view != null) {
            boolean z2 = this.f544v == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f544v = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f548z);
            }
            this.f528e.addOnAttachStateChangeListener(this.f542t);
        }
    }

    @Override // androidx.appcompat.view.menu.x2
    /* JADX INFO: renamed from: i */
    public void mo351i(boolean z2) {
        this.f546x = z2;
    }

    @Override // androidx.appcompat.view.menu.cdj
    public boolean isShowing() {
        return this.f532i.size() > 0 && this.f532i.get(0).f550k.isShowing();
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: k */
    public void mo352k(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.x2
    public void ki(@lvui View view) {
        if (this.f526c != view) {
            this.f526c = view;
            this.f529f = androidx.core.view.qrj.m3432q(this.f534l, C0683f.m3159e(view));
        }
    }

    @Override // androidx.appcompat.view.menu.x2
    protected boolean kja0() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: n */
    public boolean mo353n() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.cdj
    public ListView n7h() {
        if (this.f532i.isEmpty()) {
            return null;
        }
        return this.f532i.get(r0.size() - 1).m379k();
    }

    @Override // androidx.appcompat.view.menu.x2
    public void ni7(PopupWindow.OnDismissListener onDismissListener) {
        this.f527d = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        q qVar;
        int size = this.f532i.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                qVar = null;
                break;
            }
            qVar = this.f532i.get(i2);
            if (!qVar.f550k.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (qVar != null) {
            qVar.f46792toq.m328g(false);
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
        for (q qVar : this.f532i) {
            if (t8rVar == qVar.f46792toq) {
                qVar.m379k().requestFocus();
                return true;
            }
        }
        if (!t8rVar.hasVisibleItems()) {
            return false;
        }
        qrj(t8rVar);
        n7h.InterfaceC0129k interfaceC0129k = this.f46791bo;
        if (interfaceC0129k != null) {
            interfaceC0129k.mo143y(t8rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: q */
    public void mo355q(boolean z2) {
        Iterator<q> it = this.f532i.iterator();
        while (it.hasNext()) {
            x2.wvg(it.next().m379k().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.x2
    public void qrj(f7l8 f7l8Var) {
        f7l8Var.zy(this, this.f539q);
        if (isShowing()) {
            gvn7(f7l8Var);
        } else {
            this.f531h.add(f7l8Var);
        }
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: s */
    public void mo356s(n7h.InterfaceC0129k interfaceC0129k) {
        this.f46791bo = interfaceC0129k;
    }

    @Override // androidx.appcompat.view.menu.x2
    /* JADX INFO: renamed from: z */
    public void mo357z(int i2) {
        this.f535m = true;
        this.f524a = i2;
    }

    @Override // androidx.appcompat.view.menu.x2
    public void zurt(int i2) {
        this.f537o = true;
        this.f525b = i2;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public Parcelable zy() {
        return null;
    }
}
