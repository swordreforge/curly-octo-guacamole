package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.util.yz;
import cyoe.InterfaceC5981k;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Synchronized.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007*\u0010\b\u0007\u0010\t\"\u00020\u00012\u00020\u0001B\u0002\b\b¨\u0006\n"}, d2 = {C0846k.zaso, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", yz.xk5, "Lkotlin/Function0;", "block", "toq", "(Ljava/lang/Object;Lcyoe/k;)Ljava/lang/Object;", "Lkotlinx/coroutines/tfm;", "SynchronizedObject", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class n5r1 {
    @tfm
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m24368k() {
    }

    @tfm
    public static final <T> T toq(@InterfaceC7396q Object obj, @InterfaceC7396q InterfaceC5981k<? extends T> interfaceC5981k) {
        T tInvoke;
        synchronized (obj) {
            try {
                tInvoke = interfaceC5981k.invoke();
                kotlin.jvm.internal.d3.m23090q(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.d3.m23090q(1);
                kotlin.jvm.internal.d3.zy(1);
                throw th;
            }
        }
        kotlin.jvm.internal.d3.zy(1);
        return tInvoke;
    }
}
