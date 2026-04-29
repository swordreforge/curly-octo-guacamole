package androidx.collection;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.settingssearch.C2690k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.util.Iterator;
import kotlin.collections.n5r1;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;
import v5yj.C7704k;

/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a0\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a6\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a/\u0010\u0013\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aQ\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0015H\u0086\b\u001a\u0016\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"\"\u0010 \u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {C0846k.zaso, "Landroidx/collection/n7h;", "", InterfaceC1925p.qn, "", "k", "value", "Lkotlin/was;", "p", "(Landroidx/collection/n7h;ILjava/lang/Object;)V", C2690k.k.f61039ld6, AnimatedProperty.PROPERTY_NAME_Y, "defaultValue", "zy", "(Landroidx/collection/n7h;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "q", "(Landroidx/collection/n7h;ILcyoe/k;)Ljava/lang/Object;", C7704k.y.toq.f95579toq, C7704k.y.toq.f44691k, "(Landroidx/collection/n7h;ILjava/lang/Object;)Z", "Lkotlin/Function2;", "Lkotlin/c;", "name", "action", "toq", "Lkotlin/collections/n5r1;", "f7l8", "", "ld6", "n", "(Landroidx/collection/n7h;)I", "size", "collection-ktx"}, m22787k = 2, mv = {1, 4, 0})
public final class kja0 {

    /* JADX INFO: renamed from: androidx.collection.kja0$k */
    /* JADX INFO: compiled from: SparseArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/collection/kja0$k", "Lkotlin/collections/n5r1;", "", "hasNext", "", "nextInt", "k", com.market.sdk.reflect.toq.f28131g, "()I", "toq", "(I)V", "index", "collection-ktx"}, m22787k = 1, mv = {1, 4, 0})
    public static final class C0248k extends n5r1 {

        /* JADX INFO: renamed from: k */
        private int f1332k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ n7h f1333q;

        C0248k(n7h<T> n7hVar) {
            this.f1333q = n7hVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1332k < this.f1333q.a9();
        }

        /* JADX INFO: renamed from: k */
        public final int m834k() {
            return this.f1332k;
        }

        @Override // kotlin.collections.n5r1
        public int nextInt() {
            n7h n7hVar = this.f1333q;
            int i2 = this.f1332k;
            this.f1332k = i2 + 1;
            return n7hVar.m852i(i2);
        }

        public final void toq(int i2) {
            this.f1332k = i2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SparseArray.kt */
    @d3(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/collection/kja0$toq", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "k", com.market.sdk.reflect.toq.f28131g, "()I", "toq", "(I)V", "index", "collection-ktx"}, m22787k = 1, mv = {1, 4, 0})
    public static final class toq<T> implements Iterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        private int f1334k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ n7h f1335q;

        toq(n7h<T> n7hVar) {
            this.f1335q = n7hVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1334k < this.f1335q.a9();
        }

        /* JADX INFO: renamed from: k */
        public final int m835k() {
            return this.f1334k;
        }

        @Override // java.util.Iterator
        public T next() {
            n7h n7hVar = this.f1335q;
            int i2 = this.f1334k;
            this.f1334k = i2 + 1;
            return (T) n7hVar.fti(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void toq(int i2) {
            this.f1334k = i2;
        }
    }

    @InterfaceC7396q
    public static final <T> n5r1 f7l8(@InterfaceC7396q n7h<T> receiver$0) {
        d2ok.cdj(receiver$0, "receiver$0");
        return new C0248k(receiver$0);
    }

    /* JADX INFO: renamed from: g */
    public static final <T> boolean m827g(@InterfaceC7396q n7h<T> receiver$0) {
        d2ok.cdj(receiver$0, "receiver$0");
        return !receiver$0.t8r();
    }

    /* JADX INFO: renamed from: k */
    public static final <T> boolean m828k(@InterfaceC7396q n7h<T> receiver$0, int i2) {
        d2ok.cdj(receiver$0, "receiver$0");
        return receiver$0.m851g(i2);
    }

    @InterfaceC7396q
    public static final <T> Iterator<T> ld6(@InterfaceC7396q n7h<T> receiver$0) {
        d2ok.cdj(receiver$0, "receiver$0");
        return new toq(receiver$0);
    }

    /* JADX INFO: renamed from: n */
    public static final <T> int m829n(@InterfaceC7396q n7h<T> receiver$0) {
        d2ok.cdj(receiver$0, "receiver$0");
        return receiver$0.a9();
    }

    /* JADX INFO: renamed from: p */
    public static final <T> void m830p(@InterfaceC7396q n7h<T> receiver$0, int i2, T t2) {
        d2ok.cdj(receiver$0, "receiver$0");
        receiver$0.fn3e(i2, t2);
    }

    /* JADX INFO: renamed from: q */
    public static final <T> T m831q(@InterfaceC7396q n7h<T> receiver$0, int i2, @InterfaceC7396q InterfaceC5981k<? extends T> defaultValue) {
        d2ok.cdj(receiver$0, "receiver$0");
        d2ok.cdj(defaultValue, "defaultValue");
        T tN7h = receiver$0.n7h(i2);
        return tN7h != null ? tN7h : defaultValue.invoke();
    }

    @kotlin.ld6(message = "Replaced with member function. Remove extension import!")
    /* JADX INFO: renamed from: s */
    public static final <T> boolean m832s(@InterfaceC7396q n7h<T> receiver$0, int i2, T t2) {
        d2ok.cdj(receiver$0, "receiver$0");
        return receiver$0.m859z(i2, t2);
    }

    public static final <T> void toq(@InterfaceC7396q n7h<T> receiver$0, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, was> action) {
        d2ok.cdj(receiver$0, "receiver$0");
        d2ok.cdj(action, "action");
        int iA9 = receiver$0.a9();
        for (int i2 = 0; i2 < iA9; i2++) {
            action.invoke(Integer.valueOf(receiver$0.m852i(i2)), receiver$0.fti(i2));
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final <T> n7h<T> m833y(@InterfaceC7396q n7h<T> receiver$0, @InterfaceC7396q n7h<T> other) {
        d2ok.cdj(receiver$0, "receiver$0");
        d2ok.cdj(other, "other");
        n7h<T> n7hVar = new n7h<>(receiver$0.a9() + other.a9());
        n7hVar.zurt(receiver$0);
        n7hVar.zurt(other);
        return n7hVar;
    }

    public static final <T> T zy(@InterfaceC7396q n7h<T> receiver$0, int i2, T t2) {
        d2ok.cdj(receiver$0, "receiver$0");
        return receiver$0.kja0(i2, t2);
    }
}
