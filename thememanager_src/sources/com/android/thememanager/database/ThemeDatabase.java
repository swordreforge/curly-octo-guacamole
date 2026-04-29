package com.android.thememanager.database;

import android.content.Context;
import androidx.room.AbstractC1141t;
import androidx.room.wvg;

/* JADX INFO: loaded from: classes2.dex */
@androidx.room.zy(entities = {C1960k.class}, exportSchema = false, version = 1)
public abstract class ThemeDatabase extends AbstractC1141t {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static volatile ThemeDatabase f57999kja0 = null;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f58000n7h = "theme_database.db";

    public static synchronized ThemeDatabase wvg(Context context) {
        if (f57999kja0 == null) {
            f57999kja0 = (ThemeDatabase) wvg.m5229k(context.getApplicationContext(), ThemeDatabase.class, f58000n7h).zy().m5196q();
        }
        return f57999kja0;
    }

    /* JADX INFO: renamed from: t */
    public abstract toq mo7698t();
}
