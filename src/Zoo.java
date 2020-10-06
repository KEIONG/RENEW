import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Zoo {
    private ArrayList<animal>listanimal=new ArrayList<animal>();

    public void add(animal node)
    {
        listanimal.add(node);
    }
    public void list()
    {
        for(animal node :listanimal)
        {
            node.print();
        }
    }
    public animal get(int index)
    {
        return listanimal.get(index);
    }
    public void modifyAge(String str,int x)
    {
        for(int i=0;i<listanimal.size();i++)
        {
            animal tmp=listanimal.get(i);
            if(tmp.getName().equals(str))
            {
                tmp.setAge(x);
                listanimal.set(i,tmp);
            }
        }
    }
    public void modifyKind(String str,String x)
    {
        for(int i=0;i<listanimal.size();i++)
        {
            animal tmp=listanimal.get(i);
            if(tmp.getName().equals(str))
            {
                tmp.setKind(x);
                listanimal.set(i,tmp);
            }
        }
    }
    //public void modifyAge(int index,int x)
    //{
      //  animal tmp=listanimal.get(index);
        //tmp.setAge(x);
        //listanimal.set(index,tmp);
    //}
    //public void modifyKind(int index,String str)
    //{
      //  animal tmp=listanimal.get(index);
        //tmp.setKind(str);
        //listanimal.set(index,tmp);
    //}
    public int Size()
    {

        return listanimal.size();
    }
    public void Sort(){
        Collections.sort(listanimal, new Comparator<animal>() {

            @Override
            public int compare(animal o1, animal o2) {
                //
                //return o1.getAge()-o2.getAge();
                //return o1.getAge().compareTo(o2.getAge());
                // descending order
                // return o2.getAge()-o1.getAge();
                // return o2.getAge().compareTo(o1.getAge());
                return o1.getAge()-o2.getAge();
            }
        });
    }


        public static void main(String arg[]) {

            Scanner cin = new Scanner(System.in);
            System.out.println("Welcome to use this database");
            System.out.println("operation 1 infers to Add");
            System.out.println("operation 2 infers to modify the age of the animal");
            System.out.println("operation 3 infers to modify the kind of the animal");
            System.out.println("operation 4 infers to demonstrate");
            System.out.println("operation 4 infers to sort in an ascending order ");
            int oper;

            Zoo Z = new Zoo();
            Z.add(new animal("lou xi wen yang", "author", 0));
            //Z.add(new animal("lxwy", "me", 20));
            //Z.add(new animal("hhy", "gf", 30));
            //Z.add(new animal("hhy", "gf",8));
            //Z.modifyAge("hhy", 1888);


            while (true) {
                oper = cin.nextInt();
                if (oper == 1) {
                    System.out.println("input the name:");

                    String Name;
                    String Kind;
                    int Age;
                    Name=cin.next();
                    System.out.println("input the kind:");
                    Kind=cin.next();
                    System.out.println("input the age:");
                    Age=cin.nextInt();
                    Z.add(new animal(Name,Kind,Age));
                    Z.list();

                } else if (oper == 2) {
                    System.out.println("input the name:");
                    String str = cin.next();
                    System.out.println("input the age:");
                    int x = cin.nextInt();
                    //str = "hhy";
                    //System.out.println(str);
                    Z.modifyAge(str, x);
                    Z.list();

                } else if (oper == 3) {
                    System.out.println("input the name:");
                    String str2 = cin.next();
                    System.out.println("input the kind:");
                    String str3 = cin.next();
                    //str = "hhy";
                    //System.out.println(str);
                    Z.modifyKind(str2,str3);
                    Z.list();

                } else if (oper == 4) {
                    Z.list();
                }
                else if(oper==5)
                {
                    Z.Sort();
                    Z.list();
                }
                else
                {
                    break;
                }
                //String str=cin.next();
                //System.out.println(str);
                //int n=cin.nextInt();
                //for(int i=1;i<=n;i++)
                //{

                //  System.out.println(i);

                //}
            }



        }
}
