package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.C0394g;
import androidx.core.view.C0683f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.k */
/* JADX INFO: compiled from: ConstraintAttribute.java */
/* JADX INFO: loaded from: classes.dex */
public class C0395k {

    /* JADX INFO: renamed from: s */
    private static final String f2915s = "TransitionLayout";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    boolean f49687f7l8;

    /* JADX INFO: renamed from: g */
    private String f2916g;

    /* JADX INFO: renamed from: k */
    private boolean f2917k;

    /* JADX INFO: renamed from: n */
    private float f2918n;

    /* JADX INFO: renamed from: q */
    private int f2919q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    String f49688toq;

    /* JADX INFO: renamed from: y */
    private int f2920y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private toq f49689zy;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.k$k */
    /* JADX INFO: compiled from: ConstraintAttribute.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f2921k;

        static {
            int[] iArr = new int[toq.values().length];
            f2921k = iArr;
            try {
                iArr[toq.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2921k[toq.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2921k[toq.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2921k[toq.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2921k[toq.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2921k[toq.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2921k[toq.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2921k[toq.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.k$toq */
    /* JADX INFO: compiled from: ConstraintAttribute.java */
    public enum toq {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public C0395k(String name, toq attributeType) {
        this.f2917k = false;
        this.f49688toq = name;
        this.f49689zy = attributeType;
    }

