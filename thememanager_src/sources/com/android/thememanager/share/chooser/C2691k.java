package com.android.thememanager.share.chooser;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.AbstractC0067g;
import androidx.activity.result.InterfaceC0068k;
import androidx.activity.result.contract.toq;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.jp0y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.ni7;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.views.LoadingView;
import com.android.thememanager.share.C2708s;
import com.android.thememanager.share.C2716y;
import com.android.thememanager.share.wechat.AbstractC2712q;
import ek5k.C6002g;
import i1.C6077k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import miuix.appcompat.app.ki;
import p000a.InterfaceC0001q;
import zy.dd;

/* JADX INFO: renamed from: com.android.thememanager.share.chooser.k */
/* JADX INFO: compiled from: ShareChooserDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C2691k extends androidx.fragment.app.zy implements InterfaceC0001q {
    private static final String aj = "MiuiShareChooserDialog";
    private static final int ar = 2;
    private static final int bc = 3;
    public static final String bd = "WX_AVAILABLE_CHANGED";
    private static final int bs = 0;
    private static final int bu = 2;
    private static final int k0 = 1;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private RecyclerView f61051ab;
    private int ac;
    private String ad;
    private y an;
    private String as;
    private C2708s ax;
    private ImageView bb;
    private String bl;
    private LoadingView bp;
    private AbstractC0067g bq;
    private FrameLayout bv;
    private ArrayList<C2692q> id;
    private String in;
    private boolean bg = false;
    private boolean az = false;
    private com.android.thememanager.share.zy ba = new k();
    private g am = new toq();
    private p000a.zy ay = new zy();
    private jp0y<Intent> be = new n();

    /* JADX INFO: renamed from: com.android.thememanager.share.chooser.k$f7l8 */
    /* JADX INFO: compiled from: ShareChooserDialog.java */
    private static class f7l8 extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: k */
        private String f15988k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f61052toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private WeakReference<C2691k> f61053zy;

        public f7l8(C2691k dialog, String url, String savePath) {
            this.f15988k = url;
            this.f61052toq = savePath;
            this.f61053zy = new WeakReference<>(dialog);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            com.android.thememanager.detail.theme.util.toq.toq(bf2.toq.toq());
            return Boolean.valueOf(com.android.thememanager.detail.theme.util.toq.zy(bf2.toq.toq(), this.f15988k, this.f61052toq));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean result) {
            C2691k c2691k;
            if (!result.booleanValue() || (c2691k = this.f61053zy.get()) == null) {
                return;
            }
            c2691k.mj(this.f61052toq);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.share.chooser.k$g */
    /* JADX INFO: compiled from: ShareChooserDialog.java */
    interface g {
        /* JADX INFO: renamed from: k */
        void mo9407k(View view, int position);
    }

    /* JADX INFO: renamed from: com.android.thememanager.share.chooser.k$k */
    /* JADX INFO: compiled from: ShareChooserDialog.java */
    class k extends com.android.thememanager.share.zy {
        k() {
        }

        @Override // com.android.thememanager.share.zy
        /* JADX INFO: renamed from: z */
        public void mo9408z() {
            C2691k.this.an.ki();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.share.chooser.k$n */
    /* JADX INFO: compiled from: ShareChooserDialog.java */
    class n implements jp0y<Intent> {
        n() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(Intent intent) {
            if (TextUtils.equals(intent.getAction(), C2691k.bd) && intent.getBooleanExtra("new_value", false)) {
                C2691k.this.an.ki();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.share.chooser.k$q */
    /* JADX INFO: compiled from: ShareChooserDialog.java */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2716y.m9478k(0, 1);
            C2691k.this.mo4377w();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.share.chooser.k$toq */
    /* JADX INFO: compiled from: ShareChooserDialog.java */
    class toq implements g {
        toq() {
        }

        @Override // com.android.thememanager.share.chooser.C2691k.g
        /* JADX INFO: renamed from: k */
        public void mo9407k(View view, int position) {
            C2692q c2692q = (C2692q) C2691k.this.id.get(position);
            if (C2691k.this.ax != null) {
                C2691k.this.ax.m9462q(position, c2692q.m9411n());
            }
            View.OnClickListener onClickListenerZy = c2692q.zy();
            if (onClickListenerZy != null && (C2691k.this.ac == 0 || C2691k.this.ac == 3 || c2692q.m9410k() == 1)) {
                if (c2692q.m9410k() == 2) {
                    C2691k.this.ay.zy(view, onClickListenerZy);
                    if (lvui.x2(C2691k.this.getActivity(), C2691k.this.ay, C2691k.this.bq)) {
                        return;
                    }
                    C2691k.this.ay.mo0k();
                    return;
                }
                if (view != null) {
                    C2691k.this.bg = true;
                    onClickListenerZy.onClick(view);
                    C2691k.this.mo4377w();
                    return;
                }
                return;
            }
            if (C2691k.this.ac == 1) {
                nn86.m7150k(R.string.share_picture_loading, 0);
                Log.e(C2691k.aj, "Can NOT share via this invalid sharer.");
            } else if (C2691k.this.ac == 2) {
                if (mcp.m7139n()) {
                    C2691k.this.kq2f();
                    nn86.m7150k(R.string.share_picture_loading, 0);
                } else {
                    nn86.m7150k(R.string.online_no_network, 0);
                    C2691k.this.mo4377w();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.share.chooser.k$y */
    /* JADX INFO: compiled from: ShareChooserDialog.java */
    static final class y extends RecyclerView.AbstractC1060y<k> {

        /* JADX INFO: renamed from: g */
        private WeakReference<C2691k> f15992g;

        /* JADX INFO: renamed from: k */
        private final ArrayList<C2692q> f15993k;

        /* JADX INFO: renamed from: n */
        private g f15994n;

        /* JADX INFO: renamed from: q */
        private ArrayList<C2692q> f15995q;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: com.android.thememanager.share.chooser.k$y$k */
        /* JADX INFO: compiled from: ShareChooserDialog.java */
        static final class k extends RecyclerView.fti {

            /* JADX INFO: renamed from: k */
            public TextView f15996k;

            /* JADX INFO: renamed from: q */
            public ImageView f15997q;

            public k(@zy.lvui View itemView) {
                super(itemView);
                this.f15996k = (TextView) itemView.findViewById(android.R.id.text1);
                this.f15997q = (ImageView) itemView.findViewById(android.R.id.icon);
            }
        }

        public y(C2691k dialog) {
            ArrayList<C2692q> arrayList = new ArrayList<>();
            this.f15993k = arrayList;
            this.f15995q = arrayList;
            this.f15992g = new WeakReference<>(dialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fn3e(k kVar, int i2, View view) {
            this.f15994n.mo9407k(kVar.itemView, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @zy.lvui
        /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
        public k onCreateViewHolder(@zy.lvui ViewGroup parent, int viewType) {
            return new k(LayoutInflater.from(parent.getContext()).inflate(R.layout.share_list_item, parent, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f15995q.size();
        }

        void ki() {
            C2691k c2691k = this.f15992g.get();
            if (c2691k == null) {
                return;
            }
            int itemCount = getItemCount();
            c2691k.ovdh();
            notifyDataSetChanged();
            int itemCount2 = getItemCount();
            if (itemCount2 == 0) {
                c2691k.mo4377w();
            }
            if (itemCount2 != itemCount) {
                c2691k.exv8();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@zy.lvui final k holder, final int position) {
            C2692q c2692q = this.f15995q.get(position);
            holder.f15997q.setImageDrawable(c2692q.toq());
            C6077k.wvg(holder.f15997q, holder.itemView);
            holder.f15996k.setText(c2692q.m9412q());
            if (this.f15994n != null) {
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.share.chooser.toq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f16000k.fn3e(holder, position, view);
                    }
                });
            }
        }

        void o1t(ArrayList<C2692q> shareList) {
            if (shareList == null) {
                shareList = this.f15993k;
            }
            this.f15995q = shareList;
        }

        /* JADX INFO: renamed from: z */
        public void m9409z(g clickCallback) {
            this.f15994n = clickCallback;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.share.chooser.k$zy */
    /* JADX INFO: compiled from: ShareChooserDialog.java */
    class zy implements p000a.zy {

        /* JADX INFO: renamed from: k */
        private View f15998k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private View.OnClickListener f61055toq;

        zy() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            if (this.f15998k == null || this.f61055toq == null) {
                return;
            }
            C2691k.this.bg = true;
            this.f61055toq.onClick(this.f15998k);
            C2691k.this.mo4377w();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                lvui.ki(C2691k.this.getContext(), false);
            }
        }

        @Override // p000a.zy
        public void zy(View view, View.OnClickListener onClickListener) {
            this.f15998k = view;
            this.f61055toq = onClickListener;
        }
    }

    private static int btvn(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (rotation == 0 || rotation == 2) ? 4 : 6;
    }

    static C2691k cn02() {
        return new C2691k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exv8() {
        ((GridLayoutManager) this.f61051ab.getLayoutManager()).m4758i(Math.min(this.an.getItemCount(), btvn(getActivity())));
    }

    private void gb() {
        File fileM7747n = com.android.thememanager.detail.theme.util.toq.m7747n(getActivity(), this.as);
        String str = this.bl;
        if (fileM7747n.exists()) {
            mj(fileM7747n.getAbsolutePath());
        } else {
            new f7l8(this, str, fileM7747n.getAbsolutePath()).executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq2f() {
        if (this.bb == null) {
            Log.d(aj, "cannot find share iv.");
            return;
        }
        if (TextUtils.isEmpty(this.bl)) {
            this.bb.setVisibility(8);
            this.ac = 3;
            return;
        }
        if (!mcp.m7139n() && !com.android.thememanager.detail.theme.util.toq.m7747n(getActivity(), this.as).exists()) {
            this.ac = 2;
            this.bb.setVisibility(8);
            return;
        }
        this.ac = 1;
        this.bb.setVisibility(0);
        this.bp.setVisibility(0);
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.bv.getLayoutParams();
        if ("theme".equals(this.ad)) {
            int iJk = C1819o.jk(getActivity()) - (getResources().getDimensionPixelOffset(R.dimen.share_image_margin_start) * 2);
            ((ViewGroup.MarginLayoutParams) toqVar).width = iJk;
            ((ViewGroup.MarginLayoutParams) toqVar).height = iJk;
        } else if ("wallpaper".equals(this.ad)) {
            ((ViewGroup.MarginLayoutParams) toqVar).width = getResources().getDimensionPixelOffset(R.dimen.share_wallpaper_image_width);
            ((ViewGroup.MarginLayoutParams) toqVar).height = getResources().getDimensionPixelOffset(R.dimen.share_wallpaper_image_height);
        }
        this.bv.setLayoutParams(toqVar);
        gb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mj(String savePath) {
        if (!C1819o.eqxt(getActivity())) {
            Log.d(aj, "loadShareImage but activity is not valid.");
            return;
        }
        x2.f7l8(getActivity(), savePath, this.bb, null, getActivity().getResources().getDimensionPixelSize(R.dimen.share_image_corner_size));
        this.ac = 0;
        this.bp.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ovdh() {
        ArrayList<C2692q> arrayListM9405j = ((ShareChooserActivity) getActivity()).m9405j();
        this.id = arrayListM9405j;
        this.an.o1t(arrayListM9405j);
    }

    private void xm(View view) {
        this.bb = (ImageView) view.findViewById(R.id.share_iv);
        this.bv = (FrameLayout) view.findViewById(R.id.share_iv_container);
        this.f61051ab = (RecyclerView) view.findViewById(R.id.share_gird);
        this.bp = (LoadingView) view.findViewById(R.id.loading_view);
        this.ad = ((ShareChooserActivity) getActivity()).m9404e();
        kq2f();
        this.an = new y(this);
        this.f61051ab.setLayoutManager(new GridLayoutManager(getActivity(), btvn(getActivity())));
        this.an.o1t(this.id);
        this.f61051ab.setAdapter(this.an);
        this.an.m9409z(this.am);
        view.findViewById(R.id.button_cancel).setOnClickListener(new q());
        this.ba.wvg(getActivity().getApplicationContext(), Looper.getMainLooper(), false);
        this.az = true;
    }

    @Override // p000a.InterfaceC0001q
    public AbstractC0067g a5id(toq.C0066y permissions, InterfaceC0068k callback) {
        return registerForActivityResult(permissions, callback);
    }

    void hyow(String imageUrl) {
        this.bl = imageUrl;
    }

    @Override // p000a.InterfaceC0001q
    public p000a.zy jz5() {
        return this.ay;
    }

    @Override // androidx.fragment.app.zy
    public Dialog nnh(Bundle savedInstanceState) {
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(getActivity()).inflate(R.layout.share_chooser, (ViewGroup) null);
        xm(constraintLayout);
        ni7.m7146k().toq(bd, this.be);
        ki.C6947k c6947k = new ki.C6947k(getActivity());
        c6947k.uv6(null).m25047s(true).nn86(constraintLayout);
        return c6947k.m25037g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ActivityC0891q activity = getActivity();
        if (activity instanceof ShareChooserActivity) {
            this.ax = ((ShareChooserActivity) activity).nn86();
        }
    }

    @Override // androidx.fragment.app.zy, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        C2716y.m9478k(0, 1);
        super.onCancel(dialog);
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.bq = lvui.n5r1(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (this.az) {
            this.ba.m9487t();
            this.az = false;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC2712q.ld6();
        ni7.m7146k().m7147n(bd, this.be);
    }

    @Override // androidx.fragment.app.zy, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        if (this.bg) {
            return;
        }
        com.android.thememanager.share.chooser.zy.toq(getActivity(), false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C2708s c2708s = this.ax;
        if (c2708s != null) {
            c2708s.toq();
        }
    }

    void pnt2(String title) {
        this.in = title;
    }

    void qh4d(String productId) {
        this.as = productId;
    }

    void xblq(ArrayList<C2692q> shareInfos) {
        this.id = shareInfos;
    }
}
