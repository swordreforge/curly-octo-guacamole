package androidx.activity.result.contract;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.AbstractC0059k;
import androidx.collection.C0247k;
import androidx.core.content.C0498q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import zy.InterfaceC7842s;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: ActivityResultContracts.java */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: compiled from: ActivityResultContracts.java */
    public static final class f7l8 extends AbstractC0059k<Void, Uri> {
        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Uri zy(int i2, @dd Intent intent) {
            if (intent == null || i2 != -1) {
                return null;
            }
            return intent.getData();
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @dd Void r2) {
            return new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.contract.toq$g */
    /* JADX INFO: compiled from: ActivityResultContracts.java */
    @TargetApi(19)
    public static class C0060g extends AbstractC0059k<String[], List<Uri>> {
        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final List<Uri> zy(int i2, @dd Intent intent) {
            return (i2 != -1 || intent == null) ? Collections.emptyList() : zy.m74n(intent);
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AbstractC0059k.k<List<Uri>> toq(@lvui Context context, @lvui String[] strArr) {
            return null;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        @InterfaceC7842s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @lvui String[] strArr) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.contract.toq$k */
    /* JADX INFO: compiled from: ActivityResultContracts.java */
    @TargetApi(19)
    public static class C0061k extends AbstractC0059k<String, Uri> {
        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Uri zy(int i2, @dd Intent intent) {
            if (intent == null || i2 != -1) {
                return null;
            }
            return intent.getData();
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AbstractC0059k.k<Uri> toq(@lvui Context context, @lvui String str) {
            return null;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        @InterfaceC7842s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @lvui String str) {
            return new Intent("android.intent.action.CREATE_DOCUMENT").setType("*/*").putExtra("android.intent.extra.TITLE", str);
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.java */
    public static final class ld6 extends AbstractC0059k<IntentSenderRequest, ActivityResult> {

        /* JADX INFO: renamed from: k */
        public static final String f128k = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f46468toq = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f46469zy = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ActivityResult zy(int i2, @dd Intent intent) {
            return new ActivityResult(i2, intent);
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @lvui IntentSenderRequest intentSenderRequest) {
            return new Intent(f128k).putExtra(f46468toq, intentSenderRequest);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.contract.toq$n */
    /* JADX INFO: compiled from: ActivityResultContracts.java */
    @TargetApi(21)
    public static class C0062n extends AbstractC0059k<Uri, Uri> {
        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Uri zy(int i2, @dd Intent intent) {
            if (intent == null || i2 != -1) {
                return null;
            }
            return intent.getData();
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AbstractC0059k.k<Uri> toq(@lvui Context context, @dd Uri uri) {
            return null;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        @InterfaceC7842s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @dd Uri uri) {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.java */
    public static class n7h extends AbstractC0059k<Uri, Bitmap> {
        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Bitmap zy(int i2, @dd Intent intent) {
            if (intent == null || i2 != -1) {
                return null;
            }
            return (Bitmap) intent.getParcelableExtra("data");
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AbstractC0059k.k<Bitmap> toq(@lvui Context context, @lvui Uri uri) {
            return null;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        @InterfaceC7842s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @lvui Uri uri) {
            return new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.contract.toq$p */
    /* JADX INFO: compiled from: ActivityResultContracts.java */
    public static final class C0063p extends AbstractC0059k<Intent, ActivityResult> {

        /* JADX INFO: renamed from: k */
        public static final String f129k = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ActivityResult zy(int i2, @dd Intent intent) {
            return new ActivityResult(i2, intent);
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @lvui Intent intent) {
            return intent;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.contract.toq$q */
    /* JADX INFO: compiled from: ActivityResultContracts.java */
    @TargetApi(19)
    public static class C0064q extends AbstractC0059k<String[], Uri> {
        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Uri zy(int i2, @dd Intent intent) {
            if (intent == null || i2 != -1) {
                return null;
            }
            return intent.getData();
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AbstractC0059k.k<Uri> toq(@lvui Context context, @lvui String[] strArr) {
            return null;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        @InterfaceC7842s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @lvui String[] strArr) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.java */
    public static class qrj extends AbstractC0059k<Void, Bitmap> {
        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Bitmap zy(int i2, @dd Intent intent) {
            if (intent == null || i2 != -1) {
                return null;
            }
            return (Bitmap) intent.getParcelableExtra("data");
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AbstractC0059k.k<Bitmap> toq(@lvui Context context, @dd Void r2) {
            return null;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        @InterfaceC7842s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @dd Void r2) {
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.contract.toq$s */
    /* JADX INFO: compiled from: ActivityResultContracts.java */
    public static final class C0065s extends AbstractC0059k<String, Boolean> {
        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean zy(int i2, @dd Intent intent) {
            if (intent == null || i2 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(C0066y.f46471zy);
            if (intArrayExtra == null || intArrayExtra.length == 0) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(intArrayExtra[0] == 0);
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public AbstractC0059k.k<Boolean> toq(@lvui Context context, @dd String str) {
            if (str == null) {
                return new AbstractC0059k.k<>(Boolean.FALSE);
            }
            if (C0498q.m2255k(context, str) == 0) {
                return new AbstractC0059k.k<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @lvui String str) {
            return C0066y.m71n(new String[]{str});
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.contract.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityResultContracts.java */
    public static class C7848toq extends AbstractC0059k<String, Uri> {
        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Uri zy(int i2, @dd Intent intent) {
            if (intent == null || i2 != -1) {
                return null;
            }
            return intent.getData();
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AbstractC0059k.k<Uri> toq(@lvui Context context, @lvui String str) {
            return null;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        @InterfaceC7842s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @lvui String str) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.java */
    public static class x2 extends AbstractC0059k<Uri, Boolean> {
        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Boolean zy(int i2, @dd Intent intent) {
            return Boolean.valueOf(i2 == -1);
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AbstractC0059k.k<Boolean> toq(@lvui Context context, @lvui Uri uri) {
            return null;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        @InterfaceC7842s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @lvui Uri uri) {
            return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.contract.toq$y */
    /* JADX INFO: compiled from: ActivityResultContracts.java */
    public static final class C0066y extends AbstractC0059k<String[], Map<String, Boolean>> {

        /* JADX INFO: renamed from: k */
        public static final String f130k = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f46470toq = "androidx.activity.result.contract.extra.PERMISSIONS";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f46471zy = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        @lvui
        /* JADX INFO: renamed from: n */
        static Intent m71n(@lvui String[] strArr) {
            return new Intent(f130k).putExtra(f46470toq, strArr);
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public Map<String, Boolean> zy(int i2, @dd Intent intent) {
            if (i2 != -1) {
                return Collections.emptyMap();
            }
            if (intent == null) {
                return Collections.emptyMap();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(f46470toq);
            int[] intArrayExtra = intent.getIntArrayExtra(f46471zy);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            int length = stringArrayExtra.length;
            for (int i3 = 0; i3 < length; i3++) {
                map.put(stringArrayExtra[i3], Boolean.valueOf(intArrayExtra[i3] == 0));
            }
            return map;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC0059k.k<Map<String, Boolean>> toq(@lvui Context context, @dd String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return new AbstractC0059k.k<>(Collections.emptyMap());
            }
            C0247k c0247k = new C0247k();
            boolean z2 = true;
            for (String str : strArr) {
                boolean z3 = C0498q.m2255k(context, str) == 0;
                c0247k.put(str, Boolean.valueOf(z3));
                if (!z3) {
                    z2 = false;
                }
            }
            if (z2) {
                return new AbstractC0059k.k<>(c0247k);
            }
            return null;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @lvui String[] strArr) {
            return m71n(strArr);
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.java */
    @TargetApi(18)
    public static class zy extends AbstractC0059k<String, List<Uri>> {
        @lvui
        /* JADX INFO: renamed from: n */
        static List<Uri> m74n(@lvui Intent intent) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (intent.getData() != null) {
                linkedHashSet.add(intent.getData());
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return Collections.emptyList();
            }
            if (clipData != null) {
                for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
                    Uri uri = clipData.getItemAt(i2).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public final List<Uri> zy(int i2, @dd Intent intent) {
            return (intent == null || i2 != -1) ? Collections.emptyList() : m74n(intent);
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @dd
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final AbstractC0059k.k<List<Uri>> toq(@lvui Context context, @lvui String str) {
            return null;
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        @InterfaceC7842s
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, @lvui String str) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
    }

    private toq() {
    }
}
