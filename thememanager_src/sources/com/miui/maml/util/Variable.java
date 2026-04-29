package com.miui.maml.util;

import android.text.TextUtils;
import com.miui.maml.data.VariableBinder;

/* JADX INFO: loaded from: classes3.dex */
public class Variable {
    private String mObjectName;
    private String mPropertyName;

    public Variable(String str) {
        int iIndexOf = str.indexOf(46);
        if (iIndexOf == -1) {
            this.mObjectName = null;
            this.mPropertyName = str;
        } else {
            this.mObjectName = str.substring(0, iIndexOf);
            this.mPropertyName = str.substring(iIndexOf + 1);
        }
        if (TextUtils.isEmpty(this.mPropertyName)) {
            MamlLog.m17851e(VariableBinder.Variable.TAG_NAME, "invalid variable name:" + str);
        }
    }

    public String getObjName() {
        return this.mObjectName;
    }

    public String getPropertyName() {
        return this.mPropertyName;
    }
}
