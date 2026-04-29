package androidx.room;

import androidx.sqlite.db.InterfaceC1176y;
import java.util.concurrent.atomic.AtomicBoolean;
import zy.uv6;

/* JADX INFO: compiled from: SharedSQLiteStatement.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public abstract class oc {

    /* JADX INFO: renamed from: k */
    private final AtomicBoolean f6208k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AbstractC1141t f52380toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile InterfaceC1176y f52381zy;

    public oc(AbstractC1141t abstractC1141t) {
        this.f52380toq = abstractC1141t;
    }

    /* JADX INFO: renamed from: n */
    private InterfaceC1176y m5166n(boolean z2) {
        if (!z2) {
            return zy();
        }
        if (this.f52381zy == null) {
            this.f52381zy = zy();
        }
        return this.f52381zy;
    }

    private InterfaceC1176y zy() {
        return this.f52380toq.m5183g(mo5169q());
    }

    /* JADX INFO: renamed from: g */
    public void m5167g(InterfaceC1176y interfaceC1176y) {
        if (interfaceC1176y == this.f52381zy) {
            this.f6208k.set(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC1176y m5168k() {
        toq();
        return m5166n(this.f6208k.compareAndSet(false, true));
    }

    /* JADX INFO: renamed from: q */
    protected abstract String mo5169q();

    protected void toq() {
        this.f52380toq.m5185k();
    }
}
