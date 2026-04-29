package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C5392l;
import com.tencent.wxop.stat.common.C5397q;
import com.tencent.wxop.stat.event.AbstractC5405e;

/* JADX INFO: loaded from: classes3.dex */
class aq {

    /* JADX INFO: renamed from: f */
    private static volatile long f30036f;

    /* JADX INFO: renamed from: a */
    private AbstractC5405e f30037a;

    /* JADX INFO: renamed from: b */
    private StatReportStrategy f30038b;

    /* JADX INFO: renamed from: c */
    private boolean f30039c;

    /* JADX INFO: renamed from: d */
    private Context f30040d;

    /* JADX INFO: renamed from: e */
    private long f30041e = System.currentTimeMillis();

    public aq(AbstractC5405e abstractC5405e) {
        this.f30038b = null;
        this.f30039c = false;
        this.f30040d = null;
        this.f30037a = abstractC5405e;
        this.f30038b = StatConfig.getStatSendStrategy();
        this.f30039c = abstractC5405e.m18489f();
        this.f30040d = abstractC5405e.m18488e();
    }

    /* JADX INFO: renamed from: a */
    private void m18326a(InterfaceC5414h interfaceC5414h) {
        C5415i.m18501b(StatServiceImpl.f29986t).m18502a(this.f30037a, interfaceC5414h);
    }

    /* JADX INFO: renamed from: b */
    private void m18328b() {
        if (this.f30037a.m18487d() != null && this.f30037a.m18487d().isSendImmediately()) {
            this.f30038b = StatReportStrategy.INSTANT;
        }
        if (StatConfig.f29945j && C5378a.m18307a(StatServiceImpl.f29986t).m18319e()) {
            this.f30038b = StatReportStrategy.INSTANT;
        }
        if (StatConfig.isDebugEnable()) {
            StatServiceImpl.f29983q.m18377i("strategy=" + this.f30038b.name());
        }
        switch (ag.f30014a[this.f30038b.ordinal()]) {
            case 1:
                m18329c();
                break;
            case 2:
                au.m18335a(this.f30040d).m18364a(this.f30037a, (InterfaceC5414h) null, this.f30039c, false);
                if (StatConfig.isDebugEnable()) {
                    StatServiceImpl.f29983q.m18377i("PERIOD currTime=" + this.f30041e + ",nextPeriodSendTs=" + StatServiceImpl.f29969c + ",difftime=" + (StatServiceImpl.f29969c - this.f30041e));
                }
                if (StatServiceImpl.f29969c == 0) {
                    StatServiceImpl.f29969c = C5397q.m18457a(this.f30040d, "last_period_ts", 0L);
                    if (this.f30041e > StatServiceImpl.f29969c) {
                        StatServiceImpl.m18298e(this.f30040d);
                    }
                    long sendPeriodMinutes = this.f30041e + ((long) (StatConfig.getSendPeriodMinutes() * 60 * 1000));
                    if (StatServiceImpl.f29969c > sendPeriodMinutes) {
                        StatServiceImpl.f29969c = sendPeriodMinutes;
                    }
                    C5399d.m18475a(this.f30040d).m18476a();
                }
                if (StatConfig.isDebugEnable()) {
                    StatServiceImpl.f29983q.m18377i("PERIOD currTime=" + this.f30041e + ",nextPeriodSendTs=" + StatServiceImpl.f29969c + ",difftime=" + (StatServiceImpl.f29969c - this.f30041e));
                }
                if (this.f30041e > StatServiceImpl.f29969c) {
                    StatServiceImpl.m18298e(this.f30040d);
                }
                break;
            case 3:
            case 4:
                au.m18335a(this.f30040d).m18364a(this.f30037a, (InterfaceC5414h) null, this.f30039c, false);
                break;
            case 5:
                au.m18335a(this.f30040d).m18364a(this.f30037a, (InterfaceC5414h) new ar(this), this.f30039c, true);
                break;
            case 6:
                if (C5378a.m18307a(StatServiceImpl.f29986t).m18317c() != 1) {
                    au.m18335a(this.f30040d).m18364a(this.f30037a, (InterfaceC5414h) null, this.f30039c, false);
                } else {
                    m18329c();
                }
                break;
            case 7:
                if (C5392l.m18426e(this.f30040d)) {
                    m18326a(new as(this));
                }
                break;
            default:
                StatServiceImpl.f29983q.error("Invalid stat strategy:" + StatConfig.getStatSendStrategy());
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m18329c() {
        if (au.m18349b().f30048a <= 0 || !StatConfig.f29947l) {
            m18326a(new at(this));
        } else {
            au.m18349b().m18364a(this.f30037a, (InterfaceC5414h) null, this.f30039c, true);
            au.m18349b().m18363a(-1);
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m18331d() {
        if (StatConfig.f29943h <= 0) {
            return false;
        }
        if (this.f30041e > StatServiceImpl.f29974h) {
            StatServiceImpl.f29973g.clear();
            long unused = StatServiceImpl.f29974h = this.f30041e + StatConfig.f29944i;
            if (StatConfig.isDebugEnable()) {
                StatServiceImpl.f29983q.m18377i("clear methodsCalledLimitMap, nextLimitCallClearTime=" + StatServiceImpl.f29974h);
            }
        }
        Integer numValueOf = Integer.valueOf(this.f30037a.mo18479a().m18478a());
        Integer num = (Integer) StatServiceImpl.f29973g.get(numValueOf);
        if (num == null) {
            StatServiceImpl.f29973g.put(numValueOf, 1);
            return false;
        }
        StatServiceImpl.f29973g.put(numValueOf, Integer.valueOf(num.intValue() + 1));
        if (num.intValue() <= StatConfig.f29943h) {
            return false;
        }
        if (StatConfig.isDebugEnable()) {
            StatServiceImpl.f29983q.m18375e("event " + this.f30037a.m18490g() + " was discard, cause of called limit, current:" + num + ", limit:" + StatConfig.f29943h + ", period:" + StatConfig.f29944i + " ms");
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m18332a() {
        if (m18331d()) {
            return;
        }
        if (StatConfig.f29948m > 0 && this.f30041e >= f30036f) {
            StatServiceImpl.flushDataToDB(this.f30040d);
            f30036f = this.f30041e + StatConfig.f29949n;
            if (StatConfig.isDebugEnable()) {
                StatServiceImpl.f29983q.m18377i("nextFlushTime=" + f30036f);
            }
        }
        if (!C5378a.m18307a(this.f30040d).m18320f()) {
            au.m18335a(this.f30040d).m18364a(this.f30037a, (InterfaceC5414h) null, this.f30039c, false);
            return;
        }
        if (StatConfig.isDebugEnable()) {
            StatServiceImpl.f29983q.m18377i("sendFailedCount=" + StatServiceImpl.f29967a);
        }
        if (!StatServiceImpl.m18286a()) {
            m18328b();
            return;
        }
        au.m18335a(this.f30040d).m18364a(this.f30037a, (InterfaceC5414h) null, this.f30039c, false);
        if (this.f30041e - StatServiceImpl.f29968b > 1800000) {
            StatServiceImpl.m18296d(this.f30040d);
        }
    }
}
