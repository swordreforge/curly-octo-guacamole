package com.miui.maml.data;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public class BatteryVariableUpdater extends NotifierVariableUpdater {
    public static final String USE_TAG = "Battery";
    private IndexedVariable mBatteryLevel;
    private int mLevel;

    public BatteryVariableUpdater(VariableUpdaterManager variableUpdaterManager) {
        super(variableUpdaterManager, "android.intent.action.BATTERY_CHANGED");
        this.mBatteryLevel = new IndexedVariable(VariableNames.BATTERY_LEVEL, getRoot().getContext().mVariables, true);
    }

    @Override // com.miui.maml.data.NotifierVariableUpdater, com.miui.maml.NotifierManager.OnNotifyListener
    public void onNotify(Context context, Intent intent, Object obj) {
        int intExtra;
        if (!intent.getAction().equals("android.intent.action.BATTERY_CHANGED") || (intExtra = intent.getIntExtra("level", -1)) == -1 || this.mLevel == intExtra) {
            return;
        }
        this.mBatteryLevel.set(intExtra >= 100 ? 100.0d : intExtra);
        this.mLevel = intExtra;
        getRoot().requestUpdate();
    }
}
