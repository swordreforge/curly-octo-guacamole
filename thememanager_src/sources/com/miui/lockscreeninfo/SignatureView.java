package com.miui.lockscreeninfo;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.miui.lockscreeninfo.C5117k;
import com.miui.lockscreeninfo.model.SignatureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureView extends VerticalTextView {
    public SignatureView(Context context) {
        this(context, null);
    }

    public SignatureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignatureView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // com.miui.lockscreeninfo.BaseTextView
    /* JADX INFO: renamed from: s */
    public void mo17806s(SignatureInfo signatureInfo) {
        float fM17807y;
        Typeface typefaceCreate;
        this.f29401h = signatureInfo;
        Context context = getContext().getApplicationContext() == null ? getContext() : getContext().getApplicationContext();
        setTextSize(0, context.getResources().getDimension(signatureInfo.getTextsize()) * C5118q.m17821k(context));
        setText(signatureInfo.getContent());
        setGravity(signatureInfo.getAlignment());
        if (signatureInfo.isVerticalMode()) {
            setCJKVerticalSpace(signatureInfo.getLetterSpaceValue());
            fM17807y = signatureInfo.getLineSpaceValue();
        } else {
            setLetterSpacing(signatureInfo.getLetterSpaceValue());
            fM17807y = m17807y(C5117k.k.f72114qrj);
        }
        setLineSpacing(0.0f, fM17807y);
        setFontFeatureSettings("'liga' off");
        if (TextUtils.isEmpty(signatureInfo.getFontFamily())) {
            typefaceCreate = Typeface.defaultFromStyle(0);
        } else {
            try {
                typefaceCreate = Typeface.create(signatureInfo.getFontFamily(), 0);
            } catch (Exception e2) {
                Log.i(VerticalTextView.f29422e, "init: " + e2);
                typefaceCreate = Typeface.defaultFromStyle(0);
            }
        }
        setTypeface(typefaceCreate);
        setLines(signatureInfo.getLines());
    }
}
