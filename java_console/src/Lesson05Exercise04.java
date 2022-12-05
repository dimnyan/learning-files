import java.util.Scanner;
public class Lesson05Exercise04 {
  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input, strSisi, strKaki, spasi=" ";
        String buyAgain = null;
        int intTinggi, intKaki, i = 0, ulangBawah, banyakBintang, j = 0, z = 0, iBawah=0, jBawah = 0, zBawah =0;
        System.out.printf("%nProgram membuat Segitiga sama sisi%n");

        do
        {
            System.out.printf("%nArah kerucut Segitiga [U]Atas, [T]Bawah, [B]Atas Bawah: ");
            input = scanner.next();

            if (input.equalsIgnoreCase("u")){  // ATASSSSSSSSSSSSSS
                do
                {
                    System.out.printf("Tinggi Segitiga (3 - 15): ");
                    strKaki = scanner.next();
                    intTinggi = Integer.parseInt(strKaki);
                    System.out.printf("%n");

                    if(intTinggi < 3||intTinggi > 15){
                        System.out.printf("Tinggi Segitiga harus antara (3 - 15)");
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
                break;
                } while (intKaki < 3||intKaki > 15);
            }
            else if (input.equalsIgnoreCase("t")){  // bawahhhhhhhhhhhh
                do
                {
                    System.out.printf("Tinggi Kaki Segitiga (3 - 15): ");
                    strKaki = scanner.next();
                    intTinggi = Integer.parseInt(strKaki);
                    System.out.printf("%n");

                    if(intTinggi < 3||intTinggi > 15){
                        System.out.printf("Tinggi Segitiga harus antara (3 - 15)");
                    } else {
                        for(ulangBawah = 1; ulangBawah <= intTinggi; ulangBawah++){ // 1 <= 4
                            
                            //spasi
                            for (i = intTinggi * 2 - j; i < intTinggi * 2; i++){
                                System.out.printf("%s", spasi);  
                                
                            }

                            // bintang          
                            for(banyakBintang = z; banyakBintang < intTinggi * 2 - 1; banyakBintang++){
                                System.out.printf("*");  
                            }
                            j++;
                            z+=2;
                            System.out.printf("%n");
                        }
                    }
                break;
                } while (intKaki < 3||intKaki > 15);
            } else if (input.equalsIgnoreCase("b")){  //  ATASSSSSS BAWAHHHHHHHHHH
                do
                {
                    System.out.printf("Tinggi Kaki Segitiga (3 - 15): ");
                    strKaki = scanner.next();
                    intTinggi = Integer.parseInt(strKaki);
                    System.out.printf("%n");

                    if(intTinggi < 3||intTinggi > 15){
                        System.out.printf("Tinggi Segitiga harus antara (3 - 15)");
                    } else {
                        for(ulangBawah = 1; ulangBawah <= intTinggi; ulangBawah++){ //keatas

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
                        for(ulangBawah = 1; ulangBawah < intTinggi; ulangBawah++){ // yang ke bawah 1 <= 4 

                            //spasi
                            for (i = intTinggi * 2 - jBawah; i <= intTinggi * 2; i++){  
                                System.out.printf("%s", spasi);  
                            }

                            // bintang          
                            for(banyakBintang = zBawah - (intTinggi - 3); banyakBintang < intTinggi; banyakBintang++){
                                System.out.printf("*");  
                            }
                            jBawah++;
                            zBawah+=2;
                            System.out.printf("%n");
                        }



                    }
                break;
                } while (intKaki < 3||intKaki > 15);
            }else {
                continue;
            }
            break;
        } while (true);
        
    }
}