package androidx.core.os;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5981k;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Trace.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {C0846k.zaso, "", "sectionName", "Lkotlin/Function0;", "block", "k", "(Ljava/lang/String;Lcyoe/k;)Ljava/lang/Object;", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class wvg {
    /* JADX INFO: renamed from: k */
    public static final <T> T m2760k(@InterfaceC7396q String sectionName, @InterfaceC7396q InterfaceC5981k<? extends T> block) {
        d2ok.cdj(sectionName, "sectionName");
        d2ok.cdj(block, "block");
        zurt.toq(sectionName);
        try {
            return block.invoke();
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            zurt.m2775q();
            kotlin.jvm.internal.d3.zy(1);
        }
    }
}
