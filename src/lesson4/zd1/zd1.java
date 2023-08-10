package lesson4.zd1;

public class zd1 {
        public static void main(String[] args) {
            for(int i = 0; i < 5; i++){
                int x = (int)((float)Math.random()*10);
                System.out.print(x + " ");
                System.out.println(Math.pow(x,2));
            }
}}
