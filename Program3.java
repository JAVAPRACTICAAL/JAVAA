import java.io.*;



class Program3 {

    public static void main(String args[]) throws IOException {

        int payamt;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n\nPay out of bound exception");

        System.out.println("* * *");

        System.out.println("\nEnter a basic pay amount");

        payamt = Integer.parseInt(reader.readLine());

        try {

            if (payamt > 1000)

                throw new PayoutOfBoundException("Basic pay is out of bound");

            else

                System.out.println("\nGiven basic pay is: " + payamt);

        } catch (Exception e) {

            System.out.println("Caught: " + e);

        }

    }

}



class PayoutOfBoundException extends IOException {

    PayoutOfBoundException(String message) {

        super(message);

    }

}

