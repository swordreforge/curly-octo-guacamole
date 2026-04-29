package com.android.thememanager.share.delegate;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.ArrayMap;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.share.C2702g;
import com.android.thememanager.share.InterfaceC2707q;

/* JADX INFO: renamed from: com.android.thememanager.share.delegate.k */
/* JADX INFO: compiled from: CopyUrlDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2696k extends AbstractC2694g {
    public C2696k(int shareFlag, Bundle shareConfiguration) {
        super(shareFlag, shareConfiguration);
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    public CharSequence f7l8() {
        Bundle bundle = this.f61062zy;
        String string = bundle != null ? bundle.getString(C2702g.f61066a9) : null;
        com.android.thememanager.share.f7l8.m9436k(string);
        Activity qVar = toq();
        if (qVar == null) {
            return null;
        }
        return "wallpaper".equals(string) ? qVar.getResources().getString(R.string.share_copy_wallpaper_url) : qVar.getResources().getString(R.string.share_copy_theme_url);
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: g */
    public ArrayMap<String, Object> mo9428g(Intent shareIntent) {
        ArrayMap<String, Object> arrayMap = new ArrayMap<>();
        arrayMap.put("type", "copy_url");
        Bundle bundle = this.f61062zy;
        arrayMap.put("contentType", bundle != null ? bundle.getString(C2702g.f61066a9, "") : null);
        return arrayMap;
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: k */
    public void mo9429k() {
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: p */
    public void mo9431p(Intent shareIntent, InterfaceC2707q callback) {
        Uri uri = (Uri) shareIntent.getParcelableExtra("android.intent.extra.STREAM");
        String stringExtra = shareIntent.getStringExtra(C2702g.f61074jk);
        String stringExtra2 = uri == null ? shareIntent.getStringExtra("android.intent.extra.TEXT") : shareIntent.getStringExtra(C2702g.f61073gvn7);
        if (!p029m.zy.toq(stringExtra)) {
            stringExtra2 = stringExtra2 + stringExtra;
        }
        if (!p029m.zy.toq(stringExtra2)) {
            nn86.m7150k(R.string.share_copy_url_success, 0);
            Activity qVar = toq();
            if (qVar == null) {
                return;
            } else {
                ((ClipboardManager) qVar.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", stringExtra2));
            }
        }
        if (callback != null) {
            callback.mo9416k();
        }
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: q */
    protected String mo9432q() {
        return null;
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: y */
    public boolean mo9434y(Intent shareIntent) {
        return true;
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    public Drawable zy(Intent shareIntent) {
        Activity qVar = toq();
        if (qVar == null) {
            return null;
        }
        return qVar.getResources().getDrawable(R.drawable.ic_share_copy_url);
    }
}
