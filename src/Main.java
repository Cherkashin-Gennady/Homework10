public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        {
            System.out.println("Ф. И. О. сотрудника — " + fullName);
        }
        // Task 2
        System.out.println("Задача 2");
        String fullNameTwo = "Ivanov Ivan Ivanovich";
        {
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —  " + fullNameTwo.toUpperCase());
        }
        // Task 3
        System.out.println("Задача 3");
        String fullNameThree = "Иванов Семён Семёнович";
        String s2 = fullNameThree.replace('ё', 'е');
        {
            System.out.println("Данные Ф. И. О. сотрудника — " + s2);
        }
    }
}