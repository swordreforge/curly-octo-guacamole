package miuix.appcompat.internal.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.View;
import miuix.appcompat.internal.app.widget.ActionBarContextView;
import miuix.view.InterfaceC7382k;
import miuix.view.InterfaceC7387s;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.q */
/* JADX INFO: compiled from: EditActionModeImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7041q extends toq implements InterfaceC7387s {
    public C7041q(Context context, ActionMode.Callback callback) {
        super(context, callback);
    }

    @Override // miuix.view.InterfaceC7387s
    public void cdj(int i2, CharSequence charSequence, int i3) {
        ((ActionBarContextView) this.f39592q.get()).setButton(i2, charSequence, i3);
    }

    @Override // miuix.appcompat.internal.view.toq, android.view.ActionMode
    public CharSequence getTitle() {
        return ((ActionBarContextView) this.f39592q.get()).getTitle();
    }

    @Override // miuix.view.InterfaceC7387s
    /* JADX INFO: renamed from: k */
    public void mo25391k(InterfaceC7382k interfaceC7382k) {
        this.f39592q.get().mo25121k(interfaceC7382k);
    }

    @Override // miuix.view.InterfaceC7387s
    public void ki(int i2, int i3) {
        n7h(i2, this.f39590k.getResources().getString(i3));
    }

    @Override // miuix.view.InterfaceC7387s
    public void kja0(int i2, int i3, int i4) {
        cdj(i2, this.f39590k.getResources().getString(i3), i4);
    }

    @Override // miuix.view.InterfaceC7387s
    /* JADX INFO: renamed from: n */
    public void mo25392n(int i2, CharSequence charSequence, CharSequence charSequence2, int i3) {
        ((ActionBarContextView) this.f39592q.get()).setButton(i2, charSequence, charSequence2, i3);
    }

    @Override // miuix.view.InterfaceC7387s
    public void n7h(int i2, CharSequence charSequence) {
        ((ActionBarContextView) this.f39592q.get()).setButton(i2, charSequence);
    }

    @Override // miuix.appcompat.internal.view.toq, android.view.ActionMode, miuix.view.n7h
    public void setCustomView(View view) {
    }

    @Override // miuix.appcompat.internal.view.toq, android.view.ActionMode
    public void setSubtitle(int i2) {
    }

    @Override // miuix.appcompat.internal.view.toq, android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // miuix.appcompat.internal.view.toq, android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        ((ActionBarContextView) this.f39592q.get()).setTitle(charSequence);
    }

    @Override // miuix.view.InterfaceC7387s
    public void toq(InterfaceC7382k interfaceC7382k) {
        this.f39592q.get().toq(interfaceC7382k);
    }

    @Override // miuix.appcompat.internal.view.toq, android.view.ActionMode
    public void setTitle(int i2) {
        setTitle(this.f39590k.getResources().getString(i2));
    }
}
