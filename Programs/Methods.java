package Programs;

class Methods {
    static void printHelloWorld(){
        System.out.println("Hello World! Krishna");
    }
    static int binaryToDecimal( String BinaryString ){
        int DecimalNumber = 0;
        int DigitSum = 1;

        for(int i = BinaryString.length() - 1; i >= 0;i--){
            if( BinaryString.charAt(i) == '1' )
                DecimalNumber += DigitSum;
            DigitSum *= 2;
        }

        return DecimalNumber;
    }
    static StringBuilder decimalToBinary( int DecimalNumber ){
        StringBuilder BinaryString = new StringBuilder();
        
        while( DecimalNumber > 0 ){
            BinaryString.append(DecimalNumber % 2);
            DecimalNumber /= 2;
        }

        return BinaryString.reverse();

    }
    
    static int reverseInteger( int number ){
        
        System.out.println( new StringBuilder(number).reverse() );

        return 0;
    }

}
