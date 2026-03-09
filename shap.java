
class square{
int side;
 void sideofsquare()
{
System.out.println("square has : "+side+" sides");
}
}
class triangle{
int side;
void sideoftriangle()
{
System.out.println("triangle has:"+side+"sides");
}
}
class pentagaon{
int side;
void sideofpentagaon()
{
System.out.println("pentagaon has:"+side+"sides");
}
}
public class shap {
    public static void main(String[] args) {
square s1= new square();
triangle t1= new triangle();
pentagaon p1=new pentagaon();
s1.side=4;
s1.sideofsquare();
t1.side=3;
t1.sideoftriangle();
p1.side=5;
p1.sideofpentagaon();

            }
}
