package com.android.thememanager.settings;

import android.content.Context;
import android.util.Log;
import com.android.thememanager.detail.video.model.PictureDescriptionResource;
import com.android.thememanager.util.ek5k;
import com.google.gson.C4871g;
import ek5k.C6002g;
import java.io.File;
import java.io.IOException;
import java.util.List;
import miuix.core.util.C7083n;
import org.json.JSONException;

/* JADX INFO: renamed from: com.android.thememanager.settings.s */
/* JADX INFO: compiled from: PictureDescriptionRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2608s {

    /* JADX INFO: renamed from: k */
    private static final String f15408k = "PictureDescriptionRequest";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60852toq = "picture_description.json";

    /* JADX INFO: renamed from: com.android.thememanager.settings.s$k */
    /* JADX INFO: compiled from: PictureDescriptionRequest.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo9155k(List<com.android.thememanager.settings.subsettings.f7l8> wgList);
    }

    private String f7l8() {
        Log.i(f15408k, "Request picture description from online");
        File file = new File(toq(bf2.toq.toq()));
        com.google.gson.kja0 kja0VarM5844q = bz2.toq.m5844q();
        if (kja0VarM5844q == null) {
            return null;
        }
        try {
            String string = kja0VarM5844q.toString();
            if (!p029m.zy.toq(string)) {
                ld6(file, string);
            }
            return string;
        } catch (Error | Exception e2) {
            Log.e(f15408k, "Error while requesting picture description: ", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private String m9156g(File file) {
        if (file != null && file.exists()) {
            try {
                return ek5k.toq(file);
            } catch (IOException | JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    private void ld6(File file, String jsonString) {
        if (file == null) {
            return;
        }
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            C7083n.kja0(file.getPath(), jsonString);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    private PictureDescriptionResource m9158n(String jsonString) {
        try {
            return (PictureDescriptionResource) new C4871g().n7h(jsonString, PictureDescriptionResource.class);
        } catch (com.google.gson.zurt unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m9159p(final List<com.android.thememanager.settings.subsettings.f7l8> wgList, final k callback) {
        C6002g.m22248y(new Runnable() { // from class: com.android.thememanager.settings.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f15934k.zy(wgList, callback);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    private void m9160s(File file, List<com.android.thememanager.settings.subsettings.f7l8> wgList) {
        m9161y(wgList, m9158n(m9156g(file)));
    }

    private static String toq(Context context) {
        return context.getFilesDir() + File.separator + f60852toq;
    }

    /* JADX INFO: renamed from: y */
    private static void m9161y(List<com.android.thememanager.settings.subsettings.f7l8> groupList, PictureDescriptionResource resource) {
        if (resource == null) {
            return;
        }
        for (com.android.thememanager.settings.subsettings.f7l8 f7l8Var : groupList) {
            if (f7l8Var.f15451k == 2) {
                f7l8Var.m9175n(resource);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zy(List list, k kVar) {
        m9161y(list, m9158n(f7l8()));
        kVar.mo9155k(list);
    }

    /* JADX INFO: renamed from: q */
    public void m9162q(List<com.android.thememanager.settings.subsettings.f7l8> wgList, k callback) {
        if (com.android.thememanager.basemodule.utils.o1t.cdj()) {
            File file = new File(toq(bf2.toq.toq()));
            if (file.exists()) {
                m9160s(file, wgList);
            } else {
                m9159p(wgList, callback);
            }
        }
    }
}
