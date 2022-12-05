import java.util.Scanner;
public class Lesson05Exercise03 {
  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input, strSisi, strKaki, spasi=" ";
        String buyAgain = null;
        int intKaki, i = 0, ulangBawah, banyakBintang, j = 0, z = 0;
        System.out.printf("%nProgram membuat Segitiga sama kaki siku-siku%n");

        do
        {
            System.out.printf("%nSisi tegak rata [L]Kiri, [R]Kanan: ");
            input = scanner.next();
            if (input.equals("R")){  // RRRRRRRRRRRRRRRRRR
                do
                {
                    System.out.printf("Panjang Kaki Segitiga (3 - 15): ");
                    strKaki = scanner.next();
                    intKaki = Integer.parseInt(strKaki);

                    if (intKaki < 3||intKaki > 15) {
                        System.out.printf("Kaki Segitiga harus antara (3 - 15)");
                    } else {
                        for(ulangBawah=1; ulangBawah <= intKaki; ulangBawah++){ //kebawah

                        // spasi
                        for(i = 1 + j; i <= intKaki-1; i++){  // 1 < 3
                            System.out.printf("%s", spasi);
                        }

                        //bintang   4                             4 <= 4           
                        for (banyakBintang = intKaki - j; banyakBintang <= intKaki; banyakBintang++){ 
                            System.out.printf("*");
                        }
                    j++;
                    System.out.printf("%n");
                    }
                }
                break;
                } while (intKaki < 3||intKaki > 15);
            }
            else if (input.equals("L")){ // untuk L atau kiri
                do
                {
                    System.out.printf("Panjang Kaki Segitiga (3 - 15): ");
                    strKaki = scanner.next();
                    intKaki = Integer.parseInt(strKaki);

                    if (intKaki < 3||intKaki > 15) {
                        System.out.printf("Kaki Segitiga harus antara (3 - 15)");
                    } else {
                        for(ulangBawah = 1; ulangBawah <= intKaki; ulangBawah++){ //kebawah

                            //bintang   4                             4 <= 4           
                            for (banyakBintang = intKaki - j; banyakBintang <= intKaki; banyakBintang++){ 
                                System.out.printf("*");
                            }
                            // spasi
                            for(i = 1 + j; i <= intKaki-1; i++){  // 1 < 3
                                System.out.printf("%s", spasi);
                            }

                        j++;
                        System.out.printf("%n");
                    }
                }
                break;
                } while (intKaki < 3||intKaki > 15);
            } else {
                continue;
            }
            break;
        } while (true);
        
    }
}