package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.utils.C1512y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CompoundTrimPathContent.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private final List<zurt> f7864k = new ArrayList();

    /* JADX INFO: renamed from: k */
    void m5902k(zurt zurtVar) {
        this.f7864k.add(zurtVar);
    }

    public void toq(Path path) {
        for (int size = this.f7864k.size() - 1; size >= 0; size--) {
            C1512y.toq(path, this.f7864k.get(size));
        }
    }
}
