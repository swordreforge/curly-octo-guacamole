package kotlin.collections;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.internal.InterfaceC6234g;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ArraysJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nArraysJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,61:1\n26#2:62\n*S KotlinDebug\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n18#1:62\n*E\n"})
class qrj {
    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ <T> T[] m22601g(Collection<? extends T> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23086z(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> T[] m22602k(@InterfaceC7396q T[] reference, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i2);
        kotlin.jvm.internal.d2ok.n7h(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static final String m22603n(byte[] bArr, Charset charset) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ <T> T[] m22604q(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        kotlin.jvm.internal.d2ok.m23086z(0, "T?");
        return (T[]) new Object[0];
    }

    @kotlin.nn86
    @kotlin.yz(version = "1.3")
    @InterfaceC6769y(name = "contentDeepHashCode")
    public static final <T> int toq(@InterfaceC7395n T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @kotlin.yz(version = "1.3")
    public static final void zy(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
    }
}
