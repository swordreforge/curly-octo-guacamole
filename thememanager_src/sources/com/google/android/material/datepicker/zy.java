package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.internal.C4044h;
import com.google.android.material.textfield.TextInputLayout;
import ij.C6095k;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: DateFormatTextWatcher.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class zy extends C4044h {

    /* JADX INFO: renamed from: p */
    private static final int f24379p = 1000;

    /* JADX INFO: renamed from: g */
    private final String f24380g;

    /* JADX INFO: renamed from: k */
    @lvui
    private final TextInputLayout f24381k;

    /* JADX INFO: renamed from: n */
    private final CalendarConstraints f24382n;

    /* JADX INFO: renamed from: q */
    private final DateFormat f24383q;

    /* JADX INFO: renamed from: s */
    private Runnable f24384s;

    /* JADX INFO: renamed from: y */
    private final Runnable f24385y;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.zy$k */
    /* JADX INFO: compiled from: DateFormatTextWatcher.java */
    class RunnableC4017k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f24386k;

        RunnableC4017k(String str) {
            this.f24386k = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout textInputLayout = zy.this.f24381k;
            DateFormat dateFormat = zy.this.f24383q;
            Context context = textInputLayout.getContext();
            textInputLayout.setError(context.getString(C6095k.qrj.f79806gbni) + "\n" + String.format(context.getString(C6095k.qrj.f79841py), this.f24386k) + "\n" + String.format(context.getString(C6095k.qrj.f79872zsr0), dateFormat.format(new Date(cdj.m14399i().getTimeInMillis()))));
            zy.this.mo14393n();
        }
    }

    /* JADX INFO: compiled from: DateFormatTextWatcher.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ long f24388k;

        toq(long j2) {
            this.f24388k = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            zy.this.f24381k.setError(String.format(zy.this.f24380g, C4013q.zy(this.f24388k)));
            zy.this.mo14393n();
        }
    }

    zy(String str, DateFormat dateFormat, @lvui TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f24383q = dateFormat;
        this.f24381k = textInputLayout;
        this.f24382n = calendarConstraints;
        this.f24380g = textInputLayout.getContext().getString(C6095k.qrj.f79845r8s8);
        this.f24385y = new RunnableC4017k(str);
    }

    /* JADX INFO: renamed from: q */
    private Runnable m14445q(long j2) {
        return new toq(j2);
    }

    public void f7l8(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }

    /* JADX INFO: renamed from: g */
    abstract void mo14392g(@dd Long l2);

    /* JADX INFO: renamed from: n */
    void mo14393n() {
    }

    @Override // com.google.android.material.internal.C4044h, android.text.TextWatcher
    public void onTextChanged(@lvui CharSequence charSequence, int i2, int i3, int i4) {
        this.f24381k.removeCallbacks(this.f24385y);
        this.f24381k.removeCallbacks(this.f24384s);
        this.f24381k.setError(null);
        mo14392g(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date date = this.f24383q.parse(charSequence.toString());
            this.f24381k.setError(null);
            long time = date.getTime();
            if (this.f24382n.getDateValidator().mo14365s(time) && this.f24382n.t8r(time)) {
                mo14392g(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableM14445q = m14445q(time);
            this.f24384s = runnableM14445q;
            f7l8(this.f24381k, runnableM14445q);
        } catch (ParseException unused) {
            f7l8(this.f24381k, this.f24385y);
        }
    }
}
