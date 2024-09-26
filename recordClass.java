// class Alien {
//     private final int id;

//     private final String name;

//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

    

// }

record Alien(int id,String name){
    Alien(){this(0,"");}
}

public class recordClass {
    public static void main(String[] args) {
Alien a1=new Alien(1, "rohan");
Alien a2=new Alien(1, "rohan");
Alien a3=new Alien();

System.out.println(a1.equals(a2));
        
    }
}


//13:30 time