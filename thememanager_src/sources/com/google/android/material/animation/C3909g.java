package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.animation.g */
/* JADX INFO: compiled from: ImageMatrixProperty.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3909g extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: k */
    private final Matrix f23770k;

    public C3909g() {
        super(Matrix.class, "imageMatrixProperty");
        this.f23770k = new Matrix();
    }

    @Override // android.util.Property
    @lvui
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Matrix get(@lvui ImageView imageView) {
        this.f23770k.set(imageView.getImageMatrix());
        return this.f23770k;
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void set(@lvui ImageView imageView, @lvui Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
