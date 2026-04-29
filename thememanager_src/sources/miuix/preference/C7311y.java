package miuix.preference;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.DialogInterfaceC0102q;
import androidx.preference.C1040y;
import com.android.thememanager.controller.online.InterfaceC1925p;
import miuix.appcompat.app.ki;
import zy.lvui;

/* JADX INFO: renamed from: miuix.preference.y */
/* JADX INFO: compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7311y extends C1040y {
    private C7306p bc;
    private InterfaceC7289g bu;

    /* JADX INFO: renamed from: miuix.preference.y$k */
    /* JADX INFO: compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
    class k implements InterfaceC7289g {
        k() {
        }

        @Override // miuix.preference.InterfaceC7289g
        /* JADX INFO: renamed from: k */
        public View mo26475k(Context context) {
            return C7311y.this.wt(context);
        }

        @Override // miuix.preference.InterfaceC7289g
        /* JADX INFO: renamed from: q */
        public boolean mo26476q() {
            return false;
        }

        @Override // miuix.preference.InterfaceC7289g
        public void toq(View view) {
            C7311y.this.el(view);
        }

        @Override // miuix.preference.InterfaceC7289g
        public void zy(ki.C6947k c6947k) {
            C7311y.this.kq2f(c6947k);
        }
    }

    public C7311y() {
        k kVar = new k();
        this.bu = kVar;
        this.bc = new C7306p(kVar, this);
    }

    public static C7311y btvn(String str) {
        C7311y c7311y = new C7311y();
        Bundle bundle = new Bundle(1);
        bundle.putString(InterfaceC1925p.qn, str);
        c7311y.setArguments(bundle);
        return c7311y;
    }

    @Override // androidx.preference.C1040y, androidx.preference.ld6
    protected final void imd(DialogInterfaceC0102q.k kVar) {
        throw new UnsupportedOperationException("using miuix builder instead");
    }

    protected void kq2f(ki.C6947k c6947k) {
        super.imd(new toq(getContext(), c6947k));
    }

    @Override // androidx.preference.ld6, androidx.fragment.app.zy
    @lvui
    public Dialog nnh(Bundle bundle) {
        return this.bc.m26489k(bundle);
    }
}
