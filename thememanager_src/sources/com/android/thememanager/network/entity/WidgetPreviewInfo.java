package com.android.thememanager.network.entity;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WidgetPreviewInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class WidgetPreviewInfo implements Serializable {

    @InterfaceC7396q
    private final String picAspectRatio;

    @InterfaceC7396q
    private final String picUrl;

    @InterfaceC7396q
    private final String suitPreviewSize;

    public WidgetPreviewInfo(@InterfaceC7396q String picAspectRatio, @InterfaceC7396q String suitPreviewSize, @InterfaceC7396q String picUrl) {
        d2ok.m23075h(picAspectRatio, "picAspectRatio");
        d2ok.m23075h(suitPreviewSize, "suitPreviewSize");
        d2ok.m23075h(picUrl, "picUrl");
        this.picAspectRatio = picAspectRatio;
        this.suitPreviewSize = suitPreviewSize;
        this.picUrl = picUrl;
    }

    public static /* synthetic */ WidgetPreviewInfo copy$default(WidgetPreviewInfo widgetPreviewInfo, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = widgetPreviewInfo.picAspectRatio;
        }
        if ((i2 & 2) != 0) {
            str2 = widgetPreviewInfo.suitPreviewSize;
        }
        if ((i2 & 4) != 0) {
            str3 = widgetPreviewInfo.picUrl;
        }
        return widgetPreviewInfo.copy(str, str2, str3);
    }

    @InterfaceC7396q
    public final String component1() {
        return this.picAspectRatio;
    }

    @InterfaceC7396q
    public final String component2() {
        return this.suitPreviewSize;
    }

    @InterfaceC7396q
    public final String component3() {
        return this.picUrl;
    }

    @InterfaceC7396q
    public final WidgetPreviewInfo copy(@InterfaceC7396q String picAspectRatio, @InterfaceC7396q String suitPreviewSize, @InterfaceC7396q String picUrl) {
        d2ok.m23075h(picAspectRatio, "picAspectRatio");
        d2ok.m23075h(suitPreviewSize, "suitPreviewSize");
        d2ok.m23075h(picUrl, "picUrl");
        return new WidgetPreviewInfo(picAspectRatio, suitPreviewSize, picUrl);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetPreviewInfo)) {
            return false;
        }
        WidgetPreviewInfo widgetPreviewInfo = (WidgetPreviewInfo) obj;
        return d2ok.f7l8(this.picAspectRatio, widgetPreviewInfo.picAspectRatio) && d2ok.f7l8(this.suitPreviewSize, widgetPreviewInfo.suitPreviewSize) && d2ok.f7l8(this.picUrl, widgetPreviewInfo.picUrl);
    }

    @InterfaceC7396q
    public final String getPicAspectRatio() {
        return this.picAspectRatio;
    }

    @InterfaceC7396q
    public final String getPicUrl() {
        return this.picUrl;
    }

    @InterfaceC7396q
    public final String getSuitPreviewSize() {
        return this.suitPreviewSize;
    }

    public int hashCode() {
        return (((this.picAspectRatio.hashCode() * 31) + this.suitPreviewSize.hashCode()) * 31) + this.picUrl.hashCode();
    }

    @InterfaceC7396q
    public String toString() {
        return "WidgetPreviewInfo(picAspectRatio=" + this.picAspectRatio + ", suitPreviewSize=" + this.suitPreviewSize + ", picUrl=" + this.picUrl + ')';
    }
}
