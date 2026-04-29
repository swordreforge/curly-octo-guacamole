package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.core.util.C0640q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import zy.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: compiled from: Loader.java */
/* JADX INFO: loaded from: classes.dex */
public class zy<D> {

    /* JADX INFO: renamed from: k */
    int f5179k;

    /* JADX INFO: renamed from: q */
    Context f5181q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    InterfaceC7888zy<D> f51631toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    toq<D> f51632zy;

    /* JADX INFO: renamed from: n */
    boolean f5180n = false;

    /* JADX INFO: renamed from: g */
    boolean f5178g = false;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    boolean f51630f7l8 = true;

    /* JADX INFO: renamed from: y */
    boolean f5183y = false;

    /* JADX INFO: renamed from: s */
    boolean f5182s = false;

    /* JADX INFO: renamed from: androidx.loader.content.zy$k */
    /* JADX INFO: compiled from: Loader.java */
    public final class C0961k extends ContentObserver {
        public C0961k() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            zy.this.m4530h();
        }
    }

    /* JADX INFO: compiled from: Loader.java */
    public interface toq<D> {
        /* JADX INFO: renamed from: k */
        void m4539k(@lvui zy<D> zyVar);
    }

    /* JADX INFO: renamed from: androidx.loader.content.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Loader.java */
    public interface InterfaceC7888zy<D> {
        /* JADX INFO: renamed from: k */
        void mo4508k(@lvui zy<D> zyVar, @dd D d2);
    }

    public zy(@lvui Context context) {
        this.f5181q = context.getApplicationContext();
    }

    @oc
    protected void cdj() {
    }

    @Deprecated
    public void f7l8(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f5179k);
        printWriter.print(" mListener=");
        printWriter.println(this.f51631toq);
        if (this.f5180n || this.f5183y || this.f5182s) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f5180n);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f5183y);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f5182s);
        }
        if (this.f5178g || this.f51630f7l8) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f5178g);
            printWriter.print(" mReset=");
            printWriter.println(this.f51630f7l8);
        }
    }

    @oc
    public void fn3e(int i2, @lvui InterfaceC7888zy<D> interfaceC7888zy) {
        if (this.f51631toq != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f51631toq = interfaceC7888zy;
        this.f5179k = i2;
    }

    public void fu4() {
        if (this.f5182s) {
            m4530h();
        }
    }

    @oc
    /* JADX INFO: renamed from: g */
    public void mo4526g(@dd D d2) {
        InterfaceC7888zy<D> interfaceC7888zy = this.f51631toq;
        if (interfaceC7888zy != null) {
            interfaceC7888zy.mo4508k(this, d2);
        }
    }

    @oc
    /* JADX INFO: renamed from: h */
    public void m4530h() {
        if (this.f5180n) {
            m4537y();
        } else {
            this.f5183y = true;
        }
    }

    @oc
    /* JADX INFO: renamed from: i */
    protected void mo4527i() {
    }

    @oc
    /* JADX INFO: renamed from: k */
    public void m4531k() {
        this.f5178g = true;
        n7h();
    }

    @oc
    protected void ki() {
    }

    @oc
    protected boolean kja0() {
        return false;
    }

    public boolean ld6() {
        return this.f5178g;
    }

    @oc
    public void mcp(@lvui toq<D> toqVar) {
        toq<D> toqVar2 = this.f51632zy;
        if (toqVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (toqVar2 != toqVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f51632zy = null;
    }

    @oc
    /* JADX INFO: renamed from: n */
    public void m4532n() {
        toq<D> toqVar = this.f51632zy;
        if (toqVar != null) {
            toqVar.m4539k(this);
        }
    }

    @oc
    protected void n7h() {
    }

    @oc
    public void ni7() {
        ki();
        this.f51630f7l8 = true;
        this.f5180n = false;
        this.f5178g = false;
        this.f5183y = false;
        this.f5182s = false;
    }

    @oc
    public void o1t() {
        this.f5180n = false;
        mo4527i();
    }

    /* JADX INFO: renamed from: p */
    public int m4533p() {
        return this.f5179k;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public String m4534q(@dd D d2) {
        StringBuilder sb = new StringBuilder(64);
        C0640q.m2982k(d2, sb);
        sb.append("}");
        return sb.toString();
    }

    public boolean qrj() {
        return this.f5180n;
    }

    @lvui
    /* JADX INFO: renamed from: s */
    public Context m4535s() {
        return this.f5181q;
    }

    @oc
    /* JADX INFO: renamed from: t */
    public void m4536t(@lvui InterfaceC7888zy<D> interfaceC7888zy) {
        InterfaceC7888zy<D> interfaceC7888zy2 = this.f51631toq;
        if (interfaceC7888zy2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC7888zy2 != interfaceC7888zy) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f51631toq = null;
    }

    @oc
    protected void t8r() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0640q.m2982k(this, sb);
        sb.append(" id=");
        sb.append(this.f5179k);
        sb.append("}");
        return sb.toString();
    }

    @oc
    public boolean toq() {
        return kja0();
    }

    public boolean wvg() {
        boolean z2 = this.f5183y;
        this.f5183y = false;
        this.f5182s |= z2;
        return z2;
    }

    public boolean x2() {
        return this.f51630f7l8;
    }

    @oc
    /* JADX INFO: renamed from: y */
    public void m4537y() {
        cdj();
    }

    @oc
    /* JADX INFO: renamed from: z */
    public final void m4538z() {
        this.f5180n = true;
        this.f51630f7l8 = false;
        this.f5178g = false;
        t8r();
    }

    @oc
    public void zurt(@lvui toq<D> toqVar) {
        if (this.f51632zy != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f51632zy = toqVar;
    }

    public void zy() {
        this.f5182s = false;
    }
}
