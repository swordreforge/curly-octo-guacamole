package com.android.thememanager.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.FileProvider;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.detail.theme.model.ApplyThemeInfo;
import com.android.thememanager.library.util.app.C2088k;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.module.detail.util.InterfaceC2245k;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.service.ThemeSchedulerService;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import com.android.thememanager.wallpaper.C2951n;
import com.miui.maml.folme.AnimatedProperty;
import ek5k.C6002g;
import h7am.C6071k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import m4.C6795k;
import miui.content.res.ThemeResources;

/* JADX INFO: compiled from: ApplyThemeTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj extends AsyncTask<Void, Integer, Void> implements p001b.f7l8, InterfaceC1789q {

    /* JADX INFO: renamed from: a */
    private static final String f16726a = "identity";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final String f61397ab = "content://miui.keyguard.editor.templatefileprovider/thirdPartyPreviewImage";

    /* JADX INFO: renamed from: b */
    private static final String f16727b = "ApplyThemeTask";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f61398bo = "add_history";

    /* JADX INFO: renamed from: d */
    private static final String f16728d = "is_restore";

    /* JADX INFO: renamed from: u */
    private static final String f16729u = "preview";

    /* JADX INFO: renamed from: v */
    private static final String f16730v = "is_debug";

    /* JADX INFO: renamed from: w */
    private static final int f16731w = 1000;

    /* JADX INFO: renamed from: x */
    private static final String f16732x = "meta";

    /* JADX INFO: renamed from: c */
    private long f16733c;

    /* JADX INFO: renamed from: e */
    private boolean f16734e;

    /* JADX INFO: renamed from: f */
    private int f16735f;

    /* JADX INFO: renamed from: h */
    private String f16737h;

    /* JADX INFO: renamed from: i */
    @zy.dd
    private androidx.lifecycle.fti<C1723y<Integer>> f16738i;

    /* JADX INFO: renamed from: j */
    private String f16739j;

    /* JADX INFO: renamed from: k */
    private WeakReference<Activity> f16740k;

    /* JADX INFO: renamed from: l */
    private int f16741l;

    /* JADX INFO: renamed from: m */
    private boolean f16742m;

    /* JADX INFO: renamed from: n */
    private Resource f16743n;

    /* JADX INFO: renamed from: o */
    private String f16744o;

    /* JADX INFO: renamed from: p */
    private ApplyThemeInfo f16745p;

    /* JADX INFO: renamed from: q */
    private com.android.thememanager.fu4 f16746q;

    /* JADX INFO: renamed from: r */
    private androidx.lifecycle.fti<ThemeStatus> f16747r;

    /* JADX INFO: renamed from: t */
    private String f16749t;

    /* JADX INFO: renamed from: z */
    private Runnable f16751z;

    /* JADX INFO: renamed from: g */
    private Set<String> f16736g = new HashSet();

    /* JADX INFO: renamed from: y */
    private Set<String> f16750y = new HashSet();

    /* JADX INFO: renamed from: s */
    private Set<String> f16748s = new HashSet();

    /* JADX INFO: renamed from: com.android.thememanager.util.qrj$k */
    /* JADX INFO: compiled from: ApplyThemeTask.java */
    class RunnableC2804k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Activity f16752k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ boolean f16754q;

        RunnableC2804k(final Activity val$activity, final boolean val$recreate) {
            this.f16752k = val$activity;
            this.f16754q = val$recreate;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2 = C1792n.ni7(qrj.this.f16743n, "aod") || C1792n.ni7(qrj.this.f16743n, "spaod");
            boolean z3 = qrj.this.f16736g.contains("aod") || qrj.this.f16736g.contains("spaod");
            if (qrj.this.f16745p.isShowToastOfSuccess()) {
                g1.qo(true, z2, z3);
            }
            if (this.f16752k == null || this.f16754q || com.android.thememanager.basemodule.utils.y9n.vyq()) {
                return;
            }
            new RestoreHomeIconHelper(this.f16752k).x2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qrj(Activity activity, com.android.thememanager.fu4 resContext, Resource resource, ApplyThemeInfo applyThemeInfo) {
        this.f16740k = new WeakReference<>(activity);
        this.f16746q = resContext;
        this.f16743n = resource;
        this.f16745p = applyThemeInfo;
        this.f16737h = applyThemeInfo.getApplyThemeMessage();
        this.f16749t = applyThemeInfo.getThemeUsingType();
        String resourceCode = resContext.getResourceCode();
        this.f16739j = resourceCode;
        if ("theme".equals(resourceCode)) {
            this.f16736g.addAll(Arrays.asList(InterfaceC1789q.bzx));
            this.f16736g.add(com.android.thememanager.basemodule.analysis.toq.lbeq);
            this.f16736g.remove("fonts");
        } else {
            this.f16736g.add(this.f16739j);
            this.f16736g.addAll(applyThemeInfo.getRelatedCodeSet());
        }
        if (applyThemeInfo.getIgnoreCodeSet() != null) {
            this.f16748s.addAll(applyThemeInfo.getIgnoreCodeSet());
            this.f16736g.removeAll(applyThemeInfo.getIgnoreCodeSet());
        }
        if (applyThemeInfo.getMixIgnoreCodeSet() != null) {
            this.f16750y.addAll(applyThemeInfo.getMixIgnoreCodeSet());
            this.f16736g.removeAll(applyThemeInfo.getMixIgnoreCodeSet());
        }
        if (activity instanceof InterfaceC2245k) {
            this.f16738i = ((InterfaceC2245k) activity).mo6346h();
            ((InterfaceC2245k) activity).ki(activity.getResources().getString(R.string.theme_changing_dialog_title) + this.f16737h);
        }
        this.f16742m = C1807g.lvui() && C1819o.m7164r(this.f16740k.get()) && (gc3c.ki(this.f16740k.get()) || this.f16740k.get() == null);
    }

    private static void cdj(List<String> deleteFilters) {
        Iterator<String> it = deleteFilters.iterator();
        while (it.hasNext()) {
            d8wk.x2(it.next());
        }
    }

    private int d2ok(int progress, int maxProgress, int increment) {
        int i2 = progress + increment;
        publishProgress(Integer.valueOf(i2), Integer.valueOf(maxProgress));
        return i2;
    }

    private static void f7l8(final String path, final String resourceCode, final Resource resource) throws Throwable {
        boolean zM8997g;
        final ThemeApplication qVar = C2082k.zy().toq();
        boolean zM8997g2 = true;
        if ("wallpaper".equals(resourceCode)) {
            if (TextUtils.isEmpty(path)) {
                path = uc.f16830q;
            } else {
                zM8997g2 = com.android.thememanager.settings.eqxt.m8997g(path);
            }
            if (zM8997g2) {
                uc.kja0(qVar, path, null, null, false, false, false, null, null);
                return;
            } else {
                uc.f7l8(qVar, path, null);
                return;
            }
        }
        if ("lockscreen".equals(resourceCode)) {
            if (TextUtils.isEmpty(path)) {
                path = uc.f16830q;
                zM8997g = true;
            } else {
                zM8997g = com.android.thememanager.settings.eqxt.m8997g(path);
            }
            if (zM8997g) {
                uc.m10024h(qVar, path, null, null, false, true, false, true, null, null, null);
                return;
            } else {
                uc.x2(qVar, path, true, null);
                return;
            }
        }
        if ("ringtone".equals(resourceCode)) {
            g1.toq(qVar, 1, path);
            return;
        }
        if (com.android.thememanager.basemodule.analysis.toq.mle.equals(resourceCode)) {
            g1.toq(qVar, 2, path);
            return;
        }
        if ("alarm".equals(resourceCode)) {
            g1.toq(qVar, 4, path);
            return;
        }
        if (C2807t.toq(resourceCode)) {
            if (resourceCode.startsWith(com.android.thememanager.basemodule.resource.constants.toq.bhh) || resourceCode.startsWith("wallpaper_")) {
                C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.util.ld6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2807t.m9996k(qVar, resourceCode, path, resource);
                    }
                });
            } else {
                C2807t.m9996k(qVar, resourceCode, path, resource);
            }
        }
    }

    private boolean fti(@zy.lvui final Set<String> flagSet) {
        if (flagSet.size() == 1 && flagSet.contains("aod")) {
            return false;
        }
        if (flagSet.size() == 1 && flagSet.contains("fonts") && this.f16751z != null) {
            Log.i(f16727b, "var fonts changed, notify already!");
        } else {
            C6002g.zurt(new Runnable() { // from class: com.android.thememanager.util.x2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16887k.mcp(flagSet);
                }
            }, 500L);
        }
        return true;
    }

    private static boolean fu4(Set<String> applyCodeSet, Set<String> mixIgnoreCodeSet) {
        boolean z2;
        if (mixIgnoreCodeSet != null && !mixIgnoreCodeSet.isEmpty()) {
            return false;
        }
        String[] strArr = InterfaceC1789q.bzx;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z2 = true;
                break;
            }
            String str = strArr[i2];
            if (!bwp.ki(str) && !applyCodeSet.contains(str)) {
                z2 = false;
                break;
            }
            i2++;
        }
        if (applyCodeSet.contains(com.android.thememanager.basemodule.analysis.toq.lbeq)) {
            return z2;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0598 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0610 A[EDGE_INSN: B:347:0x0610->B:253:0x0610 BREAK  A[LOOP:5: B:240:0x05cd->B:252:0x060d], SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m9957g(com.android.thememanager.basemodule.resource.model.Resource r21, com.android.thememanager.fu4 r22, java.util.Set<java.lang.String> r23, java.util.Set<java.lang.String> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.qrj.m9957g(com.android.thememanager.basemodule.resource.model.Resource, com.android.thememanager.fu4, java.util.Set, java.util.Set):void");
    }

    /* JADX INFO: renamed from: h */
    private void m9958h(String zhFont, String folder) {
        jk(zhFont, folder + "/DroidSansFallback-zh.ttf");
    }

    /* JADX INFO: renamed from: i */
    private static List<String> m9959i() {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (String str : new File(bf2.zy.oaex).list()) {
            if (!str.startsWith("preview") && !str.startsWith("description.xml") && !str.startsWith("fonts") && !str.startsWith(com.android.thememanager.basemodule.utils.bf2.f57718qrj) && !str.startsWith(InterfaceC1789q.dzu0) && !str.startsWith(com.android.thememanager.basemodule.utils.vyq.f10421k) && !str.startsWith(p001b.f7l8.f53796m8)) {
                String[] strArr = InterfaceC1789q.bzx;
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = true;
                        break;
                    }
                    if (str.startsWith(p001b.toq.f7l8(strArr[i2]))) {
                        z2 = false;
                        break;
                    }
                    i2++;
                }
                if (z2) {
                    arrayList.add(bf2.zy.oaex + str);
                }
            }
        }
        return arrayList;
    }

    private void jk(String oldPath, String newPath) {
        try {
            d8wk.m9701s(oldPath, newPath);
        } catch (Exception e2) {
            Log.e(f16727b, "createSymbolicLink error oldPath = " + oldPath + " newPath = " + newPath + "  " + e2);
        }
    }

    private void jp0y(boolean isMamlLockBeforeApply) {
        if (C2951n.fn3e().kja0() && !uc.lvui() && this.f16736g.contains("lockscreen") && isMamlLockBeforeApply) {
            com.android.thememanager.superwallpaper.util.toq.m9511g();
        }
        if (this.f16736g.contains(InterfaceC1789q.gx2z)) {
            for (String str : new C1795s(this.f16743n, C1791k.getTheme()).m6969q()) {
                if (str.contains(com.android.thememanager.basemodule.resource.constants.toq.gj)) {
                    if (Build.VERSION.SDK_INT < 29) {
                        return;
                    }
                    Uri uri = Uri.parse(f61397ab);
                    try {
                        if (!new File(str).exists()) {
                            return;
                        }
                        FileInputStream fileInputStream = new FileInputStream(str);
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(C2082k.m7998k().getContentResolver().openFile(uri, AnimatedProperty.PROPERTY_NAME_W, null));
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i2 = fileInputStream.read(bArr);
                            if (i2 == -1) {
                                return;
                            } else {
                                autoCloseOutputStream.write(bArr, 0, i2);
                            }
                        }
                    } catch (Exception e2) {
                        Log.e(f16727b, "notifyThirdThemeLockStyle: " + e2);
                        return;
                    }
                }
            }
        }
    }

    private boolean ki(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "device_provisioned", 0) != 0;
    }

    private void kja0(String fontDirPath) {
        File[] fileArrListFiles;
        if (fontDirPath != null) {
            if (miuix.os.f7l8.zy("ro.skia.use_data_fonts", 0) != 1 || (fileArrListFiles = new File(fontDirPath).listFiles()) == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                d8wk.x2("/data/fonts/" + file.getName());
                jk(file.getAbsolutePath(), "/data/fonts/" + file.getName());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ld6(com.android.thememanager.basemodule.resource.model.Resource r21, com.android.thememanager.fu4 r22, java.util.Set<java.lang.String> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.qrj.ld6(com.android.thememanager.basemodule.resource.model.Resource, com.android.thememanager.fu4, java.util.Set):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mcp(Set set) {
        C6795k.zy(C2088k.m8026k(), g1.o1t(set), this.f16742m);
    }

    private void n7h(String enFont, String folder) {
        String[] strArr = {"Miui-Regular.ttf", "Miui-Bold.ttf", "MiuiEx-Regular.ttf", "MiuiEx-Bold.ttf", "MiuiEx-Light.ttf", "Roboto-Italic.ttf", "Roboto-Bold.ttf", "Roboto-BoldItalic.ttf", "Roboto-Light.ttf", "Roboto-LightItalic.ttf", "Roboto-Medium.ttf", "Roboto-MediumItalic.ttf", "Roboto-Black.ttf", "Roboto-BlackItalic.ttf", "Roboto-Thin.ttf", "Roboto-ThinItalic.ttf"};
        for (int i2 = 0; i2 < 16; i2++) {
            jk(enFont, folder + "/" + strArr[i2]);
        }
        if (this.f16743n.getFontWeightList() == null || this.f16743n.getFontWeightList().size() <= 0) {
            return;
        }
        jk(enFont, folder + "/MI_Theme_VF.ttf");
    }

    private boolean ni7(String code, String path) {
        if (ch.n5r1(path)) {
            return "bootanimation".equals(code) || "bootaudio".equals(code);
        }
        return false;
    }

    private boolean o1t() {
        String resourceCode = this.f16746q.getResourceCode();
        return ("theme".equals(resourceCode) || "fonts".equals(resourceCode) || "aod".equals(resourceCode)) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    private void m9962p(String path) throws IOException {
        if (new File(path).exists()) {
            String str = ThemeResources.THEME_MAGIC_PATH + "lockscreen_audio/";
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            C1821p.qrj(file, 493, -1, -1);
            if (file.exists()) {
                ZipFile zipFile = new ZipFile(path);
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    if (!name.contains("../")) {
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(com.android.thememanager.basemodule.resource.constants.toq.pm14) || lowerCase.endsWith(".ogg") || lowerCase.endsWith(".aac") || lowerCase.endsWith(".wav") || lowerCase.endsWith(".midi")) {
                            InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                            File file2 = new File(str + name);
                            if (C1821p.qrj(file2.getParentFile(), 493, -1, -1)) {
                                C1821p.f7l8(inputStream, file2);
                                C1821p.zy(file2.getAbsolutePath(), 493);
                            }
                            miuix.core.util.f7l8.toq(inputStream);
                        }
                    }
                }
            }
        }
    }

    private void qrj(Resource resource, Set<String> applyCodeSet) {
        boolean zEquals = "theme".equals(this.f16746q.getResourceCode());
        String metaPath = new ResourceResolver(resource, this.f16746q).getMetaPath();
        boolean z2 = (resource.getLocalPlatform() > 5 || ch.vyq(metaPath) || ch.ncyb(metaPath)) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (zEquals) {
            Collections.addAll(arrayList, InterfaceC1789q.uod);
        } else {
            arrayList.addAll(applyCodeSet);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : InterfaceC1789q.uod) {
            if (arrayList.contains(str)) {
                if ("framework".equals(str)) {
                    StringBuilder sb = new StringBuilder();
                    String str2 = bf2.zy.oaex;
                    sb.append(str2);
                    sb.append(InterfaceC1789q.b4);
                    arrayList2.add(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    String str3 = bf2.zy.jyr;
                    sb2.append(str3);
                    sb2.append("android");
                    arrayList3.add(sb2.toString());
                    arrayList2.add(str2 + "framework-miui-res");
                    arrayList3.add(str3 + miuix.core.util.x2.f87403zy);
                } else {
                    String strX2 = p001b.toq.x2(str);
                    String str4 = bf2.zy.jyr + new File(strX2).getName();
                    arrayList2.add(strX2);
                    arrayList3.add(str4);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            if (z2 && (zEquals || new File((String) arrayList2.get(i2)).exists())) {
                d8wk.m9699p((String) arrayList3.get(i2));
            } else {
                d8wk.x2((String) arrayList3.get(i2));
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m9964s(Set<String> applyCodeSet) {
        if (applyCodeSet.contains("fonts")) {
            kja0("/system/fonts");
            StringBuilder sb = new StringBuilder();
            String str = bf2.zy.oaex;
            sb.append(str);
            sb.append("fonts");
            String string = sb.toString();
            String str2 = str + InterfaceC1789q.igu;
            File file = new File(str2);
            String str3 = str + InterfaceC1789q.xd;
            File file2 = new File(str3);
            if (file.exists() && file2.exists()) {
                n7h(str2, string);
                m9958h(str3, string);
            } else if (file.exists()) {
                n7h(str2, string);
            } else if (file2.exists()) {
                n7h(str3, string);
            }
            kja0(string);
        }
        StringBuilder sb2 = new StringBuilder();
        String str4 = bf2.zy.oaex;
        sb2.append(str4);
        sb2.append(g1.f16456c);
        new File(sb2.toString()).renameTo(new File(str4 + InterfaceC1789q.k9));
    }

    private boolean wvg(String resCode) {
        return InterfaceC1789q.qwyf.equals(this.f16746q.getResourceCode()) && "framework-miui-res".equals(resCode);
    }

    private void x2() {
        String str = p001b.f7l8.f53791kt06;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        if (!C1792n.d3(this.f16743n)) {
            Bitmap bitmapM9649n = PreferenceManager.getDefaultSharedPreferences(C2088k.m8026k()).getInt(C6071k.f77055ki, 0) == 2 ? C2763c.m9649n(R.drawable.ic_color_mode_light) : C2763c.m9649n(R.drawable.ic_color_mode_dark);
            String absolutePath = C2088k.m8026k().getFileStreamPath("superwallpaper_preview.tmp").getAbsolutePath();
            if (C2763c.m9653t(bitmapM9649n, absolutePath)) {
                g1.m9752p(absolutePath, str);
                new File(absolutePath).delete();
                return;
            }
            return;
        }
        List<String> listM6969q = new C1795s(this.f16743n, C1791k.getInstance("theme")).m6969q();
        if (listM6969q == null || listM6969q.size() <= 0) {
            return;
        }
        for (int size = listM6969q.size() - 1; size >= 0; size--) {
            String str2 = listM6969q.get(size);
            if (str2.contains("spwallpaper")) {
                g1.m9752p(str2, p001b.f7l8.f53791kt06);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m9966y(com.android.thememanager.basemodule.resource.model.Resource r10, java.util.Set<java.lang.String> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            java.util.List r0 = r10.getSubResources()
            java.lang.String r1 = "spwallpaper"
            boolean r1 = r11.contains(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3c
            boolean r1 = com.android.thememanager.basemodule.resource.C1792n.d3(r10)
            if (r1 != 0) goto L1d
            boolean r1 = com.android.thememanager.basemodule.resource.C1792n.gvn7(r10)
            if (r1 == 0) goto L1b
            goto L1d
        L1b:
            r1 = r2
            goto L1e
        L1d:
            r1 = r3
        L1e:
            if (r1 == 0) goto L3c
            android.content.Context r1 = com.android.thememanager.library.util.app.C2088k.m8026k()
            android.app.WallpaperManager r1 = android.app.WallpaperManager.getInstance(r1)
            android.app.WallpaperInfo r1 = r1.getWallpaperInfo()
            if (r1 == 0) goto L3c
            java.lang.String r1 = r1.getServiceName()
            java.lang.String r4 = "com.miui.miwallpaper.superwallpaper.MamlSuperWallpaper"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L3c
            r1 = r3
            goto L3d
        L3c:
            r1 = r2
        L3d:
            boolean r4 = com.android.thememanager.basemodule.utils.C1807g.zurt()
            if (r4 == 0) goto L52
            com.android.thememanager.fu4 r1 = r9.f16746q
            java.lang.String r1 = r1.getResourceCode()
            java.lang.String r4 = r10.getMetaPath()
            boolean r1 = com.android.thememanager.util.g1.m9739c(r1, r4)
            r1 = r1 ^ r3
        L52:
            boolean r3 = com.android.thememanager.basemodule.utils.C1807g.m7081r()
            if (r3 == 0) goto L5d
            java.lang.String[] r3 = com.android.thememanager.util.mcp.f7l8()
            goto L5f
        L5d:
            java.lang.String[] r3 = com.android.thememanager.basemodule.resource.constants.InterfaceC1789q.nufx
        L5f:
            int r4 = r3.length
        L60:
            if (r2 >= r4) goto Lb4
            r5 = r3[r2]
            boolean r6 = r11.contains(r5)
            if (r6 != 0) goto L6b
            goto Lb1
        L6b:
            if (r1 == 0) goto L7e
            java.lang.String r6 = "wallpaper"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto Lb1
            java.lang.String r6 = "lockscreen"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L7e
            goto Lb1
        L7e:
            java.util.Iterator r6 = r0.iterator()
        L82:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lac
            java.lang.Object r7 = r6.next()
            com.android.thememanager.basemodule.resource.model.RelatedResource r7 = (com.android.thememanager.basemodule.resource.model.RelatedResource) r7
            java.lang.String r8 = r7.getResourceCode()
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L82
            com.android.thememanager.basemodule.resource.q r6 = new com.android.thememanager.basemodule.resource.q
            com.android.thememanager.fu4 r8 = r9.f16746q
            java.lang.String r8 = r8.getResourceCode()
            com.android.thememanager.basemodule.resource.k r8 = com.android.thememanager.basemodule.resource.C1791k.getInstance(r8)
            r6.<init>(r7, r8)
            java.lang.String r6 = r6.m6956k()
            goto Lae
        Lac:
            java.lang.String r6 = ""
        Lae:
            f7l8(r6, r5, r10)
        Lb1:
            int r2 = r2 + 1
            goto L60
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.qrj.m9966y(com.android.thememanager.basemodule.resource.model.Resource, java.util.Set):void");
    }

    /* JADX INFO: renamed from: z */
    private static boolean m9967z(String code) {
        for (String str : InterfaceC1789q.nufx) {
            if (str.equals(code)) {
                return true;
            }
        }
        return C2807t.toq(code);
    }

    private static List<String> zurt(Set<String> applyCodeSet, Set<String> mixIgnoreCodeSet, Set<String> ignoreCodeSet, ApplyThemeInfo info) {
        String[] list;
        ArrayList arrayList = new ArrayList();
        if (fu4(applyCodeSet, mixIgnoreCodeSet)) {
            boolean zContains = ignoreCodeSet.contains("fonts");
            String str = bf2.zy.oaex;
            if (new File(str).exists()) {
                for (String str2 : new File(str).list()) {
                    if (!str2.contains(com.android.thememanager.basemodule.utils.vyq.f10421k) && ((!info.getKeepLargeIcon() || !str2.contains(p001b.f7l8.f53796m8)) && (!zContains || !str2.contains("fonts")))) {
                        arrayList.add(bf2.zy.oaex + str2);
                    }
                }
                if (zContains) {
                    arrayList.remove(bf2.zy.oaex + InterfaceC1789q.dzu0);
                }
            }
            if (new File(mcp.x2()).exists() && (list = new File(mcp.x2()).list()) != null && list.length > 0) {
                for (String str3 : list) {
                    arrayList.add(mcp.x2() + str3);
                }
            }
            if (C1807g.zurt()) {
                arrayList.add(mcp.m9879s(null));
            }
            arrayList.add(g1.m9761z());
        } else {
            for (String str4 : applyCodeSet) {
                if (!com.android.thememanager.basemodule.analysis.toq.lbeq.equals(str4)) {
                    arrayList.add(p001b.toq.x2(str4));
                    arrayList.add(String.format("%s%s/%s", bf2.zy.oaex, "preview", p001b.toq.m5743p(str4)));
                }
                if (C1807g.m7081r() && C2807t.toq(str4)) {
                    arrayList.add(mcp.m9880y(str4));
                    arrayList.add(mcp.m9879s(str4));
                }
            }
            if (applyCodeSet.contains("miwallpaper")) {
                arrayList.add(p001b.f7l8.f53779f3f);
            }
            if (applyCodeSet.contains("launcher")) {
                StringBuilder sb = new StringBuilder();
                String str5 = bf2.zy.oaex;
                sb.append(str5);
                sb.append(g1.f16456c);
                arrayList.add(sb.toString());
                arrayList.add(str5 + InterfaceC1789q.lsos);
            }
            if (applyCodeSet.contains(InterfaceC1789q.qwyf)) {
                arrayList.add(bf2.zy.oaex + "miui.systemui.plugin");
            }
            if (applyCodeSet.contains(InterfaceC1789q.gx2z)) {
                arrayList.add(g1.zurt());
            }
            if (applyCodeSet.contains("miwallpaper")) {
                arrayList.add(g1.m9761z());
            }
            if (applyCodeSet.contains("fonts")) {
                arrayList.add(bf2.zy.oaex + "fonts");
            }
            if (applyCodeSet.contains("framework")) {
                arrayList.add(bf2.zy.oaex + "description.xml");
            }
            if (applyCodeSet.contains(com.android.thememanager.basemodule.analysis.toq.lbeq)) {
                arrayList.addAll(m9959i());
            }
            if (!info.getKeepLargeIcon()) {
                arrayList.add(p001b.f7l8.f53812ula6);
            }
        }
        return arrayList;
    }

    protected void a9(Context context) {
        String resourceCode = this.f16746q.getResourceCode();
        if ("theme".equals(resourceCode) || "aod".equals(resourceCode) || "spwallpaper".equals(resourceCode)) {
            boolean z2 = ApplyThemeInfo.THEME_USING_TYPE_TRIAL.equals(this.f16749t) || ("theme".equals(resourceCode) && g1.m9742f());
            C1795s c1795s = new C1795s(this.f16743n, C1791k.getTheme());
            Intent intent = new Intent(C2663k.f60957jk);
            intent.putExtra(f16726a, TextUtils.isEmpty(this.f16743n.getProductId()) ? this.f16743n.getLocalId() : this.f16743n.getProductId());
            String strM6971y = c1795s.m6971y();
            if (!com.android.thememanager.basemodule.utils.y9n.toq(30) || strM6971y == null || !strM6971y.startsWith(C1788k.f10175k) || com.android.thememanager.basemodule.utils.a9.m7000y(context, "com.miui.aod") < 21000782) {
                intent.putExtra(f16732x, strM6971y);
                intent.putExtra("preview", c1795s.zy());
            } else {
                Uri uriM2162g = FileProvider.m2162g(context, com.android.thememanager.basemodule.resource.constants.toq.o9qk, new File(strM6971y));
                context.grantUriPermission("com.miui.aod", uriM2162g, 65);
                intent.putExtra(f16732x, uriM2162g.toString());
                File[] fileArrListFiles = new File(c1795s.zy()).listFiles();
                ArrayList<String> arrayList = new ArrayList<>();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        Uri uriM2162g2 = FileProvider.m2162g(context, com.android.thememanager.basemodule.resource.constants.toq.o9qk, file);
                        arrayList.add(uriM2162g2.toString());
                        context.grantUriPermission("com.miui.aod", uriM2162g2, 65);
                    }
                }
                intent.putStringArrayListExtra("preview", arrayList);
                intent.setPackage("com.miui.aod");
            }
            intent.putExtra(f61398bo, (z2 || InterfaceC1789q.q28.contains(resourceCode)) ? false : true);
            intent.putExtra(f16730v, false);
            intent.putExtra(f16728d, ApplyThemeInfo.THEME_USING_TYPE_RESTORE.equals(this.f16749t) || ApplyThemeInfo.THEME_USING_TYPE_FORCE_RESTORE.equals(this.f16749t));
            context.sendBroadcast(intent, C2663k.f60952a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... values) {
        ThemeStatus themeStatusM4388g;
        if (values == null || values.length < 2) {
            return;
        }
        int iIntValue = values[0].intValue();
        int iIntValue2 = values[1].intValue();
        androidx.lifecycle.fti<C1723y<Integer>> ftiVar = this.f16738i;
        if (ftiVar != null) {
            ftiVar.cdj(new C1723y<>(Integer.valueOf((int) ((iIntValue * 100.0f) / iIntValue2))));
        }
        androidx.lifecycle.fti<ThemeStatus> ftiVar2 = this.f16747r;
        if (ftiVar2 == null || (themeStatusM4388g = ftiVar2.m4388g()) == null) {
            return;
        }
        themeStatusM4388g.status = 96;
        themeStatusM4388g.progress = iIntValue;
        themeStatusM4388g.maxProgress = iIntValue2;
        this.f16747r.cdj(themeStatusM4388g);
    }

    public void eqxt(Runnable postRunnable) {
        this.f16751z = postRunnable;
    }

    public String fn3e(String originalName) {
        return this.f16746q.getResourceCode() + "_" + originalName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: gvn7, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Void object) {
        ThemeStatus themeStatusM4388g;
        Activity activity = this.f16740k.get();
        androidx.lifecycle.fti<C1723y<Integer>> ftiVar = this.f16738i;
        if (ftiVar != null) {
            ftiVar.cdj(new C1723y<>(101));
        }
        androidx.lifecycle.fti<ThemeStatus> ftiVar2 = this.f16747r;
        if (ftiVar2 != null && (themeStatusM4388g = ftiVar2.m4388g()) != null) {
            themeStatusM4388g.status = 98;
            this.f16747r.cdj(themeStatusM4388g);
        }
        HashSet hashSet = new HashSet();
        if (this.f16734e) {
            hashSet.addAll(Arrays.asList(InterfaceC1789q.bzx));
            hashSet.add(com.android.thememanager.basemodule.analysis.toq.lbeq);
        } else {
            hashSet.addAll(this.f16736g);
            hashSet.addAll(this.f16750y);
        }
        if (activity instanceof RestoreHomeIconHelper.toq) {
            ((RestoreHomeIconHelper.toq) activity).ni7();
        } else if (activity != 0) {
            Log.w(f16727b, "activity not implement RestoreHomeIconHelper.IRestoreActivity !" + activity.getClass());
        }
        boolean zFti = fti(hashSet);
        a9(C2082k.m7998k());
        Log.i(C2755a.f16307g, "Applying theme END: " + this.f16743n.getTitle());
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2804k(activity, zFti), 100L);
        Runnable runnable = this.f16751z;
        if (runnable != null) {
            C6002g.zurt(runnable, 500L);
        }
        ThemeSchedulerService.m8907y();
        ThemeSchedulerService.cdj();
        new n7h(this.f16739j, this.f16743n, this.f16736g, this.f16744o).execute(new Void[0]);
    }

    void oc(androidx.lifecycle.fti<ThemeStatus> observableApplyStatus) {
        this.f16747r = observableApplyStatus;
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        androidx.lifecycle.fti<C1723y<Integer>> ftiVar;
        if (this.f16745p.isShowProgress() && (ftiVar = this.f16738i) != null) {
            ftiVar.cdj(new C1723y<>(0));
        }
        Log.i(C2755a.f16307g, "Applying theme BEGIN: " + this.f16743n.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0199  */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Void doInBackground(java.lang.Void... r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.qrj.doInBackground(java.lang.Void[]):java.lang.Void");
    }
}
