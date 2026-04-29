package com.xiaomi.push;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
class g0ad implements tww7 {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ wt f32951k;

    g0ad(wt wtVar) {
        this.f32951k = wtVar;
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: a */
    public void mo20690a(imd imdVar, int i2, Exception exc) {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("[Slim] " + this.f32951k.f34079k.format(new Date()) + " Connection closed (" + this.f32951k.f73714toq.hashCode() + ")");
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: b */
    public void mo20692b(imd imdVar) {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("[Slim] " + this.f32951k.f34079k.format(new Date()) + " Connection reconnected (" + this.f32951k.f73714toq.hashCode() + ")");
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: a */
    public void mo20691a(imd imdVar, Exception exc) {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("[Slim] " + this.f32951k.f34079k.format(new Date()) + " Reconnection failed due to an exception (" + this.f32951k.f73714toq.hashCode() + ")");
        exc.printStackTrace();
    }

    @Override // com.xiaomi.push.tww7
    /* JADX INFO: renamed from: a */
    public void mo20689a(imd imdVar) {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("[Slim] " + this.f32951k.f34079k.format(new Date()) + " Connection started (" + this.f32951k.f73714toq.hashCode() + ")");
    }
}
