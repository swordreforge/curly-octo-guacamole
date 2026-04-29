package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.video.spherical.C3888q;
import com.google.android.exoplayer2.video.spherical.x2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import zy.InterfaceC7840q;
import zy.dd;
import zy.ek5k;
import zy.yz;

/* JADX INFO: loaded from: classes2.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: c */
    private static final float f23472c = 100.0f;

    /* JADX INFO: renamed from: e */
    private static final float f23473e = 25.0f;

    /* JADX INFO: renamed from: f */
    private static final float f23474f = 0.1f;

    /* JADX INFO: renamed from: j */
    static final float f23475j = 3.1415927f;

    /* JADX INFO: renamed from: l */
    private static final int f23476l = 90;

    /* JADX INFO: renamed from: g */
    private final C3888q f23477g;

    /* JADX INFO: renamed from: h */
    @dd
    private SurfaceTexture f23478h;

    /* JADX INFO: renamed from: i */
    @dd
    private Surface f23479i;

    /* JADX INFO: renamed from: k */
    private final CopyOnWriteArrayList<toq> f23480k;

    /* JADX INFO: renamed from: n */
    @dd
    private final Sensor f23481n;

    /* JADX INFO: renamed from: p */
    private final C3889s f23482p;

    /* JADX INFO: renamed from: q */
    private final SensorManager f23483q;

    /* JADX INFO: renamed from: r */
    private boolean f23484r;

    /* JADX INFO: renamed from: s */
    private final x2 f23485s;

    /* JADX INFO: renamed from: t */
    private boolean f23486t;

    /* JADX INFO: renamed from: y */
    private final Handler f23487y;

    /* JADX INFO: renamed from: z */
    private boolean f23488z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$k */
    @yz
    final class C3882k implements GLSurfaceView.Renderer, x2.InterfaceC3890k, C3888q.k {

        /* JADX INFO: renamed from: g */
        private final float[] f23489g;

        /* JADX INFO: renamed from: h */
        private float f23490h;

        /* JADX INFO: renamed from: k */
        private final C3889s f23492k;

        /* JADX INFO: renamed from: p */
        private float f23494p;

        /* JADX INFO: renamed from: s */
        private final float[] f23496s;

        /* JADX INFO: renamed from: y */
        private final float[] f23498y;

        /* JADX INFO: renamed from: q */
        private final float[] f23495q = new float[16];

        /* JADX INFO: renamed from: n */
        private final float[] f23493n = new float[16];

        /* JADX INFO: renamed from: i */
        private final float[] f23491i = new float[16];

        /* JADX INFO: renamed from: z */
        private final float[] f23499z = new float[16];

        public C3882k(C3889s c3889s) {
            float[] fArr = new float[16];
            this.f23489g = fArr;
            float[] fArr2 = new float[16];
            this.f23498y = fArr2;
            float[] fArr3 = new float[16];
            this.f23496s = fArr3;
            this.f23492k = c3889s;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f23490h = SphericalGLSurfaceView.f23475j;
        }

        @InterfaceC7840q
        /* JADX INFO: renamed from: q */
        private void m13837q() {
            Matrix.setRotateM(this.f23498y, 0, -this.f23494p, (float) Math.cos(this.f23490h), (float) Math.sin(this.f23490h), 0.0f);
        }

        private float zy(float f2) {
            if (f2 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f2))) * 2.0d);
            }
            return 90.0f;
        }

        @Override // com.google.android.exoplayer2.video.spherical.C3888q.k
        @zy.f7l8
        /* JADX INFO: renamed from: k */
        public synchronized void mo13838k(float[] fArr, float f2) {
            float[] fArr2 = this.f23489g;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f23490h = -f2;
            m13837q();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f23499z, 0, this.f23489g, 0, this.f23496s, 0);
                Matrix.multiplyMM(this.f23491i, 0, this.f23498y, 0, this.f23499z, 0);
            }
            Matrix.multiplyMM(this.f23493n, 0, this.f23495q, 0, this.f23491i, 0);
            this.f23492k.m13858q(this.f23493n, false);
        }

        @Override // com.google.android.exoplayer2.video.spherical.x2.InterfaceC3890k
        @ek5k
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
            float f2 = i2 / i3;
            Matrix.perspectiveM(this.f23495q, 0, zy(f2), f2, 0.1f, SphericalGLSurfaceView.f23472c);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.f7l8(this.f23492k.m13856n());
        }

        @Override // com.google.android.exoplayer2.video.spherical.x2.InterfaceC3890k
        @ek5k
        public synchronized void toq(PointF pointF) {
            this.f23494p = pointF.y;
            m13837q();
            Matrix.setRotateM(this.f23496s, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }
    }

    public interface toq {
        void a9(Surface surface);

        void fti(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8(final SurfaceTexture surfaceTexture) {
        this.f23487y.post(new Runnable() { // from class: com.google.android.exoplayer2.video.spherical.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f23527k.m13830g(surfaceTexture);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m13830g(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f23478h;
        Surface surface = this.f23479i;
        Surface surface2 = new Surface(surfaceTexture);
        this.f23478h = surfaceTexture;
        this.f23479i = surface2;
        Iterator<toq> it = this.f23480k.iterator();
        while (it.hasNext()) {
            it.next().fti(surface2);
        }
        m13834y(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m13832n() {
        Surface surface = this.f23479i;
        if (surface != null) {
            Iterator<toq> it = this.f23480k.iterator();
            while (it.hasNext()) {
                it.next().a9(surface);
            }
        }
        m13834y(this.f23478h, surface);
        this.f23478h = null;
        this.f23479i = null;
    }

    /* JADX INFO: renamed from: p */
    private void m13833p() {
        boolean z2 = this.f23488z && this.f23486t;
        Sensor sensor = this.f23481n;
        if (sensor == null || z2 == this.f23484r) {
            return;
        }
        if (z2) {
            this.f23483q.registerListener(this.f23477g, sensor, 0);
        } else {
            this.f23483q.unregisterListener(this.f23477g);
        }
        this.f23484r = z2;
    }

    /* JADX INFO: renamed from: y */
    private static void m13834y(@dd SurfaceTexture surfaceTexture, @dd Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public InterfaceC3885k getCameraMotionListener() {
        return this.f23482p;
    }

    public com.google.android.exoplayer2.video.ld6 getVideoFrameMetadataListener() {
        return this.f23482p;
    }

    @dd
    public Surface getVideoSurface() {
        return this.f23479i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23487y.post(new Runnable() { // from class: com.google.android.exoplayer2.video.spherical.ld6
            @Override // java.lang.Runnable
            public final void run() {
                this.f23516k.m13832n();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f23486t = false;
        m13833p();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f23486t = true;
        m13833p();
    }

    /* JADX INFO: renamed from: q */
    public void m13835q(toq toqVar) {
        this.f23480k.add(toqVar);
    }

    /* JADX INFO: renamed from: s */
    public void m13836s(toq toqVar) {
        this.f23480k.remove(toqVar);
    }

    public void setDefaultStereoMode(int i2) {
        this.f23482p.m13859y(i2);
    }

    public void setUseSensorRotation(boolean z2) {
        this.f23488z = z2;
        m13833p();
    }

    public SphericalGLSurfaceView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23480k = new CopyOnWriteArrayList<>();
        this.f23487y = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C3844k.f7l8(context.getSystemService("sensor"));
        this.f23483q = sensorManager;
        Sensor defaultSensor = lrht.f23230k >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f23481n = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C3889s c3889s = new C3889s();
        this.f23482p = c3889s;
        C3882k c3882k = new C3882k(c3889s);
        x2 x2Var = new x2(context, c3882k, f23473e);
        this.f23485s = x2Var;
        this.f23477g = new C3888q(((WindowManager) C3844k.f7l8((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), x2Var, c3882k);
        this.f23488z = true;
        setEGLContextClientVersion(2);
        setRenderer(c3882k);
        setOnTouchListener(x2Var);
    }
}
