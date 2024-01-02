public class Main {
    public static void main(String[] args){

        int status = (int) ((Math.random()*10)%2);

        if(status==1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
