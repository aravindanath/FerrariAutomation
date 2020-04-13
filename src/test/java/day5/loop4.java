package day5;

public class loop4 {


    public static void main(String arg[]){

        String  str [] = {"Shravni","Ramya","Bhrama","Avneesh"};

        //Datatype ref : arrayName / list name / Map / Set name
        for(String ref : str){
            if(ref.equals("Bhrama")){
                System.out.println("Found");
                break;
            }else{
                System.out.println("Not Found");
            }
        }



    }

}
