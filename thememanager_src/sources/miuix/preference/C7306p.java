package miuix.preference;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.preference.DialogPreference;
import miuix.appcompat.app.ki;

/* JADX INFO: renamed from: miuix.preference.p */
/* JADX INFO: compiled from: PreferenceDialogFragmentCompatDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
class C7306p {

    /* JADX INFO: renamed from: k */
    private InterfaceC7289g f41489k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private androidx.preference.ld6 f90000toq;

    public C7306p(InterfaceC7289g interfaceC7289g, androidx.preference.ld6 ld6Var) {
        this.f41489k = interfaceC7289g;
        this.f90000toq = ld6Var;
    }

    private void toq(Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }

    /* JADX INFO: renamed from: k */
    public Dialog m26489k(Bundle bundle) {
        Context context = this.f90000toq.getContext();
        DialogPreference dialogPreferenceYp31 = this.f90000toq.yp31();
        ki.C6947k c6947k = new ki.C6947k(context);
        toq toqVar = new toq(context, c6947k);
        toqVar.setTitle(dialogPreferenceYp31.mbx());
        toqVar.mo229g(dialogPreferenceYp31.cv06());
        toqVar.mo239z(dialogPreferenceYp31.yl(), this.f90000toq);
        toqVar.mo230h(dialogPreferenceYp31.jbh(), this.f90000toq);
        View viewMo26475k = this.f41489k.mo26475k(context);
        if (viewMo26475k != null) {
            this.f41489k.toq(viewMo26475k);
            toqVar.setView(viewMo26475k);
        } else {
            toqVar.x2(dialogPreferenceYp31.vep5());
        }
        this.f41489k.zy(c6947k);
        ki kiVarM25037g = c6947k.m25037g();
        if (this.f41489k.mo26476q()) {
            toq(kiVarM25037g);
        }
        return kiVarM25037g;
    }
}
