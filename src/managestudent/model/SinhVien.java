package managestudent.model;

public class SinhVien {
    public  String name;
    public Integer age;
    public Integer Mark;

    public SinhVien(String name, Integer age, Integer mark) {
        this.name = name;
        this.age = age;
        Mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMark() {
        return Mark;
    }

    public void setMark(Integer mark) {
        Mark = mark;
    }
}
