package sample;
class Animals extends Thread{
    public void Animal1(){
        String animal_name = "Dog";
        String animal_colour = "Black";
        double animal_age = 3.5;
        String animal_price = "50$" ;

        System.out.println("Animals_Details");
        System.out.println("--------------------------");
        System.out.println("Animal Name:"+animal_name);
        System.out.println("Animal_Colour:"+animal_colour);
        System.out.println("Animal_Age:"+animal_age);
        System.out.println("Animal_Price:"+animal_price);
    }

}public class Animalsss{
    public static void main(String[] args) {
        Animals a = new Animals();
        a.Animal1();

    }
}