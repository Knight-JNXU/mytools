package code.zero;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/10/26.
 * 把一串输入的数值两个两个分开
 *
 * input demo:
 * -5359 1226 -4201 -4397 -2751 -6295 9505 -497 6381 -9575
 */
public class InputSplitByTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String intputStr = sc.nextLine();
        String strs[] = intputStr.split(" ");
        System.out.println("length:" + strs.length);
        for(int i=0; i<strs.length; i+=2){
            System.out.println(strs[i]+" "+strs[i+1]);
        }
    }
}
