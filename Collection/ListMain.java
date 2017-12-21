import java.util.ArrayList;
import java.util.List;
public class ListMain
{
    public static void main(String args[])
    {
        List<Yasai> vegitableList = new ArrayList<Yasai>();
        vegitableList.add(new Yasai("なす"));
        vegitableList.add(new Yasai("きゅうり"));
        vegitableList.add(new Yasai("とまと"));
        for(int i=0;i < vegitableList.size();i++)
        {
            System.out.println(i + ":" + vegitableList.get(i).getName());
        }
        vegitableList.set(1, new Yasai("かぼちゃ"));
        for(int i=0;i < vegitableList.size();i++)
        {
            System.out.println(i + ":" +vegitableList.get(i).getName());
        }
    }
}
class Yasai
{
    String name;
    Yasai(String name)
    {
        setName(name);
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}