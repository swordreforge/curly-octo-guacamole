package com.android.thememanager.activity;

import android.content.Context;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.async.AbstractC1712k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LocalResourceAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class gc3c extends pc {
    private boolean bv;

    /* JADX INFO: renamed from: com.android.thememanager.activity.gc3c$k */
    /* JADX INFO: compiled from: LocalResourceAdapter.java */
    protected static class AsyncTaskC1581k extends AbstractC1712k.toq<Resource> {

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f57308x2;

        public AsyncTaskC1581k(boolean needToRefresh) {
            this.f57308x2 = needToRefresh;
        }

        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.toq
        /* JADX INFO: renamed from: s */
        protected List<Resource> mo6387s() {
            WeakReference<AbstractC1712k> weakReference = this.f9837y;
            gc3c gc3cVar = weakReference != null ? (gc3c) weakReference.get() : null;
            if (gc3cVar == null) {
                return null;
            }
            List<Resource> listKi = gc3cVar.uv6().m7690k().ki(this.f57308x2, false, gc3cVar.lv5());
            if ("theme".equals(gc3cVar.vyq().getResourceCode())) {
                com.android.thememanager.basemodule.resource.n7h.m6950g(listKi);
            }
            if ("launcher".equals(gc3cVar.vyq().getResourceCode())) {
                List<Resource> listKja0 = C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g("miwallpaper")).m7690k().kja0();
                if (!com.android.thememanager.basemodule.utils.kja0.qrj(listKja0)) {
                    ArrayList arrayList = new ArrayList(listKi.size() + listKja0.size());
                    arrayList.addAll(listKi);
                    for (Resource resource : listKja0) {
                        if ("miwallpaper".equals(C1792n.m6942o(resource))) {
                            arrayList.add(resource);
                        }
                    }
                    return arrayList;
                }
            }
            return listKi;
        }

        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.toq
        /* JADX INFO: renamed from: y */
        protected int mo6388y() {
            return 0;
        }
    }

    public gc3c(C1582h fragment, com.android.thememanager.fu4 resContext) {
        this(fragment, resContext, false);
    }

    @Override // com.android.thememanager.basemodule.async.AbstractC1712k
    protected List<AbstractC1712k.toq> cdj(boolean needToRefresh) {
        ArrayList arrayList = new ArrayList();
        AsyncTaskC1581k asyncTaskC1581k = new AsyncTaskC1581k(needToRefresh);
        asyncTaskC1581k.m6700k(lrht());
        asyncTaskC1581k.kja0(this);
        arrayList.add(asyncTaskC1581k);
        m6685k(asyncTaskC1581k);
        return arrayList;
    }

    @Override // com.android.thememanager.activity.pc
    protected boolean ek5k(int group) {
        return false;
    }

    @Override // com.android.thememanager.activity.pc
    protected int hyr(Resource resource, int group) {
        int iHyr = super.hyr(resource, group);
        if (iHyr == R.drawable.flag_downloaded) {
            return 0;
        }
        return iHyr;
    }

    public boolean lv5() {
        return this.bv;
    }

    public gc3c(C1582h fragment, com.android.thememanager.fu4 resContext, boolean forceAll) {
        super(fragment, resContext);
        this.bv = forceAll;
    }

    public gc3c(Context context, com.android.thememanager.fu4 resContext) {
        super(context, resContext);
    }
}
