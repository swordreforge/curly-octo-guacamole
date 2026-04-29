package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.transition.l */
/* JADX INFO: compiled from: TransitionValues.java */
/* JADX INFO: loaded from: classes.dex */
public class C1225l {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public View f53502toq;

    /* JADX INFO: renamed from: k */
    public final Map<String, Object> f6686k = new HashMap();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final ArrayList<oc> f53503zy = new ArrayList<>();

    @Deprecated
    public C1225l() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1225l)) {
            return false;
        }
        C1225l c1225l = (C1225l) obj;
        return this.f53502toq == c1225l.f53502toq && this.f6686k.equals(c1225l.f6686k);
    }

    public int hashCode() {
        return (this.f53502toq.hashCode() * 31) + this.f6686k.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f53502toq + "\n") + "    values:";
        for (String str2 : this.f6686k.keySet()) {
            str = str + "    " + str2 + ": " + this.f6686k.get(str2) + "\n";
        }
        return str;
    }

    public C1225l(@zy.lvui View view) {
        this.f53502toq = view;
    }
}
