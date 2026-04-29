package com.bumptech.glide;

/* JADX INFO: renamed from: com.bumptech.glide.y */
/* JADX INFO: compiled from: MemoryCategory.java */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3213y {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);

    private final float multiplier;

    EnumC3213y(float f2) {
        this.multiplier = f2;
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}
