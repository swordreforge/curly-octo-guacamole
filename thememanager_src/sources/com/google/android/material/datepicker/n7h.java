package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PickerFragment.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class n7h<S> extends Fragment {

    /* JADX INFO: renamed from: k */
    protected final LinkedHashSet<qrj<S>> f24354k = new LinkedHashSet<>();

    n7h() {
    }

    void ew() {
        this.f24354k.clear();
    }

    abstract DateSelector<S> ix();

    boolean kx3(qrj<S> qrjVar) {
        return this.f24354k.remove(qrjVar);
    }

    boolean r25n(qrj<S> qrjVar) {
        return this.f24354k.add(qrjVar);
    }
}
