package com.android.thememanager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.thememanager.activity.ComponentActivity;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.activity.ThemeWebActivity;
import com.android.thememanager.activity.WallpaperDetailActivity;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.module.detail.view.ThemeDetailActivity;
import com.android.thememanager.search.ThemeSearchActivity;
import com.android.thememanager.settingssearch.C2690k;
import com.android.thememanager.util.bwp;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.i1;
import com.android.thememanager.util.uc;
import java.io.Serializable;
import java.util.ArrayList;
import mbx.C6812k;
import miuix.core.util.C7083n;
import p001b.InterfaceC1357q;

/* JADX INFO: renamed from: com.android.thememanager.z */
/* JADX INFO: compiled from: ResourceContextManager.java */
/* JADX INFO: loaded from: classes.dex */
public class C2965z implements InterfaceC1789q, InterfaceC1357q {

    /* JADX INFO: renamed from: k */
    public static final String f17864k = "miui.intent.action.RINGTONE_PICKER";

    /* JADX INFO: renamed from: n */
    public static final String f17865n = "miui.intent.extra.ringtone.EXTRA_RINGTONE_URI_LIST_TITLE";

    /* JADX INFO: renamed from: q */
    public static final String f17866q = "miui.intent.extra.ringtone.EXTRA_RINGTONE_URI_LIST";

    public fu4 f7l8(String resourceStamp) {
        String strM5744q = p001b.toq.m5744q(resourceStamp);
        if (!p029m.zy.toq(strM5744q)) {
            resourceStamp = strM5744q;
        }
        return m10535g(resourceStamp);
    }

    /* JADX INFO: renamed from: g */
    public fu4 m10535g(String resourceCode) {
        if (resourceCode == null) {
            resourceCode = m10540s();
        }
        fu4 fu4Var = new fu4();
        fu4Var.setResourceCode(resourceCode);
        fu4Var.setNewResourceContext(C1791k.getInstance(resourceCode));
        return m10539q(fu4Var);
    }

    /* JADX INFO: renamed from: k */
    public fu4 m10536k() {
        return m10535g(m10540s());
    }

    public com.android.thememanager.controller.x2 ld6(fu4 resContext) {
        return new com.android.thememanager.controller.x2(resContext);
    }

    /* JADX INFO: renamed from: n */
    public fu4 m10537n(C1791k resourceContext) {
        fu4 fu4Var = new fu4();
        fu4Var.setResourceCode(resourceContext.getResourceCode());
        fu4Var.setNewResourceContext(resourceContext);
        return m10539q(fu4Var);
    }

