package com.android.thememanager.module.detail.view;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.ForegroundImageView;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1922n;
import com.android.thememanager.controller.online.C1944y;
import com.android.thememanager.detail.theme.view.widget.AodCacheView;
import com.android.thememanager.detail.theme.view.widget.MamlAodPreview;
import ek5k.C6002g;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import miuix.core.util.C7083n;
import miuix.smooth.SmoothFrameLayout2;
import org.json.JSONObject;
import yz.C7794k;

/* JADX INFO: loaded from: classes2.dex */
public class AodPreview extends SmoothFrameLayout2 {

    /* JADX INFO: renamed from: a */
    protected String f13171a;

    /* JADX INFO: renamed from: b */
    private int f13172b;

    /* JADX INFO: renamed from: c */
    private SmoothFrameLayout2 f13173c;

    /* JADX INFO: renamed from: e */
    private ForegroundImageView f13174e;

    /* JADX INFO: renamed from: f */
    protected View f13175f;

    /* JADX INFO: renamed from: j */
    protected MamlAodPreview f13176j;

    /* JADX INFO: renamed from: l */
    protected View f13177l;

    /* JADX INFO: renamed from: m */
    protected x2.C1735g f13178m;

    /* JADX INFO: renamed from: o */
    private AodCacheView f13179o;

    /* JADX INFO: renamed from: u */
    private C2249k f13180u;

    /* JADX INFO: renamed from: x */
    protected String f13181x;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.AodPreview$k */
    public static class C2249k {

        /* JADX INFO: renamed from: k */
        private List<WeakReference<AodPreview>> f13182k = new ArrayList();

        /* JADX INFO: renamed from: n */
        private boolean f13183n;

        /* JADX INFO: renamed from: q */
        private Resource f13184q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private k f60538toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f60539zy;

        /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.AodPreview$k$k */
        private static class k extends AsyncTask<Void, Void, Boolean> {

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private static final String f60540toq = "CacheTask";

            /* JADX INFO: renamed from: k */
            private WeakReference<C2249k> f13185k;

            public k(C2249k controller) {
                this.f13185k = new WeakReference<>(controller);
            }

