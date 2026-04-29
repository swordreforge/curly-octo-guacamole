package com.android.thememanager.settingssearch;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import com.android.thememanager.settingssearch.C2690k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a9;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThemeManagerSettingsSearchProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nThemeManagerSettingsSearchProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeManagerSettingsSearchProvider.kt\ncom/android/thememanager/settingssearch/ThemeManagerSettingsSearchProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,249:1\n1855#2,2:250\n*S KotlinDebug\n*F\n+ 1 ThemeManagerSettingsSearchProvider.kt\ncom/android/thememanager/settingssearch/ThemeManagerSettingsSearchProvider\n*L\n184#1:250,2\n*E\n"})
public final class ThemeManagerSettingsSearchProvider extends ContentProvider {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final String f15951g = "/";

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2689k f15952k = new C2689k(null);

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final String f15953n = ":";

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final String f15954q = "ThemeManagerSettingsSearchProvider";

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final String f15955y = ";";

    /* JADX INFO: renamed from: com.android.thememanager.settingssearch.ThemeManagerSettingsSearchProvider$k */
    /* JADX INFO: compiled from: ThemeManagerSettingsSearchProvider.kt */
    public static final class C2689k {
        private C2689k() {
        }

        public /* synthetic */ C2689k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: g */
    private final List<toq> m9394g() {
        char c2;
        ArrayList arrayList = new ArrayList();
        Context context = getContext();
        d2ok.qrj(context);
        String string = context.getString(R.string.lock_screen_card_title);
        d2ok.kja0(string, "getString(...)");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        ni7 ni7Var = null;
        arrayList.add(new toq(this, string, str, str2, str3, str4, zy(kotlin.collections.ni7.d2ok(context.getString(R.string.de_mix_mode_lockscreen), context.getString(R.string.lock_screen_card_title))), num, toq("LOCK_SCREEN"), 94, ni7Var));
        String string2 = context.getString(R.string.theme_component_title_all);
        d2ok.kja0(string2, "getString(...)");
        String str5 = null;
        arrayList.add(new toq(this, string2, str, str2, str3, str4, str5, num, toq("THEME"), 126, ni7Var));
        String string3 = context.getString(R.string.present_online_themes);
        d2ok.kja0(string3, "getString(...)");
        arrayList.add(new toq(this, string3, null, str2, str3, m9396n(kotlin.collections.ni7.d2ok(context.getString(R.string.theme_component_title_all), context.getString(R.string.present_online_themes))), str5, num, toq(com.android.thememanager.settingssearch.toq.f61048zy), 110, null));
        String string4 = context.getString(R.string.present_local_themes);
        d2ok.kja0(string4, "getString(...)");
        String str6 = null;
        ni7 ni7Var2 = null;
        arrayList.add(new toq(this, string4, str6, str2, str3, m9396n(kotlin.collections.ni7.d2ok(context.getString(R.string.theme_component_title_all), context.getString(R.string.present_local_themes))), str5, num, toq(com.android.thememanager.settingssearch.toq.f61046toq), 110, ni7Var2));
        String string5 = context.getString(R.string.component_title_wallpaper);
        d2ok.kja0(string5, "getString(...)");
        arrayList.add(new toq(this, string5, str6, str2, str3, null, str5, num, toq("WALLPAPER"), 126, ni7Var2));
        String string6 = context.getString(R.string.historical_wallpaper);
        d2ok.kja0(string6, "getString(...)");
        String str7 = null;
        arrayList.add(new toq(this, string6, str7, str2, str3, m9396n(kotlin.collections.ni7.d2ok(context.getString(R.string.component_title_wallpaper), context.getString(R.string.historical_wallpaper))), str5, num, toq(com.android.thememanager.settingssearch.toq.f15981s), 110, ni7Var2));
        String string7 = context.getString(R.string.personalize_icon_title);
        d2ok.kja0(string7, "getString(...)");
        arrayList.add(new toq(this, string7, str7, str2, str3, null, str5, num, toq(com.android.thememanager.settingssearch.toq.f61043ld6), 126, null));
        if (C2663k.qrj()) {
            String string8 = context.getString(R.string.personalize_aod_title);
            d2ok.kja0(string8, "getString(...)");
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            Integer num2 = null;
            ni7 ni7Var3 = null;
            c2 = 2;
            arrayList.add(new toq(this, string8, str8, str9, str10, str11, zy(kotlin.collections.ni7.d2ok(context.getString(R.string.personalize_aod_title), context.getString(R.string.personalize_aod_title_alternative))), num2, toq("AOD"), 94, ni7Var3));
            String string9 = context.getString(R.string.personalize_notify_style_title);
            d2ok.kja0(string9, "getString(...)");
            arrayList.add(new toq(this, string9, str8, str9, str10, str11, null, num2, toq(com.android.thememanager.settingssearch.toq.f61047x2), 126, ni7Var3));
        } else {
            c2 = 2;
        }
        if (C2670y.m9309s(context)) {
            String string10 = context.getString(R.string.personalize_fingerprint_style_title);
            d2ok.kja0(string10, "getString(...)");
            arrayList.add(new toq(this, string10, null, null, null, null, null, null, toq(com.android.thememanager.settingssearch.toq.f61045qrj), 126, null));
        }
        if (!o1t.fu4()) {
            String string11 = context.getString(R.string.theme_component_title_font);
            d2ok.kja0(string11, "getString(...)");
            String[] strArr = new String[10];
            strArr[0] = context.getString(R.string.theme_component_title_font);
            strArr[1] = context.getString(R.string.present_local_fonts);
            strArr[c2] = context.getString(R.string.settings_search_keyword_font_free);
            strArr[3] = context.getString(R.string.settings_search_keyword_font_online);
            strArr[4] = context.getString(R.string.settings_search_keyword_font_wechat);
            strArr[5] = context.getString(R.string.settings_search_keyword_font_keyboard);
            strArr[6] = context.getString(R.string.settings_search_keyword_font_style);
            strArr[7] = context.getString(R.string.settings_search_keyword_font_input);
            strArr[8] = context.getString(R.string.settings_search_keyword_font_manager);
            strArr[9] = context.getString(R.string.settings_search_keyword_font_home);
            arrayList.add(new toq(this, string11, null, null, null, null, zy(kotlin.collections.ni7.d2ok(strArr)), null, toq("FONT"), 94, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    private final String m9396n(List<String> list) {
        return m9397q(a9.uo(list, f15951g, null, null, 0, null, null, 62, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final String m9397q(String str) {
        StringBuilder sb = new StringBuilder();
        Context context = getContext();
        d2ok.qrj(context);
        sb.append(context.getString(R.string.personalize_title));
        sb.append('/');
        sb.append(str);
        return sb.toString();
    }

    private final String toq(String str) {
        return "SETTINGS_SEARCH_EXTRA_KEY:" + str;
    }

    private final String zy(List<String> list) {
        return a9.uo(list, f15955y, null, null, 0, null, null, 62, null);
    }

    @Override // android.content.ContentProvider
    public int delete(@InterfaceC7396q Uri uri, @InterfaceC7395n String str, @InterfaceC7395n String[] strArr) {
        d2ok.m23075h(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    @InterfaceC7395n
    public String getType(@InterfaceC7396q Uri uri) {
        d2ok.m23075h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @InterfaceC7395n
    public Uri insert(@InterfaceC7396q Uri uri, @InterfaceC7395n ContentValues contentValues) {
        d2ok.m23075h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    @InterfaceC7396q
    public Cursor query(@InterfaceC7396q Uri uri, @InterfaceC7395n String[] strArr, @InterfaceC7395n String str, @InterfaceC7395n String[] strArr2, @InterfaceC7395n String str2) {
        d2ok.m23075h(uri, "uri");
        MatrixCursor matrixCursor = new MatrixCursor(C2690k.f61035toq);
        List<toq> listM9394g = m9394g();
        for (toq toqVar : listM9394g) {
            MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
            rowBuilderNewRow.add("title", toqVar.m9402y());
            rowBuilderNewRow.add(C2690k.k.f15969g, toqVar.zy());
            rowBuilderNewRow.add(C2690k.k.f61038f7l8, toqVar.m9400n());
            rowBuilderNewRow.add(C2690k.k.f15975y, toqVar.m9401q());
            rowBuilderNewRow.add(C2690k.k.f15971n, Integer.valueOf(toqVar.toq()));
            rowBuilderNewRow.add(C2690k.k.f61040toq, toqVar.f7l8());
            rowBuilderNewRow.add("keywords", toqVar.m9398g());
            rowBuilderNewRow.add(C2690k.k.f15972p, toqVar.m9399k());
        }
        Log.i(f15954q, "query: Returned " + listM9394g.size() + " items");
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@InterfaceC7396q Uri uri, @InterfaceC7395n ContentValues contentValues, @InterfaceC7395n String str, @InterfaceC7395n String[] strArr) {
        d2ok.m23075h(uri, "uri");
        return 0;
    }

    /* JADX INFO: compiled from: ThemeManagerSettingsSearchProvider.kt */
    public final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7396q
        private final String f61029f7l8;

        /* JADX INFO: renamed from: g */
        private final int f15956g;

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final String f15957k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        private final String f15958n;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final String f15959q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ ThemeManagerSettingsSearchProvider f15960s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final String f61030toq;

        /* JADX INFO: renamed from: y */
        @InterfaceC7396q
        private final String f15961y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final String f61031zy;

        public toq(@InterfaceC7396q ThemeManagerSettingsSearchProvider themeManagerSettingsSearchProvider, @InterfaceC7396q String title, @InterfaceC7395n String intentAction, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, @InterfaceC7395n String str4, @InterfaceC7396q Integer num, String extras) {
            d2ok.m23075h(title, "title");
            d2ok.m23075h(intentAction, "intentAction");
            d2ok.m23075h(extras, "extras");
            this.f15960s = themeManagerSettingsSearchProvider;
            this.f15957k = title;
            this.f61030toq = intentAction;
            this.f61031zy = extras;
            String str5 = "";
            if (!kotlin.text.a9.m58i(intentAction)) {
                str = "";
            } else if (str == null) {
                str = "com.android.thememanager";
            }
            this.f15959q = str;
            if (kotlin.text.a9.m58i(intentAction)) {
                str2 = str2 == null ? SettingsSearchResultTransferActivity.class.getName() : str2;
                d2ok.qrj(str2);
                str5 = str2;
            }
            this.f15958n = str5;
            this.f15956g = num != null ? num.intValue() : R.drawable.ic_personalize_settings;
            this.f61029f7l8 = str3 == null ? themeManagerSettingsSearchProvider.m9397q(title) : str3;
            this.f15961y = str4 != null ? str4 : title;
        }

        @InterfaceC7396q
        public final String f7l8() {
            return this.f61029f7l8;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public final String m9398g() {
            return this.f15961y;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final String m9399k() {
            return this.f61031zy;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final String m9400n() {
            return this.f15959q;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final String m9401q() {
            return this.f15958n;
        }

        public final int toq() {
            return this.f15956g;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public final String m9402y() {
            return this.f15957k;
        }

        @InterfaceC7396q
        public final String zy() {
            return this.f61030toq;
        }

        public /* synthetic */ toq(ThemeManagerSettingsSearchProvider themeManagerSettingsSearchProvider, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, int i2, ni7 ni7Var) {
            this(themeManagerSettingsSearchProvider, str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? "" : str7);
        }
    }
}
