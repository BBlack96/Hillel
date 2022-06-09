public class Dog {

    private String name;
    private String color;
    private int age;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Dog(String name, String color, int age, int height) {
        this.name = name;
        this.color = color;
        this.age = agevalidate(age);
        this.height = heightvalidate(height);
    }

    private int agevalidate(int age) {
        if ((age >= 0) && (age <= 20)) {
            return age;
        }
        return 1;
    }

    private int heightvalidate(int height) {
        if ((height >= 14) && (height <= 120)) {
            return height;
        }
        return 15;
    }
    //Значения для проверок взяты приблизительно, мин/макс age и height


    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.height = height;

    }

    public Dog() {
        System.out.println("\nCreating object of the class Dog.\n");
    }

}


