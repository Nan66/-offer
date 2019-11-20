public class ReplaceSpace {
   public static String replaceSpace(StringBuffer str){
       for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==' ')
                str.replace(i,i+1,"%20");//左闭右开，相等的时候是插入，不是替换，很坑
        }
        return str.toString();
    }

    public String repalceSpace(StringBuffer str){
       StringBuffer stringBuffer = new StringBuffer();
       for(int i = 0;i<str.length();i++){
           char c = str.charAt(i);
           if(c==' ')
               stringBuffer.append("%20");
           else
               stringBuffer.append(c);
       }
       return stringBuffer.toString();
    }
   public static void main(String[] args){
       StringBuffer a = new StringBuffer("hello world");
       System.out.println(replaceSpace(a));

   }
}
