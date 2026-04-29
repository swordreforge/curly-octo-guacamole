package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.cdj;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements InterfaceC3879p {

    /* JADX INFO: renamed from: k */
    private final C3869k f23375k;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView$k */
    private static final class C3869k implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: e */
        private static final String f23377e = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n";

        /* JADX INFO: renamed from: f */
        private static final String f23378f = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n";

        /* JADX INFO: renamed from: h */
        private cdj.C3834q f23384h;

        /* JADX INFO: renamed from: i */
        private int f23385i;

        /* JADX INFO: renamed from: k */
        private final GLSurfaceView f23386k;

        /* JADX INFO: renamed from: z */
        private com.google.android.exoplayer2.decoder.kja0 f23392z;

        /* JADX INFO: renamed from: t */
        private static final float[] f23382t = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: r */
        private static final float[] f23381r = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: l */
        private static final float[] f23380l = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: c */
        private static final String[] f23376c = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: j */
        private static final FloatBuffer f23379j = com.google.android.exoplayer2.util.cdj.f7l8(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: q */
        private final int[] f23389q = new int[3];

        /* JADX INFO: renamed from: n */
        private final int[] f23387n = new int[3];

        /* JADX INFO: renamed from: g */
        private final int[] f23383g = new int[3];

        /* JADX INFO: renamed from: y */
        private final int[] f23391y = new int[3];

        /* JADX INFO: renamed from: s */
        private final AtomicReference<com.google.android.exoplayer2.decoder.kja0> f23390s = new AtomicReference<>();

        /* JADX INFO: renamed from: p */
        private final FloatBuffer[] f23388p = new FloatBuffer[3];

        public C3869k(GLSurfaceView gLSurfaceView) {
            this.f23386k = gLSurfaceView;
            for (int i2 = 0; i2 < 3; i2++) {
                int[] iArr = this.f23383g;
                this.f23391y[i2] = -1;
                iArr[i2] = -1;
            }
        }

        @RequiresNonNull({"program"})
        private void toq() {
            GLES20.glGenTextures(3, this.f23389q, 0);
            for (int i2 = 0; i2 < 3; i2++) {
                GLES20.glUniform1i(this.f23384h.f7l8(f23376c[i2]), i2);
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.f23389q[i2]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            com.google.android.exoplayer2.util.cdj.m13546n();
        }

        /* JADX INFO: renamed from: k */
        public void m13787k(com.google.android.exoplayer2.decoder.kja0 kja0Var) {
            com.google.android.exoplayer2.decoder.kja0 andSet = this.f23390s.getAndSet(kja0Var);
            if (andSet != null) {
                andSet.cdj();
            }
            this.f23386k.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            com.google.android.exoplayer2.decoder.kja0 andSet = this.f23390s.getAndSet(null);
            if (andSet == null && this.f23392z == null) {
                return;
            }
            if (andSet != null) {
                com.google.android.exoplayer2.decoder.kja0 kja0Var = this.f23392z;
                if (kja0Var != null) {
                    kja0Var.cdj();
                }
                this.f23392z = andSet;
            }
            com.google.android.exoplayer2.decoder.kja0 kja0Var2 = (com.google.android.exoplayer2.decoder.kja0) C3844k.f7l8(this.f23392z);
            float[] fArr = f23381r;
            int i2 = kja0Var2.f19575r;
            if (i2 == 1) {
                fArr = f23382t;
            } else if (i2 == 3) {
                fArr = f23380l;
            }
            GLES20.glUniformMatrix3fv(this.f23385i, 1, false, fArr, 0);
            int[] iArr = (int[]) C3844k.f7l8(kja0Var2.f19577t);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) C3844k.f7l8(kja0Var2.f19579z);
            int i3 = 0;
            while (i3 < 3) {
                int i4 = i3 == 0 ? kja0Var2.f19571h : (kja0Var2.f19571h + 1) / 2;
                GLES20.glActiveTexture(33984 + i3);
                GLES20.glBindTexture(3553, this.f23389q[i3]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i3], i4, 0, 6409, 5121, byteBufferArr[i3]);
                i3++;
            }
            int i5 = kja0Var2.f19574p;
            int i6 = (i5 + 1) / 2;
            int[] iArr2 = {i5, i6, i6};
            for (int i7 = 0; i7 < 3; i7++) {
                if (this.f23383g[i7] != iArr2[i7] || this.f23391y[i7] != iArr[i7]) {
                    C3844k.m13633s(iArr[i7] != 0);
                    float f2 = iArr2[i7] / iArr[i7];
                    this.f23388p[i7] = com.google.android.exoplayer2.util.cdj.f7l8(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f2, 0.0f, f2, 1.0f});
                    GLES20.glVertexAttribPointer(this.f23387n[i7], 2, 5126, false, 0, (Buffer) this.f23388p[i7]);
                    this.f23383g[i7] = iArr2[i7];
                    this.f23391y[i7] = iArr[i7];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            com.google.android.exoplayer2.util.cdj.m13546n();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            cdj.C3834q c3834q = new cdj.C3834q(f23378f, f23377e);
            this.f23384h = c3834q;
            c3834q.m13561s();
            int iM13559n = this.f23384h.m13559n("in_pos");
            GLES20.glEnableVertexAttribArray(iM13559n);
            GLES20.glVertexAttribPointer(iM13559n, 2, 5126, false, 0, (Buffer) f23379j);
            this.f23387n[0] = this.f23384h.m13559n("in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f23387n[0]);
            this.f23387n[1] = this.f23384h.m13559n("in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f23387n[1]);
            this.f23387n[2] = this.f23384h.m13559n("in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f23387n[2]);
            com.google.android.exoplayer2.util.cdj.m13546n();
            this.f23385i = this.f23384h.f7l8("mColorConversion");
            com.google.android.exoplayer2.util.cdj.m13546n();
            toq();
            com.google.android.exoplayer2.util.cdj.m13546n();
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    @Deprecated
    public InterfaceC3879p getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    @Override // com.google.android.exoplayer2.video.InterfaceC3879p
    public void setOutputBuffer(com.google.android.exoplayer2.decoder.kja0 kja0Var) {
        this.f23375k.m13787k(kja0Var);
    }

    public VideoDecoderGLSurfaceView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        C3869k c3869k = new C3869k(this);
        this.f23375k = c3869k;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c3869k);
        setRenderMode(0);
    }
}
