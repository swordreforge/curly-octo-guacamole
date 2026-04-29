package com.miui.maml.widget.edit;

import com.android.thememanager.controller.online.InterfaceC1925p;
import java.util.List;
import java.util.Map;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditVarConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0002\u0010\u000eR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/miui/maml/widget/edit/ImageSelectConfig;", "Lcom/miui/maml/widget/edit/BaseConfig;", "name", "", "title", "localeMap", "", "values", "", "subtitleList", "width", "", InterfaceC1925p.byf, "uiType", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;III)V", "getHeight", "()I", "getSubtitleList", "()Ljava/util/List;", "getUiType", "getValues", "getWidth", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class ImageSelectConfig extends BaseConfig {
    private final int height;

    @InterfaceC7395n
    private final List<String> subtitleList;
    private final int uiType;

    @InterfaceC7396q
    private final List<String> values;
    private final int width;

    public /* synthetic */ ImageSelectConfig(String str, String str2, Map map, List list, List list2, int i2, int i3, int i4, int i5, ni7 ni7Var) {
        this(str, str2, (i5 & 4) != 0 ? null : map, list, list2, i2, i3, i4);
    }

    public final int getHeight() {
        return this.height;
    }

    @InterfaceC7395n
    public final List<String> getSubtitleList() {
        return this.subtitleList;
    }

    public final int getUiType() {
        return this.uiType;
    }

    @InterfaceC7396q
    public final List<String> getValues() {
        return this.values;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSelectConfig(@InterfaceC7396q String name, @InterfaceC7395n String str, @InterfaceC7395n Map<String, String> map, @InterfaceC7396q List<String> values, @InterfaceC7395n List<String> list, int i2, int i3, int i4) {
        super(name, str, map);
        d2ok.m23075h(name, "name");
        d2ok.m23075h(values, "values");
        this.values = values;
        this.subtitleList = list;
        this.width = i2;
        this.height = i3;
        this.uiType = i4;
    }
}
