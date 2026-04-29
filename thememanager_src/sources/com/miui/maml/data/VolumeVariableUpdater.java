package com.miui.maml.data;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public class VolumeVariableUpdater extends NotifierVariableUpdater {
    public static final String EXTRA_PREV_VOLUME_STREAM_VALUE = "android.media.EXTRA_PREV_VOLUME_STREAM_VALUE";
    public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
    private static final int SHOW_DELAY_TIME = 1000;
    public static final String VAR_VOLUME_LEVEL = "volume_level";
    public static final String VAR_VOLUME_LEVEL_OLD = "volume_level_old";
    public static final String VAR_VOLUME_TYPE = "volume_type";
    public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private Handler mHandler;
    private final Runnable mResetType;
    private IndexedVariable mVolumeLevel;
    private IndexedVariable mVolumeLevelOld;
    private IndexedVariable mVolumeType;

    public VolumeVariableUpdater(VariableUpdaterManager variableUpdaterManager) {
        super(variableUpdaterManager, VOLUME_CHANGED_ACTION);
        this.mResetType = new Runnable() { // from class: com.miui.maml.data.VolumeVariableUpdater.1
            @Override // java.lang.Runnable
            public void run() {
                VolumeVariableUpdater.this.mVolumeType.set(-1.0d);
            }
        };
        this.mHandler = new Handler();
        this.mVolumeLevel = new IndexedVariable(VAR_VOLUME_LEVEL, getContext().mVariables, true);
        this.mVolumeLevelOld = new IndexedVariable(VAR_VOLUME_LEVEL_OLD, getContext().mVariables, true);
        IndexedVariable indexedVariable = new IndexedVariable(VAR_VOLUME_TYPE, getContext().mVariables, true);
        this.mVolumeType = indexedVariable;
        indexedVariable.set(-1.0d);
    }

    @Override // com.miui.maml.data.NotifierVariableUpdater, com.miui.maml.NotifierManager.OnNotifyListener
    public void onNotify(Context context, Intent intent, Object obj) {
        if (intent.getAction().equals(VOLUME_CHANGED_ACTION)) {
            this.mVolumeType.set(intent.getIntExtra(EXTRA_VOLUME_STREAM_TYPE, -1));
            int intExtra = intent.getIntExtra(EXTRA_VOLUME_STREAM_VALUE, 0);
            this.mVolumeLevel.set(intExtra);
            int intExtra2 = intent.getIntExtra(EXTRA_PREV_VOLUME_STREAM_VALUE, 0);
            if (intExtra2 != intExtra) {
                this.mVolumeLevelOld.set(intExtra2);
            }
            getRoot().requestUpdate();
            this.mHandler.removeCallbacks(this.mResetType);
            this.mHandler.postDelayed(this.mResetType, 1000L);
        }
    }
}
