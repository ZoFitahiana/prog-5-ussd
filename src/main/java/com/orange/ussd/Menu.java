package com.orange.ussd;

import java.util.List;

public class Menu {
    private final String title;
    private final List<MenuOption> options;
    private Menu parent;

    public Menu(String title, List<MenuOption> options) {
        this.title = title;
        this.options = options;
    }

    public String getTitle() {
        return title;
    }

    public List<MenuOption> getOptions() {
        return options;
    }

    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }
}
