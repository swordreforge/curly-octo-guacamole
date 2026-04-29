package com.android.thememanager;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.activity.AbstractViewOnClickListenerC1611m;
import com.android.thememanager.activity.VideoSizeConfirm;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.C1822q;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.detail.video.model.RemoteVideoResource;
import com.android.thememanager.detail.video.model.VideoResource;
import com.android.thememanager.detail.video.model.VideoWallpaperUtils;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.detail.entity.VideoInfoUtils;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.uc;
import cyoe.InterfaceC5979h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import miuix.appcompat.app.ki;
import miuix.graphics.C7111k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import vy.C7718q;

/* JADX INFO: renamed from: com.android.thememanager.g */
/* JADX INFO: compiled from: BaseEditFunctionController.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2044g {

    /* JADX INFO: renamed from: com.android.thememanager.g$f7l8 */
    /* JADX INFO: compiled from: BaseEditFunctionController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.BaseEditFunctionController$handleWallpaperMiuiTabActivityEvent$1", m22756f = "BaseEditFunctionController.kt", m22757i = {0}, m22758l = {131}, m22759m = "invokeSuspend", m22760n = {"loadingDialog"}, m22761s = {"L$0"})
    static final class f7l8 extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Intent $data;
        Object L$0;
        int label;
        final /* synthetic */ AbstractC2044g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f7l8(Activity activity, AbstractC2044g abstractC2044g, Intent intent, InterfaceC6216q<? super f7l8> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$activity = activity;
            this.this$0 = abstractC2044g;
            this.$data = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new f7l8(this.$activity, this.this$0, this.$data, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((f7l8) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            miuix.appcompat.app.dd ddVar;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            boolean z2 = false;
            if (i2 == 0) {
                C6318m.n7h(obj);
                miuix.appcompat.app.dd ddVar2 = new miuix.appcompat.app.dd(this.$activity);
                this.this$0.fti(ddVar2, this.$activity, false);
                AbstractC2044g abstractC2044g = this.this$0;
                Intent intent = this.$data;
                this.L$0 = ddVar2;
                this.label = 1;
                Object objNi7 = abstractC2044g.ni7(intent, this);
                if (objNi7 == objX2) {
                    return objX2;
                }
                ddVar = ddVar2;
                obj = objNi7;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ddVar = (miuix.appcompat.app.dd) this.L$0;
                C6318m.n7h(obj);
            }
            String str = (String) obj;
            this.this$0.ki(ddVar);
            if (this.$data.getType() != null) {
                String type = this.$data.getType();
                kotlin.jvm.internal.d2ok.qrj(type);
                if (kotlin.text.fti.lk(type, "video", false, 2, null)) {
                    z2 = true;
                }
            }
            if (str != null) {
                this.this$0.m7899h(this.$activity, str, z2, null);
            } else {
                Log.d("BaseEditFunctionController", "WallpaperMiuiTabActivity case path is null. ");
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.g$g */
    /* JADX INFO: compiled from: BaseEditFunctionController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.BaseEditFunctionController$handleDownLoadEvent$1", m22756f = "BaseEditFunctionController.kt", m22757i = {}, m22758l = {291, 296}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class g extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ boolean $isVideo;
        final /* synthetic */ Resource $mResource;
        int label;
        final /* synthetic */ AbstractC2044g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z2, Resource resource, AbstractC2044g abstractC2044g, Activity activity, InterfaceC6216q<? super g> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$isVideo = z2;
            this.$mResource = resource;
            this.this$0 = abstractC2044g;
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new g(this.$isVideo, this.$mResource, this.this$0, this.$activity, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((g) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            String downloadFilePath;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                if (this.$isVideo) {
                    VideoInfo videoInfoFromResource = VideoInfoUtils.fromResource(this.$mResource);
                    RemoteVideoResource remoteVideoResource = new RemoteVideoResource(videoInfoFromResource.path, videoInfoFromResource.previewPath, videoInfoFromResource.name, videoInfoFromResource.onlineId, videoInfoFromResource.sizeBytes, com.android.thememanager.basemodule.utils.hyr.zy(",", videoInfoFromResource.innerTags));
                    if (videoInfoFromResource.onlineId == null) {
                        downloadFilePath = C1788k.f10167c + C1821p.ld6(videoInfoFromResource.path);
                    } else {
                        downloadFilePath = remoteVideoResource.getDownloadFilePath();
                    }
                    String str = downloadFilePath;
                    AbstractC2044g abstractC2044g = this.this$0;
                    Activity activity = this.$activity;
                    Resource resource = this.$mResource;
                    kotlin.jvm.internal.d2ok.qrj(str);
                    this.label = 1;
                    if (abstractC2044g.t8r(activity, resource, true, str, remoteVideoResource, this) == objX2) {
                        return objX2;
                    }
                } else {
                    String strJk = uc.jk(C2082k.zy().m8001n().m10535g("wallpaper"), this.$mResource);
                    AbstractC2044g abstractC2044g2 = this.this$0;
                    Activity activity2 = this.$activity;
                    Resource resource2 = this.$mResource;
                    kotlin.jvm.internal.d2ok.qrj(strJk);
                    this.label = 2;
                    if (abstractC2044g2.t8r(activity2, resource2, false, strJk, null, this) == objX2) {
                        return objX2;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.g$k */
    /* JADX INFO: compiled from: BaseEditFunctionController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.BaseEditFunctionController$callBackAndFinish$1", m22756f = "BaseEditFunctionController.kt", m22757i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, m22758l = {com.google.android.exoplayer2.extractor.ts.wvg.f64656ni7, 191}, m22759m = "invokeSuspend", m22760n = {"loadingDialog", C7718q.f97043a9, "$this$invokeSuspend_u24lambda_u241", "resourceType", "loadingDialog", C7718q.f97043a9, "$this$invokeSuspend_u24lambda_u241", "finalResPath", "resourceType"}, m22761s = {"L$0", "L$1", "L$7", "L$8", "L$0", "L$1", "L$7", "L$8", "L$9"})
    static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ boolean $isVideo;
        final /* synthetic */ String $path;
        final /* synthetic */ Resource $resource;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        final /* synthetic */ AbstractC2044g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Activity activity, AbstractC2044g abstractC2044g, boolean z2, Resource resource, String str, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$activity = activity;
            this.this$0 = abstractC2044g;
            this.$isVideo = z2;
            this.$resource = resource;
            this.$path = str;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new k(this.$activity, this.this$0, this.$isVideo, this.$resource, this.$path, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0148 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01c9  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 470
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.AbstractC2044g.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.g$n */
    /* JADX INFO: compiled from: BaseEditFunctionController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.BaseEditFunctionController$getGalleryResource$2", m22756f = "BaseEditFunctionController.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class n extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super String>, Object> {
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Intent intent, InterfaceC6216q<? super n> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$intent = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new n(this.$intent, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super String> interfaceC6216q) {
            return ((n) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            Uri data = this.$intent.getData();
            InputStream inputStreamOpenInputStream = null;
            if (data == null) {
                return null;
            }
            String str = C2687z.m9384y() + C1822q.zy(data.toString());
            String str2 = str + ".temp";
            try {
                inputStreamOpenInputStream = bf2.toq.toq().getContentResolver().openInputStream(data);
            } catch (FileNotFoundException e2) {
                Log.e("BaseEditFunctionController", "openInputStream() error:" + e2);
            }
            ch.t8iq(inputStreamOpenInputStream, str2);
            new File(str2).renameTo(new File(str));
            return str;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.g$p */
    /* JADX INFO: compiled from: BaseEditFunctionController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.BaseEditFunctionController$startDownloadRes$downloadSuccess$2", m22756f = "BaseEditFunctionController.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class p extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Boolean>, Object> {
        final /* synthetic */ String $localPath;
        final /* synthetic */ Resource $mResource;
        int label;
        final /* synthetic */ AbstractC2044g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Resource resource, String str, AbstractC2044g abstractC2044g, InterfaceC6216q<? super p> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$mResource = resource;
            this.$localPath = str;
            this.this$0 = abstractC2044g;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new p(this.$mResource, this.$localPath, this.this$0, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
            return ((p) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            Resource resource = this.$mResource;
            return kotlin.coroutines.jvm.internal.toq.m22766k(com.android.thememanager.util.jp0y.m9838k(resource, this.$localPath, this.this$0.fu4(resource), null, null));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.g$q */
    /* JADX INFO: compiled from: BaseEditFunctionController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.BaseEditFunctionController$getDarkenImagePath$2", m22756f = "BaseEditFunctionController.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class q extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super String>, Object> {
        final /* synthetic */ String $normalPath;
        int label;
        final /* synthetic */ AbstractC2044g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, AbstractC2044g abstractC2044g, InterfaceC6216q<? super q> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$normalPath = str;
            this.this$0 = abstractC2044g;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new q(this.$normalPath, this.this$0, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super String> interfaceC6216q) {
            return ((q) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
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
                Bitmap bitmapM9646h = C2763c.m9646h(this.$normalPath, C2763c.cdj());
                Bitmap bitmapM10069g = null;
                if (bitmapM9646h != null) {
                    bitmapM10069g = com.android.thememanager.util.x9kr.m10069g(bitmapM9646h, com.bumptech.glide.zy.m11283n(bf2.toq.toq()).m11289y(), com.android.thememanager.basemodule.utils.o1t.m7171i(), true);
                }
                if (bitmapM10069g != null) {
                    if (!kotlin.jvm.internal.d2ok.f7l8(bitmapM10069g, bitmapM9646h)) {
                        kotlin.jvm.internal.d2ok.qrj(bitmapM9646h);
                        bitmapM9646h.recycle();
                    }
                    bitmapM9646h = bitmapM10069g;
                }
                String strZurt = this.this$0.zurt(this.$normalPath);
                C7111k.dd(bitmapM9646h, strZurt);
                return strZurt;
            } catch (Exception e2) {
                Log.e("BaseEditFunctionController", "getDarkenImagePath: " + e2.getMessage());
                return this.$normalPath;
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.g$s */
    /* JADX INFO: compiled from: BaseEditFunctionController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.BaseEditFunctionController$startDownloadRes$downloadSuccess$1", m22756f = "BaseEditFunctionController.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class s extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Boolean>, Object> {
        final /* synthetic */ String $localPath;
        final /* synthetic */ VideoResource $videoResource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(VideoResource videoResource, String str, InterfaceC6216q<? super s> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$videoResource = videoResource;
            this.$localPath = str;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new s(this.$videoResource, this.$localPath, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
            return ((s) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            VideoResource videoResource = this.$videoResource;
            return kotlin.coroutines.jvm.internal.toq.m22766k(VideoWallpaperUtils.downLoadVideoWallpaper(videoResource != null ? videoResource.getDownloadUrl() : null, this.$localPath));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.g$toq */
    /* JADX INFO: compiled from: BaseEditFunctionController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.BaseEditFunctionController$checkVideoValid$2", m22756f = "BaseEditFunctionController.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Boolean>, Object> {
        final /* synthetic */ String $resType;
        final /* synthetic */ String $videoPath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(String str, String str2, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$resType = str;
            this.$videoPath = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new toq(this.$resType, this.$videoPath, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
            return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            if (kotlin.jvm.internal.d2ok.f7l8(this.$resType, "video")) {
                try {
                    if (this.$videoPath != null) {
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(this.$videoPath);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(0);
                        kotlin.jvm.internal.d2ok.kja0(trackFormat, "getTrackFormat(...)");
                        if (VideoWallpaperUtils.isDolbyVisionVideo(trackFormat.getString("mime"))) {
                            Log.i("BaseEditFunctionController", "checkVideoValid: is dolby video");
                            return kotlin.coroutines.jvm.internal.toq.m22766k(false);
                        }
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(this.$videoPath);
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                        int i2 = strExtractMetadata != null ? Integer.parseInt(strExtractMetadata) : -1;
                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                        int i3 = strExtractMetadata2 != null ? Integer.parseInt(strExtractMetadata2) : -1;
                        if (i2 <= 0 || i3 <= 0 || VideoSizeConfirm.zy(i2, i3)) {
                            Log.i("BaseEditFunctionController", "checkVideoValid: is 4k/8k video width=" + i2 + " height=" + i3);
                            return kotlin.coroutines.jvm.internal.toq.m22766k(false);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("BaseEditFunctionController", "checkVideoValid: occur exception", e2);
                    return kotlin.coroutines.jvm.internal.toq.m22766k(false);
                }
            }
            return kotlin.coroutines.jvm.internal.toq.m22766k(true);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.g$y */
    /* JADX INFO: compiled from: BaseEditFunctionController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.BaseEditFunctionController", m22756f = "BaseEditFunctionController.kt", m22757i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m22758l = {364, 370}, m22759m = "startDownloadRes", m22760n = {"this", C1873k.f10652g, PathEntry.LOCAL_PATH, "mResource", "loadingDialog", "isVideo", "this", C1873k.f10652g, PathEntry.LOCAL_PATH, "mResource", "loadingDialog", "isVideo"}, m22761s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
    static final class y extends AbstractC6209q {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        y(InterfaceC6216q<? super y> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AbstractC2044g.this.gvn7(null, false, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.g$zy */
    /* JADX INFO: compiled from: BaseEditFunctionController.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.BaseEditFunctionController$downLoadResource$2$1", m22756f = "BaseEditFunctionController.kt", m22757i = {}, m22758l = {324}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ boolean $isVideo;
        final /* synthetic */ String $localPath;
        final /* synthetic */ Resource $mResource;
        final /* synthetic */ VideoResource $videoResource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(Activity activity, boolean z2, VideoResource videoResource, String str, Resource resource, InterfaceC6216q<? super zy> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$activity = activity;
            this.$isVideo = z2;
            this.$videoResource = videoResource;
            this.$localPath = str;
            this.$mResource = resource;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return AbstractC2044g.this.new zy(this.$activity, this.$isVideo, this.$videoResource, this.$localPath, this.$mResource, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((zy) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                AbstractC2044g abstractC2044g = AbstractC2044g.this;
                Activity activity = this.$activity;
                boolean z2 = this.$isVideo;
                VideoResource videoResource = this.$videoResource;
                String str = this.$localPath;
                Resource resource = this.$mResource;
                this.label = 1;
                if (abstractC2044g.gvn7(activity, z2, videoResource, str, resource, this) == objX2) {
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

    private final void a9(Activity activity) {
        new ki.C6947k(activity, 2131951635).lrht(R.string.application_notify_title).fu4(R.string.download_failed).dd(R.string.i_know, null).hb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object cdj(String str, String str2, InterfaceC6216q<? super Boolean> interfaceC6216q) {
        return C6708p.m24523y(C6481a.zy(), new toq(str, str2, null), interfaceC6216q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fn3e(String str, InterfaceC6216q<? super String> interfaceC6216q) {
        return C6708p.m24523y(ek5k.f7l8.m22238k(), new q(str, this, null), interfaceC6216q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fti(miuix.appcompat.app.dd ddVar, Activity activity, boolean z2) {
        ddVar.y2(0);
        ddVar.n5r1(activity.getString(z2 ? R.string.resource_downloading : R.string.refresh_footer_loading));
        ddVar.setCancelable(false);
        ddVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String fu4(Resource resource) {
        fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g("wallpaper");
        String strIp = AbstractViewOnClickListenerC1611m.ip(fu4VarM10535g, resource);
        if (strIp == null) {
            return strIp;
        }
        kotlin.text.ki kiVar = new kotlin.text.ki("w\\d+");
        StringBuilder sb = new StringBuilder();
        sb.append('w');
        sb.append(fu4VarM10535g.getPreviewImageWidth());
        return kiVar.replaceFirst(strIp, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gvn7(android.app.Activity r8, boolean r9, com.android.thememanager.detail.video.model.VideoResource r10, java.lang.String r11, com.android.thememanager.basemodule.resource.model.Resource r12, kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.AbstractC2044g.gvn7(android.app.Activity, boolean, com.android.thememanager.detail.video.model.VideoResource, java.lang.String, com.android.thememanager.basemodule.resource.model.Resource, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m7899h(Activity activity, String str, boolean z2, Resource resource) {
        kotlin.jvm.internal.d2ok.n7h(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        kotlinx.coroutines.x2.m24649g(androidx.lifecycle.o1t.m4467k((InterfaceC0954z) activity), null, null, new k(activity, this, z2, resource, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final void m7900i(Activity activity, AbstractC2044g this$0, boolean z2, VideoResource videoResource, String localPath, Resource mResource, boolean z3) {
        kotlin.jvm.internal.d2ok.m23075h(activity, "$activity");
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        kotlin.jvm.internal.d2ok.m23075h(localPath, "$localPath");
        kotlin.jvm.internal.d2ok.m23075h(mResource, "$mResource");
        if (z3) {
            kotlinx.coroutines.x2.m24649g(androidx.lifecycle.o1t.m4467k((InterfaceC0954z) activity), null, null, this$0.new zy(activity, z2, videoResource, localPath, mResource, null), 3, null);
        } else {
            this$0.jp0y(activity);
        }
    }

    private final boolean jk(String str) {
        return kotlin.text.a9.r6ty(str, "/system/media/wallpaper", false, 2, null);
    }

    private final void jp0y(Activity activity) {
        new ki.C6947k(activity, 2131951635).lrht(R.string.application_notify_title).fu4(R.string.card_no_network).dd(R.string.i_know, null).hb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ki(miuix.appcompat.app.dd ddVar) {
        ddVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ni7(Intent intent, InterfaceC6216q<? super String> interfaceC6216q) {
        return C6708p.m24523y(ek5k.f7l8.m22238k(), new n(intent, null), interfaceC6216q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t8r(final Activity activity, final Resource resource, final boolean z2, final String str, final VideoResource videoResource, InterfaceC6216q<? super was> interfaceC6216q) throws Throwable {
        if ((!z2 || videoResource == null || videoResource.isDownloaded()) && ((z2 || new File(str).exists()) && (z2 || BitmapFactory.decodeFile(str) != null))) {
            m7899h(activity, str, z2, resource);
        } else {
            if (com.android.thememanager.basemodule.utils.mcp.m7138k() && com.android.thememanager.basemodule.utils.mcp.m7139n()) {
                Object objGvn7 = gvn7(activity, z2, videoResource, str, resource, interfaceC6216q);
                return objGvn7 == C6199q.x2() ? objGvn7 : was.f36763k;
            }
            if (C1781k.toq(bf2.toq.toq()) || !(activity instanceof AbstractActivityC1717k)) {
                jp0y(activity);
            } else {
                ((AbstractActivityC1717k) activity).m6715x().m6911q(activity, null, new C1781k.f7l8() { // from class: com.android.thememanager.n
                    @Override // com.android.thememanager.basemodule.privacy.C1781k.f7l8
                    public final void y9n(boolean z3) {
                        AbstractC2044g.m7900i(activity, this, z2, videoResource, str, resource, z3);
                    }
                }, true);
            }
        }
        return was.f36763k;
    }

    /* JADX INFO: renamed from: z */
    private final void m7905z(Activity activity, Resource resource, boolean z2) {
        kotlin.jvm.internal.d2ok.n7h(activity, "null cannot be cast to non-null type com.android.thememanager.basemodule.base.AbstractBaseActivity");
        kotlinx.coroutines.x2.m24649g(androidx.lifecycle.o1t.m4467k((AbstractActivityC1717k) activity), null, null, new g(z2, resource, this, activity, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zurt(String str) {
        C1821p.ki(com.android.thememanager.f7l8.m7895k());
        File file = new File(com.android.thememanager.f7l8.m7895k() + '/');
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(com.android.thememanager.f7l8.m7895k());
        sb.append('/');
        String strSubstring = str.substring(kotlin.text.fti.x7o(str, '/', 0, false, 6, null) + 1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public final void mcp(@InterfaceC7396q Intent data, @InterfaceC7396q Activity activity) {
        kotlin.jvm.internal.d2ok.m23075h(data, "data");
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        kotlinx.coroutines.x2.m24649g(androidx.lifecycle.o1t.m4467k((AbstractActivityC1717k) activity), null, null, new f7l8(activity, this, data, null), 3, null);
    }

    public final void o1t(@InterfaceC7396q Resource resource, boolean z2, @InterfaceC7396q Activity activity) {
        kotlin.jvm.internal.d2ok.m23075h(resource, "resource");
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        if (z2) {
            m7905z(activity, resource, true);
            return;
        }
        String contentPath = resource.getContentPath();
        if (contentPath != null) {
            m7899h(activity, contentPath, false, resource);
        } else {
            Log.d("BaseEditFunctionController", "OneImageViewHolder case path is null. ");
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m7906t(@InterfaceC7396q Resource resource, boolean z2, @InterfaceC7396q Activity activity) {
        String contentPath;
        kotlin.jvm.internal.d2ok.m23075h(resource, "resource");
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        if (!activity.getIntent().getBooleanExtra("moreData", false)) {
            contentPath = resource.getContentPath();
            if (contentPath == null || !new File(contentPath).exists()) {
                m7905z(activity, resource, false);
                contentPath = null;
            }
        } else if (z2) {
            m7905z(activity, resource, true);
            contentPath = null;
        } else {
            contentPath = resource.getContentPath();
        }
        if (contentPath != null) {
            m7899h(activity, contentPath, z2, resource);
        } else {
            Log.d("BaseEditFunctionController", "WallpaperListBatchHandler case path is null. ");
        }
    }

    public final void wvg(@InterfaceC7396q SuperWallpaperSummaryData mData, @InterfaceC7396q Activity activity) {
        kotlin.jvm.internal.d2ok.m23075h(mData, "mData");
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        Intent intent = new Intent();
        intent.putExtra("resourcePath", mData.f15607s);
        intent.putExtra("resourceType", "super_wallpaper");
        activity.setResult(114, intent);
        activity.finish();
    }
}
