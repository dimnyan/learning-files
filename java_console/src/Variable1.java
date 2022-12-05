import java.util.Locale;

public class Variable1
{
	public static void main(String[] args)
	{
		float hargaMotor = 22000000;
		double hargaRumah = 1500000000;
		
		System.out.printf("harga motor: Rp %f %n", hargaMotor);
		System.out.printf("harga rumah: Rp %f %n", hargaRumah);
		System.out.printf("%n");
		System.out.printf("harga motor: Rp %,f %n", hargaMotor);
		System.out.printf("harga rumah: Rp %,f %n", hargaRumah);
		System.out.printf("%n");
		System.out.printf(new Locale("in", "ID"), "harga motor: Rp %f %n", hargaMotor);
		System.out.printf(new Locale("in", "ID"), "harga rumah: Rp %f %n", hargaRumah);
		System.out.printf("%n");
		System.out.printf(new Locale("in", "ID"), "harga motor: Rp %,15.0f %n", hargaMotor);
		System.out.printf(new Locale("in", "ID"), "harga rumah: Rp %,15.0f %n", hargaRumah);
		System.out.printf("%n");
		System.out.printf(new Locale("in", "ID"), "harga motor: Rp %,15.1f %n", hargaMotor);
		System.out.printf(new Locale("in", "ID"), "harga rumah: Rp %,15.1f %n", hargaRumah);
	}
}