package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: compiled from: WindowIdApi18.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(18)
class y2 implements c8jq {

    /* JADX INFO: renamed from: k */
    private final WindowId f6803k;

    y2(@zy.lvui View view) {
        this.f6803k = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof y2) && ((y2) obj).f6803k.equals(this.f6803k);
    }

    public int hashCode() {
        return this.f6803k.hashCode();
    }
}
