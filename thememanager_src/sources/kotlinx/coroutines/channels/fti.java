package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import kotlin.was;
import kotlinx.coroutines.C6697l;
import kotlinx.coroutines.channels.lvui;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/fti;", C0846k.d9i, "Lkotlinx/coroutines/channels/kja0;", "Lkotlinx/coroutines/channels/jp0y;", "Lkotlin/was;", "value", "pc", "(Lkotlin/was;)V", "", "cause", "", "handled", "ixz", "isActive", "()Z", "Lkotlin/coroutines/f7l8;", "parentContext", "Lkotlinx/coroutines/channels/n7h;", "channel", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Lkotlinx/coroutines/channels/n7h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class fti<E> extends kja0<E> implements jp0y<E> {
    public fti(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q n7h<E> n7hVar) {
        super(f7l8Var, n7hVar, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC6696k, kotlinx.coroutines.etdu, kotlinx.coroutines.gbni
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.AbstractC6696k
    protected void ixz(@InterfaceC7396q Throwable th, boolean z2) {
        if (ebn().mo23876k(th) || z2) {
            return;
        }
        C6697l.toq(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC6696k
    /* JADX INFO: renamed from: pc, reason: merged with bridge method [inline-methods] */
    public void mo28293do(@InterfaceC7396q was wasVar) {
        lvui.C6502k.m23922k(ebn(), null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.jp0y
    public /* bridge */ /* synthetic */ lvui zy() {
        return zy();
    }
}
