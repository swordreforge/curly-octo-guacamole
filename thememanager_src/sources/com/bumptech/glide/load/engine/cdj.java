package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.EnumC3050k;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: GlideException.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cdj extends Exception {

    /* JADX INFO: renamed from: k */
    private static final StackTraceElement[] f18326k = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private EnumC3050k dataSource;
    private String detailMessage;

    @dd
    private Exception exception;
    private com.bumptech.glide.load.f7l8 key;

    public cdj(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* JADX INFO: renamed from: k */
    private void m10737k(Throwable th, List<Throwable> list) {
        if (!(th instanceof cdj)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((cdj) th).getCauses().iterator();
        while (it.hasNext()) {
            m10737k(it.next(), list);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m10738n(Appendable appendable) {
        m10739q(this, appendable);
        toq(getCauses(), new C3026k(appendable));
    }

    /* JADX INFO: renamed from: q */
    private static void m10739q(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private static void toq(List<Throwable> list, Appendable appendable) {
        try {
            zy(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void zy(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof cdj) {
                ((cdj) th).m10738n(appendable);
            } else {
                m10739q(th, appendable);
            }
            i2 = i3;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        sb.append(this.dataClass != null ? ", " + this.dataClass : "");
        sb.append(this.dataSource != null ? ", " + this.dataSource : "");
        sb.append(this.key != null ? ", " + this.key : "");
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" root causes:");
        }
        for (Throwable th : rootCauses) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @dd
    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        m10737k(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i3 = i2 + 1;
            sb.append(i3);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), rootCauses.get(i2));
            i2 = i3;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    void setLoggingDetails(com.bumptech.glide.load.f7l8 f7l8Var, EnumC3050k enumC3050k) {
        setLoggingDetails(f7l8Var, enumC3050k, null);
    }

    public void setOrigin(@dd Exception exc) {
        this.exception = exc;
    }

    public cdj(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m10738n(printStream);
    }

    void setLoggingDetails(com.bumptech.glide.load.f7l8 f7l8Var, EnumC3050k enumC3050k, Class<?> cls) {
        this.key = f7l8Var;
        this.dataSource = enumC3050k;
        this.dataClass = cls;
    }

    public cdj(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f18326k);
        this.causes = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m10738n(printWriter);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.cdj$k */
    /* JADX INFO: compiled from: GlideException.java */
    private static final class C3026k implements Appendable {

        /* JADX INFO: renamed from: g */
        private static final String f18327g = "  ";

        /* JADX INFO: renamed from: n */
        private static final String f18328n = "";

        /* JADX INFO: renamed from: k */
        private final Appendable f18329k;

        /* JADX INFO: renamed from: q */
        private boolean f18330q = true;

        C3026k(Appendable appendable) {
            this.f18329k = appendable;
        }

        @lvui
        /* JADX INFO: renamed from: k */
        private CharSequence m10740k(@dd CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.f18330q) {
                this.f18330q = false;
                this.f18329k.append(f18327g);
            }
            this.f18330q = c2 == '\n';
            this.f18329k.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@dd CharSequence charSequence) throws IOException {
            CharSequence charSequenceM10740k = m10740k(charSequence);
            return append(charSequenceM10740k, 0, charSequenceM10740k.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@dd CharSequence charSequence, int i2, int i3) throws IOException {
            CharSequence charSequenceM10740k = m10740k(charSequence);
            boolean z2 = false;
            if (this.f18330q) {
                this.f18330q = false;
                this.f18329k.append(f18327g);
            }
            if (charSequenceM10740k.length() > 0 && charSequenceM10740k.charAt(i3 - 1) == '\n') {
                z2 = true;
            }
            this.f18330q = z2;
            this.f18329k.append(charSequenceM10740k, i2, i3);
            return this;
        }
    }
}
