package Unit_3.Collection.ArrayList;

import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        System.out.print("Enter the number of products : ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            products.add(sc.next());
        }
        Collections.sort(products);
//        Iterator i = products.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//        products.add(1,"AGD");
//        products.addLast("fcf");
//        products.addFirst("dfggg");
        Iterator it = products.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        System.out.println(products.get(1));
    }
}
