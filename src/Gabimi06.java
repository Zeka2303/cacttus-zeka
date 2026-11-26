// Gabimi 6. Parkingu.
// Duhet: 0.80 € për çdo orë, edhe për gjysmë ore.
// Testi: me 2.5 orë duhet "Për të paguar: 2.0 €".
void main() {
    // 1. sa orë
    double hours = Double.parseDouble(IO.readln("Sa orë? "));
    // 2. çmimi
    double total = hours * 0.80;
    // 3. printimi
    IO.println("Për të paguar: " + total + " €");
}
