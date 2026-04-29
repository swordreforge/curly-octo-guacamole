package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.a98o;
import kotlin.jvm.internal.d2ok;
import kotlinx.coroutines.flow.InterfaceC6622s;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.uv6;

/* JADX INFO: compiled from: WindowInfoTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/t8r;", "", "Landroid/app/Activity;", C1873k.f10652g, "Lkotlinx/coroutines/flow/s;", "Landroidx/window/layout/fu4;", "zy", "k", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public interface t8r {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C1348k f7177k = C1348k.f7178k;

    /* JADX INFO: renamed from: androidx.window.layout.t8r$k */
    /* JADX INFO: compiled from: WindowInfoTracker.kt */
    @d3(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/window/layout/t8r$k;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/t8r;", "k", "Landroidx/window/layout/ki;", "q", "(Landroid/content/Context;)Landroidx/window/layout/ki;", "Landroidx/window/layout/i;", "overridingDecorator", "Lkotlin/was;", "toq", "zy", "", com.market.sdk.reflect.toq.f68929toq, "DEBUG", "", "Ljava/lang/String;", "TAG", "Landroidx/window/layout/i;", "decorator", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C1348k {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final boolean f53757toq = false;

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ C1348k f7178k = new C1348k();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7395n
        private static final String f53758zy = a98o.m23050q(t8r.class).zurt();

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private static InterfaceC1332i f7179q = C1352y.f7186k;

        private C1348k() {
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "getOrCreate")
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final t8r m5728k(@InterfaceC7396q Context context) {
            d2ok.m23075h(context, "context");
            return f7179q.mo5695k(new fn3e(wvg.f53759toq, m5729q(context)));
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final ki m5729q(@InterfaceC7396q Context context) {
            d2ok.m23075h(context, "context");
            C1342p c1342p = null;
            try {
                WindowLayoutComponent windowLayoutComponentQrj = n7h.f7165k.qrj();
                if (windowLayoutComponentQrj != null) {
                    c1342p = new C1342p(windowLayoutComponentQrj);
                }
            } catch (Throwable unused) {
                if (f53757toq) {
                    Log.d(f53758zy, "Failed to load WindowExtensions");
                }
            }
            return c1342p == null ? C1331h.f53741zy.m5689k(context) : c1342p;
        }

        @l05.qrj
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
        public final void toq(@InterfaceC7396q InterfaceC1332i overridingDecorator) {
            d2ok.m23075h(overridingDecorator, "overridingDecorator");
            f7179q = overridingDecorator;
        }

        @l05.qrj
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
        public final void zy() {
            f7179q = C1352y.f7186k;
        }
    }

    @l05.qrj
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: k */
    static void m5727k(@InterfaceC7396q InterfaceC1332i interfaceC1332i) {
        f7177k.toq(interfaceC1332i);
    }

    @l05.qrj
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    static void reset() {
        f7177k.zy();
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "getOrCreate")
    @l05.qrj
    static t8r toq(@InterfaceC7396q Context context) {
        return f7177k.m5728k(context);
    }

    @InterfaceC7396q
    InterfaceC6622s<fu4> zy(@InterfaceC7396q Activity activity);
}
