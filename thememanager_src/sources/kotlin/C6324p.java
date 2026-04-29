package kotlin;

import kotlin.C6323o;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6206k;
import kotlin.coroutines.jvm.internal.C6211y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.p */
/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6324p<T, R> extends AbstractC6383s<T, R> implements InterfaceC6216q<R> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private Object f36474g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private cyoe.cdj<? super AbstractC6383s<?, ?>, Object, ? super InterfaceC6216q<Object>, ? extends Object> f36475k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private InterfaceC6216q<Object> f36476n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private Object f36477q;

    /* JADX INFO: renamed from: kotlin.p$k */
    /* JADX INFO: compiled from: Continuation.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,161:1\n184#2,6:162\n*E\n"})
    public static final class k implements InterfaceC6216q<Object> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ InterfaceC6216q f36478g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.coroutines.f7l8 f36479k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ cyoe.cdj f36480n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C6324p f36481q;

        public k(kotlin.coroutines.f7l8 f7l8Var, C6324p c6324p, cyoe.cdj cdjVar, InterfaceC6216q interfaceC6216q) {
            this.f36479k = f7l8Var;
            this.f36481q = c6324p;
            this.f36480n = cdjVar;
            this.f36478g = interfaceC6216q;
        }

        @Override // kotlin.coroutines.InterfaceC6216q
        @InterfaceC7396q
        public kotlin.coroutines.f7l8 getContext() {
            return this.f36479k;
        }

        @Override // kotlin.coroutines.InterfaceC6216q
        public void resumeWith(@InterfaceC7396q Object obj) {
            this.f36481q.f36475k = this.f36480n;
            this.f36481q.f36476n = this.f36478g;
            this.f36481q.f36474g = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6324p(@InterfaceC7396q cyoe.cdj<? super AbstractC6383s<T, R>, ? super T, ? super InterfaceC6216q<? super R>, ? extends Object> block, T t2) {
        super(null);
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        this.f36475k = block;
        this.f36477q = t2;
        kotlin.jvm.internal.d2ok.n7h(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f36476n = this;
        this.f36474g = C6479y.f36771k;
    }

    /* JADX INFO: renamed from: y */
    private final InterfaceC6216q<Object> m23235y(cyoe.cdj<? super AbstractC6383s<?, ?>, Object, ? super InterfaceC6216q<Object>, ? extends Object> cdjVar, InterfaceC6216q<Object> interfaceC6216q) {
        return new k(C6217s.INSTANCE, this, cdjVar, interfaceC6216q);
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 getContext() {
        return C6217s.INSTANCE;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    public void resumeWith(@InterfaceC7396q Object obj) {
        this.f36476n = null;
        this.f36474g = obj;
    }

    /* JADX INFO: renamed from: s */
    public final R m23236s() {
        while (true) {
            R r2 = (R) this.f36474g;
            InterfaceC6216q<Object> interfaceC6216q = this.f36476n;
            if (interfaceC6216q == null) {
                C6318m.n7h(r2);
                return r2;
            }
            if (C6323o.m28282equalsimpl0(C6479y.f36771k, r2)) {
                try {
                    cyoe.cdj<? super AbstractC6383s<?, ?>, Object, ? super InterfaceC6216q<Object>, ? extends Object> cdjVar = this.f36475k;
                    Object obj = this.f36477q;
                    Object objLd6 = !(cdjVar instanceof AbstractC6206k) ? kotlin.coroutines.intrinsics.zy.ld6(cdjVar, this, obj, interfaceC6216q) : ((cyoe.cdj) kotlin.jvm.internal.bo.cdj(cdjVar, 3)).invoke(this, obj, interfaceC6216q);
                    if (objLd6 != C6199q.x2()) {
                        C6323o.k kVar = C6323o.Companion;
                        interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(objLd6));
                    }
                } catch (Throwable th) {
                    C6323o.k kVar2 = C6323o.Companion;
                    interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(th)));
                }
            } else {
                this.f36474g = C6479y.f36771k;
                interfaceC6216q.resumeWith(r2);
            }
        }
    }

    @Override // kotlin.AbstractC6383s
    @InterfaceC7395n
    public Object toq(T t2, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        kotlin.jvm.internal.d2ok.n7h(interfaceC6216q, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f36476n = interfaceC6216q;
        this.f36477q = t2;
        Object objX2 = C6199q.x2();
        if (objX2 == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objX2;
    }

    @Override // kotlin.AbstractC6383s
    @InterfaceC7395n
    public <U, S> Object zy(@InterfaceC7396q f7l8<U, S> f7l8Var, U u2, @InterfaceC7396q InterfaceC6216q<? super S> interfaceC6216q) {
        cyoe.cdj<AbstractC6383s<U, S>, U, InterfaceC6216q<? super S>, Object> cdjVarM22813k = f7l8Var.m22813k();
        kotlin.jvm.internal.d2ok.n7h(cdjVarM22813k, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        cyoe.cdj<? super AbstractC6383s<?, ?>, Object, ? super InterfaceC6216q<Object>, ? extends Object> cdjVar = this.f36475k;
        if (cdjVarM22813k != cdjVar) {
            this.f36475k = cdjVarM22813k;
            kotlin.jvm.internal.d2ok.n7h(interfaceC6216q, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f36476n = m23235y(cdjVar, interfaceC6216q);
        } else {
            kotlin.jvm.internal.d2ok.n7h(interfaceC6216q, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f36476n = interfaceC6216q;
        }
        this.f36477q = u2;
        Object objX2 = C6199q.x2();
        if (objX2 == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objX2;
    }
}
