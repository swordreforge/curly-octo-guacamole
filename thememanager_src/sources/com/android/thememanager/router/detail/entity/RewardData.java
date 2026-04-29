package com.android.thememanager.router.detail.entity;

import java.io.Serializable;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RewardData implements Serializable {
    public static final long serialVersionUID = 1;
    public long bountyCount;
    public List<UserBounty> bountyList;
    public String createTime;
    public UserBounty curUserBounty;
    public int errCode;
    public boolean hasMore;
    public String identityUrl;
    public String marketType;
    public String msgId;
    public String notifyUrl;
    public String orderDesc;
    public String orderFee;
    public String orderId;
    public long[] randBounties;
    public String sender;
    public String senderSign;
    public String skuId;
    public String xiaomiId;

    @lvui
    public String toString() {
        return "{\"msgId\":\"" + this.msgId + "\",\"sender\":\"" + this.sender + "\",\"marketType\":\"" + this.marketType + "\",\"xiaomiId\":\"" + this.xiaomiId + "\",\"orderId\":\"" + this.orderId + "\",\"orderFee\":\"" + this.orderFee + "\",\"createTime\":\"" + this.createTime + "\",\"notifyUrl\":\"" + this.notifyUrl + "\",\"orderDesc\":\"" + this.orderDesc + "\",\"skuId\":\"" + this.skuId + "\",\"senderSign\":\"" + this.senderSign + "\"}";
    }
}
