package pl.edu.pwsz.student.demo;

/**
 * Created by Student on 2017-05-30.
 */
public class Student {

    public int getYearsofBrith() {
        return yearsofBrith;
    }

    public void setYearsofBrith(int yearsofBrith) {
        this.yearsofBrith = yearsofBrith;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private int yearsofBrith;
    private String name;
    private String lastname;
}
