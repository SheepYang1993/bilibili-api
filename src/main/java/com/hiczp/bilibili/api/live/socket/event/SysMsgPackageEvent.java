package com.hiczp.bilibili.api.live.socket.event;

import com.hiczp.bilibili.api.live.socket.entity.SysMsgEntity;

public class SysMsgPackageEvent extends ReceivePackageEvent<SysMsgEntity> {
    public SysMsgPackageEvent(Object source, SysMsgEntity entity) {
        super(source, entity);
    }
}
