package androidx.core.util;

import android.util.Half;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: renamed from: androidx.core.util.n */
/* JADX INFO: compiled from: Half.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0087\b\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0087\b¨\u0006\t"}, d2 = {"", "Landroid/util/Half;", "q", "", "toq", "", "k", "", "zy", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0638n {
    @InterfaceC7396q
    @hyr(26)
    /* JADX INFO: renamed from: k */
    public static final Half m2971k(double d2) {
        Half halfValueOf = Half.valueOf((float) d2);
        d2ok.m23085y(halfValueOf, "Half.valueOf(this)");
        return halfValueOf;
    }

    @InterfaceC7396q
    @hyr(26)
    /* JADX INFO: renamed from: q */
    public static final Half m2972q(short s2) {
        Half halfValueOf = Half.valueOf(s2);
        d2ok.m23085y(halfValueOf, "Half.valueOf(this)");
        return halfValueOf;
    }

    @InterfaceC7396q
    @hyr(26)
    public static final Half toq(float f2) {
        Half halfValueOf = Half.valueOf(f2);
        d2ok.m23085y(halfValueOf, "Half.valueOf(this)");
        return halfValueOf;
    }

    @InterfaceC7396q
    @hyr(26)
    public static final Half zy(@InterfaceC7396q String toHalf) {
        d2ok.cdj(toHalf, "$this$toHalf");
        Half halfValueOf = Half.valueOf(toHalf);
        d2ok.m23085y(halfValueOf, "Half.valueOf(this)");
        return halfValueOf;
    }
}
