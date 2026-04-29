package androidx.preference;

import android.R;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

/* JADX INFO: compiled from: PreferenceFragment.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class x2 extends Fragment implements ki.zy, ki.InterfaceC1019k, ki.toq, DialogPreference.InterfaceC0987k {

    /* JADX INFO: renamed from: f */
    private static final int f5612f = 1;

    /* JADX INFO: renamed from: l */
    private static final String f5613l = "androidx.preference.PreferenceFragment.DIALOG";

    /* JADX INFO: renamed from: r */
    private static final String f5614r = "android:preferences";

    /* JADX INFO: renamed from: t */
    @Deprecated
    public static final String f5615t = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";

    /* JADX INFO: renamed from: g */
    private boolean f5616g;

    /* JADX INFO: renamed from: h */
    private Runnable f5617h;

    /* JADX INFO: renamed from: n */
    RecyclerView f5620n;

    /* JADX INFO: renamed from: q */
    private ki f5622q;

    /* JADX INFO: renamed from: s */
    private Context f5623s;

    /* JADX INFO: renamed from: y */
    private boolean f5624y;

    /* JADX INFO: renamed from: k */
    private final C1038q f5619k = new C1038q();

    /* JADX INFO: renamed from: p */
    private int f5621p = fn3e.C1013y.f51958ld6;

    /* JADX INFO: renamed from: i */
    private final Handler f5618i = new HandlerC1036k();

    /* JADX INFO: renamed from: z */
    private final Runnable f5625z = new toq();

    /* JADX INFO: compiled from: PreferenceFragment.java */
    public interface f7l8 {
        /* JADX INFO: renamed from: k */
        boolean m4734k(@lvui x2 x2Var, @lvui PreferenceScreen preferenceScreen);
    }

    /* JADX INFO: renamed from: androidx.preference.x2$g */
    /* JADX INFO: compiled from: PreferenceFragment.java */
    public interface InterfaceC1035g {
        /* JADX INFO: renamed from: k */
        boolean m4735k(@lvui x2 x2Var, @lvui Preference preference);
    }

    /* JADX INFO: renamed from: androidx.preference.x2$k */
    /* JADX INFO: compiled from: PreferenceFragment.java */
    class HandlerC1036k extends Handler {
        HandlerC1036k() {
        }

        @Override // android.os.Handler
        public void handleMessage(@lvui Message message) {
            if (message.what != 1) {
                return;
            }
            x2.this.toq();
        }
    }

    /* JADX INFO: renamed from: androidx.preference.x2$n */
    /* JADX INFO: compiled from: PreferenceFragment.java */
    public interface InterfaceC1037n {
        /* JADX INFO: renamed from: k */
        boolean m4736k(@lvui x2 x2Var, @lvui Preference preference);
    }

    /* JADX INFO: renamed from: androidx.preference.x2$q */
    /* JADX INFO: compiled from: PreferenceFragment.java */
    private class C1038q extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private Drawable f5627k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f51986toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f51987zy = true;

        C1038q() {
        }

        private boolean qrj(@lvui View view, @lvui RecyclerView recyclerView) {
            RecyclerView.fti childViewHolder = recyclerView.getChildViewHolder(view);
            boolean z2 = false;
            if (!((childViewHolder instanceof C1016i) && ((C1016i) childViewHolder).fu4())) {
                return false;
            }
            boolean z3 = this.f51987zy;
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

        public void ld6(@dd Drawable drawable) {
            if (drawable != null) {
                this.f51986toq = drawable.getIntrinsicHeight();
            } else {
                this.f51986toq = 0;
            }
            this.f5627k = drawable;
            x2.this.f5620n.invalidateItemDecorations();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect rect, @lvui View view, @lvui RecyclerView recyclerView, @lvui RecyclerView.mcp mcpVar) {
            if (qrj(view, recyclerView)) {
                rect.bottom = this.f51986toq;
            }
        }

        /* JADX INFO: renamed from: p */
        public void m4737p(boolean z2) {
            this.f51987zy = z2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: s */
        public void mo4713s(@lvui Canvas canvas, @lvui RecyclerView recyclerView, @lvui RecyclerView.mcp mcpVar) {
            if (this.f5627k == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (qrj(childAt, recyclerView)) {
                    int y3 = ((int) childAt.getY()) + childAt.getHeight();
                    this.f5627k.setBounds(0, y3, width, this.f51986toq + y3);
                    this.f5627k.draw(canvas);
                }
            }
        }

        public void x2(int i2) {
            this.f51986toq = i2;
            x2.this.f5620n.invalidateItemDecorations();
        }
    }

    /* JADX INFO: compiled from: PreferenceFragment.java */
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
            RecyclerView recyclerView = x2.this.f5620n;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.x2$y */
    /* JADX INFO: compiled from: PreferenceFragment.java */
    private static class C1039y extends RecyclerView.AbstractC1053p {

        /* JADX INFO: renamed from: k */
        private final RecyclerView.AbstractC1060y<?> f5630k;

        /* JADX INFO: renamed from: q */
        private final String f5631q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final RecyclerView f51988toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Preference f51989zy;

        C1039y(@lvui RecyclerView.AbstractC1060y<?> abstractC1060y, @lvui RecyclerView recyclerView, Preference preference, String str) {
            this.f5630k = abstractC1060y;
            this.f51988toq = recyclerView;
            this.f51989zy = preference;
            this.f5631q = str;
        }

        /* JADX INFO: renamed from: k */
        private void m4738k() {
            this.f5630k.unregisterAdapterDataObserver(this);
            Preference preference = this.f51989zy;
            int iMo4670q = preference != null ? ((PreferenceGroup.zy) this.f5630k).mo4670q(preference) : ((PreferenceGroup.zy) this.f5630k).qrj(this.f5631q);
            if (iMo4670q != -1) {
                this.f51988toq.scrollToPosition(iMo4670q);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onChanged() {
            m4738k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int i2, int i3) {
            m4738k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeInserted(int i2, int i3) {
            m4738k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeMoved(int i2, int i3, int i4) {
            m4738k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeRemoved(int i2, int i3) {
            m4738k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int i2, int i3, Object obj) {
            m4738k();
        }
    }

    /* JADX INFO: compiled from: PreferenceFragment.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Preference f5632k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f5634q;

        zy(Preference preference, String str) {
            this.f5632k = preference;
            this.f5634q = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            RecyclerView.AbstractC1060y adapter = x2.this.f5620n.getAdapter();
            if (!(adapter instanceof PreferenceGroup.zy)) {
                if (adapter != 0) {
                    throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            Preference preference = this.f5632k;
            int iMo4670q = preference != null ? ((PreferenceGroup.zy) adapter).mo4670q(preference) : ((PreferenceGroup.zy) adapter).qrj(this.f5634q);
            if (iMo4670q != -1) {
                x2.this.f5620n.scrollToPosition(iMo4670q);
            } else {
                adapter.registerAdapterDataObserver(new C1039y(adapter, x2.this.f5620n, this.f5632k, this.f5634q));
            }
        }
    }

    private void cdj(Preference preference, String str) {
        zy zyVar = new zy(preference, str);
        if (this.f5620n == null) {
            this.f5617h = zyVar;
        } else {
            zyVar.run();
        }
    }

    private void n7h() {
        if (this.f5622q == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void qrj() {
        if (this.f5618i.hasMessages(1)) {
            return;
        }
        this.f5618i.obtainMessage(1).sendToTarget();
    }

    private void zurt() {
        PreferenceScreen preferenceScreenM4725g = m4725g();
        if (preferenceScreenM4725g != null) {
            preferenceScreenM4725g.yz();
        }
        x2();
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    protected void f7l8() {
    }

    @Override // androidx.preference.DialogPreference.InterfaceC0987k
    @Deprecated
    public <T extends Preference> T findPreference(@lvui CharSequence charSequence) {
        ki kiVar = this.f5622q;
        if (kiVar == null) {
            return null;
        }
        return (T) kiVar.toq(charSequence);
    }

    @Deprecated
    public void fn3e(@InterfaceC7824b int i2, @dd String str) {
        n7h();
        PreferenceScreen preferenceScreenKi = this.f5622q.ki(this.f5623s, i2, null);
        Preference preference = preferenceScreenKi;
        if (str != null) {
            Preference preferenceVep5 = preferenceScreenKi.vep5(str);
            boolean z2 = preferenceVep5 instanceof PreferenceScreen;
            preference = preferenceVep5;
            if (!z2) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        m4727i((PreferenceScreen) preference);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public PreferenceScreen m4725g() {
        return this.f5622q.n7h();
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public void m4726h(@lvui String str) {
        cdj(null, str);
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public void m4727i(PreferenceScreen preferenceScreen) {
        if (!this.f5622q.mcp(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        x2();
        this.f5616g = true;
        if (this.f5624y) {
            qrj();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public void m4728k(@InterfaceC7824b int i2) {
        n7h();
        m4727i(this.f5622q.ki(this.f5623s, i2, m4725g()));
    }

    @Deprecated
    public void ki(@dd Drawable drawable) {
        this.f5619k.ld6(drawable);
    }

    @Deprecated
    public void kja0(@lvui Preference preference) {
        cdj(preference, null);
    }

    @lvui
    @Deprecated
    public RecyclerView ld6(@lvui LayoutInflater layoutInflater, @lvui ViewGroup viewGroup, @dd Bundle bundle) {
        RecyclerView recyclerView;
        if (this.f5623s.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(fn3e.C1007g.f5463n)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(fn3e.C1013y.f51960qrj, viewGroup, false);
        recyclerView2.setLayoutManager(m4732s());
        recyclerView2.setAccessibilityDelegateCompat(new t8r(recyclerView2));
        return recyclerView2;
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public ki m4729n() {
        return this.f5622q;
    }

    @Override // android.app.Fragment
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(fn3e.C1008k.f5476l, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = fn3e.C1010p.f5520s;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i2);
        this.f5623s = contextThemeWrapper;
        ki kiVar = new ki(contextThemeWrapper);
        this.f5622q = kiVar;
        kiVar.m4697z(this);
        m4730p(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // android.app.Fragment
    @lvui
    public View onCreateView(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle) {
        Context context = this.f5623s;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, fn3e.ld6.f51914y2, androidx.core.content.res.kja0.m2303k(context, fn3e.C1008k.f5482r, R.attr.preferenceFragmentStyle), 0);
        this.f5621p = typedArrayObtainStyledAttributes.getResourceId(fn3e.ld6.f51821c8jq, this.f5621p);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(fn3e.ld6.f51845gyi);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(fn3e.ld6.f51830dr, -1);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(fn3e.ld6.f51913xwq3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(this.f5623s);
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f5621p, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewLd6 = ld6(layoutInflaterCloneInContext, viewGroup2, bundle);
        if (recyclerViewLd6 == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.f5620n = recyclerViewLd6;
        recyclerViewLd6.addItemDecoration(this.f5619k);
        ki(drawable);
        if (dimensionPixelSize != -1) {
            t8r(dimensionPixelSize);
        }
        this.f5619k.m4737p(z2);
        if (this.f5620n.getParent() == null) {
            viewGroup2.addView(this.f5620n);
        }
        this.f5618i.post(this.f5625z);
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f5618i.removeCallbacks(this.f5625z);
        this.f5618i.removeMessages(1);
        if (this.f5616g) {
            zurt();
        }
        this.f5620n = null;
        super.onDestroyView();
    }

    @Override // androidx.preference.ki.InterfaceC1019k
    @Deprecated
    public void onDisplayPreferenceDialog(@lvui Preference preference) {
        DialogFragment dialogFragmentM4680s;
        boolean zM4736k = zy() instanceof InterfaceC1037n ? ((InterfaceC1037n) zy()).m4736k(this, preference) : false;
        if (!zM4736k && (getActivity() instanceof InterfaceC1037n)) {
            zM4736k = ((InterfaceC1037n) getActivity()).m4736k(this, preference);
        }
        if (!zM4736k && getFragmentManager().findFragmentByTag(f5613l) == null) {
            if (preference instanceof EditTextPreference) {
                dialogFragmentM4680s = androidx.preference.toq.m4723s(preference.fn3e());
            } else if (preference instanceof ListPreference) {
                dialogFragmentM4680s = DialogFragmentC1023n.m4700s(preference.fn3e());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
                }
                dialogFragmentM4680s = androidx.preference.f7l8.m4680s(preference.fn3e());
            }
            dialogFragmentM4680s.setTargetFragment(this, 0);
            dialogFragmentM4680s.show(getFragmentManager(), f5613l);
        }
    }

    @Override // androidx.preference.ki.toq
    @Deprecated
    public void onNavigateToScreen(@lvui PreferenceScreen preferenceScreen) {
        if ((zy() instanceof f7l8 ? ((f7l8) zy()).m4734k(this, preferenceScreen) : false) || !(getActivity() instanceof f7l8)) {
            return;
        }
        ((f7l8) getActivity()).m4734k(this, preferenceScreen);
    }

    @Override // androidx.preference.ki.zy
    @Deprecated
    public boolean onPreferenceTreeClick(@lvui Preference preference) {
        if (preference.m4652h() == null) {
            return false;
        }
        boolean zM4735k = zy() instanceof InterfaceC1035g ? ((InterfaceC1035g) zy()).m4735k(this, preference) : false;
        return (zM4735k || !(getActivity() instanceof InterfaceC1035g)) ? zM4735k : ((InterfaceC1035g) getActivity()).m4735k(this, preference);
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreenM4725g = m4725g();
        if (preferenceScreenM4725g != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenM4725g.m4649d(bundle2);
            bundle.putBundle(f5614r, bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f5622q.o1t(this);
        this.f5622q.fu4(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f5622q.o1t(null);
        this.f5622q.fu4(null);
    }

    @Override // android.app.Fragment
    public void onViewCreated(@lvui View view, @dd Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenM4725g;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(f5614r)) != null && (preferenceScreenM4725g = m4725g()) != null) {
            preferenceScreenM4725g.ikck(bundle2);
        }
        if (this.f5616g) {
            toq();
            Runnable runnable = this.f5617h;
            if (runnable != null) {
                runnable.run();
                this.f5617h = null;
            }
        }
        this.f5624y = true;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public abstract void m4730p(@dd Bundle bundle, String str);

    @Deprecated
    /* JADX INFO: renamed from: q */
    public final RecyclerView m4731q() {
        return this.f5620n;
    }

    @lvui
    @Deprecated
    /* JADX INFO: renamed from: s */
    public RecyclerView.AbstractC1048h m4732s() {
        return new LinearLayoutManager(getActivity());
    }

    @Deprecated
    public void t8r(int i2) {
        this.f5619k.x2(i2);
    }

    void toq() {
        PreferenceScreen preferenceScreenM4725g = m4725g();
        if (preferenceScreenM4725g != null) {
            m4731q().setAdapter(m4733y(preferenceScreenM4725g));
            preferenceScreenM4725g.nn86();
        }
        f7l8();
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    protected void x2() {
    }

    @lvui
    @Deprecated
    /* JADX INFO: renamed from: y */
    protected RecyclerView.AbstractC1060y m4733y(@lvui PreferenceScreen preferenceScreen) {
        return new n7h(preferenceScreen);
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public Fragment zy() {
        return null;
    }
}
