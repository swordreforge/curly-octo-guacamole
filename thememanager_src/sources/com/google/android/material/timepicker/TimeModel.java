package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import zy.a9;

/* JADX INFO: loaded from: classes2.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() { // from class: com.google.android.material.timepicker.TimeModel.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i2) {
            return new TimeModel[i2];
        }
    };

    /* JADX INFO: renamed from: p */
    public static final String f25351p = "%d";

    /* JADX INFO: renamed from: s */
    public static final String f25352s = "%02d";

    /* JADX INFO: renamed from: g */
    int f25353g;
    private final zy hourInputValidator;

    /* JADX INFO: renamed from: k */
    final int f25354k;
    private final zy minuteInputValidator;

    /* JADX INFO: renamed from: n */
    int f25355n;

    /* JADX INFO: renamed from: q */
    int f25356q;

    /* JADX INFO: renamed from: y */
    int f25357y;

    public TimeModel() {
        this(0);
    }

    /* JADX INFO: renamed from: g */
    private static int m15114g(int i2) {
        return i2 >= 12 ? 1 : 0;
    }

    /* JADX INFO: renamed from: k */
    public static String m15115k(Resources resources, CharSequence charSequence) {
        return toq(resources, charSequence, f25352s);
    }

    public static String toq(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f25356q == timeModel.f25356q && this.f25355n == timeModel.f25355n && this.f25354k == timeModel.f25354k && this.f25353g == timeModel.f25353g;
    }

    public void f7l8(int i2) {
        if (this.f25354k == 1) {
            this.f25356q = i2;
        } else {
            this.f25356q = (i2 % 12) + (this.f25357y != 1 ? 0 : 12);
        }
    }

    public zy getHourInputValidator() {
        return this.hourInputValidator;
    }

    public zy getMinuteInputValidator() {
        return this.minuteInputValidator;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25354k), Integer.valueOf(this.f25356q), Integer.valueOf(this.f25355n), Integer.valueOf(this.f25353g)});
    }

    public void ld6(int i2) {
        if (i2 != this.f25357y) {
            this.f25357y = i2;
            int i3 = this.f25356q;
            if (i3 < 12 && i2 == 1) {
                this.f25356q = i3 + 12;
            } else {
                if (i3 < 12 || i2 != 0) {
                    return;
                }
                this.f25356q = i3 - 12;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m15116p(@a9(from = 0, to = 59) int i2) {
        this.f25355n = i2 % 60;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f25356q);
        parcel.writeInt(this.f25355n);
        parcel.writeInt(this.f25353g);
        parcel.writeInt(this.f25354k);
    }

    /* JADX INFO: renamed from: y */
    public void m15117y(int i2) {
        this.f25357y = m15114g(i2);
        this.f25356q = i2;
    }

    public int zy() {
        if (this.f25354k == 1) {
            return this.f25356q % 24;
        }
        int i2 = this.f25356q;
        if (i2 % 12 == 0) {
            return 12;
        }
        return this.f25357y == 1 ? i2 - 12 : i2;
    }

    public TimeModel(int i2) {
        this(0, 0, 10, i2);
    }

    public TimeModel(int i2, int i3, int i4, int i5) {
        this.f25356q = i2;
        this.f25355n = i3;
        this.f25353g = i4;
        this.f25354k = i5;
        this.f25357y = m15114g(i2);
        this.minuteInputValidator = new zy(59);
        this.hourInputValidator = new zy(i5 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
