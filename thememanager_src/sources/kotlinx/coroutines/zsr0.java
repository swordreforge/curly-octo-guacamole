package kotlinx.coroutines;

import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import com.xiaomi.onetrack.api.at;
import java.util.concurrent.CancellationException;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/zsr0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/lvui;", "", "fillInStackTrace", "createCopy", "", "toString", "", C2690k.k.f61039ld6, "", "equals", "", "hashCode", "Lkotlinx/coroutines/gbni;", at.f31711e, "Lkotlinx/coroutines/gbni;", "message", "cause", C4991s.f28129n, "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/gbni;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class zsr0 extends CancellationException implements lvui<zsr0> {

    @InterfaceC7396q
    @InterfaceC6765n
    public final gbni job;

    public zsr0(@InterfaceC7396q String str, @InterfaceC7395n Throwable th, @InterfaceC7396q gbni gbniVar) {
        super(str);
        this.job = gbniVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.lvui
    @InterfaceC7395n
    public zsr0 createCopy() {
        return null;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj != this) {
            if (obj instanceof zsr0) {
                zsr0 zsr0Var = (zsr0) obj;
                if (!kotlin.jvm.internal.d2ok.f7l8(zsr0Var.getMessage(), getMessage()) || !kotlin.jvm.internal.d2ok.f7l8(zsr0Var.job, this.job) || !kotlin.jvm.internal.d2ok.f7l8(zsr0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @InterfaceC7396q
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.d2ok.qrj(message);
        int iHashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    @InterfaceC7396q
    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}
