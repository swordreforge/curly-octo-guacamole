package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0102q;
import androidx.appcompat.view.menu.n7h;
import p030n.C7397k;
import zy.lvui;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.y */
/* JADX INFO: compiled from: MenuDialogHelper.java */
/* JADX INFO: loaded from: classes.dex */
class DialogInterfaceOnKeyListenerC0134y implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n7h.InterfaceC0129k {

    /* JADX INFO: renamed from: g */
    private n7h.InterfaceC0129k f577g;

    /* JADX INFO: renamed from: k */
    private f7l8 f578k;

    /* JADX INFO: renamed from: n */
    C0128n f579n;

    /* JADX INFO: renamed from: q */
    private DialogInterfaceC0102q f580q;

    public DialogInterfaceOnKeyListenerC0134y(f7l8 f7l8Var) {
        this.f578k = f7l8Var;
    }

    @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
    public void f7l8(@lvui f7l8 f7l8Var, boolean z2) {
        if (z2 || f7l8Var == this.f578k) {
            m391k();
        }
        n7h.InterfaceC0129k interfaceC0129k = this.f577g;
        if (interfaceC0129k != null) {
            interfaceC0129k.f7l8(f7l8Var, z2);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m391k() {
        DialogInterfaceC0102q dialogInterfaceC0102q = this.f580q;
        if (dialogInterfaceC0102q != null) {
            dialogInterfaceC0102q.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f578k.dd((C0130p) this.f579n.m365g().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f579n.f7l8(this.f578k, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f580q.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f580q.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f578k.m328g(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f578k.performShortcut(i2, keyEvent, 0);
    }

    public void toq(n7h.InterfaceC0129k interfaceC0129k) {
        this.f577g = interfaceC0129k;
    }

    @Override // androidx.appcompat.view.menu.n7h.InterfaceC0129k
    /* JADX INFO: renamed from: y */
    public boolean mo143y(@lvui f7l8 f7l8Var) {
        n7h.InterfaceC0129k interfaceC0129k = this.f577g;
        if (interfaceC0129k != null) {
            return interfaceC0129k.mo143y(f7l8Var);
        }
        return false;
    }

    public void zy(IBinder iBinder) {
        f7l8 f7l8Var = this.f578k;
        DialogInterfaceC0102q.k kVar = new DialogInterfaceC0102q.k(f7l8Var.fu4());
        C0128n c0128n = new C0128n(kVar.getContext(), C7397k.p.f92527cdj);
        this.f579n = c0128n;
        c0128n.mo356s(this);
        this.f578k.toq(this.f579n);
        kVar.mo232k(this.f579n.m365g(), this);
        View viewM338t = f7l8Var.m338t();
        if (viewM338t != null) {
            kVar.mo235q(viewM338t);
        } else {
            kVar.mo229g(f7l8Var.o1t()).setTitle(f7l8Var.wvg());
        }
        kVar.fu4(this);
        DialogInterfaceC0102q dialogInterfaceC0102qCreate = kVar.create();
        this.f580q = dialogInterfaceC0102qCreate;
        dialogInterfaceC0102qCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f580q.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f580q.show();
    }
}
