/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class P1 {
    public static void main(String[] args) {

        int num = 1;
        int count = 0;

        while (count < 100) {
            boolean check = false;
            num++;
            for(int i = 2; i <= num/2; ++i) {
                if(num % i == 0) {
                    check = true;
                    break;
                }
            }            
            if (!check)
            {
                int reInt = 0, tmp, oriInt,tmp2;
                oriInt = num;
                tmp2 = num;
                while( tmp2 != 0 )
                {
                    tmp = tmp2 % 10;
                    reInt = reInt * 10 + tmp;
                    tmp2  /= 10;
                }
                if (oriInt == reInt)
                {
                    System.out.print(oriInt + " ");
                    count++;
                    if(count%10==0)
                    {
                        System.out.println("");
                    }
                }       
            }
            
        }
    }
}
