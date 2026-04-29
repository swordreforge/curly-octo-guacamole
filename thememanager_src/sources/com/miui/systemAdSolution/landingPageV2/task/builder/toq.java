package com.miui.systemAdSolution.landingPageV2.task.builder;

import com.miui.systemAdSolution.landingPageV2.listener.IDeeplinkListener;
import com.miui.systemAdSolution.landingPageV2.task.action.Action;
import com.miui.systemAdSolution.landingPageV2.task.action.DeeplinkAction;

/* JADX INFO: compiled from: DeeplinkActionBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq extends AbstractC5339k<IDeeplinkListener> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private String f72495f7l8;

    /* JADX INFO: renamed from: y */
    private String f29832y;

    /* JADX INFO: renamed from: g */
    public toq m18174g(String str) {
        this.f72495f7l8 = str;
        return this;
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.builder.AbstractC5339k
    /* JADX INFO: renamed from: k */
    public Action mo18170k() {
        return new DeeplinkAction(this.f29831k, (IDeeplinkListener) this.f72493zy, this.f72492toq, this.f72495f7l8, this.f29832y);
    }

    /* JADX INFO: renamed from: n */
    public toq m18175n(String str) {
        this.f29832y = str;
        return this;
    }
}
