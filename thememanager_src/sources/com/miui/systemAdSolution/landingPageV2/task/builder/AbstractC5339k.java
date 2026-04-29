package com.miui.systemAdSolution.landingPageV2.task.builder;

import com.miui.systemAdSolution.landingPageV2.task.action.Action;

/* JADX INFO: renamed from: com.miui.systemAdSolution.landingPageV2.task.builder.k */
/* JADX INFO: compiled from: ActionBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5339k<T> {

    /* JADX INFO: renamed from: g */
    public static final int f29828g = 3;

    /* JADX INFO: renamed from: n */
    public static final int f29829n = 2;

    /* JADX INFO: renamed from: q */
    public static final int f29830q = 1;

    /* JADX INFO: renamed from: k */
    protected Action.C5336k f29831k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected boolean f72492toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected T f72493zy;

    /* JADX INFO: renamed from: k */
    public abstract Action mo18170k();

    /* JADX INFO: renamed from: q */
    public AbstractC5339k m18171q(T t2) {
        this.f72493zy = t2;
        return this;
    }

    public AbstractC5339k toq(Action.C5336k c5336k) {
        this.f29831k = c5336k;
        return this;
    }

    public AbstractC5339k zy(boolean z2) {
        this.f72492toq = z2;
        return this;
    }
}