    public static void cdj(Context context, XmlPullParser parser, HashMap<String, C0395k> custom) {
        toq toqVar;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), C0394g.qrj.ttq);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        toq toqVar2 = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == C0394g.qrj.dkp2) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == C0394g.qrj.f14) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == C0394g.qrj.tb) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                toqVar2 = toq.BOOLEAN_TYPE;
            } else {
                if (index == C0394g.qrj.h5bu) {
                    toqVar = toq.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == C0394g.qrj.vtz9) {
                    toqVar = toq.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == C0394g.qrj.ua79) {
                    toqVar = toq.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == C0394g.qrj.whyb) {
                    toqVar = toq.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0394g.qrj.qs) {
                    toqVar = toq.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C0394g.qrj.ueix) {
                    toqVar = toq.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == C0394g.qrj.j59a) {
                    toqVar = toq.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == C0394g.qrj.vl) {
                    toqVar = toq.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                toqVar2 = toqVar;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            custom.put(string, new C0395k(string, toqVar2, objValueOf2, z2));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void ki(View view, HashMap<String, C0395k> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C0395k c0395k = map.get(str);
            String str2 = c0395k.f2917k ? str : "set" + str;
            try {
                switch (k.f2921k[c0395k.f49689zy.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0395k.f2919q));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c0395k.f49687f7l8));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c0395k.f2916g);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0395k.f2920y));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c0395k.f2920y);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0395k.f2919q));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0395k.f2918n));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0395k.f2918n));
                        break;
                }
            } catch (IllegalAccessException e2) {
                Log.e(f2915s, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                Log.e(f2915s, e3.getMessage());
                Log.e(f2915s, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e(f2915s, sb.toString());
            } catch (InvocationTargetException e4) {
                Log.e(f2915s, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e4.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static HashMap<String, C0395k> m1635q(HashMap<String, C0395k> base, View view) {
        HashMap<String, C0395k> map = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : base.keySet()) {
            C0395k c0395k = base.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map.put(str, new C0395k(c0395k, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map.put(str, new C0395k(c0395k, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        return map;
    }

    private static int toq(int c2) {
        int i2 = (c2 & (~(c2 >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public int f7l8() {
        return this.f2919q;
    }

    public void fn3e(int value) {
        this.f2919q = value;
    }

    public void fu4(float[] value) {
        switch (k.f2921k[this.f49689zy.ordinal()]) {
            case 1:
            case 6:
                this.f2919q = (int) value[0];
                return;
            case 2:
                this.f49687f7l8 = ((double) value[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int iHSVToColor = Color.HSVToColor(value);
                this.f2920y = iHSVToColor;
                this.f2920y = (toq((int) (value[3] * 255.0f)) << 24) | (iHSVToColor & C0683f.f50797t8r);
                return;
            case 7:
                this.f2918n = value[0];
                return;
            case 8:
                this.f2918n = value[0];
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: g */
    public float m1636g() {
        return this.f2918n;
    }

    /* JADX INFO: renamed from: h */
    public int m1637h() {
        int i2 = k.f2921k[this.f49689zy.ordinal()];
        return (i2 == 4 || i2 == 5) ? 4 : 1;
    }

    /* JADX INFO: renamed from: i */
    public void m1638i(float value) {
        this.f2918n = value;
    }

    /* JADX INFO: renamed from: k */
    public void m1639k(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f49688toq;
        if (this.f2917k) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            switch (k.f2921k[this.f49689zy.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f2919q));
                    break;
                case 2:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f49687f7l8));
                    break;
                case 3:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f2916g);
                    break;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f2920y));
                    break;
                case 5:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f2920y);
                    method.invoke(view, colorDrawable);
                    break;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f2918n));
                    break;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f2918n));
                    break;
            }
        } catch (IllegalAccessException e2) {
            Log.e(f2915s, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            Log.e(f2915s, e3.getMessage());
            Log.e(f2915s, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" must have a method ");
            sb.append(str);
            Log.e(f2915s, sb.toString());
        } catch (InvocationTargetException e4) {
            Log.e(f2915s, " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e4.printStackTrace();
        }
    }

    public boolean kja0() {
        return this.f2917k;
    }

    public float ld6() {
        switch (k.f2921k[this.f49689zy.ordinal()]) {
            case 2:
                return this.f49687f7l8 ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f2919q;
            case 7:
                return this.f2918n;
            case 8:
                return this.f2918n;
            default:
                return Float.NaN;
        }
    }

    /* JADX INFO: renamed from: n */
    public int m1640n() {
        return this.f2920y;
    }

    public boolean n7h() {
        int i2 = k.f2921k[this.f49689zy.ordinal()];
        return (i2 == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    public void ni7(Object value) {
        switch (k.f2921k[this.f49689zy.ordinal()]) {
            case 1:
            case 6:
                this.f2919q = ((Integer) value).intValue();
                break;
            case 2:
                this.f49687f7l8 = ((Boolean) value).booleanValue();
                break;
            case 3:
                this.f2916g = (String) value;
                break;
            case 4:
            case 5:
                this.f2920y = ((Integer) value).intValue();
                break;
            case 7:
                this.f2918n = ((Float) value).floatValue();
                break;
            case 8:
                this.f2918n = ((Float) value).floatValue();
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public toq m1641p() {
        return this.f49689zy;
    }

    public boolean qrj() {
        return this.f49687f7l8;
    }

    /* JADX INFO: renamed from: s */
    public String m1642s() {
        return this.f2916g;
    }

    public void t8r(int value) {
        this.f2920y = value;
    }

    public void x2(float[] ret) {
        switch (k.f2921k[this.f49689zy.ordinal()]) {
            case 2:
                ret[0] = this.f49687f7l8 ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i2 = (this.f2920y >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                ret[0] = fPow;
                ret[1] = fPow2;
                ret[2] = fPow3;
                ret[3] = i2 / 255.0f;
                return;
            case 6:
                ret[0] = this.f2919q;
                return;
            case 7:
                ret[0] = this.f2918n;
                return;
            case 8:
                ret[0] = this.f2918n;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: y */
    public String m1643y() {
        return this.f49688toq;
    }

    public void zurt(String value) {
        this.f2916g = value;
    }

    public boolean zy(C0395k constraintAttribute) {
        toq toqVar;
        if (constraintAttribute == null || (toqVar = this.f49689zy) != constraintAttribute.f49689zy) {
            return false;
        }
        switch (k.f2921k[toqVar.ordinal()]) {
            case 1:
            case 6:
                return this.f2919q == constraintAttribute.f2919q;
            case 2:
                return this.f49687f7l8 == constraintAttribute.f49687f7l8;
            case 3:
                return this.f2919q == constraintAttribute.f2919q;
            case 4:
            case 5:
                return this.f2920y == constraintAttribute.f2920y;
            case 7:
                return this.f2918n == constraintAttribute.f2918n;
            case 8:
                return this.f2918n == constraintAttribute.f2918n;
            default:
                return false;
        }
    }

    public C0395k(String name, toq attributeType, Object value, boolean method) {
        this.f49688toq = name;
        this.f49689zy = attributeType;
        this.f2917k = method;
        ni7(value);
    }

    public C0395k(C0395k source, Object value) {
        this.f2917k = false;
        this.f49688toq = source.f49688toq;
        this.f49689zy = source.f49689zy;
        ni7(value);
    }
}
