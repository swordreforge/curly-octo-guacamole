package com.miui.maml.elements;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.VariableNames;
import com.miui.maml.elements.BitmapProvider;
import com.miui.maml.util.Utils;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class VirtualScreen extends ElementGroup implements BitmapProvider.IBitmapHolder {
    public static final String TAG_NAME = "VirtualScreen";
    private Bitmap mScreenBitmap;
    private Canvas mScreenCanvas;
    private boolean mTicked;
    private BitmapProvider.VersionedBitmap mVersionedBitmap;

    public VirtualScreen(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.ScreenElement
    protected void doRender(Canvas canvas) {
        if (this.mTicked) {
            this.mTicked = false;
            this.mScreenCanvas.save();
            this.mScreenCanvas.concat(getMatrix());
            this.mScreenCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.doRender(this.mScreenCanvas);
            this.mScreenCanvas.restore();
            this.mVersionedBitmap.updateVersion();
        }
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        super.doTick(j2);
        this.mTicked = true;
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void finish() {
        super.finish();
        this.mScreenBitmap.recycle();
        this.mScreenBitmap = null;
        this.mScreenCanvas = null;
    }

    public Bitmap getBitmap() {
        return this.mScreenBitmap;
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        float width = getWidth();
        if (width < 0.0f) {
            width = scale(Utils.getVariableNumber(VariableNames.SCREEN_WIDTH, getVariables()));
        }
        float height = getHeight();
        if (height < 0.0f) {
            height = scale(Utils.getVariableNumber(VariableNames.SCREEN_HEIGHT, getVariables()));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.round(width), Math.round(height), Bitmap.Config.ARGB_8888);
        this.mScreenBitmap = bitmapCreateBitmap;
        bitmapCreateBitmap.setDensity(this.mRoot.getTargetDensity());
        this.mScreenCanvas = new Canvas(this.mScreenBitmap);
        this.mVersionedBitmap = new BitmapProvider.VersionedBitmap(this.mScreenBitmap);
    }

    @Override // com.miui.maml.elements.BitmapProvider.IBitmapHolder
    public BitmapProvider.VersionedBitmap getBitmap(String str) {
        return this.mVersionedBitmap;
    }
}
