package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.miui.maml.folme.AnimatedProperty;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import zy.InterfaceC7824b;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.o1t;
import zy.yz;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* JADX INFO: renamed from: f */
    private static final String f3418f = "displayName";

    /* JADX INFO: renamed from: g */
    private static final String f3419g = "android.support.FILE_PROVIDER_PATHS";

    /* JADX INFO: renamed from: h */
    private static final String f3420h = "external-path";

    /* JADX INFO: renamed from: i */
    private static final String f3421i = "external-files-path";

    /* JADX INFO: renamed from: l */
    private static final String f3422l = "path";

    /* JADX INFO: renamed from: p */
    private static final String f3424p = "cache-path";

    /* JADX INFO: renamed from: r */
    private static final String f3425r = "name";

    /* JADX INFO: renamed from: s */
    private static final String f3426s = "files-path";

    /* JADX INFO: renamed from: t */
    private static final String f3427t = "external-media-path";

    /* JADX INFO: renamed from: y */
    private static final String f3428y = "root-path";

    /* JADX INFO: renamed from: z */
    private static final String f3429z = "external-cache-path";

    /* JADX INFO: renamed from: k */
    private toq f3430k;

    /* JADX INFO: renamed from: q */
    private int f3431q;

    /* JADX INFO: renamed from: n */
    private static final String[] f3423n = {"_display_name", "_size"};

    /* JADX INFO: renamed from: c */
    private static final File f3416c = new File("/");

    /* JADX INFO: renamed from: e */
    @o1t("sCache")
    private static final HashMap<String, toq> f3417e = new HashMap<>();

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$k */
    @hyr(21)
    static class C0476k {
        private C0476k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static File[] m2168k(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    interface toq {
        /* JADX INFO: renamed from: k */
        Uri mo2169k(File file);

        File toq(Uri uri);
    }

    static class zy implements toq {

        /* JADX INFO: renamed from: k */
        private final String f3432k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final HashMap<String, File> f50349toq = new HashMap<>();

        zy(String str) {
            this.f3432k = str;
        }

        @Override // androidx.core.content.FileProvider.toq
        /* JADX INFO: renamed from: k */
        public Uri mo2169k(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f50349toq.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f3432k).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.toq
        public File toq(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f50349toq.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        void zy(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f50349toq.put(str, file.getCanonicalFile());
            } catch (IOException e2) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e2);
            }
        }
    }

    public FileProvider() {
        this.f3431q = 0;
    }

    @lvui
    @SuppressLint({"StreamFiles"})
    public static Uri f7l8(@lvui Context context, @lvui String str, @lvui File file, @lvui String str2) {
        return m2162g(context, str, file).buildUpon().appendQueryParameter(f3418f, str2).build();
    }

    /* JADX INFO: renamed from: g */
    public static Uri m2162g(@lvui Context context, @lvui String str, @lvui File file) {
        return m2164n(context, str, 0).mo2169k(file);
    }

    /* JADX INFO: renamed from: k */
    private static File m2163k(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: n */
    private static toq m2164n(Context context, String str, int i2) {
        toq toqVarM2166s;
        HashMap<String, toq> map = f3417e;
        synchronized (map) {
            toqVarM2166s = map.get(str);
            if (toqVarM2166s == null) {
                try {
                    try {
                        toqVarM2166s = m2166s(context, str, i2);
                        map.put(str, toqVarM2166s);
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return toqVarM2166s;
    }

    @yz
    /* JADX INFO: renamed from: q */
    static XmlResourceParser m2165q(Context context, String str, @dd ProviderInfo providerInfo, int i2) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i2 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(f3419g, i2);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), f3419g);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    /* JADX INFO: renamed from: s */
    private static toq m2166s(Context context, String str, int i2) throws XmlPullParserException, IOException {
        zy zyVar = new zy(str);
        XmlResourceParser xmlResourceParserM2165q = m2165q(context, str, context.getPackageManager().resolveContentProvider(str, 128), i2);
        while (true) {
            int next = xmlResourceParserM2165q.next();
            if (next == 1) {
                return zyVar;
            }
            if (next == 2) {
                String name = xmlResourceParserM2165q.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserM2165q.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserM2165q.getAttributeValue(null, "path");
                if (f3428y.equals(name)) {
                    externalStorageDirectory = f3416c;
                } else if (f3426s.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (f3424p.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (f3420h.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (f3421i.equals(name)) {
                    File[] fileArrLd6 = C0498q.ld6(context, null);
                    if (fileArrLd6.length > 0) {
                        externalStorageDirectory = fileArrLd6[0];
                    }
                } else if (f3429z.equals(name)) {
                    File[] fileArrM2257p = C0498q.m2257p(context);
                    if (fileArrM2257p.length > 0) {
                        externalStorageDirectory = fileArrM2257p[0];
                    }
                } else if (f3427t.equals(name)) {
                    File[] fileArrM2168k = C0476k.m2168k(context);
                    if (fileArrM2168k.length > 0) {
                        externalStorageDirectory = fileArrM2168k[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    zyVar.zy(attributeValue, m2163k(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    private static Object[] toq(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        return objArr2;
    }

    /* JADX INFO: renamed from: y */
    private static int m2167y(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (AnimatedProperty.PROPERTY_NAME_W.equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static String[] zy(String[] strArr, int i2) {
        String[] strArr2 = new String[i2];
        System.arraycopy(strArr, 0, strArr2, 0, i2);
        return strArr2;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@lvui Context context, @lvui ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, toq> map = f3417e;
        synchronized (map) {
            map.remove(str);
        }
        this.f3430k = m2164n(context, str, this.f3431q);
    }

    @Override // android.content.ContentProvider
    public int delete(@lvui Uri uri, @dd String str, @dd String[] strArr) {
        return this.f3430k.toq(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @dd
    public String getType(@lvui Uri uri) {
        File qVar = this.f3430k.toq(uri);
        int iLastIndexOf = qVar.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(qVar.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@lvui Uri uri, @lvui ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@lvui Uri uri, @lvui String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f3430k.toq(uri), m2167y(str));
    }

    @Override // android.content.ContentProvider
    @lvui
    public Cursor query(@lvui Uri uri, @dd String[] strArr, @dd String str, @dd String[] strArr2, @dd String str2) {
        int i2;
        File qVar = this.f3430k.toq(uri);
        String queryParameter = uri.getQueryParameter(f3418f);
        if (strArr == null) {
            strArr = f3423n;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i3 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i2 = i3 + 1;
                objArr[i3] = queryParameter == null ? qVar.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i2 = i3 + 1;
                objArr[i3] = Long.valueOf(qVar.length());
            }
            i3 = i2;
        }
        String[] strArrZy = zy(strArr3, i3);
        Object[] qVar2 = toq(objArr, i3);
        MatrixCursor matrixCursor = new MatrixCursor(strArrZy, 1);
        matrixCursor.addRow(qVar2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@lvui Uri uri, @lvui ContentValues contentValues, @dd String str, @dd String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected FileProvider(@InterfaceC7824b int i2) {
        this.f3431q = i2;
    }
}
