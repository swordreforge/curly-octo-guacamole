package com.android.thememanager.settings.presenter;

import android.content.Intent;
import android.icu.text.AlphabeticIndex;
import android.os.AsyncTask;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2965z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.C1902k;
import com.android.thememanager.fu4;
import com.android.thememanager.mine.local.presenter.BaseLocalPresenter;
import com.android.thememanager.settings.LocalRingFragment;
import com.android.thememanager.util.bwp;
import com.android.thememanager.util.ch;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalRingPresenter extends BaseLocalPresenter<LocalRingFragment> {

    /* JADX INFO: renamed from: b */
    private static final int f15363b = 5000;

    /* JADX INFO: renamed from: j */
    private static final int f15364j = 0;

    /* JADX INFO: renamed from: m */
    private static final int f15365m = 2;

    /* JADX INFO: renamed from: o */
    private static final int f15366o = 1;

    /* JADX INFO: renamed from: c */
    toq f15367c;

    /* JADX INFO: renamed from: e */
    AsyncTaskC2598k f15368e;

    /* JADX INFO: renamed from: f */
    private int f15369f;

    /* JADX INFO: renamed from: com.android.thememanager.settings.presenter.LocalRingPresenter$k */
    static class AsyncTaskC2598k extends AsyncTask<List<Resource>, Void, List<Resource>> {

        /* JADX INFO: renamed from: k */
        WeakReference<LocalRingPresenter> f15370k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f60843toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Map<String, Integer> f60844zy = new HashMap();

        /* JADX INFO: renamed from: q */
        private Comparator<Resource> f15371q = new Comparator() { // from class: com.android.thememanager.settings.presenter.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return this.f15391k.zy((Resource) obj, (Resource) obj2);
            }
        };

        AsyncTaskC2598k(LocalRingPresenter p2, int ringtoneFlag) {
            this.f15370k = new WeakReference<>(p2);
            this.f60843toq = ringtoneFlag;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ int zy(Resource resource, Resource resource2) {
            int iIntValue;
            if (resource.getTitle() == null || resource2.getTitle() == null) {
                return 0;
            }
            Integer num = this.f60844zy.get(resource.getTitle());
            Integer num2 = this.f60844zy.get(resource2.getTitle());
            return (num == null || num2 == null || (iIntValue = num.intValue() - num2.intValue()) == 0) ? resource.getTitle().compareTo(resource2.getTitle()) : iIntValue;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<Resource> resources) {
            LocalRingPresenter localRingPresenter = this.f15370k.get();
            LocalRingFragment localRingFragment = localRingPresenter == null ? null : (LocalRingFragment) localRingPresenter.zy();
            if (localRingFragment != null) {
                localRingFragment.tjz5(resources);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public List<Resource> doInBackground(List<Resource>... lists) {
            LocalRingFragment localRingFragment;
            fu4 fu4VarBf2;
            ArrayList arrayList;
            List<Resource> list = lists[0];
            LocalRingPresenter localRingPresenter = this.f15370k.get();
            if (localRingPresenter == null || (localRingFragment = (LocalRingFragment) localRingPresenter.zy()) == null || (fu4VarBf2 = this.f15370k.get().bf2()) == null) {
                return null;
            }
            AlphabeticIndex alphabeticIndex = new AlphabeticIndex(Locale.getDefault());
            for (Resource resource : list) {
                String strM6971y = new C1795s(resource, fu4VarBf2.getNewResourceContext()).m6971y();
                if (ch.vyq(strM6971y) || ch.n5r1(strM6971y)) {
                    this.f60844zy.put(resource.getTitle(), Integer.valueOf(alphabeticIndex.getBucketIndex(resource.getTitle())));
                }
            }
            boolean zI1 = LocalRingPresenter.i1(this.f60843toq);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            Iterator<Resource> it = list.iterator();
            Resource resource2 = null;
            Resource resource3 = null;
            while (it.hasNext()) {
                Resource next = it.next();
                Iterator<Resource> it2 = it;
                LocalRingPresenter localRingPresenter2 = localRingPresenter;
                if (C1902k.bq.equals(next.getLocalId())) {
                    resource3 = next;
                } else if (C1902k.ac.equals(next.getLocalId())) {
                    resource2 = next;
                } else if (C1902k.sok(next.getLocalId())) {
                    arrayList2.add(next);
                } else {
                    String extraMeta = next.getLocalInfo().getExtraMeta("duration");
                    int i2 = extraMeta != null ? Integer.parseInt(extraMeta) : -1;
                    arrayList = arrayList2;
                    String strM6971y2 = new C1795s(next, fu4VarBf2.getNewResourceContext()).m6971y();
                    if ((!C1792n.nn86(strM6971y2) && !C1792n.hyr(strM6971y2)) || i2 <= 5000 || !zI1) {
                        if (localRingFragment.fu4()) {
                            if (!C1792n.nn86(strM6971y2) && !C1792n.hyr(strM6971y2)) {
                                arrayList4.add(next);
                            } else if (C1792n.m6932e(strM6971y2)) {
                                arrayList6.add(next);
                            } else if (C1792n.vyq(strM6971y2)) {
                                arrayList7.add(next);
                            } else {
                                arrayList5.add(next);
                            }
                        } else if (C1792n.nn86(strM6971y2) || C1792n.hyr(strM6971y2)) {
                            arrayList3.add(next);
                        } else {
                            arrayList4.add(next);
                        }
                    }
                    it = it2;
                    localRingPresenter = localRingPresenter2;
                    arrayList2 = arrayList;
                }
                arrayList = arrayList2;
                it = it2;
                localRingPresenter = localRingPresenter2;
                arrayList2 = arrayList;
            }
            LocalRingPresenter localRingPresenter3 = localRingPresenter;
            ArrayList arrayList8 = arrayList2;
            if (localRingFragment.fu4()) {
                Collections.sort(arrayList5, this.f15371q);
                Collections.sort(arrayList6, this.f15371q);
                Collections.sort(arrayList7, this.f15371q);
            } else {
                Collections.sort(arrayList3, this.f15371q);
            }
            ActivityC0891q activity = localRingFragment.getActivity();
            if (activity == null) {
                return null;
            }
            ArrayList arrayList9 = new ArrayList(list.size());
            if (arrayList4.size() > 0) {
                String string = activity.getString(R.string.title_my_audio_resource);
                if (!p029m.zy.toq(string)) {
                    arrayList9.add(C1902k.r8s8(string));
                }
                arrayList9.addAll(arrayList4);
            }
            if (resource3 != null) {
                arrayList9.add(C1902k.r8s8(null));
                arrayList9.add(resource3);
            }
            if (resource2 != null) {
                arrayList9.add(resource2);
            }
            if (!arrayList8.isEmpty()) {
                Intent intent = activity.getIntent();
                String stringExtra = intent == null ? null : intent.getStringExtra(C2965z.f17865n);
                if (!p029m.zy.toq(stringExtra)) {
                    arrayList9.add(C1902k.r8s8(stringExtra));
                }
                arrayList9.addAll(arrayList8);
            }
            if (localRingFragment.fu4()) {
                int iCdj = bwp.cdj(((BaseLocalPresenter) localRingPresenter3).f12713q);
                if (iCdj == 16 || iCdj == 1024 || iCdj == 2048 || iCdj == 4096) {
                    iCdj = 2;
                }
                arrayList9.add(C1902k.r8s8(activity.getString(R.string.title_system_audio_resource)));
                for (Integer num : LocalRingPresenter.y9n(iCdj)) {
                    if (num.intValue() == 0) {
                        arrayList9.addAll(arrayList5);
                    } else if (num.intValue() == 1) {
                        arrayList9.addAll(arrayList7);
                    } else if (num.intValue() == 2) {
                        arrayList9.addAll(arrayList6);
                    }
                }
            } else {
                arrayList9.add(C1902k.r8s8(activity.getString(R.string.title_system_audio_resource)));
                arrayList9.addAll(arrayList3);
            }
            LocalRingPresenter.yz(arrayList7, arrayList6, arrayList5, arrayList4);
            return arrayList9;
        }
    }

    static class toq extends AsyncTask<Void, Void, com.android.thememanager.settings.localaudio.toq> {

        /* JADX INFO: renamed from: k */
        WeakReference<LocalRingPresenter> f15372k;

        toq(LocalRingPresenter p2) {
            this.f15372k = new WeakReference<>(p2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public com.android.thememanager.settings.localaudio.toq doInBackground(Void... voids) {
            LocalRingFragment localRingFragment;
            ActivityC0891q activity;
            if (this.f15372k.get() == null || (localRingFragment = (LocalRingFragment) this.f15372k.get().zy()) == null || (activity = localRingFragment.getActivity()) == null) {
                return null;
            }
            return new com.android.thememanager.settings.localaudio.toq(C1792n.toq(activity, "ringtone"), C1792n.toq(activity, com.android.thememanager.basemodule.analysis.toq.mle), C1792n.toq(activity, "alarm"), C1792n.toq(activity, InterfaceC1789q.no), C1792n.toq(activity, "bootaudio"), C1792n.toq(activity, InterfaceC1789q.wz));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(com.android.thememanager.settings.localaudio.toq usingPath) {
            LocalRingFragment localRingFragment;
            LocalRingPresenter localRingPresenter = this.f15372k.get();
            if (usingPath == null || localRingPresenter == null || (localRingFragment = (LocalRingFragment) localRingPresenter.zy()) == null || isCancelled()) {
                return;
            }
            localRingFragment.z4j7(usingPath);
        }
    }

    public LocalRingPresenter(boolean registerImportListener, boolean fromCustomize, @lvui String resourceCode) {
        super(registerImportListener, fromCustomize, resourceCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i1(int ringtoneFlag) {
        return ringtoneFlag == 2 || ringtoneFlag == 16 || ringtoneFlag == 4096 || ringtoneFlag == 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<Integer> y9n(int ringtoneType) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static void yz(List<Resource>... lists) {
        for (List<Resource> list : lists) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m9130a() {
        toq toqVar = new toq(this);
        this.f15367c = toqVar;
        toqVar.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    public void a98o(@dd List<Resource> resources) {
        if (resources == null || resources.isEmpty()) {
            return;
        }
        AsyncTaskC2598k asyncTaskC2598k = new AsyncTaskC2598k(this, this.f15369f);
        this.f15368e = asyncTaskC2598k;
        asyncTaskC2598k.executeOnExecutor(C6002g.ld6(), resources);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dd
    fu4 bf2() {
        if (zy() != 0) {
            return ((LocalRingFragment) zy()).pnt2();
        }
        return null;
    }

    @Override // com.android.thememanager.basemodule.base.BasePresenter, androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        super.onDestroy(owner);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.mine.local.presenter.BaseLocalPresenter
    /* JADX INFO: renamed from: vyq */
    public void m8218c(String resourceCode) {
        if (bf2() == null) {
            return;
        }
        this.f12711n.n7h(new CopyOnWriteArrayList<>(C2082k.zy().m8001n().ld6(bf2()).m7690k().mo7474h(true)));
    }

    public void zp(int ringtoneFlag) {
        this.f15369f = ringtoneFlag;
    }
}
