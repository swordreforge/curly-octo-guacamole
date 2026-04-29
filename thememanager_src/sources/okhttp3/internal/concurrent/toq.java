package okhttp3.internal.concurrent;

import cyoe.InterfaceC5981k;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C6311u;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.d3;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TaskLogger.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class toq {
    /* JADX INFO: renamed from: n */
    public static final void m26997n(@InterfaceC7396q AbstractC7444k task, @InterfaceC7396q zy queue, @InterfaceC7396q InterfaceC5981k<String> messageBlock) {
        d2ok.m23075h(task, "task");
        d2ok.m23075h(queue, "queue");
        d2ok.m23075h(messageBlock, "messageBlock");
        if (C7445q.f43046y.m26994k().isLoggable(Level.FINE)) {
            zy(task, queue, messageBlock.invoke());
        }
    }

    /* JADX INFO: renamed from: q */
    public static final <T> T m26998q(@InterfaceC7396q AbstractC7444k task, @InterfaceC7396q zy queue, @InterfaceC7396q InterfaceC5981k<? extends T> block) {
        long jMo26993q;
        d2ok.m23075h(task, "task");
        d2ok.m23075h(queue, "queue");
        d2ok.m23075h(block, "block");
        boolean zIsLoggable = C7445q.f43046y.m26994k().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jMo26993q = queue.ld6().m26991y().mo26993q();
            zy(task, queue, "starting");
        } else {
            jMo26993q = -1;
        }
        try {
            T tInvoke = block.invoke();
            d3.m23090q(1);
            if (zIsLoggable) {
                zy(task, queue, "finished run in " + toq(queue.ld6().m26991y().mo26993q() - jMo26993q));
            }
            d3.zy(1);
            return tInvoke;
        } catch (Throwable th) {
            d3.m23090q(1);
            if (zIsLoggable) {
                zy(task, queue, "failed a run in " + toq(queue.ld6().m26991y().mo26993q() - jMo26993q));
            }
            d3.zy(1);
            throw th;
        }
    }

    @InterfaceC7396q
    public static final String toq(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j2 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        C6311u c6311u = C6311u.f36447k;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        d2ok.kja0(str2, "format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zy(AbstractC7444k abstractC7444k, zy zyVar, String str) {
        Logger loggerM26994k = C7445q.f43046y.m26994k();
        StringBuilder sb = new StringBuilder();
        sb.append(zyVar.m27007y());
        sb.append(' ');
        C6311u c6311u = C6311u.f36447k;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        d2ok.kja0(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(abstractC7444k.toq());
        loggerM26994k.fine(sb.toString());
    }
}
