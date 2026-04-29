package androidx.print;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.print.k */
/* JADX INFO: compiled from: PrintHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1042k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f51990f7l8 = "PrintHelper";

    /* JADX INFO: renamed from: h */
    public static final int f5637h = 2;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f51991kja0 = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f51992ld6 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f51993n7h = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f51994qrj = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f51995x2 = 2;

    /* JADX INFO: renamed from: y */
    private static final int f5640y = 3500;

    /* JADX INFO: renamed from: k */
    final Context f5642k;

    /* JADX INFO: renamed from: s */
    static final boolean f5639s = true;

    /* JADX INFO: renamed from: p */
    static final boolean f5638p = true;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    BitmapFactory.Options f51996toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final Object f51997zy = new Object();

    /* JADX INFO: renamed from: q */
    int f5644q = 2;

    /* JADX INFO: renamed from: n */
    int f5643n = 2;

    /* JADX INFO: renamed from: g */
    int f5641g = 1;

    /* JADX INFO: renamed from: androidx.print.k$k */
    /* JADX INFO: compiled from: PrintHelper.java */
    class k extends AsyncTask<Void, Void, Throwable> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f51998f7l8;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ParcelFileDescriptor f5645g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ CancellationSignal f5646k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f5647n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ PrintAttributes f5648q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f51999toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ Bitmap f52000zy;

        k(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i2, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f5646k = cancellationSignal;
            this.f51999toq = printAttributes;
            this.f52000zy = bitmap;
            this.f5648q = printAttributes2;
            this.f5647n = i2;
            this.f5645g = parcelFileDescriptor;
            this.f51998f7l8 = writeResultCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f5646k.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(C1042k.this.f5642k, this.f51999toq);
                Bitmap bitmapM4739k = C1042k.m4739k(this.f52000zy, this.f51999toq.getColorMode());
                if (this.f5646k.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                    boolean z2 = C1042k.f5638p;
                    if (z2) {
                        rectF = new RectF(pageStartPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(C1042k.this.f5642k, this.f5648q);
                        PdfDocument.Page pageStartPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(pageStartPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(pageStartPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix matrixM4740q = C1042k.m4740q(bitmapM4739k.getWidth(), bitmapM4739k.getHeight(), rectF, this.f5647n);
                    if (!z2) {
                        matrixM4740q.postTranslate(rectF.left, rectF.top);
                        pageStartPage.getCanvas().clipRect(rectF);
                    }
                    pageStartPage.getCanvas().drawBitmap(bitmapM4739k, matrixM4740q, null);
                    printedPdfDocument.finishPage(pageStartPage);
                    if (this.f5646k.isCanceled()) {
                        printedPdfDocument.close();
                        ParcelFileDescriptor parcelFileDescriptor = this.f5645g;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (bitmapM4739k != this.f52000zy) {
                            bitmapM4739k.recycle();
                        }
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f5645g.getFileDescriptor()));
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor2 = this.f5645g;
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (bitmapM4739k != this.f52000zy) {
                        bitmapM4739k.recycle();
                    }
                    return null;
                } finally {
                }
            } catch (Throwable th) {
                return th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Throwable th) {
            if (this.f5646k.isCanceled()) {
                this.f51998f7l8.onWriteCancelled();
            } else if (th == null) {
                this.f51998f7l8.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                Log.e(C1042k.f51990f7l8, "Error writing printed content", th);
                this.f51998f7l8.onWriteFailed(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.print.k$q */
    /* JADX INFO: compiled from: PrintHelper.java */
    @hyr(19)
    private class q extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        Bitmap f52001f7l8 = null;

        /* JADX INFO: renamed from: g */
        AsyncTask<Uri, Boolean, Bitmap> f5650g;

        /* JADX INFO: renamed from: k */
        final String f5651k;

        /* JADX INFO: renamed from: n */
        PrintAttributes f5652n;

        /* JADX INFO: renamed from: q */
        final int f5653q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Uri f52002toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final toq f52003zy;

        /* JADX INFO: renamed from: androidx.print.k$q$k */
        /* JADX INFO: compiled from: PrintHelper.java */
        class k extends AsyncTask<Uri, Boolean, Bitmap> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ CancellationSignal f5655k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f5657q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f52004toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f52005zy;

            /* JADX INFO: renamed from: androidx.print.k$q$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: PrintHelper.java */
            class C7890k implements CancellationSignal.OnCancelListener {
                C7890k() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    q.this.m4748k();
                    k.this.cancel(false);
                }
            }

            k(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f5655k = cancellationSignal;
                this.f52004toq = printAttributes;
                this.f52005zy = printAttributes2;
                this.f5657q = layoutResultCallback;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    q qVar = q.this;
                    return C1042k.this.m4746s(qVar.f52002toq);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                this.f5655k.setOnCancelListener(new C7890k());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.f5657q.onLayoutCancelled();
                q.this.f5650g = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!C1042k.f5639s || C1042k.this.f5641g == 0)) {
                    synchronized (this) {
                        mediaSize = q.this.f5652n.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != C1042k.f7l8(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                q.this.f52001f7l8 = bitmap;
                if (bitmap != null) {
                    this.f5657q.onLayoutFinished(new PrintDocumentInfo.Builder(q.this.f5651k).setContentType(1).setPageCount(1).build(), true ^ this.f52004toq.equals(this.f52005zy));
                } else {
                    this.f5657q.onLayoutFailed(null);
                }
                q.this.f5650g = null;
            }
        }

        q(String str, Uri uri, toq toqVar, int i2) {
            this.f5651k = str;
            this.f52002toq = uri;
            this.f52003zy = toqVar;
            this.f5653q = i2;
        }

        /* JADX INFO: renamed from: k */
        void m4748k() {
            synchronized (C1042k.this.f51997zy) {
                C1042k c1042k = C1042k.this;
                if (c1042k.f51996toq != null) {
                    c1042k.f51996toq = null;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            m4748k();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f5650g;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            toq toqVar = this.f52003zy;
            if (toqVar != null) {
                toqVar.m4750k();
            }
            Bitmap bitmap = this.f52001f7l8;
            if (bitmap != null) {
                bitmap.recycle();
                this.f52001f7l8 = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f5652n = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f52001f7l8 != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f5651k).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f5650g = new k(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            C1042k.this.ki(this.f5652n, this.f5653q, this.f52001f7l8, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* JADX INFO: renamed from: androidx.print.k$toq */
    /* JADX INFO: compiled from: PrintHelper.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void m4750k();
    }

    /* JADX INFO: renamed from: androidx.print.k$zy */
    /* JADX INFO: compiled from: PrintHelper.java */
    @hyr(19)
    private class zy extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: k */
        private final String f5660k;

        /* JADX INFO: renamed from: n */
        private PrintAttributes f5661n;

        /* JADX INFO: renamed from: q */
        private final toq f5662q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f52006toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Bitmap f52007zy;

        zy(String str, int i2, Bitmap bitmap, toq toqVar) {
            this.f5660k = str;
            this.f52006toq = i2;
            this.f52007zy = bitmap;
            this.f5662q = toqVar;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            toq toqVar = this.f5662q;
            if (toqVar != null) {
                toqVar.m4750k();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f5661n = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f5660k).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            C1042k.this.ki(this.f5661n, this.f52006toq, this.f52007zy, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    public C1042k(@lvui Context context) {
        this.f5642k = context;
    }

    public static boolean cdj() {
        return true;
    }

    static boolean f7l8(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    /* JADX INFO: renamed from: k */
    static Bitmap m4739k(Bitmap bitmap, int i2) {
        if (i2 != 1) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: q */
    static Matrix m4740q(int i2, int i3, RectF rectF, int i4) {
        Matrix matrix = new Matrix();
        float f2 = i2;
        float fWidth = rectF.width() / f2;
        float fMax = i4 == 2 ? Math.max(fWidth, rectF.height() / i3) : Math.min(fWidth, rectF.height() / i3);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate((rectF.width() - (f2 * fMax)) / 2.0f, (rectF.height() - (i3 * fMax)) / 2.0f);
        return matrix;
    }

    @hyr(19)
    private static PrintAttributes.Builder toq(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    /* JADX INFO: renamed from: y */
    private Bitmap m4741y(Uri uri, BitmapFactory.Options options) throws Throwable {
        Context context;
        if (uri == null || (context = this.f5642k) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e2) {
                        Log.w(f51990f7l8, "close fail ", e2);
                    }
                }
                return bitmapDecodeStream;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        Log.w(f51990f7l8, "close fail ", e3);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m4742g() {
        return this.f5644q;
    }

    /* JADX INFO: renamed from: h */
    public void m4743h(int i2) {
        this.f5644q = i2;
    }

    @hyr(19)
    void ki(PrintAttributes printAttributes, int i2, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new k(cancellationSignal, f5638p ? printAttributes : toq(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i2, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }

    public void kja0(int i2) {
        this.f5641g = i2;
    }

    public void ld6(@lvui String str, @lvui Bitmap bitmap, @dd toq toqVar) {
        if (bitmap == null) {
            return;
        }
        ((PrintManager) this.f5642k.getSystemService("print")).print(str, new zy(str, this.f5644q, bitmap, toqVar), new PrintAttributes.Builder().setMediaSize(f7l8(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f5643n).build());
    }

    /* JADX INFO: renamed from: n */
    public int m4744n() {
        int i2 = this.f5641g;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public void n7h(int i2) {
        this.f5643n = i2;
    }

    /* JADX INFO: renamed from: p */
    public void m4745p(@lvui String str, @lvui Bitmap bitmap) {
        ld6(str, bitmap, null);
    }

    public void qrj(@lvui String str, @lvui Uri uri, @dd toq toqVar) throws FileNotFoundException {
        q qVar = new q(str, uri, toqVar, this.f5644q);
        PrintManager printManager = (PrintManager) this.f5642k.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f5643n);
        int i2 = this.f5641g;
        if (i2 == 1 || i2 == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i2 == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, qVar, builder.build());
    }

    /* JADX INFO: renamed from: s */
    Bitmap m4746s(Uri uri) throws Throwable {
        BitmapFactory.Options options;
        if (uri == null || this.f5642k == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        m4741y(uri, options2);
        int i2 = options2.outWidth;
        int i3 = options2.outHeight;
        if (i2 > 0 && i3 > 0) {
            int iMax = Math.max(i2, i3);
            int i4 = 1;
            while (iMax > f5640y) {
                iMax >>>= 1;
                i4 <<= 1;
            }
            if (i4 > 0 && Math.min(i2, i3) / i4 > 0) {
                synchronized (this.f51997zy) {
                    options = new BitmapFactory.Options();
                    this.f51996toq = options;
                    options.inMutable = true;
                    options.inSampleSize = i4;
                }
                try {
                    Bitmap bitmapM4741y = m4741y(uri, options);
                    synchronized (this.f51997zy) {
                        this.f51996toq = null;
                    }
                    return bitmapM4741y;
                } catch (Throwable th) {
                    synchronized (this.f51997zy) {
                        this.f51996toq = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public void x2(@lvui String str, @lvui Uri uri) throws FileNotFoundException {
        qrj(str, uri, null);
    }

    public int zy() {
        return this.f5643n;
    }
}
