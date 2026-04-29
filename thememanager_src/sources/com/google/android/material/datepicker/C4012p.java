package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.datepicker.p */
/* JADX INFO: compiled from: MaterialTextInputPicker.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class C4012p<S> extends n7h<S> {

    /* JADX INFO: renamed from: p */
    private static final String f24355p = "CALENDAR_CONSTRAINTS_KEY";

    /* JADX INFO: renamed from: s */
    private static final String f24356s = "DATE_SELECTOR_KEY";

    /* JADX INFO: renamed from: y */
    private static final String f24357y = "THEME_RES_ID_KEY";

    /* JADX INFO: renamed from: g */
    @dd
    private CalendarConstraints f24358g;

    /* JADX INFO: renamed from: n */
    @dd
    private DateSelector<S> f24359n;

    /* JADX INFO: renamed from: q */
    @hb
    private int f24360q;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.p$k */
    /* JADX INFO: compiled from: MaterialTextInputPicker.java */
    class k extends qrj<S> {
        k() {
        }

        @Override // com.google.android.material.datepicker.qrj
        /* JADX INFO: renamed from: k */
        public void mo14415k() {
            Iterator<qrj<S>> it = C4012p.this.f24354k.iterator();
            while (it.hasNext()) {
                it.next().mo14415k();
            }
        }

        @Override // com.google.android.material.datepicker.qrj
        public void toq(S s2) {
            Iterator<qrj<S>> it = C4012p.this.f24354k.iterator();
            while (it.hasNext()) {
                it.next().toq(s2);
            }
        }
    }

    @lvui
    /* JADX INFO: renamed from: w */
    static <T> C4012p<T> m14434w(DateSelector<T> dateSelector, @hb int i2, @lvui CalendarConstraints calendarConstraints) {
        C4012p<T> c4012p = new C4012p<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f24357y, i2);
        bundle.putParcelable(f24356s, dateSelector);
        bundle.putParcelable(f24355p, calendarConstraints);
        c4012p.setArguments(bundle);
        return c4012p;
    }

    @Override // com.google.android.material.datepicker.n7h
    @lvui
    public DateSelector<S> ix() {
        DateSelector<S> dateSelector = this.f24359n;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f24360q = bundle.getInt(f24357y);
        this.f24359n = (DateSelector) bundle.getParcelable(f24356s);
        this.f24358g = (CalendarConstraints) bundle.getParcelable(f24355p);
    }

    @Override // androidx.fragment.app.Fragment
    @lvui
    public View onCreateView(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle) {
        return this.f24359n.cdj(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f24360q)), viewGroup, bundle, this.f24358g, new k());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f24357y, this.f24360q);
        bundle.putParcelable(f24356s, this.f24359n);
        bundle.putParcelable(f24355p, this.f24358g);
    }
}
