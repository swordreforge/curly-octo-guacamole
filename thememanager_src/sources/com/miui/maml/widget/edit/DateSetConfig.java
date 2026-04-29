package com.miui.maml.widget.edit;

import java.util.Map;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditVarConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/miui/maml/widget/edit/DateSetConfig;", "Lcom/miui/maml/widget/edit/BaseConfig;", "name", "", "title", "localeMap", "", "defaultValue", "", "repeatName", "repeat", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JLjava/lang/String;I)V", "getDefaultValue", "()J", "getRepeat", "()I", "setRepeat", "(I)V", "getRepeatName", "()Ljava/lang/String;", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class DateSetConfig extends BaseConfig {
    private final long defaultValue;
    private int repeat;

    @InterfaceC7395n
    private final String repeatName;

    public /* synthetic */ DateSetConfig(String str, String str2, Map map, long j2, String str3, int i2, int i3, ni7 ni7Var) {
        this(str, str2, (i3 & 4) != 0 ? null : map, j2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? 0 : i2);
    }

    public final long getDefaultValue() {
        return this.defaultValue;
    }

    public final int getRepeat() {
        return this.repeat;
    }

    @InterfaceC7395n
    public final String getRepeatName() {
        return this.repeatName;
    }

    public final void setRepeat(int i2) {
        this.repeat = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateSetConfig(@InterfaceC7396q String name, @InterfaceC7395n String str, @InterfaceC7395n Map<String, String> map, long j2, @InterfaceC7395n String str2, int i2) {
        super(name, str, map);
        d2ok.m23075h(name, "name");
        this.defaultValue = j2;
        this.repeatName = str2;
        this.repeat = i2;
    }
}
