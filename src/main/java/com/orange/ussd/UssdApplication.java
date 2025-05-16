package com.orange.ussd;

import java.util.List;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UssdApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UssdApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Menu transferToMenu =
                new Menu(
                        "Transférer vers :",
                        List.of(
                                new MenuOptionImpl(
                                        "Orange Money",
                                        null,
                                        createNumeroMenu("Transfert Orange Money")),
                                new MenuOptionImpl(
                                        "Airtel Money",
                                        null,
                                        createNumeroMenu("Transfert Airtel Money")),
                                new MenuOptionImpl(
                                        "Mvola", null, createNumeroMenu("Transfert Mvola")),
                                new MenuOptionImpl(
                                        "IZY CASH", null, createNumeroMenu("Transfert IZY CASH")),
                                new MenuOptionImpl(
                                        "Banque & Microfinance",
                                        null,
                                        createNumeroMenu("Transfert Banque")),
                                new MenuOptionImpl(
                                        "Faire livrer du cash",
                                        null,
                                        createNumeroMenu("Livraison Cash"))));

        Menu orangeServiceMenu =
                new Menu(
                        "Services Orange :",
                        List.of(
                                new MenuOptionImpl(
                                        "Achat de crédit",
                                        null,
                                        createNumeroMenu("Achat de crédit")),
                                new MenuOptionImpl(
                                        "Achat de forfaits Internet",
                                        null,
                                        createNumeroMenu("Forfait Internet")),
                                new MenuOptionImpl(
                                        "Achat de forfaits Appels",
                                        null,
                                        createNumeroMenu("Forfait Appels")),
                                new MenuOptionImpl(
                                        "Achat de forfaits SMS",
                                        null,
                                        createNumeroMenu("Forfait SMS")),
                                new MenuOptionImpl(
                                        "Achat de forfaits Illimix",
                                        null,
                                        createNumeroMenu("Forfait Illimix"))));

        Menu paymentPartnersMenu =
                new Menu(
                        "Paiements & Partenaires :",
                        List.of(
                                new MenuOptionImpl(
                                        "Paiement marchand",
                                        null,
                                        createNumeroMenu("Paiement marchand")),
                                new MenuOptionImpl(
                                        "Paiement de factures - JIRAMA",
                                        null,
                                        createNumeroMenu("Facture JIRAMA")),
                                new MenuOptionImpl(
                                        "Paiement de factures - Canal+",
                                        null,
                                        createNumeroMenu("Facture Canal+")),
                                new MenuOptionImpl(
                                        "Paiement de factures - Autres",
                                        null,
                                        createNumeroMenu("Autres factures")),
                                new MenuOptionImpl(
                                        "Paiement de scolarité",
                                        null,
                                        createNumeroMenu("Paiement scolarité")),
                                new MenuOptionImpl(
                                        "Paiement de services divers",
                                        null,
                                        createNumeroMenu("Paiement divers"))));

        Menu financialServicesMenu =
                new Menu(
                        "Services Financiers :",
                        List.of(
                                new MenuOptionImpl(
                                        "M-Kajy - Ouvrir un compte épargne",
                                        null,
                                        createNumeroMenu("Ouvrir compte épargne")),
                                new MenuOptionImpl(
                                        "M-Kajy - Faire un dépôt",
                                        null,
                                        createNumeroMenu("Dépôt épargne")),
                                new MenuOptionImpl(
                                        "M-Kajy - Faire un retrait",
                                        null,
                                        createNumeroMenu("Retrait épargne")),
                                new MenuOptionImpl(
                                        "M-Kajy - Demander un prêt",
                                        null,
                                        createNumeroMenu("Demander prêt")),
                                new MenuOptionImpl(
                                        "M-Kajy - Consulter le solde",
                                        null,
                                        createNumeroMenu("Solde épargne")),
                                new MenuOptionImpl(
                                        "M-Kajy - Consulter mini relevé",
                                        null,
                                        createNumeroMenu("Mini relevé épargne")),
                                new MenuOptionImpl(
                                        "Paiement de salaire",
                                        null,
                                        createNumeroMenu("Paiement salaire")),
                                new MenuOptionImpl(
                                        "Assurance mobile",
                                        null,
                                        createNumeroMenu("Assurance mobile"))));

        Menu accountMenu =
                new Menu(
                        "Mon Compte :",
                        List.of(
                                new MenuOptionImpl(
                                        "Consulter le solde",
                                        null,
                                        createNumeroMenu("Solde compte")),
                                new MenuOptionImpl(
                                        "Changer le code secret",
                                        null,
                                        createNumeroMenu("Changer code")),
                                new MenuOptionImpl(
                                        "Consulter le mini relevé",
                                        null,
                                        createNumeroMenu("Mini relevé")),
                                new MenuOptionImpl(
                                        "Réinitialiser le code secret",
                                        null,
                                        createNumeroMenu("Réinit code"))));

        Menu visaCardMenu =
                new Menu(
                        "Carte VISA Akory :",
                        List.of(
                                new MenuOptionImpl(
                                        "Demander une carte",
                                        null,
                                        createNumeroMenu("Demande carte")),
                                new MenuOptionImpl(
                                        "Activer la carte",
                                        null,
                                        createNumeroMenu("Activer carte")),
                                new MenuOptionImpl(
                                        "Consulter le solde de la carte",
                                        null,
                                        createNumeroMenu("Solde carte")),
                                new MenuOptionImpl(
                                        "Recharger la carte",
                                        null,
                                        createNumeroMenu("Recharge carte"))));

        Menu karamaMenu =
                new Menu(
                        "Compte Karama :",
                        List.of(
                                new MenuOptionImpl(
                                        "Ouvrir un compte Karama",
                                        null,
                                        createNumeroMenu("Ouvrir Karama")),
                                new MenuOptionImpl(
                                        "Consulter le solde",
                                        null,
                                        createNumeroMenu("Solde Karama")),
                                new MenuOptionImpl(
                                        "Effectuer un dépôt",
                                        null,
                                        createNumeroMenu("Dépôt Karama")),
                                new MenuOptionImpl(
                                        "Effectuer un retrait",
                                        null,
                                        createNumeroMenu("Retrait Karama"))));

        Menu retraitMenu =
                new Menu(
                        "Retrait :",
                        List.of(
                                new MenuOptionImpl(
                                        "Retrait d'argent",
                                        null,
                                        createNumeroMenu("Retrait d'argent")),
                                new MenuOptionImpl(
                                        "Générer un code de retrait",
                                        null,
                                        createNumeroMenu("Générer code")),
                                new MenuOptionImpl(
                                        "Consulter les points de retrait",
                                        null,
                                        createNumeroMenu("Points retrait"))));

        Menu mainMenu =
                new Menu(
                        "Menu Principal :",
                        List.of(
                                new MenuOptionImpl("Transfert d'argent", null, transferToMenu),
                                new MenuOptionImpl("Service Orange", null, orangeServiceMenu),
                                new MenuOptionImpl(
                                        "Paiements & Partenaires", null, paymentPartnersMenu),
                                new MenuOptionImpl(
                                        "Services financiers", null, financialServicesMenu),
                                new MenuOptionImpl("Mon compte", null, accountMenu),
                                new MenuOptionImpl("Carte VISA Akory", null, visaCardMenu),
                                new MenuOptionImpl("Compte Karama", null, karamaMenu),
                                new MenuOptionImpl("Retrait", null, retraitMenu)));

        transferToMenu.setParent(mainMenu);
        orangeServiceMenu.setParent(mainMenu);
        paymentPartnersMenu.setParent(mainMenu);
        financialServicesMenu.setParent(mainMenu);
        accountMenu.setParent(mainMenu);
        visaCardMenu.setParent(mainMenu);
        karamaMenu.setParent(mainMenu);
        retraitMenu.setParent(mainMenu);

        UssdSession session = new UssdSession(mainMenu);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(session.displayCurrentMenu());
            System.out.print("Votre choix (ou tapez 'exit') : ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Au revoir !");
                break;
            }

            session.handleInput(input);
        }

        scanner.close();
    }

    private void confirmCode() {
        System.out.println("Operation avec succès !");
        System.out.println("Fin de la session USSD .");
        System.exit(0);
    }

    private Menu createConfirmationMenu(String context) {
        return new Menu(
                "Entrez le code pour confirmer " + context,
                List.of(
                        new InputOption(
                                "Saisir le code",
                                input -> {
                                    System.out.println("Code confirmé : " + input);
                                    confirmCode();
                                },
                                null,
                                input -> {
                                    if (!input.matches("\\d+")) {
                                        System.out.println("Erreur : Le code doit être uniquement composé de chiffres.");
                                        return false;
                                    }
                                    if (input.length() < 4) {
                                        System.out.println("Erreur : Le code doit contenir au moins 4 chiffres.");
                                        return false;
                                    }
                                    boolean hasTwoDifferentDigits = input.chars().distinct().count() >= 2;
                                    if (!hasTwoDifferentDigits) {
                                        System.out.println("Erreur : Le code doit contenir au moins 2 chiffres différents.");
                                        return false;
                                    }
                                    return true;
                                })));
    }

    private Menu createMontantMenu(String context) {
        Menu confirmationMenu = createConfirmationMenu(context);
        return new Menu(
                "Entrez le montant pour " + context,
                List.of(
                        new InputOption(
                                "Saisir le montant",
                                input -> {
                                    int montant = Integer.parseInt(input);
                                    System.out.println("Montant saisi : " + montant);
                                },
                                confirmationMenu,
                                input -> {
                                    try {
                                        int montant = Integer.parseInt(input);
                                        if (montant <= 0) {
                                            System.out.println("Erreur : Le montant doit être un nombre entier supérieur à 0.");
                                            return false;
                                        }
                                        return true;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Erreur : Veuillez saisir un nombre entier valide.");
                                        return false;
                                    }
                                })));
    }

    private Menu createNumeroMenu(String context) {
        Menu montantMenu = createMontantMenu(context);
        return new Menu(
                "Entrez le numéro pour " + context,
                List.of(
                        new InputOption(
                                "Saisir le numéro",
                                input -> {
                                    System.out.println("Numéro saisi : " + input);
                                },
                                montantMenu,
                                input -> {
                                    if (!input.matches("\\d{10}")) {
                                        System.out.println("Erreur : Le numéro doit contenir exactement 10 chiffres.");
                                        return false;
                                    }
                                    return true;
                                })));
    }


}
