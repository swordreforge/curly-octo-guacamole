package com.xiaomi.accountsdk.account.data;

/* JADX INFO: compiled from: BindingType.java */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public enum toq {
    ADD_SAFE_EMAIL,
    REPLACE_SAFE_EMAIL,
    ADD_PHONE,
    REPLACE_PHONE,
    DELETE_PHONE;

    public boolean isBindingEmail() {
        return this == ADD_SAFE_EMAIL || this == REPLACE_SAFE_EMAIL;
    }

    public boolean isBindingPhone() {
        return this == ADD_PHONE || this == REPLACE_PHONE || this == DELETE_PHONE;
    }
}
