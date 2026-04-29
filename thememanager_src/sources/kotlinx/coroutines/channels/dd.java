package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import kotlin.was;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/dd;", C0846k.d9i, "Lkotlinx/coroutines/channels/r;", "", "nn86", "Lkotlin/was;", "a98o", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", C7704k.y.toq.f44691k, "Lcyoe/x2;", "onUndeliveredElement", "pollResult", "Lkotlinx/coroutines/cdj;", "cont", C4991s.f28129n, "(Ljava/lang/Object;Lkotlinx/coroutines/cdj;Lcyoe/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class dd<E> extends C6510r<E> {

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    @InterfaceC6765n
    public final cyoe.x2<E, was> f36802s;

    /* JADX WARN: Multi-variable type inference failed */
    public dd(E e2, @InterfaceC7396q kotlinx.coroutines.cdj<? super was> cdjVar, @InterfaceC7396q cyoe.x2<? super E, was> x2Var) {
        super(e2, cdjVar);
        this.f36802s = x2Var;
    }

    @Override // kotlinx.coroutines.channels.d2ok
    public void a98o() {
        kotlinx.coroutines.internal.d3.toq(this.f36802s, mo23860b(), this.f36850y.getContext());
    }

    @Override // kotlinx.coroutines.internal.C6694z
    public boolean nn86() {
        if (!super.nn86()) {
            return false;
        }
        a98o();
        return true;
    }
}
