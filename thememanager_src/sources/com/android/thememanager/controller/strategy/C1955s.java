package com.android.thememanager.controller.strategy;

import java.util.UUID;

/* JADX INFO: renamed from: com.android.thememanager.controller.strategy.s */
/* JADX INFO: compiled from: UniqueIdGenerationStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1955s extends zy {
    @Override // com.android.thememanager.controller.strategy.zy
    /* JADX INFO: renamed from: k */
    public synchronized String mo7689k() {
        return UUID.randomUUID().toString();
    }
}
