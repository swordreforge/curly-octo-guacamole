package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.core.graphics.z */
/* JADX INFO: compiled from: Shader.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\b¨\u0006\u0007"}, d2 = {"Landroid/graphics/Shader;", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "Lkotlin/was;", "Lkotlin/fn3e;", "block", "k", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0548z {
    /* JADX INFO: renamed from: k */
    public static final void m2587k(@InterfaceC7396q Shader transform, @InterfaceC7396q cyoe.x2<? super Matrix, was> block) {
        d2ok.cdj(transform, "$this$transform");
        d2ok.cdj(block, "block");
        Matrix matrix = new Matrix();
        transform.getLocalMatrix(matrix);
        block.invoke(matrix);
        transform.setLocalMatrix(matrix);
    }
}
