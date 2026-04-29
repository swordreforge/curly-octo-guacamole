package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.DialogInterfaceC0102q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.preference.y */
/* JADX INFO: compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C1040y extends ld6 {
    private static final String aj = "MultiSelectListPreferenceDialogFragmentCompat.values";
    private static final String ar = "MultiSelectListPreferenceDialogFragmentCompat.entryValues";
    private static final String bs = "MultiSelectListPreferenceDialogFragmentCompat.changed";
    private static final String k0 = "MultiSelectListPreferenceDialogFragmentCompat.entries";
    Set<String> ad = new HashSet();
    boolean am;
    CharSequence[] ay;
    CharSequence[] be;

    /* JADX INFO: renamed from: androidx.preference.y$k */
    /* JADX INFO: compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
    class k implements DialogInterface.OnMultiChoiceClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i2, boolean z2) {
            if (z2) {
                C1040y c1040y = C1040y.this;
                c1040y.am = c1040y.ad.add(c1040y.be[i2].toString()) | c1040y.am;
            } else {
                C1040y c1040y2 = C1040y.this;
                c1040y2.am = c1040y2.ad.remove(c1040y2.be[i2].toString()) | c1040y2.am;
            }
        }
    }

    @lvui
    public static C1040y ob(String str) {
        C1040y c1040y = new C1040y();
        Bundle bundle = new Bundle(1);
        bundle.putString(InterfaceC1925p.qn, str);
        c1040y.setArguments(bundle);
        return c1040y;
    }

    private MultiSelectListPreference tww7() {
        return (MultiSelectListPreference) yp31();
    }

    @Override // androidx.preference.ld6
    public void g0ad(boolean z2) {
        if (z2 && this.am) {
            MultiSelectListPreference multiSelectListPreferenceTww7 = tww7();
            if (multiSelectListPreferenceTww7.zy(this.ad)) {
                multiSelectListPreferenceTww7.vy(this.ad);
            }
        }
        this.am = false;
    }

    @Override // androidx.preference.ld6
    protected void imd(@lvui DialogInterfaceC0102q.k kVar) {
        super.imd(kVar);
        int length = this.be.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.ad.contains(this.be[i2].toString());
        }
        kVar.kja0(this.ay, zArr, new k());
    }

    @Override // androidx.preference.ld6, androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.ad.clear();
            this.ad.addAll(bundle.getStringArrayList(aj));
            this.am = bundle.getBoolean(bs, false);
            this.ay = bundle.getCharSequenceArray(k0);
            this.be = bundle.getCharSequenceArray(ar);
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceTww7 = tww7();
        if (multiSelectListPreferenceTww7.ngy() == null || multiSelectListPreferenceTww7.lh() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.ad.clear();
        this.ad.addAll(multiSelectListPreferenceTww7.h4b());
        this.am = false;
        this.ay = multiSelectListPreferenceTww7.ngy();
        this.be = multiSelectListPreferenceTww7.lh();
    }

    @Override // androidx.preference.ld6, androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(aj, new ArrayList<>(this.ad));
        bundle.putBoolean(bs, this.am);
        bundle.putCharSequenceArray(k0, this.ay);
        bundle.putCharSequenceArray(ar, this.be);
    }
}
