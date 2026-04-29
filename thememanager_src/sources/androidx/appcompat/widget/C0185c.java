package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.f7l8;
import p030n.C7397k;
import zy.InterfaceC7828g;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.c */
/* JADX INFO: compiled from: PopupMenu.java */
/* JADX INFO: loaded from: classes.dex */
public class C0185c {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private View.OnTouchListener f46847f7l8;

    /* JADX INFO: renamed from: g */
    q f966g;

    /* JADX INFO: renamed from: k */
    private final Context f967k;

    /* JADX INFO: renamed from: n */
    n f968n;

    /* JADX INFO: renamed from: q */
    final androidx.appcompat.view.menu.qrj f969q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final androidx.appcompat.view.menu.f7l8 f46848toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final View f46849zy;

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$k */
    /* JADX INFO: compiled from: PopupMenu.java */
    class k implements f7l8.InterfaceC0118k {
        k() {
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        /* JADX INFO: renamed from: k */
        public boolean mo117k(@zy.lvui androidx.appcompat.view.menu.f7l8 f7l8Var, @zy.lvui MenuItem menuItem) {
            n nVar = C0185c.this.f968n;
            if (nVar != null) {
                return nVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f7l8.InterfaceC0118k
        public void toq(@zy.lvui androidx.appcompat.view.menu.f7l8 f7l8Var) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$n */
    /* JADX INFO: compiled from: PopupMenu.java */
    public interface n {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$q */
    /* JADX INFO: compiled from: PopupMenu.java */
    public interface q {
        /* JADX INFO: renamed from: k */
        void m562k(C0185c c0185c);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$toq */
    /* JADX INFO: compiled from: PopupMenu.java */
    class toq implements PopupWindow.OnDismissListener {
        toq() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0185c c0185c = C0185c.this;
            q qVar = c0185c.f966g;
            if (qVar != null) {
                qVar.m562k(c0185c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$zy */
    /* JADX INFO: compiled from: PopupMenu.java */
    class zy extends dd {
        zy(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.dd
        /* JADX INFO: renamed from: q */
        protected boolean mo432q() {
            C0185c.this.m556k();
            return true;
        }

        @Override // androidx.appcompat.widget.dd
        public androidx.appcompat.view.menu.cdj toq() {
            return C0185c.this.f969q.m383n();
        }

        @Override // androidx.appcompat.widget.dd
        protected boolean zy() {
            C0185c.this.x2();
            return true;
        }
    }

    public C0185c(@zy.lvui Context context, @zy.lvui View view) {
        this(context, view, 0);
    }

    public void f7l8(@zy.eqxt int i2) {
        m557n().inflate(i2, this.f46848toq);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: g */
    ListView m555g() {
        if (this.f969q.m380g()) {
            return this.f969q.m385q();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m556k() {
        this.f969q.dismiss();
    }

    public void ld6(@zy.dd n nVar) {
        this.f968n = nVar;
    }

    @zy.lvui
    /* JADX INFO: renamed from: n */
    public MenuInflater m557n() {
        return new androidx.appcompat.view.f7l8(this.f967k);
    }

    /* JADX INFO: renamed from: p */
    public void m558p(@zy.dd q qVar) {
        this.f966g = qVar;
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public Menu m559q() {
        return this.f46848toq;
    }

    /* JADX INFO: renamed from: s */
    public void m560s(int i2) {
        this.f969q.m384p(i2);
    }

    @zy.lvui
    public View.OnTouchListener toq() {
        if (this.f46847f7l8 == null) {
            this.f46847f7l8 = new zy(this.f46849zy);
        }
        return this.f46847f7l8;
    }

    public void x2() {
        this.f969q.x2();
    }

    /* JADX INFO: renamed from: y */
    public void m561y(boolean z2) {
        this.f969q.m386s(z2);
    }

    public int zy() {
        return this.f969q.zy();
    }

    public C0185c(@zy.lvui Context context, @zy.lvui View view, int i2) {
        this(context, view, i2, C7397k.toq.f92824bqie, 0);
    }

    public C0185c(@zy.lvui Context context, @zy.lvui View view, int i2, @InterfaceC7828g int i3, @zy.hb int i4) {
        this.f967k = context;
        this.f46849zy = view;
        androidx.appcompat.view.menu.f7l8 f7l8Var = new androidx.appcompat.view.menu.f7l8(context);
        this.f46848toq = f7l8Var;
        f7l8Var.uv6(new k());
        androidx.appcompat.view.menu.qrj qrjVar = new androidx.appcompat.view.menu.qrj(context, f7l8Var, view, false, i3, i4);
        this.f969q = qrjVar;
        qrjVar.m384p(i2);
        qrjVar.ld6(new toq());
    }
}
