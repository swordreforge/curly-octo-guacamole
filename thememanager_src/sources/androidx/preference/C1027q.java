package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.fn3e;
import androidx.room.AbstractC1141t;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: renamed from: androidx.preference.q */
/* JADX INFO: compiled from: ExpandButton.java */
/* JADX INFO: loaded from: classes.dex */
final class C1027q extends Preference {
    private long be;

    C1027q(@lvui Context context, List<Preference> list, long j2) {
        super(context);
        cv06();
        h7am(list);
        this.be = j2 + 1000000;
    }

    private void cv06() {
        zsr0(fn3e.C1013y.f5535k);
        wo(fn3e.C1009n.f5512k);
        kcsr(fn3e.C1012s.f51952toq);
        r8s8(AbstractC1141t.f52393qrj);
    }

    private void h7am(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence string = null;
        for (Preference preference : list) {
            CharSequence charSequenceLvui = preference.lvui();
            boolean z2 = preference instanceof PreferenceGroup;
            if (z2 && !TextUtils.isEmpty(charSequenceLvui)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.o1t())) {
                if (z2) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequenceLvui)) {
                string = string == null ? charSequenceLvui : x2().getString(fn3e.C1012s.f5530n, string, charSequenceLvui);
            }
        }
        z4(string);
    }

    @Override // androidx.preference.Preference
    long ki() {
        return this.be;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(@lvui C1016i c1016i) {
        super.mo4638o(c1016i);
        c1016i.o1t(false);
    }
}
