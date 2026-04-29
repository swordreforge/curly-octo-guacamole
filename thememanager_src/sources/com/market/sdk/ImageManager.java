package com.market.sdk;

import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.market.sdk.IImageCallback;
import com.market.sdk.utils.C5007g;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ImageManager {

    /* JADX INFO: renamed from: k */
    private static ConcurrentHashMap<String, Uri> f27957k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Map<String, HashSet<ki>> f68822toq = C5007g.m17430s();

    private static class ImageLoadResponse extends IImageCallback.Stub {
        private String mKey;

        public ImageLoadResponse(String str) {
            this.mKey = str;
        }

        @Override // com.market.sdk.IImageCallback
        public void onImageLoadFailed(String str) {
            synchronized (ImageManager.f68822toq) {
                Set set = (Set) ImageManager.f68822toq.remove(this.mKey);
                if (!C5007g.zy(set)) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((ki) it.next()).onImageLoadFailed(str);
                    }
                }
            }
        }

        @Override // com.market.sdk.IImageCallback
        public void onImageLoadSuccess(String str, Uri uri) {
            ImageManager.f27957k.put(this.mKey, uri);
            synchronized (ImageManager.f68822toq) {
                Set set = (Set) ImageManager.f68822toq.remove(this.mKey);
                if (!C5007g.zy(set)) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((ki) it.next()).onImageLoadSuccess(str, uri);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.ImageManager$k */
    private static class C4949k {

        /* JADX INFO: renamed from: k */
        private String f27958k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f68823toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private IImageCallback f68824zy;

        /* JADX INFO: renamed from: com.market.sdk.ImageManager$k$k */
        class k extends ni7<Void> {
            k() {
            }

            @Override // com.market.sdk.ni7
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public Void mo17245g(IMarketService iMarketService) throws RemoteException {
                iMarketService.loadIcon(C4949k.this.f27958k, C4949k.this.f68823toq, C4949k.this.f68824zy);
                return null;
            }
        }

        public C4949k(String str, String str2, ki kiVar) {
            this.f27958k = str;
            this.f68823toq = str2;
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            this.f68824zy = new ImageLoadResponse(str);
        }

        /* JADX INFO: renamed from: q */
        public void m17267q() {
            new k().m17337s();
        }
    }

    private static class toq {

        /* JADX INFO: renamed from: k */
        private String f27960k;

        /* JADX INFO: renamed from: q */
        private int f27961q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private IImageCallback f68825toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f68826zy;

        /* JADX INFO: renamed from: com.market.sdk.ImageManager$toq$k */
        class C4950k extends ni7<Void> {
            C4950k() {
            }

            @Override // com.market.sdk.ni7
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public Void mo17245g(IMarketService iMarketService) throws RemoteException {
                iMarketService.loadImage(toq.this.f27960k, toq.this.f68826zy, toq.this.f27961q, toq.this.f68825toq);
                return null;
            }
        }

        public toq(String str, int i2, int i3, ki kiVar) {
            this.f27960k = str;
            this.f68825toq = new ImageLoadResponse(this.f27960k);
            this.f68826zy = i2;
            this.f27961q = i3;
        }

        /* JADX INFO: renamed from: n */
        public void m17270n() {
            new C4950k().m17337s();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m17265q(String str, int i2, int i3, ki kiVar) {
        Uri uri = f27957k.get(str);
        if (uri != null && new File(uri.getPath()).exists()) {
            kiVar.onImageLoadSuccess(str, uri);
            return;
        }
        synchronized (f68822toq) {
            HashSet<ki> hashSetM17428p = f68822toq.get(str);
            boolean z2 = !f68822toq.containsKey(str);
            if (hashSetM17428p == null) {
                hashSetM17428p = C5007g.m17428p();
                f68822toq.put(str, hashSetM17428p);
            }
            hashSetM17428p.add(kiVar);
            if (z2) {
                new toq(str, i2, i3, kiVar).m17270n();
            }
        }
    }

    public static void zy(String str, String str2, ki kiVar) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = str;
        } else {
            str3 = str + "_" + str2;
        }
        Uri uri = f27957k.get(str3);
        if (uri != null && new File(uri.getPath()).exists()) {
            kiVar.onImageLoadSuccess(str, uri);
            return;
        }
        synchronized (f68822toq) {
            HashSet<ki> hashSetM17428p = f68822toq.get(str3);
            boolean z2 = !f68822toq.containsKey(str3);
            if (hashSetM17428p == null) {
                hashSetM17428p = C5007g.m17428p();
                f68822toq.put(str3, hashSetM17428p);
            }
            hashSetM17428p.add(kiVar);
            if (z2) {
                new C4949k(str, str2, kiVar).m17267q();
            }
        }
    }
}
