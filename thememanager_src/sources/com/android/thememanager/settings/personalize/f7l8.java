package com.android.thememanager.settings.personalize;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1824r;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.recommend.view.C2451n;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.coroutines.jvm.internal.kja0;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.ni7;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.z4;
import miuix.appcompat.app.ki;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LockScreenTipController.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f60805f7l8 = 1;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final String f15218g = "is_lock_edit_called_from_system_ui_key";

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final String f15219n = "hasShowLockTip";

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final String f15220q = "needDialogTip";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final C2553k f60806toq = new C2553k(null);

    /* JADX INFO: renamed from: y */
    private static final int f15221y = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f60807zy = "LockScreenTip";

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private ki f15222k;

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.f7l8$g */
    /* JADX INFO: compiled from: LockScreenTipController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.LockScreenTipController", m22756f = "LockScreenTipController.kt", m22757i = {}, m22758l = {95}, m22759m = "showLockTipDialog", m22760n = {}, m22761s = {})
    static final class C2552g extends AbstractC6209q {
        int label;
        /* synthetic */ Object result;

        C2552g(InterfaceC6216q<? super C2552g> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return f7l8.this.cdj(null, this);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.f7l8$k */
    /* JADX INFO: compiled from: LockScreenTipController.kt */
    public static final class C2553k {
        private C2553k() {
        }

        public /* synthetic */ C2553k(ni7 ni7Var) {
            this();
        }

        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final void m9057k() {
            if (o1t.C1820k.m7182q() == o1t.C1820k.f57804qrj) {
                C1824r.m7203y().m7206p(f7l8.f15220q, true).m7204k();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.f7l8$n */
    /* JADX INFO: compiled from: LockScreenTipController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.LockScreenTipController$showLockScreenDialogTip$1", m22756f = "LockScreenTipController.kt", m22757i = {}, m22758l = {85}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2554n extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.f7l8$n$k */
        /* JADX INFO: compiled from: LockScreenTipController.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.LockScreenTipController$showLockScreenDialogTip$1$1", m22756f = "LockScreenTipController.kt", m22757i = {}, m22758l = {86}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ Context $context;
            int label;
            final /* synthetic */ f7l8 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(f7l8 f7l8Var, Context context, InterfaceC6216q<? super k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.this$0 = f7l8Var;
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new k(this.this$0, this.$context, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    f7l8 f7l8Var = this.this$0;
                    Context context = this.$context;
                    this.label = 1;
                    if (f7l8Var.cdj(context, this) == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                return was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2554n(Context context, InterfaceC6216q<? super C2554n> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return f7l8.this.new C2554n(this.$context, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C2554n) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                boolean z2 = false;
                if (o1t.C1820k.m7182q() == o1t.C1820k.f57804qrj && C1824r.m7203y().zy(f7l8.f15220q, false) && !f7l8.this.ld6(this.$context)) {
                    z2 = true;
                }
                if (z2) {
                    z4 z4VarM23813n = C6481a.m23813n();
                    k kVar = new k(f7l8.this, this.$context, null);
                    this.label = 1;
                    if (C6708p.m24523y(z4VarM23813n, kVar, this) == objX2) {
                        return objX2;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.f7l8$q */
    /* JADX INFO: compiled from: LockScreenTipController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.LockScreenTipController$createDialog$bitmap$1", m22756f = "LockScreenTipController.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2555q extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Bitmap>, Object> {
        final /* synthetic */ MediaMetadataRetriever $retriever;
        final /* synthetic */ i1.C6299y<Integer> $videoHeight;
        final /* synthetic */ i1.C6299y<Integer> $videoWidth;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2555q(i1.C6299y<Integer> c6299y, MediaMetadataRetriever mediaMetadataRetriever, i1.C6299y<Integer> c6299y2, InterfaceC6216q<? super C2555q> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$videoWidth = c6299y;
            this.$retriever = mediaMetadataRetriever;
            this.$videoHeight = c6299y2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C2555q(this.$videoWidth, this.$retriever, this.$videoHeight, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Bitmap> interfaceC6216q) {
            return ((C2555q) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            i1.C6299y<Integer> c6299y = this.$videoWidth;
            String strExtractMetadata = this.$retriever.extractMetadata(18);
            c6299y.element = strExtractMetadata != null ? kotlin.coroutines.jvm.internal.toq.m22765g(Integer.parseInt(strExtractMetadata)) : 0;
            i1.C6299y<Integer> c6299y2 = this.$videoHeight;
            String strExtractMetadata2 = this.$retriever.extractMetadata(19);
            c6299y2.element = strExtractMetadata2 != null ? kotlin.coroutines.jvm.internal.toq.m22765g(Integer.parseInt(strExtractMetadata2)) : 0;
            Integer num = this.$videoWidth.element;
            if (num == null || this.$videoHeight.element == null) {
                return null;
            }
            d2ok.qrj(num);
            if (num.intValue() <= 0) {
                return null;
            }
            Integer num2 = this.$videoHeight.element;
            d2ok.qrj(num2);
            if (num2.intValue() > 0 && Build.VERSION.SDK_INT >= 28) {
                return this.$retriever.getFrameAtIndex(0);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: LockScreenTipController.kt */
    public static final class toq implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Uri f15223g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6299y<Surface> f15224k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Context f15225n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ i1.C6299y<MediaPlayer> f15226q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TextureView f15227y;

        /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.f7l8$toq$k */
        /* JADX INFO: compiled from: LockScreenTipController.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.LockScreenTipController$bindMediaPlayer$1$onSurfaceTextureAvailable$1", m22756f = "LockScreenTipController.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class C2556k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ Uri $lockTipVideoUri;
            final /* synthetic */ i1.C6299y<MediaPlayer> $mediaPlayer;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2556k(i1.C6299y<MediaPlayer> c6299y, Context context, Uri uri, InterfaceC6216q<? super C2556k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$mediaPlayer = c6299y;
                this.$context = context;
                this.$lockTipVideoUri = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new C2556k(this.$mediaPlayer, this.$context, this.$lockTipVideoUri, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((C2556k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                try {
                    MediaPlayer mediaPlayer = this.$mediaPlayer.element;
                    if (mediaPlayer != null) {
                        mediaPlayer.setDataSource(this.$context, this.$lockTipVideoUri);
                    }
                    MediaPlayer mediaPlayer2 = this.$mediaPlayer.element;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.prepare();
                    }
                    MediaPlayer mediaPlayer3 = this.$mediaPlayer.element;
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.start();
                    }
                } catch (Exception e2) {
                    Log.e(f7l8.f60807zy, "bindMediaPlayer", e2);
                }
                return was.f36763k;
            }
        }

        toq(i1.C6299y<Surface> c6299y, i1.C6299y<MediaPlayer> c6299y2, Context context, Uri uri, TextureView textureView) {
            this.f15224k = c6299y;
            this.f15226q = c6299y2;
            this.f15225n = context;
            this.f15223g = uri;
            this.f15227y = textureView;
        }

        /* JADX WARN: Type inference failed for: r9v1, types: [T, android.view.Surface] */
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@InterfaceC7396q SurfaceTexture surfaceTexture, int i2, int i3) {
            d2ok.m23075h(surfaceTexture, "surfaceTexture");
            this.f15224k.element = new Surface(surfaceTexture);
            MediaPlayer mediaPlayer = this.f15226q.element;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(this.f15224k.element);
            }
            Object obj = this.f15225n;
            d2ok.n7h(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            kotlinx.coroutines.x2.m24649g(androidx.lifecycle.o1t.m4467k((InterfaceC0954z) obj), C6481a.zy(), null, new C2556k(this.f15226q, this.f15225n, this.f15223g, null), 2, null);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@InterfaceC7396q SurfaceTexture p0) {
            MediaPlayer mediaPlayer;
            d2ok.m23075h(p0, "p0");
            this.f15224k.element = null;
            this.f15227y.setSurfaceTextureListener(null);
            try {
                MediaPlayer mediaPlayer2 = this.f15226q.element;
                boolean z2 = false;
                if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
                    z2 = true;
                }
                if (z2 && (mediaPlayer = this.f15226q.element) != null) {
                    mediaPlayer.stop();
                }
                MediaPlayer mediaPlayer3 = this.f15226q.element;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.release();
                }
                this.f15226q.element = null;
            } catch (Exception e2) {
                Log.e(f7l8.f60807zy, "onSurfaceTextureDestroyed", e2);
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@InterfaceC7396q SurfaceTexture p0, int i2, int i3) {
            d2ok.m23075h(p0, "p0");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@InterfaceC7396q SurfaceTexture p0) {
            d2ok.m23075h(p0, "p0");
        }
    }

    /* JADX INFO: compiled from: LockScreenTipController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.LockScreenTipController", m22756f = "LockScreenTipController.kt", m22757i = {0, 0, 0, 0, 0}, m22758l = {152}, m22759m = "createDialog", m22760n = {"this", "context", "videoUri", "videoWidth", "videoHeight"}, m22761s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class zy extends AbstractC6209q {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        zy(InterfaceC6216q<? super zy> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return f7l8.this.f7l8(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cdj(android.content.Context r6, kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.android.thememanager.settings.personalize.f7l8.C2552g
            if (r0 == 0) goto L13
            r0 = r7
            com.android.thememanager.settings.personalize.f7l8$g r0 = (com.android.thememanager.settings.personalize.f7l8.C2552g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.android.thememanager.settings.personalize.f7l8$g r0 = new com.android.thememanager.settings.personalize.f7l8$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C6318m.n7h(r7)
            goto L65
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.C6318m.n7h(r7)
            int r7 = mbx.C6812k.toq()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "android.resource://"
            r2.append(r4)
            java.lang.String r4 = r6.getPackageName()
            r2.append(r4)
            r4 = 47
            r2.append(r4)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.net.Uri r7 = android.net.Uri.parse(r7)
            kotlin.jvm.internal.d2ok.qrj(r7)
            r0.label = r3
            java.lang.Object r6 = r5.f7l8(r6, r7, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            com.android.thememanager.basemodule.utils.r r6 = com.android.thememanager.basemodule.utils.C1824r.m7203y()
            r7 = 0
            java.lang.String r0 = "needDialogTip"
            com.android.thememanager.basemodule.utils.r r6 = r6.m7206p(r0, r7)
            r6.m7204k()
            kotlin.was r6 = kotlin.was.f36763k
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.f7l8.cdj(android.content.Context, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f7l8(android.content.Context r12, android.net.Uri r13, kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.f7l8.f7l8(android.content.Context, android.net.Uri, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.media.MediaPlayer] */
    /* JADX INFO: renamed from: g */
    private final void m9049g(Context context, Uri uri, TextureView textureView) {
        i1.C6299y c6299y = new i1.C6299y();
        i1.C6299y c6299y2 = new i1.C6299y();
        ?? mediaPlayer = new MediaPlayer();
        c6299y2.element = mediaPlayer;
        mediaPlayer.setLooping(true);
        textureView.setSurfaceTextureListener(new toq(c6299y, c6299y2, context, uri, textureView));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private final void m9050h(Context context) {
        d2ok.n7h(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        kotlinx.coroutines.x2.m24649g(androidx.lifecycle.o1t.m4467k((InterfaceC0954z) context), C6481a.zy(), null, new C2554n(context, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean kja0(View lockScreenCardView, Context context, View view, MotionEvent motionEvent) {
        d2ok.m23075h(lockScreenCardView, "$lockScreenCardView");
        d2ok.m23075h(context, "$context");
        boolean z2 = false;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int[] iArr = new int[2];
        lockScreenCardView.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        if (rawX <= lockScreenCardView.getWidth() + i2 && i2 <= rawX) {
            int i3 = iArr[1];
            if (rawY <= lockScreenCardView.getHeight() + i3 && i3 <= rawY) {
                z2 = true;
            }
            if (z2 && o1t.m7171i()) {
                C2451n.m8800p((ActivityC0891q) context);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ld6(Context context) {
        return Settings.System.getInt(context.getContentResolver(), f15218g, 0) == 1;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void n7h(final Context context, final View view) {
        miuix.popupwidget.widget.f7l8 f7l8Var = new miuix.popupwidget.widget.f7l8(context);
        if (!y9n.a9() || C1807g.wvg()) {
            f7l8Var.qrj(10);
        } else {
            f7l8Var.qrj(8);
        }
        f7l8Var.fti(R.string.lock_screen_keyguard_guide_popup);
        f7l8Var.setTouchInterceptor(new View.OnTouchListener() { // from class: com.android.thememanager.settings.personalize.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return f7l8.kja0(view, context, view2, motionEvent);
            }
        });
        f7l8Var.eqxt(view, 0, 0, false);
        C1824r.m7203y().m7206p(f15219n, true).m7204k();
    }

    /* JADX INFO: renamed from: p */
    private final boolean m9053p() {
        return C1824r.m7203y().zy(f15219n, false);
    }

    @l05.qrj
    public static final void x2() {
        f60806toq.m9057k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m9055y(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    public final void qrj() {
        ki kiVar = this.f15222k;
        if (kiVar != null) {
            kiVar.dismiss();
        }
        this.f15222k = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m9056s(@InterfaceC7396q Context context, @InterfaceC7396q View lockScreenCardView) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(lockScreenCardView, "lockScreenCardView");
        m9050h(context);
        if (o1t.C1820k.m7182q() != o1t.C1820k.f57804qrj || m9053p()) {
            return;
        }
        n7h(context, lockScreenCardView);
    }
}
