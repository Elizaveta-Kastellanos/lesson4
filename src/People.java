public class People implements Comparable<People>{

    // Написать программу позволяющую ввести разнотипные данные пользователей,
    // такие как ФИО, возраст, пол итд. Хранение данных организовать в списках.
    // После ввода программа сортирует пользователей по возрасту и выводит отсортированный список на экран.
    // Работа программы рассмотрена на семинаре, если возникнут вопросы пишите, отвечу!)

    private String firstname;
    private String lastname;
    private int age;
    private String patronymic;
    private Genders gender;

    public People(String firstname, String lastname, String patronymic, int age, Genders gender){
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public Genders getGender() {
        return gender;
    }

    @Override
    public String toString()
    {
        return new StringBuilder(firstname+ " " + lastname + " " + patronymic + " " + age + " " + gender).toString();
    }

    @Override
    public int compareTo(People o) {
        return this.age - o.getAge();
    }
}
