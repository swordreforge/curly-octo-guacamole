package com.android.thememanager.controller.local;

import android.util.Log;
import android.util.Pair;
import com.android.thememanager.basemodule.local.AbstractC1753q;
import com.android.thememanager.basemodule.local.C1743g;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.fu4;
import com.android.thememanager.util.ch;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: LocalBareDataParser.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 extends AbstractC1753q implements com.android.thememanager.basemodule.resource.constants.toq {
    public f7l8(fu4 context) {
        super(context.getNewResourceContext());
    }

    @Override // com.android.thememanager.basemodule.local.AbstractC1753q
    /* JADX INFO: renamed from: k */
    public Resource mo6852k(File file) throws C1743g {
        if (!ch.m9669f(file, this.f10033k)) {
            return null;
        }
        Resource resource = new Resource();
        String absolutePath = file.getAbsolutePath();
        resource.setMetaPath(absolutePath);
        resource.setContentPath(absolutePath);
        resource.setHash(ch.wvg(absolutePath));
        resource.setModifiedTime(file.lastModified());
        resource.getLocalInfo().setUpdatedTime(file.lastModified());
        resource.getLocalInfo().setSize(file.length());
        String strFti = ch.fti(absolutePath);
        if (strFti == null) {
            Log.d("error", "LocalBareDataParser, title is null");
            return null;
        }
        resource.setLocalId(strFti);
        Pair<String, String> pairI1 = ch.i1(strFti);
        resource.getLocalInfo().setTitle((String) pairI1.first);
        resource.setOnlineId((String) pairI1.second);
        ArrayList arrayList = new ArrayList();
        arrayList.add(absolutePath);
        resource.setBuildInThumbnails(arrayList);
        resource.setBuildInPreviews(arrayList);
        C1792n.yz(resource, file);
        return resource;
    }

    @Override // com.android.thememanager.basemodule.local.AbstractC1753q
    public void toq(File file, Resource resource) throws C1743g {
        String downloadPath = resource.getDownloadPath();
        if (downloadPath == null || downloadPath.equals(file.getAbsolutePath())) {
            return;
        }
        new File(downloadPath).renameTo(file);
    }
}
