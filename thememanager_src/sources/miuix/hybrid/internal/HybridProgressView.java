package miuix.hybrid.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.thememanager.R;

/* JADX INFO: loaded from: classes3.dex */
public class HybridProgressView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    private static final int f40230c = 9500;

    /* JADX INFO: renamed from: e */
    private static final int f40231e = 800;

    /* JADX INFO: renamed from: f */
    private static final int f40232f = 40;

    /* JADX INFO: renamed from: l */
    private static final int f40233l = 10;

    /* JADX INFO: renamed from: r */
    private static final int f40234r = 42;

    /* JADX INFO: renamed from: t */
    private static final int f40235t = 10000;

    /* JADX INFO: renamed from: g */
    private int f40236g;

    /* JADX INFO: renamed from: h */
    private final Handler f40237h;

    /* JADX INFO: renamed from: i */
    private final Drawable f40238i;

    /* JADX INFO: renamed from: p */
    private final Rect f40239p;

    /* JADX INFO: renamed from: s */
    private int f40240s;

    /* JADX INFO: renamed from: y */
    private int f40241y;

    /* JADX INFO: renamed from: z */
    private final Rect f40242z;

    /* JADX INFO: renamed from: miuix.hybrid.internal.HybridProgressView$k */
    class HandlerC7124k extends Handler {
        HandlerC7124k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (msg.what == 42) {
                if (HybridProgressView.this.f40236g < HybridProgressView.this.f40241y) {
                    HybridProgressView hybridProgressView = HybridProgressView.this;
                    hybridProgressView.f40236g = Math.min(hybridProgressView.f40241y, HybridProgressView.this.f40236g + HybridProgressView.this.f40240s);
                    HybridProgressView.this.f40239p.right = (HybridProgressView.this.getWidth() * HybridProgressView.this.f40236g) / 10000;
                    HybridProgressView.this.invalidate();
                    sendMessageDelayed(HybridProgressView.this.f40237h.obtainMessage(42), 40L);
                    return;
                }
                if (HybridProgressView.this.f40236g > HybridProgressView.f40230c || HybridProgressView.this.f40236g < 800) {
                    return;
                }
                HybridProgressView.this.f40236g += 30;
                HybridProgressView.this.f40239p.right = (HybridProgressView.this.getWidth() * HybridProgressView.this.f40236g) / 10000;
                HybridProgressView.this.invalidate();
                sendMessageDelayed(HybridProgressView.this.f40237h.obtainMessage(42), 40L);
            }
        }
    }

    public HybridProgressView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public int getMax() {
        return 100;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        drawable.setBounds(this.f40239p);
        drawable.draw(canvas);
        float width = getWidth() - ((getWidth() * this.f40236g) / 10000.0f);
        canvas.save();
        canvas.translate(-width, 0.0f);
        this.f40242z.set(0, 0, getWidth(), getHeight());
        this.f40238i.setBounds(this.f40242z);
        this.f40238i.draw(canvas);
        canvas.translate(width, 0.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean f2, int l2, int t2, int r2, int b2) {
        Rect rect = this.f40239p;
        rect.left = 0;
        rect.right = ((r2 - l2) * this.f40236g) / 10000;
        rect.top = 0;
        rect.bottom = b2 - t2;
    }

    public void setProgress(int progress) {
        int i2 = progress * 100;
        int i3 = this.f40241y;
        if (i3 <= 800) {
            this.f40236g = i3;
        }
        this.f40241y = i2;
        this.f40240s = (i2 - this.f40236g) / 10;
        this.f40237h.removeMessages(42);
        this.f40237h.sendEmptyMessage(42);
    }

    public HybridProgressView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f40239p = new Rect(0, 0, 0, 0);
        this.f40236g = 0;
        this.f40241y = 0;
        this.f40238i = context.getResources().getDrawable(R.drawable.hybrid_progress_reverse);
        this.f40237h = new HandlerC7124k(Looper.getMainLooper());
        this.f40242z = new Rect(0, 0, 0, 0);
    }
}
