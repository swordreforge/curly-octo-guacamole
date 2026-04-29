package miuix.appcompat.widget;

import android.view.View;
import miuix.appcompat.app.ki;
import miuix.appcompat.widget.dialoganim.C7059q;

/* JADX INFO: compiled from: DialogAnimHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static miuix.appcompat.widget.dialoganim.toq f39740k;

    /* JADX INFO: renamed from: miuix.appcompat.widget.toq$k */
    /* JADX INFO: compiled from: DialogAnimHelper.java */
    public interface InterfaceC7064k {
        void end();
    }

    /* JADX INFO: renamed from: k */
    public static void m25495k() {
        miuix.appcompat.widget.dialoganim.toq toqVar = f39740k;
        if (toqVar != null) {
            toqVar.toq();
        }
    }

    public static void toq(View view, View view2, InterfaceC7064k interfaceC7064k) {
        if (f39740k == null) {
            if (miuix.os.toq.f87880toq) {
                f39740k = new miuix.appcompat.widget.dialoganim.zy();
            } else {
                f39740k = new C7059q();
            }
        }
        f39740k.mo25475k(view, view2, interfaceC7064k);
        f39740k = null;
    }

    public static void zy(View view, View view2, boolean z2, ki.InterfaceC6949q interfaceC6949q) {
        if (f39740k == null) {
            if (miuix.os.toq.f87880toq) {
                f39740k = new miuix.appcompat.widget.dialoganim.zy();
            } else {
                f39740k = new C7059q();
            }
        }
        f39740k.zy(view, view2, z2, interfaceC6949q);
    }
}
