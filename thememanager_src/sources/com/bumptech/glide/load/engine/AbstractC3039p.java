package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC3050k;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.p */
/* JADX INFO: compiled from: DiskCacheStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3039p {

    /* JADX INFO: renamed from: k */
    public static final AbstractC3039p f18436k = new k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final AbstractC3039p f62798toq = new toq();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final AbstractC3039p f62799zy = new zy();

    /* JADX INFO: renamed from: q */
    public static final AbstractC3039p f18438q = new q();

    /* JADX INFO: renamed from: n */
    public static final AbstractC3039p f18437n = new n();

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.p$k */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    class k extends AbstractC3039p {
        k() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        /* JADX INFO: renamed from: k */
        public boolean mo10797k() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        /* JADX INFO: renamed from: q */
        public boolean mo10798q(boolean z2, EnumC3050k enumC3050k, com.bumptech.glide.load.zy zyVar) {
            return (enumC3050k == EnumC3050k.RESOURCE_DISK_CACHE || enumC3050k == EnumC3050k.MEMORY_CACHE) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        public boolean toq() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        public boolean zy(EnumC3050k enumC3050k) {
            return enumC3050k == EnumC3050k.REMOTE;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.p$n */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    class n extends AbstractC3039p {
        n() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        /* JADX INFO: renamed from: k */
        public boolean mo10797k() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        /* JADX INFO: renamed from: q */
        public boolean mo10798q(boolean z2, EnumC3050k enumC3050k, com.bumptech.glide.load.zy zyVar) {
            return ((z2 && enumC3050k == EnumC3050k.DATA_DISK_CACHE) || enumC3050k == EnumC3050k.LOCAL) && zyVar == com.bumptech.glide.load.zy.TRANSFORMED;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        public boolean toq() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        public boolean zy(EnumC3050k enumC3050k) {
            return enumC3050k == EnumC3050k.REMOTE;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.p$q */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    class q extends AbstractC3039p {
        q() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        /* JADX INFO: renamed from: k */
        public boolean mo10797k() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        /* JADX INFO: renamed from: q */
        public boolean mo10798q(boolean z2, EnumC3050k enumC3050k, com.bumptech.glide.load.zy zyVar) {
            return (enumC3050k == EnumC3050k.RESOURCE_DISK_CACHE || enumC3050k == EnumC3050k.MEMORY_CACHE) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        public boolean toq() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        public boolean zy(EnumC3050k enumC3050k) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.p$toq */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    class toq extends AbstractC3039p {
        toq() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        /* JADX INFO: renamed from: k */
        public boolean mo10797k() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        /* JADX INFO: renamed from: q */
        public boolean mo10798q(boolean z2, EnumC3050k enumC3050k, com.bumptech.glide.load.zy zyVar) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        public boolean toq() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        public boolean zy(EnumC3050k enumC3050k) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.p$zy */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    class zy extends AbstractC3039p {
        zy() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        /* JADX INFO: renamed from: k */
        public boolean mo10797k() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        /* JADX INFO: renamed from: q */
        public boolean mo10798q(boolean z2, EnumC3050k enumC3050k, com.bumptech.glide.load.zy zyVar) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        public boolean toq() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3039p
        public boolean zy(EnumC3050k enumC3050k) {
            return (enumC3050k == EnumC3050k.DATA_DISK_CACHE || enumC3050k == EnumC3050k.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo10797k();

    /* JADX INFO: renamed from: q */
    public abstract boolean mo10798q(boolean z2, EnumC3050k enumC3050k, com.bumptech.glide.load.zy zyVar);

    public abstract boolean toq();

    public abstract boolean zy(EnumC3050k enumC3050k);
}
