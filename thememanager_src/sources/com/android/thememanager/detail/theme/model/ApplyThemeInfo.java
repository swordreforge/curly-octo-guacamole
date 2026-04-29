package com.android.thememanager.detail.theme.model;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ApplyThemeInfo {
    public static String THEME_USING_TYPE_APPLY = "apply";
    public static String THEME_USING_TYPE_FORCE_RESTORE = "force_restore";
    public static String THEME_USING_TYPE_PROVISION = "provision";
    public static String THEME_USING_TYPE_RESTORE = "restore";
    public static String THEME_USING_TYPE_TRIAL = "trial";
    private boolean mShowProgress;
    private boolean keepLargeIcon = true;
    private boolean mShowToastOfSuccess = true;
    private int fontScale = -1;
    private int fontWeight = -1;
    private String mThemeUsingType = THEME_USING_TYPE_APPLY;
    private String mApplyThemeMessage = "";
    private Set<String> mIgnoreCodeSet = new HashSet();
    private Set<String> mMixIgnoreCodeSet = new HashSet();
    private Set<String> mRelatedCodeSet = new HashSet();

    public String getApplyThemeMessage() {
        return this.mApplyThemeMessage;
    }

    public int getFontScale() {
        return this.fontScale;
    }

    public int getFontWeight() {
        return this.fontWeight;
    }

    public Set<String> getIgnoreCodeSet() {
        return this.mIgnoreCodeSet;
    }

    public boolean getKeepLargeIcon() {
        return this.keepLargeIcon;
    }

    public Set<String> getMixIgnoreCodeSet() {
        return this.mMixIgnoreCodeSet;
    }

    public Set<String> getRelatedCodeSet() {
        return this.mRelatedCodeSet;
    }

    public String getThemeUsingType() {
        return this.mThemeUsingType;
    }

    public boolean isShowProgress() {
        return this.mShowProgress;
    }

    public boolean isShowToastOfSuccess() {
        return this.mShowToastOfSuccess;
    }

    public ApplyThemeInfo setApplyThemeMessage(String applyThemeMessage) {
        this.mApplyThemeMessage = applyThemeMessage;
        return this;
    }

    public void setFontScale(int font) {
        this.fontScale = font;
    }

    public void setFontWeight(int fontW) {
        this.fontWeight = fontW;
    }

    public ApplyThemeInfo setIgnoreCodeSet(Set<String> ignoreCodeSet) {
        this.mIgnoreCodeSet = ignoreCodeSet;
        return this;
    }

    public void setKeepLargeIcon(boolean keep) {
        this.keepLargeIcon = keep;
    }

    public void setMixIgnoreCodeSet(Set<String> mMixIgnoreCodeSet) {
        this.mMixIgnoreCodeSet = mMixIgnoreCodeSet;
    }

    public void setShowProgress(boolean mShowProgress) {
        this.mShowProgress = mShowProgress;
    }

    public void setShowToastOfSuccess(boolean mShowToastOfSuccess) {
        this.mShowToastOfSuccess = mShowToastOfSuccess;
    }

    public ApplyThemeInfo setThemeUsingType(String themeUsingType) {
        this.mThemeUsingType = themeUsingType;
        return this;
    }
}
