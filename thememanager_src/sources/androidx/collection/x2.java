package androidx.collection;

import com.android.thememanager.controller.online.InterfaceC1925p;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.ki;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aø\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000328\b\u0006\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00052%\b\u0006\u0010\f\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2d\b\u0006\u0010\u0013\u001a^\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0086\b¨\u0006\u0016"}, d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "Lkotlin/c;", "name", InterfaceC1925p.qn, "value", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "Lkotlin/was;", "onEntryRemoved", "Landroidx/collection/ld6;", "k", "collection-ktx"}, m22787k = 2, mv = {1, 4, 0})
public final class x2 {

    /* JADX INFO: renamed from: androidx.collection.x2$k */
    /* JADX INFO: compiled from: LruCache.kt */
    @d3(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "K", "", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, m22787k = 3, mv = {1, 1, 13})
    public static final class C0253k extends AbstractC6308r implements InterfaceC5979h<Object, Object, Integer> {
        public static final C0253k INSTANCE = new C0253k();

        public C0253k() {
            super(2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2(@InterfaceC7396q Object obj, @InterfaceC7396q Object obj2) {
            d2ok.cdj(obj, "<anonymous parameter 0>");
            d2ok.cdj(obj2, "<anonymous parameter 1>");
            return 1;
        }

        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ Integer invoke(Object obj, Object obj2) {
            return Integer.valueOf(invoke2(obj, obj2));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.collection.x2$q */
    /* JADX INFO: compiled from: LruCache.kt */
    @d3(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/collection/x2$q", "Landroidx/collection/ld6;", InterfaceC1925p.qn, "value", "", AnimatedProperty.PROPERTY_NAME_H, "(Ljava/lang/Object;Ljava/lang/Object;)I", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Lkotlin/was;", "zy", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "collection-ktx"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C0254q<K, V> extends ld6<K, V> {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        final /* synthetic */ ki f47038ld6;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ cyoe.x2 f1369p;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ InterfaceC5979h f1370s;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        final /* synthetic */ int f47039x2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0254q(InterfaceC5979h interfaceC5979h, cyoe.x2 x2Var, ki kiVar, int i2, int i3) {
            super(i3);
            this.f1370s = interfaceC5979h;
            this.f1369p = x2Var;
            this.f47038ld6 = kiVar;
            this.f47039x2 = i2;
        }

        @Override // androidx.collection.ld6
        /* JADX INFO: renamed from: h */
        protected int mo837h(@InterfaceC7396q K key, @InterfaceC7396q V value) {
            d2ok.cdj(key, "key");
            d2ok.cdj(value, "value");
            return ((Number) this.f1370s.invoke(key, value)).intValue();
        }

        @Override // androidx.collection.ld6
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        protected V mo838k(@InterfaceC7396q K key) {
            d2ok.cdj(key, "key");
            return (V) this.f1369p.invoke(key);
        }

        @Override // androidx.collection.ld6
        protected void zy(boolean z2, @InterfaceC7396q K key, @InterfaceC7396q V oldValue, @InterfaceC7395n V v2) {
            d2ok.cdj(key, "key");
            d2ok.cdj(oldValue, "oldValue");
            this.f47038ld6.invoke(Boolean.valueOf(z2), key, oldValue, v2);
        }
    }

    /* JADX INFO: compiled from: LruCache.kt */
    @d3(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "V", "K", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m22787k = 3, mv = {1, 1, 13})
    public static final class toq extends AbstractC6308r implements cyoe.x2<Object, Object> {
        public static final toq INSTANCE = new toq();

        public toq() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q Object it) {
            d2ok.cdj(it, "it");
            return null;
        }
    }

    /* JADX INFO: compiled from: LruCache.kt */
    @d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "K", "V", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lkotlin/was;", "invoke", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class zy extends AbstractC6308r implements ki<Boolean, Object, Object, Object, was> {
        public static final zy INSTANCE = new zy();

        public zy() {
            super(4);
        }

        @Override // cyoe.ki
        public /* bridge */ /* synthetic */ was invoke(Boolean bool, Object obj, Object obj2, Object obj3) {
            invoke(bool.booleanValue(), obj, obj2, obj3);
            return was.f36763k;
        }

        public final void invoke(boolean z2, @InterfaceC7396q Object obj, @InterfaceC7396q Object obj2, @InterfaceC7395n Object obj3) {
            d2ok.cdj(obj, "<anonymous parameter 1>");
            d2ok.cdj(obj2, "<anonymous parameter 2>");
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <K, V> ld6<K, V> m886k(int i2, @InterfaceC7396q InterfaceC5979h<? super K, ? super V, Integer> sizeOf, @InterfaceC7396q cyoe.x2<? super K, ? extends V> create, @InterfaceC7396q ki<? super Boolean, ? super K, ? super V, ? super V, was> onEntryRemoved) {
        d2ok.cdj(sizeOf, "sizeOf");
        d2ok.cdj(create, "create");
        d2ok.cdj(onEntryRemoved, "onEntryRemoved");
        return new C0254q(sizeOf, create, onEntryRemoved, i2, i2);
    }

    @InterfaceC7396q
    public static /* synthetic */ ld6 toq(int i2, InterfaceC5979h interfaceC5979h, cyoe.x2 x2Var, ki kiVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            interfaceC5979h = C0253k.INSTANCE;
        }
        InterfaceC5979h sizeOf = interfaceC5979h;
        if ((i3 & 4) != 0) {
            x2Var = toq.INSTANCE;
        }
        cyoe.x2 create = x2Var;
        if ((i3 & 8) != 0) {
            kiVar = zy.INSTANCE;
        }
        ki onEntryRemoved = kiVar;
        d2ok.cdj(sizeOf, "sizeOf");
        d2ok.cdj(create, "create");
        d2ok.cdj(onEntryRemoved, "onEntryRemoved");
        return new C0254q(sizeOf, create, onEntryRemoved, i2, i2);
    }
}
