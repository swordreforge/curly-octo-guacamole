package com.android.thememanager.recommend.presenter.audio;

import android.media.AudioManager;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.f7l8;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.resource.C1790g;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1822q;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.google.android.exoplayer2.util.wvg;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AudioResourceHandler implements InterfaceC1755y, InterfaceC0928g, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private AudioManager f13600g;

    /* JADX INFO: renamed from: h */
    private toq f13601h;

    /* JADX INFO: renamed from: i */
    private boolean f13602i;

    /* JADX INFO: renamed from: k */
    private final RecommendListViewAdapter f13603k;

    /* JADX INFO: renamed from: n */
    private C1790g f13604n;

    /* JADX INFO: renamed from: p */
    private String f13605p;

    /* JADX INFO: renamed from: y */
    private ActivityC0891q f13608y;

    /* JADX INFO: renamed from: s */
    private Map<String, String> f13607s = new HashMap();

    /* JADX INFO: renamed from: q */
    private C1791k f13606q = C1791k.getRingtone();

    /* JADX INFO: renamed from: com.android.thememanager.recommend.presenter.audio.AudioResourceHandler$k */
    class C2346k implements C1790g.zy {
        C2346k() {
        }

        @Override // com.android.thememanager.basemodule.resource.C1790g.zy
        public void onProgressUpdate(int playDuration, int totalDuration) {
        }

        @Override // com.android.thememanager.basemodule.resource.C1790g.zy
        public void onStartPlaying() {
            AudioResourceHandler.this.cdj();
        }

        @Override // com.android.thememanager.basemodule.resource.C1790g.zy
        public void onStopPlaying() {
            AudioResourceHandler.this.cdj();
            AudioResourceHandler.this.m8523k();
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo8528k(int currBytes, int totalBytes);

        /* JADX INFO: renamed from: n */
        void mo8529n();

        /* JADX INFO: renamed from: q */
        void mo8530q(String path);

        void toq();

        void zy();
    }

    public AudioResourceHandler(ActivityC0891q activity, RecommendListViewAdapter adapter, boolean isPicker) {
        this.f13608y = activity;
        this.f13603k = adapter;
        this.f13604n = new C1790g(this.f13608y);
        this.f13600g = (AudioManager) this.f13608y.getSystemService(wvg.f67137toq);
        this.f13604n.qrj(new C2346k());
        this.f13602i = isPicker;
        C2320q.m8478g(this);
    }

    /* JADX INFO: renamed from: h */
    private void m8520h(Resource resource) {
        ArrayMap<String, Object> arrayMapM6679k = zy.m6679k();
        arrayMapM6679k.put("name", resource.getTitle());
        arrayMapM6679k.put("entryType", f7l8.m6607g());
        arrayMapM6679k.put("resourceType", "ringtone");
        arrayMapM6679k.put("productId", resource.getOnlineId());
        C1708s.f7l8().ld6().dd(C1706p.n7h(((AbstractActivityC1717k) this.f13608y).yz(), resource.getOnlineInfo().getTrackId(), arrayMapM6679k));
    }

    private void ki(Resource resource) {
        String strNi7 = C2320q.ni7(resource, this.f13606q);
        if (new File(strNi7).exists()) {
            File file = new File(strNi7);
            resource.setMetaPath(strNi7);
            resource.setContentPath(strNi7);
            resource.setHash(C1822q.m7195q(strNi7));
            resource.setModifiedTime(file.lastModified());
            resource.getLocalInfo().setUpdatedTime(file.lastModified());
            resource.getLocalInfo().setSize(file.length());
            String strN7h = C1792n.n7h(strNi7);
            resource.setLocalId(strN7h);
            Pair<String, String> pairM6930b = C1792n.m6930b(strN7h);
            resource.getLocalInfo().setTitle((String) pairM6930b.first);
            resource.setOnlineId((String) pairM6930b.second);
        }
    }

    private void kja0(Resource resource, String type) {
        ArrayMap<String, Object> arrayMapM6679k = zy.m6679k();
        arrayMapM6679k.put("type", type);
        arrayMapM6679k.put("name", resource.getTitle());
        arrayMapM6679k.put("entryType", f7l8.m6607g());
        arrayMapM6679k.put("resourceType", "ringtone");
        arrayMapM6679k.put("productId", resource.getOnlineId());
        C1708s.f7l8().ld6().zurt(C1706p.n7h(((AbstractActivityC1717k) this.f13608y).yz(), resource.getOnlineInfo().getTrackId(), arrayMapM6679k));
    }

    /* JADX INFO: renamed from: q */
    private static String m8521q(Resource r2, C1791k resContext) {
        return TextUtils.isEmpty(r2.getContentPath()) ? C2320q.ni7(r2, resContext) : r2.getContentPath();
    }

    private void toq(String resourceCode, Resource r2, ActivityC0891q context) {
        kja0(r2, resourceCode);
        C2320q.ld6(context, r2, resourceCode, m8521q(r2, C1791k.getInstance(resourceCode)));
    }

    private void zy(Resource r2) {
        C2320q.t8r(r2, this.f13606q);
    }

    public void cdj() {
        this.f13603k.m8548j(this.f13605p);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@lvui InterfaceC0954z owner) {
    }

    /* JADX INFO: renamed from: g */
    public void m8522g(String resourceCode, Resource r2) {
        this.f13607s.put(resourceCode, r2.getAssemblyId());
        ki(r2);
        if (TextUtils.isEmpty(r2.getContentPath())) {
            zy(r2);
            m8520h(r2);
        } else {
            toq(resourceCode, r2, this.f13608y);
            this.f13607s.remove(resourceCode);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[SYNTHETIC] */
    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleDownloadComplete(java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, int r10, java.lang.String... r11) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.presenter.audio.AudioResourceHandler.handleDownloadComplete(java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String[]):void");
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadProgressUpdate(String downloadPath, String assemblyId, String extraData, int currBytes, int totalBytes) {
        toq toqVar;
        if (!this.f13602i || (toqVar = this.f13601h) == null) {
            return;
        }
        toqVar.mo8528k(currBytes, totalBytes);
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadStatusChange(String downloadPath, String assemblyId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
    }

    /* JADX INFO: renamed from: k */
    public void m8523k() {
        this.f13605p = null;
    }

    public boolean ld6() {
        C1790g c1790g = this.f13604n;
        return c1790g != null && c1790g.m6929y();
    }

    /* JADX INFO: renamed from: n */
    public String m8524n() {
        return this.f13605p;
    }

    public void n7h() {
        C1790g c1790g = this.f13604n;
        if (c1790g != null) {
            c1790g.kja0();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        C2320q.i1(this);
        C1790g c1790g = this.f13604n;
        if (c1790g != null) {
            c1790g.n7h();
            this.f13604n = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m8525p(String uuid) {
        C1790g c1790g = this.f13604n;
        return c1790g != null && c1790g.x2(uuid);
    }

    public void qrj(toq listener) {
        this.f13601h = listener;
    }

    /* JADX INFO: renamed from: s */
    public void m8526s(String resourceCode, Resource r2) {
        toq toqVar = this.f13601h;
        if (toqVar != null) {
            toqVar.zy();
        }
        this.f13607s.put(resourceCode, r2.getAssemblyId());
        ki(r2);
        if (TextUtils.isEmpty(r2.getContentPath())) {
            zy(r2);
            m8520h(r2);
            return;
        }
        this.f13607s.remove(resourceCode);
        toq toqVar2 = this.f13601h;
        if (toqVar2 != null) {
            toqVar2.mo8530q(r2.getContentPath());
        }
    }

    public void x2(String uuid) {
        this.f13605p = uuid;
    }

    /* JADX INFO: renamed from: y */
    public boolean m8527y(Resource r2) {
        C1790g c1790g = this.f13604n;
        if (c1790g == null) {
            return false;
        }
        boolean zM6926n = c1790g.m6926n(r2, this.f13606q);
        this.f13604n.kja0();
        if (!zM6926n) {
            return false;
        }
        if (this.f13600g.getStreamVolume(this.f13608y.getVolumeControlStream()) == 0) {
            nn86.m7150k(R.string.resource_ringtone_volume_mute, 0);
            return false;
        }
        this.f13604n.m6927p(r2, this.f13606q);
        return true;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@lvui InterfaceC0954z owner) {
        C1790g c1790g = this.f13604n;
        if (c1790g != null) {
            c1790g.kja0();
        }
    }
}
