package androidx.constraintlayout.core.parser;

/* JADX INFO: renamed from: androidx.constraintlayout.core.parser.y */
/* JADX INFO: compiled from: CLParsingException.java */
/* JADX INFO: loaded from: classes.dex */
public class C0305y extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public C0305y(String str, zy zyVar) {
        this.mReason = str;
        if (zyVar != null) {
            this.mElementClass = zyVar.ld6();
            this.mLineNumber = zyVar.m1149s();
        } else {
            this.mElementClass = "unknown";
            this.mLineNumber = 0;
        }
    }

    public String reason() {
        return this.mReason + " (" + this.mElementClass + " at line " + this.mLineNumber + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
