package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0498q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p030n.C7397k;

/* JADX INFO: compiled from: SuggestionsAdapter.java */
/* JADX INFO: loaded from: classes.dex */
class hb extends androidx.cursoradapter.widget.zy implements View.OnClickListener {
    static final int an = 0;
    private static final boolean bb = false;
    static final int bl = -1;
    private static final String bp = "SuggestionsAdapter";
    private static final int bv = 50;
    static final int id = 1;
    static final int in = 2;

    /* JADX INFO: renamed from: a */
    private int f1030a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f46868ab;

    /* JADX INFO: renamed from: b */
    private boolean f1031b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f46869bo;

    /* JADX INFO: renamed from: c */
    private final SearchView f1032c;

    /* JADX INFO: renamed from: d */
    private int f1033d;

    /* JADX INFO: renamed from: e */
    private final SearchableInfo f1034e;

    /* JADX INFO: renamed from: j */
    private final Context f1035j;

    /* JADX INFO: renamed from: m */
    private final int f1036m;

    /* JADX INFO: renamed from: o */
    private final WeakHashMap<String, Drawable.ConstantState> f1037o;

    /* JADX INFO: renamed from: u */
    private int f1038u;

    /* JADX INFO: renamed from: v */
    private int f1039v;

    /* JADX INFO: renamed from: w */
    private int f1040w;

    /* JADX INFO: renamed from: x */
    private ColorStateList f1041x;

    /* JADX INFO: renamed from: androidx.appcompat.widget.hb$k */
    /* JADX INFO: compiled from: SuggestionsAdapter.java */
    private static final class C0193k {

        /* JADX INFO: renamed from: k */
        public final TextView f1042k;

        /* JADX INFO: renamed from: n */
        public final ImageView f1043n;

        /* JADX INFO: renamed from: q */
        public final ImageView f1044q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final TextView f46870toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final ImageView f46871zy;

        public C0193k(View view) {
            this.f1042k = (TextView) view.findViewById(R.id.text1);
            this.f46870toq = (TextView) view.findViewById(R.id.text2);
            this.f46871zy = (ImageView) view.findViewById(R.id.icon1);
            this.f1044q = (ImageView) view.findViewById(R.id.icon2);
            this.f1043n = (ImageView) view.findViewById(C7397k.f7l8.f92339o1t);
        }
    }

    public hb(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1031b = false;
        this.f1030a = 1;
        this.f1038u = -1;
        this.f46869bo = -1;
        this.f1039v = -1;
        this.f1033d = -1;
        this.f1040w = -1;
        this.f46868ab = -1;
        this.f1032c = searchView;
        this.f1034e = searchableInfo;
        this.f1036m = searchView.getSuggestionCommitIconResId();
        this.f1035j = context;
        this.f1037o = weakHashMap;
    }

