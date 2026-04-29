package com.android.thememanager.controller.online;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.AbstractC1918k;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.util.py;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import miuix.appcompat.app.dd;
import org.json.JSONObject;

/* JADX INFO: compiled from: ThemeFavoriteController.java */
/* JADX INFO: loaded from: classes2.dex */
public class o1t extends AbstractC1918k {

    /* JADX INFO: renamed from: k */
    private static o1t f10963k;

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.o1t$k */
    /* JADX INFO: compiled from: ThemeFavoriteController.java */
    private interface InterfaceC1923k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final String f57951f7l8 = "targetExtra";

        /* JADX INFO: renamed from: g */
        public static final String f10964g = "targetImage";

        /* JADX INFO: renamed from: k */
        public static final String f10965k = "matchComponent";

        /* JADX INFO: renamed from: n */
        public static final String f10966n = "targetTitle";

        /* JADX INFO: renamed from: q */
        public static final String f10967q = "targetData";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f57952toq = "matchAction";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f57953zy = "targetUrl";
    }

    /* JADX INFO: compiled from: ThemeFavoriteController.java */
    private static class toq extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private WeakReference<AbstractC1918k.k<Boolean>> f57954f7l8;

        /* JADX INFO: renamed from: g */
        private Handler f10968g = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: k */
        private final boolean f10969k;

        /* JADX INFO: renamed from: n */
        private dd f10970n;

        /* JADX INFO: renamed from: q */
        private Resource[] f10971q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private WeakReference<Activity> f57955toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private com.android.thememanager.fu4 f57956zy;

        /* JADX INFO: renamed from: com.android.thememanager.controller.online.o1t$toq$k */
        /* JADX INFO: compiled from: ThemeFavoriteController.java */
        class DialogInterfaceOnCancelListenerC1924k implements DialogInterface.OnCancelListener {
            DialogInterfaceOnCancelListenerC1924k() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialog) {
                toq.this.cancel(false);
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.controller.online.o1t$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ThemeFavoriteController.java */
        class RunnableC7913toq implements Runnable {
            RunnableC7913toq() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Activity activity = (Activity) toq.this.f57955toq.get();
                if (activity == null || activity.isFinishing() || toq.this.f10970n == null) {
                    return;
                }
                toq.this.f10970n.show();
            }
        }

        public toq(boolean addFavorite, Activity activity, com.android.thememanager.fu4 resourceContext, AbstractC1918k.k<Boolean> observer) {
            this.f10969k = addFavorite;
            this.f57955toq = new WeakReference<>(activity);
            this.f57956zy = resourceContext;
            this.f57954f7l8 = new WeakReference<>(observer);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            super.onCancelled();
            AbstractC1918k.k<Boolean> kVar = this.f57954f7l8.get();
            if (kVar != null) {
                kVar.zy(Boolean.FALSE);
            }
            dd ddVar = this.f10970n;
            if (ddVar != null) {
                if (ddVar.isShowing()) {
                    this.f10970n.dismiss();
                }
                this.f10970n = null;
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            Activity activity = this.f57955toq.get();
            if (gc3c.cdj(activity)) {
                AbstractC1918k.k<Boolean> kVar = this.f57954f7l8.get();
                if (kVar != null) {
                    kVar.mo6418k();
                }
                dd ddVar = new dd(activity);
                this.f10970n = ddVar;
                ddVar.y2(0);
                this.f10970n.setCanceledOnTouchOutside(false);
                this.f10970n.n5r1(activity.getString(R.string.theme_favorite_waiting));
                this.f10970n.setOnCancelListener(new DialogInterfaceOnCancelListenerC1924k());
                this.f10968g.postDelayed(new RunnableC7913toq(), 500L);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean result) {
            int i2;
            Activity activity = this.f57955toq.get();
            if (!gc3c.cdj(activity)) {
                this.f10970n = null;
                return;
            }
            dd ddVar = this.f10970n;
            if (ddVar != null && ddVar.isShowing()) {
                this.f10970n.dismiss();
            }
            this.f10970n = null;
            if (result.booleanValue()) {
                i2 = this.f10969k ? R.string.theme_favorite_add_success : R.string.theme_favorite_delete_success;
                for (Resource resource : this.f10971q) {
                    o1t.zy().m7605q(activity, resource, this.f10969k, this.f57956zy.getResourceCode());
                }
            } else {
                i2 = this.f10969k ? R.string.theme_favorite_add_fail : R.string.theme_favorite_delete_fail;
            }
            super.onPostExecute(result);
            AbstractC1918k.k<Boolean> kVar = this.f57954f7l8.get();
            if (kVar != null) {
                kVar.zy(result);
            }
            nn86.m7150k(i2, 0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... params) {
            Resource[] resourceArr;
            Object obj;
            if (isCancelled()) {
                return Boolean.FALSE;
            }
            try {
                AbstractC1918k.k<Boolean> kVar = this.f57954f7l8.get();
                if (kVar != null) {
                    this.f10971q = kVar.toq();
                }
                resourceArr = this.f10971q;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (resourceArr == null || resourceArr.length == 0) {
                throw new IllegalArgumentException("invalid resources for favorite operation");
            }
            Pair<Integer, JSONObject> pairKi = C1944y.ki(C1915g.f7l8(this.f10969k ? ld6.oc(resourceArr[0].getOnlineId(), p001b.toq.fu4(this.f57956zy.getResourceCode())) : ld6.eqxt(EnumC1933t.getResourceIds(resourceArr))));
            if (((Integer) pairKi.first).intValue() == 0 && (obj = pairKi.second) != null && TextUtils.equals(((JSONObject) obj).optString("result", ""), "ok")) {
                AbstractC1918k.m7561k(EnumC1933t.FAVORITE, this.f10969k, this.f10971q);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: ThemeFavoriteController.java */
    private interface zy {

        /* JADX INFO: renamed from: k */
        public static final String f10974k = "com.miui.personalassistant.action.FAVORITE";

        /* JADX INFO: renamed from: q */
        public static final String f10975q = "action_fav";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f57957toq = "com.miui.personalassistant";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f57958zy = "com.miui.personalassistant.permission.FAVORITE";
    }

    private o1t() {
    }

    public static o1t zy() {
        y9n.m7255s();
        if (f10963k == null) {
            f10963k = new o1t();
        }
        return f10963k;
    }

    /* JADX INFO: renamed from: n */
    public void m7604n(boolean addFavorite, Activity activity, com.android.thememanager.fu4 resourceContext, AbstractC1918k.k<Boolean> observer) {
        new toq(addFavorite, activity, resourceContext, observer).executeOnExecutor(C6002g.n7h(), new Void[0]);
    }

    /* JADX INFO: renamed from: q */
    public void m7605q(Context context, Resource resource, boolean isAddFavorite, String resourceCode) {
        if (resource == null || resource.getOnlineId() == null) {
            return;
        }
        String onlineId = resource.getOnlineId();
        Intent intent = new Intent(zy.f10974k);
        Bundle bundle = new Bundle();
        bundle.putString(InterfaceC1923k.f10965k, "com.android.thememanager");
        bundle.putString(InterfaceC1923k.f57952toq, "android.intent.action.VIEW");
        bundle.putString(InterfaceC1923k.f10967q, py.toq(resourceCode, onlineId));
        bundle.putString(InterfaceC1923k.f10966n, resource.getTitle());
        PathEntry pathEntry = resource.getPreviews().isEmpty() ? null : resource.getPreviews().get(0);
        String onlinePath = pathEntry != null ? pathEntry.getOnlinePath() : null;
        if (!TextUtils.isEmpty(onlinePath)) {
            bundle.putString(InterfaceC1923k.f10964g, onlinePath);
        }
        bundle.putBoolean(zy.f10975q, isAddFavorite);
        intent.putExtra(zy.f10975q, isAddFavorite);
        intent.putExtras(bundle);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(bundle);
        intent.putParcelableArrayListExtra("bundles", arrayList);
        intent.setPackage("com.miui.personalassistant");
        context.sendBroadcast(intent, zy.f57958zy);
    }
}
