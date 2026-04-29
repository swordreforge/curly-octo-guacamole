package com.miui.maml;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.miui.maml.MamlDrawable;
import com.miui.maml.util.AppIconsHelper;
import com.miui.maml.util.LargeIconConfigFile;
import com.miui.maml.util.LargeIconsHelper;
import com.miui.maml.util.MamlLog;

/* JADX INFO: loaded from: classes3.dex */
public class AnimatingDrawable extends MamlDrawable {
    private static final String QUIET_IMAGE_NAME = "quietImage.png";
    private static final String TAG = "Maml.AnimatingDrawable";
    public static final int TIME_FANCY_CACHE = 0;
    private boolean isLargeIcon;
    private final int mAnimIndex;
    private final String mClassName;
    private final Context mContext;
    private FancyDrawable mFancyDrawable;
    private LargeIconConfigFile.Icon mLargeIcon;
    private String mLargeIconSize;
    private final int mLayerIndex;
    private final Object mLock;
    private final String mPackageName;
    private Drawable mQuietDrawable;
    private final ResourceManager mResourceManager;
    private boolean mUseFancyWhenStatic;
    private boolean mUseQuietWhenAnim;
    private final UserHandle mUser;

    static final class AnimatingDrawableState extends MamlDrawable.MamlDrawableState {
        private final int mAnimIndex;
        private final String mClassName;
        private final Context mContext;
        private final int mLayerIndex;
        private final String mPackageName;
        private final ResourceManager mResourceManager;
        private final boolean mUseFancyWhenStatic;
        private final boolean mUseQuietWhenAnim;
        private final UserHandle mUser;

        public AnimatingDrawableState(Context context, String str, String str2, ResourceManager resourceManager, UserHandle userHandle, int i2, int i3, boolean z2, boolean z3) {
            this.mContext = context;
            this.mResourceManager = resourceManager;
            this.mPackageName = str;
            this.mClassName = str2;
            this.mUser = userHandle;
            this.mLayerIndex = i2;
            this.mAnimIndex = i3;
            this.mUseQuietWhenAnim = z2;
            this.mUseFancyWhenStatic = z3;
        }

        @Override // com.miui.maml.MamlDrawable.MamlDrawableState
        protected MamlDrawable createDrawable(int i2) {
            return new AnimatingDrawable(this.mContext, this.mPackageName, this.mClassName, this.mResourceManager, this.mUser, this.mLayerIndex, this.mAnimIndex, this.mUseQuietWhenAnim, this.mUseFancyWhenStatic);
        }
    }

    public AnimatingDrawable(Context context, String str, String str2, ResourceManager resourceManager, UserHandle userHandle) {
        this(context, str, str2, resourceManager, userHandle, -1, -1, false, false);
    }

