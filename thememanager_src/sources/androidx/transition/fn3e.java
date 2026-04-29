package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: GhostViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
class fn3e {
    private fn3e() {
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    static cdj m5338k(@zy.lvui View view, @zy.lvui ViewGroup viewGroup, @zy.dd Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? t8r.toq(view, viewGroup, matrix) : C1215i.toq(view, viewGroup, matrix);
    }

    static void toq(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            t8r.m5423g(view);
        } else {
            C1215i.m5357g(view);
        }
    }
}
