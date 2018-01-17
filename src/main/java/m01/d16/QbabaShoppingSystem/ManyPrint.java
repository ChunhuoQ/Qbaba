/**
 * Project Name:shoppingSystem
 * File Name:ManyPrint.java
 * Package Name:shoppingSystem
 * Date:2018��1��5������1:54:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d16.QbabaShoppingSystem;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description: <br/>
 * Date: 2018��1��5�� ����1:54:12 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class ManyPrint {

    private final String VIP = "������Ա";

    private String PET = "Qbaba.";

    private final String USER = "Administrator";

    private String PASSWORD = "123456";

    public String moneyPassword = "123456";

    public double money = 49;

    public double money1 = 3749;

    public double money2 = 9.9;

    public void nowDate() {

        SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/ddEEEE\tHH:mm");

        long cur = System.currentTimeMillis();

        Date date = new Date(cur);
        String nowDate = SDF.format(date);
        System.out.println( nowDate);
    }

    /**
     * pASSWORD
     *
     * @param pASSWORD the pASSWORD to set
     */
    public void setPASSWORD(String pASSWORD) {
        PASSWORD = pASSWORD;
    }

    /**
     * pET.
     *
     * @return the pET
     */
    public String getPET() {
        return PET;
    }

    /**
     * pET
     *
     * @param pET the pET to set
     */
    public void setPET(String pET) {
        PET = pET;
    }

    /**
     * uSER.
     *
     * @return the uSER
     */
    public String getUSER() {
        return USER;
    }

    /**
     * pASSWORD.
     *
     * @return the pASSWORD
     */
    public String getPASSWORD() {
        return PASSWORD;
    }

    public void cleanConsole() throws AWTException {

        Robot r = new Robot();
        r.mousePress(InputEvent.BUTTON3_MASK);
        r.mouseRelease(InputEvent.BUTTON3_MASK);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.delay(100);
    }

    public void loginOut() {

        System.out.println("-----------��ӭ����Qbaba��¼ϵ�y-----------");
        nowDate();
        System.out.println("Nav.:" + "\t��\t¼\t��\t��");
        System.out.println("------------ 1.��¼---------------");
        System.out.println("-------------0.�˳�---------------");
        
        System.out.println("----------��ӭ����Qbabaϵ�y----------");
        
        System.out.print("�������ѡ��");

    }

    public void print() {
        System.out.println("----------��ӭ���RQbaba����---------");
    }

    public void functionOut() {

        print();
        nowDate();
        System.out.println("Nav.:" + "\t��\t��\t��\t��");
        System.out.println("----------1.���ص�¼ҳ��-------------");
        System.out.println("----------2.�ͻ���Ϣ����------------");
        System.out.println("----------3.-�������--------------");
        System.out.println("----------4.--���ﳵ--------------");
        System.out.println("----------5.--ע��----------------");
        System.out.println("----------0.--�˳�----------------");
        
        print();
        
        selectOut();
    }

    public void selectOut() {
        System.out.print("�������ѡ��");
    }

    public void userInfoOut() {
        print();
        nowDate();
        System.out.println("Nav.:" + "\t��\t��\t��\t��");
        System.out.println("---�û���(user):----" + USER + "----");
        System.out.println("---�ǳ�:--------------" + PET + "--------");
        System.out.println("---��Ա�ȼ�---------[[" + VIP + "]]----");
        System.out.println("---�� �� ǩ ��:����ÿ���˶����㣬�������ͨ��ʲô��");
        System.out.println("\t\t|");
        System.out.println("\t\t|");
        System.out.println("----------1.-�޸��ǳ�---------");
        System.out.println("----------2.-������һ��---------");
        System.out.println("----------3.-�޸�����----------");
        System.out.println("----------4.-ע��-------------");
        System.out.println("----------0.-�˳�-------------");
        
        selectOut();

    }

    public void PayOut() {
        print();
        nowDate();
        System.out.println("Nav.:" + "\t��\t��\t��");
        System.out.println("---��������רӪ�꡵��");
        System.out.println("----------�Ǳ�����˫��15.6�ʴ������");
        System.out.println("----------˫����ʺ��������ƻ��˶");
        System.out.println("----------------�����(USB�ɳ��)");
        System.out.println("----------------��" + money + "(ԭ�ۡ�149)");
        System.out.println("\t\t|");
        System.out.println("\t\t|");
        System.out.println("----------1.-����-------------");
        System.out.println("----------2.-������-----------");
        System.out.println("----------3.-������һ��----------");
        System.out.println("----------4.-ע��--------------");
        System.out.println("----------0.-�˳�--------------");
        

    }

    public void PayOut1() {
        print();
        nowDate();
        System.out.println("Nav.:" + "\t��\t��\t��");
        System.out.println("---��������רӪ�꡵��");
        System.out.println("----------�Ǳ�����˫��15.6�ʴ������");
        System.out.println("----------˫����ʺ��������ƻ��˶");
        System.out.println("----------------�����(USB�ɳ��)");
        System.out.println("----------------��" + money + "(ԭ�ۡ�149)");
        System.out.println("---------------->>>>>>>����X2");
        System.out.println("\t\t|");
        System.out.println("\t\t|");
        System.out.println("----------1.-����-------------");
        System.out.println("----------2.-������-----------");
        System.out.println("----------3.-������һ��----------");
        System.out.println("----------4.-ע��--------------");
        System.out.println("----------0.-�˳�--------------");
        

    }

    public void PayOut2() {
        print();
        nowDate();
        System.out.println("Nav.:" + "\t��\t��\t��");
        System.out.println("---��������רӪ�꡵��");
        System.out.println("----------�Ǳ�����˫��15.6�ʴ������");
        System.out.println("----------˫����ʺ��������ƻ��˶");
        System.out.println("----------------�����(USB�ɳ��)");
        System.out.println("----------------��" + money + "(ԭ�ۡ�149)");
        System.out.println("---------------->>>>>>>����X1");
        System.out.println();
        System.out.println("----------�Ǳ�����Lenovo����Y430P��Ϸ��");
        System.out.println("-----------8G�ڴ桢120��̬��gtx750Ti");
        System.out.println("----------------19��(�������������Ϸ)");
        System.out.println("--------������---��" + money1 + "(ԭ�ۡ�5269)����");
        System.out.println("---------------->>>>>>>����X1");

        System.out.println("\t\t|");
        System.out.println("\t\t|");
        System.out.println("----------1.-����-------------");
        System.out.println("----------2.-������-----------");
        System.out.println("----------3.-������һ��----------");
        System.out.println("----------4.-ע��--------------");
        System.out.println("----------0.-�˳�--------------");
        
    }

    public void PayOut3() {
        print();
        nowDate();
        System.out.println("Nav.:" + "\t��\t��\t��");
        System.out.println("---��������רӪ�꡵��");
        System.out.println("----------�Ǳ�����˫��15.6�ʴ������");
        System.out.println("----------˫����ʺ��������ƻ��˶");
        System.out.println("----------------�����(USB�ɳ��)");
        System.out.println("----------------��" + money + "(ԭ�ۡ�149)");
        System.out.println("---------------->>>>>>>����X1");
        System.out.println();
        System.out.println("-��è����-----Cadeve���USB�ӿڱ�Я���");
        System.out.println("-----------��������칫�ʼǱ�̨ʽ�ʼǱ����");
        System.out.println("--------------��ɫ-�����-(������)");
        System.out.println("---------�----��" + money2 + "(ԭ�ۡ�39)");
        System.out.println("---------------->>>>>>>����X1");

        System.out.println("\t\t|");
        System.out.println("\t\t|");
        System.out.println("----------1.-����-------------");
        System.out.println("----------2.-������-----------");
        System.out.println("----------3.-������һ��----------");
        System.out.println("----------4.-ע��--------------");
        System.out.println("----------0.-�˳�--------------");

        
    }

    public void shoppingList() {
        print();
        
        nowDate();
        System.out.println("Nav.:" + "\t��\t��\t��\t��");
        System.out.println("---��������רӪ�꡵��");
        System.out.println("HOT.1-----�Ǳ�����˫��15.6�������");
        System.out.println("----------˫����ʺ��������ƻ��˶");
        System.out.println("----------------�����(USB�ɳ��)");
        System.out.println("--------������---��" + money + "(ԭ�ۡ�149)����");
        System.out.println();
        System.out.println("HOT.2��-----�Ǳ�����Lenovo����Y430P��Ϸ��");
        System.out.println("-----------8G�ڴ桢120��̬��gtx750Ti");
        System.out.println("----------------19��(�������������Ϸ)");
        System.out.println("--------������---��" + money1 + "(ԭ�ۡ�5269)����");
        System.out.println();
        System.out.println("-��è����-----Cadeve���USB�ӿڱ�Я���");
        System.out.println("-----------��������칫�ʼǱ�̨ʽ�ʼǱ����");
        System.out.println("--------------��ɫ-�����-(������)");
        System.out.println("---------�----��" + money2 + "(ԭ�ۡ�39)");

        

    }

    public void last() {
        
        System.out.println("----------��ӭ�´ι��RQbaba����---------");
        
        nowDate();
        System.out.println("---------------�˳��ɹ���----------");
        System.out.println("----------��ӭ�´ι��RQbaba����---------");
     
    }
}
