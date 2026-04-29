package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.C0683f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C4006g;
import ij.C6095k;
import zy.lvui;

/* JADX INFO: compiled from: MonthsPagerAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
class x2 extends RecyclerView.AbstractC1060y<toq> {

    /* JADX INFO: renamed from: g */
    private final int f24371g;

    /* JADX INFO: renamed from: k */
    @lvui
    private final CalendarConstraints f24372k;

    /* JADX INFO: renamed from: n */
    private final C4006g.x2 f24373n;

    /* JADX INFO: renamed from: q */
    private final DateSelector<?> f24374q;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.x2$k */
    /* JADX INFO: compiled from: MonthsPagerAdapter.java */
    class C4015k implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ MaterialCalendarGridView f24375k;

        C4015k(MaterialCalendarGridView materialCalendarGridView) {
            this.f24375k = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (this.f24375k.getAdapter().n7h(i2)) {
                x2.this.f24373n.mo14417k(this.f24375k.getAdapter().getItem(i2).longValue());
            }
        }
    }

    /* JADX INFO: compiled from: MonthsPagerAdapter.java */
    public static class toq extends RecyclerView.fti {

        /* JADX INFO: renamed from: k */
        final TextView f24377k;

        /* JADX INFO: renamed from: q */
        final MaterialCalendarGridView f24378q;

        toq(@lvui LinearLayout linearLayout, boolean z2) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C6095k.y.f80092vss1);
            this.f24377k = textView;
            C0683f.n2t(textView, true);
            this.f24378q = (MaterialCalendarGridView) linearLayout.findViewById(C6095k.y.f79945c25);
            if (z2) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    x2(@lvui Context context, DateSelector<?> dateSelector, @lvui CalendarConstraints calendarConstraints, C4006g.x2 x2Var) {
        Month monthX2 = calendarConstraints.x2();
        Month monthM14363y = calendarConstraints.m14363y();
        Month monthLd6 = calendarConstraints.ld6();
        if (monthX2.compareTo(monthLd6) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthLd6.compareTo(monthM14363y) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f24371g = (ld6.f24343s * C4006g.o5(context)) + (f7l8.mi1u(context) ? C4006g.o5(context) : 0);
        this.f24372k = calendarConstraints;
        this.f24374q = dateSelector;
        this.f24373n = x2Var;
        setHasStableIds(true);
    }

    @lvui
    CharSequence fn3e(int i2) {
        return ki(i2).zurt();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui toq toqVar, int i2) {
        Month monthFu4 = this.f24372k.x2().fu4(i2);
        toqVar.f24377k.setText(monthFu4.zurt());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) toqVar.f24378q.findViewById(C6095k.y.f79945c25);
        if (materialCalendarGridView.getAdapter() == null || !monthFu4.equals(materialCalendarGridView.getAdapter().f24345k)) {
            ld6 ld6Var = new ld6(monthFu4, this.f24374q, this.f24372k);
            materialCalendarGridView.setNumColumns(monthFu4.f24274n);
            materialCalendarGridView.setAdapter((ListAdapter) ld6Var);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().qrj(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new C4015k(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f24372k.m14362p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public long getItemId(int i2) {
        return this.f24372k.x2().fu4(i2).ni7();
    }

    @lvui
    Month ki(int i2) {
        return this.f24372k.x2().fu4(i2);
    }

    int ni7(@lvui Month month) {
        return this.f24372k.x2().m14384z(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public toq onCreateViewHolder(@lvui ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C6095k.ld6.f79282c8jq, viewGroup, false);
        if (!f7l8.mi1u(viewGroup.getContext())) {
            return new toq(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.cdj(-1, this.f24371g));
        return new toq(linearLayout, true);
    }
}
