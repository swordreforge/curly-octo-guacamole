package com.miui.maml.widget.edit;

import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditVarConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/miui/maml/widget/edit/CustomEditLinkConfig;", "Lcom/miui/maml/widget/edit/BaseConfig;", "link", "", "current", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrent", "()Ljava/lang/String;", "setCurrent", "(Ljava/lang/String;)V", "getLink", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class CustomEditLinkConfig extends BaseConfig {

    @InterfaceC7396q
    private String current;

    @InterfaceC7396q
    private final String link;

    public /* synthetic */ CustomEditLinkConfig(String str, String str2, int i2, ni7 ni7Var) {
        this(str, (i2 & 2) != 0 ? "" : str2);
    }

    @InterfaceC7396q
    public final String getCurrent() {
        return this.current;
    }

    @InterfaceC7396q
    public final String getLink() {
        return this.link;
    }

    public final void setCurrent(@InterfaceC7396q String str) {
        d2ok.m23075h(str, "<set-?>");
        this.current = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEditLinkConfig(@InterfaceC7396q String link, @InterfaceC7396q String current) {
        super(MamlutilKt.CUSTOM_EDIT_LOCAL_ID, null, null, 4, null);
        d2ok.m23075h(link, "link");
        d2ok.m23075h(current, "current");
        this.link = link;
        this.current = current;
    }
}
