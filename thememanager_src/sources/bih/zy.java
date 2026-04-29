package bih;

import kotlin.yz;
import kotlin.zurt;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ContractBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1369g
@yz(version = "1.3")
@kotlin.internal.toq
public interface zy {

    /* JADX INFO: renamed from: bih.zy$k */
    /* JADX INFO: compiled from: ContractBuilder.kt */
    public static final class C1376k {
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ InterfaceC1370k m5821k(zy zyVar, zurt zurtVar, f7l8 f7l8Var, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if ((i2 & 2) != 0) {
                f7l8Var = f7l8.UNKNOWN;
            }
            return zyVar.m5819k(zurtVar, f7l8Var);
        }
    }

    @InterfaceC7396q
    @kotlin.internal.toq
    /* JADX INFO: renamed from: k */
    <R> InterfaceC1370k m5819k(@InterfaceC7396q zurt<? extends R> zurtVar, @InterfaceC7396q f7l8 f7l8Var);

    @InterfaceC7396q
    @kotlin.internal.toq
    /* JADX INFO: renamed from: q */
    InterfaceC1374s m5820q();

    @InterfaceC7396q
    @kotlin.internal.toq
    InterfaceC1375y toq();

    @InterfaceC7396q
    @kotlin.internal.toq
    InterfaceC1375y zy(@InterfaceC7395n Object obj);
}
