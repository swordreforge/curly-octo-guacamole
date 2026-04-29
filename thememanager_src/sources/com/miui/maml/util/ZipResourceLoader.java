package com.miui.maml.util;

import android.text.TextUtils;
import com.miui.maml.ResourceLoader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class ZipResourceLoader extends ResourceLoader {
    private static final String LOG_TAG = "ZipResourceLoader";
    private String mInnerPath;
    private Object mLock;
    private String mResourcePath;
    private ZipFile mZipFile;

    public ZipResourceLoader(String str) {
        this(str, null, null);
    }

    private void close() {
        synchronized (this.mLock) {
            ZipFile zipFile = this.mZipFile;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException unused) {
                }
                this.mZipFile = null;
            }
        }
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    @Override // com.miui.maml.ResourceLoader
    public void finish() {
        close();
        super.finish();
    }

    @Override // com.miui.maml.ResourceLoader
    @dd
    public File getExtraFile(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str.startsWith("/") ? new File(str) : new File(new File(this.mResourcePath).getParent(), str);
    }

    @Override // com.miui.maml.ResourceLoader
    public String getID() {
        return LOG_TAG + this.mResourcePath + this.mInnerPath;
    }

    @Override // com.miui.maml.ResourceLoader
    public InputStream getInputStream(String str, long[] jArr) {
        if (this.mZipFile == null || str == null) {
            return null;
        }
        synchronized (this.mLock) {
            ZipFile zipFile = this.mZipFile;
            if (zipFile != null) {
                ZipEntry entry = zipFile.getEntry(this.mInnerPath + str);
                if (entry == null) {
                    return null;
                }
                if (jArr == null) {
                    return this.mZipFile.getInputStream(entry);
                }
                try {
                    jArr[0] = entry.getSize();
                    return this.mZipFile.getInputStream(entry);
                } catch (IOException e2) {
                    MamlLog.m17850d(LOG_TAG, e2.toString());
                }
            }
            return null;
        }
    }

    @Override // com.miui.maml.ResourceLoader
    public void init() {
        super.init();
        synchronized (this.mLock) {
            if (this.mZipFile == null) {
                try {
                    this.mZipFile = new ZipFile(this.mResourcePath);
                } catch (IOException e2) {
                    e2.printStackTrace();
                    MamlLog.m17851e(LOG_TAG, "fail to init zip file: " + this.mResourcePath);
                }
            }
        }
    }

    @Override // com.miui.maml.ResourceLoader
    public boolean resourceExists(String str) {
        boolean z2 = false;
        if (this.mZipFile == null || str == null) {
            return false;
        }
        synchronized (this.mLock) {
            ZipFile zipFile = this.mZipFile;
            if (zipFile != null) {
                if (zipFile.getEntry(this.mInnerPath + str) != null) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public ZipResourceLoader(String str, String str2) {
        this(str, str2, null);
    }

    public ZipResourceLoader(String str, String str2, String str3) {
        this.mLock = new Object();
        if (!TextUtils.isEmpty(str)) {
            this.mResourcePath = str;
            this.mInnerPath = str2 == null ? "" : str2;
            if (str3 != null) {
                this.mManifestName = str3;
            }
            init();
            return;
        }
        throw new IllegalArgumentException("empty zip path");
    }
}
