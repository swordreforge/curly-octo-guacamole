package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.C3844k;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: SubtitlePainter.java */
/* JADX INFO: loaded from: classes2.dex */
final class x9kr {

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final float f66717d2ok = 0.125f;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final String f66718eqxt = "SubtitlePainter";

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private StaticLayout f66719a9;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private float f66720cdj;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private int f66721d3;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final Paint f66722f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f66723fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private StaticLayout f66724fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private float f66725fu4;

    /* JADX INFO: renamed from: g */
    private final TextPaint f22857g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private int f66726gvn7;

    /* JADX INFO: renamed from: h */
    private int f22858h;

    /* JADX INFO: renamed from: i */
    private int f22859i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private int f66727jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private int f66728jp0y;

    /* JADX INFO: renamed from: k */
    private final float f22860k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private float f66729ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private float f66730kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @zy.dd
    private Bitmap f66731ld6;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private int f66732mcp;

    /* JADX INFO: renamed from: n */
    private final float f22861n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f66733n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f66734ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private float f66735o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private Rect f66736oc;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private Layout.Alignment f22862p;

    /* JADX INFO: renamed from: q */
    private final float f22863q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f66737qrj;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private CharSequence f22864s;

    /* JADX INFO: renamed from: t */
    private int f22865t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f66738t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f66739toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private int f66740wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private float f66741x2;

    /* JADX INFO: renamed from: y */
    private final Paint f22866y;

    /* JADX INFO: renamed from: z */
    private float f22867z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f66742zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final float f66743zy;

