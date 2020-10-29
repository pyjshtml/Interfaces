public class InterfaceExample{
  public static interface Edible{
  public abstract String howToEat();
}
  public static abstract class Animal{
    public abstract String sound();
  }
  public static class Tiger extends Animal{
    @Override
    public String sound(){
      return "Roar";
    }
  }
  public static class Chicken extends Animal implements Edible{
    @Override
    public String sound(){
      return "cock-a-doodle-doo";
    }
    @Override
    public String howToEat(){
      return "fry it";
    }
  }
  public static abstract class Fruit implements Edible{
  }
  public static class Apple extends Fruit{
    @Override
    public String howToEat(){
      return "just bite it";
    }
  }
  public static void main(String[] args) {
    Object[] stuffInMyCloset = {new Chicken(),new Tiger(),new Apple()};
    for(int i = 0; i < stuffInMyCloset.length; i++){
      String name = stuffInMyCloset[i].getClass().getName().split("\\$")[1];
      if(stuffInMyCloset[i] instanceof Edible)
        System.out.println("Don't worry " + name + " is edible");
      else
        System.out.println("Wait!! Don't eat " + name);
    }
  }
}
