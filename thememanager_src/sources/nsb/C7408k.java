package nsb;

import android.graphics.Canvas;
import android.graphics.RectF;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: nsb.k */
/* JADX INFO: compiled from: CanvasCompat.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C7408k {
    private C7408k() {
    }

    /* JADX INFO: renamed from: k */
    public static int m26810k(@lvui Canvas canvas, float f2, float f3, float f4, float f5, int i2) {
        return canvas.saveLayerAlpha(f2, f3, f4, f5, i2);
    }

    public static int toq(@lvui Canvas canvas, @dd RectF rectF, int i2) {
        return canvas.saveLayerAlpha(rectF, i2);
    }
}
