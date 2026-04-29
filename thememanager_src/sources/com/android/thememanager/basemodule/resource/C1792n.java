package com.android.thememanager.basemodule.resource;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.media.ExtraRingtone;
import android.media.ExtraRingtoneManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.local.C1743g;
import com.android.thememanager.basemodule.local.C1751n;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceLocalProperties;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.bf2;
import com.android.thememanager.basemodule.utils.ek5k;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.detail.theme.view.widget.ResourceDetailPreview;
import com.android.thememanager.mine.local.resource.C2162k;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.util.bo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import miuix.appcompat.app.ki;
import miuix.core.util.C7083n;
import yz.C7794k;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.n */
/* JADX INFO: compiled from: ResourceHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class C1792n {

    /* JADX INFO: renamed from: k */
    private static final String f10219k = "ResourceHelper";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Map<String, String> f57683toq = Collections.synchronizedMap(new k());

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57684zy = "ringtone_default_local_id";

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.n$k */
    /* JADX INFO: compiled from: ResourceHelper.java */
    class k extends LinkedHashMap<String, String> {
        private static final long serialVersionUID = 1;

        k() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
            return size() >= 50;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.n$toq */
    /* JADX INFO: compiled from: ResourceHelper.java */
    class toq implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f10220k;

        toq(final Activity val$activity) {
            this.f10220k = val$activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            Intent intent = new Intent("android.settings.XIAOMI_ACCOUNT_SYNC_SETTINGS");
            intent.addFlags(268435456);
            this.f10220k.startActivity(intent);
        }
    }

    public static boolean a9() {
        String str = C1724k.m6723p().ld6().font_file_hash;
        String qVar = C1796y.toq();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(qVar)) {
            return false;
        }
        return new File(qVar + "/" + str).exists();
    }

    /* JADX INFO: renamed from: b */
    public static Pair<String, String> m6930b(String title) {
        if (TextUtils.isEmpty(title)) {
            return new Pair<>("", "");
        }
        String strSubstring = null;
        int iIndexOf = title.indexOf(com.android.thememanager.basemodule.resource.constants.toq.n96);
        if (iIndexOf > 0) {
            String strSubstring2 = title.substring(0, iIndexOf);
            String strSubstring3 = title.substring(iIndexOf + 3);
            int iIndexOf2 = strSubstring3.indexOf("_split");
            strSubstring = iIndexOf2 > 0 ? strSubstring3.substring(0, iIndexOf2) : strSubstring3;
            title = strSubstring2;
        }
        return new Pair<>(title, strSubstring);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6931c(String resourceCode) {
        return "ringtone".equals(resourceCode) || com.android.thememanager.basemodule.analysis.toq.mle.equals(resourceCode) || "alarm".equals(resourceCode);
    }

    @dd
    public static String cdj(@lvui String resName) {
        Resources resources = bf2.toq.toq().getResources();
        int identifier = resources.getIdentifier(resName, "string", Build.VERSION.SDK_INT < 31 ? "miui.system" : "android.miui");
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
                Log.w(f10219k, "getString fail. NotFound: 0x" + Integer.toHexString(identifier));
            }
        }
        return null;
    }

    public static boolean d2ok(String resourceCode) {
        return "wallpaper".equals(resourceCode) || "lockscreen".equals(resourceCode);
    }

    public static boolean d3(Resource resource) {
        Resource resourceKja0 = kja0(resource, C1791k.getTheme());
        if (resourceKja0 != null) {
            resource = resourceKja0;
        }
        return "theme".equals(m6942o(resource)) && ni7(resource, "spwallpaper");
    }

    public static boolean dd(String resourceCode) {
        return InterfaceC1789q.gx2z.equals(resourceCode);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m6932e(String path) {
        return path != null && path.startsWith("/system/media/audio/notifications");
    }

    private static void ek5k(List<RelatedResource> relatedResources, ResourceLocalProperties.ResourceStorageType resourceStorageType) {
        Iterator<RelatedResource> it = relatedResources.iterator();
        while (it.hasNext()) {
            it.next().setResourceStorageType(resourceStorageType);
        }
    }

    public static boolean eqxt(String resourceCode) {
        return "icons".equals(resourceCode);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m6933f(String localId) {
        return com.android.thememanager.basemodule.resource.constants.toq.lb8.equals(localId);
    }

    public static String f7l8(ResourceLocalProperties.ResourceStorageType resourceStorageType, String relativeFolder, String defaultFolder) {
        if (resourceStorageType == ResourceLocalProperties.ResourceStorageType.PRECUST) {
            return com.android.thememanager.basemodule.resource.constants.toq.anfo + relativeFolder;
        }
        if (resourceStorageType == ResourceLocalProperties.ResourceStorageType.DATA) {
            return (com.android.thememanager.basemodule.resource.constants.toq.y1e + relativeFolder).replace(com.android.thememanager.basemodule.resource.constants.toq.x3b5, C1807g.m7078n());
        }
        if (!C1796y.m6977s()) {
            return defaultFolder;
        }
        if (resourceStorageType == ResourceLocalProperties.ResourceStorageType.BUILDIN_EXTERNAL_STORAGE) {
            return C1788k.f10181q + relativeFolder;
        }
        if (resourceStorageType != ResourceLocalProperties.ResourceStorageType.PLUGIN_SDCARD_STORAGE) {
            return defaultFolder;
        }
        return C1788k.f10178n + relativeFolder;
    }

    public static String fn3e(Resource resource, boolean isLock, boolean isLargeScreen) {
        if (resource != null) {
            return m6941n(new C1795s(resource, C1791k.getTheme()).m6969q(), isLock, isLargeScreen);
        }
        String[] list = new File(InterfaceC1789q.yj1).list();
        if (list == null || list.length == 0) {
            Log.w(f10219k, "getThemeThumbnailPath: default preview not exist");
            return null;
        }
        if (TextUtils.isEmpty(m6941n(Arrays.asList(list), isLock, isLargeScreen))) {
            return null;
        }
        return InterfaceC1789q.yj1 + m6941n(Arrays.asList(list), isLock, isLargeScreen);
    }

    public static boolean fti(String resourceCode) {
        return "fonts".equals(resourceCode) || "fonts_fallback".equals(resourceCode);
    }

    public static boolean fu4(String resourceCode) {
        return "aod".equals(resourceCode);
    }

    /* JADX INFO: renamed from: g */
    public static String m6934g(Context context, int duration) {
        int iMax = Math.max(duration / 1000, 1);
        if (!"zh".equals(context.getResources().getConfiguration().locale.getLanguage())) {
            return String.format("%02d:%02d", Integer.valueOf(iMax / 60), Integer.valueOf(iMax % 60));
        }
        int i2 = iMax / 60;
        int i3 = iMax % 60;
        if (i2 == 0) {
            return context.getString(R.string.audio_duration_seconds_format, Integer.valueOf(i3));
        }
        if (i3 == 0) {
            return context.getString(R.string.audio_duration_minutes_format, Integer.valueOf(i2));
        }
        return context.getString(R.string.audio_duration_minutes_format, Integer.valueOf(i2)) + context.getString(R.string.audio_duration_seconds_format, Integer.valueOf(i3));
    }

    public static boolean gvn7(Resource resource) {
        return "spwallpaper".equals(m6942o(resource));
    }

    /* JADX INFO: renamed from: h */
    public static String m6935h(String url) {
        String strReplaceAll = f57683toq.get(url);
        if (TextUtils.isEmpty(strReplaceAll)) {
            if (url.startsWith(com.android.thememanager.basemodule.network.theme.f7l8.cdj())) {
                strReplaceAll = url.substring(com.android.thememanager.basemodule.network.theme.f7l8.cdj().length()).replaceAll("/", "_");
            } else {
                strReplaceAll = url.split("/")[r0.length - 1];
            }
            while (strReplaceAll.length() > 48) {
                strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() / 2) + strReplaceAll.hashCode();
            }
            f57683toq.put(url, strReplaceAll);
        }
        return strReplaceAll;
    }

    public static boolean hb(String resourceCode) {
        return "videowallpaper".equals(resourceCode);
    }

    public static boolean hyr(String path) {
        return path != null && path.startsWith(com.android.thememanager.basemodule.resource.constants.toq.w1k2);
    }

    /* JADX INFO: renamed from: i */
    private static String m6936i(Resource resource, String prefix) {
        String next;
        if (resource == null) {
            Log.w(f10219k, "getThemeThumbnailPath fail because resource is null.");
            return null;
        }
        C1795s c1795s = new C1795s(resource, C1791k.getTheme());
        List<String> listM6969q = c1795s.m6969q();
        Iterator<String> it = listM6969q.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!TextUtils.isEmpty(next) && next.contains(prefix) && (!C1807g.lvui() || next.contains(ResourceDetailPreview.f11260d))) {
                break;
            }
        }
        if (next == null && !listM6969q.isEmpty()) {
            next = listM6969q.get(0);
        }
        if (TextUtils.isEmpty(next)) {
            List<PathEntry> listM6968p = c1795s.m6968p();
            PathEntry pathEntry = listM6968p.isEmpty() ? null : listM6968p.get(0);
            if (pathEntry != null && pathEntry.getLocalPath() != null) {
                return pathEntry.getLocalPath();
            }
        }
        return next;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6937j(String resourceCode) {
        return "framework".equals(resourceCode) || "icons".equals(resourceCode) || fti(resourceCode) || InterfaceC1789q.gx2z.equals(resourceCode) || "bootanimation".equals(resourceCode) || InterfaceC1789q.qwyf.equals(resourceCode) || "launcher".equals(resourceCode) || InterfaceC1789q.yb3p.equals(resourceCode) || "mms".equals(resourceCode) || "clock_".equals(resourceCode) || "photoframe_".equals(resourceCode) || "miwallpaper".equals(resourceCode) || "alarmscreen".equals(resourceCode) || "aod".equals(resourceCode) || "largeicons".equals(resourceCode) || "spwallpaper".equals(resourceCode);
    }

    public static boolean jk() {
        return o1t.m7170h() && new File(InterfaceC1789q.s4y).exists();
    }

    public static boolean jp0y(String path) {
        if (path != null) {
            if (path.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6938k(@lvui String resourceCode) {
        return "theme".equals(resourceCode) || "fonts".equals(resourceCode) || "aod".equals(resourceCode) || "miwallpaper".equals(resourceCode) || "icons".equals(resourceCode) || "largeicons".equals(resourceCode);
    }

    public static String ki(Resource resource) {
        return m6936i(resource, com.android.thememanager.basemodule.resource.constants.toq.nngj);
    }

    public static Resource kja0(Resource resource, C1791k context) {
        List<RelatedResource> parentResources = resource.getParentResources();
        if (parentResources == null || parentResources.size() <= 0) {
            return null;
        }
        return zy(parentResources.get(0), context);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m6939l(String resourceCode) {
        return "mms".equals(resourceCode);
    }

    @dd
    public static String ld6(Resource resource) {
        String next;
        C1795s c1795s = new C1795s(resource, C1791k.getTheme());
        List<String> listM6969q = c1795s.m6969q();
        Iterator<String> it = listM6969q.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!TextUtils.isEmpty(next) && next.contains(com.android.thememanager.basemodule.resource.constants.toq.e1)) {
                break;
            }
        }
        if (next == null) {
            List<String> listM6967n = c1795s.m6967n();
            if (!kja0.qrj(listM6967n)) {
                next = listM6967n.get(0);
            }
        }
        return (next != null || listM6969q.isEmpty()) ? next : listM6969q.get(0);
    }

    public static boolean lrht(@lvui String localPath, @dd String using) {
        if (using == null || using.isEmpty()) {
            return TextUtils.isEmpty(localPath);
        }
        if (TextUtils.isEmpty(localPath)) {
            return false;
        }
        if (TextUtils.equals(localPath, using)) {
            return true;
        }
        if (!y9n.zy()) {
            return false;
        }
        if (localPath.contains("files/MIUI/")) {
            localPath = bo.m9620g(localPath);
        }
        if (using.contains("Ringtones/ThemeManager/")) {
            using = bo.m9620g(using);
        }
        return TextUtils.equals(localPath, using);
    }

    public static boolean lvui(String resourceCode) {
        return "largeicons".equals(resourceCode);
    }

    /* JADX INFO: renamed from: m */
    public static String m6940m(String path) {
        return path.startsWith(com.android.thememanager.basemodule.resource.constants.toq.y1e) ? path.replace(com.android.thememanager.basemodule.resource.constants.toq.x3b5, C1807g.m7078n()) : path;
    }

    public static boolean mcp(String resourceCode) {
        return InterfaceC1789q.yb3p.equals(resourceCode);
    }

    /* JADX INFO: renamed from: n */
    private static String m6941n(List<String> previewPaths, boolean isLock, boolean isLargeScreen) {
        if (y9n.mcp(previewPaths)) {
            return null;
        }
        String str = isLock ? com.android.thememanager.basemodule.resource.constants.toq.bhh : com.android.thememanager.basemodule.resource.constants.toq.nngj;
        for (String str2 : previewPaths) {
            if (!TextUtils.isEmpty(str2) && str2.contains(str)) {
                if (!C1807g.lvui()) {
                    if (C1807g.zurt()) {
                        if (str2.contains(isLargeScreen ? com.android.thememanager.basemodule.analysis.toq.bp0b : com.android.thememanager.basemodule.analysis.toq.mo)) {
                        }
                    }
                    return str2;
                }
                if (str2.contains((C1819o.ncyb(bf2.toq.toq()) ? ResourceDetailPreview.f11262w : ResourceDetailPreview.f11260d) + "0")) {
                    return str2;
                }
            }
        }
        return null;
    }

    public static boolean n5r1(@dd String path) {
        if (path == null) {
            return false;
        }
        return path.contains("_icons_small_") || path.contains("_icons_mask_small_");
    }

    public static String n7h(String filePath) {
        String systemLocalizationFileName = ExtraRingtone.getSystemLocalizationFileName(bf2.toq.toq(), filePath);
        return systemLocalizationFileName == null ? m6943p(filePath) : systemLocalizationFileName;
    }

    public static boolean ncyb(Resource resource) {
        return resource != null && resource.getThemeType() >= 2;
    }

    public static boolean ni7(@dd Resource resource, @dd String componentCode) {
        if (resource == null || kja0.qrj(resource.getSubResources()) || TextUtils.isEmpty(componentCode)) {
            return false;
        }
        Iterator<RelatedResource> it = resource.getSubResources().iterator();
        while (it.hasNext()) {
            if (componentCode.equals(it.next().getResourceCode())) {
                return true;
            }
        }
        return false;
    }

    public static boolean nn86(String path) {
        return path != null && (path.startsWith("/system") || path.startsWith("/product"));
    }

    @dd
    /* JADX INFO: renamed from: o */
    public static String m6942o(@dd Resource resource) {
        if (resource == null) {
            return null;
        }
        Resource resourceKja0 = kja0(resource, C1791k.getTheme());
        if (resourceKja0 != null) {
            resource = resourceKja0;
        }
        List<RelatedResource> subResources = resource.getSubResources();
        if (kja0.qrj(subResources)) {
            return null;
        }
        if (subResources.size() <= InterfaceC1789q.q28.size() && ni7(resource, "spwallpaper")) {
            return "spwallpaper";
        }
        if (subResources.size() == 1) {
            return subResources.get(0).getResourceCode();
        }
        if (subResources.size() == 2) {
            if (C1807g.zurt() && ni7(resource, "icons") && ni7(resource, InterfaceC1789q.emvb)) {
                return "icons";
            }
            if (ni7(resource, "icons") && ni7(resource, "wallpaper")) {
                return "icons";
            }
        }
        HashSet hashSet = new HashSet();
        Iterator<RelatedResource> it = subResources.iterator();
        while (it.hasNext()) {
            String strNi7 = p001b.toq.ni7(it.next().getResourceCode());
            if ("miwallpaper".equals(strNi7)) {
                hashSet.add("wallpaper");
            } else if (!com.android.thememanager.basemodule.analysis.toq.lbeq.equals(strNi7) && !"lockscreen".equals(strNi7) && !m6949z(strNi7) && !oc(strNi7)) {
                hashSet.add(strNi7);
            }
        }
        if (hashSet.size() >= 2) {
            return "theme";
        }
        return null;
    }

    public static boolean o1t(String resourceCode) {
        return "bootanimation".equals(resourceCode);
    }

    public static boolean oc(String resourceCode) {
        return InterfaceC1789q.ekha.equals(resourceCode) || "photoframe_2x2".equals(resourceCode) || InterfaceC1789q.w5.equals(resourceCode) || "photoframe_2x4".equals(resourceCode) || InterfaceC1789q.gun.equals(resourceCode) || "photoframe_4x4".equals(resourceCode);
    }

    /* JADX INFO: renamed from: p */
    public static String m6943p(String filePath) {
        String strM25584g = C7083n.m25584g(filePath);
        int iLastIndexOf = strM25584g.lastIndexOf(".");
        return iLastIndexOf > -1 ? strM25584g.substring(0, iLastIndexOf) : strM25584g;
    }

    /* JADX INFO: renamed from: q */
    public static String m6944q(String origin) {
        return (TextUtils.isEmpty(origin) || !origin.startsWith(InterfaceC1789q.qf)) ? origin : m6940m(origin.replace(InterfaceC1789q.qf, InterfaceC1789q.dgf));
    }

    public static String qrj(C2162k item) {
        if (item.m8241k() == null || item.m8241k().getLocalInfo().isOfficial()) {
            return LargeIconElement.getDefaultIconPathByPackageNames(item.f60449ld6);
        }
        List<String> listM6967n = new C1795s(item.m8241k(), C1791k.getTheme()).m6967n();
        return (listM6967n == null || listM6967n.size() <= 0) ? t8r(item.m8241k()) : listM6967n.get(0);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m6945r(String resourceCode) {
        return "launcher".equals(resourceCode);
    }

    /* JADX INFO: renamed from: s */
    public static List<String> m6946s(Resource resourceItem, C1791k resContext) {
        Uri defaultSoundInternalUri;
        ArrayList arrayList = new ArrayList();
        Uri uriM7045q = ek5k.m7045q(new C1795s(resourceItem, resContext).f7l8());
        String qVar = ek5k.toq(uriM7045q);
        if (!TextUtils.isEmpty(qVar)) {
            arrayList.add(qVar);
        } else if (!resourceItem.getThumbnails().isEmpty()) {
            String onlinePath = resourceItem.getThumbnails().get(0).getOnlinePath();
            if (onlinePath != null) {
                arrayList.add(onlinePath);
            }
        } else {
            if (!"ringtone_default_local_id".equals(resourceItem.getLocalId()) || (defaultSoundInternalUri = ExtraRingtoneManager.getDefaultSoundInternalUri(ExtraRingtoneManager.getDefaultSoundType(uriM7045q))) == null) {
                return arrayList;
            }
            String path = defaultSoundInternalUri.getPath();
            if (new File(path).exists()) {
                arrayList.add(path);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m6947t(int platformVersion, String code) {
        return platformVersion >= p001b.toq.ki(code);
    }

    @dd
    public static String t8r(Resource resource) {
        return m6936i(resource, com.android.thememanager.basemodule.resource.constants.toq.bhh);
    }

    public static String toq(Context context, String code) {
        if ("ringtone".equals(code)) {
            return bo.m9623q(context, RingtoneManager.getActualDefaultRingtoneUri(context, 1));
        }
        if (com.android.thememanager.basemodule.analysis.toq.mle.equals(code)) {
            return bo.m9623q(context, RingtoneManager.getActualDefaultRingtoneUri(context, 2));
        }
        if ("alarm".equals(code)) {
            return bo.m9623q(context, RingtoneManager.getActualDefaultRingtoneUri(context, 4));
        }
        if (InterfaceC1789q.no.equals(code)) {
            return bo.m9623q(context, y9n.zy() ? RingtoneManager.getActualDefaultRingtoneUri(context, 16) : ExtraRingtoneManager.getDefaultSoundActualUri(context, 16));
        }
        if (InterfaceC1789q.wz.equals(code)) {
            return bo.m9623q(context, y9n.zy() ? RingtoneManager.getActualDefaultRingtoneUri(context, 4096) : ExtraRingtoneManager.getDefaultSoundActualUri(context, 4096));
        }
        String strNi7 = vyq.ni7(code);
        if (TextUtils.isEmpty(strNi7)) {
            if (!"bootaudio".equals(code)) {
                return p001b.toq.t8r(code);
            }
            if (jk()) {
                return o1t.m7176s(bf2.toq.toq()) ? InterfaceC1789q.s4y : "";
            }
        } else {
            if ("miwallpaper".equals(code) && bf2.zy(context) != 1) {
                return null;
            }
            if ("wallpaper".equals(code) && bf2.zy(context) != 0) {
                return null;
            }
        }
        return strNi7;
    }

    public static boolean uv6(String resourceCode) {
        return InterfaceC1789q.qwyf.equals(resourceCode);
    }

    public static boolean vyq(String path) {
        return path != null && path.startsWith("/system/media/audio/alarms");
    }

    public static boolean wvg(String resourceCode) {
        return "theme".equals(resourceCode);
    }

    public static String x2(Resource resource) {
        String next;
        C1795s c1795s = new C1795s(resource, C1791k.getTheme());
        List<String> listM6969q = c1795s.m6969q();
        Iterator<String> it = listM6969q.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!TextUtils.isEmpty(next) && next.contains(com.android.thememanager.basemodule.resource.constants.toq.olea)) {
                break;
            }
        }
        if (next == null) {
            List<String> listM6967n = c1795s.m6967n();
            if (!kja0.qrj(listM6967n)) {
                next = listM6967n.get(0);
            }
        }
        return (next != null || listM6969q.isEmpty()) ? next : listM6969q.get(0);
    }

    public static boolean x9kr(String resourceCode) {
        return "miwallpaper".equals(resourceCode);
    }

    /* JADX INFO: renamed from: y */
    public static String m6948y(Resource resource) {
        List<RelatedResource> parentResources = resource.getParentResources();
        return (parentResources == null || parentResources.size() <= 0) ? resource.getLocalId() : parentResources.get(0).getLocalId();
    }

    public static void y9n(final Activity activity) {
        new ki.C6947k(activity).fu4(R.string.to_activate_the_account).dd(android.R.string.ok, new toq(activity)).mcp(android.R.string.cancel, null).hb();
    }

    public static void yz(Resource resource, File metaFile) {
        String absolutePath = metaFile.getAbsolutePath();
        ResourceLocalProperties.ResourceStorageType resourceStorageType = ResourceLocalProperties.ResourceStorageType.NONE;
        if (absolutePath.startsWith(com.android.thememanager.basemodule.resource.constants.toq.ru)) {
            resourceStorageType = ResourceLocalProperties.ResourceStorageType.SYSTEM;
        } else if (absolutePath.startsWith(com.android.thememanager.basemodule.resource.constants.toq.w1k2)) {
            resourceStorageType = ResourceLocalProperties.ResourceStorageType.DATA;
        } else if (absolutePath.startsWith(com.android.thememanager.basemodule.resource.constants.toq.anfo)) {
            resourceStorageType = ResourceLocalProperties.ResourceStorageType.PRECUST;
        } else if (absolutePath.startsWith(C1788k.f10181q)) {
            resourceStorageType = ResourceLocalProperties.ResourceStorageType.BUILDIN_EXTERNAL_STORAGE;
        } else {
            String str = C1788k.f10178n;
            if (!TextUtils.isEmpty(str) && absolutePath.startsWith(str)) {
                resourceStorageType = ResourceLocalProperties.ResourceStorageType.PLUGIN_SDCARD_STORAGE;
            }
        }
        resource.setResourceStorageType(resourceStorageType);
        ek5k(resource.getParentResources(), resourceStorageType);
        ek5k(resource.getSubResources(), resourceStorageType);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m6949z(String resourceCode) {
        return "bootaudio".equals(resourceCode) || "ringtone".equals(resourceCode) || com.android.thememanager.basemodule.analysis.toq.mle.equals(resourceCode) || "alarm".equals(resourceCode) || InterfaceC1789q.iwp.equals(resourceCode);
    }

    public static String zurt(Resource resource, String code) {
        List<String> listM6967n = new C1795s(resource, C1791k.getInstance(code)).m6967n();
        if (listM6967n == null || listM6967n.isEmpty()) {
            return null;
        }
        return listM6967n.get(0);
    }

    public static Resource zy(RelatedResource related, C1791k context) {
        if (related == null) {
            return null;
        }
        C1751n c1751n = new C1751n(context);
        try {
            String qVar = new C1794q(related, context).toq();
            if (TextUtils.isEmpty(qVar)) {
                return null;
            }
            return c1751n.mo6852k(new File(qVar));
        } catch (C1743g e2) {
            C7794k.m28195n(f10219k, "convertToResource failed: " + e2);
            return null;
        }
    }
}
