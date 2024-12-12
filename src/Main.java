
abstract class Animal {
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String name;

    public Animal(String name) {
        this.name = name;

    }

    public  static void main(String[] args) {

        Animal[] objects = new Animal[3];
        objects[0]  = new Dog("ahmatov",3);
        objects[1] = new Cat("puszek",2);
        objects[2] = new Horse("bumerang", 1);


        for(Animal object : objects) {
            System.out.println("imie: " + object.name);
            object.sound();
            System.out.println("gotowy do adopcji " + object.isReadyForAdopt()+ " ");


            


        }




    }

    protected abstract boolean isReadyForAdopt();

    public String getName() {
        return name;
    }

    abstract public void sound();
}
    interface Adoptable{
    public boolean isReadyForAdopt();

    }
   class Dog extends Animal implements Adoptable{
    int age;
        public Dog(String name, int age) {
            super(name);

            this.age = age;
        }
        public void sound(){
            System.out.println("hauhau");
        }


            public boolean isReadyForAdopt() {
                return age>1;
            }


    }
    class Cat extends Animal implements Adoptable{
    int age;
    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }
        public void sound(){
            System.out.println("miaumiaau");
        }
        public boolean isReadyForAdopt() {
            return age>1;
        }
    }
    class Horse extends Animal implements Adoptable{
    int age;
    public Horse(String name, int age) {
        super(name);
        this.age = age;
    }


        public void sound(){
            System.out.println("hahaha");
        }
        public boolean isReadyForAdopt() {
            return age>1;
        }
    }

