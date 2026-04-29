package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.android.thememanager.controller.online.InterfaceC1925p;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.preference.n */
/* JADX INFO: compiled from: ListPreferenceDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DialogFragmentC1023n extends AbstractDialogFragmentC1026p {

    /* JADX INFO: renamed from: a */
    private static final String f5563a = "ListPreferenceDialogFragment.entryValues";

    /* JADX INFO: renamed from: b */
    private static final String f5564b = "ListPreferenceDialogFragment.entries";

    /* JADX INFO: renamed from: m */
    private static final String f5565m = "ListPreferenceDialogFragment.index";

    /* JADX INFO: renamed from: e */
    int f5566e;

    /* JADX INFO: renamed from: j */
    private CharSequence[] f5567j;

    /* JADX INFO: renamed from: o */
    private CharSequence[] f5568o;

    /* JADX INFO: renamed from: androidx.preference.n$k */
    /* JADX INFO: compiled from: ListPreferenceDialogFragment.java */
    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            DialogFragmentC1023n dialogFragmentC1023n = DialogFragmentC1023n.this;
            dialogFragmentC1023n.f5566e = i2;
            dialogFragmentC1023n.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Deprecated
    public DialogFragmentC1023n() {
    }

    @lvui
    @Deprecated
    /* JADX INFO: renamed from: s */
    public static DialogFragmentC1023n m4700s(String str) {
        DialogFragmentC1023n dialogFragmentC1023n = new DialogFragmentC1023n();
        Bundle bundle = new Bundle(1);
        bundle.putString(InterfaceC1925p.qn, str);
        dialogFragmentC1023n.setArguments(bundle);
        return dialogFragmentC1023n;
    }

    /* JADX INFO: renamed from: y */
    private ListPreference m4701y() {
        return (ListPreference) m4706k();
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p
    /* JADX INFO: renamed from: g */
    protected void mo4682g(@lvui AlertDialog.Builder builder) {
        super.mo4682g(builder);
        builder.setSingleChoiceItems(this.f5567j, this.f5566e, new k());
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p
    @Deprecated
    /* JADX INFO: renamed from: n */
    public void mo4683n(boolean z2) {
        int i2;
        ListPreference listPreferenceM4701y = m4701y();
        if (!z2 || (i2 = this.f5566e) < 0) {
            return;
        }
        String string = this.f5568o[i2].toString();
        if (listPreferenceM4701y.zy(string)) {
            listPreferenceM4701y.a5id(string);
        }
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5566e = bundle.getInt(f5565m, 0);
            this.f5567j = bundle.getCharSequenceArray(f5564b);
            this.f5568o = bundle.getCharSequenceArray(f5563a);
            return;
        }
        ListPreference listPreferenceM4701y = m4701y();
        if (listPreferenceM4701y.ngy() == null || listPreferenceM4701y.bap7() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f5566e = listPreferenceM4701y.pjz9(listPreferenceM4701y.h4b());
        this.f5567j = listPreferenceM4701y.ngy();
        this.f5568o = listPreferenceM4701y.bap7();
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f5565m, this.f5566e);
        bundle.putCharSequenceArray(f5564b, this.f5567j);
        bundle.putCharSequenceArray(f5563a, this.f5568o);
    }
}
