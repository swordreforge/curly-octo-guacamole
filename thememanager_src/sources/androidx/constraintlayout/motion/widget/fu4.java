package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.t8r;
import androidx.constraintlayout.widget.C0397q;

/* JADX INFO: compiled from: TransitionBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class fu4 {

    /* JADX INFO: renamed from: k */
    private static final String f2231k = "TransitionBuilder";

    /* JADX INFO: renamed from: k */
    public static t8r.toq m1443k(t8r scene, int transitionId, int startConstraintSetId, C0397q startConstraintSet, int endConstraintSetId, C0397q endConstraintSet) {
        t8r.toq toqVar = new t8r.toq(transitionId, scene, startConstraintSetId, endConstraintSetId);
        toq(scene, toqVar, startConstraintSet, endConstraintSet);
        return toqVar;
    }

    private static void toq(t8r scene, t8r.toq transition, C0397q startConstraintSet, C0397q endConstraintSet) {
        int iD3 = transition.d3();
        int iM1554t = transition.m1554t();
        scene.bf2(iD3, startConstraintSet);
        scene.bf2(iM1554t, endConstraintSet);
    }

    public static void zy(MotionLayout layout) {
        t8r t8rVar = layout.bl;
        if (t8rVar == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!t8rVar.t8iq(layout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (t8rVar.f48306zy == null || t8rVar.t8r().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
