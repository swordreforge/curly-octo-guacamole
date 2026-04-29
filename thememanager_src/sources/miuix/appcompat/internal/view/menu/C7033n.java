package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import miuix.appcompat.app.AbstractC6955q;
import miuix.internal.util.n7h;
import miuix.internal.widget.C7177g;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.n */
/* JADX INFO: compiled from: ImmersionMenuPopupWindowImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7033n extends C7177g implements InterfaceC7035q {
    private AbstractC6955q an;
    private ViewGroup bl;
    private zy id;
    private View in;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.n$k */
    /* JADX INFO: compiled from: ImmersionMenuPopupWindowImpl.java */
    class k implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.n$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ImmersionMenuPopupWindowImpl.java */
        class C8100k implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ SubMenu f39540k;

            C8100k(SubMenu subMenu) {
                this.f39540k = subMenu;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                C7033n.this.setOnDismissListener(null);
                C7033n.this.f7l8(this.f39540k);
                C7033n c7033n = C7033n.this;
                c7033n.d2ok(c7033n.in, C7033n.this.bl);
            }
        }

        k() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            MenuItem item = C7033n.this.id.getItem(i2);
            if (item.hasSubMenu()) {
                C7033n.this.setOnDismissListener(new C8100k(item.getSubMenu()));
            } else {
                C7033n.this.an.onMenuItemSelected(0, item);
            }
            C7033n.this.mo25361g(true);
        }
    }

    public C7033n(AbstractC6955q abstractC6955q, Menu menu, View view) {
        super(abstractC6955q.getThemedContext(), view);
        Context themedContext = abstractC6955q.getThemedContext();
        this.an = abstractC6955q;
        zy zyVar = new zy(themedContext, menu);
        this.id = zyVar;
        x2(zyVar);
        m26034b(new k());
    }

    /* JADX INFO: renamed from: u */
    private void m25360u(View view, ViewGroup viewGroup) {
        int width;
        if (viewGroup == null) {
            Log.w("ImmersionMenu", "ImmersionMenuPopupWindow offset can't be adjusted without parent");
            return;
        }
        int[] iArr = new int[2];
        viewGroup.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        m26040n(-(view.getHeight() + ((iArr2[1] - iArr[1]) - ncyb())));
        if (n7h.x2(viewGroup)) {
            width = m26038l().left;
        } else {
            width = (viewGroup.getWidth() - ((iArr2[0] - iArr[0]) + view.getWidth())) - m26038l().right;
        }
        toq(width);
    }

    public View bo() {
        return this.in;
    }

    @Override // miuix.appcompat.internal.view.menu.InterfaceC7035q
    public void f7l8(Menu menu) {
        this.id.m25379q(menu);
    }

    @Override // miuix.appcompat.internal.view.menu.InterfaceC7035q
    /* JADX INFO: renamed from: g */
    public void mo25361g(boolean z2) {
        dismiss();
    }

    @Override // miuix.internal.widget.C7177g, miuix.appcompat.internal.view.menu.InterfaceC7035q
    public void kja0(View view, ViewGroup viewGroup) {
        this.in = view;
        this.bl = viewGroup;
        m25360u(view, viewGroup);
        super.kja0(view, viewGroup);
    }

    public ViewGroup y2() {
        return this.bl;
    }
}
