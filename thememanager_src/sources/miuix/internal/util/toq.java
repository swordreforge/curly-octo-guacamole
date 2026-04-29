package miuix.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import gb.toq;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.internal.app.widget.ActionBarMovableLayout;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import zy.dd;

/* JADX INFO: compiled from: ActionBarUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {
    private toq() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static ViewGroup m25975k(View view) {
        while (view != null) {
            if (view instanceof ActionBarOverlayLayout) {
                return (ActionBarOverlayLayout) view;
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return null;
    }

    public static void toq(Activity activity, AbstractC6946k.toq toqVar) {
        ((ActionBarMovableLayout) activity.findViewById(toq.C6054p.f34891e)).setOnScrollListener(toqVar);
    }
}
