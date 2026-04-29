package com.market.sdk;

import android.os.AsyncTask;
import com.market.sdk.utils.C5010k;
import com.market.sdk.utils.C5013p;
import com.market.sdk.utils.C5014q;
import com.market.sdk.utils.C5019y;
import com.market.sdk.utils.f7l8;
import com.market.sdk.zurt;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: GetApps64Manager.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 {

    /* JADX INFO: renamed from: k */
    private static final String f28066k = "GetApps64Manager";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile kja0 f68890toq;

    /* JADX INFO: renamed from: com.market.sdk.kja0$k */
    /* JADX INFO: compiled from: GetApps64Manager.java */
    public class AsyncTaskC4978k extends AsyncTask<String, Void, Integer> {

        /* JADX INFO: renamed from: k */
        private cdj f28067k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private List<zy> f68891toq;

        public AsyncTaskC4978k(cdj cdjVar) {
            this.f28067k = cdjVar;
        }

        private List<zy> zy(JSONObject jSONObject) {
            ArrayList arrayList = new ArrayList();
            if (jSONObject == null) {
                C5013p.m17465q(kja0.f28066k, "support64App json obj null");
                return null;
            }
            C5013p.m17461g(kja0.f28066k, "support64App : " + jSONObject.toString());
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("apps");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(new zy(jSONArray.getJSONObject(i2).optString("packageName"), jSONArray.getJSONObject(i2).optString("versionCode"), jSONArray.getJSONObject(i2).optString("versionName")));
                }
                return arrayList;
            } catch (JSONException e2) {
                C5013p.m17465q(kja0.f28066k, "parse support64App error: " + e2.getLocalizedMessage());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(String... strArr) {
            if (!com.market.sdk.utils.ki.m17445y(C5010k.toq())) {
                return 3;
            }
            com.market.sdk.utils.f7l8 f7l8Var = new com.market.sdk.utils.f7l8(C5019y.f69028f7l8);
            f7l8.C5005n c5005n = new f7l8.C5005n(f7l8Var);
            c5005n.m17422k("sdk", String.valueOf(C5014q.f69009kja0));
            c5005n.m17422k(C5019y.f69023cdj, C5014q.f28223h);
            c5005n.m17422k(C5019y.f69037ki, C5014q.n7h());
            c5005n.m17422k(C5019y.f69051t8r, C5014q.m17477y());
            c5005n.m17422k(C5019y.f28241i, C5014q.ki());
            c5005n.m17422k(C5019y.f28252t, C5014q.m17475s());
            c5005n.m17422k("model", C5014q.cdj());
            c5005n.m17422k("device", C5014q.m17473p());
            c5005n.m17422k("deviceType", String.valueOf(C5014q.ld6()));
            c5005n.m17422k(C5019y.f69029fn3e, "11");
            c5005n.m17422k(C5019y.f69058zurt, C5010k.toq().getResources().getString(zurt.C5023h.f69789mj));
            c5005n.m17422k(C5019y.f69031fu4, C5014q.m17469h());
            c5005n.m17422k(C5019y.f28254z, C5014q.kja0());
            if (f7l8.EnumC5006q.OK != f7l8Var.n7h()) {
                return 4;
            }
            List<zy> listZy = zy(f7l8Var.m17419q());
            this.f68891toq = listZy;
            return listZy != null ? 0 : 4;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                this.f28067k.toq(this.f68891toq);
            } else if (num.intValue() == 4 || num.intValue() == 3) {
                this.f28067k.m17298k(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static kja0 m17321k() {
        if (f68890toq == null) {
            synchronized (kja0.class) {
                if (f68890toq == null) {
                    f68890toq = new kja0();
                }
            }
        }
        return f68890toq;
    }

    public void toq(cdj cdjVar) {
        new AsyncTaskC4978k(cdjVar).execute(new String[0]);
    }
}
