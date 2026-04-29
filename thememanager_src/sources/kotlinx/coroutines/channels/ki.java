package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.nn86;
import kotlinx.coroutines.tfm;
import l05.InterfaceC6761g;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087@\u0018\u0000  *\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0013 \u001fB\u0016\b\u0001\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019\u0088\u0001\u0017\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lkotlinx/coroutines/channels/ki;", C0846k.zaso, "", AnimatedProperty.PROPERTY_NAME_Y, "(Ljava/lang/Object;)Ljava/lang/Object;", C7704k.y.toq.f44691k, "", C7704k.y.toq.f95579toq, "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "n7h", "(Ljava/lang/Object;)Ljava/lang/String;", "", "p", "(Ljava/lang/Object;)I", C2690k.k.f61039ld6, "", "q", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "k", "Ljava/lang/Object;", "getHolder$annotations", "()V", "holder", "qrj", "(Ljava/lang/Object;)Z", "isSuccess", "x2", "isFailure", "ld6", "isClosed", "zy", "toq", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC6761g
public final class ki<T> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final toq f81958toq = new toq(null);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final zy f81959zy = new zy();

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final Object f36825k;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ki$k */
    /* JADX INFO: compiled from: Channel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/channels/ki$k;", "Lkotlinx/coroutines/channels/ki$zy;", "", C2690k.k.f61039ld6, "", "equals", "", "hashCode", "", "toString", "", "k", "Ljava/lang/Throwable;", "cause", C4991s.f28129n, "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6501k extends zy {

        /* JADX INFO: renamed from: k */
        @InterfaceC6765n
        @InterfaceC7395n
        public final Throwable f36826k;

        public C6501k(@InterfaceC7395n Throwable th) {
            this.f36826k = th;
        }

        public boolean equals(@InterfaceC7395n Object obj) {
            return (obj instanceof C6501k) && kotlin.jvm.internal.d2ok.f7l8(this.f36826k, ((C6501k) obj).f36826k);
        }

        public int hashCode() {
            Throwable th = this.f36826k;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @Override // kotlinx.coroutines.channels.ki.zy
        @InterfaceC7396q
        public String toString() {
            return "Closed(" + this.f36826k + ')';
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/ki$toq;", "", C0846k.d9i, "value", "Lkotlinx/coroutines/channels/ki;", "zy", "(Ljava/lang/Object;)Ljava/lang/Object;", "toq", "()Ljava/lang/Object;", "", "cause", "k", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ki$zy;", "failed", "Lkotlinx/coroutines/channels/ki$zy;", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    @tfm
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @tfm
        /* JADX INFO: renamed from: k */
        public final <E> Object m23918k(@InterfaceC7395n Throwable th) {
            return ki.zy(new C6501k(th));
        }

        @InterfaceC7396q
        @tfm
        public final <E> Object toq() {
            return ki.zy(ki.f81959zy);
        }

        @InterfaceC7396q
        @tfm
        public final <E> Object zy(E e2) {
            return ki.zy(e2);
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/ki$zy;", "", "", "toString", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static class zy {
        @InterfaceC7396q
        public String toString() {
            return "Failed";
        }
    }

    @nn86
    private /* synthetic */ ki(Object obj) {
        this.f36825k = obj;
    }

    @nn86
    public static /* synthetic */ void f7l8() {
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public static final Throwable m23911g(Object obj) {
        C6501k c6501k = obj instanceof C6501k ? (C6501k) obj : null;
        if (c6501k == null) {
            return null;
        }
        return c6501k.f36826k;
    }

    public static final boolean ld6(Object obj) {
        return obj instanceof C6501k;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m23913n(Object obj, Object obj2) {
        return kotlin.jvm.internal.d2ok.f7l8(obj, obj2);
    }

    @InterfaceC7396q
    public static String n7h(Object obj) {
        if (obj instanceof C6501k) {
            return ((C6501k) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    /* JADX INFO: renamed from: p */
    public static int m23914p(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m23915q(Object obj, Object obj2) {
        return (obj2 instanceof ki) && kotlin.jvm.internal.d2ok.f7l8(obj, ((ki) obj2).kja0());
    }

    public static final boolean qrj(Object obj) {
        return !(obj instanceof zy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static final T m23916s(Object obj) throws Throwable {
        Throwable th;
        if (!(obj instanceof zy)) {
            return obj;
        }
        if (!(obj instanceof C6501k) || (th = ((C6501k) obj).f36826k) == null) {
            throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Trying to call 'getOrThrow' on a failed channel result: ", obj).toString());
        }
        throw th;
    }

    public static final /* synthetic */ ki toq(Object obj) {
        return new ki(obj);
    }

    public static final boolean x2(Object obj) {
        return obj instanceof zy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public static final T m23917y(Object obj) {
        if (obj instanceof zy) {
            return null;
        }
        return obj;
    }

    @nn86
    @InterfaceC7396q
    public static <T> Object zy(@InterfaceC7395n Object obj) {
        return obj;
    }

    public boolean equals(Object obj) {
        return m23915q(this.f36825k, obj);
    }

    public int hashCode() {
        return m23914p(this.f36825k);
    }

    public final /* synthetic */ Object kja0() {
        return this.f36825k;
    }

    @InterfaceC7396q
    public String toString() {
        return n7h(this.f36825k);
    }
}
