/**
 * Project Name:Qbaba
 * File Name:GuessNumber.java
 * Package Name:m01.d16.Qbaba
 * Date:2018年1月16日下午3:58:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.Qbaba;

/**
 * Description:   <br/>
 * Date:     2018年1月16日 下午3:58:18 <br/>
 * @author   Qbaba
 * @version
 * @see
 */
public class GuessNumber {

    private int RandomNum=100;
 
    /**
     * randomNum.
     *
     * @return  the randomNum
     */
    public GuessNumber(int ScannerNum) {
        if(ScannerNum==RandomNum){
        System.out.println("胜利~恭喜你猜对了!\n游戏结束！");
        
        }
        else if(ScannerNum<RandomNum){
            System.out.println("再往大了猜：");
            new GuessNumberTest();
        }
        else{
            System.out.println("再往小了猜：");
            new GuessNumberTest();
        }
        
       
    }
   
    
    
    
    
    
}

