package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.C0541p;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: ShadowRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class toq {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f67799ld6 = 0;

    /* JADX INFO: renamed from: p */
    private static final int f24910p = 20;

    /* JADX INFO: renamed from: s */
    private static final int f24911s = 68;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Path f67803f7l8;

    /* JADX INFO: renamed from: g */
    private int f24912g;

    /* JADX INFO: renamed from: k */
    @lvui
    private final Paint f24913k;

    /* JADX INFO: renamed from: n */
    private int f24914n;

    /* JADX INFO: renamed from: q */
    private int f24915q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final Paint f67804toq;

    /* JADX INFO: renamed from: y */
    private Paint f24916y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    private final Paint f67805zy;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int[] f67802x2 = new int[3];

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final float[] f67801qrj = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int[] f67800n7h = new int[4];

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final float[] f67798kja0 = {0.0f, 0.0f, 0.5f, 1.0f};

    public toq() {
        this(-16777216);
    }

    /* JADX INFO: renamed from: k */
    public void m14771k(@lvui Canvas canvas, @dd Matrix matrix, @lvui RectF rectF, int i2, float f2, float f3) {
        boolean z2 = f3 < 0.0f;
        Path path = this.f67803f7l8;
        if (z2) {
            int[] iArr = f67800n7h;
            iArr[0] = 0;
            iArr[1] = this.f24912g;
            iArr[2] = this.f24914n;
            iArr[3] = this.f24915q;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            int[] iArr2 = f67800n7h;
            iArr2[0] = 0;
            iArr2[1] = this.f24915q;
            iArr2[2] = this.f24914n;
            iArr2[3] = this.f24912g;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i2 / fWidth);
        float[] fArr = f67798kja0;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        this.f67804toq.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f67800n7h, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f24916y);
        }
        canvas.drawArc(rectF, f2, f3, true, this.f67804toq);
        canvas.restore();
    }

    /* JADX INFO: renamed from: q */
    public void m14772q(int i2) {
        this.f24915q = C0541p.m2542t(i2, 68);
        this.f24914n = C0541p.m2542t(i2, 20);
        this.f24912g = C0541p.m2542t(i2, 0);
        this.f24913k.setColor(this.f24915q);
    }

    public void toq(@lvui Canvas canvas, @dd Matrix matrix, @lvui RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = f67802x2;
        iArr[0] = this.f24912g;
        iArr[1] = this.f24914n;
        iArr[2] = this.f24915q;
        Paint paint = this.f67805zy;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, f67801qrj, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f67805zy);
        canvas.restore();
    }

    @lvui
    public Paint zy() {
        return this.f24913k;
    }

    public toq(int i2) {
        this.f67803f7l8 = new Path();
        this.f24916y = new Paint();
        this.f24913k = new Paint();
        m14772q(i2);
        this.f24916y.setColor(0);
        Paint paint = new Paint(4);
        this.f67804toq = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f67805zy = new Paint(paint);
    }
}
