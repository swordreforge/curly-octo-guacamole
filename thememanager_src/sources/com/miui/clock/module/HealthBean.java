package com.miui.clock.module;

import com.miui.clock.C5049g;
import java.util.HashSet;
import java.util.Iterator;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class HealthBean {
    private long sleepDuration;
    private int stepCountNow = -1;
    private int stepCountTarget = -1;
    private int standCountNow = -1;
    private int standCountTarget = -1;
    private int caloriesNow = -1;
    private int caloriesTarget = -1;
    private int sportTimeNow = -1;
    private int sportTimeTarget = -1;

    public static int getHealthIconByType(int i2) {
        return i2 != 500 ? i2 != 502 ? i2 != 504 ? C5049g.n.c7g : C5049g.n.fpn : C5049g.n.x8 : C5049g.n.olj;
    }

    private void updateCalories(HealthBean healthBean) {
        if (healthBean == null) {
            this.caloriesNow = -1;
            this.caloriesTarget = -1;
        } else {
            this.caloriesNow = healthBean.caloriesNow;
            this.caloriesTarget = healthBean.caloriesTarget;
        }
    }

    private void updateSleepDuration(HealthBean healthBean) {
        if (healthBean == null) {
            this.sleepDuration = 0L;
        } else {
            this.sleepDuration = healthBean.sleepDuration;
        }
    }

    private void updateSportTime(HealthBean healthBean) {
        if (healthBean == null) {
            this.sportTimeNow = -1;
            this.sportTimeTarget = -1;
        } else {
            this.sportTimeNow = healthBean.sportTimeNow;
            this.sportTimeTarget = healthBean.sportTimeTarget;
        }
    }

    private void updateStandCount(HealthBean healthBean) {
        if (healthBean == null) {
            this.standCountNow = -1;
            this.standCountTarget = -1;
        } else {
            this.standCountNow = healthBean.standCountNow;
            this.standCountTarget = healthBean.standCountTarget;
        }
    }

    private void updateStepCount(HealthBean healthBean) {
        if (healthBean == null) {
            this.stepCountNow = -1;
            this.stepCountTarget = -1;
        } else {
            this.stepCountNow = healthBean.stepCountNow;
            this.stepCountTarget = healthBean.stepCountTarget;
        }
    }

    public int getCaloriesNow() {
        return this.caloriesNow;
    }

    public String getCaloriesNowString() {
        return Integer.toString(this.caloriesNow);
    }

    public int getCaloriesTarget() {
        return this.caloriesTarget;
    }

    public String getCaloriesTargetString() {
        return Integer.toString(this.caloriesTarget);
    }

    public long getSleepDuration() {
        return this.sleepDuration;
    }

    public int getSleepDurationMinute() {
        return (int) (this.sleepDuration / 60000);
    }

    public int getSportTimeNow() {
        return this.sportTimeNow;
    }

    public String getSportTimeNowString() {
        return Integer.toString(this.sportTimeNow);
    }

    public int getSportTimeTarget() {
        return this.sportTimeTarget;
    }

    public String getSportTimeTargetString() {
        return Integer.toString(this.sportTimeTarget);
    }

    public int getStandCountNow() {
        return this.standCountNow;
    }

    public String getStandCountNowString() {
        return Integer.toString(this.standCountNow);
    }

    public int getStandCountTarget() {
        return this.standCountTarget;
    }

    public String getStandCountTargetString() {
        return Integer.toString(this.standCountTarget);
    }

    public int getStepCountNow() {
        return this.stepCountNow;
    }

    public String getStepCountNowString() {
        return Integer.toString(this.stepCountNow);
    }

    public int getStepCountTarget() {
        return this.stepCountTarget;
    }

    public String getStepCountTargetString() {
        return Integer.toString(this.stepCountTarget);
    }

    public boolean hasCaloriesData() {
        return this.caloriesNow >= 0 && this.caloriesTarget >= 0;
    }

    public boolean hasSleepDurationData() {
        return this.sleepDuration > 0;
    }

    public boolean hasSportTimeData() {
        return this.sportTimeNow >= 0 && this.sportTimeTarget >= 0;
    }

    public boolean hasStandCountData() {
        return this.standCountNow >= 0 && this.standCountTarget >= 0;
    }

    public boolean hasStepCountData() {
        return this.stepCountNow >= 0 && this.stepCountTarget >= 0;
    }

    public void setCaloriesList(String str) {
    }

    public void setCaloriesNow(int i2) {
        this.caloriesNow = i2;
    }

    public void setCaloriesTarget(int i2) {
        this.caloriesTarget = i2;
    }

    public void setSleepDuration(long j2) {
        this.sleepDuration = j2;
    }

    public void setSportTimeList(String str) {
    }

    public void setSportTimeNow(int i2) {
        this.sportTimeNow = i2;
    }

    public void setSportTimeTarget(int i2) {
        this.sportTimeTarget = i2;
    }

    public void setStandCountNow(int i2) {
        this.standCountNow = i2;
    }

    public void setStandCountTarget(int i2) {
        this.standCountTarget = i2;
    }

    public void setStepCountList(String str) {
    }

    public void setStepCountNow(int i2) {
        this.stepCountNow = i2;
    }

    public void setStepCountTarget(int i2) {
        this.stepCountTarget = i2;
    }

    public String toJsonString() {
        return "{\"sleepDuration\":" + this.sleepDuration + ",\"stepCountNow\":" + this.stepCountNow + ",\"stepCountTarget\":" + this.stepCountTarget + ",\"standCountNow\":" + this.standCountNow + ",\"standCountTarget\":" + this.standCountTarget + ",\"caloriesNow\":" + this.caloriesNow + ",\"caloriesTarget\":" + this.caloriesTarget + ",\"sportTimeNow\":" + this.sportTimeNow + ",\"sportTimeTarget\":" + this.sportTimeTarget + '}';
    }

    @lvui
    public String toString() {
        return "HealthBean{sleepDuration=" + this.sleepDuration + ", stepCountNow=" + this.stepCountNow + ", stepCountTarget=" + this.stepCountTarget + ", standCountNow=" + this.standCountNow + ", standCountTarget=" + this.standCountTarget + ", caloriesNow=" + this.caloriesNow + ", caloriesTarget=" + this.caloriesTarget + ", sportTimeNow=" + this.sportTimeNow + ", sportTimeTarget=" + this.sportTimeTarget + '}';
    }

    public void updateData(HealthBean healthBean, HashSet<Integer> hashSet) {
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            switch (it.next().intValue()) {
                case 500:
                case 501:
                    updateStepCount(healthBean);
                    break;
                case 502:
                case 503:
                    updateCalories(healthBean);
                    break;
                case 504:
                case 507:
                default:
                    updateStandCount(healthBean);
                    break;
                case 505:
                case 508:
                    updateSportTime(healthBean);
                    break;
                case 506:
                    updateSleepDuration(healthBean);
                    break;
            }
        }
    }
}
