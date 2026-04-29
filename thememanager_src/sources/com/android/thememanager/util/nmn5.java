package com.android.thememanager.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.InterfaceC1925p;
import ek5k.C6002g;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ResourceShareHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class nmn5 implements com.android.thememanager.basemodule.resource.constants.toq, InterfaceC1925p {

    /* JADX INFO: renamed from: com.android.thememanager.util.nmn5$k */
    /* JADX INFO: compiled from: ResourceShareHelper.java */
    class AsyncTaskC2796k extends AsyncTask<Void, Void, String> {

        /* JADX INFO: renamed from: k */
        miuix.appcompat.app.dd f16666k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ String f16667n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Uri f16668q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Activity f61373toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ String f61374zy;

        AsyncTaskC2796k(final Activity val$activity, final String val$sPictureUrl, final Uri val$uri, final String val$sText) {
            this.f61373toq = val$activity;
            this.f61374zy = val$sPictureUrl;
            this.f16668q = val$uri;
            this.f16667n = val$sText;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... params) {
            File fileZy = nmn5.zy(C2082k.zy().toq(), "weibo_pic.tmp");
            fileZy.delete();
            com.android.thememanager.controller.online.zurt zurtVar = new com.android.thememanager.controller.online.zurt(this.f61374zy);
            new com.android.thememanager.controller.online.toq(zurtVar.getUrlId()).toq(zurtVar, fileZy.getAbsolutePath());
            if (!fileZy.exists()) {
                return null;
            }
            fileZy.setReadable(true, false);
            return fileZy.getAbsolutePath();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            miuix.appcompat.app.dd ddVar = new miuix.appcompat.app.dd(this.f61373toq);
            this.f16666k = ddVar;
            ddVar.m24877x(true);
            this.f16666k.setCancelable(false);
            this.f16666k.n5r1(this.f61373toq.getText(R.string.loading));
            this.f16666k.show();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String result) {
            if (gc3c.cdj(this.f61373toq)) {
                this.f16666k.dismiss();
                nmn5.m9906g(this.f61373toq, this.f16668q, this.f16667n, result);
            }
        }
    }

    /* JADX INFO: compiled from: ResourceShareHelper.java */
    public static class toq extends AsyncTask<Void, Void, File> {

        /* JADX INFO: renamed from: k */
        private String f16669k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Resource f61375toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private WeakReference<Activity> f61376zy;

        public toq(Activity activity, Resource resource, String imagePath) {
            this.f61376zy = new WeakReference<>(activity);
            this.f16669k = imagePath;
            this.f61375toq = resource;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public File doInBackground(Void... params) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(File tempImageFile) {
            Activity activity = this.f61376zy.get();
            if (gc3c.cdj(activity)) {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String title = this.f61375toq.getTitle();
                intent.putExtra("android.intent.extra.SUBJECT", activity.getString(R.string.resource_share_subject, title));
                intent.putExtra("android.intent.extra.TEXT", activity.getResources().getString(R.string.share_content_topic) + activity.getResources().getString(R.string.share_content_text_first_font, title) + activity.getResources().getString(R.string.share_content_text_second, activity.getResources().getString(R.string.share_share_suffix)));
                activity.startActivity(Intent.createChooser(intent, activity.getString(R.string.resource_share_title)));
            }
        }
    }

    public static boolean f7l8(final Activity activity, final Uri uri) {
        String queryParameter;
        if ("service.weibo.com".equals(uri.getHost()) && "/share/share.php".equals(uri.getPath())) {
            String queryParameter2 = null;
            try {
                queryParameter = uri.getQueryParameter("title");
                try {
                    queryParameter2 = uri.getQueryParameter("pic");
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                queryParameter = null;
            }
            if (!TextUtils.isEmpty(queryParameter)) {
                if (TextUtils.isEmpty(queryParameter2)) {
                    m9906g(activity, uri, queryParameter, queryParameter2);
                    return true;
                }
                new AsyncTaskC2796k(activity, queryParameter2, uri, queryParameter).executeOnExecutor(C6002g.ld6(), new Void[0]);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m9906g(Context context, Uri originUri, String text, String picturePath) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", text);
        if (TextUtils.isEmpty(picturePath) || !new File(picturePath).exists()) {
            intent.setType("text/plain");
        } else {
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(picturePath));
            intent.setType("image/*");
        }
        intent.setPackage(com.android.thememanager.detail.theme.util.toq.f11188g);
        try {
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                context.startActivity(new Intent("android.intent.action.VIEW", originUri));
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m9908n(Activity activity, Resource resource, String imagePath) {
        new toq(activity, resource, imagePath).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: renamed from: q */
    public static void m9909q(Activity activity, Resource resource) {
        m9908n(activity, resource, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File zy(Context context, String name) {
        return new File(i1.toq(context), "share_" + name);
    }
}
