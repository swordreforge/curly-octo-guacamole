package miuix.view;

import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: compiled from: DensityChangedHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {
    public static void cdj(Resources resources, View view, int i2) {
        if (i2 == -1) {
            return;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public static void f7l8(TextView textView, float f2) {
        textView.setTextSize(2, f2);
    }

    public static void fn3e(Resources resources, View view, int i2) {
        if (i2 == -1) {
            return;
        }
        zurt(resources, view, i2, i2);
    }

    /* JADX INFO: renamed from: g */
    public static void m26770g(TextView textView, float f2) {
        textView.setTextSize(1, f2);
    }

    /* JADX INFO: renamed from: h */
    public static void m26771h(View view, int i2) {
        kja0(view, (view.getResources().getConfiguration().densityDpi * 1.0f) / i2);
    }

    /* JADX INFO: renamed from: i */
    public static void m26772i(View view, int i2) {
        t8r(view, (view.getResources().getConfiguration().densityDpi * 1.0f) / i2);
    }

    /* JADX INFO: renamed from: k */
    public static void m26773k(TextView textView, float f2) {
        toq(textView, f2, 2);
    }

    public static void ki(Resources resources, View view, int i2, int i3, int i4, int i5) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int paddingTop;
        if (i2 != i4 || i2 == -1) {
            dimensionPixelSize = i2 != -1 ? resources.getDimensionPixelSize(i2) : 0;
            dimensionPixelSize2 = i4 != -1 ? resources.getDimensionPixelSize(i4) : 0;
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(i2);
            dimensionPixelSize2 = dimensionPixelSize;
        }
        if (i3 != i5 || i3 == -1) {
            int dimensionPixelSize4 = i3 != -1 ? resources.getDimensionPixelSize(i3) : 0;
            dimensionPixelSize3 = i5 != -1 ? resources.getDimensionPixelSize(i5) : 0;
            paddingTop = dimensionPixelSize4;
        } else {
            paddingTop = resources.getDimensionPixelSize(i3);
            dimensionPixelSize3 = paddingTop;
        }
        if (i2 == -1) {
            dimensionPixelSize = view.getPaddingLeft();
        }
        if (i3 == -1) {
            paddingTop = view.getPaddingTop();
        }
        if (i4 == -1) {
            dimensionPixelSize2 = view.getPaddingLeft();
        }
        if (i5 == -1) {
            dimensionPixelSize3 = view.getPaddingBottom();
        }
        view.setPadding(dimensionPixelSize, paddingTop, dimensionPixelSize2, dimensionPixelSize3);
    }

    public static void kja0(View view, float f2) {
        view.setPadding((int) (view.getPaddingLeft() * f2), (int) (view.getPaddingTop() * f2), (int) (view.getPaddingRight() * f2), (int) (view.getPaddingBottom() * f2));
    }

    public static void ld6(View view, float f2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = (int) (marginLayoutParams.leftMargin * f2);
            marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin * f2);
            marginLayoutParams.rightMargin = (int) (marginLayoutParams.rightMargin * f2);
            marginLayoutParams.bottomMargin = (int) (marginLayoutParams.bottomMargin * f2);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m26774n(TextView textView, float f2) {
        if (Build.VERSION.SDK_INT >= 30) {
            textView.setTextSize(textView.getTextSizeUnit(), f2);
        } else {
            textView.setTextSize(2, f2);
        }
    }

    public static void n7h(Resources resources, View view, int i2, int i3, int i4, int i5) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i2 != i4 || i2 == -1) {
                dimensionPixelSize = i2 != -1 ? resources.getDimensionPixelSize(i2) : 0;
                dimensionPixelSize2 = i4 != -1 ? resources.getDimensionPixelSize(i4) : 0;
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(i2);
                dimensionPixelSize2 = dimensionPixelSize;
            }
            if (i3 != i5 || i3 == -1) {
                int dimensionPixelSize5 = i3 != -1 ? resources.getDimensionPixelSize(i3) : 0;
                dimensionPixelSize3 = i5 != -1 ? resources.getDimensionPixelSize(i5) : 0;
                dimensionPixelSize4 = dimensionPixelSize5;
            } else {
                dimensionPixelSize4 = resources.getDimensionPixelSize(i3);
                dimensionPixelSize3 = dimensionPixelSize4;
            }
            if (i2 != -1) {
                marginLayoutParams.leftMargin = dimensionPixelSize;
            }
            if (i3 != -1) {
                marginLayoutParams.topMargin = dimensionPixelSize4;
            }
            if (i4 != -1) {
                marginLayoutParams.rightMargin = dimensionPixelSize2;
            }
            if (i5 != -1) {
                marginLayoutParams.bottomMargin = dimensionPixelSize3;
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m26775p(View view, int i2, float f2) {
        m26778y(view, i2 / 160.0f, f2);
    }

    /* JADX INFO: renamed from: q */
    public static void m26776q(TextView textView, int i2, int i3) {
        toq(textView, i2 / 160.0f, i3);
    }

    public static void qrj(Resources resources, View view, int i2) {
        if (i2 == -1) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int dimensionPixelSize = resources.getDimensionPixelSize(i2);
            marginLayoutParams.leftMargin = dimensionPixelSize;
            marginLayoutParams.topMargin = dimensionPixelSize;
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m26777s(View view, int i2) {
        float f2 = i2;
        m26778y(view, f2 / 160.0f, (view.getResources().getConfiguration().densityDpi * 1.0f) / f2);
    }

    public static void t8r(View view, float f2) {
        boolean z2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = layoutParams.width;
        boolean z3 = true;
        if (i2 > 0) {
            layoutParams.width = (int) (i2 * f2);
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = layoutParams.height;
        if (i3 > 0) {
            layoutParams.height = (int) (i3 * f2);
        } else {
            z3 = z2;
        }
        if (z3) {
            view.setLayoutParams(layoutParams);
        }
    }

    public static void toq(TextView textView, float f2, int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            textView.setTextSize(textView.getTextSizeUnit(), textView.getTextSize() / f2);
        } else {
            textView.setTextSize(i2, textView.getTextSize() / f2);
        }
    }

    public static void x2(View view, int i2) {
        ld6(view, (view.getResources().getConfiguration().densityDpi * 1.0f) / i2);
    }

    /* JADX INFO: renamed from: y */
    public static void m26778y(View view, float f2, float f3) {
        t8r(view, f3);
        kja0(view, f3);
        ld6(view, f3);
        if (view instanceof TextView) {
            m26773k((TextView) view, f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[PHI: r3
      0x0037: PHI (r3v3 boolean) = (r3v1 boolean), (r3v1 boolean), (r3v4 boolean) binds: [B:15:0x002a, B:17:0x002e, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zurt(android.content.res.Resources r5, android.view.View r6, int r7, int r8) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r7 != r8) goto L1d
            if (r7 == r1) goto L1d
            int r5 = r5.getDimensionPixelSize(r7)
            int r7 = r0.width
            if (r7 <= 0) goto L16
            r0.width = r5
            r3 = r2
        L16:
            int r7 = r0.height
            if (r7 <= 0) goto L37
            r0.height = r5
            goto L38
        L1d:
            if (r7 == r1) goto L2a
            int r4 = r0.width
            if (r4 <= 0) goto L2a
            int r7 = r5.getDimensionPixelSize(r7)
            r0.width = r7
            r3 = r2
        L2a:
            if (r8 == r1) goto L37
            int r7 = r0.height
            if (r7 <= 0) goto L37
            int r5 = r5.getDimensionPixelSize(r8)
            r0.height = r5
            goto L38
        L37:
            r2 = r3
        L38:
            if (r2 == 0) goto L3d
            r6.setLayoutParams(r0)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.view.f7l8.zurt(android.content.res.Resources, android.view.View, int, int):void");
    }

    public static void zy(TextView textView, int i2) {
        m26776q(textView, i2, 2);
    }
}
