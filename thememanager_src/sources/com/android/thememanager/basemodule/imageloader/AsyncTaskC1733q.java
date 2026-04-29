package com.android.thememanager.basemodule.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import com.bumptech.glide.signature.C3197n;
import ek5k.C6002g;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.q */
/* JADX INFO: compiled from: CustomLoadBitmapTask.java */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC1733q extends AsyncTask<Void, Void, Bitmap> {

    /* JADX INFO: renamed from: s */
    private static final String f9924s = AsyncTaskC1733q.class.getSimpleName();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private String f57519f7l8;

    /* JADX INFO: renamed from: g */
    private WeakReference<k> f9925g;

    /* JADX INFO: renamed from: k */
    private int f9926k;

    /* JADX INFO: renamed from: n */
    private int f9927n;

    /* JADX INFO: renamed from: q */
    private String f9928q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f57520toq;

    /* JADX INFO: renamed from: y */
    private boolean f9929y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Bitmap.Config f57521zy;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.q$k */
    /* JADX INFO: compiled from: CustomLoadBitmapTask.java */
    public interface k {
        void ld6(String key, Bitmap bitmap);
    }

    public AsyncTaskC1733q(String url, Bitmap.Config config, int width, int height, int simpleSize, k onLoadFinished, String version, boolean isNeedScale) {
        this.f9928q = url;
        this.f57521zy = config;
        this.f9926k = width;
        this.f57520toq = height;
        this.f9927n = simpleSize;
        this.f9925g = new WeakReference<>(onLoadFinished);
        this.f57519f7l8 = version;
        this.f9929y = isNeedScale;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Bitmap doInBackground(Void... voids) {
        com.bumptech.glide.n7h<Drawable> n7hVarMo6748i = com.bumptech.glide.zy.a9(bf2.toq.toq()).mo6748i(this.f9928q);
        if (!p029m.zy.toq(this.f57519f7l8)) {
            n7hVarMo6748i = (com.bumptech.glide.n7h) n7hVarMo6748i.was(new C3197n(this.f57519f7l8));
        }
        try {
            File file = n7hVarMo6748i.jz5(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
            if (file != null) {
                FileDescriptor fd = new FileInputStream(file).getFD();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(fd, null, options);
                options.inSampleSize = this.f9927n;
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = this.f57521zy;
                Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fd, null, options);
                return this.f9929y ? com.android.thememanager.v9.toq.m10206n(bitmapDecodeFileDescriptor, 1.5f) : bitmapDecodeFileDescriptor;
            }
        } catch (IOException | InterruptedException | ExecutionException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public void toq() {
        executeOnExecutor(C6002g.n7h(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Bitmap result) {
        k kVar = this.f9925g.get();
        if (kVar != null) {
            kVar.ld6(this.f9928q, result);
        } else {
            Log.e(f9924s, "onLoadFinished = null");
        }
    }
}
