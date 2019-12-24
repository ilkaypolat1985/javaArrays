public class Main {

    public static void main(String[] args) {
        String student1 = "Simge";
        String student2 = "Fatma";
        String student3 = "Derin";
		String student4 = "Ahmet";

		System.out.println("########################");
		System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
		System.out.println(student4);

		String[] students = new String[4];
		students[0] = "Simge";
		students[1] = "Fatma";
		students[2] = "Derin";
		students[3] = "Ahmet";

		System.out.println("\n########################");
		for(String student : students){
			System.out.println(student);
		}
	}
}
