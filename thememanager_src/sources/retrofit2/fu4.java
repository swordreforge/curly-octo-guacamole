package retrofit2;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: SkipCallbackExecutorImpl.java */
/* JADX INFO: loaded from: classes4.dex */
final class fu4 implements ni7 {

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    private static final ni7 f94690dr = new fu4();

    fu4() {
    }

    /* JADX INFO: renamed from: k */
    static Annotation[] m27972k(Annotation[] annotationArr) {
        if (C7657z.x2(annotationArr, ni7.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f94690dr;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return ni7.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof ni7;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + ni7.class.getName() + "()";
    }
}
