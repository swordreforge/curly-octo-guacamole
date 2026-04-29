package miui.util;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.google.android.exoplayer2.text.ttml.C3678q;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@SuppressLint({C3678q.f65828lv5})
public class Patcher {
    static {
        System.loadLibrary("miuidiffpatcher");
    }

    public native int applyPatch(String oldFile, String newFile, String diffFile);
}
