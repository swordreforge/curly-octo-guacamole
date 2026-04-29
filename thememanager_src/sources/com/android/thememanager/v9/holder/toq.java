package com.android.thememanager.v9.holder;

import android.app.Activity;
import android.util.ArrayMap;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.kja0;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.recommend.model.entity.element.DesignerElement;
import com.android.thememanager.util.C2782h;
import i1.C6077k;
import yz.C7794k;
import z4.C7796k;

/* JADX INFO: compiled from: ElementDetailAuthorAttentionListViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends RecyclerView.fti implements View.OnClickListener, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: c */
    private static final String f17117c = "author_already_attention";

    /* JADX INFO: renamed from: e */
    private static final boolean f17118e = true;

    /* JADX INFO: renamed from: f */
    private static final String f17119f = "author_attention";

    /* JADX INFO: renamed from: j */
    private static final boolean f17120j = false;

    /* JADX INFO: renamed from: g */
    private ImageView f17121g;

    /* JADX INFO: renamed from: h */
    private InterfaceC7942toq f17122h;

    /* JADX INFO: renamed from: i */
    private int f17123i;

    /* JADX INFO: renamed from: k */
    private kja0 f17124k;

    /* JADX INFO: renamed from: l */
    private String f17125l;

    /* JADX INFO: renamed from: n */
    private FrameLayout f17126n;

    /* JADX INFO: renamed from: p */
    private TextView f17127p;

    /* JADX INFO: renamed from: q */
    private LinearLayout f17128q;

    /* JADX INFO: renamed from: r */
    private String f17129r;

    /* JADX INFO: renamed from: s */
    private Button f17130s;

    /* JADX INFO: renamed from: t */
    private String f17131t;

    /* JADX INFO: renamed from: y */
    private ImageView f17132y;

    /* JADX INFO: renamed from: z */
    private String f17133z;

    /* JADX INFO: renamed from: com.android.thememanager.v9.holder.toq$k */
    /* JADX INFO: compiled from: ElementDetailAuthorAttentionListViewHolder.java */
    class C2863k implements C2782h.q {
        C2863k() {
        }

        @Override // com.android.thememanager.util.C2782h.q
        /* JADX INFO: renamed from: k */
        public void mo6541k() {
            toq.this.f17122h.mo8327k(false, toq.this.f17133z, toq.this.f17131t);
        }

        @Override // com.android.thememanager.util.C2782h.q
        public void toq() {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.holder.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ElementDetailAuthorAttentionListViewHolder.java */
    public interface InterfaceC7942toq {
        /* JADX INFO: renamed from: k */
        void mo8327k(boolean value, String userId, String authorName);
    }

    public toq(View itemView) {
        super(itemView);
        o1t();
    }

    private void jk(boolean attention) {
        com.android.thememanager.basemodule.analysis.kja0.m6641s(attention ? "ATTENTION" : "DIS_ATTENTION", com.android.thememanager.basemodule.analysis.toq.o2sn, this.f17129r, null);
        ArrayMap<String, Object> arrayMapKja0 = C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.o2sn, this.f17129r, "");
        arrayMapKja0.put("author", this.f17125l);
        C1708s.f7l8().ld6().n5r1(attention ? "ATTENTION" : "DIS_ATTENTION", C1706p.ki(arrayMapKja0));
    }

    private void o1t() {
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.root);
        this.f17128q = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f17121g = (ImageView) this.itemView.findViewById(R.id.author_portrait);
        this.f17127p = (TextView) this.itemView.findViewById(R.id.author_name);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.author_follow_container);
        this.f17126n = frameLayout;
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.author_attention_iv);
        this.f17132y = imageView;
        imageView.setVisibility(0);
        this.f17132y.setOnClickListener(this);
        Button button = (Button) this.itemView.findViewById(R.id.author_follow_btn);
        this.f17130s = button;
        button.setVisibility(0);
        this.f17130s.setOnClickListener(this);
        Activity activityKi = C1819o.ki(this.itemView.getContext());
        if (activityKi instanceof kja0) {
            this.f17124k = (kja0) activityKi;
        } else {
            C7794k.f7l8("activity is " + activityKi);
        }
        C6077k.m22377z(this.f17128q, this.f17132y, this.f17130s);
    }

    public void fu4() {
        this.f17130s.setVisibility(8);
        this.f17132y.setTag(f17117c);
        this.f17132y.setVisibility(0);
        C2782h.f16522s.put(this.f17123i, f17117c);
        C2782h.m9787k();
        nn86.toq(this.f17124k.getResources().getText(R.string.author_attention_success), 0);
        jk(true);
    }

    public void mcp(DesignerElement item, int position) {
        C7796k designer = item.getDesigner();
        if (designer == null) {
            return;
        }
        this.f17123i = position;
        this.f17133z = designer.userId;
        String str = C2782h.f16522s.get(position);
        if (str == null) {
            if (item.getTotal() == 0) {
                this.f17132y.setTag(f17119f);
                this.f17130s.setVisibility(0);
                this.f17132y.setVisibility(8);
                C2782h.f16522s.put(position, f17119f);
            } else {
                this.f17130s.setVisibility(8);
                this.f17132y.setVisibility(0);
                this.f17132y.setTag(f17117c);
                C2782h.f16522s.put(position, f17117c);
            }
        } else if (f17119f.equals(str)) {
            this.f17132y.setVisibility(8);
            this.f17130s.setVisibility(0);
        } else if (f17117c.equals(str)) {
            this.f17132y.setVisibility(0);
            this.f17130s.setVisibility(8);
        }
        String str2 = designer.userName;
        this.f17131t = str2;
        this.f17127p.setText(str2);
        kja0 kja0Var = this.f17124k;
        if (kja0Var == null) {
            return;
        }
        x2.m6782y(kja0Var, designer.profilePic, this.f17121g, x2.fn3e().gvn7(R.drawable.avatar_default));
        this.f17129r = designer.userId + designer.userName;
        this.f17125l = designer.designerId;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        int id = v2.getId();
        if (id != R.id.author_attention_iv && id != R.id.author_follow_btn) {
            if (id != R.id.root) {
                return;
            }
            zurt zurtVarY9n = ld6.y9n(this.f17131t, -1, this.f17124k.etdu().getResourceStamp(), this.f17125l, this.f17133z);
            String str = this.f17131t;
            C2782h.m9789p(str, String.format(InterfaceC1925p.kfxm, str), zurtVarY9n, this.f17124k);
            return;
        }
        if (this.f17122h == null) {
            return;
        }
        if (f17119f.equals(this.f17132y.getTag())) {
            this.f17122h.mo8327k(true, this.f17133z, this.f17131t);
        } else {
            C2782h.m9791s(this.f17124k, new C2863k());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m10179t(InterfaceC7942toq attentionCallback) {
        this.f17122h = attentionCallback;
    }

    public void wvg() {
        nn86.toq(this.f17124k.getResources().getText(R.string.online_no_network), 0);
    }

    /* JADX INFO: renamed from: z */
    public void m10180z() {
        this.f17130s.setVisibility(0);
        this.f17132y.setTag(f17119f);
        this.f17132y.setVisibility(8);
        C2782h.f16522s.put(this.f17123i, f17119f);
        C2782h.toq();
        jk(false);
    }
}
