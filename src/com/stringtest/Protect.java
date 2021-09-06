package com.stringtest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Protect {
      /*
    获取一个字符串在另一个字符串中出现的次数。
      比如：获取“ab”在 “abkkcadkabkebfkaabkskab” 中出现的次数

     */

      public int count(String mainStrign,String substring){
          int mainLength = mainStrign.length();
          int subLength = substring.length();
          int count=0;
          int index=0;

          if(mainLength >= subLength){
              while ((index = mainStrign.indexOf(substring))!=-1){
                  count++;
                 mainStrign=mainStrign.substring(index+substring.length());
              }
              return count;
          }else {
              return 0;
          }
      }

      @Test
      public void getCount(){
          String mainString ="abkkcadkabkebfkaabkskab";
          String substring = "ab";
         int i = count(mainString,substring);
          System.out.println(i);
      }

      @Test
    public void testString(){
          /*String sub="1223raf";
          int i = sub.length();
          System.out.println(i);*/

//                  String[] str = new String[5];
//                  for (String myStr : str) {
//                      myStr = "atguigu";
//                      System.out.println(myStr);
//                  }
//                  for (int i = 0; i < str.length; i++) {
//                      System.out.println(str[i]);
//                  } }

}
    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//
    }
    private static void updateList(List list) {
        list.remove(2);

    }
}