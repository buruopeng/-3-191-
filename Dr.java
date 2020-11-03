package 实验3;


public class Dr implements student,teacher{
    private String name;
    private String sex;
    private int age;
    private double Monthly_salary;
    private int everyterm_tuition;
    Dr(){
    }
    public void setName(String name) {this.name=name; }
    public void setSex(String sex){
        this.sex=sex;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setMonthly_salary(double Monthly_salary){
        this.Monthly_salary=Monthly_salary;
    }
    public void setEveryterm_tuition(int everyterm_tuition){
        this.everyterm_tuition=everyterm_tuition;
    }
    public void pay_tuition(){

    }
    public double pay_salary(){
        return Monthly_salary;
    }

    public double check_salary(){
        return Monthly_salary;
    }
    public double check_tuition() {
        return everyterm_tuition;
    }

    public String toString() {
        return "学生信息为:" + "姓名:" + name + ", 性别:" + sex + ", 年龄:" + age + ", 每月工资:" + Monthly_salary + ", 每学期学费:" + everyterm_tuition ;
    }
}






