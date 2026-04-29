package com.miui.maml.data;

import com.miui.maml.ScreenContext;
import com.miui.maml.ScreenElementRoot;

/* JADX INFO: loaded from: classes3.dex */
public class VariableUpdater {
    private VariableUpdaterManager mVariableUpdaterManager;

    public VariableUpdater(VariableUpdaterManager variableUpdaterManager) {
        this.mVariableUpdaterManager = variableUpdaterManager;
    }

    public void finish() {
    }

    protected final ScreenContext getContext() {
        return getRoot().getContext();
    }

    protected final ScreenElementRoot getRoot() {
        return this.mVariableUpdaterManager.getRoot();
    }

    public void init() {
    }

    public void pause() {
    }

    public void resume() {
    }

    public void tick(long j2) {
    }
}
