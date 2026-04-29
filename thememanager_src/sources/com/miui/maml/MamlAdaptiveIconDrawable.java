package com.miui.maml;

import android.content.Context;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
@hyr(29)
public class MamlAdaptiveIconDrawable extends AdaptiveIconDrawable {
    private static final String QUIET_IMAGE_NAME = "quietImage.png";
    private volatile ArrayList<FancyDrawable> mLayerFancyDrawables;
    private volatile ArrayList<Drawable> mLayerQuietDrawables;
    private final Object mLock;
    private final Object mLockFancy;
    private Drawable mQuietDrawable;

    public MamlAdaptiveIconDrawable(Drawable drawable, Drawable drawable2) {
        super(drawable, drawable2);
        this.mLock = new Object();
        this.mLockFancy = new Object();
    }

    private void addFancyDrawable(AnimatingDrawable animatingDrawable) {
        if (animatingDrawable == null || this.mLayerFancyDrawables == null) {
            return;
        }
        animatingDrawable.prepareFancyDrawable();
        FancyDrawable fancyDrawable = (FancyDrawable) animatingDrawable.getFancyDrawable();
        if (fancyDrawable != null) {
            this.mLayerFancyDrawables.add(fancyDrawable);
        }
    }

    private void init(Context context, ResourceManager resourceManager) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        resourceManager.setExtraResource("den" + displayMetrics.densityDpi, displayMetrics.densityDpi);
        Drawable drawable = resourceManager.getDrawable(context.getResources(), QUIET_IMAGE_NAME);
        this.mQuietDrawable = drawable;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.mQuietDrawable = drawableMutate;
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), this.mQuietDrawable.getIntrinsicHeight());
        }
    }

    private void prepareLayerFancyDrawables() {
        if (this.mLayerFancyDrawables != null) {
            return;
        }
        this.mLayerFancyDrawables = new ArrayList<>();
        Drawable background = getBackground();
        if (background instanceof AnimatingDrawable) {
            addFancyDrawable((AnimatingDrawable) background);
        }
        Drawable foreground = getForeground();
        if (foreground instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) foreground;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                Drawable drawable = layerDrawable.getDrawable(i2);
                if (drawable instanceof AnimatingDrawable) {
                    addFancyDrawable((AnimatingDrawable) drawable);
                }
            }
        }
    }

    private void prepareLayerQuietDrawables() {
        if (this.mLayerQuietDrawables != null) {
            return;
        }
        this.mLayerQuietDrawables = new ArrayList<>();
        Drawable background = getBackground();
        if (background instanceof AnimatingDrawable) {
            this.mLayerQuietDrawables.add(((AnimatingDrawable) background).getQuietDrawable());
        }
        Drawable foreground = getForeground();
        if (foreground instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) foreground;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                Drawable drawable = layerDrawable.getDrawable(i2);
                if (drawable instanceof AnimatingDrawable) {
                    this.mLayerQuietDrawables.add(((AnimatingDrawable) drawable).getQuietDrawable());
                }
            }
        }
    }

    public ArrayList<FancyDrawable> getLayerFancyDrawables() {
        if (this.mLayerFancyDrawables == null) {
            synchronized (this.mLockFancy) {
                prepareLayerFancyDrawables();
            }
        }
        return this.mLayerFancyDrawables;
    }

    public ArrayList<Drawable> getLayerQuietDrawables() {
        if (this.mLayerQuietDrawables == null) {
            synchronized (this.mLock) {
                prepareLayerQuietDrawables();
            }
        }
        return this.mLayerQuietDrawables;
    }

    public Drawable getTopQuietDrawable() {
        return this.mQuietDrawable;
    }

    public MamlAdaptiveIconDrawable(Drawable drawable, Drawable drawable2, Context context, ResourceManager resourceManager) {
        super(drawable, drawable2);
        this.mLock = new Object();
        this.mLockFancy = new Object();
        init(context, resourceManager);
    }
}
