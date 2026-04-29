package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new Parcelable.Creator<DateValidatorPointForward>() { // from class: com.google.android.material.datepicker.DateValidatorPointForward.1
        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward createFromParcel(@lvui Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward[] newArray(int i2) {
            return new DateValidatorPointForward[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    private final long f24268k;

    @lvui
    /* JADX INFO: renamed from: k */
    public static DateValidatorPointForward m14377k(long j2) {
        return new DateValidatorPointForward(j2);
    }

    @lvui
    public static DateValidatorPointForward now() {
        return m14377k(cdj.m14399i().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f24268k == ((DateValidatorPointForward) obj).f24268k;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f24268k)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* JADX INFO: renamed from: s */
    public boolean mo14365s(long j2) {
        return j2 >= this.f24268k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@lvui Parcel parcel, int i2) {
        parcel.writeLong(this.f24268k);
    }

    private DateValidatorPointForward(long j2) {
        this.f24268k = j2;
    }
}
