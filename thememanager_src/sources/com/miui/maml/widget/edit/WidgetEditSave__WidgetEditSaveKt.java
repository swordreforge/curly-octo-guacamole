package com.miui.maml.widget.edit;

import android.os.AsyncTask;
import android.util.Log;
import com.google.gson.C4871g;
import com.google.gson.zurt;
import com.miui.maml.component.MamlView;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.d3;
import kotlin.io.kja0;
import kotlin.jvm.internal.d2ok;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: widgetEditSave.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a*\u0010\u000b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007\u001a\u001b\u0010\u000e\u001a\u00020\u0003*\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0012\u0010\u0011\u001a\u00020\u0003*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001\",\u0010\u0017\u001a\u0004\u0018\u00010\u0005*\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/miui/maml/widget/edit/ColorGroupSaveConfig;", "Lcom/miui/maml/component/MamlView;", "mamlView", "Lkotlin/was;", "restore", "", MamlutilKt.LINK_ARG_CONFIG_PATH, "Lcom/google/gson/g;", "gson", "Ljava/util/concurrent/Executor;", "e", "restoreFromConfigPath", "", "preview", "setInPreviewMode", "(Lcom/miui/maml/component/MamlView;Ljava/lang/Boolean;)V", "Lcom/miui/maml/widget/edit/OneConfig;", "restoreMamlView", "value", "getLocalId", "(Lcom/miui/maml/component/MamlView;)Ljava/lang/String;", "setLocalId", "(Lcom/miui/maml/component/MamlView;Ljava/lang/String;)V", "localId", "COMMAND_REFRESH_AFTER_EDIT", "Ljava/lang/String;", "widget-edit_release"}, m22787k = 5, mv = {1, 4, 2}, xs = "com/miui/maml/widget/edit/WidgetEditSave")
final /* synthetic */ class WidgetEditSave__WidgetEditSaveKt {
    @InterfaceC7395n
    public static final String getLocalId(@InterfaceC7396q MamlView localId) {
        d2ok.m23075h(localId, "$this$localId");
        return localId.getVariableString(MamlutilKt.CUSTOM_EDIT_LOCAL_ID);
    }

    public static final void restore(@InterfaceC7396q ColorGroupSaveConfig restore, @InterfaceC7396q MamlView mamlView) {
        d2ok.m23075h(restore, "$this$restore");
        d2ok.m23075h(mamlView, "mamlView");
        for (Map.Entry<String, String> entry : restore.getSelectColors().entrySet()) {
            mamlView.putVariableString(entry.getKey(), entry.getValue(), 1);
        }
    }

    @InterfaceC6768s
    public static final void restoreFromConfigPath(@InterfaceC7396q MamlView mamlView, @InterfaceC7396q String str) {
        restoreFromConfigPath$default(mamlView, str, null, null, 6, null);
    }

    @InterfaceC6768s
    public static final void restoreFromConfigPath(@InterfaceC7396q MamlView mamlView, @InterfaceC7396q String str, @InterfaceC7396q C4871g c4871g) {
        restoreFromConfigPath$default(mamlView, str, c4871g, null, 4, null);
    }

    @InterfaceC6768s
    public static final void restoreFromConfigPath(@InterfaceC7396q final MamlView restoreFromConfigPath, @InterfaceC7396q final String configPath, @InterfaceC7396q final C4871g gson, @InterfaceC7395n Executor executor) {
        d2ok.m23075h(restoreFromConfigPath, "$this$restoreFromConfigPath");
        d2ok.m23075h(configPath, "configPath");
        d2ok.m23075h(gson, "gson");
        Runnable runnable = new Runnable() { // from class: com.miui.maml.widget.edit.WidgetEditSave__WidgetEditSaveKt$restoreFromConfigPath$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                File file = new File(configPath);
                if (file.exists()) {
                    final OneConfig oneConfig = null;
                    try {
                        oneConfig = (OneConfig) gson.n7h(kja0.o1t(file, null, 1, null), OneConfig.class);
                    } catch (zurt e2) {
                        Log.e(MamlutilKt.TAG, "restore fail." + e2 + ", invalid gson. " + gson);
                    }
                    restoreFromConfigPath.post(new Runnable() { // from class: com.miui.maml.widget.edit.WidgetEditSave__WidgetEditSaveKt$restoreFromConfigPath$runnable$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            OneConfig oneConfig2 = oneConfig;
                            if (oneConfig2 != null) {
                                WidgetEditSave.restoreMamlView(oneConfig2, restoreFromConfigPath);
                            }
                        }
                    });
                }
            }
        };
        if (executor != null) {
            executor.execute(runnable);
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        }
    }

    public static /* synthetic */ void restoreFromConfigPath$default(MamlView mamlView, String str, C4871g c4871g, Executor executor, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c4871g = MamlutilKt.getGSON_DEFAULT();
        }
        if ((i2 & 4) != 0) {
            executor = null;
        }
        WidgetEditSave.restoreFromConfigPath(mamlView, str, c4871g, executor);
    }

    public static final void restoreMamlView(@InterfaceC7396q OneConfig restoreMamlView, @InterfaceC7396q MamlView mamlView) {
        boolean z2;
        d2ok.m23075h(restoreMamlView, "$this$restoreMamlView");
        d2ok.m23075h(mamlView, "mamlView");
        Map<String, String> textConfig = restoreMamlView.getTextConfig();
        if (textConfig != null) {
            loop0: while (true) {
                for (Map.Entry<String, String> entry : textConfig.entrySet()) {
                    String variableString = mamlView.getVariableString(entry.getKey());
                    mamlView.putVariableString(entry.getKey(), entry.getValue(), 1);
                    z2 = z2 || (!d2ok.f7l8(variableString, entry.getValue()));
                }
            }
        } else {
            z2 = false;
        }
        Map<String, String> colorConfig = restoreMamlView.getColorConfig();
        if (colorConfig != null) {
            for (Map.Entry<String, String> entry2 : colorConfig.entrySet()) {
                String variableString2 = mamlView.getVariableString(entry2.getKey());
                mamlView.putVariableString(entry2.getKey(), entry2.getValue(), 1);
                z2 = z2 || (d2ok.f7l8(variableString2, entry2.getValue()) ^ true);
            }
        }
        Map<String, Integer> textSizeConfig = restoreMamlView.getTextSizeConfig();
        if (textSizeConfig != null) {
            for (Map.Entry<String, Integer> entry3 : textSizeConfig.entrySet()) {
                int variableNumber = (int) mamlView.getVariableNumber(entry3.getKey());
                mamlView.putVariableNumber(entry3.getKey(), entry3.getValue().intValue(), 1);
                z2 = z2 || variableNumber != entry3.getValue().intValue();
            }
        }
        Map<String, String> textFontConfig = restoreMamlView.getTextFontConfig();
        if (textFontConfig != null) {
            for (Map.Entry<String, String> entry4 : textFontConfig.entrySet()) {
                String variableString3 = mamlView.getVariableString(entry4.getKey());
                mamlView.putVariableString(entry4.getKey(), entry4.getValue(), 1);
                z2 = z2 || (d2ok.f7l8(variableString3, entry4.getValue()) ^ true);
            }
        }
        Map<String, Integer> alignStyleConfig = restoreMamlView.getAlignStyleConfig();
        if (alignStyleConfig != null) {
            for (Map.Entry<String, Integer> entry5 : alignStyleConfig.entrySet()) {
                int variableNumber2 = (int) mamlView.getVariableNumber(entry5.getKey());
                mamlView.putVariableNumber(entry5.getKey(), entry5.getValue().intValue(), 1);
                z2 = z2 || variableNumber2 != entry5.getValue().intValue();
            }
        }
        ColorGroupSaveConfig colorGroupConfig = restoreMamlView.getColorGroupConfig();
        if (colorGroupConfig != null) {
            WidgetEditSave.restore(colorGroupConfig, mamlView);
        }
        Map<String, String> imageConfig = restoreMamlView.getImageConfig();
        if (imageConfig != null) {
            for (Map.Entry<String, String> entry6 : imageConfig.entrySet()) {
                String variableString4 = mamlView.getVariableString(entry6.getKey());
                mamlView.putVariableString(entry6.getKey(), entry6.getValue(), 1);
                z2 = z2 || (d2ok.f7l8(variableString4, entry6.getValue()) ^ true);
            }
        }
        DateSetSaveConfig dateSetConfig = restoreMamlView.getDateSetConfig();
        boolean z3 = z2;
        if (dateSetConfig != null) {
            long variableNumber3 = (long) mamlView.getVariableNumber(dateSetConfig.getName());
            mamlView.putVariableNumber(dateSetConfig.getName(), dateSetConfig.getDate(), 1);
            boolean z5 = z2 || variableNumber3 != dateSetConfig.getDate();
            z3 = z5;
            if (dateSetConfig.getRepeatName() != null) {
                int variableNumber4 = (int) mamlView.getVariableNumber(dateSetConfig.getRepeatName());
                mamlView.putVariableNumber(dateSetConfig.getRepeatName(), dateSetConfig.getRepeatValue(), 1);
                z3 = z5 || variableNumber4 != dateSetConfig.getRepeatValue();
            }
        }
        Map<String, Boolean> onOffConfig = restoreMamlView.getOnOffConfig();
        if (onOffConfig != null) {
            for (Map.Entry<String, Boolean> entry7 : onOffConfig.entrySet()) {
                int variableNumber5 = (int) mamlView.getVariableNumber(entry7.getKey());
                boolean zBooleanValue = entry7.getValue().booleanValue();
                mamlView.putVariableNumber(entry7.getKey(), zBooleanValue ? 1.0d : 0.0d, 1);
                z3 = z3 || variableNumber5 != zBooleanValue;
            }
        }
        if (z3) {
            Log.i(MamlutilKt.TAG, "edit changed, send refresh_after_edit");
            mamlView.sendCommand(WidgetEditSave.COMMAND_REFRESH_AFTER_EDIT);
        }
    }

    public static final void setInPreviewMode(@InterfaceC7396q MamlView setInPreviewMode, @InterfaceC7395n Boolean bool) {
        d2ok.m23075h(setInPreviewMode, "$this$setInPreviewMode");
        setInPreviewMode.putVariableString(MamlutilKt.IN_PREVIEW_MODE, d2ok.f7l8(bool, Boolean.TRUE) ? "true" : "false", 1);
    }

    public static final void setLocalId(@InterfaceC7396q MamlView localId, @InterfaceC7395n String str) {
        d2ok.m23075h(localId, "$this$localId");
        localId.putVariableString(MamlutilKt.CUSTOM_EDIT_LOCAL_ID, str, 1);
    }
}
