public class Calculator {
    String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void add(int a, int b){
        int result =a+b;
        System.out.println(result);
    }
}
