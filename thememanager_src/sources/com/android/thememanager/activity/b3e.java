package com.android.thememanager.activity;

import android.app.Activity;
import android.content.Context;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.async.AbstractC1712k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.model.ResourceResolver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LocalWallpaperListResourceAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class b3e extends gc3c {
    private List<String> an;

    /* JADX INFO: renamed from: com.android.thememanager.activity.b3e$k */
    /* JADX INFO: compiled from: LocalWallpaperListResourceAdapter.java */
    static class AsyncTaskC1562k extends AbstractC1712k.toq<Resource> {
        AsyncTaskC1562k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.toq, com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        /* JADX INFO: renamed from: qrj */
        public void onPostExecute(List<Resource> result) {
            super.onPostExecute(result);
            WeakReference<AbstractC1712k> weakReference = this.f9837y;
            b3e b3eVar = weakReference != null ? (b3e) weakReference.get() : null;
            if (b3eVar == null) {
                return;
            }
            Activity activityM6465l = b3eVar.m6465l();
            if (com.android.thememanager.util.gc3c.cdj(activityM6465l)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Resource resource : result) {
                    String metaPath = new ResourceResolver(resource, b3eVar.vyq()).getMetaPath();
                    if (com.android.thememanager.util.ch.vyq(metaPath) || com.android.thememanager.util.ch.n5r1(metaPath)) {
                        arrayList.add(resource);
                    } else {
                        arrayList2.add(resource);
                    }
                }
                b3eVar.qrj().clear();
                b3eVar.bo().clear();
                int i2 = 0;
                if (arrayList2.size() != 0) {
                    b3eVar.m6686p(0).addAll(arrayList2);
                    b3eVar.bo().add(activityM6465l.getString(R.string.title_my_wallpaper_resource));
                    i2 = 1;
                }
                b3eVar.m6686p(i2).addAll(com.android.thememanager.util.uc.uv6(arrayList, b3eVar.vyq()));
                b3eVar.bo().add(activityM6465l.getString(R.string.title_system_wallpaper_resource));
                b3eVar.notifyDataSetChanged();
            }
        }

        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.toq
        /* JADX INFO: renamed from: s */
        protected List<Resource> mo6387s() {
            WeakReference<AbstractC1712k> weakReference = this.f9837y;
            b3e b3eVar = weakReference != null ? (b3e) weakReference.get() : null;
            if (b3eVar == null) {
                return null;
            }
            return b3eVar.uv6().m7690k().mo7474h(false);
        }

        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.toq
        /* JADX INFO: renamed from: y */
        protected int mo6388y() {
            return 0;
        }
    }

    public b3e(C1582h fragment, com.android.thememanager.fu4 resContext) {
        super(fragment, resContext);
        this.an = new ArrayList();
    }

    public List<String> bo() {
        return this.an;
    }

    @Override // com.android.thememanager.activity.gc3c, com.android.thememanager.basemodule.async.AbstractC1712k
    protected List<AbstractC1712k.toq> cdj(boolean needToRefresh) {
        ArrayList arrayList = new ArrayList();
        AsyncTaskC1562k asyncTaskC1562k = new AsyncTaskC1562k();
        asyncTaskC1562k.m6700k(lrht());
        asyncTaskC1562k.kja0(this);
        arrayList.add(asyncTaskC1562k);
        return arrayList;
    }

    @Override // com.android.thememanager.activity.pc
    /* JADX INFO: renamed from: f */
    protected String mo6386f(int group) {
        if (group < this.an.size()) {
            return this.an.get(group);
        }
        return null;
    }

    public b3e(Context context, com.android.thememanager.fu4 resContext) {
        super(context, resContext);
        this.an = new ArrayList();
    }
}
