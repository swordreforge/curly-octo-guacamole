package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.internal.q */
/* JADX INFO: compiled from: DescendantOffsetUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C4052q {

    /* JADX INFO: renamed from: k */
    private static final ThreadLocal<Matrix> f24599k = new ThreadLocal<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final ThreadLocal<RectF> f67653toq = new ThreadLocal<>();

    /* JADX INFO: renamed from: k */
    public static void m14583k(@lvui ViewGroup viewGroup, @lvui View view, @lvui Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        zy(viewGroup, view, rect);
    }

    private static void toq(ViewParent viewParent, @lvui View view, @lvui Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            toq(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    public static void zy(@lvui ViewGroup viewGroup, @lvui View view, @lvui Rect rect) {
        ThreadLocal<Matrix> threadLocal = f24599k;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        toq(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f67653toq;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
