package com.android.thememanager.basemodule.privacy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.android.thememanager.basemodule.utils.C1807g;
import ek5k.C6002g;
import java.util.UUID;

/* JADX INFO: compiled from: UserAgreementUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.privacy.zy$k */
    /* JADX INFO: compiled from: UserAgreementUtils.java */
    public static class C1787k extends ClickableSpan {

        /* JADX INFO: renamed from: k */
        private Context f10162k;

        /* JADX INFO: renamed from: q */
        private String f10163q;

        public C1787k(Context context, String url) {
            this.f10162k = context;
            this.f10163q = url;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            try {
                Intent intent = new Intent("android.intent.action.MIUI_LICENSE");
                intent.putExtra("url", this.f10163q);
                this.f10162k.startActivity(intent);
            } catch (Exception unused) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(this.f10163q));
                this.f10162k.startActivity(intent2);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            ds.setUnderlineText(true);
            ds.setColor(-16776961);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m6920q(Context context) {
        C6002g.n7h().execute(new Runnable() { // from class: com.android.thememanager.basemodule.privacy.toq
            @Override // java.lang.Runnable
            public final void run() {
                zy.zy();
            }
        });
    }

    public static String toq() {
        String strQrj = C1807g.qrj();
        return TextUtils.isEmpty(strQrj) ? UUID.randomUUID().toString() : strQrj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zy() {
        com.miui.privacypolicy.f7l8.toq(bf2.toq.toq(), C1807g.m7081r() ? C1781k.f57617fn3e : C1781k.f57633t8r, toq());
    }
}
