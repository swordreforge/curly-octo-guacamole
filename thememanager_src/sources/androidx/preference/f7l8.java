package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.android.thememanager.controller.online.InterfaceC1925p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import zy.lvui;

/* JADX INFO: compiled from: MultiSelectListPreferenceDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class f7l8 extends AbstractDialogFragmentC1026p {

    /* JADX INFO: renamed from: a */
    private static final String f5451a = "MultiSelectListPreferenceDialogFragment.changed";

    /* JADX INFO: renamed from: b */
    private static final String f5452b = "MultiSelectListPreferenceDialogFragment.values";

    /* JADX INFO: renamed from: u */
    private static final String f5453u = "MultiSelectListPreferenceDialogFragment.entryValues";

    /* JADX INFO: renamed from: x */
    private static final String f5454x = "MultiSelectListPreferenceDialogFragment.entries";

    /* JADX INFO: renamed from: e */
    Set<String> f5455e = new HashSet();

    /* JADX INFO: renamed from: j */
    boolean f5456j;

    /* JADX INFO: renamed from: m */
    CharSequence[] f5457m;

    /* JADX INFO: renamed from: o */
    CharSequence[] f5458o;

    /* JADX INFO: renamed from: androidx.preference.f7l8$k */
    /* JADX INFO: compiled from: MultiSelectListPreferenceDialogFragment.java */
    class DialogInterfaceOnMultiChoiceClickListenerC1006k implements DialogInterface.OnMultiChoiceClickListener {
        DialogInterfaceOnMultiChoiceClickListenerC1006k() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i2, boolean z2) {
            if (z2) {
                f7l8 f7l8Var = f7l8.this;
                f7l8Var.f5456j = f7l8Var.f5455e.add(f7l8Var.f5457m[i2].toString()) | f7l8Var.f5456j;
            } else {
                f7l8 f7l8Var2 = f7l8.this;
                f7l8Var2.f5456j = f7l8Var2.f5455e.remove(f7l8Var2.f5457m[i2].toString()) | f7l8Var2.f5456j;
            }
        }
    }

    @Deprecated
    public f7l8() {
    }

    @lvui
    @Deprecated
    /* JADX INFO: renamed from: s */
    public static f7l8 m4680s(String str) {
        f7l8 f7l8Var = new f7l8();
        Bundle bundle = new Bundle(1);
        bundle.putString(InterfaceC1925p.qn, str);
        f7l8Var.setArguments(bundle);
        return f7l8Var;
    }

    /* JADX INFO: renamed from: y */
    private MultiSelectListPreference m4681y() {
        return (MultiSelectListPreference) m4706k();
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p
    /* JADX INFO: renamed from: g */
    protected void mo4682g(@lvui AlertDialog.Builder builder) {
        super.mo4682g(builder);
        int length = this.f5457m.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.f5455e.contains(this.f5457m[i2].toString());
        }
        builder.setMultiChoiceItems(this.f5458o, zArr, new DialogInterfaceOnMultiChoiceClickListenerC1006k());
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p
    @Deprecated
    /* JADX INFO: renamed from: n */
    public void mo4683n(boolean z2) {
        MultiSelectListPreference multiSelectListPreferenceM4681y = m4681y();
        if (z2 && this.f5456j) {
            Set<String> set = this.f5455e;
            if (multiSelectListPreferenceM4681y.zy(set)) {
                multiSelectListPreferenceM4681y.vy(set);
            }
        }
        this.f5456j = false;
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5455e.clear();
            this.f5455e.addAll(bundle.getStringArrayList(f5452b));
            this.f5456j = bundle.getBoolean(f5451a, false);
            this.f5458o = bundle.getCharSequenceArray(f5454x);
            this.f5457m = bundle.getCharSequenceArray(f5453u);
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceM4681y = m4681y();
        if (multiSelectListPreferenceM4681y.ngy() == null || multiSelectListPreferenceM4681y.lh() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f5455e.clear();
        this.f5455e.addAll(multiSelectListPreferenceM4681y.h4b());
        this.f5456j = false;
        this.f5458o = multiSelectListPreferenceM4681y.ngy();
        this.f5457m = multiSelectListPreferenceM4681y.lh();
    }

    @Override // androidx.preference.AbstractDialogFragmentC1026p, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(f5452b, new ArrayList<>(this.f5455e));
        bundle.putBoolean(f5451a, this.f5456j);
        bundle.putCharSequenceArray(f5454x, this.f5458o);
        bundle.putCharSequenceArray(f5453u, this.f5457m);
    }
}
