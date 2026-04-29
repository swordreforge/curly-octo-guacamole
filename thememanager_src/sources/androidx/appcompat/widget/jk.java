package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.C0683f;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
/* JADX INFO: loaded from: classes.dex */
class jk {

    /* JADX INFO: renamed from: h */
    private static final int f1062h = 1;

    /* JADX INFO: renamed from: i */
    private static final int f1063i = 1048576;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f46894kja0 = 112;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f46895n7h = 12;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    static final float f46897t8r = -1.0f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f46898x2 = "ACTVAutoSizeHelper";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final zy f46900ld6;

    /* JADX INFO: renamed from: p */
    private final Context f1067p;

    /* JADX INFO: renamed from: s */
    @zy.lvui
    private final TextView f1069s;

    /* JADX INFO: renamed from: y */
    private TextPaint f1070y;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final RectF f46896qrj = new RectF();

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f46892cdj = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f46893ki = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k */
    private int f1065k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f46901toq = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f46902zy = -1.0f;

    /* JADX INFO: renamed from: q */
    private float f1068q = -1.0f;

    /* JADX INFO: renamed from: n */
    private float f1066n = -1.0f;

    /* JADX INFO: renamed from: g */
    private int[] f1064g = new int[0];

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f46899f7l8 = false;

    /* JADX INFO: renamed from: androidx.appcompat.widget.jk$k */
    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    @zy.hyr(23)
    private static class C0196k extends zy {
        C0196k() {
        }

