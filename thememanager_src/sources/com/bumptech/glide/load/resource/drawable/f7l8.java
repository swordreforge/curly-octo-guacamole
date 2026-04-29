package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.C3138s;
import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.load.x2;
import com.bumptech.glide.util.qrj;
import java.util.List;
import zy.dd;
import zy.fn3e;
import zy.lvui;

/* JADX INFO: compiled from: ResourceDrawableDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 implements x2<Uri, Drawable> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f62943f7l8 = 1;

    /* JADX INFO: renamed from: g */
    private static final int f18764g = 0;

    /* JADX INFO: renamed from: n */
    private static final int f18765n = 2;

    /* JADX INFO: renamed from: q */
    private static final int f18766q = 0;

    /* JADX INFO: renamed from: s */
    private static final int f18767s = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final C3138s<Resources.Theme> f62944toq = C3138s.m11067g("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: y */
    private static final int f18768y = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f62945zy = "android";

    /* JADX INFO: renamed from: k */
    private final Context f18769k;

    public f7l8(Context context) {
        this.f18769k = context.getApplicationContext();
    }

    @fn3e
    private int f7l8(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m11011g(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m11012n(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @fn3e
    /* JADX INFO: renamed from: g */
    private int m11011g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, f62945zy);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @fn3e
    /* JADX INFO: renamed from: n */
    private int m11012n(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
        }
    }

    @lvui
    /* JADX INFO: renamed from: q */
    private Context m11013q(Uri uri, @lvui String str) {
        if (str.equals(this.f18769k.getPackageName())) {
            return this.f18769k;
        }
        try {
            return this.f18769k.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            if (str.contains(this.f18769k.getPackageName())) {
                return this.f18769k;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e2);
        }
    }

    @Override // com.bumptech.glide.load.x2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public boolean mo10948k(@lvui Uri uri, @lvui C3087p c3087p) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // com.bumptech.glide.load.x2
    @dd
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public zurt<Drawable> toq(@lvui Uri uri, int i2, int i3, @lvui C3087p c3087p) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextM11013q = m11013q(uri, authority);
            int iF7l8 = f7l8(contextM11013q, uri);
            Resources.Theme theme = ((String) qrj.m11262q(authority)).equals(this.f18769k.getPackageName()) ? (Resources.Theme) c3087p.zy(f62944toq) : null;
            return C3117g.m11015g(theme == null ? zy.toq(this.f18769k, contextM11013q, iF7l8) : zy.m11033k(this.f18769k, iF7l8, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }
}
