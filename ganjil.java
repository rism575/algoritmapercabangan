public class ganjil {
    public static void main(String[] args) throws Exception {
        /* menghitung bilangan ganjil/genap */
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = inputan.nextInt();

        if (angka % 2 == 0 ) {
            System.out.println("Bilangn genap");
        } else {
            System.out.println("Bilangn ganjil");

            inputan.close();
        }
    }
}
