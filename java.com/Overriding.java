//class parent start
class parent
{
   int a= 20;
  void show ()
{
   System.out.println("parent class"+a);
  
}
}
 
// class parent end 


//class child start

class child extends parent
{
  int b= 30;
void show()
{ 
System.out.println ("child" +(a+b));

}
}

//class child end 


//child class instance

class inheritance
{
   public static void main (String args[])
{
   child obj=new child();
   obj.show();
  }
     }