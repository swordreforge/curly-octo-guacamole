package com.android.thememanager;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.FrameLayout;
import com.android.thememanager.activity.bek6;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.MamlAodFactory;
import com.android.thememanager.superwallpaper.view.MamlPreview;
import com.miui.maml.component.MamlView;
import java.io.File;
import java.io.IOException;
import miuix.graphics.C7111k;

/* JADX INFO: loaded from: classes.dex */
public class AodPreviewAdapterActivity extends bek6 {

    /* JADX INFO: renamed from: p */
    private static final String f8545p = "/data/system/theme/aod";

    /* JADX INFO: renamed from: s */
    private static final String f8546s = "AodPreviewAdapterA";

    /* JADX INFO: renamed from: g */
    private Uri f8547g;

    /* JADX INFO: renamed from: k */
    private MamlView f8548k;

    /* JADX INFO: renamed from: n */
    private int f8549n;

    /* JADX INFO: renamed from: q */
    private int f8550q;

    /* JADX INFO: renamed from: y */
    private final MamlView.OnExternCommandListener f8551y = new C1530k();

    /* JADX INFO: renamed from: com.android.thememanager.AodPreviewAdapterActivity$k */
    class C1530k implements MamlView.OnExternCommandListener {
        C1530k() {
        }

        @Override // com.miui.maml.component.MamlView.OnExternCommandListener
        public void onCommand(String command, Double para1, String para2) {
            if ("animationState".equals(command) && "init".equals(para2)) {
                AodPreviewAdapterActivity.this.f8548k.sendCommand(MamlPreview.f16155c);
            }
        }
    }

    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f8553k;

        toq(final int val$previewSize) {
            this.f8553k = val$previewSize;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x018e -> B:65:0x0191). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        public void run() {
            float f2;
            int i2;
            AodPreviewAdapterActivity.this.f8548k.onPause();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AodPreviewAdapterActivity.this.getResources().getDisplayMetrics(), AodPreviewAdapterActivity.this.f8550q, AodPreviewAdapterActivity.this.f8549n, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            RectF rectF = new RectF(0.0f, 0.0f, AodPreviewAdapterActivity.this.f8550q, AodPreviewAdapterActivity.this.f8549n);
            Paint paint = new Paint();
            canvas.drawRect(rectF, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            int iSaveLayer = canvas.saveLayer(rectF, paint);
            if (this.f8553k == AodPreviewAdapterActivity.this.f8550q) {
                f2 = AodPreviewAdapterActivity.this.f8550q * 1.0f;
                i2 = MamlAodFactory.f10254k;
            } else {
                f2 = AodPreviewAdapterActivity.this.f8549n * 1.0f;
                i2 = MamlAodFactory.f10254k;
            }
            float f3 = f2 / i2;
            Bitmap bitmapLd6 = C1819o.ld6(AodPreviewAdapterActivity.this.f8548k);
            int width = bitmapLd6.getWidth();
            int height = bitmapLd6.getHeight();
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                if (i4 >= height / 2) {
                    i4 = 0;
                    break;
                }
                for (int i5 = 0; i5 < width; i5++) {
                    if (bitmapLd6.getPixel(i5, i4) != 0) {
                        break loop0;
                    }
                }
                i4++;
            }
            int i6 = 0;
            loop2: while (true) {
                if (i6 >= width / 2) {
                    i6 = 0;
                    break;
                }
                for (int i7 = 0; i7 < height; i7++) {
                    if (bitmapLd6.getPixel(i6, i7) != 0) {
                        break loop2;
                    }
                }
                i6++;
            }
            int i8 = width - 1;
            loop4: while (true) {
                if (i8 <= 1) {
                    i8 = 0;
                    break;
                }
                for (int i9 = 0; i9 < height; i9++) {
                    if (bitmapLd6.getPixel(i8, i9) != 0) {
                        break loop4;
                    }
                }
                i8--;
            }
            int i10 = height - 1;
            loop6: while (true) {
                if (i10 <= 1) {
                    break;
                }
                for (int i11 = 0; i11 < width; i11++) {
                    if (bitmapLd6.getPixel(i11, i10) != 0) {
                        i3 = i10;
                        break loop6;
                    }
                }
                i10--;
            }
            Log.d(AodPreviewAdapterActivity.f8546s, "mamlBitmap position" + i4 + ":" + i6 + ":" + i8 + ":" + i3);
            int i12 = i8 - i6;
            int i13 = i3 - i4;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapLd6, i6, i4, i12, i13);
            int i14 = ((int) ((((float) AodPreviewAdapterActivity.this.f8550q) / f3) - ((float) i12))) / 2;
            int i15 = ((int) ((((float) AodPreviewAdapterActivity.this.f8549n) / f3) - ((float) i13))) / 2;
            canvas.scale(f3, f3);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            canvas.drawBitmap(bitmapCreateBitmap2, (float) i14, (float) i15, paint2);
            canvas.restoreToCount(iSaveLayer);
            File file = new File(AodPreviewAdapterActivity.this.getCacheDir(), "images");
            if (!file.exists()) {
                file.mkdirs();
            }
            try {
                try {
                    try {
                        C7111k.x9kr(bitmapCreateBitmap, new File(file, "thumbnail.png").getPath(), true);
                        if (AodPreviewAdapterActivity.this.f8547g != null) {
                            AodPreviewAdapterActivity.this.getContentResolver().notifyChange(AodPreviewAdapterActivity.this.f8547g, null);
                        }
                        bitmapLd6.recycle();
                        bitmapCreateBitmap2.recycle();
                    } catch (Throwable th) {
                        try {
                            bitmapLd6.recycle();
                            bitmapCreateBitmap2.recycle();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                    bitmapLd6.recycle();
                    bitmapCreateBitmap2.recycle();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            if (AodPreviewAdapterActivity.this.f8548k != null) {
                AodPreviewAdapterActivity.this.f8548k.removeRelatedBitmapsRef();
                AodPreviewAdapterActivity.this.f8548k.onDestroy();
                AodPreviewAdapterActivity.this.f8548k = null;
            }
            AodPreviewAdapterActivity.this.finish();
        }
    }

    private void ek5k() {
        try {
            MamlView mamlViewM6986k = MamlAodFactory.m6986k(this, f8545p, false, 1.0f);
            this.f8548k = mamlViewM6986k;
            if (!mamlViewM6986k.isLoaded()) {
                finish();
                return;
            }
            this.f8548k.setOnExternCommandListener(this.f8551y);
            int iMin = Math.min(this.f8550q, this.f8549n);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById(R.id.aod_container).getLayoutParams();
            layoutParams.width = iMin;
            layoutParams.height = iMin;
            findViewById(R.id.aod_container).setLayoutParams(layoutParams);
            this.f8548k.setScale((iMin * 1.0f) / MamlAodFactory.f10254k, 0, 0);
            ((FrameLayout) findViewById(R.id.aod_container)).addView(this.f8548k, new FrameLayout.LayoutParams(-1, -1));
            new Handler().postDelayed(new toq(iMin), 4000L);
        } catch (Exception e2) {
            Log.i(f8546s, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aod_preview_adapter);
        this.f8550q = getIntent().getIntExtra("thumbnail_width", 825);
        this.f8549n = getIntent().getIntExtra("thumbnail_height", 990);
        this.f8547g = (Uri) getIntent().getParcelableExtra("uri");
        ek5k();
    }
}
