package com.android.thememanager.settings.adapter;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.InterfaceC0954z;
import com.airbnb.lottie.LottieAnimationView;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.controller.C1902k;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.util.ThemeAudioBatchHandler;
import com.android.thememanager.util.bwp;
import i1.C6077k;
import java.io.File;
import miuix.appcompat.app.ki;
import p029m.zy;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalRingViewHolder extends BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private static final int f14971a = 5000;

    /* JADX INFO: renamed from: b */
    private Resource f14972b;

    /* JADX INFO: renamed from: c */
    private LocalRingAdapter f14973c;

    /* JADX INFO: renamed from: e */
    private ki f14974e;

    /* JADX INFO: renamed from: f */
    private C1791k f14975f;

    /* JADX INFO: renamed from: h */
    private ImageView f14976h;

    /* JADX INFO: renamed from: i */
    private ImageView f14977i;

    /* JADX INFO: renamed from: j */
    private int f14978j;

    /* JADX INFO: renamed from: l */
    private Button f14979l;

    /* JADX INFO: renamed from: m */
    private boolean f14980m;

    /* JADX INFO: renamed from: o */
    private int f14981o;

    /* JADX INFO: renamed from: p */
    private TextView f14982p;

    /* JADX INFO: renamed from: r */
    private ImageView f14983r;

    /* JADX INFO: renamed from: s */
    private LottieAnimationView f14984s;

    /* JADX INFO: renamed from: t */
    private ImageView f14985t;

    /* JADX INFO: renamed from: y */
    private TextView f14986y;

    /* JADX INFO: renamed from: z */
    private ImageView f14987z;

    /* JADX INFO: renamed from: com.android.thememanager.settings.adapter.LocalRingViewHolder$k */
    class DialogInterfaceOnClickListenerC2510k implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2510k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            LocalRingViewHolder.this.f14974e.n7h();
            LocalRingViewHolder.this.f14974e = null;
        }
    }

    class toq implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f14989k;

        toq(final Resource val$resource) {
            this.f14989k = val$resource;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            LocalRingViewHolder.this.nn86(this.f14989k);
            LocalRingViewHolder.this.f14974e.n7h();
            LocalRingViewHolder.this.f14974e = null;
        }
    }

    public LocalRingViewHolder(@lvui View root, @lvui LocalRingAdapter adapter, int ringtoneFlag) {
        super(root, adapter);
        this.f14975f = adapter.f14957a;
        this.f14973c = adapter;
        this.f14978j = ringtoneFlag;
        this.f14986y = (TextView) root.findViewById(R.id.title);
        this.f14984s = (LottieAnimationView) root.findViewById(com.android.thememanager.R.id.rc_playing_iv);
        this.f14982p = (TextView) root.findViewById(com.android.thememanager.R.id.subTitle);
        this.f14976h = (ImageView) root.findViewById(com.android.thememanager.R.id.call_mark);
        this.f14977i = (ImageView) root.findViewById(com.android.thememanager.R.id.notification_mark);
        this.f14987z = (ImageView) root.findViewById(com.android.thememanager.R.id.alarm_mark);
        this.f14985t = (ImageView) root.findViewById(com.android.thememanager.R.id.message_mark);
        this.f14979l = (Button) root.findViewById(com.android.thememanager.R.id.operatorBtn);
        this.f14983r = (ImageView) root.findViewById(com.android.thememanager.R.id.stateFlag);
        this.f14984s.setAnimation(com.android.thememanager.R.raw.music_playing_icon);
        this.f14984s.setRepeatCount(-1);
        this.f14980m = o1t.m7169g(fn3e());
        C6077k.ld6(root);
    }

    /* JADX INFO: renamed from: a */
    private boolean m8988a(Resource r2) {
        if (C1902k.bq.equals(r2.getLocalId()) || C1902k.ac.equals(r2.getLocalId()) || C1902k.sok(r2.getLocalId())) {
            return true;
        }
        return r2.getContentPath() != null && new File(r2.getContentPath()).exists();
    }

    private void ch(Resource resource, boolean using, boolean playing) {
        if (this.f14973c.m7312m() || this.f14980m) {
            this.f14979l.setVisibility(4);
            return;
        }
        this.f14979l.setVisibility(0);
        if (!m8988a(resource)) {
            this.f14979l.setText("");
            if (m8994m(resource)) {
                this.f14979l.setBackgroundResource(com.android.thememanager.R.drawable.resource_list_downloading_icon);
                this.f14979l.setClickable(false);
                return;
            } else {
                this.f14979l.setBackgroundResource(com.android.thememanager.R.drawable.resource_list_download_icon);
                this.f14979l.setOnClickListener(this);
                return;
            }
        }
        this.f14979l.setBackgroundResource(com.android.thememanager.R.drawable.rc_apply_bg);
        if (!playing || using) {
            this.f14979l.setVisibility(4);
            return;
        }
        this.f14979l.setText(com.android.thememanager.R.string.resource_apply);
        this.f14979l.setVisibility(0);
        this.f14979l.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: e */
    private void m8990e(Resource r2) {
        C2320q.t8r(r2, this.f14975f);
    }

    private boolean ek5k() {
        int i2 = this.f14978j;
        return i2 == 2 || i2 == 16 || i2 == 4096 || i2 == 8192;
    }

    private void hb(final Resource r2) {
        ActivityC0891q activityC0891qKi = this.f14973c.ki();
        if (!this.f14973c.tfm()) {
            bwp.lvui(this.f14975f.getResourceCode(), null, new ThemeAudioBatchHandler.toq() { // from class: com.android.thememanager.settings.adapter.k
                @Override // com.android.thememanager.util.ThemeAudioBatchHandler.toq
                /* JADX INFO: renamed from: k */
                public final void mo8996k() {
                    this.f14991k.yz(r2);
                }
            }, activityC0891qKi, r2, this.f14981o >= 5000);
        } else {
            bwp.f7l8(-1, null, activityC0891qKi, r2.getContentPath());
            this.f14973c.i9jn(r2);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m8992j(Resource r2) {
        if (r2.getContentPath() == null) {
            r2.setContentPath(C2320q.ni7(r2, this.f14975f));
        }
        if (r2.getMetaPath() == null) {
            r2.setMetaPath(r2.getContentPath());
        }
        if (r2.getLocalId() == null) {
            r2.setLocalId(C1792n.m6943p(r2.getContentPath()));
        }
    }

    private void lv5(boolean playing) {
        if (playing) {
            this.f14984s.post(new Runnable() { // from class: com.android.thememanager.settings.adapter.toq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14992k.y9n();
                }
            });
        } else {
            this.f14984s.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m8994m(Resource r2) {
        return C2082k.zy().m8000g().n7h(r2);
    }

    private void nmn5(Context context, Resource resource) {
        if (this.f14974e == null) {
            this.f14974e = new ki.C6947k(context).uv6(context.getString(com.android.thememanager.R.string.ringtone_confirm_dialog_title)).m25047s(true).m25050z(context.getString(com.android.thememanager.R.string.ringtone_confirm_dialog_message)).x9kr(context.getString(R.string.ok), new toq(resource)).jk(context.getString(R.string.cancel), new DialogInterfaceOnClickListenerC2510k()).m25037g();
        }
        if (this.f14974e.isShowing()) {
            return;
        }
        this.f14974e.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nn86(Resource resource) {
        if (m8988a(resource) || m8994m(resource)) {
            hb(resource);
        } else {
            m8990e(resource);
        }
    }

    private void vyq() {
        ki kiVar = this.f14974e;
        if (kiVar == null || !kiVar.isShowing()) {
            return;
        }
        this.f14974e.dismiss();
        this.f14974e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y9n() {
        this.f14984s.setVisibility(0);
        this.f14984s.hyr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yz(Resource resource) {
        if (this.f14973c.qo()) {
            this.f14973c.i9jn(resource);
        } else {
            this.f14973c.was();
        }
    }

    private void zp(boolean using, boolean playing) {
        Context context = this.itemView.getContext();
        if ((this.f14973c.tfm() || this.f14973c.qo()) && using) {
            int color = context.getResources().getColor(com.android.thememanager.R.color.setting_find_more_text);
            this.f14986y.setTextColor(color);
            this.f14982p.setTextColor(color);
        } else {
            this.f14986y.setTextColor(context.getResources().getColor(com.android.thememanager.R.color.me_ring_title_color));
            this.f14982p.setTextColor(context.getResources().getColor(com.android.thememanager.R.color.me_ring_subtitle_color));
        }
        if (this.f14973c.tfm() || this.f14973c.qo()) {
            this.f14983r.setVisibility(using ? 0 : 8);
        } else {
            a98o();
        }
        lv5(playing);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a98o() {
        String contentPath = this.f14972b.getContentPath();
        com.android.thememanager.settings.localaudio.toq toqVarMu = this.f14973c.mu();
        boolean zLrht = C1792n.lrht(contentPath, toqVarMu.f15111k);
        boolean zLrht2 = C1792n.lrht(contentPath, toqVarMu.f60790toq);
        boolean zLrht3 = C1792n.lrht(contentPath, toqVarMu.f60791zy);
        boolean zLrht4 = C1792n.lrht(contentPath, toqVarMu.f15113q);
        this.f14976h.setVisibility(zLrht ? 0 : 8);
        this.f14977i.setVisibility(zLrht2 ? 0 : 8);
        this.f14987z.setVisibility(zLrht3 ? 0 : 8);
        this.f14985t.setVisibility(zLrht4 ? 0 : 8);
        if (this.f14973c.gyi(this.f14972b, this.f14975f)) {
            ((BaseLocalResourceAdapter.toq) this.f9849q).zy((zLrht || zLrht2 || zLrht3 || zLrht4) ? false : true);
            ((BaseLocalResourceAdapter.toq) this.f9849q).m8240g(zLrht || zLrht2 || zLrht3 || zLrht4);
        }
    }

    public void bf2() {
        Resource resource = this.f14972b;
        Resource resourceQkj8 = this.f14973c.qkj8();
        ch(resource, (this.f14973c.tfm() || this.f14973c.qo()) && (this.f14973c.fnq8() == resource || C1792n.lrht(resource.getContentPath(), this.f14973c.m8986d())), resource == resourceQkj8);
        lv5(resource == resourceQkj8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i1() {
        Resource resource = this.f14972b;
        Resource resourceFnq8 = this.f14973c.fnq8();
        this.f14983r.setVisibility(resource == resourceFnq8 ? 0 : 8);
        zp(resource == resourceFnq8, resource == this.f14973c.qkj8());
        this.f14979l.setVisibility(4);
        if (this.f14973c.gyi(resource, this.f14975f)) {
            ((BaseLocalResourceAdapter.toq) this.f9849q).zy(resource != resourceFnq8);
            ((BaseLocalResourceAdapter.toq) this.f9849q).m8240g(resource == resourceFnq8);
        }
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        Resource resource = this.f14972b;
        if (resource == null) {
            return;
        }
        if (resource.isCanNotPlay()) {
            this.f14973c.vq().m8970n();
            hb(this.f14972b);
        } else if (this.f14973c.wo(resource)) {
            this.f14973c.vq().m8970n();
        } else {
            this.f14973c.vq().m8971q(resource);
        }
        if (this.f14980m) {
            if (!ek5k() || this.f14981o < 5000) {
                nn86(resource);
            } else {
                nmn5(this.itemView.getContext(), resource);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (this.f14980m) {
            return;
        }
        Resource resource = this.f14972b;
        if (!ek5k() || this.f14981o < 5000) {
            nn86(resource);
        } else {
            nmn5(this.itemView.getContext(), resource);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        super.onDestroy(owner);
        vyq();
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseLocalResourceAdapter.toq item, int position) {
        String str;
        super.o1t(item, position);
        this.itemView.setTag(Integer.valueOf(position));
        Resource resourceM8241k = item.m8241k();
        m8992j(resourceM8241k);
        this.f14972b = resourceM8241k;
        boolean z2 = m8988a(resourceM8241k) && (this.f14973c.tfm() || this.f14973c.qo()) && (C1792n.lrht(resourceM8241k.getContentPath(), this.f14973c.m8986d()) || resourceM8241k == this.f14973c.fnq8());
        boolean z3 = resourceM8241k == this.f14973c.qkj8();
        zp(z2, z3);
        ch(resourceM8241k, z2, z3);
        String strM6934g = null;
        if (zy.toq(resourceM8241k.getTitle())) {
            str = null;
        } else {
            str = resourceM8241k.getTitle() + '\r';
        }
        this.f14986y.setText(str);
        String extraMeta = resourceM8241k.getLocalInfo().getExtraMeta("duration");
        int i2 = extraMeta != null ? Integer.parseInt(extraMeta) : -1;
        this.f14981o = i2;
        if (i2 > 0) {
            strM6934g = C1792n.m6934g(this.itemView.getContext(), this.f14981o);
            View view = this.itemView;
            view.setPadding(view.getPaddingLeft(), fn3e().getResources().getDimensionPixelSize(com.android.thememanager.R.dimen.ring_list_content_padding_top), this.itemView.getPaddingRight(), fn3e().getResources().getDimensionPixelSize(com.android.thememanager.R.dimen.ring_list_content_padding_bottom));
        } else {
            View view2 = this.itemView;
            view2.setPadding(view2.getPaddingLeft(), fn3e().getResources().getDimensionPixelSize(com.android.thememanager.R.dimen.ring_list_content_nosummary_padding_top), this.itemView.getPaddingRight(), fn3e().getResources().getDimensionPixelSize(com.android.thememanager.R.dimen.ring_list_content_nosummary_padding_bottom));
        }
        this.f14982p.setVisibility(zy.toq(strM6934g) ? 8 : 0);
        this.f14982p.setText(strM6934g);
    }
}
