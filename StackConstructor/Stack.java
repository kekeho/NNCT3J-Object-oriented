public class Stack
{
int volume;
private int data[];
static int stackSize = 5;
//標準サイズのためのコンストラクタ
Stack()
{
        data = new int[stackSize];
        System.out.println(data.length + "個分のスタック生成");
        for(int i=0; i < data.length; i++)
        {
                data[i] = 1;
        }
}
//データ追加メソッド
boolean push(int number)
{
        if(volume < data.length)
        {
                data[volume] = number;
                volume++;
                return true;
        }
        else
        {
                System.out.println("stack overflow");
                return false;
        }
}
//データ取得メソッド
int pop()
{
        int value;
        if(volume > 0)
        {
                value = data[volume -1];
                data[volume -1] = 0;
                volume--;
        }
        else
        {
                value = -1;
        }
        return value;
}
//状態表示メソッド
void printStack()
{
        System.out.print("|");
        for(int i=0; i < data.length; i++)
        {
                System.out.print(data[i]);
                System.out.print("|");
        }
        System.out.println("");
}
}