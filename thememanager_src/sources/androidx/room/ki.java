package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import zy.yz;

/* JADX INFO: compiled from: InvalidationLiveDataContainer.java */
/* JADX INFO: loaded from: classes.dex */
class ki {

    /* JADX INFO: renamed from: k */
    @yz
    final Set<LiveData> f6193k = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AbstractC1141t f52370toq;

    ki(AbstractC1141t abstractC1141t) {
        this.f52370toq = abstractC1141t;
    }

    /* JADX INFO: renamed from: k */
    <T> LiveData<T> m5163k(String[] strArr, boolean z2, Callable<T> callable) {
        return new fti(this.f52370toq, this, z2, callable, strArr);
    }

    void toq(LiveData liveData) {
        this.f6193k.add(liveData);
    }

    void zy(LiveData liveData) {
        this.f6193k.remove(liveData);
    }
}
