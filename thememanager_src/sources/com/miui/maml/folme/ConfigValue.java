package com.miui.maml.folme;

import androidx.collection.zy;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigValue {
    public long mDelay;
    public EaseManager.EaseStyle mEase;
    public boolean mHasFromSpeed;
    public float mFromSpeed = Float.MAX_VALUE;
    public zy<String> mRelatedProperty = new zy<>();
    public zy<String> mOnUpdateCallback = new zy<>();
    public zy<String> mOnBeginCallback = new zy<>();
    public zy<String> mOnCompleteCallback = new zy<>();
}
