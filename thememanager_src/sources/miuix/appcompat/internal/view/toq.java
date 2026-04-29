package miuix.appcompat.internal.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import miuix.appcompat.internal.app.widget.zurt;
import miuix.appcompat.internal.view.menu.f7l8;
import miuix.view.InterfaceC7382k;

/* JADX INFO: compiled from: ActionModeImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq extends ActionMode implements f7l8.toq, InterfaceC7382k {

    /* JADX INFO: renamed from: h */
    public static final int f39587h = 1;

    /* JADX INFO: renamed from: p */
    public static final int f39588p = 0;

    /* JADX INFO: renamed from: g */
    private miuix.appcompat.internal.view.menu.f7l8 f39589g;

    /* JADX INFO: renamed from: k */
    protected Context f39590k;

    /* JADX INFO: renamed from: n */
    private ActionMode.Callback f39591n;

    /* JADX INFO: renamed from: q */
    protected WeakReference<zurt> f39592q;

    /* JADX INFO: renamed from: s */
    boolean f39593s = false;

    /* JADX INFO: renamed from: y */
    private InterfaceC7042k f39594y;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.toq$k */
    /* JADX INFO: compiled from: ActionModeImpl.java */
    public interface InterfaceC7042k {
        /* JADX INFO: renamed from: k */
        void mo25228k(ActionMode actionMode);
    }

    public toq(Context context, ActionMode.Callback callback) {
        this.f39590k = context;
        this.f39591n = callback;
        miuix.appcompat.internal.view.menu.f7l8 f7l8VarVyq = new miuix.appcompat.internal.view.menu.f7l8(context).vyq(1);
        this.f39589g = f7l8VarVyq;
        f7l8VarVyq.lrht(this);
    }

    @Override // android.view.ActionMode
    public void finish() {
        if (this.f39593s) {
            return;
        }
        this.f39593s = true;
        this.f39592q.get().ld6();
        InterfaceC7042k interfaceC7042k = this.f39594y;
        if (interfaceC7042k != null) {
            interfaceC7042k.mo25228k(this);
        }
        ActionMode.Callback callback = this.f39591n;
        if (callback != null) {
            callback.onDestroyActionMode(this);
            this.f39591n = null;
        }
    }

    public void fn3e(InterfaceC7042k interfaceC7042k) {
        this.f39594y = interfaceC7042k;
    }

    @Override // android.view.ActionMode, miuix.view.n7h
    public View getCustomView() {
        throw new UnsupportedOperationException("getCustomView not supported");
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return this.f39589g;
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return new MenuInflater(this.f39590k);
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        throw new UnsupportedOperationException("getSubtitle not supported");
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        throw new UnsupportedOperationException("getTitle not supported");
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8.toq
    /* JADX INFO: renamed from: h */
    public void mo25069h(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        if (this.f39591n == null) {
            return;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public boolean m25393i() {
        this.f39589g.m25335a();
        try {
            return this.f39591n.onCreateActionMode(this, this.f39589g);
        } finally {
            this.f39589g.a98o();
        }
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f39589g.m25335a();
        try {
            this.f39591n.onPrepareActionMode(this, this.f39589g);
        } finally {
            this.f39589g.a98o();
        }
    }

    @Override // miuix.view.InterfaceC7382k
    /* JADX INFO: renamed from: p */
    public void mo25168p(boolean z2, float f2) {
    }

    @Override // miuix.view.InterfaceC7382k
    /* JADX INFO: renamed from: q */
    public void mo25169q(boolean z2) {
        ActionMode.Callback callback;
        if (z2 || (callback = this.f39591n) == null) {
            return;
        }
        callback.onDestroyActionMode(this);
        this.f39591n = null;
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8.toq
    /* JADX INFO: renamed from: s */
    public boolean mo24868s(miuix.appcompat.internal.view.menu.f7l8 f7l8Var, MenuItem menuItem) {
        ActionMode.Callback callback = this.f39591n;
        return callback != null && callback.onActionItemClicked(this, menuItem);
    }

    @Override // android.view.ActionMode, miuix.view.n7h
    public void setCustomView(View view) {
        throw new UnsupportedOperationException("setCustomView not supported");
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        throw new UnsupportedOperationException("setSubTitle not supported");
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        throw new UnsupportedOperationException("setTitle not supported");
    }

    @Override // miuix.view.InterfaceC7382k
    public void x2(boolean z2) {
    }

    public void zurt(zurt zurtVar) {
        zurtVar.toq(this);
        this.f39592q = new WeakReference<>(zurtVar);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        throw new UnsupportedOperationException("setSubTitle not supported");
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        throw new UnsupportedOperationException("setTitle not supported");
    }
}
