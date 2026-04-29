package com.miui.maml.shader;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import com.miui.maml.ScreenElementRoot;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class BitmapShaderElement extends ShaderElement {
    public static final String TAG_NAME = "BitmapShader";
    private Bitmap mBitmap;
    private Shader.TileMode mTileModeX;
    private Shader.TileMode mTileModeY;

    public BitmapShaderElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mBitmap = this.mRoot.getContext().mResourceManager.getBitmap(element.getAttribute("src"));
        resolveTileMode(element);
        this.mShader = new BitmapShader(this.mBitmap, this.mTileModeX, this.mTileModeY);
    }

    private void resolveTileMode(Element element) {
        String[] strArrSplit = element.getAttribute("tile").split(",");
        if (strArrSplit.length > 1) {
            this.mTileModeX = ShaderElement.getTileMode(strArrSplit[0]);
            this.mTileModeY = ShaderElement.getTileMode(strArrSplit[1]);
        } else {
            Shader.TileMode tileMode = this.mTileMode;
            this.mTileModeY = tileMode;
            this.mTileModeX = tileMode;
        }
    }

    @Override // com.miui.maml.shader.ShaderElement
    public void onGradientStopsChanged() {
    }

    @Override // com.miui.maml.shader.ShaderElement
    public void updateShader() {
    }

    @Override // com.miui.maml.shader.ShaderElement
    public boolean updateShaderMatrix() {
        return false;
    }
}
