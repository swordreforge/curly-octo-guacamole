package kotlin.io.encoding;

import kotlin.collections.kja0;
import kotlin.jvm.internal.lv5;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,649:1\n13384#2,3:650\n13384#2,3:653\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n584#1:650,3\n603#1:653,3\n*E\n"})
public final class zy {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final byte[] f36318k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final int[] f36319q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final int[] f81798toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final byte[] f81799zy;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f36318k = bArr;
        int[] iArr = new int[256];
        int i2 = 0;
        kja0.cnbm(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            iArr[bArr[i3]] = i4;
            i3++;
            i4++;
        }
        f81798toq = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f81799zy = bArr2;
        int[] iArr2 = new int[256];
        kja0.cnbm(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i5 = 0;
        while (i2 < length2) {
            iArr2[bArr2[i2]] = i5;
            i2++;
            i5++;
        }
        f36319q = iArr2;
    }

    @InterfaceC6246g
    private static /* synthetic */ void f7l8() {
    }

    /* JADX INFO: renamed from: g */
    private static /* synthetic */ void m22911g() {
    }

    @InterfaceC6246g
    /* JADX INFO: renamed from: n */
    private static /* synthetic */ void m22913n() {
    }

    @InterfaceC6246g
    @yz(version = "1.8")
    /* JADX INFO: renamed from: s */
    public static final boolean m22915s(int i2) {
        return (i2 >= 0 && i2 < f81798toq.length) && f81798toq[i2] != -1;
    }

    /* JADX INFO: renamed from: y */
    private static /* synthetic */ void m22916y() {
    }
}
