
import java.util.Scanner;

public class Lesson05Exercise01
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        String strKaki, spasi=" ";
        int intKaki, i = 0, ulangBawah, banyakBintang, j = 0;

        System.out.printf("%nProgram membuat Segitiga sama kaki siku-siku%n");
        System.out.printf("%nPanjang Kaki Segitiga (3 - 15): ");
        strKaki = scanner.nextLine();
        System.out.printf("%n");

        intKaki = Integer.parseInt(strKaki);

        //i adalah banyak spasi
        //intkaki inputan

        if(intKaki < 3||intKaki > 15){
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
    }
}