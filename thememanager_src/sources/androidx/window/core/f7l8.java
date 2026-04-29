package androidx.window.core;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import cyoe.x2;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 \n*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\n\rB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H&J\u0011\u0010\n\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¨\u0006\u0010"}, d2 = {"Landroidx/window/core/f7l8;", "", C0846k.zaso, "", "message", "Lkotlin/Function1;", "", "Lkotlin/fn3e;", "condition", "zy", "k", "()Ljava/lang/Object;", "value", "toq", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public abstract class f7l8<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C1305k f7075k = new C1305k(null);

    /* JADX INFO: renamed from: androidx.window.core.f7l8$k */
    /* JADX INFO: compiled from: SpecificationComputer.kt */
    @d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/window/core/f7l8$k;", "", C0846k.zaso, "", "tag", "Landroidx/window/core/f7l8$toq;", "verificationMode", "Landroidx/window/core/g;", "logger", "Landroidx/window/core/f7l8;", "k", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/f7l8$toq;Landroidx/window/core/g;)Landroidx/window/core/f7l8;", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C1305k {
        private C1305k() {
        }

        public /* synthetic */ C1305k(ni7 ni7Var) {
            this();
        }

        public static /* synthetic */ f7l8 toq(C1305k c1305k, Object obj, String str, toq toqVar, InterfaceC1306g interfaceC1306g, int i2, Object obj2) {
            if ((i2 & 2) != 0) {
                toqVar = zy.f7097k.m5609k();
            }
            if ((i2 & 4) != 0) {
                interfaceC1306g = C1307k.f7077k;
            }
            return c1305k.m5586k(obj, str, toqVar, interfaceC1306g);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final <T> f7l8<T> m5586k(@InterfaceC7396q T t2, @InterfaceC7396q String tag, @InterfaceC7396q toq verificationMode, @InterfaceC7396q InterfaceC1306g logger) {
            d2ok.m23075h(t2, "<this>");
            d2ok.m23075h(tag, "tag");
            d2ok.m23075h(verificationMode, "verificationMode");
            d2ok.m23075h(logger, "logger");
            return new C1312y(t2, tag, verificationMode, logger);
        }
    }

    /* JADX INFO: compiled from: SpecificationComputer.kt */
    @d3(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/core/f7l8$toq;", "", C4991s.f28129n, "(Ljava/lang/String;I)V", "STRICT", "LOG", "QUIET", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public enum toq {
        STRICT,
        LOG,
        QUIET
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public abstract T mo5585k();

    @InterfaceC7396q
    protected final String toq(@InterfaceC7396q Object value, @InterfaceC7396q String message) {
        d2ok.m23075h(value, "value");
        d2ok.m23075h(message, "message");
        return message + " value: " + value;
    }

    @InterfaceC7396q
    public abstract f7l8<T> zy(@InterfaceC7396q String str, @InterfaceC7396q x2<? super T, Boolean> x2Var);
}
