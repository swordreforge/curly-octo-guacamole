package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C0247k;
import androidx.core.app.C0432h;
import androidx.core.util.C0639p;
import androidx.media.C0985y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.media.g */
/* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC0970g extends Service {

    /* JADX INFO: renamed from: c */
    static final int f5222c = 2;

    /* JADX INFO: renamed from: e */
    static final int f5223e = 4;

    /* JADX INFO: renamed from: f */
    static final int f5224f = 1;

    /* JADX INFO: renamed from: h */
    static final String f5225h = "MBServiceCompat";

    /* JADX INFO: renamed from: i */
    static final boolean f5226i = Log.isLoggable(f5225h, 3);

    /* JADX INFO: renamed from: j */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static final int f5227j = -1;

    /* JADX INFO: renamed from: l */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static final String f5228l = "search_results";

    /* JADX INFO: renamed from: m */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static final int f5229m = 1;

    /* JADX INFO: renamed from: o */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static final int f5230o = 0;

    /* JADX INFO: renamed from: r */
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static final String f5231r = "media_item";

    /* JADX INFO: renamed from: t */
    public static final String f5232t = "android.media.browse.MediaBrowserService";

    /* JADX INFO: renamed from: z */
    private static final float f5233z = 1.0E-5f;

    /* JADX INFO: renamed from: k */
    private f7l8 f5235k;

    /* JADX INFO: renamed from: p */
    MediaSessionCompat.Token f5237p;

    /* JADX INFO: renamed from: y */
    g f5240y;

    /* JADX INFO: renamed from: q */
    final g f5238q = new g(C0985y.toq.f51759toq, -1, -1, null, null);

    /* JADX INFO: renamed from: n */
    final ArrayList<g> f5236n = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    final C0247k<IBinder, g> f5234g = new C0247k<>();

    /* JADX INFO: renamed from: s */
    final ki f5239s = new ki();

    /* JADX INFO: renamed from: androidx.media.g$cdj */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    private static class cdj implements h {

        /* JADX INFO: renamed from: k */
        final Messenger f5241k;

        cdj(Messenger callbacks) {
            this.f5241k = callbacks;
        }

        /* JADX INFO: renamed from: q */
        private void m4579q(int what, Bundle data) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = what;
            messageObtain.arg1 = 2;
            messageObtain.setData(data);
            this.f5241k.send(messageObtain);
        }

        @Override // androidx.media.AbstractServiceC0970g.h
        public IBinder asBinder() {
            return this.f5241k.getBinder();
        }

        @Override // androidx.media.AbstractServiceC0970g.h
        /* JADX INFO: renamed from: k */
        public void mo4580k(String mediaId, List<MediaBrowserCompat.MediaItem> list, Bundle options, Bundle notifyChildrenChangedOptions) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C0973n.f5356q, mediaId);
            bundle.putBundle(C0973n.f51710f7l8, options);
            bundle.putBundle(C0973n.f5359y, notifyChildrenChangedOptions);
            if (list != null) {
                bundle.putParcelableArrayList(C0973n.f5354n, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            m4579q(3, bundle);
        }

        @Override // androidx.media.AbstractServiceC0970g.h
        public void toq() throws RemoteException {
            m4579q(2, null);
        }

        @Override // androidx.media.AbstractServiceC0970g.h
        public void zy(String root, MediaSessionCompat.Token session, Bundle extras) throws RemoteException {
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putInt(C0973n.f51717ki, 2);
            Bundle bundle = new Bundle();
            bundle.putString(C0973n.f5356q, root);
            bundle.putParcelable(C0973n.f5350g, session);
            bundle.putBundle(C0973n.f51719ld6, extras);
            m4579q(1, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$f7l8 */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    interface f7l8 {
        IBinder f7l8(Intent intent);

        /* JADX INFO: renamed from: g */
        void mo4581g(C0985y.toq remoteUserInfo, String parentId, Bundle options);

        /* JADX INFO: renamed from: k */
        C0985y.toq mo4582k();

        /* JADX INFO: renamed from: n */
        Bundle mo4583n();

        /* JADX INFO: renamed from: q */
        void mo4584q(MediaSessionCompat.Token token);

        void toq();

        void zy(String parentId, Bundle options);
    }

    /* JADX INFO: renamed from: androidx.media.g$g */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    private class g implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final HashMap<String, List<C0639p<IBinder, Bundle>>> f51677f7l8 = new HashMap<>();

        /* JADX INFO: renamed from: g */
        public final h f5242g;

        /* JADX INFO: renamed from: k */
        public final String f5243k;

        /* JADX INFO: renamed from: n */
        public final Bundle f5244n;

        /* JADX INFO: renamed from: q */
        public final C0985y.toq f5245q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f51678toq;

        /* JADX INFO: renamed from: y */
        public n f5247y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f51679zy;

        /* JADX INFO: renamed from: androidx.media.g$g$k */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                AbstractServiceC0970g.this.f5234g.remove(gVar.f5242g.asBinder());
            }
        }

        g(String pkg, int pid, int uid, Bundle rootHints, h callback) {
            this.f5243k = pkg;
            this.f51678toq = pid;
            this.f51679zy = uid;
            this.f5245q = new C0985y.toq(pkg, pid, uid);
            this.f5244n = rootHints;
            this.f5242g = callback;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            AbstractServiceC0970g.this.f5239s.post(new k());
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$h */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    private interface h {
        IBinder asBinder();

        /* JADX INFO: renamed from: k */
        void mo4580k(String mediaId, List<MediaBrowserCompat.MediaItem> list, Bundle options, Bundle notifyChildrenChangedOptions) throws RemoteException;

        void toq() throws RemoteException;

        void zy(String root, MediaSessionCompat.Token session, Bundle extras) throws RemoteException;
    }

    /* JADX INFO: renamed from: androidx.media.g$k */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    class k extends qrj<List<MediaBrowserCompat.MediaItem>> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final /* synthetic */ String f51680f7l8;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ g f5249g;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ Bundle f5251s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Bundle f5252y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Object debug, final g val$connection, final String val$parentId, final Bundle val$subscribeOptions, final Bundle val$notifyChildrenChangedOptions) {
            super(debug);
            this.f5249g = val$connection;
            this.f51680f7l8 = val$parentId;
            this.f5252y = val$subscribeOptions;
            this.f5251s = val$notifyChildrenChangedOptions;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.AbstractServiceC0970g.qrj
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public void f7l8(@dd List<MediaBrowserCompat.MediaItem> list) {
            if (AbstractServiceC0970g.this.f5234g.get(this.f5249g.f5242g.asBinder()) != this.f5249g) {
                if (AbstractServiceC0970g.f5226i) {
                    Log.d(AbstractServiceC0970g.f5225h, "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f5249g.f5243k + " id=" + this.f51680f7l8);
                    return;
                }
                return;
            }
            if ((zy() & 1) != 0) {
                list = AbstractServiceC0970g.this.toq(list, this.f5252y);
            }
            try {
                this.f5249g.f5242g.mo4580k(this.f51680f7l8, list, this.f5252y, this.f5251s);
            } catch (RemoteException unused) {
                Log.w(AbstractServiceC0970g.f5225h, "Calling onLoadChildren() failed for id=" + this.f51680f7l8 + " package=" + this.f5249g.f5243k);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$ki */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    private final class ki extends Handler {

        /* JADX INFO: renamed from: k */
        private final kja0 f5253k;

        ki() {
            this.f5253k = AbstractServiceC0970g.this.new kja0();
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Bundle data = msg.getData();
            switch (msg.what) {
                case 1:
                    Bundle bundle = data.getBundle(C0973n.f51719ld6);
                    MediaSessionCompat.ensureClassLoader(bundle);
                    this.f5253k.toq(data.getString(C0973n.f5357s), data.getInt(C0973n.f51731zy), data.getInt(C0973n.f51727toq), bundle, new cdj(msg.replyTo));
                    break;
                case 2:
                    this.f5253k.zy(new cdj(msg.replyTo));
                    break;
                case 3:
                    Bundle bundle2 = data.getBundle(C0973n.f51710f7l8);
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    this.f5253k.m4587k(data.getString(C0973n.f5356q), C0432h.m1886k(data, C0973n.f5353k), bundle2, new cdj(msg.replyTo));
                    break;
                case 4:
                    this.f5253k.m4586g(data.getString(C0973n.f5356q), C0432h.m1886k(data, C0973n.f5353k), new cdj(msg.replyTo));
                    break;
                case 5:
                    this.f5253k.m4589q(data.getString(C0973n.f5356q), (ResultReceiver) data.getParcelable(C0973n.f5355p), new cdj(msg.replyTo));
                    break;
                case 6:
                    Bundle bundle3 = data.getBundle(C0973n.f51719ld6);
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    this.f5253k.m4588n(new cdj(msg.replyTo), data.getString(C0973n.f5357s), data.getInt(C0973n.f51731zy), data.getInt(C0973n.f51727toq), bundle3);
                    break;
                case 7:
                    this.f5253k.m4590s(new cdj(msg.replyTo));
                    break;
                case 8:
                    Bundle bundle4 = data.getBundle(C0973n.f51729x2);
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    this.f5253k.f7l8(data.getString(C0973n.f51725qrj), bundle4, (ResultReceiver) data.getParcelable(C0973n.f5355p), new cdj(msg.replyTo));
                    break;
                case 9:
                    Bundle bundle5 = data.getBundle(C0973n.f51718kja0);
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    this.f5253k.m4591y(data.getString(C0973n.f51721n7h), bundle5, (ResultReceiver) data.getParcelable(C0973n.f5355p), new cdj(msg.replyTo));
                    break;
                default:
                    Log.w(AbstractServiceC0970g.f5225h, "Unhandled message: " + msg + "\n  Service version: 2\n  Client version: " + msg.arg1);
                    break;
            }
        }

        /* JADX INFO: renamed from: k */
        public void m4585k(Runnable r2) {
            if (Thread.currentThread() == getLooper().getThread()) {
                r2.run();
            } else {
                post(r2);
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message msg, long uptimeMillis) {
            Bundle data = msg.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt(C0973n.f51727toq, Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt(C0973n.f51731zy, callingPid);
            } else if (!data.containsKey(C0973n.f51731zy)) {
                data.putInt(C0973n.f51731zy, -1);
            }
            return super.sendMessageAtTime(msg, uptimeMillis);
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$kja0 */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    private class kja0 {

        /* JADX INFO: renamed from: androidx.media.g$kja0$f7l8 */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class f7l8 implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ h f5255k;

            f7l8(final h val$callbacks) {
                this.f5255k = val$callbacks;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f5255k.asBinder();
                g gVarRemove = AbstractServiceC0970g.this.f5234g.remove(iBinderAsBinder);
                if (gVarRemove != null) {
                    iBinderAsBinder.unlinkToDeath(gVarRemove, 0);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$kja0$g */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class g implements Runnable {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ int f5257g;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ h f5258k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ String f5259n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ int f5260q;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Bundle f5262y;

            g(final h val$callbacks, final int val$uid, final String val$pkg, final int val$pid, final Bundle val$rootHints) {
                this.f5258k = val$callbacks;
                this.f5260q = val$uid;
                this.f5259n = val$pkg;
                this.f5257g = val$pid;
                this.f5262y = val$rootHints;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar;
                IBinder iBinderAsBinder = this.f5258k.asBinder();
                AbstractServiceC0970g.this.f5234g.remove(iBinderAsBinder);
                Iterator<g> it = AbstractServiceC0970g.this.f5236n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    g next = it.next();
                    if (next.f51679zy == this.f5260q) {
                        gVar = (TextUtils.isEmpty(this.f5259n) || this.f5257g <= 0) ? AbstractServiceC0970g.this.new g(next.f5243k, next.f51678toq, next.f51679zy, this.f5262y, this.f5258k) : null;
                        it.remove();
                    }
                }
                if (gVar == null) {
                    gVar = AbstractServiceC0970g.this.new g(this.f5259n, this.f5257g, this.f5260q, this.f5262y, this.f5258k);
                }
                AbstractServiceC0970g.this.f5234g.put(iBinderAsBinder, gVar);
                try {
                    iBinderAsBinder.linkToDeath(gVar, 0);
                } catch (RemoteException unused) {
                    Log.w(AbstractServiceC0970g.f5225h, "IBinder is already dead.");
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$kja0$k */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ int f5263g;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ h f5264k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ int f5265n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ String f5266q;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Bundle f5268y;

            k(final h val$callbacks, final String val$pkg, final int val$pid, final int val$uid, final Bundle val$rootHints) {
                this.f5264k = val$callbacks;
                this.f5266q = val$pkg;
                this.f5265n = val$pid;
                this.f5263g = val$uid;
                this.f5268y = val$rootHints;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f5264k.asBinder();
                AbstractServiceC0970g.this.f5234g.remove(iBinderAsBinder);
                g gVar = AbstractServiceC0970g.this.new g(this.f5266q, this.f5265n, this.f5263g, this.f5268y, this.f5264k);
                AbstractServiceC0970g abstractServiceC0970g = AbstractServiceC0970g.this;
                abstractServiceC0970g.f5240y = gVar;
                n nVarX2 = abstractServiceC0970g.x2(this.f5266q, this.f5263g, this.f5268y);
                gVar.f5247y = nVarX2;
                AbstractServiceC0970g abstractServiceC0970g2 = AbstractServiceC0970g.this;
                abstractServiceC0970g2.f5240y = null;
                if (nVarX2 != null) {
                    try {
                        abstractServiceC0970g2.f5234g.put(iBinderAsBinder, gVar);
                        iBinderAsBinder.linkToDeath(gVar, 0);
                        if (AbstractServiceC0970g.this.f5237p != null) {
                            this.f5264k.zy(gVar.f5247y.m4593q(), AbstractServiceC0970g.this.f5237p, gVar.f5247y.zy());
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                        Log.w(AbstractServiceC0970g.f5225h, "Calling onConnect() failed. Dropping client. pkg=" + this.f5266q);
                        AbstractServiceC0970g.this.f5234g.remove(iBinderAsBinder);
                        return;
                    }
                }
                Log.i(AbstractServiceC0970g.f5225h, "No root for client " + this.f5266q + " from service " + getClass().getName());
                try {
                    this.f5264k.toq();
                } catch (RemoteException unused2) {
                    Log.w(AbstractServiceC0970g.f5225h, "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f5266q);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$kja0$n */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class n implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ h f5270k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ ResultReceiver f5271n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ String f5272q;

            n(final h val$callbacks, final String val$mediaId, final ResultReceiver val$receiver) {
                this.f5270k = val$callbacks;
                this.f5272q = val$mediaId;
                this.f5271n = val$receiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = AbstractServiceC0970g.this.f5234g.get(this.f5270k.asBinder());
                if (gVar != null) {
                    AbstractServiceC0970g.this.fn3e(this.f5272q, gVar, this.f5271n);
                    return;
                }
                Log.w(AbstractServiceC0970g.f5225h, "getMediaItem for callback that isn't registered id=" + this.f5272q);
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$kja0$q */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class q implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ h f5274k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ IBinder f5275n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ String f5276q;

            q(final h val$callbacks, final String val$id, final IBinder val$token) {
                this.f5274k = val$callbacks;
                this.f5276q = val$id;
                this.f5275n = val$token;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = AbstractServiceC0970g.this.f5234g.get(this.f5274k.asBinder());
                if (gVar == null) {
                    Log.w(AbstractServiceC0970g.f5225h, "removeSubscription for callback that isn't registered id=" + this.f5276q);
                    return;
                }
                if (AbstractServiceC0970g.this.ni7(this.f5276q, gVar, this.f5275n)) {
                    return;
                }
                Log.w(AbstractServiceC0970g.f5225h, "removeSubscription called for " + this.f5276q + " which is not subscribed");
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$kja0$s */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class s implements Runnable {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ ResultReceiver f5277g;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ h f5278k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Bundle f5279n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ String f5280q;

            s(final h val$callbacks, final String val$action, final Bundle val$extras, final ResultReceiver val$receiver) {
                this.f5278k = val$callbacks;
                this.f5280q = val$action;
                this.f5279n = val$extras;
                this.f5277g = val$receiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = AbstractServiceC0970g.this.f5234g.get(this.f5278k.asBinder());
                if (gVar != null) {
                    AbstractServiceC0970g.this.t8r(this.f5280q, this.f5279n, gVar, this.f5277g);
                    return;
                }
                Log.w(AbstractServiceC0970g.f5225h, "sendCustomAction for callback that isn't registered action=" + this.f5280q + ", extras=" + this.f5279n);
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$kja0$toq */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class toq implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ h f5282k;

            toq(final h val$callbacks) {
                this.f5282k = val$callbacks;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVarRemove = AbstractServiceC0970g.this.f5234g.remove(this.f5282k.asBinder());
                if (gVarRemove != null) {
                    gVarRemove.f5242g.asBinder().unlinkToDeath(gVarRemove, 0);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$kja0$y */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class y implements Runnable {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ ResultReceiver f5284g;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ h f5285k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Bundle f5286n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ String f5287q;

            y(final h val$callbacks, final String val$query, final Bundle val$extras, final ResultReceiver val$receiver) {
                this.f5285k = val$callbacks;
                this.f5287q = val$query;
                this.f5286n = val$extras;
                this.f5284g = val$receiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = AbstractServiceC0970g.this.f5234g.get(this.f5285k.asBinder());
                if (gVar != null) {
                    AbstractServiceC0970g.this.zurt(this.f5287q, this.f5286n, gVar, this.f5284g);
                    return;
                }
                Log.w(AbstractServiceC0970g.f5225h, "search for callback that isn't registered query=" + this.f5287q);
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$kja0$zy */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class zy implements Runnable {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ Bundle f5289g;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ h f5290k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ IBinder f5291n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ String f5292q;

            zy(final h val$callbacks, final String val$id, final IBinder val$token, final Bundle val$options) {
                this.f5290k = val$callbacks;
                this.f5292q = val$id;
                this.f5291n = val$token;
                this.f5289g = val$options;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = AbstractServiceC0970g.this.f5234g.get(this.f5290k.asBinder());
                if (gVar != null) {
                    AbstractServiceC0970g.this.m4573k(this.f5292q, gVar, this.f5291n, this.f5289g);
                    return;
                }
                Log.w(AbstractServiceC0970g.f5225h, "addSubscription for callback that isn't registered id=" + this.f5292q);
            }
        }

        kja0() {
        }

        public void f7l8(final String query, final Bundle extras, final ResultReceiver receiver, final h callbacks) {
            if (TextUtils.isEmpty(query) || receiver == null) {
                return;
            }
            AbstractServiceC0970g.this.f5239s.m4585k(new y(callbacks, query, extras, receiver));
        }

        /* JADX INFO: renamed from: g */
        public void m4586g(final String id, final IBinder token, final h callbacks) {
            AbstractServiceC0970g.this.f5239s.m4585k(new q(callbacks, id, token));
        }

        /* JADX INFO: renamed from: k */
        public void m4587k(final String id, final IBinder token, final Bundle options, final h callbacks) {
            AbstractServiceC0970g.this.f5239s.m4585k(new zy(callbacks, id, token, options));
        }

        /* JADX INFO: renamed from: n */
        public void m4588n(final h callbacks, final String pkg, final int pid, final int uid, final Bundle rootHints) {
            AbstractServiceC0970g.this.f5239s.m4585k(new g(callbacks, uid, pkg, pid, rootHints));
        }

        /* JADX INFO: renamed from: q */
        public void m4589q(final String mediaId, final ResultReceiver receiver, final h callbacks) {
            if (TextUtils.isEmpty(mediaId) || receiver == null) {
                return;
            }
            AbstractServiceC0970g.this.f5239s.m4585k(new n(callbacks, mediaId, receiver));
        }

        /* JADX INFO: renamed from: s */
        public void m4590s(final h callbacks) {
            AbstractServiceC0970g.this.f5239s.m4585k(new f7l8(callbacks));
        }

        public void toq(final String pkg, final int pid, final int uid, final Bundle rootHints, final h callbacks) {
            if (AbstractServiceC0970g.this.f7l8(pkg, uid)) {
                AbstractServiceC0970g.this.f5239s.m4585k(new k(callbacks, pkg, pid, uid, rootHints));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + uid + " package=" + pkg);
        }

        /* JADX INFO: renamed from: y */
        public void m4591y(final String action, final Bundle extras, final ResultReceiver receiver, final h callbacks) {
            if (TextUtils.isEmpty(action) || receiver == null) {
                return;
            }
            AbstractServiceC0970g.this.f5239s.m4585k(new s(callbacks, action, extras, receiver));
        }

        public void zy(final h callbacks) {
            AbstractServiceC0970g.this.f5239s.m4585k(new toq(callbacks));
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$ld6 */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    @hyr(28)
    class ld6 extends p {
        ld6() {
            super();
        }

        @Override // androidx.media.AbstractServiceC0970g.y, androidx.media.AbstractServiceC0970g.f7l8
        /* JADX INFO: renamed from: k */
        public C0985y.toq mo4582k() {
            AbstractServiceC0970g abstractServiceC0970g = AbstractServiceC0970g.this;
            g gVar = abstractServiceC0970g.f5240y;
            if (gVar != null) {
                return gVar == abstractServiceC0970g.f5238q ? new C0985y.toq(this.f51692toq.getCurrentBrowserInfo()) : gVar.f5245q;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$n */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    public static final class n {

        /* JADX INFO: renamed from: g */
        @Deprecated
        public static final String f5294g = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* JADX INFO: renamed from: n */
        public static final String f5295n = "android.service.media.extra.SUGGESTED";

        /* JADX INFO: renamed from: q */
        public static final String f5296q = "android.service.media.extra.OFFLINE";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f51683zy = "android.service.media.extra.RECENT";

        /* JADX INFO: renamed from: k */
        private final String f5297k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Bundle f51684toq;

        public n(@lvui String rootId, @dd Bundle extras) {
            if (rootId == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f5297k = rootId;
            this.f51684toq = extras;
        }

        /* JADX INFO: renamed from: q */
        public String m4593q() {
            return this.f5297k;
        }

        public Bundle zy() {
            return this.f51684toq;
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$n7h */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    @hyr(21)
    static class n7h<T> {

        /* JADX INFO: renamed from: k */
        MediaBrowserService.Result f5298k;

        n7h(MediaBrowserService.Result result) {
            this.f5298k = result;
        }

        /* JADX INFO: renamed from: k */
        public void m4594k() {
            this.f5298k.detach();
        }

        List<MediaBrowser.MediaItem> toq(List<Parcel> parcelList) {
            if (parcelList == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : parcelList) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void zy(T result) {
            if (result instanceof List) {
                this.f5298k.sendResult(toq((List) result));
                return;
            }
            if (!(result instanceof Parcel)) {
                this.f5298k.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) result;
            parcel.setDataPosition(0);
            this.f5298k.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$p */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    @hyr(26)
    class p extends s {

        /* JADX INFO: renamed from: androidx.media.g$p$k */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class k extends qrj<List<MediaBrowserCompat.MediaItem>> {

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            final /* synthetic */ Bundle f51685f7l8;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ n7h f5300g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(Object debug, final n7h val$resultWrapper, final Bundle val$options) {
                super(debug);
                this.f5300g = val$resultWrapper;
                this.f51685f7l8 = val$options;
            }

            @Override // androidx.media.AbstractServiceC0970g.qrj
            public void toq() {
                this.f5300g.m4594k();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.AbstractServiceC0970g.qrj
            /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
            public void f7l8(@dd List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f5300g.zy(null);
                    return;
                }
                if ((zy() & 1) != 0) {
                    list = AbstractServiceC0970g.this.toq(list, this.f51685f7l8);
                }
                ArrayList arrayList = new ArrayList();
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    arrayList.add(parcelObtain);
                }
                this.f5300g.zy(arrayList);
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$p$toq */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class toq extends s.toq {
            toq(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String parentId, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle options) {
                MediaSessionCompat.ensureClassLoader(options);
                p pVar = p.this;
                AbstractServiceC0970g abstractServiceC0970g = AbstractServiceC0970g.this;
                abstractServiceC0970g.f5240y = abstractServiceC0970g.f5238q;
                pVar.m4595h(parentId, new n7h<>(result), options);
                AbstractServiceC0970g.this.f5240y = null;
            }
        }

        p() {
            super();
        }

        /* JADX INFO: renamed from: h */
        public void m4595h(String parentId, final n7h<List<Parcel>> resultWrapper, final Bundle options) {
            k kVar = new k(parentId, resultWrapper, options);
            AbstractServiceC0970g abstractServiceC0970g = AbstractServiceC0970g.this;
            abstractServiceC0970g.f5240y = abstractServiceC0970g.f5238q;
            abstractServiceC0970g.n7h(parentId, kVar, options);
            AbstractServiceC0970g.this.f5240y = null;
        }

        @Override // androidx.media.AbstractServiceC0970g.y
        void ld6(final String parentId, final Bundle options) {
            if (options != null) {
                this.f51692toq.notifyChildrenChanged(parentId, options);
            } else {
                super.ld6(parentId, options);
            }
        }

        @Override // androidx.media.AbstractServiceC0970g.y, androidx.media.AbstractServiceC0970g.f7l8
        /* JADX INFO: renamed from: n */
        public Bundle mo4583n() {
            AbstractServiceC0970g abstractServiceC0970g = AbstractServiceC0970g.this;
            g gVar = abstractServiceC0970g.f5240y;
            if (gVar == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (gVar == abstractServiceC0970g.f5238q) {
                return this.f51692toq.getBrowserRootHints();
            }
            if (gVar.f5244n == null) {
                return null;
            }
            return new Bundle(AbstractServiceC0970g.this.f5240y.f5244n);
        }

        @Override // androidx.media.AbstractServiceC0970g.s, androidx.media.AbstractServiceC0970g.y, androidx.media.AbstractServiceC0970g.f7l8
        public void toq() {
            toq toqVar = new toq(AbstractServiceC0970g.this);
            this.f51692toq = toqVar;
            toqVar.onCreate();
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$q */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    class q extends qrj<Bundle> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ResultReceiver f5303g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Object debug, final ResultReceiver val$receiver) {
            super(debug);
            this.f5303g = val$receiver;
        }

        @Override // androidx.media.AbstractServiceC0970g.qrj
        /* JADX INFO: renamed from: g */
        void mo4596g(@dd Bundle data) {
            this.f5303g.send(1, data);
        }

        @Override // androidx.media.AbstractServiceC0970g.qrj
        /* JADX INFO: renamed from: n */
        void mo4597n(@dd Bundle data) {
            this.f5303g.send(-1, data);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.AbstractServiceC0970g.qrj
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public void f7l8(@dd Bundle result) {
            this.f5303g.send(0, result);
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$qrj */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    public static class qrj<T> {

        /* JADX INFO: renamed from: k */
        private final Object f5304k;

        /* JADX INFO: renamed from: n */
        private int f5305n;

        /* JADX INFO: renamed from: q */
        private boolean f5306q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f51687toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f51688zy;

        qrj(Object debug) {
            this.f5304k = debug;
        }

        /* JADX INFO: renamed from: k */
        private void m4598k(@dd Bundle extras) {
            if (extras != null && extras.containsKey(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS)) {
                float f2 = extras.getFloat(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS);
                if (f2 < -1.0E-5f || f2 > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
                }
            }
        }

        void f7l8(@dd T result) {
        }

        /* JADX INFO: renamed from: g */
        void mo4596g(@dd Bundle extras) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f5304k);
        }

        void ld6(int flags) {
            this.f5305n = flags;
        }

        /* JADX INFO: renamed from: n */
        void mo4597n(@dd Bundle extras) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f5304k);
        }

        /* JADX INFO: renamed from: p */
        public void m4599p(@dd T result) {
            if (!this.f51688zy && !this.f5306q) {
                this.f51688zy = true;
                f7l8(result);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f5304k);
            }
        }

        /* JADX INFO: renamed from: q */
        boolean m4600q() {
            return this.f51687toq || this.f51688zy || this.f5306q;
        }

        /* JADX INFO: renamed from: s */
        public void m4601s(@dd Bundle extras) {
            if (!this.f51688zy && !this.f5306q) {
                m4598k(extras);
                mo4596g(extras);
            } else {
                throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f5304k);
            }
        }

        public void toq() {
            if (this.f51687toq) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f5304k);
            }
            if (this.f51688zy) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f5304k);
            }
            if (!this.f5306q) {
                this.f51687toq = true;
                return;
            }
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f5304k);
        }

        /* JADX INFO: renamed from: y */
        public void m4602y(@dd Bundle extras) {
            if (!this.f51688zy && !this.f5306q) {
                this.f5306q = true;
                mo4597n(extras);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f5304k);
            }
        }

        int zy() {
            return this.f5305n;
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$s */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    @hyr(23)
    class s extends y {

        /* JADX INFO: renamed from: androidx.media.g$s$k */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class k extends qrj<MediaBrowserCompat.MediaItem> {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ n7h f5308g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(Object debug, final n7h val$resultWrapper) {
                super(debug);
                this.f5308g = val$resultWrapper;
            }

            @Override // androidx.media.AbstractServiceC0970g.qrj
            public void toq() {
                this.f5308g.m4594k();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.AbstractServiceC0970g.qrj
            /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
            public void f7l8(@dd MediaBrowserCompat.MediaItem item) {
                if (item == null) {
                    this.f5308g.zy(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                item.writeToParcel(parcelObtain, 0);
                this.f5308g.zy(parcelObtain);
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$s$toq */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class toq extends y.n {
            toq(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String itemId, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                s.this.kja0(itemId, new n7h<>(result));
            }
        }

        s() {
            super();
        }

        public void kja0(String itemId, final n7h<Parcel> resultWrapper) {
            k kVar = new k(itemId, resultWrapper);
            AbstractServiceC0970g abstractServiceC0970g = AbstractServiceC0970g.this;
            abstractServiceC0970g.f5240y = abstractServiceC0970g.f5238q;
            abstractServiceC0970g.kja0(itemId, kVar);
            AbstractServiceC0970g.this.f5240y = null;
        }

        @Override // androidx.media.AbstractServiceC0970g.y, androidx.media.AbstractServiceC0970g.f7l8
        public void toq() {
            toq toqVar = new toq(AbstractServiceC0970g.this);
            this.f51692toq = toqVar;
            toqVar.onCreate();
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$toq */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    class toq extends qrj<MediaBrowserCompat.MediaItem> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ResultReceiver f5310g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(Object debug, final ResultReceiver val$receiver) {
            super(debug);
            this.f5310g = val$receiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.AbstractServiceC0970g.qrj
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public void f7l8(@dd MediaBrowserCompat.MediaItem item) {
            if ((zy() & 2) != 0) {
                this.f5310g.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(AbstractServiceC0970g.f5231r, item);
            this.f5310g.send(0, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$x2 */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    class x2 implements f7l8 {

        /* JADX INFO: renamed from: k */
        private Messenger f5311k;

        /* JADX INFO: renamed from: androidx.media.g$x2$k */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ MediaSessionCompat.Token f5312k;

            k(final MediaSessionCompat.Token val$token) {
                this.f5312k = val$token;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<g> it = AbstractServiceC0970g.this.f5234g.values().iterator();
                while (it.hasNext()) {
                    g next = it.next();
                    try {
                        next.f5242g.zy(next.f5247y.m4593q(), this.f5312k, next.f5247y.zy());
                    } catch (RemoteException unused) {
                        Log.w(AbstractServiceC0970g.f5225h, "Connection for " + next.f5243k + " is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$x2$toq */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class toq implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ String f5314k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ Bundle f5316q;

            toq(final String val$parentId, final Bundle val$options) {
                this.f5314k = val$parentId;
                this.f5316q = val$options;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = AbstractServiceC0970g.this.f5234g.keySet().iterator();
                while (it.hasNext()) {
                    x2.this.m4603y(AbstractServiceC0970g.this.f5234g.get(it.next()), this.f5314k, this.f5316q);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$x2$zy */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class zy implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ C0985y.toq f5318k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Bundle f5319n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ String f5320q;

            zy(final C0985y.toq val$remoteUserInfo, final String val$parentId, final Bundle val$options) {
                this.f5318k = val$remoteUserInfo;
                this.f5320q = val$parentId;
                this.f5319n = val$options;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i2 = 0; i2 < AbstractServiceC0970g.this.f5234g.size(); i2++) {
                    g gVarM873h = AbstractServiceC0970g.this.f5234g.m873h(i2);
                    if (gVarM873h.f5245q.equals(this.f5318k)) {
                        x2.this.m4603y(gVarM873h, this.f5320q, this.f5319n);
                        return;
                    }
                }
            }
        }

        x2() {
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        public IBinder f7l8(Intent intent) {
            if (AbstractServiceC0970g.f5232t.equals(intent.getAction())) {
                return this.f5311k.getBinder();
            }
            return null;
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        /* JADX INFO: renamed from: g */
        public void mo4581g(@lvui final C0985y.toq remoteUserInfo, @lvui final String parentId, final Bundle options) {
            AbstractServiceC0970g.this.f5239s.post(new zy(remoteUserInfo, parentId, options));
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        /* JADX INFO: renamed from: k */
        public C0985y.toq mo4582k() {
            g gVar = AbstractServiceC0970g.this.f5240y;
            if (gVar != null) {
                return gVar.f5245q;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        /* JADX INFO: renamed from: n */
        public Bundle mo4583n() {
            g gVar = AbstractServiceC0970g.this.f5240y;
            if (gVar == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (gVar.f5244n == null) {
                return null;
            }
            return new Bundle(AbstractServiceC0970g.this.f5240y.f5244n);
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        /* JADX INFO: renamed from: q */
        public void mo4584q(final MediaSessionCompat.Token token) {
            AbstractServiceC0970g.this.f5239s.post(new k(token));
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        public void toq() {
            this.f5311k = new Messenger(AbstractServiceC0970g.this.f5239s);
        }

        /* JADX INFO: renamed from: y */
        void m4603y(final g connection, final String parentId, final Bundle options) {
            List<C0639p<IBinder, Bundle>> list = connection.f51677f7l8.get(parentId);
            if (list != null) {
                for (C0639p<IBinder, Bundle> c0639p : list) {
                    if (C0975q.toq(options, c0639p.f50633toq)) {
                        AbstractServiceC0970g.this.m4572i(parentId, connection, c0639p.f50633toq, options);
                    }
                }
            }
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        public void zy(@lvui final String parentId, final Bundle options) {
            AbstractServiceC0970g.this.f5239s.post(new toq(parentId, options));
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$y */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    @hyr(21)
    class y implements f7l8 {

        /* JADX INFO: renamed from: k */
        final List<Bundle> f5321k = new ArrayList();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        MediaBrowserService f51692toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        Messenger f51693zy;

        /* JADX INFO: renamed from: androidx.media.g$y$k */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ MediaSessionCompat.Token f5323k;

            k(final MediaSessionCompat.Token val$token) {
                this.f5323k = val$token;
            }

            @Override // java.lang.Runnable
            public void run() {
                y.this.n7h(this.f5323k);
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$y$n */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        @hyr(21)
        class n extends MediaBrowserService {
            n(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String clientPackageName, int clientUid, Bundle rootHints) {
                MediaSessionCompat.ensureClassLoader(rootHints);
                n nVarX2 = y.this.x2(clientPackageName, clientUid, rootHints == null ? null : new Bundle(rootHints));
                if (nVarX2 == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(nVarX2.f5297k, nVarX2.f51684toq);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String parentId, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                y.this.qrj(parentId, new n7h<>(result));
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$y$q */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class q implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ C0985y.toq f5327k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Bundle f5328n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ String f5329q;

            q(final C0985y.toq val$remoteUserInfo, final String val$parentId, final Bundle val$options) {
                this.f5327k = val$remoteUserInfo;
                this.f5329q = val$parentId;
                this.f5328n = val$options;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i2 = 0; i2 < AbstractServiceC0970g.this.f5234g.size(); i2++) {
                    g gVarM873h = AbstractServiceC0970g.this.f5234g.m873h(i2);
                    if (gVarM873h.f5245q.equals(this.f5327k)) {
                        y.this.m4604p(gVarM873h, this.f5329q, this.f5328n);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$y$toq */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class toq extends qrj<List<MediaBrowserCompat.MediaItem>> {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ n7h f5330g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            toq(Object debug, final n7h val$resultWrapper) {
                super(debug);
                this.f5330g = val$resultWrapper;
            }

            @Override // androidx.media.AbstractServiceC0970g.qrj
            public void toq() {
                this.f5330g.m4594k();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.AbstractServiceC0970g.qrj
            /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
            public void f7l8(@dd List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f5330g.zy(arrayList);
            }
        }

        /* JADX INFO: renamed from: androidx.media.g$y$zy */
        /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
        class zy implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ String f5331k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ Bundle f5333q;

            zy(final String val$parentId, final Bundle val$options) {
                this.f5331k = val$parentId;
                this.f5333q = val$options;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = AbstractServiceC0970g.this.f5234g.keySet().iterator();
                while (it.hasNext()) {
                    y.this.m4604p(AbstractServiceC0970g.this.f5234g.get(it.next()), this.f5331k, this.f5333q);
                }
            }
        }

        y() {
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        public IBinder f7l8(Intent intent) {
            return this.f51692toq.onBind(intent);
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        /* JADX INFO: renamed from: g */
        public void mo4581g(final C0985y.toq remoteUserInfo, final String parentId, final Bundle options) {
            m4606y(remoteUserInfo, parentId, options);
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        /* JADX INFO: renamed from: k */
        public C0985y.toq mo4582k() {
            g gVar = AbstractServiceC0970g.this.f5240y;
            if (gVar != null) {
                return gVar.f5245q;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        void ld6(final String parentId, final Bundle options) {
            this.f51692toq.notifyChildrenChanged(parentId);
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        /* JADX INFO: renamed from: n */
        public Bundle mo4583n() {
            if (this.f51693zy == null) {
                return null;
            }
            g gVar = AbstractServiceC0970g.this.f5240y;
            if (gVar == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (gVar.f5244n == null) {
                return null;
            }
            return new Bundle(AbstractServiceC0970g.this.f5240y.f5244n);
        }

        void n7h(MediaSessionCompat.Token token) {
            if (!this.f5321k.isEmpty()) {
                IMediaSession extraBinder = token.getExtraBinder();
                if (extraBinder != null) {
                    Iterator<Bundle> it = this.f5321k.iterator();
                    while (it.hasNext()) {
                        C0432h.toq(it.next(), C0973n.f5352i, extraBinder.asBinder());
                    }
                }
                this.f5321k.clear();
            }
            this.f51692toq.setSessionToken((MediaSession.Token) token.getToken());
        }

        /* JADX INFO: renamed from: p */
        void m4604p(final g connection, final String parentId, final Bundle options) {
            List<C0639p<IBinder, Bundle>> list = connection.f51677f7l8.get(parentId);
            if (list != null) {
                for (C0639p<IBinder, Bundle> c0639p : list) {
                    if (C0975q.toq(options, c0639p.f50633toq)) {
                        AbstractServiceC0970g.this.m4572i(parentId, connection, c0639p.f50633toq, options);
                    }
                }
            }
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        /* JADX INFO: renamed from: q */
        public void mo4584q(final MediaSessionCompat.Token token) {
            AbstractServiceC0970g.this.f5239s.m4585k(new k(token));
        }

        public void qrj(String parentId, final n7h<List<Parcel>> resultWrapper) {
            toq toqVar = new toq(parentId, resultWrapper);
            AbstractServiceC0970g abstractServiceC0970g = AbstractServiceC0970g.this;
            abstractServiceC0970g.f5240y = abstractServiceC0970g.f5238q;
            abstractServiceC0970g.qrj(parentId, toqVar);
            AbstractServiceC0970g.this.f5240y = null;
        }

        /* JADX INFO: renamed from: s */
        void m4605s(final String parentId, final Bundle options) {
            AbstractServiceC0970g.this.f5239s.post(new zy(parentId, options));
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        public void toq() {
            n nVar = new n(AbstractServiceC0970g.this);
            this.f51692toq = nVar;
            nVar.onCreate();
        }

        public n x2(String clientPackageName, int clientUid, Bundle rootHints) {
            int i2;
            Bundle bundleZy;
            if (rootHints == null || rootHints.getInt(C0973n.f5351h, 0) == 0) {
                i2 = -1;
                bundleZy = null;
            } else {
                rootHints.remove(C0973n.f5351h);
                this.f51693zy = new Messenger(AbstractServiceC0970g.this.f5239s);
                bundleZy = new Bundle();
                bundleZy.putInt(C0973n.f51717ki, 2);
                C0432h.toq(bundleZy, C0973n.f51726t8r, this.f51693zy.getBinder());
                MediaSessionCompat.Token token = AbstractServiceC0970g.this.f5237p;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    C0432h.toq(bundleZy, C0973n.f5352i, extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.f5321k.add(bundleZy);
                }
                int i3 = rootHints.getInt(C0973n.f51707cdj, -1);
                rootHints.remove(C0973n.f51707cdj);
                i2 = i3;
            }
            g gVar = AbstractServiceC0970g.this.new g(clientPackageName, i2, clientUid, rootHints, null);
            AbstractServiceC0970g abstractServiceC0970g = AbstractServiceC0970g.this;
            abstractServiceC0970g.f5240y = gVar;
            n nVarX2 = abstractServiceC0970g.x2(clientPackageName, clientUid, rootHints);
            AbstractServiceC0970g abstractServiceC0970g2 = AbstractServiceC0970g.this;
            abstractServiceC0970g2.f5240y = null;
            if (nVarX2 == null) {
                return null;
            }
            if (this.f51693zy != null) {
                abstractServiceC0970g2.f5236n.add(gVar);
            }
            if (bundleZy == null) {
                bundleZy = nVarX2.zy();
            } else if (nVarX2.zy() != null) {
                bundleZy.putAll(nVarX2.zy());
            }
            return new n(nVarX2.m4593q(), bundleZy);
        }

        /* JADX INFO: renamed from: y */
        void m4606y(final C0985y.toq remoteUserInfo, final String parentId, final Bundle options) {
            AbstractServiceC0970g.this.f5239s.post(new q(remoteUserInfo, parentId, options));
        }

        @Override // androidx.media.AbstractServiceC0970g.f7l8
        public void zy(final String parentId, final Bundle options) {
            ld6(parentId, options);
            m4605s(parentId, options);
        }
    }

    /* JADX INFO: renamed from: androidx.media.g$zy */
    /* JADX INFO: compiled from: MediaBrowserServiceCompat.java */
    class zy extends qrj<List<MediaBrowserCompat.MediaItem>> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ResultReceiver f5334g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(Object debug, final ResultReceiver val$receiver) {
            super(debug);
            this.f5334g = val$receiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.AbstractServiceC0970g.qrj
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public void f7l8(@dd List<MediaBrowserCompat.MediaItem> items) {
            if ((zy() & 4) != 0 || items == null) {
                this.f5334g.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(AbstractServiceC0970g.f5228l, (Parcelable[]) items.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f5334g.send(0, bundle);
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public void cdj(String id, Bundle option) {
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
    }

    boolean f7l8(String pkg, int uid) {
        if (pkg == null) {
            return false;
        }
        for (String str : getPackageManager().getPackagesForUid(uid)) {
            if (str.equals(pkg)) {
                return true;
            }
        }
        return false;
    }

    void fn3e(String itemId, g connection, final ResultReceiver receiver) {
        toq toqVar = new toq(itemId, receiver);
        this.f5240y = connection;
        kja0(itemId, toqVar);
        this.f5240y = null;
        if (toqVar.m4600q()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + itemId);
    }

    public void fu4(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f5237p != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f5237p = token;
        this.f5235k.mo4584q(token);
    }

    @dd
    /* JADX INFO: renamed from: g */
    public MediaSessionCompat.Token m4570g() {
        return this.f5237p;
    }

    /* JADX INFO: renamed from: h */
    public void m4571h(@lvui String query, Bundle extras, @lvui qrj<List<MediaBrowserCompat.MediaItem>> result) {
        result.ld6(4);
        result.m4599p(null);
    }

    /* JADX INFO: renamed from: i */
    void m4572i(final String parentId, final g connection, final Bundle subscribeOptions, final Bundle notifyChildrenChangedOptions) {
        k kVar = new k(parentId, connection, parentId, subscribeOptions, notifyChildrenChangedOptions);
        this.f5240y = connection;
        if (subscribeOptions == null) {
            qrj(parentId, kVar);
        } else {
            n7h(parentId, kVar, subscribeOptions);
        }
        this.f5240y = null;
        if (kVar.m4600q()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + connection.f5243k + " id=" + parentId);
    }

    /* JADX INFO: renamed from: k */
    void m4573k(String id, g connection, IBinder token, Bundle options) {
        List<C0639p<IBinder, Bundle>> arrayList = connection.f51677f7l8.get(id);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (C0639p<IBinder, Bundle> c0639p : arrayList) {
            if (token == c0639p.f3889k && C0975q.m4618k(options, c0639p.f50633toq)) {
                return;
            }
        }
        arrayList.add(new C0639p<>(token, options));
        connection.f51677f7l8.put(id, arrayList);
        m4572i(id, connection, options, null);
        this.f5240y = connection;
        cdj(id, options);
        this.f5240y = null;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public void ki(String id) {
    }

    public void kja0(String itemId, @lvui qrj<MediaBrowserCompat.MediaItem> result) {
        result.ld6(2);
        result.m4599p(null);
    }

    public void ld6(@lvui String action, Bundle extras, @lvui qrj<Bundle> result) {
        result.m4602y(null);
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public final C0985y.toq m4574n() {
        return this.f5235k.mo4582k();
    }

    public void n7h(@lvui String parentId, @lvui qrj<List<MediaBrowserCompat.MediaItem>> result, @lvui Bundle options) {
        result.ld6(1);
        qrj(parentId, result);
    }

    boolean ni7(String id, g connection, IBinder token) {
        boolean z2 = false;
        try {
            if (token == null) {
                return connection.f51677f7l8.remove(id) != null;
            }
            List<C0639p<IBinder, Bundle>> list = connection.f51677f7l8.get(id);
            if (list != null) {
                Iterator<C0639p<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (token == it.next().f3889k) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    connection.f51677f7l8.remove(id);
                }
            }
            return z2;
        } finally {
            this.f5240y = connection;
            ki(id);
            this.f5240y = null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f5235k.f7l8(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5235k = new ld6();
        } else {
            this.f5235k = new p();
        }
        this.f5235k.toq();
    }

    /* JADX INFO: renamed from: p */
    public void m4575p(@lvui String parentId, @lvui Bundle options) {
        if (parentId == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (options == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f5235k.zy(parentId, options);
    }

    /* JADX INFO: renamed from: q */
    public final Bundle m4576q() {
        return this.f5235k.mo4583n();
    }

    public abstract void qrj(@lvui String parentId, @lvui qrj<List<MediaBrowserCompat.MediaItem>> result);

    /* JADX INFO: renamed from: s */
    public void m4577s(@lvui String parentId) {
        if (parentId == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        this.f5235k.zy(parentId, null);
    }

    void t8r(final String action, Bundle extras, g connection, final ResultReceiver receiver) {
        q qVar = new q(action, receiver);
        this.f5240y = connection;
        ld6(action, extras, qVar);
        this.f5240y = null;
        if (qVar.m4600q()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + action + " extras=" + extras);
    }

    List<MediaBrowserCompat.MediaItem> toq(List<MediaBrowserCompat.MediaItem> list, final Bundle options) {
        if (list == null) {
            return null;
        }
        int i2 = options.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i3 = options.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int size = i4 + i3;
        if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
            return Collections.emptyList();
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i4, size);
    }

    @dd
    public abstract n x2(@lvui String clientPackageName, int clientUid, @dd Bundle rootHints);

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: y */
    public void m4578y(@lvui C0985y.toq remoteUserInfo, @lvui String parentId, @lvui Bundle options) {
        if (remoteUserInfo == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (parentId == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (options == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f5235k.mo4581g(remoteUserInfo, parentId, options);
    }

    void zurt(final String query, Bundle extras, g connection, final ResultReceiver receiver) {
        zy zyVar = new zy(query, receiver);
        this.f5240y = connection;
        m4571h(query, extras, zyVar);
        this.f5240y = null;
        if (zyVar.m4600q()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + query);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void zy(Context base) {
        attachBaseContext(base);
    }
}
