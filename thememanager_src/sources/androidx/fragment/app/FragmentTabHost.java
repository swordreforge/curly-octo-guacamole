package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: g */
    private FragmentManager f4741g;

    /* JADX INFO: renamed from: h */
    private boolean f4742h;

    /* JADX INFO: renamed from: k */
    private final ArrayList<toq> f4743k;

    /* JADX INFO: renamed from: n */
    private Context f4744n;

    /* JADX INFO: renamed from: p */
    private toq f4745p;

    /* JADX INFO: renamed from: q */
    private FrameLayout f4746q;

    /* JADX INFO: renamed from: s */
    private TabHost.OnTabChangeListener f4747s;

    /* JADX INFO: renamed from: y */
    private int f4748y;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.fragment.app.FragmentTabHost.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: k */
        String f4749k;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @lvui
        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f4749k + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f4749k);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4749k = parcel.readString();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentTabHost$k */
    static class C0871k implements TabHost.TabContentFactory {

        /* JADX INFO: renamed from: k */
        private final Context f4750k;

        public C0871k(Context context) {
            this.f4750k = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f4750k);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    static final class toq {

        /* JADX INFO: renamed from: k */
        @lvui
        final String f4751k;

        /* JADX INFO: renamed from: q */
        Fragment f4752q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        final Class<?> f51472toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        final Bundle f51473zy;

        toq(@lvui String str, @lvui Class<?> cls, @dd Bundle bundle) {
            this.f4751k = str;
            this.f51472toq = cls;
            this.f51473zy = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@lvui Context context) {
        super(context, null);
        this.f4743k = new ArrayList<>();
        m4228g(context, null);
    }

    /* JADX INFO: renamed from: g */
    private void m4228g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f4748y = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @dd
    /* JADX INFO: renamed from: n */
    private toq m4229n(String str) {
        int size = this.f4743k.size();
        for (int i2 = 0; i2 < size; i2++) {
            toq toqVar = this.f4743k.get(i2);
            if (toqVar.f4751k.equals(str)) {
                return toqVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    private void m4230q(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f4746q = frameLayout2;
            frameLayout2.setId(this.f4748y);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @dd
    private o1t toq(@dd String str, @dd o1t o1tVar) {
        Fragment fragment;
        toq toqVarM4229n = m4229n(str);
        if (this.f4745p != toqVarM4229n) {
            if (o1tVar == null) {
                o1tVar = this.f4741g.ki();
            }
            toq toqVar = this.f4745p;
            if (toqVar != null && (fragment = toqVar.f4752q) != null) {
                o1tVar.ki(fragment);
            }
            if (toqVarM4229n != null) {
                Fragment fragment2 = toqVarM4229n.f4752q;
                if (fragment2 == null) {
                    Fragment fragmentMo4213k = this.f4741g.vq().mo4213k(this.f4744n.getClassLoader(), toqVarM4229n.f51472toq.getName());
                    toqVarM4229n.f4752q = fragmentMo4213k;
                    fragmentMo4213k.setArguments(toqVarM4229n.f51473zy);
                    o1tVar.zy(this.f4748y, toqVarM4229n.f4752q, toqVarM4229n.f4751k);
                } else {
                    o1tVar.x2(fragment2);
                }
            }
            this.f4745p = toqVarM4229n;
        }
        return o1tVar;
    }

    private void zy() {
        if (this.f4746q == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f4748y);
            this.f4746q = frameLayout;
            if (frameLayout != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.f4748y);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public void m4231k(@lvui TabHost.TabSpec tabSpec, @lvui Class<?> cls, @dd Bundle bundle) {
        tabSpec.setContent(new C0871k(this.f4744n));
        String tag = tabSpec.getTag();
        toq toqVar = new toq(tag, cls, bundle);
        if (this.f4742h) {
            Fragment fragmentNmn5 = this.f4741g.nmn5(tag);
            toqVar.f4752q = fragmentNmn5;
            if (fragmentNmn5 != null && !fragmentNmn5.isDetached()) {
                o1t o1tVarKi = this.f4741g.ki();
                o1tVarKi.ki(toqVar.f4752q);
                o1tVarKi.qrj();
            }
        }
        this.f4743k.add(toqVar);
        addTab(tabSpec);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f4743k.size();
        o1t o1tVarKi = null;
        for (int i2 = 0; i2 < size; i2++) {
            toq toqVar = this.f4743k.get(i2);
            Fragment fragmentNmn5 = this.f4741g.nmn5(toqVar.f4751k);
            toqVar.f4752q = fragmentNmn5;
            if (fragmentNmn5 != null && !fragmentNmn5.isDetached()) {
                if (toqVar.f4751k.equals(currentTabTag)) {
                    this.f4745p = toqVar;
                } else {
                    if (o1tVarKi == null) {
                        o1tVarKi = this.f4741g.ki();
                    }
                    o1tVarKi.ki(toqVar.f4752q);
                }
            }
        }
        this.f4742h = true;
        o1t qVar = toq(currentTabTag, o1tVarKi);
        if (qVar != null) {
            qVar.qrj();
            this.f4741g.a98o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4742h = false;
    }

    @Override // android.view.View
    @Deprecated
    protected void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f4749k);
    }

    @Override // android.view.View
    @lvui
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4749k = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@dd String str) {
        o1t qVar;
        if (this.f4742h && (qVar = toq(str, null)) != null) {
            qVar.qrj();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f4747s;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@dd TabHost.OnTabChangeListener onTabChangeListener) {
        this.f4747s = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(@lvui Context context, @lvui FragmentManager fragmentManager) {
        m4230q(context);
        super.setup();
        this.f4744n = context;
        this.f4741g = fragmentManager;
        zy();
    }

    @Deprecated
    public FragmentTabHost(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4743k = new ArrayList<>();
        m4228g(context, attributeSet);
    }

    @Deprecated
    public void setup(@lvui Context context, @lvui FragmentManager fragmentManager, int i2) {
        m4230q(context);
        super.setup();
        this.f4744n = context;
        this.f4741g = fragmentManager;
        this.f4748y = i2;
        zy();
        this.f4746q.setId(i2);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }
}
