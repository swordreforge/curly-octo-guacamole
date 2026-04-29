package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import java.util.concurrent.CancellationException;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/pc;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/lvui;", "createCopy", "Lkotlinx/coroutines/gbni;", "coroutine", "Lkotlinx/coroutines/gbni;", "", "message", C4991s.f28129n, "(Ljava/lang/String;Lkotlinx/coroutines/gbni;)V", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class pc extends CancellationException implements lvui<pc> {

    @InterfaceC6765n
    @InterfaceC7395n
    public final gbni coroutine;

    public pc(@InterfaceC7396q String str, @InterfaceC7395n gbni gbniVar) {
        super(str);
        this.coroutine = gbniVar;
    }

    @Override // kotlinx.coroutines.lvui
    @InterfaceC7395n
    public pc createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        pc pcVar = new pc(message, this.coroutine);
        pcVar.initCause(this);
        return pcVar;
    }

    public pc(@InterfaceC7396q String str) {
        this(str, null);
    }
}
