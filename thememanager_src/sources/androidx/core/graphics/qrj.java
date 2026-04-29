package androidx.core.graphics;

import android.graphics.Matrix;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u001a\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005\u001a\"\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Landroid/graphics/Matrix;", "m", "n", "", AnimatedProperty.PROPERTY_NAME_Y, "", "tx", "ty", C7704k.y.toq.f95579toq, "sx", "sy", "zy", "degrees", "px", "py", "k", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class qrj {
    public static /* synthetic */ Matrix f7l8(float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return m2553g(f2, f3);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final Matrix m2553g(float f2, float f3) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f2, f3);
        return matrix;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final Matrix m2554k(float f2, float f3, float f4) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f2, f3, f4);
        return matrix;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final Matrix m2555n(@InterfaceC7396q Matrix times, @InterfaceC7396q Matrix m2) {
        d2ok.cdj(times, "$this$times");
        d2ok.cdj(m2, "m");
        Matrix matrix = new Matrix(times);
        matrix.preConcat(m2);
        return matrix;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Matrix m2556q(float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        return zy(f2, f3);
    }

    public static /* synthetic */ Matrix toq(float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        return m2554k(f2, f3, f4);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final float[] m2557y(@InterfaceC7396q Matrix values) {
        d2ok.cdj(values, "$this$values");
        float[] fArr = new float[9];
        values.getValues(fArr);
        return fArr;
    }

    @InterfaceC7396q
    public static final Matrix zy(float f2, float f3) {
        Matrix matrix = new Matrix();
        matrix.setScale(f2, f3);
        return matrix;
    }
}
