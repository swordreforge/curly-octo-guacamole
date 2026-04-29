package com.miui.maml.data;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import com.miui.maml.NotifierManager;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigChangeVariableUpdater extends NotifierVariableUpdater {
    public ConfigChangeVariableUpdater(VariableUpdaterManager variableUpdaterManager) {
        super(variableUpdaterManager, NotifierManager.TYPE_CONFIG_CHANGE);
    }

    @Override // com.miui.maml.data.NotifierVariableUpdater, com.miui.maml.NotifierManager.OnNotifyListener
    public void onNotify(Context context, Intent intent, Object obj) {
        if (obj instanceof Configuration) {
            getRoot().onConfigurationChanged((Configuration) obj);
        }
    }
}
