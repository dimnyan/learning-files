
import java.util.Scanner;

public class Lesson05Exercise02
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        String strKaki, spasi=" ";
        int intTinggi, i = 0, ulangBawah, banyakBintang, j = 0, z = 0;

        System.out.printf("%nProgram membuat Segitiga sama sisi%n");
        System.out.printf("%nTinggi Segitiga (3 - 15): ");
        strKaki = scanner.nextLine();
        System.out.printf("%n");

        intTinggi = Integer.parseInt(strKaki);

        //i adalah banyak spasi
        //intkaki inputan

        if(intTinggi < 3||intTinggi > 15){
            System.out.printf("Kaki Segitiga harus antara (3 - 15)");
        } else {
            for(ulangBawah = 1; ulangBawah <= intTinggi; ulangBawah++){ //kebawah

                // spasi
                for(i = 1 + j; i <= intTinggi-1; i++){  // 1 < 3
                    System.out.printf("%s", spasi);
                }

                    // bintang             8                    <= 8           
                    for (banyakBintang = intTinggi *2 - z; banyakBintang <= intTinggi *2; banyakBintang++){ 
                        System.out.printf("*");
                    }
                j++;
                z += 2;
                System.out.printf("%n");
            }
        }
    }
}