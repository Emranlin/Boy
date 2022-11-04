import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Boy boy1=new Boy();
        boy1.setName("Alibek");
        boy1.setAge(20);
        boy1.setStudent(true);

        Boy boy2=new Boy();
        boy2.setName("Ilim");
        boy2.setAge(18);
        boy2.setStudent(false);

        Boy boy3=new Boy();
        boy3.setName("Kutman");
        boy3.setAge(17);
        boy3.setStudent(false);

        Boy boy4=new Boy();
        boy4.setName("Bakyt");
        boy4.setAge(20);
        boy4.setStudent(false);

        Boy boy5=new Boy();
        boy5.setName("Adilet");
        boy5.setAge(18);
        boy5.setStudent(true);
        Boy[]boys={boy1,boy2,boy2,boy3,boy4,boy5};
        checkStudent(boys);


    }
    public static void checkStudent(Boy[]boys){
        for (Boy boy:boys)
            if(!boy.isStudent() && boy.getAge() > 18) {
                System.out.println(boy.getName());
            }else if(boy.isStudent()){
                    System.out.println("You are a student");
                }
                else if(boy.getAge()<18){
                    System.out.println("Your age isn't enough");
                }
            }
        }
