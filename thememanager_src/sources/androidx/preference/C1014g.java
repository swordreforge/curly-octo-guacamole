package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.DialogInterfaceC0102q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.preference.g */
/* JADX INFO: compiled from: ListPreferenceDialogFragmentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C1014g extends ld6 {
    private static final String aj = "ListPreferenceDialogFragment.entries";
    private static final String be = "ListPreferenceDialogFragment.index";
    private static final String bs = "ListPreferenceDialogFragment.entryValues";
    int ad;
    private CharSequence[] am;
    private CharSequence[] ay;

    /* JADX INFO: renamed from: androidx.preference.g$k */
    /* JADX INFO: compiled from: ListPreferenceDialogFragmentCompat.java */
    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            C1014g c1014g = C1014g.this;
            c1014g.ad = i2;
            c1014g.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @lvui
    public static C1014g ob(String str) {
        C1014g c1014g = new C1014g();
        Bundle bundle = new Bundle(1);
        bundle.putString(InterfaceC1925p.qn, str);
        c1014g.setArguments(bundle);
        return c1014g;
    }

    private ListPreference tww7() {
        return (ListPreference) yp31();
    }

    @Override // androidx.preference.ld6
    public void g0ad(boolean z2) {
        int i2;
        if (!z2 || (i2 = this.ad) < 0) {
            return;
        }
        String string = this.ay[i2].toString();
        ListPreference listPreferenceTww7 = tww7();
        if (listPreferenceTww7.zy(string)) {
            listPreferenceTww7.a5id(string);
        }
    }

    @Override // androidx.preference.ld6
    protected void imd(@lvui DialogInterfaceC0102q.k kVar) {
        super.imd(kVar);
        kVar.a9(this.am, this.ad, new k());
        kVar.mo239z(null, null);
    }

    @Override // androidx.preference.ld6, androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.ad = bundle.getInt(be, 0);
            this.am = bundle.getCharSequenceArray(aj);
            this.ay = bundle.getCharSequenceArray(bs);
            return;
        }
        ListPreference listPreferenceTww7 = tww7();
        if (listPreferenceTww7.ngy() == null || listPreferenceTww7.bap7() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.ad = listPreferenceTww7.pjz9(listPreferenceTww7.h4b());
        this.am = listPreferenceTww7.ngy();
        this.ay = listPreferenceTww7.bap7();
    }

    @Override // androidx.preference.ld6, androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(be, this.ad);
        bundle.putCharSequenceArray(aj, this.am);
        bundle.putCharSequenceArray(bs, this.ay);
    }
}
