package com.android.thememanager.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.C0924e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cfr.C1394k;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThirdPartyPickersActivity;
import com.android.thememanager.activity.o05;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1802c;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.ek5k;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.mine.local.presenter.BaseLocalPresenter;
import com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.settings.adapter.LocalRingAdapter;
import com.android.thememanager.settings.localaudio.AsyncTaskC2524k;
import com.android.thememanager.settings.presenter.LocalRingPresenter;
import com.android.thememanager.util.bwp;
import com.android.thememanager.view.ThemePreferenceView;
import ek5k.C6002g;
import gbni.InterfaceC6058k;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import ktq.C6756k;
import mbx.C6812k;
import p001b.InterfaceC1357q;
import yz.C7794k;

/* JADX INFO: loaded from: classes2.dex */
public class LocalRingFragment extends BaseLocalResourceFragment<BaseLocalPresenter> implements InterfaceC6058k.toq<BaseLocalPresenter>, AsyncTaskC2524k.k {
    private static final String am = "LocalRingFragment";
    private static final String ay = "activity_name";
    private static final String[] be = {"com.tencent.mtt.browser.file.FilePickActivity", "com.android.soundpicker.RingtonePickerActivity"};
    private com.android.thememanager.fu4 an;
    private C6756k as;
    private Intent ax;
    private View bb;
    private String bg;
    private int bl;
    private AudioPlayer bp;
    private ArrayList<ResolveInfo> bq;
    private boolean bv;
    private String id;
    private String in;
    p000a.zy az = new toq();
    private p000a.zy ba = new zy();
    private p000a.zy ac = new C2504q();
    private p000a.zy ad = new C2503n();

    /* JADX INFO: renamed from: com.android.thememanager.settings.LocalRingFragment$k */
    class C2502k implements androidx.lifecycle.jp0y<List<Resource>> {
        C2502k() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(List<Resource> resources) {
            ((LocalRingPresenter) LocalRingFragment.this.kiv()).a98o(resources);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.LocalRingFragment$n */
    class C2503n implements p000a.zy {
        C2503n() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            LocalRingFragment.this.c25();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(LocalRingFragment.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.LocalRingFragment$q */
    class C2504q implements p000a.zy {
        C2504q() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            LocalRingFragment.this.wtop();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(LocalRingFragment.this.getContext(), false);
            }
        }
    }

    class toq implements p000a.zy {
        toq() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            LocalRingFragment localRingFragment = LocalRingFragment.this;
            localRingFragment.xzl(localRingFragment.in);
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(LocalRingFragment.this.getContext(), false);
            }
        }
    }

