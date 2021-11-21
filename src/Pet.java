public class Pet {
    private int age;
    private boolean isRescue;
    private String name;

    public Pet(int age, boolean isRescue, String name) {
        this.age = age;
        this.isRescue = isRescue;
        this.name = name;


    }
    public int getAge() {
        return age;
    }

    public boolean isRescue() {
        return isRescue;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRescue(boolean rescue) {
        isRescue = rescue;
    }

    public void setName(String name) {
        this.name = name;
    }
}
