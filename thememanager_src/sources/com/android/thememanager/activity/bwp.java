package com.android.thememanager.activity;

import android.app.Activity;
import android.content.Context;
import android.icu.text.AlphabeticIndex;
import android.text.TextUtils;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.async.AbstractC1712k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.C1902k;
import com.android.thememanager.model.ResourceResolver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: LocalAudioListResourceAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class bwp extends gc3c {
    private static final int bl = 2;
    private static final int id = 0;
    private static final int in = 1;
    private List<String> an;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: LocalAudioListResourceAdapter.java */
    static class toq extends AbstractC1712k.toq<Resource> {

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private Comparator<Resource> f57291qrj;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private Map<String, Integer> f57292x2;

        private toq() {
            this.f57292x2 = new HashMap();
            this.f57291qrj = new Comparator() { // from class: com.android.thememanager.activity.se
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return this.f9325k.ki((Resource) obj, (Resource) obj2);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ int ki(Resource resource, Resource resource2) {
            int iIntValue;
            if (resource.getTitle() == null || resource2.getTitle() == null) {
                return 0;
            }
            Integer num = this.f57292x2.get(resource.getTitle());
            Integer num2 = this.f57292x2.get(resource2.getTitle());
            return (num == null || num2 == null || (iIntValue = num.intValue() - num2.intValue()) == 0) ? resource.getTitle().compareTo(resource2.getTitle()) : iIntValue;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.toq, com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        /* JADX INFO: renamed from: qrj */
        public void onPostExecute(List<Resource> result) {
            if (isCancelled()) {
                return;
            }
            super.onPostExecute(result);
            WeakReference<AbstractC1712k> weakReference = this.f9837y;
            bwp bwpVar = weakReference != null ? (bwp) weakReference.get() : null;
            if (bwpVar == null) {
                return;
            }
            Activity activity = bwpVar.f9313o.get();
            if (com.android.thememanager.util.gc3c.cdj(activity)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                Resource resource = null;
                Resource resource2 = null;
                for (Resource resource3 : result) {
                    if (C1902k.bq.equals(resource3.getLocalId())) {
                        resource = resource3;
                    } else if (C1902k.ac.equals(resource3.getLocalId())) {
                        resource2 = resource3;
                    } else if (C1902k.sok(resource3.getLocalId())) {
                        arrayList.add(resource3);
                    } else {
                        String metaPath = new ResourceResolver(resource3, bwpVar.vyq()).getMetaPath();
                        if (bwpVar.vyq().isPicker()) {
                            if (!com.android.thememanager.util.ch.vyq(metaPath) && !com.android.thememanager.util.ch.n5r1(metaPath)) {
                                arrayList3.add(resource3);
                            } else if (com.android.thememanager.util.ch.uv6(metaPath)) {
                                arrayList5.add(resource3);
                            } else if (com.android.thememanager.util.ch.lrht(metaPath)) {
                                arrayList6.add(resource3);
                            } else {
                                arrayList4.add(resource3);
                            }
                        } else if (com.android.thememanager.util.ch.vyq(metaPath) || com.android.thememanager.util.ch.n5r1(metaPath)) {
                            arrayList2.add(resource3);
                        } else {
                            arrayList3.add(resource3);
                        }
                    }
                }
                if (bwpVar.vyq().isPicker()) {
                    Collections.sort(arrayList4, this.f57291qrj);
                    Collections.sort(arrayList5, this.f57291qrj);
                    Collections.sort(arrayList6, this.f57291qrj);
                } else {
                    Collections.sort(arrayList2, this.f57291qrj);
                }
                bwpVar.qrj().clear();
                bwpVar.ikck().clear();
                int i2 = 0;
                if (resource != null) {
                    bwpVar.m6686p(0).add(resource);
                    bwpVar.ikck().add(null);
                    i2 = 1;
                }
                if (resource2 != null) {
                    bwpVar.m6686p(i2).add(resource2);
                    bwpVar.ikck().add(null);
                    i2++;
                }
                if (!arrayList.isEmpty()) {
                    bwpVar.m6686p(i2).addAll(arrayList);
                    String extraRingtoneInfoTitle = bwpVar.vyq().getExtraRingtoneInfoTitle();
                    if (TextUtils.isEmpty(extraRingtoneInfoTitle)) {
                        bwpVar.ikck().add(null);
                    } else {
                        bwpVar.ikck().add(extraRingtoneInfoTitle);
                    }
                    i2++;
                }
                if (arrayList3.size() != 0) {
                    bwpVar.m6686p(i2).addAll(arrayList3);
                    bwpVar.ikck().add(activity.getString(R.string.title_my_audio_resource));
                    i2++;
                }
                if (bwpVar.vyq().isPicker()) {
                    int iIntValue = ((Integer) bwpVar.vyq().getExtraMeta("android.intent.extra.ringtone.TYPE", 1)).intValue();
                    if (iIntValue == 16 || iIntValue == 1024 || iIntValue == 2048 || iIntValue == 4096) {
                        iIntValue = 2;
                    }
                    for (Integer num : bwp.m6392d(iIntValue)) {
                        if (num.intValue() == 0) {
                            bwpVar.m6686p(i2).addAll(arrayList4);
                        } else if (num.intValue() == 1) {
                            bwpVar.m6686p(i2).addAll(arrayList6);
                        } else if (num.intValue() == 2) {
                            bwpVar.m6686p(i2).addAll(arrayList5);
                        }
                    }
                    bwpVar.ikck().add(activity.getString(R.string.title_system_audio_resource));
                } else {
                    bwpVar.m6686p(i2).addAll(arrayList2);
                    bwpVar.ikck().add(activity.getString(R.string.title_system_audio_resource));
                }
                bwpVar.notifyDataSetChanged();
            }
        }

        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.toq
        /* JADX INFO: renamed from: s */
        protected List<Resource> mo6387s() {
            WeakReference<AbstractC1712k> weakReference = this.f9837y;
            bwp bwpVar = weakReference != null ? (bwp) weakReference.get() : null;
            if (bwpVar == null) {
                return null;
            }
            List<Resource> listMo7474h = bwpVar.uv6().m7690k().mo7474h(false);
            AlphabeticIndex alphabeticIndex = new AlphabeticIndex(Locale.getDefault());
            for (Resource resource : listMo7474h) {
                String metaPath = new ResourceResolver(resource, bwpVar.vyq()).getMetaPath();
                if (com.android.thememanager.util.ch.vyq(metaPath) || com.android.thememanager.util.ch.n5r1(metaPath)) {
                    this.f57292x2.put(resource.getTitle(), Integer.valueOf(alphabeticIndex.getBucketIndex(resource.getTitle())));
                }
            }
            return listMo7474h;
        }

        @Override // com.android.thememanager.basemodule.async.AbstractC1712k.toq
        /* JADX INFO: renamed from: y */
        protected int mo6388y() {
            return 0;
        }
    }

    public bwp(C1582h fragment, com.android.thememanager.fu4 resContext) {
        super(fragment, resContext);
        this.an = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final List<Integer> m6392d(int ringtoneType) {
        ArrayList arrayList = new ArrayList(3);
        if (ringtoneType == 2) {
            arrayList.add(2);
            arrayList.add(0);
            arrayList.add(1);
        } else if (ringtoneType == 4) {
            arrayList.add(1);
            arrayList.add(0);
            arrayList.add(2);
        } else {
            arrayList.add(0);
            arrayList.add(1);
            arrayList.add(2);
        }
        return arrayList;
    }

    @Override // com.android.thememanager.activity.gc3c, com.android.thememanager.basemodule.async.AbstractC1712k
    protected List<AbstractC1712k.toq> cdj(boolean needToRefresh) {
        ArrayList arrayList = new ArrayList();
        toq toqVar = new toq();
        toqVar.m6700k(lrht());
        toqVar.kja0(this);
        arrayList.add(toqVar);
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

    public List<String> ikck() {
        return this.an;
    }

    public bwp(Context context, com.android.thememanager.fu4 resContext) {
        super(context, resContext);
        this.an = new ArrayList();
    }
}
