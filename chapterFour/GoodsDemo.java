package chapterFour;

import java.util.Scanner;

public class GoodsDemo {
    public static void main(String[] args) {
        Goods[] goodsArray;
        goodsArray = new Goods[3]; // Goods objects 세 개 가진 array
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < goodsArray.length; i++) {
            String name = s.next();
            int price = s.nextInt();
            int n = s.nextInt();
            int sold = s.nextInt();
            goodsArray[i] = new Goods(name, price, n, sold);
        }
        for (int i = 0; i < goodsArray.length; i++) {
            System.out.print(goodsArray[i].getName() + " ");
            System.out.print(goodsArray[i].getPrice() + " ");
            System.out.print(goodsArray[i].getNumberOfStock() + " ");
            System.out.print(goodsArray[i].getSold() + ' ');
        }
        s.close();
    }

}
