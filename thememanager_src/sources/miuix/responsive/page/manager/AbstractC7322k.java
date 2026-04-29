package miuix.responsive.page.manager;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Objects;
import miuix.core.util.C7085q;

/* JADX INFO: renamed from: miuix.responsive.page.manager.k */
/* JADX INFO: compiled from: BaseStateManager.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7322k {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected static boolean f90059zy = true;

    /* JADX INFO: renamed from: k */
    protected final kt06.toq f41605k = new kt06.toq();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected kt06.toq f90060toq;

    /* JADX INFO: renamed from: g */
    public static void m26546g() {
        f90059zy = true;
    }

    /* JADX INFO: renamed from: n */
    public static void m26547n() {
        f90059zy = false;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m26548s() {
        return f90059zy;
    }

    protected abstract Context f7l8();

    /* JADX INFO: renamed from: k */
    public void mo26544k(Configuration configuration) {
    }

    protected void ld6(Configuration configuration) {
    }

    /* JADX INFO: renamed from: p */
    protected void m26549p(Configuration configuration) {
    }

    /* JADX INFO: renamed from: q */
    protected kt06.toq m26550q(Configuration configuration) {
        return z4j7.toq.toq(f7l8(), C7085q.m25607s(f7l8()), configuration);
    }

    public void toq(Configuration configuration) {
    }

    /* JADX INFO: renamed from: y */
    protected boolean m26551y(kt06.toq toqVar, kt06.toq toqVar2) {
        return Objects.equals(toqVar, toqVar2);
    }

    protected kt06.toq zy() {
        return z4j7.toq.m28212k(f7l8(), C7085q.m25607s(f7l8()));
    }
}
