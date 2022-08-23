package lab_1.Expressions;
public class Expressions_5 {
    public static void main(String[] args) throws Exception {
       double second_num, sub_2;
       int  hours, minutes,seconds,milliseconds,sub;
        
        second_num = 3665.1234;

        hours   = (int)second_num/3600;
        minutes = (int)(second_num-hours*3600)/60;
        seconds = (int)second_num-(hours*3600)-(minutes*60);
        
        sub = ((int)second_num);
        sub_2 = (second_num-sub)*1000;
        milliseconds= (int)sub_2;
        System.out.println(sub_2);
        
        System.out.println(hours+":"+minutes+":"+seconds+":"+milliseconds);

    }
}
