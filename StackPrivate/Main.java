class Main
{
    public static void main(String[] args)
    {
        Stack tower = new Stack();
        System.out.println("スタックサイズは" + tower.data.length);
        Stack tower10 = new Stack(10);
        System.out.println("スタックサイズは" + tower10.data.length);
    }
}