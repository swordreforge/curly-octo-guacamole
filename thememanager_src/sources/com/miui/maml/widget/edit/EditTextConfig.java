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
@d3(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/miui/maml/widget/edit/EditTextConfig;", "Lcom/miui/maml/widget/edit/BaseConfig;", "n", "", "t", "localeMap", "", "valueList", "", "editable", "", "minLength", "", "maxLength", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;ZII)V", "getEditable", "()Z", "getMaxLength", "()I", "getMinLength", "getValueList", "()Ljava/util/List;", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class EditTextConfig extends BaseConfig {
    private final boolean editable;
    private final int maxLength;
    private final int minLength;

    @InterfaceC7396q
    private final List<String> valueList;

    public /* synthetic */ EditTextConfig(String str, String str2, Map map, List list, boolean z2, int i2, int i3, int i4, ni7 ni7Var) {
        this(str, str2, (i4 & 4) != 0 ? null : map, list, z2, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3);
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final int getMinLength() {
        return this.minLength;
    }

    @InterfaceC7396q
    public final List<String> getValueList() {
        return this.valueList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextConfig(@InterfaceC7396q String n2, @InterfaceC7395n String str, @InterfaceC7395n Map<String, String> map, @InterfaceC7396q List<String> valueList, boolean z2, int i2, int i3) {
        super(n2, str, map);
        d2ok.m23075h(n2, "n");
        d2ok.m23075h(valueList, "valueList");
        this.valueList = valueList;
        this.editable = z2;
        this.minLength = i2;
        this.maxLength = i3;
    }
}
