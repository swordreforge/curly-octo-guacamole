package p001b;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.config.model.Config;
import com.android.thememanager.basemodule.model.flextab.C1762g;
import com.android.thememanager.basemodule.model.flextab.C1763k;
import com.android.thememanager.basemodule.model.flextab.C1764n;
import com.android.thememanager.basemodule.model.flextab.C1765p;
import com.android.thememanager.basemodule.model.flextab.C1766q;
import com.android.thememanager.basemodule.model.flextab.C1767s;
import com.android.thememanager.basemodule.model.flextab.C1768y;
import com.android.thememanager.basemodule.model.flextab.f7l8;
import com.android.thememanager.basemodule.model.flextab.ld6;
import com.android.thememanager.basemodule.model.flextab.x2;
import com.android.thememanager.basemodule.model.flextab.zy;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.util.mcp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zy.lvui;

/* JADX INFO: compiled from: ConstantsHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class toq implements InterfaceC1789q {

    /* JADX INFO: renamed from: c */
    public static final String f7204c = "hybrid,widget_suit,theme,wallpaper,largeicons,videowallpaper,ringtone,fonts,aod,icons,miwallpaper";

    /* JADX INFO: renamed from: e */
    public static final String f7206e = "eb4014c7-860c-40ef-a7ca-18eb916ff99c";

    /* JADX INFO: renamed from: f */
    public static final String f7207f = "local_page";

    /* JADX INFO: renamed from: g */
    public static final int f7208g = 3;

    /* JADX INFO: renamed from: h */
    public static final String f7209h = "home_page";

    /* JADX INFO: renamed from: i */
    public static final String f7210i = "category_page";

    /* JADX INFO: renamed from: j */
    public static final String f7211j = "0f9d40da-0649-429d-a2a6-5aed1d5b5391";

    /* JADX INFO: renamed from: k */
    public static final int f7212k = 0;

    /* JADX INFO: renamed from: l */
    public static final String f7213l = "my_favorite_page";

    /* JADX INFO: renamed from: m */
    public static final String f7214m = "mifold-setting-config-wallpaper";

    /* JADX INFO: renamed from: n */
    public static final int f7215n = 2;

    /* JADX INFO: renamed from: o */
    public static final String f7216o = "528aa58a-03b0-4289-8282-b7efe7885c6b";

    /* JADX INFO: renamed from: p */
    public static final int f7217p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f7218q = 1;

    /* JADX INFO: renamed from: r */
    public static final String f7219r = "my_like_page";

    /* JADX INFO: renamed from: s */
    public static final int f7220s = 1;

    /* JADX INFO: renamed from: t */
    public static final String f7221t = "my_purchased_page";

    /* JADX INFO: renamed from: y */
    public static final int f7226y = 0;

    /* JADX INFO: renamed from: z */
    public static final String f7227z = "account_page";

    /* JADX INFO: renamed from: b */
    private static Map<String, Long> f7203b = new HashMap();

    /* JADX INFO: renamed from: a */
    private static Map<String, String> f7202a = new HashMap();

    /* JADX INFO: renamed from: x */
    private static Map<String, String> f7225x = new HashMap();

    /* JADX INFO: renamed from: u */
    private static Map<String, String> f7222u = new HashMap();

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static Map<String, Integer> f53979bo = new HashMap();

    /* JADX INFO: renamed from: v */
    private static Map<String, Integer> f7223v = new HashMap();

    /* JADX INFO: renamed from: d */
    private static Map<String, String> f7205d = new HashMap();

    /* JADX INFO: renamed from: w */
    private static Map<String, String> f7224w = new HashMap();

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static Map<Long, String> f53978ab = new HashMap();
    private static Map<String, String> bb = new HashMap();
    private static Map<String, String> bp = new HashMap();
    private static Map<String, String> bv = new HashMap();
    private static Map<String, com.android.thememanager.basemodule.model.flextab.toq> an = new HashMap();
    private static Map<String, String> id = new HashMap();

    static {
        an.put("hybrid", new C1766q());
        an.put("widget_suit", new x2());
        an.put("theme", new C1767s());
        an.put("wallpaper", new ld6());
        an.put("videowallpaper", new C1765p());
        an.put("aod", new C1763k());
        an.put("ringtone", new C1768y());
        an.put("fonts", new zy());
        an.put("icons", new C1764n());
        an.put("miwallpaper", new f7l8());
        an.put("largeicons", new C1762g());
        f7203b.put("theme", -1L);
        f7203b.put("alarm", 1024L);
        f7203b.put(InterfaceC1789q.iwp, 32768L);
        f7203b.put("bootanimation", 32L);
        f7203b.put("bootaudio", 64L);
        f7203b.put("clock_", 65536L);
        f7203b.put(InterfaceC1789q.ekha, Long.valueOf(InterfaceC1789q.lnj));
        f7203b.put(InterfaceC1789q.w5, Long.valueOf(InterfaceC1789q.cmzf));
        f7203b.put(InterfaceC1789q.gun, Long.valueOf(InterfaceC1789q.jo));
        Map<String, Long> map = f7203b;
        String str = InterfaceC1789q.yb3p;
        map.put(InterfaceC1789q.yb3p, 2048L);
        f7203b.put("fonts", 16L);
        f7203b.put("framework", 1L);
        f7203b.put("icons", 8L);
        f7203b.put("launcher", 16384L);
        f7203b.put("lockscreen", 4L);
        f7203b.put(InterfaceC1789q.gx2z, 4096L);
        f7203b.put("mms", 128L);
        f7203b.put(com.android.thememanager.basemodule.analysis.toq.mle, 512L);
        f7203b.put("photoframe_", 131072L);
        f7203b.put("photoframe_2x2", Long.valueOf(InterfaceC1789q.qx));
        f7203b.put("photoframe_2x4", 134217728L);
        f7203b.put("photoframe_4x4", 262144L);
        f7203b.put("ringtone", 256L);
        f7203b.put(InterfaceC1789q.qwyf, 8192L);
        f7203b.put("wallpaper", 2L);
        f7203b.put("miwallpaper", 524288L);
        f7203b.put("alarmscreen", 1048576L);
        f7203b.put(com.android.thememanager.basemodule.analysis.toq.lbeq, 268435456L);
        f7203b.put("aod", 268435456L);
        f7203b.put("splockscreen", 4096L);
        for (Iterator<String> it = f7203b.keySet().iterator(); it.hasNext(); it = it) {
            String next = it.next();
            f53978ab.put(f7203b.get(next), next);
        }
        f53978ab.put(2097152L, "launcher");
        f53978ab.put(4194304L, "launcher");
        f7203b.put("fonts_fallback", 16L);
        f7203b.put(InterfaceC1789q.lsos, 16384L);
        f7203b.put(InterfaceC1789q.nsiv, 16384L);
        f7203b.put("miui.systemui.plugin", 8192L);
        f7203b.put("framework-miui-res", 1L);
        f7203b.put("com.android.settings", -17L);
        f7202a.put("alarm", InterfaceC1789q.sfu);
        f7202a.put("bootanimation", InterfaceC1789q.n3);
        f7202a.put("bootaudio", InterfaceC1789q.klnv);
        f7202a.put(InterfaceC1789q.yb3p, "com.android.contacts");
        f7202a.put("fonts", InterfaceC1789q.igu);
        f7202a.put("fonts_fallback", InterfaceC1789q.xd);
        f7202a.put("framework", InterfaceC1789q.b4);
        f7202a.put("launcher", InterfaceC1789q.k9);
        f7202a.put("lockscreen", InterfaceC1789q.iu);
        f7202a.put(InterfaceC1789q.gx2z, "lockscreen");
        f7202a.put("mms", "com.android.mms");
        f7202a.put("com.android.settings", "com.android.settings");
        f7202a.put(com.android.thememanager.basemodule.analysis.toq.mle, InterfaceC1789q.ovu0);
        f7202a.put("ringtone", InterfaceC1789q.p4);
        f7202a.put(InterfaceC1789q.qwyf, "com.android.systemui");
        f7202a.put("wallpaper", InterfaceC1789q.noa);
        f7202a.put("largeicons", "largeicons");
        f7225x.put("alarm", InterfaceC1789q.qmbf);
        f7225x.put("bootanimation", InterfaceC1789q.uux);
        f7225x.put("bootaudio", InterfaceC1789q.elg);
        f7225x.put(InterfaceC1789q.yb3p, InterfaceC1789q.ioq6);
        f7225x.put("fonts", InterfaceC1789q.bt9);
        f7225x.put("fonts_fallback", InterfaceC1789q.rnro);
        f7225x.put("framework", InterfaceC1789q.mz);
        f7225x.put("launcher", InterfaceC1789q.y3rt);
        f7225x.put("lockscreen", InterfaceC1789q.sxpt);
        f7225x.put(InterfaceC1789q.gx2z, InterfaceC1789q.re);
        f7225x.put("mms", InterfaceC1789q.so0v);
        f7225x.put(com.android.thememanager.basemodule.analysis.toq.mle, InterfaceC1789q.ci1g);
        f7225x.put("ringtone", InterfaceC1789q.ph);
        f7225x.put(InterfaceC1789q.qwyf, InterfaceC1789q.kus);
        f7225x.put("wallpaper", InterfaceC1789q.rg);
        f7225x.put("spwallpaper", InterfaceC1789q.mnxh);
        f7225x.put("splockscreen", InterfaceC1789q.iq);
        f7225x.put("spaod", InterfaceC1789q.l7p);
        f7222u.put("bootanimation", "animation");
        f7222u.put(InterfaceC1789q.ekha, InterfaceC1789q.ekha);
        f7222u.put(InterfaceC1789q.w5, InterfaceC1789q.w5);
        f7222u.put(InterfaceC1789q.gun, InterfaceC1789q.gun);
        f7222u.put(InterfaceC1789q.yb3p, InterfaceC1789q.yb3p);
        f7222u.put("fonts", "fonts");
        f7222u.put("framework", "");
        f7222u.put("icons", "icons");
        f7222u.put("launcher", "launcher");
        f7222u.put(InterfaceC1789q.gx2z, "lockscreen");
        f7222u.put("mms", "mms");
        f7222u.put("photoframe_2x2", InterfaceC1789q.zx6);
        f7222u.put("photoframe_2x4", InterfaceC1789q.c7aq);
        f7222u.put("photoframe_4x4", InterfaceC1789q.v5);
        f7222u.put(InterfaceC1789q.qwyf, InterfaceC1789q.qwyf);
        f7222u.put("miwallpaper", "miwallpaper");
        f7222u.put("alarmscreen", "alarmscreen");
        f7222u.put("aod", "aod");
        f7222u.put("largeicons", "largeicons");
        f7222u.put("spaod", "spaod");
        f7222u.put("splockscreen", "splockscreen");
        f7222u.put("spwallpaper", "spwallpaper");
        f7205d.put("theme", InterfaceC1789q.q68);
        f7205d.put("alarm", InterfaceC1789q.t7);
        f7205d.put(InterfaceC1789q.iwp, InterfaceC1789q.mmdq);
        f7205d.put("bootanimation", InterfaceC1789q.zjr);
        f7205d.put("bootaudio", InterfaceC1789q.wx3a);
        f7205d.put(InterfaceC1789q.ekha, InterfaceC1789q.q0);
        f7205d.put(InterfaceC1789q.w5, InterfaceC1789q.vllq);
        f7205d.put(InterfaceC1789q.gun, InterfaceC1789q.avdu);
        f7205d.put(InterfaceC1789q.yb3p, InterfaceC1789q.u3);
        f7205d.put("fonts", "Font");
        f7205d.put("framework", InterfaceC1789q.j2);
        f7205d.put("icons", InterfaceC1789q.c8);
        f7205d.put("launcher", InterfaceC1789q.lptj);
        f7205d.put("lockscreen", InterfaceC1789q.dxb);
        f7205d.put(InterfaceC1789q.gx2z, InterfaceC1789q.hx);
        f7205d.put("mms", InterfaceC1789q.ly);
        f7205d.put(com.android.thememanager.basemodule.analysis.toq.mle, InterfaceC1789q.ua);
        f7205d.put("photoframe_2x2", InterfaceC1789q.g2h);
        f7205d.put("photoframe_2x4", InterfaceC1789q.zg);
        f7205d.put("photoframe_4x4", InterfaceC1789q.yv44);
        f7205d.put("ringtone", InterfaceC1789q.v70n);
        f7205d.put(InterfaceC1789q.qwyf, InterfaceC1789q.nvn);
        f7205d.put("wallpaper", InterfaceC1789q.ob6y);
        f7205d.put("videowallpaper", InterfaceC1789q.zne);
        f7205d.put("miwallpaper", InterfaceC1789q.ts4);
        f7205d.put("alarmscreen", InterfaceC1789q.g74f);
        f7205d.put("aod", InterfaceC1789q.jzp);
        f7205d.put("spwallpaper", "SuperWallpaper");
        f7205d.put("widget_suit", "WIDGET_SUIT");
        f7205d.put("largeicons", InterfaceC1789q.ym5);
        Iterator<String> it2 = f7205d.keySet().iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            f7224w.put(f7205d.get(next2), next2);
            it2 = it2;
            str = str;
        }
        String str2 = str;
        f7224w.put("WallpaperUnion", "wallpaper");
        f7224w.put("RingtoneUnion", "ringtone");
        bv.put("theme", "THEME");
        bv.put("videowallpaper", "VIDEO_WALLPAPER");
        bv.put("wallpaper", "WALLPAPER");
        bv.put("miwallpaper", "LIVE_WALLPAPER");
        bv.put("ringtone", "RINGTONE");
        bv.put("fonts", "FONT");
        bv.put("aod", "AOD");
        bv.put("icons", InterfaceC1789q.e1v);
        bv.put("widget_suit", "WIDGET_SUIT");
        bv.put("widget", InterfaceC1789q.b3);
        bv.put("largeicons", InterfaceC1789q.fd23);
        for (Iterator<String> it3 = bv.keySet().iterator(); it3.hasNext(); it3 = it3) {
            String next3 = it3.next();
            id.put(bv.get(next3), next3);
        }
        f53979bo.put("theme", Integer.valueOf(R.string.theme_component_title_all));
        f53979bo.put("alarm", Integer.valueOf(R.string.theme_component_title_alarm));
        f53979bo.put(InterfaceC1789q.iwp, Integer.valueOf(R.string.theme_component_title_audio_effect));
        f53979bo.put("bootanimation", Integer.valueOf(R.string.theme_component_title_boot_animation));
        f53979bo.put("bootaudio", Integer.valueOf(R.string.theme_component_title_boot_audio));
        f53979bo.put("clock_", Integer.valueOf(R.string.theme_component_title_clock));
        f53979bo.put(InterfaceC1789q.ekha, Integer.valueOf(R.string.theme_component_title_clock));
        f53979bo.put(InterfaceC1789q.w5, Integer.valueOf(R.string.theme_component_title_clock));
        f53979bo.put(InterfaceC1789q.gun, Integer.valueOf(R.string.theme_component_title_clock));
        f53979bo.put(str2, Integer.valueOf(R.string.theme_component_title_contact));
        f53979bo.put("fonts", Integer.valueOf(R.string.theme_component_title_font));
        f53979bo.put("fonts_fallback", Integer.valueOf(R.string.theme_component_title_font));
        f53979bo.put("framework", Integer.valueOf(R.string.theme_component_title_framework));
        f53979bo.put("icons", Integer.valueOf(R.string.theme_component_title_icon));
        f53979bo.put("launcher", Integer.valueOf(R.string.theme_component_title_launcher));
        f53979bo.put("lockscreen", Integer.valueOf(R.string.theme_component_title_lockwallpaper));
        f53979bo.put(InterfaceC1789q.gx2z, Integer.valueOf(R.string.theme_component_title_lockstyle));
        f53979bo.put("mms", Integer.valueOf(R.string.theme_component_title_mms));
        f53979bo.put(com.android.thememanager.basemodule.analysis.toq.mle, Integer.valueOf(R.string.theme_component_title_notification));
        f53979bo.put("photoframe_", Integer.valueOf(R.string.theme_component_title_photo_frame));
        f53979bo.put("photoframe_2x2", Integer.valueOf(R.string.theme_component_title_photo_frame));
        f53979bo.put("photoframe_2x4", Integer.valueOf(R.string.theme_component_title_photo_frame));
        f53979bo.put("photoframe_4x4", Integer.valueOf(R.string.theme_component_title_photo_frame));
        f53979bo.put("ringtone", Integer.valueOf(R.string.theme_component_title_ringtone));
        f53979bo.put(InterfaceC1789q.qwyf, Integer.valueOf(R.string.theme_component_title_statusbar));
        f53979bo.put("wallpaper", Integer.valueOf(R.string.theme_component_title_wallpaper));
        f53979bo.put("miwallpaper", Integer.valueOf(R.string.theme_component_title_miwallpaper));
        f53979bo.put("videowallpaper", Integer.valueOf(R.string.live_wallpaper));
        f53979bo.put("alarmscreen", Integer.valueOf(R.string.theme_component_title_alarmstyle));
        f53979bo.put("aod", Integer.valueOf(R.string.theme_component_title_aod));
        f53979bo.put(com.android.thememanager.basemodule.analysis.toq.lbeq, Integer.valueOf(R.string.theme_component_title_others));
        f53979bo.put("widget_suit", Integer.valueOf(R.string.component_title_widget_suit));
        f53979bo.put("largeicons", Integer.valueOf(R.string.theme_component_title_large_icon));
        f7223v.put("theme", Integer.valueOf(InterfaceC1789q.z79v));
        f7223v.put("alarm", 0);
        f7223v.put(InterfaceC1789q.iwp, 0);
        f7223v.put("bootanimation", 0);
        f7223v.put("bootaudio", 0);
        f7223v.put(InterfaceC1789q.ekha, 0);
        f7223v.put(InterfaceC1789q.w5, 0);
        f7223v.put(InterfaceC1789q.gun, 0);
        f7223v.put(str2, Integer.valueOf(InterfaceC1789q.f12b));
        f7223v.put("fonts", 0);
        f7223v.put("framework", Integer.valueOf(InterfaceC1789q.eqnj));
        f7223v.put("icons", 0);
        f7223v.put("launcher", 1);
        f7223v.put("lockscreen", 0);
        f7223v.put(InterfaceC1789q.gx2z, 0);
        f7223v.put("mms", Integer.valueOf(InterfaceC1789q.quc));
        f7223v.put(com.android.thememanager.basemodule.analysis.toq.mle, 0);
        f7223v.put("photoframe_2x2", 2);
        f7223v.put("photoframe_2x4", 2);
        f7223v.put("photoframe_4x4", 2);
        f7223v.put("ringtone", 0);
        f7223v.put(InterfaceC1789q.qwyf, Integer.valueOf(InterfaceC1789q.ks5));
        f7223v.put("wallpaper", 0);
        f7223v.put("miwallpaper", 0);
        f7223v.put("alarmscreen", 0);
        f7223v.put("com.android.settings", Integer.valueOf(InterfaceC1789q.op7r));
        f7223v.put("aod", 0);
        f7223v.put("largeicons", 0);
        for (String str3 : f7202a.keySet()) {
            bb.put(f7202a.get(str3), str3);
        }
        bp.put("theme", "theme");
        bp.put("alarm", "alarm");
        bp.put(InterfaceC1789q.iwp, InterfaceC1789q.iwp);
        bp.put("bootanimation", "bootanimation");
        bp.put("bootaudio", "bootaudio");
        bp.put("clock_", "clock_");
        bp.put(InterfaceC1789q.ekha, InterfaceC1789q.ekha);
        bp.put(InterfaceC1789q.w5, InterfaceC1789q.w5);
        bp.put(InterfaceC1789q.gun, InterfaceC1789q.gun);
        bp.put(str2, str2);
        bp.put("fonts", "fonts");
        bp.put("framework", "framework");
        bp.put("icons", "icons");
        bp.put("launcher", "launcher");
        bp.put("lockscreen", "lockscreen");
        bp.put(InterfaceC1789q.gx2z, InterfaceC1789q.gx2z);
        bp.put("mms", "mms");
        bp.put(com.android.thememanager.basemodule.analysis.toq.mle, com.android.thememanager.basemodule.analysis.toq.mle);
        bp.put("photoframe_", "photoframe_");
        bp.put("photoframe_2x2", "photoframe_2x2");
        bp.put("photoframe_2x4", "photoframe_2x4");
        bp.put("photoframe_4x4", "photoframe_4x4");
        bp.put("ringtone", "ringtone");
        bp.put(InterfaceC1789q.qwyf, InterfaceC1789q.qwyf);
        bp.put("wallpaper", "wallpaper");
        bp.put("miwallpaper", "miwallpaper");
        bp.put("alarmscreen", "alarmscreen");
        bp.put("fonts_fallback", "fonts");
        bp.put(InterfaceC1789q.lsos, "launcher");
        bp.put(InterfaceC1789q.nsiv, "launcher");
        bp.put("framework-miui-res", "framework");
        bp.put("com.android.settings", "com.android.settings");
        bp.put("aod", "aod");
        bp.put("spaod", "spaod");
        bp.put("spwallpaper", "spwallpaper");
        bp.put("splockscreen", "splockscreen");
        bp.put("miui.systemui.plugin", InterfaceC1789q.qwyf);
    }

    private toq() {
    }

    public static int cdj(long type) {
        return ki(m5741k(type));
    }

    public static String f7l8(String code) {
        String str = m5742n().get(code);
        return str != null ? str : code;
    }

    private static void fn3e(ArrayList list, String pageName, Config config) {
        Iterator<String> it = config.getCurrentTabCodeList().iterator();
        while (it.hasNext()) {
            com.android.thememanager.basemodule.model.flextab.toq toqVar = an.get(it.next());
            if (toqVar != null && toqVar.mo6880y(pageName)) {
                list.add(toqVar);
            }
        }
    }

    @lvui
    public static String fu4(String componentCode) {
        String str = bv.get(componentCode);
        return str != null ? str : "THEME";
    }

    /* JADX INFO: renamed from: g */
    public static String m5738g(long type) {
        return f7l8(m5741k(type));
    }

    /* JADX INFO: renamed from: h */
    public static long m5739h(String code) {
        if (C1807g.m7081r()) {
            return mcp.m9876n(code);
        }
        Long l2 = f7203b.get(code);
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: i */
    public static com.android.thememanager.basemodule.model.flextab.toq m5740i(String resourceCode) {
        return an.get(resourceCode);
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static String m5741k(long type) {
        if (C1807g.m7081r()) {
            return mcp.zy(type);
        }
        String str = f53978ab.get(Long.valueOf(type));
        return str != null ? str : "";
    }

    public static int ki(String code) {
        Integer num = f7223v.get(code);
        return num != null ? num.intValue() : InterfaceC1789q.cz;
    }

    public static int kja0(String code) {
        Integer num = f53979bo.get(code);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static String ld6(long type) {
        return x2(m5741k(type));
    }

    /* JADX INFO: renamed from: n */
    public static Map<String, String> m5742n() {
        return C1807g.m7081r() ? mcp.toq() : f7202a;
    }

    public static String n7h(String code) {
        String str = f7205d.get(code);
        return str != null ? str : code;
    }

    public static String ni7(String code) {
        if (TextUtils.isEmpty(code)) {
            return null;
        }
        return C1807g.m7081r() ? mcp.m9877p(code) : bp.get(code) != null ? bp.get(code) : com.android.thememanager.basemodule.analysis.toq.lbeq;
    }

    public static void o1t(Config config, String errorMsg) {
        Log.e("config_tab", "server flex tabs is error, please check");
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("exp_id", "");
        StringBuilder sb = new StringBuilder();
        if (config != null) {
            sb.append("main_tab_sort:");
            sb.append(config.main_tab_sort);
            sb.append(", ");
        }
        sb.append("config error:");
        sb.append(errorMsg);
        arrayMapM6679k.put("content", sb.toString());
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.xo, C1706p.ki(arrayMapM6679k));
    }

    /* JADX INFO: renamed from: p */
    public static String m5743p(String code) {
        String str = f7222u.get(code);
        return str != null ? str : code;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static String m5744q(String stamp) {
        String str = f7224w.get(stamp);
        return str != null ? str : "";
    }

    public static String qrj(long type) {
        return n7h(m5741k(type));
    }

    /* JADX INFO: renamed from: s */
    public static String m5745s(long type) {
        return m5743p(m5741k(type));
    }

    public static String t8r(String code) {
        return String.format(InterfaceC1789q.cu, code);
    }

    public static String toq(String identity) {
        String str = m5746y().get(identity);
        return str != null ? str : identity;
    }

    public static String x2(String code) {
        String str = f7225x.get(code);
        if (str != null) {
            return str;
        }
        return bf2.zy.oaex + code;
    }

    /* JADX INFO: renamed from: y */
    public static Map<String, String> m5746y() {
        return C1807g.m7081r() ? mcp.m9874g() : bb;
    }

    /* JADX INFO: renamed from: z */
    public static long m5747z(Resource resource) {
        Iterator<RelatedResource> it = resource.getSubResources().iterator();
        long jM5739h = 0;
        while (it.hasNext()) {
            jM5739h |= m5739h(it.next().getResourceCode());
        }
        return jM5739h;
    }

    public static List<com.android.thememanager.basemodule.model.flextab.toq> zurt(String pageName) {
        Config configX2 = C1724k.m6723p().x2();
        if (configX2 == null || configX2.getCurrentTabCodeList() == null || configX2.getCurrentTabCodeList().size() == 0) {
            Log.e("config_tab", "flex tabs is null, please check");
            o1t(configX2, "local error");
            configX2 = C1724k.m6723p().m6727s();
        }
        ArrayList arrayList = new ArrayList();
        fn3e(arrayList, pageName, configX2);
        if (arrayList.size() == 0) {
            o1t(configX2, "server error");
            fn3e(arrayList, pageName, C1724k.m6723p().m6727s());
        }
        return arrayList;
    }

    @lvui
    public static String zy(String productType) {
        String str = id.get(productType);
        return str != null ? str : "theme";
    }
}
