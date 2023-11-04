import java.io.*;
class Program1 {
public static void main(String args[]) throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String s, m;
int start;
int end;
System.out.println("\t*******************************");
System.out.println("\tEXTRACTION OF CHARACTER");
System.out.println("\t*******************************");

        System.out.println("\tENTER ANY STRING:");

        s = reader.readLine();

        System.out.println("\tENTER STARTING POSITION:");

        start = Integer.parseInt(reader.readLine());

        System.out.println("\tENTER ENDING POSITION:");

        end = Integer.parseInt(reader.readLine());

        m = s.substring(start, end);

        System.out.println(m);

    }

}