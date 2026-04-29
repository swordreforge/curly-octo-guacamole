package kotlinx.coroutines.selects;

import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.x2;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.d3;
import kotlinx.coroutines.InterfaceC6533d;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.k */
/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J5\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJG\u0010\r\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ[\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JU\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u00102\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H'ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/selects/k;", "R", "", "Lkotlinx/coroutines/selects/zy;", "Lkotlin/Function1;", "Lkotlin/coroutines/q;", "block", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_H, "(Lkotlinx/coroutines/selects/zy;Lcyoe/x2;)V", "Q", "Lkotlinx/coroutines/selects/q;", "Lkotlin/Function2;", "fn3e", "(Lkotlinx/coroutines/selects/q;Lcyoe/h;)V", "P", "Lkotlinx/coroutines/selects/n;", "param", "ld6", "(Lkotlinx/coroutines/selects/n;Ljava/lang/Object;Lcyoe/h;)V", "o1t", "(Lkotlinx/coroutines/selects/n;Lcyoe/h;)V", "", "timeMillis", "n", "(JLcyoe/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface InterfaceC6721k<R> {

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.k$k */
    /* JADX INFO: compiled from: Select.kt */
    @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class k {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: k */
        public static <R, P, Q> void m24569k(@InterfaceC7396q InterfaceC6721k<? super R> interfaceC6721k, @InterfaceC7396q InterfaceC6723n<? super P, ? extends Q> interfaceC6723n, @InterfaceC7396q InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
            interfaceC6721k.ld6(interfaceC6723n, null, interfaceC5979h);
        }
    }

    <Q> void fn3e(@InterfaceC7396q InterfaceC6725q<? extends Q> interfaceC6725q, @InterfaceC7396q InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h);

    /* JADX INFO: renamed from: h */
    void mo24567h(@InterfaceC7396q zy zyVar, @InterfaceC7396q x2<? super InterfaceC6216q<? super R>, ? extends Object> x2Var);

    <P, Q> void ld6(@InterfaceC7396q InterfaceC6723n<? super P, ? extends Q> interfaceC6723n, P p2, @InterfaceC7396q InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h);

    @InterfaceC6533d
    /* JADX INFO: renamed from: n */
    void mo24568n(long j2, @InterfaceC7396q x2<? super InterfaceC6216q<? super R>, ? extends Object> x2Var);

    <P, Q> void o1t(@InterfaceC7396q InterfaceC6723n<? super P, ? extends Q> interfaceC6723n, @InterfaceC7396q InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h);
}
