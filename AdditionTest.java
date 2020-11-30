class AdditionTest
{
public int add(int a, int b){
int res = a+b;
System.out.println("int int:" + res);
return res;
}
public int add(int a, int b,int c){
int res = a+b+c;
System.out.println("int int int:" + res);
return res;
}
public float add(float a, float b){
float res = a+b;
System.out.println("float float:" + res);
return res;
}
public float add(int a, float b){
float res = a+b;
System.out.println("int float:" + res);
return res;
}
public static void main(String[] plzpractice)
{
AdditionTest a  = new AdditionTest();
a.add(11,14);
a.add(12,33,33);
a.add(12.5f,56.7f);
a.add('a','b');
}
}