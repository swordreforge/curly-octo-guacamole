package com.miui.maml.widget.edit;

import androidx.annotation.Keep;
import com.android.thememanager.settingssearch.C2690k;
import java.util.Map;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditSave.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/miui/maml/widget/edit/ColorGroupSaveConfig;", "", "name", "", "selectColors", "", "index", "", "(Ljava/lang/String;Ljava/util/Map;I)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "getSelectColors", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", C2690k.k.f61039ld6, "hashCode", "toString", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
@Keep
public final class ColorGroupSaveConfig {
    private final int index;

    @InterfaceC7396q
    private final String name;

    @InterfaceC7396q
    private final Map<String, String> selectColors;

    public ColorGroupSaveConfig(@InterfaceC7396q String name, @InterfaceC7396q Map<String, String> selectColors, int i2) {
        d2ok.m23075h(name, "name");
        d2ok.m23075h(selectColors, "selectColors");
        this.name = name;
        this.selectColors = selectColors;
        this.index = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColorGroupSaveConfig copy$default(ColorGroupSaveConfig colorGroupSaveConfig, String str, Map map, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = colorGroupSaveConfig.name;
        }
        if ((i3 & 2) != 0) {
            map = colorGroupSaveConfig.selectColors;
        }
        if ((i3 & 4) != 0) {
            i2 = colorGroupSaveConfig.index;
        }
        return colorGroupSaveConfig.copy(str, map, i2);
    }

    @InterfaceC7396q
    public final String component1() {
        return this.name;
    }

    @InterfaceC7396q
    public final Map<String, String> component2() {
        return this.selectColors;
    }

    public final int component3() {
        return this.index;
    }

    @InterfaceC7396q
    public final ColorGroupSaveConfig copy(@InterfaceC7396q String name, @InterfaceC7396q Map<String, String> selectColors, int i2) {
        d2ok.m23075h(name, "name");
        d2ok.m23075h(selectColors, "selectColors");
        return new ColorGroupSaveConfig(name, selectColors, i2);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorGroupSaveConfig)) {
            return false;
        }
        ColorGroupSaveConfig colorGroupSaveConfig = (ColorGroupSaveConfig) obj;
        return d2ok.f7l8(this.name, colorGroupSaveConfig.name) && d2ok.f7l8(this.selectColors, colorGroupSaveConfig.selectColors) && this.index == colorGroupSaveConfig.index;
    }

    public final int getIndex() {
        return this.index;
    }

    @InterfaceC7396q
    public final String getName() {
        return this.name;
    }

    @InterfaceC7396q
    public final Map<String, String> getSelectColors() {
        return this.selectColors;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, String> map = this.selectColors;
        return ((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + Integer.hashCode(this.index);
    }

    @InterfaceC7396q
    public String toString() {
        return "ColorGroupSaveConfig(name=" + this.name + ", selectColors=" + this.selectColors + ", index=" + this.index + ")";
    }
}
