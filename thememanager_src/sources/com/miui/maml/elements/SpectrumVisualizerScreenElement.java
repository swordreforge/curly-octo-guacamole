package com.miui.maml.elements;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.elements.BitmapProvider;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import com.miui.maml.widget.SpectrumVisualizer;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class SpectrumVisualizerScreenElement extends ImageScreenElement {
    public static final String TAG_NAME = "SpectrumVisualizer";
    private int mAlphaWidthNum;
    private Canvas mCanvas;
    private String mDotbar;
    private Bitmap mPanel;
    private String mPanelSrc;
    private int mResDensity;
    private String mShadow;
    private SpectrumVisualizer mSpectrumVisualizer;

    public SpectrumVisualizerScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        load(element);
    }

    private void load(Element element) {
        if (element == null) {
            return;
        }
        this.mPanelSrc = element.getAttribute("panelSrc");
        this.mDotbar = element.getAttribute("dotbarSrc");
        this.mShadow = element.getAttribute("shadowSrc");
        SpectrumVisualizer spectrumVisualizer = new SpectrumVisualizer(getContext().mContext);
        this.mSpectrumVisualizer = spectrumVisualizer;
        spectrumVisualizer.setSoftDrawEnabled(false);
        this.mSpectrumVisualizer.enableUpdate(false);
        this.mAlphaWidthNum = Utils.getAttrAsInt(element, "alphaWidthNum", -1);
    }

    @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.ScreenElement
    protected void doRender(Canvas canvas) {
        if (this.mPanel != null) {
            ((ImageScreenElement) this).mPaint.setAlpha(getAlpha());
            canvas.drawBitmap(this.mPanel, getLeft(), getTop(), ((ImageScreenElement) this).mPaint);
        }
        super.doRender(canvas);
    }

    public void enableUpdate(boolean z2) {
        this.mSpectrumVisualizer.enableUpdate(z2);
    }

    @Override // com.miui.maml.elements.ImageScreenElement
    protected BitmapProvider.VersionedBitmap getBitmap(boolean z2) {
        Canvas canvas = this.mCanvas;
        if (canvas == null) {
            return null;
        }
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.mCanvas.setDensity(0);
        this.mSpectrumVisualizer.draw(this.mCanvas);
        this.mCanvas.setDensity(this.mResDensity);
        this.mBitmap.updateVersion();
        return this.mBitmap;
    }

    @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        this.mPanel = TextUtils.isEmpty(this.mPanelSrc) ? null : getContext().mResourceManager.getBitmap(this.mPanelSrc);
        Bitmap bitmap = TextUtils.isEmpty(this.mDotbar) ? null : getContext().mResourceManager.getBitmap(this.mDotbar);
        Bitmap bitmap2 = TextUtils.isEmpty(this.mShadow) ? null : getContext().mResourceManager.getBitmap(this.mShadow);
        int width = (int) getWidth();
        int height = (int) getHeight();
        if (width <= 0 || height <= 0) {
            Bitmap bitmap3 = this.mPanel;
            if (bitmap3 == null) {
                MamlLog.m17851e(TAG_NAME, "no panel or size");
                return;
            } else {
                width = bitmap3.getWidth();
                height = this.mPanel.getHeight();
            }
        }
        if (bitmap == null) {
            MamlLog.m17851e(TAG_NAME, "no dotbar");
            return;
        }
        this.mSpectrumVisualizer.setBitmaps(width, height, bitmap, bitmap2);
        int i2 = this.mAlphaWidthNum;
        if (i2 >= 0) {
            this.mSpectrumVisualizer.setAlphaNum(i2);
        }
        this.mResDensity = bitmap.getDensity();
        this.mSpectrumVisualizer.layout(0, 0, width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(this.mResDensity);
        this.mCanvas = new Canvas(bitmapCreateBitmap);
        this.mBitmap.setBitmap(bitmapCreateBitmap);
    }
}
