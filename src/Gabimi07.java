// Gabimi 7. Zbritja në shitore.
// Duhet: nga 50 € e lart, 10 % zbritje.
// Testi: me 30 duhet "Për të paguar: 30.0 €".
void main() {
    // 1. totali
    var total = Double.parseDouble(IO.readln("Totali (€): "));
    // 2. zbritja, vetëm nga 50 €
    if (total >= 50)
        IO.println("Merrni 10 % zbritje!");
        total = total * 0.9;
    // 3. printimi
    IO.println("Për të paguar: " + total + " €");
}
