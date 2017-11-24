package sorting;
//This was me working from home
public class ISSStudent implements Comparable{

    private String name,address;
    private int id;
    
    public ISSStudent(String n, int i, String a){
        name=n;
        address=a;
        id=i;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        String str="Name:\t" + name;
        str+="\nAddress:\t" + address;
        str+="\nStudent ID:\t" + id;
        return str;
    }
    
    @Override
    public int compareTo(Object t) {
        String othername =((ISSStudent)t).getName();
        return this.name.compareTo(othername);
    }
    
    
    
}
