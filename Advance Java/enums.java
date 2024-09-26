public class enums {
    enum Color{
        RED("red") ,GREEN("green") , BLUE("blue") ;

        private String value;
        Color(String value){
            this.value=value;
        }

        public String getValue(){
            return value;
        }
    }

    public static void main(String[] args) {
        Color c=Color.GREEN;
        System.out.println("green enum name is :"+c.name());

        for(Color color : Color.values()){
            System.out.println("enum value :"+color.getValue());
        }

    }
}
