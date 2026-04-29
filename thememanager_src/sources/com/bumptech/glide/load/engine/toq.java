package com.bumptech.glide.load.engine;

/* JADX INFO: compiled from: CallbackException.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    toq(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
