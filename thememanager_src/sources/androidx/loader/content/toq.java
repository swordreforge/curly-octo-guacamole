package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.os.cdj;
import androidx.loader.content.zy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: CursorLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class toq extends AbstractC0959k<Cursor> {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    String f51624fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    Cursor f51625fu4;

    /* JADX INFO: renamed from: i */
    String[] f5176i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    final zy<Cursor>.C0961k f51626ki;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    String f51627ni7;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    Uri f51628t8r;

    /* JADX INFO: renamed from: z */
    androidx.core.os.zy f5177z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    String[] f51629zurt;

    public toq(@lvui Context context) {
        super(context);
        this.f51626ki = new zy.C0961k();
    }

    /* JADX INFO: renamed from: c */
    public void m4523c(@dd String[] strArr) {
        this.f5176i = strArr;
    }

    @dd
    public String[] dd() {
        return this.f5176i;
    }

    /* JADX INFO: renamed from: e */
    public void m4524e(@lvui Uri uri) {
        this.f51628t8r = uri;
    }

    @Override // androidx.loader.content.AbstractC0959k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void oc(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // androidx.loader.content.AbstractC0959k, androidx.loader.content.zy
    @Deprecated
    public void f7l8(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.f7l8(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f51628t8r);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f5176i));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f51624fn3e);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f51629zurt));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f51627ni7);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f51625fu4);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f5183y);
    }

    @Override // androidx.loader.content.AbstractC0959k
    /* JADX INFO: renamed from: hyr, reason: merged with bridge method [inline-methods] */
    public Cursor d3() {
        synchronized (this) {
            if (gvn7()) {
                throw new cdj();
            }
            this.f5177z = new androidx.core.os.zy();
        }
        try {
            Cursor cursorM2366k = androidx.core.content.toq.m2366k(m4535s().getContentResolver(), this.f51628t8r, this.f5176i, this.f51624fn3e, this.f51629zurt, this.f51627ni7, this.f5177z);
            if (cursorM2366k != null) {
                try {
                    cursorM2366k.getCount();
                    cursorM2366k.registerContentObserver(this.f51626ki);
                } catch (RuntimeException e2) {
                    cursorM2366k.close();
                    throw e2;
                }
            }
            synchronized (this) {
                this.f5177z = null;
            }
            return cursorM2366k;
        } catch (Throwable th) {
            synchronized (this) {
                this.f5177z = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.zy
    /* JADX INFO: renamed from: i */
    protected void mo4527i() {
        toq();
    }

    @Override // androidx.loader.content.AbstractC0959k
    public void jk() {
        super.jk();
        synchronized (this) {
            androidx.core.os.zy zyVar = this.f5177z;
            if (zyVar != null) {
                zyVar.m2780k();
            }
        }
    }

    @Override // androidx.loader.content.zy
    protected void ki() {
        super.ki();
        mo4527i();
        Cursor cursor = this.f51625fu4;
        if (cursor != null && !cursor.isClosed()) {
            this.f51625fu4.close();
        }
        this.f51625fu4 = null;
    }

    @dd
    /* JADX INFO: renamed from: l */
    public String m4528l() {
        return this.f51627ni7;
    }

    public void lrht(@dd String str) {
        this.f51624fn3e = str;
    }

    @lvui
    public Uri n5r1() {
        return this.f51628t8r;
    }

    @dd
    public String[] ncyb() {
        return this.f51629zurt;
    }

    @Override // androidx.loader.content.zy
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo4526g(Cursor cursor) {
        if (x2()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f51625fu4;
        this.f51625fu4 = cursor;
        if (qrj()) {
            super.mo4526g(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.zy
    protected void t8r() {
        Cursor cursor = this.f51625fu4;
        if (cursor != null) {
            mo4526g(cursor);
        }
        if (wvg() || this.f51625fu4 == null) {
            m4537y();
        }
    }

    public void uv6(@dd String[] strArr) {
        this.f51629zurt = strArr;
    }

    public void vyq(@dd String str) {
        this.f51627ni7 = str;
    }

    @dd
    public String x9kr() {
        return this.f51624fn3e;
    }

    public toq(@lvui Context context, @lvui Uri uri, @dd String[] strArr, @dd String str, @dd String[] strArr2, @dd String str2) {
        super(context);
        this.f51626ki = new zy.C0961k();
        this.f51628t8r = uri;
        this.f5176i = strArr;
        this.f51624fn3e = str;
        this.f51629zurt = strArr2;
        this.f51627ni7 = str2;
    }
}
