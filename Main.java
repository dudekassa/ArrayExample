class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //wiek Martyny
    int age = 15;

    //tworzenie regału
    int[] ageArray = new int[6];
    String[] nameArray = new String[6];

    //Mikołaj wiek
    ageArray[0] = 15;
    nameArray[0] = "Mikołaj";

    //Marysia i Julia wiek
    ageArray[1] = 14;
    nameArray[1] = "Julia i Marysia";

    //Michał wiek
    ageArray[2] = 15;
    nameArray[2] = "Michał";

    //Martyna dodała wiek
    ageArray[3] = age;
    nameArray[3] = "Martyna";

    //Przemek wiek
    ageArray[4] = 35;
    nameArray[4] = "Przemek";

    //Wiktoria i Patrycja [5]
    ageArray[5] = 15;
    nameArray[5] = "Wiktoria i Patrycja";

    System.out.println("Pętla: ");

    for (int i = 0; i < 6; i++ ) {
      System.out.println("Wartość i: " + i + ", wiek: " + ageArray[i]  + ", imię: " + nameArray[i]);
    }

    System.out.println("Koniec pętli: ");

  }
}