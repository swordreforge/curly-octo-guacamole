package com.android.thememanager.util.cache;

import android.util.LruCache;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import miuix.core.util.C7083n;

/* JADX INFO: compiled from: FolderCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private LruCache<String, C7938toq> f16354k;

    /* JADX INFO: renamed from: com.android.thememanager.util.cache.toq$k */
    /* JADX INFO: compiled from: FolderCache.java */
    public static class C2765k {

        /* JADX INFO: renamed from: k */
        public String f16355k;

        /* JADX INFO: renamed from: q */
        public long f16356q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f61210toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public long f61211zy;
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.cache.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FolderCache.java */
    public static class C7938toq {

        /* JADX INFO: renamed from: k */
        public String f16357k;

        /* JADX INFO: renamed from: n */
        public Map<String, C2765k> f16358n;

        /* JADX INFO: renamed from: q */
        public int f16359q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f61212toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public long f61213zy;
    }

    public toq() {
        this.f16354k = new LruCache<>(10);
    }

    protected C7938toq f7l8() {
        return new C7938toq();
    }

    /* JADX INFO: renamed from: g */
    protected C2765k m9656g() {
        return new C2765k();
    }

    /* JADX INFO: renamed from: k */
    protected C2765k m9657k(String filePath, C7938toq folderInfo) {
        File file = new File(filePath);
        if (file.isDirectory()) {
            return null;
        }
        C2765k c2765kM9656g = m9656g();
        c2765kM9656g.f16355k = file.getName();
        c2765kM9656g.f61210toq = filePath;
        c2765kM9656g.f61211zy = file.lastModified();
        c2765kM9656g.f16356q = file.length();
        return c2765kM9656g;
    }

    /* JADX INFO: renamed from: n */
    protected boolean m9658n(C7938toq folderInfo) {
        if (folderInfo != null) {
            File file = new File(folderInfo.f61212toq);
            long jLastModified = file.lastModified();
            String[] list = file.list();
            int length = list == null ? 0 : list.length;
            if (folderInfo.f61213zy == jLastModified && folderInfo.f16359q == length && list != null) {
                for (String str : list) {
                    String str2 = folderInfo.f61212toq + str;
                    if (!new File(str2).isDirectory()) {
                        C2765k c2765k = folderInfo.f16358n.get(str2);
                        if (c2765k == null) {
                            return true;
                        }
                        File file2 = new File(str2);
                        if (c2765k.f61211zy != file2.lastModified() || c2765k.f16356q != file2.length()) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m9659q(String folderPath) {
        return m9658n(this.f16354k.get(C7083n.ld6(folderPath)));
    }

    protected C7938toq toq(String folderPath) {
        File file = new File(folderPath);
        if (!file.isDirectory()) {
            return null;
        }
        C7938toq c7938toqF7l8 = f7l8();
        c7938toqF7l8.f16357k = file.getName();
        c7938toqF7l8.f61212toq = folderPath;
        c7938toqF7l8.f61213zy = file.lastModified();
        String[] list = file.list();
        c7938toqF7l8.f16359q = list == null ? 0 : list.length;
        c7938toqF7l8.f16358n = new HashMap(c7938toqF7l8.f16359q);
        if (list == null) {
            return c7938toqF7l8;
        }
        for (String str : list) {
            String str2 = folderPath + str;
            C2765k c2765kM9657k = m9657k(str2, c7938toqF7l8);
            if (c2765kM9657k != null) {
                c7938toqF7l8.f16358n.put(str2, c2765kM9657k);
            }
        }
        return c7938toqF7l8;
    }

    public C7938toq zy(String folderPath) {
        String strLd6 = C7083n.ld6(folderPath);
        C7938toq qVar = this.f16354k.get(strLd6);
        if (m9658n(qVar)) {
            synchronized (this) {
                if (m9658n(qVar) && (qVar = toq(strLd6)) != null) {
                    this.f16354k.put(strLd6, qVar);
                }
            }
        }
        return qVar;
    }

    public toq(int maximumCapacity) {
        this.f16354k = new LruCache<>(maximumCapacity);
    }
}
