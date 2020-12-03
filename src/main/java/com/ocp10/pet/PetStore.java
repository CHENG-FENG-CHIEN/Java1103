package com.ocp10.pet;

import com.ocp10.pet.entity.Chihuahua;
import com.ocp10.pet.entity.EDog;
import com.ocp10.pet.entity.Pet;
import com.ocp10.pet.entity.Shiba;
import com.ocp10.pet.service.PetService;

public class PetStore {
    public static void main(String[] args) {
        PetService service = new PetService();
        Pet [] pets =service.getPets();
        service.print(pets);
        int totalPrice = service.allPrice(pets);
        int shibaprice = service.getPriceByShiba(pets);
        System.out.printf("Total Price: %,d\n",totalPrice);
        System.out.printf("Shiba total Price: %,d\n",shibaprice);
          //------------------------------------------------------------
        // 印出每一個寵物的總價
        System.out.println("印出每一個寵物的總價");
       service.printEachTotalPriceByPet(pets);
        //取得最高價的寵物
        System.out.println("取得最高價的寵物");
        service.printMaxPriceByPet(pets);
        
        
    }
}
