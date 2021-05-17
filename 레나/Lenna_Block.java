import java.io.*;

public class Lenna_Block {

    public static void main(String[] args){
        try{
            InputStream lenna_ByteI = new FileInputStream("lenna.png");
            OutputStream lenna_ByteO = new FileOutputStream("lenna_Block_copy.png");
            byte buff[]=new byte[1024];
            int n;
            while((n=lenna_ByteI.read(buff))!=-1){
            
                lenna_ByteO.write(buff, 0,n);;
            
            }
                        
            lenna_ByteI.close();
            lenna_ByteO.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }




    }

}
