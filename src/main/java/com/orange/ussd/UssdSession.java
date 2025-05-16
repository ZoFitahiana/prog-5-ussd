package com.orange.ussd;

public class UssdSession {
    private Menu currentMenu;
    private InputOption waitingInputOption;

    public UssdSession(Menu startMenu) {
        this.currentMenu = startMenu;
    }

    public String displayCurrentMenu() {
        if (waitingInputOption != null) {
            return "\n" + waitingInputOption.getLabel() + " :";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(currentMenu.getTitle()).append("\n");
        int i = 1;
        for (MenuOption option : currentMenu.getOptions()) {
            sb.append(i++).append(". ").append(option.getLabel()).append("\n");
        }
        if (currentMenu.getParent() != null) {
            sb.append(i++).append(". Retour\n");
        }
        sb.append(i).append(". Quitter\n");
        return sb.toString();
    }

    public void handleInput(String input) {
        if (waitingInputOption != null) {
            boolean valid = waitingInputOption.handleInput(input);
            if (valid) {
                if (waitingInputOption.getSubMenu() != null) {
                    currentMenu = waitingInputOption.getSubMenu();
                }
                waitingInputOption = null;
            }
            return;
        }

        try {
            int choice = Integer.parseInt(input);
            choose(choice);
        } catch (NumberFormatException e) {
            System.out.println("Entrée invalide. Veuillez saisir un numéro.");
        }
    }

    private void choose(int choice) {
        int optionCount = currentMenu.getOptions().size();
        int backIndex = optionCount + 1;
        int quitIndex = optionCount + 2;

        if (currentMenu.getParent() == null) {
            backIndex = -1;
            quitIndex = optionCount + 1;
        }

        if (choice == quitIndex) {
            System.out.println("Fin de la session USSD.");
            System.exit(0);
        } else if (choice == backIndex && currentMenu.getParent() != null) {
            currentMenu = currentMenu.getParent();
        } else if (choice > 0 && choice <= optionCount) {
            MenuOption option = currentMenu.getOptions().get(choice - 1);
            if (option instanceof InputOption inputOption) {
                waitingInputOption = inputOption;
            } else if (option.getSubMenu() != null) {
                currentMenu = option.getSubMenu();
            } else if (option.getAction() != null) {
                option.getAction().run();
            }
        } else {
            System.out.println("Choix invalide.");
        }
    }
}
