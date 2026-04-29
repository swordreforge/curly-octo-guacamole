package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C4006g;
import com.google.android.material.timepicker.TimeModel;
import ij.C6095k;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import zy.lvui;

/* JADX INFO: compiled from: YearGridAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
class ki extends RecyclerView.AbstractC1060y<toq> {

    /* JADX INFO: renamed from: k */
    private final C4006g<?> f24338k;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.ki$k */
    /* JADX INFO: compiled from: YearGridAdapter.java */
    class ViewOnClickListenerC4009k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f24339k;

        ViewOnClickListenerC4009k(int i2) {
            this.f24339k = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ki.this.f24338k.r6ty(ki.this.f24338k.z4t().f7l8(Month.zy(this.f24339k, ki.this.f24338k.ec().f24273k)));
            ki.this.f24338k.yp31(C4006g.ld6.DAY);
        }
    }

    /* JADX INFO: compiled from: YearGridAdapter.java */
    public static class toq extends RecyclerView.fti {

        /* JADX INFO: renamed from: k */
        final TextView f24341k;

        toq(TextView textView) {
            super(textView);
            this.f24341k = textView;
        }
    }

    ki(C4006g<?> c4006g) {
        this.f24338k = c4006g;
    }

    @lvui
    private View.OnClickListener ki(int i2) {
        return new ViewOnClickListenerC4009k(i2);
    }

    int fn3e(int i2) {
        return i2 - this.f24338k.z4t().x2().f24275q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui toq toqVar, int i2) {
        int iNi7 = ni7(i2);
        String string = toqVar.f24341k.getContext().getString(C6095k.qrj.f79826ltg8);
        toqVar.f24341k.setText(String.format(Locale.getDefault(), TimeModel.f25351p, Integer.valueOf(iNi7)));
        toqVar.f24341k.setContentDescription(String.format(string, Integer.valueOf(iNi7)));
        com.google.android.material.datepicker.toq toqVarBih = this.f24338k.bih();
        Calendar calendarM14399i = cdj.m14399i();
        C4008k c4008k = calendarM14399i.get(1) == iNi7 ? toqVarBih.f24366g : toqVarBih.f24369q;
        Iterator<Long> it = this.f24338k.ix().getSelectedDays().iterator();
        while (it.hasNext()) {
            calendarM14399i.setTimeInMillis(it.next().longValue());
            if (calendarM14399i.get(1) == iNi7) {
                c4008k = toqVarBih.f24368n;
            }
        }
        c4008k.m14422g(toqVar.f24341k);
        toqVar.f24341k.setOnClickListener(ki(iNi7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f24338k.z4t().m14361h();
    }

    int ni7(int i2) {
        return this.f24338k.z4t().x2().f24275q + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public toq onCreateViewHolder(@lvui ViewGroup viewGroup, int i2) {
        return new toq((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C6095k.ld6.f35616v, viewGroup, false));
    }
}
