package com.miui.maml.widget.edit;

import java.util.Map;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditVarConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/miui/maml/widget/edit/BaseConfig;", "", "name", "", "displayTitle", "titleMap", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getDisplayTitle", "()Ljava/lang/String;", "getName", "getTitleMap", "()Ljava/util/Map;", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public class BaseConfig {

    @InterfaceC7395n
    private final String displayTitle;

    @InterfaceC7396q
    private final String name;

    @InterfaceC7395n
    private final Map<String, String> titleMap;

    public BaseConfig(@InterfaceC7396q String name, @InterfaceC7395n String str, @InterfaceC7395n Map<String, String> map) {
        d2ok.m23075h(name, "name");
        this.name = name;
        this.displayTitle = str;
        this.titleMap = map;
    }

    @InterfaceC7395n
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    @InterfaceC7396q
    public final String getName() {
        return this.name;
    }

    @InterfaceC7395n
    public final Map<String, String> getTitleMap() {
        return this.titleMap;
    }

    public /* synthetic */ BaseConfig(String str, String str2, Map map, int i2, ni7 ni7Var) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : map);
    }
}
