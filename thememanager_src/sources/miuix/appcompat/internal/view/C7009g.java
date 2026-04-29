package miuix.appcompat.internal.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.View;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import miuix.appcompat.internal.app.widget.SearchActionModeView;
import miuix.appcompat.internal.app.widget.zurt;
import miuix.view.InterfaceC7382k;
import miuix.view.n7h;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.g */
/* JADX INFO: compiled from: SearchActionModeImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7009g extends toq implements n7h {
    public C7009g(Context context, ActionMode.Callback callback) {
        super(context, callback);
    }

    @Override // miuix.view.n7h
    public void f7l8(View view) {
        ((SearchActionModeView) this.f39592q.get()).setAnimateView(view);
    }

    @Override // miuix.view.n7h
    /* JADX INFO: renamed from: g */
    public void mo25253g(boolean z2) {
        ((SearchActionModeView) this.f39592q.get()).setAnchorApplyExtraPaddingByUser(z2);
    }

    @Override // miuix.appcompat.internal.view.toq, android.view.ActionMode, miuix.view.n7h
    public View getCustomView() {
        return ((SearchActionModeView) this.f39592q.get()).getCustomView();
    }

    @Override // miuix.view.n7h
    /* JADX INFO: renamed from: k */
    public void mo25254k(InterfaceC7382k interfaceC7382k) {
        this.f39592q.get().mo25121k(interfaceC7382k);
    }

    @Override // miuix.view.n7h
    public void ld6(View view) {
        ((SearchActionModeView) this.f39592q.get()).setAnchorView(view);
    }

    public void ni7(Rect rect) {
        WeakReference<zurt> weakReference = this.f39592q;
        SearchActionModeView searchActionModeView = weakReference != null ? (SearchActionModeView) weakReference.get() : null;
        if (searchActionModeView != null) {
            searchActionModeView.d2ok(rect);
        }
    }

    @Override // miuix.view.n7h
    public EditText qrj() {
        return ((SearchActionModeView) this.f39592q.get()).getSearchInput();
    }

    @Override // miuix.appcompat.internal.view.toq, android.view.ActionMode, miuix.view.n7h
    public void setCustomView(View view) {
        ((SearchActionModeView) this.f39592q.get()).setCustomView(view);
    }

    @Override // miuix.view.n7h
    public void t8r(View view) {
        ((SearchActionModeView) this.f39592q.get()).setResultView(view);
    }

    @Override // miuix.view.n7h
    public void toq(InterfaceC7382k interfaceC7382k) {
        this.f39592q.get().toq(interfaceC7382k);
    }

    @Override // miuix.view.n7h
    /* JADX INFO: renamed from: y */
    public void mo25255y(n7h.InterfaceC7384k interfaceC7384k) {
        ((SearchActionModeView) this.f39592q.get()).setAnimatedViewListener(interfaceC7384k);
    }

    @Override // miuix.view.n7h
    public void zy() {
        ((SearchActionModeView) this.f39592q.get()).lvui();
    }
}
