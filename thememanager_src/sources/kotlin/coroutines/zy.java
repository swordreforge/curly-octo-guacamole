package kotlin.coroutines;

import cyoe.InterfaceC5979h;
import java.io.Serializable;
import kotlin.coroutines.f7l8;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
@yz(version = "1.3")
public final class zy implements f7l8, Serializable {

    @InterfaceC7396q
    private final f7l8.toq element;

    @InterfaceC7396q
    private final f7l8 left;

    /* JADX INFO: renamed from: kotlin.coroutines.zy$k */
    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    @lv5({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12720#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    private static final class C6219k implements Serializable {

        @InterfaceC7396q
        public static final k Companion = new k(null);
        private static final long serialVersionUID = 0;

        @InterfaceC7396q
        private final f7l8[] elements;

        /* JADX INFO: renamed from: kotlin.coroutines.zy$k$k */
        /* JADX INFO: compiled from: CoroutineContextImpl.kt */
        public static final class k {
            private k() {
            }

            public /* synthetic */ k(ni7 ni7Var) {
                this();
            }
        }

        public C6219k(@InterfaceC7396q f7l8[] elements) {
            d2ok.m23075h(elements, "elements");
            this.elements = elements;
        }

        private final Object readResolve() {
            f7l8[] f7l8VarArr = this.elements;
            f7l8 f7l8VarPlus = C6217s.INSTANCE;
            for (f7l8 f7l8Var : f7l8VarArr) {
                f7l8VarPlus = f7l8VarPlus.plus(f7l8Var);
            }
            return f7l8VarPlus;
        }

        @InterfaceC7396q
        public final f7l8[] getElements() {
            return this.elements;
        }
    }

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    static final class toq extends AbstractC6308r implements InterfaceC5979h<String, f7l8.toq, String> {
        public static final toq INSTANCE = new toq();

        toq() {
            super(2);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7396q
        public final String invoke(@InterfaceC7396q String acc, @InterfaceC7396q f7l8.toq element) {
            d2ok.m23075h(acc, "acc");
            d2ok.m23075h(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    static final class C8057zy extends AbstractC6308r implements InterfaceC5979h<was, f7l8.toq, was> {
        final /* synthetic */ f7l8[] $elements;
        final /* synthetic */ i1.C6294g $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8057zy(f7l8[] f7l8VarArr, i1.C6294g c6294g) {
            super(2);
            this.$elements = f7l8VarArr;
            this.$index = c6294g;
        }

        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ was invoke(was wasVar, f7l8.toq toqVar) {
            invoke2(wasVar, toqVar);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q was wasVar, @InterfaceC7396q f7l8.toq element) {
            d2ok.m23075h(wasVar, "<anonymous parameter 0>");
            d2ok.m23075h(element, "element");
            f7l8[] f7l8VarArr = this.$elements;
            i1.C6294g c6294g = this.$index;
            int i2 = c6294g.element;
            c6294g.element = i2 + 1;
            f7l8VarArr[i2] = element;
        }
    }

    public zy(@InterfaceC7396q f7l8 left, @InterfaceC7396q f7l8.toq element) {
        d2ok.m23075h(left, "left");
        d2ok.m23075h(element, "element");
        this.left = left;
        this.element = element;
    }

    /* JADX INFO: renamed from: n */
    private final int m22778n() {
        int i2 = 2;
        zy zyVar = this;
        while (true) {
            f7l8 f7l8Var = zyVar.left;
            zyVar = f7l8Var instanceof zy ? (zy) f7l8Var : null;
            if (zyVar == null) {
                return i2;
            }
            i2++;
        }
    }

    private final boolean toq(f7l8.toq toqVar) {
        return d2ok.f7l8(get(toqVar.getKey()), toqVar);
    }

    private final Object writeReplace() {
        int iM22778n = m22778n();
        f7l8[] f7l8VarArr = new f7l8[iM22778n];
        i1.C6294g c6294g = new i1.C6294g();
        fold(was.f36763k, new C8057zy(f7l8VarArr, c6294g));
        if (c6294g.element == iM22778n) {
            return new C6219k(f7l8VarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final boolean zy(zy zyVar) {
        while (toq(zyVar.element)) {
            f7l8 f7l8Var = zyVar.left;
            if (!(f7l8Var instanceof zy)) {
                d2ok.n7h(f7l8Var, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return toq((f7l8.toq) f7l8Var);
            }
            zyVar = (zy) f7l8Var;
        }
        return false;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this != obj) {
            if (obj instanceof zy) {
                zy zyVar = (zy) obj;
                if (zyVar.m22778n() != m22778n() || !zyVar.zy(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.f7l8
    public <R> R fold(R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> operation) {
        d2ok.m23075h(operation, "operation");
        return operation.invoke((Object) this.left.fold(r2, operation), this.element);
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7395n
    public <E extends f7l8.toq> E get(@InterfaceC7396q f7l8.zy<E> key) {
        d2ok.m23075h(key, "key");
        zy zyVar = this;
        while (true) {
            E e2 = (E) zyVar.element.get(key);
            if (e2 != null) {
                return e2;
            }
            f7l8 f7l8Var = zyVar.left;
            if (!(f7l8Var instanceof zy)) {
                return (E) f7l8Var.get(key);
            }
            zyVar = (zy) f7l8Var;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public f7l8 minusKey(@InterfaceC7396q f7l8.zy<?> key) {
        d2ok.m23075h(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        f7l8 f7l8VarMinusKey = this.left.minusKey(key);
        return f7l8VarMinusKey == this.left ? this : f7l8VarMinusKey == C6217s.INSTANCE ? this.element : new zy(f7l8VarMinusKey, this.element);
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public f7l8 plus(@InterfaceC7396q f7l8 f7l8Var) {
        return f7l8.C6195k.m22734k(this, f7l8Var);
    }

    @InterfaceC7396q
    public String toString() {
        return '[' + ((String) fold("", toq.INSTANCE)) + ']';
    }
}
