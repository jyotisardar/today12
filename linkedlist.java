import java.util.*;
import java.io.*;
class node
{
int info;
node p,q,list=null,r,next,p1;
public node()
{}
this.info=info;
}
void create(int info,int n)
{
list=p;
q=p;
}
else
{
q.next=p;
q=p;
}
}
void insert(int x,int info1)
{
q=list;
while(q.info!=x)
{
if(q.next==null)
System.out.println("node not found");
else
q=q.next;
}
p=new node(info1);
p.next=null;
if(q.next==null)
q.next=p;
else
{
p.next=q.next;
q.next=p;
}
}
void delete(int y)
{
q=list;
while(q.info!=y)
{
if(q.next==null)
System.out.println("node not found");
else
{
p1=q;
q=q.next;
}
}
if(q==list)
list=q.next;
else
if(q.next==null)
p1.next=null;
else
p1.next=q.next;
}
System.out.println("deleted element is"+y);
}
void display()
{
q=list;
do
{
System.out.println("|"+q.info+"|"+q+"|");
q=q.next;
}
while(q!=null);
}
}
class linklist
{
public static void main(String args[])
{
int x,n,y,ch;
node obj=new node();
do
{
System.out.println("1:create");
System.out.println("2:insert");
System.out.println("3:delete");
System.out.println("4:display");
System.out.println("5:exit");
System.out.println("Enter your choice");
ch=sc.nextInt();
switch(ch)
{
case1: System.out.println("How many nodes you want to create");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println("Enter info");
x=sc.nextInt();
obj.create(x);
}
break;
case2: System.out.println("Enter element which you want to insert");
x=sc.nextInt();
System.out.println("Enter info");
y=sc.nextInt();
obj.insert(x,y);
break;
case3: System.out.println("Enter element which is to be deleted");
y=sc.nextInt();
obj.delete(y);
break;
case4: obj.display();
break;
case: break;
default: System.out.println("Enter choice from 1 to 5 only");
}
}
while(ch!=5);
}
}
