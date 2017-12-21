public class Main
{
    public static void main(String[] args)
    {
        Stack tower = new Stack();
        tower.push(10);
        tower.push(20);
        tower.push(30);
        tower.printStack();
        tower.printStack(2);
    }
}