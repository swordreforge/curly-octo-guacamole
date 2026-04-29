package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.C0683f;
import androidx.cursoradapter.widget.AbstractC0773k;
import androidx.customview.view.AbsSavedState;
import com.android.thememanager.router.app.entity.ThemeStatus;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.zy {
    private static final String ut = "nm";
    static final n7h wh6;
    static final boolean xhv = false;
    static final String zm = "SearchView";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    final SearchAutoComplete f46820ab;
    private final ImageView ac;
    private final Drawable ad;
    private final Intent aj;
    private final int am;
    final ImageView an;
    private ld6 ar;
    private final View as;
    private int[] ax;
    private final int ay;
    private Rect az;
    private Rect ba;
    private final View bb;
    View.OnFocusChangeListener bc;
    private View.OnClickListener bd;
    private final Intent be;
    private kja0 bg;
    final ImageView bl;
    private final View bp;
    private int[] bq;
    private final CharSequence bs;
    private qrj bu;
    private final View bv;
    SearchableInfo cw14;
    private final View.OnClickListener d1cy;
    private boolean dy;
    private final AdapterView.OnItemClickListener ei;
    private int hp;
    final ImageView id;
    final ImageView in;
    private x2 k0;
    private boolean k6e;
    private boolean mjvl;
    private final WeakHashMap<String, Drawable.ConstantState> ndjo;
    private Runnable q7k9;
    private CharSequence s8y;
    private boolean sk1t;
    AbstractC0773k tgs;
    private final Runnable th6;
    private boolean tlhn;
    private int vb6;
    private boolean w97r;
    private final AdapterView.OnItemSelectedListener wra;
    private CharSequence xk5;
    View.OnKeyListener xqx;
    private Bundle xy8;
    private boolean yl25;
    private CharSequence zmmu;
    private final TextView.OnEditorActionListener zr5t;
    private TextWatcher zsl;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.widget.SearchView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: q */
        boolean f863q;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f863q + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f863q));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f863q = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: h */
        final Runnable f864h;

        /* JADX INFO: renamed from: p */
        private boolean f865p;

        /* JADX INFO: renamed from: s */
        private SearchView f866s;

        /* JADX INFO: renamed from: y */
        private int f867y;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$k */
        class RunnableC0167k implements Runnable {
            RunnableC0167k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m496q();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 < 960 || i3 < 720 || configuration.orientation != 2) {
                return i2 < 600 ? (i2 < 640 || i3 < 480) ? ThemeStatus.Redeem.REDEEMING : com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4 : com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4;
            }
            return 256;
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f867y <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f865p) {
                removeCallbacks(this.f864h);
                post(this.f864h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            this.f866s.m493o();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f866s.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f866s.hasFocus() && getVisibility() == 0) {
                this.f865p = true;
                if (SearchView.dd(getContext())) {
                    toq();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        /* JADX INFO: renamed from: q */
        void m496q() {
            if (this.f865p) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f865p = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z2) {
                this.f865p = false;
                removeCallbacks(this.f864h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f865p = true;
                    return;
                }
                this.f865p = false;
                removeCallbacks(this.f864h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f866s = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f867y = i2;
        }

        void toq() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.wh6.zy(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean zy() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C7397k.toq.f92921n5r1);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f864h = new RunnableC0167k();
            this.f867y = getThreshold();
        }
    }

    class f7l8 implements View.OnKeyListener {
        f7l8() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.cw14 == null) {
                return false;
            }
            if (searchView.f46820ab.isPopupShowing() && SearchView.this.f46820ab.getListSelection() != -1) {
                return SearchView.this.hb(view, i2, keyEvent);
            }
            if (SearchView.this.f46820ab.zy() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.hyr(0, null, searchView2.f46820ab.getText().toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$g */
    class ViewOnClickListenerC0168g implements View.OnClickListener {
        ViewOnClickListenerC0168g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.an) {
                searchView.m489e();
                return;
            }
            if (view == searchView.in) {
                searchView.m488c();
                return;
            }
            if (view == searchView.id) {
                searchView.nn86();
            } else if (view == searchView.bl) {
                searchView.m492m();
            } else if (view == searchView.f46820ab) {
                searchView.d3();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$k */
    class C0169k implements TextWatcher {
        C0169k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView.this.m490j(charSequence);
        }
    }

    private static class kja0 extends TouchDelegate {

        /* JADX INFO: renamed from: g */
        private boolean f872g;

        /* JADX INFO: renamed from: k */
        private final View f873k;

        /* JADX INFO: renamed from: n */
        private final int f874n;

        /* JADX INFO: renamed from: q */
        private final Rect f875q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Rect f46821toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Rect f46822zy;

        public kja0(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f874n = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f46821toq = new Rect();
            this.f875q = new Rect();
            this.f46822zy = new Rect();
            m497k(rect, rect2);
            this.f873k = view;
        }

        /* JADX INFO: renamed from: k */
        public void m497k(Rect rect, Rect rect2) {
            this.f46821toq.set(rect);
            this.f875q.set(rect);
            Rect rect3 = this.f875q;
            int i2 = this.f874n;
            rect3.inset(-i2, -i2);
            this.f46822zy.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z2;
            boolean z3;
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z5 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z3 = this.f872g;
                    if (z3 && !this.f875q.contains(x3, y3)) {
                        z5 = z3;
                        z2 = false;
                    }
                } else {
                    if (action == 3) {
                        z3 = this.f872g;
                        this.f872g = false;
                    }
                    z2 = true;
                    z5 = false;
                }
                z5 = z3;
                z2 = true;
            } else if (this.f46821toq.contains(x3, y3)) {
                this.f872g = true;
                z2 = true;
            } else {
                z2 = true;
                z5 = false;
            }
            if (!z5) {
                return false;
            }
            if (!z2 || this.f46822zy.contains(x3, y3)) {
                Rect rect = this.f46822zy;
                motionEvent.setLocation(x3 - rect.left, y3 - rect.top);
            } else {
                motionEvent.setLocation(this.f873k.getWidth() / 2, this.f873k.getHeight() / 2);
            }
            return this.f873k.dispatchTouchEvent(motionEvent);
        }
    }

    public interface ld6 {
        /* JADX INFO: renamed from: k */
        boolean m498k();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$n */
    class ViewOnLayoutChangeListenerC0170n implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0170n() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView.this.mcp();
        }
    }

    private static class n7h {

        /* JADX INFO: renamed from: k */
        private Method f877k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Method f46823toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Method f46824zy;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n7h() {
            this.f877k = null;
            this.f46823toq = null;
            this.f46824zy = null;
            m499q();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f877k = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f46823toq = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f46824zy = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* JADX INFO: renamed from: q */
        private static void m499q() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* JADX INFO: renamed from: k */
        void m500k(AutoCompleteTextView autoCompleteTextView) {
            m499q();
            Method method = this.f46823toq;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void toq(AutoCompleteTextView autoCompleteTextView) {
            m499q();
            Method method = this.f877k;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void zy(AutoCompleteTextView autoCompleteTextView) {
            m499q();
            Method method = this.f46824zy;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$p */
    class C0171p implements AdapterView.OnItemSelectedListener {
        C0171p() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.uv6(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$q */
    class ViewOnFocusChangeListenerC0172q implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC0172q() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.bc;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z2);
            }
        }
    }

    public interface qrj {
        /* JADX INFO: renamed from: k */
        boolean m501k(int i2);

        boolean toq(int i2);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$s */
    class C0173s implements AdapterView.OnItemClickListener {
        C0173s() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.lrht(i2, 0, null);
        }
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m487b();
        }
    }

    public interface x2 {
        /* JADX INFO: renamed from: k */
        boolean m502k(String str);

        boolean toq(String str);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$y */
    class C0174y implements TextView.OnEditorActionListener {
        C0174y() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.nn86();
            return true;
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0773k abstractC0773k = SearchView.this.tgs;
            if (abstractC0773k instanceof hb) {
                abstractC0773k.mo602k(null);
            }
        }
    }

    static {
        wh6 = Build.VERSION.SDK_INT < 29 ? new n7h() : null;
    }

    public SearchView(@zy.lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private void m484a(boolean z2) {
        this.id.setVisibility((this.yl25 && ncyb() && hasFocus() && (z2 || !this.k6e)) ? 0 : 8);
    }

    private Intent a9(Cursor cursor, int i2, String str) {
        int position;
        String strM599i;
        try {
            String strM599i2 = hb.m599i(cursor, "suggest_intent_action");
            if (strM599i2 == null) {
                strM599i2 = this.cw14.getSuggestIntentAction();
            }
            if (strM599i2 == null) {
                strM599i2 = "android.intent.action.SEARCH";
            }
            String str2 = strM599i2;
            String strM599i3 = hb.m599i(cursor, "suggest_intent_data");
            if (strM599i3 == null) {
                strM599i3 = this.cw14.getSuggestIntentData();
            }
            if (strM599i3 != null && (strM599i = hb.m599i(cursor, "suggest_intent_data_id")) != null) {
                strM599i3 = strM599i3 + "/" + Uri.encode(strM599i);
            }
            return jk(str2, strM599i3 == null ? null : Uri.parse(strM599i3), hb.m599i(cursor, "suggest_intent_extra_data"), hb.m599i(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w(zm, "Search suggestions cursor at row " + position + " returned exception.", e2);
            return null;
        }
    }

    private void a98o() {
        this.bv.setVisibility((ncyb() && (this.id.getVisibility() == 0 || this.bl.getVisibility() == 0)) ? 0 : 8);
    }

    private void bf2() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f46820ab;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(eqxt(queryHint));
    }

    private boolean d2ok() {
        SearchableInfo searchableInfo = this.cw14;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.cw14.getVoiceSearchLaunchWebSearch()) {
            intent = this.be;
        } else if (this.cw14.getVoiceSearchLaunchRecognizer()) {
            intent = this.aj;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean dd(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private void ek5k() {
        post(this.th6);
    }

    private CharSequence eqxt(CharSequence charSequence) {
        if (!this.tlhn || this.ad == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f46820ab.getTextSize()) * 1.25d);
        this.ad.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.ad), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f */
    private boolean m485f(int i2, int i3, String str) {
        Cursor cursorZy = this.tgs.zy();
        if (cursorZy == null || !cursorZy.moveToPosition(i2)) {
            return false;
        }
        n5r1(a9(cursorZy, i3, str));
        return true;
    }

    private Intent fti(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.xy8;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C7397k.n.f42395j);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C7397k.n.f42400o);
    }

    private void gvn7() {
        this.f46820ab.dismissDropDown();
    }

    private void i1() {
        this.f46820ab.setThreshold(this.cw14.getSuggestThreshold());
        this.f46820ab.setImeOptions(this.cw14.getImeOptions());
        int inputType = this.cw14.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.cw14.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f46820ab.setInputType(inputType);
        AbstractC0773k abstractC0773k = this.tgs;
        if (abstractC0773k != null) {
            abstractC0773k.mo602k(null);
        }
        if (this.cw14.getSuggestAuthority() != null) {
            hb hbVar = new hb(getContext(), this, this.cw14, this.ndjo);
            this.tgs = hbVar;
            this.f46820ab.setAdapter(hbVar);
            ((hb) this.tgs).jk(this.sk1t ? 2 : 1);
        }
    }

    private Intent jk(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.s8y);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.xy8;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.cw14.getSearchActivity());
        return intent;
    }

    private Intent jp0y(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void n5r1(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e(zm, "Failed launch activity: " + intent, e2);
        }
    }

    private boolean ncyb() {
        return (this.yl25 || this.k6e) && !m494r();
    }

    private void oc(View view, Rect rect) {
        view.getLocationInWindow(this.ax);
        getLocationInWindow(this.bq);
        int[] iArr = this.ax;
        int i2 = iArr[1];
        int[] iArr2 = this.bq;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    /* JADX INFO: renamed from: x */
    private void m486x(boolean z2) {
        int i2 = 8;
        if (this.k6e && !m494r() && z2) {
            this.id.setVisibility(8);
            i2 = 0;
        }
        this.bl.setVisibility(i2);
    }

    private void y9n() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f46820ab.getText());
        if (!z3 && (!this.tlhn || this.mjvl)) {
            z2 = false;
        }
        this.in.setVisibility(z2 ? 0 : 8);
        Drawable drawable = this.in.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void yz(int i2) {
        Editable text = this.f46820ab.getText();
        Cursor cursorZy = this.tgs.zy();
        if (cursorZy == null) {
            return;
        }
        if (!cursorZy.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.tgs.convertToString(cursorZy);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    private void zp(boolean z2) {
        this.w97r = z2;
        int i2 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f46820ab.getText());
        this.an.setVisibility(i2);
        m484a(z3);
        this.bb.setVisibility(z2 ? 8 : 0);
        this.ac.setVisibility((this.ac.getDrawable() == null || this.tlhn) ? 8 : 0);
        y9n();
        m486x(!z3);
        a98o();
    }

    /* JADX INFO: renamed from: b */
    void m487b() {
        int[] iArr = this.f46820ab.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.bp.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.bv.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    void m488c() {
        if (!TextUtils.isEmpty(this.f46820ab.getText())) {
            this.f46820ab.setText("");
            this.f46820ab.requestFocus();
            this.f46820ab.setImeVisibility(true);
        } else if (this.tlhn) {
            ld6 ld6Var = this.ar;
            if (ld6Var == null || !ld6Var.m498k()) {
                clearFocus();
                zp(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.dy = true;
        super.clearFocus();
        this.f46820ab.clearFocus();
        this.f46820ab.setImeVisibility(false);
        this.dy = false;
    }

    void d3() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f46820ab.refreshAutoCompleteResults();
            return;
        }
        n7h n7hVar = wh6;
        n7hVar.toq(this.f46820ab);
        n7hVar.m500k(this.f46820ab);
    }

    /* JADX INFO: renamed from: e */
    void m489e() {
        zp(false);
        this.f46820ab.requestFocus();
        this.f46820ab.setImeVisibility(true);
        View.OnClickListener onClickListener = this.bd;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public int getImeOptions() {
        return this.f46820ab.getImeOptions();
    }

    public int getInputType() {
        return this.f46820ab.getInputType();
    }

    public int getMaxWidth() {
        return this.vb6;
    }

    public CharSequence getQuery() {
        return this.f46820ab.getText();
    }

    @zy.dd
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.zmmu;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.cw14;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.bs : getContext().getText(this.cw14.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.ay;
    }

    int getSuggestionRowLayout() {
        return this.am;
    }

    public AbstractC0773k getSuggestionsAdapter() {
        return this.tgs;
    }

    boolean hb(View view, int i2, KeyEvent keyEvent) {
        if (this.cw14 != null && this.tgs != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return lrht(this.f46820ab.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.f46820ab.setSelection(i2 == 21 ? 0 : this.f46820ab.length());
                this.f46820ab.setListSelection(0);
                this.f46820ab.clearListSelection();
                this.f46820ab.toq();
                return true;
            }
            if (i2 == 19) {
                this.f46820ab.getListSelection();
                return false;
            }
        }
        return false;
    }

    void hyr(int i2, String str, String str2) {
        getContext().startActivity(jk("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    /* JADX INFO: renamed from: j */
    void m490j(CharSequence charSequence) {
        Editable text = this.f46820ab.getText();
        this.s8y = text;
        boolean z2 = !TextUtils.isEmpty(text);
        m484a(z2);
        m486x(!z2);
        y9n();
        a98o();
        if (this.k0 != null && !TextUtils.equals(charSequence, this.xk5)) {
            this.k0.m502k(charSequence.toString());
        }
        this.xk5 = charSequence.toString();
    }

    /* JADX INFO: renamed from: l */
    public boolean m491l() {
        return this.yl25;
    }

    boolean lrht(int i2, int i3, String str) {
        qrj qrjVar = this.bu;
        if (qrjVar != null && qrjVar.toq(i2)) {
            return false;
        }
        m485f(i2, 0, null);
        this.f46820ab.setImeVisibility(false);
        gvn7();
        return true;
    }

    public boolean lvui() {
        return this.tlhn;
    }

    /* JADX INFO: renamed from: m */
    void m492m() {
        SearchableInfo searchableInfo = this.cw14;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(jp0y(this.be, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(fti(this.aj, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w(zm, "Could not find voice search activity");
        }
    }

    void mcp() {
        if (this.as.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.bp.getPaddingLeft();
            Rect rect = new Rect();
            boolean qVar = nmn5.toq(this);
            int dimensionPixelSize = this.tlhn ? resources.getDimensionPixelSize(C7397k.n.f92517x9kr) + resources.getDimensionPixelSize(C7397k.n.f92495ncyb) : 0;
            this.f46820ab.getDropDownBackground().getPadding(rect);
            this.f46820ab.setDropDownHorizontalOffset(qVar ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f46820ab.setDropDownWidth((((this.as.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void nn86() {
        Editable text = this.f46820ab.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        x2 x2Var = this.k0;
        if (x2Var == null || !x2Var.toq(text.toString())) {
            if (this.cw14 != null) {
                hyr(0, null, text.toString());
            }
            this.f46820ab.setImeVisibility(false);
            gvn7();
        }
    }

    /* JADX INFO: renamed from: o */
    void m493o() {
        zp(m494r());
        ek5k();
        if (this.f46820ab.hasFocus()) {
            d3();
        }
    }

    @Override // androidx.appcompat.view.zy
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        zp(true);
        this.f46820ab.setImeOptions(this.hp);
        this.mjvl = false;
    }

    @Override // androidx.appcompat.view.zy
    public void onActionViewExpanded() {
        if (this.mjvl) {
            return;
        }
        this.mjvl = true;
        int imeOptions = this.f46820ab.getImeOptions();
        this.hp = imeOptions;
        this.f46820ab.setImeOptions(imeOptions | 33554432);
        this.f46820ab.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.th6);
        post(this.q7k9);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            oc(this.f46820ab, this.az);
            Rect rect = this.ba;
            Rect rect2 = this.az;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            kja0 kja0Var = this.bg;
            if (kja0Var != null) {
                kja0Var.m497k(this.ba, this.az);
                return;
            }
            kja0 kja0Var2 = new kja0(this.ba, this.az, this.f46820ab);
            this.bg = kja0Var2;
            setTouchDelegate(kja0Var2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        if (m494r()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.vb6;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.vb6;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.vb6) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        zp(savedState.f863q);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f863q = m494r();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        ek5k();
    }

    /* JADX INFO: renamed from: r */
    public boolean m494r() {
        return this.w97r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.dy || !isFocusable()) {
            return false;
        }
        if (m494r()) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.f46820ab.requestFocus(i2, rect);
        if (zRequestFocus) {
            zp(false);
        }
        return zRequestFocus;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.xy8 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            m488c();
        } else {
            m489e();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.tlhn == z2) {
            return;
        }
        this.tlhn = z2;
        zp(z2);
        bf2();
    }

    public void setImeOptions(int i2) {
        this.f46820ab.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f46820ab.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.vb6 = i2;
        requestLayout();
    }

    public void setOnCloseListener(ld6 ld6Var) {
        this.ar = ld6Var;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.bc = onFocusChangeListener;
    }

    public void setOnQueryTextListener(x2 x2Var) {
        this.k0 = x2Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.bd = onClickListener;
    }

    public void setOnSuggestionListener(qrj qrjVar) {
        this.bu = qrjVar;
    }

    public void setQuery(CharSequence charSequence, boolean z2) {
        this.f46820ab.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f46820ab;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.s8y = charSequence;
        }
        if (!z2 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        nn86();
    }

    public void setQueryHint(@zy.dd CharSequence charSequence) {
        this.zmmu = charSequence;
        bf2();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.sk1t = z2;
        AbstractC0773k abstractC0773k = this.tgs;
        if (abstractC0773k instanceof hb) {
            ((hb) abstractC0773k).jk(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.cw14 = searchableInfo;
        if (searchableInfo != null) {
            i1();
            bf2();
        }
        boolean zD2ok = d2ok();
        this.k6e = zD2ok;
        if (zD2ok) {
            this.f46820ab.setPrivateImeOptions(ut);
        }
        zp(m494r());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.yl25 = z2;
        zp(m494r());
    }

    public void setSuggestionsAdapter(AbstractC0773k abstractC0773k) {
        this.tgs = abstractC0773k;
        this.f46820ab.setAdapter(abstractC0773k);
    }

    boolean uv6(int i2) {
        qrj qrjVar = this.bu;
        if (qrjVar != null && qrjVar.m501k(i2)) {
            return false;
        }
        yz(i2);
        return true;
    }

    void vyq(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public boolean x9kr() {
        return this.sk1t;
    }

    public SearchView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92874hyow);
    }

    public SearchView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.az = new Rect();
        this.ba = new Rect();
        this.ax = new int[2];
        this.bq = new int[2];
        this.th6 = new toq();
        this.q7k9 = new zy();
        this.ndjo = new WeakHashMap<>();
        ViewOnClickListenerC0168g viewOnClickListenerC0168g = new ViewOnClickListenerC0168g();
        this.d1cy = viewOnClickListenerC0168g;
        this.xqx = new f7l8();
        C0174y c0174y = new C0174y();
        this.zr5t = c0174y;
        C0173s c0173s = new C0173s();
        this.ei = c0173s;
        C0171p c0171p = new C0171p();
        this.wra = c0171p;
        this.zsl = new C0169k();
        int[] iArr = C7397k.qrj.le9;
        C0184b c0184bJp0y = C0184b.jp0y(context, attributeSet, iArr, i2, 0);
        C0683f.ij(this, context, iArr, attributeSet, c0184bJp0y.m552t(), i2, 0);
        LayoutInflater.from(context).inflate(c0184bJp0y.fn3e(C7397k.qrj.km9o, C7397k.p.f92539o1t), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C7397k.f7l8.f42329m);
        this.f46820ab = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.bb = findViewById(C7397k.f7l8.f92338nn86);
        View viewFindViewById = findViewById(C7397k.f7l8.f42331o);
        this.bp = viewFindViewById;
        View viewFindViewById2 = findViewById(C7397k.f7l8.f42338x);
        this.bv = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(C7397k.f7l8.f92346vyq);
        this.an = imageView;
        ImageView imageView2 = (ImageView) findViewById(C7397k.f7l8.f92321hb);
        this.id = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C7397k.f7l8.f42321e);
        this.in = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C7397k.f7l8.f92313ek5k);
        this.bl = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C7397k.f7l8.f42326j);
        this.ac = imageView5;
        C0683f.wlev(viewFindViewById, c0184bJp0y.m553y(C7397k.qrj.li5y));
        C0683f.wlev(viewFindViewById2, c0184bJp0y.m553y(C7397k.qrj.bp));
        int i3 = C7397k.qrj.b6i9;
        imageView.setImageDrawable(c0184bJp0y.m553y(i3));
        imageView2.setImageDrawable(c0184bJp0y.m553y(C7397k.qrj.tvn8));
        imageView3.setImageDrawable(c0184bJp0y.m553y(C7397k.qrj.t8fp));
        imageView4.setImageDrawable(c0184bJp0y.m553y(C7397k.qrj.bao0));
        imageView5.setImageDrawable(c0184bJp0y.m553y(i3));
        this.ad = c0184bJp0y.m553y(C7397k.qrj.xknm);
        C0182a.m528k(imageView, getResources().getString(C7397k.ld6.f92451zurt));
        this.am = c0184bJp0y.fn3e(C7397k.qrj.uew, C7397k.p.f42421z);
        this.ay = c0184bJp0y.fn3e(C7397k.qrj.dm, 0);
        imageView.setOnClickListener(viewOnClickListenerC0168g);
        imageView3.setOnClickListener(viewOnClickListenerC0168g);
        imageView2.setOnClickListener(viewOnClickListenerC0168g);
        imageView4.setOnClickListener(viewOnClickListenerC0168g);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0168g);
        searchAutoComplete.addTextChangedListener(this.zsl);
        searchAutoComplete.setOnEditorActionListener(c0174y);
        searchAutoComplete.setOnItemClickListener(c0173s);
        searchAutoComplete.setOnItemSelectedListener(c0171p);
        searchAutoComplete.setOnKeyListener(this.xqx);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0172q());
        setIconifiedByDefault(c0184bJp0y.m547k(C7397k.qrj.ze, true));
        int iF7l8 = c0184bJp0y.f7l8(C7397k.qrj.xzk4, -1);
        if (iF7l8 != -1) {
            setMaxWidth(iF7l8);
        }
        this.bs = c0184bJp0y.fu4(C7397k.qrj.j1s);
        this.zmmu = c0184bJp0y.fu4(C7397k.qrj.a4ph);
        int iKja0 = c0184bJp0y.kja0(C7397k.qrj.yvs, -1);
        if (iKja0 != -1) {
            setImeOptions(iKja0);
        }
        int iKja02 = c0184bJp0y.kja0(C7397k.qrj.zidq, -1);
        if (iKja02 != -1) {
            setInputType(iKja02);
        }
        setFocusable(c0184bJp0y.m547k(C7397k.qrj.krto, true));
        c0184bJp0y.d3();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.be = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.aj = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.as = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0170n());
        }
        zp(this.tlhn);
        bf2();
    }

    private void setQuery(CharSequence charSequence) {
        this.f46820ab.setText(charSequence);
        this.f46820ab.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}
