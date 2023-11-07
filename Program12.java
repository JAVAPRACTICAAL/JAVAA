import java.io.*;



class Program12 {

    public static void main(String args[]) {

        RandomAccessFile rf;

        try {

            rf = new RandomAccessFile("jl.txt", "rw");

            rf.seek(rf.length());

            rf.writeBytes("coimbatore");

            rf.writeBytes("madurai");

            System.out.println(rf.length());

            rf.close();

        } catch(IOException ioe) {

            System.out.println(ioe);

        }

    }

}

