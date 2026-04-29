package com.android.thememanager.v9;

import android.app.Activity;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.resource.C1790g;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.o1t;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.vq;
import com.google.android.exoplayer2.util.wvg;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p001b.InterfaceC1357q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AudioResourceHandler implements InterfaceC1755y, InterfaceC0928g, InterfaceC1357q {

    /* JADX INFO: renamed from: g */
    private AudioManager f16991g;

    /* JADX INFO: renamed from: h */
    private String f16992h;

    /* JADX INFO: renamed from: i */
    private toq f16993i;

    /* JADX INFO: renamed from: k */
    private RecyclerView.AbstractC1060y f16994k;

    /* JADX INFO: renamed from: n */
    private C1790g f16995n;

    /* JADX INFO: renamed from: p */
    private Map<String, String> f16996p = new HashMap();

    /* JADX INFO: renamed from: q */
    private com.android.thememanager.fu4 f16997q;

    /* JADX INFO: renamed from: s */
    private Map<String, com.android.thememanager.fu4> f16998s;

    /* JADX INFO: renamed from: y */
    private C1582h f16999y;

    /* JADX INFO: renamed from: com.android.thememanager.v9.AudioResourceHandler$k */
    class C2836k implements C1790g.zy {
        C2836k() {
        }

        @Override // com.android.thememanager.basemodule.resource.C1790g.zy
        public void onProgressUpdate(int playDuration, int totalDuration) {
        }

        @Override // com.android.thememanager.basemodule.resource.C1790g.zy
        public void onStartPlaying() {
            AudioResourceHandler.this.m10126h();
        }

        @Override // com.android.thememanager.basemodule.resource.C1790g.zy
        public void onStopPlaying() {
            AudioResourceHandler.this.m10126h();
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void m10132k(int currBytes, int totalBytes);

        /* JADX INFO: renamed from: q */
        void m10133q(String path);

        void toq();

        void zy();
    }

    public AudioResourceHandler(C1582h fragment, RecyclerView.AbstractC1060y adapter) {
        this.f16999y = fragment;
        this.f16994k = adapter;
        com.android.thememanager.fu4 fu4VarA98o = ch.a98o(fragment.getActivity());
        this.f16997q = fu4VarA98o;
        if (fu4VarA98o == null || !TextUtils.equals(InterfaceC1789q.v70n, fu4VarA98o.getResourceStamp())) {
            this.f16997q = C2082k.zy().m8001n().f7l8(InterfaceC1789q.v70n);
        }
        this.f16998s = new HashMap();
        this.f16995n = new C1790g(fragment.getActivity());
        this.f16991g = (AudioManager) fragment.getActivity().getSystemService(wvg.f67137toq);
        this.f16995n.qrj(new C2836k());
        C2082k.zy().m8000g().zy(this);
    }

    /* JADX INFO: renamed from: q */
    private static String m10124q(Resource r2, com.android.thememanager.fu4 resContext) {
        return TextUtils.isEmpty(r2.getContentPath()) ? o1t.f7l8(r2, resContext) : r2.getContentPath();
    }

    private void toq(String resourceCode, Resource r2, Activity context) {
        com.android.thememanager.fu4 fu4VarM10535g = this.f16998s.get(resourceCode);
        if (fu4VarM10535g == null) {
            fu4VarM10535g = C2082k.zy().m8001n().m10535g(resourceCode);
            this.f16998s.put(resourceCode, fu4VarM10535g);
        }
        fu4VarM10535g.setCurrentUsingPath(m10124q(r2, fu4VarM10535g));
        vq.m10057n(context, fu4VarM10535g, r2);
    }

    private void zy(Resource r2) {
        C2082k.zy().m8000g().m8436q(r2, this.f16997q);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@lvui InterfaceC0954z owner) {
    }

    /* JADX INFO: renamed from: g */
    public void m10125g(String resourceCode, Resource r2) {
        this.f16996p.put(resourceCode, r2.getAssemblyId());
        if (TextUtils.isEmpty(r2.getContentPath())) {
            zy(r2);
        } else {
            toq(resourceCode, r2, this.f16999y.getActivity());
            this.f16996p.remove(resourceCode);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m10126h() {
        this.f16994k.notifyDataSetChanged();
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadComplete(String downloadPath, String assemblyId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras) {
        if (this.f16999y.getActivity() != null && downloadSuccess) {
            toq toqVar = this.f16993i;
            if (toqVar != null) {
                toqVar.toq();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : this.f16996p.keySet()) {
                if (TextUtils.equals(this.f16996p.get(str), assemblyId)) {
                    Resource resource = new Resource();
                    try {
                        downloadPath = URLDecoder.decode(downloadPath, "UTF8");
                    } catch (UnsupportedEncodingException e2) {
                        Log.e("AudioResourceHandler", "decode download path error" + e2);
                    }
                    File file = new File(downloadPath);
                    resource.setMetaPath(downloadPath);
                    resource.setContentPath(downloadPath);
                    resource.setHash(ch.wvg(downloadPath));
                    resource.setModifiedTime(file.lastModified());
                    resource.getLocalInfo().setUpdatedTime(file.lastModified());
                    resource.getLocalInfo().setSize(file.length());
                    String strFti = ch.fti(downloadPath);
                    resource.setLocalId(strFti);
                    Pair<String, String> pairI1 = ch.i1(strFti);
                    resource.getLocalInfo().setTitle((String) pairI1.first);
                    resource.setOnlineId((String) pairI1.second);
                    if (this.f16997q.isPicker()) {
                        toq toqVar2 = this.f16993i;
                        if (toqVar2 != null) {
                            toqVar2.m10133q(downloadPath);
                        }
                    } else {
                        toq(str, resource, this.f16999y.getActivity());
                        arrayList.add(str);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f16996p.remove((String) it.next());
            }
        }
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadProgressUpdate(String downloadPath, String assemblyId, String extraData, int currBytes, int totalBytes) {
        toq toqVar;
        if (!this.f16997q.isPicker() || (toqVar = this.f16993i) == null) {
            return;
        }
        toqVar.m10132k(currBytes, totalBytes);
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadStatusChange(String downloadPath, String assemblyId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
    }

    /* JADX INFO: renamed from: k */
    public void m10127k() {
        this.f16992h = null;
    }

    public void kja0() {
        this.f16995n.kja0();
    }

    public boolean ld6() {
        return this.f16995n.m6929y();
    }

    /* JADX INFO: renamed from: n */
    public String m10128n() {
        return this.f16992h;
    }

    public void n7h(toq listener) {
        this.f16993i = listener;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        C2082k.zy().m8000g().t8r(this);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStart(@lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStop(@lvui InterfaceC0954z owner) {
    }

    /* JADX INFO: renamed from: p */
    public boolean m10129p(String uuid) {
        return this.f16995n.x2(uuid);
    }

    public void qrj(String uuid) {
        this.f16992h = uuid;
    }

    /* JADX INFO: renamed from: s */
    public void m10130s(String resourceCode, Resource r2) {
        toq toqVar = this.f16993i;
        if (toqVar != null) {
            toqVar.zy();
        }
        this.f16996p.put(resourceCode, r2.getAssemblyId());
        if (TextUtils.isEmpty(r2.getContentPath())) {
            zy(r2);
            return;
        }
        this.f16996p.remove(resourceCode);
        toq toqVar2 = this.f16993i;
        if (toqVar2 != null) {
            toqVar2.m10133q(r2.getContentPath());
        }
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@lvui InterfaceC0954z owner) {
    }

    public boolean x2() {
        return this.f16995n.ld6();
    }

    /* JADX INFO: renamed from: y */
    public boolean m10131y(Resource r2) {
        boolean zM6926n = this.f16995n.m6926n(r2, this.f16997q.getNewResourceContext());
        this.f16995n.kja0();
        if (!zM6926n) {
            return false;
        }
        if (this.f16991g.getStreamVolume(this.f16999y.getActivity().getVolumeControlStream()) == 0) {
            nn86.m7150k(R.string.resource_ringtone_volume_mute, 0);
            return false;
        }
        this.f16995n.m6927p(r2, this.f16997q.getNewResourceContext());
        return true;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@lvui InterfaceC0954z owner) {
        this.f16995n.kja0();
    }
}
