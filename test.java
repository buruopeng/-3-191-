package 实验3;
import java.util.Scanner;

public class test {
    static double r1=0.1;
    public static void main(String a[]) {
        Dr shu[] = new Dr[2];
        for (int e = 0; e < 2; e++) {
            shu[e] = new Dr();

            System.out.println("请输入名字：");
            Scanner name = new Scanner(System.in);
            shu[e].setName(name.nextLine());
            System.out.println("请输入性别：");
            Scanner sex = new Scanner(System.in);
            shu[e].setSex(sex.nextLine());
            while(true){try {
                System.out.println("请输入年龄");
                Scanner age = new Scanner(System.in);
                shu[e].setAge(age.nextInt());
                break;
            } catch (Exception b) {
                System.out.println("请输入数字");


            }}
            while(true){
                try {
                    System.out.println("请输入每学期学费");
                    Scanner everyterm_tuition = new Scanner(System.in);
                    shu[e].setEveryterm_tuition(everyterm_tuition.nextInt());
                    break;
                } catch (Exception b) {
                    System.out.println("请输入数字");


                }

            }

            System.out.println("请输入每月工资");
            Scanner Monthly_salary= new Scanner(System.in);
            shu[e].setMonthly_salary(Monthly_salary.nextDouble());
            System.out.println(shu[e]);

        }
for(int j=0;j<2;j++){
    System.out.println(shu[j]);
    a:
    while (true){
        System.out.println("请输入编号查询你需要的信息，1:查询每学期学费,2:查询每月工资,3:个人所得税,4:退出系统");
        Scanner sh = new Scanner(System.in);
        int s=sh.nextInt();

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

}
}
System.out.println("查询业务结束");
    }
}