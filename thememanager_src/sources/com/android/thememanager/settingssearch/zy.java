package com.android.thememanager.settingssearch;

import android.app.Activity;
import android.content.Intent;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeSettingsActivity;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.model.RecommendItemResolver;
import com.android.thememanager.settings.WallpaperMiuiTabActivity;
import com.android.thememanager.settings.subsettings.f7l8;
import com.android.thememanager.settings.subsettings.x2;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: SettingsSearchResultIntentFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final zy f15983k = new zy();

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final String f15984q = "ITEM_LOCAL_THEME";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f61049toq = "ITEM_HISTORICAL_WALLPAPER";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f61050zy = "ITEM_ONLINE_THEME";

    private zy() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final Intent m9403k(@InterfaceC7396q Activity activity, @InterfaceC7396q String item) {
        d2ok.m23075h(activity, "activity");
        d2ok.m23075h(item, "item");
        Intent intent = new Intent();
        int iHashCode = item.hashCode();
        if (iHashCode != -1998942631) {
            if (iHashCode == -920711575) {
                if (!item.equals(f61050zy)) {
                    return intent;
                }
                intent.setClass(activity, ThemeSettingsActivity.class);
                intent.putExtra(toq.f15977k, toq.f61048zy);
                return intent;
            }
            if (iHashCode != 1737470089 || !item.equals(f15984q)) {
                return intent;
            }
            Intent forwardLocalIntent = RecommendItemResolver.getForwardLocalIntent("theme");
            d2ok.kja0(forwardLocalIntent, "getForwardLocalIntent(...)");
            forwardLocalIntent.putExtra(toq.f15977k, toq.f61046toq);
            return forwardLocalIntent;
        }
        if (!item.equals(f61049toq)) {
            return intent;
        }
        String string = activity.getString(R.string.historical_wallpaper);
        d2ok.kja0(string, "getString(...)");
        f7l8 f7l8Var = new f7l8(1, 10);
        f7l8Var.f15454q = string;
        List<PageGroup> listM9185k = new x2().m9185k(activity);
        intent.setClass(activity, WallpaperMiuiTabActivity.class);
        intent.putExtra(InterfaceC1357q.f53943tfm, false);
        intent.putExtra(InterfaceC1357q.f53866eqxt, string);
        d2ok.n7h(listM9185k, "null cannot be cast to non-null type java.io.Serializable");
        intent.putExtra(InterfaceC1357q.f53865ek5k, (Serializable) listM9185k);
        intent.putExtra(InterfaceC1357q.f53949uv6, 10);
        intent.putExtra("category_type", f7l8Var.f15451k);
        return intent;
    }
}
