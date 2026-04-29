package com.miui.maml.widget.edit;

import java.util.Map;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditVarConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/miui/maml/widget/edit/TextSizeConfig;", "Lcom/miui/maml/widget/edit/BaseConfig;", "n", "", "t", "localeMap", "", "def", "", "from", "to", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;III)V", "getDef", "()I", "getFrom", "getTo", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class TextSizeConfig extends BaseConfig {
    private final int def;
    private final int from;
    private final int to;

    public /* synthetic */ TextSizeConfig(String str, String str2, Map map, int i2, int i3, int i4, int i5, ni7 ni7Var) {
        this(str, str2, (i5 & 4) != 0 ? null : map, i2, i3, i4);
    }

    public final int getDef() {
        return this.def;
    }

    public final int getFrom() {
        return this.from;
    }

    public final int getTo() {
        return this.to;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSizeConfig(@InterfaceC7396q String n2, @InterfaceC7395n String str, @InterfaceC7395n Map<String, String> map, int i2, int i3, int i4) {
        super(n2, str, map);
        d2ok.m23075h(n2, "n");
        this.def = i2;
        this.from = i3;
        this.to = i4;
    }
}
