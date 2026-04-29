package com.android.thememanager.settings.localaudio;

import android.text.TextUtils;
import java.util.Objects;
import yz.C7794k;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: UsingPath.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: g */
    @dd
    public String f15110g;

    /* JADX INFO: renamed from: k */
    @dd
    public String f15111k;

    /* JADX INFO: renamed from: n */
    @dd
    public String f15112n;

    /* JADX INFO: renamed from: q */
    @dd
    public String f15113q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    public String f60790toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    public String f60791zy;

    public toq() {
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null && this.f15111k == null && this.f60790toq == null && this.f60791zy == null && this.f15113q == null) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        toq toqVar = (toq) o2;
        return TextUtils.equals(this.f15111k, toqVar.f15111k) && TextUtils.equals(this.f60790toq, toqVar.f60790toq) && TextUtils.equals(this.f60791zy, toqVar.f60791zy) && TextUtils.equals(this.f15113q, toqVar.f15113q) && TextUtils.equals(this.f15110g, toqVar.f15110g);
    }

    public int hashCode() {
        return Objects.hash(this.f15111k, this.f60790toq, this.f60791zy, this.f15113q, this.f15110g);
    }

    /* JADX INFO: renamed from: k */
    public boolean m9026k(@lvui String path) {
        return path.equals(this.f15111k) || path.equals(this.f60790toq) || path.equals(this.f60791zy) || path.equals(this.f15113q);
    }

    public String toq(String resCode) {
        resCode.hashCode();
        switch (resCode) {
            case "bootaudio":
                return this.f15112n;
            case "ringtone":
                return this.f15111k;
            case "mmsringtone":
                return this.f15113q;
            case "alarm":
                return this.f60791zy;
            case "notification":
                return this.f60790toq;
            case "calendarringtone":
                return this.f15110g;
            default:
                C7794k.f7l8("res code error: " + resCode);
                return null;
        }
    }

    public toq(@dd String ring, @dd String notification, @dd String alarm, @dd String mms, @dd String bootRing, @dd String calendar) {
        this.f15111k = ring;
        this.f60790toq = notification;
        this.f60791zy = alarm;
        this.f15113q = mms;
        this.f15112n = bootRing;
        this.f15110g = calendar;
    }
}
