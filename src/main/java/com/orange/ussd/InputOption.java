package com.orange.ussd;

import java.util.function.Consumer;

public class InputOption implements MenuOption {
    private final String label;
    private final Consumer<String> onInput;
    private final Menu nextMenu;

    public InputOption(String label, Consumer<String> onInput, Menu nextMenu) {
        this.label = label;
        this.onInput = onInput;
        this.nextMenu = nextMenu;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public Runnable getAction() {
        return null;
    }

    @Override
    public Menu getSubMenu() {
        return nextMenu;
    }

    public void handleInput(String input) {
        onInput.accept(input);
    }
}
