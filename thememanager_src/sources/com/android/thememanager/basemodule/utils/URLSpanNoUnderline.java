package com.android.thememanager.basemodule.utils;

import android.annotation.SuppressLint;
import android.text.TextPaint;
import android.text.style.URLSpan;

/* JADX INFO: loaded from: classes.dex */
public class URLSpanNoUnderline extends URLSpan {

    /* JADX INFO: renamed from: k */
    private int f10263k;

    public URLSpanNoUnderline(String p_Url, int color) {
        super(p_Url);
        this.f10263k = color;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    @SuppressLint({"ResourceAsColor"})
    public void updateDrawState(TextPaint p_DrawState) {
        p_DrawState.setUnderlineText(false);
        int i2 = this.f10263k;
        p_DrawState.linkColor = i2;
        p_DrawState.setColor(i2);
    }
}
