package kotlin.properties;

import cyoe.cdj;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.reflect.kja0;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.properties.k */
/* JADX INFO: compiled from: Delegates.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6326k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6326k f36482k = new C6326k();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.properties.k$k */
    /* JADX INFO: compiled from: Delegates.kt */
    @lv5({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n*L\n1#1,73:1\n*E\n"})
    public static final class k<T> extends zy<T> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ cdj<kja0<?>, T, T, was> f81858toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(T t2, cdj<? super kja0<?>, ? super T, ? super T, was> cdjVar) {
            super(t2);
            this.f81858toq = cdjVar;
        }

        @Override // kotlin.properties.zy
        protected void zy(@InterfaceC7396q kja0<?> property, T t2, T t3) {
            d2ok.m23075h(property, "property");
            this.f81858toq.invoke(property, t2, t3);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.properties.k$toq */
    /* JADX INFO: compiled from: Delegates.kt */
    @lv5({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n*L\n1#1,73:1\n*E\n"})
    public static final class toq<T> extends zy<T> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ cdj<kja0<?>, T, T, Boolean> f81859toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public toq(T t2, cdj<? super kja0<?>, ? super T, ? super T, Boolean> cdjVar) {
            super(t2);
            this.f81859toq = cdjVar;
        }

        @Override // kotlin.properties.zy
        /* JADX INFO: renamed from: q */
        protected boolean mo23239q(@InterfaceC7396q kja0<?> property, T t2, T t3) {
            d2ok.m23075h(property, "property");
            return this.f81859toq.invoke(property, t2, t3).booleanValue();
        }
    }

    private C6326k() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final <T> InterfaceC6325g<Object, T> m23238k() {
        return new kotlin.properties.toq();
    }

    @InterfaceC7396q
    public final <T> InterfaceC6325g<Object, T> toq(T t2, @InterfaceC7396q cdj<? super kja0<?>, ? super T, ? super T, was> onChange) {
        d2ok.m23075h(onChange, "onChange");
        return new k(t2, onChange);
    }

    @InterfaceC7396q
    public final <T> InterfaceC6325g<Object, T> zy(T t2, @InterfaceC7396q cdj<? super kja0<?>, ? super T, ? super T, Boolean> onChange) {
        d2ok.m23075h(onChange, "onChange");
        return new toq(t2, onChange);
    }
}
