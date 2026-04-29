package androidx.core.location;

import android.location.LocationManager;
import androidx.core.location.x2;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: androidx.core.location.s */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0561s implements Callable {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ LocationManager f3666k;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ x2.C0569s f3667q;

    public /* synthetic */ CallableC0561s(LocationManager locationManager, x2.C0569s c0569s) {
        this.f3666k = locationManager;
        this.f3667q = c0569s;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return x2.m2662s(this.f3666k, this.f3667q);
    }
}
