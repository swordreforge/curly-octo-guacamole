package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.kja0;
import androidx.core.graphics.cdj;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.uv6;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.n */
/* JADX INFO: compiled from: AnimatorInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C1255n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f53600f7l8 = 3;

    /* JADX INFO: renamed from: g */
    private static final int f6832g = 2;

    /* JADX INFO: renamed from: k */
    private static final String f6833k = "AnimatorInflater";

    /* JADX INFO: renamed from: n */
    private static final int f6834n = 1;

    /* JADX INFO: renamed from: q */
    private static final int f6835q = 0;

    /* JADX INFO: renamed from: s */
    private static final boolean f6836s = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f53601toq = 0;

    /* JADX INFO: renamed from: y */
    private static final int f6837y = 4;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f53602zy = 100;

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.n$k */
    /* JADX INFO: compiled from: AnimatorInflaterCompat.java */
    private static class k implements TypeEvaluator<cdj.toq[]> {

        /* JADX INFO: renamed from: k */
        private cdj.toq[] f6838k;

        k() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public cdj.toq[] evaluate(float f2, cdj.toq[] toqVarArr, cdj.toq[] toqVarArr2) {
            if (!cdj.toq(toqVarArr, toqVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!cdj.toq(this.f6838k, toqVarArr)) {
                this.f6838k = cdj.m2387g(toqVarArr);
            }
            for (int i2 = 0; i2 < toqVarArr.length; i2++) {
                this.f6838k[i2].m2396q(toqVarArr[i2], toqVarArr2[i2], f2);
            }
            return this.f6838k;
        }

        k(cdj.toq[] toqVarArr) {
            this.f6838k = toqVarArr;
        }
    }

    private C1255n() {
    }

    private static PropertyValuesHolder[] cdj(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, C1254k.f6817j);
                    String strQrj = kja0.qrj(typedArrayT8r, xmlPullParser, "propertyName", 3);
                    int iLd6 = kja0.ld6(typedArrayT8r, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder propertyValuesHolderM5447h = m5447h(context, resources, theme, xmlPullParser, strQrj, iLd6);
                    if (propertyValuesHolderM5447h == null) {
                        propertyValuesHolderM5447h = m5446g(typedArrayT8r, iLd6, 0, 1, strQrj);
                    }
                    if (propertyValuesHolderM5447h != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(propertyValuesHolderM5447h);
                    }
                    typedArrayT8r.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i2 = 0; i2 < size; i2++) {
                propertyValuesHolderArr[i2] = (PropertyValuesHolder) arrayList.get(i2);
            }
        }
        return propertyValuesHolderArr;
    }

    private static int f7l8(TypedArray typedArray, int i2, int i3) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z2 = typedValuePeekValue != null;
        int i4 = z2 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z3 = typedValuePeekValue2 != null;
        return ((z2 && m5453s(i4)) || (z3 && m5453s(z3 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
    }

    /* JADX INFO: renamed from: g */
    private static PropertyValuesHolder m5446g(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue != null;
        int i5 = z2 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i4);
        boolean z3 = typedValuePeekValue2 != null;
        int i6 = z3 ? typedValuePeekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z2 && m5453s(i5)) || (z3 && m5453s(i6))) ? 3 : 0;
        }
        boolean z5 = i2 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i2 != 2) {
            C1253g c1253gM5445k = i2 == 3 ? C1253g.m5445k() : null;
            if (z5) {
                if (z2) {
                    float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    if (z3) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z2) {
                int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m5453s(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                if (z3) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : m5453s(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z3) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : m5453s(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
            }
            if (propertyValuesHolderOfInt == null || c1253gM5445k == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(c1253gM5445k);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i3);
        String string2 = typedArray.getString(i4);
        cdj.toq[] toqVarArrM2391q = cdj.m2391q(string);
        cdj.toq[] toqVarArrM2391q2 = cdj.m2391q(string2);
        if (toqVarArrM2391q == null && toqVarArrM2391q2 == null) {
            return null;
        }
        if (toqVarArrM2391q == null) {
            if (toqVarArrM2391q2 != null) {
                return PropertyValuesHolder.ofObject(str, new k(), toqVarArrM2391q2);
            }
            return null;
        }
        k kVar = new k();
        if (toqVarArrM2391q2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, kVar, toqVarArrM2391q);
        } else {
            if (!cdj.toq(toqVarArrM2391q, toqVarArrM2391q2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, kVar, toqVarArrM2391q, toqVarArrM2391q2);
        }
        return propertyValuesHolderOfObject;
    }

    /* JADX INFO: renamed from: h */
    private static PropertyValuesHolder m5447h(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i2) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolderOfKeyframe = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i2 == 4) {
                    i2 = m5454y(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe keyframeN7h = n7h(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i2, xmlPullParser);
                if (keyframeN7h != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeN7h);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), zy(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, zy(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i3 = 0; i3 < size; i3++) {
                Keyframe keyframe3 = keyframeArr[i3];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i3 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i4 = size - 1;
                        if (i3 == i4) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i5 = i3;
                            for (int i6 = i3 + 1; i6 < i4 && keyframeArr[i6].getFraction() < 0.0f; i6++) {
                                i5 = i6;
                            }
                            m5452q(keyframeArr, keyframeArr[i5 + 1].getFraction() - keyframeArr[i3 - 1].getFraction(), i3, i5);
                        }
                    }
                }
            }
            propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i2 == 3) {
                propertyValuesHolderOfKeyframe.setEvaluator(C1253g.m5445k());
            }
        }
        return propertyValuesHolderOfKeyframe;
    }

    /* JADX INFO: renamed from: i */
    private static void m5448i(Path path, ObjectAnimator objectAnimator, float f2, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f3 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f2)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f4 = length / (iMin - 1);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            f3 += f4;
            int i4 = i3 + 1;
            if (i4 < arrayList.size() && f3 > ((Float) arrayList.get(i4)).floatValue()) {
                pathMeasure2.nextContour();
                i3 = i4;
            }
            i2++;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }

    /* JADX INFO: renamed from: k */
    private static Animator m5449k(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f2) throws XmlPullParserException, IOException {
        return toq(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f2);
    }

    private static void ki(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f2, XmlPullParser xmlPullParser) {
        long jLd6 = kja0.ld6(typedArray, xmlPullParser, "duration", 1, 300);
        long jLd62 = kja0.ld6(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iLd6 = kja0.ld6(typedArray, xmlPullParser, "valueType", 7, 4);
        if (kja0.ki(xmlPullParser, "valueFrom") && kja0.ki(xmlPullParser, "valueTo")) {
            if (iLd6 == 4) {
                iLd6 = f7l8(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderM5446g = m5446g(typedArray, iLd6, 5, 6, "");
            if (propertyValuesHolderM5446g != null) {
                valueAnimator.setValues(propertyValuesHolderM5446g);
            }
        }
        valueAnimator.setDuration(jLd6);
        valueAnimator.setStartDelay(jLd62);
        valueAnimator.setRepeatCount(kja0.ld6(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(kja0.ld6(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            t8r(valueAnimator, typedArray2, iLd6, f2, xmlPullParser);
        }
    }

    private static ObjectAnimator kja0(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        qrj(context, resources, theme, attributeSet, objectAnimator, f2, xmlPullParser);
        return objectAnimator;
    }

    public static Animator ld6(Context context, Resources resources, Resources.Theme theme, @zy.toq int i2) throws Resources.NotFoundException {
        return x2(context, resources, theme, i2, 1.0f);
    }

    /* JADX INFO: renamed from: n */
    private static void m5450n(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        Log.d(f6833k, str);
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Keyframe keyframe = (Keyframe) objArr[i2];
            StringBuilder sb = new StringBuilder();
            sb.append("Keyframe ");
            sb.append(i2);
            sb.append(": fraction ");
            Object value = "null";
            sb.append(keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction()));
            sb.append(", , value : ");
            if (keyframe.hasValue()) {
                value = keyframe.getValue();
            }
            sb.append(value);
            Log.d(f6833k, sb.toString());
        }
    }

    private static Keyframe n7h(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i2, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, C1254k.f53595y9n);
        float fM2305p = kja0.m2305p(typedArrayT8r, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueM2302i = kja0.m2302i(typedArrayT8r, xmlPullParser, "value", 0);
        boolean z2 = typedValueM2302i != null;
        if (i2 == 4) {
            i2 = (z2 && m5453s(typedValueM2302i.type)) ? 3 : 0;
        }
        Keyframe keyframeOfInt = z2 ? i2 != 0 ? (i2 == 1 || i2 == 3) ? Keyframe.ofInt(fM2305p, kja0.ld6(typedArrayT8r, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(fM2305p, kja0.m2305p(typedArrayT8r, xmlPullParser, "value", 0, 0.0f)) : i2 == 0 ? Keyframe.ofFloat(fM2305p) : Keyframe.ofInt(fM2305p);
        int iX2 = kja0.x2(typedArrayT8r, xmlPullParser, "interpolator", 1, 0);
        if (iX2 > 0) {
            keyframeOfInt.setInterpolator(C1256q.toq(context, iX2));
        }
        typedArrayT8r.recycle();
        return keyframeOfInt;
    }

    /* JADX INFO: renamed from: p */
    public static Animator m5451p(Context context, @zy.toq int i2) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i2);
    }

    /* JADX INFO: renamed from: q */
    private static void m5452q(Keyframe[] keyframeArr, float f2, int i2, int i3) {
        float f3 = f2 / ((i3 - i2) + 2);
        while (i2 <= i3) {
            keyframeArr[i2].setFraction(keyframeArr[i2 - 1].getFraction() + f3);
            i2++;
        }
    }

    private static ValueAnimator qrj(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, C1254k.f6819l);
        TypedArray typedArrayT8r2 = kja0.t8r(resources, theme, attributeSet, C1254k.f6809a);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        ki(valueAnimator, typedArrayT8r, typedArrayT8r2, f2, xmlPullParser);
        int iX2 = kja0.x2(typedArrayT8r, xmlPullParser, "interpolator", 0, 0);
        if (iX2 > 0) {
            valueAnimator.setInterpolator(C1256q.toq(context, iX2));
        }
        typedArrayT8r.recycle();
        if (typedArrayT8r2 != null) {
            typedArrayT8r2.recycle();
        }
        return valueAnimator;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m5453s(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    private static void t8r(ValueAnimator valueAnimator, TypedArray typedArray, int i2, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strQrj = kja0.qrj(typedArray, xmlPullParser, "pathData", 1);
        if (strQrj == null) {
            objectAnimator.setPropertyName(kja0.qrj(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strQrj2 = kja0.qrj(typedArray, xmlPullParser, "propertyXName", 2);
        String strQrj3 = kja0.qrj(typedArray, xmlPullParser, "propertyYName", 3);
        if (i2 != 2) {
        }
        if (strQrj2 != null || strQrj3 != null) {
            m5448i(cdj.m2389n(strQrj), objectAnimator, f2 * 0.5f, strQrj2, strQrj3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r13 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r2.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r24 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator toq(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1255n.toq(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Animator x2(Context context, Resources resources, Resources.Theme theme, @zy.toq int i2, float f2) throws Resources.NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i2);
                    return m5449k(context, resources, theme, animation, f2);
                } catch (XmlPullParserException e2) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                    notFoundException.initCause(e2);
                    throw notFoundException;
                }
            } catch (IOException e3) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException2.initCause(e3);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private static int m5454y(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, C1254k.f53595y9n);
        int i2 = 0;
        TypedValue typedValueM2302i = kja0.m2302i(typedArrayT8r, xmlPullParser, "value", 0);
        if ((typedValueM2302i != null) && m5453s(typedValueM2302i.type)) {
            i2 = 3;
        }
        typedArrayT8r.recycle();
        return i2;
    }

    private static Keyframe zy(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }
}