    class zy implements p000a.zy {
        zy() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            LocalRingFragment.this.i3x9();
            Intent intent = new Intent(((BaseLocalResourceFragment) LocalRingFragment.this).f12749r.getContext(), (Class<?>) ThirdPartyPickersActivity.class);
            intent.setAction("android.intent.action.MAIN");
            intent.putExtra("android.intent.extra.INTENT", LocalRingFragment.this.ax);
            intent.putExtra(ThirdPartyPickersActivity.f8900n, true);
            intent.putExtra(ThirdPartyPickersActivity.f8901q, ((BaseLocalResourceFragment) LocalRingFragment.this).f12750u);
            intent.putExtra(ThirdPartyPickersActivity.f8899g, 101);
            intent.putParcelableArrayListExtra("extra_resolve_info_list", LocalRingFragment.this.bq);
            LocalRingFragment.this.startActivityForResult(intent, 101);
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(LocalRingFragment.this.getContext(), false);
            }
        }
    }

    private void ab() {
        try {
            Intent intent = new Intent();
            intent.putExtra(ay, xblq());
            intent.setPackage(p001b.f7l8.kq);
            intent.setAction(p001b.f7l8.anhx);
            C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.fl, null, com.android.thememanager.basemodule.analysis.toq.i03a));
            startActivityForResult(intent, 112);
        } catch (Exception e2) {
            Log.e(am, "open MiAiSmartRingPage failed: " + e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c25() {
        Intent intentM5861k;
        if (C1807g.m7081r()) {
            intentM5861k = C6812k.zy(getContext(), this.bl);
        } else {
            intentM5861k = C1394k.m5861k(getContext(), getString(R.string.resource_online_picker), z4.toq.m28201k(), "ringtone", fu4(), this.bl);
        }
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.fl, null, com.android.thememanager.basemodule.analysis.toq.y76));
        startActivityForResult(intentM5861k, 105);
    }

    private void hyow(List<ResolveInfo> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : be) {
                for (ResolveInfo resolveInfo : list) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null && str.equals(activityInfo.name)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            list.removeAll(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3x9() {
        String str = this.f12750u;
        if (this.bq == null) {
            if ("wallpaper".equals(str) || "lockscreen".equals(str)) {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                this.ax = intent;
                intent.addCategory("android.intent.category.OPENABLE");
                this.ax.setType("image/*");
            } else {
                Intent intent2 = new Intent("android.intent.action.RINGTONE_PICKER");
                this.ax = intent2;
                intent2.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", false);
                this.ax.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                this.ax.putExtra("android.intent.extra.ringtone.TYPE", bwp.cdj(str));
            }
            ArrayList<ResolveInfo> arrayListM7244c = y9n.m7244c(this.ax);
            this.bq = arrayListM7244c;
            hyow(arrayListM7244c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lk(View view) {
        ab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mi1u(View view) {
        if (!com.android.thememanager.basemodule.privacy.x2.zy()) {
            u38j().m6909i(getActivity(), null);
        } else {
            if (com.android.thememanager.basemodule.utils.lvui.qrj((AbstractActivityC1717k) getActivity(), this.ad)) {
                return;
            }
            c25();
        }
    }

    private void nyj(View root) {
        View viewFindViewById = root.findViewById(R.id.add_fab);
        viewFindViewById.setVisibility(0);
        C1812k.m7106k(viewFindViewById, R.string.accessibiliy_description_content_add_resource);
        C6077k.a9(viewFindViewById);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.f7l8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15004k.z617(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vwb(View view) {
        if (com.android.thememanager.basemodule.utils.lvui.m7131s((AbstractActivityC1717k) getActivity(), this.ac)) {
            return;
        }
        wtop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wtop() {
        Intent intent;
        i3x9();
        if (C1807g.lvui()) {
            intent = C6812k.m24742k(getContext(), o05.r25n(this.f12750u, true, this.bg, 101, this.bq, this.ax));
        } else {
            intent = new Intent(getContext(), (Class<?>) ThirdPartyPickersActivity.class);
            intent.setAction("android.intent.action.MAIN");
            intent.putExtra("android.intent.extra.INTENT", this.ax);
            intent.putExtra("android.intent.extra.ringtone.TITLE", this.bg);
            intent.putExtra(ThirdPartyPickersActivity.f8901q, this.f12750u);
            intent.putExtra(ThirdPartyPickersActivity.f8900n, true);
            intent.putExtra(ThirdPartyPickersActivity.f8899g, 101);
            intent.putParcelableArrayListExtra("extra_resolve_info_list", this.bq);
        }
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.fl, null, com.android.thememanager.basemodule.analysis.toq.pgi));
        startActivityForResult(intent, 101);
    }

    private String xblq() {
        if (InterfaceC1789q.rxcq.equals(requireActivity().getCallingPackage())) {
            return requireActivity().getIntent().getStringExtra(ay);
        }
        return null;
    }

    private void xtb7(int ringtoneFlag) {
        if (ringtoneFlag == 16) {
            this.id = InterfaceC1789q.no;
        } else if (ringtoneFlag != 4096) {
            this.id = null;
        } else {
            this.id = InterfaceC1789q.wz;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z617(View view) {
        if (com.android.thememanager.basemodule.utils.lvui.m7131s((AbstractActivityC1717k) getActivity(), this.ba)) {
            return;
        }
        this.ba.mo0k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.settings.localaudio.AsyncTaskC2524k.k
    /* JADX INFO: renamed from: e */
    public void mo8972e(String currentPath) {
        ((LocalRingAdapter) this.f12748o).zsr0(this.bv, currentPath, this.id, this.bl);
        f3f();
        ((BaseLocalPresenter) kiv()).kja0(this.f12750u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f3f() {
        BaseLocalPresenter baseLocalPresenter = (BaseLocalPresenter) kiv();
        if (baseLocalPresenter != null) {
            ((LocalRingPresenter) baseLocalPresenter).m9130a();
        }
    }

    @Override // com.android.thememanager.settings.localaudio.AsyncTaskC2524k.k
    public boolean fu4() {
        return this.bv;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.settings.localaudio.AsyncTaskC2524k.k
    /* JADX INFO: renamed from: k */
    public String mo8236k() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            C7794k.f7l8("fail get resource code!");
            return null;
        }
        PageGroup pageGroup = (PageGroup) arguments.getSerializable(InterfaceC1357q.f53848bf2);
        if (pageGroup != null) {
            return pageGroup.getResourceCode();
        }
        return null;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected int l05() {
        return R.layout.me_fragment_local_ring;
    }

    @Override // com.android.thememanager.settings.localaudio.AsyncTaskC2524k.k
    /* JADX INFO: renamed from: m */
    public void mo8973m(boolean z2) {
        Integer numValueOf;
        Integer num = (Integer) this.bb.getTag();
        if (num == null) {
            numValueOf = Integer.valueOf(z2 ? 1 : 0);
        } else {
            numValueOf = Integer.valueOf(num.intValue() + (z2 ? 1 : -1));
        }
        this.bb.setTag(numValueOf);
        if (numValueOf.intValue() > 0) {
            this.bb.setVisibility(0);
        } else {
            this.bb.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected BaseLocalResourceAdapter o5() {
        return new LocalRingAdapter(this, this.f12750u, (BaseLocalPresenter) kiv(), this.bp, this.as);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) {
            return;
        }
        if (requestCode == 112) {
            String qVar = ek5k.toq((Uri) data.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI"));
            if (TextUtils.isEmpty(qVar)) {
                return;
            }
            bwp.f7l8(-1, null, getActivity(), qVar);
            return;
        }
        if (requestCode != 105) {
            Uri data2 = requestCode == 101 ? (Uri) data.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI") : data.getData();
            if (data2 == null) {
                return;
            }
            new AsyncTaskC2524k(this, data2).executeOnExecutor(C6002g.ld6(), new Void[0]);
            return;
        }
        String stringExtra = data.getStringExtra("RESPONSE_PICKED_RESOURCE");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        bwp.f7l8(-1, null, getActivity(), stringExtra);
        mo8972e(stringExtra);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@zy.lvui Context context) {
        super.onAttach(context);
        if (!C1807g.m7081r() || getActivity() == null) {
            return;
        }
        this.as = (C6756k) new C0924e(getActivity()).toq("local_ring_fragment", C6756k.class);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.basemodule.base.f7l8, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.an = ((com.android.thememanager.activity.kja0) getActivity()).etdu();
        if (!TextUtils.isEmpty(mo8236k()) && !mo8236k().equals(this.an.getResourceCode())) {
            this.an = C2082k.zy().m8001n().m10535g(mo8236k());
        }
        AudioPlayer audioPlayer = new AudioPlayer(this, this.an.getNewResourceContext());
        this.bp = audioPlayer;
        bf2(audioPlayer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(LayoutInflater inflater, @zy.dd ViewGroup container, Bundle savedInstanceState) {
        this.bl = getActivity().getIntent().getIntExtra("android.intent.extra.ringtone.TYPE", 1);
        ((LocalRingPresenter) kiv()).zp(this.bl);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View root, @zy.dd Bundle savedInstanceState) {
        Intent intent = getActivity().getIntent();
        this.bv = C1802c.zy(intent);
        xtb7(this.bl);
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.EXISTING_URI");
        if (uri == null && intent.getExtras() != null && intent.getExtras().containsKey("android.intent.extra.ringtone.EXISTING_URI")) {
            uri = Uri.parse("");
        }
        Uri uri2 = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.DEFAULT_URI");
        C6756k c6756k = this.as;
        ((LocalRingAdapter) this.f12748o).zsr0(this.bv, (c6756k == null || !c6756k.hyr()) ? uri != null ? ek5k.zy(uri, !uri.equals(uri2)) : null : this.as.n5r1(), this.id, this.bl);
        if (!intent.hasExtra("android.intent.extra.ringtone.EXISTING_URI")) {
            f3f();
        }
        this.bb = root.findViewById(R.id.importProgressBar);
        if (!this.bv) {
            nyj(root);
            return;
        }
        ActivityC0891q activity = getActivity();
        String stringExtra = activity.getIntent().getStringExtra("android.intent.extra.ringtone.TITLE");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = activity.getString(R.string.component_title_ringtone);
        }
        this.in = stringExtra;
        View viewInflate = LayoutInflater.from(root.getContext()).inflate(R.layout.resource_list_ringtone_picker_header_layout, (ViewGroup) this.f12749r.findViewById(R.id.recycle_parent), false);
        viewInflate.findViewById(R.id.list_head_line);
        ThemePreferenceView themePreferenceView = (ThemePreferenceView) viewInflate.findViewById(R.id.online_picker);
        ThemePreferenceView themePreferenceView2 = (ThemePreferenceView) viewInflate.findViewById(R.id.local_picker);
        ThemePreferenceView themePreferenceView3 = (ThemePreferenceView) viewInflate.findViewById(R.id.mi_ai_picker);
        themePreferenceView3.setVisibility((xblq() == null || !com.android.thememanager.basemodule.utils.a9.m6997p()) ? 8 : 0);
        themePreferenceView.setBackground(null);
        themePreferenceView3.setBackground(null);
        themePreferenceView3.setBackground(null);
        int dimensionPixelOffset = getActivity().getResources().getDimensionPixelOffset(R.dimen.ring_list_content_padding_start);
        int dimensionPixelOffset2 = getActivity().getResources().getDimensionPixelOffset(R.dimen.ring_list_content_padding_end);
        themePreferenceView.setPaddingHorzintal(dimensionPixelOffset, dimensionPixelOffset2);
        themePreferenceView2.setPaddingHorzintal(dimensionPixelOffset, dimensionPixelOffset2);
        themePreferenceView3.setPaddingHorzintal(dimensionPixelOffset, dimensionPixelOffset2);
        if (!com.android.thememanager.basemodule.utils.toq.m7224q(this.f12750u) || C1807g.lvui()) {
            themePreferenceView.setVisibility(8);
        } else {
            themePreferenceView.setVisibility(0);
            TextView titleView = themePreferenceView.getTitleView();
            if (titleView != null) {
                titleView.setText(R.string.resource_online_picker);
            }
            themePreferenceView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15405k.mi1u(view);
                }
            });
        }
        TextView titleView2 = themePreferenceView2.getTitleView();
        if (titleView2 != null) {
            titleView2.setText(R.string.resource_local_picker);
        }
        themePreferenceView2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15116k.vwb(view);
            }
        });
        TextView titleView3 = themePreferenceView3.getTitleView();
        if (titleView3 != null) {
            titleView3.setText(R.string.resource_mi_ai_picker);
        }
        themePreferenceView3.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15039k.lk(view);
            }
        });
        C6077k.n7h(themePreferenceView);
        C6077k.n7h(themePreferenceView2);
        C6077k.n7h(themePreferenceView3);
        this.f12745j.ki(viewInflate);
    }

    public com.android.thememanager.fu4 pnt2() {
        return this.an;
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @zy.lvui
    /* JADX INFO: renamed from: qh4d, reason: merged with bridge method [inline-methods] */
    public BaseLocalPresenter<LocalRingFragment> uv6() {
        return new LocalRingPresenter(false, false, this.f12750u);
    }

    public void tjz5(@zy.dd List<Resource> list) {
        ((LocalRingAdapter) this.f12748o).xwq3(list);
    }

    public void vss1(Resource playingRes) {
        ((LocalRingAdapter) this.f12748o).py(playingRes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected void wt() {
        ((BaseLocalPresenter) kiv()).fn3e(this, new C2502k());
    }

    public void xzl(String extraRingtoneTitle) {
        Intent intentM24742k;
        i3x9();
        if (C1807g.m7081r()) {
            intentM24742k = C6812k.m24742k(requireActivity(), o05.r25n(this.f12750u, true, extraRingtoneTitle, 101, this.bq, this.ax));
        } else {
            Intent intent = new Intent(requireActivity(), (Class<?>) ThirdPartyPickersActivity.class);
            intent.setAction("android.intent.action.MAIN");
            intent.putExtra("android.intent.extra.INTENT", this.ax);
            intent.putExtra("android.intent.extra.ringtone.TITLE", extraRingtoneTitle);
            intent.putExtra(ThirdPartyPickersActivity.f8901q, this.f12750u);
            intent.putExtra(ThirdPartyPickersActivity.f8900n, true);
            intent.putExtra(ThirdPartyPickersActivity.f8899g, 101);
            intent.putParcelableArrayListExtra("extra_resolve_info_list", this.bq);
            intentM24742k = intent;
        }
        startActivityForResult(intentM24742k, 101);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.AbstractC1048h yw() {
        return new LinearLayoutManager(getActivity(), 1, false);
    }

    public void z4j7(@zy.lvui com.android.thememanager.settings.localaudio.toq usingPath) {
        ((LocalRingAdapter) this.f12748o).ltg8(usingPath);
    }
}
