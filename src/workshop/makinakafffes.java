import static javax.swing.text.html.HTML.Tag.S;

void main() {

    // 1. Menuja kryesore
    IO.println("===== MAKINA E KAFESE =====");
    IO.println("1. Kafe");
    IO.println("2. Qaj");

    var type = Integer.parseInt(
            IO.readln("Zgjedhni 1 per kafe ose 2 per qaj: ")
    );

    // 2. Kontrollimi i zgjedhjes
    if (type == 1) {

        // 3. Menuja e kafese
        IO.println("===== MENUJA E KAFESE =====");
        IO.println("1. Espresso 1.0€");
        IO.println("2. Mahcciato 1.20€");
        IO.println("3. Latte 1.50€");
        IO.println("4. Cappuccino 1.60€");

        var coffee = Integer.parseInt(
                IO.readln("Zgjedhni kafen: ")
        );

        if (coffee == 1) {

            // 4. Espresso
            IO.println("1. Espresso e shkurter");
            IO.println("2. Espresso e gjate");
            IO.println("3. Americano");

            var espresso = Integer.parseInt(
                    IO.readln("Zgjedhni llojin: ")
            );

            var price = switch (espresso) {
                case 1, 2, 3 -> 1.00;
                default -> 0.0;
            };

            if (price == 0.0) {
                IO.println("Zgjedhje e gabuar!");
            } else {
                IO.println("Kafja po pergatitet...");
                System.out.printf("Cmimi: %.2f €%n", price);
            }

        } else if (coffee >= 2) {

            // 5. Kafe me qumesht
            IO.println("Madhesia: S/M/L");

            var size = IO.readln("Zgjedhni madhesine: ");


            var price = switch (size) {
                case "S" -> 1.20;
                case "M" -> 1.50;
                case "L" -> 1.60;
                default -> 0.0;
            };

            if (price == 0.0) {
                IO.println("Zgjedhje e gabuar!");
            } else {

                // 6. Temperatura e qumeshtit
                IO.println("1. Qumesht i nxehte");
                IO.println("2. Qumesht i ftohte");

                var milk = Integer.parseInt(
                        IO.readln("Zgjedhni temperaturen: ")
                );

                if (milk == 1 || milk == 2) {
                    IO.println("Kafja po pergatitet...");
                    System.out.printf("Cmimi: %.2f €%n", price);
                } else {
                    IO.println("Zgjedhje e gabuar!");
                }
            }

        } else {
            IO.println("Ju lutem zgjedhni 1 ose 2!");
        }

    } else if (type == 2) {

        // 7. Menuja e cajit
        IO.println("===== MENUJA E CAJIT =====");
        IO.println("1. Caj mali 0.70€");
        IO.println("2. Caj kamomil 0.70€");
        IO.println("3. Caj mente 0.70€");

        var tea = Integer.parseInt(
                IO.readln("Zgjedhni cajin: ")
        );

        var price = switch (tea) {
            case 1, 2, 3 -> 0.70;
            default -> 0.0;
        };

        if (price == 0.0) {
            IO.println("Zgjedhje e gabuar!");
        } else {
            IO.println("Caji po pergatitet...");
            System.out.printf("Cmimi: %.2f €%n", price);
        }

    } else {
        IO.println("Zgjedhje e gabuar!");
        IO.println("Zgjedhni 1 per kafe ose 2 per qaj.");
    }
}