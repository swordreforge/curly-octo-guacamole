package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: com.google.android.material.datepicker.Month.1
        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(@lvui Parcel parcel) {
            return Month.zy(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i2) {
            return new Month[i2];
        }
    };

    @lvui
    private final Calendar firstOfMonth;

    /* JADX INFO: renamed from: g */
    final int f24272g;

    /* JADX INFO: renamed from: k */
    final int f24273k;

    @dd
    private String longName;

    /* JADX INFO: renamed from: n */
    final int f24274n;

    /* JADX INFO: renamed from: q */
    final int f24275q;

    /* JADX INFO: renamed from: y */
    final long f24276y;

    private Month(@lvui Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM14397g = cdj.m14397g(calendar);
        this.firstOfMonth = calendarM14397g;
        this.f24273k = calendarM14397g.get(2);
        this.f24275q = calendarM14397g.get(1);
        this.f24274n = calendarM14397g.getMaximum(7);
        this.f24272g = calendarM14397g.getActualMaximum(5);
        this.f24276y = calendarM14397g.getTimeInMillis();
    }

    @lvui
    static Month f7l8(long j2) {
        Calendar calendarZurt = cdj.zurt();
        calendarZurt.setTimeInMillis(j2);
        return new Month(calendarZurt);
    }

    @lvui
    /* JADX INFO: renamed from: p */
    static Month m14382p() {
        return new Month(cdj.m14399i());
    }

    @lvui
    static Month zy(int i2, int i3) {
        Calendar calendarZurt = cdj.zurt();
        calendarZurt.set(1, i2);
        calendarZurt.set(2, i3);
        return new Month(calendarZurt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f24273k == month.f24273k && this.f24275q == month.f24275q;
    }

    @lvui
    Month fu4(int i2) {
        Calendar calendarM14397g = cdj.m14397g(this.firstOfMonth);
        calendarM14397g.add(2, i2);
        return new Month(calendarM14397g);
    }

    /* JADX INFO: renamed from: h */
    int m14383h(long j2) {
        Calendar calendarM14397g = cdj.m14397g(this.firstOfMonth);
        calendarM14397g.setTimeInMillis(j2);
        return calendarM14397g.get(5);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24273k), Integer.valueOf(this.f24275q)});
    }

    int ld6() {
        int firstDayOfWeek = this.firstOfMonth.get(7) - this.firstOfMonth.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f24274n : firstDayOfWeek;
    }

    long ni7() {
        return this.firstOfMonth.getTimeInMillis();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public int compareTo(@lvui Month month) {
        return this.firstOfMonth.compareTo(month.firstOfMonth);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@lvui Parcel parcel, int i2) {
        parcel.writeInt(this.f24275q);
        parcel.writeInt(this.f24273k);
    }

    long x2(int i2) {
        Calendar calendarM14397g = cdj.m14397g(this.firstOfMonth);
        calendarM14397g.set(5, i2);
        return calendarM14397g.getTimeInMillis();
    }

    /* JADX INFO: renamed from: z */
    int m14384z(@lvui Month month) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return ((month.f24275q - this.f24275q) * 12) + (month.f24273k - this.f24273k);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @lvui
    String zurt() {
        if (this.longName == null) {
            this.longName = C4013q.m14440s(this.firstOfMonth.getTimeInMillis());
        }
        return this.longName;
    }
}
