import java.util.Locale;

public class Lesson02Exercise
{
	public static void main(String args[])
	{
		String name = "Keanu Reeves";
		String gender = "Laki-laki";
		int age = 57;
		double height = 1.86;
		
		System.out.printf("Info Aktor%n");
		System.out.printf("Nama          : %s%n", name);
		System.out.printf("Jenis Kelamin : %s%n", gender);
		System.out.printf("Umur          : %d tahun%n", age);
		System.out.printf("Tinggi Badan  : %f cm%n", height);
		
		System.out.printf("%nNama saya %s, jenis kelamin %s, umur %d tahun, tinggi badan %f cm%n", name, gender, age, height);
		
		System.out.printf("%nNama          : %s%n", name);
		System.out.printf("Jenis Kelamin : %s%n", gender);
		System.out.printf("Umur          : %d tahun%n", age);
		System.out.printf(new Locale("in","ID"),"Tinggi Badan  : %,3.2f cm%n", height);
	}
}