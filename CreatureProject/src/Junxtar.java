public class Junxtar extends Human implements Swimable, Programmer {
   public Junxtar(int age, int height, int weight, String name) {
      super(age, height, weight, name);
   }
   @Override
   public void swim() {
      System.out.println("juxtar는 수영을 한다.");
   }

   @Override
   public void infoPrint() {
      System.out.println("나는 juxtar야");
   }

   @Override
   public void programming() {
      System.out.println("juxtar는 프로그래밍을 한다.");
   }
}
