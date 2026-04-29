package com.android.thememanager.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.ExtraRingtone;
import android.media.ExtraRingtoneManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.backup.ThemeBackupAgent;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.C1796y;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceLocalProperties;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.controller.C1902k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.model.ResourceResolver;
import com.xiaomi.mipush.sdk.C5658n;
import ek5k.C6002g;
import i1.C6077k;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import miui.util.CoderUtils;
import miui.util.HashUtils;
import miuix.appcompat.app.ki;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ResourceHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class ch implements InterfaceC1357q, com.android.thememanager.basemodule.resource.constants.toq, InterfaceC1925p {

    /* JADX INFO: renamed from: g */
    public static final String f16371g = "key_import_preset_font";

    /* JADX INFO: renamed from: k */
    private static final String f16374k = "ResourceHelper";

    /* JADX INFO: renamed from: n */
    private static final int f16375n = 1296000;

    /* JADX INFO: renamed from: q */
    private static String f16377q = null;

    /* JADX INFO: renamed from: r */
    public static final String f16378r = "local_update_resource_shown";

    /* JADX INFO: renamed from: s */
    public static final String f16379s = "key_import_preset_font_deleted";

    /* JADX INFO: renamed from: t */
    public static final String f16380t = "local_update_resource_amount";

    /* JADX INFO: renamed from: y */
    public static final String f16381y = "key_import_preset_font_hash";

    /* JADX INFO: renamed from: z */
    public static final String f16382z = "local_resource_update";

    /* JADX INFO: renamed from: p */
    private static Map<String, String> f16376p = Collections.synchronizedMap(new C2767k());

    /* JADX INFO: renamed from: h */
    protected static Map<String, C2769q> f16372h = new HashMap();

    /* JADX INFO: renamed from: i */
    protected static Map<String, C2768n> f16373i = new HashMap();

    /* JADX INFO: renamed from: com.android.thememanager.util.ch$g */
    /* JADX INFO: compiled from: ResourceHelper.java */
    public interface InterfaceC2766g {
        /* JADX INFO: renamed from: k */
        void mo7497k(String path, long size, String hash);
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.ch$k */
    /* JADX INFO: compiled from: ResourceHelper.java */
    class C2767k extends LinkedHashMap<String, String> {
        private static final long serialVersionUID = 1;

        C2767k() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
            return size() >= 50;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.ch$n */
    /* JADX INFO: compiled from: ResourceHelper.java */
    private static class C2768n {

        /* JADX INFO: renamed from: k */
        public long f16383k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public long f61219toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public long f61220zy;

        public C2768n(File file, long duration) {
            this.f16383k = file.lastModified();
            this.f61219toq = file.length();
            this.f61220zy = duration;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.ch$q */
    /* JADX INFO: compiled from: ResourceHelper.java */
    private static class C2769q implements Serializable {
        private static final long serialVersionUID = 2;
        public String mHash;
        public long mModified;
        public long mSize;

        public C2769q(File file, String hash) {
            this.mModified = file.lastModified();
            this.mSize = file.length();
            this.mHash = hash;
        }
    }

    /* JADX INFO: compiled from: ResourceHelper.java */
    class toq implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f16384k;

        toq(final Activity val$activity) {
            this.f16384k = val$activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            Intent intent = new Intent("android.settings.XIAOMI_ACCOUNT_SYNC_SETTINGS");
            intent.addFlags(268435456);
            this.f16384k.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: ResourceHelper.java */
    private static class zy implements Runnable {
        private zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ch.zy();
        }

        /* synthetic */ zy(C2767k c2767k) {
            this();
        }
    }

    private ch() {
    }

    /* JADX INFO: renamed from: a */
    public static void m9665a(String zipPath, String targetFolder) throws Throwable {
        zp(zipPath, targetFolder, "fonts/");
    }

    public static long a9(String path) {
        if (TextUtils.isEmpty(path)) {
            return -1L;
        }
        File file = new File(path);
        try {
            if (file.exists()) {
                C2768n c2768n = f16373i.get(path);
                if (c2768n == null || file.lastModified() != c2768n.f16383k || file.length() != c2768n.f61219toq) {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    mediaPlayer.setDataSource(path);
                    mediaPlayer.prepare();
                    int duration = mediaPlayer.getDuration();
                    mediaPlayer.release();
                    c2768n = new C2768n(file, duration);
                    synchronized (f16373i) {
                        f16373i.put(path, c2768n);
                    }
                }
                return c2768n.f61220zy;
            }
        } catch (Exception unused) {
        }
        return -1L;
    }

    public static final com.android.thememanager.fu4 a98o(Activity activity) {
        if (activity == null || !(activity instanceof com.android.thememanager.activity.kja0)) {
            return null;
        }
        return ((com.android.thememanager.activity.kja0) activity).etdu();
    }

    /* JADX INFO: renamed from: b */
    public static void m9666b(int errorTextId, String errorAppendix) {
        String strValueOf = String.valueOf(C2082k.zy().toq().getText(errorTextId));
        if (!TextUtils.isEmpty(errorAppendix)) {
            strValueOf = strValueOf + "\n error: " + errorAppendix;
        }
        com.android.thememanager.basemodule.utils.nn86.toq(strValueOf, 1);
    }

    public static void bf2(Activity activity, String content) {
        new ki.C6947k(activity).lrht(R.string.resource_server_alert_dialog_title).m25050z(content).dd(android.R.string.ok, null).hb();
    }

    public static boolean bo(ZipOutputStream out, File source, String targetFile, Set<String> entries) throws Throwable {
        BufferedInputStream bufferedInputStream;
        if (!source.exists()) {
            return true;
        }
        if (entries != null && entries.contains(targetFile)) {
            return false;
        }
        if (source.isDirectory()) {
            File[] fileArrListFiles = source.listFiles();
            if (fileArrListFiles == null) {
                return true;
            }
            if (targetFile.length() > 0) {
                targetFile = C1821p.n7h(targetFile);
            }
            boolean z2 = true;
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                File file = fileArrListFiles[i2];
                StringBuilder sb = new StringBuilder();
                sb.append(targetFile);
                sb.append(fileArrListFiles[i2].getName());
                z2 = bo(out, file, sb.toString(), entries) && z2;
            }
            return z2;
        }
        if (com.android.thememanager.basemodule.utils.y9n.eqxt(source)) {
            return true;
        }
        CheckedInputStream checkedInputStream = null;
        try {
            byte[] bArr = new byte[4096];
            CRC32 crc32 = new CRC32();
            CheckedInputStream checkedInputStream2 = new CheckedInputStream(new BufferedInputStream(new FileInputStream(source)), crc32);
            do {
                try {
                } catch (Exception unused) {
                    bufferedInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = null;
                }
            } while (checkedInputStream2.read(bArr) != -1);
            ZipEntry zipEntry = new ZipEntry(targetFile);
            zipEntry.setMethod(0);
            zipEntry.setSize(source.length());
            zipEntry.setCrc(crc32.getValue());
            out.putNextEntry(zipEntry);
            if (entries != null) {
                entries.add(targetFile);
            }
            bufferedInputStream = new BufferedInputStream(new FileInputStream(source));
            while (true) {
                try {
                    int i3 = bufferedInputStream.read(bArr);
                    if (i3 == -1) {
                        com.android.thememanager.basemodule.utils.y9n.m7246g(checkedInputStream2);
                        com.android.thememanager.basemodule.utils.y9n.m7246g(bufferedInputStream);
                        return true;
                    }
                    out.write(bArr, 0, i3);
                } catch (Exception unused2) {
                    checkedInputStream = checkedInputStream2;
                    com.android.thememanager.basemodule.utils.y9n.m7246g(checkedInputStream);
                    com.android.thememanager.basemodule.utils.y9n.m7246g(bufferedInputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    checkedInputStream = checkedInputStream2;
                    com.android.thememanager.basemodule.utils.y9n.m7246g(checkedInputStream);
                    com.android.thememanager.basemodule.utils.y9n.m7246g(bufferedInputStream);
                    throw th;
                }
            }
        } catch (Exception unused3) {
            bufferedInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9667c(int displayType) {
        return displayType == 1 || displayType == 2 || displayType == 4;
    }

    public static int cdj(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.resource_page_item_multiple_button_addition_top_padding);
    }

    public static void ch(String zipPath, String targetFolder, InterfaceC2766g listner) throws Throwable {
        nmn5(zipPath, targetFolder, "", listner);
    }

    @zy.y9n
    public static Resource d2ok(String code, boolean forceAll) {
        List<Resource> listKi = C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g(code)).m7690k().ki(false, false, forceAll);
        String qVar = C1792n.toq(bf2.toq.toq(), code);
        if (TextUtils.isEmpty(qVar)) {
            return null;
        }
        for (Resource resource : listKi) {
            if (qVar.equals(new C1795s(resource, C1791k.getInstance(code)).m6971y())) {
                return resource;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair<Integer, Integer> d3(Context context, int displayType, int screenGap, int itemGap) {
        int fraction;
        int iZy = R.fraction.resource_thumbnail_crop_ratio;
        int qVar = 3;
        int i2 = -1;
        switch (displayType) {
            case 1:
            case 2:
                qVar = 1;
                iZy = -1;
                break;
            case 3:
                iZy = R.fraction.resource_thumbnail_flat_ratio;
                qVar = 2;
                break;
            case 4:
                iZy = R.fraction.resource_thumbnail_single_font_ratio;
                qVar = 1;
                break;
            case 5:
                iZy = R.fraction.resource_thumbnail_flat_icon_ratio;
                qVar = 2;
                break;
            case 6:
            case 7:
            case 9:
                if (com.android.thememanager.basemodule.utils.o1t.qrj()) {
                    iZy = R.fraction.resource_thumbnail_crop_ratio_gte_v10;
                }
                break;
            case 8:
                iZy = R.fraction.resource_thumbnail_flat_ratio;
                break;
            case 10:
                iZy = R.fraction.aod_thumbnail_default_ratio;
                qVar = 2;
                break;
            case 11:
                qVar = 2;
                break;
            case 12:
                iZy = R.fraction.resource_thumbnail_large_icon_ratio;
                qVar = 2;
                break;
            default:
                iZy = com.android.thememanager.ni7.zy(displayType);
                qVar = com.android.thememanager.ni7.toq(displayType);
                break;
        }
        if (iZy > 0) {
            i2 = (((C1807g.zurt() ? context instanceof Activity ? C1819o.a9((Activity) context) : com.android.thememanager.basemodule.utils.y9n.fn3e() : context instanceof Activity ? gc3c.kja0((Activity) context) : com.android.thememanager.basemodule.utils.y9n.zurt()).x - (screenGap * 2)) - ((qVar - 1) * itemGap)) / qVar;
            fraction = (int) context.getResources().getFraction(iZy, i2, i2);
        } else if (iZy == -1) {
            fraction = -1;
        } else {
            fraction = -2;
            i2 = -2;
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(fraction));
    }

    public static boolean dd(int displayType) {
        return displayType == 3 || displayType == 5 || displayType == 6 || displayType == 8 || displayType == 7 || displayType == 9 || displayType == 100 || displayType == 10;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m9668e(String path) {
        return path != null && path.startsWith("content://");
    }

    public static void ek5k(String path, String hash) {
        m9676m(path, new C2769q(new File(path), hash));
    }

    public static Pair<String, String> eqxt(String path) {
        return i1(mcp(path));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9669f(File file, C1791k resContext) {
        if (!file.exists() || file.isDirectory() || file.getName().endsWith(com.android.thememanager.basemodule.resource.constants.toq.lb)) {
            return false;
        }
        if (resContext.getResourceFormat() == 3 && file.length() > 52428800) {
            return false;
        }
        if (resContext.getResourceFormat() == 2) {
            return (file.getName().endsWith(".png") || file.getName().endsWith(com.android.thememanager.basemodule.resource.constants.toq.ybu) || file.getName().endsWith(".jpeg")) && file.length() <= 52428800;
        }
        return true;
    }

    public static String f7l8(long size) {
        double d2 = size;
        return d2 < 1048576.0d ? String.format("%.0fK", Double.valueOf(d2 / 1024.0d)) : String.format("%.1fM", Double.valueOf(d2 / 1048576.0d));
    }

    public static int fn3e() {
        return 2;
    }

    public static String fti(String filePath) {
        try {
            String systemLocalizationFileName = ExtraRingtone.getSystemLocalizationFileName(C2082k.zy().toq(), filePath);
            return systemLocalizationFileName == null ? mcp(filePath) : systemLocalizationFileName;
        } catch (Resources.NotFoundException e2) {
            Log.d(f16374k, "getFileName: " + e2.getMessage());
            return null;
        }
    }

    public static int fu4(Context context) {
        if (context == null) {
            context = bf2.toq.toq();
        }
        return context.getResources().getDimensionPixelSize(R.dimen.recommend_thumbnail_vertical_offset);
    }

    /* JADX INFO: renamed from: g */
    public static String m9670g(int duration) {
        int iMax = Math.max(duration / 1000, 1);
        ThemeApplication qVar = C2082k.zy().toq();
        if (!"zh".equals(qVar.getResources().getConfiguration().locale.getLanguage())) {
            return String.format("%02d:%02d", Integer.valueOf(iMax / 60), Integer.valueOf(iMax % 60));
        }
        int i2 = iMax / 60;
        int i3 = iMax % 60;
        if (i2 == 0) {
            return qVar.getString(R.string.audio_duration_seconds_format, Integer.valueOf(i3));
        }
        if (i3 == 0) {
            return qVar.getString(R.string.audio_duration_minutes_format, Integer.valueOf(i2));
        }
        return qVar.getString(R.string.audio_duration_minutes_format, Integer.valueOf(i2)) + qVar.getString(R.string.audio_duration_seconds_format, Integer.valueOf(i3));
    }

    public static String gvn7(String url) {
        String strReplaceAll = f16376p.get(url);
        if (TextUtils.isEmpty(strReplaceAll)) {
            String str = InterfaceC1925p.rkfn;
            if (url.startsWith(str)) {
                strReplaceAll = url.substring(str.length()).replaceAll("/", "_");
            } else {
                strReplaceAll = url.split("/")[r0.length - 1];
            }
            while (strReplaceAll.length() > 48) {
                strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() / 2) + strReplaceAll.hashCode();
            }
            f16376p.put(url, strReplaceAll);
        }
        return strReplaceAll;
    }

    /* JADX INFO: renamed from: h */
    public static int m9671h(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.resource_list_vertical_offset_from_top);
    }

    public static void hb(com.android.thememanager.fu4 resContext, Intent intent) {
        if (resContext == null || intent == null || intent.getStringExtra("REQUEST_RESOURCE_CODE") != null) {
            return;
        }
        for (String str : com.android.thememanager.fu4.REQUEST_RES_PASS_EXTRA_ARRAY) {
            if (intent.getSerializableExtra(str) == null && resContext.getExtraMeta(str) != null) {
                intent.putExtra(str, resContext.getExtraMeta(str));
            }
        }
        intent.putExtra("REQUEST_RESOURCE_CODE", resContext.getResourceCode());
    }

    public static boolean hyr(String localId) {
        return com.android.thememanager.basemodule.resource.constants.toq.lb8.equals(localId);
    }

    /* JADX INFO: renamed from: i */
    public static List<String> m9672i(Resource resourceItem, com.android.thememanager.fu4 resContext) {
        ArrayList arrayList = new ArrayList();
        Uri uriM7045q = com.android.thememanager.basemodule.utils.ek5k.m7045q(new ResourceResolver(resourceItem, resContext).getContentPath());
        String qVar = com.android.thememanager.basemodule.utils.ek5k.toq(uriM7045q);
        if (!TextUtils.isEmpty(qVar)) {
            arrayList.add(qVar);
        } else if (!resourceItem.getThumbnails().isEmpty()) {
            String onlinePath = resourceItem.getThumbnails().get(0).getOnlinePath();
            if (onlinePath != null) {
                arrayList.add(onlinePath);
            }
        } else if (C1902k.ac.equals(resourceItem.getLocalId())) {
            String path = ExtraRingtoneManager.getDefaultSoundInternalUri(ExtraRingtoneManager.getDefaultSoundType(uriM7045q)).getPath();
            if (new File(path).exists()) {
                arrayList.add(path);
            }
        }
        return arrayList;
    }

    public static Pair<String, String> i1(String title) {
        if (title == null) {
            return new Pair<>("", "");
        }
        String strSubstring = null;
        int iIndexOf = title.indexOf(com.android.thememanager.basemodule.resource.constants.toq.n96);
        if (iIndexOf > 0) {
            String strSubstring2 = title.substring(0, iIndexOf);
            strSubstring = title.substring(iIndexOf + 3);
            title = strSubstring2;
        }
        return new Pair<>(title, strSubstring);
    }

    /* JADX INFO: renamed from: j */
    public static Pair<Boolean, Integer> m9673j(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f16382z, 0);
        return new Pair<>(Boolean.valueOf(sharedPreferences.getBoolean(f16378r, false)), Integer.valueOf(sharedPreferences.getInt(f16380t, 0)));
    }

    public static String jk() {
        if (TextUtils.isEmpty(f16377q)) {
            f16377q = Integer.toHexString(C2082k.zy().toq().getResources().getColor(R.color.theme_tab_actionbar_bg_color_theme)).substring(2);
        }
        return f16377q;
    }

    public static Pair<Integer, Integer> jp0y(Context context, boolean online, @zy.fu4 int previewRatio) {
        int i2 = online ? R.fraction.resource_online_detail_preview_width_ratio : R.fraction.resource_local_detail_preview_width_ratio;
        Point pointZurt = com.android.thememanager.basemodule.utils.y9n.zurt();
        Resources resources = context.getResources();
        int i3 = pointZurt.x;
        int fraction = (int) resources.getFraction(i2, i3, i3);
        int fraction2 = (int) context.getResources().getFraction(R.fraction.resource_preview_ratio, fraction, fraction);
        if (previewRatio == R.fraction.resource_preview_ratio_18_9) {
            fraction = fraction2 >> 1;
        }
        return new Pair<>(Integer.valueOf(fraction), Integer.valueOf(fraction2));
    }

    public static int ki(Context context, int buttonNum) {
        return buttonNum == 3 ? context.getResources().getDimensionPixelSize(R.dimen.resource_recommend_multiple_button_gap_three_item) : context.getResources().getDimensionPixelSize(R.dimen.resource_recommend_multiple_button_gap_default);
    }

    public static int kja0(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.resource_list_vertical_offset_from_bottom);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m9675l(String path) {
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (path != null) {
            if (!path.startsWith(absolutePath + "/DCIM")) {
                if (!path.startsWith(absolutePath + "/Pictures")) {
                    if (path.startsWith(absolutePath + "/Download")) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String ld6(InputStream is) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i2 = is.read(bArr);
                if (i2 < 0) {
                    return new String(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    public static boolean lrht(String path) {
        return path != null && path.startsWith("/system/media/audio/alarms");
    }

    public static void lv5(Context context, int updateResourceCnt, boolean canShown) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f16382z, 0).edit();
        editorEdit.clear();
        editorEdit.putInt(f16380t, updateResourceCnt);
        editorEdit.putBoolean(f16378r, canShown);
        editorEdit.apply();
    }

    public static void lvui(boolean forceImport) {
        boolean z2 = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).getBoolean(f16371g, false);
        if (com.android.thememanager.basemodule.utils.o1t.cdj()) {
            if (z2 && !forceImport) {
                String string = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).getString(f16381y, "");
                if (TextUtils.equals(string, f16379s)) {
                    Log.d(f16374k, "importPresetFont: font file has deleted！");
                    return;
                } else if (TextUtils.equals(m9683t(new File(InterfaceC1789q.ogyu)), string)) {
                    Log.d(f16374k, "importPresetFont: font file not change");
                    return;
                } else {
                    C6002g.m22240g(new zy(null));
                    return;
                }
            }
            com.android.thememanager.fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g("fonts");
            Resource resource = new Resource();
            resource.setDownloadPath(InterfaceC1789q.ogyu);
            resource.setLocalId(com.android.thememanager.basemodule.resource.constants.toq.lb8);
            resource.setAssemblyId(com.android.thememanager.basemodule.resource.constants.toq.lb8);
            resource.setCategory("Font");
            resource.setProductPrice(0);
            String metaPath = new ResourceResolver(resource, fu4VarM10535g).getMetaPath();
            if (new File(InterfaceC1789q.ogyu).exists() && !new File(metaPath).exists()) {
                C2082k.zy().f7l8().m9771t(fu4VarM10535g, resource);
                Log.i(f16374k, "import Preset Font done");
            } else {
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).edit();
                editorEdit.putBoolean(f16371g, true);
                editorEdit.apply();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private static void m9676m(String path, C2769q cache) {
        synchronized (f16372h) {
            f16372h.put(path, cache);
        }
    }

    public static String mcp(String filePath) {
        String strLd6 = C1821p.ld6(filePath);
        int iLastIndexOf = strLd6.lastIndexOf(".");
        return iLastIndexOf > -1 ? strLd6.substring(0, iLastIndexOf) : strLd6;
    }

    /* JADX INFO: renamed from: n */
    public static String m9677n(String origin) {
        return (TextUtils.isEmpty(origin) || !origin.startsWith(InterfaceC1789q.qf)) ? origin : m9678o(origin.replace(InterfaceC1789q.qf, InterfaceC1789q.dgf));
    }

    public static boolean n5r1(String path) {
        return path != null && path.startsWith(com.android.thememanager.basemodule.resource.constants.toq.w1k2);
    }

    public static int n7h(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.list_thumbnail_gap);
    }

    public static boolean ncyb(String path) {
        return path != null && path.startsWith("/data");
    }

    public static int ni7(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.recommend_thumbnail_gap);
    }

    public static void nmn5(String zipPath, String targetFolder, String matchPrefix, InterfaceC2766g listner) throws Throwable {
        ZipFile zipFile;
        ZipFile zipFile2 = null;
        try {
            zipFile = new ZipFile(zipPath);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            new File(targetFolder).mkdirs();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                if (!name.contains("../") && name.startsWith(matchPrefix)) {
                    if (URLDecoder.decode(name, com.xiaomi.accountsdk.request.wvg.f72949toq).contains("../")) {
                        Log.w(f16374k, "suspect to be a hack act when unzip");
                    } else {
                        String str = targetFolder + name;
                        if (zipEntryNextElement.isDirectory()) {
                            new File(str).mkdirs();
                        } else {
                            String strM9684u = m9684u(zipFile.getInputStream(zipEntryNextElement), str, listner != null);
                            if (listner != null) {
                                listner.mo7497k(str, zipEntryNextElement.getCompressedSize(), strM9684u);
                            }
                        }
                    }
                }
            }
            com.android.thememanager.basemodule.utils.y9n.m7246g(zipFile);
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            com.android.thememanager.basemodule.utils.y9n.m7246g(zipFile2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void nn86(Context context, DialogInterface dialogInterface, int i2) {
        Intent intent = new Intent("android.settings.XIAOMI_ACCOUNT_SYNC_SETTINGS");
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: o */
    public static String m9678o(String path) {
        return path.startsWith(com.android.thememanager.basemodule.resource.constants.toq.y1e) ? path.replace(com.android.thememanager.basemodule.resource.constants.toq.x3b5, com.android.thememanager.controller.online.ld6.o1t()) : path;
    }

    public static Pair<Integer, Integer> o1t(Context context) {
        int i2 = com.android.thememanager.basemodule.utils.y9n.zurt().x;
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf((int) context.getResources().getFraction(R.fraction.resource_detail_header_desc_pic_width_ratio, i2, i2)));
    }

    public static View oc(int displayType, LayoutInflater inflater) {
        switch (displayType) {
            case 1:
                return inflater.inflate(R.layout.resource_item_horizontal, (ViewGroup) null);
            case 2:
                View viewInflate = inflater.inflate(R.layout.resource_item_horizontal_music, (ViewGroup) null);
                C6077k.n7h(viewInflate);
                C6077k.ni7(viewInflate.findViewById(R.id.operatorBtn));
                return viewInflate;
            case 3:
            case 8:
                return inflater.inflate(R.layout.resource_item_vertical_flat_big, (ViewGroup) null);
            case 4:
                View viewInflate2 = inflater.inflate(R.layout.resource_item_horizontal_font, (ViewGroup) null);
                C6077k.n7h(viewInflate2);
                return viewInflate2;
            case 5:
                View viewInflate3 = inflater.inflate(R.layout.resource_item_vertical_flat_big_icon, (ViewGroup) null);
                C6077k.mcp(viewInflate3);
                return viewInflate3;
            case 6:
                return inflater.inflate(R.layout.resource_item_vertical, (ViewGroup) null);
            case 7:
                View viewInflate4 = inflater.inflate(R.layout.resource_item_vertical_text, (ViewGroup) null);
                C6077k.mcp(viewInflate4);
                return viewInflate4;
            case 9:
                View viewInflate5 = inflater.inflate(R.layout.resource_item_vertical_image, (ViewGroup) null);
                C6077k.mcp(viewInflate5);
                return viewInflate5;
            case 10:
                View viewInflate6 = inflater.inflate(R.layout.resource_item_aod, (ViewGroup) null);
                C6077k.mcp(viewInflate6);
                return viewInflate6;
            case 11:
                return inflater.inflate(R.layout.common_item_widget_suit, (ViewGroup) null);
            case 12:
                View viewInflate7 = inflater.inflate(R.layout.common_item_large_icon, (ViewGroup) null);
                C6077k.mcp(viewInflate7);
                return viewInflate7;
            default:
                return inflater.inflate(com.android.thememanager.ni7.m8426q(displayType), (ViewGroup) null);
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m9679p(String videoPath) {
        String str = C1788k.f10169e;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        String str2 = str + C1821p.ld6(videoPath) + com.android.thememanager.basemodule.resource.constants.toq.ybu;
        File file2 = new File(str2);
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        Bitmap qVar = com.android.thememanager.basemodule.video.f7l8.toq(videoPath, -1L, 2);
        return qVar != null ? com.android.thememanager.v9.toq.m10205k(qVar, str2) : "";
    }

    /* JADX INFO: renamed from: q */
    public static String m9680q(String title, String id) {
        if (title == null || !title.contains("?")) {
            return title + com.android.thememanager.basemodule.resource.constants.toq.n96 + id;
        }
        return title.replace("?", C5658n.f73185t8r) + com.android.thememanager.basemodule.resource.constants.toq.n96 + id;
    }

    public static String qrj(String ringtonePath, int current, int total) {
        int iLastIndexOf = ringtonePath.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            iLastIndexOf = ringtonePath.length();
        }
        return String.format("%s (%d/%d)", ringtonePath.substring(ringtonePath.lastIndexOf(File.separatorChar) + 1, iLastIndexOf), Integer.valueOf(current + 1), Integer.valueOf(total));
    }

    /* JADX INFO: renamed from: r */
    public static boolean m9681r(String path) {
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return ThemeBackupAgent.f57408kja0.equals(path) || ThemeBackupAgent.f9617h.equals(path) || ThemeBackupAgent.f9620p.equals(path) || ThemeBackupAgent.f9622s.equals(path) || ThemeBackupAgent.f57405cdj.equals(path) || ThemeBackupAgent.f57414x2.equals(path) || ThemeBackupAgent.f57409ld6.equals(path);
    }

    /* JADX INFO: renamed from: s */
    public static String m9682s(ResourceLocalProperties.ResourceStorageType resourceStorageType, String relativeFolder, String defaultFolder) {
        if (resourceStorageType == ResourceLocalProperties.ResourceStorageType.PRECUST) {
            return com.android.thememanager.basemodule.resource.constants.toq.anfo + relativeFolder;
        }
        if (resourceStorageType == ResourceLocalProperties.ResourceStorageType.DATA) {
            return (com.android.thememanager.basemodule.resource.constants.toq.y1e + relativeFolder).replace(com.android.thememanager.basemodule.resource.constants.toq.x3b5, com.android.thememanager.controller.online.ld6.o1t());
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

    /* JADX INFO: renamed from: t */
    public static String m9683t(File file) {
        return CoderUtils.encodeMD5(String.valueOf(file.length()) + String.valueOf(file.lastModified()));
    }

    public static String t8iq(InputStream is, String filename) {
        return m9684u(is, filename, false);
    }

    public static int t8r() {
        return 5;
    }

    public static String toq(String path) {
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        return HashUtils.getSHA1(new File(path));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m9684u(java.io.InputStream r6, java.lang.String r7, boolean r8) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d
            java.io.File r2 = r1.getParentFile()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d
            r3 = -1
            r4 = 509(0x1fd, float:7.13E-43)
            com.android.thememanager.basemodule.utils.C1821p.qrj(r2, r4, r3, r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d
            if (r8 == 0) goto L2f
            java.lang.String r6 = "SHA1"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.security.DigestInputStream r8 = new java.security.DigestInputStream     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L29
            r8.<init>(r2, r6)     // Catch: java.lang.Exception -> L26 java.lang.Throwable -> L29
            r5 = r8
            r8 = r6
            r6 = r5
            goto L31
        L26:
            r7 = move-exception
            r8 = r6
            goto L2d
        L29:
            r6 = move-exception
            goto L61
        L2b:
            r7 = move-exception
            r8 = r0
        L2d:
            r6 = r2
            goto L4f
        L2f:
            r8 = r0
            r6 = r2
        L31:
            com.android.thememanager.basemodule.utils.C1821p.zy(r7, r4)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L49
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L49
            r2.<init>(r7)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L49
            com.android.thememanager.basemodule.utils.C1821p.f7l8(r6, r2)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L49
            com.android.thememanager.basemodule.utils.C1821p.zy(r7, r4)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L49
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L49
            r1.setLastModified(r2)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L49
            goto L52
        L47:
            r7 = move-exception
            goto L4f
        L49:
            r7 = move-exception
            r2 = r6
            r6 = r7
            goto L61
        L4d:
            r7 = move-exception
            r8 = r0
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L49
        L52:
            com.android.thememanager.basemodule.utils.y9n.m7246g(r6)
            if (r8 != 0) goto L58
            goto L60
        L58:
            byte[] r6 = r8.digest()
            java.lang.String r0 = miui.util.HashUtils.toHexString(r6)
        L60:
            return r0
        L61:
            com.android.thememanager.basemodule.utils.y9n.m7246g(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.ch.m9684u(java.io.InputStream, java.lang.String, boolean):java.lang.String");
    }

    public static boolean uv6(String path) {
        return C1792n.m6932e(path);
    }

    public static boolean vyq(String path) {
        return C1792n.nn86(path);
    }

    public static String wvg(String path) {
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        File file = new File(path);
        C2769q c2769q = f16372h.get(path);
        if (c2769q == null || file.lastModified() != c2769q.mModified || file.length() != c2769q.mSize) {
            c2769q = new C2769q(file, HashUtils.getSHA1(new File(path)));
            m9676m(path, c2769q);
        }
        return c2769q.mHash;
    }

    /* JADX INFO: renamed from: x */
    public static void m9685x(String zipPath, String targetFolder) throws Throwable {
        zp(zipPath, targetFolder, com.android.thememanager.basemodule.resource.constants.toq.q28p);
    }

    public static int x2(int displayType) {
        switch (displayType) {
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 10:
            case 11:
            case 12:
                return 2;
            case 6:
            case 7:
            case 8:
            case 9:
                return 3;
            default:
                return com.android.thememanager.ni7.toq(displayType);
        }
    }

    public static boolean x9kr(Resource resource, com.android.thememanager.fu4 resourceContext, Context context) {
        if (context == null) {
            return false;
        }
        String metaPath = new ResourceResolver(resource, resourceContext).getMetaPath();
        return metaPath != null && metaPath.equals(bwp.m9634s(context, bwp.n7h(resourceContext)));
    }

    /* JADX INFO: renamed from: y */
    public static String m9686y(Context context, int price) {
        String strSubstring;
        if (price == 0) {
            return context.getString(R.string.resource_price_free);
        }
        if (price % 100 == 0) {
            strSubstring = String.valueOf(price / 100);
        } else {
            strSubstring = String.format("%.2f", Float.valueOf(price / 100.0f));
            while (strSubstring.charAt(strSubstring.length() - 1) == '0') {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            if (strSubstring.charAt(strSubstring.length() - 1) == '.') {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
        }
        return strSubstring + context.getString(R.string.resource_price_unit);
    }

    public static void y9n(@zy.lvui final Context context) {
        new ki.C6947k(context).fu4(R.string.to_activate_the_account).dd(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.util.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ch.nn86(context, dialogInterface, i2);
            }
        }).mcp(android.R.string.cancel, null).hb();
    }

    public static void yz(final Activity activity) {
        new ki.C6947k(activity).fu4(R.string.to_activate_the_account).dd(android.R.string.ok, new toq(activity)).mcp(android.R.string.cancel, null).hb();
    }

    /* JADX INFO: renamed from: z */
    public static int m9687z(Context context) {
        if (context == null) {
            context = bf2.toq.toq();
        }
        return context.getResources().getDimensionPixelSize(R.dimen.default_horizontal_offset_from_screen);
    }

    public static void zp(String zipPath, String targetFolder, String module) throws Throwable {
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(zipPath);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                new File(targetFolder).mkdirs();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    if (!name.contains("../")) {
                        if (URLDecoder.decode(name, com.xiaomi.accountsdk.request.wvg.f72949toq).contains("../")) {
                            Log.w(f16374k, "suspect to be a hack act when unzip");
                        } else if (name.contains(module) && !zipEntryNextElement.isDirectory()) {
                            m9684u(zipFile2.getInputStream(zipEntryNextElement), targetFolder, false);
                        }
                    }
                }
                com.android.thememanager.basemodule.utils.y9n.m7246g(zipFile2);
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                com.android.thememanager.basemodule.utils.y9n.m7246g(zipFile);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int zurt(Context context) {
        int iM9687z = m9687z(context);
        int iFn3e = fn3e();
        return ((com.android.thememanager.basemodule.utils.y9n.zurt().x - (iM9687z * 2)) - (ni7(context) * (iFn3e - 1))) / iFn3e;
    }

    @zy.y9n
    public static void zy() {
        com.android.thememanager.fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g("fonts");
        com.android.thememanager.controller.x2 x2Var = new com.android.thememanager.controller.x2(fu4VarM10535g);
        Resource resourceQrj = x2Var.m7690k().qrj(com.android.thememanager.basemodule.resource.constants.toq.lb8);
        if (resourceQrj == null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).edit();
            editorEdit.putString(f16381y, f16379s);
            editorEdit.apply();
            Log.d(f16374k, "CheckPresetFontUpdate: font resource is null");
            return;
        }
        ResourceResolver resourceResolver = new ResourceResolver(resourceQrj, fu4VarM10535g);
        String contentPath = resourceResolver.getContentPath();
        String str = resourceResolver.getDownloadFolder() + com.android.thememanager.basemodule.resource.constants.toq.ytul + resourceQrj.getLocalId() + com.android.thememanager.basemodule.resource.constants.toq.vm8;
        try {
            m9665a(InterfaceC1789q.ogyu, str);
            String sha1 = HashUtils.getSHA1(new File(str));
            String sha12 = HashUtils.getSHA1(new File(contentPath));
            Log.d(f16374k, "CheckPresetFontUpdate: pre update MiLanPro font  " + sha1 + " " + sha12);
            boolean zEquals = TextUtils.equals(sha1, sha12);
            boolean z2 = true;
            if (!zEquals) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(resourceQrj);
                boolean zJp0y = x2Var.m7690k().jp0y(arrayList);
                String rightsPath = resourceResolver.getRightsPath();
                if (!TextUtils.isEmpty(rightsPath) && new File(rightsPath).exists()) {
                    zJp0y = C1821p.cdj(rightsPath) && zJp0y;
                }
                Log.d(f16374k, "old MiLanPro font delete result：" + zJp0y);
                if (zJp0y) {
                    lvui(true);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).edit();
                editorEdit2.putString(f16381y, m9683t(new File(InterfaceC1789q.ogyu)));
                editorEdit2.apply();
            }
        } catch (Exception e2) {
            Log.e(f16374k, "CheckPresetFontUpdate error:", e2);
        } finally {
            C1821p.cdj(str);
        }
    }
}
