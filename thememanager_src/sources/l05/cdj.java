package l05;

import mub.InterfaceC7395n;

/* JADX INFO: compiled from: KotlinReflectionNotSupportedError.kt */
/* JADX INFO: loaded from: classes3.dex */
public class cdj extends Error {
    public cdj() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public cdj(@InterfaceC7395n String str) {
        super(str);
    }

    public cdj(@InterfaceC7395n String str, @InterfaceC7395n Throwable th) {
        super(str, th);
    }

    public cdj(@InterfaceC7395n Throwable th) {
        super(th);
    }
}