        @Override // androidx.appcompat.widget.jk.zy
        /* JADX INFO: renamed from: k */
        void mo620k(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) jk.ki(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    @zy.hyr(29)
    private static class toq extends C0196k {
        toq() {
        }

        @Override // androidx.appcompat.widget.jk.C0196k, androidx.appcompat.widget.jk.zy
        /* JADX INFO: renamed from: k */
        void mo620k(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.jk.zy
        boolean toq(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static class zy {
        zy() {
        }

        /* JADX INFO: renamed from: k */
        void mo620k(StaticLayout.Builder builder, TextView textView) {
        }

        boolean toq(TextView textView) {
            return ((Boolean) jk.ki(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    jk(@zy.lvui TextView textView) {
        this.f1069s = textView;
        this.f1067p = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f46900ld6 = new toq();
        } else {
            this.f46900ld6 = new C0196k();
        }
    }

    private void a9(float f2, float f3, float f4) throws IllegalArgumentException {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f1065k = 1;
        this.f1068q = f2;
        this.f1066n = f3;
        this.f46902zy = f4;
        this.f46899f7l8 = false;
    }

    private StaticLayout f7l8(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f1070y, i2, alignment, ((Float) m611k(this.f1069s, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m611k(this.f1069s, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m611k(this.f1069s, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private void fu4(float f2) {
        if (f2 != this.f1069s.getPaint().getTextSize()) {
            this.f1069s.getPaint().setTextSize(f2);
            boolean zIsInLayout = this.f1069s.isInLayout();
            if (this.f1069s.getLayout() != null) {
                this.f46901toq = false;
                try {
                    Method methodM610h = m610h("nullLayouts");
                    if (methodM610h != null) {
                        methodM610h.invoke(this.f1069s, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w(f46898x2, "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    this.f1069s.forceLayout();
                } else {
                    this.f1069s.requestLayout();
                }
                this.f1069s.invalidate();
            }
        }
    }

    @zy.hyr(23)
    /* JADX INFO: renamed from: g */
    private StaticLayout m609g(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1070y, i2);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.f1069s.getLineSpacingExtra(), this.f1069s.getLineSpacingMultiplier()).setIncludePad(this.f1069s.getIncludeFontPadding()).setBreakStrategy(this.f1069s.getBreakStrategy()).setHyphenationFrequency(this.f1069s.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            this.f46900ld6.mo620k(builderObtain, this.f1069s);
        } catch (ClassCastException unused) {
            Log.w(f46898x2, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }

    @zy.dd
    /* JADX INFO: renamed from: h */
    private static Method m610h(@zy.lvui String str) {
        try {
            Method declaredMethod = f46892cdj.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f46892cdj.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e2) {
            Log.w(f46898x2, "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    private boolean jk() {
        return !(this.f1069s instanceof AppCompatEditText);
    }

    /* JADX INFO: renamed from: k */
    private static <T> T m611k(@zy.lvui Object obj, @zy.lvui String str, @zy.lvui T t2) {
        try {
            Field fieldKja0 = kja0(str);
            return fieldKja0 == null ? t2 : (T) fieldKja0.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w(f46898x2, "Failed to access TextView#" + str + " member", e2);
            return t2;
        }
    }

    static <T> T ki(@zy.lvui Object obj, @zy.lvui String str, @zy.lvui T t2) {
        try {
            return (T) m610h(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w(f46898x2, "Failed to invoke TextView#" + str + "() method", e2);
            return t2;
        }
    }

    @zy.dd
    private static Field kja0(@zy.lvui String str) {
        try {
            Field declaredField = f46893ki.get(str);
            if (declaredField == null && (declaredField = TextView.class.getDeclaredField(str)) != null) {
                declaredField.setAccessible(true);
                f46893ki.put(str, declaredField);
            }
            return declaredField;
        } catch (NoSuchFieldException e2) {
            Log.w(f46898x2, "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    private boolean mcp(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1069s.getText();
        TransformationMethod transformationMethod = this.f1069s.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1069s)) != null) {
            text = transformation;
        }
        int maxLines = this.f1069s.getMaxLines();
        cdj(i2);
        StaticLayout staticLayoutM617n = m617n(text, (Layout.Alignment) ki(this.f1069s, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutM617n.getLineCount() <= maxLines && staticLayoutM617n.getLineEnd(staticLayoutM617n.getLineCount() - 1) == text.length())) && ((float) staticLayoutM617n.getHeight()) <= rectF.bottom;
    }

    private boolean o1t() {
        if (jk() && this.f1065k == 1) {
            if (!this.f46899f7l8 || this.f1064g.length == 0) {
                int iFloor = ((int) Math.floor((this.f1066n - this.f1068q) / this.f46902zy)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round(this.f1068q + (i2 * this.f46902zy));
                }
                this.f1064g = zy(iArr);
            }
            this.f46901toq = true;
        } else {
            this.f46901toq = false;
        }
        return this.f46901toq;
    }

    /* JADX INFO: renamed from: q */
    private void m612q() {
        this.f1065k = 0;
        this.f1068q = -1.0f;
        this.f1066n = -1.0f;
        this.f46902zy = -1.0f;
        this.f1064g = new int[0];
        this.f46901toq = false;
    }

    /* JADX INFO: renamed from: s */
    private int m613s(RectF rectF) {
        int i2;
        int length = this.f1064g.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = 0;
        int i4 = 1;
        int i5 = length - 1;
        while (true) {
            int i6 = i4;
            int i7 = i3;
            i3 = i6;
            while (i3 <= i5) {
                i2 = (i3 + i5) / 2;
                if (mcp(this.f1064g[i2], rectF)) {
                    break;
                }
                i7 = i2 - 1;
                i5 = i7;
            }
            return this.f1064g[i7];
            i4 = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: t */
    private boolean m614t() {
        boolean z2 = this.f1064g.length > 0;
        this.f46899f7l8 = z2;
        if (z2) {
            this.f1065k = 1;
            this.f1068q = r0[0];
            this.f1066n = r0[r1 - 1];
            this.f46902zy = -1.0f;
        }
        return z2;
    }

    private void wvg(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f1064g = zy(iArr);
            m614t();
        }
    }

    @zy.hyr(16)
    /* JADX INFO: renamed from: y */
    private StaticLayout m615y(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f1070y, i2, alignment, this.f1069s.getLineSpacingMultiplier(), this.f1069s.getLineSpacingExtra(), this.f1069s.getIncludeFontPadding());
    }

    private int[] zy(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    @zy.yz
    void cdj(int i2) {
        TextPaint textPaint = this.f1070y;
        if (textPaint == null) {
            this.f1070y = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1070y.set(this.f1069s.getPaint());
        this.f1070y.setTextSize(i2);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    void fn3e(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (jk()) {
            DisplayMetrics displayMetrics = this.f1067p.getResources().getDisplayMetrics();
            a9(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (o1t()) {
                toq();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    void m616i(@zy.dd AttributeSet attributeSet, int i2) {
        int resourceId;
        Context context = this.f1067p;
        int[] iArr = C7397k.qrj.f92666h7am;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TextView textView = this.f1069s;
        C0683f.ij(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        int i3 = C7397k.qrj.f92781wx16;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.f1065k = typedArrayObtainStyledAttributes.getInt(i3, 0);
        }
        int i4 = C7397k.qrj.f92758uc;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i4) ? typedArrayObtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C7397k.qrj.f92679jbh;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i5) ? typedArrayObtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C7397k.qrj.f92708mbx;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i6) ? typedArrayObtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = C7397k.qrj.f92791yl;
        if (typedArrayObtainStyledAttributes.hasValue(i7) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i7, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            wvg(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!jk()) {
            this.f1065k = 0;
            return;
        }
        if (this.f1065k == 1) {
            if (!this.f46899f7l8) {
                DisplayMetrics displayMetrics = this.f1067p.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                a9(dimension2, dimension3, dimension);
            }
            o1t();
        }
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    int ld6() {
        return Math.round(this.f1068q);
    }

    @zy.yz
    /* JADX INFO: renamed from: n */
    StaticLayout m617n(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        return m609g(charSequence, alignment, i2, i3);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    int n7h() {
        return this.f1065k;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    void ni7(int i2) {
        if (jk()) {
            if (i2 == 0) {
                m612q();
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            DisplayMetrics displayMetrics = this.f1067p.getResources().getDisplayMetrics();
            a9(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (o1t()) {
                toq();
            }
        }
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: p */
    int m618p() {
        return Math.round(this.f1066n);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    int[] qrj() {
        return this.f1064g;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    boolean t8r() {
        return jk() && this.f1065k != 0;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    void toq() {
        if (t8r()) {
            if (this.f46901toq) {
                if (this.f1069s.getMeasuredHeight() <= 0 || this.f1069s.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f46900ld6.toq(this.f1069s) ? 1048576 : (this.f1069s.getMeasuredWidth() - this.f1069s.getTotalPaddingLeft()) - this.f1069s.getTotalPaddingRight();
                int height = (this.f1069s.getHeight() - this.f1069s.getCompoundPaddingBottom()) - this.f1069s.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f46896qrj;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fM613s = m613s(rectF);
                    if (fM613s != this.f1069s.getTextSize()) {
                        m619z(0, fM613s);
                    }
                }
            }
            this.f46901toq = true;
        }
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    int x2() {
        return Math.round(this.f46902zy);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: z */
    void m619z(int i2, float f2) {
        Context context = this.f1067p;
        fu4(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    void zurt(@zy.lvui int[] iArr, int i2) throws IllegalArgumentException {
        if (jk()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1067p.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                this.f1064g = zy(iArrCopyOf);
                if (!m614t()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f46899f7l8 = false;
            }
            if (o1t()) {
                toq();
            }
        }
    }
}
