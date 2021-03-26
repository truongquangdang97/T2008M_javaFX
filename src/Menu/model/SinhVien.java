package Menu.model;

public class SinhVien {
    public String Name;
    public Integer Age;
    public Integer Mark;

    public SinhVien(String name, Integer age, Integer mark) {
        Name = name;
        Age = age;
        Mark = mark;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getMark() {
        return Mark;
    }

    public void setMark(Integer mark) {
        Mark = mark;
    }
}
