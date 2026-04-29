package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import zy.dd;

/* JADX INFO: compiled from: MonthAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
class ld6 extends BaseAdapter {

    /* JADX INFO: renamed from: s */
    static final int f24343s = cdj.zurt().getMaximum(4);

    /* JADX INFO: renamed from: g */
    toq f24344g;

    /* JADX INFO: renamed from: k */
    final Month f24345k;

    /* JADX INFO: renamed from: n */
    private Collection<Long> f24346n;

    /* JADX INFO: renamed from: q */
    final DateSelector<?> f24347q;

    /* JADX INFO: renamed from: y */
    final CalendarConstraints f24348y;

    ld6(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f24345k = month;
        this.f24347q = dateSelector;
        this.f24348y = calendarConstraints;
        this.f24346n = dateSelector.getSelectedDays();
    }

    private void ld6(@dd TextView textView, long j2) {
        C4008k c4008k;
        if (textView == null) {
            return;
        }
        if (this.f24348y.getDateValidator().mo14365s(j2)) {
            textView.setEnabled(true);
            c4008k = m14427y(j2) ? this.f24344g.f67573toq : cdj.m14399i().getTimeInMillis() == j2 ? this.f24344g.f67574zy : this.f24344g.f24367k;
        } else {
            textView.setEnabled(false);
            c4008k = this.f24344g.f67572f7l8;
        }
        c4008k.m14422g(textView);
    }

    /* JADX INFO: renamed from: n */
    private void m14426n(Context context) {
        if (this.f24344g == null) {
            this.f24344g = new toq(context);
        }
    }

    private void x2(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (Month.f7l8(j2).equals(this.f24345k)) {
            ld6((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().m14429k(this.f24345k.m14383h(j2)) - materialCalendarGridView.getFirstVisiblePosition()), j2);
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m14427y(long j2) {
        Iterator<Long> it = this.f24347q.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (cdj.m14400k(j2) == cdj.m14400k(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    boolean f7l8(int i2) {
        return (i2 + 1) % this.f24345k.f24274n == 0;
    }

    /* JADX INFO: renamed from: g */
    boolean m14428g(int i2) {
        return i2 % this.f24345k.f24274n == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24345k.f24272g + toq();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.f24345k.f24274n;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    int m14429k(int i2) {
        return toq() + (i2 - 1);
    }

    boolean n7h(int i2) {
        return i2 >= toq() && i2 <= m14432s();
    }

    /* JADX INFO: renamed from: p */
    int m14430p(int i2) {
        return (i2 - this.f24345k.ld6()) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    @Override // android.widget.Adapter
    @zy.lvui
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, @zy.dd android.view.View r7, @zy.lvui android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m14426n(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = ij.C6095k.ld6.f79321lv5
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.toq()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.Month r8 = r5.f24345k
            int r2 = r8.f24272g
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f24345k
            long r7 = r8.x2(r7)
            com.google.android.material.datepicker.Month r3 = r5.f24345k
            int r3 = r3.f24275q
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m14382p()
            int r4 = r4.f24275q
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.C4013q.f7l8(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.C4013q.x2(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.ld6(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.ld6.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public void qrj(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f24346n.iterator();
        while (it.hasNext()) {
            x2(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f24347q;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                x2(materialCalendarGridView, it2.next().longValue());
            }
            this.f24346n = this.f24347q.getSelectedDays();
        }
    }

    /* JADX INFO: renamed from: s */
    int m14432s() {
        return (this.f24345k.ld6() + this.f24345k.f24272g) - 1;
    }

    int toq() {
        return this.f24345k.ld6();
    }

    @Override // android.widget.Adapter
    @dd
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i2) {
        if (i2 < this.f24345k.ld6() || i2 > m14432s()) {
            return null;
        }
        return Long.valueOf(this.f24345k.x2(m14430p(i2)));
    }
}
