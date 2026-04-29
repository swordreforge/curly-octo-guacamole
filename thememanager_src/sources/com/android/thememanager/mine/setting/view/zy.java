package com.android.thememanager.mine.setting.view;

import android.animation.Animator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.network.theme.C1775k;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.OrderResponse;
import com.android.thememanager.basemodule.utils.jk;
import com.android.thememanager.ld6;
import com.android.thememanager.mine.remote.model.entity.BatchOrderItem;
import com.android.thememanager.mine.remote.model.entity.BatchOrderResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import miuix.appcompat.app.ki;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;
import zy.dd;

/* JADX INFO: compiled from: AnonymousLinkingDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends androidx.fragment.app.zy {
    private static final int ax = 3;
    private static final int az = 1;
    private static final int ba = 2;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private Button f60480ab;
    private TextView an;
    private Button bb;
    private InterfaceC2205q bg;
    private LottieAnimationView bp;
    private TextView bv;
    private int id;

    @InterfaceC7926zy
    private int in;
    private static final int[] bq = {0, 32};
    private static final int[] ac = {33, 70};
    private static final int[] ad = {71, 100};
    private final AtomicBoolean bl = new AtomicBoolean(false);
    private final InterfaceC7648q<OrderResponse<BatchOrderResult>> as = new C2204k();

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.zy$k */
    /* JADX INFO: compiled from: AnonymousLinkingDialog.java */
    class C2204k implements InterfaceC7648q<OrderResponse<BatchOrderResult>> {
        C2204k() {
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(retrofit2.toq<OrderResponse<BatchOrderResult>> call, Throwable t2) {
            Log.e(jk.f57770zy, "LinkingCallback onFailure: ", t2);
            zy.this.btvn(3, false);
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(retrofit2.toq<OrderResponse<BatchOrderResult>> call, C7639i<OrderResponse<BatchOrderResult>> response) {
            if (!response.f7l8() || response.m27986k() == null || response.m27986k().data == null) {
                zy.this.btvn(3, false);
                return;
            }
            List<BatchOrderItem> failOrders = response.m27986k().data.getFailOrders();
            if (failOrders.size() <= 0) {
                ld6.m8009k(null);
                zy.this.btvn(2, false);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<BatchOrderItem> it = failOrders.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getProductId());
            }
            ld6.m8009k(arrayList);
            zy.this.btvn(3, false);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.zy$q */
    /* JADX INFO: compiled from: AnonymousLinkingDialog.java */
    public interface InterfaceC2205q {
        /* JADX INFO: renamed from: k */
        void mo6423k(@InterfaceC7926zy int linkingState);
    }

    /* JADX INFO: compiled from: AnonymousLinkingDialog.java */
    class toq implements Animator.AnimatorListener {
        toq() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            if (zy.this.in == 2 || zy.this.in == 3) {
                zy.this.bp.setRepeatCount(0);
                if (zy.this.in == 2) {
                    zy.this.bp.setMinAndMaxFrame(zy.ac[0], zy.ac[1]);
                } else {
                    zy.this.bp.setMinAndMaxFrame(zy.ad[0], zy.ad[1]);
                }
                zy zyVar = zy.this;
                zyVar.btvn(zyVar.in, true);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            zy.this.bp.setMinAndMaxFrame(zy.bq[0], zy.bq[1]);
            zy.this.bp.setRepeatCount(-1);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnonymousLinkingDialog.java */
    public @interface InterfaceC7926zy {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btvn(@InterfaceC7926zy int state, boolean updateUI) {
        this.in = state;
        if (updateUI) {
            if (state == 1) {
                xm();
            } else if (state == 2) {
                mj();
            } else if (state == 3) {
                kq2f();
            }
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("type", Integer.valueOf(state));
            C1708s.f7l8().ld6().cdj(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.v0wk, null, arrayMap));
        }
    }

    private void kbj() {
        btvn(1, true);
        ((ltg8.toq) f7l8.m6882h().toq(ltg8.toq.class)).n7h(ld6.m8011q(), C1775k.f10108h, C1775k.f57598cdj).mo27954p(this.as);
    }

    private void kq2f() {
        this.bv.setText(R.string.anonymous_resource_link_error);
        this.an.setVisibility(0);
        this.an.setText(R.string.anonymous_resource_link_retry);
        this.bb.setVisibility(0);
        this.bb.setEnabled(true);
        this.bb.setText(R.string.anonymous_resource_link_retry_cancel);
        this.f60480ab.setVisibility(0);
        this.f60480ab.setEnabled(true);
        this.f60480ab.setText(R.string.anonymous_resource_link_retry_confirm);
        ec(true);
    }

    private void mj() {
        this.bv.setText(R.string.anonymous_resource_link_success);
        this.an.setVisibility(0);
        TextView textView = this.an;
        Resources resources = getResources();
        int i2 = this.id;
        textView.setText(resources.getQuantityString(R.plurals.anonymous_resource_link_success_message, i2, Integer.valueOf(i2)));
        this.bb.setVisibility(8);
        this.bb.setEnabled(false);
        this.f60480ab.setVisibility(0);
        this.f60480ab.setEnabled(true);
        this.f60480ab.setText(R.string.i_know);
        ec(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ob(View view) {
        if (this.in == 3) {
            kx3();
        }
        ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.ptry);
        arrayMapZy.put("type", Integer.valueOf(this.in));
        C1708s.f7l8().ld6().ni7(arrayMapZy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void tww7(View view) {
        int i2 = this.in;
        if (i2 == 2) {
            kx3();
        } else if (i2 == 3) {
            kbj();
        }
        ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.dzm);
        arrayMapZy.put("type", Integer.valueOf(this.in));
        C1708s.f7l8().ld6().ni7(arrayMapZy);
    }

    private void xm() {
        this.bp.hyr();
        this.bv.setText(R.string.anonymous_resource_linking);
        this.an.setVisibility(4);
        this.bb.setVisibility(4);
        this.bb.setEnabled(false);
        this.f60480ab.setVisibility(4);
        this.f60480ab.setEnabled(false);
        ec(false);
    }

    public void gb(@dd InterfaceC2205q listener) {
        this.bg = listener;
    }

    @Override // androidx.fragment.app.zy
    public Dialog nnh(Bundle savedInstanceState) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.me_linking_dialog, (ViewGroup) null);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewInflate.findViewById(R.id.linking_animation);
        this.bp = lottieAnimationView;
        int[] iArr = bq;
        lottieAnimationView.setMinAndMaxFrame(iArr[0], iArr[1]);
        this.bp.ni7(new toq());
        this.bv = (TextView) viewInflate.findViewById(R.id.linking_title);
        this.an = (TextView) viewInflate.findViewById(R.id.linking_sub_title);
        this.id = ld6.zy();
        return new ki.C6947k(getActivity()).nn86(viewInflate).x9kr(getString(R.string.system_aod_dialog_positive_button), null).mcp(android.R.string.cancel, null).m25037g();
    }

    @Override // androidx.fragment.app.zy, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        InterfaceC2205q interfaceC2205q = this.bg;
        if (interfaceC2205q != null) {
            interfaceC2205q.mo6423k(this.in);
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onStart() {
        ki kiVar;
        super.onStart();
        if (this.bl.getAndSet(true) || (kiVar = (ki) u38j()) == null) {
            return;
        }
        Button buttonM25027h = kiVar.m25027h(-1);
        this.f60480ab = buttonM25027h;
        buttonM25027h.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.mine.setting.view.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12991k.tww7(view);
            }
        });
        Button buttonM25027h2 = kiVar.m25027h(-2);
        this.bb = buttonM25027h2;
        buttonM25027h2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.mine.setting.view.toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12992k.ob(view);
            }
        });
        kbj();
    }
}
