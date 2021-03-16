class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //wiek Martyny
    int age = 15;

    //tworzenie regału
    int[] ageArray = new int[5];

    //Mikołaj wiek
    ageArray[0] = 15;

       //Michał wiek
    ageArray[2] = 15;

    //Marysia i Julia wiek
    ageArray[1] = 14;

    //Martyna dodała wiek
    ageArray[3] = age;

    //Przemek wiek
    ageArray[4] = 35;

    System.out.println("Wiek Przemek: " + ageArray[4]);

    System.out.println("Wiek Julki: " + ageArray[1]);

    System.out.println("Wiek Martyny: "+ ageArray[3]);

    System.out.println("Wiek Michała: "+ ageArray[2]);

    System.out.println("Wiek Mikołaja: "+ ageArray[0]);

  }
}