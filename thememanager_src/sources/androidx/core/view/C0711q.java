package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import zy.InterfaceC7830i;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.view.q */
/* JADX INFO: compiled from: ContentInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0711q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f50858f7l8 = 5;

    /* JADX INFO: renamed from: g */
    public static final int f4084g = 4;

    /* JADX INFO: renamed from: n */
    public static final int f4085n = 3;

    /* JADX INFO: renamed from: q */
    public static final int f4086q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50859toq = 0;

    /* JADX INFO: renamed from: y */
    public static final int f4087y = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50860zy = 1;

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private final f7l8 f4088k;

    /* JADX INFO: renamed from: androidx.core.view.q$f7l8 */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    private interface f7l8 {
        @zy.dd
        Bundle getExtras();

        int getFlags();

        @zy.dd
        /* JADX INFO: renamed from: k */
        Uri mo3408k();

        @zy.lvui
        /* JADX INFO: renamed from: q */
        ClipData mo3409q();

        @zy.dd
        ContentInfo toq();

        int zy();
    }

    /* JADX INFO: renamed from: androidx.core.view.q$g */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    @zy.hyr(31)
    private static final class g implements f7l8 {

        /* JADX INFO: renamed from: k */
        @zy.lvui
        private final ContentInfo f4089k;

        g(@zy.lvui ContentInfo contentInfo) {
            this.f4089k = (ContentInfo) androidx.core.util.n7h.x2(contentInfo);
        }

        @Override // androidx.core.view.C0711q.f7l8
        @zy.dd
        public Bundle getExtras() {
            return this.f4089k.getExtras();
        }

        @Override // androidx.core.view.C0711q.f7l8
        public int getFlags() {
            return this.f4089k.getFlags();
        }

        @Override // androidx.core.view.C0711q.f7l8
        @zy.dd
        /* JADX INFO: renamed from: k */
        public Uri mo3408k() {
            return this.f4089k.getLinkUri();
        }

        @Override // androidx.core.view.C0711q.f7l8
        @zy.lvui
        /* JADX INFO: renamed from: q */
        public ClipData mo3409q() {
            return this.f4089k.getClip();
        }

        @zy.lvui
        public String toString() {
            return "ContentInfoCompat{" + this.f4089k + "}";
        }

        @Override // androidx.core.view.C0711q.f7l8
        @zy.lvui
        public ContentInfo toq() {
            return this.f4089k;
        }

        @Override // androidx.core.view.C0711q.f7l8
        public int zy() {
            return this.f4089k.getSource();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.q$k */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    @zy.hyr(31)
    private static final class k {
        private k() {
        }

        @InterfaceC7830i
        @zy.lvui
        /* JADX INFO: renamed from: k */
        public static Pair<ContentInfo, ContentInfo> m3410k(@zy.lvui ContentInfo contentInfo, @zy.lvui final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() != 1) {
                Objects.requireNonNull(predicate);
                Pair<ClipData, ClipData> pairM3403y = C0711q.m3403y(clip, new androidx.core.util.kja0() { // from class: androidx.core.view.zy
                    @Override // androidx.core.util.kja0
                    public final boolean test(Object obj) {
                        return predicate.test((ClipData.Item) obj);
                    }
                });
                return pairM3403y.first == null ? Pair.create(null, contentInfo) : pairM3403y.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) pairM3403y.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) pairM3403y.second).build());
            }
            boolean zTest = predicate.test(clip.getItemAt(0));
            ContentInfo contentInfo2 = zTest ? contentInfo : null;
            if (zTest) {
                contentInfo = null;
            }
            return Pair.create(contentInfo2, contentInfo);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.q$p */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface p {
    }

    /* JADX INFO: renamed from: androidx.core.view.q$q */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    private interface q {
        @zy.lvui
        C0711q build();

        /* JADX INFO: renamed from: k */
        void mo3411k(int i2);

        void setExtras(@zy.dd Bundle bundle);

        void setFlags(int i2);

        void toq(@zy.dd Uri uri);

        void zy(@zy.lvui ClipData clipData);
    }

    /* JADX INFO: renamed from: androidx.core.view.q$s */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface s {
    }

    /* JADX INFO: renamed from: androidx.core.view.q$y */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    private static final class y implements f7l8 {

        /* JADX INFO: renamed from: k */
        @zy.lvui
        private final ClipData f4094k;

        /* JADX INFO: renamed from: n */
        @zy.dd
        private final Bundle f4095n;

        /* JADX INFO: renamed from: q */
        @zy.dd
        private final Uri f4096q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f50863toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f50864zy;

        y(n nVar) {
            this.f4094k = (ClipData) androidx.core.util.n7h.x2(nVar.f4090k);
            this.f50863toq = androidx.core.util.n7h.f7l8(nVar.f50861toq, 0, 5, "source");
            this.f50864zy = androidx.core.util.n7h.ld6(nVar.f50862zy, 1);
            this.f4096q = nVar.f4092q;
            this.f4095n = nVar.f4091n;
        }

        @Override // androidx.core.view.C0711q.f7l8
        @zy.dd
        public Bundle getExtras() {
            return this.f4095n;
        }

        @Override // androidx.core.view.C0711q.f7l8
        public int getFlags() {
            return this.f50864zy;
        }

        @Override // androidx.core.view.C0711q.f7l8
        @zy.dd
        /* JADX INFO: renamed from: k */
        public Uri mo3408k() {
            return this.f4096q;
        }

        @Override // androidx.core.view.C0711q.f7l8
        @zy.lvui
        /* JADX INFO: renamed from: q */
        public ClipData mo3409q() {
            return this.f4094k;
        }

        @zy.lvui
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f4094k.getDescription());
            sb.append(", source=");
            sb.append(C0711q.ld6(this.f50863toq));
            sb.append(", flags=");
            sb.append(C0711q.toq(this.f50864zy));
            if (this.f4096q == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f4096q.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f4095n != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }

        @Override // androidx.core.view.C0711q.f7l8
        @zy.dd
        public ContentInfo toq() {
            return null;
        }

        @Override // androidx.core.view.C0711q.f7l8
        public int zy() {
            return this.f50863toq;
        }
    }

    C0711q(@zy.lvui f7l8 f7l8Var) {
        this.f4088k = f7l8Var;
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    static ClipData m3401k(@zy.lvui ClipDescription clipDescription, @zy.lvui List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i2 = 1; i2 < list.size(); i2++) {
            clipData.addItem(list.get(i2));
        }
        return clipData;
    }

    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    static String ld6(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @zy.hyr(31)
    @zy.lvui
    public static C0711q qrj(@zy.lvui ContentInfo contentInfo) {
        return new C0711q(new g(contentInfo));
    }

    @zy.hyr(31)
    @zy.lvui
    /* JADX INFO: renamed from: s */
    public static Pair<ContentInfo, ContentInfo> m3402s(@zy.lvui ContentInfo contentInfo, @zy.lvui Predicate<ClipData.Item> predicate) {
        return k.m3410k(contentInfo, predicate);
    }

    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    static String toq(int i2) {
        return (i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2);
    }

    @zy.lvui
    /* JADX INFO: renamed from: y */
    static Pair<ClipData, ClipData> m3403y(@zy.lvui ClipData clipData, @zy.lvui androidx.core.util.kja0<ClipData.Item> kja0Var) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
            ClipData.Item itemAt = clipData.getItemAt(i2);
            if (kja0Var.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        return arrayList == null ? Pair.create(null, clipData) : arrayList2 == null ? Pair.create(clipData, null) : Pair.create(m3401k(clipData.getDescription(), arrayList), m3401k(clipData.getDescription(), arrayList2));
    }

    public int f7l8() {
        return this.f4088k.zy();
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    public Uri m3404g() {
        return this.f4088k.mo3408k();
    }

    /* JADX INFO: renamed from: n */
    public int m3405n() {
        return this.f4088k.getFlags();
    }

    @zy.lvui
    /* JADX INFO: renamed from: p */
    public Pair<C0711q, C0711q> m3406p(@zy.lvui androidx.core.util.kja0<ClipData.Item> kja0Var) {
        ClipData clipDataMo3409q = this.f4088k.mo3409q();
        if (clipDataMo3409q.getItemCount() == 1) {
            boolean zTest = kja0Var.test(clipDataMo3409q.getItemAt(0));
            return Pair.create(zTest ? this : null, zTest ? null : this);
        }
        Pair<ClipData, ClipData> pairM3403y = m3403y(clipDataMo3409q, kja0Var);
        return pairM3403y.first == null ? Pair.create(null, this) : pairM3403y.second == null ? Pair.create(this, null) : Pair.create(new toq(this).toq((ClipData) pairM3403y.first).m3413k(), new toq(this).toq((ClipData) pairM3403y.second).m3413k());
    }

    @zy.dd
    /* JADX INFO: renamed from: q */
    public Bundle m3407q() {
        return this.f4088k.getExtras();
    }

    @zy.lvui
    public String toString() {
        return this.f4088k.toString();
    }

    @zy.hyr(31)
    @zy.lvui
    public ContentInfo x2() {
        ContentInfo qVar = this.f4088k.toq();
        Objects.requireNonNull(qVar);
        return qVar;
    }

    @zy.lvui
    public ClipData zy() {
        return this.f4088k.mo3409q();
    }

    /* JADX INFO: renamed from: androidx.core.view.q$zy */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    @zy.hyr(31)
    private static final class zy implements q {

        /* JADX INFO: renamed from: k */
        @zy.lvui
        private final ContentInfo.Builder f4097k;

        zy(@zy.lvui ClipData clipData, int i2) {
            this.f4097k = new ContentInfo.Builder(clipData, i2);
        }

        @Override // androidx.core.view.C0711q.q
        @zy.lvui
        public C0711q build() {
            return new C0711q(new g(this.f4097k.build()));
        }

        @Override // androidx.core.view.C0711q.q
        /* JADX INFO: renamed from: k */
        public void mo3411k(int i2) {
            this.f4097k.setSource(i2);
        }

        @Override // androidx.core.view.C0711q.q
        public void setExtras(@zy.dd Bundle bundle) {
            this.f4097k.setExtras(bundle);
        }

        @Override // androidx.core.view.C0711q.q
        public void setFlags(int i2) {
            this.f4097k.setFlags(i2);
        }

        @Override // androidx.core.view.C0711q.q
        public void toq(@zy.dd Uri uri) {
            this.f4097k.setLinkUri(uri);
        }

        @Override // androidx.core.view.C0711q.q
        public void zy(@zy.lvui ClipData clipData) {
            this.f4097k.setClip(clipData);
        }

        zy(@zy.lvui C0711q c0711q) {
            this.f4097k = new ContentInfo.Builder(c0711q.x2());
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.q$n */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    private static final class n implements q {

        /* JADX INFO: renamed from: k */
        @zy.lvui
        ClipData f4090k;

        /* JADX INFO: renamed from: n */
        @zy.dd
        Bundle f4091n;

        /* JADX INFO: renamed from: q */
        @zy.dd
        Uri f4092q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f50861toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f50862zy;

        n(@zy.lvui ClipData clipData, int i2) {
            this.f4090k = clipData;
            this.f50861toq = i2;
        }

        @Override // androidx.core.view.C0711q.q
        @zy.lvui
        public C0711q build() {
            return new C0711q(new y(this));
        }

        @Override // androidx.core.view.C0711q.q
        /* JADX INFO: renamed from: k */
        public void mo3411k(int i2) {
            this.f50861toq = i2;
        }

        @Override // androidx.core.view.C0711q.q
        public void setExtras(@zy.dd Bundle bundle) {
            this.f4091n = bundle;
        }

        @Override // androidx.core.view.C0711q.q
        public void setFlags(int i2) {
            this.f50862zy = i2;
        }

        @Override // androidx.core.view.C0711q.q
        public void toq(@zy.dd Uri uri) {
            this.f4092q = uri;
        }

        @Override // androidx.core.view.C0711q.q
        public void zy(@zy.lvui ClipData clipData) {
            this.f4090k = clipData;
        }

        n(@zy.lvui C0711q c0711q) {
            this.f4090k = c0711q.zy();
            this.f50861toq = c0711q.f7l8();
            this.f50862zy = c0711q.m3405n();
            this.f4092q = c0711q.m3404g();
            this.f4091n = c0711q.m3407q();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.q$toq */
    /* JADX INFO: compiled from: ContentInfoCompat.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        @zy.lvui
        private final q f4093k;

        public toq(@zy.lvui C0711q c0711q) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f4093k = new zy(c0711q);
            } else {
                this.f4093k = new n(c0711q);
            }
        }

        @zy.lvui
        /* JADX INFO: renamed from: g */
        public toq m3412g(int i2) {
            this.f4093k.mo3411k(i2);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public C0711q m3413k() {
            return this.f4093k.build();
        }

        @zy.lvui
        /* JADX INFO: renamed from: n */
        public toq m3414n(@zy.dd Uri uri) {
            this.f4093k.toq(uri);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: q */
        public toq m3415q(int i2) {
            this.f4093k.setFlags(i2);
            return this;
        }

        @zy.lvui
        public toq toq(@zy.lvui ClipData clipData) {
            this.f4093k.zy(clipData);
            return this;
        }

        @zy.lvui
        public toq zy(@zy.dd Bundle bundle) {
            this.f4093k.setExtras(bundle);
            return this;
        }

        public toq(@zy.lvui ClipData clipData, int i2) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f4093k = new zy(clipData, i2);
            } else {
                this.f4093k = new n(clipData, i2);
            }
        }
    }
}
