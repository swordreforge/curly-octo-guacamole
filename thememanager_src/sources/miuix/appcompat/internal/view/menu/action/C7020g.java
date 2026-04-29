package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import gb.toq;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.view.menu.AbstractC7031k;
import miuix.appcompat.internal.view.menu.MenuItemC7036s;
import miuix.appcompat.internal.view.menu.ViewOnKeyListenerC7034p;
import miuix.appcompat.internal.view.menu.qrj;
import miuix.internal.util.n7h;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.action.g */
/* JADX INFO: compiled from: EndActionMenuPresenter.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7020g extends ActionMenuPresenter {
    private MenuItemC7036s bl;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.action.g$k */
    /* JADX INFO: compiled from: EndActionMenuPresenter.java */
    private class k extends ViewOnKeyListenerC7034p {
        public k(Context context, miuix.appcompat.internal.view.menu.f7l8 f7l8Var, View view, View view2, boolean z2) {
            super(context, f7l8Var, view, view2, z2);
            ld6(C7020g.this.an);
            ni7(toq.qrj.f76744qkj8);
        }

        @Override // miuix.appcompat.internal.view.menu.ViewOnKeyListenerC7034p, miuix.appcompat.internal.view.menu.action.ActionMenuPresenter.InterfaceC7014n
        /* JADX INFO: renamed from: g */
        public void mo25286g(boolean z2) {
            super.mo25286g(z2);
            View view = C7020g.this.f39394t;
            if (view != null) {
                view.setSelected(false);
            }
        }

        @Override // miuix.appcompat.internal.view.menu.ViewOnKeyListenerC7034p, android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            super.onDismiss();
            ((AbstractC7031k) C7020g.this).f39533n.close();
        }
    }

    public C7020g(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i2, int i3) {
        this(context, actionBarOverlayLayout, i2, i3, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean xwq3(MenuItem menuItem) {
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var = this.f39533n;
        if (f7l8Var != null) {
            AbstractC7031k.cdj(f7l8Var, f7l8Var.jp0y(), nn86());
        }
        if (this.f39394t.isSelected()) {
            hb(true);
        } else {
            lv5();
        }
        return true;
    }

    public void c8jq() {
        gyi(2);
    }

    public void dr() {
        MenuItemC7036s menuItemC7036s = this.bl;
        if (menuItemC7036s == null) {
            return;
        }
        menuItemC7036s.zurt(false);
        m25311v();
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter
    /* JADX INFO: renamed from: e */
    protected int mo25276e(View view) {
        return n7h.x2(view) ? 51 : 53;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter
    /* JADX INFO: renamed from: f */
    protected View mo25277f(Context context) {
        ViewGroup viewGroup = (ViewGroup) this.f39531i;
        if (viewGroup == null) {
            return null;
        }
        miuix.appcompat.internal.view.menu.f7l8 f7l8Var = this.f39533n;
        int i2 = toq.C6054p.iz;
        MenuItemC7036s menuItemC7036sM25357h = AbstractC7031k.m25357h(f7l8Var, 0, i2, 0, 0, context.getString(toq.C6051h.anw), 2);
        this.f39533n.m25335a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{toq.C6055q.uew});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        menuItemC7036sM25357h.setIcon(drawable);
        menuItemC7036sM25357h.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: miuix.appcompat.internal.view.menu.action.n
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f39490k.xwq3(menuItem);
            }
        });
        this.f39533n.m25336b(false);
        View viewKi = ki(menuItemC7036sM25357h, null, viewGroup);
        viewKi.setId(i2);
        this.bl = menuItemC7036sM25357h;
        menuItemC7036sM25357h.jp0y(viewKi);
        return viewKi;
    }

    public void gyi(int i2) {
        MenuItemC7036s menuItemC7036s = this.bl;
        if (menuItemC7036s == null) {
            return;
        }
        menuItemC7036s.ni7(true, i2);
        m25311v();
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter, miuix.appcompat.internal.view.menu.AbstractC7031k, miuix.appcompat.internal.view.menu.ld6
    public boolean n7h(qrj qrjVar) {
        if (!qrjVar.hasVisibleItems()) {
            return false;
        }
        new k(this.f39535q, qrjVar, this.f39394t, this.bv, true).m25364y();
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter
    /* JADX INFO: renamed from: o */
    protected boolean mo25281o(View view) {
        if (view == null) {
            return false;
        }
        MenuItemC7036s menuItemC7036s = this.bl;
        return (view instanceof EndActionMenuItemView) && !(menuItemC7036s != null && menuItemC7036s.kja0() == view);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuPresenter
    protected int uv6() {
        Context context = this.f39535q;
        if (context != null) {
            return context.getResources().getInteger(toq.ld6.f34861g);
        }
        return 5;
    }

    /* JADX INFO: renamed from: v */
    public void m25311v() {
        MenuItemC7036s menuItemC7036s = this.bl;
        if (menuItemC7036s == null) {
            return;
        }
        menuItemC7036s.d2ok();
    }

    public C7020g(Context context, ActionBarOverlayLayout actionBarOverlayLayout, int i2, int i3, int i4, int i5) {
        super(context, actionBarOverlayLayout, i2, i3, i4, i5);
    }
}
