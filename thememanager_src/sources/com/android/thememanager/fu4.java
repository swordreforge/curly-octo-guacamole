package com.android.thememanager;

import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1796y;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.util.bwp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import miuix.core.util.C7083n;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ResourceContext.java */
/* JADX INFO: loaded from: classes.dex */
public class fu4 implements Serializable, InterfaceC1357q, InterfaceC1789q {
    public static final int DISPLAY_TYPE_DOUBLE_AOD = 10;
    public static final int DISPLAY_TYPE_DOUBLE_FLAT = 3;
    public static final int DISPLAY_TYPE_DOUBLE_FLAT_ICON = 5;
    public static final int DISPLAY_TYPE_DOUBLE_LARGEICON = 12;
    public static final int DISPLAY_TYPE_DOUBLE_WIDGET = 11;
    public static final int DISPLAY_TYPE_SINGLE = 1;
    public static final int DISPLAY_TYPE_SINGLE_FONT = 4;
    public static final int DISPLAY_TYPE_SINGLE_MUSIC = 2;
    public static final int DISPLAY_TYPE_TRIPLE = 6;
    public static final int DISPLAY_TYPE_TRIPLE_FLAT = 8;
    public static final int DISPLAY_TYPE_TRIPLE_IMAGE = 9;
    public static final int DISPLAY_TYPE_TRIPLE_TEXT = 7;
    public static final String[] REQUEST_RES_PASS_EXTRA_ARRAY = {"android.intent.extra.ringtone.SHOW_SILENT", "android.intent.extra.ringtone.SHOW_DEFAULT", "android.intent.extra.ringtone.DEFAULT_URI", "android.intent.extra.ringtone.TYPE", InterfaceC1357q.f53926o1t, InterfaceC1357q.f53960wvg, InterfaceC1357q.f53952vep5, "REQUEST_TRACK_ID", "REQUEST_CURRENT_USING_PATH"};
    public static final int RESOURCE_FORMAT_AUDIO = 3;
    public static final int RESOURCE_FORMAT_BUNDLE = 1;
    public static final int RESOURCE_FORMAT_IMAGE = 2;
    public static final int RESOURCE_FORMAT_OTHER = 5;
    public static final int RESOURCE_FORMAT_ZIP = 4;
    private static final long serialVersionUID = 3;
    private String associationCacheFolder;
    private String asyncImportFolder;
    private String baseDataCacheFolder;
    private String baseDataFolder;
    private String baseImageCacheFolder;
    private String buildInImageFolder;
    private String buildInImageRelativeFolderName;
    private boolean categorySupported;
    private String contentFolder;
    private String contentRelativeFolderName;
    private int currentPlatform;
    private String customizeActivityClass;
    private String customizeActivityPackage;
    private String detailActivityClass;
    private String detailActivityPackage;
    private String detailCacheFolder;
    private int displayType;
    private String downloadFolder;
    private String downloadRelativeFolderName;
    private String listCacheFolder;
    private boolean listThumbnailRoundSupported;
    private C1791k mNewResourceContext;
    private String metaFolder;
    private String metaRelativeFolderName;
    private String pageCacheFolder;
    private boolean platformSupported;
    private String previewCacheFolder;
    private int previewImageWidth;
    private boolean purchaseSupported;
    private String recommendImageCacheFolder;
    private int recommendImageWidth;
    private boolean recommendThumbnailRoundSupported;
    private String resourceCode;
    private String resourceExtension;
    private int resourceFormat;
    private String resourceIdentity;
    private String resourceStamp;
    private String resourceTitle;
    private String rightsFolder;
    private String rightsRelativeFolderName;
    private String searchActivityClass;
    private String searchActivityPackage;
    private String searchHintCacheFolder;
    private boolean selfDescribing;
    private String tabActivityClass;
    private String tabActivityPackage;
    private String thumbnailCacheFolder;
    private int thumbnailImageWidth;
    private boolean thumbnailPngFormat;
    private boolean trialSupported;
    private String versionCacheFolder;
    private boolean versionSupported;
    private String webActivityClass;
    private String webActivityPackage;
    private List<String> sourceFolders = new ArrayList();
    private List<String> buildInImagePrefixes = new ArrayList();
    private Map<String, Serializable> extraMeta = new HashMap();

    /* JADX INFO: renamed from: k */
    private volatile transient boolean f12002k = false;

