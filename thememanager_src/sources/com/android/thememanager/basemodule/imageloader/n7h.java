package com.android.thememanager.basemodule.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Pair;
import ek5k.C6002g;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SimpleLocalImageLoadTask.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h extends AsyncTask<Void, Pair<String, Bitmap>, Map<String, Bitmap>> {

    /* JADX INFO: renamed from: k */
    private toq f9922k;

    /* JADX INFO: renamed from: q */
    private InterfaceC1731k f9923q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String[] f57517toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private BitmapFactory.Options f57518zy;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.n7h$k */
    /* JADX INFO: compiled from: SimpleLocalImageLoadTask.java */
    public interface InterfaceC1731k {
        /* JADX INFO: renamed from: k */
        boolean mo6762k(String path);
    }

    /* JADX INFO: compiled from: SimpleLocalImageLoadTask.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo6454k(Map<String, Bitmap> result);

        default void toq(Pair<String, Bitmap> process) {
        }
    }

    public n7h(toq callback, String... paths) {
        this.f9922k = callback;
        this.f57517toq = paths;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map<String, Bitmap> doInBackground(Void... voids) {
        InterfaceC1731k interfaceC1731k;
        String[] strArr = this.f57517toq;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        HashMap map = new HashMap(this.f57517toq.length);
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.f57517toq;
            if (i2 >= strArr2.length) {
                return map;
            }
            String str = strArr2[i2];
            if (str != null) {
                try {
                    interfaceC1731k = this.f9923q;
                } catch (Exception | OutOfMemoryError e2) {
                    e2.printStackTrace();
                }
                Bitmap bitmapDecodeFile = (interfaceC1731k == null || interfaceC1731k.mo6762k(str)) ? BitmapFactory.decodeFile(str, this.f57518zy) : null;
                map.put(str, bitmapDecodeFile);
                publishProgress(new Pair(str, bitmapDecodeFile));
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Pair<String, Bitmap>... values) {
        Pair<String, Bitmap> pair;
        super.onProgressUpdate(values);
        toq toqVar = this.f9922k;
        if (toqVar == null || (pair = values[0]) == null) {
            return;
        }
        toqVar.toq(pair);
    }

    public void toq() {
        executeOnExecutor(C6002g.n7h(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Map<String, Bitmap> result) {
        super.onPostExecute(result);
        toq toqVar = this.f9922k;
        if (toqVar != null) {
            toqVar.mo6454k(result);
        }
    }

    public n7h(toq callback, BitmapFactory.Options option, InterfaceC1731k checkCalllback, String... paths) {
        this.f9922k = callback;
        this.f57517toq = paths;
        this.f57518zy = option;
        this.f9923q = checkCalllback;
    }
}
