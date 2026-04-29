package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.toq;
import androidx.core.view.kja0;
import p030n.C7397k;
import zy.InterfaceC7843t;
import zy.dd;
import zy.gvn7;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.app.y */
/* JADX INFO: compiled from: AppCompatDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0107y extends Dialog implements InterfaceC0094g {

    /* JADX INFO: renamed from: k */
    private f7l8 f335k;

    /* JADX INFO: renamed from: q */
    private final kja0.InterfaceC0703k f336q;

    /* JADX INFO: renamed from: androidx.appcompat.app.y$k */
    /* JADX INFO: compiled from: AppCompatDialog.java */
    class k implements kja0.InterfaceC0703k {
        k() {
        }

        @Override // androidx.core.view.kja0.InterfaceC0703k
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return DialogC0107y.this.m254q(keyEvent);
        }
    }

    public DialogC0107y(Context context) {
        this(context, 0);
    }

    private static int zy(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C7397k.toq.f93002z4, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m252k().mo120q(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m252k().wvg();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.kja0.m3360n(this.f336q, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @dd
    public <T extends View> T findViewById(@InterfaceC7843t int i2) {
        return (T) m252k().n7h(i2);
    }

    @Override // android.app.Dialog
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        m252k().zurt();
    }

    @Override // androidx.appcompat.app.InterfaceC0094g
    public void jp0y(androidx.appcompat.view.toq toqVar) {
    }

    /* JADX INFO: renamed from: k */
    public f7l8 m252k() {
        if (this.f335k == null) {
            this.f335k = f7l8.m193p(this, this);
        }
        return this.f335k;
    }

    @Override // androidx.appcompat.app.InterfaceC0094g
    @dd
    public androidx.appcompat.view.toq lvui(toq.InterfaceC0138k interfaceC0138k) {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m253n(int i2) {
        return m252k().d3(i2);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        m252k().fn3e();
        super.onCreate(bundle);
        m252k().o1t(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m252k().fti();
    }

    /* JADX INFO: renamed from: q */
    boolean m254q(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void setContentView(@gvn7 int i2) {
        m252k().eqxt(i2);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m252k().n5r1(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC0094g
    /* JADX INFO: renamed from: t */
    public void mo196t(androidx.appcompat.view.toq toqVar) {
    }

    public AbstractC0096k toq() {
        return m252k().t8r();
    }

    public DialogC0107y(Context context, int i2) {
        super(context, zy(context, i2));
        this.f336q = new k();
        f7l8 f7l8VarM252k = m252k();
        f7l8VarM252k.mo118l(zy(context, i2));
        f7l8VarM252k.o1t(null);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m252k().d2ok(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m252k().lvui(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        m252k().n5r1(getContext().getString(i2));
    }

    protected DialogC0107y(Context context, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z2, onCancelListener);
        this.f336q = new k();
    }
}
