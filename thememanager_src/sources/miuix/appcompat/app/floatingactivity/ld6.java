package miuix.appcompat.app.floatingactivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import gb.toq;
import miuix.appcompat.app.t8r;
import miuix.graphics.C7111k;
import miuix.internal.widget.RoundFrameLayout;
import zy.lvui;

/* JADX INFO: compiled from: SnapShotViewHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    private static float f38877k;

    /* JADX INFO: renamed from: g */
    public static Bitmap m24946g(View view) {
        if (!toq(view)) {
            return null;
        }
        m24947k(view.getContext());
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return null;
        }
        Bitmap bitmapFti = C7111k.fti(drawingCache, f38877k);
        view.destroyDrawingCache();
        view.setDrawingCacheEnabled(false);
        return bitmapFti;
    }

    /* JADX INFO: renamed from: k */
    private static void m24947k(Context context) {
        if (f38877k == 0.0f) {
            f38877k = context.getResources().getDimensionPixelSize(toq.f7l8.xzk4);
        }
    }

    /* JADX INFO: renamed from: n */
    public static View m24948n(@lvui View view, Bitmap bitmap) {
        return zy(view.getContext(), view, bitmap);
    }

    /* JADX INFO: renamed from: q */
    public static View m24949q(@lvui Context context, @lvui t8r t8rVar) {
        View floatingBrightPanel = t8rVar.getFloatingBrightPanel();
        return zy(context, floatingBrightPanel, m24946g(floatingBrightPanel));
    }

    private static boolean toq(View view) {
        return (view == null || view.getContext() == null) ? false : true;
    }

    public static View zy(@lvui Context context, @lvui View view, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        RoundFrameLayout roundFrameLayout = new RoundFrameLayout(context);
        roundFrameLayout.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.layout(0, 0, bitmap.getWidth(), bitmap.getHeight());
        frameLayout.setBackground(new BitmapDrawable(context.getResources(), bitmap));
        roundFrameLayout.addView(frameLayout);
        return roundFrameLayout;
    }
}
