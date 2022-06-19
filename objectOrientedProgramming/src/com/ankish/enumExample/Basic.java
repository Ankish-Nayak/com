package com.ankish.enumExample;

public class Basic{


    enum Week implements A{
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday;
        // these are enums constant
        // these are by default public, static, final
        // no child can be created.
        // type of Week;
        Week(){
            System.out.println("Constructor called for "+this.toString());
        }

        @Override
        public void hello() {
            System.out.println("hello, how are you?");
        }
    }
        // this is not public, protected, only private or default.
        // why ? we dont create new objects
        // this is not enum concepts, thats why
    public static void main(String[] args){
        Week week;
        week = Week.Monday;
        System.out.println(week);
        System.out.println(week.ordinal());
        week.hello();

    }
}
