package com.miui.maml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.MemoryFile;
import android.text.TextUtils;
import com.miui.maml.ResourceManager;
import com.miui.maml.util.MamlLog;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import miuix.core.util.f7l8;
import org.w3c.dom.Element;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ResourceLoader {
    private static final String CONFIG_FILE_NAME = "config.xml";
    private static final String IMAGES_FOLDER_NAME = "images";
    private static final String LOG_TAG = "ResourceLoader";
    private static final String MANIFEST_FILE_NAME = "manifest.xml";
    protected String mLanguageCountrySuffix;
    protected String mLanguageSuffix;
    protected Locale mLocale;
    protected String mManifestName = MANIFEST_FILE_NAME;
    protected String mConfigName = CONFIG_FILE_NAME;

    private Element getXmlRoot(String str) {
        InputStream inputStream = getInputStream(getPathForLanguage(str));
        try {
            if (inputStream == null) {
                MamlLog.m17853i(LOG_TAG, "getXmlRoot local inputStream is null");
                return null;
            }
            try {
                return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getDocumentElement();
            } catch (Exception | OutOfMemoryError e2) {
                MamlLog.m17851e(LOG_TAG, e2.toString());
                return null;
            }
        } finally {
            f7l8.toq(inputStream);
        }
    }

    public void finish() {
    }

    public ResourceManager.BitmapInfo getBitmapInfo(String str, BitmapFactory.Options options) {
        Rect rect;
        Bitmap bitmapDecodeStream;
        String pathForLanguage = getPathForLanguage(str, IMAGES_FOLDER_NAME);
        if (pathForLanguage == null) {
            MamlLog.m17850d(LOG_TAG, "TRY AGAIN to get getPathForLanguage: " + str);
            pathForLanguage = getPathForLanguage(str, IMAGES_FOLDER_NAME);
            if (pathForLanguage == null) {
                MamlLog.m17853i(LOG_TAG, "fail to get getPathForLanguage: " + str);
                return null;
            }
        }
        InputStream inputStream = getInputStream(pathForLanguage);
        if (inputStream == null) {
            MamlLog.m17850d(LOG_TAG, "TRY AGAIN to get InputStream: " + str);
            inputStream = getInputStream(pathForLanguage);
            if (inputStream == null) {
                MamlLog.m17853i(LOG_TAG, "fail to get InputStream: " + str);
                return null;
            }
        }
        try {
            try {
                rect = new Rect();
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, rect, options);
            } catch (OutOfMemoryError e2) {
                MamlLog.m17851e(LOG_TAG, e2.toString());
            }
            if (bitmapDecodeStream != null) {
                return new ResourceManager.BitmapInfo(bitmapDecodeStream, rect);
            }
            MamlLog.m17850d(LOG_TAG, "TRY AGAIN to decode bitmap: " + str);
            if (BitmapFactory.decodeStream(inputStream, rect, options) == null) {
                MamlLog.m17853i(LOG_TAG, "fail to decode bitmap: " + str);
                return null;
            }
            return null;
        } finally {
            f7l8.toq(inputStream);
        }
    }

    public Element getConfigRoot() {
        return getXmlRoot(this.mConfigName);
    }

    @dd
    public File getExtraFile(String str) {
        return null;
    }

    public MemoryFile getFile(String str) {
        byte[] bArr;
        MemoryFile memoryFile;
        int i2;
        long[] jArr = new long[1];
        InputStream inputStream = getInputStream(str, jArr);
        if (inputStream == null) {
            return null;
        }
        try {
            try {
                bArr = new byte[65536];
                memoryFile = new MemoryFile(str, (int) jArr[0]);
                i2 = 0;
            } finally {
                f7l8.toq(inputStream);
            }
        } catch (IOException | OutOfMemoryError e2) {
            MamlLog.m17851e(LOG_TAG, e2.toString());
        }
        while (true) {
            int i3 = inputStream.read(bArr, 0, 65536);
            if (i3 <= 0) {
                break;
            }
            memoryFile.writeBytes(bArr, 0, i2, i3);
            i2 += i3;
            return null;
        }
        if (memoryFile.length() > 0) {
            return memoryFile;
        }
        return null;
    }

    public String getID() {
        return "";
    }

    public final InputStream getInputStream(String str) {
        return getInputStream(str, null);
    }

    public abstract InputStream getInputStream(String str, long[] jArr);

    public Locale getLocale() {
        return this.mLocale;
    }

    public Element getManifestRoot() {
        return getXmlRoot(this.mManifestName);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[PHI: r0
      0x002d: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v3 java.lang.String), (r0v6 java.lang.String) binds: [B:7:0x0016, B:9:0x001e, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getPathForLanguage(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.mLanguageCountrySuffix
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L15
            java.lang.String r0 = r3.mLanguageCountrySuffix
            java.lang.String r0 = com.miui.maml.util.Utils.addFileNameSuffix(r4, r0)
            boolean r2 = r3.resourceExists(r0)
            if (r2 != 0) goto L16
        L15:
            r0 = r1
        L16:
            if (r0 != 0) goto L2d
            java.lang.String r2 = r3.mLanguageSuffix
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L2d
            java.lang.String r0 = r3.mLanguageSuffix
            java.lang.String r0 = com.miui.maml.util.Utils.addFileNameSuffix(r4, r0)
            boolean r2 = r3.resourceExists(r0)
            if (r2 != 0) goto L2d
            goto L2e
        L2d:
            r1 = r0
        L2e:
            if (r1 == 0) goto L31
            r4 = r1
        L31:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.ResourceLoader.getPathForLanguage(java.lang.String):java.lang.String");
    }

    public void init() {
    }

    public abstract boolean resourceExists(String str);

    public ResourceLoader setLocal(Locale locale) {
        if (locale != null) {
            this.mLanguageSuffix = locale.getLanguage();
            String string = locale.toString();
            this.mLanguageCountrySuffix = string;
            if (TextUtils.equals(this.mLanguageSuffix, string)) {
                this.mLanguageSuffix = null;
            }
        }
        this.mLocale = locale;
        return this;
    }

    private String getPathForLanguage(String str, String str2) {
        if (!TextUtils.isEmpty(this.mLanguageCountrySuffix)) {
            String str3 = str2 + "_" + this.mLanguageCountrySuffix + "/" + str;
            if (resourceExists(str3)) {
                return str3;
            }
        }
        if (!TextUtils.isEmpty(this.mLanguageSuffix)) {
            String str4 = str2 + "_" + this.mLanguageSuffix + "/" + str;
            if (resourceExists(str4)) {
                return str4;
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            String str5 = str2 + "/" + str;
            if (resourceExists(str5)) {
                return str5;
            }
        }
        if (resourceExists(str)) {
            return str;
        }
        return null;
    }
}
