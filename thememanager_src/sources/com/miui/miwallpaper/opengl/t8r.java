package com.miui.miwallpaper.opengl;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.SurfaceControl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* JADX INFO: compiled from: ImageWallpaperRenderer.java */
/* JADX INFO: loaded from: classes3.dex */
public class t8r implements ld6 {

    /* JADX INFO: renamed from: s */
    private static final boolean f29651s = false;

    /* JADX INFO: renamed from: y */
    private static final String f29652y = "t8r";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private gvn7 f72340f7l8;

    /* JADX INFO: renamed from: g */
    protected SurfaceControl f29653g;

    /* JADX INFO: renamed from: k */
    public C5294n f29654k;

    /* JADX INFO: renamed from: n */
    private Consumer<Bitmap> f29655n;

    /* JADX INFO: renamed from: q */
    protected final Context f29656q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected final Rect f72341toq = new Rect();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected final C5302k f72342zy;

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.t8r$k */
    /* JADX INFO: compiled from: ImageWallpaperRenderer.java */
    public static class C5302k {

        /* JADX INFO: renamed from: n */
        private boolean f29658n;

        /* JADX INFO: renamed from: q */
        private Bitmap f29659q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final WallpaperManager f72344zy;

        /* JADX INFO: renamed from: k */
        private final AtomicInteger f29657k = new AtomicInteger();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Rect f72343toq = new Rect();

        protected C5302k(WallpaperManager wallpaperManager) {
            this.f72344zy = wallpaperManager;
        }

        /* JADX INFO: renamed from: k */
        private String m18034k() {
            Bitmap bitmap = this.f29659q;
            return bitmap != null ? Integer.toHexString(bitmap.hashCode()) : "null";
        }

        /* JADX INFO: renamed from: q */
        private Rect m18035q() {
            try {
                return (Rect) b8.zy.m5789n(this.f72344zy, Rect.class, "peekBitmapDimensions", new Class[0], new Object[0]);
            } catch (Exception e2) {
                Log.e(t8r.f29652y, "peekBitmapDimensions fail", e2);
                return new Rect();
            }
        }

        public void f7l8(Consumer<Bitmap> consumer) {
            this.f29657k.incrementAndGet();
            synchronized (this.f29657k) {
                if (this.f29659q == null) {
                    this.f29659q = zy();
                    this.f72344zy.forgetLoadedWallpaper();
                    if (this.f29659q != null) {
                        if (r1.getWidth() / this.f29659q.getHeight() != this.f72343toq.width() / this.f72343toq.height()) {
                            mo18036g();
                        }
                        this.f72343toq.set(0, 0, this.f29659q.getWidth(), this.f29659q.getHeight());
                        this.f29658n = true;
                    } else {
                        Log.w(t8r.f29652y, "Can't get bitmap");
                    }
                }
            }
            if (consumer != null) {
                consumer.accept(this.f29659q);
            }
            synchronized (this.f29657k) {
                if (this.f29657k.decrementAndGet() == 0 && this.f29659q != null) {
                    this.f29659q = null;
                }
            }
        }

        /* JADX INFO: renamed from: g */
        protected void mo18036g() {
        }

        /* JADX INFO: renamed from: n */
        public void m18037n(Rect rect) {
            this.f72343toq.set(rect);
        }

        public String toString() {
            return "{" + m18034k() + ", " + this.f29657k.get() + "}";
        }

        public Rect toq() {
            if (!this.f29658n) {
                this.f72343toq.set(m18035q());
            }
            return this.f72343toq;
        }

        protected Bitmap zy() {
            try {
                return (Bitmap) b8.zy.m5789n(this.f72344zy, Bitmap.class, "getBitmap", new Class[]{Boolean.TYPE}, Boolean.FALSE);
            } catch (Exception e2) {
                Log.e(t8r.f29652y, "getWallpaperBitmap fail", e2);
                return null;
            }
        }
    }

    public t8r(Context context) {
        WallpaperManager wallpaperManager = (WallpaperManager) context.getSystemService(WallpaperManager.class);
        if (wallpaperManager == null) {
            Log.w(f29652y, "WallpaperManager not available");
        }
        this.f29656q = context;
        this.f72342zy = x2(wallpaperManager);
        this.f29654k = mo18014s(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qrj(Bitmap bitmap) {
        if (bitmap == null) {
            Log.w(f29652y, "reload texture failed!");
        } else {
            Consumer<Bitmap> consumer = this.f29655n;
            if (consumer != null) {
                consumer.accept(bitmap);
            }
        }
        this.f29654k.jk(bitmap, this.f72340f7l8);
        this.f29654k.t8r(bitmap);
    }

    @Override // com.miui.miwallpaper.opengl.ld6
    public void f7l8() {
        this.f29654k.m18017h();
        GLES20.glClear(16384);
        n7h();
        this.f29654k.oc();
        this.f29654k.m18021y();
    }

    @Override // com.miui.miwallpaper.opengl.ld6
    public void finish() {
    }

    @Override // com.miui.miwallpaper.opengl.ld6
    /* JADX INFO: renamed from: g */
    public void mo18008g(int i2, int i3) {
        GLES20.glViewport(0, 0, i2, i3);
        this.f72341toq.set(new Rect(0, 0, i2, i3));
    }

    /* JADX INFO: renamed from: h */
    public void m18032h(Consumer<Bitmap> consumer) {
        this.f72342zy.f7l8(consumer);
    }

    public void kja0(Consumer<Bitmap> consumer) {
        this.f29655n = consumer;
    }

    public int ld6() {
        return 0;
    }

    @Override // com.miui.miwallpaper.opengl.ld6
    /* JADX INFO: renamed from: n */
    public void mo18009n() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        C5294n c5294nMo18014s = mo18014s(this.f29656q);
        this.f29654k = c5294nMo18014s;
        c5294nMo18014s.d3();
        this.f72340f7l8 = new gvn7(this.f29654k.m18019p(), true);
        this.f72342zy.f7l8(new Consumer() { // from class: com.miui.miwallpaper.opengl.ki
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f29622k.qrj((Bitmap) obj);
            }
        });
    }

    protected void n7h() {
        GLES20.glViewport(0, 0, this.f72341toq.width(), this.f72341toq.height());
    }

    /* JADX INFO: renamed from: p */
    protected cdj mo18033p(C5290h c5290h) {
        return new cdj(c5290h);
    }

    @Override // com.miui.miwallpaper.opengl.ld6
    /* JADX INFO: renamed from: q */
    public Size mo18010q() {
        this.f72342zy.f7l8(null);
        this.f72341toq.set(this.f72342zy.toq());
        return new Size(this.f72341toq.width(), this.f72341toq.height());
    }

    /* JADX INFO: renamed from: s */
    public C5294n mo18014s(Context context) {
        return new C5294n(new C5293k(context));
    }

    @Override // com.miui.miwallpaper.opengl.ld6
    public void toq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mSurfaceSize=");
        printWriter.print(this.f72341toq);
        printWriter.println();
        this.f29654k.toq(str, fileDescriptor, printWriter, strArr);
    }

    protected C5302k x2(WallpaperManager wallpaperManager) {
        return new C5302k(wallpaperManager);
    }

    @Override // com.miui.miwallpaper.opengl.ld6
    public void zy(SurfaceControl surfaceControl) {
        this.f29653g = surfaceControl;
    }
}
