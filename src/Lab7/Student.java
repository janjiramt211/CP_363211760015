package Lab7;

public class Student {
    //attributes
    private String name;
    private String sid;
    private String s_level;
    private int age;
    //consttrutor

    public Student(String name, String sid, String s_level, int age) {
        this.name = name;
        this.sid = sid;
        this.s_level = s_level;
        this.age = age;
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public String getSid() {
        return sid;
    }

    public String getS_level() {
        return s_level;
    }

    public int getAge() {
        return age;
    }

    //toString



}
