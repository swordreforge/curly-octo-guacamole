package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceGroup;
import androidx.preference.fn3e;
import androidx.preference.ki;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import zy.InterfaceC7824b;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: PreferenceFragmentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class qrj extends Fragment implements ki.zy, ki.InterfaceC1019k, ki.toq, DialogPreference.InterfaceC0987k {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private boolean mHavePrefs;
    private boolean mInitDone;
    RecyclerView mList;
    private ki mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private final C1031q mDividerDecoration = new C1031q();
    private int mLayoutResId = fn3e.C1013y.f51958ld6;
    private final Handler mHandler = new HandlerC1029k(Looper.getMainLooper());
    private final Runnable mRequestFocus = new toq();

    /* JADX INFO: compiled from: PreferenceFragmentCompat.java */
    public interface f7l8 {
        /* JADX INFO: renamed from: k */
        boolean m4709k(@lvui qrj qrjVar, @lvui PreferenceScreen preferenceScreen);
    }

    /* JADX INFO: renamed from: androidx.preference.qrj$g */
    /* JADX INFO: compiled from: PreferenceFragmentCompat.java */
    public interface InterfaceC1028g {
        boolean uc(@lvui qrj qrjVar, @lvui Preference preference);
    }

    /* JADX INFO: renamed from: androidx.preference.qrj$k */
    /* JADX INFO: compiled from: PreferenceFragmentCompat.java */
    class HandlerC1029k extends Handler {
        HandlerC1029k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            qrj.this.bindPreferences();
        }
    }

    /* JADX INFO: renamed from: androidx.preference.qrj$n */
    /* JADX INFO: compiled from: PreferenceFragmentCompat.java */
    public interface InterfaceC1030n {
        /* JADX INFO: renamed from: k */
        boolean m4710k(@lvui qrj qrjVar, @lvui Preference preference);
    }

    /* JADX INFO: renamed from: androidx.preference.qrj$q */
    /* JADX INFO: compiled from: PreferenceFragmentCompat.java */
    private class C1031q extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private Drawable f5598k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f51981toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f51982zy = true;

        C1031q() {
        }

        private boolean qrj(View view, RecyclerView recyclerView) {
            RecyclerView.fti childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z2 = false;
            if (!((childViewHolder instanceof C1016i) && ((C1016i) childViewHolder).fu4())) {
                return false;
            }
            boolean z3 = this.f51982zy;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z3;
            }
            RecyclerView.fti childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
            if ((childViewHolder2 instanceof C1016i) && ((C1016i) childViewHolder2).ni7()) {
                z2 = true;
            }
            return z2;
        }

        public void ld6(Drawable drawable) {
            if (drawable != null) {
                this.f51981toq = drawable.getIntrinsicHeight();
            } else {
                this.f51981toq = 0;
            }
            this.f5598k = drawable;
            qrj.this.mList.invalidateItemDecorations();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect rect, @lvui View view, @lvui RecyclerView recyclerView, @lvui RecyclerView.mcp mcpVar) {
            if (qrj(view, recyclerView)) {
                rect.bottom = this.f51981toq;
            }
        }

        /* JADX INFO: renamed from: p */
        public void m4712p(boolean z2) {
            this.f51982zy = z2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: s */
        public void mo4713s(@lvui Canvas canvas, @lvui RecyclerView recyclerView, @lvui RecyclerView.mcp mcpVar) {
            if (this.f5598k == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (qrj(childAt, recyclerView)) {
                    int y3 = ((int) childAt.getY()) + childAt.getHeight();
                    this.f5598k.setBounds(0, y3, width, this.f51981toq + y3);
                    this.f5598k.draw(canvas);
                }
            }
        }

        public void x2(int i2) {
            this.f51981toq = i2;
            qrj.this.mList.invalidateItemDecorations();
        }
    }

    /* JADX INFO: compiled from: PreferenceFragmentCompat.java */
    class toq implements Runnable {
        toq() {
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
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = qrj.this.mList;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.qrj$y */
    /* JADX INFO: compiled from: PreferenceFragmentCompat.java */
    private static class C1032y extends RecyclerView.AbstractC1053p {

        /* JADX INFO: renamed from: k */
        private final RecyclerView.AbstractC1060y<?> f5601k;

        /* JADX INFO: renamed from: q */
        private final String f5602q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final RecyclerView f51983toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Preference f51984zy;

        C1032y(RecyclerView.AbstractC1060y<?> abstractC1060y, RecyclerView recyclerView, Preference preference, String str) {
            this.f5601k = abstractC1060y;
            this.f51983toq = recyclerView;
            this.f51984zy = preference;
            this.f5602q = str;
        }

        /* JADX INFO: renamed from: k */
        private void m4714k() {
            this.f5601k.unregisterAdapterDataObserver(this);
            Preference preference = this.f51984zy;
            int iMo4670q = preference != null ? ((PreferenceGroup.zy) this.f5601k).mo4670q(preference) : ((PreferenceGroup.zy) this.f5601k).qrj(this.f5602q);
            if (iMo4670q != -1) {
                this.f51983toq.scrollToPosition(iMo4670q);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onChanged() {
            m4714k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int i2, int i3) {
            m4714k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeInserted(int i2, int i3) {
            m4714k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeMoved(int i2, int i3, int i4) {
            m4714k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeRemoved(int i2, int i3) {
            m4714k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int i2, int i3, Object obj) {
            m4714k();
        }
    }

    /* JADX INFO: compiled from: PreferenceFragmentCompat.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Preference f5603k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f5605q;

        zy(Preference preference, String str) {
            this.f5603k = preference;
            this.f5605q = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.AbstractC1060y adapter = qrj.this.mList.getAdapter();
            if (!(adapter instanceof PreferenceGroup.zy)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.f5603k;
            int iMo4670q = preference != null ? ((PreferenceGroup.zy) adapter).mo4670q(preference) : ((PreferenceGroup.zy) adapter).qrj(this.f5605q);
            if (iMo4670q != -1) {
                qrj.this.mList.scrollToPosition(iMo4670q);
            } else {
                adapter.registerAdapterDataObserver(new C1032y(adapter, qrj.this.mList, this.f5603k, this.f5605q));
            }
        }
    }

    private void postBindPreferences() {
        if (this.mHandler.hasMessages(1)) {
            return;
        }
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void scrollToPreferenceInternal(@dd Preference preference, @dd String str) {
        zy zyVar = new zy(preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = zyVar;
        } else {
            zyVar.run();
        }
    }

    private void unbindPreferences() {
        getListView().setAdapter(null);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.yz();
        }
        onUnbindPreferences();
    }

    public void addPreferencesFromResource(@InterfaceC7824b int i2) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.ki(requireContext(), i2, getPreferenceScreen()));
    }

    void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.nn86();
        }
        onBindPreferences();
    }

    @Override // androidx.preference.DialogPreference.InterfaceC0987k
    @dd
    public <T extends Preference> T findPreference(@lvui CharSequence charSequence) {
        ki kiVar = this.mPreferenceManager;
        if (kiVar == null) {
            return null;
        }
        return (T) kiVar.toq(charSequence);
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public Fragment getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public ki getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.n7h();
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected void onBindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(fn3e.C1008k.f5476l, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = fn3e.C1010p.f5520s;
        }
        requireContext().getTheme().applyStyle(i2, false);
        ki kiVar = new ki(requireContext());
        this.mPreferenceManager = kiVar;
        kiVar.m4697z(this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @lvui
    protected RecyclerView.AbstractC1060y onCreateAdapter(@lvui PreferenceScreen preferenceScreen) {
        return new n7h(preferenceScreen);
    }

    @lvui
    public RecyclerView.AbstractC1048h onCreateLayoutManager() {
        return new LinearLayoutManager(requireContext());
    }

    public abstract void onCreatePreferences(@dd Bundle bundle, @dd String str);

    @lvui
    public RecyclerView onCreateRecyclerView(@lvui LayoutInflater layoutInflater, @lvui ViewGroup viewGroup, @dd Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(fn3e.C1007g.f5463n)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(fn3e.C1013y.f51960qrj, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new t8r(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.Fragment
    @lvui
    public View onCreateView(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, fn3e.ld6.f5508v, fn3e.C1008k.f51773d2ok, 0);
        this.mLayoutResId = typedArrayObtainStyledAttributes.getResourceId(fn3e.ld6.f51853ikck, this.mLayoutResId);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(fn3e.ld6.f5490d);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(fn3e.ld6.f51872mu, -1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(fn3e.ld6.f51903vq, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewOnCreateRecyclerView = onCreateRecyclerView(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewOnCreateRecyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.mList = recyclerViewOnCreateRecyclerView;
        recyclerViewOnCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.mDividerDecoration.m4712p(z2);
        if (this.mList.getParent() == null) {
            viewGroup2.addView(this.mList);
        }
        this.mHandler.post(this.mRequestFocus);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.ki.InterfaceC1019k
    public void onDisplayPreferenceDialog(@lvui Preference preference) {
        androidx.fragment.app.zy zyVarOb;
        boolean zM4710k = getCallbackFragment() instanceof InterfaceC1030n ? ((InterfaceC1030n) getCallbackFragment()).m4710k(this, preference) : false;
        for (Fragment parentFragment = this; !zM4710k && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC1030n) {
                zM4710k = ((InterfaceC1030n) parentFragment).m4710k(this, preference);
            }
        }
        if (!zM4710k && (getContext() instanceof InterfaceC1030n)) {
            zM4710k = ((InterfaceC1030n) getContext()).m4710k(this, preference);
        }
        if (!zM4710k && (getActivity() instanceof InterfaceC1030n)) {
            zM4710k = ((InterfaceC1030n) getActivity()).m4710k(this, preference);
        }
        if (!zM4710k && getParentFragmentManager().nmn5(DIALOG_FRAGMENT_TAG) == null) {
            if (preference instanceof EditTextPreference) {
                zyVarOb = androidx.preference.zy.kbj(preference.fn3e());
            } else if (preference instanceof ListPreference) {
                zyVarOb = C1014g.ob(preference.fn3e());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                zyVarOb = C1040y.ob(preference.fn3e());
            }
            zyVarOb.setTargetFragment(this, 0);
            zyVarOb.cyoe(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
        }
    }

    @Override // androidx.preference.ki.toq
    public void onNavigateToScreen(@lvui PreferenceScreen preferenceScreen) {
        boolean zM4709k = getCallbackFragment() instanceof f7l8 ? ((f7l8) getCallbackFragment()).m4709k(this, preferenceScreen) : false;
        for (Fragment parentFragment = this; !zM4709k && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof f7l8) {
                zM4709k = ((f7l8) parentFragment).m4709k(this, preferenceScreen);
            }
        }
        if (!zM4709k && (getContext() instanceof f7l8)) {
            zM4709k = ((f7l8) getContext()).m4709k(this, preferenceScreen);
        }
        if (zM4709k || !(getActivity() instanceof f7l8)) {
            return;
        }
        ((f7l8) getActivity()).m4709k(this, preferenceScreen);
    }

    @Override // androidx.preference.ki.zy
    public boolean onPreferenceTreeClick(@lvui Preference preference) {
        if (preference.m4652h() == null) {
            return false;
        }
        boolean zUc = getCallbackFragment() instanceof InterfaceC1028g ? ((InterfaceC1028g) getCallbackFragment()).uc(this, preference) : false;
        for (Fragment parentFragment = this; !zUc && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC1028g) {
                zUc = ((InterfaceC1028g) parentFragment).uc(this, preference);
            }
        }
        if (!zUc && (getContext() instanceof InterfaceC1028g)) {
            zUc = ((InterfaceC1028g) getContext()).uc(this, preference);
        }
        if (!zUc && (getActivity() instanceof InterfaceC1028g)) {
            zUc = ((InterfaceC1028g) getActivity()).uc(this, preference);
        }
        if (zUc) {
            return true;
        }
        Log.w(TAG, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundleN7h = preference.n7h();
        Fragment fragmentMo4213k = parentFragmentManager.vq().mo4213k(requireActivity().getClassLoader(), preference.m4652h());
        fragmentMo4213k.setArguments(bundleN7h);
        fragmentMo4213k.setTargetFragment(this, 0);
        parentFragmentManager.ki().m4317z(((View) requireView().getParent()).getId(), fragmentMo4213k).ld6(null).qrj();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.m4649d(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mPreferenceManager.o1t(this);
        this.mPreferenceManager.fu4(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mPreferenceManager.o1t(null);
        this.mPreferenceManager.fu4(null);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected void onUnbindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@lvui View view, @dd Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(PREFERENCES_TAG)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.ikck(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    public void scrollToPreference(@lvui String str) {
        scrollToPreferenceInternal(null, str);
    }

    public void setDivider(@dd Drawable drawable) {
        this.mDividerDecoration.ld6(drawable);
    }

    public void setDividerHeight(int i2) {
        this.mDividerDecoration.x2(i2);
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        if (!this.mPreferenceManager.mcp(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        onUnbindPreferences();
        this.mHavePrefs = true;
        if (this.mInitDone) {
            postBindPreferences();
        }
    }

    public void setPreferencesFromResource(@InterfaceC7824b int i2, @dd String str) {
        requirePreferenceManager();
        PreferenceScreen preferenceScreenKi = this.mPreferenceManager.ki(requireContext(), i2, null);
        Preference preference = preferenceScreenKi;
        if (str != null) {
            Preference preferenceVep5 = preferenceScreenKi.vep5(str);
            boolean z2 = preferenceVep5 instanceof PreferenceScreen;
            preference = preferenceVep5;
            if (!z2) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        setPreferenceScreen((PreferenceScreen) preference);
    }

    public void scrollToPreference(@lvui Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }
}
