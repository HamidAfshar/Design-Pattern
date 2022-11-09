package com.afshar.designpatterns.bridge;

public class AdvancedRemote extends BasicRemote {
    protected AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        this.device.setVolume(0);
    }
}
