package com.android.thememanager.settings.presenter;

import android.graphics.Matrix;
import android.os.AsyncTask;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.fti;
import androidx.lifecycle.lrht;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.settings.eqxt;
import com.android.thememanager.settings.presenter.C2604s;
import com.android.thememanager.util.sok;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.oc;

/* JADX INFO: renamed from: com.android.thememanager.settings.presenter.s */
/* JADX INFO: compiled from: WallpaperSubSettingPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2604s extends lrht {

    /* JADX INFO: renamed from: g */
    @dd
    private toq f15394g;

    /* JADX INFO: renamed from: h */
    private zy f15395h;

    /* JADX INFO: renamed from: i */
    private final fti<List<com.android.thememanager.settings.subsettings.f7l8>> f15396i = new fti<>();

    /* JADX INFO: renamed from: p */
    private zy f15397p;

    /* JADX INFO: renamed from: s */
    private zy f15398s;

    /* JADX INFO: renamed from: y */
    private zy f15399y;

    /* JADX INFO: renamed from: com.android.thememanager.settings.presenter.s$k */
    /* JADX INFO: compiled from: WallpaperSubSettingPresenter.java */
    static class k extends AbstractAsyncTaskC1714q<Void, zy, Boolean> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final C2604s f60849toq;

        k(C2604s vm) {
            this.f60849toq = vm;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(zy... values) {
            this.f60849toq.m9150f(values);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            List<com.android.thememanager.settings.subsettings.f7l8> qVar = com.android.thememanager.settings.subsettings.f7l8.toq(bz2.toq.m5843n(0));
            if (qVar != null) {
                publishProgress(new zy(4, qVar));
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.presenter.s$toq */
    /* JADX INFO: compiled from: WallpaperSubSettingPresenter.java */
    static class toq extends AsyncTask<Void, zy, Boolean> {

        /* JADX INFO: renamed from: k */
        private final int f15400k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final C2604s f60850toq;

        toq(int flag, C2604s vm) {
            this.f15400k = flag;
            this.f60850toq = vm;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ int zy(sok sokVar, sok sokVar2) {
            T t2;
            if (sokVar.f61414zy == 0 || (t2 = sokVar2.f61414zy) == 0) {
                return 0;
            }
            return Long.compare(((Long) t2).longValue(), ((Long) sokVar.f61414zy).longValue());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(zy... values) {
            this.f60850toq.m9150f(values);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean aBoolean) {
            if (isCancelled() || (this.f15400k & 4) == 0) {
                return;
            }
            new k(this.f60850toq).executeOnExecutor(C6002g.x2(), new Void[0]);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            if ((this.f15400k & 1) != 0) {
                List<sok<String, Matrix, Long>> listF7l8 = C2687z.f7l8(0);
                ArrayList arrayList = new ArrayList();
                Iterator<sok<String, Matrix, Long>> it = listF7l8.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f16799k);
                    if (arrayList.size() >= 6) {
                        break;
                    }
                }
                listF7l8.addAll(C2687z.f7l8(1));
                listF7l8.sort(new Comparator() { // from class: com.android.thememanager.settings.presenter.p
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return C2604s.toq.zy((sok) obj, (sok) obj2);
                    }
                });
                ArrayList arrayList2 = new ArrayList();
                int i2 = 1;
                for (sok<String, Matrix, Long> sokVar : listF7l8) {
                    Resource resource = new Resource();
                    resource.setContentPath(sokVar.f16799k);
                    resource.setCategory(arrayList.contains(sokVar.f16799k) ? "wallpaper" : "videowallpaper");
                    arrayList2.add(resource);
                    if (i2 >= 6) {
                        break;
                    }
                    i2++;
                }
                com.android.thememanager.settings.subsettings.f7l8 f7l8Var = new com.android.thememanager.settings.subsettings.f7l8(1, 10);
                f7l8Var.f15454q = bf2.toq.toq().getString(R.string.title_my_wallpaper);
                f7l8Var.f60866zy = arrayList2;
                f7l8Var.f15456y = listF7l8.size();
                listF7l8.clear();
                publishProgress(new zy(1, Collections.singletonList(f7l8Var)));
            }
            if ((this.f15400k & 2) == 0) {
                return Boolean.TRUE;
            }
            List<com.android.thememanager.settings.subsettings.f7l8> listT8r = eqxt.t8r(true, true);
            if (listT8r.size() > 0) {
                publishProgress(new zy(2, listT8r));
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.presenter.s$zy */
    /* JADX INFO: compiled from: WallpaperSubSettingPresenter.java */
    public static class zy {

        /* JADX INFO: renamed from: k */
        public final int f15401k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final List<com.android.thememanager.settings.subsettings.f7l8> f60851toq;

        zy(int t2, List<com.android.thememanager.settings.subsettings.f7l8> g2) {
            this.f15401k = t2;
            this.f60851toq = g2;
        }
    }

    @oc
    /* JADX INFO: renamed from: f */
    public void m9150f(zy... values) {
        zy zyVar = values[0];
        int i2 = zyVar.f15401k;
        if (i2 == 1) {
            this.f15399y = zyVar;
        } else if (i2 == 8) {
            this.f15395h = zyVar;
        } else if (i2 == 2) {
            this.f15398s = zyVar;
        } else {
            this.f15397p = zyVar;
        }
        ArrayList arrayList = new ArrayList();
        zy zyVar2 = this.f15399y;
        if (zyVar2 != null) {
            arrayList.addAll(zyVar2.f60851toq);
        }
        zy zyVar3 = this.f15395h;
        if (zyVar3 != null) {
            arrayList.addAll(zyVar3.f60851toq);
        }
        zy zyVar4 = this.f15398s;
        if (zyVar4 != null) {
            arrayList.addAll(zyVar4.f60851toq);
        }
        zy zyVar5 = this.f15397p;
        if (zyVar5 != null) {
            arrayList.addAll(zyVar5.f60851toq);
        }
        this.f15396i.cdj(arrayList);
    }

    public LiveData<List<com.android.thememanager.settings.subsettings.f7l8>> hyr(boolean onlySystem) {
        if (this.f15396i.m4388g() == null) {
            n5r1(onlySystem ? 2 : 15);
        }
        return this.f15396i;
    }

    public void n5r1(int flag) {
        toq toqVar = new toq(flag, this);
        this.f15394g = toqVar;
        toqVar.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // androidx.lifecycle.lrht
    protected void ncyb() {
        toq toqVar = this.f15394g;
        if (toqVar != null) {
            toqVar.cancel(false);
        }
    }
}
