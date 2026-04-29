package com.android.thememanager.basemodule.utils;

import android.content.Context;
import com.android.thememanager.R;
import java.io.File;
import miuix.appcompat.app.ki;

/* JADX INFO: compiled from: SecondSpaceForbidUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class n5r1 {
    /* JADX INFO: renamed from: k */
    public static miuix.appcompat.app.ki m7143k(Context context, int messageId) {
        return new ki.C6947k(context).lrht(R.string.use_hint).fu4(messageId).dd(R.string.i_know, null).m25037g();
    }

    public static boolean toq(@zy.lvui String filePath) {
        if (!o1t.fu4()) {
            return false;
        }
        File file = new File(filePath);
        return (file.getParentFile() == null || file.getParentFile().exists()) ? false : true;
    }
}
