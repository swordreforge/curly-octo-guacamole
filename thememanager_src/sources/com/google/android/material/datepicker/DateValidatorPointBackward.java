package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new Parcelable.Creator<DateValidatorPointBackward>() { // from class: com.google.android.material.datepicker.DateValidatorPointBackward.1
        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointBackward createFromParcel(@lvui Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointBackward[] newArray(int i2) {
            return new DateValidatorPointBackward[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    private final long f24267k;

    @lvui
    /* JADX INFO: renamed from: k */
    public static DateValidatorPointBackward m14375k(long j2) {
        return new DateValidatorPointBackward(j2);
    }

    @lvui
    public static DateValidatorPointBackward now() {
        return m14375k(cdj.m14399i().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.f24267k == ((DateValidatorPointBackward) obj).f24267k;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f24267k)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* JADX INFO: renamed from: s */
    public boolean mo14365s(long j2) {
        return j2 <= this.f24267k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@lvui Parcel parcel, int i2) {
        parcel.writeLong(this.f24267k);
    }

    private DateValidatorPointBackward(long j2) {
        this.f24267k = j2;
    }
}
