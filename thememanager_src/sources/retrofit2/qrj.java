package retrofit2;

import androidx.core.app.x9kr;
import androidx.exifinterface.media.C0846k;
import com.xiaomi.onetrack.api.C5693g;
import java.lang.reflect.Method;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: KotlinExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@d3(bv = {}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {C0846k.zaso, "Lretrofit2/fn3e;", "q", "(Lretrofit2/fn3e;)Ljava/lang/Object;", "", "Lretrofit2/toq;", "k", "(Lretrofit2/toq;Lkotlin/coroutines/q;)Ljava/lang/Object;", "toq", "Lretrofit2/i;", "zy", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "n", "(Ljava/lang/Exception;Lkotlin/coroutines/q;)Ljava/lang/Object;", "retrofit"}, m22787k = 2, mv = {1, 4, 0})
@InterfaceC6769y(name = "KotlinExtensions")
public final class qrj {

    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/was;", "run", "()V", "retrofit2/KotlinExtensions$suspendAndThrow$2$1", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    static final class f7l8 implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6216q f44220k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Exception f44221q;

        f7l8(InterfaceC6216q interfaceC6216q, Exception exc) {
            this.f44220k = interfaceC6216q;
            this.f44221q = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC6216q interfaceC6216qM22747n = kotlin.coroutines.intrinsics.zy.m22747n(this.f44220k);
            Exception exc = this.f44221q;
            C6323o.k kVar = C6323o.Companion;
            interfaceC6216qM22747n.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(exc)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: retrofit2.qrj$g */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @d3(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/qrj$g", "Lretrofit2/q;", "Lretrofit2/toq;", x9kr.f50136ch, "Lretrofit2/i;", C5693g.f31766H, "Lkotlin/was;", "onResponse", "", "t", "onFailure", "retrofit"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C7649g<T> implements InterfaceC7648q<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlinx.coroutines.cdj f44222k;

        C7649g(kotlinx.coroutines.cdj cdjVar) {
            this.f44222k = cdjVar;
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(@InterfaceC7396q retrofit2.toq<T> call, @InterfaceC7396q Throwable t2) {
            d2ok.cdj(call, "call");
            d2ok.cdj(t2, "t");
            kotlinx.coroutines.cdj cdjVar = this.f44222k;
            C6323o.k kVar = C6323o.Companion;
            cdjVar.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(t2)));
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(@InterfaceC7396q retrofit2.toq<T> call, @InterfaceC7396q C7639i<T> response) {
            d2ok.cdj(call, "call");
            d2ok.cdj(response, "response");
            kotlinx.coroutines.cdj cdjVar = this.f44222k;
            C6323o.k kVar = C6323o.Companion;
            cdjVar.resumeWith(C6323o.m28280constructorimpl(response));
        }
    }

    /* JADX INFO: renamed from: retrofit2.qrj$k */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", C0846k.zaso, "", "it", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$2$1", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    static final class C7650k extends AbstractC6308r implements cyoe.x2<Throwable, was> {
        final /* synthetic */ retrofit2.toq $this_await$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7650k(retrofit2.toq toqVar) {
            super(1);
            this.$this_await$inlined = toqVar;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            invoke2(th);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Throwable th) {
            this.$this_await$inlined.cancel();
        }
    }

    /* JADX INFO: renamed from: retrofit2.qrj$n */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {C0846k.zaso, "L;", "it", "Lkotlin/was;", "invoke", "(L;)V", "kotlin/Throwable", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    static final class C7651n extends AbstractC6308r implements cyoe.x2<Throwable, was> {
        final /* synthetic */ retrofit2.toq $this_awaitResponse$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7651n(retrofit2.toq toqVar) {
            super(1);
            this.$this_awaitResponse$inlined = toqVar;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            invoke2(th);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Throwable th) {
            this.$this_awaitResponse$inlined.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: retrofit2.qrj$q */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @d3(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016J \u0010\n\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/qrj$q", "Lretrofit2/q;", "Lretrofit2/toq;", x9kr.f50136ch, "Lretrofit2/i;", C5693g.f31766H, "Lkotlin/was;", "onResponse", "", "t", "onFailure", "retrofit"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C7652q<T> implements InterfaceC7648q<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlinx.coroutines.cdj f44223k;

        C7652q(kotlinx.coroutines.cdj cdjVar) {
            this.f44223k = cdjVar;
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(@InterfaceC7396q retrofit2.toq<T> call, @InterfaceC7396q Throwable t2) {
            d2ok.cdj(call, "call");
            d2ok.cdj(t2, "t");
            kotlinx.coroutines.cdj cdjVar = this.f44223k;
            C6323o.k kVar = C6323o.Companion;
            cdjVar.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(t2)));
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(@InterfaceC7396q retrofit2.toq<T> call, @InterfaceC7396q C7639i<T> response) {
            d2ok.cdj(call, "call");
            d2ok.cdj(response, "response");
            if (response.f7l8()) {
                kotlinx.coroutines.cdj cdjVar = this.f44223k;
                T tM27986k = response.m27986k();
                C6323o.k kVar = C6323o.Companion;
                cdjVar.resumeWith(C6323o.m28280constructorimpl(tM27986k));
                return;
            }
            kotlinx.coroutines.cdj cdjVar2 = this.f44223k;
            C7647p c7647p = new C7647p(response);
            C6323o.k kVar2 = C6323o.Companion;
            cdjVar2.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(c7647p)));
        }
    }

    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", C0846k.zaso, "", "it", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$4$1", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    static final class toq extends AbstractC6308r implements cyoe.x2<Throwable, was> {
        final /* synthetic */ retrofit2.toq $this_await$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(retrofit2.toq toqVar) {
            super(1);
            this.$this_await$inlined = toqVar;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            invoke2(th);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7395n Throwable th) {
            this.$this_await$inlined.cancel();
        }
    }

    /* JADX INFO: renamed from: retrofit2.qrj$y */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @InterfaceC6205g(m22755c = "retrofit2.KotlinExtensions", m22756f = "KotlinExtensions.kt", m22757i = {0}, m22758l = {113}, m22759m = "suspendAndThrow", m22760n = {"$this$suspendAndThrow"}, m22761s = {"L$0"})
    @d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/coroutines/q;", "", "continuation", "", "suspendAndThrow"}, m22787k = 3, mv = {1, 4, 0})
    static final class C7653y extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C7653y(InterfaceC6216q interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return qrj.m28008n(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @d3(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/qrj$zy", "Lretrofit2/q;", "Lretrofit2/toq;", x9kr.f50136ch, "Lretrofit2/i;", C5693g.f31766H, "Lkotlin/was;", "onResponse", "", "t", "onFailure", "retrofit"}, m22787k = 1, mv = {1, 4, 0})
    public static final class zy<T> implements InterfaceC7648q<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlinx.coroutines.cdj f44224k;

        zy(kotlinx.coroutines.cdj cdjVar) {
            this.f44224k = cdjVar;
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(@InterfaceC7396q retrofit2.toq<T> call, @InterfaceC7396q Throwable t2) {
            d2ok.cdj(call, "call");
            d2ok.cdj(t2, "t");
            kotlinx.coroutines.cdj cdjVar = this.f44224k;
            C6323o.k kVar = C6323o.Companion;
            cdjVar.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(t2)));
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(@InterfaceC7396q retrofit2.toq<T> call, @InterfaceC7396q C7639i<T> response) {
            d2ok.cdj(call, "call");
            d2ok.cdj(response, "response");
            if (!response.f7l8()) {
                kotlinx.coroutines.cdj cdjVar = this.f44224k;
                C7647p c7647p = new C7647p(response);
                C6323o.k kVar = C6323o.Companion;
                cdjVar.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(c7647p)));
                return;
            }
            T tM27986k = response.m27986k();
            if (tM27986k != null) {
                kotlinx.coroutines.cdj cdjVar2 = this.f44224k;
                C6323o.k kVar2 = C6323o.Companion;
                cdjVar2.resumeWith(C6323o.m28280constructorimpl(tM27986k));
                return;
            }
            Object objM27306h = call.zy().m27306h(x2.class);
            if (objM27306h == null) {
                d2ok.d2ok();
            }
            d2ok.m23085y(objM27306h, "call.request().tag(Invocation::class.java)!!");
            Method method = ((x2) objM27306h).toq();
            StringBuilder sb = new StringBuilder();
            sb.append("Response from ");
            d2ok.m23085y(method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            d2ok.m23085y(declaringClass, "method.declaringClass");
            sb.append(declaringClass.getName());
            sb.append('.');
            sb.append(method.getName());
            sb.append(" was null but response body type was declared as non-null");
            kotlin.o1t o1tVar = new kotlin.o1t(sb.toString());
            kotlinx.coroutines.cdj cdjVar3 = this.f44224k;
            C6323o.k kVar3 = C6323o.Companion;
            cdjVar3.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(o1tVar)));
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final <T> Object m28007k(@InterfaceC7396q retrofit2.toq<T> toqVar, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        kotlinx.coroutines.ki kiVar = new kotlinx.coroutines.ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.ni7(new C7650k(toqVar));
        toqVar.mo27954p(new zy(kiVar));
        Object objM24474z = kiVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m28008n(@mub.InterfaceC7396q java.lang.Exception r4, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.qrj.C7653y
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.qrj$y r0 = (retrofit2.qrj.C7653y) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.qrj$y r0 = new retrofit2.qrj$y
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.C6318m.n7h(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C6318m.n7h(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.dd r5 = kotlinx.coroutines.C6481a.m23812k()
            kotlin.coroutines.f7l8 r2 = r0.getContext()
            retrofit2.qrj$f7l8 r3 = new retrofit2.qrj$f7l8
            r3.<init>(r0, r4)
            r5.bap7(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.toq.x2()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.toq.x2()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.C6211y.zy(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.was r4 = kotlin.was.f36763k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.qrj.m28008n(java.lang.Exception, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ <T> T m28009q(@InterfaceC7396q fn3e create) {
        d2ok.cdj(create, "$this$create");
        d2ok.m23086z(4, C0846k.zaso);
        return (T) create.f7l8(Object.class);
    }

    @InterfaceC7395n
    @InterfaceC6769y(name = "awaitNullable")
    public static final <T> Object toq(@InterfaceC7396q retrofit2.toq<T> toqVar, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        kotlinx.coroutines.ki kiVar = new kotlinx.coroutines.ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.ni7(new toq(toqVar));
        toqVar.mo27954p(new C7652q(kiVar));
        Object objM24474z = kiVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z;
    }

    @InterfaceC7395n
    public static final <T> Object zy(@InterfaceC7396q retrofit2.toq<T> toqVar, @InterfaceC7396q InterfaceC6216q<? super C7639i<T>> interfaceC6216q) {
        kotlinx.coroutines.ki kiVar = new kotlinx.coroutines.ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.ni7(new C7651n(toqVar));
        toqVar.mo27954p(new C7649g(kiVar));
        Object objM24474z = kiVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z;
    }
}
