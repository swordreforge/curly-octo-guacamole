package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.collections.C6144h;
import kotlin.jvm.internal.AbstractC6308r;
import l05.C6764k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u001a*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0082\b\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u001b\u0010\u0013\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0082\u0010\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018*(\b\u0002\u0010\u001a\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001b"}, d2 = {"", C0846k.d9i, "exception", AnimatedProperty.PROPERTY_NAME_Y, "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "toq", "Ljava/lang/reflect/Constructor;", "constructor", "zy", "block", "f7l8", "", "defaultValue", C7704k.y.toq.f95579toq, "accumulator", "q", "k", com.market.sdk.reflect.toq.f28131g, "throwableFields", "Lkotlinx/coroutines/internal/ld6;", "Lkotlinx/coroutines/internal/ld6;", "ctorCache", "Ctor", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class n7h {

    /* JADX INFO: renamed from: k */
    private static final int f37229k = m24369g(Throwable.class, -1);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final ld6 f82023toq;

    /* JADX INFO: compiled from: ExceptionsConstructor.kt */
    @kotlin.d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "e", "invoke"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class f7l8 extends AbstractC6308r implements cyoe.x2<Throwable, Throwable> {
        final /* synthetic */ cyoe.x2<Throwable, Throwable> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f7l8(cyoe.x2<? super Throwable, ? extends Throwable> x2Var) {
            super(1);
            this.$block = x2Var;
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final Throwable invoke(@InterfaceC7396q Throwable th) {
            Object objM28280constructorimpl;
            cyoe.x2<Throwable, Throwable> x2Var = this.$block;
            try {
                C6323o.k kVar = C6323o.Companion;
                objM28280constructorimpl = C6323o.m28280constructorimpl(x2Var.invoke(th));
            } catch (Throwable th2) {
                C6323o.k kVar2 = C6323o.Companion;
                objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th2));
            }
            if (C6323o.m28285isFailureimpl(objM28280constructorimpl)) {
                objM28280constructorimpl = null;
            }
            return (Throwable) objM28280constructorimpl;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.n7h$g */
    /* JADX INFO: compiled from: ExceptionsConstructor.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx/coroutines/internal/n7h$f7l8", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class C6683g extends AbstractC6308r implements cyoe.x2<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6683g(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final Throwable invoke(@InterfaceC7396q Throwable th) {
            Object objM28280constructorimpl;
            Object objNewInstance;
            try {
                C6323o.k kVar = C6323o.Companion;
                objNewInstance = this.$constructor$inlined.newInstance(new Object[0]);
            } catch (Throwable th2) {
                C6323o.k kVar2 = C6323o.Companion;
                objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) objNewInstance;
            th3.initCause(th);
            objM28280constructorimpl = C6323o.m28280constructorimpl(th3);
            if (C6323o.m28285isFailureimpl(objM28280constructorimpl)) {
                objM28280constructorimpl = null;
            }
            return (Throwable) objM28280constructorimpl;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.n7h$k */
    /* JADX INFO: compiled from: Comparisons.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {C0846k.zaso, "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/f7l8$zy", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class C6684k<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            return kotlin.comparisons.f7l8.x2(Integer.valueOf(((Constructor) t3).getParameterTypes().length), Integer.valueOf(((Constructor) t2).getParameterTypes().length));
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.n7h$n */
    /* JADX INFO: compiled from: ExceptionsConstructor.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx/coroutines/internal/n7h$f7l8", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class C6685n extends AbstractC6308r implements cyoe.x2<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6685n(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final Throwable invoke(@InterfaceC7396q Throwable th) {
            Object objM28280constructorimpl;
            Object objNewInstance;
            try {
                C6323o.k kVar = C6323o.Companion;
                objNewInstance = this.$constructor$inlined.newInstance(th.getMessage());
            } catch (Throwable th2) {
                C6323o.k kVar2 = C6323o.Companion;
                objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) objNewInstance;
            th3.initCause(th);
            objM28280constructorimpl = C6323o.m28280constructorimpl(th3);
            if (C6323o.m28285isFailureimpl(objM28280constructorimpl)) {
                objM28280constructorimpl = null;
            }
            return (Throwable) objM28280constructorimpl;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.n7h$q */
    /* JADX INFO: compiled from: ExceptionsConstructor.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx/coroutines/internal/n7h$f7l8", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class C6686q extends AbstractC6308r implements cyoe.x2<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6686q(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final Throwable invoke(@InterfaceC7396q Throwable th) {
            Object objM28280constructorimpl;
            Object objNewInstance;
            try {
                C6323o.k kVar = C6323o.Companion;
                objNewInstance = this.$constructor$inlined.newInstance(th);
            } catch (Throwable th2) {
                C6323o.k kVar2 = C6323o.Companion;
                objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            objM28280constructorimpl = C6323o.m28280constructorimpl((Throwable) objNewInstance);
            if (C6323o.m28285isFailureimpl(objM28280constructorimpl)) {
                objM28280constructorimpl = null;
            }
            return (Throwable) objM28280constructorimpl;
        }
    }

    /* JADX INFO: compiled from: ExceptionsConstructor.kt */
    @kotlin.d3(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", C0846k.d9i, "", "it", "invoke"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class toq extends AbstractC6308r implements cyoe.x2 {
        public static final toq INSTANCE = new toq();

        toq() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final Void invoke(@InterfaceC7396q Throwable th) {
            return null;
        }
    }

    /* JADX INFO: compiled from: ExceptionsConstructor.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx/coroutines/internal/n7h$f7l8", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class zy extends AbstractC6308r implements cyoe.x2<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zy(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final Throwable invoke(@InterfaceC7396q Throwable th) {
            Object objM28280constructorimpl;
            Object objNewInstance;
            try {
                C6323o.k kVar = C6323o.Companion;
                objNewInstance = this.$constructor$inlined.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                C6323o.k kVar2 = C6323o.Companion;
                objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            objM28280constructorimpl = C6323o.m28280constructorimpl((Throwable) objNewInstance);
            if (C6323o.m28285isFailureimpl(objM28280constructorimpl)) {
                objM28280constructorimpl = null;
            }
            return (Throwable) objM28280constructorimpl;
        }
    }

    static {
        ld6 ld6Var;
        try {
            ld6Var = C6674h.m24346k() ? C6681m.f37227k : C6682n.f37228k;
        } catch (Throwable unused) {
            ld6Var = C6681m.f37227k;
        }
        f82023toq = ld6Var;
    }

    private static final cyoe.x2<Throwable, Throwable> f7l8(cyoe.x2<? super Throwable, ? extends Throwable> x2Var) {
        return new f7l8(x2Var);
    }

    /* JADX INFO: renamed from: g */
    private static final int m24369g(Class<?> cls, int i2) {
        Object objM28280constructorimpl;
        C6764k.m24705s(cls);
        try {
            C6323o.k kVar = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(Integer.valueOf(m24371n(cls, 0, 1, null)));
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (C6323o.m28285isFailureimpl(objM28280constructorimpl)) {
            objM28280constructorimpl = numValueOf;
        }
        return ((Number) objM28280constructorimpl).intValue();
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ int m24371n(Class cls, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return m24372q(cls, i2);
    }

    /* JADX INFO: renamed from: q */
    private static final int m24372q(Class<?> cls, int i2) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                Field field = declaredFields[i3];
                i3++;
                if (!Modifier.isStatic(field.getModifiers())) {
                    i4++;
                }
            }
            i2 += i4;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> cyoe.x2<Throwable, Throwable> toq(Class<E> cls) {
        toq toqVar = toq.INSTANCE;
        if (f37229k != m24369g(cls, 0)) {
            return toqVar;
        }
        Iterator it = C6144h.tx8q(cls.getConstructors(), new C6684k()).iterator();
        while (it.hasNext()) {
            cyoe.x2<Throwable, Throwable> x2VarZy = zy((Constructor) it.next());
            if (x2VarZy != null) {
                return x2VarZy;
            }
        }
        return toqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public static final <E extends Throwable> E m24373y(@InterfaceC7396q E e2) {
        Object objM28280constructorimpl;
        if (!(e2 instanceof kotlinx.coroutines.lvui)) {
            return (E) f82023toq.mo24364k(e2.getClass()).invoke(e2);
        }
        try {
            C6323o.k kVar = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(((kotlinx.coroutines.lvui) e2).createCopy());
        } catch (Throwable th) {
            C6323o.k kVar2 = C6323o.Companion;
            objM28280constructorimpl = C6323o.m28280constructorimpl(C6318m.m23191k(th));
        }
        if (C6323o.m28285isFailureimpl(objM28280constructorimpl)) {
            objM28280constructorimpl = null;
        }
        return (E) objM28280constructorimpl;
    }

    private static final cyoe.x2<Throwable, Throwable> zy(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C6683g(constructor);
        }
        if (length != 1) {
            if (length == 2 && kotlin.jvm.internal.d2ok.f7l8(parameterTypes[0], String.class) && kotlin.jvm.internal.d2ok.f7l8(parameterTypes[1], Throwable.class)) {
                return new zy(constructor);
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (kotlin.jvm.internal.d2ok.f7l8(cls, Throwable.class)) {
            return new C6686q(constructor);
        }
        if (kotlin.jvm.internal.d2ok.f7l8(cls, String.class)) {
            return new C6685n(constructor);
        }
        return null;
    }
}
