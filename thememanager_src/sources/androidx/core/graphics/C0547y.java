package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.android.thememanager.util.hb;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: androidx.core.graphics.y */
/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a:\u0010\t\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001aD\u0010\b\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001aN\u0010\r\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a:\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a0\u0010\u0011\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a.\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a.\u0010\u0016\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00152\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001aF\u0010\u001c\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001aF\u0010\u001d\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a.\u0010 \u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¨\u0006!"}, d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Lkotlin/was;", "Lkotlin/fn3e;", "block", "p", "", AnimatedProperty.PROPERTY_NAME_X, AnimatedProperty.PROPERTY_NAME_Y, "kja0", "degrees", "pivotX", "pivotY", "ld6", "qrj", "Landroid/graphics/Matrix;", "matrix", C7704k.y.toq.f95579toq, "Landroid/graphics/Rect;", "clipRect", "q", "Landroid/graphics/RectF;", "n", "", "left", "top", "right", hb.f61266fu4, "toq", "k", "Landroid/graphics/Path;", "clipPath", "zy", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0547y {
    public static /* synthetic */ void f7l8(Canvas withMatrix, Matrix matrix, cyoe.x2 block, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            matrix = new Matrix();
        }
        d2ok.cdj(withMatrix, "$this$withMatrix");
        d2ok.cdj(matrix, "matrix");
        d2ok.cdj(block, "block");
        int iSave = withMatrix.save();
        withMatrix.concat(matrix);
        try {
            block.invoke(withMatrix);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withMatrix.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m2579g(@InterfaceC7396q Canvas withMatrix, @InterfaceC7396q Matrix matrix, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(withMatrix, "$this$withMatrix");
        d2ok.cdj(matrix, "matrix");
        d2ok.cdj(block, "block");
        int iSave = withMatrix.save();
        withMatrix.concat(matrix);
        try {
            block.invoke(withMatrix);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withMatrix.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m2580h(Canvas withTranslation, float f2, float f3, cyoe.x2 block, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        d2ok.cdj(withTranslation, "$this$withTranslation");
        d2ok.cdj(block, "block");
        int iSave = withTranslation.save();
        withTranslation.translate(f2, f3);
        try {
            block.invoke(withTranslation);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withTranslation.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m2581k(@InterfaceC7396q Canvas withClip, float f2, float f3, float f4, float f5, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(withClip, "$this$withClip");
        d2ok.cdj(block, "block");
        int iSave = withClip.save();
        withClip.clipRect(f2, f3, f4, f5);
        try {
            block.invoke(withClip);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withClip.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    public static final void kja0(@InterfaceC7396q Canvas withTranslation, float f2, float f3, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(withTranslation, "$this$withTranslation");
        d2ok.cdj(block, "block");
        int iSave = withTranslation.save();
        withTranslation.translate(f2, f3);
        try {
            block.invoke(withTranslation);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withTranslation.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    public static final void ld6(@InterfaceC7396q Canvas withScale, float f2, float f3, float f4, float f5, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(withScale, "$this$withScale");
        d2ok.cdj(block, "block");
        int iSave = withScale.save();
        withScale.scale(f2, f3, f4, f5);
        try {
            block.invoke(withScale);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withScale.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m2582n(@InterfaceC7396q Canvas withClip, @InterfaceC7396q RectF clipRect, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(withClip, "$this$withClip");
        d2ok.cdj(clipRect, "clipRect");
        d2ok.cdj(block, "block");
        int iSave = withClip.save();
        withClip.clipRect(clipRect);
        try {
            block.invoke(withClip);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withClip.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    public static /* synthetic */ void n7h(Canvas withSkew, float f2, float f3, cyoe.x2 block, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        d2ok.cdj(withSkew, "$this$withSkew");
        d2ok.cdj(block, "block");
        int iSave = withSkew.save();
        withSkew.skew(f2, f3);
        try {
            block.invoke(withSkew);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withSkew.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m2583p(@InterfaceC7396q Canvas withSave, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(withSave, "$this$withSave");
        d2ok.cdj(block, "block");
        int iSave = withSave.save();
        try {
            block.invoke(withSave);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withSave.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m2584q(@InterfaceC7396q Canvas withClip, @InterfaceC7396q Rect clipRect, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(withClip, "$this$withClip");
        d2ok.cdj(clipRect, "clipRect");
        d2ok.cdj(block, "block");
        int iSave = withClip.save();
        withClip.clipRect(clipRect);
        try {
            block.invoke(withClip);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withClip.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    public static final void qrj(@InterfaceC7396q Canvas withSkew, float f2, float f3, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(withSkew, "$this$withSkew");
        d2ok.cdj(block, "block");
        int iSave = withSkew.save();
        withSkew.skew(f2, f3);
        try {
            block.invoke(withSkew);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withSkew.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m2585s(Canvas withRotation, float f2, float f3, float f4, cyoe.x2 block, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        d2ok.cdj(withRotation, "$this$withRotation");
        d2ok.cdj(block, "block");
        int iSave = withRotation.save();
        withRotation.rotate(f2, f3, f4);
        try {
            block.invoke(withRotation);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withRotation.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    public static final void toq(@InterfaceC7396q Canvas withClip, int i2, int i3, int i4, int i5, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(withClip, "$this$withClip");
        d2ok.cdj(block, "block");
        int iSave = withClip.save();
        withClip.clipRect(i2, i3, i4, i5);
        try {
            block.invoke(withClip);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withClip.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    public static /* synthetic */ void x2(Canvas withScale, float f2, float f3, float f4, float f5, cyoe.x2 block, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        d2ok.cdj(withScale, "$this$withScale");
        d2ok.cdj(block, "block");
        int iSave = withScale.save();
        withScale.scale(f2, f3, f4, f5);
        try {
            block.invoke(withScale);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withScale.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m2586y(@InterfaceC7396q Canvas withRotation, float f2, float f3, float f4, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(withRotation, "$this$withRotation");
        d2ok.cdj(block, "block");
        int iSave = withRotation.save();
        withRotation.rotate(f2, f3, f4);
        try {
            block.invoke(withRotation);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withRotation.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    public static final void zy(@InterfaceC7396q Canvas withClip, @InterfaceC7396q Path clipPath, @InterfaceC7396q cyoe.x2<? super Canvas, was> block) {
        d2ok.cdj(withClip, "$this$withClip");
        d2ok.cdj(clipPath, "clipPath");
        d2ok.cdj(block, "block");
        int iSave = withClip.save();
        withClip.clipPath(clipPath);
        try {
            block.invoke(withClip);
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            withClip.restoreToCount(iSave);
            kotlin.jvm.internal.d3.zy(1);
        }
    }
}
