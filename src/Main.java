public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — "+fullName);

        System.out.println();

        System.out.println("Задача 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperFullName);
        //  Вывел имя для отчета в отдельную переменную, хотя мог этого не делать. Просто я смотрю на эту задачу с той стороны, что
        // я в любом случае захочу хранить данные для заполнения отчетов отдельно, где-нибудь в разделе данных бухгалтеров... Все время
        // держу в голове, что код может и будет изменяться.

        System.out.println();

        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);

    }
}