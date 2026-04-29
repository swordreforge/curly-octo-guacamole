package com.android.thememanager.controller.online;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.AbstractC1918k;
import com.android.thememanager.util.gc3c;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import miuix.appcompat.app.dd;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: ThemeLikeController.java */
/* JADX INFO: loaded from: classes2.dex */
public class wvg extends AbstractC1918k {

    /* JADX INFO: renamed from: k */
    private static final String f11026k = "ThemeLikeController";

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.wvg$q */
    /* JADX INFO: compiled from: ThemeLikeController.java */
    private static class C1941q {

        /* JADX INFO: renamed from: k */
        private static final wvg f11027k = new wvg();

        private C1941q() {
        }
    }

    /* JADX INFO: compiled from: ThemeLikeController.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        public String f11028k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public boolean f57969toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f57970zy;

        public toq(String moduleId, boolean like, int count) {
            this.f11028k = moduleId;
            this.f57969toq = like;
            this.f57970zy = count;
        }
    }

    /* JADX INFO: compiled from: ThemeLikeController.java */
    private static class zy extends AsyncTask<Void, Void, List<toq>> {

        /* JADX INFO: renamed from: g */
        private WeakReference<AbstractC1918k.k<List<toq>>> f11029g;

        /* JADX INFO: renamed from: k */
        private final boolean f11030k;

        /* JADX INFO: renamed from: n */
        private WeakReference<Activity> f11031n;

        /* JADX INFO: renamed from: q */
        private Handler f11032q = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Resource[] f57971toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private dd f57972zy;

        /* JADX INFO: renamed from: com.android.thememanager.controller.online.wvg$zy$k */
        /* JADX INFO: compiled from: ThemeLikeController.java */
        class DialogInterfaceOnCancelListenerC1942k implements DialogInterface.OnCancelListener {
            DialogInterfaceOnCancelListenerC1942k() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialog) {
                zy.this.cancel(false);
            }
        }

        /* JADX INFO: compiled from: ThemeLikeController.java */
        class toq implements Runnable {
            toq() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Activity activity = (Activity) zy.this.f11031n.get();
                if (activity == null || activity.isFinishing() || zy.this.f57972zy == null) {
                    return;
                }
                zy.this.f57972zy.show();
            }
        }

        public zy(boolean addLike, Activity activity, AbstractC1918k.k<List<toq>> observer) {
            this.f11030k = addLike;
            this.f11031n = new WeakReference<>(activity);
            this.f11029g = new WeakReference<>(observer);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            super.onCancelled();
            AbstractC1918k.k<List<toq>> kVar = this.f11029g.get();
            if (kVar != null) {
                kVar.zy(new ArrayList(0));
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            Activity activity = this.f11031n.get();
            if (gc3c.cdj(activity)) {
                AbstractC1918k.k<List<toq>> kVar = this.f11029g.get();
                if (kVar != null) {
                    kVar.mo6418k();
                }
                dd ddVar = new dd(activity);
                this.f57972zy = ddVar;
                ddVar.y2(0);
                this.f57972zy.setCanceledOnTouchOutside(false);
                this.f57972zy.n5r1(activity.getString(R.string.theme_favorite_waiting));
                this.f57972zy.setOnCancelListener(new DialogInterfaceOnCancelListenerC1942k());
                this.f11032q.postDelayed(new toq(), 500L);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<toq> results) {
            if (gc3c.cdj(this.f11031n.get())) {
                if (this.f57972zy.isShowing()) {
                    this.f57972zy.dismiss();
                }
                this.f57972zy = null;
                super.onPostExecute(results);
                AbstractC1918k.k<List<toq>> kVar = this.f11029g.get();
                if (kVar != null) {
                    kVar.zy(results);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public List<toq> doInBackground(Void... params) {
            Resource[] resourceArr;
            ArrayList arrayList = new ArrayList();
            if (isCancelled()) {
                return arrayList;
            }
            try {
                AbstractC1918k.k<List<toq>> kVar = this.f11029g.get();
                if (kVar != null) {
                    this.f57971toq = kVar.toq();
                }
                resourceArr = this.f57971toq;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (resourceArr != null && resourceArr.length != 0) {
                String strF7l8 = C1915g.f7l8(this.f11030k ? ld6.m7568j(resourceArr[0].getOnlineId()) : ld6.m7573o(EnumC1933t.getResourceIds(resourceArr)));
                Pair<Integer, JSONObject> pairKi = C1944y.ki(strF7l8);
                if (((Integer) pairKi.first).intValue() == 0) {
                    if (this.f11030k) {
                        Object obj = pairKi.second;
                        if (obj != null) {
                            arrayList.add(new toq(((JSONObject) obj).optString("moduleId"), ((JSONObject) pairKi.second).optBoolean("like"), ((JSONObject) pairKi.second).optInt("count")));
                        } else {
                            Log.e(wvg.f11026k, "add like fail..responsePair null");
                        }
                    } else {
                        JSONArray jSONArrayOptJSONArray = new JSONObject(strF7l8).optJSONArray(InterfaceC1925p.vqy);
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            arrayList.add(new toq(jSONArrayOptJSONArray.optJSONObject(i2).optString("moduleId"), jSONArrayOptJSONArray.optJSONObject(i2).optBoolean("like"), jSONArrayOptJSONArray.optJSONObject(i2).optInt("count")));
                        }
                    }
                    AbstractC1918k.m7561k(EnumC1933t.LIKE, this.f11030k, this.f57971toq);
                }
                return arrayList;
            }
            Log.w(wvg.f11026k, "invalid resources for like operation");
            return arrayList;
        }
    }

    public static wvg zy() {
        return C1941q.f11027k;
    }

    /* JADX INFO: renamed from: q */
    public void m7637q(boolean addLike, Activity activity, AbstractC1918k.k<List<toq>> observer) {
        new zy(addLike, activity, observer).executeOnExecutor(C6002g.n7h(), new Void[0]);
    }

    private wvg() {
    }
}
