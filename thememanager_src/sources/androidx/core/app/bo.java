package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.core.content.C0510y;
import java.util.ArrayList;
import zy.InterfaceC7830i;
import zy.InterfaceC7843t;

/* JADX INFO: compiled from: ShareCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class bo {

    /* JADX INFO: renamed from: k */
    public static final String f3124k = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: n */
    private static final String f3125n = ".sharecompat_";

    /* JADX INFO: renamed from: q */
    public static final String f3126q = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f50042toq = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f50043zy = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: androidx.core.app.bo$k */
    /* JADX INFO: compiled from: ShareCompat.java */
    @zy.hyr(16)
    private static class C0414k {
        private C0414k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static String m1810k(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @InterfaceC7830i
        static void toq(@zy.lvui Intent intent, @zy.lvui ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(C0510y.f50422toq), null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i2 = 1; i2 < size; i2++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i2)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        @InterfaceC7830i
        static void zy(@zy.lvui Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }
    }

    /* JADX INFO: compiled from: ShareCompat.java */
    public static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @zy.dd
        private ArrayList<Uri> f50044f7l8;

        /* JADX INFO: renamed from: g */
        @zy.dd
        private ArrayList<String> f3127g;

        /* JADX INFO: renamed from: k */
        @zy.lvui
        private final Context f3128k;

        /* JADX INFO: renamed from: n */
        @zy.dd
        private ArrayList<String> f3129n;

        /* JADX INFO: renamed from: q */
        @zy.dd
        private ArrayList<String> f3130q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.lvui
        private final Intent f50045toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        private CharSequence f50046zy;

        public toq(@zy.lvui Context context) {
            Activity activity;
            this.f3128k = (Context) androidx.core.util.n7h.x2(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f50045toq = action;
            action.putExtra(bo.f3124k, context.getPackageName());
            action.putExtra(bo.f50042toq, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f50045toq.putExtra(bo.f50043zy, componentName);
                this.f50045toq.putExtra(bo.f3126q, componentName);
            }
        }

        @zy.lvui
        @Deprecated
        public static toq ld6(@zy.lvui Activity activity) {
            return new toq(activity);
        }

        /* JADX INFO: renamed from: s */
        private void m1811s(@zy.dd String str, @zy.lvui String[] strArr) {
            Intent intentQrj = qrj();
            String[] stringArrayExtra = intentQrj.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            intentQrj.putExtra(str, strArr2);
        }

        /* JADX INFO: renamed from: y */
        private void m1812y(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f50045toq.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f50045toq.putExtra(str, strArr);
        }

        @zy.lvui
        public toq cdj(@zy.dd String[] strArr) {
            this.f50045toq.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @zy.lvui
        public toq f7l8(@zy.lvui Uri uri) {
            if (this.f50044f7l8 == null) {
                this.f50044f7l8 = new ArrayList<>();
            }
            this.f50044f7l8.add(uri);
            return this;
        }

        @zy.lvui
        public toq fn3e(@zy.dd String str) {
            this.f50045toq.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        public void fu4() {
            this.f3128k.startActivity(m1818p());
        }

        @zy.lvui
        /* JADX INFO: renamed from: g */
        public toq m1813g(@zy.lvui String[] strArr) {
            m1811s("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: h */
        public toq m1814h(@zy.dd String[] strArr) {
            this.f50045toq.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: i */
        public toq m1815i(@zy.dd Uri uri) {
            this.f50044f7l8 = null;
            if (uri != null) {
                f7l8(uri);
            }
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public toq m1816k(@zy.lvui String str) {
            if (this.f3127g == null) {
                this.f3127g = new ArrayList<>();
            }
            this.f3127g.add(str);
            return this;
        }

        @zy.lvui
        public toq ki(@zy.dd String[] strArr) {
            if (this.f3130q != null) {
                this.f3130q = null;
            }
            this.f50045toq.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @zy.lvui
        public toq kja0(@zy.dd CharSequence charSequence) {
            this.f50046zy = charSequence;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: n */
        public toq m1817n(@zy.lvui String str) {
            if (this.f3130q == null) {
                this.f3130q = new ArrayList<>();
            }
            this.f3130q.add(str);
            return this;
        }

        @zy.lvui
        public toq n7h(@zy.nn86 int i2) {
            return kja0(this.f3128k.getText(i2));
        }

        @zy.lvui
        public toq ni7(@zy.dd String str) {
            this.f50045toq.setType(str);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: p */
        public Intent m1818p() {
            return Intent.createChooser(qrj(), this.f50046zy);
        }

        @zy.lvui
        /* JADX INFO: renamed from: q */
        public toq m1819q(@zy.lvui String[] strArr) {
            m1811s("android.intent.extra.CC", strArr);
            return this;
        }

        @zy.lvui
        public Intent qrj() {
            ArrayList<String> arrayList = this.f3130q;
            if (arrayList != null) {
                m1812y("android.intent.extra.EMAIL", arrayList);
                this.f3130q = null;
            }
            ArrayList<String> arrayList2 = this.f3129n;
            if (arrayList2 != null) {
                m1812y("android.intent.extra.CC", arrayList2);
                this.f3129n = null;
            }
            ArrayList<String> arrayList3 = this.f3127g;
            if (arrayList3 != null) {
                m1812y("android.intent.extra.BCC", arrayList3);
                this.f3127g = null;
            }
            ArrayList<Uri> arrayList4 = this.f50044f7l8;
            if (arrayList4 != null && arrayList4.size() > 1) {
                this.f50045toq.setAction("android.intent.action.SEND_MULTIPLE");
                this.f50045toq.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f50044f7l8);
                C0414k.toq(this.f50045toq, this.f50044f7l8);
            } else {
                this.f50045toq.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f50044f7l8;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f50045toq.removeExtra("android.intent.extra.STREAM");
                    C0414k.zy(this.f50045toq);
                } else {
                    this.f50045toq.putExtra("android.intent.extra.STREAM", this.f50044f7l8.get(0));
                    C0414k.toq(this.f50045toq, this.f50044f7l8);
                }
            }
            return this.f50045toq;
        }

        @zy.lvui
        public toq t8r(@zy.dd String str) {
            this.f50045toq.putExtra(C0510y.f50422toq, str);
            if (!this.f50045toq.hasExtra("android.intent.extra.TEXT")) {
                zurt(Html.fromHtml(str));
            }
            return this;
        }

        @zy.lvui
        public toq toq(@zy.lvui String[] strArr) {
            m1811s("android.intent.extra.BCC", strArr);
            return this;
        }

        @zy.lvui
        Context x2() {
            return this.f3128k;
        }

        @zy.lvui
        public toq zurt(@zy.dd CharSequence charSequence) {
            this.f50045toq.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @zy.lvui
        public toq zy(@zy.lvui String str) {
            if (this.f3129n == null) {
                this.f3129n = new ArrayList<>();
            }
            this.f3129n.add(str);
            return this;
        }
    }

    /* JADX INFO: compiled from: ShareCompat.java */
    public static class zy {

        /* JADX INFO: renamed from: g */
        private static final String f3131g = "IntentReader";

        /* JADX INFO: renamed from: k */
        @zy.lvui
        private final Context f3132k;

        /* JADX INFO: renamed from: n */
        @zy.dd
        private ArrayList<Uri> f3133n;

        /* JADX INFO: renamed from: q */
        @zy.dd
        private final ComponentName f3134q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.lvui
        private final Intent f50047toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        private final String f50048zy;

        public zy(@zy.lvui Activity activity) {
            this((Context) androidx.core.util.n7h.x2(activity), activity.getIntent());
        }

        /* JADX INFO: renamed from: i */
        private static void m1820i(StringBuilder sb, CharSequence charSequence, int i2, int i3) {
            while (i2 < i3) {
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt == '<') {
                    sb.append("&lt;");
                } else if (cCharAt == '>') {
                    sb.append("&gt;");
                } else if (cCharAt == '&') {
                    sb.append("&amp;");
                } else if (cCharAt > '~' || cCharAt < ' ') {
                    sb.append("&#");
                    sb.append((int) cCharAt);
                    sb.append(";");
                } else if (cCharAt == ' ') {
                    while (true) {
                        int i4 = i2 + 1;
                        if (i4 >= i3 || charSequence.charAt(i4) != ' ') {
                            break;
                        }
                        sb.append("&nbsp;");
                        i2 = i4;
                    }
                    sb.append(' ');
                } else {
                    sb.append(cCharAt);
                }
                i2++;
            }
        }

        @zy.lvui
        @Deprecated
        /* JADX INFO: renamed from: k */
        public static zy m1821k(@zy.lvui Activity activity) {
            return new zy(activity);
        }

        public boolean cdj() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f50047toq.getAction());
        }

        @zy.dd
        public String[] f7l8() {
            return this.f50047toq.getStringArrayExtra("android.intent.extra.BCC");
        }

        @zy.dd
        /* JADX INFO: renamed from: g */
        public String m1822g() {
            return this.f50048zy;
        }

        @zy.dd
        /* JADX INFO: renamed from: h */
        public String m1823h() {
            return this.f50047toq.getType();
        }

        public boolean ki() {
            String action = this.f50047toq.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        @zy.dd
        public CharSequence kja0() {
            return this.f50047toq.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @zy.dd
        public Uri ld6() {
            return (Uri) this.f50047toq.getParcelableExtra("android.intent.extra.STREAM");
        }

        @zy.dd
        /* JADX INFO: renamed from: n */
        public CharSequence m1824n() {
            if (this.f50048zy == null) {
                return null;
            }
            PackageManager packageManager = this.f3132k.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f50048zy, 0));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e(f3131g, "Could not retrieve label for calling application", e2);
                return null;
            }
        }

        @zy.dd
        public String n7h() {
            return this.f50047toq.getStringExtra("android.intent.extra.SUBJECT");
        }

        @zy.dd
        /* JADX INFO: renamed from: p */
        public String m1825p() {
            String stringExtra = this.f50047toq.getStringExtra(C0510y.f50422toq);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence charSequenceKja0 = kja0();
            return charSequenceKja0 instanceof Spanned ? Html.toHtml((Spanned) charSequenceKja0) : charSequenceKja0 != null ? C0414k.m1810k(charSequenceKja0) : stringExtra;
        }

        @zy.dd
        /* JADX INFO: renamed from: q */
        public Drawable m1826q() {
            if (this.f50048zy == null) {
                return null;
            }
            try {
                return this.f3132k.getPackageManager().getApplicationIcon(this.f50048zy);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e(f3131g, "Could not retrieve icon for calling application", e2);
                return null;
            }
        }

        public int qrj() {
            if (this.f3133n == null && cdj()) {
                this.f3133n = this.f50047toq.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f3133n;
            return arrayList != null ? arrayList.size() : this.f50047toq.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @zy.dd
        /* JADX INFO: renamed from: s */
        public String[] m1827s() {
            return this.f50047toq.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        public boolean t8r() {
            return "android.intent.action.SEND".equals(this.f50047toq.getAction());
        }

        @zy.dd
        public ComponentName toq() {
            return this.f3134q;
        }

        @zy.dd
        public Uri x2(int i2) {
            if (this.f3133n == null && cdj()) {
                this.f3133n = this.f50047toq.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f3133n;
            if (arrayList != null) {
                return arrayList.get(i2);
            }
            if (i2 == 0) {
                return (Uri) this.f50047toq.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + qrj() + " index requested: " + i2);
        }

        @zy.dd
        /* JADX INFO: renamed from: y */
        public String[] m1828y() {
            return this.f50047toq.getStringArrayExtra("android.intent.extra.CC");
        }

        @zy.dd
        public Drawable zy() {
            if (this.f3134q == null) {
                return null;
            }
            try {
                return this.f3132k.getPackageManager().getActivityIcon(this.f3134q);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e(f3131g, "Could not retrieve icon for calling activity", e2);
                return null;
            }
        }

        public zy(@zy.lvui Context context, @zy.lvui Intent intent) {
            this.f3132k = (Context) androidx.core.util.n7h.x2(context);
            this.f50047toq = (Intent) androidx.core.util.n7h.x2(intent);
            this.f50048zy = bo.m1806g(intent);
            this.f3134q = bo.m1809q(intent);
        }
    }

    private bo() {
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    static String m1806g(@zy.lvui Intent intent) {
        String stringExtra = intent.getStringExtra(f3124k);
        return stringExtra == null ? intent.getStringExtra(f50042toq) : stringExtra;
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static void m1807k(@zy.lvui Menu menu, @InterfaceC7843t int i2, @zy.lvui toq toqVar) {
        MenuItem menuItemFindItem = menu.findItem(i2);
        if (menuItemFindItem != null) {
            toq(menuItemFindItem, toqVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i2 + " in the supplied menu");
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    public static String m1808n(@zy.lvui Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : m1806g(intent);
    }

    @zy.dd
    /* JADX INFO: renamed from: q */
    static ComponentName m1809q(@zy.lvui Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f50043zy);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(f3126q) : componentName;
    }

    @Deprecated
    public static void toq(@zy.lvui MenuItem menuItem, @zy.lvui toq toqVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(toqVar.x2()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(f3125n + toqVar.x2().getClass().getName());
        shareActionProvider.setShareIntent(toqVar.qrj());
        menuItem.setActionProvider(shareActionProvider);
    }

    @zy.dd
    public static ComponentName zy(@zy.lvui Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? m1809q(intent) : callingActivity;
    }
}
