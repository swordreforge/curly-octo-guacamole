package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import zy.dd;
import zy.ek5k;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.shape.h */
/* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public class C4103h {

    /* JADX INFO: renamed from: k */
    private final cdj[] f24939k = new cdj[4];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Matrix[] f67827toq = new Matrix[4];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Matrix[] f67829zy = new Matrix[4];

    /* JADX INFO: renamed from: q */
    private final PointF f24942q = new PointF();

    /* JADX INFO: renamed from: n */
    private final Path f24940n = new Path();

    /* JADX INFO: renamed from: g */
    private final Path f24938g = new Path();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final cdj f67825f7l8 = new cdj();

    /* JADX INFO: renamed from: y */
    private final float[] f24944y = new float[2];

    /* JADX INFO: renamed from: s */
    private final float[] f24943s = new float[2];

    /* JADX INFO: renamed from: p */
    private final Path f24941p = new Path();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final Path f67826ld6 = new Path();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f67828x2 = true;

    /* JADX INFO: renamed from: com.google.android.material.shape.h$k */
    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    private static class k {

        /* JADX INFO: renamed from: k */
        static final C4103h f24945k = new C4103h();

        private k() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.h$toq */
    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo14815k(cdj cdjVar, Matrix matrix, int i2);

        void toq(cdj cdjVar, Matrix matrix, int i2);
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.h$zy */
    /* JADX INFO: compiled from: ShapeAppearancePathProvider.java */
    static final class zy {

        /* JADX INFO: renamed from: k */
        @lvui
        public final kja0 f24946k;

        /* JADX INFO: renamed from: n */
        public final float f24947n;

        /* JADX INFO: renamed from: q */
        @dd
        public final toq f24948q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        public final Path f67830toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        public final RectF f67831zy;

        zy(@lvui kja0 kja0Var, float f2, RectF rectF, @dd toq toqVar, Path path) {
            this.f24948q = toqVar;
            this.f24946k = kja0Var;
            this.f24947n = f2;
            this.f67831zy = rectF;
            this.f67830toq = path;
        }
    }

    public C4103h() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f24939k[i2] = new cdj();
            this.f67827toq[i2] = new Matrix();
            this.f67829zy[i2] = new Matrix();
        }
    }

    private InterfaceC4109q f7l8(int i2, @lvui kja0 kja0Var) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? kja0Var.m14823i() : kja0Var.ki() : kja0Var.m14824p() : kja0Var.x2();
    }

    /* JADX INFO: renamed from: g */
    private void m14808g(int i2, @lvui RectF rectF, @lvui PointF pointF) {
        if (i2 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i2 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i2 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* JADX INFO: renamed from: k */
    private float m14809k(int i2) {
        return (i2 + 1) * 90;
    }

    private void kja0(int i2) {
        this.f24944y[0] = this.f24939k[i2].m14780p();
        this.f24944y[1] = this.f24939k[i2].ld6();
        this.f67827toq[i2].mapPoints(this.f24944y);
        float fM14809k = m14809k(i2);
        this.f67829zy[i2].reset();
        Matrix matrix = this.f67829zy[i2];
        float[] fArr = this.f24944y;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f67829zy[i2].preRotate(fM14809k);
    }

    @ek5k
    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public static C4103h ld6() {
        return k.f24945k;
    }

    /* JADX INFO: renamed from: p */
    private f7l8 m14810p(int i2, @lvui kja0 kja0Var) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? kja0Var.kja0() : kja0Var.m14822h() : kja0Var.n7h() : kja0Var.m14826y();
    }

    private void qrj(@lvui zy zyVar, int i2) {
        m14812y(i2, zyVar.f24946k).zy(this.f24939k[i2], 90.0f, zyVar.f24947n, zyVar.f67831zy, f7l8(i2, zyVar.f24946k));
        float fM14809k = m14809k(i2);
        this.f67827toq[i2].reset();
        m14808g(i2, zyVar.f67831zy, this.f24942q);
        Matrix matrix = this.f67827toq[i2];
        PointF pointF = this.f24942q;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f67827toq[i2].preRotate(fM14809k);
    }

    /* JADX INFO: renamed from: s */
    private float m14811s(@lvui RectF rectF, int i2) {
        float[] fArr = this.f24944y;
        cdj cdjVar = this.f24939k[i2];
        fArr[0] = cdjVar.f67809zy;
        fArr[1] = cdjVar.f24921q;
        this.f67827toq[i2].mapPoints(fArr);
        return (i2 == 1 || i2 == 3) ? Math.abs(rectF.centerX() - this.f24944y[0]) : Math.abs(rectF.centerY() - this.f24944y[1]);
    }

    private void toq(@lvui zy zyVar, int i2) {
        this.f24944y[0] = this.f24939k[i2].x2();
        this.f24944y[1] = this.f24939k[i2].qrj();
        this.f67827toq[i2].mapPoints(this.f24944y);
        if (i2 == 0) {
            Path path = zyVar.f67830toq;
            float[] fArr = this.f24944y;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = zyVar.f67830toq;
            float[] fArr2 = this.f24944y;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f24939k[i2].m14781q(this.f67827toq[i2], zyVar.f67830toq);
        toq toqVar = zyVar.f24948q;
        if (toqVar != null) {
            toqVar.mo14815k(this.f24939k[i2], this.f67827toq[i2], i2);
        }
    }

    @hyr(19)
    private boolean x2(Path path, int i2) {
        this.f67826ld6.reset();
        this.f24939k[i2].m14781q(this.f67827toq[i2], this.f67826ld6);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f67826ld6.computeBounds(rectF, true);
        path.op(this.f67826ld6, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    private C4107n m14812y(int i2, @lvui kja0 kja0Var) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? kja0Var.t8r() : kja0Var.cdj() : kja0Var.m14825s() : kja0Var.ld6();
    }

    private void zy(@lvui zy zyVar, int i2) {
        int i3 = (i2 + 1) % 4;
        this.f24944y[0] = this.f24939k[i2].m14780p();
        this.f24944y[1] = this.f24939k[i2].ld6();
        this.f67827toq[i2].mapPoints(this.f24944y);
        this.f24943s[0] = this.f24939k[i3].x2();
        this.f24943s[1] = this.f24939k[i3].qrj();
        this.f67827toq[i3].mapPoints(this.f24943s);
        float f2 = this.f24944y[0];
        float[] fArr = this.f24943s;
        float fMax = Math.max(((float) Math.hypot(f2 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fM14811s = m14811s(zyVar.f67831zy, i2);
        this.f67825f7l8.m14777h(0.0f, 0.0f);
        f7l8 f7l8VarM14810p = m14810p(i2, zyVar.f24946k);
        f7l8VarM14810p.mo14133q(fMax, fM14811s, zyVar.f24947n, this.f67825f7l8);
        this.f24941p.reset();
        this.f67825f7l8.m14781q(this.f67829zy[i2], this.f24941p);
        if (this.f67828x2 && (f7l8VarM14810p.mo14806k() || x2(this.f24941p, i2) || x2(this.f24941p, i3))) {
            Path path = this.f24941p;
            path.op(path, this.f24938g, Path.Op.DIFFERENCE);
            this.f24944y[0] = this.f67825f7l8.x2();
            this.f24944y[1] = this.f67825f7l8.qrj();
            this.f67829zy[i2].mapPoints(this.f24944y);
            Path path2 = this.f24940n;
            float[] fArr2 = this.f24944y;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f67825f7l8.m14781q(this.f67829zy[i2], this.f24940n);
        } else {
            this.f67825f7l8.m14781q(this.f67829zy[i2], zyVar.f67830toq);
        }
        toq toqVar = zyVar.f24948q;
        if (toqVar != null) {
            toqVar.toq(this.f67825f7l8, this.f67829zy[i2], i2);
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: n */
    public void m14813n(kja0 kja0Var, float f2, RectF rectF, toq toqVar, @lvui Path path) {
        path.rewind();
        this.f24940n.rewind();
        this.f24938g.rewind();
        this.f24938g.addRect(rectF, Path.Direction.CW);
        zy zyVar = new zy(kja0Var, f2, rectF, toqVar, path);
        for (int i2 = 0; i2 < 4; i2++) {
            qrj(zyVar, i2);
            kja0(i2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            toq(zyVar, i3);
            zy(zyVar, i3);
        }
        path.close();
        this.f24940n.close();
        if (this.f24940n.isEmpty()) {
            return;
        }
        path.op(this.f24940n, Path.Op.UNION);
    }

    void n7h(boolean z2) {
        this.f67828x2 = z2;
    }

    /* JADX INFO: renamed from: q */
    public void m14814q(kja0 kja0Var, float f2, RectF rectF, @lvui Path path) {
        m14813n(kja0Var, f2, rectF, null, path);
    }
}
