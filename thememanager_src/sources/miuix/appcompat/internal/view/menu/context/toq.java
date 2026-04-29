package miuix.appcompat.internal.view.menu.context;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.util.EventLog;
import android.view.ContextMenu;
import android.view.View;
import miuix.appcompat.internal.view.menu.DialogInterfaceOnKeyListenerC7038y;
import miuix.appcompat.internal.view.menu.f7l8;

/* JADX INFO: compiled from: ContextMenuBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq extends f7l8 implements ContextMenu {

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    C7027n f87006ncyb;

    public toq(Context context) {
        super(context);
    }

    public void ch() {
        C7027n c7027n = this.f87006ncyb;
        if (c7027n instanceof C7027n) {
            c7027n.zy();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8, android.view.Menu
    public void close() {
        super.close();
        C7027n c7027n = this.f87006ncyb;
        if (c7027n != null) {
            c7027n.m25326k();
            this.f87006ncyb = null;
        }
    }

    public C7027n lv5(View view, IBinder iBinder, float f2, float f3) {
        if (view != null) {
            view.createContextMenu(this);
        }
        if (gvn7().size() <= 0) {
            return null;
        }
        EventLog.writeEvent(50001, 1);
        C7027n c7027n = new C7027n(this);
        this.f87006ncyb = c7027n;
        c7027n.m25327n(iBinder, view, f2, f3);
        return this.f87006ncyb;
    }

    public DialogInterfaceOnKeyListenerC7038y nmn5(View view, IBinder iBinder) {
        if (view != null) {
            view.createContextMenu(this);
        }
        if (gvn7().size() <= 0) {
            return null;
        }
        EventLog.writeEvent(50001, 1);
        DialogInterfaceOnKeyListenerC7038y dialogInterfaceOnKeyListenerC7038y = new DialogInterfaceOnKeyListenerC7038y(this);
        dialogInterfaceOnKeyListenerC7038y.zy(iBinder);
        return dialogInterfaceOnKeyListenerC7038y;
    }

    @Override // android.view.ContextMenu
    public ContextMenu setHeaderIcon(Drawable drawable) {
        return (ContextMenu) super.m25342j(drawable);
    }

    @Override // android.view.ContextMenu
    public ContextMenu setHeaderTitle(CharSequence charSequence) {
        return (ContextMenu) super.ek5k(charSequence);
    }

    @Override // android.view.ContextMenu
    public ContextMenu setHeaderView(View view) {
        return (ContextMenu) super.yz(view);
    }

    /* JADX INFO: renamed from: x */
    public boolean m25329x() {
        C7027n c7027n = this.f87006ncyb;
        if (c7027n instanceof C7027n) {
            return c7027n.toq().isShowing();
        }
        return false;
    }

    @Override // android.view.ContextMenu
    public ContextMenu setHeaderIcon(int i2) {
        return (ContextMenu) super.hb(i2);
    }

    @Override // android.view.ContextMenu
    public ContextMenu setHeaderTitle(int i2) {
        return (ContextMenu) super.m25345m(i2);
    }
}
