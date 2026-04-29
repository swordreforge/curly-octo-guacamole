package kotlin.collections;

import cyoe.InterfaceC5981k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C6220d;
import kotlin.C6227f;
import kotlin.bo;
import kotlin.dr;
import kotlin.internal.InterfaceC6234g;
import kotlin.tfm;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Arrays.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
class n7h extends qrj {
    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.nn86
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "contentDeepEquals")
    public static final <T> boolean f7l8(@InterfaceC7395n T[] tArr, @InterfaceC7395n T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object[] objArr = tArr[i2];
            Object[] objArr2 = tArr2[i2];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!f7l8(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof bo) && (objArr2 instanceof bo)) {
                    if (!kotlin.collections.unsigned.zy.v0af(((bo) objArr).zurt(), ((bo) objArr2).zurt())) {
                        return false;
                    }
                } else if ((objArr instanceof tfm) && (objArr2 instanceof tfm)) {
                    if (!kotlin.collections.unsigned.zy.r8s8(((tfm) objArr).zurt(), ((tfm) objArr2).zurt())) {
                        return false;
                    }
                } else if ((objArr instanceof dr) && (objArr2 instanceof dr)) {
                    if (!kotlin.collections.unsigned.zy.m4(((dr) objArr).zurt(), ((dr) objArr2).zurt())) {
                        return false;
                    }
                } else if ((objArr instanceof C6220d) && (objArr2 instanceof C6220d)) {
                    if (!kotlin.collections.unsigned.zy.etdu(((C6220d) objArr).zurt(), ((C6220d) objArr2).zurt())) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.d2ok.f7l8(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lcyoe/k<+TR;>;)TR; */
    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final Object ld6(Object[] objArr, InterfaceC5981k defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return objArr.length == 0 ? defaultValue.invoke() : objArr;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final <T> List<T> m22560p(@InterfaceC7396q T[][] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(length);
        for (T[] tArr3 : tArr) {
            C6163t.ch(arrayList, tArr3);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T, R> C6227f<List<T>, List<R>> qrj(@InterfaceC7396q C6227f<? extends T, ? extends R>[] c6227fArr) {
        kotlin.jvm.internal.d2ok.m23075h(c6227fArr, "<this>");
        ArrayList arrayList = new ArrayList(c6227fArr.length);
        ArrayList arrayList2 = new ArrayList(c6227fArr.length);
        for (C6227f<? extends T, ? extends R> c6227f : c6227fArr) {
            arrayList.add(c6227f.getFirst());
            arrayList2.add(c6227f.getSecond());
        }
        return kotlin.nmn5.m23230k(arrayList, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    private static final <T> void m22561s(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i2];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                m22561s(objArr, sb, list);
            } else if (objArr instanceof byte[]) {
                String string = Arrays.toString((byte[]) objArr);
                kotlin.jvm.internal.d2ok.kja0(string, "toString(this)");
                sb.append(string);
            } else if (objArr instanceof short[]) {
                String string2 = Arrays.toString((short[]) objArr);
                kotlin.jvm.internal.d2ok.kja0(string2, "toString(this)");
                sb.append(string2);
            } else if (objArr instanceof int[]) {
                String string3 = Arrays.toString((int[]) objArr);
                kotlin.jvm.internal.d2ok.kja0(string3, "toString(this)");
                sb.append(string3);
            } else if (objArr instanceof long[]) {
                String string4 = Arrays.toString((long[]) objArr);
                kotlin.jvm.internal.d2ok.kja0(string4, "toString(this)");
                sb.append(string4);
            } else if (objArr instanceof float[]) {
                String string5 = Arrays.toString((float[]) objArr);
                kotlin.jvm.internal.d2ok.kja0(string5, "toString(this)");
                sb.append(string5);
            } else if (objArr instanceof double[]) {
                String string6 = Arrays.toString((double[]) objArr);
                kotlin.jvm.internal.d2ok.kja0(string6, "toString(this)");
                sb.append(string6);
            } else if (objArr instanceof char[]) {
                String string7 = Arrays.toString((char[]) objArr);
                kotlin.jvm.internal.d2ok.kja0(string7, "toString(this)");
                sb.append(string7);
            } else if (objArr instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) objArr);
                kotlin.jvm.internal.d2ok.kja0(string8, "toString(this)");
                sb.append(string8);
            } else if (objArr instanceof bo) {
                sb.append(kotlin.collections.unsigned.zy.yqrt(((bo) objArr).zurt()));
            } else if (objArr instanceof tfm) {
                sb.append(kotlin.collections.unsigned.zy.bwp(((tfm) objArr).zurt()));
            } else if (objArr instanceof dr) {
                sb.append(kotlin.collections.unsigned.zy.kcsr(((dr) objArr).zurt()));
            } else if (objArr instanceof C6220d) {
                sb.append(kotlin.collections.unsigned.zy.se(((C6220d) objArr).zurt()));
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(']');
        list.remove(ni7.jp0y(list));
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final boolean x2(Object[] objArr) {
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                return false;
            }
        }
        return true;
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "contentDeepToString")
    /* JADX INFO: renamed from: y */
    public static final <T> String m22562y(@InterfaceC7395n T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((kotlin.ranges.fn3e.m23305t(tArr.length, 429496729) * 5) + 2);
        m22561s(tArr, sb, new ArrayList());
        String string = sb.toString();
        kotlin.jvm.internal.d2ok.kja0(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
