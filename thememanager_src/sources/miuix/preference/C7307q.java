package miuix.preference;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.DialogInterfaceC0102q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import miuix.appcompat.app.ki;
import zy.lvui;

/* JADX INFO: renamed from: miuix.preference.q */
/* JADX INFO: compiled from: EditTextPreferenceDialogFragmentCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7307q extends androidx.preference.zy {
    private InterfaceC7289g ar;
    private C7306p k0;

    /* JADX INFO: renamed from: miuix.preference.q$k */
    /* JADX INFO: compiled from: EditTextPreferenceDialogFragmentCompat.java */
    class k implements InterfaceC7289g {
        k() {
        }

        @Override // miuix.preference.InterfaceC7289g
        /* JADX INFO: renamed from: k */
        public View mo26475k(Context context) {
            return C7307q.this.wt(context);
        }

        @Override // miuix.preference.InterfaceC7289g
        /* JADX INFO: renamed from: q */
        public boolean mo26476q() {
            return true;
        }

        @Override // miuix.preference.InterfaceC7289g
        public void toq(View view) {
            C7307q.this.el(view);
        }

        @Override // miuix.preference.InterfaceC7289g
        public void zy(ki.C6947k c6947k) {
            C7307q.this.cn02(c6947k);
        }
    }

    public C7307q() {
        k kVar = new k();
        this.ar = kVar;
        this.k0 = new C7306p(kVar, this);
    }

    public static C7307q mj(String str) {
        C7307q c7307q = new C7307q();
        Bundle bundle = new Bundle(1);
        bundle.putString(InterfaceC1925p.qn, str);
        c7307q.setArguments(bundle);
        return c7307q;
    }

    protected void cn02(ki.C6947k c6947k) {
        super.imd(new toq(getContext(), c6947k));
    }

    @Override // androidx.preference.ld6
    protected final void imd(DialogInterfaceC0102q.k kVar) {
        throw new UnsupportedOperationException("using miuix builder instead");
    }

    @Override // androidx.preference.ld6, androidx.fragment.app.zy
    @lvui
    public Dialog nnh(Bundle bundle) {
        return this.k0.m26489k(bundle);
    }
}
