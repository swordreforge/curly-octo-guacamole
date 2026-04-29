package com.miui.maml.data;

import android.content.Context;
import android.content.Intent;
import com.miui.maml.NotifierManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NotifierVariableUpdater extends VariableUpdater implements NotifierManager.OnNotifyListener {
    protected NotifierManager mNotifierManager;
    private String mType;

    public NotifierVariableUpdater(VariableUpdaterManager variableUpdaterManager, String str) {
        super(variableUpdaterManager);
        this.mType = str;
        this.mNotifierManager = NotifierManager.getInstance(getContext().mContext);
    }

    @Override // com.miui.maml.data.VariableUpdater
    public void finish() {
        this.mNotifierManager.releaseNotifier(this.mType, this);
    }

    @Override // com.miui.maml.data.VariableUpdater
    public void init() {
        this.mNotifierManager.acquireNotifier(this.mType, this);
    }

    public abstract void onNotify(Context context, Intent intent, Object obj);

    @Override // com.miui.maml.data.VariableUpdater
    public void pause() {
        this.mNotifierManager.pause(this.mType, this);
    }

    @Override // com.miui.maml.data.VariableUpdater
    public void resume() {
        this.mNotifierManager.resume(this.mType, this);
    }
}
