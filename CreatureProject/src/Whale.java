public class Whale extends Animal implements Swimable {
   public Whale(int age, int height, int weight) {
      super(age, height, weight);
   }

   @Override
   public void infoPrint() {
      System.out.println("나는 고래야!");
   }

   @Override
   public void swim() {
      System.out.println("고래가 수영을 한다.");
   }
}
