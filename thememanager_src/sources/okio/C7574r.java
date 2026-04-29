package okio;

import java.io.Closeable;
import kotlin.C6231h;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.r */
/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class C7574r {
    @InterfaceC7396q
    @InterfaceC6769y(name = "blackhole")
    /* JADX INFO: renamed from: k */
    public static final vyq m27849k() {
        return new ld6();
    }

    /* JADX INFO: renamed from: q */
    public static final <T extends Closeable, R> R m27850q(T t2, @InterfaceC7396q cyoe.x2<? super T, ? extends R> block) throws Throwable {
        R rInvoke;
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        Throwable th = null;
        try {
            rInvoke = block.invoke(t2);
            kotlin.jvm.internal.d3.m23090q(1);
            if (t2 != null) {
                try {
                    t2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.d3.zy(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.d3.m23090q(1);
            if (t2 != null) {
                try {
                    t2.close();
                } catch (Throwable th4) {
                    C6231h.m22845k(th3, th4);
                }
            }
            kotlin.jvm.internal.d3.zy(1);
            th = th3;
            rInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.d2ok.qrj(rInvoke);
        return rInvoke;
    }

    @InterfaceC7396q
    public static final qrj toq(@InterfaceC7396q vyq vyqVar) {
        kotlin.jvm.internal.d2ok.m23075h(vyqVar, "<this>");
        return new hyr(vyqVar);
    }

    @InterfaceC7396q
    public static final n7h zy(@InterfaceC7396q nn86 nn86Var) {
        kotlin.jvm.internal.d2ok.m23075h(nn86Var, "<this>");
        return new C7544f(nn86Var);
    }
}
