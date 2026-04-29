package com.android.thememanager.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.recommend.view.widget.DialogInterfaceOnClickListenerC2462k;
import com.android.thememanager.util.ThemeAudioBatchHandler;
import com.android.thememanager.util.vq;
import miuix.appcompat.app.ki;
import miuix.hybrid.C7148k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: RingtoneChooseDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class lvui implements com.android.thememanager.basemodule.analysis.toq, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: g */
    private final Activity f17622g;

    /* JADX INFO: renamed from: k */
    private final Resource f17623k;

    /* JADX INFO: renamed from: n */
    private final ThemeAudioBatchHandler.toq f17624n;

    /* JADX INFO: renamed from: p */
    private final boolean f17625p;

    /* JADX INFO: renamed from: q */
    private final C7148k f17626q;

    /* JADX INFO: renamed from: s */
    private miuix.appcompat.app.ki f17627s;

    /* JADX INFO: renamed from: y */
    private final miuix.appcompat.app.ki f17628y;

    /* JADX INFO: renamed from: com.android.thememanager.view.lvui$k */
    /* JADX INFO: compiled from: RingtoneChooseDialog.java */
    class DialogInterfaceOnClickListenerC2928k implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2928k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            lvui.this.f17627s.dismiss();
            lvui.this.f17627s = null;
        }
    }

    /* JADX INFO: compiled from: RingtoneChooseDialog.java */
    class toq implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f17630k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f17632q;

        toq(final String val$trackParam, final String val$component) {
            this.f17630k = val$trackParam;
            this.f17632q = val$component;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            lvui.this.ki(this.f17630k);
            lvui.this.kja0(this.f17632q);
            lvui.this.f17627s.dismiss();
            lvui.this.f17627s = null;
        }
    }

    public lvui(Activity context, C7148k hybridCallback, ThemeAudioBatchHandler.toq nativeCallback, Resource r2) {
        this(context, hybridCallback, nativeCallback, r2, false);
    }

    private void cdj(Context context, String trackParam, String component) {
        if (this.f17627s == null) {
            this.f17627s = new ki.C6947k(context).uv6(context.getString(R.string.ringtone_confirm_dialog_title)).m25047s(true).m25050z(context.getString(R.string.ringtone_confirm_dialog_message)).x9kr(context.getString(android.R.string.ok), new toq(trackParam, component)).jk(context.getString(android.R.string.cancel), new DialogInterfaceOnClickListenerC2928k()).m25037g();
        }
        if (this.f17627s.isShowing()) {
            return;
        }
        this.f17627s.show();
    }

    private void f7l8() {
        ki("alarm");
        kja0("alarm");
        ld6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ki(String type) {
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("type", type);
        arrayMapM6679k.put("name", this.f17623k.getTitle());
        arrayMapM6679k.put("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g());
        arrayMapM6679k.put("resourceType", "ringtone");
        arrayMapM6679k.put("productId", this.f17623k.getOnlineId());
        C1708s.f7l8().ld6().zurt(C1706p.n7h(((AbstractActivityC1717k) this.f17622g).yz(), this.f17623k.getOnlineInfo().getTrackId(), arrayMapM6679k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kja0(String resourceCode) {
        com.android.thememanager.fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(resourceCode);
        fu4VarM10535g.setCurrentUsingPath(x2(this.f17623k, fu4VarM10535g));
        vq.m10057n(this.f17622g, fu4VarM10535g, this.f17623k);
        if (this.f17626q != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", p001b.toq.n7h(resourceCode));
            } catch (JSONException unused) {
            }
            this.f17626q.m25906k(new miuix.hybrid.o1t(jSONObject));
        }
        n7h();
    }

    private void n7h() {
        ThemeAudioBatchHandler.toq toqVar = this.f17624n;
        if (toqVar != null) {
            toqVar.mo8996k();
        }
    }

    /* JADX INFO: renamed from: p */
    private void m10383p() {
        ki("ringtone");
        kja0("ringtone");
        ld6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qrj(DialogInterface dialogInterface) {
        n7h();
    }

    /* JADX INFO: renamed from: s */
    private void m10385s() {
        if (this.f17625p) {
            cdj(this.f17622g, com.android.thememanager.basemodule.analysis.toq.mle, com.android.thememanager.basemodule.analysis.toq.mle);
        } else {
            ki(com.android.thememanager.basemodule.analysis.toq.mle);
            kja0(com.android.thememanager.basemodule.analysis.toq.mle);
        }
        ld6();
    }

    private static String x2(Resource r2, com.android.thememanager.fu4 resContext) {
        return TextUtils.isEmpty(r2.getContentPath()) ? com.android.thememanager.o1t.f7l8(r2, resContext) : r2.getContentPath();
    }

    /* JADX INFO: renamed from: y */
    private void m10386y() {
        if (this.f17625p) {
            cdj(this.f17622g, "mms", InterfaceC1789q.no);
        } else {
            ki("mms");
            kja0(InterfaceC1789q.no);
        }
        ld6();
    }

    /* JADX INFO: renamed from: g */
    public void m10387g() {
        this.f17628y.cancel();
    }

    /* JADX INFO: renamed from: h */
    public void m10388h() {
        if (this.f17628y.isShowing()) {
            return;
        }
        this.f17628y.show();
    }

    public void ld6() {
        if (this.f17628y.isShowing()) {
            this.f17628y.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialog, int which) {
        if (which == 0) {
            m10383p();
            return;
        }
        if (which == 1) {
            m10385s();
            return;
        }
        if (which == 2) {
            f7l8();
        } else if (which == 3) {
            m10386y();
        } else if (which == -2) {
            m10387g();
        }
    }

    public lvui(Activity context, C7148k hybridCallback, ThemeAudioBatchHandler.toq nativeCallback, Resource r2, boolean isLongRingtone) {
        this.f17622g = context;
        this.f17626q = hybridCallback;
        this.f17624n = nativeCallback;
        this.f17623k = r2;
        miuix.appcompat.app.ki kiVarM25037g = new ki.C6947k(context, 2131951635).m25034c(DialogInterfaceOnClickListenerC2462k.ld6(context), -1, this).mcp(android.R.string.cancel, this).cdj(true).m25037g();
        this.f17628y = kiVarM25037g;
        kiVarM25037g.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.android.thememanager.view.d2ok
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f17511k.qrj(dialogInterface);
            }
        });
        this.f17625p = isLongRingtone;
    }
}
