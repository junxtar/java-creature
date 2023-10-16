public abstract class Animal extends Creature {

   public Animal(int age, int height, int weight) {
      super(age, height, weight);
   }

   @Override
   public void breath() {
      System.out.println("동물이 숨을 쉰다.");
   }

   @Override
   public void move() {
      System.out.println("동물이 움직인다.");
   }

}
