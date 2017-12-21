public class Main
{
    public static void main(String[] args)
    {
        Stack tower = new Stack();
        tower.push(10);tower.printStack();
        tower.push(20);tower.printStack();
        tower.push(30);tower.printStack();
        tower.push(40);tower.printStack();
        tower.push(50);tower.printStack();
        tower.push(60);tower.printStack();
        System.out.println(tower.pop());tower.printStack();
        System.out.println(tower.pop());tower.printStack();
        System.out.println(tower.pop());tower.printStack();
        System.out.println(tower.pop());tower.printStack();
        System.out.println(tower.pop());tower.printStack();
        System.out.println(tower.pop());tower.printStack();
    }
}