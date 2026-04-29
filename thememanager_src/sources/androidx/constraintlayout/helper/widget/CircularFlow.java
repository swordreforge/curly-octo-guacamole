package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static float f47998bo = 0.0f;

    /* JADX INFO: renamed from: u */
    private static int f2112u = 0;

    /* JADX INFO: renamed from: x */
    private static final String f2113x = "CircularFlow";

    /* JADX INFO: renamed from: a */
    private Integer f2114a;

    /* JADX INFO: renamed from: b */
    private Float f2115b;

    /* JADX INFO: renamed from: c */
    private int[] f2116c;

    /* JADX INFO: renamed from: e */
    private int f2117e;

    /* JADX INFO: renamed from: f */
    private float[] f2118f;

    /* JADX INFO: renamed from: j */
    private int f2119j;

    /* JADX INFO: renamed from: l */
    int f2120l;

    /* JADX INFO: renamed from: m */
    private String f2121m;

    /* JADX INFO: renamed from: o */
    private String f2122o;

    /* JADX INFO: renamed from: r */
    ConstraintLayout f2123r;

    public CircularFlow(Context context) {
        super(context);
    }

    private void d2ok(String radiusString) {
        int[] iArr;
        if (radiusString == null || radiusString.length() == 0 || this.f2602n == null || (iArr = this.f2116c) == null) {
            return;
        }
        if (this.f2117e + 1 > iArr.length) {
            this.f2116c = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f2116c[this.f2117e] = (int) (Integer.parseInt(radiusString) * this.f2602n.getResources().getDisplayMetrics().density);
        this.f2117e++;
    }

    private void eqxt(String angleString) {
        float[] fArr;
        if (angleString == null || angleString.length() == 0 || this.f2602n == null || (fArr = this.f2118f) == null) {
            return;
        }
        if (this.f2119j + 1 > fArr.length) {
            this.f2118f = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f2118f[this.f2119j] = Integer.parseInt(angleString);
        this.f2119j++;
    }

    /* JADX INFO: renamed from: l */
    public static int[] m1370l(int[] array, int index) {
        int[] iArr = new int[array.length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < array.length; i3++) {
            if (i3 != index) {
                iArr[i2] = array[i3];
                i2++;
            }
        }
        return iArr;
    }

    private int[] n5r1(int[] radius, int index) {
        return (radius == null || index < 0 || index >= this.f2117e) ? radius : m1370l(radius, index);
    }

    public static float[] ncyb(float[] array, int index) {
        float[] fArr = new float[array.length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < array.length; i3++) {
            if (i3 != index) {
                fArr[i2] = array[i3];
                i2++;
            }
        }
        return fArr;
    }

    /* JADX INFO: renamed from: r */
    private void m1371r() {
        this.f2123r = (ConstraintLayout) getParent();
        for (int i2 = 0; i2 < this.f2604q; i2++) {
            View viewDd = this.f2123r.dd(this.f2601k[i2]);
            if (viewDd != null) {
                int i3 = f2112u;
                float f2 = f47998bo;
                int[] iArr = this.f2116c;
                if (iArr == null || i2 >= iArr.length) {
                    Integer num = this.f2114a;
                    if (num == null || num.intValue() == -1) {
                        Log.e(f2113x, "Added radius to view with id: " + this.f2600i.get(Integer.valueOf(viewDd.getId())));
                    } else {
                        this.f2117e++;
                        if (this.f2116c == null) {
                            this.f2116c = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f2116c = radius;
                        radius[this.f2117e - 1] = i3;
                    }
                } else {
                    i3 = iArr[i2];
                }
                float[] fArr = this.f2118f;
                if (fArr == null || i2 >= fArr.length) {
                    Float f3 = this.f2115b;
                    if (f3 == null || f3.floatValue() == -1.0f) {
                        Log.e(f2113x, "Added angle to view with id: " + this.f2600i.get(Integer.valueOf(viewDd.getId())));
                    } else {
                        this.f2119j++;
                        if (this.f2118f == null) {
                            this.f2118f = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f2118f = angles;
                        angles[this.f2119j - 1] = f2;
                    }
                } else {
                    f2 = fArr[i2];
                }
                ConstraintLayout.toq toqVar = (ConstraintLayout.toq) viewDd.getLayoutParams();
                toqVar.f48494ki = f2;
                toqVar.f2642h = this.f2120l;
                toqVar.f48477cdj = i3;
                viewDd.setLayoutParams(toqVar);
            }
        }
        m1619h();
    }

    private void setAngles(String idList) {
        if (idList == null) {
            return;
        }
        int i2 = 0;
        this.f2119j = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i2);
            if (iIndexOf == -1) {
                eqxt(idList.substring(i2).trim());
                return;
            } else {
                eqxt(idList.substring(i2, iIndexOf).trim());
                i2 = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String idList) {
        if (idList == null) {
            return;
        }
        int i2 = 0;
        this.f2117e = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i2);
            if (iIndexOf == -1) {
                d2ok(idList.substring(i2).trim());
                return;
            } else {
                d2ok(idList.substring(i2, iIndexOf).trim());
                i2 = iIndexOf + 1;
            }
        }
    }

    private float[] x9kr(float[] angles, int index) {
        return (angles == null || index < 0 || index >= this.f2119j) ? angles : ncyb(angles, index);
    }

    /* JADX INFO: renamed from: c */
    public void m1372c(View view, int radius, float angle) {
        if (!dd(view)) {
            Log.e(f2113x, "It was not possible to update radius and angle to view with id: " + view.getId());
            return;
        }
        int iFu4 = fu4(view.getId());
        if (getAngles().length > iFu4) {
            float[] angles = getAngles();
            this.f2118f = angles;
            angles[iFu4] = angle;
        }
        if (getRadius().length > iFu4) {
            int[] radius2 = getRadius();
            this.f2116c = radius2;
            radius2[iFu4] = (int) (radius * this.f2602n.getResources().getDisplayMetrics().density);
        }
        m1371r();
    }

    public boolean dd(View view) {
        return t8r(view.getId()) && fu4(view.getId()) != -1;
    }

    /* JADX INFO: renamed from: f */
    public void m1373f(View view, int radius) {
        if (!dd(view)) {
            Log.e(f2113x, "It was not possible to update radius to view with id: " + view.getId());
            return;
        }
        int iFu4 = fu4(view.getId());
        if (iFu4 > this.f2116c.length) {
            return;
        }
        int[] radius2 = getRadius();
        this.f2116c = radius2;
        radius2[iFu4] = (int) (radius * this.f2602n.getResources().getDisplayMetrics().density);
        m1371r();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f2118f, this.f2119j);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f2116c, this.f2117e);
    }

    public void hyr(View view, float angle) {
        if (!dd(view)) {
            Log.e(f2113x, "It was not possible to update angle to view with id: " + view.getId());
            return;
        }
        int iFu4 = fu4(view.getId());
        if (iFu4 > this.f2118f.length) {
            return;
        }
        float[] angles = getAngles();
        this.f2118f = angles;
        angles[iFu4] = angle;
        m1371r();
    }

    public void lvui(View view, int radius, float angle) {
        if (t8r(view.getId())) {
            return;
        }
        kja0(view);
        this.f2119j++;
        float[] angles = getAngles();
        this.f2118f = angles;
        angles[this.f2119j - 1] = angle;
        this.f2117e++;
        int[] radius2 = getRadius();
        this.f2116c = radius2;
        radius2[this.f2117e - 1] = (int) (radius * this.f2602n.getResources().getDisplayMetrics().density);
        m1371r();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2122o;
        if (str != null) {
            this.f2118f = new float[1];
            setAngles(str);
        }
        String str2 = this.f2121m;
        if (str2 != null) {
            this.f2116c = new int[1];
            setRadius(str2);
        }
        Float f2 = this.f2115b;
        if (f2 != null) {
            setDefaultAngle(f2.floatValue());
        }
        Integer num = this.f2114a;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        m1371r();
    }

    public void setDefaultAngle(float angle) {
        f47998bo = angle;
    }

    public void setDefaultRadius(int radius) {
        f2112u = radius;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int wvg(View view) {
        int iWvg = super.wvg(view);
        if (iWvg == -1) {
            return iWvg;
        }
        C0397q c0397q = new C0397q();
        c0397q.gvn7(this.f2123r);
        c0397q.fti(view.getId(), 8);
        c0397q.ki(this.f2123r);
        float[] fArr = this.f2118f;
        if (iWvg < fArr.length) {
            this.f2118f = x9kr(fArr, iWvg);
            this.f2119j--;
        }
        int[] iArr = this.f2116c;
        if (iWvg < iArr.length) {
            this.f2116c = n5r1(iArr, iWvg);
            this.f2117e--;
        }
        m1371r();
        return iWvg;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: z */
    protected void mo1374z(AttributeSet attrs) {
        super.mo1374z(attrs);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.c4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.jerf) {
                    this.f2120l = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == C0394g.qrj.nrcs) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f2122o = string;
                    setAngles(string);
                } else if (index == C0394g.qrj.h8k) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f2121m = string2;
                    setRadius(string2);
                } else if (index == C0394g.qrj.an) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f47998bo));
                    this.f2115b = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == C0394g.qrj.fvqg) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f2112u));
                    this.f2114a = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public CircularFlow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircularFlow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
