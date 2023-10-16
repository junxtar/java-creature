public abstract class Human extends Creature implements Talkable {

   private String name;

   public Human(int age, int height, int weight, String name) {
      super(age, height, weight);
      this.name = name;
   }

   @Override
   public void breath() {
      System.out.println("사람이 숨을 쉰다.");
   }

   @Override
   public void move() {
      System.out.println("사람이 움직인다.");
   }

   @Override
   public void talk() {
      System.out.println("사람이 말을 한다.");
   }
}
