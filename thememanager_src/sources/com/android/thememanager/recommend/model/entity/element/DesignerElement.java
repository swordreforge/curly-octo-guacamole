package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import mub.InterfaceC7395n;
import z4.C7796k;

/* JADX INFO: compiled from: DesignerElement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DesignerElement extends UIElement {

    @InterfaceC7395n
    private final C7796k designer;
    private final long total;

    public DesignerElement(@InterfaceC7395n C7796k c7796k, long j2) {
        super(92);
        this.designer = c7796k;
        this.total = j2;
    }

    @InterfaceC7395n
    public final C7796k getDesigner() {
        return this.designer;
    }

    public final long getTotal() {
        return this.total;
    }
}
