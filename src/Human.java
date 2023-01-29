public final class Human {
    private final String name;
    private final int age;
    private final String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void SayHi() {
        System.out.printf("Меня зовут %s, мне %d лет, я %s", this.name, this.age, this.gender);
    }
}
