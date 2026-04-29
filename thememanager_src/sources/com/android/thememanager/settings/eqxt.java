package com.android.thememanager.settings;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.model.PrecustSystemWallpaperInfo;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.detail.entity.VideoInfoUtils;
import com.android.thememanager.util.ek5k;
import com.android.thememanager.util.uc;
import com.google.gson.C4871g;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import yz.C7794k;
import zy.y9n;

/* JADX INFO: compiled from: WallpaperLoadHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class eqxt {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f60778f7l8 = "support_super_wallpaper";

    /* JADX INFO: renamed from: g */
    public static final String f14998g = "preview";

    /* JADX INFO: renamed from: k */
    private static final String f14999k = "WallpaperLoadHelper";

    /* JADX INFO: renamed from: n */
    public static final String f15000n = "super_wallpaper_num";

    /* JADX INFO: renamed from: q */
    public static final String f15001q = "IS_SUPPORT_MAML_SUPER_WALLPAPER";

    /* JADX INFO: renamed from: s */
    private static volatile Boolean f15002s = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60779toq = "content://com.miui.miwallpaper.wallpaper";

    /* JADX INFO: renamed from: y */
    private static final String f15003y = "wallpaper_config.json";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f60780zy = "GET_SUPPORT_SUPER_WALLPAPER";

    @zy.dd
    @y9n
    public static List<Resource> cdj(@zy.lvui String title) {
        for (com.android.thememanager.settings.subsettings.f7l8 f7l8Var : t8r(false, false)) {
            if (title.equals(f7l8Var.f15454q)) {
                return f7l8Var.f60866zy;
            }
        }
        return null;
    }

    public static boolean f7l8() {
        if (f15002s == null || (o1t.C1820k.m7181n() > o1t.C1820k.f10389g && !f15002s.booleanValue())) {
            synchronized (eqxt.class) {
                if (f15002s == null) {
                    f15002s = Boolean.valueOf(m9005y());
                }
            }
        }
        return f15002s.booleanValue();
    }

    private static boolean fn3e() {
        return !Arrays.asList("olive", "olivelite", "pine", "lime", "nabu").contains(Build.DEVICE) && com.android.thememanager.basemodule.utils.qrj.m7199q(qrj.toq.VIDEO_WALLPAPER);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8997g(String path) {
        return C1792n.nn86(path) || C1792n.hyr(path);
    }

    @zy.dd
    @y9n
    /* JADX INFO: renamed from: h */
    public static List<Resource> m8998h(@zy.lvui String title) {
        for (com.android.thememanager.settings.subsettings.f7l8 f7l8Var : kja0(false, false)) {
            if (title.equals(f7l8Var.f15454q)) {
                return f7l8Var.f60866zy;
            }
        }
        return null;
    }

    @zy.lvui
    @y9n
    /* JADX INFO: renamed from: i */
    public static List<Resource> m8999i(boolean isVideo, com.android.thememanager.fu4 resContext) {
        ArrayList arrayList = new ArrayList();
        if (!isVideo) {
            for (Resource resource : C2082k.zy().m8001n().ld6(resContext).m7690k().mo7474h(false)) {
                if (ld6(new ResourceResolver(resource, resContext).getMetaPath())) {
                    resource.setCategory("wallpaper");
                    arrayList.add(resource);
                }
            }
            return uc.uv6(arrayList, resContext);
        }
        for (VideoInfo videoInfo : VideoInfoUtils.fetchDynamicVideoInfo()) {
            if (m8997g(videoInfo.path)) {
                Resource resourceM9003q = m9003q(videoInfo);
                resourceM9003q.setCategory(InterfaceC1789q.y6);
                arrayList.add(resourceM9003q);
            }
        }
        for (VideoInfo videoInfo2 : VideoInfoUtils.fetchVideoInfo(true, false)) {
            if (m8997g(videoInfo2.path)) {
                Resource resourceM9003q2 = m9003q(videoInfo2);
                resourceM9003q2.setCategory("videowallpaper");
                arrayList.add(resourceM9003q2);
            }
        }
        return arrayList;
    }

    @zy.lvui
    @y9n
    public static List<com.android.thememanager.settings.subsettings.f7l8> ki(boolean withSlideCount, boolean parseOrder) {
        File[] fileArr;
        com.android.thememanager.settings.subsettings.f7l8 f7l8VarM9001n;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = new File(com.android.thememanager.basemodule.resource.constants.toq.trbh).listFiles(new FileFilter() { // from class: com.android.thememanager.settings.oc
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return eqxt.qrj(file);
            }
        });
        if (fileArrListFiles == null) {
            return arrayList;
        }
        Arrays.sort(fileArrListFiles);
        boolean zFn3e = fn3e();
        C4871g c4871g = new C4871g();
        int length = fileArrListFiles.length;
        int i2 = 0;
        while (i2 < length) {
            File file = new File(fileArrListFiles[i2].getAbsolutePath(), f15003y);
            try {
                String qVar = ek5k.toq(file);
                String parent = file.getParent();
                PrecustSystemWallpaperInfo.Group group = (PrecustSystemWallpaperInfo.Group) c4871g.n7h(qVar, PrecustSystemWallpaperInfo.Group.class);
                if (group == null || group.wallpapers == null || (group.conflictWithSuperWallpaper && f7l8())) {
                    fileArr = fileArrListFiles;
                } else if (m9004s(group)) {
                    com.android.thememanager.settings.subsettings.f7l8 f7l8Var = new com.android.thememanager.settings.subsettings.f7l8(2, group.cardType == 1 ? 10 : 11);
                    String strCdj = TextUtils.isEmpty(group.titleResId) ? null : C1792n.cdj(group.titleResId);
                    if (TextUtils.isEmpty(strCdj)) {
                        strCdj = group.title;
                    }
                    f7l8Var.f15454q = strCdj;
                    String strCdj2 = TextUtils.isEmpty(group.subtitleResId) ? null : C1792n.cdj(group.subtitleResId);
                    if (TextUtils.isEmpty(strCdj2)) {
                        strCdj2 = group.subtitle;
                    }
                    f7l8Var.f15452n = strCdj2;
                    f7l8Var.f15456y = group.count;
                    f7l8Var.f60862f7l8 = group.mixed;
                    f7l8Var.f60866zy = new ArrayList();
                    PrecustSystemWallpaperInfo.PreWallpaper[] preWallpaperArr = group.wallpapers;
                    int length2 = preWallpaperArr.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            fileArr = fileArrListFiles;
                            break;
                        }
                        PrecustSystemWallpaperInfo.PreWallpaper preWallpaper = preWallpaperArr[i3];
                        if (zFn3e) {
                            fileArr = fileArrListFiles;
                        } else {
                            fileArr = fileArrListFiles;
                            if ("videowallpaper".equals(preWallpaper.type)) {
                                continue;
                            }
                            i3++;
                            fileArrListFiles = fileArr;
                        }
                        Resource wallpaper = preWallpaper.toWallpaper(parent);
                        wallpaper.getLocalInfo().setTitle(f7l8Var.f15454q);
                        f7l8Var.f60866zy.add(wallpaper);
                        i4++;
                        if (withSlideCount && i4 >= group.slideCount) {
                            break;
                        }
                        i3++;
                        fileArrListFiles = fileArr;
                    }
                    if (f7l8Var.f60866zy.size() > 0 && group.randomOrder && parseOrder) {
                        Collections.shuffle(f7l8Var.f60866zy);
                    }
                    if (f7l8Var.f60866zy.size() > 0) {
                        if (o1t.C1820k.zy(o1t.C1820k.f10392p) && (f7l8VarM9001n = m9001n(arrayList, f7l8Var.f15454q)) != null) {
                            if (C1807g.jp0y()) {
                                if (!"wallpaper".equals(f7l8VarM9001n.f60866zy.get(0).getCategory())) {
                                    arrayList.remove(f7l8VarM9001n);
                                }
                            } else if ("wallpaper".equals(f7l8VarM9001n.f60866zy.get(0).getCategory())) {
                                arrayList.remove(f7l8VarM9001n);
                            }
                        }
                        arrayList.add(f7l8Var);
                    }
                } else {
                    Log.i(f14999k, "loadSystemWallpaperGroup: find not support wallpaper");
                    fileArr = fileArrListFiles;
                }
                i2++;
                fileArrListFiles = fileArr;
            } catch (IOException | JSONException e2) {
                C7794k.m28196p(f14999k, "getJsonFrom fail:" + e2);
            }
        }
        return arrayList;
    }

    public static List<com.android.thememanager.settings.subsettings.f7l8> kja0(boolean withSlideCount, boolean parseOrder) throws Throwable {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = new File(com.android.thememanager.basemodule.resource.constants.toq.kqo).listFiles(new FileFilter() { // from class: com.android.thememanager.settings.d3
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return eqxt.x2(file);
            }
        });
        if (fileArrListFiles == null) {
            return arrayList;
        }
        Arrays.sort(fileArrListFiles);
        C4871g c4871g = new C4871g();
        String qVar = "";
        for (File file : fileArrListFiles) {
            File file2 = new File(file.getAbsolutePath(), f15003y);
            try {
                qVar = ek5k.toq(file2);
            } catch (IOException | JSONException e2) {
                C7794k.m28196p(f14999k, "getJsonFrom fail:" + e2);
            }
            String parent = file2.getParent();
            PrecustSystemWallpaperInfo.Group group = (PrecustSystemWallpaperInfo.Group) c4871g.n7h(qVar, PrecustSystemWallpaperInfo.Group.class);
            if (group != null && group.wallpapers != null && (!group.conflictWithSuperWallpaper || !f7l8())) {
                com.android.thememanager.settings.subsettings.f7l8 f7l8Var = new com.android.thememanager.settings.subsettings.f7l8(8, group.cardType == 1 ? 10 : 11);
                f7l8Var.f15454q = bf2.toq.toq().getResources().getString(R.string.fold_sensor_video_wallpaper_group);
                f7l8Var.f15456y = group.count;
                f7l8Var.f60862f7l8 = group.mixed;
                f7l8Var.f60866zy = new ArrayList();
                int i2 = 0;
                for (PrecustSystemWallpaperInfo.PreWallpaper preWallpaper : group.wallpapers) {
                    Resource wallpaper = preWallpaper.toWallpaper(parent);
                    wallpaper.getLocalInfo().setTitle(f7l8Var.f15454q);
                    f7l8Var.f60866zy.add(wallpaper);
                    i2++;
                    if (withSlideCount && i2 >= group.slideCount) {
                        break;
                    }
                }
                if (f7l8Var.f60866zy.size() > 0 && group.randomOrder && parseOrder) {
                    Collections.shuffle(f7l8Var.f60866zy);
                }
                arrayList.add(f7l8Var);
            }
        }
        return arrayList;
    }

    public static boolean ld6(String metaPath) {
        return (TextUtils.isEmpty(metaPath) || !m8997g(metaPath) || metaPath.startsWith(com.android.thememanager.basemodule.resource.constants.toq.trbh) || zsr0.toq.f7l8(metaPath)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    private static com.android.thememanager.settings.subsettings.f7l8 m9001n(List<com.android.thememanager.settings.subsettings.f7l8> list, String title) {
        for (com.android.thememanager.settings.subsettings.f7l8 f7l8Var : list) {
            if (TextUtils.equals(f7l8Var.f15454q, title)) {
                return f7l8Var;
            }
        }
        return null;
    }

    @zy.dd
    private static com.android.thememanager.settings.subsettings.f7l8 n7h(boolean withSlideCount) {
        com.android.thememanager.settings.subsettings.f7l8 f7l8Var = new com.android.thememanager.settings.subsettings.f7l8(2, 10);
        Context qVar = bf2.toq.toq();
        com.android.thememanager.fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g("wallpaper");
        f7l8Var.f60866zy = m8999i(false, fu4VarM10535g);
        List<Resource> listM8999i = m8999i(true, fu4VarM10535g);
        boolean z2 = f7l8Var.f60866zy.size() > 0;
        boolean z3 = listM8999i.size() > 0;
        if (z3) {
            f7l8Var.f60866zy.addAll(listM8999i);
        }
        f7l8Var.f60862f7l8 = z2 && z3;
        f7l8Var.f15454q = qVar.getString(R.string.more_system_wallpaper);
        int size = f7l8Var.f60866zy.size();
        f7l8Var.f15456y = size;
        if (size > 6 && withSlideCount) {
            f7l8Var.f60866zy = f7l8Var.f60866zy.subList(0, 6);
        }
        if (f7l8Var.f60866zy.size() < 1) {
            return null;
        }
        return f7l8Var;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m9002p() {
        return zy(f15001q);
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    private static Resource m9003q(@zy.lvui VideoInfo videoInfo) {
        Resource resource = new Resource();
        resource.getLocalInfo().setTitle(videoInfo.name);
        resource.setContentPath(videoInfo.path);
        return resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean qrj(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (f15003y.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m9004s(PrecustSystemWallpaperInfo.Group group) {
        if (com.android.thememanager.basemodule.utils.y9n.mcp(group.supportHWVersion)) {
            return true;
        }
        return group.supportHWVersion.contains(C1807g.m7082s());
    }

    @zy.lvui
    @y9n
    public static List<com.android.thememanager.settings.subsettings.f7l8> t8r(boolean withSlideCount, boolean parseOrder) {
        List<com.android.thememanager.settings.subsettings.f7l8> listKi = ki(withSlideCount, parseOrder);
        com.android.thememanager.settings.subsettings.f7l8 f7l8VarN7h = n7h(withSlideCount);
        if (f7l8VarN7h != null) {
            listKi.add(f7l8VarN7h);
        }
        return listKi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean x2(File file) {
        String[] list;
        if (com.android.thememanager.basemodule.resource.constants.toq.y9.equals(file.getAbsolutePath()) || (list = file.list()) == null) {
            return false;
        }
        for (String str : list) {
            if (f15003y.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m9005y() {
        return zy(f60780zy);
    }

    private static boolean zy(String method) throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Context qVar = bf2.toq.toq();
        ContentProviderClient contentProviderClient = null;
        try {
            try {
                Log.i(f14999k, "callSuperWallpaperMethod,begin acquire provider client");
                contentProviderClientAcquireUnstableContentProviderClient = qVar.getContentResolver().acquireUnstableContentProviderClient(Uri.parse(f60779toq));
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.d(f14999k, "super wallpaper provider is null ");
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                return false;
            }
            Log.i(f14999k, "callSuperWallpaperMethod: get provider success.");
            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(method, null, null);
            if (bundleCall != null) {
                boolean z2 = bundleCall.getBoolean(f60778f7l8, false);
                contentProviderClientAcquireUnstableContentProviderClient.close();
                return z2;
            }
            Log.d(f14999k, "call super wallpaper bundle is null");
            contentProviderClientAcquireUnstableContentProviderClient.close();
            return false;
        } catch (Exception e3) {
            e = e3;
            contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
            Log.e(f14999k, "call super wallpaper failed:" + e);
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
            throw th;
        }
    }
}
