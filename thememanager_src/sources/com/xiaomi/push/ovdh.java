package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public class ovdh extends Exception {

    /* JADX INFO: renamed from: a */
    private lk f33552a;

    /* JADX INFO: renamed from: a */
    private z617 f33553a;

    /* JADX INFO: renamed from: a */
    private Throwable f33554a;

    public ovdh() {
        this.f33552a = null;
        this.f33553a = null;
        this.f33554a = null;
    }

    /* JADX INFO: renamed from: a */
    public Throwable m21371a() {
        return this.f33554a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        lk lkVar;
        z617 z617Var;
        String message = super.getMessage();
        return (message != null || (z617Var = this.f33553a) == null) ? (message != null || (lkVar = this.f33552a) == null) ? message : lkVar.toString() : z617Var.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(": ");
        }
        z617 z617Var = this.f33553a;
        if (z617Var != null) {
            sb.append(z617Var);
        }
        lk lkVar = this.f33552a;
        if (lkVar != null) {
            sb.append(lkVar);
        }
        if (this.f33554a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.f33554a);
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f33554a != null) {
            printStream.println("Nested Exception: ");
            this.f33554a.printStackTrace(printStream);
        }
    }

    public ovdh(String str) {
        super(str);
        this.f33552a = null;
        this.f33553a = null;
        this.f33554a = null;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f33554a != null) {
            printWriter.println("Nested Exception: ");
            this.f33554a.printStackTrace(printWriter);
        }
    }

    public ovdh(Throwable th) {
        this.f33552a = null;
        this.f33553a = null;
        this.f33554a = th;
    }

    public ovdh(lk lkVar) {
        this.f33553a = null;
        this.f33554a = null;
        this.f33552a = lkVar;
    }

    public ovdh(String str, Throwable th) {
        super(str);
        this.f33552a = null;
        this.f33553a = null;
        this.f33554a = th;
    }
}
