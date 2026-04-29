package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlinx.coroutines.selects.InterfaceC6720g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B<\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR3\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/cv06;", C0846k.zaso, "R", "Lkotlinx/coroutines/v0af;", "", "cause", "Lkotlin/was;", "y9n", "Lkotlinx/coroutines/selects/g;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", C7704k.y.toq.f44691k, "Lcyoe/h;", "block", C4991s.f28129n, "(Lkotlinx/coroutines/selects/g;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class cv06<T, R> extends v0af {

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final InterfaceC5979h<T, InterfaceC6216q<? super R>, Object> f36879s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final InterfaceC6720g<R> f36880y;

    /* JADX WARN: Multi-variable type inference failed */
    public cv06(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        this.f36880y = interfaceC6720g;
        this.f36879s = interfaceC5979h;
    }

    @Override // cyoe.x2
    public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) throws Throwable {
        y9n(th);
        return kotlin.was.f36763k;
    }

    @Override // kotlinx.coroutines.jp0y
    public void y9n(@InterfaceC7395n Throwable th) throws Throwable {
        if (this.f36880y.ki()) {
            m24638b().zkd(this.f36880y, this.f36879s);
        }
    }
}
