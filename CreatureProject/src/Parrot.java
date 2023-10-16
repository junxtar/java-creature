public class Parrot extends Animal implements Flyable {
   public Parrot(int age, int height, int weight) {
      super(age, height, weight);
   }

   @Override
   public void infoPrint() {
      System.out.println("나는 앵무새!");
   }

   @Override
   public void fly() {
      System.out.println("앵무새가 날아다닌다.");
   }
}
