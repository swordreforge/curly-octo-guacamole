package com.miui.lockscreeninfo;

import android.graphics.Paint;
import android.text.TextPaint;
import zy.a9;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final Paint.FontMetricsInt f72124cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final float f72125f7l8;

    /* JADX INFO: renamed from: g */
    private final float f29444g;

    /* JADX INFO: renamed from: h */
    private int f29445h = 0;

    /* JADX INFO: renamed from: k */
    private final CharSequence f29446k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private float f72126kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int[] f72127ld6;

    /* JADX INFO: renamed from: n */
    private final int f29447n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f72128n7h;

    /* JADX INFO: renamed from: p */
    private float[] f29448p;

    /* JADX INFO: renamed from: q */
    private final int f29449q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private float f72129qrj;

    /* JADX INFO: renamed from: s */
    private int f29450s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final TextPaint f72130toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private float[] f72131x2;

    /* JADX INFO: renamed from: y */
    private float f29451y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f72132zy;

    public zy(@lvui CharSequence charSequence, @lvui TextPaint textPaint, @a9(from = 0) int i2, @a9(from = 0) int i3, float f2, float f3, float f4) {
        this.f29446k = charSequence;
        this.f72130toq = textPaint;
        this.f29449q = i2;
        this.f29447n = i3;
        this.f29444g = f2;
        this.f72125f7l8 = f3;
        this.f29451y = f4;
        this.f72124cdj = textPaint.getFontMetricsInt();
        n7h();
    }

    private boolean ld6(int i2) {
        return (C5118q.f7l8(i2) || C5118q.m17819h(i2) || C5118q.qrj(i2)) ? false : true;
    }

    private void n7h() {
        float fMeasureText;
        float fMeasureText2;
        this.f72126kja0 = 0.0f;
        this.f29450s = 0;
        this.f29448p = new float[this.f29446k.length() + 1];
        this.f72127ld6 = new int[this.f29446k.length() + 1];
        this.f72131x2 = new float[this.f29446k.length() + 1];
        this.f72128n7h = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        boolean z2 = true;
        while (i2 < this.f29446k.length()) {
            int iCodePointAt = Character.codePointAt(this.f29446k, i2);
            int iCharCount = Character.charCount(iCodePointAt);
            boolean zIsWhitespace = Character.isWhitespace(iCodePointAt);
            boolean zLd6 = ld6(iCodePointAt);
            if (zLd6) {
                Paint.FontMetricsInt fontMetricsInt = this.f72124cdj;
                fMeasureText = fontMetricsInt.descent - fontMetricsInt.ascent;
                TextPaint textPaint = this.f72130toq;
                fMeasureText2 = zIsWhitespace ? textPaint.measureText("一") / 2.0f : textPaint.measureText(this.f29446k, i2, i2 + iCharCount);
                int i5 = this.f72124cdj.descent;
            } else if (this.f29446k.charAt(i2) == '\n') {
                fMeasureText = this.f72130toq.measureText("一");
                fMeasureText2 = 0.0f;
            } else {
                fMeasureText = C5118q.m17819h(iCodePointAt) ? this.f72130toq.measureText("一") : this.f72130toq.measureText(this.f29446k, i2, i2 + iCharCount);
                Paint.FontMetricsInt fontMetricsInt2 = this.f72124cdj;
                fMeasureText2 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
            }
            float fM17838q = ((z2 || zLd6) ? fMeasureText2 : (!z2 ? (m17838q(zLd6) - 1.0f) * f2 : 0.0f) + fMeasureText2) + f3;
            if (fM17838q > ((float) this.f29447n) || (this.f29446k.charAt(i2) == '\n' && i2 != 0)) {
                if (this.f72126kja0 < f3) {
                    this.f72126kja0 = f3;
                }
                this.f72131x2[i3] = Math.min(f3, this.f29447n);
                if (this.f29446k.charAt(i2) == '\n') {
                    this.f72127ld6[i3] = i2;
                } else {
                    this.f72127ld6[i3] = i2 - i4;
                }
                this.f72132zy = (int) (this.f72132zy + this.f29448p[i3]);
                i3++;
                f3 = fMeasureText2;
            } else {
                if (this.f72126kja0 < fM17838q) {
                    this.f72126kja0 = fM17838q;
                }
                z2 = false;
                f3 = fM17838q;
            }
            float[] fArr = this.f29448p;
            if (fArr[i3] < fMeasureText) {
                fArr[i3] = fMeasureText;
                this.f72128n7h = Math.max(fMeasureText, this.f72128n7h);
            }
            i2 += iCharCount;
            if (i2 >= this.f29446k.length()) {
                this.f72132zy = (int) (this.f72132zy + this.f29448p[i3]);
                this.f72131x2[i3] = Math.min(f3, this.f29447n);
            }
            f2 = fMeasureText2;
            i4 = iCharCount;
        }
        if (this.f29446k.length() > 0) {
            this.f29450s = i3 + 1;
            this.f72127ld6[i3] = this.f29446k.length() - i4;
        }
        int i6 = this.f29450s;
        if (i6 > 1) {
            this.f72132zy = (int) m17839s(i6);
        }
        this.f72129qrj = this.f72132zy;
        this.f29445h = x2();
    }

    private float zy(int i2, float f2) {
        if (i2 < 1) {
            return 0.0f;
        }
        float f3 = this.f29448p[0];
        for (int i3 = 1; i3 < i2; i3++) {
            f3 = f3 + ((this.f29444g - 1.0f) * this.f29448p[i3]) + this.f72125f7l8 + f2;
        }
        return f3;
    }

    public int f7l8(int i2) {
        int[] iArr = this.f72127ld6;
        if (i2 >= iArr.length || i2 < 0) {
            return 0;
        }
        return iArr[i2];
    }

    /* JADX INFO: renamed from: g */
    public int m17834g() {
        return this.f29450s;
    }

    /* JADX INFO: renamed from: k */
    public float m17835k() {
        return this.f72126kja0;
    }

    /* JADX INFO: renamed from: n */
    public float[] m17836n(CharSequence charSequence, int i2) {
        float fMeasureText;
        float fMeasureText2;
        float[] fArr = {0.0f, 0.0f};
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        int iCharCount = Character.charCount(iCodePointAt);
        boolean zIsWhitespace = Character.isWhitespace(iCodePointAt);
        if (ld6(iCodePointAt)) {
            Paint.FontMetricsInt fontMetricsInt = this.f72124cdj;
            fMeasureText = fontMetricsInt.descent - fontMetricsInt.ascent;
            fMeasureText2 = zIsWhitespace ? this.f72130toq.measureText("一") / 2.0f : this.f72130toq.measureText(this.f29446k, i2, iCharCount + i2);
            int i3 = this.f72124cdj.descent;
        } else if (charSequence.charAt(i2) == '\n') {
            fMeasureText = this.f72130toq.measureText("一");
            fMeasureText2 = 0.0f;
        } else {
            fMeasureText = C5118q.m17819h(iCodePointAt) ? this.f72130toq.measureText("一") : this.f72130toq.measureText(charSequence, i2, iCharCount + i2);
            Paint.FontMetricsInt fontMetricsInt2 = this.f72124cdj;
            fMeasureText2 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
        }
        fArr[0] = fMeasureText;
        fArr[1] = fMeasureText2;
        return fArr;
    }

    /* JADX INFO: renamed from: p */
    public int m17837p() {
        return this.f29445h;
    }

    /* JADX INFO: renamed from: q */
    public float m17838q(boolean z2) {
        return z2 ? this.f29451y + 0.2f : this.f29451y;
    }

    public float qrj() {
        return this.f72129qrj;
    }

    /* JADX INFO: renamed from: s */
    public float m17839s(int i2) {
        return zy(i2, this.f72128n7h);
    }

    public float toq(int i2) {
        float[] fArr = this.f72131x2;
        if (i2 >= fArr.length || i2 < 0) {
            return 0.0f;
        }
        return fArr[i2];
    }

    public int x2() {
        int i2 = this.f29450s;
        while (this.f72129qrj > this.f29449q && i2 > 0) {
            i2--;
            this.f72129qrj = m17839s(i2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: y */
    public float m17840y() {
        return this.f72128n7h;
    }
}
