package com.market.sdk.reflect;

import android.util.Log;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import miuix.miuixbasewidget.widget.AlphabetIndexer;

/* JADX INFO: renamed from: com.market.sdk.reflect.y */
/* JADX INFO: compiled from: ReflectTool.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4992y {

    /* JADX INFO: renamed from: k */
    private static final String f28138k = "ReflectTool";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Map<Character, Class> f68931toq;

    /* JADX INFO: renamed from: com.market.sdk.reflect.y$k */
    /* JADX INFO: compiled from: ReflectTool.java */
    private static class k {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f68932zy = 321;

        /* JADX INFO: renamed from: k */
        private String f28139k = "The quick fox jumps over the lazy dogs.";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int[] f68933toq = {1, 2, 3, 4, 5};

        /* JADX INFO: renamed from: k */
        public String m17371k(String[] strArr) {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            return sb.toString();
        }

        public int toq(int[] iArr) {
            int i2 = 0;
            for (int i3 : iArr) {
                i2 += i3;
            }
            return i2;
        }
    }

    static {
        HashMap map = new HashMap();
        f68931toq = map;
        map.put('V', Void.TYPE);
        f68931toq.put('Z', Boolean.TYPE);
        f68931toq.put('B', Byte.TYPE);
        f68931toq.put('C', Character.TYPE);
        f68931toq.put('S', Short.TYPE);
        f68931toq.put('I', Integer.TYPE);
        f68931toq.put('J', Long.TYPE);
        f68931toq.put('F', Float.TYPE);
        f68931toq.put('D', Double.TYPE);
    }

    public static Object f7l8(Class<?> cls, Object obj, String str, String str2) {
        try {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (C4986g e2) {
                Log.w(f28138k, "ReflectUtil#getFieldValue ", e2);
                return null;
            } catch (IllegalAccessException e3) {
                Log.w(f28138k, "ReflectUtil#getFieldValue ", e3);
                return null;
            } catch (NoSuchFieldException e4) {
                e4.printStackTrace();
                return null;
            }
        } catch (C4986g unused) {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field.get(obj);
        } catch (IllegalAccessException e6) {
            Log.w(f28138k, "ReflectUtil#getFieldValue ", e6);
            return null;
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m17365g(Class<?> cls, Object obj, String str, int i2) {
        Object objF7l8 = f7l8(cls, obj, str, toq.f28131g);
        return objF7l8 == null ? i2 : ((Integer) objF7l8).intValue();
    }

    /* JADX INFO: renamed from: k */
    private static void m17366k(int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        System.out.println("Assert failed: expected<" + i3 + ">, but was <" + i2 + ">");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m17367n(Class<?> cls, Object obj, String str, boolean z2) {
        Object objF7l8 = f7l8(cls, obj, str, toq.f68929toq);
        return objF7l8 == null ? z2 : ((Boolean) objF7l8).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public static Object m17368q(Class<?> cls, Object obj, String str, String str2, Object... objArr) {
        Method method;
        try {
            try {
                method = cls.getMethod(str, m17369s(str2));
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
                method = null;
            }
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (f7l8 e3) {
            Log.w(f28138k, "ReflectUtil#callMethod ", e3);
            return null;
        } catch (ClassNotFoundException e4) {
            Log.w(f28138k, "ReflectUtil#callMethod ", e4);
            return null;
        } catch (IllegalAccessException e6) {
            Log.w(f28138k, "ReflectUtil#callMethod ", e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.w(f28138k, "ReflectUtil#callMethod ", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static Class<?>[] m17369s(String str) throws ClassNotFoundException {
        if (str != null && str != "") {
            String strSubstring = str.substring(str.indexOf(40) + 1, str.indexOf(41));
            if (strSubstring != null && strSubstring != "") {
                ArrayList arrayList = new ArrayList();
                int i2 = -1;
                boolean z2 = false;
                for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                    char cCharAt = strSubstring.charAt(i3);
                    if (i2 >= 0 || !f68931toq.containsKey(Character.valueOf(cCharAt))) {
                        if (cCharAt == '[') {
                            z2 = true;
                        } else if (cCharAt == 'L') {
                            if (i2 == -1) {
                                i2 = i3;
                            }
                        } else if (cCharAt == ';') {
                            String strReplaceAll = strSubstring.substring(i2 + 1, i3).replaceAll("/", ".");
                            if (z2) {
                                arrayList.add(Array.newInstance(Class.forName(strReplaceAll), 0).getClass());
                            } else {
                                arrayList.add(Class.forName(strReplaceAll));
                            }
                            i2 = -1;
                        }
                    } else if (z2) {
                        arrayList.add(Array.newInstance((Class<?>) f68931toq.get(Character.valueOf(cCharAt)), 0).getClass());
                    } else {
                        arrayList.add(f68931toq.get(Character.valueOf(cCharAt)));
                    }
                    z2 = false;
                }
                Class<?>[] clsArr = new Class[arrayList.size()];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    clsArr[i4] = (Class) arrayList.get(i4);
                }
                return clsArr;
            }
        }
        return null;
    }

    private static void toq(String str, String str2) {
        if (str2.equals(str)) {
            return;
        }
        System.out.println("Assert failed: expected<" + str2 + ">, but was <" + str + ">");
    }

    /* JADX INFO: renamed from: y */
    public static void m17370y(String[] strArr) {
        System.out.println("msg is: \nHello, world of Reflection");
        String str = (String) m17368q("Hello, world of Reflection".getClass(), "Hello, world of Reflection", "substring", "(II)Ljava/lang/String;", 2, 10);
        System.out.println("substring(2, 10) is\n" + str);
        toq(str, "llo, wor");
        int iIntValue = ((Integer) m17368q(String.class, "Hello, world of Reflection", "indexOf", "(Ljava/lang/String;)I", "llo")).intValue();
        System.out.println("index is " + iIntValue);
        m17366k(iIntValue, 2);
        int iIntValue2 = ((Integer) m17368q(String.class, "Hello, world of Reflection", "length", "()I", new Object[0])).intValue();
        System.out.println("length of it is " + iIntValue2);
        m17366k(iIntValue2, 26);
        Object objF7l8 = f7l8(String.class, "Hello, world of Reflection", "count", toq.f28131g);
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("field value count of string is ");
        sb.append(objF7l8 == null ? "no such field" : objF7l8);
        printStream.println(sb.toString());
        zy(objF7l8);
        k kVar = new k();
        String str2 = (String) f7l8(k.class, kVar, "mTestField", "Ljava/lang/String;");
        System.out.println("test field " + str2);
        toq(str2, "The quick fox jumps over the lazy dogs.");
        int iM17365g = m17365g(k.class, null, "STATIC", -1023);
        System.out.println(" static field " + iM17365g);
        m17366k(iM17365g, 321);
        int[] iArr = (int[]) f7l8(k.class, kVar, "mTestArray", null);
        System.out.println(iArr.getClass());
        System.out.println(new String[0].getClass());
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        m17366k(i2, 15);
        m17366k(((Integer) m17368q(k.class, kVar, "sum", "([I)I", iArr)).intValue(), 15);
        String str3 = (String) m17368q(k.class, kVar, "concat", "([Ljava/lang/String;)Ljava/lang/String;", new String[]{"Hello", ",", " ", "world", AlphabetIndexer.ad});
        System.out.println(str3);
        toq(str3, "Hello, world!");
    }

    private static void zy(Object obj) {
        if (obj == null) {
            return;
        }
        System.out.println("Assert failed: expected null but was " + obj);
    }
}
