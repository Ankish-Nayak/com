package com.ankish.exceptionHandling;
// Exceptions handling is used to terminate problem by handling the exceptions' that
// could occur.

public class Main{
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        // more restrict exceptions are required to be at first
        // cuz less restrictive exceptions would not allow later ones to execute.
        try {
//            divide(a,b);
            // mimicking an exception
//            throw new Exception("just for fun.");
            String name = "ankish";
            if(name.equals("ankish")){
                throw new Exception("name is ankish");
            }
        } catch(MyException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This will always execute.");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b == 0){
             throw new ArithmeticException("please do not divide by 0.");
        }
        return a/b;
    }
}