    public x9kr(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f22861n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f22863q = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f22860k = fRound;
        this.f66739toq = fRound;
        this.f66743zy = fRound;
        TextPaint textPaint = new TextPaint();
        this.f22857g = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f66722f7l8 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f22866y = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueText"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f7l8() {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.x9kr.f7l8():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap"})
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m13344g() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f66731ld6
            int r1 = r7.f66732mcp
            int r2 = r7.f66740wvg
            int r1 = r1 - r2
            int r3 = r7.f66727jk
            int r4 = r7.f22865t
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f66730kja0
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f66741x2
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f66720cdj
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f66729ki
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f22858h
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f66733n7h
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f66736oc = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.x9kr.m13344g():void");
    }

    /* JADX INFO: renamed from: k */
    private static boolean m13345k(@zy.dd CharSequence charSequence, @zy.dd CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* JADX INFO: renamed from: n */
    private void m13346n(Canvas canvas) {
        StaticLayout staticLayout = this.f66719a9;
        StaticLayout staticLayout2 = this.f66724fti;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f66728jp0y, this.f66726gvn7);
        if (Color.alpha(this.f66723fn3e) > 0) {
            this.f66722f7l8.setColor(this.f66723fn3e);
            canvas.drawRect(-this.f66721d3, 0.0f, staticLayout.getWidth() + this.f66721d3, staticLayout.getHeight(), this.f66722f7l8);
        }
        int i2 = this.f66734ni7;
        if (i2 == 1) {
            this.f22857g.setStrokeJoin(Paint.Join.ROUND);
            this.f22857g.setStrokeWidth(this.f22860k);
            this.f22857g.setColor(this.f66742zurt);
            this.f22857g.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i2 == 2) {
            TextPaint textPaint = this.f22857g;
            float f2 = this.f66739toq;
            float f3 = this.f66743zy;
            textPaint.setShadowLayer(f2, f3, f3, this.f66742zurt);
        } else if (i2 == 3 || i2 == 4) {
            boolean z2 = i2 == 3;
            int i3 = z2 ? -1 : this.f66742zurt;
            int i4 = z2 ? this.f66742zurt : -1;
            float f4 = this.f66739toq / 2.0f;
            this.f22857g.setColor(this.f66738t8r);
            this.f22857g.setStyle(Paint.Style.FILL);
            float f5 = -f4;
            this.f22857g.setShadowLayer(this.f66739toq, f5, f5, i3);
            staticLayout2.draw(canvas);
            this.f22857g.setShadowLayer(this.f66739toq, f4, f4, i4);
        }
        this.f22857g.setColor(this.f66738t8r);
        this.f22857g.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f22857g.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: q */
    private void m13347q(Canvas canvas, boolean z2) {
        if (z2) {
            m13346n(canvas);
            return;
        }
        C3844k.f7l8(this.f66736oc);
        C3844k.f7l8(this.f66731ld6);
        zy(canvas);
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    private void zy(Canvas canvas) {
        canvas.drawBitmap(this.f66731ld6, (Rect) null, this.f66736oc, this.f22866y);
    }

    public void toq(com.google.android.exoplayer2.text.toq toqVar, C3760n c3760n, float f2, float f3, float f4, Canvas canvas, int i2, int i3, int i4, int i5) {
        boolean z2 = toqVar.f21995g == null;
        int i6 = -16777216;
        if (z2) {
            if (TextUtils.isEmpty(toqVar.f21999k)) {
                return;
            } else {
                i6 = toqVar.f22004r ? toqVar.f22000l : c3760n.f66709zy;
            }
        }
        if (m13345k(this.f22864s, toqVar.f21999k) && com.google.android.exoplayer2.util.lrht.zy(this.f22862p, toqVar.f22003q) && this.f66731ld6 == toqVar.f21995g && this.f66741x2 == toqVar.f22007y && this.f66737qrj == toqVar.f22005s && com.google.android.exoplayer2.util.lrht.zy(Integer.valueOf(this.f66733n7h), Integer.valueOf(toqVar.f22002p)) && this.f66730kja0 == toqVar.f21996h && com.google.android.exoplayer2.util.lrht.zy(Integer.valueOf(this.f22858h), Integer.valueOf(toqVar.f21997i)) && this.f66720cdj == toqVar.f22008z && this.f66729ki == toqVar.f22006t && this.f66738t8r == c3760n.f22827k && this.f22859i == c3760n.f66708toq && this.f66723fn3e == i6 && this.f66734ni7 == c3760n.f22829q && this.f66742zurt == c3760n.f22828n && com.google.android.exoplayer2.util.lrht.zy(this.f22857g.getTypeface(), c3760n.f22826g) && this.f66725fu4 == f2 && this.f22867z == f3 && this.f66735o1t == f4 && this.f66740wvg == i2 && this.f22865t == i3 && this.f66732mcp == i4 && this.f66727jk == i5) {
            m13347q(canvas, z2);
            return;
        }
        this.f22864s = toqVar.f21999k;
        this.f22862p = toqVar.f22003q;
        this.f66731ld6 = toqVar.f21995g;
        this.f66741x2 = toqVar.f22007y;
        this.f66737qrj = toqVar.f22005s;
        this.f66733n7h = toqVar.f22002p;
        this.f66730kja0 = toqVar.f21996h;
        this.f22858h = toqVar.f21997i;
        this.f66720cdj = toqVar.f22008z;
        this.f66729ki = toqVar.f22006t;
        this.f66738t8r = c3760n.f22827k;
        this.f22859i = c3760n.f66708toq;
        this.f66723fn3e = i6;
        this.f66734ni7 = c3760n.f22829q;
        this.f66742zurt = c3760n.f22828n;
        this.f22857g.setTypeface(c3760n.f22826g);
        this.f66725fu4 = f2;
        this.f22867z = f3;
        this.f66735o1t = f4;
        this.f66740wvg = i2;
        this.f22865t = i3;
        this.f66732mcp = i4;
        this.f66727jk = i5;
        if (z2) {
            C3844k.f7l8(this.f22864s);
            f7l8();
        } else {
            C3844k.f7l8(this.f66731ld6);
            m13344g();
        }
        m13347q(canvas, z2);
    }
}
