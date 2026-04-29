package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.AbstractC0059k;
import androidx.core.app.C0447s;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5981k;
import kotlin.d3;
import kotlin.fti;
import kotlin.jk;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import vy.C7718q;

/* JADX INFO: renamed from: androidx.activity.result.q */
/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0004H\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u000bH\u0016R'\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u001d\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/activity/result/q;", com.market.sdk.reflect.toq.f28131g, "O", "Landroidx/activity/result/g;", "Lkotlin/was;", "void", "Landroidx/core/app/s;", "options", C7704k.y.toq.f44691k, "(Lkotlin/was;Landroidx/core/app/s;)V", "q", "Landroidx/activity/result/contract/k;", "k", "Lkotlin/jk;", AnimatedProperty.PROPERTY_NAME_Y, "()Landroidx/activity/result/contract/k;", "resultContract", "toq", "Landroidx/activity/result/g;", "f7l8", "()Landroidx/activity/result/g;", "launcher", "zy", "Landroidx/activity/result/contract/k;", "n", "callerContract", "Ljava/lang/Object;", C7704k.y.toq.f95579toq, "()Ljava/lang/Object;", "input", C4991s.f28129n, "(Landroidx/activity/result/g;Landroidx/activity/result/contract/k;Ljava/lang/Object;)V", "activity-ktx_release"}, m22787k = 1, mv = {1, 4, 1})
public final class C0070q<I, O> extends AbstractC0067g<was> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final jk f131k;

    /* JADX INFO: renamed from: q */
    private final I f132q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final AbstractC0067g<I> f46472toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final AbstractC0059k<I, O> f46473zy;

    /* JADX INFO: renamed from: androidx.activity.result.q$k */
    /* JADX INFO: compiled from: ActivityResultCaller.kt */
    @d3(bv = {}, d1 = {"\u0000\u000b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {com.market.sdk.reflect.toq.f28131g, "O", "androidx/activity/result/q$k$k", "invoke", "()Landroidx/activity/result/q$k$k;", "<anonymous>"}, m22787k = 3, mv = {1, 4, 1})
    static final class k extends AbstractC6308r implements InterfaceC5981k<C7849k> {

        /* JADX INFO: renamed from: androidx.activity.result.q$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ActivityResultCaller.kt */
        @d3(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/result/q$k$k", "Landroidx/activity/result/contract/k;", "Lkotlin/was;", "Landroid/content/Context;", "context", "void", "Landroid/content/Intent;", "q", "(Landroid/content/Context;Lkotlin/was;)Landroid/content/Intent;", "", "resultCode", C7718q.f97043a9, "zy", "(ILandroid/content/Intent;)Ljava/lang/Object;", "activity-ktx_release"}, m22787k = 1, mv = {1, 4, 1})
        public static final class C7849k extends AbstractC0059k<was, O> {
            C7849k() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.activity.result.contract.AbstractC0059k
            @InterfaceC7396q
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public Intent mo36k(@InterfaceC7396q Context context, @InterfaceC7395n was wasVar) {
                d2ok.m23075h(context, "context");
                Intent intentMo36k = C0070q.this.m82n().mo36k(context, C0070q.this.m81g());
                d2ok.kja0(intentMo36k, "callerContract.createIntent(context, input)");
                return intentMo36k;
            }

            @Override // androidx.activity.result.contract.AbstractC0059k
            public O zy(int i2, @InterfaceC7395n Intent intent) {
                return C0070q.this.m82n().zy(i2, intent);
            }
        }

        k() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final C7849k invoke() {
            return new C7849k();
        }
    }

    public C0070q(@InterfaceC7396q AbstractC0067g<I> launcher, @InterfaceC7396q AbstractC0059k<I, O> callerContract, I i2) {
        d2ok.m23075h(launcher, "launcher");
        d2ok.m23075h(callerContract, "callerContract");
        this.f46472toq = launcher;
        this.f46473zy = callerContract;
        this.f132q = i2;
        this.f131k = fti.m22825k(new k());
    }

    @InterfaceC7396q
    public final AbstractC0067g<I> f7l8() {
        return this.f46472toq;
    }

    /* JADX INFO: renamed from: g */
    public final I m81g() {
        return this.f132q;
    }

    @Override // androidx.activity.result.AbstractC0067g
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public AbstractC0059k<was, ?> mo30k() {
        return m84y();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final AbstractC0059k<I, O> m82n() {
        return this.f46473zy;
    }

    @Override // androidx.activity.result.AbstractC0067g
    /* JADX INFO: renamed from: q */
    public void mo31q() {
        this.f46472toq.mo31q();
    }

    @Override // androidx.activity.result.AbstractC0067g
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void zy(@InterfaceC7395n was wasVar, @InterfaceC7395n C0447s c0447s) {
        this.f46472toq.zy(this.f132q, c0447s);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final AbstractC0059k<was, O> m84y() {
        return (AbstractC0059k) this.f131k.getValue();
    }
}
