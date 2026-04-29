package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.value.C1515k;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: BaseAnimatableValue.java */
/* JADX INFO: loaded from: classes.dex */
abstract class n7h<V, O> implements qrj<V, O> {

    /* JADX INFO: renamed from: k */
    final List<C1515k<V>> f7979k;

    n7h(V v2) {
        this(Collections.singletonList(new C1515k(v2)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f7979k.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f7979k.toArray()));
        }
        return sb.toString();
    }

    @Override // com.airbnb.lottie.model.animatable.qrj
    public List<C1515k<V>> toq() {
        return this.f7979k;
    }

    @Override // com.airbnb.lottie.model.animatable.qrj
    public boolean zy() {
        return this.f7979k.isEmpty() || (this.f7979k.size() == 1 && this.f7979k.get(0).m6282y());
    }

    n7h(List<C1515k<V>> list) {
        this.f7979k = list;
    }
}
