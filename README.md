# -3-191-
**一.实验目的

1.掌握Java中抽象类和抽象方法的定义； 
2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
3.了解异常的使用方法，并在程序中根据输入情况做异常处理

**二.实验内容

某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
1.	设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
2.	设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
3.	编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。

**三.实验设计

按照要求，定义两个接口类student.teacher，定义Dr类实现接口方法，定义privite变量，用set方法获取对象，用toString方法拼接字符串，创建test测试类，先导入scanner包，定义静态变量r1，为税率，定义数组shu[],用for语句循环，键盘输入姓名性别年龄，用while(true)语句使语句无限循环，这样，如果用户输入格式错误，会在报错后允许用户重新输入对应数据，并在输入正确数据后执行break语句跳出循环，利用scanner类得nextline（）方法，等待用户填写并修改正在填写得信息直至按下回车，执行接下来的语句，利用try.catch方法处理异常，把可能出现错误得代码放在try{}中，一旦出现错误，就执行catch，利用跳转标记完成退出系统操作，利用switch语句完成选择查询信息或退出系统得功能。

**四.核心方法

这部分代码重写了接口方法，用于实现接口方法。
```
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

```
这部分代码通过while(true)语句实现无限循环，利用try.catch方法处理异常，循序用户输入错误，并再次输入信息，输入格式正确后，可通过执行break语句退出循环。
```
while(true){try {
                System.out.println("请输入年龄");
                Scanner age = new Scanner(System.in);
                shu[e].setAge(age.nextInt());
                break;
            } catch (Exception b) {
                System.out.println("请输入数字");


            }}
```
利用switch选择语句，完成选择业务查询或退出系统得功能
```
switch(s){
            case 1:
                System.out.println("本学期学费金额为："+shu[j].check_tuition());
                break;
            case 2:
                System.out.println("每月平均薪水（税后）："+((12 * shu[j].pay_salary() - ((12 * shu[j].pay_salary() - 2 * shu[j].check_tuition()) * r1 - 2520)) / 12));
                break;
            case 3:
                System.out.println("年应纳税所得额为:" + ((12 * shu[j].pay_salary() - 2 * shu[j].check_tuition()) * r1 - 2520));
                break;
            case 4:
                break a;
            default:
                System.out.println("请输入可选功能序号！！！");


        }
```
**五.实验结果



