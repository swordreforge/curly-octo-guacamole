package com.android.thememanager.share.wechat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.ArrayMap;
import com.android.thememanager.R;
import com.android.thememanager.share.C2702g;
import com.android.thememanager.share.C2706p;
import com.android.thememanager.share.InterfaceC2707q;
import com.android.thememanager.util.C2763c;
import miui.util.InputStreamLoader;
import z4j7.C7797k;

/* JADX INFO: compiled from: WechatShareContactMiniProgramDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends AbstractC2712q {

    /* JADX INFO: renamed from: p */
    private static final String f16087p = "WSSessionDelegate";

    /* JADX INFO: renamed from: s */
    private final Context f16088s;

    /* JADX INFO: renamed from: com.android.thememanager.share.wechat.zy$k */
    /* JADX INFO: compiled from: WechatShareContactMiniProgramDelegate.java */
    class AsyncTaskC2715k extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Intent f16089k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ InterfaceC2707q f61137toq;

        AsyncTaskC2715k(final Intent val$shareIntent, final InterfaceC2707q val$callback) {
            this.f16089k = val$shareIntent;
            this.f61137toq = val$callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voids) {
            Uri uri = (Uri) this.f16089k.getParcelableExtra("android.intent.extra.STREAM");
            String stringExtra = this.f16089k.getStringExtra(C2702g.f61081ni7);
            String stringExtra2 = this.f16089k.getStringExtra(C2702g.f61072fu4);
            String stringExtra3 = this.f16089k.getStringExtra(C2702g.f16029z);
            String string = zy.this.f16088s.getString(R.string.miuishare_mini_program_title);
            Activity qVar = zy.this.toq();
            if (qVar == null) {
                return null;
            }
            zy.this.x2().m9472g().m9466q(stringExtra2, stringExtra, stringExtra3, string, null, C2763c.m9650p(new InputStreamLoader(qVar, uri), 360, C7797k.f100633toq));
            this.f61137toq.mo9416k();
            return null;
        }
    }

    public zy(Context context, Bundle shareConfig) {
        super(shareConfig, C2706p.f61112jp0y);
        this.f16088s = context;
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: g */
    public ArrayMap<String, Object> mo9428g(Intent shareIntent) {
        ArrayMap<String, Object> arrayMap = new ArrayMap<>();
        arrayMap.put("type", "wechat_session");
        arrayMap.put("contentType", "wallpaper");
        return arrayMap;
    }

    @Override // com.android.thememanager.share.wechat.AbstractC2712q, com.android.thememanager.share.delegate.AbstractC2694g
    @SuppressLint({"StaticFieldLeak"})
    /* JADX INFO: renamed from: p */
    public void mo9431p(final Intent shareIntent, final InterfaceC2707q callback) {
        n7h(callback);
        new AsyncTaskC2715k(shareIntent, callback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
