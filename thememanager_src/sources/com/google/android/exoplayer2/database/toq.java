package com.google.android.exoplayer2.database;

import android.database.SQLException;
import java.io.IOException;

/* JADX INFO: compiled from: DatabaseIOException.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq extends IOException {
    public toq(SQLException sQLException) {
        super(sQLException);
    }

    public toq(SQLException sQLException, String str) {
        super(str, sQLException);
    }
}
