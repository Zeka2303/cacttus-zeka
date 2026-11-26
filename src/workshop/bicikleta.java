void main() {
    // 1. menuja
    IO.println("1. Qyteti");
    IO.println("2. Malore");
    IO.println("3. Elektrike");
    var type = Integer.parseInt(IO.readln("Biçikleta (1-3): "));
    // 2. çmimi për orë: switch që jep vlerë
    var rate = switch (type) {
        case 1 -> 2.0;
        case 2 -> 3.5;
        case 3 -> 5.0;
        default -> 0.0;
    };
    if (rate == 0.0) {
        IO.println("Biçikletë e panjohur.");
    } else {
        // 3. orët: nga 1 deri në 8
        var hours = Integer.parseInt(IO.readln("Orët (1-8): "));
        if (hours < 1 || hours > 8) {
            IO.println("Vetëm 1 deri në 8 orë.");
        } else {
            var total = rate * hours;
            // 4. kodi i zbritjes: CACTTUS jep 10 %
            var typedCode = IO.readln("Kodi i zbritjes: ");
            var code = typedCode.trim().toUpperCase();
            if (code.equals("CACTTUS")) {
                total = total * 0.9;
            }
            // 5. totali dhe mesazhi
            System.out.printf("Për të paguar: %.2f €%n", total);
            var message = total > 20 ? "Merrni ujë me vete!" : "Udhëtim të mbarë!";
            IO.println(message);
        }
    }
}