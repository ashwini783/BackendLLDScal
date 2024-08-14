package PrototypeAndRegistry;

public class IntellgentStudent extends Student{
    int iq;

   IntellgentStudent(){

   }
     IntellgentStudent(IntellgentStudent is){
         super(is); //to copy parent members
         this.iq = is.iq;
     }
    public IntellgentStudent Copy(){ //every class should have their own copy() method
        IntellgentStudent copy = new IntellgentStudent(this);
        return copy;
    }
}
