package com.miui.maml.widget.edit;

import com.google.gson.C4871g;
import com.miui.maml.component.MamlView;
import java.util.concurrent.Executor;
import kotlin.d3;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditSave.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {1, 0, 3}, d1 = {"com/miui/maml/widget/edit/WidgetEditSave__WidgetEditSaveKt"}, m22787k = 4, mv = {1, 4, 2})
public final class WidgetEditSave {

    @InterfaceC7396q
    public static final String COMMAND_REFRESH_AFTER_EDIT = "refresh_after_edit";

    @InterfaceC7395n
    public static final String getLocalId(@InterfaceC7396q MamlView mamlView) {
        return WidgetEditSave__WidgetEditSaveKt.getLocalId(mamlView);
    }

    public static final void restore(@InterfaceC7396q ColorGroupSaveConfig colorGroupSaveConfig, @InterfaceC7396q MamlView mamlView) {
        WidgetEditSave__WidgetEditSaveKt.restore(colorGroupSaveConfig, mamlView);
    }

    @InterfaceC6768s
    public static final void restoreFromConfigPath(@InterfaceC7396q MamlView mamlView, @InterfaceC7396q String str) {
        WidgetEditSave__WidgetEditSaveKt.restoreFromConfigPath$default(mamlView, str, null, null, 6, null);
    }

    @InterfaceC6768s
    public static final void restoreFromConfigPath(@InterfaceC7396q MamlView mamlView, @InterfaceC7396q String str, @InterfaceC7396q C4871g c4871g) {
        WidgetEditSave__WidgetEditSaveKt.restoreFromConfigPath$default(mamlView, str, c4871g, null, 4, null);
    }

    @InterfaceC6768s
    public static final void restoreFromConfigPath(@InterfaceC7396q MamlView mamlView, @InterfaceC7396q String str, @InterfaceC7396q C4871g c4871g, @InterfaceC7395n Executor executor) {
        WidgetEditSave__WidgetEditSaveKt.restoreFromConfigPath(mamlView, str, c4871g, executor);
    }

    public static final void restoreMamlView(@InterfaceC7396q OneConfig oneConfig, @InterfaceC7396q MamlView mamlView) {
        WidgetEditSave__WidgetEditSaveKt.restoreMamlView(oneConfig, mamlView);
    }

    public static final void setInPreviewMode(@InterfaceC7396q MamlView mamlView, @InterfaceC7395n Boolean bool) {
        WidgetEditSave__WidgetEditSaveKt.setInPreviewMode(mamlView, bool);
    }

    public static final void setLocalId(@InterfaceC7396q MamlView mamlView, @InterfaceC7395n String str) {
        WidgetEditSave__WidgetEditSaveKt.setLocalId(mamlView, str);
    }
}
