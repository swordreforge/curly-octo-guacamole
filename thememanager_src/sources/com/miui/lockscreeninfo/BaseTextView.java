package com.miui.lockscreeninfo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.miui.lockscreeninfo.C5117k;
import com.miui.lockscreeninfo.model.SignatureInfo;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class BaseTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: h */
    protected SignatureInfo f29401h;

    /* JADX INFO: renamed from: i */
    private boolean f29402i;

    /* JADX INFO: renamed from: p */
    protected boolean f29403p;

    public BaseTextView(Context context) {
        super(context);
        this.f29403p = false;
        this.f29401h = null;
        this.f29402i = true;
    }

    public BaseTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29403p = false;
        this.f29401h = null;
        this.f29402i = true;
    }

    public BaseTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f29403p = false;
        this.f29401h = null;
        this.f29402i = true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, getLayout().getBottomPadding());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        SignatureInfo signatureInfo = this.f29401h;
        if (signatureInfo == null || !signatureInfo.getTemplateId().equals("magazine_b")) {
            return;
        }
        Layout layout = getLayout();
        if (layout.getLineCount() > this.f29401h.getLines()) {
            setText(getText().subSequence(0, layout.getLineVisibleEnd(this.f29401h.getLines() - 1)));
        }
    }

    /* JADX INFO: renamed from: s */
    public void mo17806s(SignatureInfo signatureInfo) {
        SignatureInfo signatureInfo2;
        TypefaceSpan typefaceSpan;
        this.f29401h = signatureInfo;
        Context context = getContext().getApplicationContext() == null ? getContext() : getContext().getApplicationContext();
        setTextSize(0, context.getResources().getDimension(signatureInfo.getTextsize()) * C5118q.m17821k(context));
        setLines(signatureInfo.getLines());
        setGravity(81);
        setLetterSpacing(signatureInfo.getLetterSpaceValue());
        setLineHeight(m17807y(C5117k.k.f72117x2));
        SpannableString spannableString = new SpannableString(signatureInfo.getContent());
        String content = signatureInfo.getContent();
        Typeface typefaceBuild = new Typeface.Builder(SystemProperties.get("ro.miui.ui.font.mi_font_path", "/system/fonts/MiSansVF.ttf")).setFontVariationSettings("'wght' 430").build();
        if (miuix.os.toq.f40717k) {
            setTypeface(typefaceBuild);
        }
        char[] charArray = content.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            if (!C5118q.t8r(charArray[i2]) && !C5118q.kja0(charArray[i2]) && !C5118q.m17819h(charArray[i2])) {
                if (C5118q.m17818g(charArray[i2])) {
                    typefaceSpan = new TypefaceSpan(typefaceBuild);
                } else if (C5118q.x2(charArray[i2])) {
                    typefaceSpan = new TypefaceSpan(Typeface.create(signatureInfo.getFontFamily(), 0));
                }
                spannableString.setSpan(typefaceSpan, i2, i2 + 1, 33);
            }
        }
        setText(spannableString);
        if (this.f29402i && (signatureInfo2 = this.f29401h) != null && miuix.os.toq.f40717k) {
            this.f29402i = false;
            mo17806s(signatureInfo2);
        }
    }

    protected void setSuperSaveOpen(boolean z2) {
        this.f29403p = z2;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        if (this.f29403p) {
            i2 = -1;
        }
        super.setTextColor(i2);
    }

    /* JADX INFO: renamed from: y */
    protected int m17807y(int i2) {
        return Math.round(r0.getResources().getDimensionPixelSize(i2) * C5118q.m17821k(getContext().getApplicationContext() == null ? getContext() : getContext().getApplicationContext()));
    }
}
