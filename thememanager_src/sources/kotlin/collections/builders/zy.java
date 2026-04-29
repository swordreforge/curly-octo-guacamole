package kotlin.collections.builders;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
public final class zy {
    public static final <E> void f7l8(@InterfaceC7396q E[] eArr, int i2, int i3) {
        d2ok.m23075h(eArr, "<this>");
        while (i2 < i3) {
            m22461g(eArr, i2);
            i2++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final <E> void m22461g(@InterfaceC7396q E[] eArr, int i2) {
        d2ok.m23075h(eArr, "<this>");
        eArr[i2] = null;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final <T> T[] m22463n(@InterfaceC7396q T[] tArr, int i2) {
        d2ok.m23075h(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i2);
        d2ok.kja0(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final <T> String m22464p(T[] tArr, int i2, int i3) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(tArr[i2 + i4]);
        }
        sb.append("]");
        String string = sb.toString();
        d2ok.kja0(string, "sb.toString()");
        return string;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final <E> E[] m22465q(int i2) {
        if (i2 >= 0) {
            return (E[]) new Object[i2];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final <T> int m22466s(T[] tArr, int i2, int i3) {
        int iHashCode = 1;
        for (int i4 = 0; i4 < i3; i4++) {
            T t2 = tArr[i2 + i4];
            iHashCode = (iHashCode * 31) + (t2 != null ? t2.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final <T> boolean m22467y(T[] tArr, int i2, int i3, List<?> list) {
        if (i3 != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!d2ok.f7l8(tArr[i2 + i4], list.get(i4))) {
                return false;
            }
        }
        return true;
    }
}
