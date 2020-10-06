import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class animal {
    private String name;
    public int age;
    private String kind;

    public animal(String name,String kind,int age)
    {
        //super();
        this.age=age;
        this.kind=kind;
        this.name=name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }
    public int compareTo(animal o) {
        if(this.age < o.age){
            return -1;
        }else if(this.age == o.age){
            return 0;
        }else{
            return 1;
        }
    }

    public void print() {
        System.out.println(name+"："+kind+" "+age);

    }
}
