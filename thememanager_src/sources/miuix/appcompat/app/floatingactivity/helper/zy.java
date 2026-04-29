package miuix.appcompat.app.floatingactivity.helper;

import android.graphics.Point;
import miuix.appcompat.app.t8r;
import miuix.core.util.C7079h;
import miuix.core.util.C7085q;

/* JADX INFO: compiled from: FoldFloatingActivityHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy extends x2 {
    public zy(t8r t8rVar) {
        super(t8rVar);
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.x2
    public void lvui() {
        if (miuix.appcompat.app.floatingactivity.toq.m24987g()) {
            return;
        }
        if (uv6()) {
            miuix.appcompat.app.floatingactivity.toq.m24988k(this.f38849k);
        } else if (miuix.appcompat.app.floatingactivity.toq.m24993y(this.f38849k) >= 0) {
            miuix.appcompat.app.floatingactivity.toq.zy(this.f38849k);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: y */
    public boolean mo24919y() {
        miuix.core.util.t8r t8rVarM25607s = C7085q.m25607s(this.f38849k);
        if (!(C7085q.f7l8(this.f38849k) >= 600)) {
            return false;
        }
        int i2 = t8rVarM25607s.f87379f7l8;
        if (i2 == 8195 || !C7079h.m25550q(i2)) {
            return true;
        }
        Point point = t8rVarM25607s.f39906q;
        return point.y >= 747 && point.x > 670;
    }
}
