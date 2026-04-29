package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: k */
    private static final int f24265k = 1;

    /* JADX INFO: renamed from: q */
    private static final int f24266q = 2;

    @lvui
    private final zy operator;

    @lvui
    private final List<CalendarConstraints.DateValidator> validators;
    private static final zy ANY_OPERATOR = new C3993k();
    private static final zy ALL_OPERATOR = new toq();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new Parcelable.Creator<CompositeDateValidator>() { // from class: com.google.android.material.datepicker.CompositeDateValidator.3
        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator createFromParcel(@lvui Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i2 = parcel.readInt();
            zy zyVar = (i2 != 2 && i2 == 1) ? CompositeDateValidator.ANY_OPERATOR : CompositeDateValidator.ALL_OPERATOR;
            return new CompositeDateValidator((List) androidx.core.util.n7h.x2(arrayList), zyVar, null);
        }

        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator[] newArray(int i2) {
            return new CompositeDateValidator[i2];
        }
    };

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CompositeDateValidator$k */
    class C3993k implements zy {
        C3993k() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.zy
        public int getId() {
            return 1;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.zy
        /* JADX INFO: renamed from: k */
        public boolean mo14372k(@lvui List<CalendarConstraints.DateValidator> list, long j2) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.mo14365s(j2)) {
                    return true;
                }
            }
            return false;
        }
    }

    class toq implements zy {
        toq() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.zy
        public int getId() {
            return 2;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.zy
        /* JADX INFO: renamed from: k */
        public boolean mo14372k(@lvui List<CalendarConstraints.DateValidator> list, long j2) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.mo14365s(j2)) {
                    return false;
                }
            }
            return true;
        }
    }

    private interface zy {
        int getId();

        /* JADX INFO: renamed from: k */
        boolean mo14372k(@lvui List<CalendarConstraints.DateValidator> list, long j2);
    }

    /* synthetic */ CompositeDateValidator(List list, zy zyVar, C3993k c3993k) {
        this(list, zyVar);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public static CalendarConstraints.DateValidator m14369g(@lvui List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ANY_OPERATOR);
    }

    @lvui
    public static CalendarConstraints.DateValidator zy(@lvui List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ALL_OPERATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.validators.equals(compositeDateValidator.validators) && this.operator.getId() == compositeDateValidator.operator.getId();
    }

    public int hashCode() {
        return this.validators.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* JADX INFO: renamed from: s */
    public boolean mo14365s(long j2) {
        return this.operator.mo14372k(this.validators, j2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@lvui Parcel parcel, int i2) {
        parcel.writeList(this.validators);
        parcel.writeInt(this.operator.getId());
    }

    private CompositeDateValidator(@lvui List<CalendarConstraints.DateValidator> list, zy zyVar) {
        this.validators = list;
        this.operator = zyVar;
    }
}
