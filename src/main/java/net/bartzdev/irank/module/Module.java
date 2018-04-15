package net.bartzdev.irank.module;

public abstract class Module {

    private boolean enabled;

    public boolean isEnabled() {
        return this.enabled;
    }

    public abstract void enable();

    public abstract void disable();
}
