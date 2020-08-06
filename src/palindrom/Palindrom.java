/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrom;
import java.util.Scanner;
class stack{
  private int top=0;
  private final int []s ;
  public stack(int x){
   top=0;
   s=new int[x];

  }
  @Override
  protected void finalize() throws Throwable{
      try {
          System.out.println(" finalize\n");
      } finally {
          super.finalize();
      }
  
  }
  boolean full(){
    return top==s.length;  
  }
  boolean empty(){
      return top==0;
  }
  public void push(int f){
      if(!this.full())s[top++]=f;
  }
  public int pop(){
      if(!empty())
          return s[--top];
      return -9999;
  }
}

class queeus{

	private final int []q;
	private int f,r;
	private final int cap;


	public queeus(int k){
	   cap=k;
	   f=r=0;
	   q=new int[cap];
	   }

        @Override
	protected void finalize() throws Throwable{
            try {
                System.out.println("call finalize queeus");
            } finally {
                super.finalize();
            }
	}

	public  boolean empty(){
	return f==r; 
	}

	public boolean full(){
	return (r+1)%cap==f;
	}

	public void Qadd( int  x){
	if((r+1)%cap!=f) {q[r]=x;
        r=(r+1)%cap;
        } else
        {
        }
	}
    
	public int Qdelete(){int x=0;
	if(!empty()){
		 x=q[f];
		f=(f+1)%cap;
		}
	return x;
	}
}
public class Palindrom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
queeus Q;
Q=new queeus(20);
stack T;
T=new stack(20);
int x;
System.out.println(" *******$$$$$$$$$$$******* \n");
System.out.println("please, enter numper...");
System.out.println("*******$$$$$$$$$$$*******");
Scanner t=new Scanner(System.in);
x=t.nextInt();
System.out.println("_________________________");
while((x%10)!=0){
	int y = x%10;
    x=x/10;
    T.push(y);
    Q.Qadd(y);}

int flag=0;
while(!T.empty()&&!Q.empty()&&flag==0)
{
	int z;
        int y;
    z=T.pop();
    y=Q.Qdelete();
    if(z==y)flag=0;
    else
    flag=1;}
    if(flag==1)System.out.println("not palindrom");
    else
    System.out.println("palindrom");
    
 System.out.println("*******$$$$$$$$$$$*******");
    }
   
}
