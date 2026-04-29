package com.android.thememanager.share.wechat;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.ArrayMap;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.share.C2702g;
import com.android.thememanager.share.C2706p;
import com.android.thememanager.share.InterfaceC2707q;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.util.C2789j;
import com.android.thememanager.util.gc3c;
import com.bumptech.glide.EnumC3159p;
import com.bumptech.glide.load.engine.cdj;
import com.bumptech.glide.request.InterfaceFutureC3172q;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import miui.util.InputStreamLoader;
import miuix.appcompat.app.dd;

/* JADX INFO: renamed from: com.android.thememanager.share.wechat.y */
/* JADX INFO: compiled from: WechatShareTimelineMiniProgramDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2714y extends AbstractC2712q {

    /* JADX INFO: renamed from: p */
    private static final int f16077p = 150;

    /* JADX INFO: renamed from: s */
    private static final String f16078s = "WSTimelineDelegate";

    /* JADX INFO: renamed from: com.android.thememanager.share.wechat.y$k */
    /* JADX INFO: compiled from: WechatShareTimelineMiniProgramDelegate.java */
    private static class k extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f61134f7l8 = 1;

        /* JADX INFO: renamed from: g */
        private static final int f16079g = 0;

        /* JADX INFO: renamed from: p */
        private static final int f16080p = 4;

        /* JADX INFO: renamed from: s */
        private static final int f16081s = 3;

        /* JADX INFO: renamed from: y */
        private static final int f16082y = 2;

        /* JADX INFO: renamed from: k */
        private final WeakReference<Activity> f16083k;

        /* JADX INFO: renamed from: n */
        private dd f16084n;

        /* JADX INFO: renamed from: q */
        private final C2711n f16085q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Intent f61135toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final InterfaceC2707q f61136zy;

        /* JADX INFO: renamed from: com.android.thememanager.share.wechat.y$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WechatShareTimelineMiniProgramDelegate.java */
        class DialogInterfaceOnCancelListenerC7935k implements DialogInterface.OnCancelListener {
            DialogInterfaceOnCancelListenerC7935k() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialog) {
                k.this.cancel(true);
            }
        }

        public k(Activity activity, Intent intent, C2711n shareFutures, InterfaceC2707q shareCallback) {
            this.f16083k = new WeakReference<>(activity);
            this.f61135toq = intent;
            this.f16085q = shareFutures;
            this.f61136zy = shareCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voids) {
            Activity activity = this.f16083k.get();
            if (!gc3c.cdj(activity)) {
                return 1;
            }
            Uri uri = (Uri) this.f61135toq.getParcelableExtra("android.intent.extra.STREAM");
            String stringExtra = this.f61135toq.getStringExtra("android.intent.extra.SUBJECT");
            String string = activity.getString(R.string.miuishare_timeline_title);
            int intExtra = this.f61135toq.getIntExtra(C2702g.f16028y, 150);
            int intExtra2 = this.f61135toq.getIntExtra(C2702g.f16026s, 150);
            String stringExtra2 = this.f61135toq.getStringExtra(C2702g.f61082o1t);
            InterfaceFutureC3172q interfaceFutureC3172qDxef = com.bumptech.glide.zy.mcp(activity).zurt().mo6748i(stringExtra2).ltg8(new f7l8(C2763c.m9652s(new InputStreamLoader(activity, uri), 0), stringExtra, string)).qkj8(EnumC3159p.IMMEDIATE).i9jn(5000).dxef();
            int i2 = 4;
            try {
                Bitmap bitmap = (Bitmap) interfaceFutureC3172qDxef.get(10L, TimeUnit.SECONDS);
                File file = new File(activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES), UUID.nameUUIDFromBytes(stringExtra2.getBytes()).toString());
                C2763c.m9653t(bitmap, file.getAbsolutePath());
                C2789j.m9826k(C2714y.f16078s, "saved jpg path = %s", file.getAbsolutePath());
                if (isCancelled()) {
                    return 1;
                }
                i2 = this.f16085q.toq(file.getAbsolutePath(), intExtra, intExtra2, true) ? 0 : 4;
            } catch (ExecutionException e2) {
                for (Throwable cause = e2.getCause(); cause != null; cause = cause.getCause()) {
                    if (cause instanceof cdj) {
                        ((cdj) cause).logRootCauses(C2714y.f16078s);
                    } else {
                        C2789j.n7h(C2714y.f16078s, e2, "load resource fail.", new Object[0]);
                    }
                }
                i2 = 3;
            } catch (TimeoutException e3) {
                C2789j.n7h(C2714y.f16078s, e3, "timeout when prepare bitmap to share.", new Object[0]);
                i2 = 2;
            } catch (Exception e4) {
                C2789j.n7h(C2714y.f16078s, e4, "fail prepare bitmap to share.", new Object[0]);
            }
            return Integer.valueOf(i2);
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            super.onCancelled();
            if (gc3c.cdj(this.f16083k.get())) {
                this.f61136zy.mo9416k();
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            Activity activity = this.f16083k.get();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            if (this.f16084n == null) {
                this.f16084n = new dd(activity);
            }
            this.f16084n.setOnCancelListener(new DialogInterfaceOnCancelListenerC7935k());
            this.f16084n.n5r1(activity.getString(R.string.card_loading));
            this.f16084n.show();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer result) {
            super.onPostExecute(result);
            dd ddVar = this.f16084n;
            if (ddVar != null && ddVar.isShowing()) {
                this.f16084n.dismiss();
            }
            Activity activity = this.f16083k.get();
            if (gc3c.cdj(activity)) {
                int iIntValue = result.intValue();
                if (iIntValue != 0 && iIntValue != 1) {
                    if (iIntValue == 2 || iIntValue == 3) {
                        nn86.toq(activity.getString(R.string.miuishare_please_retry), 0);
                    } else {
                        nn86.toq(activity.getString(R.string.miuishare_share_fail), 0);
                    }
                }
                this.f61136zy.mo9416k();
            }
        }
    }

    public C2714y(Context context, Bundle shareConfig) {
        super(shareConfig, C2706p.f61110gvn7);
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: g */
    public ArrayMap<String, Object> mo9428g(Intent shareIntent) {
        ArrayMap<String, Object> arrayMap = new ArrayMap<>();
        arrayMap.put("type", "wechat_timeline");
        arrayMap.put("contentType", "wallpaper");
        return arrayMap;
    }

    @Override // com.android.thememanager.share.wechat.AbstractC2712q, com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: p */
    public void mo9431p(final Intent shareIntent, final InterfaceC2707q callback) {
        n7h(callback);
        Activity qVar = toq();
        if (qVar == null) {
            return;
        }
        new k(qVar, shareIntent, x2().m9472g(), callback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
