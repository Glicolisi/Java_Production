package Java_Production._1;

public record Person(String name, int age, String address) {

    @Override

    public String toString(){

       return (

             "Nome :"+name+","+
             "Età :"+age+","+
             "Indirizzo:"+address
        );

    }

}