    private void init() {
        this.mState = new AnimatingDrawableState(this.mContext, this.mPackageName, this.mClassName, this.mResourceManager, this.mUser, this.mLayerIndex, this.mAnimIndex, this.mUseQuietWhenAnim, this.mUseFancyWhenStatic);
        Display defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        this.mResourceManager.setExtraResource("den" + displayMetrics.densityDpi, displayMetrics.densityDpi);
        Drawable drawable = this.mResourceManager.getDrawable(this.mContext.getResources(), QUIET_IMAGE_NAME);
        this.mQuietDrawable = drawable;
        if (drawable == null) {
            MamlLog.m17853i(TAG, "mQuietDrwable is null! package/class=" + this.mPackageName + "/" + this.mClassName);
            return;
        }
        setIntrinsicSize(drawable.getIntrinsicWidth(), this.mQuietDrawable.getIntrinsicHeight());
        Drawable drawableMutate = this.mQuietDrawable.mutate();
        this.mQuietDrawable = drawableMutate;
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), this.mQuietDrawable.getIntrinsicHeight());
        ColorFilter colorFilter = this.mColorFilter;
        if (colorFilter != null) {
            this.mQuietDrawable.setColorFilter(colorFilter);
        }
    }

    public void clear() {
        synchronized (this.mLock) {
            FancyDrawable fancyDrawable = this.mFancyDrawable;
            if (fancyDrawable != null) {
                fancyDrawable.cleanUp();
            }
            this.mFancyDrawable = null;
        }
    }

    @Override // com.miui.maml.MamlDrawable
    protected void drawIcon(Canvas canvas) {
        if (this.mQuietDrawable == null) {
            return;
        }
        try {
            int iSave = canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            canvas.scale(this.mWidth / this.mIntrinsicWidth, this.mHeight / this.mIntrinsicHeight, 0.0f, 0.0f);
            this.mQuietDrawable.draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Exception e2) {
            e2.printStackTrace();
            MamlLog.m17851e(TAG, e2.toString());
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
            MamlLog.m17851e(TAG, e3.toString());
        }
    }

    public int getAnimIndex() {
        int i2 = this.mAnimIndex;
        return i2 > -1 ? i2 : this.mLayerIndex;
    }

    public Drawable getFancyDrawable() {
        prepareFancyDrawable();
        return this.mFancyDrawable;
    }

    @Override // com.miui.maml.MamlDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public Drawable getQuietDrawable() {
        return this.mQuietDrawable;
    }

    public Drawable getStartDrawable() {
        synchronized (this.mLock) {
            prepareFancyDrawable();
            FancyDrawable fancyDrawable = this.mFancyDrawable;
            if (fancyDrawable == null) {
                return null;
            }
            return fancyDrawable.getStartDrawable();
        }
    }

    @Deprecated
    public boolean isOnlyFancyWork() {
        return this.mUseFancyWhenStatic;
    }

    @Deprecated
    public boolean isOnlyQuietWork() {
        return this.mUseQuietWhenAnim;
    }

    public void prepareFancyDrawable() {
        Drawable fancyIconDrawable;
        if (this.mUseQuietWhenAnim) {
            return;
        }
        synchronized (this.mLock) {
            if (this.mFancyDrawable != null) {
                return;
            }
            if (this.isLargeIcon) {
                int i2 = this.mLayerIndex;
                fancyIconDrawable = i2 != -1 ? LargeIconsHelper.getFancyDrawableFromLayerAnimating(this.mLargeIcon, this.mLargeIconSize, this.mContext, this.mPackageName, this.mClassName, 0L, this.mUser, i2) : LargeIconsHelper.getFancyDrawableFromAnimating(this.mLargeIcon, this.mLargeIconSize, this.mContext, this.mPackageName, this.mClassName, 0L, this.mUser);
            } else {
                fancyIconDrawable = AppIconsHelper.getFancyIconDrawable(this.mContext, this.mPackageName, this.mClassName, 0L, this.mUser, this.mLayerIndex);
            }
            if (fancyIconDrawable instanceof FancyDrawable) {
                if (this.mQuietDrawable == null && (this.mIntrinsicHeight <= 0 || this.mIntrinsicWidth <= 0)) {
                    FancyDrawable fancyDrawable = this.mFancyDrawable;
                    setIntrinsicSize(fancyDrawable.mIntrinsicWidth, fancyDrawable.mIntrinsicHeight);
                }
                FancyDrawable fancyDrawable2 = (FancyDrawable) fancyIconDrawable;
                this.mFancyDrawable = fancyDrawable2;
                fancyDrawable2.setColorFilter(this.mColorFilter);
            }
        }
    }

    public void sendCommand(String str) {
        FancyDrawable fancyDrawable = this.mFancyDrawable;
        if (fancyDrawable != null) {
            fancyDrawable.getRoot().onCommand(str);
        }
    }

    @Override // com.miui.maml.MamlDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.mQuietDrawable;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
    }

    @Override // com.miui.maml.MamlDrawable, android.graphics.drawable.Drawable
    public void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
    }

    @Override // com.miui.maml.MamlDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        MamlLog.m17850d(TAG, "setColorFilter");
        Drawable drawable = this.mQuietDrawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.mBadgeDrawable;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
        FancyDrawable fancyDrawable = this.mFancyDrawable;
        if (fancyDrawable != null) {
            fancyDrawable.setColorFilter(colorFilter);
        }
    }

    public boolean useFancyWhenStatic() {
        return this.mUseFancyWhenStatic;
    }

    public boolean useQuietWhenAnim() {
        return this.mUseQuietWhenAnim;
    }

    public AnimatingDrawable(Context context, String str, String str2, ResourceManager resourceManager, UserHandle userHandle, int i2, int i3, boolean z2, boolean z3, boolean z5, LargeIconConfigFile.Icon icon, String str3) {
        this(context, str, str2, resourceManager, userHandle, i2, -1, z2, z3);
        this.isLargeIcon = z5;
        this.mLargeIcon = icon;
        this.mLargeIconSize = str3;
    }

    public AnimatingDrawable(Context context, String str, String str2, ResourceManager resourceManager, UserHandle userHandle, int i2) {
        this(context, str, str2, resourceManager, userHandle, i2, -1, false, false);
    }

    public AnimatingDrawable(Context context, String str, String str2, ResourceManager resourceManager, UserHandle userHandle, int i2, int i3) {
        this(context, str, str2, resourceManager, userHandle, i2, i3, false, false);
    }

    public AnimatingDrawable(Context context, String str, String str2, ResourceManager resourceManager, UserHandle userHandle, int i2, int i3, boolean z2, boolean z3) {
        this.mLock = new Object();
        this.mContext = context;
        this.mResourceManager = resourceManager;
        this.mPackageName = str;
        this.mClassName = str2;
        this.mUser = userHandle;
        this.mLayerIndex = i2;
        this.mAnimIndex = i3;
        this.mUseQuietWhenAnim = z2;
        this.mUseFancyWhenStatic = z3;
        init();
    }
}
