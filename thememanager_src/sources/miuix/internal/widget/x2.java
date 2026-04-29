package miuix.internal.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: PopupMenuWindow.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 extends C7177g {
    private C7183y an;
    private View id;
    private ViewGroup in;

    public x2(Context context) {
        super(context);
        C7183y c7183y = new C7183y(context);
        this.an = c7183y;
        x2(c7183y);
        m26034b(new AdapterView.OnItemClickListener() { // from class: miuix.internal.widget.s
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                this.f40503k.t8iq(adapterView, view, i2, j2);
            }
        });
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: miuix.internal.widget.p
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f40501k.mo25493u();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lv5(SubMenu subMenu) {
        setOnDismissListener(null);
        f7l8(subMenu);
        kja0(this.id, this.in);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t8iq(AdapterView adapterView, View view, int i2, long j2) {
        MenuItem item = this.an.getItem(i2);
        if (item.hasSubMenu()) {
            final SubMenu subMenu = item.getSubMenu();
            setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: miuix.internal.widget.ld6
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f40497k.lv5(subMenu);
                }
            });
        } else {
            bo(item);
        }
        dismiss();
    }

    protected void bo(MenuItem menuItem) {
    }

    public void f7l8(Menu menu) {
        this.an.m26047q(menu);
    }

    @Override // miuix.internal.widget.C7177g, miuix.appcompat.internal.view.menu.InterfaceC7035q
    public void kja0(View view, ViewGroup viewGroup) {
        this.id = view;
        this.in = viewGroup;
        super.kja0(view, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    protected void mo25493u() {
    }
}
