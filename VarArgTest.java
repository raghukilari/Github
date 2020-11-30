class VarArgTest
{
public void hello(String S)
{
System.out.println("1 Arg method");
}
public void hello( int a,String...S)
{
System.out.println("VAR ARG METHOD");
}
public static void main(String...plzpractice)
{
VarArgTest a = new VarArgTest();
a.hello("String","SS");
a.hello();
a.hello();
a.hello();

}
}
