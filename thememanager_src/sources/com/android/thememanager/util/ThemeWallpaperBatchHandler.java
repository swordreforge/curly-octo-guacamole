package com.android.thememanager.util;

import android.util.Pair;
import com.android.thememanager.activity.nsb;
import com.android.thememanager.activity.pc;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeWallpaperBatchHandler extends ThemeBatchResourceHandler {

    /* JADX INFO: renamed from: e */
    private nsb f16306e;

    public ThemeWallpaperBatchHandler(nsb fragment, pc adapter, com.android.thememanager.fu4 resContext) {
        super(fragment, adapter, resContext);
        this.f16306e = fragment;
    }

    @Override // com.android.thememanager.util.BatchResourceHandler
    protected void lvui(Pair<Integer, Integer> position) {
        this.f16306e.qh4d(position);
    }
}
