package com.android.thememanager.recommend.view.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.recommend.presenter.audio.AudioResourceHandler;
import java.util.ArrayList;
import miuix.appcompat.app.ki;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.k */
/* JADX INFO: compiled from: RingtoneDownloadAndApplyDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class DialogInterfaceOnClickListenerC2462k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: g */
    private final ki f14578g;

    /* JADX INFO: renamed from: k */
    private final Resource f14579k;

    /* JADX INFO: renamed from: n */
    private final zy f14580n;

    /* JADX INFO: renamed from: q */
    private final AudioResourceHandler f14581q;

    /* JADX INFO: renamed from: s */
    private final boolean f14582s;

    /* JADX INFO: renamed from: y */
    private ki f14583y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.k$k */
    /* JADX INFO: compiled from: RingtoneDownloadAndApplyDialog.java */
    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (DialogInterfaceOnClickListenerC2462k.this.f14583y != null) {
                DialogInterfaceOnClickListenerC2462k.this.f14583y.dismiss();
                DialogInterfaceOnClickListenerC2462k.this.f14583y = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.k$toq */
    /* JADX INFO: compiled from: RingtoneDownloadAndApplyDialog.java */
    class toq implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f14585k;

        toq(final String val$component) {
            this.f14585k = val$component;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            DialogInterfaceOnClickListenerC2462k.this.f14581q.m8522g(this.f14585k, DialogInterfaceOnClickListenerC2462k.this.f14579k);
            DialogInterfaceOnClickListenerC2462k.this.f14580n.mo8592k(this.f14585k);
            if (DialogInterfaceOnClickListenerC2462k.this.f14583y != null) {
                DialogInterfaceOnClickListenerC2462k.this.f14583y.dismiss();
                DialogInterfaceOnClickListenerC2462k.this.f14583y = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.k$zy */
    /* JADX INFO: compiled from: RingtoneDownloadAndApplyDialog.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo8592k(String resCode);
    }

    public DialogInterfaceOnClickListenerC2462k(Activity context, Resource r2, AudioResourceHandler handler, @lvui zy listener, boolean isNeedConfirm) {
        this.f14579k = r2;
        int iF7l8 = f7l8(r2);
        this.f14581q = handler;
        this.f14580n = listener;
        this.f14578g = new ki.C6947k(context, 2131951635).m25034c(ld6(context), iF7l8, this).mcp(R.string.cancel, this).cdj(true).m25037g();
        this.f14582s = isNeedConfirm;
    }

    private int f7l8(Resource r2) {
        String onlineId = r2.getOnlineId();
        if (!p029m.zy.toq(onlineId)) {
            String[] strArr = {"ringtone", com.android.thememanager.basemodule.analysis.toq.mle, "alarm", InterfaceC1789q.no};
            for (int i2 = 0; i2 < 4; i2++) {
                if (p029m.zy.m24738k(onlineId, m8842p(vyq.m7235z(strArr[i2])))) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static String[] ld6(Activity activity) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(activity.getString(com.android.thememanager.R.string.theme_apply_audio_dialog_item_ringtone));
        arrayList.add(activity.getString(com.android.thememanager.R.string.theme_apply_audio_dialog_item_notification));
        arrayList.add(activity.getString(com.android.thememanager.R.string.theme_apply_audio_dialog_item_alarm));
        arrayList.add(activity.getString(com.android.thememanager.R.string.theme_apply_audio_dialog_item_mms));
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: p */
    public static String m8842p(String path) {
        if (TextUtils.isEmpty(path)) {
            return "";
        }
        int iLastIndexOf = path.lastIndexOf(46);
        return iLastIndexOf > -1 ? path.substring(0, iLastIndexOf) : path;
    }

    private void qrj(Context context, String component) {
        if (this.f14583y == null) {
            this.f14583y = new ki.C6947k(context).uv6(context.getString(com.android.thememanager.R.string.ringtone_confirm_dialog_title)).m25047s(true).m25050z(context.getString(com.android.thememanager.R.string.ringtone_confirm_dialog_message)).x9kr(context.getString(R.string.ok), new toq(component)).jk(context.getString(R.string.cancel), new k()).m25037g();
        }
        if (this.f14583y.isShowing()) {
            return;
        }
        this.f14583y.show();
    }

    /* JADX INFO: renamed from: g */
    public void m8844g() {
        this.f14578g.cancel();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialog, int which) {
        if (which == 0) {
            this.f14581q.m8522g("ringtone", this.f14579k);
            this.f14580n.mo8592k("ringtone");
            m8846y();
        } else if (which == 1) {
            if (this.f14582s) {
                qrj(this.f14578g.getContext(), com.android.thememanager.basemodule.analysis.toq.mle);
            } else {
                this.f14581q.m8522g(com.android.thememanager.basemodule.analysis.toq.mle, this.f14579k);
                this.f14580n.mo8592k(com.android.thememanager.basemodule.analysis.toq.mle);
            }
            m8846y();
        } else if (which == 2) {
            this.f14581q.m8522g("alarm", this.f14579k);
            this.f14580n.mo8592k("alarm");
            m8846y();
        } else if (which == 3) {
            if (this.f14582s) {
                qrj(this.f14578g.getContext(), InterfaceC1789q.no);
            } else {
                this.f14581q.m8522g(InterfaceC1789q.no, this.f14579k);
                this.f14580n.mo8592k(InterfaceC1789q.no);
            }
            m8846y();
        } else if (which == -2) {
            m8844g();
        }
        this.f14578g.dismiss();
    }

    /* JADX INFO: renamed from: s */
    public ki m8845s() {
        return this.f14583y;
    }

    public void x2() {
        if (this.f14578g.isShowing()) {
            return;
        }
        this.f14578g.show();
    }

    /* JADX INFO: renamed from: y */
    public void m8846y() {
        if (this.f14578g.isShowing()) {
            this.f14578g.dismiss();
        }
    }
}
