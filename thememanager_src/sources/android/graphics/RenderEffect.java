package android.graphics;

import android.annotation.NonNull;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RenderEffect {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ RenderEffect createBlendModeEffect(@NonNull RenderEffect renderEffect, @NonNull RenderEffect renderEffect2, @NonNull BlendMode blendMode);

    @NonNull
    public static native /* synthetic */ RenderEffect createBlurEffect(float f2, float f3, @NonNull Shader.TileMode tileMode);

    @NonNull
    public static native /* synthetic */ RenderEffect createRuntimeShaderEffect(@NonNull RuntimeShader runtimeShader, @NonNull String str);
}
