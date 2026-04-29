package zwy;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.cdj;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MaterialDialogs.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class zy {
    private zy() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static Rect m28238k(@lvui Context context, @InterfaceC7828g int i2, int i3) {
        TypedArray typedArrayM14534p = cdj.m14534p(context, null, C6095k.kja0.v6, i2, i3, new int[0]);
        int dimensionPixelSize = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.kc, context.getResources().getDimensionPixelSize(C6095k.g.le9));
        int dimensionPixelSize2 = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.tosv, context.getResources().getDimensionPixelSize(C6095k.g.krto));
        int dimensionPixelSize3 = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.sq2k, context.getResources().getDimensionPixelSize(C6095k.g.wr));
        int dimensionPixelSize4 = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.luqn, context.getResources().getDimensionPixelSize(C6095k.g.lm));
        typedArrayM14534p.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    @lvui
    public static InsetDrawable toq(@dd Drawable drawable, @lvui Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