    private void a9(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private CharSequence cdj(CharSequence charSequence) {
        if (this.f1041x == null) {
            TypedValue typedValue = new TypedValue();
            this.f1035j.getTheme().resolveAttribute(C7397k.toq.anhx, typedValue, true);
            this.f1041x = this.f1035j.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1041x, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable fn3e() {
        Drawable drawableT8r = t8r(this.f1034e.getSearchActivity());
        return drawableT8r != null ? drawableT8r : this.f1035j.getPackageManager().getDefaultActivityIcon();
    }

    private void fti(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private Drawable fu4(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i2 = Integer.parseInt(str);
            String str2 = com.android.thememanager.basemodule.resource.constants.toq.hze4 + this.f1035j.getPackageName() + "/" + i2;
            Drawable drawableKja0 = kja0(str2);
            if (drawableKja0 != null) {
                return drawableKja0;
            }
            Drawable drawableM2259s = C0498q.m2259s(this.f1035j, i2);
            jp0y(str2, drawableM2259s);
            return drawableM2259s;
        } catch (Resources.NotFoundException unused) {
            Log.w(bp, "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableKja02 = kja0(str);
            if (drawableKja02 != null) {
                return drawableKja02;
            }
            Drawable drawableZurt = zurt(Uri.parse(str));
            jp0y(str, drawableZurt);
            return drawableZurt;
        }
    }

    private void gvn7(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m599i(Cursor cursor, String str) {
        return mcp(cursor, cursor.getColumnIndex(str));
    }

    private void jp0y(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1037o.put(str, drawable.getConstantState());
        }
    }

    private Drawable ki(ComponentName componentName) {
        PackageManager packageManager = this.f1035j.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w(bp, "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w(bp, e2.toString());
            return null;
        }
    }

    private Drawable kja0(String str) {
        Drawable.ConstantState constantState = this.f1037o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private static String mcp(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e(bp, "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    private Drawable o1t(Cursor cursor) {
        int i2 = this.f1040w;
        if (i2 == -1) {
            return null;
        }
        return fu4(cursor.getString(i2));
    }

    private Drawable t8r(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f1037o.containsKey(strFlattenToShortString)) {
            Drawable drawableKi = ki(componentName);
            this.f1037o.put(strFlattenToShortString, drawableKi != null ? drawableKi.getConstantState() : null);
            return drawableKi;
        }
        Drawable.ConstantState constantState = this.f1037o.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1035j.getResources());
    }

    /* JADX INFO: renamed from: z */
    private Drawable m600z(Cursor cursor) {
        int i2 = this.f1033d;
        if (i2 == -1) {
            return null;
        }
        Drawable drawableFu4 = fu4(cursor.getString(i2));
        return drawableFu4 != null ? drawableFu4 : fn3e();
    }

    private Drawable zurt(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return ni7(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f1035j.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e2) {
                    Log.e(bp, "Error closing icon stream for " + uri, e2);
                }
            }
        } catch (FileNotFoundException e3) {
            Log.w(bp, "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w(bp, "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k, androidx.cursoradapter.widget.toq.InterfaceC0775k
    public CharSequence convertToString(Cursor cursor) {
        String strM599i;
        String strM599i2;
        if (cursor == null) {
            return null;
        }
        String strM599i3 = m599i(cursor, "suggest_intent_query");
        if (strM599i3 != null) {
            return strM599i3;
        }
        if (this.f1034e.shouldRewriteQueryFromData() && (strM599i2 = m599i(cursor, "suggest_intent_data")) != null) {
            return strM599i2;
        }
        if (!this.f1034e.shouldRewriteQueryFromText() || (strM599i = m599i(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strM599i;
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w(bp, "Search suggestions cursor threw exception.", e2);
            View viewMo3728y = mo3728y(this.f1035j, zy(), viewGroup);
            if (viewMo3728y != null) {
                ((C0193k) viewMo3728y.getTag()).f1042k.setText(e2.toString());
            }
            return viewMo3728y;
        }
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w(bp, "Search suggestions cursor threw exception.", e2);
            View viewMo604s = mo604s(this.f1035j, zy(), viewGroup);
            if (viewMo604s != null) {
                ((C0193k) viewMo604s.getTag()).f1042k.setText(e2.toString());
            }
            return viewMo604s;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m601h() {
        mo602k(null);
        this.f1031b = true;
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public void jk(int i2) {
        this.f1030a = i2;
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k, androidx.cursoradapter.widget.toq.InterfaceC0775k
    /* JADX INFO: renamed from: k */
    public void mo602k(Cursor cursor) {
        if (this.f1031b) {
            Log.w(bp, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo602k(cursor);
            if (cursor != null) {
                this.f1038u = cursor.getColumnIndex("suggest_text_1");
                this.f46869bo = cursor.getColumnIndex("suggest_text_2");
                this.f1039v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1033d = cursor.getColumnIndex("suggest_icon_1");
                this.f1040w = cursor.getColumnIndex("suggest_icon_2");
                this.f46868ab = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e(bp, "error changing cursor and caching columns", e2);
        }
    }

    Drawable ni7(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1035j.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        gvn7(zy());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        gvn7(zy());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1032c.vyq((CharSequence) tag);
        }
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k
    /* JADX INFO: renamed from: q */
    public void mo603q(View view, Context context, Cursor cursor) {
        C0193k c0193k = (C0193k) view.getTag();
        int i2 = this.f46868ab;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        if (c0193k.f1042k != null) {
            fti(c0193k.f1042k, mcp(cursor, this.f1038u));
        }
        if (c0193k.f46870toq != null) {
            String strMcp = mcp(cursor, this.f1039v);
            CharSequence charSequenceCdj = strMcp != null ? cdj(strMcp) : mcp(cursor, this.f46869bo);
            if (TextUtils.isEmpty(charSequenceCdj)) {
                TextView textView = c0193k.f1042k;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c0193k.f1042k.setMaxLines(2);
                }
            } else {
                TextView textView2 = c0193k.f1042k;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c0193k.f1042k.setMaxLines(1);
                }
            }
            fti(c0193k.f46870toq, charSequenceCdj);
        }
        ImageView imageView = c0193k.f46871zy;
        if (imageView != null) {
            a9(imageView, m600z(cursor), 4);
        }
        ImageView imageView2 = c0193k.f1044q;
        if (imageView2 != null) {
            a9(imageView2, o1t(cursor), 8);
        }
        int i4 = this.f1030a;
        if (i4 != 2 && (i4 != 1 || (i3 & 1) == 0)) {
            c0193k.f1043n.setVisibility(8);
            return;
        }
        c0193k.f1043n.setVisibility(0);
        c0193k.f1043n.setTag(c0193k.f1042k.getText());
        c0193k.f1043n.setOnClickListener(this);
    }

    @Override // androidx.cursoradapter.widget.zy, androidx.cursoradapter.widget.AbstractC0773k
    /* JADX INFO: renamed from: s */
    public View mo604s(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewMo604s = super.mo604s(context, cursor, viewGroup);
        viewMo604s.setTag(new C0193k(viewMo604s));
        ((ImageView) viewMo604s.findViewById(C7397k.f7l8.f92339o1t)).setImageResource(this.f1036m);
        return viewMo604s;
    }

    /* JADX INFO: renamed from: t */
    Cursor m605t(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f1035j.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k, androidx.cursoradapter.widget.toq.InterfaceC0775k
    public Cursor toq(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f1032c.getVisibility() == 0 && this.f1032c.getWindowVisibility() == 0) {
            try {
                Cursor cursorM605t = m605t(this.f1034e, string, 50);
                if (cursorM605t != null) {
                    cursorM605t.getCount();
                    return cursorM605t;
                }
            } catch (RuntimeException e2) {
                Log.w(bp, "Search suggestions query threw an exception.", e2);
            }
        }
        return null;
    }

    public int wvg() {
        return this.f1030a;
    }
}
