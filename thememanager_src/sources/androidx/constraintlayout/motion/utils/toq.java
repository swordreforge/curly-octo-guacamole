package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.C0276h;
import androidx.constraintlayout.core.motion.utils.ki;
import androidx.constraintlayout.core.motion.utils.t8r;
import androidx.constraintlayout.motion.widget.cdj;

/* JADX INFO: compiled from: StopLogic.java */
/* JADX INFO: loaded from: classes.dex */
public class toq extends cdj {

    /* JADX INFO: renamed from: k */
    private t8r f2183k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C0276h f48013toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private ki f48014zy;

    public toq() {
        t8r t8rVar = new t8r();
        this.f2183k = t8rVar;
        this.f48014zy = t8rVar;
    }

    /* JADX INFO: renamed from: g */
    public void m1381g(float currentPos, float destination, float currentVelocity, float mass, float stiffness, float damping, float stopThreshold, int boundaryMode) {
        if (this.f48013toq == null) {
            this.f48013toq = new C0276h();
        }
        C0276h c0276h = this.f48013toq;
        this.f48014zy = c0276h;
        c0276h.m1008y(currentPos, destination, currentVelocity, mass, stiffness, damping, stopThreshold, boundaryMode);
    }

    @Override // androidx.constraintlayout.motion.widget.cdj, android.animation.TimeInterpolator
    public float getInterpolation(float v2) {
        return this.f48014zy.getInterpolation(v2);
    }

    @Override // androidx.constraintlayout.motion.widget.cdj
    /* JADX INFO: renamed from: k */
    public float mo1382k() {
        return this.f48014zy.mo1006k();
    }

    /* JADX INFO: renamed from: n */
    public boolean m1383n() {
        return this.f48014zy.mo1007q();
    }

    /* JADX INFO: renamed from: q */
    public float m1384q(float x3) {
        return this.f48014zy.toq(x3);
    }

    public void toq(float currentPos, float destination, float currentVelocity, float maxTime, float maxAcceleration, float maxVelocity) {
        t8r t8rVar = this.f2183k;
        this.f48014zy = t8rVar;
        t8rVar.m1066g(currentPos, destination, currentVelocity, maxTime, maxAcceleration, maxVelocity);
    }

    public String zy(String desc, float time) {
        return this.f48014zy.zy(desc, time);
    }
}
