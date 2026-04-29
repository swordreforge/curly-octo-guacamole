package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.dr;
import androidx.core.view.gyi;
import androidx.core.view.xwq3;
import java.util.ArrayList;
import java.util.Iterator;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.view.y */
/* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0139y {

    /* JADX INFO: renamed from: n */
    private boolean f596n;

    /* JADX INFO: renamed from: q */
    dr f597q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Interpolator f46807zy;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f46806toq = -1;

    /* JADX INFO: renamed from: g */
    private final xwq3 f594g = new k();

    /* JADX INFO: renamed from: k */
    final ArrayList<gyi> f595k = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.appcompat.view.y$k */
    /* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
    class k extends xwq3 {

        /* JADX INFO: renamed from: k */
        private boolean f598k = false;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f46808toq = 0;

        k() {
        }

        /* JADX INFO: renamed from: q */
        void m407q() {
            this.f46808toq = 0;
            this.f598k = false;
            C0139y.this.toq();
        }

        @Override // androidx.core.view.xwq3, androidx.core.view.dr
        public void toq(View view) {
            int i2 = this.f46808toq + 1;
            this.f46808toq = i2;
            if (i2 == C0139y.this.f595k.size()) {
                dr drVar = C0139y.this.f597q;
                if (drVar != null) {
                    drVar.toq(null);
                }
                m407q();
            }
        }

        @Override // androidx.core.view.xwq3, androidx.core.view.dr
        public void zy(View view) {
            if (this.f598k) {
                return;
            }
            this.f598k = true;
            dr drVar = C0139y.this.f597q;
            if (drVar != null) {
                drVar.zy(null);
            }
        }
    }

    public C0139y f7l8(dr drVar) {
        if (!this.f596n) {
            this.f597q = drVar;
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C0139y m402g(Interpolator interpolator) {
        if (!this.f596n) {
            this.f46807zy = interpolator;
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public void m403k() {
        if (this.f596n) {
            Iterator<gyi> it = this.f595k.iterator();
            while (it.hasNext()) {
                it.next().m3298q();
            }
            this.f596n = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public C0139y m404n(long j2) {
        if (!this.f596n) {
            this.f46806toq = j2;
        }
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C0139y m405q(gyi gyiVar, gyi gyiVar2) {
        this.f595k.add(gyiVar);
        gyiVar2.ni7(gyiVar.m3296n());
        this.f595k.add(gyiVar2);
        return this;
    }

    void toq() {
        this.f596n = false;
    }

    /* JADX INFO: renamed from: y */
    public void m406y() {
        if (this.f596n) {
            return;
        }
        for (gyi gyiVar : this.f595k) {
            long j2 = this.f46806toq;
            if (j2 >= 0) {
                gyiVar.t8r(j2);
            }
            Interpolator interpolator = this.f46807zy;
            if (interpolator != null) {
                gyiVar.m3295i(interpolator);
            }
            if (this.f597q != null) {
                gyiVar.fn3e(this.f594g);
            }
            gyiVar.m3302z();
        }
        this.f596n = true;
    }

    public C0139y zy(gyi gyiVar) {
        if (!this.f596n) {
            this.f595k.add(gyiVar);
        }
        return this;
    }
}
