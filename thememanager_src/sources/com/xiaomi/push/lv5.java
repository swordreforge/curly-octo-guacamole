package com.xiaomi.push;

import com.xiaomi.push.y2;

/* JADX INFO: loaded from: classes3.dex */
public class lv5 extends y2.C5964q {

    /* JADX INFO: renamed from: z */
    protected String f33367z;

    public lv5(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr);
        this.f33367z = str3;
    }

    public static lv5 ld6(String str) {
        return new lv5(str, "status = ?", new String[]{String.valueOf(2)}, "a job build to delete uploaded job");
    }
}
