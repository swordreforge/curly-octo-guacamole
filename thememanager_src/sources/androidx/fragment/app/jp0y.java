package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ListFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class jp0y extends Fragment {

    /* JADX INFO: renamed from: f */
    static final int f4804f = 16711683;

    /* JADX INFO: renamed from: l */
    static final int f4805l = 16711682;

    /* JADX INFO: renamed from: r */
    static final int f4806r = 16711681;

    /* JADX INFO: renamed from: g */
    ListAdapter f4807g;

    /* JADX INFO: renamed from: h */
    View f4808h;

    /* JADX INFO: renamed from: i */
    View f4809i;

    /* JADX INFO: renamed from: p */
    TextView f4812p;

    /* JADX INFO: renamed from: s */
    View f4814s;

    /* JADX INFO: renamed from: t */
    boolean f4815t;

    /* JADX INFO: renamed from: y */
    ListView f4816y;

    /* JADX INFO: renamed from: z */
    CharSequence f4817z;

    /* JADX INFO: renamed from: k */
    private final Handler f4810k = new Handler();

    /* JADX INFO: renamed from: q */
    private final Runnable f4813q = new RunnableC0883k();

    /* JADX INFO: renamed from: n */
    private final AdapterView.OnItemClickListener f4811n = new toq();

    /* JADX INFO: renamed from: androidx.fragment.app.jp0y$k */
    /* JADX INFO: compiled from: ListFragment.java */
    class RunnableC0883k implements Runnable {
        RunnableC0883k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = jp0y.this.f4816y;
            listView.focusableViewAvailable(listView);
        }
    }

    /* JADX INFO: compiled from: ListFragment.java */
    class toq implements AdapterView.OnItemClickListener {
        toq() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            jp0y.this.m2t((ListView) adapterView, view, i2, j2);
        }
    }

    private void nnh(boolean z2, boolean z3) {
        r25n();
        View view = this.f4808h;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f4815t == z2) {
            return;
        }
        this.f4815t = z2;
        if (z2) {
            if (z3) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f4809i.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f4809i.clearAnimation();
            }
            this.f4808h.setVisibility(8);
            this.f4809i.setVisibility(0);
            return;
        }
        if (z3) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.f4809i.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f4809i.clearAnimation();
        }
        this.f4808h.setVisibility(0);
        this.f4809i.setVisibility(8);
    }

    private void r25n() {
        if (this.f4816y != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f4816y = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(f4806r);
            this.f4812p = textView;
            if (textView == null) {
                this.f4814s = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f4808h = view.findViewById(f4805l);
            this.f4809i = view.findViewById(f4804f);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f4816y = listView;
            View view2 = this.f4814s;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f4817z;
                if (charSequence != null) {
                    this.f4812p.setText(charSequence);
                    this.f4816y.setEmptyView(this.f4812p);
                }
            }
        }
        this.f4815t = true;
        this.f4816y.setOnItemClickListener(this.f4811n);
        ListAdapter listAdapter = this.f4807g;
        if (listAdapter != null) {
            this.f4807g = null;
            v5yj(listAdapter);
        } else if (this.f4808h != null) {
            nnh(false, false);
        }
        this.f4810k.post(this.f4813q);
    }

    @dd
    public ListAdapter ew() {
        return this.f4807g;
    }

    @lvui
    public ListView ix() {
        r25n();
        return this.f4816y;
    }

    public void kiv(int i2) {
        r25n();
        this.f4816y.setSelection(i2);
    }

    public long kx3() {
        r25n();
        return this.f4816y.getSelectedItemId();
    }

    public void m2t(@lvui ListView listView, @lvui View view, int i2, long j2) {
    }

    @Override // androidx.fragment.app.Fragment
    @dd
    public View onCreateView(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(f4805l);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(f4804f);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(f4806r);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f4810k.removeCallbacks(this.f4813q);
        this.f4816y = null;
        this.f4815t = false;
        this.f4809i = null;
        this.f4808h = null;
        this.f4814s = null;
        this.f4812p = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@lvui View view, @dd Bundle bundle) {
        super.onViewCreated(view, bundle);
        r25n();
    }

    public void ps(@dd CharSequence charSequence) {
        r25n();
        TextView textView = this.f4812p;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.f4817z == null) {
            this.f4816y.setEmptyView(this.f4812p);
        }
        this.f4817z = charSequence;
    }

    public void ra(boolean z2) {
        nnh(z2, true);
    }

    @lvui
    public final ListAdapter u38j() {
        ListAdapter listAdapterEw = ew();
        if (listAdapterEw != null) {
            return listAdapterEw;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void uf(boolean z2) {
        nnh(z2, false);
    }

    public void v5yj(@dd ListAdapter listAdapter) {
        boolean z2 = this.f4807g != null;
        this.f4807g = listAdapter;
        ListView listView = this.f4816y;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f4815t || z2) {
                return;
            }
            nnh(true, requireView().getWindowToken() != null);
        }
    }

    /* JADX INFO: renamed from: w */
    public int m4292w() {
        r25n();
        return this.f4816y.getSelectedItemPosition();
    }
}
