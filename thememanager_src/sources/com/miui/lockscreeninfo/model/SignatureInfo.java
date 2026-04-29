package com.miui.lockscreeninfo.model;

import zy.lvui;
import zy.x2;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureInfo {
    private int aodBlendColor;
    private int blendColor;
    protected String fontFamily;
    protected int height;
    protected float letterSpaceValue;
    protected float lineSpaceValue;
    protected int lines;
    private String templateId;
    private boolean textDark;
    protected int textsize;
    protected boolean verticalMode;
    protected int width;
    protected String content = "";

    @x2
    protected int primaryColor = -1;
    protected int alignment = 103;
    private boolean isAutoPrimaryColor = false;

    public SignatureInfo(String str) {
        boolean z2 = this.verticalMode;
        this.letterSpaceValue = z2 ? 0.8f : 0.0f;
        this.lineSpaceValue = z2 ? 28.0f : -21.0f;
        this.lines = Integer.MAX_VALUE;
        this.blendColor = -1;
        this.aodBlendColor = -1;
        this.textDark = false;
        this.templateId = str;
        initData();
    }

    public int getAlignment() {
        return this.alignment;
    }

    public int getAodBlendColor() {
        return this.aodBlendColor;
    }

    public int getBlendColor() {
        return this.blendColor;
    }

    public String getContent() {
        return this.content;
    }

    public String getFontFamily() {
        return this.fontFamily;
    }

    public int getHeight() {
        return this.height;
    }

    public float getLetterSpaceValue() {
        return this.letterSpaceValue;
    }

    public float getLineSpaceValue() {
        return this.lineSpaceValue;
    }

    public int getLines() {
        return this.lines;
    }

    public int getPrimaryColor() {
        return this.primaryColor;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public int getTextsize() {
        return this.textsize;
    }

    public int getWidth() {
        return this.width;
    }

    protected void initData() {
    }

    public boolean isAutoPrimaryColor() {
        return this.isAutoPrimaryColor;
    }

    public boolean isTextDark() {
        return this.textDark;
    }

    public boolean isVerticalMode() {
        return this.verticalMode;
    }

    public void setAlignment(int i2) {
        this.alignment = i2;
        this.verticalMode = i2 <= 102;
        initData();
    }

    public void setAodBlendColor(int i2) {
        this.aodBlendColor = i2;
    }

    public void setAutoPrimaryColor(boolean z2) {
        this.isAutoPrimaryColor = z2;
    }

    public void setBlendColor(int i2) {
        this.blendColor = i2;
    }

    public void setContent(@lvui String str) {
        this.content = str;
    }

    public void setPrimaryColor(@x2 int i2) {
        this.primaryColor = i2;
    }

    public void setTextDark(boolean z2) {
        this.textDark = z2;
    }
}
