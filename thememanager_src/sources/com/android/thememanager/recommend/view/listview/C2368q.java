package com.android.thememanager.recommend.view.listview;

import com.android.thememanager.basemodule.views.x2;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.q */
/* JADX INFO: compiled from: RecommendListPreloadHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2368q {

    /* JADX INFO: renamed from: g */
    private static final int f13759g = 4;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final x2 f60689toq;

    /* JADX INFO: renamed from: k */
    private boolean f13760k = true;

    /* JADX INFO: renamed from: q */
    private int f13762q = -1;

    /* JADX INFO: renamed from: n */
    private int f13761n = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f60690zy = 4;

    public C2368q(@lvui x2 callback) {
        this.f60689toq = callback;
    }

    /* JADX INFO: renamed from: g */
    public void m8566g(boolean enable) {
        this.f13760k = enable;
    }

    /* JADX INFO: renamed from: k */
    public boolean m8567k(int cardStart) {
        return cardStart > this.f13761n;
    }

    /* JADX INFO: renamed from: n */
    public void m8568n() {
        this.f13762q = -1;
    }

    /* JADX INFO: renamed from: q */
    public void m8569q(int position, int count) {
        if (!this.f13760k || count - position > this.f60690zy || !this.f60689toq.zy() || this.f13762q >= 0) {
            return;
        }
        this.f13762q = count;
        this.f60689toq.toq();
    }

    public void toq(boolean refresh, boolean success) {
        this.f13762q = -1;
        if (refresh) {
            this.f13761n = -1;
        } else {
            if (success) {
                return;
            }
            this.f13761n--;
        }
    }

    public void zy(int cardStart) {
        this.f13761n = cardStart;
    }
}
