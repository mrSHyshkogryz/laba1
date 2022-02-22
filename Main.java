package ua.lviv.iot;

public class Main {
    public static void print (String s, Bank... args){
        System.out.println();
        for (Bank arg: args){
            System.out.print(arg.toString());
        }
    }
    public static void main (String [] args) {
        Bank b=new Bank();
        print("\n", b);
    }
}
