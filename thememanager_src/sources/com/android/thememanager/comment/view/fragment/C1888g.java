package com.android.thememanager.comment.view.fragment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.t8r;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.comment.model.CommentRequestInterface;
import com.android.thememanager.comment.model.ResourceComment;
import com.android.thememanager.comment.model.ResourceCommentGroup;
import com.android.thememanager.comment.view.widget.SubCommentBar;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import com.google.gson.C4871g;
import ek5k.C6002g;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import lv5.InterfaceC6781k;
import miuix.recyclerview.widget.RecyclerView;
import retrofit2.C7639i;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.g */
/* JADX INFO: compiled from: ResourceCommentDetailFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1888g extends com.android.thememanager.basemodule.base.toq implements com.android.thememanager.basemodule.analysis.toq, InterfaceC6781k.k.InterfaceC8092k {

    /* JADX INFO: renamed from: a */
    private static final String f10716a = "resource";

    /* JADX INFO: renamed from: b */
    private static final String f10717b = "comment_id";

    /* JADX INFO: renamed from: m */
    private static final String f10718m = "comment_group";

    /* JADX INFO: renamed from: x */
    private static final int f10719x = 0;

    /* JADX INFO: renamed from: c */
    private SubCommentBar f10720c;

    /* JADX INFO: renamed from: e */
    private t8r.toq f10721e;

    /* JADX INFO: renamed from: f */
    private Resource f10722f;

    /* JADX INFO: renamed from: j */
    private View f10723j;

    /* JADX INFO: renamed from: l */
    private long f10724l;

    /* JADX INFO: renamed from: o */
    private int f10725o;

    /* JADX INFO: renamed from: r */
    private ResourceCommentGroup f10726r;

    /* JADX INFO: renamed from: t */
    private RecyclerView f10727t;

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.g$k */
    /* JADX INFO: compiled from: ResourceCommentDetailFragment.java */
    class k implements t8r.toq {
        k() {
        }

        @Override // com.android.thememanager.basemodule.utils.t8r.toq
        /* JADX INFO: renamed from: k */
        public void mo7222k() {
            C1888g.this.wt();
            C1888g.this.f10720c.m7455p(null);
            C1888g.this.f10720c.requestFocus();
        }

        @Override // com.android.thememanager.basemodule.utils.t8r.toq
        public void toq() {
            C1888g.this.wt();
            if (C1819o.eqxt(C1888g.this.getActivity())) {
                C1888g.this.f10720c.m7455p(C1888g.this.getString(R.string.theme_comment_sub_comment_bar_hint));
                C1888g.this.f10720c.setInfo(C1888g.this.f10726r.main, C1888g.this.f10726r.main.commentId, C1888g.this.f10722f);
                C1888g.this.f10720c.clearFocus();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.g$q */
    /* JADX INFO: compiled from: ResourceCommentDetailFragment.java */
    private static class q extends androidx.recyclerview.widget.x2 {
        public q(Context context) {
            super(context, 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: s */
        public void mo4713s(@lvui Canvas c2, @lvui androidx.recyclerview.widget.RecyclerView parent, @lvui RecyclerView.mcp state) {
            int width;
            int paddingLeft;
            c2.save();
            if (parent.getClipToPadding()) {
                paddingLeft = parent.getPaddingLeft();
                width = parent.getWidth() - parent.getPaddingRight();
                c2.clipRect(paddingLeft, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
            } else {
                width = parent.getWidth();
                paddingLeft = 0;
            }
            View childAt = parent.getChildAt(0);
            Rect rect = new Rect();
            parent.getDecoratedBoundsWithMargins(childAt, rect);
            int iRound = rect.bottom + Math.round(childAt.getTranslationY());
            Paint paint = new Paint();
            paint.setColor(parent.getContext().getResources().getColor(R.color.divider_color));
            c2.drawRect(paddingLeft, iRound - 16, width, iRound, paint);
            c2.restore();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.g$toq */
    /* JADX INFO: compiled from: ResourceCommentDetailFragment.java */
    class toq implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ResourceCommentItem f10729k;

        toq(final ResourceCommentItem val$commentItem) {
            this.f10729k = val$commentItem;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
            if (loginError == C1688q.g.ERROR_LOGIN_UNACTIVATED) {
                nn86.m7150k(R.string.account_unactivated, 1);
            } else {
                nn86.m7150k(R.string.fail_to_add_account, 0);
            }
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            if (!mcp.m7138k() || !mcp.m7139n()) {
                nn86.m7150k(R.string.online_no_network, 0);
                return;
            }
            C1888g.this.f10720c.getCommentEdit().requestFocus();
            C1888g.this.f10720c.setInfo(this.f10729k, C1888g.this.f10726r.main.commentId, C1888g.this.f10722f);
            ((InputMethodManager) C1888g.this.getActivity().getSystemService("input_method")).showSoftInput(C1888g.this.f10720c.getCommentEdit(), 0);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.g$zy */
    /* JADX INFO: compiled from: ResourceCommentDetailFragment.java */
    private static class zy extends AsyncTask<Void, Void, ResourceCommentGroup> {

        /* JADX INFO: renamed from: k */
        private WeakReference<C1888g> f10730k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f57887toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f57888zy;

        public zy(C1888g fragment, String onlineId, long commentId) {
            this.f10730k = new WeakReference<>(fragment);
            this.f57887toq = onlineId;
            this.f57888zy = commentId;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ResourceCommentGroup doInBackground(Void... Voids) {
            try {
                C7639i<CommonResponse<ResourceComment>> c7639iF7l8 = ((CommentRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(CommentRequestInterface.class)).getCommentDetail(this.f57887toq, String.valueOf(this.f57888zy)).f7l8();
                if (com.android.thememanager.basemodule.network.theme.toq.m6892k(c7639iF7l8)) {
                    return c7639iF7l8.m27986k().apiData.comments.get(0);
                }
                return null;
            } catch (IOException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ResourceCommentGroup commentGroup) {
            C1888g c1888g = this.f10730k.get();
            if (c1888g == null || !C1819o.eqxt(c1888g.getActivity()) || commentGroup == null) {
                nn86.m7150k(R.string.update_fail, 0);
            } else {
                c1888g.f10726r = commentGroup;
                c1888g.cyoe();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cyoe() {
        Bundle arguments = getArguments();
        if (arguments.containsKey(f10718m)) {
            this.f10726r = (ResourceCommentGroup) arguments.getSerializable(f10718m);
        }
        if (arguments.containsKey("comment_id")) {
            this.f10724l = arguments.getLong("comment_id");
        }
        this.f10722f = (Resource) arguments.getSerializable("resource");
        if (this.f10726r == null) {
            new zy(this, this.f10722f.getOnlineId(), this.f10724l).executeOnExecutor(C6002g.x2(), new Void[0]);
            this.f10720c.setVisibility(8);
            return;
        }
        this.f10720c.m7455p(getString(R.string.theme_comment_sub_comment_bar_hint));
        SubCommentBar subCommentBar = this.f10720c;
        ResourceCommentItem resourceCommentItem = this.f10726r.main;
        subCommentBar.setInfo(resourceCommentItem, resourceCommentItem.commentId, this.f10722f);
        this.f10720c.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        ResourceCommentGroup resourceCommentGroup = new ResourceCommentGroup();
        resourceCommentGroup.main = this.f10726r.main;
        arrayList.add(resourceCommentGroup);
        for (ResourceCommentItem resourceCommentItem2 : this.f10726r.subList) {
            ResourceCommentGroup resourceCommentGroup2 = new ResourceCommentGroup();
            resourceCommentGroup2.main = resourceCommentItem2;
            arrayList.add(resourceCommentGroup2);
        }
        this.f10727t.setAdapter(new C1889k(arrayList, this.f10722f, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: el, reason: merged with bridge method [inline-methods] */
    public void r6ty() {
        zff0(this.f10720c, 0);
    }

    private int l05() {
        View view = this.f10723j;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wt() {
        Rect rect = new Rect();
        this.f10723j.getWindowVisibleDisplayFrame(rect);
        this.f10725o = this.f10723j.getRootView().getHeight() - rect.bottom;
    }

    public static C1888g yp31(@dd ResourceCommentGroup commentGroup, long commentId, @lvui Resource resource) {
        Bundle bundle = new Bundle();
        if (commentGroup != null) {
            bundle.putSerializable(f10718m, commentGroup);
        }
        if (commentId > 0) {
            bundle.putLong("comment_id", commentId);
        }
        bundle.putSerializable("resource", resource);
        C1888g c1888g = new C1888g();
        c1888g.setArguments(bundle);
        return c1888g;
    }

    private void zff0(View view, int locationAt) {
        if (view == null) {
            return;
        }
        wt();
        int iL05 = l05();
        if (locationAt == 0) {
            int height = (iL05 - this.f10725o) - view.getHeight();
            if (y9n.m7258z() && !C1819o.oc()) {
                height += y9n.cdj(view.getContext());
            }
            view.setY(height);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String kx3() {
        return com.android.thememanager.basemodule.analysis.toq.ml;
    }

    @Override // lv5.InterfaceC6781k.k.InterfaceC8092k
    public void nmn5(@lvui ResourceCommentItem commentItem) {
        C1688q.cdj().fti(getActivity(), new toq(commentItem));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.resource_comment_detail, container, false);
        this.f10723j = viewInflate;
        miuix.recyclerview.widget.RecyclerView recyclerView = (miuix.recyclerview.widget.RecyclerView) viewInflate.findViewById(android.R.id.list);
        this.f10727t = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f10720c = (SubCommentBar) this.f10723j.findViewById(R.id.sub_comment_bar);
        this.f10723j.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.android.thememanager.comment.view.fragment.n
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f10767k.r6ty();
            }
        });
        this.f10721e = new k();
        cyoe();
        return this.f10723j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (getTargetFragment() instanceof n7h) {
            ((n7h) getTargetFragment()).bqie(this.f10726r);
        }
        super.onDestroyView();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        t8r.toq(getActivity(), this.f10721e);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        t8r.m7220k(getActivity(), this.f10721e);
    }

    @Override // com.android.thememanager.basemodule.base.toq
    /* JADX INFO: renamed from: w */
    public String mo6436w() {
        ResourceCommentGroup resourceCommentGroup;
        ArrayMap arrayMap = new ArrayMap();
        long jLongValue = this.f10724l;
        if (jLongValue <= 0 && (resourceCommentGroup = this.f10726r) != null) {
            jLongValue = resourceCommentGroup.main.commentId.longValue();
        }
        if (jLongValue <= 0) {
            return null;
        }
        arrayMap.put("comment_id", String.valueOf(jLongValue));
        arrayMap.put("source", this.f10726r != null ? com.android.thememanager.basemodule.analysis.toq.mwxf : com.android.thememanager.basemodule.analysis.toq.s0jx);
        return new C4871g().o1t(arrayMap);
    }

    @Override // lv5.InterfaceC6781k.k.InterfaceC8092k
    public void zsr0(@lvui ResourceCommentGroup commentGroup, @lvui InterfaceC6781k.toq view) {
    }
}