    /* JADX INFO: renamed from: p */
    public void m10538p(Intent intent, fu4 resContext) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : fu4.REQUEST_RES_PASS_EXTRA_ARRAY) {
                if (extras.containsKey(str)) {
                    Object obj = extras.get(str);
                    if (obj instanceof Serializable) {
                        resContext.putExtraMeta(str, extras.getSerializable(str));
                    } else if (obj instanceof Uri) {
                        resContext.putExtraMeta(str, ((Uri) obj).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    protected fu4 m10539q(fu4 baseContext) {
        if (baseContext == null) {
            baseContext = new fu4();
        }
        if (p029m.zy.toq(baseContext.getResourceCode())) {
            baseContext.setResourceCode(m10540s());
        }
        return m10541y(baseContext);
    }

    /* JADX INFO: renamed from: s */
    protected String m10540s() {
        return "theme";
    }

    public fu4 toq(Intent intent) {
        return zy(intent, new fu4());
    }

    /* JADX INFO: renamed from: y */
    protected fu4 m10541y(fu4 resContext) {
        ThemeApplication qVar = C2082k.zy().toq();
        String resourceCode = resContext.getResourceCode();
        if (resourceCode == null) {
            resourceCode = m10540s();
            resContext.setResourceCode(resourceCode);
        }
        if (InterfaceC1789q.iwp.equals(resourceCode)) {
            Boolean bool = Boolean.FALSE;
            resContext.putExtraMeta("android.intent.extra.ringtone.SHOW_SILENT", bool);
            resContext.putExtraMeta("android.intent.extra.ringtone.SHOW_DEFAULT", bool);
        }
        if (resContext.getDisplayType() == 0) {
            resContext.setDisplayType(bwp.m9631p(resourceCode));
        }
        if (p029m.zy.toq(resContext.getResourceTitle())) {
            int iKja0 = p001b.toq.kja0(resourceCode);
            resContext.setResourceTitle(iKja0 != 0 ? qVar.getString(iKja0) : "");
        }
        resContext.setResourceFormat(bwp.m9627h(resourceCode));
        resContext.setResourceExtension(bwp.kja0(resourceCode));
        resContext.setSelfDescribing(bwp.a9(resourceCode));
        resContext.setThumbnailPngFormat(bwp.fti(resourceCode));
        resContext.setResourceStamp(p001b.toq.n7h(resourceCode));
        resContext.setListThumbnailRoundSupported(bwp.m9637z(resourceCode));
        resContext.setRecommendThumbnailRoundSupported(bwp.mcp(resourceCode));
        resContext.setPurchaseSupported(bwp.m9635t(resourceCode));
        resContext.setCategorySupported(bwp.m9628i(resourceCode));
        if (bwp.zurt(resourceCode)) {
            resContext.setCategorySupported(!resContext.isPicker());
        }
        resContext.setVersionSupported(bwp.jp0y(resourceCode));
        boolean zWvg = bwp.wvg(resourceCode);
        resContext.setPlatformSupported(zWvg);
        if (zWvg) {
            resContext.setCurrentPlatform(p001b.toq.ki(resourceCode));
        }
        int i2 = 0;
        if ("wallpaper".equals(resourceCode) || "lockscreen".equals(resourceCode)) {
            resContext.setPreviewImageWidth(((Integer) uc.jp0y(false).first).intValue());
        }
        ArrayList arrayList = new ArrayList();
        if ("theme".equals(resourceCode)) {
            while (true) {
                String[] strArr = InterfaceC1789q.e6z;
                if (i2 >= strArr.length) {
                    break;
                }
                arrayList.add(p001b.toq.m5743p(strArr[i2]));
                i2++;
            }
            if (C1807g.m7081r()) {
                arrayList.addAll(com.android.thememanager.util.mcp.ld6());
            }
        } else {
            arrayList.add(p001b.toq.m5743p(resourceCode));
        }
        resContext.setBuildInImagePrefixes(arrayList);
        resContext.setTabActivityPackage(qVar.getPackageName());
        if (C1807g.lvui()) {
            resContext.setTabActivityClass(C6812k.m24744q(resourceCode));
        } else {
            resContext.setTabActivityClass(ThemeTabActivity.class.getName());
        }
        resContext.setCustomizeActivityPackage(qVar.getPackageName());
        resContext.setCustomizeActivityClass(ComponentActivity.class.getName());
        resContext.setSearchActivityPackage(qVar.getPackageName());
        resContext.setSearchActivityClass(ThemeSearchActivity.class.getName());
        resContext.setDetailActivityPackage(qVar.getPackageName());
        if ("wallpaper".equals(resourceCode) || "lockscreen".equals(resourceCode)) {
            resContext.setDetailActivityClass(WallpaperDetailActivity.class.getName());
        } else {
            resContext.setDetailActivityClass(ThemeDetailActivity.class.getName());
        }
        resContext.setWebActivityPackage(qVar.getPackageName());
        resContext.setWebActivityClass(ThemeWebActivity.class.getName());
        if (resContext.getExtraMeta("android.intent.extra.ringtone.TYPE") == null) {
            resContext.putExtraMeta("android.intent.extra.ringtone.TYPE", Integer.valueOf(bwp.cdj(resourceCode)));
        }
        if (resContext.getDisplayType() == 0) {
            resContext.setDisplayType(1);
        }
        if (resContext.getResourceTitle() == null) {
            resContext.setResourceTitle(qVar.getString(R.string.resource_default_name));
        }
        if (resContext.getResourceFormat() == 0) {
            resContext.setResourceFormat(4);
        }
        if (resContext.getResourceStamp() == null) {
            int resourceFormat = resContext.getResourceFormat();
            if (resourceFormat == 1) {
                resContext.setResourceStamp("BundleUnion");
            } else if (resourceFormat == 2) {
                resContext.setResourceStamp("WallpaperUnion");
            } else if (resourceFormat == 3) {
                resContext.setResourceStamp("RingtoneUnion");
            } else if (resourceFormat == 4) {
                resContext.setResourceStamp("ZipUnion");
            } else if (resourceFormat == 5) {
                resContext.setResourceStamp("OtherUnion");
            }
        }
        if (resContext.getResourceCode() == null) {
            int resourceFormat2 = resContext.getResourceFormat();
            if (resourceFormat2 == 1) {
                resContext.setResourceCode("bundle");
            } else if (resourceFormat2 == 2) {
                resContext.setResourceCode("wallpaper");
            } else if (resourceFormat2 == 3) {
                resContext.setResourceCode("ringtone");
            } else if (resourceFormat2 == 4) {
                resContext.setResourceCode("zip");
            } else if (resourceFormat2 == 5) {
                resContext.setResourceCode(C2690k.k.f61039ld6);
            }
        }
        if (resContext.getResourceIdentity() == null) {
            resContext.setResourceIdentity(resContext.getResourceCode());
        }
        if (resContext.getResourceExtension() == null) {
            int resourceFormat3 = resContext.getResourceFormat();
            if (resourceFormat3 == 1) {
                resContext.setResourceExtension(".zip");
            } else if (resourceFormat3 == 2) {
                resContext.setResourceExtension(com.android.thememanager.basemodule.resource.constants.toq.ybu);
            } else if (resourceFormat3 == 3) {
                resContext.setResourceExtension(com.android.thememanager.basemodule.resource.constants.toq.pm14);
            } else if (resourceFormat3 == 4) {
                resContext.setResourceExtension(".zip");
            } else if (resourceFormat3 == 5) {
                resContext.setResourceExtension(com.android.thememanager.basemodule.resource.constants.toq.fd);
            }
        }
        if (resContext.getRecommendImageWidth() == 0) {
            resContext.setRecommendImageWidth(ch.zurt(qVar));
        }
        if (resContext.getThumbnailImageWidth() == 0) {
            resContext.setThumbnailImageWidth(((Integer) ch.d3(qVar, resContext.getDisplayType(), ch.m9687z(qVar), ch.n7h(qVar)).first).intValue());
        }
        if (resContext.getPreviewImageWidth() == 0) {
            resContext.setPreviewImageWidth(y9n.zurt().x);
        }
        String str = C1788k.f10175k;
        String strLd6 = C7083n.ld6(i1.toq(qVar).getAbsolutePath());
        String strLd62 = C7083n.ld6(resContext.getResourceCode());
        if (resContext.getBaseDataFolder() == null) {
            resContext.setBaseDataFolder(str + strLd62 + com.android.thememanager.basemodule.resource.constants.toq.lo8);
        }
        if (resContext.getBaseDataCacheFolder() == null) {
            resContext.setBaseDataCacheFolder(strLd6 + strLd62);
        }
        if (resContext.getBaseImageCacheFolder() == null) {
            resContext.setBaseImageCacheFolder(str + com.android.thememanager.basemodule.resource.constants.toq.cax + strLd62);
        }
        if (resContext.getListCacheFolder() == null) {
            resContext.setListCacheFolder(resContext.getBaseDataCacheFolder() + com.android.thememanager.basemodule.resource.constants.toq.he);
        }
        if (resContext.getDetailCacheFolder() == null) {
            resContext.setDetailCacheFolder(resContext.getBaseDataCacheFolder() + com.android.thememanager.basemodule.resource.constants.toq.q6x);
        }
        if (resContext.getPageCacheFolder() == null) {
            resContext.setPageCacheFolder(resContext.getBaseDataCacheFolder() + com.android.thememanager.basemodule.resource.constants.toq.puh);
        }
        if (resContext.getVersionCacheFolder() == null) {
            resContext.setVersionCacheFolder(resContext.getBaseDataCacheFolder() + com.android.thememanager.basemodule.resource.constants.toq.gm3);
        }
        if (resContext.getAssociationCacheFolder() == null) {
            resContext.setAssociationCacheFolder(resContext.getBaseDataCacheFolder() + com.android.thememanager.basemodule.resource.constants.toq.ik8);
        }
        if (resContext.getSearchHintCacheFolder() == null) {
            resContext.setSearchHintCacheFolder(resContext.getBaseDataCacheFolder() + com.android.thememanager.basemodule.resource.constants.toq.v7p);
        }
        if (resContext.getThumbnailCacheFolder() == null) {
            resContext.setThumbnailCacheFolder(resContext.getBaseImageCacheFolder() + com.android.thememanager.basemodule.resource.constants.toq.k8s);
        }
        if (resContext.getPreviewCacheFolder() == null) {
            resContext.setPreviewCacheFolder(resContext.getBaseImageCacheFolder() + "preview/");
        }
        if (resContext.getRecommendImageCacheFolder() == null) {
            resContext.setRecommendImageCacheFolder(resContext.getBaseImageCacheFolder() + com.android.thememanager.basemodule.resource.constants.toq.d79j);
        }
        if (resContext.getTabActivityClass() == null) {
            resContext.setTabActivityClass(ThemeTabActivity.class.getName());
        }
        if (resContext.getTabActivityPackage() == null) {
            resContext.setTabActivityPackage(qVar.getPackageName());
        }
        if (resContext.getSearchActivityClass() == null) {
            resContext.setSearchActivityClass(ThemeSearchActivity.class.getName());
        }
        if (resContext.getSearchActivityPackage() == null) {
            resContext.setSearchActivityPackage(qVar.getPackageName());
        }
        if (resContext.getDetailActivityClass() == null) {
            resContext.setDetailActivityClass(ThemeDetailActivity.class.getName());
        }
        if (resContext.getDetailActivityPackage() == null) {
            resContext.setDetailActivityPackage(qVar.getPackageName());
        }
        if (resContext.getWebActivityClass() == null) {
            resContext.setWebActivityClass(ThemeWebActivity.class.getName());
        }
        if (resContext.getWebActivityPackage() == null) {
            resContext.setWebActivityPackage(qVar.getPackageName());
        }
        return resContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.android.thememanager.fu4 zy(android.content.Intent r19, com.android.thememanager.fu4 r20) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.C2965z.zy(android.content.Intent, com.android.thememanager.fu4):com.android.thememanager.fu4");
    }
}
