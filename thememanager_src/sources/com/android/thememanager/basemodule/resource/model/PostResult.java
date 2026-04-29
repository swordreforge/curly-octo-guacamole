package com.android.thememanager.basemodule.resource.model;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class PostResult {
    private static final String SUCCESS_VALUE = "ok";
    public String result;

    public boolean isSuccess() {
        return TextUtils.equals(this.result, "ok");
    }
}
