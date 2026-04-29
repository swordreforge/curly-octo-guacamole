package com.miui.keyguardtemplate.smartframe;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.core.content.C0498q;
import com.miui.keyguardtemplate.C5112s;
import com.miui.keyguardtemplate.toq;
import zy.a9;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class SmartFrameView extends View {

    /* JADX INFO: renamed from: a */
    public static final int f29367a = 5;

    /* JADX INFO: renamed from: b */
    public static final int f29368b = 4;

    /* JADX INFO: renamed from: j */
    public static final int f29369j = 1;

    /* JADX INFO: renamed from: m */
    public static final int f29370m = 3;

    /* JADX INFO: renamed from: o */
    public static final int f29371o = 2;

    /* JADX INFO: renamed from: x */
    public static final int f29372x = 6;

    /* JADX INFO: renamed from: c */
    private int f29373c;

    /* JADX INFO: renamed from: e */
    private InterfaceC5113k f29374e;

    /* JADX INFO: renamed from: f */
    private int f29375f;

    /* JADX INFO: renamed from: g */
    private Drawable f29376g;

    /* JADX INFO: renamed from: h */
    private int f29377h;

    /* JADX INFO: renamed from: i */
    private int f29378i;

    /* JADX INFO: renamed from: k */
    private SparseIntArray f29379k;

    /* JADX INFO: renamed from: l */
    private int f29380l;

    /* JADX INFO: renamed from: n */
    private Drawable f29381n;

    /* JADX INFO: renamed from: p */
    private int f29382p;

    /* JADX INFO: renamed from: q */
    private int f29383q;

    /* JADX INFO: renamed from: r */
    private int f29384r;

    /* JADX INFO: renamed from: s */
    private Xfermode f29385s;

    /* JADX INFO: renamed from: t */
    private int f29386t;

    /* JADX INFO: renamed from: y */
    private Paint f29387y;

    /* JADX INFO: renamed from: z */
    private int f29388z;

    /* JADX INFO: renamed from: com.miui.keyguardtemplate.smartframe.SmartFrameView$k */
    public interface InterfaceC5113k {
        /* JADX INFO: renamed from: k */
        void m17801k(int i2, int i3, int i4, int i5);
    }

    public SmartFrameView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m17800k() {
        int i2;
        float fM17797k = C5112s.m17797k(getContext());
        this.f29378i = (int) (getContext().getResources().getDimensionPixelSize(toq.C5114k.f29392q) * fM17797k);
        int dimensionPixelSize = (int) (getContext().getResources().getDimensionPixelSize(toq.C5114k.f29391n) * fM17797k);
        int dimensionPixelSize2 = (int) (getContext().getResources().getDimensionPixelSize(toq.C5114k.f72101zy) * fM17797k);
        this.f29386t = (int) (getContext().getResources().getDimensionPixelSize(toq.C5114k.f29389g) * fM17797k);
        int dimensionPixelSize3 = (int) (getContext().getResources().getDimensionPixelSize(toq.C5114k.f72100toq) * fM17797k);
        this.f29384r = dimensionPixelSize3;
        this.f29388z = (Math.max(((this.f29375f - dimensionPixelSize) - dimensionPixelSize2) - dimensionPixelSize3, 0) / 2) + dimensionPixelSize;
        if (this.f29378i != 0 || (i2 = this.f29380l) == 0) {
            return;
        }
        this.f29378i = (i2 - this.f29386t) / 2;
    }

    public static boolean toq() {
        return TextUtils.equals(Build.DEVICE, "cetus");
    }

    public int getDrawableHeight() {
        return this.f29384r;
    }

    public int getDrawableLeft() {
        return this.f29378i;
    }

    public int getDrawableTop() {
        return this.f29388z;
    }

    public int getDrawableTranslateX() {
        return this.f29382p;
    }

    public int getDrawableTranslateY() {
        return this.f29377h;
    }

    public int getDrawableWidth() {
        return this.f29386t;
    }

    public int getFillColor() {
        return this.f29373c;
    }

    public int getRealDrawableLeft() {
        return this.f29378i + this.f29382p;
    }

    public int getRealDrawableTop() {
        return this.f29388z + this.f29377h;
    }

    public int getShape() {
        return this.f29383q;
    }

    public Drawable getShapeDrawable() {
        return this.f29381n;
    }

    public Drawable getStrokeDrawable() {
        return this.f29376g;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29374e = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.f29387y, 31);
        this.f29381n.setBounds(getRealDrawableLeft(), getRealDrawableTop(), getRealDrawableLeft() + this.f29386t, getRealDrawableTop() + this.f29384r);
        this.f29381n.draw(canvas);
        this.f29387y.setColor(this.f29373c);
        this.f29387y.setStyle(Paint.Style.FILL);
        this.f29387y.setXfermode(this.f29385s);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f29387y);
        this.f29387y.setXfermode(null);
        Drawable drawable = this.f29376g;
        if (drawable != null) {
            drawable.setBounds(getRealDrawableLeft(), getRealDrawableTop(), getRealDrawableLeft() + this.f29386t, getRealDrawableTop() + this.f29384r);
            this.f29376g.draw(canvas);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f29380l = i2;
        this.f29375f = i3;
        zy();
        InterfaceC5113k interfaceC5113k = this.f29374e;
        if (interfaceC5113k != null) {
            interfaceC5113k.m17801k(i2, i3, i4, i5);
        }
    }

    public void setDrawableHeight(int i2) {
        this.f29384r = i2;
    }

    public void setDrawableLeft(int i2) {
        this.f29378i = i2;
    }

    public void setDrawableTop(int i2) {
        this.f29388z = i2;
    }

    public void setDrawableTranslateX(int i2) {
        this.f29382p = i2;
    }

    public void setDrawableTranslateY(int i2) {
        this.f29377h = i2;
    }

    public void setDrawableWidth(int i2) {
        this.f29386t = i2;
    }

    public void setFillColor(int i2) {
        if (this.f29373c == i2) {
            return;
        }
        this.f29373c = i2;
        invalidate();
    }

    public void setShape(@a9(from = 1, to = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) int i2) {
        if (this.f29383q == i2) {
            return;
        }
        this.f29381n = C0498q.m2259s(getContext(), this.f29379k.get(i2));
        this.f29383q = i2;
        invalidate();
    }

    public void setShapeDrawable(Drawable drawable) {
        this.f29381n = drawable;
        invalidate();
    }

    public void setSmartFrameChangeListener(InterfaceC5113k interfaceC5113k) {
        this.f29374e = interfaceC5113k;
    }

    public void setStrokeDrawable(Drawable drawable) {
        this.f29376g = drawable;
    }

    public void zy() {
        m17800k();
        invalidate();
    }

    public SmartFrameView(Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmartFrameView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f29383q = 1;
        this.f29382p = 0;
        this.f29377h = 0;
        this.f29373c = -65536;
        this.f29374e = null;
        SparseIntArray sparseIntArray = new SparseIntArray(6);
        this.f29379k = sparseIntArray;
        int i3 = toq.C8028toq.f72104zy;
        sparseIntArray.append(1, i3);
        this.f29379k.append(2, toq.C8028toq.f29396q);
        this.f29379k.append(3, toq.C8028toq.f29395n);
        this.f29379k.append(4, toq.C8028toq.f29393g);
        this.f29379k.append(5, toq.C8028toq.f72102f7l8);
        this.f29379k.append(6, toq.C8028toq.f29397y);
        this.f29380l = getWidth();
        this.f29375f = getHeight();
        m17800k();
        this.f29385s = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.f29387y = new Paint();
        this.f29381n = C0498q.m2259s(context, i3);
    }
}
