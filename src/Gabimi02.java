// Gabimi 2. Bileta e muzeut.
// Duhet: nën 18 vjeç 2 €, nga 65 vjeç 3 €, të tjerët 5 €.
// Testi: me 70 duhet "Bileta: 3 €".
void main() {
    // 1. mosha
    var age = Integer.parseInt(IO.readln("Mosha: "));
    // 2. çmimi sipas moshës
    var price = 0;
    if (age >= 65) {
        price = 3;
    } else if (age >= 18 ) {
        price = 5;
    } else {
        price = 2;
    }
    // 3. bileta
    IO.println("Bileta: " + price + " €");
}
