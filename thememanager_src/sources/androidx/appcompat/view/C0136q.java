package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p030n.C7397k;
import zy.hb;

/* JADX INFO: renamed from: androidx.appcompat.view.q */
/* JADX INFO: compiled from: ContextThemeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class C0136q extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    private int f588k;

    /* JADX INFO: renamed from: n */
    private Resources f589n;

    /* JADX INFO: renamed from: q */
    private Configuration f590q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Resources.Theme f46804toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private LayoutInflater f46805zy;

    public C0136q() {
        super(null);
    }

    /* JADX INFO: renamed from: q */
    private void m396q() {
        boolean z2 = this.f46804toq == null;
        if (z2) {
            this.f46804toq = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f46804toq.setTo(theme);
            }
        }
        m398n(this.f46804toq, this.f588k, z2);
    }

    private Resources toq() {
        if (this.f589n == null) {
            Configuration configuration = this.f590q;
            if (configuration == null) {
                this.f589n = super.getResources();
            } else {
                this.f589n = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f589n;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return toq();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f46805zy == null) {
            this.f46805zy = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f46805zy;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f46804toq;
        if (theme != null) {
            return theme;
        }
        if (this.f588k == 0) {
            this.f588k = C7397k.x2.d6c;
        }
        m396q();
        return this.f46804toq;
    }

    /* JADX INFO: renamed from: k */
    public void m397k(Configuration configuration) {
        if (this.f589n != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f590q != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f590q = new Configuration(configuration);
    }

    /* JADX INFO: renamed from: n */
    protected void m398n(Resources.Theme theme, int i2, boolean z2) {
        theme.applyStyle(i2, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.f588k != i2) {
            this.f588k = i2;
            m396q();
        }
    }

    public int zy() {
        return this.f588k;
    }

    public C0136q(Context context, @hb int i2) {
        super(context);
        this.f588k = i2;
    }

    public C0136q(Context context, Resources.Theme theme) {
        super(context);
        this.f46804toq = theme;
    }
}
