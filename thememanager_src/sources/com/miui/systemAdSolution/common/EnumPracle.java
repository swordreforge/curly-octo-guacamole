package com.miui.systemAdSolution.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.lang.Enum;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class EnumPracle<T extends Enum> implements Parcelable {
    public static final Parcelable.Creator<EnumPracle> CREATOR = new Parcelable.Creator<EnumPracle>() { // from class: com.miui.systemAdSolution.common.EnumPracle.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public EnumPracle createFromParcel(Parcel parcel) {
            return new EnumPracle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public EnumPracle[] newArray(int i2) {
            return new EnumPracle[i2];
        }
    };
    private static final String TAG = "AdTrackType";
    private T mValue;

    protected EnumPracle(Parcel parcel) {
        int i2;
        String string;
        String string2;
        Field declaredField;
        if (parcel != null) {
            string = parcel.readString();
            string2 = parcel.readString();
            i2 = parcel.readInt();
        } else {
            i2 = -1;
            string = null;
            string2 = null;
        }
        if (i2 == -1 || TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            m18146k(string, string2, i2, null);
            return;
        }
        try {
            Enum[] enumArr = (Enum[]) Enum.class.getDeclaredMethod("getSharedConstants", Class.class).invoke(null, Class.forName(string));
            if (enumArr == null || enumArr.length <= 0) {
                throw new C5327k(String.format("the enum[%s] is not define.", string));
            }
            for (Enum r0 : enumArr) {
                T t2 = (T) r0;
                if (t2 != null && (declaredField = Enum.class.getDeclaredField("name")) != null) {
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    if (TextUtils.equals((String) declaredField.get(t2), string2)) {
                        Field declaredField2 = Enum.class.getDeclaredField("ordinal");
                        if (!declaredField2.isAccessible()) {
                            declaredField2.setAccessible(true);
                        }
                        int i3 = declaredField2.getInt(t2);
                        if (i3 != i2) {
                            throw new C5327k(String.format("the value[%s] which name is [%s] in the enum[%s] is not equal the value defined[%s].", Integer.valueOf(i2), string2, string, Integer.valueOf(i3)));
                        }
                        this.mValue = t2;
                        return;
                    }
                }
            }
            throw new C5327k(String.format("the name[%s] in the enum[%s] is not defined.", string2, string));
        } catch (ClassCastException e2) {
            m18146k(string, string2, i2, e2);
        } catch (ClassNotFoundException e3) {
            m18146k(string, string2, i2, e3);
        } catch (IllegalAccessException e4) {
            m18146k(string, string2, i2, e4);
        } catch (NoSuchFieldException e6) {
            m18146k(string, string2, i2, e6);
        } catch (NoSuchMethodException e7) {
            m18146k(string, string2, i2, e7);
        } catch (InvocationTargetException e8) {
            m18146k(string, string2, i2, e8);
        } catch (Exception e9) {
            m18146k(string, string2, i2, e9);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m18146k(String str, String str2, int i2, Throwable th) {
        String str3 = String.format("the value[%s] which name is [%s] in the enum[%s] is not support.", Integer.valueOf(i2), str2, str);
        if (th == null) {
            Log.e(TAG, str3);
        } else {
            Log.e(TAG, str3, th);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public T getValue() {
        return this.mValue;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.mValue.getClass().getName());
        parcel.writeString(this.mValue.name());
        parcel.writeInt(this.mValue.ordinal());
    }

    public EnumPracle(T t2) {
        if (t2 != null) {
            this.mValue = t2;
            return;
        }
        throw new IllegalArgumentException("type must not be null.");
    }
}
