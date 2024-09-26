import java.io.*;



public class exp8 {
    public static void main(String[] args) {

        if(args.length!=1){
            System.out.println("give Argumnts");
            return ;
        }

        String filename=args[0];
        File file=new File(filename);

        try(

        BufferedReader reader=new BufferedReader(new FileReader(file));
        BufferedWriter writer =new BufferedWriter(new FileWriter(file,true))){

            //Display contents of the file

            String line;

            while((line=reader.readLine())!=null){
                System.out.println(line);
            }

            //Ask USer for Action

            System.out.println("do you want to add the data at the eof(1) or replace specified text(2):");

            BufferedReader inputReader =new BufferedReader(new InputStreamReader(System.in));
            String choice = inputReader.readLine();

            if(choice.equals("1")){

                //Append data to File

                System.out.println("enter data to append (type 'exit' on new line to stop) :");
                String newData;
                while(!(newData=inputReader.readLine()).equalsIgnoreCase("exit")){
                    writer.write(newData+"\n");
                    writer.flush();

                }
            }

                else if(choice.equals("2")){

                    //Replace the data
                    System.out.println("enter text to replace:");
                    String searchText=inputReader.readLine();

                    System.out.println("enter replacement text:");
                    String replacementText=inputReader.readLine();


                    // Read file content into the string builder 


                    StringBuilder content =new StringBuilder();
                    while((line=reader.readLine())!=null){
                        content.append(line).append("\n");
                    }

                    //replace specified text
                    String updatedContent=content.toString().replace(searchText, replacementText);

                    //write updated content back to the file 

                    writer.write(updatedContent, 0, 0);
                    writer.flush();
                }
                else{
                    System.out.println("invalid choice !, exiting ...");
                }
            }  catch(IOException e){
                System.err.println("Error:"+e.getMessage());
            }

        }
        
    }
 
