package com.orange.ussd;

public class MenuOptionImpl implements MenuOption {
    private final String label;
    private final Runnable action;
    private final Menu subMenu;

    public MenuOptionImpl(String label, Runnable action) {
        this(label, action, null);
    }

    public MenuOptionImpl(String label, Runnable action, Menu subMenu) {
        this.label = label;
        this.action = action;
        this.subMenu = subMenu;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public Runnable getAction() {
        return action;
    }

    @Override
    public Menu getSubMenu() {
        return subMenu;
    }
}
