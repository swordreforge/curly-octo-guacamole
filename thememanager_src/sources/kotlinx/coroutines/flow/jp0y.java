package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.xiaomi.onetrack.api.at;
import java.util.List;
import kotlin.coroutines.InterfaceC6216q;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/flow/jp0y;", C0846k.zaso, "Lkotlinx/coroutines/flow/hyr;", "Lkotlinx/coroutines/flow/zy;", "Lkotlinx/coroutines/flow/internal/ki;", "Lkotlinx/coroutines/flow/p;", "collector", "", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "Lkotlinx/coroutines/flow/s;", "q", "Lkotlinx/coroutines/gbni;", "Lkotlinx/coroutines/gbni;", at.f31711e, "", "n", "()Ljava/util/List;", "replayCache", "getValue", "()Ljava/lang/Object;", "value", "flow", C4991s.f28129n, "(Lkotlinx/coroutines/flow/hyr;Lkotlinx/coroutines/gbni;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class jp0y<T> implements hyr<T>, zy<T>, kotlinx.coroutines.flow.internal.ki<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final gbni f37028k;

    /* JADX INFO: renamed from: q */
    private final /* synthetic */ hyr<T> f37029q;

    /* JADX WARN: Multi-variable type inference failed */
    public jp0y(@InterfaceC7396q hyr<? extends T> hyrVar, @InterfaceC7395n gbni gbniVar) {
        this.f37028k = gbniVar;
        this.f37029q = hyrVar;
    }

    @Override // kotlinx.coroutines.flow.hyr
    public T getValue() {
        return this.f37029q.getValue();
    }

    @Override // kotlinx.coroutines.flow.d3, kotlinx.coroutines.flow.InterfaceC6622s
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
        return this.f37029q.mo5262k(interfaceC6618p, interfaceC6216q);
    }

    @Override // kotlinx.coroutines.flow.d3
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public List<T> mo24079n() {
        return this.f37029q.mo24079n();
    }

    @Override // kotlinx.coroutines.flow.internal.ki
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public InterfaceC6622s<T> mo24089q(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        return C6557c.m24073q(this, f7l8Var, i2, qrjVar);
    }
}
