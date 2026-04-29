package com.android.thememanager.util;

import android.content.DialogInterface;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0954z;
import com.airbnb.lottie.LottieAnimationView;
import com.android.thememanager.R;
import com.android.thememanager.activity.nsb;
import com.android.thememanager.activity.pc;
import com.android.thememanager.basemodule.resource.C1790g;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.C1902k;
import java.io.File;
import miuix.appcompat.app.ki;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeAudioBatchHandler extends BatchResourceHandler {

    /* JADX INFO: renamed from: e */
    protected C1790g f16292e;

    /* JADX INFO: renamed from: j */
    protected zy f16293j;

    /* JADX INFO: renamed from: m */
    private miuix.appcompat.app.ki f16294m;

    /* JADX INFO: renamed from: o */
    private AudioManager f16295o;

    /* JADX INFO: renamed from: com.android.thememanager.util.ThemeAudioBatchHandler$k */
    class C2751k implements toq {
        C2751k() {
        }

        @Override // com.android.thememanager.util.ThemeAudioBatchHandler.toq
        /* JADX INFO: renamed from: k */
        public void mo8996k() {
            ThemeAudioBatchHandler.this.f16293j.ld6(null);
            ThemeAudioBatchHandler.this.f16293j.x2();
            ThemeAudioBatchHandler.this.m9589e();
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo8996k();
    }

    public class zy {

        /* JADX INFO: renamed from: k */
        private String f16297k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f61190toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private View.OnClickListener f61191zy = new ViewOnClickListenerC2752k();

        /* JADX INFO: renamed from: com.android.thememanager.util.ThemeAudioBatchHandler$zy$k */
        class ViewOnClickListenerC2752k implements View.OnClickListener {
            ViewOnClickListenerC2752k() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                Resource resourceNi7 = ThemeAudioBatchHandler.this.ni7((Pair) v2.getTag());
                if (!ThemeAudioBatchHandler.this.nn86(resourceNi7) && !ThemeAudioBatchHandler.this.m9557z(resourceNi7)) {
                    ThemeAudioBatchHandler.this.m9591c(resourceNi7);
                    zy.this.x2();
                } else {
                    ThemeAudioBatchHandler.this.m9592f(resourceNi7);
                    zy zyVar = zy.this;
                    zyVar.f16297k = ThemeAudioBatchHandler.this.fu4(resourceNi7);
                    zy.this.x2();
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.util.ThemeAudioBatchHandler$zy$q */
        class DialogInterfaceOnClickListenerC2753q implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Resource f16300k;

            DialogInterfaceOnClickListenerC2753q(final Resource val$r) {
                this.f16300k = val$r;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                ThemeAudioBatchHandler.this.m9592f(this.f16300k);
                zy zyVar = zy.this;
                zyVar.f16297k = ThemeAudioBatchHandler.this.fu4(this.f16300k);
                zy.this.x2();
            }
        }

        class toq implements C1790g.zy {
            toq() {
            }

            @Override // com.android.thememanager.basemodule.resource.C1790g.zy
            public void onProgressUpdate(int playDuration, int totalDuration) {
            }

            @Override // com.android.thememanager.basemodule.resource.C1790g.zy
            public void onStartPlaying() {
                zy.this.x2();
            }

            @Override // com.android.thememanager.basemodule.resource.C1790g.zy
            public void onStopPlaying() {
                zy.this.x2();
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.util.ThemeAudioBatchHandler$zy$zy, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC7937zy implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC7937zy() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                ThemeAudioBatchHandler.this.f16292e.kja0();
                zy.this.x2();
            }
        }

        public zy() {
        }

        private void f7l8(View v2, Resource r2, boolean showUsingFlag, boolean canShowPlayingFlag) {
            Button button = (Button) v2.findViewById(R.id.operatorBtn);
            button.setVisibility(0);
            if (ThemeAudioBatchHandler.this.mo9554q()) {
                button.setVisibility(4);
                return;
            }
            if (!ThemeAudioBatchHandler.this.nn86(r2)) {
                button.setText("");
                if (ThemeAudioBatchHandler.this.m9557z(r2)) {
                    button.setBackgroundResource(R.drawable.resource_list_downloading_icon);
                    button.setClickable(false);
                    return;
                } else {
                    button.setBackgroundResource(R.drawable.resource_list_download_icon);
                    button.setTag(v2.getTag());
                    button.setOnClickListener(this.f61191zy);
                    return;
                }
            }
            button.setBackgroundResource(R.drawable.rc_apply_bg);
            if (!canShowPlayingFlag || !ThemeAudioBatchHandler.this.f16292e.ld6() || showUsingFlag) {
                button.setVisibility(4);
                return;
            }
            button.setText(R.string.resource_apply);
            button.setVisibility(0);
            button.setTag(v2.getTag());
            button.setOnClickListener(this.f61191zy);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x2() {
            ThemeAudioBatchHandler.this.f16235y.notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: y */
        private void m9594y(View v2, final Resource r2) {
            if (!ThemeAudioBatchHandler.this.f16233s.isMiuiRingtonePicker()) {
                ThemeAudioBatchHandler.this.f16294m = new ki.C6947k(v2.getContext()).uv6(v2.getContext().getString(R.string.resource_title_select_ringtone)).m25047s(false).m25050z(v2.getContext().getString(R.string.resource_select_audio_confirm_picker)).x9kr(v2.getContext().getString(android.R.string.ok), new DialogInterfaceOnClickListenerC2753q(r2)).jk(v2.getContext().getString(android.R.string.cancel), new DialogInterfaceOnClickListenerC7937zy()).hb();
            } else {
                ThemeAudioBatchHandler.this.m9592f(r2);
                this.f16297k = ThemeAudioBatchHandler.this.fu4(r2);
                x2();
            }
        }

        /* JADX INFO: renamed from: g */
        protected void m9595g(View v2, Resource r2, boolean showSelectedStatus, boolean showUsingFlag, boolean canShowPlayingFlag) {
            ImageView imageView = (ImageView) v2.findViewById(R.id.stateFlag);
            ProgressBar progressBar = (ProgressBar) v2.findViewById(R.id.playProgress);
            imageView.setVisibility(8);
            progressBar.setVisibility(8);
            TextView textView = (TextView) v2.findViewById(android.R.id.title);
            textView.setTextAppearance(v2.getContext(), 2131952481);
            TextView textView2 = (TextView) v2.findViewById(R.id.subTitle);
            textView2.setTextAppearance(v2.getContext(), 2131952482);
            ImageView imageView2 = (ImageView) v2.findViewById(R.id.call_mark);
            imageView2.setVisibility(8);
            ImageView imageView3 = (ImageView) v2.findViewById(R.id.notification_mark);
            imageView3.setVisibility(8);
            ImageView imageView4 = (ImageView) v2.findViewById(R.id.alarm_mark);
            imageView4.setVisibility(8);
            ImageView imageView5 = (ImageView) v2.findViewById(R.id.message_mark);
            imageView5.setVisibility(8);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) v2.findViewById(R.id.rc_playing_iv);
            lottieAnimationView.setAnimation(R.raw.music_playing_icon);
            lottieAnimationView.setVisibility(8);
            if (ThemeAudioBatchHandler.this.mo9554q()) {
                return;
            }
            v2.setSelected(showSelectedStatus);
            String strN5r1 = ThemeAudioBatchHandler.this.n5r1(r2);
            if (!ThemeAudioBatchHandler.this.f16233s.isPicker() && bwp.jk(ThemeAudioBatchHandler.this.f16233s.getResourceCode())) {
                if (TextUtils.equals(strN5r1, bwp.m9634s(ThemeAudioBatchHandler.this.f16230n, "ringtone"))) {
                    imageView2.setVisibility(0);
                }
                if (TextUtils.equals(strN5r1, bwp.m9634s(ThemeAudioBatchHandler.this.f16230n, com.android.thememanager.basemodule.analysis.toq.mle))) {
                    imageView3.setVisibility(0);
                }
                if (TextUtils.equals(strN5r1, bwp.m9634s(ThemeAudioBatchHandler.this.f16230n, "alarm"))) {
                    imageView4.setVisibility(0);
                }
                if (TextUtils.equals(strN5r1, bwp.m9634s(ThemeAudioBatchHandler.this.f16230n, InterfaceC1789q.no))) {
                    imageView5.setVisibility(0);
                }
            } else if (showUsingFlag) {
                imageView.setVisibility(0);
                textView.setTextColor(v2.getContext().getResources().getColor(R.color.resource_text_item_checked_color));
                textView2.setTextColor(v2.getContext().getResources().getColor(R.color.resource_text_item_checked_color));
            }
            if (canShowPlayingFlag && ThemeAudioBatchHandler.this.f16292e.ld6()) {
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.m5877l(true);
                lottieAnimationView.hyr();
            }
        }

        public void ld6(String id) {
            this.f16297k = id;
        }

        /* JADX INFO: renamed from: n */
        public String m9596n() {
            return this.f61190toq;
        }

        /* JADX INFO: renamed from: p */
        public void m9597p(String id) {
            this.f61190toq = id;
        }

        /* JADX INFO: renamed from: q */
        public C1790g.zy m9598q() {
            return new toq();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void qrj(android.view.View r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r10.getTag()
                android.util.Pair r0 = (android.util.Pair) r0
                com.android.thememanager.util.ThemeAudioBatchHandler r1 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                com.android.thememanager.basemodule.resource.model.Resource r0 = r1.ni7(r0)
                if (r0 != 0) goto Lf
                return
            Lf:
                com.android.thememanager.util.ThemeAudioBatchHandler r1 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                com.android.thememanager.util.ThemeAudioBatchHandler.x9kr(r1, r0)
                com.android.thememanager.util.ThemeAudioBatchHandler r1 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                boolean r1 = r1.nn86(r0)
                r2 = 0
                if (r1 == 0) goto L61
                com.android.thememanager.util.ThemeAudioBatchHandler r1 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                com.android.thememanager.fu4 r1 = r1.f16233s
                boolean r1 = r1.isPicker()
                if (r1 == 0) goto L3a
                com.android.thememanager.util.ThemeAudioBatchHandler r1 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                java.lang.String r1 = com.android.thememanager.util.ThemeAudioBatchHandler.ncyb(r1, r0)
                com.android.thememanager.util.ThemeAudioBatchHandler r3 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                com.android.thememanager.fu4 r3 = r3.f16233s
                java.lang.String r3 = r3.getCurrentUsingPath()
                boolean r1 = android.text.TextUtils.equals(r1, r3)
                goto L62
            L3a:
                com.android.thememanager.util.ThemeAudioBatchHandler r1 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                com.android.thememanager.fu4 r1 = r1.f16233s
                java.lang.String r1 = r1.getResourceCode()
                boolean r1 = com.android.thememanager.util.bwp.jk(r1)
                if (r1 != 0) goto L61
                com.android.thememanager.util.ThemeAudioBatchHandler r1 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                java.lang.String r1 = com.android.thememanager.util.ThemeAudioBatchHandler.ncyb(r1, r0)
                com.android.thememanager.util.ThemeAudioBatchHandler r3 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                androidx.fragment.app.q r4 = r3.f16230n
                com.android.thememanager.fu4 r3 = r3.f16233s
                java.lang.String r3 = r3.getResourceCode()
                java.lang.String r3 = com.android.thememanager.util.bwp.m9634s(r4, r3)
                boolean r1 = android.text.TextUtils.equals(r1, r3)
                goto L62
            L61:
                r1 = r2
            L62:
                com.android.thememanager.util.ThemeAudioBatchHandler r3 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                java.lang.String r3 = r3.fu4(r0)
                java.lang.String r4 = r9.f16297k
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                if (r3 == 0) goto L79
                com.android.thememanager.util.ThemeAudioBatchHandler r3 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                boolean r3 = r3.nn86(r0)
                if (r3 == 0) goto L79
                r2 = 1
            L79:
                r5 = r2
                com.android.thememanager.util.ThemeAudioBatchHandler r2 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                java.lang.String r2 = r2.fu4(r0)
                com.android.thememanager.util.ThemeAudioBatchHandler r3 = com.android.thememanager.util.ThemeAudioBatchHandler.this
                com.android.thememanager.util.ThemeAudioBatchHandler$zy r3 = r3.f16293j
                java.lang.String r3 = r3.m9596n()
                boolean r8 = android.text.TextUtils.equals(r2, r3)
                r2 = r9
                r3 = r10
                r4 = r0
                r6 = r1
                r7 = r8
                r2.m9595g(r3, r4, r5, r6, r7)
                r9.f7l8(r10, r0, r1, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.ThemeAudioBatchHandler.zy.qrj(android.view.View):void");
        }

        /* JADX INFO: renamed from: s */
        public void m9599s() {
            this.f16297k = null;
            this.f61190toq = null;
        }

        public void zy(View v2) {
            Resource resourceNi7 = ThemeAudioBatchHandler.this.ni7((Pair) v2.getTag());
            if (resourceNi7 == null) {
                return;
            }
            if (resourceNi7.isCanNotPlay()) {
                ThemeAudioBatchHandler.this.f16292e.kja0();
                m9594y(v2, resourceNi7);
            } else {
                ThemeAudioBatchHandler.this.uv6(resourceNi7);
                ThemeAudioBatchHandler themeAudioBatchHandler = ThemeAudioBatchHandler.this;
                themeAudioBatchHandler.f16293j.m9597p(themeAudioBatchHandler.fu4(resourceNi7));
                x2();
            }
        }
    }

    public ThemeAudioBatchHandler(nsb fragment, pc adapter, final com.android.thememanager.fu4 resContext) {
        super(fragment, adapter, resContext);
        this.f16292e = new C1790g(this.f16230n);
        zy zyVar = new zy();
        this.f16293j = zyVar;
        this.f16292e.qrj(zyVar.m9598q());
        this.f16295o = (AudioManager) this.f16230n.getSystemService(com.google.android.exoplayer2.util.wvg.f67137toq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m9589e() {
        if (!this.f16233s.isPicker()) {
            this.f16233s.setCurrentUsingPath(bwp.m9634s(this.f16230n, this.f16233s.getResourceCode()));
            this.f16235y.notifyDataSetChanged();
        } else if (this.f16235y.uv6().m7690k() instanceof C1902k) {
            ((C1902k) this.f16235y.uv6().m7690k()).w831();
            this.f16235y.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n5r1(Resource r2) {
        vyq(r2);
        return r2.getContentPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vyq(Resource r2) {
        if (r2.getContentPath() == null) {
            r2.setContentPath(com.android.thememanager.o1t.f7l8(r2, this.f16233s));
        }
        if (r2.getMetaPath() == null) {
            r2.setMetaPath(r2.getContentPath());
        }
        if (r2.getLocalId() == null) {
            r2.setLocalId(ch.mcp(r2.getContentPath()));
        }
    }

    /* JADX INFO: renamed from: c */
    protected void m9591c(Resource r2) {
        cdj(r2);
    }

    /* JADX INFO: renamed from: f */
    protected void m9592f(Resource r2) {
        if (!this.f16233s.isPicker()) {
            bwp.d2ok(this.f16233s, null, new C2751k(), this.f16230n, r2);
        } else {
            bwp.m9626g(this.f16233s, this.f16230n, n5r1(r2));
        }
    }

    @Override // com.android.thememanager.util.BatchResourceHandler
    protected void fn3e(View v2, Pair<Integer, Integer> position) {
        super.fn3e(v2, position);
        this.f16292e.kja0();
        this.f16293j.m9599s();
    }

    @Override // com.android.thememanager.util.BatchResourceHandler, com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: g */
    protected void mo9371g(View v2) {
        if (mo9554q() || this.f16233s.getDisplayType() != 2) {
            super.mo9371g(v2);
        } else {
            this.f16293j.zy(v2);
        }
    }

    @Override // com.android.thememanager.util.BatchResourceHandler
    protected boolean ld6() {
        return this.f16234t;
    }

    protected boolean nn86(Resource r2) {
        if (C1902k.bq.equals(r2.getLocalId()) || C1902k.ac.equals(r2.getLocalId()) || C1902k.sok(r2.getLocalId())) {
            return true;
        }
        return new File(n5r1(r2)).exists();
    }

    @Override // com.android.thememanager.util.BatchResourceHandler, androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@zy.lvui InterfaceC0954z owner) {
        super.onDestroy(owner);
        miuix.appcompat.app.ki kiVar = this.f16294m;
        if (kiVar != null && kiVar.isShowing()) {
            this.f16294m.dismiss();
        }
        C1790g c1790g = this.f16292e;
        if (c1790g != null) {
            c1790g.n7h();
            this.f16292e = null;
        }
    }

    @Override // com.android.thememanager.util.BatchResourceHandler, com.android.thememanager.util.t8r
    /* JADX INFO: renamed from: s */
    public void mo9372s() {
        super.mo9372s();
        this.f16292e.kja0();
        this.f16293j.m9599s();
    }

    @Override // com.android.thememanager.util.BatchResourceHandler, com.android.thememanager.util.t8r
    public void toq() {
        super.toq();
        this.f16292e.kja0();
        this.f16293j.m9599s();
    }

    protected boolean uv6(Resource r2) {
        int streamVolume;
        boolean zM6926n = this.f16292e.m6926n(r2, this.f16233s.getNewResourceContext());
        this.f16292e.kja0();
        if (zM6926n) {
            streamVolume = this.f16295o.getStreamVolume(this.f16230n.getVolumeControlStream());
            if (streamVolume == 0) {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.resource_ringtone_volume_mute, 0);
            } else {
                this.f16292e.m6927p(r2, this.f16233s.getNewResourceContext());
            }
        } else {
            streamVolume = 0;
        }
        return zM6926n && streamVolume != 0;
    }

    @Override // com.android.thememanager.util.BatchResourceHandler, androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@zy.lvui InterfaceC0954z owner) {
        super.zurt(owner);
        this.f16292e.kja0();
    }

    @Override // com.android.thememanager.util.BatchResourceHandler, com.android.thememanager.util.t8r
    public void zy(View v2, Pair<Integer, Integer> position) {
        super.zy(v2, position);
        this.f16293j.qrj(v2);
    }
}
