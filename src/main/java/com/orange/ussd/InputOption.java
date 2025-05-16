package com.orange.ussd;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class InputOption implements MenuOption {
    private final String label;
    private final Consumer<String> onInput;
    private final Menu nextMenu;
    private final Predicate<String> validator;

    public InputOption(String label, Consumer<String> onInput, Menu nextMenu) {
        this(label, onInput, nextMenu, input -> true);
    }

    public InputOption(
            String label, Consumer<String> onInput, Menu nextMenu, Predicate<String> validator) {
        this.label = label;
        this.onInput = onInput;
        this.nextMenu = nextMenu;
        this.validator = validator;
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

    public boolean handleInput(String input) {
        if (validator.test(input)) {
            onInput.accept(input);
            return true;
        } else {
            return false;
        }
    }
}
