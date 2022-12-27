import java.io.*;
import java.net.*;

public class Ex09_0b {
    public static void main(String args[]) {
        URL theUrl;
        HttpURLConnection huc;
        InputStream instream;
        InputStreamReader isreader;
        BufferedReader bfreader;


        try{
            theUrl = new URL(args[0]);
        } catch( MalformedURLException mue ) {
            return;
        }

        try{
            huc = (HttpURLConnection)theUrl.openConnection();
        } catch( IOException mue ){
            return;
        }

        try{
            instream = huc.getInputStream();
        } catch( IOException mue ){
            return;
        }

        try{
            isreader = new InputStreamReader(instream);
        } catch( IndexOutOfBoundsException mue ){
            return;
        }

        try{
            bfreader = new BufferedReader(isreader);
        } catch( IndexOutOfBoundsException mue ){
            return;
        }

        try{
            String theLine;

            do {
                theLine = bfreader.readLine();
                if( theLine != null ) {
                    System.out.println(theLine);
                }
            } while( theLine != null );

        } catch (Exception e) {
            System.err.print(e);
        }
    }
}
