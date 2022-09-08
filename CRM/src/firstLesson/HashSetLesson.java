package firstLesson;

import java.util.*;

public class HashSetLesson {
    public static void main(String[] args) {
//        HashSet<String> hashSet =new HashSet();
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        for (int i=0; i < n; i++){
//            hashSet.add(scanner.nextLine());
//        }
//
//        //Setdan ma`lumot o`qish usullari
//        //1-usul
//        for(String s: hashSet){
//            System.out.println(s + " 1-usul");
//        }
//
//        //2-usul
//        Iterator<String> itr = hashSet.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next() + " 2-usul");
//        }
//
//        //3-usul
//        hashSet.forEach(s -> {
//            System.out.println(s + " 3-usul");
//        });

        HashSet<Product> products = new HashSet<>();
        products.add(new Product("anor", 3000d, "meva", 5d, "kg"));
        products.add(new Product("anor", 3000d, "meva", 5d, "kg"));
        products.add(new Product("anor", 3000d, "meva", 5d, "kg"));
        for (Product product: products){
            System.out.println(product);
        }

    }

//    public void initProduct(){
//
//        List<Product> lp = List.of(new Product("olma", 4000d, "meva", 14d, "kg"),
//                new Product("anor", 3000d, "meva", 5d, "kg"),
//                new Product("nok", 4000d, "meva", 6d, "kg"),
//                new Product("gosht", 7000d, "gosht", 14d, "kg"),
//                new Product("shokolat", 5000d, "shirimlik", 54d, "kg"),
//                new Product("banan", 6000d, "meva", 43d, "kg"),
//                new Product("apelsin", 1000d, "meva", 64d, "kg"));
//
//        ArrayList<Product> list = new ArrayList<>();
//        this.setProducts(list);
//    }
}
