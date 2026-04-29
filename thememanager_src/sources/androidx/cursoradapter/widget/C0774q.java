package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import zy.uv6;

/* JADX INFO: renamed from: androidx.cursoradapter.widget.q */
/* JADX INFO: compiled from: SimpleCursorAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class C0774q extends zy {

    /* JADX INFO: renamed from: b */
    String[] f4321b;

    /* JADX INFO: renamed from: c */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected int[] f4322c;

    /* JADX INFO: renamed from: e */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected int[] f4323e;

    /* JADX INFO: renamed from: j */
    private int f4324j;

    /* JADX INFO: renamed from: m */
    private toq f4325m;

    /* JADX INFO: renamed from: o */
    private k f4326o;

    /* JADX INFO: renamed from: androidx.cursoradapter.widget.q$k */
    /* JADX INFO: compiled from: SimpleCursorAdapter.java */
    public interface k {
        CharSequence convertToString(Cursor cursor);
    }

    /* JADX INFO: renamed from: androidx.cursoradapter.widget.q$toq */
    /* JADX INFO: compiled from: SimpleCursorAdapter.java */
    public interface toq {
        boolean setViewValue(View view, Cursor cursor, int i2);
    }

    @Deprecated
    public C0774q(Context context, int i2, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i2, cursor);
        this.f4324j = -1;
        this.f4323e = iArr;
        this.f4321b = strArr;
        m3729h(cursor, strArr);
    }

    /* JADX INFO: renamed from: h */
    private void m3729h(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f4322c = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f4322c;
        if (iArr == null || iArr.length != length) {
            this.f4322c = new int[length];
        }
        for (int i2 = 0; i2 < length; i2++) {
            this.f4322c[i2] = cursor.getColumnIndexOrThrow(strArr[i2]);
        }
    }

    public k cdj() {
        return this.f4326o;
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k, androidx.cursoradapter.widget.toq.InterfaceC0775k
    public CharSequence convertToString(Cursor cursor) {
        k kVar = this.f4326o;
        if (kVar != null) {
            return kVar.convertToString(cursor);
        }
        int i2 = this.f4324j;
        return i2 > -1 ? cursor.getString(i2) : super.convertToString(cursor);
    }

    public void fn3e(int i2) {
        this.f4324j = i2;
    }

    public void fu4(TextView textView, String str) {
        textView.setText(str);
    }

    /* JADX INFO: renamed from: i */
    public void m3730i(k kVar) {
        this.f4326o = kVar;
    }

    public int ki() {
        return this.f4324j;
    }

    public void kja0(Cursor cursor, String[] strArr, int[] iArr) {
        this.f4321b = strArr;
        this.f4323e = iArr;
        m3729h(cursor, strArr);
        super.mo602k(cursor);
    }

    public void ni7(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k
    /* JADX INFO: renamed from: q */
    public void mo603q(View view, Context context, Cursor cursor) {
        toq toqVar = this.f4325m;
        int[] iArr = this.f4323e;
        int length = iArr.length;
        int[] iArr2 = this.f4322c;
        for (int i2 = 0; i2 < length; i2++) {
            View viewFindViewById = view.findViewById(iArr[i2]);
            if (viewFindViewById != null) {
                if (toqVar != null ? toqVar.setViewValue(viewFindViewById, cursor, iArr2[i2]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i2]);
                    if (string == null) {
                        string = "";
                    }
                    if (viewFindViewById instanceof TextView) {
                        fu4((TextView) viewFindViewById, string);
                    } else {
                        if (!(viewFindViewById instanceof ImageView)) {
                            throw new IllegalStateException(viewFindViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                        }
                        ni7((ImageView) viewFindViewById, string);
                    }
                }
            }
        }
    }

    public toq t8r() {
        return this.f4325m;
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k
    public Cursor x2(Cursor cursor) {
        m3729h(cursor, this.f4321b);
        return super.x2(cursor);
    }

    public void zurt(toq toqVar) {
        this.f4325m = toqVar;
    }

    public C0774q(Context context, int i2, Cursor cursor, String[] strArr, int[] iArr, int i3) {
        super(context, i2, cursor, i3);
        this.f4324j = -1;
        this.f4323e = iArr;
        this.f4321b = strArr;
        m3729h(cursor, strArr);
    }
}
