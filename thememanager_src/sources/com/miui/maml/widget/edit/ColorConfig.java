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
@d3(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/miui/maml/widget/edit/ColorConfig;", "Lcom/miui/maml/widget/edit/BaseConfig;", "n", "", "t", "localeMap", "", "values", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getValues", "()Ljava/util/List;", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class ColorConfig extends BaseConfig {

    @InterfaceC7396q
    private final List<String> values;

    public /* synthetic */ ColorConfig(String str, String str2, Map map, List list, int i2, ni7 ni7Var) {
        this(str, str2, (i2 & 4) != 0 ? null : map, list);
    }

    @InterfaceC7396q
    public final List<String> getValues() {
        return this.values;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorConfig(@InterfaceC7396q String n2, @InterfaceC7395n String str, @InterfaceC7395n Map<String, String> map, @InterfaceC7396q List<String> values) {
        super(n2, str, map);
        d2ok.m23075h(n2, "n");
        d2ok.m23075h(values, "values");
        this.values = values;
    }
}
