/**
 * Project Name:Qbaba
 * File Name:PrintlnDome.java
 * Package Name:m01.d06.Qbaba
 * Date:2018年1月6日下午6:45:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package m01.d06.Qbaba;

import java.io.File;

/**
 * Description: <br/>
 * Date: 2018年1月6日 下午6:45:50 <br/>
 * 
 * @author Qbaba
 * @version
 * @see
 */
public class PrintlnDome {

    public static void listAll(File dir) {
        System.out.println("-" + dir.getAbsolutePath());
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                System.out.print("\n\t");
                listAll(files[i]);
            } else {
                System.out.println("\n\t" + "    -" + files[i].getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {

        PrintlnDome rd = new PrintlnDome();

        File dir = new File("E:\\workspace\\lession");

        String dirPath = "E:\\workspace\\lession";

        listAll(dir);
        rd.printDir(dirPath);// 逐级分别进入，没做出来；

        /*
         * String path="E:\\workspace\\lession\\src";
         * path="E:\\workspace\\lession\\src\\lession\\VIP.java";
         * 
         * File file=new File(path); String[] files=file.list(); String
         * path2="E:\\workspace\\lession\\src\\lession"; File file2=new
         * File(path2); String[] files2=file2.list(); for(String string :
         * files){ LOG.info("当前目录文件夹："+string); for(String string2:files2){
         * LOG.info("子目录的文件夹："+string2); }
         * 
         * }
         */

    }

    public String createPrintStr(String name, int level) {

        String printStr = "";
        for (int i = 0; i < level; i++) {
            printStr = printStr + "";
        }
        printStr = printStr + "-" + name;

        return printStr;
    }

    public void printDir(String dirPATH) {
        String[] dirNameList = dirPATH.split("\\\\");
        for (int i = 0; i < dirNameList.length; i++) {
            System.out.println(createPrintStr(dirNameList[i], i));
        }
    }

    /*
     * public void readFile(File dirPATH1){ File file=new File(dirPATH1); File[]
     * list=file.listFiles(); for(int i =1;i<list.length;i++){
     * if(list.isDirectory()){
     * System.out.println(createPrintStr(list.getPath(),fileLevel));
     * fileLevel++; readFile(list.getPath()); fileLevel --;
     * 
     * 
     * } else { System.out.println(createPrintStr(listAll(list[i]),fileLevel));
     * } } }
     */

}
