package kotlin.jvm.internal;

import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CollectionToArray.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,82:1\n57#1,22:83\n57#1,22:105\n26#2:127\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n19#1:83,22\n31#1:105,22\n14#1:127\n*E\n"})
@InterfaceC6769y(name = "CollectionToArray")
public final class zurt {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final Object[] f36465k = new Object[0];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f81852toq = 2147483645;

    @InterfaceC7396q
    @InterfaceC6769y(name = "toArray")
    /* JADX INFO: renamed from: k */
    public static final Object[] m23171k(@InterfaceC7396q Collection<?> collection) {
        d2ok.m23075h(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            if (i3 >= f81852toq) {
                                throw new OutOfMemoryError();
                            }
                            i4 = f81852toq;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                        d2ok.kja0(objArrCopyOf, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                        d2ok.kja0(objArrCopyOf2, "copyOf(result, size)");
                        return objArrCopyOf2;
                    }
                    i2 = i3;
                }
            }
        }
        return f36465k;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "toArray")
    public static final Object[] toq(@InterfaceC7396q Collection<?> collection, @InterfaceC7395n Object[] objArr) {
        Object[] objArrCopyOf;
        d2ok.m23075h(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            d2ok.n7h(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    if (i3 >= f81852toq) {
                        throw new OutOfMemoryError();
                    }
                    i4 = f81852toq;
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                d2ok.kja0(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                d2ok.kja0(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    private static final Object[] zy(Collection<?> collection, InterfaceC5981k<Object[]> interfaceC5981k, cyoe.x2<? super Integer, Object[]> x2Var, InterfaceC5979h<? super Object[], ? super Integer, Object[]> interfaceC5979h) {
        int size = collection.size();
        if (size == 0) {
            return interfaceC5981k.invoke();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return interfaceC5981k.invoke();
        }
        Object[] objArrInvoke = x2Var.invoke(Integer.valueOf(size));
        int i2 = 0;
        ?? CopyOf = objArrInvoke;
        while (true) {
            int i3 = i2 + 1;
            CopyOf[i2] = it.next();
            if (i3 >= CopyOf.length) {
                if (!it.hasNext()) {
                    return CopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    if (i3 >= f81852toq) {
                        throw new OutOfMemoryError();
                    }
                    i4 = f81852toq;
                }
                CopyOf = Arrays.copyOf((Object[]) CopyOf, i4);
                d2ok.kja0(CopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                return interfaceC5979h.invoke(CopyOf, Integer.valueOf(i3));
            }
            i2 = i3;
            CopyOf = CopyOf;
        }
    }
}
