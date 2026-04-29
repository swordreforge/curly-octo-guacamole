package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.recommend.presenter.audio.AudioResourceHandler;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.recommend.view.widget.DialogInterfaceOnClickListenerC2462k;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import miuix.appcompat.app.ki;
import miuix.core.util.C7083n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseRingtoneElementViewHolder<T> extends BaseViewHolder<T> {

    /* JADX INFO: renamed from: e */
    private static final String f13793e = "RINGTONE_USE";

    /* JADX INFO: renamed from: j */
    private static final String f13794j = "RINGTONE_TRY";

    /* JADX INFO: renamed from: m */
    private static final String f13795m = "https://iring.diyring.cc/friendv2/23a539db75168208?wno=%s#login";

    /* JADX INFO: renamed from: o */
    private static final int f13796o = 5;

    /* JADX INFO: renamed from: c */
    private p000a.zy f13797c;

    /* JADX INFO: renamed from: f */
    protected String f13798f;

    /* JADX INFO: renamed from: g */
    protected AudioResourceHandler f13799g;

    /* JADX INFO: renamed from: h */
    private DialogInterfaceOnClickListenerC2462k f13800h;

    /* JADX INFO: renamed from: i */
    private miuix.appcompat.app.ki f13801i;

    /* JADX INFO: renamed from: l */
    protected List<String> f13802l;

    /* JADX INFO: renamed from: p */
    private miuix.appcompat.app.ki f13803p;

    /* JADX INFO: renamed from: r */
    protected String f13804r;

    /* JADX INFO: renamed from: s */
    protected int f13805s;

    /* JADX INFO: renamed from: t */
    private Resource f13806t;

    /* JADX INFO: renamed from: y */
    protected String f13807y;

    /* JADX INFO: renamed from: z */
    private UIProduct f13808z;

    class f7l8 implements DialogInterfaceOnClickListenerC2462k.zy {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ UIProduct f13810k;

        f7l8(final UIProduct val$product) {
            this.f13810k = val$product;
        }

        @Override // com.android.thememanager.recommend.view.widget.DialogInterfaceOnClickListenerC2462k.zy
        /* JADX INFO: renamed from: k */
        public void mo8592k(String resCode) {
            BaseRingtoneElementViewHolder.this.m6706z().d8wk(this.f13810k.trackId, "RINGTONE_USE_" + resCode + "&" + com.android.thememanager.basemodule.analysis.zy.toq());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.BaseRingtoneElementViewHolder$g */
    class DialogInterfaceOnClickListenerC2372g implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ UIProduct f13812k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Resource f13813n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Context f13814q;

        DialogInterfaceOnClickListenerC2372g(final UIProduct val$product, final Context val$context, final Resource val$resource) {
            this.f13812k = val$product;
            this.f13814q = val$context;
            this.f13813n = val$resource;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            if (BaseRingtoneElementViewHolder.this.nmn5() && BaseRingtoneElementViewHolder.this.ch(this.f13812k.playtimeDisplay)) {
                BaseRingtoneElementViewHolder.this.dr(this.f13814q, this.f13813n);
            } else {
                BaseRingtoneElementViewHolder.this.f13799g.m8526s("ringtone", this.f13813n);
            }
            if (BaseRingtoneElementViewHolder.this.f13803p != null) {
                BaseRingtoneElementViewHolder.this.f13803p.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.BaseRingtoneElementViewHolder$k */
    class DialogInterfaceOnClickListenerC2373k implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f13815k;

        DialogInterfaceOnClickListenerC2373k(final Resource val$resource) {
            this.f13815k = val$resource;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            BaseRingtoneElementViewHolder.this.f13799g.m8526s("ringtone", this.f13815k);
            if (BaseRingtoneElementViewHolder.this.f13801i != null) {
                BaseRingtoneElementViewHolder.this.f13801i.dismiss();
                BaseRingtoneElementViewHolder.this.f13801i = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.BaseRingtoneElementViewHolder$n */
    class C2374n implements p000a.zy {
        C2374n() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            BaseRingtoneElementViewHolder baseRingtoneElementViewHolder = BaseRingtoneElementViewHolder.this;
            baseRingtoneElementViewHolder.lv5(baseRingtoneElementViewHolder.f13808z, BaseRingtoneElementViewHolder.this.f13806t);
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                lvui.ki(BaseRingtoneElementViewHolder.this.fn3e(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.BaseRingtoneElementViewHolder$q */
    class ViewOnClickListenerC2375q implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ UIProduct f13818k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Resource f13820q;

        ViewOnClickListenerC2375q(final UIProduct val$product, final Resource val$resource) {
            this.f13818k = val$product;
            this.f13820q = val$resource;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (!com.android.thememanager.basemodule.privacy.x2.zy() && (BaseRingtoneElementViewHolder.this.ni7() instanceof com.android.thememanager.basemodule.base.toq)) {
                ((com.android.thememanager.basemodule.base.toq) BaseRingtoneElementViewHolder.this.ni7()).u38j().m6909i(BaseRingtoneElementViewHolder.this.ki(), null);
                return;
            }
            BaseRingtoneElementViewHolder.this.f13808z = this.f13818k;
            BaseRingtoneElementViewHolder.this.f13806t = this.f13820q;
            if (lvui.kja0((com.android.thememanager.basemodule.base.toq) BaseRingtoneElementViewHolder.this.ni7(), BaseRingtoneElementViewHolder.this.f13797c)) {
                return;
            }
            BaseRingtoneElementViewHolder.this.lv5(this.f13818k, this.f13820q);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.BaseRingtoneElementViewHolder$s */
    class DialogInterfaceOnClickListenerC2376s implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2376s() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (BaseRingtoneElementViewHolder.this.f13801i != null) {
                BaseRingtoneElementViewHolder.this.f13801i.dismiss();
                BaseRingtoneElementViewHolder.this.f13801i = null;
            }
        }
    }

    class toq implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f13823k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ UIProduct f13824n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f13825q;

        toq(final Resource val$resource, final View val$audioLoading, final UIProduct val$product) {
            this.f13823k = val$resource;
            this.f13825q = val$audioLoading;
            this.f13824n = val$product;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (BaseRingtoneElementViewHolder.this.f13799g.m8525p(this.f13823k.getAssemblyId())) {
                BaseRingtoneElementViewHolder.this.f13799g.n7h();
                this.f13825q.setVisibility(8);
                return;
            }
            if (BaseRingtoneElementViewHolder.this.f13799g.m8527y(this.f13823k)) {
                BaseRingtoneElementViewHolder.this.f13799g.x2(this.f13823k.getAssemblyId());
                this.f13825q.setVisibility(0);
            }
            BaseRingtoneElementViewHolder.this.m6706z().d8wk(this.f13824n.trackId, "RINGTONE_TRY&" + com.android.thememanager.basemodule.analysis.zy.toq());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.BaseRingtoneElementViewHolder$y */
    class ViewOnClickListenerC2377y implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f13826k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f13828q;

        ViewOnClickListenerC2377y(final Resource val$resource, final String val$trackId) {
            this.f13826k = val$resource;
            this.f13828q = val$trackId;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (!com.android.thememanager.basemodule.privacy.x2.zy() && (BaseRingtoneElementViewHolder.this.ni7() instanceof com.android.thememanager.basemodule.base.toq)) {
                ((com.android.thememanager.basemodule.base.toq) BaseRingtoneElementViewHolder.this.ni7()).u38j().m6909i(BaseRingtoneElementViewHolder.this.ki(), null);
                return;
            }
            Intent intentM9541i = com.android.thememanager.toq.m9541i(BaseRingtoneElementViewHolder.this.ki(), BaseRingtoneElementViewHolder.this.fn3e().getResources().getString(R.string.set_color_ring_back_tone), BaseRingtoneElementViewHolder.zp(this.f13826k.getColorRingId()));
            try {
                intentM9541i.putExtra("REQUEST_RESOURCE_CODE", "ringtone");
                intentM9541i.putExtra("uuid", this.f13826k.getOnlineId());
                HashMap map = new HashMap(3);
                String str = BaseRingtoneElementViewHolder.this.f13804r;
                if (str != null) {
                    map.put(com.android.thememanager.basemodule.analysis.toq.olj, str);
                }
                List<String> list = BaseRingtoneElementViewHolder.this.f13802l;
                if (list != null) {
                    map.put(com.android.thememanager.basemodule.analysis.toq.c7g, list);
                }
                map.put(com.android.thememanager.basemodule.analysis.toq.i0, BaseRingtoneElementViewHolder.this.f13798f);
                intentM9541i.putExtra(ThemeTabActivity.ac, map);
                BaseRingtoneElementViewHolder.this.ki().startActivity(intentM9541i);
                C1708s.f7l8().ld6().ni7(C1706p.kja0(null, this.f13828q, com.android.thememanager.basemodule.analysis.toq.o3));
            } catch (ActivityNotFoundException e2) {
                Log.e(DialogInterfaceOnClickListenerC2462k.class.getSimpleName(), "resolve Activity happens error " + e2);
            }
        }
    }

    class zy implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f13829k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ UIProduct f13831q;

        zy(final Resource val$resource, final UIProduct val$product) {
            this.f13829k = val$resource;
            this.f13831q = val$product;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (BaseRingtoneElementViewHolder.this.f13799g.m8525p(this.f13829k.getAssemblyId())) {
                BaseRingtoneElementViewHolder.this.f13799g.n7h();
                return;
            }
            BaseRingtoneElementViewHolder.this.f13799g.x2(this.f13829k.getAssemblyId());
            BaseRingtoneElementViewHolder.this.f13799g.m8527y(this.f13829k);
            BaseRingtoneElementViewHolder.this.m6706z().d8wk(this.f13831q.trackId, "RINGTONE_TRY&" + com.android.thememanager.basemodule.analysis.zy.toq());
        }
    }

    public BaseRingtoneElementViewHolder(@zy.lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13797c = new C2374n();
        this.f13799g = adapter.oc();
        this.f13807y = ki().getResources().getString(R.string.item_resource_audio_divider);
        if (itemView.getContext() instanceof InterfaceC0954z) {
            ((InterfaceC0954z) itemView.getContext()).getLifecycle().mo4451k(new InterfaceC0928g() { // from class: com.android.thememanager.recommend.view.listview.viewholder.BaseRingtoneElementViewHolder.1
                @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
                public void onDestroy(@zy.lvui InterfaceC0954z owner) {
                    BaseRingtoneElementViewHolder.this.m8583a();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m8583a() {
        miuix.appcompat.app.ki kiVar = this.f13803p;
        if (kiVar != null && kiVar.isShowing()) {
            this.f13803p.dismiss();
            this.f13803p = null;
        }
        DialogInterfaceOnClickListenerC2462k dialogInterfaceOnClickListenerC2462k = this.f13800h;
        if (dialogInterfaceOnClickListenerC2462k != null) {
            dialogInterfaceOnClickListenerC2462k.m8846y();
            this.f13800h = null;
        }
        miuix.appcompat.app.ki kiVar2 = this.f13801i;
        if (kiVar2 == null || !kiVar2.isShowing()) {
            return;
        }
        this.f13801i.dismiss();
        this.f13801i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ch(String duration) {
        if (TextUtils.isEmpty(duration)) {
            return false;
        }
        String[] strArrSplit = duration.split(":");
        if (strArrSplit.length < 2) {
            return false;
        }
        return Integer.parseInt(strArrSplit[0]) > 0 || Integer.parseInt(strArrSplit[1]) >= 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dr(Context context, Resource resource) {
        if (this.f13801i == null) {
            this.f13801i = new ki.C6947k(context).uv6(context.getString(R.string.ringtone_confirm_dialog_title)).m25047s(true).m25050z(context.getString(R.string.ringtone_confirm_dialog_message)).x9kr(context.getString(android.R.string.ok), new DialogInterfaceOnClickListenerC2373k(resource)).jk(context.getString(android.R.string.cancel), new DialogInterfaceOnClickListenerC2376s()).m25037g();
        }
        if (this.f13801i.isShowing()) {
            return;
        }
        this.f13801i.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lv5(UIProduct product, Resource resource) {
        if (wvg().m8549l()) {
            Context contextFn3e = fn3e();
            if (this.f13803p == null) {
                this.f13803p = new ki.C6947k(contextFn3e).uv6(contextFn3e.getString(R.string.resource_title_select_ringtone)).m25047s(false).m25050z(contextFn3e.getString(R.string.resource_select_ringtone_confirm)).x9kr(this.itemView.getContext().getString(android.R.string.ok), new DialogInterfaceOnClickListenerC2372g(product, contextFn3e, resource)).jk(contextFn3e.getString(android.R.string.cancel), null).m25037g();
            }
            if (this.f13803p.isShowing()) {
                return;
            }
            this.f13803p.show();
            return;
        }
        DialogInterfaceOnClickListenerC2462k dialogInterfaceOnClickListenerC2462k = new DialogInterfaceOnClickListenerC2462k(ki(), resource, this.f13799g, new f7l8(product), ch(product.playtimeDisplay));
        this.f13800h = dialogInterfaceOnClickListenerC2462k;
        this.f13801i = dialogInterfaceOnClickListenerC2462k.m8845s();
        this.f13800h.x2();
        m6706z().d8wk(product.trackId, "RINGTONE_USE&" + com.android.thememanager.basemodule.analysis.zy.toq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean nmn5() {
        int i2 = this.f13805s;
        return i2 == 2 || i2 == 16 || i2 == 4096 || i2 == 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zp(String id) {
        return String.format("https://iring.diyring.cc/friendv2/23a539db75168208?wno=%s#login", id);
    }

    protected Resource a98o(UIProduct product) {
        Map<String, Resource> mapM8591x = m8591x();
        Resource resource = mapM8591x != null ? mapM8591x.get(product.uuid) : null;
        if (resource == null) {
            resource = new Resource();
        }
        String str = product.downloadUrl;
        if (str == null) {
            Log.w("Theme", "buildResource: error ,downloadUrl is null");
            return resource;
        }
        String strSubstring = str.substring(0, str.lastIndexOf("/"));
        String strM25584g = C7083n.m25584g(strSubstring);
        if (TextUtils.isEmpty(resource.getAssemblyId())) {
            resource.setAssemblyId(product.uuid);
        }
        if (TextUtils.isEmpty(resource.getTitle())) {
            resource.getOnlineInfo().setTitle(product.name);
        }
        if (TextUtils.isEmpty(resource.getOnlineId())) {
            resource.setOnlineId(product.uuid);
        }
        if (TextUtils.isEmpty(resource.getContentPath())) {
            resource.setContentPath(product.localPath);
        }
        if (resource.getOnlineInfo().getSize() == 0) {
            resource.getOnlineInfo().setSize(product.fileSizeInKB);
        }
        if (resource.getThumbnails().isEmpty()) {
            resource.addThumbnail(new PathEntry(C1792n.m6935h(strM25584g), strSubstring));
        }
        resource.setColorRingId(product.colorRingId);
        if (!TextUtils.isEmpty(product.trackId)) {
            resource.getOnlineInfo().setTrackId(product.trackId);
        }
        return resource;
    }

    protected void bo(View ringbacktoneView, Resource resource, String trackId) {
        if (ringbacktoneView != null) {
            if (wvg().m8549l() || TextUtils.isEmpty(resource.getColorRingId())) {
                ringbacktoneView.setVisibility(8);
            } else {
                ringbacktoneView.setVisibility(0);
                ringbacktoneView.setOnClickListener(new ViewOnClickListenerC2377y(resource, trackId));
            }
        }
    }

    protected void c8jq(View audioLoading, int drawableId) {
        if (audioLoading instanceof TextView) {
            Drawable drawable = ki().getResources().getDrawable(drawableId);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            ((TextView) audioLoading).setCompoundDrawables(drawable, null, null, null);
        }
    }

    protected void gyi(View itemView, final View audioLoading, final UIProduct product) {
        itemView.setOnClickListener(new zy(a98o(product), product));
    }

    protected void t8iq(View itemView, final View audioLoading, final UIProduct product) {
        itemView.setOnClickListener(new toq(a98o(product), audioLoading, product));
    }

    /* JADX INFO: renamed from: u */
    protected void m8590u(View moreView, View ringbacktone, final UIProduct product, boolean isDark) {
        Resource resourceA98o = a98o(product);
        bo(ringbacktone, resourceA98o, product.trackId);
        if (moreView instanceof ImageView) {
            if (wvg().m8549l()) {
                if (isDark) {
                    ((ImageView) moreView).setImageResource(R.drawable.ring_add_dark);
                } else {
                    ((ImageView) moreView).setImageResource(R.drawable.ring_add_light);
                }
                C1812k.m7106k(moreView, R.string.add);
            } else {
                ((ImageView) moreView).setImageResource(R.drawable.ring_more);
                C1812k.m7106k(moreView, R.string.accessibiliy_description_content_more);
            }
        }
        moreView.setOnClickListener(new ViewOnClickListenerC2375q(product, resourceA98o));
    }

    /* JADX INFO: renamed from: x */
    protected Map<String, Resource> m8591x() {
        return null;
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        m8583a();
    }
}
