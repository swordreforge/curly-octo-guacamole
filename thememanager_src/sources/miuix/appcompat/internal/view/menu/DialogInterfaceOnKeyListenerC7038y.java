package miuix.appcompat.internal.view.menu;

import android.R;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import gb.toq;
import miuix.appcompat.app.ki;
import miuix.appcompat.internal.view.menu.ld6;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.y */
/* JADX INFO: compiled from: MenuDialogHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class DialogInterfaceOnKeyListenerC7038y implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, ld6.InterfaceC7032k {

    /* JADX INFO: renamed from: g */
    private ld6.InterfaceC7032k f39571g;

    /* JADX INFO: renamed from: k */
    private f7l8 f39572k;

    /* JADX INFO: renamed from: n */
    C7030g f39573n;

    /* JADX INFO: renamed from: q */
    private ki f39574q;

    public DialogInterfaceOnKeyListenerC7038y(f7l8 f7l8Var) {
        this.f39572k = f7l8Var;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6.InterfaceC7032k
    public void f7l8(f7l8 f7l8Var, boolean z2) {
        if (z2 || f7l8Var == this.f39572k) {
            m25377k();
        }
        ld6.InterfaceC7032k interfaceC7032k = this.f39571g;
        if (interfaceC7032k != null) {
            interfaceC7032k.f7l8(f7l8Var, z2);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m25377k() {
        ki kiVar = this.f39574q;
        if (kiVar != null) {
            kiVar.dismiss();
            this.f39574q = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f39572k.m25348r((MenuItemC7036s) this.f39573n.m25355y().getItem(i2), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f39573n.f7l8(this.f39572k, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                ki kiVar = this.f39574q;
                if (kiVar == null) {
                    return false;
                }
                Window window = kiVar.getWindow();
                if (window != null && (decorView2 = window.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                ki kiVar2 = this.f39574q;
                if (kiVar2 == null) {
                    return false;
                }
                Window window2 = kiVar2.getWindow();
                if (window2 != null && (decorView = window2.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                    this.f39572k.m25340g(true);
                    dialogInterface.dismiss();
                    return true;
                }
            }
        }
        return this.f39572k.performShortcut(i2, keyEvent, 0);
    }

    public void toq(ld6.InterfaceC7032k interfaceC7032k) {
        this.f39571g = interfaceC7032k;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6.InterfaceC7032k
    /* JADX INFO: renamed from: y */
    public boolean mo25076y(f7l8 f7l8Var) {
        ld6.InterfaceC7032k interfaceC7032k = this.f39571g;
        return interfaceC7032k != null && interfaceC7032k.mo25076y(f7l8Var);
    }

    public void zy(IBinder iBinder) {
        f7l8 f7l8Var = this.f39572k;
        ki.C6947k c6947k = new ki.C6947k(f7l8Var.fu4());
        C7030g c7030g = new C7030g(f7l8Var.fu4(), toq.qrj.f76714ikck);
        this.f39573n = c7030g;
        c7030g.ld6(this);
        this.f39572k.zy(this.f39573n);
        c6947k.m25049y(this.f39573n.m25355y(), this);
        View viewM25349t = f7l8Var.m25349t();
        if (viewM25349t != null) {
            c6947k.n7h(viewM25349t);
        } else {
            c6947k.t8r(f7l8Var.o1t()).uv6(f7l8Var.wvg());
        }
        c6947k.mcp(R.string.cancel, null);
        c6947k.d2ok(this);
        ki kiVarM25037g = c6947k.m25037g();
        this.f39574q = kiVarM25037g;
        kiVarM25037g.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f39574q.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f39574q.show();
    }
}
