package com.android.thememanager.controller.online;

import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.controller.online.zurt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DownloadFileTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f57967zy = 1024;

    /* JADX INFO: renamed from: k */
    private String f11025k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private List<InterfaceC1939k> f57968toq = new ArrayList();

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.toq$k */
    /* JADX INFO: compiled from: DownloadFileTask.java */
    public interface InterfaceC1939k {
        /* JADX INFO: renamed from: k */
        void m7636k(PathEntry... entries);

        void toq(PathEntry entry);

        void zy(PathEntry entry);
    }

    public toq(String id) {
        this.f11025k = id;
    }

    private void f7l8(PathEntry entry) {
        Iterator<InterfaceC1939k> it = this.f57968toq.iterator();
        while (it.hasNext()) {
            it.next().toq(entry);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m7629g(PathEntry... entries) {
        Iterator<InterfaceC1939k> it = this.f57968toq.iterator();
        while (it.hasNext()) {
            it.next().m7636k(entries);
        }
    }

    private void ld6(zurt url, File file) throws C1922n, IOException {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        C1915g.m7548g(url, file);
        C1821p.zy(file.getAbsolutePath(), 511);
    }

    /* JADX INFO: renamed from: q */
    private boolean m7630q(Object obj1, Object obj2) {
        return obj1 == obj2 || !(obj1 == null || obj2 == null || !obj1.equals(obj2));
    }

    /* JADX INFO: renamed from: y */
    private void m7631y(PathEntry entry) {
        Iterator<InterfaceC1939k> it = this.f57968toq.iterator();
        while (it.hasNext()) {
            it.next().zy(entry);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && m7630q(this.f11025k, ((toq) obj).f11025k);
    }

    public int hashCode() {
        String str = this.f11025k;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: k */
    public void m7632k(InterfaceC1939k observer) {
        if (observer != null) {
            this.f57968toq.add(observer);
        }
    }

    /* JADX INFO: renamed from: n */
    public String m7633n() {
        return this.f11025k;
    }

    /* JADX INFO: renamed from: p */
    public void m7634p(String id) {
        this.f11025k = id;
    }

    /* JADX INFO: renamed from: s */
    public void m7635s(InterfaceC1939k observer) {
        if (observer != null) {
            this.f57968toq.remove(observer);
        }
    }

    public boolean toq(zurt url, String path) {
        PathEntry pathEntry = new PathEntry(path, url.getUrlId());
        File file = new File(path);
        File file2 = new File(path + com.android.thememanager.basemodule.resource.constants.toq.lb);
        try {
            ld6(url, file2);
            file2.renameTo(file);
            m7631y(pathEntry);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            if (file2.exists()) {
                file2.delete();
            }
            f7l8(pathEntry);
            return false;
        }
    }

    public boolean zy(zurt.EnumC1946k needProxyType, PathEntry... entries) {
        if (entries == null) {
            return false;
        }
        boolean z2 = true;
        for (int i2 = 0; i2 < entries.length; i2++) {
            zurt zurtVar = new zurt(entries[i2].getOnlinePath());
            zurtVar.setHostProxyType(needProxyType);
            z2 = z2 && toq(zurtVar, entries[i2].getLocalPath());
        }
        m7629g(entries);
        return z2;
    }
}
