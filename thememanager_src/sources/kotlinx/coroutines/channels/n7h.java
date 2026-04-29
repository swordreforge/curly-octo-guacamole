package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.hb;
import kotlin.internal.InterfaceC6244y;
import kotlinx.coroutines.channels.d3;
import kotlinx.coroutines.channels.lvui;
import kotlinx.coroutines.internal.hyr;
import kotlinx.coroutines.selects.InterfaceC6725q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/n7h;", C0846k.d9i, "Lkotlinx/coroutines/channels/lvui;", "Lkotlinx/coroutines/channels/d3;", "zzoo", "toq", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface n7h<E> extends lvui<E>, d3<E> {
    public static final int aqnf = -3;
    public static final int eed = -2;
    public static final int g8b1 = Integer.MAX_VALUE;
    public static final int h6 = -1;
    public static final int puq = 0;

    @InterfaceC7396q
    public static final String wgw1 = "kotlinx.coroutines.channels.defaultBuffer";

    @InterfaceC7396q
    public static final toq zzoo = toq.f36831k;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.n7h$k */
    /* JADX INFO: compiled from: Channel.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6504k {
        @InterfaceC6244y
        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @hb(expression = "receiveCatching().getOrNull()", imports = {}))
        /* JADX INFO: renamed from: n */
        public static <E> Object m23925n(@InterfaceC7396q n7h<E> n7hVar, @InterfaceC7396q InterfaceC6216q<? super E> interfaceC6216q) {
            return d3.C6493k.m23868s(n7hVar, interfaceC6216q);
        }

        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @hb(expression = "tryReceive().getOrNull()", imports = {}))
        /* JADX INFO: renamed from: q */
        public static <E> E m23926q(@InterfaceC7396q n7h<E> n7hVar) {
            return (E) d3.C6493k.m23869y(n7hVar);
        }

        @InterfaceC7396q
        public static <E> InterfaceC6725q<E> toq(@InterfaceC7396q n7h<E> n7hVar) {
            return d3.C6493k.m23867q(n7hVar);
        }

        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @hb(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean zy(@InterfaceC7396q n7h<E> n7hVar, E e2) {
            return lvui.C6502k.zy(n7hVar, e2);
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/channels/n7h$toq;", "", "", "toq", com.market.sdk.reflect.toq.f28131g, "UNLIMITED", "zy", "RENDEZVOUS", "q", "CONFLATED", "n", "BUFFERED", C7704k.y.toq.f95579toq, "OPTIONAL_CHANNEL", "", "f7l8", "Ljava/lang/String;", "DEFAULT_BUFFER_PROPERTY_NAME", AnimatedProperty.PROPERTY_NAME_Y, "k", "()I", "CHANNEL_DEFAULT_CAPACITY", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7396q
        public static final String f81960f7l8 = "kotlinx.coroutines.channels.defaultBuffer";

        /* JADX INFO: renamed from: g */
        public static final int f36830g = -3;

        /* JADX INFO: renamed from: n */
        public static final int f36832n = -2;

        /* JADX INFO: renamed from: q */
        public static final int f36833q = -1;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f81961toq = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f81962zy = 0;

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ toq f36831k = new toq();

        /* JADX INFO: renamed from: y */
        private static final int f36834y = hyr.toq("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private toq() {
        }

        /* JADX INFO: renamed from: k */
        public final int m23927k() {
            return f36834y;
        }
    }
}
