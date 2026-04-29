package mi1u;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: mi1u.k */
/* JADX INFO: compiled from: ContextHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6814k {
    private C6814k() {
    }

    /* JADX INFO: renamed from: k */
    public static Activity m24746k(View view) {
        Context context = ((ViewGroup) view.getRootView()).getChildAt(0).getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }
}
