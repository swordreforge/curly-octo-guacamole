package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: compiled from: AppCompatHintHelper.java */
/* JADX INFO: loaded from: classes.dex */
class kja0 {
    private kja0() {
    }

    /* JADX INFO: renamed from: k */
    static InputConnection m626k(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof lv5) {
                    editorInfo.hintText = ((lv5) parent).m653k();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }
}
