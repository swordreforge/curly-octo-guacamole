package com.miui.maml.widget.edit;

import android.util.Log;
import com.google.gson.C4871g;
import com.market.sdk.reflect.C4991s;
import com.xiaomi.accountsdk.request.wvg;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.d3;
import kotlin.io.toq;
import kotlin.io.zy;
import kotlin.jvm.internal.d2ok;
import kotlin.text.a9;
import kotlin.text.fti;
import kotlin.was;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.y9n;

/* JADX INFO: compiled from: ParseMamlResource.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J@\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007J)\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006!"}, d2 = {"Lcom/miui/maml/widget/edit/ParseMamlResource;", "", "", "resPath", "Lcom/miui/maml/widget/edit/CustomEditLinkConfig;", "parseCustomLinkFromResPath", "onlineId", "filePath", "Ljava/lang/Runnable;", "postMainRunnable", "dir", "Lcom/google/gson/g;", "gson", "importMamlResource", "zipPath", "targetFolder", "matchPrefix", "Lkotlin/was;", "unzip$widget_edit_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "unzip", "Ljava/io/File;", "folder", "", "xx", "yy", "version", "typeTag", "", "Lcom/miui/maml/widget/edit/MamlWidget;", "generateMamlWidget", C4991s.f28129n, "()V", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class ParseMamlResource {

    @InterfaceC7396q
    public static final ParseMamlResource INSTANCE = new ParseMamlResource();

    private ParseMamlResource() {
    }

    public static /* synthetic */ List generateMamlWidget$default(ParseMamlResource parseMamlResource, File file, int i2, int i3, int i4, String str, int i5, Object obj) {
        int i6 = (i5 & 2) != 0 ? -1 : i2;
        int i7 = (i5 & 4) != 0 ? -1 : i3;
        int i8 = (i5 & 8) != 0 ? -1 : i4;
        if ((i5 & 16) != 0) {
            str = null;
        }
        return parseMamlResource.generateMamlWidget(file, i6, i7, i8, str);
    }

    public static /* synthetic */ String importMamlResource$default(ParseMamlResource parseMamlResource, String str, String str2, Runnable runnable, String str3, C4871g c4871g, int i2, Object obj) {
        Runnable runnable2 = (i2 & 4) != 0 ? null : runnable;
        String str4 = (i2 & 8) != 0 ? null : str3;
        if ((i2 & 16) != 0) {
            c4871g = MamlutilKt.getGSON_DEFAULT();
        }
        return parseMamlResource.importMamlResource(str, str2, runnable2, str4, c4871g);
    }

    private final CustomEditLinkConfig parseCustomLinkFromResPath(String str) {
        CustomEditLinkConfig customEditLinkConfig;
        ZipFile zipFile = new ZipFile(str);
        try {
            ZipEntry entry = zipFile.getEntry(ParseEditMamlConfig.VAR_CONFIG);
            if (entry != null) {
                InputStream it = zipFile.getInputStream(entry);
                try {
                    d2ok.kja0(it, "it");
                    List<BaseConfig> varXml = ParseEditMamlConfig.parseVarXml(it);
                    if (varXml == null || !(!varXml.isEmpty())) {
                        customEditLinkConfig = null;
                        was wasVar = was.f36763k;
                        zy.m23032k(it, null);
                    } else {
                        for (BaseConfig baseConfig : varXml) {
                            if (baseConfig instanceof CustomEditLinkConfig) {
                                customEditLinkConfig = (CustomEditLinkConfig) baseConfig;
                                break;
                            }
                        }
                        customEditLinkConfig = null;
                        was wasVar2 = was.f36763k;
                        zy.m23032k(it, null);
                    }
                } finally {
                }
            } else {
                customEditLinkConfig = null;
            }
            was wasVar3 = was.f36763k;
            zy.m23032k(zipFile, null);
            return customEditLinkConfig;
        } finally {
        }
    }

    public static /* synthetic */ void unzip$widget_edit_release$default(ParseMamlResource parseMamlResource, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        parseMamlResource.unzip$widget_edit_release(str, str2, str3);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @y9n
    public final List<MamlWidget> generateMamlWidget(@InterfaceC7396q File file) {
        return generateMamlWidget$default(this, file, 0, 0, 0, null, 30, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @y9n
    public final List<MamlWidget> generateMamlWidget(@InterfaceC7396q File file, int i2) {
        return generateMamlWidget$default(this, file, i2, 0, 0, null, 28, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @y9n
    public final List<MamlWidget> generateMamlWidget(@InterfaceC7396q File file, int i2, int i3) {
        return generateMamlWidget$default(this, file, i2, i3, 0, null, 24, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @y9n
    public final List<MamlWidget> generateMamlWidget(@InterfaceC7396q File file, int i2, int i3, int i4) {
        return generateMamlWidget$default(this, file, i2, i3, i4, null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fe  */
    @l05.InterfaceC6768s
    @mub.InterfaceC7396q
    @zy.y9n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.miui.maml.widget.edit.MamlWidget> generateMamlWidget(@mub.InterfaceC7396q java.io.File r21, int r22, int r23, int r24, @mub.InterfaceC7395n java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.widget.edit.ParseMamlResource.generateMamlWidget(java.io.File, int, int, int, java.lang.String):java.util.List");
    }

    @InterfaceC6768s
    @InterfaceC7395n
    @y9n
    public final String importMamlResource(@InterfaceC7395n String str, @InterfaceC7395n String str2) {
        return importMamlResource$default(this, str, str2, null, null, null, 28, null);
    }

    @InterfaceC6768s
    @InterfaceC7395n
    @y9n
    public final String importMamlResource(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n Runnable runnable) {
        return importMamlResource$default(this, str, str2, runnable, null, null, 24, null);
    }

    @InterfaceC6768s
    @InterfaceC7395n
    @y9n
    public final String importMamlResource(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n Runnable runnable, @InterfaceC7395n String str3) {
        return importMamlResource$default(this, str, str2, runnable, str3, null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    @l05.InterfaceC6768s
    @mub.InterfaceC7395n
    @zy.y9n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String importMamlResource(@mub.InterfaceC7395n java.lang.String r22, @mub.InterfaceC7395n java.lang.String r23, @mub.InterfaceC7395n java.lang.Runnable r24, @mub.InterfaceC7395n java.lang.String r25, @mub.InterfaceC7396q com.google.gson.C4871g r26) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.widget.edit.ParseMamlResource.importMamlResource(java.lang.String, java.lang.String, java.lang.Runnable, java.lang.String, com.google.gson.g):java.lang.String");
    }

    @InterfaceC6768s
    @y9n
    public final void unzip$widget_edit_release(@InterfaceC7396q String str, @InterfaceC7396q String str2) {
        unzip$widget_edit_release$default(this, str, str2, null, 4, null);
    }

    @InterfaceC6768s
    @y9n
    public final void unzip$widget_edit_release(@InterfaceC7396q String zipPath, @InterfaceC7396q String targetFolder, @InterfaceC7396q String matchPrefix) {
        d2ok.m23075h(zipPath, "zipPath");
        d2ok.m23075h(targetFolder, "targetFolder");
        d2ok.m23075h(matchPrefix, "matchPrefix");
        ZipFile zipFile = new ZipFile(zipPath);
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            if (enumerationEntries == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.util.Enumeration<java.util.zip.ZipEntry>");
            }
            new File(targetFolder).mkdirs();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry entry = enumerationEntries.nextElement();
                d2ok.kja0(entry, "entry");
                String name = entry.getName();
                d2ok.kja0(name, "name");
                if (!fti.lk(name, "../", false, 2, null) && a9.r6ty(name, matchPrefix, false, 2, null)) {
                    String strDecode = URLDecoder.decode(name, wvg.f72949toq);
                    d2ok.kja0(strDecode, "URLDecoder.decode(name, \"utf-8\")");
                    if (fti.lk(strDecode, "../", false, 2, null)) {
                        Log.w(MamlutilKt.TAG, "unzip() suspect to be a hack act when unzip");
                    } else {
                        File file = new File(targetFolder + (a9.ga(targetFolder, "/", false, 2, null) ? "" : "/") + name);
                        if (entry.isDirectory()) {
                            file.mkdirs();
                        } else {
                            file.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                InputStream input = zipFile.getInputStream(entry);
                                try {
                                    d2ok.kja0(input, "input");
                                    toq.x2(input, fileOutputStream, 0, 2, null);
                                    zy.m23032k(input, null);
                                    zy.m23032k(fileOutputStream, null);
                                } finally {
                                }
                            } finally {
                            }
                        }
                    }
                }
            }
            was wasVar = was.f36763k;
            zy.m23032k(zipFile, null);
        } finally {
        }
    }
}
