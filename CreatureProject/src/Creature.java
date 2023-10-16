public abstract class Creature {
   private int age;
   private int height;
   private int weight;

   public Creature(int age, int height, int weight) {
      this.age = age;
      this.height = height;
      this.weight = weight;
   }

   public abstract void infoPrint();
   public abstract void breath();
   public abstract void move();
}
