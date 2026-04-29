package com.miui.lockscreeninfo;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class VerticalTextView extends BaseTextView {

    /* JADX INFO: renamed from: e */
    protected static final String f29422e = VerticalTextView.class.getName();

    /* JADX INFO: renamed from: c */
    private zy f29423c;

    /* JADX INFO: renamed from: f */
    private int f29424f;

    /* JADX INFO: renamed from: l */
    private float f29425l;

    /* JADX INFO: renamed from: r */
    private float f29426r;

    /* JADX INFO: renamed from: t */
    private float f29427t;

    /* JADX INFO: renamed from: z */
    private boolean f29428z;

    public VerticalTextView(Context context) {
        this(context, null);
    }

    public VerticalTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public VerticalTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f29428z = true;
        this.f29425l = 1.0f;
        this.f29424f = 0;
    }

    private float getCJKVerticalSpacingMultiplier() {
        return this.f29425l;
    }

    /* JADX INFO: renamed from: h */
    private boolean m17816h(int i2) {
        return (C5118q.f7l8(i2) || C5118q.m17819h(i2) || C5118q.qrj(i2)) ? false : true;
    }

    private int kja0(int i2) {
        if (i2 > 0) {
            return ((int) getLineSpacingMultiplier()) * i2;
        }
        return 0;
    }

    private void ld6(Canvas canvas, String str, float f2, int i2) {
        float paddingLeft = getPaddingLeft();
        char[] charArray = str.toCharArray();
        float measuredWidth = (((getMeasuredWidth() - f2) - getPaddingLeft()) - getPaddingRight()) / (charArray.length - 1);
        int i3 = 0;
        while (i3 < charArray.length) {
            int iCharCount = Character.charCount(Character.codePointAt(charArray, i3));
            float desiredWidth = Layout.getDesiredWidth(String.valueOf(charArray[i3]), getPaint());
            if (qrj(charArray[i3])) {
                canvas.drawText(charArray, i3, iCharCount, paddingLeft, i2, getPaint());
            }
            paddingLeft += desiredWidth + measuredWidth;
            i3 += iCharCount;
        }
    }

    private float n7h(int i2) {
        return (getGravity() & 112) == 48 ? getPaddingTop() : (getGravity() & 112) == 80 ? (getHeight() - getPaddingBottom()) - this.f29423c.toq(i2) : (getGravity() & 112) == 16 ? (((getHeight() - getPaddingBottom()) + getPaddingTop()) - this.f29423c.toq(i2)) / 2.0f : getPaddingTop();
    }

    /* JADX INFO: renamed from: p */
    private void m17817p(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        zy zyVar = new zy(getText(), getPaint(), (size - getPaddingLeft()) - getPaddingRight(), (size2 - getPaddingTop()) - getPaddingBottom(), getLineSpacingMultiplier(), getLineSpacingExtra(), getCJKVerticalSpacingMultiplier());
        this.f29423c = zyVar;
        float fQrj = zyVar.qrj();
        float paddingLeft = fQrj + getPaddingLeft() + getPaddingRight();
        float fMin = 2.1474836E9f;
        float fMin2 = mode2 == 1073741824 ? size2 : mode2 == Integer.MIN_VALUE ? Math.min(this.f29423c.m17835k(), size2) : 2.1474836E9f;
        if (mode == 1073741824) {
            fMin = size;
        } else if (mode == Integer.MIN_VALUE) {
            fMin = Math.min(paddingLeft, size);
        }
        this.f29426r = fMin2;
        this.f29427t = fMin;
    }

    private boolean qrj(char c2) {
        return c2 != '\n';
    }

    @Override // android.widget.TextView
    public int getGravity() {
        return this.f29424f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        return getText().toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (getLayout() != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0.m17837p() <= 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getShowText() {
        /*
            r2 = this;
            boolean r0 = r2.x2()
            java.lang.String r1 = ""
            if (r0 == 0) goto L1c
            com.miui.lockscreeninfo.zy r0 = r2.f29423c
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r0 = r0.m17837p()
            if (r0 <= 0) goto L23
        L13:
            java.lang.CharSequence r0 = r2.getText()
            java.lang.String r0 = r0.toString()
            return r0
        L1c:
            android.text.Layout r0 = r2.getLayout()
            if (r0 == 0) goto L23
            goto L13
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.lockscreeninfo.VerticalTextView.getShowText():java.lang.String");
    }

    @Override // com.miui.lockscreeninfo.BaseTextView, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        float measuredWidth;
        int i3;
        float f2;
        float f3;
        Paint.FontMetricsInt fontMetricsInt;
        float f4;
        int i4;
        int i5;
        int i6;
        String str;
        boolean z2;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        String showText = getShowText();
        char[] charArray = showText.toCharArray();
        if (this.f29428z) {
            int iM17837p = this.f29423c.m17837p();
            int iM17834g = this.f29423c.m17834g();
            if (iM17834g == 0) {
                return;
            }
            canvas.save();
            float paddingLeft = 0.0f;
            zy zyVar = this.f29423c;
            float fM17839s = zyVar.m17839s(zyVar.m17837p());
            float fM17840y = this.f29423c.m17840y();
            if (getGravity() == 102) {
                paddingLeft = (getWidth() - getPaddingRight()) - fM17840y;
            } else if (getGravity() == 101) {
                paddingLeft = (fM17839s + getPaddingLeft()) - fM17840y;
            }
            float fN7h = n7h(0);
            float lineSpacingMultiplier = ((getLineSpacingMultiplier() - 1.0f) * fM17840y) + getLineSpacingExtra();
            float f5 = paddingLeft;
            float f6 = f5;
            float fM17838q = fN7h;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= charArray.length) {
                    i2 = iSaveLayer;
                    break;
                }
                int iCodePointAt = Character.codePointAt(charArray, i8);
                int iCharCount = Character.charCount(iCodePointAt);
                boolean zM17816h = m17816h(iCodePointAt);
                int iSave = canvas.save();
                if (zM17816h) {
                    canvas.rotate(90.0f, f5, fM17838q);
                }
                float f7 = this.f29423c.m17836n(showText, i8)[1];
                float f8 = fM17838q - (zM17816h ? fontMetricsInt2.descent : fontMetricsInt2.ascent);
                if (qrj(charArray[i8])) {
                    fontMetricsInt = fontMetricsInt2;
                    i4 = iSave;
                    str = showText;
                    z2 = zM17816h;
                    i2 = iSaveLayer;
                    i5 = i7;
                    i3 = i8;
                    f2 = fM17838q;
                    f3 = f5;
                    f4 = f7;
                    i6 = iM17834g;
                    canvas.drawText(charArray, i8, iCharCount, f5, f8, paint);
                } else {
                    i3 = i8;
                    f2 = fM17838q;
                    f3 = f5;
                    i2 = iSaveLayer;
                    fontMetricsInt = fontMetricsInt2;
                    f4 = f7;
                    i4 = iSave;
                    i5 = i7;
                    i6 = iM17834g;
                    str = showText;
                    z2 = zM17816h;
                }
                canvas.restoreToCount(i4);
                i8 = i3 + iCharCount;
                if (!(i8 < charArray.length)) {
                    i7 = i5;
                    fM17838q = f2;
                } else if (!(i3 + 1 > this.f29423c.f7l8(i5)) || (i7 = i5 + 1) >= i6) {
                    fM17838q = f2 + (z2 ? f4 : ((this.f29423c.m17838q(z2) - 1.0f) * f4) + f4);
                    i7 = i5;
                } else {
                    if (i7 >= iM17837p) {
                        break;
                    }
                    f6 -= lineSpacingMultiplier + fM17840y;
                    fM17838q = n7h(i7);
                    f5 = f6;
                    iM17834g = i6;
                    showText = str;
                    fontMetricsInt2 = fontMetricsInt;
                    iSaveLayer = i2;
                }
                f5 = f3;
                iM17834g = i6;
                showText = str;
                fontMetricsInt2 = fontMetricsInt;
                iSaveLayer = i2;
            }
        } else {
            i2 = iSaveLayer;
            String string = getText().toString();
            StaticLayout staticLayout = new StaticLayout(string.replaceAll(" ", "i"), new TextPaint(getPaint()), (getWidth() - getPaddingRight()) - getPaddingLeft(), Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.1f, true);
            int iMin = Math.min(staticLayout.getLineCount(), getMaxLines());
            for (int i9 = 0; i9 < iMin; i9++) {
                int lineBaseline = staticLayout.getLineBaseline(i9) + getPaddingTop() + kja0(i9);
                String strReplaceAll = string.substring(staticLayout.getLineStart(i9), staticLayout.getLineVisibleEnd(i9)).replaceAll("\n", "");
                float fMeasureText = getPaint().measureText(strReplaceAll);
                if (getGravity() == 103) {
                    canvas.drawText(strReplaceAll, getPaddingLeft(), lineBaseline, getPaint());
                } else {
                    if (getGravity() == 105) {
                        measuredWidth = (getMeasuredWidth() - getPaddingRight()) - fMeasureText;
                    } else if (getGravity() == 104) {
                        measuredWidth = (getMeasuredWidth() - fMeasureText) / 2.0f;
                    } else if (getGravity() == 106) {
                        ld6(canvas, strReplaceAll, fMeasureText, lineBaseline);
                    }
                    canvas.drawText(strReplaceAll, measuredWidth, lineBaseline, getPaint());
                }
            }
        }
        canvas.restore();
        canvas.restoreToCount(i2);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.f29428z) {
            setPadding(getPaddingLeft(), getLayout().getTopPadding(), getPaddingRight(), getPaddingBottom());
        } else {
            m17817p(i2, i3);
            setMeasuredDimension((int) this.f29427t, (int) this.f29426r);
        }
    }

    public void setCJKVerticalSpace(float f2) {
        this.f29425l = f2;
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        boolean z2;
        switch (i2) {
            case 101:
            case 102:
                this.f29424f = i2;
                z2 = true;
                break;
            case 103:
            case 104:
            case 105:
            case 106:
                this.f29424f = i2;
                z2 = false;
                break;
            default:
                super.setGravity(this.f29424f);
        }
        setVerticalMode(z2);
        super.setGravity(this.f29424f);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
    }

    public void setVerticalMode(boolean z2) {
        this.f29428z = z2;
        requestLayout();
    }

    public boolean x2() {
        return this.f29428z;
    }
}
