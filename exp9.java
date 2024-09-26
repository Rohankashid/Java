import java.io.*;

class Student implements Serializable{
    private String name;
    private int age;
    private double weight;
    private double height;
    private String city;
    private String phone;


    public Student(String name,int age, double weight, double height,String city,String phone){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.city=city;
        this.phone=phone;
    }

    public String toString()
    {
        return "name:"+name+ ",age:"+age+ ",weight:"+weight+" kg"+ ",height:"+height+" cm"+ ",city:"+city+ ",phone:"+phone;
    }
}

public class exp9 {

    public static void main(String[] args) {
        try{

            //writing data to the file
            FileOutputStream f=new FileOutputStream("Student_data.txt");
            DataOutputStream d=new DataOutputStream(f);
             
            Student s1=new Student("rohan", 21, 80, 171, "solapur", "12345");
           
           ObjectOutputStream objectOutputStream=new ObjectOutputStream(d);
            objectOutputStream.writeObject(s1);

            objectOutputStream.close();
            f.close();
            d.close();


            // reading data from the file

            FileInputStream fileInputStream=new FileInputStream("Student_data.txt");
            DataInputStream dataInputStream =new DataInputStream(fileInputStream);

            ObjectInputStream objectInputStream =new ObjectInputStream(dataInputStream);
            Student retrievedStudent=(Student) objectInputStream.readObject();

            System.out.println("Student information retrieved:");
            System.out.println(retrievedStudent);

            objectInputStream.close();
            fileInputStream.close();
            dataInputStream.close();


        }

        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
}
