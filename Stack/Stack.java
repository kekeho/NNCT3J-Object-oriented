class Stack
{
static int defaultSize = 5;
static int stack[] = new int[defaultSize];
static int volume = 0;
public static void main(String[] args)
{
        push(10); printStack();
        push(20); printStack();
        push(30); printStack();
        push(40); printStack();
        push(50); printStack();
        push(60); printStack();
        System.out.println(pop()); printStack();
        System.out.println(pop()); printStack();
        System.out.println(pop()); printStack();
        System.out.println(pop()); printStack();
        System.out.println(pop()); printStack();
        System.out.println(pop()); printStack();
}
//データ追加関数
static void push(int number)
{
        if(stack.length > volume)
        {
                stack[volume] = number;
                volume++;
                System.out.println(number + "inserted");
        }
        else
        {
                System.out.println("over flow!");
        }
}
//データ取得関数
static int pop()
{
        int returnValue = 0;
        if(volume > 0)
        {
                returnValue =stack[volume -1];
                stack[volume -1] = 0;
                volume--;
        }
        else
        {
                System.out.println("under flow!");
                returnValue = -1;
        }
        return returnValue;
}
//状態表示関数
static void printStack()
{
        System.out.print("|");
        for(int i=0; i < stack.length; i++)
        {
                System.out.print(stack[i]);
                System.out.print("|");
        }
        System.out.println("");
}
}