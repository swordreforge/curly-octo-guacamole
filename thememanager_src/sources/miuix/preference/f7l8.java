package miuix.preference;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.DialogInterfaceC0102q;
import androidx.preference.C1014g;
import com.android.thememanager.controller.online.InterfaceC1925p;
import miuix.appcompat.app.ki;
import zy.lvui;

/* JADX INFO: compiled from: ListPreferenceDialogFragmentCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 extends C1014g {
    private InterfaceC7289g ar;
    private C7306p k0;

    /* JADX INFO: renamed from: miuix.preference.f7l8$k */
    /* JADX INFO: compiled from: ListPreferenceDialogFragmentCompat.java */
    class C7288k implements InterfaceC7289g {
        C7288k() {
        }

        @Override // miuix.preference.InterfaceC7289g
        /* JADX INFO: renamed from: k */
        public View mo26475k(Context context) {
            return f7l8.this.wt(context);
        }

        @Override // miuix.preference.InterfaceC7289g
        /* JADX INFO: renamed from: q */
        public boolean mo26476q() {
            return false;
        }

        @Override // miuix.preference.InterfaceC7289g
        public void toq(View view) {
            f7l8.this.el(view);
        }

        @Override // miuix.preference.InterfaceC7289g
        public void zy(ki.C6947k c6947k) {
            f7l8.this.kq2f(c6947k);
        }
    }

    public f7l8() {
        C7288k c7288k = new C7288k();
        this.ar = c7288k;
        this.k0 = new C7306p(c7288k, this);
    }

    public static f7l8 btvn(String str) {
        f7l8 f7l8Var = new f7l8();
        Bundle bundle = new Bundle(1);
        bundle.putString(InterfaceC1925p.qn, str);
        f7l8Var.setArguments(bundle);
        return f7l8Var;
    }

    @Override // androidx.preference.C1014g, androidx.preference.ld6
    protected final void imd(DialogInterfaceC0102q.k kVar) {
        throw new UnsupportedOperationException("using miuix builder instead");
    }

    protected void kq2f(ki.C6947k c6947k) {
        super.imd(new toq(getContext(), c6947k));
    }

    @Override // androidx.preference.ld6, androidx.fragment.app.zy
    @lvui
    public Dialog nnh(Bundle bundle) {
        return this.k0.m26489k(bundle);
    }
}
