package initAndDestroy;

public class Dog {
    public void say() {
        System.out.println("Bow-Wow");
    }
    private void init () {
        System.out.println("Inititialization");
    }
    private void destroy () {
        System.out.println("Destryization");
    }
}
