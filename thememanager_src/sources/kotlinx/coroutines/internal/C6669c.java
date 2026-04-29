package kotlinx.coroutines.internal;

import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlinx.coroutines.internal.c */
/* JADX INFO: compiled from: SystemProps.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a,\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\tH\u0000¨\u0006\u000b"}, d2 = {"", "propertyName", "", "defaultValue", "zy", "", "minValue", "maxValue", "k", "", "toq", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/internal/SystemPropsKt")
public final /* synthetic */ class C6669c {
    /* JADX INFO: renamed from: k */
    public static final int m24315k(@InterfaceC7396q String str, int i2, int i3, int i4) {
        return (int) hyr.zy(str, i2, i3, i4);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ long m24316n(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return hyr.zy(str, j2, j5, j4);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m24317q(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return hyr.toq(str, i2, i3, i4);
    }

    public static final long toq(@InterfaceC7396q String str, long j2, long j3, long j4) {
        String strM24350q = hyr.m24350q(str);
        if (strM24350q == null) {
            return j2;
        }
        Long lZ4 = kotlin.text.jk.z4(strM24350q);
        if (lZ4 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM24350q + '\'').toString());
        }
        long jLongValue = lZ4.longValue();
        boolean z2 = false;
        if (j3 <= jLongValue && jLongValue <= j4) {
            z2 = true;
        }
        if (z2) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final boolean zy(@InterfaceC7396q String str, boolean z2) {
        String strM24350q = hyr.m24350q(str);
        return strM24350q == null ? z2 : Boolean.parseBoolean(strM24350q);
    }
}
