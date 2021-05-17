import java.io.*;
public class Lenna_byte {
    public static void main(String[] args){
        
        try{
            InputStream lenna_ByteI = new FileInputStream("lenna.png");
            OutputStream lenna_ByteO = new FileOutputStream("lenna_Byte_copy.png");
            int c;
            while((c=lenna_ByteI.read())!=-1){
                lenna_ByteO.write((byte)c);;
            }
            
            
            lenna_ByteI.close();
            lenna_ByteO.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    
    }
}
