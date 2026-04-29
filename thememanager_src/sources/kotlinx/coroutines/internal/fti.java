package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.C6480z;
import kotlinx.coroutines.tfm;
import kotlinx.coroutines.z4;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\"\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u001a\u0010\u0015\u001a\u00020\u00058\u0002X\u0082D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/internal/jk;", "", "factories", "Lkotlinx/coroutines/z4;", C7704k.y.toq.f95579toq, "", "q", "", "cause", "", "errorHint", "Lkotlinx/coroutines/internal/jp0y;", "k", "", "n", "Ljava/lang/String;", "FAST_SERVICE_LOADER_PROPERTY_NAME", "toq", com.market.sdk.reflect.toq.f68929toq, "getSUPPORT_MISSING$annotations", "()V", "SUPPORT_MISSING", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class fti {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final String f37211k = "kotlinx.coroutines.fast.service.loader";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final boolean f82010toq = true;

    @InterfaceC7396q
    @tfm
    /* JADX INFO: renamed from: g */
    public static final z4 m24334g(@InterfaceC7396q jk jkVar, @InterfaceC7396q List<? extends jk> list) {
        try {
            return jkVar.createDispatcher(list);
        } catch (Throwable th) {
            return m24335k(th, jkVar.hintOnError());
        }
    }

    /* JADX INFO: renamed from: k */
    private static final jp0y m24335k(Throwable th, String str) throws Throwable {
        if (f82010toq) {
            return new jp0y(th, str);
        }
        if (th != null) {
            throw th;
        }
        m24336n();
        throw new C6480z();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final Void m24336n() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @tfm
    /* JADX INFO: renamed from: q */
    public static final boolean m24337q(@InterfaceC7396q z4 z4Var) {
        return z4Var.dxef() instanceof jp0y;
    }

    static /* synthetic */ jp0y toq(Throwable th, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return m24335k(th, str);
    }

    private static /* synthetic */ void zy() {
    }
}
