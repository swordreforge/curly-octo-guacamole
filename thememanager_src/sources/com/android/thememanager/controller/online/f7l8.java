package com.android.thememanager.controller.online;

import android.util.Log;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.model.PageItem;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: OnlineDataParser.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f7l8 {

    /* JADX INFO: renamed from: q */
    private static final String f10927q = "OnlineDataParser";

    /* JADX INFO: renamed from: k */
    protected com.android.thememanager.fu4 f10928k;

    public f7l8(com.android.thememanager.fu4 context) {
        this.f10928k = context;
    }

    public Map<String, Resource> f7l8(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return null;
        }
        try {
            return mo7540k(file);
        } catch (Exception unused) {
            file.delete();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Map<String, Resource> mo7539g(File file) throws Exception;

    /* JADX INFO: renamed from: k */
    public abstract Map<String, Resource> mo7540k(File file) throws Exception;

    public a98o.zy<Resource> ld6(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return null;
        }
        try {
            return mo7541n(file);
        } catch (Exception unused) {
            file.delete();
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract a98o.zy<Resource> mo7541n(File file) throws Exception;

    /* JADX INFO: renamed from: p */
    public Resource m7542p(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return null;
        }
        try {
            return mo7543q(file);
        } catch (Exception unused) {
            file.delete();
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public abstract Resource mo7543q(File file) throws Exception;

    /* JADX INFO: renamed from: s */
    public List<PageItem> m7544s(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return null;
        }
        try {
            return zy(file);
        } catch (Exception unused) {
            file.delete();
            return null;
        }
    }

    public abstract <T> CommonResponse<T> toq(File file, Class<T> pageClass) throws Exception;

    public Map<String, Resource> x2(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return null;
        }
        try {
            return mo7539g(file);
        } catch (Exception unused) {
            file.delete();
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public <T> CommonResponse<T> m7545y(String filePath, Class<T> pageClass) {
        File file = new File(filePath);
        if (!file.exists()) {
            return null;
        }
        try {
            return toq(file, pageClass);
        } catch (Exception e2) {
            Log.w(f10927q, "parse json error ", e2);
            file.delete();
            return null;
        }
    }

    public abstract List<PageItem> zy(File file) throws Exception;
}
