package com.miui.maml.widget.edit;

import java.util.Map;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditVarConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/miui/maml/widget/edit/OnOffConfig;", "Lcom/miui/maml/widget/edit/BaseConfig;", "name", "", "title", "localeMap", "", "defaultOn", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "getDefaultOn", "()Z", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class OnOffConfig extends BaseConfig {
    private final boolean defaultOn;

    public /* synthetic */ OnOffConfig(String str, String str2, Map map, boolean z2, int i2, ni7 ni7Var) {
        this(str, str2, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? true : z2);
    }

    public final boolean getDefaultOn() {
        return this.defaultOn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnOffConfig(@InterfaceC7396q String name, @InterfaceC7395n String str, @InterfaceC7395n Map<String, String> map, boolean z2) {
        super(name, str, map);
        d2ok.m23075h(name, "name");
        this.defaultOn = z2;
    }
}
