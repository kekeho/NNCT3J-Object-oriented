import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class list
{
    public static void main(String args[])
    {
        List<student> memberList = new ArrayList<student>();
        memberList.add(new student(401,"古川彩音",45));
        memberList.add(new student(402,"相沢未鈴",100));
        memberList.add(new student(403,"成瀬梨紗",75));
        memberList.add(new student(404,"夢眠瑛美",83));
        memberList.add(new student(405,"藤咲ねむ",64));
        for(int i=0;i<memberList.size();i++)
        {
            System.out.println(memberList.get(i).getNumber() + " " + memberList.get(i).getName() + " " +                                     
            memberList.get(i).getpoint() + "点");
        }
        memberList.sort(new pointComparetor());
        
        for(int i=0;i<memberList.size();i++)
        {
        	System.out.println(i+1 + "位 " + memberList.get(i).getNumber() + " " + memberList.get(i).getName() + " " +                                     
            memberList.get(i).getpoint() + "点");
        }
    }
}
class student
{
	int number;
    String name;
    int point;
    student(int number, String name, int point)
    {
    	setNumber(number);
        setName(name);
        setpoint(point);
    }
    public int getNumber() {
    	return number;
    }   
    public void setNumber(int number) {
    	this.number=number;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getpoint()
    {
        return point;
    }
    public void setpoint(int point)
    {
        this.point = point;
    }
}
class pointComparetor implements Comparator<student>
{
    public int compare(student student1, student student2)
    {
        int point1 = student1.getpoint();
        int point2 = student2.getpoint();
        if(point1 > point2)
        {
            return -1;
        }
        else if(point1 == point2)
        {
            return 0;
        }
        else //(point1 ＜ point2)
        {
            return 1;
        }
    }
}
