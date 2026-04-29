package com.android.thememanager.search;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.ArrayMap;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.fu4;
import com.android.thememanager.search.ResourceSearchColorPickGroup;
import com.android.thememanager.search.toq;
import com.android.thememanager.util.bwp;
import com.android.thememanager.util.wx16;
import com.google.android.exoplayer2.text.ttml.C3678q;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.IIntValueProperty;
import miuix.appcompat.app.ki;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.thememanager.search.y */
/* JADX INFO: compiled from: ThemeSearchViewController.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2484y implements InterfaceC1789q {
    private static final ThreadPoolExecutor an;
    private static final String bv = "SEARCH_REMAIN_CURRENT";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private toq.InterfaceC2483q f60755ab;
    private final Runnable bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final TextWatcher f60756bo;
    private final View.OnLayoutChangeListener bp;

    /* JADX INFO: renamed from: d */
    private View.OnFocusChangeListener f14667d;

    /* JADX INFO: renamed from: e */
    private String f14668e;

    /* JADX INFO: renamed from: f */
    private Animator f14669f;

    /* JADX INFO: renamed from: g */
    private ImageView f14670g;

    /* JADX INFO: renamed from: h */
    private com.android.thememanager.search.zy f14671h;

    /* JADX INFO: renamed from: i */
    private com.android.thememanager.search.toq f14672i;

    /* JADX INFO: renamed from: j */
    private String f14673j;

    /* JADX INFO: renamed from: k */
    private ThemeSearchActivity f14674k;

    /* JADX INFO: renamed from: l */
    private Animator f14675l;

    /* JADX INFO: renamed from: m */
    private List<String> f14676m;

    /* JADX INFO: renamed from: n */
    private EditText f14677n;

    /* JADX INFO: renamed from: o */
    private kja0 f14678o;

    /* JADX INFO: renamed from: p */
    private TextView f14679p;

    /* JADX INFO: renamed from: q */
    protected fu4 f14680q;

    /* JADX INFO: renamed from: r */
    private View f14681r;

    /* JADX INFO: renamed from: s */
    private ImageView f14682s;

    /* JADX INFO: renamed from: t */
    private boolean f14683t;

    /* JADX INFO: renamed from: u */
    private final TextView.OnEditorActionListener f14684u;

    /* JADX INFO: renamed from: v */
    private View.OnClickListener f14685v;

    /* JADX INFO: renamed from: w */
    private View.OnClickListener f14686w;

    /* JADX INFO: renamed from: y */
    private ImageView f14688y;

    /* JADX INFO: renamed from: z */
    private ResourceSearchColorPickGroup f14689z;

    /* JADX INFO: renamed from: c */
    private String f14666c = "";

    /* JADX INFO: renamed from: b */
    private int f14665b = 0;

    /* JADX INFO: renamed from: a */
    private int f14664a = -1;

    /* JADX INFO: renamed from: x */
    private toq.zy f14687x = new g();

    /* JADX INFO: renamed from: com.android.thememanager.search.y$f7l8 */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class f7l8 implements View.OnClickListener {
        f7l8() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2484y.this.f14683t = !r2.f14683t;
            Animator animator = C2484y.this.f14683t ? C2484y.this.f14675l : C2484y.this.f14669f;
            animator.setTarget(C2484y.this.f14670g);
            animator.start();
            if (C2484y.this.f14689z != null) {
                C2484y.this.f14689z.setVisibility(C2484y.this.f14683t ? 0 : 8);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$g */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class g implements toq.zy {
        g() {
        }

        @Override // com.android.thememanager.search.toq.zy
        /* JADX INFO: renamed from: k */
        public void mo8869k() {
            if (C2484y.this.f14681r != null) {
                if (!TextUtils.isEmpty(C2484y.this.f14677n.getText() == null ? "" : C2484y.this.f14677n.getText().toString().trim()) || C2484y.this.f14672i.getCount() <= 0) {
                    C2484y.this.f14681r.setVisibility(8);
                } else {
                    C2484y.this.f14681r.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$h */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    private static class h extends TransitionListener {

        /* JADX INFO: renamed from: k */
        private WeakReference<C2484y> f14692k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f60757toq;

        /* synthetic */ h(C2484y c2484y, boolean z2, g gVar) {
            this(c2484y, z2);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object toTag, IIntValueProperty property, int value, float velocity, boolean isCompleted) {
            WeakReference<C2484y> weakReference = this.f14692k;
            if (weakReference == null || weakReference.get() == null || this.f14692k.get().f14679p == null) {
                return;
            }
            TextView textView = this.f14692k.get().f14679p;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (this.f60757toq) {
                marginLayoutParams.rightMargin = 0;
                marginLayoutParams.leftMargin = value;
            } else {
                marginLayoutParams.rightMargin = value;
            }
            textView.setLayoutParams(marginLayoutParams);
        }

        private h(C2484y controller, boolean rtl) {
            this.f14692k = new WeakReference<>(controller);
            this.f60757toq = rtl;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$k */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: com.android.thememanager.search.y$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ThemeSearchViewController.java */
        class DialogInterfaceOnClickListenerC7931k implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: com.android.thememanager.search.y$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ThemeSearchViewController.java */
            class RunnableC7932k implements Runnable {
                RunnableC7932k() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    C2484y.this.f14671h.f7l8();
                    C2484y.this.n5r1();
                }
            }

            DialogInterfaceOnClickListenerC7931k() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                C2484y.an.submit(new RunnableC7932k());
            }
        }

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            new ki.C6947k(C2484y.this.f14677n.getContext()).m25039i(R.attr.alertDialogIcon).fu4(com.android.thememanager.R.string.resource_clear_search_history_dialog).mcp(R.string.cancel, null).dd(R.string.ok, new DialogInterfaceOnClickListenerC7931k()).hb();
            C2484y.this.oc(false);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$kja0 */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    public interface kja0 {
        /* JADX INFO: renamed from: k */
        void m8883k(String keyword, String keyColor);
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$ld6 */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class ld6 implements TextView.OnEditorActionListener {
        ld6() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView v2, int actionId, KeyEvent event) {
            Editable text = C2484y.this.f14677n.getText();
            if (text != null && ("".equals(text.toString()) || TextUtils.getTrimmedLength(text) > 0)) {
                C2484y.this.a9(text.toString(), true, true);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$n */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class n implements View.OnLayoutChangeListener {
        n() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            if (v2 == C2484y.this.f14679p) {
                int i2 = right - left;
                if (C2484y.this.f14665b > 0 || i2 <= 0) {
                    return;
                }
                C2484y.this.f14665b = i2 + (C2484y.this.f14679p.getLayoutDirection() == 1 ? 0 : ((LinearLayout.LayoutParams) C2484y.this.f14679p.getLayoutParams()).leftMargin);
                v2.removeOnLayoutChangeListener(C2484y.this.bp);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$n7h */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class n7h implements View.OnFocusChangeListener {
        n7h() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View v2, boolean hasFocus) {
            if (hasFocus) {
                C2484y.this.n5r1();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$p */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class p implements ResourceSearchColorPickGroup.toq {
        p() {
        }

        @Override // com.android.thememanager.search.ResourceSearchColorPickGroup.toq
        /* JADX INFO: renamed from: k */
        public void mo8855k(String color) {
            C2484y.this.dd(color);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$q */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class q implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f14700k;

        q(final String val$finalQuery) {
            this.f14700k = val$finalQuery;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2484y.this.f14671h.toq(this.f14700k);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$qrj */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class qrj implements View.OnClickListener {
        qrj() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (C2484y.this.f14677n.hasFocus()) {
                C2484y.this.n5r1();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$s */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.um);
            arrayMapZy.put("resourceType", C2484y.this.f14680q.getResourceCode());
            arrayMapZy.put("extra", C2484y.this.f14679p.isSelected() ? "close" : C3678q.f65822ikck);
            C1708s.f7l8().ld6().ni7(arrayMapZy);
            if (C2484y.this.f14679p.isSelected()) {
                C2484y.this.gvn7(false, false, com.android.thememanager.R.drawable.filter_down);
            } else {
                C2484y.this.gvn7(true, true, com.android.thememanager.R.drawable.filter_up);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$toq */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class toq implements toq.InterfaceC2483q {
        toq() {
        }

        @Override // com.android.thememanager.search.toq.InterfaceC2483q
        /* JADX INFO: renamed from: k */
        public void mo8867k(C2481q hintItem) {
            C2484y.this.a9(hintItem.f14652k, true, true);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$x2 */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class x2 implements TextWatcher {
        x2() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s2) {
            if (TextUtils.isEmpty(s2)) {
                C2484y.this.f14688y.setVisibility(0);
                C2484y.this.f14682s.setVisibility(8);
            } else {
                C2484y.this.f14688y.setVisibility(8);
                C2484y.this.f14682s.setVisibility(0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s2, int start, int before, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s2, int start, int before, int after) {
            if (s2 == null || !s2.toString().equals(C2484y.this.f14668e)) {
                C2484y.this.lvui();
                if (s2 != null) {
                    C2484y.this.fti(s2.toString());
                }
                C2484y.this.oc(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$y */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class y implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ThemeSearchActivity f14706k;

        y(final ThemeSearchActivity val$activity) {
            this.f14706k = val$activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            wx16.toq(this.f14706k, null, 1);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.search.y$zy */
    /* JADX INFO: compiled from: ThemeSearchViewController.java */
    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2484y.this.f14672i.m8866y(C2484y.this.f14677n.getText() == null ? "" : C2484y.this.f14677n.getText().toString().trim());
            C2484y.this.f14672i.f7l8();
            C2484y.this.f14672i.m8865s(C2484y.this.f14687x);
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        an = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public C2484y(final ThemeSearchActivity activity, EditText searchView, ImageView colorPicker, ImageView xiaoai, ImageView clear, fu4 resContext, TextView filterTv) {
        ld6 ld6Var = new ld6();
        this.f14684u = ld6Var;
        x2 x2Var = new x2();
        this.f60756bo = x2Var;
        this.f14685v = new qrj();
        this.f14667d = new n7h();
        this.f14686w = new k();
        this.f60755ab = new toq();
        this.bb = new zy();
        n nVar = new n();
        this.bp = nVar;
        this.f14674k = activity;
        this.f14677n = searchView;
        this.f14680q = resContext;
        this.f14676m = C2480n.toq(resContext.getResourceCode());
        this.f14677n.setOnEditorActionListener(ld6Var);
        this.f14677n.addTextChangedListener(x2Var);
        this.f14677n.setOnClickListener(this.f14685v);
        this.f14677n.setOnFocusChangeListener(this.f14667d);
        this.f14677n.setHint(activity.bwp());
        this.f14671h = new com.android.thememanager.search.zy(this.f14680q);
        com.android.thememanager.search.toq toqVar = new com.android.thememanager.search.toq(activity, this.f14671h);
        this.f14672i = toqVar;
        toqVar.m8864p(this.f60755ab);
        if (m8881l()) {
            this.f14670g = colorPicker;
            this.f14675l = AnimatorInflater.loadAnimator(this.f14674k, com.android.thememanager.R.animator.counter_clockwise_45_degree_rotate);
            this.f14669f = AnimatorInflater.loadAnimator(this.f14674k, com.android.thememanager.R.animator.clockwise_45_degree_rotate);
            this.f14670g.setOnClickListener(new f7l8());
        }
        this.f14682s = clear;
        clear.setVisibility(8);
        this.f14682s.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.search.f7l8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14640k.jk(view);
            }
        });
        this.f14688y = xiaoai;
        xiaoai.setOnClickListener(new y(activity));
        this.f14679p = filterTv;
        filterTv.addOnLayoutChangeListener(nVar);
        this.f14679p.setSelected(false);
        this.f14679p.setOnClickListener(new s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a9(String query, boolean saveToHistory, boolean isUploadStatistic) {
        if (TextUtils.isEmpty(query)) {
            if (TextUtils.isEmpty(this.f14677n.getHint())) {
                return;
            } else {
                query = this.f14677n.getHint().toString();
            }
        }
        TextView textView = this.f14679p;
        if (textView != null && textView.isSelected()) {
            gvn7(false, false, com.android.thememanager.R.drawable.filter_down);
        }
        this.f14674k.yqrt();
        this.f14677n.removeTextChangedListener(this.f60756bo);
        if (!TextUtils.equals(query, this.f14677n.getText().toString())) {
            this.f14677n.setText(query);
        }
        this.f14677n.setSelection(query.length());
        this.f14688y.setVisibility(8);
        this.f14682s.setVisibility(0);
        this.f14666c = query;
        oc(false);
        this.f14677n.addTextChangedListener(this.f60756bo);
        if (saveToHistory) {
            an.submit(new q(query));
        }
        ncyb(query, bv);
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("resourceType", this.f14680q.getResourceCode());
        arrayMapM6679k.put("value", query);
        arrayMapM6679k.put("extra", isUploadStatistic ? com.android.thememanager.basemodule.analysis.toq.rb7 : com.android.thememanager.basemodule.analysis.toq.a5rs);
        C1708s.f7l8().ld6().wvg(C1706p.n7h(this.f14674k.yz(), null, arrayMapM6679k));
        if (isUploadStatistic) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("hint", "0");
                jSONObject.put(com.android.thememanager.basemodule.analysis.toq.bao0, query);
                jSONObject.put("resourceType", this.f14680q.getResourceCode());
            } catch (JSONException e2) {
                Log.e("ThemeSearchController", e2.toString());
            }
            com.android.thememanager.basemodule.analysis.kja0.f7l8(this.f14674k.mo6345a(), query, jSONObject.toString());
            ArrayMap<String, Object> arrayMapKja0 = C1706p.kja0(this.f14674k.mo6345a(), query, "");
            arrayMapKja0.put("hint", "0");
            arrayMapKja0.put(com.android.thememanager.basemodule.analysis.toq.bao0, query);
            arrayMapKja0.put("resourceType", this.f14680q.getResourceCode());
            C1708s.f7l8().ld6().ni7(arrayMapKja0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fti(String newText) {
        if (newText == null || TextUtils.equals(newText.trim(), this.f14666c.trim())) {
            return;
        }
        this.f14666c = newText;
        n5r1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gvn7(boolean visible, boolean select, int drawable) {
        this.f14674k.h7am(visible);
        this.f14679p.setSelected(select);
        this.f14679p.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f14674k.getResources().getDrawable(drawable), (Drawable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jk(View view) {
        this.f14677n.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lvui() {
        this.f14674k.vep5(R.animator.fade_in);
        if (m8881l()) {
            this.f14670g.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n5r1() {
        this.f14677n.post(this.bb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oc(boolean visible) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f14677n.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            if (visible) {
                inputMethodManager.showSoftInput(this.f14677n, 0);
            } else {
                inputMethodManager.hideSoftInputFromWindow(this.f14677n.getWindowToken(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m8877r() {
        this.f14674k.mbx(R.animator.fade_in);
        if (m8881l()) {
            this.f14670g.setVisibility(0);
        }
    }

    public void d2ok(String hint) {
        this.f14677n.setHint(hint);
    }

    public void d3(int visible) {
        int i2;
        int i3;
        if (this.f14664a == visible) {
            return;
        }
        this.f14679p.setVisibility(visible);
        this.f14664a = visible;
        if (visible == 0) {
            this.f14679p.setVisibility(0);
            i3 = -this.f14665b;
            i2 = 0;
        } else {
            i2 = -this.f14665b;
            i3 = 0;
        }
        Folme.useValue(new Object[0]).setTo(Integer.valueOf(i3)).to(Integer.valueOf(i2), new AnimConfig().addListeners(new h(this, this.f14677n.getLayoutDirection() == 1, null)));
    }

    public void dd(String color) {
        this.f14689z.setSelectedColor(color);
        ncyb(bv, color);
    }

    public void eqxt(kja0 listener) {
        this.f14678o = listener;
    }

    public void jp0y(ResourceSearchColorPickGroup view) {
        if (m8881l()) {
            this.f14689z = view;
            view.m8854n(wvg());
            this.f14689z.setOnColorPickListener(new p());
            this.f14683t = true;
            this.f14689z.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l */
    protected boolean m8881l() {
        if (com.android.thememanager.h5.f7l8.ld6().x2().m7967p()) {
            return false;
        }
        String resourceCode = this.f14680q.getResourceCode();
        return "theme".equals(resourceCode) || bwp.ni7(resourceCode);
    }

    public void mcp(ListView listView, View clearHistoryView) {
        this.f14681r = clearHistoryView;
        C6077k.ld6(clearHistoryView);
        this.f14681r.setOnClickListener(this.f14686w);
        listView.setAdapter((ListAdapter) this.f14672i);
    }

    public void ncyb(String query, String color) {
        if (!bv.equals(query)) {
            this.f14668e = query;
        }
        if (!bv.equals(color)) {
            this.f14673j = color;
            if (C2478g.f14642k.equals(color)) {
                this.f14673j = "";
            }
            int iM8856k = C2478g.m8856k(color);
            if (iM8856k > 0) {
                this.f14677n.setHint(iM8856k);
            } else {
                this.f14677n.setHint((CharSequence) null);
            }
        }
        if (!TextUtils.isEmpty(this.f14668e)) {
            this.f14674k.cv06(this.f14668e);
        }
        if (TextUtils.isEmpty(this.f14668e) && TextUtils.isEmpty(this.f14673j)) {
            lvui();
        } else {
            m8877r();
        }
        kja0 kja0Var = this.f14678o;
        if (kja0Var != null) {
            kja0Var.m8883k(this.f14668e, this.f14673j);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m8882t() {
        this.f14685v.onClick(this.f14677n);
        this.f14674k.getWindow().setSoftInputMode(4);
    }

    public List<String> wvg() {
        return this.f14676m;
    }

    public void x9kr(String query, boolean isUploadStatistic) {
        a9(query, true, isUploadStatistic);
    }
}
