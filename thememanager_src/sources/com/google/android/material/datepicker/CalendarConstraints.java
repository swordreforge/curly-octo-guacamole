package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.C0642s;
import java.util.Arrays;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new Parcelable.Creator<CalendarConstraints>() { // from class: com.google.android.material.datepicker.CalendarConstraints.1
        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(@lvui Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i2) {
            return new CalendarConstraints[i2];
        }
    };

    @lvui
    private final Month end;

    /* JADX INFO: renamed from: k */
    private final int f24259k;

    @dd
    private Month openAt;

    /* JADX INFO: renamed from: q */
    private final int f24260q;

    @lvui
    private final Month start;

    @lvui
    private final DateValidator validator;

    public interface DateValidator extends Parcelable {
        /* JADX INFO: renamed from: s */
        boolean mo14365s(long j2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.start.equals(calendarConstraints.start) && this.end.equals(calendarConstraints.end) && C0642s.m2985k(this.openAt, calendarConstraints.openAt) && this.validator.equals(calendarConstraints.validator);
    }

    Month f7l8(Month month) {
        return month.compareTo(this.start) < 0 ? this.start : month.compareTo(this.end) > 0 ? this.end : month;
    }

    public DateValidator getDateValidator() {
        return this.validator;
    }

    /* JADX INFO: renamed from: h */
    int m14361h() {
        return this.f24259k;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.start, this.end, this.openAt, this.validator});
    }

    @dd
    Month ld6() {
        return this.openAt;
    }

    /* JADX INFO: renamed from: p */
    int m14362p() {
        return this.f24260q;
    }

    boolean t8r(long j2) {
        if (this.start.x2(1) <= j2) {
            Month month = this.end;
            if (j2 <= month.x2(month.f24272g)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.start, 0);
        parcel.writeParcelable(this.end, 0);
        parcel.writeParcelable(this.openAt, 0);
        parcel.writeParcelable(this.validator, 0);
    }

    @lvui
    Month x2() {
        return this.start;
    }

    @lvui
    /* JADX INFO: renamed from: y */
    Month m14363y() {
        return this.end;
    }

    void zurt(@dd Month month) {
        this.openAt = month;
    }

    private CalendarConstraints(@lvui Month month, @lvui Month month2, @lvui DateValidator dateValidator, @dd Month month3) {
        this.start = month;
        this.end = month2;
        this.openAt = month3;
        this.validator = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f24260q = month.m14384z(month2) + 1;
        this.f24259k = (month2.f24275q - month.f24275q) + 1;
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CalendarConstraints$k */
    public static final class C3991k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final String f67550f7l8 = "DEEP_COPY_VALIDATOR_KEY";

        /* JADX INFO: renamed from: k */
        private long f24263k;

        /* JADX INFO: renamed from: q */
        private DateValidator f24264q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private long f67551toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Long f67552zy;

        /* JADX INFO: renamed from: n */
        static final long f24262n = cdj.m14400k(Month.zy(1900, 0).f24276y);

        /* JADX INFO: renamed from: g */
        static final long f24261g = cdj.m14400k(Month.zy(2100, 11).f24276y);

        public C3991k() {
            this.f24263k = f24262n;
            this.f67551toq = f24261g;
            this.f24264q = DateValidatorPointForward.m14377k(Long.MIN_VALUE);
        }

        @lvui
        /* JADX INFO: renamed from: k */
        public CalendarConstraints m14366k() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f67550f7l8, this.f24264q);
            Month monthF7l8 = Month.f7l8(this.f24263k);
            Month monthF7l82 = Month.f7l8(this.f67551toq);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable(f67550f7l8);
            Long l2 = this.f67552zy;
            return new CalendarConstraints(monthF7l8, monthF7l82, dateValidator, l2 == null ? null : Month.f7l8(l2.longValue()));
        }

        @lvui
        /* JADX INFO: renamed from: n */
        public C3991k m14367n(@lvui DateValidator dateValidator) {
            this.f24264q = dateValidator;
            return this;
        }

        @lvui
        /* JADX INFO: renamed from: q */
        public C3991k m14368q(long j2) {
            this.f24263k = j2;
            return this;
        }

        @lvui
        public C3991k toq(long j2) {
            this.f67551toq = j2;
            return this;
        }

        @lvui
        public C3991k zy(long j2) {
            this.f67552zy = Long.valueOf(j2);
            return this;
        }

        C3991k(@lvui CalendarConstraints calendarConstraints) {
            this.f24263k = f24262n;
            this.f67551toq = f24261g;
            this.f24264q = DateValidatorPointForward.m14377k(Long.MIN_VALUE);
            this.f24263k = calendarConstraints.start.f24276y;
            this.f67551toq = calendarConstraints.end.f24276y;
            this.f67552zy = Long.valueOf(calendarConstraints.openAt.f24276y);
            this.f24264q = calendarConstraints.validator;
        }
    }
}
