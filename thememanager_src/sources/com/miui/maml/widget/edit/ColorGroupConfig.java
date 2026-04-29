package com.miui.maml.widget.edit;

import java.util.List;
import java.util.Map;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditVarConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/miui/maml/widget/edit/ColorGroupConfig;", "Lcom/miui/maml/widget/edit/BaseConfig;", "n", "", "t", "localeMap", "", "uiType", "", "colors", "", "Lcom/miui/maml/widget/edit/ColorConfig;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/util/List;)V", "getColors", "()Ljava/util/List;", "getUiType", "()I", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class ColorGroupConfig extends BaseConfig {

    @InterfaceC7396q
    private final List<ColorConfig> colors;
    private final int uiType;

    public /* synthetic */ ColorGroupConfig(String str, String str2, Map map, int i2, List list, int i3, ni7 ni7Var) {
        this(str, str2, (i3 & 4) != 0 ? null : map, i2, list);
    }

    @InterfaceC7396q
    public final List<ColorConfig> getColors() {
        return this.colors;
    }

    public final int getUiType() {
        return this.uiType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorGroupConfig(@InterfaceC7396q String n2, @InterfaceC7395n String str, @InterfaceC7395n Map<String, String> map, int i2, @InterfaceC7396q List<ColorConfig> colors) {
        super(n2, str, map);
        d2ok.m23075h(n2, "n");
        d2ok.m23075h(colors, "colors");
        this.uiType = i2;
        this.colors = colors;
    }
}
