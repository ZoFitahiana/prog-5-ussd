package com.orange.ussd;

public interface MenuOption {
    String getLabel();
    Runnable getAction();
    Menu getSubMenu();
}
