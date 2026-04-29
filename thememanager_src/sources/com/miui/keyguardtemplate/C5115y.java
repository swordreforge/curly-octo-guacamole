package com.miui.keyguardtemplate;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.View;
import zy.dd;
import zy.hyr;

/* JADX INFO: renamed from: com.miui.keyguardtemplate.y */
/* JADX INFO: compiled from: RenderEffectApplier.java */
/* JADX INFO: loaded from: classes3.dex */
@hyr(31)
public class C5115y {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72105toq = "RenderEffectApplier";

    /* JADX INFO: renamed from: k */
    private k f29398k;

    /* JADX INFO: renamed from: com.miui.keyguardtemplate.y$k */
    /* JADX INFO: compiled from: RenderEffectApplier.java */
    static class k {

        /* JADX INFO: renamed from: k */
        private final Bitmap f29399k;

        /* JADX INFO: renamed from: q */
        private final ImageReader f29400q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final RenderNode f72106toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final HardwareRenderer f72107zy;

        @SuppressLint({"WrongConstant"})
        k(Bitmap bitmap) {
            RenderNode renderNode = new RenderNode("RenderEffect");
            this.f72106toq = renderNode;
            HardwareRenderer hardwareRenderer = new HardwareRenderer();
            this.f72107zy = hardwareRenderer;
            this.f29399k = bitmap;
            ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
            this.f29400q = imageReaderNewInstance;
            hardwareRenderer.setSurface(imageReaderNewInstance.getSurface());
            hardwareRenderer.setContentRoot(renderNode);
            renderNode.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
        }
    }

    public C5115y(Bitmap bitmap) {
        this.f29398k = new k(bitmap);
    }

    public static void zy(View view, String str, String str2, String str3, String str4) {
        if (Build.VERSION.SDK_INT >= 33) {
            view.setRenderEffect(RenderEffect.createBlendModeEffect(RenderEffect.createRuntimeShaderEffect(new RuntimeShader(str2), str), RenderEffect.createRuntimeShaderEffect(new RuntimeShader(str4), str3), BlendMode.SRC_IN));
        }
    }

    @dd
    /* JADX INFO: renamed from: k */
    public Bitmap m17802k(RenderEffect renderEffect) {
        this.f29398k.f72106toq.setRenderEffect(renderEffect);
        this.f29398k.f72106toq.beginRecording().drawBitmap(this.f29398k.f29399k, 0.0f, 0.0f, (Paint) null);
        this.f29398k.f72106toq.endRecording();
        this.f29398k.f72107zy.createRenderRequest().setWaitForPresent(true).syncAndDraw();
        try {
            Image imageAcquireNextImage = this.f29398k.f29400q.acquireNextImage();
            HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
            Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            hardwareBuffer.close();
            imageAcquireNextImage.close();
            return bitmapWrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, false);
        } catch (Exception e2) {
            Log.e(f72105toq, "apply error", e2);
            return null;
        }
    }

    public void toq() {
        k kVar = this.f29398k;
        if (kVar != null) {
            kVar.f29400q.close();
            this.f29398k.f72106toq.discardDisplayList();
            this.f29398k.f72107zy.destroy();
            this.f29398k = null;
        }
    }
}