            private boolean toq(@zy.lvui String mtzPath, @zy.lvui String aodPath) {
                try {
                    ZipFile zipFile = new ZipFile(mtzPath);
                    ZipEntry entry = zipFile.getEntry("aod");
                    if (entry == null) {
                        return false;
                    }
                    File file = new File(aodPath);
                    if (file.exists()) {
                        file.delete();
                    }
                    C7083n.m25589q(zipFile.getInputStream(entry), file);
                    zipFile.close();
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(Void... voids) {
                String strM8429s;
                Object obj;
                if (isCancelled()) {
                    return Boolean.FALSE;
                }
                C2249k c2249k = this.f13185k.get();
                if (c2249k == null) {
                    return Boolean.FALSE;
                }
                Resource resource = c2249k.f13184q;
                String strM8389g = c2249k.m8389g(true);
                if (TextUtils.isEmpty(strM8389g)) {
                    return Boolean.FALSE;
                }
                String strM8389g2 = c2249k.m8389g(false);
                try {
                    strM8429s = com.android.thememanager.o1t.m8429s(resource, C2082k.zy().m8001n().m10535g("aod"), null);
                } catch (C1922n | IOException e2) {
                    C7794k.toq(f60540toq, "Cache aod failed: " + e2);
                }
                if (strM8429s == null) {
                    Log.w(f60540toq, "doInBackground: baseUrl is null");
                    return Boolean.FALSE;
                }
                Pair<Integer, JSONObject> pairKi = C1944y.ki(C1915g.f7l8(new com.android.thememanager.controller.online.zurt(strM8429s)));
                if (((Integer) pairKi.first).intValue() == 0 && (obj = pairKi.second) != null) {
                    boolean qVar = new com.android.thememanager.controller.online.toq(resource.getOnlineId()).toq(new com.android.thememanager.controller.online.zurt(((JSONObject) obj).optString("downloadUrl", "")), strM8389g);
                    if (qVar && !(qVar = toq(strM8389g, strM8389g2))) {
                        new File(strM8389g).delete();
                    }
                    return Boolean.valueOf(qVar);
                }
                return Boolean.FALSE;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean aBoolean) {
                C2249k c2249k;
                super.onPostExecute(aBoolean);
                if (isCancelled() || (c2249k = this.f13185k.get()) == null) {
                    return;
                }
                c2249k.m8391p();
                c2249k.f7l8();
            }
        }

        public C2249k(String onlineId, Resource resource) {
            this.f60539zy = onlineId;
            this.f13184q = resource;
        }

        public void f7l8() {
            for (WeakReference<AodPreview> weakReference : this.f13182k) {
                if (weakReference.get() != null) {
                    weakReference.get().ld6();
                }
            }
        }

        @zy.dd
        /* JADX INFO: renamed from: g */
        public String m8389g(boolean isMtz) {
            File externalCacheDir = bf2.toq.toq().getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return externalCacheDir.getAbsolutePath() + "/aod/" + this.f60539zy + (isMtz ? ".mtz" : "");
        }

        /* JADX INFO: renamed from: n */
        public void m8390n(@zy.lvui AodPreview preview) {
            for (WeakReference<AodPreview> weakReference : this.f13182k) {
                if (weakReference.get() == preview) {
                    this.f13182k.remove(weakReference);
                    preview.setController(null);
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public void m8391p() {
            for (WeakReference<AodPreview> weakReference : this.f13182k) {
                if (weakReference.get() != null) {
                    weakReference.get().t8r();
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public void m8392q() {
            if (m8393s()) {
                this.f60538toq.cancel(true);
            }
            this.f60538toq = null;
        }

        /* JADX INFO: renamed from: s */
        public boolean m8393s() {
            k kVar = this.f60538toq;
            return (kVar == null || kVar.getStatus() == AsyncTask.Status.FINISHED) ? false : true;
        }

        public void toq(@zy.lvui AodPreview preview) {
            this.f13182k.add(new WeakReference<>(preview));
            preview.setController(this);
        }

        /* JADX INFO: renamed from: y */
        public boolean m8394y() {
            boolean z2 = true;
            String strM8389g = m8389g(true);
            if (TextUtils.isEmpty(strM8389g)) {
                return false;
            }
            File file = new File(strM8389g);
            boolean zExists = file.exists();
            if (!zExists) {
                return zExists;
            }
            try {
                try {
                    new ZipFile(file).close();
                } catch (IOException unused) {
                    return true;
                }
            } catch (IOException unused2) {
                file.delete();
                z2 = false;
            }
            return z2;
        }

        public void zy(boolean force) {
            if (m8394y()) {
                return;
            }
            if (!this.f13183n || force) {
                this.f13183n = true;
                k kVar = this.f60538toq;
                if (kVar != null) {
                    kVar.cancel(true);
                }
                k kVar2 = new k(this);
                this.f60538toq = kVar2;
                kVar2.executeOnExecutor(C6002g.x2(), new Void[0]);
            }
        }
    }

    public AodPreview(@zy.lvui Context context) {
        this(context, null);
    }

    private void fn3e() {
        com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) getContext(), this.f13171a, this.f13174e, this.f13178m);
        this.f13175f.setVisibility(0);
        this.f13176j.setVisibility(8);
        if (getContext() instanceof AbstractActivityC1717k) {
            ((AbstractActivityC1717k) getContext()).nme("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.x02, null);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m8383i() {
        this.f13175f.setVisibility(8);
        this.f13176j.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public /* synthetic */ void kja0(View view) {
        if (!com.android.thememanager.basemodule.utils.mcp.m7139n()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.online_no_network, 0);
            return;
        }
        C2249k c2249k = this.f13180u;
        if (c2249k != null) {
            c2249k.zy(true);
            this.f13179o.setState(this.f13180u.m8393s() ? 1 : 0);
        }
        if (getContext() instanceof AbstractActivityC1717k) {
            ((AbstractActivityC1717k) getContext()).d8wk(com.android.thememanager.basemodule.analysis.toq.zuk, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qrj(boolean z2) {
        if (z2) {
            return;
        }
        fn3e();
    }

    public void cdj() {
        MamlAodPreview mamlAodPreview = this.f13176j;
        if (mamlAodPreview != null) {
            mamlAodPreview.ld6();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m8386h() {
        MamlAodPreview mamlAodPreview = this.f13176j;
        if (mamlAodPreview != null) {
            mamlAodPreview.m7772p();
        }
    }

    public void ki() {
        MamlAodPreview mamlAodPreview = this.f13176j;
        if (mamlAodPreview != null) {
            mamlAodPreview.x2();
        }
    }

    public void ld6() {
        C2249k c2249k;
        if (TextUtils.isEmpty(this.f13181x) && (c2249k = this.f13180u) != null && c2249k.m8394y()) {
            this.f13181x = this.f13180u.m8389g(false);
        }
        if (TextUtils.isEmpty(this.f13181x)) {
            return;
        }
        this.f13176j.f7l8(this.f13181x, new MamlAodPreview.toq() { // from class: com.android.thememanager.module.detail.view.t8r
            @Override // com.android.thememanager.detail.theme.view.widget.MamlAodPreview.toq
            /* JADX INFO: renamed from: k */
            public final void mo7775k(boolean z2) {
                this.f13348k.qrj(z2);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void mo8387p(int width, int height, boolean hasCorner, boolean hasStroke, String imageUrl, String aodPath) {
        if (hasCorner) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.de_detail_corner_radius);
            this.f13172b = dimensionPixelOffset;
            this.f13173c.setCornerRadius(dimensionPixelOffset);
        }
        this.f13178m = com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(C1819o.m7166t(getResources().getColor(R.color.de_preview_placeholder_color), this.f13172b)).jk(0);
        if (C1819o.d2ok(getContext()) || C1807g.m7083t(getContext())) {
            this.f13178m.wvg(0);
        }
        ViewGroup.LayoutParams layoutParams = this.f13177l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(width, height);
        } else {
            layoutParams.width = width;
            layoutParams.height = height;
        }
        if (C1807g.zurt() && C1807g.m7083t(getContext())) {
            layoutParams.height = getResources().getDimensionPixelSize(R.dimen.de_fold_aod_preview_outer_height);
            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.de_fold_aod_preview_outer_width);
            if (hasStroke) {
                this.f13177l.setForeground(getContext().getDrawable(R.drawable.aod_item_foreground_frame));
            }
        } else if (hasStroke) {
            this.f13174e.setForeground(getContext().getDrawable(R.drawable.aod_item_foreground_frame));
        }
        this.f13177l.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f13175f.getLayoutParams();
        layoutParams2.width = width;
        layoutParams2.height = height;
        this.f13175f.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f13176j.getLayoutParams();
        layoutParams3.width = width;
        layoutParams3.height = height;
        this.f13176j.setLayoutParams(layoutParams3);
        this.f13176j.m7773y(this.f13172b, hasStroke);
        this.f13171a = imageUrl;
        this.f13181x = aodPath;
    }

    public void setController(C2249k controller) {
        this.f13180u = controller;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void t8r() {
        C2249k c2249k;
        if (TextUtils.isEmpty(this.f13181x) && (c2249k = this.f13180u) != null && c2249k.m8394y()) {
            this.f13181x = this.f13180u.m8389g(false);
        }
        if (!TextUtils.isEmpty(this.f13181x)) {
            m8383i();
            this.f13176j.f7l8(this.f13181x, null);
            return;
        }
        fn3e();
        if (this.f13180u == null || !com.android.thememanager.basemodule.utils.mcp.f7l8()) {
            return;
        }
        this.f13180u.zy(false);
        this.f13179o.setState(this.f13180u.m8393s() ? 1 : 0);
    }

    protected void x2() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.de_aod_preview, (ViewGroup) this, true);
        this.f13177l = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.static_preview_container);
        this.f13175f = viewFindViewById;
        this.f13173c = (SmoothFrameLayout2) viewFindViewById.findViewById(R.id.static_preview_container_sub);
        this.f13174e = (ForegroundImageView) this.f13175f.findViewById(R.id.static_preview);
        this.f13176j = (MamlAodPreview) this.f13177l.findViewById(R.id.anim_preview);
        AodCacheView aodCacheView = (AodCacheView) this.f13175f.findViewById(R.id.static_preview_cache);
        this.f13179o = aodCacheView;
        aodCacheView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13265k.kja0(view);
            }
        });
    }

    public void zurt(String aodPath) {
        if (TextUtils.isEmpty(aodPath)) {
            return;
        }
        this.f13181x = aodPath;
    }

    public AodPreview(@zy.lvui Context context, @zy.dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AodPreview(@zy.lvui Context context, @zy.dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        x2();
    }
}
