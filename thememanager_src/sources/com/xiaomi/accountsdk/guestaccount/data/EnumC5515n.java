package com.xiaomi.accountsdk.guestaccount.data;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.data.n */
/* JADX INFO: compiled from: GuestAccountType.java */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5515n {
    DEFAULT(1),
    FID(3);

    public static final int SERVER_VALUE_AS_NULL = -1;
    public final int serverValue;

    EnumC5515n(int i2) {
        this.serverValue = i2;
    }

    public static EnumC5515n getFromServerValue(int i2) {
        for (EnumC5515n enumC5515n : values()) {
            if (enumC5515n.serverValue == i2) {
                return enumC5515n;
            }
        }
        return null;
    }
}
