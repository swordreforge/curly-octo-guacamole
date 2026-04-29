package com.miui.systemAdSolution.landingPageV2.task.builder;

import com.miui.systemAdSolution.landingPageV2.listener.IH5Listener;
import com.miui.systemAdSolution.landingPageV2.task.action.H5Action;

/* JADX INFO: renamed from: com.miui.systemAdSolution.landingPageV2.task.builder.q */
/* JADX INFO: compiled from: H5ActionBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5340q extends AbstractC5339k<IH5Listener> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private String f72494f7l8;

    /* JADX INFO: renamed from: g */
    public C5340q m18172g(String str) {
        this.f72494f7l8 = str;
        return this;
    }

    @Override // com.miui.systemAdSolution.landingPageV2.task.builder.AbstractC5339k
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public H5Action mo18170k() {
        return new H5Action(this.f29831k, (IH5Listener) this.f72493zy, this.f72492toq, this.f72494f7l8);
    }
}
