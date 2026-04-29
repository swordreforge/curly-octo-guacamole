package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.q */
/* JADX INFO: compiled from: OrientationListener.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3888q implements SensorEventListener {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f67220f7l8;

    /* JADX INFO: renamed from: g */
    private final k[] f23529g;

    /* JADX INFO: renamed from: n */
    private final Display f23531n;

    /* JADX INFO: renamed from: k */
    private final float[] f23530k = new float[16];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float[] f67221toq = new float[16];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final float[] f67222zy = new float[16];

    /* JADX INFO: renamed from: q */
    private final float[] f23532q = new float[3];

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.q$k */
    /* JADX INFO: compiled from: OrientationListener.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo13838k(float[] fArr, float f2);
    }

    public C3888q(Display display, k... kVarArr) {
        this.f23531n = display;
        this.f23529g = kVarArr;
    }

    /* JADX INFO: renamed from: k */
    private float m13851k(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f67221toq);
        SensorManager.getOrientation(this.f67221toq, this.f23532q);
        return this.f23532q[2];
    }

    /* JADX INFO: renamed from: n */
    private static void m13852n(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: q */
    private void m13853q(float[] fArr, int i2) {
        if (i2 != 0) {
            int i3 = 130;
            int i4 = 129;
            if (i2 == 1) {
                i3 = 2;
            } else if (i2 == 2) {
                i4 = 130;
                i3 = 129;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException();
                }
                i4 = 1;
            }
            float[] fArr2 = this.f67221toq;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f67221toq, i3, i4, fArr);
        }
    }

    private void toq(float[] fArr, float f2) {
        for (k kVar : this.f23529g) {
            kVar.mo13838k(fArr, f2);
        }
    }

    private void zy(float[] fArr) {
        if (!this.f67220f7l8) {
            zy.m13860k(this.f67222zy, fArr);
            this.f67220f7l8 = true;
        }
        float[] fArr2 = this.f67221toq;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f67221toq, 0, this.f67222zy, 0);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    @zy.f7l8
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f23530k, sensorEvent.values);
        m13853q(this.f23530k, this.f23531n.getRotation());
        float fM13851k = m13851k(this.f23530k);
        m13852n(this.f23530k);
        zy(this.f23530k);
        toq(this.f23530k, fM13851k);
    }
}
