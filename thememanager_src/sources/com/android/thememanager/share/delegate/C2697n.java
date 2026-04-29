package com.android.thememanager.share.delegate;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.ArrayMap;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1816n;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.share.C2702g;
import com.android.thememanager.share.InterfaceC2707q;
import com.android.thememanager.util.gc3c;
import com.market.sdk.utils.C5010k;
import ek5k.C6002g;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: com.android.thememanager.share.delegate.n */
/* JADX INFO: compiled from: SavePhotoDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2697n extends AbstractC2694g {

    /* JADX INFO: renamed from: q */
    private static final String f16010q = "com.android.thememanager.share.delegate.n";

    public C2697n(int shareFlag, Bundle shareConfiguration) {
        super(shareFlag, shareConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n7h(InterfaceC2707q interfaceC2707q) {
        Activity qVar;
        String string = this.f61062zy.getString(C2702g.f61075jp0y);
        if (string == null) {
            Log.d(f16010q, "share failed by productId == null.");
            return;
        }
        try {
            MediaStore.Images.Media.insertImage(C5010k.m17435k(), com.android.thememanager.detail.theme.util.toq.m7747n(toq(), string).getAbsolutePath(), this.f61062zy.getString(C2702g.f61071fti) + C1816n.m7142k(System.currentTimeMillis()) + ".png", (String) null);
            if (gc3c.cdj(toq()) && (qVar = toq()) != null) {
                qVar.runOnUiThread(new Runnable() { // from class: com.android.thememanager.share.delegate.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        nn86.m7150k(R.string.share_save_success, 0);
                    }
                });
            }
        } catch (FileNotFoundException | NullPointerException e2) {
            Log.e(f16010q, e2.getLocalizedMessage());
        }
        if (interfaceC2707q != null) {
            interfaceC2707q.mo9416k();
        }
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    public CharSequence f7l8() {
        Activity qVar = toq();
        if (qVar == null) {
            return null;
        }
        return qVar.getResources().getString(R.string.share_save_to_photo);
    }

    @Override // com.android.thememanager.share.delegate.AbstractC2694g
    /* JADX INFO: renamed from: g */
    public ArrayMap<String, Object> mo9428g(Intent shareIntent) {
        ArrayMap<String, Object> arrayMap = new ArrayMap<>();
        arrayMap.put("type", "save_photo");
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
    public void mo9431p(Intent shareIntent, final InterfaceC2707q callback) {
        if (shareIntent != null && this.f61062zy != null) {
            C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.share.delegate.zy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16011k.n7h(callback);
                }
            });
        } else if (callback != null) {
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
        return qVar.getResources().getDrawable(R.drawable.ic_save_photo);
    }
}
