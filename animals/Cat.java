package day23inheritancepolymorphism.animals;

public class Cat extends Mammal{

    public void meow() {
        System.out.println("Cats meow");
    }
    @Override
        public void eat() {
        System.out.println("Cats eats");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }
    //"Overriding Method" olarak adlandırılır.
    @Override
    public Mammal create() {
        return new Mammal();
    }

    //             @Override
    // Hata verir  public final double divide(int a, int b){
    //             return a/b;
    }

    /*
        1) Override yaparken "method body" si değiştirilir.
        2) Override yaparken asla "method signature" (isim ve parametre) değiştirilemez.
        3) Override yaparken "inheritance" olmak zorundadır.
        4) Override yaparken "access modifier"lar belli kurallara göre farklılaştırılabilirler.
        5) Override anotation'ını( @ ) kullanarak JAvanın yaptığımız "Override" işlemini kontrol etmesini sağlarız.
          i) "private method"lar override edilemez.
         ii) "child class"taki "override edilen" method un "access modifier"i Parent Class'taki methodun
             "access modifier"i ile aynı veya geniş olmalıdır.
             Note: Child class taki method un access modifier i daha dar olamaz.
        iii) Default methodlar aynı package içindeyse override edilebilirler. Aksi halde override edilemezler.
        6) Parent Class'taki methodun "return type"ı void ise "return type" değiştirilemez.
        7) Parent Class'taki methodun "return type"ı primitive ise "return type" değiştirilemez.
        8) Parent Class'taki methodun "return type"ı "Wrapper Class" ise "return type" değiştirilemez.
        9) Parent Class'taki methodun "return type"ı "Parent Class" ise "return type" child lardan biri olabilir.
           note: Child Class'taki return type "Parent Class"takinden geniş olamaz
           note: Aralarında parent child ilişkisi olmayan classlar overridingte return type değişiminde kullanılamazlar
                 Short Integer dan küçüktür ama Aralarında parent child ilişkisi olmadığından kullanılamazlar.
           note: Child'daki methodun Return Type indan Parent'taki method'un Return Type'ina gidişte
                 "IS-A" RELATIONSHIP olmalıdır.
        10) note: final method'lar "override" edilemezler. çünkü "overriding"te  method body değiştirilir. fakat "final" buna izin vermez.
        11) Polymorphism =  overloading + overriding
            note: Polymorphism nedir derlerse "overloading + overriding"i anlatın.
        12) Overloading ile overriding ile arasındaki farklar nelerdir? ***INTERVIEW QUESTION***
            i) Overloading için "Inheritance" gerekmez, overriding için gerekir.
           ii) Private methodlar Overload edilerbilir, Override edilemezler.
          iii) final methodlar Overload edilerbilir, Override edilemezler.
           iv) "Overloading" "static polymorphism", "overriding" "dinamic polymorphism" olarak adlandırılır.
               çünkü "static" methodlar Overload edilebilir, Override edilemezler.

            v) Overloading 'te method signature değişir ama "overriding" method sig.a dokunulmaz.


    */






