package com.android.thememanager.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperApplyInfos {
    private static final int FLAG_INDEX_APPLY_INNER_SCREEN = 1;
    private static final int FLAG_INDEX_APPLY_OUTER_SCREEN = 2;
    private int mFoldApplyScreenCode = 0;
    public boolean mInMultiWindow = false;
    private String mOriginPath;
    private boolean mSyncToFashionGallery;

    /* JADX INFO: renamed from: com.android.thememanager.model.WallpaperApplyInfos$1 */
    static /* synthetic */ class C22151 {

        /* JADX INFO: renamed from: $SwitchMap$com$android$thememanager$model$WallpaperApplyInfos$ApplyCode */
        static final /* synthetic */ int[] f13023xf62608cd;

        static {
            int[] iArr = new int[ApplyCode.values().length];
            f13023xf62608cd = iArr;
            try {
                iArr[ApplyCode.BOTH_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13023xf62608cd[ApplyCode.LARGE_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13023xf62608cd[ApplyCode.SMALL_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum ApplyCode {
        LOCK,
        HOME,
        BOTH_LOCK_HOME,
        LARGE_SCREEN,
        SMALL_SCREEN,
        BOTH_SCREEN
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ApplyFlag {
    }

    private void updateFoldScreenStatus(boolean newValue, int index) {
        if (newValue) {
            this.mFoldApplyScreenCode |= index;
        } else {
            this.mFoldApplyScreenCode &= ~index;
        }
    }

    public String getOriginPath() {
        return this.mOriginPath;
    }

    public boolean isApplyBothScreen() {
        int i2 = this.mFoldApplyScreenCode;
        return ((i2 & 1) == 0 || (i2 & 2) == 0) ? false : true;
    }

    public boolean isApplyLargeScreen() {
        return (isApplyBothScreen() || (this.mFoldApplyScreenCode & 1) == 0) ? false : true;
    }

    public boolean isApplySmallScreen() {
        return (isApplyBothScreen() || (this.mFoldApplyScreenCode & 2) == 0) ? false : true;
    }

    public boolean isSyncToFashionGallery() {
        return this.mSyncToFashionGallery;
    }

    public void setOriginPath(String mOriginPath) {
        this.mOriginPath = mOriginPath;
    }

    public void syncFashionGalleryStatus(boolean syncToFashionGallery) {
        this.mSyncToFashionGallery = syncToFashionGallery;
    }

    public void updateFoldApplyStatus(boolean reset, ApplyCode... codes) {
        if (reset) {
            this.mFoldApplyScreenCode = 0;
        }
        if (codes == null || codes.length <= 0) {
            return;
        }
        for (ApplyCode applyCode : codes) {
            int i2 = C22151.f13023xf62608cd[applyCode.ordinal()];
            if (i2 == 1) {
                updateFoldScreenStatus(true, 2);
                updateFoldScreenStatus(true, 1);
            } else if (i2 == 2) {
                updateFoldScreenStatus(false, 2);
                updateFoldScreenStatus(true, 1);
            } else if (i2 == 3) {
                updateFoldScreenStatus(true, 2);
                updateFoldScreenStatus(false, 1);
            }
        }
    }
}
