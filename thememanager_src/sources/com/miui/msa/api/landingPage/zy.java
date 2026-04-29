package com.miui.msa.api.landingPage;

import android.content.Context;
import com.miui.systemAdSolution.landingPageV2.listener.IActionTaskResultListener;
import com.miui.systemAdSolution.landingPageV2.task.action.Action;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LandingPageProxy.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: q */
    private static volatile C5311g f29733q = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72458zy = "LandingPageProxy";

    /* JADX INFO: renamed from: k */
    private List<Action> f29734k = new ArrayList();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private IActionTaskResultListener f72459toq;

    public zy(Context context) {
        m18097y(context);
    }

    /* JADX INFO: renamed from: y */
    public static void m18097y(Context context) {
        if (f29733q == null) {
            synchronized (zy.class) {
                if (f29733q == null) {
                    f29733q = new C5311g(context);
                }
            }
        }
    }

    public int f7l8() {
        return f29733q.m18089y();
    }

    /* JADX INFO: renamed from: g */
    public EnumC5312k m18098g(String str) {
        return f29733q.m18086g(str);
    }

    /* JADX INFO: renamed from: k */
    public void m18099k(int i2, Action action) {
        this.f29734k.add(i2, action);
    }

    public void ld6(IActionTaskResultListener iActionTaskResultListener) {
        this.f72459toq = iActionTaskResultListener;
    }

    /* JADX INFO: renamed from: n */
    public void m18100n() {
        f29733q.m18087n(this.f29734k, this.f72459toq);
    }

    /* JADX INFO: renamed from: p */
    public void m18101p(Action action) {
        this.f29734k.remove(action);
    }

    /* JADX INFO: renamed from: q */
    public void m18102q() {
        this.f29734k.clear();
    }

    /* JADX INFO: renamed from: s */
    public void m18103s(int i2) {
        this.f29734k.remove(i2);
    }

    public void toq(Action action) {
        this.f29734k.add(action);
    }

    public void zy(String str) {
        f29733q.zy(str);
    }
}
