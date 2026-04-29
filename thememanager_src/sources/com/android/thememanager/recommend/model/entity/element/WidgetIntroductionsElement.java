package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.network.entity.WidgetPreviewInfo;
import com.android.thememanager.router.recommend.entity.UIElement;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WidgetIntroductionsElement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetIntroductionsElement extends UIElement {

    @InterfaceC7396q
    private final WidgetPreviewInfo widgetPreviewInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetIntroductionsElement(@InterfaceC7396q WidgetPreviewInfo widgetPreviewInfo) {
        super(124);
        d2ok.m23075h(widgetPreviewInfo, "widgetPreviewInfo");
        this.widgetPreviewInfo = widgetPreviewInfo;
    }

    @InterfaceC7396q
    public final WidgetPreviewInfo getWidgetPreviewInfo() {
        return this.widgetPreviewInfo;
    }
}
