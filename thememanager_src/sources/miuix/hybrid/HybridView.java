package miuix.hybrid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.fn3e;
import java.lang.ref.WeakReference;
import miuix.androidbasewidget.widget.ProgressBar;
import miuix.hybrid.internal.HybridProgressView;
import miuix.hybrid.internal.WebContainerView;
import miuix.hybrid.internal.provider.C7130g;
import miuix.hybrid.internal.provider.C7132n;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class HybridView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    private static final int f40151c = 0;

    /* JADX INFO: renamed from: e */
    private static final int f40152e = 1;

    /* JADX INFO: renamed from: j */
    private static final int f40153j = 2;

    /* JADX INFO: renamed from: f */
    private boolean f40154f;

    /* JADX INFO: renamed from: g */
    private ViewGroup f40155g;

    /* JADX INFO: renamed from: h */
    private ki f40156h;

    /* JADX INFO: renamed from: i */
    private miuix.hybrid.internal.f7l8 f40157i;

    /* JADX INFO: renamed from: k */
    private final miuix.hybrid.internal.provider.zy f40158k;

    /* JADX INFO: renamed from: l */
    private WeakReference<Fragment> f40159l;

    /* JADX INFO: renamed from: n */
    private HybridProgressView f40160n;

    /* JADX INFO: renamed from: p */
    private final C7130g f40161p;

    /* JADX INFO: renamed from: q */
    private ProgressBar f40162q;

    /* JADX INFO: renamed from: r */
    private boolean f40163r;

    /* JADX INFO: renamed from: s */
    private final WebContainerView f40164s;

    /* JADX INFO: renamed from: t */
    private final boolean f40165t;

    /* JADX INFO: renamed from: y */
    private final TextView f40166y;

    /* JADX INFO: renamed from: z */
    private final int f40167z;

    public HybridView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.s4y, 0, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f40167z = i2;
        this.f40165t = typedArrayObtainStyledAttributes.getBoolean(0, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(2, false);
        typedArrayObtainStyledAttributes.recycle();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.hybrid_view_layout, (ViewGroup) this, true);
        C7130g c7130gM25841k = C7132n.m25841k(context);
        this.f40161p = c7130gM25841k;
        miuix.hybrid.internal.provider.zy qVar = c7130gM25841k.toq(context, this);
        this.f40158k = qVar;
        WebContainerView webContainerView = (WebContainerView) findViewById(R.id.webContainer);
        this.f40164s = webContainerView;
        webContainerView.setWebView(qVar.mo25860y());
        if (i2 == 1) {
            this.f40162q = (ProgressBar) findViewById(R.id.progress_circular);
        } else if (i2 == 2) {
            this.f40160n = (HybridProgressView) findViewById(R.id.progress_horizontal);
        }
        TextView textView = (TextView) findViewById(R.id.hybrid_provider);
        this.f40166y = textView;
        if (z2) {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ld6(View view) {
        qrj();
        setReloadContentVisibility(8);
    }

    private void setReloadContentVisibility(int visibility) {
        int childCount = this.f40155g.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f40155g.getChildAt(i2).setVisibility(visibility);
        }
    }

    public void f7l8(Canvas canvas) {
        this.f40158k.f7l8(canvas);
    }

    /* JADX INFO: renamed from: g */
    public void m25765g() {
        this.f40157i.m25804p();
        this.f40158k.mo25852g();
    }

    public int getContentHeight() {
        return this.f40158k.mo25859s();
    }

    public WeakReference<Fragment> getHybridFragmentWeakReference() {
        return this.f40159l;
    }

    miuix.hybrid.internal.f7l8 getHybridManager() {
        return this.f40157i;
    }

    @dd
    public WebView getRealWebView() {
        miuix.hybrid.internal.provider.zy zyVar = this.f40158k;
        if (zyVar == null) {
            return null;
        }
        View viewMo25860y = zyVar.mo25860y();
        if (viewMo25860y instanceof WebView) {
            return (WebView) viewMo25860y;
        }
        return null;
    }

    public float getScale() {
        return this.f40158k.x2();
    }

    public ki getSettings() {
        if (this.f40156h == null) {
            this.f40156h = this.f40158k.qrj();
        }
        return this.f40156h;
    }

    public String getTitle() {
        return this.f40158k.n7h();
    }

    public String getUrl() {
        return this.f40158k.kja0();
    }

    miuix.hybrid.internal.provider.zy getWebView() {
        return this.f40158k;
    }

    /* JADX INFO: renamed from: n */
    public AbstractC7149n m25766n() {
        return this.f40158k.mo25856n();
    }

    void n7h() {
        if (this.f40165t) {
            if (this.f40155g == null) {
                ViewGroup viewGroup = (ViewGroup) ((ViewStub) findViewById(R.id.hybrid_reload_stub)).inflate();
                this.f40155g = viewGroup;
                ((Button) viewGroup.findViewById(R.id.reload)).setOnClickListener(new View.OnClickListener() { // from class: miuix.hybrid.t8r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f40354k.ld6(view);
                    }
                });
            }
            this.f40155g.setVisibility(0);
            setReloadContentVisibility(0);
            this.f40158k.mo25854i(8);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m25767p() {
        return this.f40154f;
    }

    /* JADX INFO: renamed from: q */
    public void m25768q(boolean includeDiskFiles) {
        this.f40158k.mo25858q(includeDiskFiles);
    }

    public void qrj() {
        this.f40158k.ki();
    }

    /* JADX INFO: renamed from: s */
    void m25769s() {
        if (this.f40165t) {
            ViewGroup viewGroup = this.f40155g;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.f40158k.mo25854i(0);
        }
    }

    public void setAllowMultiple(boolean allowMultiple) {
        this.f40154f = allowMultiple;
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        this.f40158k.t8r(downloadListener);
    }

    public void setHybridChromeClient(qrj client) {
        client.zurt(this.f40157i);
        this.f40158k.fn3e(this.f40161p.mo25837k(client, this));
    }

    public void setHybridFragment(Fragment fragment) {
        this.f40159l = new WeakReference<>(fragment);
    }

    void setHybridManager(miuix.hybrid.internal.f7l8 manager) {
        this.f40157i = manager;
    }

    public void setHybridViewClient(C7123i client) {
        client.m25793g(this.f40157i);
        this.f40158k.zurt(this.f40161p.zy(client, this));
    }

    void setLoadingError(boolean loadingError) {
        this.f40163r = loadingError;
    }

    void setProgress(int progress) {
        HybridProgressView hybridProgressView;
        if (progress > 80 && !this.f40163r) {
            m25769s();
        }
        if (progress == 100) {
            this.f40164s.setBackground(null);
        }
        ProgressBar progressBar = this.f40162q;
        if (progressBar == null && this.f40160n == null) {
            return;
        }
        int i2 = this.f40167z;
        if (i2 == 1) {
            if (progressBar == null) {
                return;
            }
            if (progressBar.getVisibility() == 8) {
                this.f40162q.setVisibility(0);
            }
            this.f40162q.setProgress(progress);
            if (progress == this.f40162q.getMax()) {
                this.f40162q.setVisibility(8);
                return;
            }
            return;
        }
        if (i2 != 2 || (hybridProgressView = this.f40160n) == null) {
            return;
        }
        if (hybridProgressView.getVisibility() == 8) {
            this.f40160n.setVisibility(0);
        }
        this.f40160n.setProgress(progress);
        if (progress == this.f40160n.getMax()) {
            this.f40160n.setVisibility(8);
        }
    }

    public void setPullableStatus(boolean status) {
        this.f40164s.setPullableStatus(status);
    }

    void setWebProvider(String url) {
        this.f40166y.setText(Uri.parse(url).getHost());
    }

    public void toq(Object object, String name) {
        this.f40158k.mo25855k(object, name);
    }

    public void x2(String url) {
        this.f40158k.cdj(url);
    }

    /* JADX INFO: renamed from: y */
    public void m25770y() {
        this.f40158k.mo25853h();
    }

    public boolean zy() {
        return this.f40158k.toq();
    }
}
