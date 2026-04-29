package com.airbnb.lottie.network;

/* JADX INFO: compiled from: FileExtension.java */
/* JADX INFO: loaded from: classes.dex */
public enum zy {
    JSON(".json"),
    ZIP(".zip");

    public final String extension;

    zy(String str) {
        this.extension = str;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}
