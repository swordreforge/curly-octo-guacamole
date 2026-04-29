package com.miui.maml.widget.edit;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.x9kr;
import com.google.android.exoplayer2.extractor.ts.wvg;
import com.google.gson.C4871g;
import com.miui.maml.folme.AnimatedProperty;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.kja0;
import kotlin.comparisons.f7l8;
import kotlin.d3;
import kotlin.io.cdj;
import kotlin.io.toq;
import kotlin.io.zy;
import kotlin.jvm.internal.d2ok;
import kotlin.text.fti;
import kotlin.was;
import l05.InterfaceC6768s;
import miui.util.HashUtils;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.y9n;

/* JADX INFO: compiled from: mamlutil.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000P\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a`\u0010\n\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0007\u001a\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b\u001aB\u0010\u0013\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007\u001aB\u0010\u0014\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007\u001aT\u0010\u0017\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0007\u001a\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001\u001a \u0010 \u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0000H\u0007\u001a\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0003\u001a8\u0010)\u001a\u0004\u0018\u00010'2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00002\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u001a,\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0000H\u0007\u001a,\u0010,\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0000H\u0007\u001a,\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0000H\u0003\u001a \u0010/\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000\u001aX\u00102\u001a\b\u0012\u0004\u0012\u00020*0\u001d2\u0006\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u00100\u001a\u00020\u00102\b\b\u0002\u00101\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0000H\u0007\u001a.\u00103\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0000H\u0007\u001a4\u00106\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u00105\u001a\u00020\u0010H\u0007\u001a\n\u00107\u001a\u00020\u0010*\u00020\u0000\u001a\n\u00108\u001a\u00020\u0010*\u00020\u0000\"\u0014\u00109\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010:\"\u0014\u0010;\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010:\"\u0014\u0010<\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010:\"\u0014\u0010=\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010:\"\u0014\u0010>\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010:\"\u0014\u0010?\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010:\"\u0014\u0010@\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010:\"\u0014\u0010A\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010:\"\u0014\u0010B\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010:\"\u0014\u0010C\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010:\"\u0014\u0010D\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010:\"\u0014\u0010E\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010:\"\u0014\u0010F\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010:\"\u0014\u0010G\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010:\"\u0014\u0010H\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010:\"\u0014\u0010I\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010:\"\u0014\u0010J\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010:\"\u0014\u0010K\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010:\"\u0017\u0010M\u001a\u00020L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0017\u0010Q\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0014\u0010U\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010:\"\u0014\u0010V\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010:\"\u0014\u0010W\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010:\"\u0014\u0010X\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010:\"\u0014\u0010Y\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bY\u0010:\"\u0014\u0010Z\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010:¨\u0006["}, d2 = {"", "id", "type", "resourcePath", MamlutilKt.LINK_ARG_CONFIG_PATH, "", MamlutilKt.LINK_ARG_REEDIT, "from", "customLink", "customParamId", "createLink", "Landroid/content/Context;", "appContext", "themeManagerSupportPaidWidget", "title", "url", "", "version", "fileSizeKb", "startDownloadMaml", "startDownloadMamlAndRight", "dir", "forceUpdate", "downloadAndCopyRight", "Ljava/io/File;", "file", "calculateFileHash", "isCtaAllowed", "context", "", MamlutilKt.METHOD_QUERY_MAML_INFO, "typeTag", "queryMamlInfoForTag", "queryMamlRights", "ctx", "Landroid/net/Uri;", "uri", "method", "arg", "Landroid/os/Bundle;", "extra", x9kr.f50136ch, "Lcom/miui/maml/widget/edit/MamlWidget;", "copyMamlResource", "copyMamlResourceAndRight", "copyMamlRights", "targetFile", "copyUriToPath", AnimatedProperty.PROPERTY_NAME_X, AnimatedProperty.PROPERTY_NAME_Y, "findLocalMamlInfo", "localExistMamlResource", "productIdList", "cacheSize", "cleanMamlResource", "firstNumber", "lastNumber", "TAG", "Ljava/lang/String;", "DOWNLOAD_ACTION", "METHOD_START_DOWNLOAD", "METHOD_START_DOWNLOAD_WITH_RIGHT", "METHOD_DOWNLOAD_AND_COPY_RIGHT", "METHOD_QUERY_MAML_INFO", "METHOD_QUERY_MAML_RIGHT", "METHOD_CTA_ALLOWED", "LINK_ARG_ID", "LINK_ARG_TYPE", "LINK_ARG_RES_PATH", "LINK_ARG_CONFIG_PATH", "LINK_ARG_REEDIT", "LINK_ARG_FROM", "ARG_FROM_PA", "ARG_FROM_HOME", "CUSTOM_EDIT_LOCAL_ID", "IN_PREVIEW_MODE", "Lcom/google/gson/g;", "GSON_DEFAULT", "Lcom/google/gson/g;", "getGSON_DEFAULT", "()Lcom/google/gson/g;", "THEME_PROVIDER_URI", "Landroid/net/Uri;", "getTHEME_PROVIDER_URI", "()Landroid/net/Uri;", "DEFAULT_DIR", "META_FILE", "DESCRIPTION_FILE", "PRE_WIDGET", "PRE_PREVIEW", "PREVIEW_DARK_SUF", "widget-edit_release"}, m22787k = 2, mv = {1, 4, 2})
public final class MamlutilKt {

    @InterfaceC7396q
    public static final String ARG_FROM_HOME = "home";

    @InterfaceC7396q
    public static final String ARG_FROM_PA = "pa";

    @InterfaceC7396q
    public static final String CUSTOM_EDIT_LOCAL_ID = "customEditLocalId";

    @InterfaceC7396q
    public static final String DEFAULT_DIR = "maml.widget";

    @InterfaceC7396q
    public static final String DESCRIPTION_FILE = "description.xml";

    @InterfaceC7396q
    public static final String DOWNLOAD_ACTION = "com.android.thememanager.ACTION.maml.download";

    @InterfaceC7396q
    private static final C4871g GSON_DEFAULT = new C4871g();

    @InterfaceC7396q
    public static final String IN_PREVIEW_MODE = "isPreviewMode";

    @InterfaceC7396q
    public static final String LINK_ARG_CONFIG_PATH = "configPath";

    @InterfaceC7396q
    public static final String LINK_ARG_FROM = "from";

    @InterfaceC7396q
    public static final String LINK_ARG_ID = "id";

    @InterfaceC7396q
    public static final String LINK_ARG_REEDIT = "reEdit";

    @InterfaceC7396q
    public static final String LINK_ARG_RES_PATH = "resourcePath";

    @InterfaceC7396q
    public static final String LINK_ARG_TYPE = "type";

    @InterfaceC7396q
    public static final String META_FILE = "meta.json";

    @InterfaceC7396q
    public static final String METHOD_CTA_ALLOWED = "isThemeCtaAllowed";

    @InterfaceC7396q
    public static final String METHOD_DOWNLOAD_AND_COPY_RIGHT = "downloadAndCopyMamlRight";

    @InterfaceC7396q
    public static final String METHOD_QUERY_MAML_INFO = "queryMamlInfo";

    @InterfaceC7396q
    public static final String METHOD_QUERY_MAML_RIGHT = "queryMamlRight";

    @InterfaceC7396q
    public static final String METHOD_START_DOWNLOAD = "startDownloadMamlWidget";

    @InterfaceC7396q
    public static final String METHOD_START_DOWNLOAD_WITH_RIGHT = "startDownloadMamlWidgetWithRight";

    @InterfaceC7396q
    public static final String PREVIEW_DARK_SUF = "_dark";

    @InterfaceC7396q
    public static final String PRE_PREVIEW = "preview_";

    @InterfaceC7396q
    public static final String PRE_WIDGET = "widget_";

    @InterfaceC7396q
    public static final String TAG = "mamlWidgetSdk";

    @InterfaceC7396q
    private static final Uri THEME_PROVIDER_URI;

    static {
        Uri uri = Uri.parse("content://com.android.thememanager.theme_provider");
        d2ok.kja0(uri, "Uri.parse(\"content://com…emanager.theme_provider\")");
        THEME_PROVIDER_URI = uri;
    }

    @InterfaceC7395n
    public static final String calculateFileHash(@InterfaceC7395n File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        return HashUtils.getSHA1(file);
    }

    @InterfaceC7395n
    public static final Bundle call(@InterfaceC7396q Context ctx, @InterfaceC7396q Uri uri, @InterfaceC7396q String method, @InterfaceC7395n String str, @InterfaceC7395n Bundle bundle) {
        d2ok.m23075h(ctx, "ctx");
        d2ok.m23075h(uri, "uri");
        d2ok.m23075h(method, "method");
        try {
            return ctx.getContentResolver().call(uri, method, str, bundle);
        } catch (Exception e2) {
            Log.i(TAG, "fail call. " + uri + ", " + method + ", " + e2);
            return null;
        }
    }

    public static /* synthetic */ Bundle call$default(Context context, Uri uri, String str, String str2, Bundle bundle, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            bundle = null;
        }
        return call(context, uri, str, str2, bundle);
    }

    @InterfaceC6768s
    @y9n
    public static final int cleanMamlResource(@InterfaceC7396q Context context, @InterfaceC7396q List<String> list) {
        return cleanMamlResource$default(context, list, null, 0, 12, null);
    }

    @InterfaceC6768s
    @y9n
    public static final int cleanMamlResource(@InterfaceC7396q Context context, @InterfaceC7396q List<String> list, @InterfaceC7395n String str) {
        return cleanMamlResource$default(context, list, str, 0, 8, null);
    }

    @InterfaceC6768s
    @y9n
    public static final int cleanMamlResource(@InterfaceC7396q Context context, @InterfaceC7396q final List<String> productIdList, @InterfaceC7395n String str, int i2) {
        File file;
        d2ok.m23075h(context, "context");
        d2ok.m23075h(productIdList, "productIdList");
        if (str == null) {
            file = context.getExternalFilesDir(DEFAULT_DIR);
            d2ok.qrj(file);
        } else {
            file = new File(str);
        }
        d2ok.kja0(file, "if (dir == null) context…ULT_DIR)!! else File(dir)");
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.miui.maml.widget.edit.MamlutilKt$cleanMamlResource$files$1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                d2ok.kja0(file2, "file");
                return file2.isDirectory() && !productIdList.contains(file2.getName());
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length <= i2) {
            Log.i(TAG, "cleanMamlResource. not need.");
            return 0;
        }
        if (fileArrListFiles.length > 1) {
            kja0.izu(fileArrListFiles, new Comparator<T>() { // from class: com.miui.maml.widget.edit.MamlutilKt$cleanMamlResource$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t3) {
                    return f7l8.x2(Long.valueOf(((File) t2).lastModified()), Long.valueOf(((File) t3).lastModified()));
                }
            });
        }
        int length = fileArrListFiles.length - i2;
        for (File file2 : fileArrListFiles) {
            StringBuilder sb = new StringBuilder();
            d2ok.kja0(file2, "file");
            sb.append(file2.getName());
            sb.append(".zip");
            new File(str, sb.toString()).delete();
            cdj.m22881c(file2);
            length--;
            if (length <= 0) {
                break;
            }
        }
        Log.i(TAG, "cleanMamlResource. " + (fileArrListFiles.length - i2));
        return fileArrListFiles.length - i2;
    }

    public static /* synthetic */ int cleanMamlResource$default(Context context, List list, String str, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            i2 = 10;
        }
        return cleanMamlResource(context, list, str, i2);
    }

    @InterfaceC6768s
    @InterfaceC7395n
    @y9n
    public static final List<MamlWidget> copyMamlResource(@InterfaceC7396q Context context, @InterfaceC7396q String str) {
        return copyMamlResource$default(context, str, null, 4, null);
    }

    @InterfaceC6768s
    @InterfaceC7395n
    @y9n
    public static final List<MamlWidget> copyMamlResource(@InterfaceC7396q Context context, @InterfaceC7396q String id, @InterfaceC7395n String str) {
        String path;
        d2ok.m23075h(context, "context");
        d2ok.m23075h(id, "id");
        List<String> listQueryMamlInfo = queryMamlInfo(context, id);
        if (listQueryMamlInfo == null || !(!listQueryMamlInfo.isEmpty())) {
            Log.w(TAG, "copyMamlResource fail. not find " + id);
            return null;
        }
        if (str != null) {
            path = str;
        } else {
            File externalFilesDir = context.getExternalFilesDir(DEFAULT_DIR);
            d2ok.qrj(externalFilesDir);
            d2ok.kja0(externalFilesDir, "context.getExternalFilesDir(DEFAULT_DIR)!!");
            path = externalFilesDir.getPath();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : listQueryMamlInfo) {
            File file = new File(path, id + ".zip");
            String path2 = file.getPath();
            d2ok.kja0(path2, "idFile.path");
            String strCopyUriToPath = copyUriToPath(context, str2, path2);
            if (strCopyUriToPath != null) {
                ParseMamlResource parseMamlResource = ParseMamlResource.INSTANCE;
                String strImportMamlResource$default = ParseMamlResource.importMamlResource$default(parseMamlResource, id, strCopyUriToPath, null, null, null, 28, null);
                if (strImportMamlResource$default != null) {
                    List listGenerateMamlWidget$default = ParseMamlResource.generateMamlWidget$default(parseMamlResource, new File(strImportMamlResource$default), 0, 0, 0, null, 30, null);
                    if (!listGenerateMamlWidget$default.isEmpty()) {
                        arrayList.addAll(listGenerateMamlWidget$default);
                    } else {
                        Log.w(TAG, "generateMamlWidget list empty !");
                    }
                } else {
                    Log.w(TAG, "importMamlResource fail, " + file);
                }
            } else {
                Log.w(TAG, "copy fail. " + str2 + ", " + file);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List copyMamlResource$default(Context context, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return copyMamlResource(context, str, str2);
    }

    @InterfaceC6768s
    @InterfaceC7395n
    @y9n
    public static final List<MamlWidget> copyMamlResourceAndRight(@InterfaceC7396q Context context, @InterfaceC7396q String str) {
        return copyMamlResourceAndRight$default(context, str, null, 4, null);
    }

    @InterfaceC6768s
    @InterfaceC7395n
    @y9n
    public static final List<MamlWidget> copyMamlResourceAndRight(@InterfaceC7396q Context context, @InterfaceC7396q String id, @InterfaceC7395n String str) {
        String path;
        d2ok.m23075h(context, "context");
        d2ok.m23075h(id, "id");
        if (!themeManagerSupportPaidWidget(context)) {
            return copyMamlResource(context, id, str);
        }
        List<String> listCopyMamlRights = copyMamlRights(context, id, str);
        if (listCopyMamlRights == null || listCopyMamlRights.isEmpty()) {
            Log.w(TAG, "copy rights list empty !");
        }
        List<String> listQueryMamlInfo = queryMamlInfo(context, id);
        if (listQueryMamlInfo == null || !(!listQueryMamlInfo.isEmpty())) {
            Log.w(TAG, "copyMamlResource fail. not find " + id);
            return null;
        }
        if (str != null) {
            path = str;
        } else {
            File externalFilesDir = context.getExternalFilesDir(DEFAULT_DIR);
            d2ok.qrj(externalFilesDir);
            d2ok.kja0(externalFilesDir, "context.getExternalFilesDir(DEFAULT_DIR)!!");
            path = externalFilesDir.getPath();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : listQueryMamlInfo) {
            File file = new File(path, id + ".zip");
            String path2 = file.getPath();
            d2ok.kja0(path2, "idFile.path");
            String strCopyUriToPath = copyUriToPath(context, str2, path2);
            if (strCopyUriToPath != null) {
                ParseMamlResource parseMamlResource = ParseMamlResource.INSTANCE;
                String strImportMamlResource$default = ParseMamlResource.importMamlResource$default(parseMamlResource, id, strCopyUriToPath, null, null, null, 28, null);
                if (strImportMamlResource$default != null) {
                    List listGenerateMamlWidget$default = ParseMamlResource.generateMamlWidget$default(parseMamlResource, new File(strImportMamlResource$default), 0, 0, 0, null, 30, null);
                    if (!listGenerateMamlWidget$default.isEmpty()) {
                        arrayList.addAll(listGenerateMamlWidget$default);
                    } else {
                        Log.w(TAG, "generateMamlWidget list empty !");
                    }
                } else {
                    Log.w(TAG, "importMamlResource fail, " + file);
                }
            } else {
                Log.w(TAG, "copy fail. " + str2 + ", " + file);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List copyMamlResourceAndRight$default(Context context, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return copyMamlResourceAndRight(context, str, str2);
    }

    @y9n
    private static final List<String> copyMamlRights(Context context, String str, String str2) {
        List<String> listQueryMamlRights = queryMamlRights(context, str);
        if (listQueryMamlRights == null || !(!listQueryMamlRights.isEmpty())) {
            Log.w(TAG, "copyMamlResource fail. not find " + str);
            return null;
        }
        if (str2 == null) {
            File externalFilesDir = context.getExternalFilesDir(DEFAULT_DIR);
            d2ok.qrj(externalFilesDir);
            d2ok.kja0(externalFilesDir, "context.getExternalFilesDir(DEFAULT_DIR)!!");
            str2 = externalFilesDir.getPath();
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : listQueryMamlRights) {
            String path = new File(str2, str + ".right").getPath();
            d2ok.kja0(path, "idFile.path");
            String strCopyUriToPath = copyUriToPath(context, str3, path);
            if (strCopyUriToPath != null) {
                arrayList.add(strCopyUriToPath);
            }
        }
        return arrayList;
    }

    static /* synthetic */ List copyMamlRights$default(Context context, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return copyMamlRights(context, str, str2);
    }

    @InterfaceC7395n
    public static final String copyUriToPath(@InterfaceC7396q Context context, @InterfaceC7396q String uri, @InterfaceC7396q String targetFile) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(uri, "uri");
        d2ok.m23075h(targetFile, "targetFile");
        if (uri.length() == 0) {
            return null;
        }
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.parse(uri));
            File file = new File(targetFile);
            File parentFile = file.getParentFile();
            d2ok.qrj(parentFile);
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (inputStreamOpenInputStream != null) {
                try {
                    try {
                        toq.x2(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                        zy.m23032k(fileOutputStream, null);
                        zy.m23032k(inputStreamOpenInputStream, null);
                    } finally {
                    }
                } finally {
                }
            }
            return file.getPath();
        } catch (IOException e2) {
            Log.w(TAG, "copyUriToPath fail : " + e2);
            return null;
        }
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final String createLink(@InterfaceC7395n String str, @InterfaceC7395n String str2) {
        return createLink$default(str, str2, null, null, false, null, null, null, 252, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final String createLink(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3) {
        return createLink$default(str, str2, str3, null, false, null, null, null, 248, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final String createLink(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, @InterfaceC7395n String str4) {
        return createLink$default(str, str2, str3, str4, false, null, null, null, wvg.f64659wvg, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final String createLink(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, @InterfaceC7395n String str4, boolean z2) {
        return createLink$default(str, str2, str3, str4, z2, null, null, null, 224, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final String createLink(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, @InterfaceC7395n String str4, boolean z2, @InterfaceC7396q String str5) {
        return createLink$default(str, str2, str3, str4, z2, str5, null, null, wvg.f64653fu4, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final String createLink(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, @InterfaceC7395n String str4, boolean z2, @InterfaceC7396q String str5, @InterfaceC7395n String str6) {
        return createLink$default(str, str2, str3, str4, z2, str5, str6, null, 128, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final String createLink(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, @InterfaceC7395n String str4, boolean z2, @InterfaceC7396q String from, @InterfaceC7395n String str5, @InterfaceC7395n String str6) {
        d2ok.m23075h(from, "from");
        if (str2 == null || str2.length() == 0) {
            Log.e(TAG, "createLink, type invalid.");
        }
        if (str5 != null && str5.length() > 1 && str6 != null) {
            return str5 + str6 + "&from=" + from + "&type=" + str2;
        }
        if (str == null || str.length() == 0) {
            Log.e(TAG, "createLink, id invalid");
        }
        String str7 = "pa://com.miui.personalassistant/editmaml?id=" + str + "&type=" + str2;
        if (str3 != null) {
            str7 = str7 + "&resourcePath=" + Uri.encode(str3);
        } else {
            Log.e(TAG, "createLink resourcePath null");
        }
        if (str4 != null) {
            str7 = str7 + "&configPath=" + Uri.encode(str4);
        }
        return str7 + "&from=" + from + "&reEdit=" + z2;
    }

    public static /* synthetic */ String createLink$default(String str, String str2, String str3, String str4, boolean z2, String str5, String str6, String str7, int i2, Object obj) {
        return createLink(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? ARG_FROM_PA : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) == 0 ? str7 : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    @l05.InterfaceC6768s
    @zy.y9n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int downloadAndCopyRight(@mub.InterfaceC7395n android.content.Context r16, @mub.InterfaceC7395n java.lang.String r17, @mub.InterfaceC7395n java.lang.String r18, @mub.InterfaceC7395n java.lang.String r19, int r20, int r21, @mub.InterfaceC7395n java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.widget.edit.MamlutilKt.downloadAndCopyRight(android.content.Context, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, boolean):int");
    }

    @InterfaceC6768s
    @y9n
    public static final int downloadAndCopyRight(@InterfaceC7395n Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, int i2, @InterfaceC7395n String str4, boolean z2) {
        return downloadAndCopyRight$default(context, str, str2, str3, i2, 0, str4, z2, 32, null);
    }

    public static /* synthetic */ int downloadAndCopyRight$default(Context context, String str, String str2, String str3, int i2, int i3, String str4, boolean z2, int i4, Object obj) {
        return downloadAndCopyRight(context, str, str2, str3, i2, (i4 & 32) != 0 ? 0 : i3, str4, z2);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @y9n
    public static final List<MamlWidget> findLocalMamlInfo(@InterfaceC7396q Context context) {
        return findLocalMamlInfo$default(context, null, null, 0, 0, 0, null, 126, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @y9n
    public static final List<MamlWidget> findLocalMamlInfo(@InterfaceC7396q Context context, @InterfaceC7395n String str) {
        return findLocalMamlInfo$default(context, str, null, 0, 0, 0, null, 124, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @y9n
    public static final List<MamlWidget> findLocalMamlInfo(@InterfaceC7396q Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2) {
        return findLocalMamlInfo$default(context, str, str2, 0, 0, 0, null, 120, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @y9n
    public static final List<MamlWidget> findLocalMamlInfo(@InterfaceC7396q Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2, int i2) {
        return findLocalMamlInfo$default(context, str, str2, i2, 0, 0, null, 112, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @y9n
    public static final List<MamlWidget> findLocalMamlInfo(@InterfaceC7396q Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2, int i2, int i3) {
        return findLocalMamlInfo$default(context, str, str2, i2, i3, 0, null, 96, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @y9n
    public static final List<MamlWidget> findLocalMamlInfo(@InterfaceC7396q Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2, int i2, int i3, int i4) {
        return findLocalMamlInfo$default(context, str, str2, i2, i3, i4, null, 64, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    @y9n
    public static final List<MamlWidget> findLocalMamlInfo(@InterfaceC7396q Context context, @InterfaceC7395n String str, @InterfaceC7395n final String str2, int i2, int i3, int i4, @InterfaceC7395n String str3) {
        File file;
        d2ok.m23075h(context, "context");
        if (str == null || str.length() == 0) {
            file = context.getExternalFilesDir(DEFAULT_DIR);
            d2ok.qrj(file);
        } else {
            file = new File(str);
        }
        d2ok.kja0(file, "if (dir.isNullOrEmpty())…ULT_DIR)!! else File(dir)");
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.miui.maml.widget.edit.MamlutilKt$findLocalMamlInfo$files$1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String name) {
                if (str2 == null) {
                    return true;
                }
                d2ok.kja0(name, "name");
                return fti.lk(name, str2, false, 2, null);
            }
        });
        ArrayList arrayList = new ArrayList();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                for (File folder : fileArrListFiles) {
                    d2ok.kja0(folder, "folder");
                    if (!folder.isFile()) {
                        List<MamlWidget> listGenerateMamlWidget = ParseMamlResource.INSTANCE.generateMamlWidget(folder, i2, i3, i4, str3);
                        if (!listGenerateMamlWidget.isEmpty()) {
                            arrayList.addAll(listGenerateMamlWidget);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List findLocalMamlInfo$default(Context context, String str, String str2, int i2, int i3, int i4, String str3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        if ((i5 & 8) != 0) {
            i2 = 0;
        }
        if ((i5 & 16) != 0) {
            i3 = 0;
        }
        if ((i5 & 32) != 0) {
            i4 = 0;
        }
        if ((i5 & 64) != 0) {
            str3 = null;
        }
        return findLocalMamlInfo(context, str, str2, i2, i3, i4, str3);
    }

    public static final int firstNumber(@InterfaceC7396q String firstNumber) {
        d2ok.m23075h(firstNumber, "$this$firstNumber");
        int length = firstNumber.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = firstNumber.charAt(i2);
            if (Character.isDigit(cCharAt)) {
                return cCharAt - '0';
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final C4871g getGSON_DEFAULT() {
        return GSON_DEFAULT;
    }

    @InterfaceC7396q
    public static final Uri getTHEME_PROVIDER_URI() {
        return THEME_PROVIDER_URI;
    }

    @y9n
    public static final boolean isCtaAllowed(@InterfaceC7396q Context appContext) {
        d2ok.m23075h(appContext, "appContext");
        Bundle bundleCall$default = call$default(appContext, THEME_PROVIDER_URI, METHOD_CTA_ALLOWED, null, null, 24, null);
        if (bundleCall$default != null) {
            return bundleCall$default.getBoolean("ctaAllowed");
        }
        return false;
    }

    public static final int lastNumber(@InterfaceC7396q String lastNumber) {
        d2ok.m23075h(lastNumber, "$this$lastNumber");
        for (int length = lastNumber.length() - 1; length >= 0; length--) {
            char cCharAt = lastNumber.charAt(length);
            if (Character.isDigit(cCharAt)) {
                return cCharAt - '0';
            }
        }
        return -1;
    }

    @InterfaceC6768s
    @y9n
    public static final boolean localExistMamlResource(@InterfaceC7396q Context context, @InterfaceC7396q String str) {
        return localExistMamlResource$default(context, str, 0, null, 12, null);
    }

    @InterfaceC6768s
    @y9n
    public static final boolean localExistMamlResource(@InterfaceC7396q Context context, @InterfaceC7396q String str, int i2) {
        return localExistMamlResource$default(context, str, i2, null, 8, null);
    }

    @InterfaceC6768s
    @y9n
    public static final boolean localExistMamlResource(@InterfaceC7396q Context context, @InterfaceC7396q String id, int i2, @InterfaceC7395n String str) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(id, "id");
        List listFindLocalMamlInfo$default = findLocalMamlInfo$default(context, str, id, 0, 0, 0, null, 120, null);
        return (listFindLocalMamlInfo$default.isEmpty() ^ true) && (i2 <= 0 || ((MamlWidget) listFindLocalMamlInfo$default.get(0)).getInfo().getVersionCode() == i2);
    }

    public static /* synthetic */ boolean localExistMamlResource$default(Context context, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        if ((i3 & 8) != 0) {
            str2 = null;
        }
        return localExistMamlResource(context, str, i2, str2);
    }

    @InterfaceC7395n
    @y9n
    public static final List<String> queryMamlInfo(@InterfaceC7396q Context context, @InterfaceC7395n String str) {
        Bundle bundle;
        d2ok.m23075h(context, "context");
        if (str == null || str.length() == 0) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putString("id", str);
        }
        Bundle bundleCall = call(context, THEME_PROVIDER_URI, METHOD_QUERY_MAML_INFO, null, bundle);
        if (bundleCall != null) {
            return bundleCall.getStringArrayList("list");
        }
        return null;
    }

    @InterfaceC7395n
    @y9n
    public static final List<String> queryMamlInfoForTag(@InterfaceC7396q Context context, @InterfaceC7396q String typeTag) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(typeTag, "typeTag");
        Uri uri = THEME_PROVIDER_URI;
        Bundle bundle = new Bundle();
        bundle.putString("typeTag", typeTag);
        was wasVar = was.f36763k;
        Bundle bundleCall = call(context, uri, METHOD_QUERY_MAML_INFO, null, bundle);
        if (bundleCall != null) {
            return bundleCall.getStringArrayList("list");
        }
        return null;
    }

    @y9n
    private static final List<String> queryMamlRights(Context context, String str) {
        Bundle bundle;
        if (str == null || str.length() == 0) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putString("id", str);
        }
        if (themeManagerSupportPaidWidget(context)) {
            Bundle bundleCall = call(context, THEME_PROVIDER_URI, METHOD_QUERY_MAML_RIGHT, null, bundle);
            if (bundleCall != null) {
                return bundleCall.getStringArrayList("list");
            }
            return null;
        }
        Log.w(TAG, "queryMamlRights productId " + str + ", ThemeManager not support paid widget.");
        return null;
    }

    @InterfaceC6768s
    @y9n
    public static final int startDownloadMaml(@InterfaceC7395n Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, int i2) {
        return startDownloadMaml$default(context, str, str2, str3, i2, 0, 32, null);
    }

    @InterfaceC6768s
    @y9n
    public static final int startDownloadMaml(@InterfaceC7395n Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, int i2, int i3) {
        if (context != null) {
            if (!(str == null || str.length() == 0)) {
                if (!(str2 == null || str2.length() == 0)) {
                    if (!(str3 == null || str3.length() == 0)) {
                        Uri uri = THEME_PROVIDER_URI;
                        Bundle bundle = new Bundle();
                        bundle.putString("id", str);
                        bundle.putString("title", str2);
                        bundle.putString("url", str3);
                        bundle.putInt("version", i2);
                        bundle.putInt("fileSizeKb", i3);
                        was wasVar = was.f36763k;
                        Bundle bundleCall = call(context, uri, METHOD_START_DOWNLOAD, null, bundle);
                        if (bundleCall == null) {
                            Log.w(TAG, "call theme-manager fail. no result. ");
                            return -1;
                        }
                        int i4 = bundleCall.getInt("code", -10);
                        if (i4 == -2) {
                            Log.i(TAG, "theme manager not allow cta.");
                        } else if (i4 == -1) {
                            Log.i(TAG, "failed start download.)-");
                        } else if (i4 == 0 || i4 == 1) {
                            Log.i(TAG, "start download... " + str + ", " + str2 + ", " + i2);
                        }
                        return i4;
                    }
                }
            }
        }
        Log.e(TAG, "startDownloadMaml fai. " + context + ", " + str + ", " + str2 + ", " + str3);
        return -1;
    }

    public static /* synthetic */ int startDownloadMaml$default(Context context, String str, String str2, String str3, int i2, int i3, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        return startDownloadMaml(context, str, str2, str3, i2, i3);
    }

    @InterfaceC6768s
    @y9n
    public static final int startDownloadMamlAndRight(@InterfaceC7395n Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, int i2) {
        return startDownloadMamlAndRight$default(context, str, str2, str3, i2, 0, 32, null);
    }

    @InterfaceC6768s
    @y9n
    public static final int startDownloadMamlAndRight(@InterfaceC7395n Context context, @InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3, int i2, int i3) {
        if (context != null) {
            if (!(str == null || str.length() == 0)) {
                if (!(str2 == null || str2.length() == 0)) {
                    if (!themeManagerSupportPaidWidget(context)) {
                        Log.w(TAG, "startDownloadMamlAndRight productId " + str + ", ThemeManager not support paid widget.");
                        return startDownloadMaml(context, str, str2, str3, i2, i3);
                    }
                    Uri uri = THEME_PROVIDER_URI;
                    Bundle bundle = new Bundle();
                    bundle.putString("id", str);
                    bundle.putString("title", str2);
                    bundle.putString("url", str3);
                    bundle.putInt("version", i2);
                    bundle.putInt("fileSizeKb", i3);
                    was wasVar = was.f36763k;
                    Bundle bundleCall = call(context, uri, METHOD_START_DOWNLOAD_WITH_RIGHT, null, bundle);
                    if (bundleCall == null) {
                        Log.w(TAG, "call theme-manager fail. no result. ");
                        return -1;
                    }
                    int i4 = bundleCall.getInt("code", -10);
                    if (i4 == -2) {
                        Log.i(TAG, "theme manager not allow cta.");
                    } else if (i4 == -1) {
                        Log.i(TAG, "widget failed start download.)-");
                    } else if (i4 == 0 || i4 == 1) {
                        Log.i(TAG, "widget start download... " + str + ", " + str2 + ", " + i2);
                    }
                    return i4;
                }
            }
        }
        Log.e(TAG, "startDownloadMamlAndRight fail. " + context + ", " + str + ", " + str2);
        return -1;
    }

    public static /* synthetic */ int startDownloadMamlAndRight$default(Context context, String str, String str2, String str3, int i2, int i3, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        return startDownloadMamlAndRight(context, str, str2, str3, i2, i3);
    }

    public static final boolean themeManagerSupportPaidWidget(@InterfaceC7396q Context appContext) {
        d2ok.m23075h(appContext, "appContext");
        try {
            ApplicationInfo applicationInfo = appContext.getPackageManager().getApplicationInfo("com.android.thememanager", 128);
            d2ok.kja0(applicationInfo, "appContext.packageManage…ageManager.GET_META_DATA)");
            return applicationInfo.metaData.getBoolean("supportPaidWidget");
        } catch (Exception e2) {
            Log.i(TAG, "fail supportPaidWidget., " + e2);
            return false;
        }
    }
}
