
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person implements Clone
{
    // instance variables - replace the example below with your own
    String name ;
    public Person(String name)
    {
        setName(name);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public void setName(String newName){
        if(newName == null) newName = "";
        this.name = newName;
    }
    public boolean equals(Object other)
    {
        if(other==null) return false;
        return name.equals(((Person)other).name);
    }
    
    public Object clone() {
        return (Person)super.clone();
    }
}
