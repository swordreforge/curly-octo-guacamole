package com.miui.maml.widget.edit;

import androidx.annotation.Keep;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import java.util.Map;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditSave.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000J\u0017\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005HÆ\u0003JË\u0001\u0010\u001d\u001a\u00020\u00002\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00052\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00052\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005HÆ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010 \u001a\u00020\u00122\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R2\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010!\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010!\u001a\u0004\b/\u0010#\"\u0004\b0\u0010%R0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010!\u001a\u0004\b1\u0010#\"\u0004\b2\u0010%R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010!\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%R$\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010!\u001a\u0004\b:\u0010#\"\u0004\b;\u0010%¨\u0006>"}, d2 = {"Lcom/miui/maml/widget/edit/OneConfig;", "", C2690k.k.f61039ld6, "Lkotlin/was;", "set", "", "", "component1", "component2", "Lcom/miui/maml/widget/edit/ColorGroupSaveConfig;", "component3", "", "component4", "component5", "component6", "component7", "Lcom/miui/maml/widget/edit/DateSetSaveConfig;", "component8", "", "component9", "textConfig", "colorConfig", "colorGroupConfig", "textSizeConfig", "alignStyleConfig", "textFontConfig", "imageConfig", "dateSetConfig", "onOffConfig", "copy", "toString", "hashCode", "equals", "Ljava/util/Map;", "getTextConfig", "()Ljava/util/Map;", "setTextConfig", "(Ljava/util/Map;)V", "getColorConfig", "setColorConfig", "Lcom/miui/maml/widget/edit/ColorGroupSaveConfig;", "getColorGroupConfig", "()Lcom/miui/maml/widget/edit/ColorGroupSaveConfig;", "setColorGroupConfig", "(Lcom/miui/maml/widget/edit/ColorGroupSaveConfig;)V", "getTextSizeConfig", "setTextSizeConfig", "getAlignStyleConfig", "setAlignStyleConfig", "getTextFontConfig", "setTextFontConfig", "getImageConfig", "setImageConfig", "Lcom/miui/maml/widget/edit/DateSetSaveConfig;", "getDateSetConfig", "()Lcom/miui/maml/widget/edit/DateSetSaveConfig;", "setDateSetConfig", "(Lcom/miui/maml/widget/edit/DateSetSaveConfig;)V", "getOnOffConfig", "setOnOffConfig", C4991s.f28129n, "(Ljava/util/Map;Ljava/util/Map;Lcom/miui/maml/widget/edit/ColorGroupSaveConfig;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/miui/maml/widget/edit/DateSetSaveConfig;Ljava/util/Map;)V", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
@Keep
public final class OneConfig {

    @InterfaceC7395n
    private Map<String, Integer> alignStyleConfig;

    @InterfaceC7395n
    private Map<String, String> colorConfig;

    @InterfaceC7395n
    private ColorGroupSaveConfig colorGroupConfig;

    @InterfaceC7395n
    private DateSetSaveConfig dateSetConfig;

    @InterfaceC7395n
    private Map<String, String> imageConfig;

    @InterfaceC7395n
    private Map<String, Boolean> onOffConfig;

    @InterfaceC7395n
    private Map<String, String> textConfig;

    @InterfaceC7395n
    private Map<String, String> textFontConfig;

    @InterfaceC7395n
    private Map<String, Integer> textSizeConfig;

    public OneConfig() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public OneConfig(@InterfaceC7395n Map<String, String> map, @InterfaceC7395n Map<String, String> map2, @InterfaceC7395n ColorGroupSaveConfig colorGroupSaveConfig, @InterfaceC7395n Map<String, Integer> map3, @InterfaceC7395n Map<String, Integer> map4, @InterfaceC7395n Map<String, String> map5, @InterfaceC7395n Map<String, String> map6, @InterfaceC7395n DateSetSaveConfig dateSetSaveConfig, @InterfaceC7395n Map<String, Boolean> map7) {
        this.textConfig = map;
        this.colorConfig = map2;
        this.colorGroupConfig = colorGroupSaveConfig;
        this.textSizeConfig = map3;
        this.alignStyleConfig = map4;
        this.textFontConfig = map5;
        this.imageConfig = map6;
        this.dateSetConfig = dateSetSaveConfig;
        this.onOffConfig = map7;
    }

