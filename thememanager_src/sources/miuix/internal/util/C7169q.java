package miuix.internal.util;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import gb.toq;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.utils.CommonUtils;
import zy.hyr;

/* JADX INFO: renamed from: miuix.internal.util.q */
/* JADX INFO: compiled from: AnimHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7169q {

    /* JADX INFO: renamed from: k */
    private static final String f40386k = "AnimHelper";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile boolean f87772toq = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean f7l8(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 9) {
            view.setHovered(true);
        } else if (motionEvent.getAction() == 10) {
            view.setHovered(false);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m25965g() {
        return f87772toq;
    }

    /* JADX INFO: renamed from: n */
    public static void m25967n(View view) {
        ITouchStyle scale = Folme.useAt(view).touch().setTint(0.0f, 0.0f, 0.0f, 0.0f).setScale(1.0f, new ITouchStyle.TouchType[0]);
        IHoverStyle effect = Folme.useAt(view).hover().setTint(0.0f, 0.0f, 0.0f, 0.0f).setEffect(IHoverStyle.HoverEffect.NORMAL);
        if (n7h.qrj(view.getContext())) {
            scale.setBackgroundColor(0.15f, 1.0f, 1.0f, 1.0f);
            effect.setBackgroundColor(0.15f, 1.0f, 1.0f, 1.0f);
        } else {
            scale.setBackgroundColor(0.08f, 0.0f, 0.0f, 0.0f);
            effect.setBackgroundColor(0.08f, 0.0f, 0.0f, 0.0f);
        }
        scale.handleTouchOf(view, new AnimConfig[0]);
        effect.handleHoverOf(view, new AnimConfig[0]);
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public static void m25968q(View view, IHoverStyle.HoverEffect hoverEffect) {
        Folme.useAt(view).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(view, new AnimConfig[0]);
        Folme.useAt(view).hover().setEffect(hoverEffect).handleHoverOf(view, new AnimConfig[0]);
    }

    @hyr(api = 23)
    public static void toq(View view) {
        if (view == null) {
            return;
        }
        view.setForeground(C7164n.m25952s(view.getContext(), toq.C6055q.i03a));
        if (view.isClickable()) {
            return;
        }
        view.setOnHoverListener(new View.OnHoverListener() { // from class: miuix.internal.util.zy
            @Override // android.view.View.OnHoverListener
            public final boolean onHover(View view2, MotionEvent motionEvent) {
                return C7169q.f7l8(view2, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static boolean m25969y() throws Throwable {
        String str = "";
        try {
            String prop = CommonUtils.readProp("log.tag.alertdialog.debug.enable");
            if (prop != null) {
                str = prop;
            }
        } catch (Exception e2) {
            Log.i(f40386k, "can not access property log.tag.alertdialog.enable, undebugable", e2);
        }
        Log.d(f40386k, "Alert dialog debugEnable = " + str);
        f87772toq = TextUtils.equals("true", str);
        return f87772toq;
    }

    @Deprecated
    public static void zy(View view) {
        m25968q(view, IHoverStyle.HoverEffect.NORMAL);
    }
}
