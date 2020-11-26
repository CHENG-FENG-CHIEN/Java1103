package com.ocp8;

public class Main3 {
    public static void main(String[] args) {
        int n =2;
        Class[] classes ={Car.class,Bicycle.class,Airplane.class};
        int [] nn ={2,5,3};
        RentalCompany rc = new RentalCompany();
        for(Class clazz: classes){
            boolean success = rc.rentTransportation(clazz, n);            
            System.out.printf("租 %s  %s台\n",
                    clazz.getSimpleName(),n, success ?"成功":"失敗");
        
        }
        //rc.rentTransportation(Car.class, 2);
        //rc.rentTransportation(Bicycle.class, 3);
        //rc.rentTransportation(Airplane.class, 2);
        rc.print();
    }
}
