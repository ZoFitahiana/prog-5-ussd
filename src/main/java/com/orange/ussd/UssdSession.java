package com.orange.ussd;

public class UssdSession {
    private Menu currentMenu;

    public UssdSession(Menu startMenu) {
        this.currentMenu = startMenu;
    }

    public String displayCurrentMenu() {
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

    public void choose(int choice) {
        int nbOptions = currentMenu.getOptions().size();
        int retourIndex = nbOptions + 1;
        int quitterIndex = nbOptions + 2;

        if (choice == quitterIndex) {
            System.out.println("Fin de la session USSD.");
            System.exit(0);
        } else if (choice == retourIndex && currentMenu.getParent() != null) {
            currentMenu = currentMenu.getParent();
        } else if (choice > 0 && choice <= nbOptions) {
            MenuOption option = currentMenu.getOptions().get(choice - 1);
            if (option.getSubMenu() != null) {
                currentMenu = option.getSubMenu();
            } else if (option.getAction() != null) {
                option.getAction().run();
            }
        } else {
            System.out.println("Choix invalide.");
        }
    }
}