    @InterfaceC7395n
    public final Map<String, String> component1() {
        return this.textConfig;
    }

    @InterfaceC7395n
    public final Map<String, String> component2() {
        return this.colorConfig;
    }

    @InterfaceC7395n
    public final ColorGroupSaveConfig component3() {
        return this.colorGroupConfig;
    }

    @InterfaceC7395n
    public final Map<String, Integer> component4() {
        return this.textSizeConfig;
    }

    @InterfaceC7395n
    public final Map<String, Integer> component5() {
        return this.alignStyleConfig;
    }

    @InterfaceC7395n
    public final Map<String, String> component6() {
        return this.textFontConfig;
    }

    @InterfaceC7395n
    public final Map<String, String> component7() {
        return this.imageConfig;
    }

    @InterfaceC7395n
    public final DateSetSaveConfig component8() {
        return this.dateSetConfig;
    }

    @InterfaceC7395n
    public final Map<String, Boolean> component9() {
        return this.onOffConfig;
    }

    @InterfaceC7396q
    public final OneConfig copy(@InterfaceC7395n Map<String, String> map, @InterfaceC7395n Map<String, String> map2, @InterfaceC7395n ColorGroupSaveConfig colorGroupSaveConfig, @InterfaceC7395n Map<String, Integer> map3, @InterfaceC7395n Map<String, Integer> map4, @InterfaceC7395n Map<String, String> map5, @InterfaceC7395n Map<String, String> map6, @InterfaceC7395n DateSetSaveConfig dateSetSaveConfig, @InterfaceC7395n Map<String, Boolean> map7) {
        return new OneConfig(map, map2, colorGroupSaveConfig, map3, map4, map5, map6, dateSetSaveConfig, map7);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneConfig)) {
            return false;
        }
        OneConfig oneConfig = (OneConfig) obj;
        return d2ok.f7l8(this.textConfig, oneConfig.textConfig) && d2ok.f7l8(this.colorConfig, oneConfig.colorConfig) && d2ok.f7l8(this.colorGroupConfig, oneConfig.colorGroupConfig) && d2ok.f7l8(this.textSizeConfig, oneConfig.textSizeConfig) && d2ok.f7l8(this.alignStyleConfig, oneConfig.alignStyleConfig) && d2ok.f7l8(this.textFontConfig, oneConfig.textFontConfig) && d2ok.f7l8(this.imageConfig, oneConfig.imageConfig) && d2ok.f7l8(this.dateSetConfig, oneConfig.dateSetConfig) && d2ok.f7l8(this.onOffConfig, oneConfig.onOffConfig);
    }

    @InterfaceC7395n
    public final Map<String, Integer> getAlignStyleConfig() {
        return this.alignStyleConfig;
    }

    @InterfaceC7395n
    public final Map<String, String> getColorConfig() {
        return this.colorConfig;
    }

    @InterfaceC7395n
    public final ColorGroupSaveConfig getColorGroupConfig() {
        return this.colorGroupConfig;
    }

    @InterfaceC7395n
    public final DateSetSaveConfig getDateSetConfig() {
        return this.dateSetConfig;
    }

    @InterfaceC7395n
    public final Map<String, String> getImageConfig() {
        return this.imageConfig;
    }

    @InterfaceC7395n
    public final Map<String, Boolean> getOnOffConfig() {
        return this.onOffConfig;
    }

    @InterfaceC7395n
    public final Map<String, String> getTextConfig() {
        return this.textConfig;
    }

    @InterfaceC7395n
    public final Map<String, String> getTextFontConfig() {
        return this.textFontConfig;
    }

    @InterfaceC7395n
    public final Map<String, Integer> getTextSizeConfig() {
        return this.textSizeConfig;
    }

    public int hashCode() {
        Map<String, String> map = this.textConfig;
        int iHashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, String> map2 = this.colorConfig;
        int iHashCode2 = (iHashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        ColorGroupSaveConfig colorGroupSaveConfig = this.colorGroupConfig;
        int iHashCode3 = (iHashCode2 + (colorGroupSaveConfig != null ? colorGroupSaveConfig.hashCode() : 0)) * 31;
        Map<String, Integer> map3 = this.textSizeConfig;
        int iHashCode4 = (iHashCode3 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, Integer> map4 = this.alignStyleConfig;
        int iHashCode5 = (iHashCode4 + (map4 != null ? map4.hashCode() : 0)) * 31;
        Map<String, String> map5 = this.textFontConfig;
        int iHashCode6 = (iHashCode5 + (map5 != null ? map5.hashCode() : 0)) * 31;
        Map<String, String> map6 = this.imageConfig;
        int iHashCode7 = (iHashCode6 + (map6 != null ? map6.hashCode() : 0)) * 31;
        DateSetSaveConfig dateSetSaveConfig = this.dateSetConfig;
        int iHashCode8 = (iHashCode7 + (dateSetSaveConfig != null ? dateSetSaveConfig.hashCode() : 0)) * 31;
        Map<String, Boolean> map7 = this.onOffConfig;
        return iHashCode8 + (map7 != null ? map7.hashCode() : 0);
    }

    public final void set(@InterfaceC7395n OneConfig oneConfig) {
        this.textConfig = oneConfig != null ? oneConfig.textConfig : null;
        this.colorConfig = oneConfig != null ? oneConfig.colorConfig : null;
        this.colorGroupConfig = oneConfig != null ? oneConfig.colorGroupConfig : null;
        this.textSizeConfig = oneConfig != null ? oneConfig.textSizeConfig : null;
        this.alignStyleConfig = oneConfig != null ? oneConfig.alignStyleConfig : null;
        this.textFontConfig = oneConfig != null ? oneConfig.textFontConfig : null;
        this.imageConfig = oneConfig != null ? oneConfig.imageConfig : null;
        this.dateSetConfig = oneConfig != null ? oneConfig.dateSetConfig : null;
        this.onOffConfig = oneConfig != null ? oneConfig.onOffConfig : null;
    }

    public final void setAlignStyleConfig(@InterfaceC7395n Map<String, Integer> map) {
        this.alignStyleConfig = map;
    }

    public final void setColorConfig(@InterfaceC7395n Map<String, String> map) {
        this.colorConfig = map;
    }

    public final void setColorGroupConfig(@InterfaceC7395n ColorGroupSaveConfig colorGroupSaveConfig) {
        this.colorGroupConfig = colorGroupSaveConfig;
    }

    public final void setDateSetConfig(@InterfaceC7395n DateSetSaveConfig dateSetSaveConfig) {
        this.dateSetConfig = dateSetSaveConfig;
    }

    public final void setImageConfig(@InterfaceC7395n Map<String, String> map) {
        this.imageConfig = map;
    }

    public final void setOnOffConfig(@InterfaceC7395n Map<String, Boolean> map) {
        this.onOffConfig = map;
    }

    public final void setTextConfig(@InterfaceC7395n Map<String, String> map) {
        this.textConfig = map;
    }

    public final void setTextFontConfig(@InterfaceC7395n Map<String, String> map) {
        this.textFontConfig = map;
    }

    public final void setTextSizeConfig(@InterfaceC7395n Map<String, Integer> map) {
        this.textSizeConfig = map;
    }

    @InterfaceC7396q
    public String toString() {
        return "OneConfig(textConfig=" + this.textConfig + ", colorConfig=" + this.colorConfig + ", colorGroupConfig=" + this.colorGroupConfig + ", textSizeConfig=" + this.textSizeConfig + ", alignStyleConfig=" + this.alignStyleConfig + ", textFontConfig=" + this.textFontConfig + ", imageConfig=" + this.imageConfig + ", dateSetConfig=" + this.dateSetConfig + ", onOffConfig=" + this.onOffConfig + ")";
    }

    public /* synthetic */ OneConfig(Map map, Map map2, ColorGroupSaveConfig colorGroupSaveConfig, Map map3, Map map4, Map map5, Map map6, DateSetSaveConfig dateSetSaveConfig, Map map7, int i2, ni7 ni7Var) {
        this((i2 & 1) != 0 ? null : map, (i2 & 2) != 0 ? null : map2, (i2 & 4) != 0 ? null : colorGroupSaveConfig, (i2 & 8) != 0 ? null : map3, (i2 & 16) != 0 ? null : map4, (i2 & 32) != 0 ? null : map5, (i2 & 64) != 0 ? null : map6, (i2 & 128) != 0 ? null : dateSetSaveConfig, (i2 & 256) == 0 ? map7 : null);
    }
}
