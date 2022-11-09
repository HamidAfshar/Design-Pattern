package com.afshar.designpatterns.bridge;

public class BasicRemote extends Remote {
    protected BasicRemote(Device device) {
        super(device);
    }

    @Override
    void power() {
        if (this.device.isEnabled())
            this.device.disable();
        else this.device.enable();
    }

    @Override
    void volumeDown() {
        System.out.println("Remote: volume down");
        this.device.setVolume(device.getVolume() - 10);
    }

    @Override
    void volumeUp() {
        System.out.println("Remote: volume up");
        this.device.setVolume(device.getVolume() + 10);
    }

    @Override
    void channelDown() {
        System.out.println("Remote: channel down");
        this.device.setChannel(device.getChannel() - 1);
    }

    @Override
    void channelUp() {
        System.out.println("Remote: channel up");
        this.device.setChannel(device.getChannel() + 1);
    }
}