    /* JADX INFO: renamed from: com.android.thememanager.fu4$k */
    /* JADX INFO: compiled from: ResourceContext.java */
    public static class C2043k implements Serializable {
        private static final long serialVersionUID = 0;
        public boolean canNotPlay;
        public String path;
        public String title;

        public C2043k(String title, String path, boolean canNotPlay) {
            this.title = title;
            this.path = path;
            this.canNotPlay = canNotPlay;
        }
    }

    fu4() {
    }

    /* JADX INFO: renamed from: k */
    private void m7897k() {
        if (this.f12002k) {
            return;
        }
        toq();
    }

    private synchronized void toq() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        ArrayList arrayList = new ArrayList();
        if ("wallpaper".equals(this.resourceCode)) {
            StringBuilder sb = new StringBuilder();
            String str12 = C1788k.f10181q;
            sb.append(str12);
            sb.append(C1788k.f10180p);
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            String str13 = C1788k.f10178n;
            sb2.append(str13);
            sb2.append(C1788k.f10180p);
            zy(arrayList, string, sb2.toString());
            zy(arrayList, str12 + C1788k.f10189y, str13 + C1788k.f10189y);
            arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.a2lv);
            arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.v6we);
            arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.e2);
            arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.wc6);
            arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.trbh);
            str4 = C1788k.f10190z;
            str5 = C1788k.f10179o;
            str6 = C1788k.f10185u;
            str7 = C1788k.f57648ab;
            str8 = C1788k.id;
            str9 = C1788k.az;
            str10 = C1788k.f10180p;
            str11 = C1788k.f10180p;
            str3 = C1788k.f10180p;
            str = C1788k.f10180p;
            str2 = C1788k.f10180p;
        } else if ("lockscreen".equals(this.resourceCode)) {
            StringBuilder sb3 = new StringBuilder();
            String str14 = C1788k.f10181q;
            sb3.append(str14);
            sb3.append(C1788k.f10180p);
            String string2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            String str15 = C1788k.f10178n;
            sb4.append(str15);
            sb4.append(C1788k.f10180p);
            zy(arrayList, string2, sb4.toString());
            zy(arrayList, str14 + C1788k.f10189y, str15 + C1788k.f10189y);
            arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.a2lv);
            arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.v6we);
            arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.e2);
            arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.wc6);
            str4 = C1788k.f10184t;
            str5 = C1788k.f10177m;
            str6 = C1788k.f57649bo;
            str7 = C1788k.bb;
            str8 = C1788k.in;
            str9 = C1788k.ba;
            str10 = C1788k.f10180p;
            str11 = C1788k.f10180p;
            str3 = C1788k.f10180p;
            str = C1788k.f10180p;
            str2 = C1788k.f10180p;
        } else if (bwp.ki(this.resourceCode)) {
            int iIntValue = ((Integer) getExtraMeta("android.intent.extra.ringtone.TYPE", 1)).intValue();
            if (iIntValue == 1) {
                StringBuilder sb5 = new StringBuilder();
                String str16 = C1788k.f10181q;
                sb5.append(str16);
                sb5.append(C1788k.f10172h);
                String string3 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                String str17 = C1788k.f10178n;
                sb6.append(str17);
                sb6.append(C1788k.f10172h);
                zy(arrayList, string3, sb6.toString());
                zy(arrayList, str16 + "ringtone/", str17 + "ringtone/");
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.kncy);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.re5);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.zn);
                arrayList.add("/system/media/audio/ringtones/");
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.m6t);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.ktm);
                str4 = C1788k.f10182r;
                str5 = C1788k.f10166b;
                str6 = C1788k.f10186v;
                str7 = C1788k.bp;
                str8 = C1788k.bl;
                str9 = C1788k.ax;
                str10 = C1788k.f10172h;
                str11 = C1788k.f10172h;
                str3 = C1788k.f10172h;
                str = C1788k.f10172h;
                str2 = C1788k.f10172h;
            } else if (iIntValue == 2) {
                StringBuilder sb7 = new StringBuilder();
                String str18 = C1788k.f10181q;
                sb7.append(str18);
                sb7.append(C1788k.f10172h);
                String string4 = sb7.toString();
                StringBuilder sb8 = new StringBuilder();
                String str19 = C1788k.f10178n;
                sb8.append(str19);
                sb8.append(C1788k.f10172h);
                zy(arrayList, string4, sb8.toString());
                zy(arrayList, str18 + "ringtone/", str19 + "ringtone/");
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.re5);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.kncy);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.zn);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.m6t);
                arrayList.add("/system/media/audio/ringtones/");
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.ktm);
                str4 = C1788k.f10176l;
                str5 = C1788k.f10165a;
                str6 = C1788k.f10168d;
                str7 = C1788k.bv;
                str8 = C1788k.as;
                str9 = C1788k.bq;
                str10 = C1788k.f10172h;
                str11 = C1788k.f10172h;
                str3 = C1788k.f10172h;
                str = C1788k.f10172h;
                str2 = C1788k.f10172h;
            } else if (iIntValue != 4) {
                StringBuilder sb9 = new StringBuilder();
                String str20 = C1788k.f10181q;
                sb9.append(str20);
                sb9.append(C1788k.f10172h);
                String string5 = sb9.toString();
                StringBuilder sb10 = new StringBuilder();
                String str21 = C1788k.f10178n;
                sb10.append(str21);
                sb10.append(C1788k.f10172h);
                zy(arrayList, string5, sb10.toString());
                zy(arrayList, str20 + "ringtone/", str21 + "ringtone/");
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.kncy);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.re5);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.zn);
                arrayList.add("/system/media/audio/ringtones/");
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.m6t);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.ktm);
                str4 = C1788k.f10182r;
                str5 = C1788k.f10166b;
                str6 = C1788k.f10186v;
                str7 = C1788k.bp;
                str8 = C1788k.bl;
                str9 = C1788k.ax;
                str10 = C1788k.f10172h;
                str11 = C1788k.f10172h;
                str3 = C1788k.f10172h;
                str = C1788k.f10172h;
                str2 = C1788k.f10172h;
            } else {
                StringBuilder sb11 = new StringBuilder();
                String str22 = C1788k.f10181q;
                sb11.append(str22);
                sb11.append(C1788k.f10172h);
                String string6 = sb11.toString();
                StringBuilder sb12 = new StringBuilder();
                String str23 = C1788k.f10178n;
                sb12.append(str23);
                sb12.append(C1788k.f10172h);
                zy(arrayList, string6, sb12.toString());
                zy(arrayList, str22 + "ringtone/", str23 + "ringtone/");
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.zn);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.kncy);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.re5);
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.ktm);
                arrayList.add("/system/media/audio/ringtones/");
                arrayList.add(com.android.thememanager.basemodule.resource.constants.toq.m6t);
                str4 = C1788k.f10170f;
                str5 = C1788k.f10188x;
                str6 = C1788k.f10187w;
                str7 = C1788k.an;
                str8 = C1788k.bg;
                str9 = C1788k.ac;
                str10 = C1788k.f10172h;
                str11 = C1788k.f10172h;
                str3 = C1788k.f10172h;
                str = C1788k.f10172h;
                str2 = C1788k.f10172h;
            }
        } else if ("bootaudio".equals(this.resourceCode)) {
            StringBuilder sb13 = new StringBuilder();
            String str24 = C1788k.f10181q;
            sb13.append(str24);
            sb13.append(C1788k.f10172h);
            String string7 = sb13.toString();
            StringBuilder sb14 = new StringBuilder();
            String str25 = C1788k.f10178n;
            sb14.append(str25);
            sb14.append(C1788k.f10172h);
            zy(arrayList, string7, sb14.toString());
            zy(arrayList, str24 + "ringtone/", str25 + "ringtone/");
            arrayList.add(InterfaceC1789q.vc7p);
            arrayList.add("/system/media/audio/ringtones/");
            str4 = com.android.thememanager.basemodule.resource.constants.zy.f57676x2;
            str5 = com.android.thememanager.basemodule.resource.constants.zy.f57663ki;
            str6 = com.android.thememanager.basemodule.resource.constants.zy.f57659fu4;
            str7 = com.android.thememanager.basemodule.resource.constants.zy.f57661jk;
            str8 = com.android.thememanager.basemodule.resource.constants.zy.f57671oc;
            str9 = com.android.thememanager.basemodule.resource.constants.zy.f57677x9kr;
            str10 = "ringtone/";
            str11 = "ringtone/";
            str3 = "ringtone/";
            str = com.android.thememanager.basemodule.resource.constants.zy.f57662jp0y;
            str2 = "ringtone/";
        } else if ("theme".equals(this.resourceCode)) {
            arrayList.add(InterfaceC1789q.o3u0);
            zy(arrayList, C1788k.f10181q + "theme/.data/meta/theme/", C1788k.f10178n + "theme/.data/meta/theme/");
            arrayList.add(InterfaceC1789q.pp);
            arrayList.add(InterfaceC1789q.ny6p);
            str4 = com.android.thememanager.basemodule.resource.constants.zy.f10196p;
            str5 = com.android.thememanager.basemodule.resource.constants.zy.f57651cdj;
            str6 = com.android.thememanager.basemodule.resource.constants.zy.f57669ni7;
            str7 = com.android.thememanager.basemodule.resource.constants.zy.f57667mcp;
            str8 = com.android.thememanager.basemodule.resource.constants.zy.f57653d3;
            str9 = com.android.thememanager.basemodule.resource.constants.zy.f57654dd;
            str10 = "theme/.download/";
            str11 = "theme/.data/meta/theme/";
            str3 = com.android.thememanager.basemodule.resource.constants.zy.f57670o1t;
            str = "theme/.data/rights/theme/";
            str2 = "theme/.data/preview/theme/";
        } else {
            String strLd6 = C7083n.ld6(this.resourceCode);
            arrayList.add(InterfaceC1789q.s08 + strLd6);
            zy(arrayList, C1788k.f10181q + "theme/.data/meta/" + strLd6, C1788k.f10178n + "theme/.data/meta/" + strLd6);
            arrayList.add(InterfaceC1789q.jz7r + strLd6);
            arrayList.add(InterfaceC1789q.upj2 + strLd6);
            String str26 = com.android.thememanager.basemodule.resource.constants.zy.f10199s;
            String str27 = com.android.thememanager.basemodule.resource.constants.zy.f10192h + strLd6;
            String str28 = com.android.thememanager.basemodule.resource.constants.zy.f57678zurt + strLd6;
            String str29 = com.android.thememanager.basemodule.resource.constants.zy.f10200t;
            String str30 = com.android.thememanager.basemodule.resource.constants.zy.f57660gvn7;
            String str31 = com.android.thememanager.basemodule.resource.constants.zy.f10198r;
            String str32 = "theme/.data/meta/" + strLd6;
            str = "theme/.data/rights/theme/";
            str2 = "theme/.data/preview/theme/";
            str3 = com.android.thememanager.basemodule.resource.constants.zy.f10202z + strLd6;
            str4 = str26;
            str5 = str27;
            str6 = str28;
            str7 = str29;
            str8 = str30;
            str9 = str31;
            str10 = "theme/.download/";
            str11 = str32;
        }
        setSourceFolders(arrayList);
        setDownloadFolder(str4);
        setMetaFolder(str5);
        setContentFolder(str6);
        setRightsFolder(str7);
        setBuildInImageFolder(str8);
        setAsyncImportFolder(str9);
        setDownloadRelativeFolderName(str10);
        setMetaRelativeFolderName(str11);
        setContentRelativeFolderName(str3);
        setRightsRelativeFolderName(str);
        setBuildInImageRelativeFolderName(str2);
        this.f12002k = true;
    }

    private void zy(List<String> sourceFolders, String buildInExternalStorageFolder, String plugInSdcardStorageFolder) {
        if (!C1796y.m6977s()) {
            sourceFolders.add(buildInExternalStorageFolder);
        } else if (C1796y.m6973g()) {
            sourceFolders.add(plugInSdcardStorageFolder);
            sourceFolders.add(buildInExternalStorageFolder);
        } else {
            sourceFolders.add(buildInExternalStorageFolder);
            sourceFolders.add(plugInSdcardStorageFolder);
        }
    }

    public void addBuildInImagePrefix(String buildInImagePrefix) {
        this.buildInImagePrefixes.add(buildInImagePrefix);
    }

    public void addSourceFolder(String sourceFolder) {
        this.sourceFolders.add(sourceFolder);
    }

    public String getAssociationCacheFolder() {
        return this.associationCacheFolder;
    }

    public String getAsyncImportFolder() {
        m7897k();
        return this.asyncImportFolder;
    }

    public String getBaseDataCacheFolder() {
        return this.baseDataCacheFolder;
    }

    public String getBaseDataFolder() {
        return this.baseDataFolder;
    }

    public String getBaseImageCacheFolder() {
        return this.baseImageCacheFolder;
    }

    public String getBuildInImageFolder() {
        m7897k();
        return this.buildInImageFolder;
    }

    public List<String> getBuildInImagePrefixes() {
        return this.buildInImagePrefixes;
    }

    public String getBuildInImageRelativeFolderName() {
        m7897k();
        return this.buildInImageRelativeFolderName;
    }

    public String getContentFolder() {
        m7897k();
        return this.contentFolder;
    }

    public String getContentRelativeFolderName() {
        m7897k();
        return this.contentRelativeFolderName;
    }

    public int getCurrentPlatform() {
        return this.currentPlatform;
    }

    public String getCurrentUsingPath() {
        return (String) this.extraMeta.get("REQUEST_CURRENT_USING_PATH");
    }

    public String getCustomizeActivityClass() {
        return this.customizeActivityClass;
    }

    public String getCustomizeActivityPackage() {
        return this.customizeActivityPackage;
    }

    public String getDetailActivityClass() {
        return this.detailActivityClass;
    }

    public String getDetailActivityPackage() {
        return this.detailActivityPackage;
    }

    public String getDetailCacheFolder() {
        return this.detailCacheFolder;
    }

    public int getDisplayType() {
        return this.displayType;
    }

    public String getDownloadFolder() {
        m7897k();
        return this.downloadFolder;
    }

    public String getDownloadRelativeFolderName() {
        m7897k();
        return this.downloadRelativeFolderName;
    }

    public Map<String, Serializable> getExtraMeta() {
        return this.extraMeta;
    }

    public List<C2043k> getExtraRingtoneInfo() {
        return (List) getExtraMeta(InterfaceC1789q.n026);
    }

    public String getExtraRingtoneInfoTitle() {
        return (String) getExtraMeta(InterfaceC1789q.uc1);
    }

    public String getListCacheFolder() {
        return this.listCacheFolder;
    }

    public String getMetaFolder() {
        m7897k();
        return this.metaFolder;
    }

    public String getMetaRelativeFolderName() {
        m7897k();
        return this.metaRelativeFolderName;
    }

    public C1791k getNewResourceContext() {
        return this.mNewResourceContext;
    }

    public String getPageCacheFolder() {
        return this.pageCacheFolder;
    }

    public String getPreviewCacheFolder() {
        return this.previewCacheFolder;
    }

    public int getPreviewImageWidth() {
        return this.previewImageWidth;
    }

    public String getRecommendImageCacheFolder() {
        return this.recommendImageCacheFolder;
    }

    public int getRecommendImageWidth() {
        return this.recommendImageWidth;
    }

    public String getResourceCode() {
        return this.resourceCode;
    }

    public String getResourceExtension() {
        return this.resourceExtension;
    }

    public int getResourceFormat() {
        return this.resourceFormat;
    }

    public String getResourceIdentity() {
        String str = this.resourceIdentity;
        return str != null ? str : getResourceCode();
    }

    public String getResourceStamp() {
        return this.resourceStamp;
    }

    public String getResourceTitle() {
        return this.resourceTitle;
    }

    public String getRightsFolder() {
        m7897k();
        return this.rightsFolder;
    }

    public String getRightsRelativeFolderName() {
        m7897k();
        return this.rightsRelativeFolderName;
    }

    public String getSearchActivityClass() {
        return this.searchActivityClass;
    }

    public String getSearchActivityPackage() {
        return this.searchActivityPackage;
    }

    public String getSearchHintCacheFolder() {
        return this.searchHintCacheFolder;
    }

    public List<String> getSourceFolders() {
        m7897k();
        return this.sourceFolders;
    }

    public String getTabActivityClass() {
        return this.tabActivityClass;
    }

    public String getTabActivityPackage() {
        return this.tabActivityPackage;
    }

    public String getThumbnailCacheFolder() {
        return this.thumbnailCacheFolder;
    }

    public int getThumbnailImageWidth() {
        return this.thumbnailImageWidth;
    }

    public String getTrackId() {
        return (String) this.extraMeta.get("REQUEST_TRACK_ID");
    }

    public String getVersionCacheFolder() {
        return this.versionCacheFolder;
    }

    public String getWebActivityClass() {
        return this.webActivityClass;
    }

    public String getWebActivityPackage() {
        return this.webActivityPackage;
    }

    public boolean isCategorySupported() {
        return this.categorySupported;
    }

    public boolean isListThumbnailRoundSupported() {
        return this.listThumbnailRoundSupported;
    }

    public boolean isMiuiRingtonePicker() {
        Boolean bool = (Boolean) this.extraMeta.get(InterfaceC1357q.f53960wvg);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isPicker() {
        Boolean bool = (Boolean) this.extraMeta.get(InterfaceC1357q.f53926o1t);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isPlatformSupported() {
        return this.platformSupported;
    }

    public boolean isPurchaseSupported() {
        return this.purchaseSupported;
    }

    public boolean isRecommendThumbnailRoundSupported() {
        return this.recommendThumbnailRoundSupported;
    }

    public boolean isSelfDescribing() {
        return this.selfDescribing;
    }

    public boolean isThumbnailPngFormat() {
        return this.thumbnailPngFormat;
    }

    public boolean isVersionSupported() {
        return this.versionSupported;
    }

    public void putExtraMeta(String key, Serializable value) {
        this.extraMeta.put(key, value);
    }

    void setAssociationCacheFolder(String associationCacheFolder) {
        this.associationCacheFolder = associationCacheFolder;
    }

    void setAsyncImportFolder(String asyncImportFolder) {
        this.asyncImportFolder = asyncImportFolder;
    }

    void setBaseDataCacheFolder(String baseDataCacheFolder) {
        this.baseDataCacheFolder = baseDataCacheFolder;
    }

    void setBaseDataFolder(String baseDataFolder) {
        this.baseDataFolder = baseDataFolder;
    }

    void setBaseImageCacheFolder(String baseImageCacheFolder) {
        this.baseImageCacheFolder = baseImageCacheFolder;
    }

    void setBuildInImageFolder(String buildInImageFolder) {
        this.buildInImageFolder = buildInImageFolder;
    }

    void setBuildInImagePrefixes(List<String> buildInImagePrefixes) {
        this.buildInImagePrefixes = buildInImagePrefixes;
    }

    void setBuildInImageRelativeFolderName(String buildInImageRelativeFolderName) {
        this.buildInImageRelativeFolderName = buildInImageRelativeFolderName;
    }

    void setCategorySupported(boolean categorySupported) {
        this.categorySupported = categorySupported;
    }

    void setContentFolder(String contentFolder) {
        this.contentFolder = contentFolder;
    }

    void setContentRelativeFolderName(String contentRelativeFolderName) {
        this.contentRelativeFolderName = contentRelativeFolderName;
    }

    void setCurrentPlatform(int currentPlatform) {
        this.currentPlatform = currentPlatform;
    }

    public void setCurrentUsingPath(String currentUsingPath) {
        this.extraMeta.put("REQUEST_CURRENT_USING_PATH", currentUsingPath);
    }

    void setCustomizeActivityClass(String customizeActivityClass) {
        this.customizeActivityClass = customizeActivityClass;
    }

    void setCustomizeActivityPackage(String customizeActivityPackage) {
        this.customizeActivityPackage = customizeActivityPackage;
    }

    void setDetailActivityClass(String detailActivityClass) {
        this.detailActivityClass = detailActivityClass;
    }

    void setDetailActivityPackage(String detailActivityPackage) {
        this.detailActivityPackage = detailActivityPackage;
    }

    void setDetailCacheFolder(String detailCacheFolder) {
        this.detailCacheFolder = detailCacheFolder;
    }

    public void setDisplayType(int displayType) {
        this.displayType = displayType;
    }

    void setDownloadFolder(String downloadFolder) {
        this.downloadFolder = downloadFolder;
    }

    void setDownloadRelativeFolderName(String downloadRelativeFolderName) {
        this.downloadRelativeFolderName = downloadRelativeFolderName;
    }

    public void setExtraMeta(Map<String, Serializable> extraMeta) {
        this.extraMeta = extraMeta;
    }

    void setExtraRingtoneInfo(List<C2043k> ringtoneInfo) {
        putExtraMeta(InterfaceC1789q.n026, (Serializable) ringtoneInfo);
    }

    void setExtraRingtoneInfoTitle(String title) {
        putExtraMeta(InterfaceC1789q.uc1, title);
    }

    void setListCacheFolder(String listCacheFolder) {
        this.listCacheFolder = listCacheFolder;
    }

    void setListThumbnailRoundSupported(boolean listThumbnailRoundSupported) {
        this.listThumbnailRoundSupported = listThumbnailRoundSupported;
    }

    void setMetaFolder(String metaFolder) {
        this.metaFolder = metaFolder;
    }

    void setMetaRelativeFolderName(String metaRelativeFolderName) {
        this.metaRelativeFolderName = metaRelativeFolderName;
    }

    void setMiuiRingtonePicker(boolean picker) {
        this.extraMeta.put(InterfaceC1357q.f53960wvg, Boolean.valueOf(picker));
    }

    public void setNewResourceContext(C1791k newResourceContext) {
        this.mNewResourceContext = newResourceContext;
    }

    void setPageCacheFolder(String pageCacheFolder) {
        this.pageCacheFolder = pageCacheFolder;
    }

    void setPicker(boolean picker) {
        this.extraMeta.put(InterfaceC1357q.f53926o1t, Boolean.valueOf(picker));
    }

    void setPlatformSupported(boolean platformSupported) {
        this.platformSupported = platformSupported;
    }

    void setPreviewCacheFolder(String previewCacheFolder) {
        this.previewCacheFolder = previewCacheFolder;
    }

    void setPreviewImageWidth(int previewImageWidth) {
        this.previewImageWidth = previewImageWidth;
    }

    void setPurchaseSupported(boolean purchaseSupported) {
        this.purchaseSupported = purchaseSupported;
    }

    void setRecommendImageCacheFolder(String recommendImageCacheFolder) {
        this.recommendImageCacheFolder = recommendImageCacheFolder;
    }

    void setRecommendImageWidth(int recommendImageWidth) {
        this.recommendImageWidth = recommendImageWidth;
    }

    void setRecommendThumbnailRoundSupported(boolean recommendThumbnailRoundSupported) {
        this.recommendThumbnailRoundSupported = recommendThumbnailRoundSupported;
    }

    void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    void setResourceExtension(String resourceExtension) {
        this.resourceExtension = resourceExtension;
    }

    void setResourceFormat(int resourceFormat) {
        this.resourceFormat = resourceFormat;
    }

    void setResourceIdentity(String resourceIdentity) {
        this.resourceIdentity = resourceIdentity;
    }

    void setResourceStamp(String resourceStamp) {
        this.resourceStamp = resourceStamp;
    }

    void setResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle;
    }

    void setRightsFolder(String rightsFolder) {
        this.rightsFolder = rightsFolder;
    }

    void setRightsRelativeFolderName(String rightsRelativeFolderName) {
        this.rightsRelativeFolderName = rightsRelativeFolderName;
    }

    void setSearchActivityClass(String searchActivityClass) {
        this.searchActivityClass = searchActivityClass;
    }

    void setSearchActivityPackage(String searchActivityPackage) {
        this.searchActivityPackage = searchActivityPackage;
    }

    void setSearchHintCacheFolder(String searchHintCacheFolder) {
        this.searchHintCacheFolder = searchHintCacheFolder;
    }

    void setSelfDescribing(boolean selfDescribing) {
        this.selfDescribing = selfDescribing;
    }

    void setSourceFolders(List<String> sourceFolders) {
        this.sourceFolders = sourceFolders;
    }

    void setTabActivityClass(String tabActivityClass) {
        this.tabActivityClass = tabActivityClass;
    }

    void setTabActivityPackage(String tabActivityPackage) {
        this.tabActivityPackage = tabActivityPackage;
    }

    void setThumbnailCacheFolder(String thumbnailCacheFolder) {
        this.thumbnailCacheFolder = thumbnailCacheFolder;
    }

    void setThumbnailImageWidth(int thumbnailImageWidth) {
        this.thumbnailImageWidth = thumbnailImageWidth;
    }

    void setThumbnailPngFormat(boolean thumbnailPngFormat) {
        this.thumbnailPngFormat = thumbnailPngFormat;
    }

    void setTrackId(String trackId) {
        this.extraMeta.put("REQUEST_TRACK_ID", trackId);
    }

    void setVersionCacheFolder(String versionCacheFolder) {
        this.versionCacheFolder = versionCacheFolder;
    }

    void setVersionSupported(boolean versionSupported) {
        this.versionSupported = versionSupported;
    }

    void setWebActivityClass(String webActivityClass) {
        this.webActivityClass = webActivityClass;
    }

    void setWebActivityPackage(String webActivityPackage) {
        this.webActivityPackage = webActivityPackage;
    }

    public Serializable getExtraMeta(String key) {
        return this.extraMeta.get(key);
    }

    public Serializable getExtraMeta(String key, Serializable defaultValue) {
        Serializable serializable = this.extraMeta.get(key);
        return serializable != null ? serializable : defaultValue;
    }
}
