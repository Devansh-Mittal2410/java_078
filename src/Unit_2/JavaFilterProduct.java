package Unit_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JavaFilterProduct {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"HP1",25000));
        productList.add(new Product(2,"HP2",26000));
        productList.add(new Product(3,"HP3",27000));
        productList.add(new Product(4,"HP4",28000));
        productList.add(new Product(5,"HP5",29000));
        productList.add(new Product(6,"HP6",30000));
        productList.add(new Product(7,"HP7",31000));
        productList.add(new Product(8,"HP8",32000));
        productList.add(new Product(9,"HP9",33000));
        List<Double> newList = productList.stream().
                filter(p-> p.price>30000).
                map(p-> p.price).
                collect(Collectors.toList());
        ww
    }
}
