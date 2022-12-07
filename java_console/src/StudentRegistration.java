import java.util.Scanner;

public class StudentRegistration
{
    School school = new School();
    Classroom classroom = new Classroom();
    Student[] students;
    int numberOfStudent, i;


    public StudentRegistration()
    {
        System.out.printf("StudentRegistration constructor invoke...%n");
    }

    public void readData()
    {
        Scanner scanner = new Scanner(System.in);
        Student student;
        
        String inputData;

        // SCHOOL INFO

        System.out.printf("Program mengelola data Pelajar%n%nInformasi Sekolah%nNama: ");
        inputData = scanner.nextLine();
        school.setName(inputData);
        
        System.out.printf("Alamat: ");
        inputData = scanner.nextLine();
        school.setAddress(inputData);

        //CLASSROOM

        System.out.printf("%nInformasi Kelas%nTingkat (SD / SMP / SMA): ");
        inputData = scanner.nextLine();
        classroom.setLevel(inputData);

        System.out.printf("Nama: ");
        inputData = scanner.nextLine();
        classroom.setName(inputData);

        System.out.printf("Jumlah Pelajar: ");
        inputData = scanner.nextLine();
        numberOfStudent = Integer.parseInt(inputData);

        students = new Student[numberOfStudent];

        student = new Student();

        //REPEATING INFOS

        for(i = 0; i < numberOfStudent; i++)
        {
            
            System.out.printf("%nPelajar ke-%d%n", i + 1);

            System.out.printf("NISN: ");
            inputData = scanner.nextLine();
            student.setNisn(inputData);

            System.out.printf("Nama: ");
            inputData = scanner.nextLine();
            student.setName(inputData);

            System.out.printf("Jenis Kelamin (Laki-laki / Perempuan): ");
            inputData = scanner.nextLine();
            student.setGender(inputData);

            System.out.printf("Alamat: ");
            inputData = scanner.nextLine();
            student.setAddress(inputData);

            students[i] = student;
        }


    }

    public void sortingData()
    {
        System.out.printf("%nsorting data...%n");
    }

    public void showData()
    {
        Student student;

        System.out.printf("%nInformasi Sekolah%nNama: %s%nAlamat: %s", school.getName(), school.getAddress());
        System.out.printf("%nInformasi Kelas%nTingkat: %s%nNama: %s", classroom.getLevel(), classroom.getName());
        System.out.printf("%n%-3s %-10s %-10s %-11s %-10s", "No", "NISN", "Nama", "Jenis Kelamin", "Alamat");
        System.out.printf("%n===============================================================");

        for(i = 0; i < numberOfStudent; i++)
        {
            student = students[i];
            System.out.printf("%n%-3d %-10s %-10s %-13s %-10s%n ", i+1, student.getNisn(), student.getName(), student.getGender(), student.getAddress());
            // System.out.printf("%n%3d %-7s %-10s %-10s %-10%n ", i+1, student[i]);
        }
        System.out.printf("%n===============================================================");
    }


}