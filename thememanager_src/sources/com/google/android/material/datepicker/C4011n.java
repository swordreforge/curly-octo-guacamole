package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ij.C6095k;
import java.util.Calendar;
import java.util.Locale;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.datepicker.n */
/* JADX INFO: compiled from: DaysOfWeekAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
class C4011n extends BaseAdapter {

    /* JADX INFO: renamed from: g */
    private static final int f24349g = 4;

    /* JADX INFO: renamed from: y */
    private static final int f24350y = 4;

    /* JADX INFO: renamed from: k */
    @lvui
    private final Calendar f24351k;

    /* JADX INFO: renamed from: n */
    private final int f24352n;

    /* JADX INFO: renamed from: q */
    private final int f24353q;

    public C4011n() {
        Calendar calendarZurt = cdj.zurt();
        this.f24351k = calendarZurt;
        this.f24353q = calendarZurt.getMaximum(7);
        this.f24352n = calendarZurt.getFirstDayOfWeek();
    }

    private int toq(int i2) {
        int i3 = i2 + this.f24352n;
        int i4 = this.f24353q;
        return i3 > i4 ? i3 - i4 : i3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24353q;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    @dd
    public View getView(int i2, @dd View view, @lvui ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C6095k.ld6.f79341t8iq, viewGroup, false);
        }
        this.f24351k.set(7, toq(i2));
        textView.setText(this.f24351k.getDisplayName(7, f24350y, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C6095k.qrj.f79859was), this.f24351k.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    @Override // android.widget.Adapter
    @dd
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i2) {
        if (i2 >= this.f24353q) {
            return null;
        }
        return Integer.valueOf(toq(i2));
    }
}
