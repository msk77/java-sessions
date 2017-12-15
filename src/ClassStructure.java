/* This class describes what Class should contain
 *  **/
public class ClassStructure {
    //Class contains variables
    int age = 10;

    //Class contains methods - instructions for JVM of what to do
    public void hello(){

    }
    public int changeAge(int newAge){
        age = newAge;
        return age;
    }

    public static int add(int a, int b){
        return a+b; }

    public static void main(String[] args) {
        int age = add(1,2);
        System.out.println(age);
    }


}
