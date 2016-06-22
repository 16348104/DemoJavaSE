/**
 * Created by mingfei.net@gmail.com
 * 2016/6/22 15:14
 */
// 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
public class E5 {
    public static void main(String[] args) {
        int score = 95;
        System.out.println((score >= 90) ? 'A' : (score >= 60) ? 'B' : 'C');
    }
}
